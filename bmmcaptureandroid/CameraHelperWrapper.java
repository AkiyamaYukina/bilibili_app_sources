package com.bilibili.bmmcaptureandroid;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.media3.exoplayer.analytics.C4667i;
import androidx.window.core.layout.WindowSizeClass;
import com.alibaba.fastjson.JSON;
import com.bilibili.bmmcaptureandroid.BMMCaptureDevice;
import com.bilibili.bmmcaptureandroid.api.CaptureDevice;
import com.bilibili.sponge.callback.IOpenCameraCallback;
import com.bilibili.sponge.callback.IPreviewCallback;
import com.bilibili.sponge.camera.CameraParameterConfigture;
import com.bilibili.sponge.exception.SpongeCameraAccessException;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/bmmcaptureandroid/CameraHelperWrapper.class */
public class CameraHelperWrapper {
    private static final String CACHE_FIELD_CAMERA_PREVIEW_SIZES = "CameraPreviewSizes";
    private static final String CACHE_KEY_CAPTURE_ENGINE = "CaptureEngine";
    private static final int CAMERA_1080P = 1080;
    private static final String CAMERA_ERROR_TYPE_NO_PERMISSION = "NoCameraPermission";
    private static final int CAMERA_MSG_OPEN_CAMERA_FAIL = 17;
    private static final int CAMERA_MSG_OPEN_CAMERA_SUCCESS = 16;
    private static final int CAMERA_MSG_START_PREVIEW_FAIL = 19;
    private static final int CAMERA_MSG_START_PREVIEW_SUCCESS = 18;
    private static final int CAMERA_MSG_STOP_PREVIEW_FAIL = 21;
    private static final int CAMERA_MSG_STOP_PREVIEW_SUCCESS = 20;
    private static final int SURFACE_PORTRAIT = 0;
    private static final String TAG = "CameraHelperWrapper";
    private static CameraHandler mHandler;
    public static IOpenCameraCallback sOpenCameraCallback = new IOpenCameraCallback() { // from class: com.bilibili.bmmcaptureandroid.CameraHelperWrapper.1
        @Override // com.bilibili.sponge.callback.IOpenCameraCallback
        public void cameraOpenFail(SpongeCameraAccessException spongeCameraAccessException) {
            if (CameraHelperWrapper.mHandler != null) {
                Message messageObtainMessage = CameraHelperWrapper.mHandler.obtainMessage(17);
                messageObtainMessage.obj = spongeCameraAccessException;
                CameraHelperWrapper.mHandler.sendMessage(messageObtainMessage);
            }
        }

        @Override // com.bilibili.sponge.callback.IOpenCameraCallback
        public void cameraOpenSuccess(Object obj) {
            if (CameraHelperWrapper.mHandler != null) {
                CameraHelperWrapper.mHandler.sendEmptyMessage(16);
            }
        }
    };
    public static IPreviewCallback sStartPreviewCallback = new IPreviewCallback() { // from class: com.bilibili.bmmcaptureandroid.CameraHelperWrapper.2
        @Override // com.bilibili.sponge.callback.IPreviewCallback
        public void operatePreviewFail(SpongeCameraAccessException spongeCameraAccessException) {
            if (CameraHelperWrapper.mHandler != null) {
                Message messageObtainMessage = CameraHelperWrapper.mHandler.obtainMessage(19);
                messageObtainMessage.obj = spongeCameraAccessException;
                CameraHelperWrapper.mHandler.sendMessage(messageObtainMessage);
            }
        }

        @Override // com.bilibili.sponge.callback.IPreviewCallback
        public void operatePreviewSuccess() {
            if (CameraHelperWrapper.mHandler != null) {
                CameraHelperWrapper.mHandler.sendEmptyMessage(18);
            }
        }
    };
    public static IPreviewCallback sStopPreviewCallback = new IPreviewCallback() { // from class: com.bilibili.bmmcaptureandroid.CameraHelperWrapper.3
        @Override // com.bilibili.sponge.callback.IPreviewCallback
        public void operatePreviewFail(SpongeCameraAccessException spongeCameraAccessException) {
            if (CameraHelperWrapper.mHandler != null) {
                Message messageObtainMessage = CameraHelperWrapper.mHandler.obtainMessage(21);
                messageObtainMessage.obj = spongeCameraAccessException;
                CameraHelperWrapper.mHandler.sendMessage(messageObtainMessage);
            }
        }

        @Override // com.bilibili.sponge.callback.IPreviewCallback
        public void operatePreviewSuccess() {
            if (CameraHelperWrapper.mHandler != null) {
                CameraHelperWrapper.mHandler.sendEmptyMessage(20);
            }
        }
    };
    private int mCameraID;
    private BMMCaptureDevice mCaptureDevice;
    private CaptureDevice.CaptureDeviceCallback mCaptureDeviceCallback;
    private int mCurrentPreviewSizeIndex;
    private List<CameraParameterConfigture.SpongeSize> mDetectSupportedPreviewSizes;
    private int mImageHeight;
    private int mImageWidth;
    private List<CameraParameterConfigture.SpongeSize> mSupportedPreviewSizes;
    private int mSurfaceOrientation = 0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/bmmcaptureandroid/CameraHelperWrapper$Cache.class */
    public static class Cache implements Serializable {
        ArrayList<Size> cameraPreviewSizes = new ArrayList<>();

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/bmmcaptureandroid/CameraHelperWrapper$Cache$Size.class */
        public static class Size implements Serializable {
            public int height;
            public int width;

