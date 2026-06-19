package com.bilibili.bmmcaptureandroid;

import com.bilibili.sponge.camera.CameraParameterConfigture;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/bmmcaptureandroid/BMMCaptureDevice.class */
public class BMMCaptureDevice {
    public static final int BMM_CAPTURE_DEVICE_POSITION_BACK = 1;
    public static final int BMM_CAPTURE_DEVICE_POSITION_FRONT = 2;
    public static final int BMM_CAPTURE_DEVICE_RESOLUTION_HIGH = 2;
    public static final int BMM_CAPTURE_DEVICE_RESOLUTION_LOW = 0;
    public static final int BMM_CAPTURE_DEVICE_RESOLUTION_MEDIUM = 1;
    public static final int BMM_CAPTURE_DEVICE_RESOLUTION_SUPER_HIGH = 3;
    public static final int BMM_CAPTURE_DEVICE_STATUS_PREPARED = 1;
    public static final int BMM_CAPTURE_DEVICE_STATUS_RELEASED = 4;
    public static final int BMM_CAPTURE_DEVICE_STATUS_STARTED = 2;
    public static final int BMM_CAPTURE_DEVICE_STATUS_STOPPED = 3;
    public static final int BMM_CAPTURE_DEVICE_STATUS_UNKNOWN = 0;
    private static final long INVALID_HANDLE = 0;
    private long mCaptureNativeHandle = 0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/bmmcaptureandroid/BMMCaptureDevice$DeviceAbility.class */
    public static class DeviceAbility {
        public float exposureCompensationStep;
        public boolean isSupportAutoExposure;
        public boolean isSupportAutoFocus;
        public boolean isSupportContinuousFocus;
        public boolean isSupportExposureCompensation;
        public boolean isSupportFlash;
        public boolean isSupportVideoStabilization;
        public boolean isSupportZoom;
        public int maxExposureCompensation;
        public float maxZoom;
        public int minExposureCompensation;
        public float minZoom;
        public List<Integer> zoomRatios;
    }

    private static native boolean nativeChangeResolutionGrade(long j7, int i7);

    private static native boolean nativeCloseCamera(long j7);

    private static native int nativeGetCurExposureCompensation(long j7);

    private static native int nativeGetCurrentStatus(long j7);

    private static native DeviceAbility nativeGetDeviceAbility(long j7);

    private static native int nativeGetDeviceCount(long j7);

    private static native int nativeGetDevicePosition(long j7);

    private static native float nativeGetExposureCompensationStep(long j7);

    private static native int nativeGetMaxExposureCompensation(long j7);

    private static native int nativeGetMinExposureCompensation(long j7);

    private static native int nativeGetPreviewGrade(long j7);

    private static native List<CameraParameterConfigture.SpongeSize> nativeGetSupportPreviewSize(long j7);

    private static native boolean nativeGetVideoStabilization(long j7);

    private static native int nativeGetZoom(long j7);

    private static native boolean nativeIsFacingBack(long j7);

    private static native boolean nativeIsFlashOn(long j7);

    private static native boolean nativeOpenCamera(long j7);

    private static native boolean nativeSetExposureCompensation(long j7, int i7);

    private static native boolean nativeSetExposureRect(long j7, int i7, int i8, int i9, int i10);

    private static native boolean nativeSetFlashOn(long j7, boolean z6);

    private static native boolean nativeSetFocusRect(long j7, int i7, int i8, int i9, int i10);

    private static native boolean nativeSetVideoStabilization(long j7, boolean z6);

    private static native boolean nativeSetZoom(long j7, int i7);

    private static native boolean nativeStartAutoFocus(long j7);

    private static native boolean nativeStartContinuousFocus(long j7);

    private static native boolean nativeStopAutoFocus(long j7);

    private static native void nativeSwitchCamera(long j7);

    public boolean changeResolutionGrade(int i7) {
        return nativeChangeResolutionGrade(this.mCaptureNativeHandle, i7);
    }

    public boolean closeCamera() {
        return nativeCloseCamera(this.mCaptureNativeHandle);
    }

    public int getCurExposureCompensation() {
        return nativeGetCurExposureCompensation(this.mCaptureNativeHandle);
    }

    public int getCurrentStatus() {
        return nativeGetCurrentStatus(this.mCaptureNativeHandle);
    }

    public DeviceAbility getDeviceAbility() {
        return nativeGetDeviceAbility(this.mCaptureNativeHandle);
    }

    public int getDeviceCount() {
        return nativeGetDeviceCount(this.mCaptureNativeHandle);
    }

    public int getDevicePosition() {
        return nativeGetDevicePosition(this.mCaptureNativeHandle);
    }

    public float getExposureCompensationStep() {
        return nativeGetExposureCompensationStep(this.mCaptureNativeHandle);
    }

    public int getMaxExposureCompensation() {
        return nativeGetMaxExposureCompensation(this.mCaptureNativeHandle);
    }

    public int getMinExposureCompensation() {
        return nativeGetMinExposureCompensation(this.mCaptureNativeHandle);
    }

    public int getPreviewGrade() {
        return nativeGetPreviewGrade(this.mCaptureNativeHandle);
    }

    public List<CameraParameterConfigture.SpongeSize> getSupportPreviewSize() {
        return nativeGetSupportPreviewSize(this.mCaptureNativeHandle);
    }

    public boolean getVideoStabilization() {
        return nativeGetVideoStabilization(this.mCaptureNativeHandle);
    }

    public int getZoom() {
        return nativeGetZoom(this.mCaptureNativeHandle);
    }

    public void initCaptureDevice(long j7) {
        this.mCaptureNativeHandle = j7;
    }

    public boolean isFacingBack() {
        return nativeIsFacingBack(this.mCaptureNativeHandle);
    }

    public boolean isFlashOn() {
        return nativeIsFlashOn(this.mCaptureNativeHandle);
    }

    public boolean openCamera() {
        return nativeOpenCamera(this.mCaptureNativeHandle);
    }

    public boolean setExposureCompensation(int i7) {
        return nativeSetExposureCompensation(this.mCaptureNativeHandle, i7);
    }

    public boolean setExposureRect(int i7, int i8, int i9, int i10) {
        return nativeSetExposureRect(this.mCaptureNativeHandle, i7, i8, i9, i10);
    }

    public boolean setFlashOn(boolean z6) {
        return nativeSetFlashOn(this.mCaptureNativeHandle, z6);
    }

    public boolean setFocusRect(int i7, int i8, int i9, int i10) {
        return nativeSetFocusRect(this.mCaptureNativeHandle, i7, i8, i9, i10);
    }

    public boolean setVideoStabilization(boolean z6) {
        return nativeSetVideoStabilization(this.mCaptureNativeHandle, z6);
    }

    public boolean setZoom(int i7) {
        return nativeSetZoom(this.mCaptureNativeHandle, i7);
    }

    public boolean startAutoFocus() {
        return nativeStartAutoFocus(this.mCaptureNativeHandle);
    }

    public boolean startContinuousFocus() {
        return nativeStartContinuousFocus(this.mCaptureNativeHandle);
    }

    public boolean stopAutoFocus() {
        return nativeStopAutoFocus(this.mCaptureNativeHandle);
    }

    public void switchCamera() {
        nativeSwitchCamera(this.mCaptureNativeHandle);
    }
}
