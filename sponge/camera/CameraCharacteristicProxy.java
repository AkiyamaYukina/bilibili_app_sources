package com.bilibili.sponge.camera;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sponge/camera/CameraCharacteristicProxy.class */
public class CameraCharacteristicProxy {
    private static CameraHelper cameraHelper;

    public static void bindCamera(CameraHelper cameraHelper2) {
        cameraHelper = cameraHelper2;
    }

    public static float getExposureCompensationStep() {
        CameraHelper cameraHelper2 = cameraHelper;
        if (cameraHelper2 == null) {
            return -1.0f;
        }
        return cameraHelper2.getExposureCompensationStep();
    }

    public static int getMaxEc() {
        CameraHelper cameraHelper2 = cameraHelper;
        if (cameraHelper2 == null) {
            return -1;
        }
        return cameraHelper2.getMaxEc();
    }

    public static int getMinEc() {
        CameraHelper cameraHelper2 = cameraHelper;
        if (cameraHelper2 == null) {
            return -1;
        }
        return cameraHelper2.getMinEc();
    }

    public static int getOrientation() {
        CameraHelper cameraHelper2 = cameraHelper;
        if (cameraHelper2 == null) {
            return -1;
        }
        return cameraHelper2.getOrientation();
    }

    public static float getVerticalViewAngle() {
        CameraHelper cameraHelper2 = cameraHelper;
        if (cameraHelper2 == null) {
            return -1.0f;
        }
        return cameraHelper2.getVerticalViewAngle();
    }

    public static boolean getVideoStabilization() {
        CameraHelper cameraHelper2 = cameraHelper;
        if (cameraHelper2 == null) {
            return false;
        }
        return cameraHelper2.getVideoStabilization();
    }

    public static boolean isFlashOn() {
        CameraHelper cameraHelper2 = cameraHelper;
        if (cameraHelper2 == null) {
            return false;
        }
        return cameraHelper2.isFlashOn();
    }

    public static boolean isFlipHorizontal() {
        CameraHelper cameraHelper2 = cameraHelper;
        if (cameraHelper2 == null) {
            return false;
        }
        return cameraHelper2.isFlipHorizontal();
    }

    public static boolean isFlipVertical() {
        CameraHelper cameraHelper2 = cameraHelper;
        if (cameraHelper2 == null) {
            return false;
        }
        return cameraHelper2.isFlipVertical();
    }

    public static boolean isFrontCamera() {
        CameraHelper cameraHelper2 = cameraHelper;
        if (cameraHelper2 == null) {
            return true;
        }
        return cameraHelper2.isFrontCamera();
    }

    public static boolean isSupportAutoExposure() {
        CameraHelper cameraHelper2 = cameraHelper;
        if (cameraHelper2 == null) {
            return false;
        }
        return cameraHelper2.isSupportAutoExposure();
    }

    public static boolean isSupportAutoFocus() {
        CameraHelper cameraHelper2 = cameraHelper;
        if (cameraHelper2 == null) {
            return false;
        }
        return cameraHelper2.isSupportAutoFocus();
    }

    public static boolean isSupportContinuousFocus() {
        CameraHelper cameraHelper2 = cameraHelper;
        if (cameraHelper2 == null) {
            return false;
        }
        return cameraHelper2.isSupportContinuousFocus();
    }

    public static boolean isSupportExposureCompensation() {
        CameraHelper cameraHelper2 = cameraHelper;
        if (cameraHelper2 == null) {
            return false;
        }
        return cameraHelper2.isSupportExposureCompensation();
    }

    public static boolean isSupportFlash() {
        CameraHelper cameraHelper2 = cameraHelper;
        if (cameraHelper2 == null) {
            return false;
        }
        return cameraHelper2.isSupportFlash();
    }

    public static boolean isSupportVideoStabilization() {
        CameraHelper cameraHelper2 = cameraHelper;
        if (cameraHelper2 == null) {
            return false;
        }
        return cameraHelper2.isSupportVideoStabilization();
    }

    public static boolean isSupportZoom() {
        CameraHelper cameraHelper2 = cameraHelper;
        if (cameraHelper2 == null) {
            return false;
        }
        return cameraHelper2.isSupportZoom();
    }

    public static void unbindCamera() {
        cameraHelper = null;
    }
}
