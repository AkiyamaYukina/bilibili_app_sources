package com.bilibili.bmmcaptureandroid;

import android.util.Log;
import com.bilibili.bmmcaptureandroid.api.BMMMediaEngine;
import java.lang.ref.WeakReference;
import java.util.List;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/bmmcaptureandroid/CoCaptureControllerImpl.class */
public class CoCaptureControllerImpl implements BMMMediaEngine.CoCaptureController {
    private static final String TAG = "CoCaptureControllerImpl";
    private static final String WARNING_MSG = "Please call init function first";
    private static long mHandle;
    private BMMMediaEngine.CoCaptureController.PreparedListener mPrepareListenr;
    private BMMMediaEngine.CoCaptureController.CompleteListener onCompletionListener;
    private BMMMediaEngine.CoCaptureController.SeekCompleteListener onSeekCompletionListener;
    private final int SIZE_CHANGED = 0;
    private final int SEEK_COMPLETED = 1;
    private final int PREPARED = 2;
    private final int ERROR = 3;
    private final int COMPLETED = 4;
    private final int RENDER_START = 5;
    private boolean initFlag = false;
    private EGLContext eglContext = null;
    private int width = 0;
    private int height = 0;

    public CoCaptureControllerImpl() {
        Log.i(TAG, "constructor");
        nativeSetObject(mHandle, new WeakReference(this).get());
    }

    public static void initCoCapture(long j7) {
        mHandle = j7;
    }

    private static native void nativeEnable(long j7, boolean z6);

    private static native long nativeGetCurrentPosition(long j7);

    private static native long nativeGetDuration(long j7);

    private static native float nativeGetSpeed(long j7);

    private static native int nativeGetVideoInfo(long j7);

    private static native void nativeInit(long j7);

    private static native void nativePause(long j7);

    private static native void nativeRelease(long j7);

    private static native void nativeSeekTo(long j7, long j8);

    private static native void nativeSetDisplayRects(long j7, BMMMediaEngine.CoCaptureRect coCaptureRect, BMMMediaEngine.CoCaptureRect coCaptureRect2);

    private static native void nativeSetLoop(long j7, boolean z6);

    private static native void nativeSetMode(long j7, int i7);

    private static native void nativeSetObject(long j7, Object obj);

    private static native void nativeSetPreviewSize(long j7, int i7, int i8);

    private static native boolean nativeSetSource(long j7, String str, int i7);

    private static native void nativeSetSpeed(long j7, float f7);

    private static native void nativeStart(long j7);

    private void triggerCallback(int i7) {
        BMMMediaEngine.CoCaptureController.CompleteListener completeListener;
        Log.i(TAG, "triggerCallback" + i7);
        if (i7 != 1) {
            if (i7 == 4 && (completeListener = this.onCompletionListener) != null) {
                completeListener.onComplete();
                return;
            }
            return;
        }
        BMMMediaEngine.CoCaptureController.SeekCompleteListener seekCompleteListener = this.onSeekCompletionListener;
        if (seekCompleteListener != null) {
            seekCompleteListener.onSeekCompleter();
        }
    }

    public void enable(boolean z6) {
        nativeEnable(mHandle, z6);
    }

    public void getCurrentEglContext() {
        Log.i(TAG, "getCurrentEglContext");
        this.eglContext = ((EGL10) EGLContext.getEGL()).eglGetCurrentContext();
    }

    public long getCurrentPosition() {
        return nativeGetCurrentPosition(mHandle);
    }

    public long getDuration() {
        return nativeGetDuration(mHandle);
    }

    public float getSpeed() {
        return nativeGetSpeed(mHandle);
    }

    public BMMMediaEngine.CoCaptureVideoInfo getVideoInfo() {
        if (!this.initFlag) {
            Log.w(TAG, WARNING_MSG);
            return null;
        }
        BMMMediaEngine.CoCaptureVideoInfo coCaptureVideoInfo = new BMMMediaEngine.CoCaptureVideoInfo();
        coCaptureVideoInfo.textureId = nativeGetVideoInfo(mHandle);
        coCaptureVideoInfo.eglContext = this.eglContext;
        coCaptureVideoInfo.width = this.width;
        coCaptureVideoInfo.height = this.height;
        return coCaptureVideoInfo;
    }

    public void init() {
        this.initFlag = true;
        nativeInit(mHandle);
    }

    public void pause() {
        if (this.initFlag) {
            nativePause(mHandle);
        } else {
            Log.w(TAG, WARNING_MSG);
        }
    }

    public void release() {
        if (!this.initFlag) {
            Log.w(TAG, WARNING_MSG);
            return;
        }
        this.initFlag = false;
        this.eglContext = null;
        this.mPrepareListenr = null;
        nativeRelease(mHandle);
    }

    public void seekTo(long j7) {
        if (this.initFlag) {
            nativeSeekTo(mHandle, j7);
        } else {
            Log.w(TAG, WARNING_MSG);
        }
    }

    public void setCoCapturePrepareListener(BMMMediaEngine.CoCaptureController.PreparedListener preparedListener) {
        this.mPrepareListenr = preparedListener;
    }

    public void setDisplayRect(List<BMMMediaEngine.CoCaptureRect> list) {
        if (!this.initFlag) {
            Log.w(TAG, WARNING_MSG);
        } else if (list.size() != 2) {
            Log.w(TAG, "list size != 2");
        } else {
            nativeSetDisplayRects(mHandle, list.get(0), list.get(1));
        }
    }

    public void setLoop(boolean z6) {
        nativeSetLoop(mHandle, z6);
    }

    public void setMode(BMMMediaEngine.ContentMode contentMode) {
        nativeSetMode(mHandle, contentMode.getType());
    }

    public void setOnCompletionListener(BMMMediaEngine.CoCaptureController.CompleteListener completeListener) {
        if (this.initFlag) {
            this.onCompletionListener = completeListener;
        } else {
            Log.w(TAG, WARNING_MSG);
        }
    }

    public void setPreviewSize(BMMMediaEngine.BBSize bBSize) {
        nativeSetPreviewSize(mHandle, bBSize.width, bBSize.height);
    }

    public void setSeekCompletionListener(BMMMediaEngine.CoCaptureController.SeekCompleteListener seekCompleteListener) {
        if (!this.initFlag) {
            Log.w(TAG, WARNING_MSG);
        }
        this.onSeekCompletionListener = seekCompleteListener;
    }

    public void setSize(int i7, int i8) {
        this.width = i7;
        this.height = i8;
        this.mPrepareListenr.onPrepared(this);
    }

    public boolean setSource(String str) {
        return nativeSetSource(mHandle, str, 0);
    }

    public boolean setSource(String str, int i7) {
        return nativeSetSource(mHandle, str, i7);
    }

    public void setSpeed(float f7) {
        nativeSetSpeed(mHandle, f7);
    }

    public void start() {
        if (this.initFlag) {
            nativeStart(mHandle);
        } else {
            Log.w(TAG, WARNING_MSG);
        }
    }
}
