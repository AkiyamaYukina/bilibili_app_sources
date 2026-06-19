package com.bilibili.live.streaming.source;

import android.view.Surface;
import com.bilibili.live.streaming.AVContext;
import com.bilibili.live.streaming.gl.BEGLContext;
import com.bilibili.live.streaming.gl.BGLDrawer;
import com.bilibili.live.streaming.gl.BGLMatrix;
import com.bilibili.live.streaming.gl.BGLTexture;
import com.bilibili.live.streaming.gl.BGLUtil;
import com.bilibili.live.streaming.gl.Shaders;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/source/SurfaceCaptureSource.class */
public class SurfaceCaptureSource extends CaptureSource {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String ID = "SurfaceCaptureSource";

    @Nullable
    private Surface mCaptureSurface;

    @Nullable
    private BGLMatrix mUVPreTrans = BGLMatrix.Companion.create();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/source/SurfaceCaptureSource$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public SurfaceCaptureSource() {
        setMUseTexture2D(true);
        setMUseAlphaChannel(true);
    }

    @Override // com.bilibili.live.streaming.source.CaptureSource, com.bilibili.live.streaming.filter.IVideoSource
    public void destroy() {
        this.mUVPreTrans = null;
        BGLUtil.clearErrors();
        super.destroy();
    }

    @Nullable
    public final Surface getCaptureSurface() {
        return this.mCaptureSurface;
    }

    public final boolean getEnableAlpha() {
        return getMUseAlphaChannel();
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    @NotNull
    public String getID() {
        return ID;
    }

    @Override // com.bilibili.live.streaming.filter.FilterBase, com.bilibili.live.streaming.filter.IVideoSource
    public void init(@Nullable AVContext aVContext) {
        super.init(aVContext);
    }

    @Override // com.bilibili.live.streaming.filter.FilterBase, com.bilibili.live.streaming.filter.IVideoSource
    public void loadConfig(@Nullable JSONObject jSONObject) {
        super.loadConfig(jSONObject);
        if (jSONObject != null) {
            setMWidth(jSONObject.optInt("width"));
            setMHeight(jSONObject.optInt("height"));
            setMUseAlphaChannel(jSONObject.optBoolean("enableAlpha"));
        }
        BGLUtil.clearErrors();
        BGLMatrix bGLMatrix = this.mUVPreTrans;
        if (bGLMatrix != null) {
            BGLMatrix ident = bGLMatrix.setIdent();
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
                fArrData2[i9] = fArrData2[i9] * 1.0f;
                int i10 = 4 + i9;
                fArrData2[i10] = fArrData2[i10] * (-1.0f);
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
        attachCaptureTexture();
        this.mCaptureSurface = new Surface(getMCaptureSurfaceTexture());
    }

    @Override // com.bilibili.live.streaming.filter.FilterBase, com.bilibili.live.streaming.filter.IVideoSource
    public boolean render() {
        AVContext aVContext;
        BEGLContext eglContext;
        BGLDrawer inputTexDrawer;
        BGLTexture mCaptureTexture2D = getMCaptureTexture2D();
        if (mCaptureTexture2D == null || (aVContext = this.mCtx) == null || (eglContext = aVContext.getEglContext()) == null || (inputTexDrawer = eglContext.getInputTexDrawer(Shaders.Transfer.SRGB, Shaders.Primaries.SRGB)) == null) {
            return true;
        }
        eglContext.getTransState().pushUVPreTrans(this.mUVPreTrans);
        eglContext.getTransState().pushUVPreTrans(getMTransformMatrix());
        try {
            inputTexDrawer.drawTex(mCaptureTexture2D);
            eglContext.getTransState().popUVPreTrans();
            eglContext.getTransState().popUVPreTrans();
            return true;
        } catch (Throwable th) {
            eglContext.getTransState().popUVPreTrans();
            eglContext.getTransState().popUVPreTrans();
            throw th;
        }
    }

    public final void setEnableAlpha(boolean z6) {
        setMUseAlphaChannel(z6);
    }
}
