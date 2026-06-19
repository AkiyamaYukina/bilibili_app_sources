package com.bilibili.live.streaming.source;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import com.bilibili.live.streaming.AVContext;
import com.bilibili.live.streaming.camera.CameraWrapper;
import com.bilibili.live.streaming.gl.BEGLContext;
import com.bilibili.live.streaming.gl.BGLDrawer;
import com.bilibili.live.streaming.gl.BGLException;
import com.bilibili.live.streaming.gl.BGLMatrix;
import com.bilibili.live.streaming.gl.BGLTexture;
import com.bilibili.live.streaming.gl.BGLTransState;
import com.bilibili.live.streaming.gl.Shaders;
import com.bilibili.live.streaming.log.LivePusherLog;
import java.util.HashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/source/CameraCaptureSource.class */
public final class CameraCaptureSource extends CaptureSource {

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
    private long beautyProcessTime;
    private int inputResizeCameraHeight;
    private int inputResizeCameraWidth;
    private boolean isFrontCameraValue;

    @Nullable
    private BeautyFilter mBeautyFilter;

    @NotNull
    private BGLMatrix mCameraDirectionMatrix;

    @Nullable
    private CameraWrapper mCameraWrapper;

    @NotNull
    private BGLMatrix mMirrorMatrix;
    private volatile boolean mNeedBeauty;

