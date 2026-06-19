package com.bilibili.sponge.camera;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationManagerCompat;
import com.bilibili.opengldecoder.EmptyDecoderFactory;
import com.bilibili.opengldecoder.GLDecoder;
import com.bilibili.sponge.callback.ICamera;
import com.bilibili.sponge.callback.ICameraRawDataListener;
import com.bilibili.sponge.callback.IOpenCameraCallback;
import com.bilibili.sponge.callback.IPreviewCallback;
import com.bilibili.sponge.camera.CameraParameterConfigture;
import com.bilibili.sponge.exception.SpongeCameraAccessException;
import java.util.List;
import javax.microedition.khronos.egl.EGL10;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sponge/camera/CameraHelper.class */
public class CameraHelper {
    private static final String TAG = "CameraHelper";
    private IOpenCameraCallback iOpenCameraCallback;
    private ICamera mCameraBridge;
    private Context mContext;
    private GLDecoder mDecoder;
    private CameraParameterConfigture mParameterConfigture;
    private volatile boolean mCamera2 = false;
    private final Matrix camera_to_preview_matrix = new Matrix();
    private final Matrix preview_to_camera_matrix = new Matrix();
    private GLDecoder.GLDecoderListener mGlDecorderListener = new GLDecoder.GLDecoderListener(this) { // from class: com.bilibili.sponge.camera.CameraHelper.1
        final CameraHelper this$0;

        {
            this.this$0 = this;
        }

        @Override // com.bilibili.opengldecoder.GLDecoder.GLDecoderListener
        public void onFrameAvailable(SurfaceTexture surfaceTexture, int i7) {
            super.onFrameAvailable(surfaceTexture, i7);
        }

        @Override // com.bilibili.opengldecoder.GLDecoder.GLDecoderListener
        public void onTextureIdGenerated(int i7) {
            super.onTextureIdGenerated(i7);
            this.this$0.setTextureId(i7);
            this.this$0.mParameterConfigture.setmTexture(this.this$0.mDecoder.getSurfaceTexture());
            CameraHelper cameraHelper = this.this$0;
            cameraHelper.realOpenCamera(cameraHelper.mParameterConfigture, this.this$0.mContext);
        }
    };

    public CameraHelper(boolean z6, Context context) {
        this.mContext = context;
        initCameraBridge(z6);
        CameraCharacteristicProxy.bindCamera(this);
    }

    private void calculateCameraToPreviewMatrix(int i7, int i8) {
        int displayOrientation;
        this.camera_to_preview_matrix.reset();
        boolean zIsFrontCamera = isFrontCamera();
        float f7 = -1.0f;
        if (this.mCamera2) {
            Matrix matrix = this.camera_to_preview_matrix;
            if (!zIsFrontCamera) {
                f7 = 1.0f;
            }
            matrix.setScale(1.0f, f7);
            int displayRotationDegrees = getDisplayRotationDegrees();
            this.camera_to_preview_matrix.postRotate(((this.mCameraBridge.getOrientation() - displayRotationDegrees) + 360) % 360);
        } else {
            Matrix matrix2 = this.camera_to_preview_matrix;
            if (!zIsFrontCamera) {
                f7 = 1.0f;
            }
            matrix2.setScale(f7, 1.0f);
            try {
                displayOrientation = this.mCameraBridge.getDisplayOrientation();
            } catch (SpongeCameraAccessException e7) {
                e7.printStackTrace();
                displayOrientation = 0;
            }
            this.camera_to_preview_matrix.postRotate(displayOrientation);
        }
        float f8 = i7;
        float f9 = f8 / 2000.0f;
        float f10 = i8;
        this.camera_to_preview_matrix.postScale(f9, f10 / 2000.0f);
        this.camera_to_preview_matrix.postTranslate(f8 / 2.0f, f10 / 2.0f);
    }

    private void calculatePreviewToCameraMatrix(int i7, int i8) {
        calculateCameraToPreviewMatrix(i7, i8);
        this.camera_to_preview_matrix.invert(this.preview_to_camera_matrix);
    }

