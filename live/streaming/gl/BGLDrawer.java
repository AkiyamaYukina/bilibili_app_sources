package com.bilibili.live.streaming.gl;

import android.opengl.GLES20;
import android.opengl.GLES30;
import com.bilibili.live.streaming.gl.Shaders;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/gl/BGLDrawer.class */
public class BGLDrawer {
    static final boolean $assertionsDisabled = false;
    private static final String TAG = "BGLDrawer";
    private BGLProgram mDblTexPrg;
    private BGLProgram mMp4AlphaPrg;
    private BGLProgram mOESPrg;
    private BGLProgram mP010Prg;
    private BGLProgram mPrg;
    private BGLTriangleFanRect mRectDrawer;
    private BGLProgram mRectPrg;
    private TransStateProvider mTransStateProvider;
    private BGLProgram mYUVPrg;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/gl/BGLDrawer$DrawCallback.class */
    public interface DrawCallback {
        void postDraw() throws BGLException;

        void preDraw() throws BGLException;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/gl/BGLDrawer$TransStateProvider.class */
    public interface TransStateProvider {
        BGLTransState getTransState();
    }

    private BGLDrawer() {
    }

    public static BGLDrawer create(TransStateProvider transStateProvider, Shaders.Transfer transfer, Shaders.Primaries primaries, Shaders.EETF eetf, Shaders.Primaries primaries2, Shaders.Transfer transfer2) throws BGLException {
        BGLDrawer bGLDrawer = new BGLDrawer();
        try {
            bGLDrawer.mTransStateProvider = transStateProvider;
            Shaders shaders = new Shaders(transfer, primaries, eetf, primaries2, transfer2);
            bGLDrawer.mPrg = BGLProgram.compile(shaders.getCommon_vertex_shader(), shaders.getCommon_frag_shader());
            bGLDrawer.mYUVPrg = BGLProgram.compile(shaders.getCommon_vertex_shader(), shaders.getYuv_frag_shader());
            bGLDrawer.mP010Prg = BGLProgram.compile(shaders.getCommon_vertex_shader(), shaders.getP010_frag_shader());
            bGLDrawer.mDblTexPrg = BGLProgram.compile(shaders.getCommon_vertex_shader(), shaders.getDoubletex_frag_shader());
            bGLDrawer.mOESPrg = BGLProgram.compile(shaders.getCommon_vertex_shader(), shaders.getOestex_frag_shader());
            bGLDrawer.mMp4AlphaPrg = BGLProgram.compile(shaders.getCommon_vertex_shader(), shaders.getAlphamp4_frag_shader());
            bGLDrawer.mRectPrg = BGLProgram.compile(shaders.getCommon_vertex_shader(), shaders.getSolid_color_frag_shader());
            bGLDrawer.mRectDrawer = BGLTriangleFanRect.create();
            return bGLDrawer;
        } catch (BGLException e7) {
            bGLDrawer.destroy();
            throw e7;
        }
    }