    @Nullable
    private BGLTexture mOffscreenTexture;
    private int mOrientation;
    private int mProcessedTexId;
    private boolean isPort = true;
    private boolean mirror = true;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/source/CameraCaptureSource$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public CameraCaptureSource() {
        BGLMatrix.Companion companion = BGLMatrix.Companion;
        this.mMirrorMatrix = companion.create().setIdent();
        this.mCameraDirectionMatrix = companion.create().setIdent();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void applyCameraDirectionMatrix() throws NoWhenBranchMatchedException {
        boolean z6 = this.isPort;
        if (z6) {
            BGLMatrix ident = this.mCameraDirectionMatrix.setIdent();
            float[] fArrData = ident.data();
            for (int i7 = 0; i7 < 4; i7++) {
                BGLMatrix.Companion companion = BGLMatrix.Companion;
                float f7 = fArrData[12 + i7];
                if (f7 != 0.0f) {
                    float f8 = fArrData[i7];
                    float f9 = f7 * (-0.5f);
                    fArrData[i7] = f8 + f9;
                    int i8 = 4 + i7;
                    fArrData[i8] = fArrData[i8] + f9;
                }
            }
            float[] fArrData2 = ident.data();
            for (int i9 = 0; i9 < 4; i9++) {
                BGLMatrix.Companion companion2 = BGLMatrix.Companion;
                fArrData2[i9] = fArrData2[i9] * (-1.0f);
                int i10 = 4 + i9;
                fArrData2[i10] = fArrData2[i10] * 1.0f;
            }
            float[] fArrData3 = ident.data();
            for (int i11 = 0; i11 < 4; i11++) {
                BGLMatrix.Companion companion3 = BGLMatrix.Companion;
                float f10 = fArrData3[12 + i11];
                if (f10 != 0.0f) {
                    float f11 = fArrData3[i11];
                    float f12 = f10 * 0.5f;
                    fArrData3[i11] = f11 + f12;
                    int i12 = 4 + i11;
                    fArrData3[i12] = fArrData3[i12] + f12;
                }
            }
            return;
        }
        if (z6) {
            throw new NoWhenBranchMatchedException();
        }
        BGLMatrix ident2 = this.mCameraDirectionMatrix.setIdent();
        float[] fArrData4 = ident2.data();
        for (int i13 = 0; i13 < 4; i13++) {
            BGLMatrix.Companion companion4 = BGLMatrix.Companion;
            float f13 = fArrData4[12 + i13];
            if (f13 != 0.0f) {
                float f14 = fArrData4[i13];
                float f15 = f13 * (-0.5f);
                fArrData4[i13] = f14 + f15;
                int i14 = 4 + i13;
                fArrData4[i14] = fArrData4[i14] + f15;
            }
        }
        float[] fArrData5 = ident2.data();
        for (int i15 = 0; i15 < 4; i15++) {
            BGLMatrix.Companion companion5 = BGLMatrix.Companion;
            fArrData5[i15] = fArrData5[i15] * 1.0f;
            int i16 = 4 + i15;
            fArrData5[i16] = fArrData5[i16] * (-1.0f);
        }
        float[] fArrData6 = ident2.data();
        for (int i17 = 0; i17 < 4; i17++) {
            BGLMatrix.Companion companion6 = BGLMatrix.Companion;
            float f16 = fArrData6[12 + i17];
            if (f16 != 0.0f) {
                float f17 = fArrData6[i17];
                float f18 = f16 * 0.5f;
                fArrData6[i17] = f17 + f18;
                int i18 = 4 + i17;
                fArrData6[i18] = fArrData6[i18] + f18;
            }
        }
    }

    private final void applyMirrorMatrix() {
        BGLMatrix ident = this.mMirrorMatrix.setIdent();
        float[] fArrData = ident.data();
        for (int i7 = 0; i7 < 4; i7++) {
            BGLMatrix.Companion companion = BGLMatrix.Companion;
            float f7 = fArrData[12 + i7];
            if (f7 != 0.0f) {
                float f8 = fArrData[i7];
                float f9 = (-0.5f) * f7;
                fArrData[i7] = f8 + f9;
                int i8 = 4 + i7;
                fArrData[i8] = fArrData[i8] + f9;
            }
        }
        float[] fArrData2 = ident.data();
        for (int i9 = 0; i9 < 4; i9++) {
            BGLMatrix.Companion companion2 = BGLMatrix.Companion;
            fArrData2[i9] = fArrData2[i9] * (-1.0f);
            int i10 = 4 + i9;
            fArrData2[i10] = fArrData2[i10] * 1.0f;
        }
        float[] fArrData3 = ident.data();
        for (int i11 = 0; i11 < 4; i11++) {
            BGLMatrix.Companion companion3 = BGLMatrix.Companion;
            float f10 = fArrData3[12 + i11];
            if (f10 != 0.0f) {
                float f11 = fArrData3[i11];
                float f12 = 0.5f * f10;
                fArrData3[i11] = f11 + f12;
                int i12 = 4 + i11;
                fArrData3[i12] = fArrData3[i12] + f12;
            }
        }
    }

    private final void createCaptureTexture() {
        Integer num;
        CameraWrapper cameraWrapper = this.mCameraWrapper;
        if (cameraWrapper != null) {
            cameraWrapper.stopPreview();
        }
        this.mCameraWrapper = null;
        HashMap<String, Object> cameraHolder = this.mCtx.getCameraHolder();
        Camera camera = (Camera) cameraHolder.get("Camera");
        if (camera != null && (num = (Integer) cameraHolder.get("CameraId")) != null) {
            int iIntValue = num.intValue();
            SurfaceTexture surfaceTexture = (SurfaceTexture) cameraHolder.get("SurfaceTexture");
            if (surfaceTexture != null) {
                cameraHolder.remove("Camera");
                cameraHolder.remove("CameraId");
                cameraHolder.remove("SurfaceTexture");
                attachCaptureTexture(surfaceTexture);
                if (getMCaptureSurfaceTexture() == null || this.mCtx == null) {
                    return;
                }
                Integer num2 = (Integer) cameraHolder.get("CameraWidth");
                Integer num3 = (Integer) cameraHolder.get("CameraHeight");
                if (num2 != null) {
                    cameraHolder.remove("CameraWidth");
                }
                if (num3 != null) {
                    cameraHolder.remove("CameraHeight");
                }
                this.mCameraWrapper = new CameraWrapper(camera, iIntValue, this.isPort, num2, num3);
                syncCameraStatus();
                syncCameraId();
                return;
            }
        }
        attachCaptureTexture();
        SurfaceTexture mCaptureSurfaceTexture = getMCaptureSurfaceTexture();
        if (mCaptureSurfaceTexture == null) {
            return;
        }
        CameraWrapper cameraWrapper2 = new CameraWrapper(this.isPort, this.isFrontCameraValue);
        cameraWrapper2.startPreview(mCaptureSurfaceTexture);
        this.mCameraWrapper = cameraWrapper2;
        getMHasFrameArrived().set(0L);
        syncCameraStatus();
        syncCameraId();
    }

    public static /* synthetic */ void loadConfig$default(CameraCaptureSource cameraCaptureSource, boolean z6, Integer num, Integer num2, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            num = null;
        }
        if ((i8 & 4) != 0) {
            num2 = null;
        }
        if ((i8 & 8) != 0) {
            i7 = 0;
        }
        cameraCaptureSource.loadConfig(z6, num, num2, i7);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02cb A[PHI: r11 r18 r22
  0x02cb: PHI (r11v9 int) = (r11v7 int), (r11v16 int) binds: [B:145:0x0353, B:121:0x02c8] A[DONT_GENERATE, DONT_INLINE]
  0x02cb: PHI (r18v17 kotlin.Pair<java.lang.Integer, java.lang.Integer>) = (r18v15 kotlin.Pair<java.lang.Integer, java.lang.Integer>), (r18v28 kotlin.Pair<java.lang.Integer, java.lang.Integer>) binds: [B:145:0x0353, B:121:0x02c8] A[DONT_GENERATE, DONT_INLINE]
  0x02cb: PHI (r22v12 com.bilibili.live.streaming.gl.BGLTransState) = (r22v11 com.bilibili.live.streaming.gl.BGLTransState), (r22v19 com.bilibili.live.streaming.gl.BGLTransState) binds: [B:145:0x0353, B:121:0x02c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x045c A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:220:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void offscreenRender(long r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1153
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.live.streaming.source.CameraCaptureSource.offscreenRender(long):void");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void renderCameraTexture() throws NoWhenBranchMatchedException {
        BGLDrawer inputTexDrawer;
        BEGLContext eglContext = this.mCtx.getEglContext();
        if (eglContext == null || (inputTexDrawer = eglContext.getInputTexDrawer(Shaders.Transfer.SRGB, Shaders.Primaries.SRGB)) == null) {
            return;
        }
        applyCameraDirectionMatrix();
        BGLTransState transState = eglContext.getTransState();
        if (transState != null) {
            transState.pushUVPreTrans(this.mCameraDirectionMatrix);
        }
        BGLTransState transState2 = eglContext.getTransState();
        if (transState2 != null) {
            transState2.pushUVPreTrans(getMTransformMatrix());
        }
        BGLTransState transState3 = eglContext.getTransState();
        if (transState3 != null) {
            transState3.pushUVPreTrans(this.mMirrorMatrix);
        }
        try {
            BGLTexture mCaptureTexture = getMCaptureTexture();
            if (mCaptureTexture != null) {
                inputTexDrawer.drawTexOESMix(mCaptureTexture);
            }
        } finally {
            eglContext.getTransState().popUVPreTrans();
            eglContext.getTransState().popUVPreTrans();
            eglContext.getTransState().popUVPreTrans();
        }
    }

    private final void renderProcessedTexture() throws BGLException {
        BGLDrawer inputTexDrawer;
        BGLTexture bGLTextureAttachTex2D = BGLTexture.attachTex2D(this.mProcessedTexId);
        try {
            try {
                bGLTextureAttachTex2D.setLinearSampler();
                BEGLContext eglContext = this.mCtx.getEglContext();
                if (eglContext != null && (inputTexDrawer = eglContext.getInputTexDrawer(Shaders.Transfer.SRGB, Shaders.Primaries.SRGB)) != null) {
                    inputTexDrawer.drawTex(bGLTextureAttachTex2D);
                }
            } catch (BGLException e7) {
                LivePusherLog.e("CameraCaptureSource", "camera render exception msg: " + e7.getMessage(), e7);
            }
        } finally {
            bGLTextureAttachTex2D.detachTex();
            bGLTextureAttachTex2D.destroy();
        }
    }

    private final void revertMirrorMatrix() {
        this.mMirrorMatrix.setIdent();
    }

    private final void syncCameraId() {
        this.mCtx.getCameraHolder().put("CameraId", Integer.valueOf(isFrontCamera() ? 1 : 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void syncCameraOrientation() {
        /*
            r3 = this;
            r0 = r3
            com.bilibili.live.streaming.AVContext r0 = r0.mCtx
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L18
            r0 = r7
            int r0 = r0.getCameraDegrees()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7 = r0
            goto L1b
        L18:
            r0 = 0
            r7 = r0
        L1b:
            r0 = r3
            int r0 = r0.mOrientation
            r4 = r0
            r0 = 0
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r4
            r1 = 1
            if (r0 == r1) goto L4a
            r0 = r4
            r1 = 2
            if (r0 == r1) goto L48
            r0 = r7
            if (r0 == 0) goto L48
            r0 = r7
            int r0 = r0.intValue()
            if (r0 == 0) goto L48
            r0 = r6
            r5 = r0
            r0 = r7
            int r0 = r0.intValue()
            r1 = 180(0xb4, float:2.52E-43)
            if (r0 != r1) goto L4a
        L48:
            r0 = 1
            r5 = r0
        L4a:
            r0 = r3
            r1 = r5
            r0.isPort = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.live.streaming.source.CameraCaptureSource.syncCameraOrientation():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void syncCameraStatus() {
        /*
            r3 = this;
            r0 = r3
            boolean r0 = r0.isPort
            r6 = r0
            r0 = 0
            r5 = r0
            r0 = r6
            if (r0 == 0) goto L36
            r0 = r3
            com.bilibili.live.streaming.camera.CameraWrapper r0 = r0.mCameraWrapper
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L31
            r0 = r7
            kotlin.Pair r0 = r0.getCameraPreviewSize()
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L31
            r0 = r7
            java.lang.Object r0 = r0.getSecond()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r4 = r0
            goto L59
        L31:
            r0 = 0
            r4 = r0
            goto L59
        L36:
            r0 = r3
            com.bilibili.live.streaming.camera.CameraWrapper r0 = r0.mCameraWrapper
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L31
            r0 = r7
            kotlin.Pair r0 = r0.getCameraPreviewSize()
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L31
            r0 = r7
            java.lang.Object r0 = r0.getFirst()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r4 = r0
        L59:
            r0 = r3
            r1 = r4
            r0.setMWidth(r1)
            r0 = r3
            boolean r0 = r0.isPort
            if (r0 == 0) goto L8f
            r0 = r3
            com.bilibili.live.streaming.camera.CameraWrapper r0 = r0.mCameraWrapper
            r7 = r0
            r0 = r5
            r4 = r0
            r0 = r7
            if (r0 == 0) goto Lb6
            r0 = r7
            kotlin.Pair r0 = r0.getCameraPreviewSize()
            r7 = r0
            r0 = r5
            r4 = r0
            r0 = r7
            if (r0 == 0) goto Lb6
            r0 = r7
            java.lang.Object r0 = r0.getFirst()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r4 = r0
            goto Lb6
        L8f:
            r0 = r3
            com.bilibili.live.streaming.camera.CameraWrapper r0 = r0.mCameraWrapper
            r7 = r0
            r0 = r5
            r4 = r0
            r0 = r7
            if (r0 == 0) goto Lb6
            r0 = r7
            kotlin.Pair r0 = r0.getCameraPreviewSize()
            r7 = r0
            r0 = r5
            r4 = r0
            r0 = r7
            if (r0 == 0) goto Lb6
            r0 = r7
            java.lang.Object r0 = r0.getSecond()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r4 = r0
        Lb6:
            r0 = r3
            r1 = r4
            r0.setMHeight(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.live.streaming.source.CameraCaptureSource.syncCameraStatus():void");
    }

    public final void changeMirror(boolean z6) {
        synchronized (this) {
            if (z6 == this.mirror) {
                return;
            }
            this.mirror = z6;
            LivePusherLog.i$default("CameraCaptureSource", "mirror status: " + z6, null, 4, null);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.bilibili.live.streaming.source.CaptureSource, com.bilibili.live.streaming.filter.IVideoSource
    public void destroy() {
        LivePusherLog.i$default("CameraCaptureSource", this + ", destroy!", null, 4, null);
        BeautyFilter beautyFilter = this.mBeautyFilter;
        if (beautyFilter != null) {
            beautyFilter.onSourceClear();
        }
        setBeautyFilter(null);
        BGLTexture bGLTexture = this.mOffscreenTexture;
        if (bGLTexture != null) {
            bGLTexture.destroy();
        }
        this.mOffscreenTexture = null;
        CameraWrapper cameraWrapper = this.mCameraWrapper;
        if (cameraWrapper != null) {
            cameraWrapper.stopPreview();
        }
        this.mCameraWrapper = null;
        AVContext aVContext = this.mCtx;
        aVContext.setBeautyProcessTotalTime(aVContext.getBeautyProcessTotalTime() + this.beautyProcessTime);
        this.beautyProcessTime = 0L;
        super.destroy();
    }

    @Override // com.bilibili.live.streaming.source.CaptureSource
    public void finalize() {
        super.finalize();
    }

    @Nullable
    public final Camera getCamera() {
        CameraWrapper cameraWrapper = this.mCameraWrapper;
        return cameraWrapper != null ? cameraWrapper.getCamera() : null;
    }

    public final int getCameraOrientation() {
        CameraWrapper cameraWrapper = this.mCameraWrapper;
        return cameraWrapper != null ? cameraWrapper.getCameraOrientation() : 0;
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    @NotNull
    public String getID() {
        return "CameraCaptureSource";
    }

    @Override // com.bilibili.live.streaming.filter.FilterBase, com.bilibili.live.streaming.filter.IVideoSource
    public void init(@Nullable AVContext aVContext) {
        super.init(aVContext);
        this.beautyProcessTime = 0L;
    }

    public final boolean isFrontCamera() {
        CameraWrapper cameraWrapper = this.mCameraWrapper;
        return cameraWrapper != null ? cameraWrapper.isFront() : this.isFrontCameraValue;
    }

    public final boolean isMirror() {
        return this.mirror;
    }

    @Override // com.bilibili.live.streaming.filter.FilterBase, com.bilibili.live.streaming.filter.IVideoSource
    public void loadConfig(@Nullable JSONObject jSONObject) {
        super.loadConfig(jSONObject);
        if (jSONObject != null) {
            this.isFrontCameraValue = jSONObject.optBoolean("is_front_camera");
            if (jSONObject.has("CameraWidth")) {
                setMWidth(jSONObject.optInt("CameraWidth"));
            }
            if (jSONObject.has("CameraHeight")) {
                setMHeight(jSONObject.optInt("CameraHeight"));
            }
        }
        syncCameraOrientation();
        createCaptureTexture();
    }

    public final void loadConfig(boolean z6, @Nullable Integer num, @Nullable Integer num2, int i7) {
        this.isFrontCameraValue = z6;
        this.mOrientation = i7;
        if (num != null) {
            setMWidth(num.intValue());
        }
        if (num2 != null) {
            setMHeight(num2.intValue());
        }
        syncCameraOrientation();
        createCaptureTexture();
    }

    public final void onPause() {
        CameraWrapper cameraWrapper = this.mCameraWrapper;
        if (cameraWrapper != null) {
            cameraWrapper.stopPreview();
        }
        this.mCameraWrapper = null;
    }

    public final void onPauseAndDetach() {
        CameraWrapper.DetachedCamera detachedCameraDetach;
        HashMap<String, Object> cameraHolder = this.mCtx.getCameraHolder();
        if (this.mCameraWrapper == null || getMCaptureSurfaceTexture() == null) {
            return;
        }
        SurfaceTexture surfaceTextureDetachCaptureTexture = detachCaptureTexture();
        if (surfaceTextureDetachCaptureTexture != null) {
            cameraHolder.put("SurfaceTexture", surfaceTextureDetachCaptureTexture);
        }
        CameraWrapper cameraWrapper = this.mCameraWrapper;
        if (cameraWrapper != null && (detachedCameraDetach = cameraWrapper.detach()) != null) {
            cameraHolder.put("Camera", detachedCameraDetach.getCamera());
            cameraHolder.put("CameraId", Integer.valueOf(detachedCameraDetach.getCameraIndex()));
            cameraHolder.put("CameraWidth", Integer.valueOf(detachedCameraDetach.getWidth()));
            cameraHolder.put("CameraHeight", Integer.valueOf(detachedCameraDetach.getHeight()));
        }
        this.mCameraWrapper = null;
    }

    public final void onResume() {
        try {
            createCaptureTexture();
        } catch (Exception e7) {
            LivePusherLog.e("CameraCaptureSource", "onResume exception: ", e7);
        }
    }

    @Override // com.bilibili.live.streaming.filter.FilterBase, com.bilibili.live.streaming.filter.IVideoSource
    public int preferFitMode() {
        return 3;
    }

    @Override // com.bilibili.live.streaming.filter.FilterBase, com.bilibili.live.streaming.filter.IVideoSource
    public boolean render() {
        synchronized (this) {
            if (!this.mNeedBeauty || this.mProcessedTexId <= 0) {
                renderCameraTexture();
            } else {
                renderProcessedTexture();
            }
        }
        return true;
    }

    public final void resizeCamera(int i7, int i8) {
        this.inputResizeCameraWidth = i7;
        this.inputResizeCameraHeight = i8;
    }

    public final void reverseCamera() {
        synchronized (this) {
            SurfaceTexture mCaptureSurfaceTexture = getMCaptureSurfaceTexture();
            if (mCaptureSurfaceTexture == null) {
                return;
            }
            syncCameraOrientation();
            this.isFrontCameraValue = !isFrontCamera();
            CameraWrapper cameraWrapper = this.mCameraWrapper;
            if (cameraWrapper != null) {
                cameraWrapper.stopPreview();
            }
            this.mCameraWrapper = null;
            CameraWrapper cameraWrapper2 = new CameraWrapper(this.isPort, this.isFrontCameraValue);
            cameraWrapper2.startPreview(mCaptureSurfaceTexture);
            this.mCameraWrapper = cameraWrapper2;
            getMHasFrameArrived().set(0L);
            syncCameraStatus();
            syncCameraId();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.bilibili.live.streaming.filter.FilterBase, com.bilibili.live.streaming.filter.IVideoSource
    @NotNull
    public JSONObject saveConfig() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("is_front_camera", this.isFrontCameraValue);
        } catch (Exception e7) {
            LivePusherLog.e("CameraCaptureSource", "saveConfig: fail to generate json: " + e7.getMessage(), e7);
        }
        return jSONObject;
    }

    public final void setBeautyFilter(@Nullable BeautyFilter beautyFilter) {
        this.mBeautyFilter = beautyFilter;
        this.mNeedBeauty = beautyFilter != null;
        BeautyFilter beautyFilter2 = this.mBeautyFilter;
        if (beautyFilter2 != null) {
            beautyFilter2.setContext(this.mCtx);
        }
    }

    @Override // com.bilibili.live.streaming.source.CaptureSource, com.bilibili.live.streaming.filter.IVideoSource
    public void tick(long j7) {
        synchronized (this) {
            super.tick(j7);
            try {
                if (this.mOffscreenTexture == null) {
                    this.mOffscreenTexture = BGLTexture.createTex2D();
                }
            } catch (BGLException e7) {
                LivePusherLog.e("CameraCaptureSource", "cameraCaptureSource tick, BGLException: ", e7);
                BGLTexture bGLTexture = this.mOffscreenTexture;
                if (bGLTexture != null) {
                    bGLTexture.destroy();
                }
                this.mOffscreenTexture = null;
            } catch (Exception e8) {
                LivePusherLog.e("CameraCaptureSource", "cameraCaptureSource tick, exception: ", e8);
            }
            if (getMHasFrameArrived().get() <= 2) {
                Unit unit = Unit.INSTANCE;
            } else {
                if (this.mirror) {
                    revertMirrorMatrix();
                } else {
                    applyMirrorMatrix();
                }
                offscreenRender(j7);
                Unit unit2 = Unit.INSTANCE;
            }
        }
    }
}
