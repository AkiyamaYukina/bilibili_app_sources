package com.bilibili.bmmcaptureandroid;

import android.content.Context;
import android.view.SurfaceView;
import com.bilibili.bmmcaptureandroid.BMMCaptureEngine;
import com.bilibili.bmmcaptureandroid.api.BMMMediaEngine;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/bmmcaptureandroid/BMMMediaEngineImp.class */
public class BMMMediaEngineImp {
    private CameraHelperWrapper cameraHelperWrapper;
    private BMMMediaEngine.EncoderDataListener encoderDataListener;
    private BMMCaptureEngine mCaptureEngineImpl;
    private CropCoCaptureControllerImpl mCropCoCaptureController;
    private BMMMediaEngine.CaptureFpsStatusListener mFpsStatusListener;
    private int mRenderFps = 0;
    private final BMMCaptureEngine.BMMCaptureRecordDataListener mBMMRecordDataListener = new BMMCaptureEngine.BMMCaptureRecordDataListener(this) { // from class: com.bilibili.bmmcaptureandroid.BMMMediaEngineImp.1
        final BMMMediaEngineImp this$0;

        {
            this.this$0 = this;
        }

        @Override // com.bilibili.bmmcaptureandroid.BMMCaptureEngine.BMMCaptureRecordDataListener
        public void onAudioDataWrite(BMMMediaEngine.AudioData audioData) {
            if (this.this$0.encoderDataListener != null) {
                this.this$0.encoderDataListener.onAudioDataWrite(audioData);
            }
        }

        @Override // com.bilibili.bmmcaptureandroid.BMMCaptureEngine.BMMCaptureRecordDataListener
        public void onVideoDataWrite(BMMMediaEngine.VideoData videoData) {
            if (this.this$0.encoderDataListener != null) {
                this.this$0.encoderDataListener.onVideoDataWrite(videoData);
            }
        }
    };
    private BMMCaptureEngine.BMMCaptureFpsStatusListener mBMMFpsStatusListener = new BMMCaptureEngine.BMMCaptureFpsStatusListener(this) { // from class: com.bilibili.bmmcaptureandroid.BMMMediaEngineImp.2
        final BMMMediaEngineImp this$0;

        {
            this.this$0 = this;
        }

        @Override // com.bilibili.bmmcaptureandroid.BMMCaptureEngine.BMMCaptureFpsStatusListener
        public void onFpsUpdate(int i7) {
            this.this$0.mRenderFps = i7;
            if (this.this$0.mFpsStatusListener != null) {
                this.this$0.mFpsStatusListener.onFpsUpdate(i7);
            }
        }
    };

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/bmmcaptureandroid/BMMMediaEngineImp$RecordFlag.class */
    public enum RecordFlag {
        RECORDING_FLAG_ONLY_RECORD_ALL(0),
        RECORDING_FLAG_ONLY_RECORD_VIDEO(1),
        RECORDING_FLAG_ONLY_RECORD_AUDIO(2);

        private final int value;

        RecordFlag(int i7) {
            this.value = i7;
        }

        public int getValue() {
            return this.value;
        }
    }

    public BMMMediaEngineImp() {
        BMMCaptureEngine bMMCaptureEngine = new BMMCaptureEngine();
        this.mCaptureEngineImpl = bMMCaptureEngine;
        bMMCaptureEngine.createHandle();
    }

    public static String getVersion() {
        return BMMCaptureEngine.getEngineVersion();
    }

    public boolean attachCamera() {
        return this.mCaptureEngineImpl.attachCamera();
    }

    public boolean authCV(String str) {
        return this.mCaptureEngineImpl.authCv(str);
    }

    public void connectPreviewWindow(SurfaceView surfaceView) {
        this.mCaptureEngineImpl.connectCapturePreviewWithLiveWindow(surfaceView);
    }

    public boolean detachCamera() {
        return this.mCaptureEngineImpl.detachCamera();
    }

    public void disableCropCoCapture() {
        this.mCaptureEngineImpl.isOpenDetectSegment(false);
        this.mCropCoCaptureController.disableCropCoCapture();
    }

    public void enableCropCoCapture() {
        this.mCaptureEngineImpl.isOpenDetectSegment(true);
        this.mCropCoCaptureController.enableCropCoCapture(this.mCaptureEngineImpl.getCropCoCaptureHandle());
    }

    public CameraHelperWrapper getCameraHelperWrapper() {
        return this.cameraHelperWrapper;
    }

    public CropCoCaptureControllerImpl getCropCocaptureController() {
        return this.mCropCoCaptureController;
    }

    public int getCurrentStatus() {
        return this.mCaptureEngineImpl.getCurrentStatus();
    }

    public int getRenderFps() {
        return this.mRenderFps;
    }