            public Size() {
            }

            public Size(int i7, int i8) {
                this.width = i7;
                this.height = i8;
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/bmmcaptureandroid/CameraHelperWrapper$CameraHandler.class */
    public static class CameraHandler extends Handler {
        private WeakReference<CameraHelperWrapper> weakReference;

        public CameraHandler(CameraHelperWrapper cameraHelperWrapper) {
            this.weakReference = new WeakReference<>(cameraHelperWrapper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            super.handleMessage(message);
            CameraHelperWrapper cameraHelperWrapper = this.weakReference.get();
            if (cameraHelperWrapper != null) {
                cameraHelperWrapper.handleMessage(message);
            }
        }
    }

    public CameraHelperWrapper(Context context, BMMCaptureDevice bMMCaptureDevice, int i7, int i8, Map<String, Object> map) {
        this.mCameraID = i7;
        this.mCaptureDevice = bMMCaptureDevice;
        mHandler = new CameraHandler(this);
        ArrayList arrayList = new ArrayList();
        this.mDetectSupportedPreviewSizes = arrayList;
        arrayList.add(new CameraParameterConfigture.SpongeSize(640, WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND));
        this.mDetectSupportedPreviewSizes.add(new CameraParameterConfigture.SpongeSize(1280, 720));
        this.mDetectSupportedPreviewSizes.add(new CameraParameterConfigture.SpongeSize(1920, CAMERA_1080P));
        if (map == null || !map.containsKey("Camera")) {
            initSupportPreviewSize(context);
            changeCurrentPreviewSize(i8);
        }
        this.mCaptureDeviceCallback = null;
    }

    private void changeCurrentPreviewSize(int i7) {
        this.mCurrentPreviewSizeIndex = i7;
        CameraParameterConfigture.SpongeSize previewSize = getPreviewSize(i7);
        if (previewSize != null) {
            if (this.mSurfaceOrientation == 0) {
                this.mImageHeight = previewSize.getWidth();
                this.mImageWidth = previewSize.getHeight();
            } else {
                this.mImageWidth = previewSize.getWidth();
                this.mImageHeight = previewSize.getHeight();
            }
        }
    }

    private CameraParameterConfigture.SpongeSize getPreviewSize(int i7) {
        if (this.mSupportedPreviewSizes.size() == 0) {
            return null;
        }
        return i7 >= this.mSupportedPreviewSizes.size() ? (CameraParameterConfigture.SpongeSize) C4667i.a(1, this.mSupportedPreviewSizes) : this.mSupportedPreviewSizes.get(i7);
    }

    private int getTargetPreviewIndex() {
        return Math.min(this.mImageWidth, this.mImageHeight) == CAMERA_1080P ? 2 : 1;
    }

    private boolean initSupportPreviewSize(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(CACHE_KEY_CAPTURE_ENGINE, 0);
        String string = sharedPreferences.getString(CACHE_FIELD_CAMERA_PREVIEW_SIZES, "");
        if (string.isEmpty()) {
            return queryCameraPreviewSize(sharedPreferences);
        }
        try {
            List<Cache.Size> array = JSON.parseArray(string, Cache.Size.class);
            if (array.size() == 0) {
                return queryCameraPreviewSize(sharedPreferences);
            }
            this.mSupportedPreviewSizes = new ArrayList();
            for (Cache.Size size : array) {
                this.mSupportedPreviewSizes.add(new CameraParameterConfigture.SpongeSize(size.width, size.height));
            }
            return true;
        } catch (Exception e7) {
            BLog.e(TAG, "Failed to decode camera preview sizes");
            return queryCameraPreviewSize(sharedPreferences);
        }
    }

    private boolean isCameraAvailable() {
        int currentStatus = this.mCaptureDevice.getCurrentStatus();
        return (currentStatus == 0 || currentStatus == 4) ? false : true;
    }

    private boolean queryCameraPreviewSize(SharedPreferences sharedPreferences) {
        this.mSupportedPreviewSizes = new ArrayList();
        Cache cache = new Cache();
        List<CameraParameterConfigture.SpongeSize> supportPreviewSize = this.mCaptureDevice.getSupportPreviewSize();
        if (supportPreviewSize != null) {
            for (CameraParameterConfigture.SpongeSize spongeSize : supportPreviewSize) {
                BLog.d(TAG, "previewSizes: " + spongeSize.getHeight() + ", wi " + spongeSize.getWidth());
                Iterator<CameraParameterConfigture.SpongeSize> it = this.mDetectSupportedPreviewSizes.iterator();
                while (it.hasNext()) {
                    if (spongeSize.equals(it.next())) {
                        this.mSupportedPreviewSizes.add(spongeSize);
                        cache.cameraPreviewSizes.add(new Cache.Size(spongeSize.getWidth(), spongeSize.getHeight()));
                    }
                }
            }
        }
        Collections.sort(this.mSupportedPreviewSizes);
        if (this.mSupportedPreviewSizes.size() != 0) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString(CACHE_FIELD_CAMERA_PREVIEW_SIZES, JSON.toJSONString(cache.cameraPreviewSizes));
            editorEdit.apply();
            return true;
        }
        BLog.e(TAG, "SupportedPreviewSize is empty");
        CaptureDevice.CaptureDeviceCallback captureDeviceCallback = this.mCaptureDeviceCallback;
        if (captureDeviceCallback == null) {
            return false;
        }
        captureDeviceCallback.onCaptureDeviceError(this.mCameraID, 0, "this device doesn't support " + this.mDetectSupportedPreviewSizes);
        return false;
    }

    public void cancelAutoFocus() {
        if (isCameraAvailable()) {
            this.mCaptureDevice.stopAutoFocus();
        }
    }

    public void changePreviewSize(int i7) {
        changeCurrentPreviewSize(i7);
        this.mCaptureDevice.changeResolutionGrade(getTargetPreviewIndex());
    }

    public int getCurrentEc() {
        return this.mCaptureDevice.getCurExposureCompensation();
    }

    public BMMCaptureDevice.DeviceAbility getDeviceCapability() {
        return this.mCaptureDevice.getDeviceAbility();
    }

    public float getExposureCompensationStep() {
        return this.mCaptureDevice.getExposureCompensationStep();
    }

    public int getImageHeight() {
        return this.mImageHeight;
    }

    public int getImageWidth() {
        return this.mImageWidth;
    }

    public int getMaxEc() {
        return this.mCaptureDevice.getMaxExposureCompensation();
    }

    public int getMinEc() {
        return this.mCaptureDevice.getMinExposureCompensation();
    }

    public int getNumbersOfCamera() {
        return this.mCaptureDevice.getDeviceCount();
    }

    public boolean getOpenFrontCamera() {
        return this.mCameraID == 2;
    }

    public int getPreviewGrade() {
        return this.mCaptureDevice.getPreviewGrade();
    }

    public boolean getVideoStabilization() {
        if (isCameraAvailable()) {
            return this.mCaptureDevice.getVideoStabilization();
        }
        return false;
    }

    public int getZoom() {
        return this.mCaptureDevice.getZoom();
    }

    public void handleMessage(Message message) {
        CaptureDevice.CaptureDeviceCallback captureDeviceCallback;
        switch (message.what) {
            case 16:
                CaptureDevice.CaptureDeviceCallback captureDeviceCallback2 = this.mCaptureDeviceCallback;
                if (captureDeviceCallback2 != null) {
                    captureDeviceCallback2.onCaptureDeviceStatus(0, this.mCameraID);
                }
                break;
            case 17:
                if (((SpongeCameraAccessException) message.obj).getType().equals(CAMERA_ERROR_TYPE_NO_PERMISSION) && (captureDeviceCallback = this.mCaptureDeviceCallback) != null) {
                    captureDeviceCallback.onCaptureDeviceError(this.mCameraID, -3, "attention ！! no camera permission");
                    break;
                }
                break;
            case 18:
                CaptureDevice.CaptureDeviceCallback captureDeviceCallback3 = this.mCaptureDeviceCallback;
                if (captureDeviceCallback3 != null) {
                    captureDeviceCallback3.onCaptureDeviceStatus(1, this.mCameraID);
                }
                break;
            case 19:
                BLog.w(TAG, "handleMessage: start preview fail");
                break;
            case 20:
                CaptureDevice.CaptureDeviceCallback captureDeviceCallback4 = this.mCaptureDeviceCallback;
                if (captureDeviceCallback4 != null) {
                    captureDeviceCallback4.onCaptureDeviceStatus(2, this.mCameraID);
                }
                break;
            case 21:
                BLog.w(TAG, "handleMessage: stop preview fail");
                break;
        }
    }

    public boolean isFlashOn() {
        return this.mCaptureDevice.isFlashOn();
    }

    public void release() {
        this.mCaptureDeviceCallback = null;
        mHandler = null;
    }

    public void setCaptureDeviceCallback(CaptureDevice.CaptureDeviceCallback captureDeviceCallback) {
        this.mCaptureDeviceCallback = captureDeviceCallback;
    }

    public void setExposureCompensation(int i7) {
        if (isCameraAvailable()) {
            this.mCaptureDevice.setExposureCompensation(i7);
        }
    }

    public void setFlashMode(String str) {
        if (isCameraAvailable()) {
            if (CameraParameterConfigture.CAMERA_PARAM_FLASH_MODE_CLOSE.equals(str)) {
                this.mCaptureDevice.setFlashOn(false);
            } else if (CameraParameterConfigture.CAMERA_PARAM_FLASH_MODE_TORCH.equals(str)) {
                this.mCaptureDevice.setFlashOn(true);
            }
        }
    }

    public void setFocusArea(int i7, int i8, int i9, int i10) {
        if (isCameraAvailable()) {
            this.mCaptureDevice.setFocusRect(i7, i8, i9, i10);
        }
    }

    public void setMeteringArea(int i7, int i8, int i9, int i10) {
        if (isCameraAvailable()) {
            this.mCaptureDevice.setExposureRect(i7, i8, i9, i10);
        }
    }

    public void setVideoStabilization(boolean z6) {
        if (isCameraAvailable()) {
            this.mCaptureDevice.setVideoStabilization(z6);
        }
    }

    public void setZoom(int i7) {
        if (isCameraAvailable()) {
            this.mCaptureDevice.setZoom(i7);
        }
    }

    public void startAutoFocus() {
        if (isCameraAvailable()) {
            this.mCaptureDevice.startAutoFocus();
        }
    }

    public void startContinuousFocus() {
        if (isCameraAvailable()) {
            this.mCaptureDevice.startContinuousFocus();
        }
    }

    public void switchCamera() {
        this.mCameraID ^= 3;
        this.mCaptureDevice.switchCamera();
    }

    public void switchCamera(int i7) {
        int devicePosition = this.mCaptureDevice.getDevicePosition();
        this.mCameraID = devicePosition;
        if (i7 == devicePosition) {
            return;
        }
        switchCamera();
    }
}
