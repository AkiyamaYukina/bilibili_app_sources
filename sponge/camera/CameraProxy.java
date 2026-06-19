package com.bilibili.sponge.camera;

import T9.e;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.text.TextUtils;
import android.view.OrientationEventListener;
import android.view.SurfaceHolder;
import androidx.appcompat.widget.C3246j;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.category.Z;
import com.bilibili.ad.adview.videodetail.pausedpage.brand.base.b;
import com.bilibili.biligame.utils.B;
import com.bilibili.sponge.callback.ICamera;
import com.bilibili.sponge.callback.ICameraRawDataListener;
import com.bilibili.sponge.callback.IOpenCameraCallback;
import com.bilibili.sponge.camera.CameraParameterConfigture;
import com.bilibili.sponge.exception.SpongeCameraAccessException;
import defpackage.a;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import q4.C8397q;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sponge/camera/CameraProxy.class */
public class CameraProxy implements Camera.PreviewCallback, Camera.AutoFocusCallback, ICamera {
    private static final int BUFFER_SIZE = 5;
    private static final String CAMERA_ERROR_TYPE_NO_PERMISSION = "NoCameraPermission";
    private static final String CAMERA_ERROR_TYPE_RUNTIME_EXCEPTION = "RuntimeException";
    private static volatile CameraProxy CAMERA_PROXY_INSTANCE;
    private static final int DEFAULT_WEIGHT = 1000;
    private static final String TAG = "CameraProxy";
    private float exposureCompensationStep;
    private ICameraRawDataListener mCameraAvailableListener;
    private Camera.CameraInfo mCameraInfo;
    private Camera.Parameters mCameraParameters;
    private CameraParameterConfigture mConfigture;
    private int mDisplayOrientation;
    private int mDisplayRotation;
    private IOpenCameraCallback mOpenCameraListener;
    private OrientationEventListener mOrientationEventListener;
    private SurfaceTexture mSurfaceTexture;
    private int mTextureId;
    private int maxExposureCompensation;
    private float maxZoomValue;
    private int minExposureCompensation;
    private volatile boolean opened;
    private boolean supportAutoExposure;
    private boolean supportAutoFocus;
    private boolean supportContinuousFocus;
    private boolean supportFlash;
    private boolean supportVideoStabilization;
    private boolean supportZoom;
    private List<Integer> zoomRatios;
    private Camera mCamera = null;
    private int mCameraId = 1;
    private boolean isFrontCamera = false;
    private int mPreviewWidth = 1440;
    private int mPreviewHeight = 1080;
    private float mPreviewScale = (1080 * 1.0f) / 1440;
    private int fps = 30;
    private String flashMode = "off";
    private boolean isOpenFlash = false;
    private String focusMode = "continuous-video";
    private int mExposureCompensation = 0;
    private int mZoom = 0;
    private boolean supportExposureCompensation = true;
    private int mNewsRotationAngle = 0;

    private CameraParameterConfigture.RawFrameData generateFrameData(byte[] bArr) {
        CameraParameterConfigture.RawFrameData rawFrameData = new CameraParameterConfigture.RawFrameData();
        rawFrameData.setmData(bArr);
        rawFrameData.setmType(16);
        rawFrameData.setTimestamp(System.currentTimeMillis());
        rawFrameData.setRotation(this.mNewsRotationAngle);
        rawFrameData.setIsFront(this.isFrontCamera);
        rawFrameData.setWidth(this.mPreviewWidth);
        rawFrameData.setHeight(this.mPreviewHeight);
        if (this.mConfigture.isNeedTexture()) {
            rawFrameData.setTextureId(this.mTextureId);
        }
        return rawFrameData;
    }

    private Camera getCamera(int i7) {
        Camera cameraOpen;
        synchronized (this) {
            this.opened = false;
            if (i7 != this.mCameraId) {
                try {
                    cameraOpen = Camera.open(i7);
                } catch (RuntimeException e7) {
                    e7.printStackTrace();
                    cameraOpen = null;
                }
            } else if (this.mCamera == null) {
                try {
                    cameraOpen = Camera.open(i7);
                } catch (RuntimeException e8) {
                    e8.printStackTrace();
                    cameraOpen = null;
                }
            } else {
                this.opened = true;
                cameraOpen = this.mCamera;
            }
        }
        return cameraOpen;
    }