    public BMMCaptureVideoController getVideoCaptureController() {
        return this.mCaptureEngineImpl.getVideoCaptureController();
    }

    public boolean init(Context context, BMMMediaEngine.EngineConfig engineConfig) {
        this.cameraHelperWrapper = new CameraHelperWrapper(context, this.mCaptureEngineImpl.getCaptureDevice(), engineConfig.position.getPosition(), engineConfig.grade.getGrade(), this.mCaptureEngineImpl.getSharedCameraMap());
        if (!this.mCaptureEngineImpl.configure(engineConfig)) {
            return false;
        }
        this.mCaptureEngineImpl.setFpsStatusListener(this.mBMMFpsStatusListener);
        this.mCaptureEngineImpl.setRecordDataListener(this.mBMMRecordDataListener);
        this.mCropCoCaptureController = new CropCoCaptureControllerImpl();
        return true;
    }

    public boolean loadModel(BMMMediaEngine.ModelType modelType, String str) {
        return this.mCaptureEngineImpl.loadModel(modelType, str);
    }

    public void pause(boolean z6, boolean z7) {
        this.mCaptureEngineImpl.onPause(z6, z7);
    }

    public void release() {
        BMMCaptureEngine bMMCaptureEngine = this.mCaptureEngineImpl;
        if (bMMCaptureEngine != null) {
            bMMCaptureEngine.destroyHandle();
        }
        CropCoCaptureControllerImpl cropCoCaptureControllerImpl = this.mCropCoCaptureController;
        if (cropCoCaptureControllerImpl != null) {
            cropCoCaptureControllerImpl.destroy();
        }
    }

    public void resume(boolean z6, int i7) {
        this.mCaptureEngineImpl.onResume(z6, i7);
    }

    public void setAuroraLogConfig(BMMMediaEngine.AuroraLogConfig auroraLogConfig) {
        BMMCaptureEngine bMMCaptureEngine = this.mCaptureEngineImpl;
        if (bMMCaptureEngine != null) {
            bMMCaptureEngine.setAuroraLogConfig(auroraLogConfig);
        }
    }

    public boolean setAuroraResourceDir(String str) {
        return this.mCaptureEngineImpl.setAuroraResourceDir(str);
    }

    public void setBlackFrameDetectListener(BMMMediaEngine.BlackFrameDetectEventListener blackFrameDetectEventListener) {
        this.mCaptureEngineImpl.setBlackFrameDetectListener(blackFrameDetectEventListener);
    }

    public boolean setCVFaceAnimationModelPath(String str) {
        return this.mCaptureEngineImpl.setCVFaceAnimationModelPath(str);
    }

    public boolean setCVGenderClassifierModelPath(String str) {
        return this.mCaptureEngineImpl.setCVGenderClassifierModelPath(str);
    }

    public void setFirstFrameListener(BMMMediaEngine.CaptureFirstFrameListener captureFirstFrameListener) {
        this.mCaptureEngineImpl.setFirstFrameListener(captureFirstFrameListener);
    }

    public void setFpsStatusListener(BMMMediaEngine.CaptureFpsStatusListener captureFpsStatusListener) {
        this.mFpsStatusListener = captureFpsStatusListener;
    }

    public void setLoadModelListener(BMMMediaEngine.CaptureLoadModelListener captureLoadModelListener) {
        this.mCaptureEngineImpl.setLoadModelListener(captureLoadModelListener);
    }

    public void setRecordDataListener(BMMMediaEngine.EncoderDataListener encoderDataListener) {
        this.encoderDataListener = encoderDataListener;
    }

    public void setRecordStatusListener(BMMMediaEngine.CaptureRecordingStatusCallback captureRecordingStatusCallback) {
        this.mCaptureEngineImpl.setRecordStatusListener(captureRecordingStatusCallback);
    }

    public void setRenderEventListener(BMMMediaEngine.CaptureRenderEventListener captureRenderEventListener) {
        this.mCaptureEngineImpl.setRenderEventListener(captureRenderEventListener);
    }

    public void setSharedCameraMap(Map<String, Object> map) {
        this.mCaptureEngineImpl.setSharedCameraMap(map);
    }

    public void setVideoFxChangedListener(BMMMediaEngine.CaptureVideoFxChangedListener captureVideoFxChangedListener) {
        BMMCaptureEngine bMMCaptureEngine = this.mCaptureEngineImpl;
        if (bMMCaptureEngine != null) {
            bMMCaptureEngine.setVideoFxChangedListener(captureVideoFxChangedListener);
        }
    }

    public void startPreview() {
        this.mCaptureEngineImpl.startPreview();
    }

    public boolean startRecord(BMMMediaEngine.RecordConfig recordConfig) {
        return this.mCaptureEngineImpl.startRecord(recordConfig);
    }

    public void stopRecord() {
        this.mCaptureEngineImpl.stopRecord();
    }
}
