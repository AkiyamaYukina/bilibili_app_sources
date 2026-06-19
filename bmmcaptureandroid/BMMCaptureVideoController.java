package com.bilibili.bmmcaptureandroid;

import android.graphics.Bitmap;
import com.bilibili.bmmcaptureandroid.api.BMMARFaceContext;
import com.bilibili.bmmcaptureandroid.api.BMMCustomVideoFx;
import com.bilibili.bmmcaptureandroid.api.BMMVideoRenderController;
import com.bilibili.bmmcaptureandroid.api.interfaces.BMMCapture3DStickerVideoFx;
import com.bilibili.bmmcaptureandroid.api.interfaces.BMMCaptureAuroraVideoFx;
import com.bilibili.bmmcaptureandroid.api.interfaces.BMMCaptureBeautifyVideoFx;
import com.bilibili.bmmcaptureandroid.api.interfaces.BMMCaptureFilterVideoFx;
import com.bilibili.bmmcaptureandroid.api.interfaces.BMMCaptureMakeupVideoFx;
import com.bilibili.bmmcaptureandroid.subfx.BMMCapture3DStickerVideoFxImp;
import com.bilibili.bmmcaptureandroid.subfx.BMMCaptureAuroraVideoFxImp;
import com.bilibili.bmmcaptureandroid.subfx.BMMCaptureBeautyVideoFxImp;
import com.bilibili.bmmcaptureandroid.subfx.BMMCaptureFilterVideoFxImp;
import com.bilibili.bmmcaptureandroid.subfx.BMMCaptureMakeUpVideoFxImp;
import com.bilibili.bmmcaptureandroid.subfx.BMMCustomVideoFxImpl;
import java.util.HashMap;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/bmmcaptureandroid/BMMCaptureVideoController.class */
public class BMMCaptureVideoController {
    private static final int AURORA_FX_INDEX = 6;
    private static final int BEAUTY_FX_INDEX = 1;
    private static final int FILTER_FX_INDEX = 5;
    private static final int MAKEUP_FX_INDEX = 2;
    private static final int STICKER_3D_FX_INDEX = 4;
    private static final String TAG = "BMMVideoController";
    private HashMap<Integer, Object> fxMap;
    private BMMVideoRenderController.CurrentImageListener imageListener;
    private BMMARFaceContext mARFaceContext;
    private long mControllerHandle;

    public BMMCaptureVideoController(long j7) {
        this.mControllerHandle = j7;
        this.mARFaceContext = new BMMARFaceContext(nativeGetARFaceContext(j7));
        initMap();
    }

    private void initMap() {
        this.fxMap = new HashMap<>();
    }

    private static native long nativeAppendCustomCaptureVideoFx(long j7, Object obj);

    private static native long nativeBlendAddImage(long j7, Bitmap bitmap, int i7, int i8, float f7);

    private static native void nativeBlendDelImage(long j7, long j8);

    private static native long nativeGet3DStickerBuiltinVideoFx(long j7);

    private static native long nativeGetARFaceContext(long j7);

    private static native long nativeGetAuroraBuiltinAuroraVideoFx(long j7);

    private static native long nativeGetBeautyBuiltinVideoFx(long j7);

    private static native Bitmap nativeGetCurrentImage(long j7, long j8, boolean z6);

    private static native long nativeGetFilterBuiltinVideoFx(long j7);

    private static native long nativeGetMakeupBuiltinVideoFx(long j7);

    private static native boolean nativeGetUseSTFaceDetect(long j7);

    private static native boolean nativeGetUseVersaCrop(long j7);

    private static native long nativeInsertCustomCaptureVideoFx(long j7, int i7, Object obj);

    private static native void nativeRemoveAllCustomCaptureVideoFx(long j7);

    private static native boolean nativeRemoveAuroraBuiltinVideoFx(long j7);

    private static native boolean nativeRemoveBeautyBuiltinVideoFx(long j7);

    private static native void nativeRemoveCustomCaptureVideoFx(long j7, long j8);

    private static native boolean nativeRemoveFilterBuiltinVideoFx(long j7);

    private static native boolean nativeRemoveMakeupBuiltinVideoFx(long j7);

    private static native boolean nativeSetRenderPerformanceMode(long j7, int i7);

    private static native void nativeUseSTFaceDetect(long j7, boolean z6);

    private static native void nativeUseVersaCrop(long j7, boolean z6);

    public BMMCustomVideoFx appendCustomCaptureVideoFx(BMMCustomVideoFx.Renderer renderer) {
        BMMCustomVideoFxImpl bMMCustomVideoFxImpl = new BMMCustomVideoFxImpl(renderer);
        bMMCustomVideoFxImpl.setHandle(nativeAppendCustomCaptureVideoFx(this.mControllerHandle, bMMCustomVideoFxImpl));
        return bMMCustomVideoFxImpl;
    }

    public long blendAddImage(Bitmap bitmap, int i7, int i8, float f7) {
        return nativeBlendAddImage(this.mControllerHandle, bitmap, i7, i8, f7);
    }

    public void blendDelImage(long j7) {
        nativeBlendDelImage(this.mControllerHandle, j7);
    }

    public BMMCapture3DStickerVideoFx get3DStickerBuiltinVideoFx() {
        if (this.fxMap.containsKey(4)) {
            return (BMMCapture3DStickerVideoFx) this.fxMap.get(4);
        }
        BMMCapture3DStickerVideoFxImp bMMCapture3DStickerVideoFxImp = new BMMCapture3DStickerVideoFxImp(nativeGet3DStickerBuiltinVideoFx(this.mControllerHandle));
        this.fxMap.put(4, bMMCapture3DStickerVideoFxImp);
        return bMMCapture3DStickerVideoFxImp;
    }