    private void getCameraCapability() {
        this.supportZoom = this.mCameraParameters.isZoomSupported();
        this.supportVideoStabilization = this.mCameraParameters.isVideoStabilizationSupported();
        this.zoomRatios = this.mCameraParameters.getZoomRatios();
        this.maxZoomValue = this.mCameraParameters.getMaxZoom();
        this.minExposureCompensation = this.mCameraParameters.getMinExposureCompensation();
        int maxExposureCompensation = this.mCameraParameters.getMaxExposureCompensation();
        this.maxExposureCompensation = maxExposureCompensation;
        if (this.minExposureCompensation == 0 && maxExposureCompensation == 0) {
            this.supportExposureCompensation = false;
        }
        this.supportAutoExposure = this.mCameraParameters.isAutoExposureLockSupported();
        this.exposureCompensationStep = this.mCameraParameters.getExposureCompensationStep();
    }

    private List<CameraParameterConfigture.SpongeSize> getListIntersection(List<CameraParameterConfigture.SpongeSize> list, List<CameraParameterConfigture.SpongeSize> list2) {
        ArrayList arrayList = new ArrayList();
        if (list != null && list2 != null) {
            int size = list.size();
            int size2 = list2.size();
            for (int i7 = 0; i7 < size; i7++) {
                CameraParameterConfigture.SpongeSize spongeSize = list.get(i7);
                int i8 = 0;
                while (true) {
                    if (i8 < size2) {
                        CameraParameterConfigture.SpongeSize spongeSize2 = list2.get(i8);
                        if (spongeSize2.equals(spongeSize)) {
                            arrayList.add(spongeSize2);
                            break;
                        }
                        i8++;
                    }
                }
            }
        }
        return arrayList;
    }