    private Rect convert2CameraCoordinate(int i7, int i8, int i9, int i10) {
        float[] fArr = {i7, i8};
        calculatePreviewToCameraMatrix(i9, i10);
        this.preview_to_camera_matrix.mapPoints(fArr);
        float f7 = fArr[0];
        float f8 = fArr[1];
        Rect rect = new Rect();
        int i11 = (int) f7;
        int i12 = i11 - 200;
        rect.left = i12;
        int i13 = i11 + 200;
        rect.right = i13;
        int i14 = (int) f8;
        int i15 = i14 - 200;
        rect.top = i15;
        int i16 = i14 + 200;
        rect.bottom = i16;
        if (i12 < -1000) {
            rect.left = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
            rect.right = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED + 400;
        } else if (i13 > 1000) {
            rect.right = 1000;
            rect.left = 1000 - 400;
        }
        if (i15 < -1000) {
            rect.top = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
            rect.bottom = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED + 400;
        } else if (i16 > 1000) {
            rect.bottom = 1000;
            rect.top = 1000 - 400;
        }
        return rect;
    }

    private void evaluateCamera2() {
        boolean zIsHardwareLevelSupported = isHardwareLevelSupported(0, true);
        boolean zIsHardwareLevelSupported2 = isHardwareLevelSupported(0, false);
        boolean z6 = false;
        if (zIsHardwareLevelSupported) {
            z6 = false;
            if (zIsHardwareLevelSupported2) {
                z6 = true;
            }
        }
        this.mCamera2 = z6;
    }

    private int getDisplayRotationDegrees() {
        int i7 = this.mParameterConfigture.getmDisplayRotation();
        int i8 = 0;
        if (i7 != 0) {
            i8 = i7 != 1 ? i7 != 2 ? i7 != 3 ? 0 : 270 : 180 : 90;
        }
        return i8;
    }

    private void initBridge() {
        if (this.mCamera2) {
            this.mCameraBridge = new Camera2Proxy();
        } else {
            this.mCameraBridge = new CameraProxy();
        }
    }

    private void initCameraBridge(boolean z6) {
        if (z6) {
            evaluateCamera2();
        }
        initBridge();
    }

