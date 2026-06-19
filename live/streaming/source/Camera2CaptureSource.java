package com.bilibili.live.streaming.source;

import android.content.ContentValues;
import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.media.Image;
import android.media.ImageReader;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.provider.MediaStore;
import androidx.annotation.RequiresPermission;
import com.bilibili.live.streaming.AVContext;
import com.bilibili.live.streaming.filter.FilterBase;
import com.bilibili.live.streaming.gl.BEGLContext;
import com.bilibili.live.streaming.gl.BGLMatrix;
import com.bilibili.live.streaming.gl.Shaders;
import com.bilibili.live.streaming.source.CameraGlobalConfig;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/source/Camera2CaptureSource.class */
public final class Camera2CaptureSource extends FilterBase {

    @NotNull
    public static final String CAMERA_HOLDER_KEY_CAMERA = "Camera";

    @NotNull
    public static final String CAMERA_HOLDER_KEY_CAMERA_HEIGHT = "CameraHeight";

    @NotNull
    public static final String CAMERA_HOLDER_KEY_CAMERA_ID = "CameraId";

    @NotNull
    public static final String CAMERA_HOLDER_KEY_CAMERA_WIDTH = "CameraWidth";

    @NotNull
    public static final String CAMERA_HOLDER_KEY_SURFACE_TEXTURE = "SurfaceTexture";
    public static final int CAMERA_LAND = 1;
    public static final int CAMERA_NONE = 0;
    public static final int CAMERA_PORT = 2;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String ID = "CameraCaptureSource";

    @NotNull
    public static final String IS_FRONT_CAMERA = "is_front_camera";

    @Nullable
    private String mCamId;

    @Nullable
    private CameraDevice mCamera;

    @Nullable
    private CameraCaptureSession mCameraCaptureSession;
    private int mCameraHeight;

    @Nullable
    private ImageReader mCameraImageReader;

    @NotNull
    private final Lazy mCameraManager$delegate = LazyKt.lazy(new CF.g(this, 5));

    @Nullable
    private ICameraReceiver mCameraReceiver;

    @Nullable
    private BGLMatrix mCameraSensorMatrix;
    private int mCameraWidth;

    @Nullable
    private DummyEncoder mDummyEnc;
    private int mHeight;

    @NotNull
    private Shaders.Primaries mInputPrimaries;

    @NotNull
    private Shaders.Transfer mInputTransfer;
    private boolean mUseDummyEnc;
    private int mWidth;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/source/Camera2CaptureSource$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/source/Camera2CaptureSource$HandlerExecutor.class */
    public static final class HandlerExecutor implements Executor {

        @NotNull
        private final Handler mHandler;

        public HandlerExecutor(@NotNull Handler handler) {
            this.mHandler = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(@NotNull Runnable runnable) {
            if (this.mHandler.post(runnable)) {
                return;
            }
            throw new RejectedExecutionException(this.mHandler + " is shutting down");
        }
    }

    public Camera2CaptureSource() {
        this.mUseDummyEnc = CameraGlobalConfig.Companion.getZteHacks() != 1 ? false : true;
        this.mInputTransfer = Shaders.Transfer.SRGB;
        this.mInputPrimaries = Shaders.Primaries.SRGB;
    }

    private final CameraManager getMCameraManager() {
        return (CameraManager) this.mCameraManager$delegate.getValue();
    }

