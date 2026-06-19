package com.bilibili.montage.blcv;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bilibili.montage.SystemLoader;
import com.bilibili.montage.avutil.LogSinker;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/blcv/MontageCvManager.class */
public class MontageCvManager {
    public static final int CV_DETECT_MSG_COMPLETED = 1;
    public static final int CV_DETECT_MSG_PROGRESS = 0;
    public static final int MONTAGE_CV_DETECT_ERROR = 14;
    public static final int MONTAGE_CV_DETECT_MESSAGE = 13;
    private static final String TAG = "MontageCvManager";
    private ICvDetectCallback mCallback;
    private Object mCallbackMutex;
    private EventHandler mEventHandler;
    private HandlerThread mHandlerThread;
    private long mNativeManager;
    private Object mNativeMutex;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/blcv/MontageCvManager$EventHandler.class */
    public static class EventHandler extends Handler {
        private final WeakReference<MontageCvManager> mWeakManager;

        public EventHandler(MontageCvManager montageCvManager, Looper looper) {
            super(looper);
            this.mWeakManager = new WeakReference<>(montageCvManager);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            MontageCvManager montageCvManager = this.mWeakManager.get();
            if (montageCvManager == null) {
                LogSinker.w(MontageCvManager.TAG, "MontageCvManager went away with unhandled events");
                return;
            }
            int i7 = message.what;
            if (i7 != 13) {
                if (i7 != 14) {
                    return;
                }
                synchronized (montageCvManager.mCallbackMutex) {
                    if (montageCvManager.mCallback != null) {
                        montageCvManager.mCallback.onError(message.arg1, (String) message.obj);
                    }
                }
                return;
            }
            int i8 = message.arg1;
            if (i8 == 0) {
                synchronized (montageCvManager.mCallbackMutex) {
                    if (montageCvManager.mCallback != null) {
                        montageCvManager.mCallback.onProgress(message.arg2);
                    }
                }
                return;
            }
            if (i8 != 1) {
                return;
            }
            synchronized (montageCvManager.mCallbackMutex) {
                if (montageCvManager.mCallback != null) {
                    montageCvManager.mCallback.onCompleted();
                }
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/blcv/MontageCvManager$ICvDetectCallback.class */
    public interface ICvDetectCallback {
        void onCompleted();

        void onError(int i7, String str);

        void onProgress(int i7);
    }

    static {
        SystemLoader.setup();
    }

    private MontageCvManager() {
        this.mNativeManager = 0L;
        this.mNativeMutex = new Object();
        this.mCallbackMutex = new Object();
        this.mCallback = null;
    }

    public MontageCvManager(String str, long j7, ICvDetectCallback iCvDetectCallback) {
        this.mNativeManager = 0L;
        this.mNativeMutex = new Object();
        this.mCallbackMutex = new Object();
        this.mCallback = null;
        if (str == null || str.isEmpty()) {
            return;
        }
        this.mCallback = iCvDetectCallback;
        HandlerThread handlerThread = new HandlerThread("cv-detect-message-thread");
        this.mHandlerThread = handlerThread;
        handlerThread.start();
        this.mEventHandler = new EventHandler(this, this.mHandlerThread.getLooper());
        this.mNativeManager = nativeSetup(str, j7, CvDetectMode.CV_DETECT_MODE_VIDEO.getValue());
    }

    public static long getCVConfigByMattingMode(CvMattingMode cvMattingMode) {
        return nativeGetCVConfigByMattingMode(cvMattingMode.getValue());
    }

    public static long getCVConfigByTemplate(String str) {
        return nativeGetCVConfigByTemplate(str);
    }

    public static String getCacheDirPath(String str, long j7) {
        return nativeGetCacheDirPath(str, j7);
    }

    private native void nativeCancelTask(long j7);

    private native void nativeDestroy(long j7);

    private static native long nativeGetCVConfigByMattingMode(int i7);

    private static native long nativeGetCVConfigByTemplate(String str);

    public static native String nativeGetCacheDirPath(String str, long j7);

    public static native boolean nativeRemoveCache(String str);

    public static native void nativeSetCacheBasePath(String str);

    public static native void nativeSetCvModelPath(Map<CvModelType, String> map);

    private native long nativeSetup(String str, long j7, int i7);

    private native boolean nativeStartTask(long j7, Object obj, long j8, long j9);

    private static void postEventFromNative(Object obj, int i7, int i8, int i9, Object obj2) {
        MontageCvManager montageCvManager;
        EventHandler eventHandler;
        if (obj == null || (montageCvManager = (MontageCvManager) ((WeakReference) obj).get()) == null || (eventHandler = montageCvManager.mEventHandler) == null) {
            return;
        }
        montageCvManager.mEventHandler.sendMessage(eventHandler.obtainMessage(i7, i8, i9, obj2));
    }

    public static boolean removeCache(String str) {
        return nativeRemoveCache(str);
    }

    public static void setCacheBasePath(String str) {
        nativeSetCacheBasePath(str);
    }

    public static void setCvModelPath(Map<CvModelType, String> map) {
        nativeSetCvModelPath(map);
    }

    public void cancel() {
        synchronized (this.mNativeMutex) {
            nativeCancelTask(this.mNativeManager);
        }
    }

    public void release() {
        synchronized (this.mNativeMutex) {
            long j7 = this.mNativeManager;
            if (0 != j7) {
                nativeDestroy(j7);
                this.mNativeManager = 0L;
            }
        }
        HandlerThread handlerThread = this.mHandlerThread;
        if (handlerThread != null) {
            handlerThread.quit();
            this.mHandlerThread = null;
        }
        this.mEventHandler = null;
    }

    public void setCallback(ICvDetectCallback iCvDetectCallback) {
        synchronized (this.mCallbackMutex) {
            this.mCallback = iCvDetectCallback;
        }
    }

    public boolean start(long j7, long j8) {
        boolean zNativeStartTask;
        synchronized (this.mNativeMutex) {
            zNativeStartTask = nativeStartTask(this.mNativeManager, new WeakReference(this), j7, j8);
        }
        return zNativeStartTask;
    }
}