    private void drawTexInternal(BGLProgram bGLProgram, BGLTexture bGLTexture, float f7, DrawCallback drawCallback) throws BGLException {
        boolean z6;
        BGLTransState transState = this.mTransStateProvider.getTransState();
        float[] scissor = transState.getScissor();
        if (scissor != null) {
            int[] iArr = new int[4];
            GLES30.glGetIntegerv(2978, iArr, 0);
            int i7 = iArr[2];
            float f8 = i7;
            z6 = true;
            float f9 = scissor[1];
            float f10 = scissor[0];
            float f11 = ((f9 - f10) * f8) / 2.0f;
            int i8 = iArr[3];
            float f12 = i8;
            float f13 = scissor[3];
            float f14 = scissor[2];
            float f15 = ((f13 - f14) * f12) / 2.0f;
            float f16 = iArr[0];
            float f17 = ((f10 + 1.0f) * i7) / 2.0f;
            float f18 = iArr[1];
            GLES30.glEnable(3089);
            GLES30.glScissor((int) (f17 + f16), (int) ((((f14 + 1.0f) * i8) / 2.0f) + f18), (int) f11, (int) f15);
        } else {
            z6 = false;
        }
        bGLProgram.use();
        try {
            try {
                BGLUtil.setTexture(0, bGLTexture, bGLProgram.getUniParam("u_tex"));
                transState.getVTrans().applyTo(bGLProgram.getUniParam("u_vtrans"));
                transState.getUVTrans().applyTo(bGLProgram.getUniParam("u_uvtrans"));
                GLES20.glUniform1f(bGLProgram.getUniParam("u_alpha"), transState.translateAlpha(f7));
                if (drawCallback != null) {
                    drawCallback.preDraw();
                }
                this.mRectDrawer.applyVertex(bGLProgram.getAttrParam("a_pos"));
                this.mRectDrawer.applyUV(bGLProgram.getAttrParam("a_uv"));
                this.mRectDrawer.fillRect();
                BGLUtil.unbindTextureSlot(0, bGLTexture);
                if (drawCallback != null) {
                    drawCallback.postDraw();
                }
                bGLProgram.unuse();
                if (z6) {
                    GLES30.glDisable(3089);
                }
            } catch (BGLException e7) {
                bGLProgram.unuse();
                bGLTexture.unbind();
                throw e7;
            }
        } catch (Throwable th) {
            if (z6) {
                GLES30.glDisable(3089);
            }
            throw th;
        }
    }

    public void destroy() {
        BGLProgram bGLProgram = this.mPrg;
        if (bGLProgram != null) {
            bGLProgram.destroy();
            this.mPrg = null;
        }
        BGLProgram bGLProgram2 = this.mYUVPrg;
        if (bGLProgram2 != null) {
            bGLProgram2.destroy();
            this.mYUVPrg = null;
        }
        BGLProgram bGLProgram3 = this.mP010Prg;
        if (bGLProgram3 != null) {
            bGLProgram3.destroy();
            this.mP010Prg = null;
        }
        BGLProgram bGLProgram4 = this.mDblTexPrg;
        if (bGLProgram4 != null) {
            bGLProgram4.destroy();
            this.mDblTexPrg = null;
        }
        BGLProgram bGLProgram5 = this.mOESPrg;
        if (bGLProgram5 != null) {
            bGLProgram5.destroy();
            this.mOESPrg = null;
        }
        BGLProgram bGLProgram6 = this.mMp4AlphaPrg;
        if (bGLProgram6 != null) {
            bGLProgram6.destroy();
            this.mMp4AlphaPrg = null;
        }
        BGLProgram bGLProgram7 = this.mRectPrg;
        if (bGLProgram7 != null) {
            bGLProgram7.destroy();
            this.mRectPrg = null;
        }
        BGLTriangleFanRect bGLTriangleFanRect = this.mRectDrawer;
        if (bGLTriangleFanRect != null) {
            bGLTriangleFanRect.destroy();
            this.mRectDrawer = null;
        }
    }

    public void drawP010TexMix(BGLTexture bGLTexture, BGLTexture bGLTexture2, float f7, int i7, int i8) throws BGLException {
        drawTexInternal(this.mP010Prg, bGLTexture, f7, new DrawCallback(this, bGLTexture2, i7, i8) { // from class: com.bilibili.live.streaming.gl.BGLDrawer.5
            final BGLDrawer this$0;
            final int val$colormatrix;
            final int val$range;
            final BGLTexture val$uv;

            {
                this.this$0 = this;
                this.val$uv = bGLTexture2;
                this.val$colormatrix = i7;
                this.val$range = i8;
            }

            @Override // com.bilibili.live.streaming.gl.BGLDrawer.DrawCallback
            public void postDraw() throws BGLException {
                BGLUtil.unbindTextureSlot(1, this.val$uv);
            }

            @Override // com.bilibili.live.streaming.gl.BGLDrawer.DrawCallback
            public void preDraw() throws BGLException {
                BGLUtil.setTexture(1, this.val$uv, this.this$0.mP010Prg.getUniParam("u_texuv"));
                GLES30.glUniformMatrix4fv(this.this$0.mP010Prg.getUniParam("u_colormatrix"), 1, false, BGLColorMatrix.getYuv2RgbMatrix(this.val$colormatrix, this.val$range), 0);
            }
        });
    }

