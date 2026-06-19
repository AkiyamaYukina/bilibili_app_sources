package com.bilibili.live.streaming.camera;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import com.bilibili.live.streaming.helper.CameraHelper;
import com.bilibili.live.streaming.log.LivePusherLog;
import com.bilibili.live.streaming.utils.ExtMethodsKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/camera/CameraWrapper.class */
public final class CameraWrapper {

    @NotNull
    public static final String TAG = "CameraWrapper";
    private int cameraIndex;
    private int cameraNum;

    @NotNull
    private Pair<Integer, Integer> cameraPreviewSize;
    private boolean isPort;

    @Nullable
    private Camera mCamera;
    private volatile boolean mIsPreview;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final Pair<Integer, Integer>[] CAMERA_STANDARD_PREVIEW_SIZE = {new Pair<>(1920, 1080)};

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/camera/CameraWrapper$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/camera/CameraWrapper$DetachedCamera.class */
    public static final class DetachedCamera {

        @NotNull
        private final Camera camera;
        private final int cameraIndex;
        private final int height;
        private final int width;

        public DetachedCamera(@NotNull Camera camera, int i7, int i8, int i9) {
            this.camera = camera;
            this.cameraIndex = i7;
            this.width = i8;
            this.height = i9;
        }

        @NotNull
        public final Camera getCamera() {
            return this.camera;
        }

        public final int getCameraIndex() {
            return this.cameraIndex;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getWidth() {
            return this.width;
        }
    }

    public CameraWrapper(@NotNull Camera camera, int i7, boolean z6, @Nullable Integer num, @Nullable Integer num2) {
        this.cameraPreviewSize = new Pair<>(0, 0);
        this.isPort = true;
        this.cameraNum = CameraHelper.Companion.getNumOfCameras();
        this.isPort = z6;
        takeCamera(camera, i7, num, num2);
    }

    public /* synthetic */ CameraWrapper(Camera camera, int i7, boolean z6, Integer num, Integer num2, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(camera, i7, z6, (i8 & 8) != 0 ? null : num, (i8 & 16) != 0 ? null : num2);
    }

    public CameraWrapper(boolean z6, boolean z7) {
        this.cameraPreviewSize = new Pair<>(0, 0);
        this.isPort = true;
        this.cameraNum = CameraHelper.Companion.getNumOfCameras();
        this.isPort = z6;
        setFront(z7);
        prepareCamera();
    }

    private final int getCameraID(boolean z6) {
        return z6 ? 1 : 0;
    }

    private final int getCameraOrientation(int i7) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(i7, cameraInfo);
        return cameraInfo.orientation;
    }

    private final boolean getIsFront(int i7) {
        boolean z6 = true;
        if (i7 != 1) {
            z6 = false;
        }
        return z6;
    }

    private final void openCamera() {
        try {
            this.mCamera = Camera.open(this.cameraIndex);
        } catch (Exception e7) {
            LivePusherLog.e(TAG, ExtMethodsKt.getKtMessage(e7), e7);
        }
    }