    public BMMARFaceContext getARFaceContext() {
        return this.mARFaceContext;
    }

    public BMMCaptureAuroraVideoFx getAuroraBuiltinVideoFx() {
        if (this.fxMap.containsKey(6)) {
            return (BMMCaptureAuroraVideoFx) this.fxMap.get(6);
        }
        BMMCaptureAuroraVideoFxImp bMMCaptureAuroraVideoFxImp = new BMMCaptureAuroraVideoFxImp(nativeGetAuroraBuiltinAuroraVideoFx(this.mControllerHandle));
        this.fxMap.put(6, bMMCaptureAuroraVideoFxImp);
        return bMMCaptureAuroraVideoFxImp;
    }

    public BMMCaptureBeautifyVideoFx getBeautyBuiltinVideoFx() {
        if (this.fxMap.containsKey(1)) {
            return (BMMCaptureBeautifyVideoFx) this.fxMap.get(1);
        }
        BMMCaptureBeautyVideoFxImp bMMCaptureBeautyVideoFxImp = new BMMCaptureBeautyVideoFxImp(nativeGetBeautyBuiltinVideoFx(this.mControllerHandle));
        this.fxMap.put(1, bMMCaptureBeautyVideoFxImp);
        return bMMCaptureBeautyVideoFxImp;
    }

    public Bitmap getCurrentImage(boolean z6, long j7) {
        return nativeGetCurrentImage(this.mControllerHandle, j7, z6);
    }

    public BMMCaptureFilterVideoFx getFilterBuiltinVideoFx() {
        if (this.fxMap.containsKey(5)) {
            return (BMMCaptureFilterVideoFx) this.fxMap.get(5);
        }
        BMMCaptureFilterVideoFxImp bMMCaptureFilterVideoFxImp = new BMMCaptureFilterVideoFxImp(nativeGetFilterBuiltinVideoFx(this.mControllerHandle));
        this.fxMap.put(5, bMMCaptureFilterVideoFxImp);
        return bMMCaptureFilterVideoFxImp;
    }

    public BMMCaptureMakeupVideoFx getMakeupBuiltinVideoFx() {
        if (this.fxMap.containsKey(2)) {
            return (BMMCaptureMakeupVideoFx) this.fxMap.get(2);
        }
        BMMCaptureMakeUpVideoFxImp bMMCaptureMakeUpVideoFxImp = new BMMCaptureMakeUpVideoFxImp(nativeGetMakeupBuiltinVideoFx(this.mControllerHandle));
        this.fxMap.put(2, bMMCaptureMakeUpVideoFxImp);
        return bMMCaptureMakeUpVideoFxImp;
    }

    public BMMCustomVideoFx insertCustomCaptureVideoFx(int i7, BMMCustomVideoFx.Renderer renderer) {
        BMMCustomVideoFxImpl bMMCustomVideoFxImpl = new BMMCustomVideoFxImpl(renderer);
        bMMCustomVideoFxImpl.setHandle(nativeInsertCustomCaptureVideoFx(this.mControllerHandle, i7, bMMCustomVideoFxImpl));
        return bMMCustomVideoFxImpl;
    }

    public void onCurrentImage(Bitmap bitmap, long j7) {
        BMMVideoRenderController.CurrentImageListener currentImageListener = this.imageListener;
        if (currentImageListener != null) {
            currentImageListener.onCurrentImage(bitmap, j7);
        }
    }

    public boolean remove3DStickerBuiltinVideoFx() {
        this.fxMap.remove(4);
        return true;
    }

    public void removeAllCustomCaptureVideoFx() {
        nativeRemoveAllCustomCaptureVideoFx(this.mControllerHandle);
    }

    public boolean removeAuroraBuiltinVideoFx() {
        nativeRemoveAuroraBuiltinVideoFx(this.mControllerHandle);
        this.fxMap.remove(6);
        return true;
    }

    public boolean removeBeautyBuiltinVideoFx() {
        nativeRemoveBeautyBuiltinVideoFx(this.mControllerHandle);
        this.fxMap.remove(1);
        return true;
    }

    public void removeCustomCaptureVideoFx(BMMCustomVideoFx bMMCustomVideoFx) {
        if (bMMCustomVideoFx != null && (bMMCustomVideoFx instanceof BMMCustomVideoFxImpl)) {
            nativeRemoveCustomCaptureVideoFx(this.mControllerHandle, ((BMMCustomVideoFxImpl) bMMCustomVideoFx).getHandle());
        }
    }

    public boolean removeFilterBuiltinVideoFx() {
        nativeRemoveFilterBuiltinVideoFx(this.mControllerHandle);
        this.fxMap.remove(5);
        return true;
    }

    public boolean removeMakeupBuiltinVideoFx() {
        nativeRemoveMakeupBuiltinVideoFx(this.mControllerHandle);
        this.fxMap.remove(2);
        return true;
    }

    public void setCurrentImageListener(BMMVideoRenderController.CurrentImageListener currentImageListener) {
        this.imageListener = currentImageListener;
    }

    public boolean setRenderPerformanceMode(int i7) {
        return nativeSetRenderPerformanceMode(this.mControllerHandle, i7);
    }

    public void setUseCV(boolean z6) {
        nativeUseSTFaceDetect(this.mControllerHandle, false);
        nativeUseSTFaceDetect(this.mControllerHandle, false);
    }
}
