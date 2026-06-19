package com.bilibili.montage.avutil;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bilibili.montage.avinfo.MontageImageInfo;
import com.bilibili.montage.avinfo.MontageRational;
import com.bilibili.montage.timeline.MontageTimeline;
import java.lang.ref.WeakReference;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/avutil/MontageImageGrabber.class */
public class MontageImageGrabber {
    private static final String TAG = "MontageImageGrabber";
    private static final int mTimeout = 2000;
    private MontageImageInfo.IExecuteCallback mEventCallback;
    private Handler mEventHandler;
    private HandlerThread mHandlerThread;
    private long mInternalObj;
    private final ReadWriteLock mNativeObjRWLock = new ReentrantReadWriteLock();
    private ArrayBlockingQueue<Bitmap> mBlockingQueue = new ArrayBlockingQueue<>(1);
    private ICoverImageCallback mCoverImageCallback = new ICoverImageCallback(this) { // from class: com.bilibili.montage.avutil.MontageImageGrabber.1
        final MontageImageGrabber this$0;

        {
            this.this$0 = this;
        }

        @Override // com.bilibili.montage.avutil.MontageImageGrabber.ICoverImageCallback
        public void onImageGrabbedArrived(Bitmap bitmap, long j7) {
            try {
                if (this.this$0.mBlockingQueue != null) {
                    this.this$0.mBlockingQueue.clear();
                }
                if (this.this$0.mBlockingQueue == null || bitmap == null) {
                    return;
                }
                this.this$0.mBlockingQueue.offer(bitmap, 2000L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e7) {
                e7.printStackTrace();
            }
        }
    };

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/avutil/MontageImageGrabber$EventHandler.class */
    public static class EventHandler extends Handler {
        private final WeakReference<MontageImageGrabber> mWeakGenerator;

        public EventHandler(MontageImageGrabber montageImageGrabber, Looper looper) {
            super(looper);
            this.mWeakGenerator = new WeakReference<>(montageImageGrabber);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            MontageImageGrabber montageImageGrabber = this.mWeakGenerator.get();
            if (montageImageGrabber == null || montageImageGrabber.mInternalObj == 0) {
                LogSinker.w(MontageImageGrabber.TAG, "MontageImageGrabber went away with unhandled events");
            } else {
                montageImageGrabber.handleCallback(message.what, message.arg1, message.arg2, message.obj);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/avutil/MontageImageGrabber$ICoverImageCallback.class */
    public interface ICoverImageCallback extends MontageImageInfo.IGrabImageCallback {
        void onImageGrabbedArrived(Bitmap bitmap, long j7);
    }

    public MontageImageGrabber(Handler handler, MontageImageInfo.IExecuteCallback iExecuteCallback) {
        this.mEventHandler = null;
        this.mHandlerThread = null;
        if (handler != null) {
            this.mEventHandler = handler;
        } else if (iExecuteCallback == null) {
            HandlerThread handlerThread = new HandlerThread("native-ImageGen-message-thread");
            this.mHandlerThread = handlerThread;
            handlerThread.start();
            this.mEventHandler = new EventHandler(this, this.mHandlerThread.getLooper());
        } else {
            this.mEventCallback = iExecuteCallback;
        }
        this.mInternalObj = nativeInit(new WeakReference(this));
    }

    private native void nativeCancelTask(long j7, long j8);

    private native void nativeDestroy(long j7);

    private native long nativeInit(Object obj);

    private static native void nativeSetAuroraResPath(String str);

    private static void postEventFromNative(Object obj, int i7, int i8, int i9, Object obj2) {
        MontageImageGrabber montageImageGrabber;
        if (obj == null || (montageImageGrabber = (MontageImageGrabber) ((WeakReference) obj).get()) == null) {
            return;
        }
        if (montageImageGrabber.mEventHandler == null) {
            MontageImageInfo.IExecuteCallback iExecuteCallback = montageImageGrabber.mEventCallback;
            if (iExecuteCallback != null) {
                iExecuteCallback.onExecuteCallback(i7, i8, i9, obj2);
                return;
            }
            return;
        }
        if (obj2 != null) {
            MontageImageInfo montageImageInfo = (MontageImageInfo) obj2;
            montageImageInfo.bitmap = MontageImageHelper.createBitmapFromByteBuffer(montageImageInfo.data, montageImageInfo.width, montageImageInfo.height);
            montageImageInfo.data = null;
        }
        montageImageGrabber.mEventHandler.sendMessage(montageImageGrabber.mEventHandler.obtainMessage(i7, i8, i9, obj2));
    }

    public static void setAuroraResPath(String str) {
        nativeSetAuroraResPath(str);
    }

    public void cancelTask(long j7) {
        this.mNativeObjRWLock.readLock().lock();
        nativeCancelTask(this.mInternalObj, j7);
        this.mNativeObjRWLock.readLock().unlock();
    }

    public void destroy() {
        this.mNativeObjRWLock.writeLock().lock();
        long j7 = this.mInternalObj;
        if (0 != j7) {
            nativeDestroy(j7);
            this.mInternalObj = 0L;
        }
        this.mNativeObjRWLock.writeLock().unlock();
        HandlerThread handlerThread = this.mHandlerThread;
        if (handlerThread != null) {
            handlerThread.quit();
            this.mHandlerThread = null;
        }
        this.mEventHandler = null;
        ArrayBlockingQueue<Bitmap> arrayBlockingQueue = this.mBlockingQueue;
        if (arrayBlockingQueue != null) {
            arrayBlockingQueue.clear();
            this.mBlockingQueue = null;
        }
        LogSinker.i(TAG, "release");
    }

    public Bitmap grabImageFromTimeline(MontageTimeline montageTimeline, long j7, boolean z6, boolean z7, MontageRational montageRational) throws Throwable {
        ArrayBlockingQueue<Bitmap> arrayBlockingQueue = this.mBlockingQueue;
        if (arrayBlockingQueue != null) {
            arrayBlockingQueue.clear();
        }
        long jGrabImageFromTimelineAsync = grabImageFromTimelineAsync(montageTimeline, j7, j7, 2, montageRational, 0, 0, this.mCoverImageCallback, z6, z7);
        Bitmap bitmapPoll = null;
        if (jGrabImageFromTimelineAsync < 0 || this.mBlockingQueue == null) {
            return null;
        }
        if (montageRational == null) {
            new MontageRational(1, 1);
        }
        try {
            bitmapPoll = this.mBlockingQueue.poll(2000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e7) {
        }
        return bitmapPoll;
    }

    public long grabImageFromTimelineAsync(MontageTimeline montageTimeline, long j7, long j8, int i7, MontageRational montageRational, int i8, int i9, MontageImageInfo.IGrabImageCallback iGrabImageCallback, boolean z6, boolean z7) throws Throwable {
        if (montageRational == null) {
            montageRational = new MontageRational(1, 1);
        }
        this.mNativeObjRWLock.readLock().lock();
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            long jNativeGrabImageFromTimelineAsync = nativeGrabImageFromTimelineAsync(this.mInternalObj, montageTimeline, j7, j8, i7, montageRational, i8, i9, iGrabImageCallback, z6, z7);
            this.mNativeObjRWLock.readLock().unlock();
            return jNativeGrabImageFromTimelineAsync;
        } catch (Throwable th2) {
            th = th2;
            this.mNativeObjRWLock.readLock().unlock();
            throw th;
        }
    }

    public boolean grabImageFromTimelineAsync(MontageTimeline montageTimeline, long j7, MontageRational montageRational, int i7, MontageImageInfo.IGrabImageCallback iGrabImageCallback) {
        return grabImageFromTimelineAsync(montageTimeline, j7, j7, 2, montageRational, 0, i7, iGrabImageCallback, true, false) >= 0;
    }

    public void handleCallback(int i7, int i8, int i9, Object obj) {
        ICoverImageCallback iCoverImageCallback;
        MontageImageInfo montageImageInfo = (MontageImageInfo) obj;
        if (montageImageInfo == null || (iCoverImageCallback = (ICoverImageCallback) montageImageInfo.callback) == null || i7 != 6) {
            return;
        }
        switch (i8) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                iCoverImageCallback.onImageGrabbedArrived(montageImageInfo.bitmap, montageImageInfo.timestamp);
                break;
        }
    }

    public native long nativeGrabImageFromTimelineAsync(long j7, MontageTimeline montageTimeline, long j8, long j9, int i7, MontageRational montageRational, int i8, int i9, MontageImageInfo.IGrabImageCallback iGrabImageCallback, boolean z6, boolean z7);
}
