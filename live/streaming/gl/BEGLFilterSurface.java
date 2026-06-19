package com.bilibili.live.streaming.gl;

import android.opengl.EGL14;
import android.opengl.GLES31;
import com.bilibili.live.streaming.gl.BEGLSurface;
import com.bilibili.live.streaming.gl.Shaders;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/gl/BEGLFilterSurface.class */
public final class BEGLFilterSurface extends BEGLSurface implements FilterInterface {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String TAG = "MIDolbyPIPSurface";

    @Nullable
    private BGLTexture completeTex;

    @Nullable
    private BGLFramebuffer fb;

    @Nullable
    private Function4<? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> filter;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/gl/BEGLFilterSurface$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public BEGLFilterSurface(@NotNull BEGLContext bEGLContext, @NotNull BEGLSurface.RenderMode renderMode) {
        super(bEGLContext, renderMode);
    }

    @Override // com.bilibili.live.streaming.gl.BEGLSurface
    public void destroy() {
        if (this.mEglSurface != EGL14.EGL_NO_SURFACE && (this.completeTex != null || this.fb != null)) {
            try {
                makeCurrent();
                BGLTexture bGLTexture = this.completeTex;
                if (bGLTexture != null) {
                    bGLTexture.destroy();
                }
                BGLFramebuffer bGLFramebuffer = this.fb;
                if (bGLFramebuffer != null) {
                    bGLFramebuffer.destroy();
                }
                this.completeTex = null;
                this.fb = null;
                makeCurrentNull();
            } catch (BGLException e7) {
                e7.printStackTrace();
            }
        }
        super.destroy();
    }

    @Override // com.bilibili.live.streaming.gl.BEGLSurface
    public void drawTex(@NotNull BGLTexture bGLTexture, @Nullable Shaders.EETF eetf, @Nullable Shaders.Primaries primaries, @Nullable Shaders.Transfer transfer) throws BGLException {
        Function4<? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> function4;
        BGLFramebuffer bGLFramebufferCreateFramebuffer;
        if (this.filter == null) {
            super.drawTex(bGLTexture, eetf, primaries, transfer);
        }
        BGLCurrentState bGLCurrentStateFramebuffer = BGLCurrentState.save().framebuffer();
        if (this.completeTex == null) {
            BGLTexture bGLTextureCreateTex2D = BGLTexture.createTex2D();
            this.completeTex = bGLTextureCreateTex2D;
            if (bGLTextureCreateTex2D != null) {
                int[] iArr = this.mSurfaceSize;
                bGLFramebufferCreateFramebuffer = bGLTextureCreateTex2D.createFramebuffer(iArr[0], iArr[1]);
            } else {
                bGLFramebufferCreateFramebuffer = null;
            }
            this.fb = bGLFramebufferCreateFramebuffer;
        }
        BGLFramebuffer bGLFramebuffer = this.fb;
        if (bGLFramebuffer != null) {
            bGLFramebuffer.setAsRenderTarget();
        }
        GLES31.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES31.glClear(16384);
        super.drawTex(bGLTexture, eetf, primaries, transfer);
        bGLCurrentStateFramebuffer.restore();
        int[] iArr2 = new int[1];
        GLES31.glGetIntegerv(36006, iArr2, 0);
        BGLTexture bGLTexture2 = this.completeTex;
        if (bGLTexture2 == null || (function4 = this.filter) == null) {
            return;
        }
    }

    @Override // com.bilibili.live.streaming.gl.FilterInterface
    public void setFilter(@Nullable Function4<? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> function4) {
        this.filter = function4;
    }
}