    public void drawRect(float f7, float f8, float f9, float f10, float f11) throws BGLException {
        this.mRectPrg.use();
        try {
            this.mTransStateProvider.getTransState().getVTrans().applyTo(this.mRectPrg.getUniParam("u_vtrans"));
            this.mRectDrawer.applyVertex(this.mRectPrg.getAttrParam("a_pos"));
            GLES20.glUniform4f(this.mRectPrg.getUniParam("solid_color"), f8, f9, f10, this.mTransStateProvider.getTransState().translateAlpha(f11));
            this.mRectDrawer.drawRect(f7);
        } catch (BGLException e7) {
            this.mRectPrg.unuse();
            throw e7;
        }
    }

    public void drawTex(BGLTexture bGLTexture) throws BGLException {
        drawTexMix(bGLTexture, 1.0f);
    }

    public void drawTexMix(BGLTexture bGLTexture, float f7) throws BGLException {
        GLES20.glBlendFunc(1, 771);
        drawTexInternal(this.mPrg, bGLTexture, f7, null);
    }

    public void drawTexMix(BGLTexture bGLTexture, float f7, BGLTexture bGLTexture2, float f8) throws BGLException {
        GLES20.glBlendFunc(1, 771);
        drawTexInternal(this.mDblTexPrg, bGLTexture, f7, new DrawCallback(this, bGLTexture2, f8) { // from class: com.bilibili.live.streaming.gl.BGLDrawer.1
            final BGLDrawer this$0;
            final BGLTexture val$tex2;
            final float val$uAlpha2;

            {
                this.this$0 = this;
                this.val$tex2 = bGLTexture2;
                this.val$uAlpha2 = f8;
            }

            @Override // com.bilibili.live.streaming.gl.BGLDrawer.DrawCallback
            public void postDraw() throws BGLException {
                BGLTexture bGLTexture3 = this.val$tex2;
                if (bGLTexture3 != null) {
                    BGLUtil.unbindTextureSlot(1, bGLTexture3);
                }
            }

            @Override // com.bilibili.live.streaming.gl.BGLDrawer.DrawCallback
            public void preDraw() throws BGLException {
                BGLTexture bGLTexture3 = this.val$tex2;
                if (bGLTexture3 != null) {
                    BGLUtil.setTexture(1, bGLTexture3, this.this$0.mDblTexPrg.getUniParam("u_tex2"));
                    GLES20.glUniform1f(this.this$0.mDblTexPrg.getUniParam("u_alpha2"), this.this$0.mTransStateProvider.getTransState().translateAlpha(this.val$uAlpha2));
                }
            }
        });
    }