    public static /* synthetic */ void loadConfig$default(Camera2CaptureSource camera2CaptureSource, boolean z6, Integer num, Integer num2, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            num = null;
        }
        if ((i8 & 4) != 0) {
            num2 = null;
        }
        if ((i8 & 8) != 0) {
            i7 = 0;
        }
        camera2CaptureSource.loadConfig(z6, num, num2, i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CameraManager mCameraManager_delegate$lambda$0(Camera2CaptureSource camera2CaptureSource) {
        return (CameraManager) camera2CaptureSource.mCtx.getActivityContext().getSystemService("camera");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCameraOpen$lambda$1(OutputConfiguration outputConfiguration) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NotImplementedError */
    public static final Unit onCameraOpen$lambda$10(Ref.LongRef longRef, Camera2CaptureSource camera2CaptureSource, List<Long> list, OutputConfiguration outputConfiguration) throws NotImplementedError {
        Shaders.Transfer transfer;
        outputConfiguration.setDynamicRangeProfile(longRef.element);
        long j7 = longRef.element;
        if (j7 == 2 || list.contains(Long.valueOf(j7))) {
            transfer = Shaders.Transfer.HLG;
        } else {
            if (longRef.element != 4) {
                throw new NotImplementedError("An operation is not implemented: Not supported DynamicRangeProfile");
            }
            transfer = Shaders.Transfer.PQ;
        }
        camera2CaptureSource.mInputTransfer = transfer;
        CameraGlobalConfig.Companion companion = CameraGlobalConfig.Companion;
        camera2CaptureSource.mInputPrimaries = companion.getPrimaries() == 0 ? Shaders.Primaries.BT2020 : companion.getPrimaries() == 1 ? Shaders.Primaries.SRGB : Shaders.Primaries.DISPLAY_P3;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:5:0x001a
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static final kotlin.Unit onCameraOpen$lambda$11(android.hardware.camera2.CaptureRequest.Builder r4) {
        /*
            android.hardware.camera2.CaptureRequest$Key r0 = new android.hardware.camera2.CaptureRequest$Key     // Catch: java.lang.Exception -> L1a
            r5 = r0
            r0 = r5
            java.lang.String r1 = "org.quic.camera2.streamconfigs.HDRVideoMode"
            java.lang.Class r2 = java.lang.Byte.TYPE     // Catch: java.lang.Exception -> L1a
            r0.<init>(r1, r2)     // Catch: java.lang.Exception -> L1a
            r0 = r4
            r1 = r5
            r2 = 2
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)     // Catch: java.lang.Exception -> L1a
            r0.set(r1, r2)     // Catch: java.lang.Exception -> L1a
        L16:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Exception -> L1a
            return r0
        L1a:
            r4 = move-exception
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.live.streaming.source.Camera2CaptureSource.onCameraOpen$lambda$11(android.hardware.camera2.CaptureRequest$Builder):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCameraOpen$lambda$2(CaptureRequest.Builder builder) {
        return Unit.INSTANCE;
    }

    @Nullable
    public final <T> T CheckNull(@Nullable T t7, @NotNull String str) {
        return t7;
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    public void destroy() throws Exception {
        stopCapture();
        ImageReader imageReader = this.mCameraImageReader;
        if (imageReader != null) {
            imageReader.close();
        }
        DummyEncoder dummyEncoder = this.mDummyEnc;
        if (dummyEncoder != null) {
            dummyEncoder.close();
        }
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    public int getHeight() {
        return this.mHeight;
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    @NotNull
    public String getID() {
        return "CameraCaptureSource";
    }

    @Nullable
    public final String getMCamId() {
        return this.mCamId;
    }

    @Nullable
    public final CameraDevice getMCamera() {
        return this.mCamera;
    }

    @Nullable
    public final CameraCaptureSession getMCameraCaptureSession() {
        return this.mCameraCaptureSession;
    }

    public final int getMCameraHeight() {
        return this.mCameraHeight;
    }

    @Nullable
    public final ImageReader getMCameraImageReader() {
        return this.mCameraImageReader;
    }

    @Nullable
    public final ICameraReceiver getMCameraReceiver() {
        return this.mCameraReceiver;
    }

    @Nullable
    public final BGLMatrix getMCameraSensorMatrix() {
        return this.mCameraSensorMatrix;
    }

    public final int getMCameraWidth() {
        return this.mCameraWidth;
    }

    @Nullable
    public final DummyEncoder getMDummyEnc() {
        return this.mDummyEnc;
    }

    public final int getMHeight() {
        return this.mHeight;
    }

    @NotNull
    public final Shaders.Primaries getMInputPrimaries() {
        return this.mInputPrimaries;
    }

    @NotNull
    public final Shaders.Transfer getMInputTransfer() {
        return this.mInputTransfer;
    }

    public final boolean getMUseDummyEnc() {
        return this.mUseDummyEnc;
    }

    public final int getMWidth() {
        return this.mWidth;
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    public int getWidth() {
        return this.mWidth;
    }

    @Override // com.bilibili.live.streaming.filter.FilterBase, com.bilibili.live.streaming.filter.IVideoSource
    public void init(@Nullable AVContext aVContext) {
        super.init(aVContext);
    }

    public final void loadConfig(boolean z6, @Nullable Integer num, @Nullable Integer num2, int i7) {
        startCapture();
    }

    public final void onCameraDisconnected() {
    }

    public final void onCameraError() {
    }

    /* JADX WARN: Removed duplicated region for block: B:194:0x089b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCameraOpen() throws android.hardware.camera2.CameraAccessException {
        /*
            Method dump skipped, instruction units count: 2245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.live.streaming.source.Camera2CaptureSource.onCameraOpen():void");
    }

    @Override // com.bilibili.live.streaming.filter.FilterBase, com.bilibili.live.streaming.filter.IVideoSource
    public int preferFitMode() {
        return 3;
    }

    @Override // com.bilibili.live.streaming.filter.FilterBase, com.bilibili.live.streaming.filter.IVideoSource
    public boolean render() {
        BEGLContext eglContext;
        ICameraReceiver iCameraReceiver = this.mCameraReceiver;
        if (iCameraReceiver == null || (eglContext = this.mCtx.getEglContext()) == null) {
            return false;
        }
        eglContext.getTransState().pushUVPreTrans(this.mCameraSensorMatrix);
        try {
            return iCameraReceiver.render(eglContext.getInputTexDrawer(this.mInputTransfer, this.mInputPrimaries));
        } finally {
            eglContext.getTransState().popUVPreTrans();
        }
    }

    public final void saveP010(@NotNull Image image) throws IOException {
        OutputStream outputStreamOpenOutputStream;
        Image.Plane plane = image.getPlanes()[0];
        Image.Plane plane2 = image.getPlanes()[1];
        int width = image.getWidth();
        int height = image.getHeight();
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", "p010_1920x1080");
        contentValues.put("mime_type", "application/octet-stream");
        contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS + "/camera2_raw_p010");
        Context activityContext = this.mCtx.getActivityContext();
        Uri uriInsert = activityContext.getContentResolver().insert(MediaStore.Files.getContentUri("external"), contentValues);
        if (uriInsert == null || (outputStreamOpenOutputStream = activityContext.getContentResolver().openOutputStream(uriInsert, "w")) == null) {
            return;
        }
        byte[] bArr = new byte[((plane2.getRowStride() * height) / 2) + (plane.getRowStride() * height)];
        ByteBuffer buffer = plane.getBuffer();
        int i7 = 0;
        for (int i8 = 0; i8 < height; i8++) {
            buffer.position(plane.getRowStride() * i8);
            int i9 = width * 2;
            buffer.get(bArr, i7, i9);
            i7 += i9;
        }
        ByteBuffer buffer2 = plane2.getBuffer();
        int i10 = height / 2;
        int i11 = i7;
        for (int i12 = 0; i12 < i10; i12++) {
            buffer2.position(plane2.getRowStride() * i12);
            int i13 = (width / 2) * 4;
            buffer2.get(bArr, i11, i13);
            i11 += i13;
        }
        outputStreamOpenOutputStream.write(bArr);
        outputStreamOpenOutputStream.flush();
        outputStreamOpenOutputStream.close();
    }

    public final void setMCamId(@Nullable String str) {
        this.mCamId = str;
    }

    public final void setMCamera(@Nullable CameraDevice cameraDevice) {
        this.mCamera = cameraDevice;
    }

    public final void setMCameraCaptureSession(@Nullable CameraCaptureSession cameraCaptureSession) {
        this.mCameraCaptureSession = cameraCaptureSession;
    }

    public final void setMCameraHeight(int i7) {
        this.mCameraHeight = i7;
    }

    public final void setMCameraImageReader(@Nullable ImageReader imageReader) {
        this.mCameraImageReader = imageReader;
    }

    public final void setMCameraReceiver(@Nullable ICameraReceiver iCameraReceiver) {
        this.mCameraReceiver = iCameraReceiver;
    }

    public final void setMCameraSensorMatrix(@Nullable BGLMatrix bGLMatrix) {
        this.mCameraSensorMatrix = bGLMatrix;
    }

    public final void setMCameraWidth(int i7) {
        this.mCameraWidth = i7;
    }

    public final void setMDummyEnc(@Nullable DummyEncoder dummyEncoder) {
        this.mDummyEnc = dummyEncoder;
    }

    public final void setMHeight(int i7) {
        this.mHeight = i7;
    }

    public final void setMInputPrimaries(@NotNull Shaders.Primaries primaries) {
        this.mInputPrimaries = primaries;
    }

    public final void setMInputTransfer(@NotNull Shaders.Transfer transfer) {
        this.mInputTransfer = transfer;
    }

    public final void setMUseDummyEnc(boolean z6) {
        this.mUseDummyEnc = z6;
    }

    public final void setMWidth(int i7) {
        this.mWidth = i7;
    }

    @RequiresPermission("android.permission.CAMERA")
    public final boolean startCapture() throws CameraAccessException {
        String str = (String) ArraysKt.firstOrNull(getMCameraManager().getCameraIdList());
        if (str == null) {
            return false;
        }
        this.mCamId = str;
        getMCameraManager().openCamera(str, new CameraDevice.StateCallback(this) { // from class: com.bilibili.live.streaming.source.Camera2CaptureSource.startCapture.1
            final Camera2CaptureSource this$0;

            {
                this.this$0 = this;
            }

            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public void onDisconnected(CameraDevice cameraDevice) {
                if (this.this$0.getMCamera() != null) {
                    Intrinsics.areEqual(this.this$0.getMCamera(), cameraDevice);
                    this.this$0.onCameraDisconnected();
                }
                cameraDevice.close();
            }

            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public void onError(CameraDevice cameraDevice, int i7) {
                this.this$0.onCameraError();
            }

            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public void onOpened(CameraDevice cameraDevice) throws CameraAccessException {
                this.this$0.setMCamera(cameraDevice);
                this.this$0.onCameraOpen();
            }
        }, (Handler) null);
        return true;
    }

    public final void stopCapture() throws Exception {
        CameraCaptureSession cameraCaptureSession = this.mCameraCaptureSession;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.stopRepeating();
            cameraCaptureSession.close();
            this.mCameraCaptureSession = null;
        }
        CameraDevice cameraDevice = this.mCamera;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.mCamera = null;
            this.mCamId = null;
        }
        ICameraReceiver iCameraReceiver = this.mCameraReceiver;
        if (iCameraReceiver != null) {
            iCameraReceiver.close();
            this.mCameraReceiver = null;
        }
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    public void tick(long j7) {
        ICameraReceiver iCameraReceiver = this.mCameraReceiver;
        if (iCameraReceiver != null) {
            iCameraReceiver.tick();
        }
    }
}