    @RequiresApi(api = 21)
    private boolean isHardwareLevelSupported(int i7, boolean z6) {
        boolean z7 = false;
        try {
            CameraManager cameraManager = (CameraManager) this.mContext.getSystemService("camera");
            if (cameraManager == null) {
                return false;
            }
            int iIntValue = ((Integer) cameraManager.getCameraCharacteristics(Integer.toString(z6 ? 1 : 0)).get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue();
            if (iIntValue == 0) {
                BLog.d(TAG, "Camera has LIMITED Camera2 support");
            } else if (iIntValue == 1) {
                BLog.d(TAG, "Camera has FULL Camera2 support");
            } else if (iIntValue == 2) {
                BLog.d(TAG, "Camera has LEGACY Camera2 support");
            } else if (iIntValue == 3) {
                BLog.d(TAG, "Camera has Level 3 Camera2 support");
            } else if (iIntValue == 4) {
                BLog.d(TAG, "Camera has EXTERNAL Camera2 support");
            }
            if (iIntValue == 2) {
                boolean z8 = false;
                if (i7 == iIntValue) {
                    z8 = true;
                }
                return z8;
            }
            int i8 = iIntValue;
            if (iIntValue == 4) {
                i8 = 0;
            }
            int i9 = i7;
            if (i7 == 4) {
                i9 = 0;
            }
            if (i9 <= i8) {
                z7 = true;
            }
            return z7;
        } catch (Exception e7) {
            e7.printStackTrace();
            return false;
        }
    }

    private void openCameraInOpenGlTexture() {
        GLDecoder gLDecoder = this.mDecoder;
        if (gLDecoder != null) {
            try {
                gLDecoder.release();
            } catch (InterruptedException e7) {
                e7.printStackTrace();
            }
        }
        GLDecoder gLDecoder2 = new GLDecoder();
        this.mDecoder = gLDecoder2;
        gLDecoder2.init(EGL10.EGL_NO_CONTEXT, new EmptyDecoderFactory(), this.mGlDecorderListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void realOpenCamera(CameraParameterConfigture cameraParameterConfigture, Context context) {
        this.mCameraBridge.init(context);
        this.mCameraBridge.openCamera(cameraParameterConfigture, this.iOpenCameraCallback);
        CameraCharacteristicProxy.bindCamera(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextureId(int i7) {
        ICamera iCamera = this.mCameraBridge;
        if (iCamera != null) {
            iCamera.setTextureId(i7);
        }
    }

    public boolean cancelAutoFocus() {
        ICamera iCamera = this.mCameraBridge;
        if (iCamera == null) {
            return false;
        }
        return iCamera.cancelAutoFocus();
    }

    public void changePreviewSurface(SurfaceTexture surfaceTexture) {
        synchronized (this) {
            ICamera iCamera = this.mCameraBridge;
            if (iCamera == null) {
                return;
            }
            iCamera.changePreviewSurface(surfaceTexture);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033 A[Catch: all -> 0x0012, TRY_ENTER, TryCatch #1 {, blocks: (B:4:0x0002, B:6:0x000b, B:12:0x001c, B:14:0x0021, B:16:0x0033, B:17:0x003f, B:10:0x0017), top: B:27:0x0002, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void closeCamera() {
        /*
            r3 = this;
            r0 = r3
            monitor-enter(r0)
            r0 = r3
            com.bilibili.opengldecoder.GLDecoder r0 = r0.mDecoder     // Catch: java.lang.Throwable -> L12
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L20
            r0 = r4
            r0.release()     // Catch: java.lang.Throwable -> L12 java.lang.InterruptedException -> L16
            goto L1b
        L12:
            r4 = move-exception
            goto L45
        L16:
            r4 = move-exception
            r0 = r4
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L12
        L1b:
            r0 = r3
            r1 = 0
            r0.mDecoder = r1     // Catch: java.lang.Throwable -> L12
        L20:
            r0 = r3
            r1 = 0
            r0.mContext = r1     // Catch: java.lang.Throwable -> L12
            r0 = r3
            r1 = 0
            r0.mParameterConfigture = r1     // Catch: java.lang.Throwable -> L12
            r0 = r3
            com.bilibili.sponge.callback.ICamera r0 = r0.mCameraBridge     // Catch: java.lang.Throwable -> L12
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L3f
            r0 = r4
            int r0 = r0.releaseCamera()     // Catch: java.lang.Throwable -> L12
            r0 = r3
            r1 = 0
            r0.mCameraBridge = r1     // Catch: java.lang.Throwable -> L12
        L3f:
            com.bilibili.sponge.camera.CameraCharacteristicProxy.unbindCamera()     // Catch: java.lang.Throwable -> L12 java.lang.Throwable -> L12
            r0 = r3
            monitor-exit(r0)
            return
        L45:
            r0 = r3
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            r0 = r4
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sponge.camera.CameraHelper.closeCamera():void");
    }

    public Object getCamera() {
        ICamera iCamera = this.mCameraBridge;
        if (iCamera != null) {
            return iCamera.getCameraObject();
        }
        return null;
    }

    public int getCurrentEc() {
        ICamera iCamera = this.mCameraBridge;
        if (iCamera != null) {
            return iCamera.getCurrentExposureCompensation();
        }
        return -1;
    }

    public String getCurrentWhiteBalance() {
        ICamera iCamera = this.mCameraBridge;
        if (iCamera == null) {
            return null;
        }
        return iCamera.getCurrentWhiteBalanceMode();
    }

    public float getExposureCompensationStep() {
        ICamera iCamera = this.mCameraBridge;
        if (iCamera == null) {
            return -1.0f;
        }
        return iCamera.getExposureCompensationStep();
    }

    public int getMaxEc() {
        ICamera iCamera = this.mCameraBridge;
        if (iCamera != null) {
            return iCamera.getMaxExposureCompensation();
        }
        return -1;
    }

    public float getMaxZoomValue() {
        ICamera iCamera = this.mCameraBridge;
        if (iCamera == null) {
            return -1.0f;
        }
        return iCamera.getMaxZoomValue();
    }

    public int getMinEc() {
        ICamera iCamera = this.mCameraBridge;
        if (iCamera != null) {
            return iCamera.getMinExposureCompensation();
        }
        return -1;
    }

    public int getNumbersOfCamera() {
        ICamera iCamera = this.mCameraBridge;
        if (iCamera == null) {
            return -1;
        }
        return iCamera.getCameraAmount();
    }

    public int getOrientation() {
        ICamera iCamera = this.mCameraBridge;
        if (iCamera != null) {
            return iCamera.getOrientation();
        }
        return -1;
    }

    public CameraParameterConfigture.SpongeSize getPreviewSize() {
        ICamera iCamera = this.mCameraBridge;
        if (iCamera != null) {
            return iCamera.getPreviewSize();
        }
        return null;
    }

    public int getRealTimeOrientation() {
        ICamera iCamera = this.mCameraBridge;
        if (iCamera != null) {
            return iCamera.getRotationAngle();
        }
        return -1;
    }

    public List<CameraParameterConfigture.SpongeSize> getSupportPreviewSize() {
        ICamera iCamera = this.mCameraBridge;
        if (iCamera == null) {
            return null;
        }
        return iCamera.getSupportPreviewSize(this.mContext);
    }

    public List<String> getSupportPreviewSize(int i7, List<String> list) {
        ICamera iCamera = this.mCameraBridge;
        if (iCamera != null) {
            return iCamera.getSupportPreviewSize(i7, list);
        }
        return null;
    }

    public List<String> getSupportWhiteBalanceModes() {
        ICamera iCamera = this.mCameraBridge;
        if (iCamera == null) {
            return null;
        }
        return iCamera.getWhiteBalanceModes();
    }

    public float getVerticalViewAngle() {
        ICamera iCamera = this.mCameraBridge;
        if (iCamera != null) {
            return iCamera.getVerticalViewAngle();
        }
        return 0.0f;
    }

    public boolean getVideoStabilization() {
        ICamera iCamera = this.mCameraBridge;
        if (iCamera == null) {
            return false;
        }
        return iCamera.getVideoStabilization();
    }

    public int getZoom() {
        ICamera iCamera = this.mCameraBridge;
        if (iCamera != null) {
            return iCamera.getZoom();
        }
        return 0;
    }

    public List<Integer> getZoomRatios() {
        ICamera iCamera = this.mCameraBridge;
        if (iCamera == null) {
            return null;
        }
        return iCamera.getZoomRatios();
    }

    public boolean isFlashOn() {
        ICamera iCamera = this.mCameraBridge;
        if (iCamera != null) {
            return iCamera.isOpenFlash();
        }
        return false;
    }

    public boolean isFlipHorizontal() {
        ICamera iCamera = this.mCameraBridge;
        if (iCamera != null) {
            return iCamera.isFlipHorizontal();
        }
        return false;
    }

    public boolean isFlipVertical() {
        ICamera iCamera = this.mCameraBridge;
        if (iCamera != null) {
            return iCamera.isFlipVertical();
        }
        return false;
    }

    public boolean isFrontCamera() {
        ICamera iCamera = this.mCameraBridge;
        if (iCamera != null) {
            return iCamera.isFrontCamera();
        }
        return true;
    }

    public boolean isSupportAutoExposure() {
        ICamera iCamera = this.mCameraBridge;
        if (iCamera == null) {
            return false;
        }
        return iCamera.isSupportAutoExposure();
    }

    public boolean isSupportAutoFocus() {
        ICamera iCamera = this.mCameraBridge;
        if (iCamera == null) {
            return false;
        }
        return iCamera.isSupportAutoFocus();
    }

    public boolean isSupportContinuousFocus() {
        ICamera iCamera = this.mCameraBridge;
        if (iCamera == null) {
            return false;
        }
        return iCamera.isSupportContinuousFocus();
    }

    public boolean isSupportExposureCompensation() {
        ICamera iCamera = this.mCameraBridge;
        if (iCamera == null) {
            return false;
        }
        return iCamera.isSupportExposureCompensation();
    }

    public boolean isSupportFlash() {
        ICamera iCamera = this.mCameraBridge;
        if (iCamera == null) {
            return false;
        }
        return iCamera.isSupportFlash();
    }

    public boolean isSupportVideoStabilization() {
        ICamera iCamera = this.mCameraBridge;
        if (iCamera == null) {
            return false;
        }
        return iCamera.isSupportVideoStabilization();
    }

    public boolean isSupportZoom() {
        ICamera iCamera = this.mCameraBridge;
        if (iCamera == null) {
            return false;
        }
        return iCamera.isSupportZoom();
    }

    public void openCamera(CameraParameterConfigture cameraParameterConfigture, Context context, IOpenCameraCallback iOpenCameraCallback) {
        synchronized (this) {
            this.mContext = context;
            this.iOpenCameraCallback = iOpenCameraCallback;
            if (this.mCameraBridge == null) {
                initBridge();
            }
            this.mParameterConfigture = cameraParameterConfigture;
            if (cameraParameterConfigture.isNeedTexture()) {
                openCameraInOpenGlTexture();
            } else {
                realOpenCamera(cameraParameterConfigture, context);
            }
        }
    }

    public void registerCameraRawDataListener(ICameraRawDataListener iCameraRawDataListener) {
        ICamera iCamera = this.mCameraBridge;
        if (iCamera != null) {
            iCamera.setCameraRawDataListener(iCameraRawDataListener);
        }
    }

    public void setCameraObject(Object obj, CameraParameterConfigture cameraParameterConfigture) {
        ICamera iCamera = this.mCameraBridge;
        if (iCamera != null) {
            iCamera.setCameraObject(obj, cameraParameterConfigture);
        }
    }

    public boolean setEC(int i7) {
        ICamera iCamera = this.mCameraBridge;
        if (iCamera == null) {
            return false;
        }
        return iCamera.setExposureCompensation(i7);
    }

    public boolean setFlashMode(String str) {
        ICamera iCamera = this.mCameraBridge;
        if (iCamera == null) {
            return false;
        }
        return iCamera.setFlashMode(str);
    }

    public boolean setFocusMode(String str) {
        ICamera iCamera = this.mCameraBridge;
        if (iCamera == null) {
            return false;
        }
        return iCamera.setFocusMode(str);
    }

    public boolean setMeteringArea(int i7, int i8, int i9, int i10) {
        if (this.mCameraBridge == null) {
            return false;
        }
        return this.mCameraBridge.setMeteringArea(convert2CameraCoordinate(i7, i8, i9, i10));
    }

    public boolean setVideoStabilization(boolean z6) {
        ICamera iCamera = this.mCameraBridge;
        if (iCamera == null) {
            return false;
        }
        return iCamera.setVideoStabilization(z6);
    }

    public boolean setWhiteBalance(String str) {
        ICamera iCamera = this.mCameraBridge;
        if (iCamera == null) {
            return false;
        }
        return iCamera.setWhiteBalanceModes(str);
    }

    public boolean setZoom(int i7) {
        ICamera iCamera = this.mCameraBridge;
        if (iCamera == null) {
            return false;
        }
        return iCamera.handleZoom(i7);
    }

    public boolean startAutoFocus(int i7, int i8, int i9, int i10) {
        if (this.mCameraBridge == null) {
            return false;
        }
        return this.mCameraBridge.focusOnPoint(convert2CameraCoordinate(i7, i8, i9, i10));
    }

    public void startPreview(IPreviewCallback iPreviewCallback) {
        synchronized (this) {
            ICamera iCamera = this.mCameraBridge;
            if (iCamera != null) {
                try {
                    iCamera.startPreview();
                    iPreviewCallback.operatePreviewSuccess();
                } catch (SpongeCameraAccessException e7) {
                    e7.printStackTrace();
                    iPreviewCallback.operatePreviewFail(e7);
                }
            }
        }
    }

    public void stopPreview(IPreviewCallback iPreviewCallback) {
        synchronized (this) {
            ICamera iCamera = this.mCameraBridge;
            if (iCamera != null) {
                try {
                    iCamera.stopPreview();
                    iPreviewCallback.operatePreviewSuccess();
                } catch (SpongeCameraAccessException e7) {
                    e7.printStackTrace();
                    iPreviewCallback.operatePreviewFail(e7);
                }
            }
        }
    }

    public void switchCamera(IOpenCameraCallback iOpenCameraCallback) throws SpongeCameraAccessException {
        ICamera iCamera = this.mCameraBridge;
        if (iCamera != null) {
            iCamera.switchCamera(iOpenCameraCallback);
        }
    }
}
