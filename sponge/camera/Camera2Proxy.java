package com.bilibili.sponge.camera;

import X1.F;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Log;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import android.util.SizeF;
import android.view.OrientationEventListener;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.C3259x;
import com.bilibili.ad.adview.videodetail.pausedpage.brand.base.b;
import com.bilibili.mediautils.ImageUtil;
import com.bilibili.sponge.callback.ICamera;
import com.bilibili.sponge.callback.ICameraRawDataListener;
import com.bilibili.sponge.callback.IOpenCameraCallback;
import com.bilibili.sponge.camera.CameraParameterConfigture;
import com.bilibili.sponge.exception.SpongeCameraAccessException;
import defpackage.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sponge/camera/Camera2Proxy.class */
public class Camera2Proxy implements ICamera {
    private static final int ACQUIRE_IMAGE_BUFFER = 2;
    private static volatile Camera2Proxy CAMERA2_PROXY_INSTANCE;
    private static final String TAG = "Camera2Proxy";
    private CameraCharacteristics cameraCharacteristics;
    private float exposureCompensationStep;
    private Range<Integer> fpsRange;
    private Handler mBackgroundHandler;
    private HandlerThread mBackgroundThread;
    private ICameraRawDataListener mCameraAvailableListener;
    private CameraParameterConfigture mCameraConfigture;
    private CameraDevice mCameraDevice;
    private int mDisplayRotation;
    private MeteringRectangle[] mFocusArea;
    private ImageReader mImageReader;
    private MeteringRectangle[] mMeteringArea;
    private IOpenCameraCallback mOpenCameraListener;
    private OrientationEventListener mOrientationEventListener;
    private CaptureRequest.Builder mPreviewRequestBuilder;
    private CameraCaptureSession mPreviewSession;
    private CameraParameterConfigture.SpongeSize mPreviewSize;
    private Surface mPreviewSurface;
    private int mSensorOrientation;
    private SurfaceTexture mSurfaceTexture;
    private int mTextureId;
    private CameraManager manager;
    private int maxExposureCompensation;
    private float maxZoomValue;
    private int minExposureCompensation;
    private boolean supportAutoFocus;
    private boolean supportContinuousFocus;
    private boolean supportFlash;
    private boolean supportZoom;
    private List<Integer> zoomRatios;
    private final int FLASH_MODE_CLOSE = 0;
    private final int FLASH_MODE_OPEN = 1;
    private final int FLASH_MODE_AUTO = 2;
    private final int FLASH_MODE_TORCH = 3;
    private final String CAPTURE_REQUEST_TYPE_CONTROL_AF_REGIONS = "android.control.afRegions";
    private final String CAPTURE_REQUEST_TYPE_CONTROL_AE_REGIONS = "android.control.aeRegions";
    private int mCameraId = 1;
    private boolean isFrontCamera = true;
    private int mPreviewWidth = 1440;
    private int mPreviewHeight = 1080;
    private int mFlashMode = 0;
    private int mFocusMode = 3;
    private boolean isOpenFlash = false;
    private int mRotationDegree = 0;
    private int fps = 30;
    private int mExposureCompensation = 0;
    private boolean supportAutoExposure = true;
    private boolean supportVideoStabilization = true;
    private boolean supportExposureCompensation = true;
    private int mZoom = 1;
    private CameraDevice.StateCallback mStateCallback = new CameraDevice.StateCallback(this) { // from class: com.bilibili.sponge.camera.Camera2Proxy.1
        final Camera2Proxy this$0;

        {
            this.this$0 = this;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(@NonNull CameraDevice cameraDevice) {
            this.this$0.releaseCamera();
            this.this$0.mOpenCameraListener.cameraOpenFail(new SpongeCameraAccessException("open camera2 fail", "open camera2 fail from onDisconnected", "onDisconnected", "OpenCameraException", System.currentTimeMillis()));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(@NonNull CameraDevice cameraDevice, int i7) {
            this.this$0.releaseCamera();
            this.this$0.mOpenCameraListener.cameraOpenFail(new SpongeCameraAccessException(C3259x.a(i7, "open camera2 fail, error id : "), "open camera2 fail from onError", "onError", "OpenCameraException", System.currentTimeMillis()));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(@NonNull CameraDevice cameraDevice) {
            this.this$0.mCameraDevice = cameraDevice;
            this.this$0.initPreviewRequest(false);
            this.this$0.mOpenCameraListener.cameraOpenSuccess(cameraDevice);
        }
    };
    private final CameraCaptureSession.CaptureCallback mAfCaptureCallback = new CameraCaptureSession.CaptureCallback(this) { // from class: com.bilibili.sponge.camera.Camera2Proxy.4
        final Camera2Proxy this$0;

        {
            this.this$0 = this;
        }

        private void process(CaptureResult captureResult) {
            Integer num = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
            if (num == null) {
                return;
            }
            BLog.d(Camera2Proxy.TAG, "process: CONTROL_AF_STATE: " + num);
            if (num.intValue() == 4 || num.intValue() == 5) {
                BLog.d(Camera2Proxy.TAG, "process: start normal preview");
                this.this$0.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                this.this$0.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_MODE, 4);
                this.this$0.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_MODE, 0);
                try {
                    this.this$0.startPreview();
                } catch (SpongeCameraAccessException e7) {
                    e7.printStackTrace();
                }
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            process(totalCaptureResult);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureResult captureResult) {
            process(captureResult);
        }
    };

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sponge/camera/Camera2Proxy$CompareSizesByArea.class */
    public static class CompareSizesByArea implements Comparator<Size> {
        @Override // java.util.Comparator
        public int compare(Size size, Size size2) {
            return Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sponge/camera/Camera2Proxy$ImageAvailableListenerImp.class */
    public class ImageAvailableListenerImp implements ImageReader.OnImageAvailableListener {
        private byte[] mYUVData;
        final Camera2Proxy this$0;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private byte[] f105052u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private byte[] f105053v;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private byte[] f105054y;

        private ImageAvailableListenerImp(Camera2Proxy camera2Proxy) {
            this.this$0 = camera2Proxy;
        }

        @Override // android.media.ImageReader.OnImageAvailableListener
        public void onImageAvailable(ImageReader imageReader) {
            Image imageAcquireLatestImage = imageReader.acquireLatestImage();
            if (imageAcquireLatestImage == null) {
                Log.w(Camera2Proxy.TAG, "onImageAvailable: image is null !!");
                return;
            }
            Image.Plane[] planes = imageAcquireLatestImage.getPlanes();
            if (this.f105054y == null) {
                this.f105054y = new byte[planes[0].getBuffer().limit() - planes[0].getBuffer().position()];
                this.f105052u = new byte[planes[1].getBuffer().limit() - planes[1].getBuffer().position()];
                this.f105053v = new byte[planes[2].getBuffer().limit() - planes[2].getBuffer().position()];
            }
            if (imageAcquireLatestImage.getPlanes()[0].getBuffer().remaining() == this.f105054y.length) {
                planes[0].getBuffer().get(this.f105054y);
                planes[1].getBuffer().get(this.f105052u);
                planes[2].getBuffer().get(this.f105053v);
                if (this.mYUVData == null) {
                    this.mYUVData = new byte[((imageAcquireLatestImage.getHeight() * planes[0].getRowStride()) * 3) / 2];
                }
                byte[] bArr = this.f105054y;
                int length = bArr.length;
                byte[] bArr2 = this.f105052u;
                if (length / bArr2.length == 2) {
                    ImageUtil.yuv422ToYuv420sp(bArr, bArr2, this.f105053v, this.mYUVData, planes[0].getRowStride(), imageAcquireLatestImage.getHeight());
                } else if (bArr.length / bArr2.length == 4) {
                    ImageUtil.yuv420ToYuv420sp(bArr, bArr2, this.f105053v, this.mYUVData, planes[0].getRowStride(), imageAcquireLatestImage.getHeight());
                }
                if (this.this$0.mCameraAvailableListener != null) {
                    this.this$0.mCameraAvailableListener.onCameraDataReceive(this.this$0.generateFrameData(this.mYUVData));
                }
            }
            imageAcquireLatestImage.close();
        }
    }

    private static Size chooseOptimalSize(Size[] sizeArr, int i7, int i8, Size size) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iMax = Math.max(i7, i8);
        int width = size.getWidth();
        int height = size.getHeight();
        for (Size size2 : sizeArr) {
            if (size2.getHeight() == (size2.getWidth() * height) / width) {
                if (size2.getWidth() >= iMax) {
                    arrayList.add(size2);
                } else {
                    arrayList2.add(size2);
                }
            }
        }
        if (arrayList.size() > 0) {
            return (Size) Collections.min(arrayList, new CompareSizesByArea());
        }
        if (arrayList2.size() > 0) {
            return (Size) Collections.max(arrayList2, new CompareSizesByArea());
        }
        BLog.e(TAG, "Couldn't find any suitable preview size");
        return sizeArr[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void configureFlashMode(CaptureRequest.Builder builder, int i7) {
        if (i7 == 1) {
            builder.set(CaptureRequest.CONTROL_AE_MODE, 3);
            builder.set(CaptureRequest.FLASH_MODE, 0);
        } else if (i7 == 2) {
            builder.set(CaptureRequest.CONTROL_AE_MODE, 2);
            builder.set(CaptureRequest.FLASH_MODE, 0);
        } else if (i7 != 3) {
            builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
            builder.set(CaptureRequest.FLASH_MODE, 0);
        } else {
            builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
            builder.set(CaptureRequest.FLASH_MODE, 2);
        }
    }

    private Rect convertRectToCamera2(Rect rect, Rect rect2) {
        double d7 = ((double) (rect2.left + 1000)) / 2000.0d;
        double d8 = ((double) (rect2.top + 1000)) / 2000.0d;
        double d9 = ((double) (rect2.right + 1000)) / 2000.0d;
        double d10 = ((double) (rect2.bottom + 1000)) / 2000.0d;
        int iWidth = (int) ((d7 * ((double) (rect.width() - 1))) + ((double) rect.left));
        int iWidth2 = (int) ((d9 * ((double) (rect.width() - 1))) + ((double) rect.left));
        int iHeight = (int) ((d8 * ((double) (rect.height() - 1))) + ((double) rect.top));
        int iHeight2 = (int) ((d10 * ((double) (rect.height() - 1))) + ((double) rect.top));
        int iMax = Math.max(iWidth, rect.left);
        int iMax2 = Math.max(iWidth2, rect.left);
        int iMax3 = Math.max(iHeight, rect.top);
        int iMax4 = Math.max(iHeight2, rect.top);
        return new Rect(Math.min(iMax, rect.right), Math.min(iMax3, rect.bottom), Math.min(iMax2, rect.right), Math.min(iMax4, rect.bottom));
    }

    private String convertWhiteBalance(int i7) {
        String str;
        switch (i7) {
            case 0:
                str = "manual";
                break;
            case 1:
                str = "auto";
                break;
            case 2:
                str = "incandescent";
                break;
            case 3:
                str = "fluorescent";
                break;
            case 4:
                str = "warm-fluorescent";
                break;
            case 5:
                str = "daylight";
                break;
            case 6:
                str = "cloudy-daylight";
                break;
            case 7:
                str = "twilight";
                break;
            case 8:
                str = "shade";
                break;
            default:
                str = null;
                break;
        }
        return str;
    }

    private Range<Integer> findSuitableFps(Range<Integer>[] rangeArr) {
        if (rangeArr == null) {
            return null;
        }
        int length = rangeArr.length;
        Range range = new Range(Integer.valueOf(this.fps), Integer.valueOf(this.fps));
        int i7 = 0;
        int i8 = Integer.MAX_VALUE;
        int i9 = 0;
        while (i7 < length) {
            StringBuilder sbB = F.b(i7, "findSuitableFps: ranges[", "]=");
            sbB.append(rangeArr[i7].toString());
            BLog.d(TAG, sbB.toString());
            int i10 = i9;
            int iIntValue = i8;
            if (((Integer) rangeArr[i7].getUpper()).equals(range.getUpper())) {
                i10 = i9;
                iIntValue = i8;
                if (((Integer) rangeArr[i7].getLower()).intValue() < i8) {
                    iIntValue = ((Integer) rangeArr[i7].getLower()).intValue();
                    i10 = i7;
                }
            }
            i7++;
            i9 = i10;
            i8 = iIntValue;
        }
        BLog.d(TAG, "findSuitableFps: final fps range - " + this.fpsRange.toString());
        return rangeArr[i9];
    }

    private void generateFocusAreaRect(MeteringRectangle meteringRectangle) {
        MeteringRectangle[] meteringRectangleArr = this.mFocusArea;
        if (meteringRectangleArr == null) {
            this.mFocusArea = new MeteringRectangle[]{meteringRectangle};
        } else {
            meteringRectangleArr[0] = meteringRectangle;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CameraParameterConfigture.RawFrameData generateFrameData(byte[] bArr) {
        CameraParameterConfigture.RawFrameData rawFrameData = new CameraParameterConfigture.RawFrameData();
        rawFrameData.setTimestamp(System.currentTimeMillis());
        rawFrameData.setmType(17);
        rawFrameData.setIsFront(this.isFrontCamera);
        rawFrameData.setRotation(this.mRotationDegree);
        rawFrameData.setmData(bArr);
        rawFrameData.setWidth(this.mPreviewWidth);
        rawFrameData.setHeight(this.mPreviewHeight);
        if (this.mCameraConfigture.isNeedTexture()) {
            rawFrameData.setTextureId(this.mTextureId);
        }
        return rawFrameData;
    }

    private void generateMeteringAreaRect(MeteringRectangle meteringRectangle) {
        MeteringRectangle[] meteringRectangleArr = this.mMeteringArea;
        if (meteringRectangleArr == null) {
            this.mMeteringArea = new MeteringRectangle[]{meteringRectangle};
        } else {
            meteringRectangleArr[0] = meteringRectangle;
        }
    }

    private Size[] getBackSupportPreviewSize(CameraManager cameraManager) {
        try {
            return ((StreamConfigurationMap) cameraManager.getCameraCharacteristics(String.valueOf(0)).get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(SurfaceTexture.class);
        } catch (CameraAccessException e7) {
            e7.printStackTrace();
            return null;
        }
    }

    private Size[] getFrontSupportPreviewSize(CameraManager cameraManager) {
        try {
            return ((StreamConfigurationMap) cameraManager.getCameraCharacteristics(String.valueOf(1)).get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(SurfaceTexture.class);
        } catch (CameraAccessException e7) {
            e7.printStackTrace();
            return null;
        }
    }

    private Rect getViewableRect() {
        Rect rect;
        CaptureRequest.Builder builder = this.mPreviewRequestBuilder;
        if (builder != null && (rect = (Rect) builder.get(CaptureRequest.SCALER_CROP_REGION)) != null) {
            return rect;
        }
        Rect rect2 = (Rect) this.cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect2.right -= rect2.left;
        rect2.left = 0;
        rect2.bottom -= rect2.top;
        rect2.top = 0;
        return rect2;
    }

    private int handleParamFlashMode(String str) {
        int i7;
        if (TextUtils.isEmpty(str)) {
            this.isOpenFlash = false;
            return 0;
        }
        str.getClass();
        switch (str) {
            case "flash_mode_auto":
                this.isOpenFlash = false;
                i7 = 2;
                break;
            case "flash_mode_open":
                this.isOpenFlash = true;
                i7 = 1;
                break;
            case "flash_mode_torch":
                this.isOpenFlash = true;
                i7 = 3;
                break;
            default:
                this.isOpenFlash = false;
                i7 = 0;
                break;
        }
        return i7;
    }

    private int handleParamFocusMode(String str) {
        int i7 = 1;
        if (TextUtils.isEmpty(str)) {
            return 3;
        }
        str.getClass();
        switch (str) {
            case "focus_mode_auto":
                break;
            case "focus_mode_continue_picture":
                i7 = 4;
                break;
            case "focus_mode_continue_video":
            default:
                i7 = 3;
                break;
        }
        return i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initPreviewRequest(boolean z6) {
        try {
            this.mPreviewRequestBuilder = this.mCameraDevice.createCaptureRequest(1);
            SurfaceTexture surfaceTexture = this.mSurfaceTexture;
            if (surfaceTexture != null && this.mPreviewSurface == null) {
                surfaceTexture.setDefaultBufferSize(this.mPreviewSize.getWidth(), this.mPreviewSize.getHeight());
                this.mPreviewSurface = new Surface(this.mSurfaceTexture);
            }
            this.mPreviewRequestBuilder.addTarget(this.mPreviewSurface);
            this.mPreviewRequestBuilder.addTarget(this.mImageReader.getSurface());
            this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, this.fpsRange);
            this.mCameraDevice.createCaptureSession(Arrays.asList(this.mPreviewSurface, this.mImageReader.getSurface()), new CameraCaptureSession.StateCallback(this, z6) { // from class: com.bilibili.sponge.camera.Camera2Proxy.3
                final Camera2Proxy this$0;
                final boolean val$needStartPreview;

                {
                    this.this$0 = this;
                    this.val$needStartPreview = z6;
                }

                @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                public void onConfigureFailed(@NonNull CameraCaptureSession cameraCaptureSession) {
                    BLog.e(Camera2Proxy.TAG, "ConfigureFailed. session: mPreviewSession");
                }

                @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                public void onConfigured(@NonNull CameraCaptureSession cameraCaptureSession) {
                    this.this$0.mPreviewSession = cameraCaptureSession;
                    this.this$0.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(this.this$0.mFocusMode));
                    Camera2Proxy camera2Proxy = this.this$0;
                    camera2Proxy.configureFlashMode(camera2Proxy.mPreviewRequestBuilder, this.this$0.mFlashMode);
                    if (this.val$needStartPreview) {
                        try {
                            this.this$0.startPreview();
                        } catch (SpongeCameraAccessException e7) {
                            e7.printStackTrace();
                        }
                    }
                }
            }, this.mBackgroundHandler);
        } catch (CameraAccessException e7) {
            e7.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onOrientationChange(int i7) {
        if (i7 == -1) {
            return;
        }
        int i8 = this.mSensorOrientation;
        int i9 = ((i7 + 45) / 90) * 90;
        int i10 = i9;
        if (this.isFrontCamera) {
            i10 = -i9;
        }
        this.mRotationDegree = ((i8 + i10) + 360) % 360;
    }

    private void preConfigCameraParameter(CameraParameterConfigture cameraParameterConfigture) {
        this.fps = cameraParameterConfigture.getFps();
        CameraParameterConfigture.SpongeSize spongeSize = cameraParameterConfigture.getmPreviewSize();
        this.mPreviewSize = spongeSize;
        if (spongeSize != null) {
            this.mPreviewWidth = spongeSize.getWidth();
            this.mPreviewHeight = this.mPreviewSize.getHeight();
        }
        boolean zIsFrontCamera = cameraParameterConfigture.isFrontCamera();
        this.isFrontCamera = zIsFrontCamera;
        if (zIsFrontCamera) {
            this.mCameraId = 1;
        } else {
            this.mCameraId = 0;
        }
        this.mFlashMode = handleParamFlashMode(cameraParameterConfigture.getFlashMode());
        this.mFocusMode = handleParamFocusMode(cameraParameterConfigture.getFocusMode());
        if (cameraParameterConfigture.getmTexture() != null) {
            this.mSurfaceTexture = cameraParameterConfigture.getmTexture();
        }
        setCameraRawDataListener(cameraParameterConfigture.getFrameRawDataListener());
        this.mDisplayRotation = cameraParameterConfigture.getmDisplayRotation();
    }

    private void releaseCameraDevice() {
        CameraDevice cameraDevice = this.mCameraDevice;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.mCameraDevice = null;
        }
    }

    private void releaseCaptureSession() {
        CameraCaptureSession cameraCaptureSession = this.mPreviewSession;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.mPreviewSession = null;
        }
    }

    private void releaseImageReader() {
        ImageReader imageReader = this.mImageReader;
        if (imageReader != null) {
            imageReader.close();
            this.mImageReader = null;
        }
    }

    private void setMeteringRectangleRequestBuilder(CaptureRequest.Builder builder, CaptureRequest.Key<MeteringRectangle[]> key) {
        builder.set(CaptureRequest.CONTROL_AF_MODE, 1);
        builder.set(CaptureRequest.CONTROL_MODE, 1);
        if (key.getName().equals("android.control.afRegions")) {
            if (((Integer) this.cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() > 0) {
                BLog.d(TAG, "setMeteringRectangleRequestBuilder: afRegions");
                builder.set(CaptureRequest.CONTROL_AF_REGIONS, this.mFocusArea);
            }
        } else if (key.getName().equals("android.control.aeRegions") && ((Integer) this.cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE)).intValue() > 0) {
            BLog.d(TAG, "setMeteringRectangleRequestBuilder: aeRegions");
            builder.set(CaptureRequest.CONTROL_AE_REGIONS, this.mMeteringArea);
        }
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.util.Size setSwappedDimensions() {
        /*
            r5 = this;
            r0 = r5
            int r0 = r0.mDisplayRotation
            r6 = r0
            r0 = r5
            r1 = r5
            android.hardware.camera2.CameraCharacteristics r1 = r1.cameraCharacteristics
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.mSensorOrientation = r1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "setSwappedDimensions: mSensorOrientation = "
            r1.<init>(r2)
            r7 = r0
            r0 = r5
            int r0 = r0.mSensorOrientation
            java.lang.String r1 = "Camera2Proxy"
            r2 = r7
            androidx.compose.foundation.text.selection.P0.a(r0, r1, r2)
            r0 = r6
            if (r0 == 0) goto L60
            r0 = r6
            r1 = 1
            if (r0 == r1) goto L4d
            r0 = r6
            r1 = 2
            if (r0 == r1) goto L60
            r0 = r6
            r1 = 3
            if (r0 == r1) goto L4d
            r0 = r6
            java.lang.String r1 = "Display rotation is invalid: "
            java.lang.String r2 = "Camera2Proxy"
            T7.a.a(r0, r1, r2)
            goto L75
        L4d:
            r0 = r5
            int r0 = r0.mSensorOrientation
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L88
            r0 = r6
            r1 = 180(0xb4, float:2.52E-43)
            if (r0 != r1) goto L75
            goto L88
        L60:
            r0 = r5
            int r0 = r0.mSensorOrientation
            r6 = r0
            r0 = r6
            r1 = 90
            if (r0 == r1) goto L88
            r0 = r6
            r1 = 270(0x10e, float:3.78E-43)
            if (r0 != r1) goto L75
            goto L88
        L75:
            android.util.Size r0 = new android.util.Size
            r1 = r0
            r2 = r5
            int r2 = r2.mPreviewWidth
            r3 = r5
            int r3 = r3.mPreviewHeight
            r1.<init>(r2, r3)
            r7 = r0
            goto L9a
        L88:
            r0 = r5
            int r0 = r0.mPreviewWidth
            r6 = r0
            android.util.Size r0 = new android.util.Size
            r1 = r0
            r2 = r5
            int r2 = r2.mPreviewHeight
            r3 = r6
            r1.<init>(r2, r3)
            r7 = r0
        L9a:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sponge.camera.Camera2Proxy.setSwappedDimensions():android.util.Size");
    }

    private void startBackgroundThread() {
        if (this.mBackgroundThread == null || this.mBackgroundHandler == null) {
            BLog.d(TAG, "startBackgroundThread");
            HandlerThread handlerThread = new HandlerThread("Camera2Background");
            this.mBackgroundThread = handlerThread;
            handlerThread.start();
            this.mBackgroundHandler = new Handler(this.mBackgroundThread.getLooper());
        }
    }

    private void stopBackgroundThread() {
        BLog.d(TAG, "stopBackgroundThread");
        try {
            HandlerThread handlerThread = this.mBackgroundThread;
            if (handlerThread != null) {
                handlerThread.quitSafely();
                this.mBackgroundThread.join();
            }
            this.mBackgroundThread = null;
            this.mBackgroundHandler = null;
        } catch (InterruptedException e7) {
            e7.printStackTrace();
        }
    }

    private void triggerFocus() throws CameraAccessException {
        try {
            startPreview();
        } catch (SpongeCameraAccessException e7) {
            e7.printStackTrace();
        }
        this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        this.mPreviewSession.capture(this.mPreviewRequestBuilder.build(), this.mAfCaptureCallback, this.mBackgroundHandler);
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public boolean cancelAutoFocus() {
        if (this.mCameraDevice == null || this.mPreviewRequestBuilder == null) {
            return false;
        }
        Rect viewableRect = getViewableRect();
        generateFocusAreaRect(new MeteringRectangle(new Rect(0, 0, viewableRect.width() - 1, viewableRect.height() - 1), 0));
        setMeteringRectangleRequestBuilder(this.mPreviewRequestBuilder, CaptureRequest.CONTROL_AF_REGIONS);
        try {
            triggerFocus();
            return true;
        } catch (CameraAccessException e7) {
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
        if (this.mCameraDevice == null || this.mPreviewRequestBuilder == null) {
            return false;
        }
        generateFocusAreaRect(new MeteringRectangle(convertRectToCamera2(getViewableRect(), rect), 1000));
        setMeteringRectangleRequestBuilder(this.mPreviewRequestBuilder, CaptureRequest.CONTROL_AF_REGIONS);
        try {
            triggerFocus();
            return true;
        } catch (CameraAccessException e7) {
            e7.printStackTrace();
            return false;
        }
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public int getCameraAmount() {
        CameraManager cameraManager = this.manager;
        if (cameraManager == null) {
            return -1;
        }
        try {
            return cameraManager.getCameraIdList().length;
        } catch (CameraAccessException e7) {
            e7.printStackTrace();
            return -1;
        }
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public Object getCameraObject() {
        return null;
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public int getCurrentExposureCompensation() {
        return this.mExposureCompensation;
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public String getCurrentWhiteBalanceMode() {
        return null;
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public int getDisplayOrientation() throws SpongeCameraAccessException {
        BLog.e(TAG, "getDisplayOrientation not supported by this API");
        throw new SpongeCameraAccessException("Camera2 not support this api", "exception from Camera2 getDisplayOrientation", "getDisplayOrientation", "RuntimeException", System.currentTimeMillis());
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
        return this.mSensorOrientation;
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public CameraParameterConfigture.SpongeSize getPreviewSize() {
        return this.mPreviewSize;
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public int getRotationAngle() {
        return this.mRotationDegree;
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public List<String> getSupportPreviewSize(int i7, List<String> list) {
        return null;
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public List<CameraParameterConfigture.SpongeSize> getSupportPreviewSize(Context context) {
        CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
        if (cameraManager == null) {
            return null;
        }
        Size[] frontSupportPreviewSize = getFrontSupportPreviewSize(cameraManager);
        Size[] backSupportPreviewSize = getBackSupportPreviewSize(cameraManager);
        ArrayList arrayList = null;
        if (frontSupportPreviewSize != null) {
            arrayList = null;
            if (frontSupportPreviewSize.length > 0) {
                arrayList = null;
                if (backSupportPreviewSize != null) {
                    arrayList = null;
                    if (backSupportPreviewSize.length > 0) {
                        ArrayList arrayList2 = new ArrayList();
                        int length = frontSupportPreviewSize.length;
                        int i7 = 0;
                        while (true) {
                            arrayList = arrayList2;
                            if (i7 >= length) {
                                break;
                            }
                            Size size = frontSupportPreviewSize[i7];
                            int length2 = backSupportPreviewSize.length;
                            int i8 = 0;
                            while (true) {
                                if (i8 < length2) {
                                    Size size2 = backSupportPreviewSize[i8];
                                    if (size.getHeight() == size2.getHeight() && size.getWidth() == size2.getWidth()) {
                                        arrayList2.add(new CameraParameterConfigture.SpongeSize(size.getWidth(), size.getHeight()));
                                        break;
                                    }
                                    i8++;
                                }
                            }
                            i7++;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public float getVerticalViewAngle() {
        CameraCharacteristics cameraCharacteristics = this.cameraCharacteristics;
        if (cameraCharacteristics == null) {
            return 1.0f;
        }
        SizeF sizeF = (SizeF) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        float[] fArr = (float[]) this.cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
        if (fArr == null || fArr.length <= 0) {
            return 1.0f;
        }
        return (float) (Math.atan(sizeF.getHeight() / (fArr[0] * 2.0f)) * 2.0d);
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public boolean getVideoStabilization() {
        Integer num;
        CaptureRequest.Builder builder = this.mPreviewRequestBuilder;
        boolean z6 = false;
        if (builder == null || (num = (Integer) builder.get(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE)) == null) {
            return false;
        }
        if (num.intValue() == 1) {
            z6 = true;
        }
        return z6;
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public List<String> getWhiteBalanceModes() {
        return null;
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public int getZoom() {
        return this.mZoom;
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public List<Integer> getZoomRatios() {
        return this.zoomRatios;
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public boolean handleZoom(int i7) {
        CameraCharacteristics cameraCharacteristics;
        if (this.mCameraDevice == null || (cameraCharacteristics = this.cameraCharacteristics) == null || this.mPreviewRequestBuilder == null || !this.supportZoom) {
            return false;
        }
        int iIntValue = ((Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).intValue() * 10;
        a.a(iIntValue, "handleZoom: maxZoom: ", TAG);
        Rect rect = (Rect) this.cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if (i7 == this.mZoom) {
            return true;
        }
        int i8 = i7;
        if (i7 > iIntValue) {
            i8 = iIntValue;
        }
        int i9 = i8;
        if (i8 < 1) {
            i9 = 1;
        }
        this.mZoom = i9;
        BLog.d(TAG, "handleZoom: mZoom: " + this.mZoom);
        int iWidth = rect.width() / iIntValue;
        int iHeight = rect.height() / iIntValue;
        int iWidth2 = rect.width();
        int iHeight2 = rect.height();
        int i10 = this.mZoom;
        int i11 = ((iWidth2 - iWidth) * i10) / 100;
        int i12 = ((iHeight2 - iHeight) * i10) / 100;
        int i13 = i11 - (i11 & 3);
        int i14 = i12 - (i12 & 3);
        BLog.d(TAG, "handleZoom: cropW: " + i13 + ", cropH: " + i14);
        this.mPreviewRequestBuilder.set(CaptureRequest.SCALER_CROP_REGION, new Rect(i13, i14, rect.width() - i13, rect.height() - i14));
        try {
            startPreview();
            return true;
        } catch (SpongeCameraAccessException e7) {
            e7.printStackTrace();
            return false;
        }
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public Camera2Proxy init(Context context) {
        this.mOrientationEventListener = new OrientationEventListener(this, context) { // from class: com.bilibili.sponge.camera.Camera2Proxy.2
            final Camera2Proxy this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.OrientationEventListener
            public void onOrientationChanged(int i7) {
                this.this$0.onOrientationChange(i7);
            }
        };
        this.manager = (CameraManager) context.getSystemService("camera");
        return this;
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public boolean isFlipHorizontal() {
        boolean z6 = true;
        if (this.mCameraId != 1) {
            z6 = false;
        }
        return z6;
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public boolean isFlipVertical() {
        int i7 = this.mSensorOrientation;
        return i7 == 90 || i7 == 270;
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

    @Override // com.bilibili.sponge.callback.ICamera
    public int openCamera(CameraParameterConfigture cameraParameterConfigture, IOpenCameraCallback iOpenCameraCallback) {
        this.mOpenCameraListener = iOpenCameraCallback;
        startBackgroundThread();
        this.mOrientationEventListener.enable();
        this.mCameraConfigture = cameraParameterConfigture;
        preConfigCameraParameter(cameraParameterConfigture);
        try {
            BLog.d(TAG, "openCamera: manager.getCameraIdList() = " + this.manager.getCameraIdList().length);
            this.cameraCharacteristics = this.manager.getCameraCharacteristics(Integer.toString(this.mCameraId));
        } catch (CameraAccessException e7) {
            e7.printStackTrace();
            this.mOpenCameraListener.cameraOpenFail(new SpongeCameraAccessException(e7.getMessage(), "CameraAccessException from Camera2 openCamera", "getCameraCharacteristics", "CameraAccessException", System.currentTimeMillis()));
        }
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null) {
            this.mOpenCameraListener.cameraOpenFail(new SpongeCameraAccessException("StreamConfigurationMap is null", "NullPointException from Camera2 get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)", "get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)", "NullPointException", System.currentTimeMillis()));
        }
        this.fpsRange = findSuitableFps((Range[]) this.cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
        Range range = (Range) this.cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
        this.minExposureCompensation = ((Integer) range.getLower()).intValue();
        int iIntValue = ((Integer) range.getUpper()).intValue();
        this.maxExposureCompensation = iIntValue;
        if (this.minExposureCompensation == 0 && iIntValue == 0) {
            this.supportExposureCompensation = false;
        }
        this.exposureCompensationStep = ((Rational) this.cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP)).floatValue();
        this.supportFlash = ((Boolean) this.cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE)).booleanValue();
        float fFloatValue = ((Float) this.cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue();
        this.maxZoomValue = fFloatValue;
        this.supportZoom = fFloatValue > 0.0f;
        int[] iArr = (int[]) this.cameraCharacteristics.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            this.supportAutoFocus = false;
            this.supportContinuousFocus = false;
        } else {
            for (int i7 : iArr) {
                if (i7 == 1) {
                    this.supportAutoFocus = true;
                } else if (i7 == 3 || i7 == 4) {
                    this.supportContinuousFocus = true;
                }
            }
        }
        Size size = new Size(this.mPreviewWidth, this.mPreviewHeight);
        Size swappedDimensions = setSwappedDimensions();
        Size sizeChooseOptimalSize = chooseOptimalSize(streamConfigurationMap.getOutputSizes(SurfaceTexture.class), swappedDimensions.getWidth(), swappedDimensions.getHeight(), size);
        this.mPreviewSize = new CameraParameterConfigture.SpongeSize(sizeChooseOptimalSize.getWidth(), sizeChooseOptimalSize.getHeight());
        BLog.d(TAG, "openCamera: mAspectRatio --- " + size.getWidth() + "--" + size.getHeight());
        BLog.d(TAG, "openCamera: mPreviewSize --- " + this.mPreviewSize.getWidth() + "--" + this.mPreviewSize.getHeight());
        ImageReader imageReaderNewInstance = ImageReader.newInstance(this.mPreviewSize.getWidth(), this.mPreviewSize.getHeight(), 35, 2);
        this.mImageReader = imageReaderNewInstance;
        imageReaderNewInstance.setOnImageAvailableListener(new ImageAvailableListenerImp(), this.mBackgroundHandler);
        try {
            this.manager.openCamera(Integer.toString(this.mCameraId), this.mStateCallback, this.mBackgroundHandler);
            return 0;
        } catch (CameraAccessException e8) {
            this.mOpenCameraListener.cameraOpenFail(new SpongeCameraAccessException(e8.getMessage(), "CameraAccessException from Camera2 openCamera", "openCamera", "CameraAccessException", System.currentTimeMillis()));
            return 0;
        }
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public int releaseCamera() {
        BLog.d(TAG, "releaseCamera: ");
        OrientationEventListener orientationEventListener = this.mOrientationEventListener;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
            this.mOrientationEventListener = null;
        }
        releaseCaptureSession();
        releaseCameraDevice();
        releaseImageReader();
        this.mPreviewSurface = null;
        stopBackgroundThread();
        return 0;
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public void setCameraObject(Object obj, CameraParameterConfigture cameraParameterConfigture) {
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public void setCameraRawDataListener(ICameraRawDataListener iCameraRawDataListener) {
        this.mCameraAvailableListener = iCameraRawDataListener;
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public boolean setExposureCompensation(int i7) {
        CaptureRequest.Builder builder;
        if (!this.supportExposureCompensation || (builder = this.mPreviewRequestBuilder) == null) {
            return false;
        }
        this.mExposureCompensation = i7;
        int i8 = this.maxExposureCompensation;
        if (i7 > i8) {
            this.mExposureCompensation = i8;
        }
        int i9 = this.mExposureCompensation;
        int i10 = this.minExposureCompensation;
        if (i9 < i10) {
            this.mExposureCompensation = i10;
        }
        builder.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(this.mExposureCompensation));
        try {
            startPreview();
            return true;
        } catch (SpongeCameraAccessException e7) {
            e7.printStackTrace();
            return false;
        }
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public boolean setFlashMode(String str) {
        if (!this.supportFlash) {
            return false;
        }
        int iHandleParamFlashMode = handleParamFlashMode(str);
        this.mFlashMode = iHandleParamFlashMode;
        configureFlashMode(this.mPreviewRequestBuilder, iHandleParamFlashMode);
        try {
            startPreview();
            return true;
        } catch (SpongeCameraAccessException e7) {
            e7.printStackTrace();
            return false;
        }
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public boolean setFocusMode(String str) {
        if (str.equals(CameraParameterConfigture.CAMERA_PARAM_FOCUS_MODE_AUTO) && !this.supportAutoFocus) {
            return false;
        }
        if (str.equals(CameraParameterConfigture.CAMERA_PARAM_FOCUS_MODE_CONTINUE_PICTURE) && !this.supportContinuousFocus) {
            return false;
        }
        if (str.equals(CameraParameterConfigture.CAMERA_PARAM_FOCUS_MODE_CONTINUE_VIDEO) && !this.supportContinuousFocus) {
            return false;
        }
        int iHandleParamFocusMode = handleParamFocusMode(str);
        this.mFocusMode = iHandleParamFocusMode;
        this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(iHandleParamFocusMode));
        try {
            startPreview();
            return true;
        } catch (SpongeCameraAccessException e7) {
            e7.printStackTrace();
            return false;
        }
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public boolean setMeteringArea(Rect rect) {
        if (this.mCameraDevice == null || this.mPreviewRequestBuilder == null) {
            return false;
        }
        generateMeteringAreaRect(new MeteringRectangle(convertRectToCamera2(getViewableRect(), rect), 1000));
        setMeteringRectangleRequestBuilder(this.mPreviewRequestBuilder, CaptureRequest.CONTROL_AE_REGIONS);
        try {
            triggerFocus();
            return true;
        } catch (CameraAccessException e7) {
            e7.printStackTrace();
            return false;
        }
    }

    public void setPreviewSurface(SurfaceTexture surfaceTexture) {
        this.mSurfaceTexture = surfaceTexture;
    }

    public void setPreviewSurface(SurfaceHolder surfaceHolder) {
        this.mPreviewSurface = surfaceHolder.getSurface();
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public void setTextureId(int i7) {
        this.mTextureId = i7;
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public boolean setVideoStabilization(boolean z6) {
        CaptureRequest.Builder builder = this.mPreviewRequestBuilder;
        if (builder == null || !this.supportVideoStabilization) {
            return false;
        }
        builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, Integer.valueOf(z6 ? 1 : 0));
        return true;
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public boolean setWhiteBalanceModes(String str) {
        return false;
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public void startPreview() throws SpongeCameraAccessException {
        CaptureRequest.Builder builder;
        BLog.d(TAG, "startPreview");
        CameraCaptureSession cameraCaptureSession = this.mPreviewSession;
        if (cameraCaptureSession == null || (builder = this.mPreviewRequestBuilder) == null) {
            initPreviewRequest(true);
            return;
        }
        try {
            cameraCaptureSession.setRepeatingRequest(builder.build(), null, this.mBackgroundHandler);
        } catch (CameraAccessException e7) {
            e7.printStackTrace();
            throw new SpongeCameraAccessException(e7.getMessage(), "CameraAccessException from Camera2 startPreview", "setRepeatingRequest", "CameraAccessException", System.currentTimeMillis());
        }
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public void stopPreview() throws SpongeCameraAccessException {
        BLog.d(TAG, "stopPreview");
        CameraCaptureSession cameraCaptureSession = this.mPreviewSession;
        if (cameraCaptureSession == null || this.mPreviewRequestBuilder == null) {
            BLog.w(TAG, "stopPreview: mPreviewSession or mPreviewRequestBuilder is null");
            throw new SpongeCameraAccessException("mPreviewSession or mPreviewRequestBuilder is null", "CameraAccessException from Camera2 stopPreview", "stopPreview", "NullPointException", System.currentTimeMillis());
        }
        try {
            cameraCaptureSession.stopRepeating();
            this.mPreviewSession = null;
        } catch (CameraAccessException e7) {
            e7.printStackTrace();
            throw new SpongeCameraAccessException(e7.getMessage(), "CameraAccessException from Camera2 stopPreview", "stopPreview", "CameraAccessException", System.currentTimeMillis());
        }
    }

    @Override // com.bilibili.sponge.callback.ICamera
    public void switchCamera(IOpenCameraCallback iOpenCameraCallback) throws SpongeCameraAccessException {
        this.mCameraId ^= 1;
        b.b(this.mCameraId, TAG, new StringBuilder("switchCamera: mCameraId: "));
        releaseCaptureSession();
        releaseCameraDevice();
        releaseImageReader();
        this.mPreviewSurface = null;
        stopBackgroundThread();
        this.mCameraConfigture.setFrontCamera(!this.isFrontCamera);
        openCamera(this.mCameraConfigture, iOpenCameraCallback);
    }
}
