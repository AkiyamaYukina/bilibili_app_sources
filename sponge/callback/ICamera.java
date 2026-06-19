package com.bilibili.sponge.callback;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import com.bilibili.sponge.camera.CameraParameterConfigture;
import com.bilibili.sponge.exception.SpongeCameraAccessException;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sponge/callback/ICamera.class */
public interface ICamera {
    boolean cancelAutoFocus();

    void changePreviewSurface(SurfaceTexture surfaceTexture);

    boolean focusOnPoint(Rect rect);

    int getCameraAmount();

    Object getCameraObject();

    int getCurrentExposureCompensation();

    String getCurrentWhiteBalanceMode();

    int getDisplayOrientation() throws SpongeCameraAccessException;

    float getExposureCompensationStep();

    int getMaxExposureCompensation();

    float getMaxZoomValue();

    int getMinExposureCompensation();

    int getOrientation();

    CameraParameterConfigture.SpongeSize getPreviewSize();

    int getRotationAngle();

    List<String> getSupportPreviewSize(int i7, List<String> list);

    List<CameraParameterConfigture.SpongeSize> getSupportPreviewSize(Context context);

    float getVerticalViewAngle();

    boolean getVideoStabilization();

    List<String> getWhiteBalanceModes();

    int getZoom();

    List<Integer> getZoomRatios();

    boolean handleZoom(int i7);

    ICamera init(Context context);

    boolean isFlipHorizontal();

    boolean isFlipVertical();

    boolean isFrontCamera();

    boolean isOpenFlash();

    boolean isSupportAutoExposure();

    boolean isSupportAutoFocus();

    boolean isSupportContinuousFocus();

    boolean isSupportExposureCompensation();

    boolean isSupportFlash();

    boolean isSupportVideoStabilization();

    boolean isSupportZoom();

    int openCamera(CameraParameterConfigture cameraParameterConfigture, IOpenCameraCallback iOpenCameraCallback);

    int releaseCamera();

    void setCameraObject(Object obj, CameraParameterConfigture cameraParameterConfigture);

    void setCameraRawDataListener(ICameraRawDataListener iCameraRawDataListener);

    boolean setExposureCompensation(int i7);

    boolean setFlashMode(String str);

    boolean setFocusMode(String str);

    boolean setMeteringArea(Rect rect);

    void setTextureId(int i7);

    boolean setVideoStabilization(boolean z6);

    boolean setWhiteBalanceModes(String str);

    void startPreview() throws SpongeCameraAccessException;

    void stopPreview() throws SpongeCameraAccessException;

    void switchCamera(IOpenCameraCallback iOpenCameraCallback) throws SpongeCameraAccessException;
}