    private final void prepareCamera() {
        Camera.Size size;
        Object next;
        int i7 = this.cameraNum;
        if (i7 == 0) {
            return;
        }
        if (i7 == 1) {
            LivePusherLog.w$default(TAG, "only one camera", null, 4, null);
        }
        openCamera();
        Camera camera = this.mCamera;
        if (camera == null) {
            return;
        }
        Camera.Parameters parameters = camera.getParameters();
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        if (supportedPreviewSizes.isEmpty()) {
            return;
        }
        Pair<Integer, Integer>[] pairArr = CAMERA_STANDARD_PREVIEW_SIZE;
        int length = pairArr.length;
        int i8 = 0;
        while (true) {
            if (i8 >= length) {
                size = null;
                break;
            }
            Pair<Integer, Integer> pair = pairArr[i8];
            Iterator<T> it = supportedPreviewSizes.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Camera.Size size2 = (Camera.Size) next;
                if (size2.width == ((Number) pair.getFirst()).intValue() && size2.height == ((Number) pair.getSecond()).intValue()) {
                    break;
                }
            }
            size = (Camera.Size) next;
            if (size != null) {
                break;
            } else {
                i8++;
            }
        }
        Camera.Size size3 = size;
        if (size == null) {
            size3 = (Camera.Size) CollectionsKt.first(supportedPreviewSizes);
        }
        Pair<Integer, Integer> pair2 = new Pair<>(Integer.valueOf(size3.width), Integer.valueOf(size3.height));
        this.cameraPreviewSize = pair2;
        CameraHelper.Companion companion = CameraHelper.Companion;
        companion.setPreviewSize(parameters, ((Number) pair2.getFirst()).intValue(), ((Number) this.cameraPreviewSize.getSecond()).intValue());
        companion.setFocusMode(parameters);
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(this.cameraIndex, cameraInfo);
        int i9 = this.isPort ? 0 : 90;
        camera.setDisplayOrientation(cameraInfo.facing == 1 ? (360 - ((cameraInfo.orientation + i9) % 360)) % 360 : ((cameraInfo.orientation - i9) + 360) % 360);
        try {
            camera.setParameters(parameters);
        } catch (Throwable th) {
            LivePusherLog.e(TAG, ExtMethodsKt.getKtMessage(th), th);
            camera.release();
        }
    }

    private final void release() {
        Camera camera = this.mCamera;
        if (camera != null) {
            camera.release();
        }
        this.mCamera = null;
    }

    private final void takeCamera(Camera camera, int i7, Integer num, Integer num2) {
        this.mCamera = camera;
        setFront(i7 == 1);
        try {
            Camera.Size previewSize = camera.getParameters().getPreviewSize();
            this.cameraPreviewSize = new Pair<>(Integer.valueOf(num != null ? num.intValue() : previewSize.width), Integer.valueOf(num2 != null ? num2.intValue() : previewSize.height));
        } catch (Exception e7) {
            LivePusherLog.e(TAG, "CameraWrapper.takeCamera: fail to get camera preview size", e7);
            this.cameraPreviewSize = new Pair<>(1920, 1080);
        }
        this.mIsPreview = true;
    }

    public static /* synthetic */ void takeCamera$default(CameraWrapper cameraWrapper, Camera camera, int i7, Integer num, Integer num2, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            num = null;
        }
        if ((i8 & 8) != 0) {
            num2 = null;
        }
        cameraWrapper.takeCamera(camera, i7, num, num2);
    }

    @Nullable
    public final DetachedCamera detach() {
        try {
            this.mIsPreview = false;
            Camera camera = this.mCamera;
            if (camera != null) {
                return new DetachedCamera(camera, this.cameraIndex, ((Number) this.cameraPreviewSize.getFirst()).intValue(), ((Number) this.cameraPreviewSize.getSecond()).intValue());
            }
            this.mCamera = null;
            return null;
        } finally {
            this.mCamera = null;
        }
    }

    @Nullable
    public final Camera getCamera() {
        return this.mCamera;
    }

    public final int getCameraOrientation() {
        int i7 = this.cameraIndex;
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(i7, cameraInfo);
        return cameraInfo.orientation;
    }

    @NotNull
    public final Pair<Integer, Integer> getCameraPreviewSize() {
        return this.cameraPreviewSize;
    }

    public final boolean isFront() {
        boolean z6 = true;
        if (this.cameraIndex != 1) {
            z6 = false;
        }
        return z6;
    }

    public final void setFront(boolean z6) {
        this.cameraIndex = z6 ? 1 : 0;
    }

    public final boolean startPreview(@NotNull SurfaceTexture surfaceTexture) {
        boolean z6 = false;
        if (this.mCamera != null) {
            if (this.mIsPreview) {
                z6 = false;
            } else {
                try {
                    Camera camera = this.mCamera;
                    if (camera != null) {
                        camera.setPreviewTexture(surfaceTexture);
                    }
                    Camera camera2 = this.mCamera;
                    if (camera2 != null) {
                        camera2.startPreview();
                    }
                    this.mIsPreview = true;
                    z6 = true;
                } catch (Exception e7) {
                    stopPreview();
                    LivePusherLog.e(TAG, "An exception occurred while camera opening preview failed, error_msg: " + e7.getMessage(), e7);
                    z6 = false;
                }
            }
        }
        return z6;
    }

    public final void stopPreview() {
        if (this.mIsPreview) {
            try {
                try {
                    Camera camera = this.mCamera;
                    if (camera != null) {
                        camera.stopPreview();
                    }
                    Camera camera2 = this.mCamera;
                    if (camera2 != null) {
                        camera2.setPreviewTexture(null);
                    }
                    release();
                } catch (Exception e7) {
                    LivePusherLog.e(TAG, "An exception occurred while camera stopping preview failed, error_msg: " + e7.getMessage(), e7);
                }
            } finally {
                this.mIsPreview = false;
                this.mCamera = null;
            }
        }
    }
}
