package com.bilibili.live.streaming.source;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.bilibili.live.streaming.AVContext;
import com.bilibili.live.streaming.FilterFactory;
import com.bilibili.live.streaming.filter.FilterBase;
import com.bilibili.live.streaming.gl.BEGLContext;
import com.bilibili.live.streaming.gl.BGLDrawer;
import com.bilibili.live.streaming.gl.BGLException;
import com.bilibili.live.streaming.gl.BGLTexture;
import com.bilibili.live.streaming.gl.Shaders;
import com.bilibili.live.streaming.log.LivePusherLog;
import com.bilibili.live.streaming.sources.SceneSource;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/source/ColorSource.class */
public final class ColorSource extends FilterBase {

    @NotNull
    public static final String CFG_A = "color_a";

    @NotNull
    public static final String CFG_B = "color_b";

    @NotNull
    public static final String CFG_G = "color_g";

    @NotNull
    public static final String CFG_R = "color_r";

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String ID = "color_source";

    @Nullable
    private Bitmap mBitmap;

    @Nullable
    private BGLTexture mTex;
    private float mR = 1.0f;
    private float mG = 1.0f;
    private float mB = 1.0f;
    private float mA = 1.0f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/source/ColorSource$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final JSONObject generateSourceItemConfig(int i7, int i8, int i9, int i10, @Nullable String str, boolean z6, @Nullable String str2, float f7, float f8, float f9, float f10) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(SceneSource.KEY_ItemLeft, i7);
                jSONObject.put(SceneSource.KEY_ItemTop, i8);
                jSONObject.put(SceneSource.KEY_ItemWidth, i9);
                jSONObject.put(SceneSource.KEY_ItemHeight, i10);
                jSONObject.put(SceneSource.KEY_FitMode, str);
                jSONObject.put(SceneSource.KEY_IsShow, z6);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(FilterFactory.KEY_FilterID, ColorSource.ID);
                jSONObject2.put(FilterFactory.KEY_FilterName, str2);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(ColorSource.CFG_R, f7);
                jSONObject3.put(ColorSource.CFG_G, f8);
                jSONObject3.put(ColorSource.CFG_B, f9);
                jSONObject3.put(ColorSource.CFG_A, f10);
                jSONObject2.put(FilterFactory.KEY_FilterConfig, jSONObject3);
                jSONObject.put(SceneSource.KEY_FilterData, jSONObject2);
                LivePusherLog.i(ColorSource.ID, "generateSourceItemConfig content: " + jSONObject, null);
                return jSONObject;
            } catch (Exception e7) {
                LivePusherLog.e(ColorSource.ID, "generateSourceItemConfig failed!!!!!", e7);
                return null;
            }
        }
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    public void destroy() {
        LivePusherLog.i(ID, "$this, destroy!!", null);
        BGLTexture bGLTexture = this.mTex;
        if (bGLTexture != null) {
            bGLTexture.destroy();
        }
        this.mTex = null;
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    public int getHeight() {
        return 240;
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    @NotNull
    public String getID() {
        return ID;
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    public int getWidth() {
        return 320;
    }

    @Override // com.bilibili.live.streaming.filter.FilterBase, com.bilibili.live.streaming.filter.IVideoSource
    public void loadConfig(@Nullable JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        destroy();
        try {
            this.mR = (float) jSONObject.getDouble(CFG_R);
            this.mG = (float) jSONObject.getDouble(CFG_G);
            this.mB = (float) jSONObject.getDouble(CFG_B);
            this.mA = (float) jSONObject.getDouble(CFG_A);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            this.mBitmap = bitmapCreateBitmap;
            if (bitmapCreateBitmap != null) {
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                Paint paint = new Paint();
                float f7 = 255;
                paint.setARGB((int) (this.mA * f7), (int) (this.mR * f7), (int) (this.mG * f7), (int) (this.mB * f7));
                paint.setStyle(Paint.Style.FILL_AND_STROKE);
                canvas.drawRect(new Rect(0, 0, 1, 1), paint);
            }
        } catch (Exception e7) {
            LivePusherLog.e(ID, "loadConfig: fail to load config", e7);
        }
    }

    @Override // com.bilibili.live.streaming.filter.FilterBase, com.bilibili.live.streaming.filter.IVideoSource
    public boolean render() throws BGLException {
        BEGLContext eglContext;
        BGLDrawer inputTexDrawer;
        AVContext aVContext = this.mCtx;
        if (aVContext == null || (eglContext = aVContext.getEglContext()) == null || (inputTexDrawer = eglContext.getInputTexDrawer(Shaders.Transfer.SRGB, Shaders.Primaries.SRGB)) == null) {
            return false;
        }
        BGLTexture bGLTexture = this.mTex;
        if (bGLTexture == null) {
            return true;
        }
        inputTexDrawer.drawTex(bGLTexture);
        return true;
    }

    @Override // com.bilibili.live.streaming.filter.FilterBase, com.bilibili.live.streaming.filter.IVideoSource
    @NotNull
    public JSONObject saveConfig() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CFG_R, this.mR);
            jSONObject.put(CFG_G, this.mG);
            jSONObject.put(CFG_B, this.mB);
            jSONObject.put(CFG_A, this.mA);
        } catch (Exception e7) {
            LivePusherLog.e(ID, "saveConfig: fail to generate json", e7);
        }
        return jSONObject;
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    public void tick(long j7) {
        try {
            if (this.mTex == null) {
                BGLTexture bGLTextureCreateTex2D = BGLTexture.createTex2D();
                this.mTex = bGLTextureCreateTex2D;
                if (bGLTextureCreateTex2D != null) {
                    bGLTextureCreateTex2D.loadBmp(this.mBitmap);
                }
                Bitmap bitmap = this.mBitmap;
                if (bitmap != null) {
                    bitmap.recycle();
                }
            }
        } catch (BGLException e7) {
            BGLTexture bGLTexture = this.mTex;
            if (bGLTexture != null) {
                bGLTexture.destroy();
            }
            this.mTex = null;
        }
    }
}