    private Camera.Size getSuitableSize(List<Camera.Size> list) {
        int i7 = Integer.MAX_VALUE;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int i10 = i9;
            if (i8 >= list.size()) {
                return list.get(i10);
            }
            Camera.Size size = list.get(i8);
            BLog.v(TAG, "SupportedSize, width: " + size.width + ", height: " + size.height);
            StringBuilder sb = new StringBuilder("mPreviewScale = ");
            sb.append(this.mPreviewScale);
            BLog.v(TAG, sb.toString());
            int i11 = size.width;
            int i12 = i7;
            int i13 = i10;
            if (i11 * this.mPreviewScale == size.height) {
                int iAbs = Math.abs(this.mPreviewWidth - i11);
                if (iAbs == 0) {
                    return size;
                }
                i12 = i7;
                i13 = i10;
                if (i7 > iAbs) {
                    i13 = i8;
                    i12 = iAbs;
                }
            }
            i8++;
            i7 = i12;
            i9 = i13;
        }
    }

    private List<CameraParameterConfigture.SpongeSize> getSupportPreviewSize(int i7) {
        Camera camera = getCamera(i7);
        if (camera == null) {
            return null;
        }
        List<Camera.Size> supportedPreviewSizes = camera.getParameters().getSupportedPreviewSizes();
        if (!this.opened) {
            camera.release();
        }
        ArrayList arrayList = new ArrayList();
        for (Camera.Size size : supportedPreviewSizes) {
            CameraParameterConfigture.SpongeSize spongeSize = new CameraParameterConfigture.SpongeSize();
            spongeSize.width = size.width;
            spongeSize.height = size.height;
            arrayList.add(spongeSize);
        }
        return arrayList;
    }

    private String handleParamFlashMode(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            this.isOpenFlash = false;
            return "off";
        }
        str.getClass();
        switch (str) {
            case "flash_mode_auto":
                this.isOpenFlash = false;
                str2 = "auto";
                break;
            case "flash_mode_open":
                this.isOpenFlash = true;
                str2 = "on";
                break;
            case "flash_mode_torch":
                this.isOpenFlash = true;
                str2 = "torch";
                break;
            default:
                this.isOpenFlash = false;
                str2 = "off";
                break;
        }
        return str2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private String handleParamFocusMode(String str) {
        if (TextUtils.isEmpty(str)) {
            return "continuous-video";
        }
        str.getClass();
        byte b7 = -1;
        switch (str.hashCode()) {
            case -1897460700:
                if (str.equals(CameraParameterConfigture.CAMERA_PARAM_FOCUS_MODE_AUTO)) {
                    b7 = 0;
                }
                break;
            case -783302565:
                if (str.equals(CameraParameterConfigture.CAMERA_PARAM_FOCUS_MODE_CONTINUE_PICTURE)) {
                    b7 = 1;
                }
                break;
            case -759518440:
                if (str.equals(CameraParameterConfigture.CAMERA_PARAM_FOCUS_MODE_CONTINUE_VIDEO)) {
                    b7 = 2;
                }
                break;
        }
        String str2 = "continuous-video";
        switch (b7) {
            case 0:
                str2 = "auto";
                break;
            case 1:
                str2 = "continuous-picture";
                break;
            case 2:
                break;
            default:
                str2 = "continuous-video";
                break;
        }
        return str2;
    }

    private boolean hasCameraPermission(int i7) {
        boolean zBooleanValue;
        try {
            Camera cameraOpen = Camera.open(i7);
            this.mCamera = cameraOpen;
            if (cameraOpen == null) {
                BLog.e(TAG, "Camera.open error, camera is null");
                return false;
            }
            try {
                if (cameraOpen.getParameters() == null) {
                    BLog.e(TAG, "Camera.getParameters error, parameters is null");
                    return false;
                }
                try {
                    Field declaredField = this.mCamera.getClass().getDeclaredField("mHasPermission");
                    declaredField.setAccessible(true);
                    zBooleanValue = ((Boolean) declaredField.get(this.mCamera)).booleanValue();
                } catch (Exception e7) {
                    zBooleanValue = true;
                }
                e.a("hasCameraPermission:  hasPermission = ", TAG, zBooleanValue);
                return zBooleanValue;
            } catch (Exception e8) {
                C8397q.a("Camera.getParameters error: e = ", TAG, e8);
                return false;
            }
        } catch (Exception e9) {
            C8397q.a("Camera.open error: e = ", TAG, e9);
            return false;
        }
    }

    private void initCameraParameter() {
        setFlashAndFocusMode();
        getCameraCapability();
        this.mCameraParameters.setPreviewFormat(17);
        this.mCameraParameters.setPictureFormat(256);
        this.mCameraParameters.setExposureCompensation(this.mExposureCompensation);
        Camera.Size suitableSize = getSuitableSize(this.mCameraParameters.getSupportedPreviewSizes());
        int i7 = suitableSize.width;
        this.mPreviewWidth = i7;
        int i8 = suitableSize.height;
        this.mPreviewHeight = i8;
        this.mCameraParameters.setPreviewSize(i7, i8);
        StringBuilder sb = new StringBuilder("previewWidth: ");
        sb.append(this.mPreviewWidth);
        sb.append(", previewHeight: ");
        b.b(this.mPreviewHeight, TAG, sb);
        Camera.Size suitableSize2 = getSuitableSize(this.mCameraParameters.getSupportedPictureSizes());
        this.mCameraParameters.setPictureSize(suitableSize2.width, suitableSize2.height);
        StringBuilder sb2 = new StringBuilder("pictureWidth: ");
        sb2.append(suitableSize2.width);
        sb2.append(", pictureHeight: ");
        b.b(suitableSize2.height, TAG, sb2);
        setCameraFps(this.mCameraParameters, this.fps);
        try {
            this.mCamera.setParameters(this.mCameraParameters);
        } catch (Exception e7) {
            e7.printStackTrace();
        }
        setDisplayOrientation();
        for (int i9 = 0; i9 < 5; i9++) {
            this.mCamera.addCallbackBuffer(new byte[((this.mPreviewWidth * this.mPreviewHeight) * 3) / 2]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onOrientationChange(int i7) {
        if (i7 == -1) {
            return;
        }
        int i8 = ((i7 + 45) / 90) * 90;
        Camera.CameraInfo cameraInfo = this.mCameraInfo;
        this.mNewsRotationAngle = cameraInfo.facing == 1 ? ((cameraInfo.orientation - i8) + 360) % 360 : (cameraInfo.orientation + i8) % 360;
    }

    private void preCameraParameter(CameraParameterConfigture cameraParameterConfigture) {
        this.fps = cameraParameterConfigture.getFps();
        CameraParameterConfigture.SpongeSize spongeSize = cameraParameterConfigture.getmPreviewSize();
        if (spongeSize != null) {
            this.mPreviewWidth = spongeSize.getWidth();
            int height = spongeSize.getHeight();
            this.mPreviewHeight = height;
            this.mPreviewScale = (height * 1.0f) / this.mPreviewWidth;
        }
        boolean zIsFrontCamera = cameraParameterConfigture.isFrontCamera();
        this.isFrontCamera = zIsFrontCamera;
        if (zIsFrontCamera) {
            this.mCameraId = 1;
        } else {
            this.mCameraId = 0;
        }
        this.flashMode = handleParamFlashMode(cameraParameterConfigture.getFlashMode());
        this.focusMode = handleParamFocusMode(cameraParameterConfigture.getFocusMode());
        if (cameraParameterConfigture.getmTexture() != null) {
            this.mSurfaceTexture = cameraParameterConfigture.getmTexture();
        }
        setCameraRawDataListener(cameraParameterConfigture.getFrameRawDataListener());
        this.mDisplayRotation = cameraParameterConfigture.getmDisplayRotation();
    }

    private void setCameraFps(Camera.Parameters parameters, int i7) {
        int i8;
        int i9;
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        int size = supportedPreviewFpsRange.size();
        supportedPreviewFpsRange.get(0);
        int i10 = i7 * 1000;
        int i11 = Integer.MAX_VALUE;
        int i12 = 0;
        boolean z6 = false;
        int i13 = 0;
        while (true) {
            i8 = i13;
            if (i12 >= size) {
                break;
            }
            int[] iArr = supportedPreviewFpsRange.get(i12);
            BLog.d(TAG, "camera PFS[" + iArr[0] + " " + iArr[1] + "]");
            int i14 = i11;
            boolean z7 = z6;
            int i15 = i8;
            if (i10 == iArr[1]) {
                int i16 = iArr[0];
                int i17 = i11;
                if (i16 < i11) {
                    i8 = i12;
                    i17 = i16;
                }
                z7 = true;
                i15 = i8;
                i14 = i17;
            }
            i12++;
            i11 = i14;
            z6 = z7;
            i13 = i15;
        }
        int i18 = 0;
        while (true) {
            i9 = i8;
            if (i18 >= size) {
                break;
            }
            i9 = i8;
            if (!z6) {
                int[] iArr2 = supportedPreviewFpsRange.get(i18);
                BLog.d(TAG, "camera PFS[" + iArr2[0] + " " + iArr2[1] + "]");
                if (i10 >= iArr2[0] && i10 <= iArr2[1]) {
                    BLog.d(TAG, "Found variable fps range, use it");
                    i9 = i18;
                    break;
                }
                i18++;
            } else {
                break;
            }
        }
        if (!z6) {
            BLog.d(TAG, "Use first FPS range");
            i9 = 0;
        }
        int[] iArr3 = supportedPreviewFpsRange.get(i9);
        try {
            parameters.setPreviewFpsRange(iArr3[0], iArr3[1]);
        } catch (RuntimeException e7) {
            e7.printStackTrace();
            int i19 = iArr3[0] + 1000;
            iArr3[0] = i19;
            parameters.setPreviewFpsRange(i19, iArr3[1]);
        }
        BLog.d(TAG, "Set camera PFS[" + iArr3[0] + " " + iArr3[1] + "]");
    }

    private void setDisplayOrientation() {
        int i7 = this.mDisplayRotation;
        int i8 = 0;
        if (i7 != 0) {
            i8 = i7 != 1 ? i7 != 2 ? i7 != 3 ? 0 : 270 : 180 : 90;
        }
        Camera.CameraInfo cameraInfo = this.mCameraInfo;
        int i9 = cameraInfo.facing == 1 ? (360 - ((cameraInfo.orientation + i8) % 360)) % 360 : ((cameraInfo.orientation - i8) + 360) % 360;
        this.mDisplayOrientation = i9;
        try {
            this.mCamera.setDisplayOrientation(i9);
        } catch (RuntimeException e7) {
            BLog.e(TAG, "setDisplayOrientation error; error msg :" + e7.getLocalizedMessage());
        }
    }

    private void setFlashAndFocusMode() {
        List<String> supportedFlashModes = this.mCameraParameters.getSupportedFlashModes();
        if (supportedFlashModes != null && supportedFlashModes.contains("off")) {
            this.supportFlash = true;
            this.mCameraParameters.setFlashMode(this.flashMode);
        }
        List<String> supportedFocusModes = this.mCameraParameters.getSupportedFocusModes();
        if (supportedFocusModes == null || !supportedFocusModes.contains("auto")) {
            return;
        }
        this.supportAutoFocus = true;
        if (supportedFocusModes.contains("continuous-video") || supportedFocusModes.contains("continuous-picture")) {
            this.supportContinuousFocus = true;
        }
        this.mCameraParameters.setFocusMode(this.focusMode);
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public boolean cancelAutoFocus() {
        Camera camera = this.mCamera;
        if (camera == null || !this.supportAutoFocus) {
            return false;
        }
        try {
            camera.cancelAutoFocus();
            Camera.Parameters parameters = this.mCamera.getParameters();
            parameters.setFocusAreas(null);
            this.mCamera.setParameters(parameters);
            return true;
        } catch (RuntimeException e7) {
            e7.printStackTrace();
            return false;
        }
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public void changePreviewSurface(SurfaceTexture surfaceTexture) {
        try {
            stopPreview();
            this.mSurfaceTexture = surfaceTexture;
            startPreview();
        } catch (SpongeCameraAccessException e7) {
            BLog.w(TAG, "changePreviewSurface exception", e7);
        }
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public boolean focusOnPoint(Rect rect) {
        Camera.Parameters parameters;
        int maxNumFocusAreas;
        StringBuilder sb = new StringBuilder("touch point (");
        sb.append(rect.left);
        sb.append(", ");
        sb.append(rect.top);
        sb.append(")--");
        sb.append(rect.right);
        sb.append("--");
        b.b(rect.bottom, TAG, sb);
        Camera camera = this.mCamera;
        if (camera == null) {
            return false;
        }
        try {
            parameters = camera.getParameters();
        } catch (Exception e7) {
            e = e7;
            parameters = null;
        }
        try {
            maxNumFocusAreas = parameters.getMaxNumFocusAreas();
        } catch (Exception e8) {
            e = e8;
            BLog.e(TAG, "focusOnPoint crash， e.getLocalizedMessage():" + e.getLocalizedMessage());
            e.printStackTrace();
            maxNumFocusAreas = 0;
        }
        if (maxNumFocusAreas <= 0) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Camera.Area(rect, 1000));
        try {
            parameters.setFocusMode("auto");
            parameters.setFocusAreas(arrayList);
            this.mCamera.cancelAutoFocus();
            this.mCamera.setParameters(parameters);
            this.mCamera.autoFocus(this);
            return true;
        } catch (RuntimeException e9) {
            BLog.e(TAG, "focusOnPoint crash， " + e9.getLocalizedMessage());
            e9.printStackTrace();
            return true;
        }
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public int getCameraAmount() {
        return Camera.getNumberOfCameras();
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public Object getCameraObject() {
        return this.mCamera;
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public int getCurrentExposureCompensation() {
        return this.mExposureCompensation;
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public String getCurrentWhiteBalanceMode() {
        Camera.Parameters parameters = this.mCameraParameters;
        if (parameters != null) {
            return parameters.getWhiteBalance();
        }
        return null;
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public int getDisplayOrientation() throws SpongeCameraAccessException {
        return this.mDisplayOrientation;
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public float getExposureCompensationStep() {
        return this.exposureCompensationStep;
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public int getMaxExposureCompensation() {
        return this.maxExposureCompensation;
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public float getMaxZoomValue() {
        return this.maxZoomValue;
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public int getMinExposureCompensation() {
        return this.minExposureCompensation;
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public int getOrientation() {
        Camera.CameraInfo cameraInfo = this.mCameraInfo;
        if (cameraInfo != null) {
            return cameraInfo.orientation;
        }
        return 0;
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public CameraParameterConfigture.SpongeSize getPreviewSize() {
        return new CameraParameterConfigture.SpongeSize(this.mPreviewWidth, this.mPreviewHeight);
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public int getRotationAngle() {
        return this.mNewsRotationAngle;
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public List<String> getSupportPreviewSize(int i7, List<String> list) {
        Camera camera = getCamera(i7);
        ArrayList arrayList = new ArrayList();
        List<Camera.Size> supportedPreviewSizes = camera.getParameters().getSupportedPreviewSizes();
        if (!this.opened) {
            camera.release();
        }
        for (String str : list) {
            int iIndexOf = str.indexOf(120);
            if (iIndexOf != -1) {
                int i8 = Integer.parseInt(str.substring(0, iIndexOf));
                int i9 = Integer.parseInt(str.substring(iIndexOf + 1));
                for (Camera.Size size : supportedPreviewSizes) {
                    if (size.width == i8 && size.height == i9) {
                        arrayList.add(str);
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public List<CameraParameterConfigture.SpongeSize> getSupportPreviewSize(Context context) {
        List<CameraParameterConfigture.SpongeSize> listIntersection;
        synchronized (this) {
            listIntersection = getListIntersection(getSupportPreviewSize(1), getSupportPreviewSize(0));
        }
        return listIntersection;
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public float getVerticalViewAngle() {
        Camera.Parameters parameters = this.mCameraParameters;
        if (parameters == null) {
            return 0.0f;
        }
        return parameters.getVerticalViewAngle();
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public boolean getVideoStabilization() {
        Camera.Parameters parameters = this.mCameraParameters;
        if (parameters == null) {
            return false;
        }
        return parameters.getVideoStabilization();
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public List<String> getWhiteBalanceModes() {
        Camera.Parameters parameters = this.mCameraParameters;
        if (parameters == null) {
            return null;
        }
        if (parameters.getSupportedWhiteBalance() != null) {
            Iterator<String> it = this.mCameraParameters.getSupportedWhiteBalance().iterator();
            while (it.hasNext()) {
                C3246j.b("getWhiteBalanceModes - ", it.next(), TAG);
            }
        }
        return this.mCameraParameters.getSupportedWhiteBalance();
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public int getZoom() {
        return this.mZoom;
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public List<Integer> getZoomRatios() {
        return this.zoomRatios;
    }

    public int getmPreviewHeight() {
        return this.mPreviewHeight;
    }

    public float getmPreviewScale() {
        return this.mPreviewScale;
    }

    public int getmPreviewWidth() {
        return this.mPreviewWidth;
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public boolean handleZoom(int i7) {
        Camera.Parameters parameters = this.mCameraParameters;
        if (parameters == null) {
            return false;
        }
        if (!parameters.isZoomSupported()) {
            BLog.i(TAG, "zoom not supported");
            return false;
        }
        int maxZoom = this.mCameraParameters.getMaxZoom();
        if (i7 == this.mCameraParameters.getZoom()) {
            return true;
        }
        int i8 = i7;
        if (i7 > maxZoom) {
            i8 = maxZoom;
        }
        int i9 = i8;
        if (i8 < 0) {
            i9 = 0;
        }
        a.a(i9, "handleZoom: zoomValue: ", TAG);
        this.mZoom = i9;
        this.mCameraParameters.setZoom(i9);
        try {
            this.mCamera.setParameters(this.mCameraParameters);
            return true;
        } catch (Exception e7) {
            e7.printStackTrace();
            return false;
        }
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public CameraProxy init(Context context) {
        this.mOrientationEventListener = new OrientationEventListener(this, context) { // from class: com.bilibili.sponge.camera.CameraProxy.1
            final CameraProxy this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.OrientationEventListener
            public void onOrientationChanged(int i7) {
                this.this$0.onOrientationChange(i7);
            }
        };
        return CAMERA_PROXY_INSTANCE;
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public boolean isFlipHorizontal() {
        Camera.CameraInfo cameraInfo = this.mCameraInfo;
        boolean z6 = false;
        if (cameraInfo == null) {
            return false;
        }
        if (cameraInfo.facing == 1) {
            z6 = true;
        }
        return z6;
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public boolean isFlipVertical() {
        Camera.CameraInfo cameraInfo = this.mCameraInfo;
        boolean z6 = false;
        if (cameraInfo == null) {
            return false;
        }
        int i7 = cameraInfo.orientation;
        if (i7 == 90 || i7 == 270) {
            z6 = true;
        }
        return z6;
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public boolean isFrontCamera() {
        return this.isFrontCamera;
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public boolean isOpenFlash() {
        return this.isOpenFlash;
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public boolean isSupportAutoExposure() {
        return this.supportAutoExposure;
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public boolean isSupportAutoFocus() {
        return this.supportAutoFocus;
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public boolean isSupportContinuousFocus() {
        return this.supportContinuousFocus;
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public boolean isSupportExposureCompensation() {
        return this.supportExposureCompensation;
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public boolean isSupportFlash() {
        return this.supportFlash;
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public boolean isSupportVideoStabilization() {
        return this.supportVideoStabilization;
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public boolean isSupportZoom() {
        return this.supportZoom;
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public void onAutoFocus(boolean z6, Camera camera) {
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, Camera camera) {
        if (this.mCameraAvailableListener != null) {
            this.mCameraAvailableListener.onCameraDataReceive(generateFrameData(bArr));
        }
        Camera camera2 = this.mCamera;
        if (camera2 != null) {
            camera2.addCallbackBuffer(bArr);
        }
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public int openCamera(CameraParameterConfigture cameraParameterConfigture, IOpenCameraCallback iOpenCameraCallback) {
        this.mOpenCameraListener = iOpenCameraCallback;
        if (Camera.getNumberOfCameras() <= 0) {
            this.mOpenCameraListener.cameraOpenFail(new SpongeCameraAccessException("numberOfCameras <= 0", "Exception from Camera1 openCamera", "getNumberOfCameras", "Exception", System.currentTimeMillis()));
            return -1;
        }
        this.mConfigture = cameraParameterConfigture;
        preCameraParameter(cameraParameterConfigture);
        if (!hasCameraPermission(this.mCameraId)) {
            this.mOpenCameraListener.cameraOpenFail(new SpongeCameraAccessException("numberOfCameras <= 0", "Exception from Camera1 openCamera", "check hasCameraPermission", CAMERA_ERROR_TYPE_NO_PERMISSION, System.currentTimeMillis()));
            return -1;
        }
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        this.mCameraInfo = cameraInfo;
        Camera.getCameraInfo(this.mCameraId, cameraInfo);
        try {
            this.mCameraParameters = this.mCamera.getParameters();
            initCameraParameter();
            this.mOrientationEventListener.enable();
            this.mOpenCameraListener.cameraOpenSuccess(this.mCamera);
            return 0;
        } catch (RuntimeException e7) {
            this.mOpenCameraListener.cameraOpenFail(new SpongeCameraAccessException("RuntimeException if reading parameters fails; usually this would\n        be because of a hardware or other low-level error, or because\n        release() has been called on this Camera instance.", "Exception from Camera1 openCamera", "getParameters", CAMERA_ERROR_TYPE_RUNTIME_EXCEPTION, System.currentTimeMillis()));
            return -1;
        }
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public int releaseCamera() {
        Camera camera = this.mCamera;
        if (camera != null) {
            camera.setPreviewCallbackWithBuffer(null);
            this.mCamera.release();
            this.mCamera = null;
        }
        OrientationEventListener orientationEventListener = this.mOrientationEventListener;
        if (orientationEventListener == null) {
            return 0;
        }
        orientationEventListener.disable();
        this.mOrientationEventListener = null;
        return 0;
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public void setCameraObject(Object obj, CameraParameterConfigture cameraParameterConfigture) {
        if (obj instanceof Camera) {
            this.mCamera = (Camera) obj;
            this.mCameraId = cameraParameterConfigture.isFrontCamera() ? 1 : 0;
            StringBuilder sb = new StringBuilder("setCameraObject: mCameraInfo = ");
            sb.append(this.mCameraInfo);
            sb.append("--mCameraId = ");
            B.a(this.mCameraId, "--", TAG, sb);
            Camera.CameraInfo cameraInfo = this.mCameraInfo;
            if (cameraInfo == null) {
                Camera.CameraInfo cameraInfo2 = new Camera.CameraInfo();
                this.mCameraInfo = cameraInfo2;
                Camera.getCameraInfo(this.mCameraId, cameraInfo2);
            } else if (this.mCameraId != cameraInfo.facing) {
                Z.b(this.mCameraInfo.facing, TAG, new StringBuilder("setCameraObject: mCameraInfo.facing = "));
                Camera.getCameraInfo(this.mCameraId, this.mCameraInfo);
            }
            this.isFrontCamera = cameraParameterConfigture.isFrontCamera();
            this.mDisplayRotation = cameraParameterConfigture.getmDisplayRotation();
            this.mPreviewWidth = cameraParameterConfigture.getmPreviewSize().width;
            this.mPreviewHeight = cameraParameterConfigture.getmPreviewSize().height;
            this.mSurfaceTexture = cameraParameterConfigture.getmTexture();
            this.mCameraParameters = this.mCamera.getParameters();
            this.mConfigture = cameraParameterConfigture;
            getCameraCapability();
            setDisplayOrientation();
            for (int i7 = 0; i7 < 5; i7++) {
                this.mCamera.addCallbackBuffer(new byte[((this.mPreviewWidth * this.mPreviewHeight) * 3) / 2]);
            }
            this.mCamera.setPreviewCallbackWithBuffer(this);
        }
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public void setCameraRawDataListener(ICameraRawDataListener iCameraRawDataListener) {
        this.mCameraAvailableListener = iCameraRawDataListener;
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public boolean setExposureCompensation(int i7) {
        Camera.Parameters parameters;
        if (this.mCamera == null || !this.supportExposureCompensation || (parameters = this.mCameraParameters) == null) {
            return false;
        }
        int i8 = this.minExposureCompensation;
        int i9 = i7;
        if (i7 < i8) {
            i9 = i8;
        }
        int i10 = this.maxExposureCompensation;
        int i11 = i9;
        if (i9 > i10) {
            i11 = i10;
        }
        this.mExposureCompensation = i11;
        parameters.setExposureCompensation(i11);
        try {
            this.mCamera.setParameters(this.mCameraParameters);
            return true;
        } catch (Exception e7) {
            e7.printStackTrace();
            return false;
        }
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public boolean setFlashMode(String str) {
        if (this.mCamera == null || !this.supportFlash) {
            return false;
        }
        String strHandleParamFlashMode = handleParamFlashMode(str);
        this.flashMode = strHandleParamFlashMode;
        this.mCameraParameters.setFlashMode(strHandleParamFlashMode);
        try {
            this.mCamera.setParameters(this.mCameraParameters);
            return true;
        } catch (Exception e7) {
            e7.printStackTrace();
            return false;
        }
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public boolean setFocusMode(String str) {
        if (this.mCamera == null) {
            return false;
        }
        if (str.equals(CameraParameterConfigture.CAMERA_PARAM_FOCUS_MODE_AUTO) && !this.supportAutoFocus) {
            return false;
        }
        if (str.equals(CameraParameterConfigture.CAMERA_PARAM_FOCUS_MODE_CONTINUE_PICTURE) && !this.supportContinuousFocus) {
            return false;
        }
        if (str.equals(CameraParameterConfigture.CAMERA_PARAM_FOCUS_MODE_CONTINUE_VIDEO) && !this.supportContinuousFocus) {
            return false;
        }
        String strHandleParamFocusMode = handleParamFocusMode(str);
        this.focusMode = strHandleParamFocusMode;
        this.mCameraParameters.setFocusMode(strHandleParamFocusMode);
        try {
            this.mCamera.setParameters(this.mCameraParameters);
            return true;
        } catch (Exception e7) {
            e7.printStackTrace();
            return false;
        }
    }

    public void setFps(int i7) {
        this.fps = i7;
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public boolean setMeteringArea(Rect rect) {
        if (this.mCamera == null) {
            return false;
        }
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Camera.Area(rect, 1000));
            Camera.Parameters parameters = this.mCamera.getParameters();
            parameters.setMeteringAreas(arrayList);
            this.mCamera.setParameters(parameters);
            return true;
        } catch (Exception e7) {
            e7.printStackTrace();
            return false;
        }
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public void setTextureId(int i7) {
        this.mTextureId = i7;
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public boolean setVideoStabilization(boolean z6) {
        Camera.Parameters parameters = this.mCameraParameters;
        if (parameters == null || !this.supportVideoStabilization) {
            return false;
        }
        parameters.setVideoStabilization(z6);
        return true;
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public boolean setWhiteBalanceModes(String str) {
        Camera.Parameters parameters = this.mCameraParameters;
        if (parameters == null) {
            return false;
        }
        parameters.setWhiteBalance(str);
        try {
            this.mCamera.setParameters(this.mCameraParameters);
            return true;
        } catch (Exception e7) {
            e7.printStackTrace();
            return false;
        }
    }

    public void setmPreviewHeight(int i7) {
        this.mPreviewHeight = i7;
    }

    public void setmPreviewWidth(int i7) {
        this.mPreviewWidth = i7;
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public void startPreview() throws SpongeCameraAccessException {
        Camera camera = this.mCamera;
        if (camera == null) {
            throw new SpongeCameraAccessException("mCamera == null", "NullPointException from Camera1 startPreview", "startPreview", "NullPointException", System.currentTimeMillis());
        }
        camera.setPreviewCallbackWithBuffer(this);
        try {
            this.mCamera.setPreviewTexture(this.mSurfaceTexture);
            this.mCamera.startPreview();
        } catch (IOException e7) {
            e7.printStackTrace();
            throw new SpongeCameraAccessException(e7.getMessage(), "IOException from Camera1 startPreview", "startPreview", "IOException", System.currentTimeMillis());
        } catch (RuntimeException e8) {
            e8.printStackTrace();
            throw new SpongeCameraAccessException(e8.getMessage(), "RuntimeException from Camera1 startPreview", "startPreview", CAMERA_ERROR_TYPE_RUNTIME_EXCEPTION, System.currentTimeMillis());
        }
    }

    public void startPreview(SurfaceHolder surfaceHolder) {
        Camera camera = this.mCamera;
        if (camera != null) {
            try {
                camera.setPreviewCallbackWithBuffer(this);
                this.mCamera.setPreviewDisplay(surfaceHolder);
                this.mCamera.startPreview();
            } catch (IOException e7) {
                e7.printStackTrace();
            } catch (RuntimeException e8) {
                e8.printStackTrace();
            }
        }
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public void stopPreview() {
        Camera camera = this.mCamera;
        if (camera != null) {
            camera.stopPreview();
        }
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public void switchCamera(IOpenCameraCallback iOpenCameraCallback) throws SpongeCameraAccessException {
        this.mCameraId ^= 1;
        stopPreview();
        Camera camera = this.mCamera;
        if (camera != null) {
            camera.release();
            this.mCamera = null;
        }
        this.mConfigture.setFrontCamera(!this.isFrontCamera);
        openCamera(this.mConfigture, iOpenCameraCallback);
    }
}
