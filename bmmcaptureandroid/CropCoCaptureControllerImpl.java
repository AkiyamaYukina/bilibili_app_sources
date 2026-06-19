package com.bilibili.bmmcaptureandroid;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bilibili.bmmcaptureandroid.api.BMMMediaEngine;
import java.lang.ref.WeakReference;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/bmmcaptureandroid/CropCoCaptureControllerImpl.class */
public class CropCoCaptureControllerImpl implements BMMMediaEngine.CropCoCaptureController {
    private static final int COMPLETED = 4;
    private static final int ERROR = 3;
    private static final long HANDLE_INVALID_VALUE = -1;
    private static final int RENDER_START = 5;
    private static final int REPARED = 2;
    private static final int SEEK_COMPLETED = 1;
    private static final int SIZE_CHANGED = 0;
    private static final String TAG = "CropCoCaptureController";
    private final EventHandler mEventHandler;
    private BMMMediaEngine.CropCoCaptureController.CompleteListener onCompletionListener;
    private long handle = -1;
    private volatile boolean enable = false;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/bmmcaptureandroid/CropCoCaptureControllerImpl$EventHandler.class */
    public static class EventHandler extends Handler {
        public EventHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 4) {
                ((BMMMediaEngine.CropCoCaptureController.CompleteListener) message.obj).onComplete();
            }
        }
    }

    static {
        nativeInitCrop();
    }

    public CropCoCaptureControllerImpl() {
        nativeSetObject(new WeakReference(this));
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            this.mEventHandler = new EventHandler(looperMyLooper);
            return;
        }
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            this.mEventHandler = new EventHandler(mainLooper);
        } else {
            this.mEventHandler = null;
        }
    }

    private native void nativeDestroy(long j7);

    private native void nativeDisableCrop(long j7);

    private native void nativeEnableCrop(long j7);

    private native long nativeGetCurrentPosition(long j7);

    private native long nativeGetDuration(long j7);

    private native float nativeGetSpeed(long j7);

    private static native void nativeInitCrop();

    private native void nativePause(long j7);

    private native void nativeSeekTo(long j7, long j8);

    private native void nativeSetAspectMode(long j7, int i7, float f7);

    private native void nativeSetLoop(long j7, boolean z6);

    private native void nativeSetObject(Object obj);

    private native void nativeSetSource(long j7, Bitmap bitmap);

    private native void nativeSetSource(long j7, String str, int i7);

    private native void nativeSetSpeed(long j7, float f7);

    private native void nativeStart(long j7);

    private static void postEventFromNative(Object obj, int i7) {
        BMMMediaEngine.CropCoCaptureController.CompleteListener completeListener;
        CropCoCaptureControllerImpl cropCoCaptureControllerImpl = (CropCoCaptureControllerImpl) ((WeakReference) obj).get();
        EventHandler eventHandler = cropCoCaptureControllerImpl.mEventHandler;
        if (eventHandler == null || i7 != 4 || (completeListener = cropCoCaptureControllerImpl.onCompletionListener) == null) {
            return;
        }
        cropCoCaptureControllerImpl.mEventHandler.sendMessage(eventHandler.obtainMessage(i7, completeListener));
    }

    public void destroy() {
        nativeDestroy(this.handle);
    }

    public void disableCropCoCapture() {
        if (this.enable) {
            this.enable = false;
            nativeDisableCrop(this.handle);
        }
    }

    public void enableCropCoCapture(long j7) {
        if (this.enable) {
            return;
        }
        this.enable = true;
        this.handle = j7;
        nativeEnableCrop(j7);
    }

    public long getCurrentPosition() {
        return nativeGetCurrentPosition(this.handle);
    }

    public long getDuration() {
        return nativeGetDuration(this.handle);
    }

    public float getSpeed() {
        return nativeGetSpeed(this.handle);
    }

    public void pause() {
        nativePause(this.handle);
    }

    public void seekTo(long j7) {
        nativeSeekTo(this.handle, j7);
    }

    public void setAspectMode(BMMMediaEngine.ContentMode contentMode) {
        setAspectMode(contentMode, -1.0f);
    }

    public void setAspectMode(BMMMediaEngine.ContentMode contentMode, float f7) {
        nativeSetAspectMode(this.handle, contentMode.getType(), f7);
    }

    public void setLoop(boolean z6) {
        nativeSetLoop(this.handle, z6);
    }

    public void setOnCompletionListener(BMMMediaEngine.CropCoCaptureController.CompleteListener completeListener) {
        this.onCompletionListener = completeListener;
    }

    public void setSource(Bitmap bitmap) {
        if (bitmap == null) {
            BLog.w(TAG, "source bitmap is null!");
        } else {
            nativeSetSource(this.handle, bitmap);
        }
    }

    public void setSource(String str) {
        if (TextUtils.isEmpty(str)) {
            BLog.w(TAG, "source path is null!");
        } else {
            setSource(str, 0);
        }
    }

    public void setSource(String str, int i7) {
        if (TextUtils.isEmpty(str)) {
            BLog.w(TAG, "source path is null!");
        } else {
            nativeSetSource(this.handle, str, i7);
        }
    }

    public void setSpeed(float f7) {
        nativeSetSpeed(this.handle, f7);
    }

    public void start() {
        nativeStart(this.handle);
    }
}