    public void drawTexMp4Alpha(BGLTexture bGLTexture, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14) throws BGLException {
        GLES20.glBlendFunc(1, 771);
        drawTexInternal(this.mMp4AlphaPrg, bGLTexture, 1.0f, new DrawCallback(this, f7, f8, f9, f10, f11, f12, f13, f14) { // from class: com.bilibili.live.streaming.gl.BGLDrawer.3
            final BGLDrawer this$0;
            final float val$alphasx;
            final float val$alphasy;
            final float val$alphax;
            final float val$alphay;
            final float val$rgbsx;
            final float val$rgbsy;
            final float val$rgbx;
            final float val$rgby;

            {
                this.this$0 = this;
                this.val$rgbx = f7;
                this.val$rgby = f8;
                this.val$rgbsx = f9;
                this.val$rgbsy = f10;
                this.val$alphax = f11;
                this.val$alphay = f12;
                this.val$alphasx = f13;
                this.val$alphasy = f14;
            }

            @Override // com.bilibili.live.streaming.gl.BGLDrawer.DrawCallback
            public void postDraw() throws BGLException {
            }

            @Override // com.bilibili.live.streaming.gl.BGLDrawer.DrawCallback
            public void preDraw() throws BGLException {
                GLES20.glUniform2f(this.this$0.mMp4AlphaPrg.getUniParam("rgb_xy"), this.val$rgbx, this.val$rgby);
                GLES20.glUniform2f(this.this$0.mMp4AlphaPrg.getUniParam("rgb_scale"), this.val$rgbsx, this.val$rgbsy);
                GLES20.glUniform2f(this.this$0.mMp4AlphaPrg.getUniParam("alpha_xy"), this.val$alphax, this.val$alphay);
                GLES20.glUniform2f(this.this$0.mMp4AlphaPrg.getUniParam("alpha_scale"), this.val$alphasx, this.val$alphasy);
            }
        });
    }

    public void drawTexOESMix(BGLTexture bGLTexture) throws BGLException {
        drawTexOESMix(bGLTexture, false);
    }

    public void drawTexOESMix(BGLTexture bGLTexture, boolean z6) throws BGLException {
        GLES20.glBlendFunc(1, 771);
        drawTexInternal(this.mOESPrg, bGLTexture, 1.0f, new DrawCallback(this, z6) { // from class: com.bilibili.live.streaming.gl.BGLDrawer.2
            final BGLDrawer this$0;
            final boolean val$enableAlpha;

            {
                this.this$0 = this;
                this.val$enableAlpha = z6;
            }

            @Override // com.bilibili.live.streaming.gl.BGLDrawer.DrawCallback
            public void postDraw() throws BGLException {
            }

            @Override // com.bilibili.live.streaming.gl.BGLDrawer.DrawCallback
            public void preDraw() throws BGLException {
                int uniParam = this.this$0.mOESPrg.getUniParam("u_maxalpha");
                if (this.val$enableAlpha) {
                    GLES20.glUniform1f(uniParam, 0.0f);
                } else {
                    GLES20.glUniform1f(uniParam, 1.0f);
                }
            }
        });
    }

    public void drawYUVTexMix(BGLTexture bGLTexture, BGLTexture bGLTexture2, BGLTexture bGLTexture3, float f7, int i7, int i8) throws BGLException {
        drawTexInternal(this.mYUVPrg, bGLTexture, f7, new DrawCallback(this, bGLTexture2, bGLTexture3, i7, i8) { // from class: com.bilibili.live.streaming.gl.BGLDrawer.4
            final BGLDrawer this$0;
            final int val$colormatrix;
            final int val$range;
            final BGLTexture val$u;
            final BGLTexture val$v;

            {
                this.this$0 = this;
                this.val$u = bGLTexture2;
                this.val$v = bGLTexture3;
                this.val$colormatrix = i7;
                this.val$range = i8;
            }

            @Override // com.bilibili.live.streaming.gl.BGLDrawer.DrawCallback
            public void postDraw() throws BGLException {
                BGLUtil.unbindTextureSlot(1, this.val$u);
                BGLUtil.unbindTextureSlot(2, this.val$v);
            }

            @Override // com.bilibili.live.streaming.gl.BGLDrawer.DrawCallback
            public void preDraw() throws BGLException {
                BGLUtil.setTexture(1, this.val$u, this.this$0.mYUVPrg.getUniParam("u_texu"));
                BGLUtil.setTexture(2, this.val$v, this.this$0.mYUVPrg.getUniParam("u_texv"));
                GLES30.glUniformMatrix4fv(this.this$0.mYUVPrg.getUniParam("u_colormatrix"), 1, false, BGLColorMatrix.getYuv2RgbMatrix(this.val$colormatrix, this.val$range), 0);
            }
        });
    }

    public void finalize() throws Throwable {
        super.finalize();
    }
}
