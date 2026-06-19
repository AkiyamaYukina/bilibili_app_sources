package com.bilibili.live.streaming.gl;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLES31;
import com.bilibili.live.streaming.gl.BGLException;
import com.bilibili.live.streaming.gl.Shaders;
import com.bilibili.studio.videoeditor.ms.transition.TransitionInfo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/gl/BEGLSurface.class */
public class BEGLSurface {
    static final boolean $assertionsDisabled = false;
    static final String TAG = "LIVEGL-BEGLSurface";
    private int frmNums;
    BEGLContext mBEglCtx;
    EGLContext mEGLContext;
    EGLSurface mEglSurface;
    BGLFramebuffer mFramebuffer;
    BGLTexture mFramebufferTexture;
    RenderMode mRenderMode;
    int[] mSurfaceSize;
    boolean mUseFloatFramebuffer;

    /* JADX INFO: renamed from: com.bilibili.live.streaming.gl.BEGLSurface$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/gl/BEGLSurface$1.class */
    public static /* synthetic */ class AnonymousClass1 {
        static final int[] $SwitchMap$com$bilibili$live$streaming$gl$BEGLSurface$RenderMode;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:19:0x004d
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                com.bilibili.live.streaming.gl.BEGLSurface$RenderMode[] r0 = com.bilibili.live.streaming.gl.BEGLSurface.RenderMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                com.bilibili.live.streaming.gl.BEGLSurface.AnonymousClass1.$SwitchMap$com$bilibili$live$streaming$gl$BEGLSurface$RenderMode = r0
                r0 = r4
                com.bilibili.live.streaming.gl.BEGLSurface$RenderMode r1 = com.bilibili.live.streaming.gl.BEGLSurface.RenderMode.SDR_SRGB     // Catch: java.lang.NoSuchFieldError -> L41
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L41
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L41
            L14:
                int[] r0 = com.bilibili.live.streaming.gl.BEGLSurface.AnonymousClass1.$SwitchMap$com$bilibili$live$streaming$gl$BEGLSurface$RenderMode     // Catch: java.lang.NoSuchFieldError -> L41 java.lang.NoSuchFieldError -> L45
                com.bilibili.live.streaming.gl.BEGLSurface$RenderMode r1 = com.bilibili.live.streaming.gl.BEGLSurface.RenderMode.HDR_PQ     // Catch: java.lang.NoSuchFieldError -> L45
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L45
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L45
            L1f:
                int[] r0 = com.bilibili.live.streaming.gl.BEGLSurface.AnonymousClass1.$SwitchMap$com$bilibili$live$streaming$gl$BEGLSurface$RenderMode     // Catch: java.lang.NoSuchFieldError -> L45 java.lang.NoSuchFieldError -> L49
                com.bilibili.live.streaming.gl.BEGLSurface$RenderMode r1 = com.bilibili.live.streaming.gl.BEGLSurface.RenderMode.HDR_HLG     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L2a:
                int[] r0 = com.bilibili.live.streaming.gl.BEGLSurface.AnonymousClass1.$SwitchMap$com$bilibili$live$streaming$gl$BEGLSurface$RenderMode     // Catch: java.lang.NoSuchFieldError -> L49 java.lang.NoSuchFieldError -> L4d
                com.bilibili.live.streaming.gl.BEGLSurface$RenderMode r1 = com.bilibili.live.streaming.gl.BEGLSurface.RenderMode.HDR2SDR_SRGB     // Catch: java.lang.NoSuchFieldError -> L4d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4d
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L4d
            L35:
                int[] r0 = com.bilibili.live.streaming.gl.BEGLSurface.AnonymousClass1.$SwitchMap$com$bilibili$live$streaming$gl$BEGLSurface$RenderMode     // Catch: java.lang.NoSuchFieldError -> L4d java.lang.NoSuchFieldError -> L51
                com.bilibili.live.streaming.gl.BEGLSurface$RenderMode r1 = com.bilibili.live.streaming.gl.BEGLSurface.RenderMode.HDR_HLG_FILTER2P3     // Catch: java.lang.NoSuchFieldError -> L51
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L51
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L51
            L40:
                return
            L41:
                r4 = move-exception
                goto L14
            L45:
                r4 = move-exception
                goto L1f
            L49:
                r4 = move-exception
                goto L2a
            L4d:
                r4 = move-exception
                goto L35
            L51:
                r4 = move-exception
                goto L40
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.live.streaming.gl.BEGLSurface.AnonymousClass1.m6973clinit():void");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/gl/BEGLSurface$RenderMode.class */
    public enum RenderMode {
        SDR_SRGB,
        HDR_PQ,
        HDR_HLG,
        HDR2SDR_SRGB,
        HDR_HLG_FILTER2P3
    }

    public BEGLSurface() {
        this.frmNums = 0;
        this.mBEglCtx = null;
        this.mEglSurface = EGL14.EGL_NO_SURFACE;
        this.mEGLContext = EGL14.EGL_NO_CONTEXT;
        this.mRenderMode = RenderMode.SDR_SRGB;
        this.mUseFloatFramebuffer = true;
    }

    public BEGLSurface(BEGLContext bEGLContext, RenderMode renderMode) throws BGLException {
        this.frmNums = 0;
        this.mBEglCtx = bEGLContext;
        this.mEglSurface = EGL14.EGL_NO_SURFACE;
        this.mRenderMode = renderMode;
        this.mUseFloatFramebuffer = true;
        this.mEGLContext = bEGLContext.createSurfaceContext(isHDR(renderMode));
    }

    private void ClearTextureBuffer() {
        BGLTexture bGLTexture = this.mFramebufferTexture;
        if (bGLTexture != null) {
            bGLTexture.destroy();
        }
        this.mFramebufferTexture = null;
    }

    public static boolean isHDR(RenderMode renderMode) {
        return renderMode == RenderMode.HDR_PQ || renderMode == RenderMode.HDR_HLG || renderMode == RenderMode.HDR_HLG_FILTER2P3;
    }

    public void ClearFramebuffer() {
        BGLFramebuffer bGLFramebuffer = this.mFramebuffer;
        if (bGLFramebuffer != null) {
            bGLFramebuffer.destroy();
        }
        this.mFramebuffer = null;
    }

    public void destroy() {
        if (this.mEglSurface != EGL14.EGL_NO_SURFACE) {
            if (this.mUseFloatFramebuffer && (this.mFramebuffer != null || this.mFramebufferTexture != null)) {
                this.mUseFloatFramebuffer = false;
                try {
                    makeCurrent();
                    ClearFramebuffer();
                    ClearTextureBuffer();
                    makeCurrentNull();
                } catch (BGLException e7) {
                    e7.printStackTrace();
                }
            }
            EGL14.eglDestroySurface(this.mBEglCtx.internalGetDisplay(), this.mEglSurface);
            this.mEglSurface = EGL14.EGL_NO_SURFACE;
        }
        if (this.mEGLContext != EGL14.EGL_NO_CONTEXT) {
            EGL14.eglDestroyContext(this.mBEglCtx.internalGetDisplay(), this.mEGLContext);
            this.mEGLContext = EGL14.EGL_NO_CONTEXT;
        }
    }

    public void drawTex(BGLTexture bGLTexture, Shaders.EETF eetf, Shaders.Primaries primaries, Shaders.Transfer transfer) throws BGLException {
        this.mBEglCtx.getOutputTexDrawer(eetf, primaries, transfer).drawTex(bGLTexture);
    }

    public void finalize() throws Throwable {
        super.finalize();
    }

    public void makeCurrent() throws BGLException {
        EGLDisplay eGLDisplayInternalGetDisplay = this.mBEglCtx.internalGetDisplay();
        EGLSurface eGLSurface = this.mEglSurface;
        if (!EGL14.eglMakeCurrent(eGLDisplayInternalGetDisplay, eGLSurface, eGLSurface, this.mEGLContext)) {
            BGLUtil.logAndThrow(TAG, BGLException.ID.MAKE_CURRENT, "BEGLSurface.makeCurrent");
        }
        if (this.mUseFloatFramebuffer) {
            this.mSurfaceSize = new int[2];
            EGL14.eglQuerySurface(this.mBEglCtx.internalGetDisplay(), this.mEglSurface, 12375, this.mSurfaceSize, 0);
            EGL14.eglQuerySurface(this.mBEglCtx.internalGetDisplay(), this.mEglSurface, 12374, this.mSurfaceSize, 1);
            if (this.mFramebufferTexture == null) {
                this.mFramebufferTexture = BGLTexture.createTex2D();
            }
            ClearFramebuffer();
            BGLTexture bGLTexture = this.mFramebufferTexture;
            int[] iArr = this.mSurfaceSize;
            BGLFramebuffer bGLFramebufferCreateFramebuffer = bGLTexture.createFramebuffer(iArr[0], iArr[1], true);
            this.mFramebuffer = bGLFramebufferCreateFramebuffer;
            bGLFramebufferCreateFramebuffer.setAsRenderTarget();
        }
        GLES20.glDisable(2884);
        GLES20.glEnable(3042);
        GLES20.glBlendEquation(32774);
        GLES20.glBlendFunc(1, 771);
    }

    public void makeCurrentNull() throws BGLException {
        EGLDisplay eGLDisplayInternalGetDisplay = this.mBEglCtx.internalGetDisplay();
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        if (EGL14.eglMakeCurrent(eGLDisplayInternalGetDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT)) {
            return;
        }
        BGLUtil.logAndThrow(TAG, BGLException.ID.MAKE_CURRENT, "BEGLSurface.makeCurrent");
    }

    public void setTimestamp(long j7) {
        EGLExt.eglPresentationTimeANDROID(this.mBEglCtx.internalGetDisplay(), this.mEglSurface, j7 * TransitionInfo.DEFAULT_DURATION);
    }

    public void swapBuffer() {
        Shaders.EETF eetf;
        Shaders.Primaries primaries;
        Shaders.Transfer transfer;
        try {
            if (this.mUseFloatFramebuffer) {
                ClearFramebuffer();
                EGLDisplay eGLDisplayInternalGetDisplay = this.mBEglCtx.internalGetDisplay();
                EGLSurface eGLSurface = this.mEglSurface;
                if (!EGL14.eglMakeCurrent(eGLDisplayInternalGetDisplay, eGLSurface, eGLSurface, this.mEGLContext)) {
                    BGLUtil.logAndThrow(TAG, BGLException.ID.MAKE_CURRENT, "BEGLSurface.makeCurrent");
                }
                this.mBEglCtx.pushTransState();
                try {
                    int[] iArr = this.mSurfaceSize;
                    GLES31.glViewport(0, 0, iArr[0], iArr[1]);
                    BGLUtil.clear(0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
                    int i7 = AnonymousClass1.$SwitchMap$com$bilibili$live$streaming$gl$BEGLSurface$RenderMode[this.mRenderMode.ordinal()];
                    if (i7 == 1) {
                        eetf = Shaders.EETF.NO_CONV;
                        primaries = Shaders.Primaries.SRGB;
                        transfer = Shaders.Transfer.SRGB;
                    } else if (i7 == 2) {
                        eetf = Shaders.EETF.NO_CONV;
                        primaries = Shaders.Primaries.BT2020;
                        transfer = Shaders.Transfer.PQ;
                    } else if (i7 == 3) {
                        eetf = Shaders.EETF.NO_CONV;
                        primaries = Shaders.Primaries.BT2020;
                        transfer = Shaders.Transfer.HLG;
                    } else if (i7 == 4) {
                        eetf = Shaders.EETF.BT2390;
                        primaries = Shaders.Primaries.SRGB;
                        transfer = Shaders.Transfer.SRGB;
                    } else {
                        if (i7 != 5) {
                            throw new BGLException(BGLException.ID.DRAW_ERROR, "Incorrect output colorspace");
                        }
                        eetf = Shaders.EETF.NO_CONV;
                        primaries = Shaders.Primaries.BT2020;
                        transfer = Shaders.Transfer.HLG;
                    }
                    drawTex(this.mFramebufferTexture, eetf, primaries, transfer);
                    this.mBEglCtx.popTransState();
                } catch (Throwable th) {
                    this.mBEglCtx.popTransState();
                    throw th;
                }
            }
            this.frmNums++;
            EGL14.eglSwapBuffers(this.mBEglCtx.internalGetDisplay(), this.mEglSurface);
        } catch (BGLException e7) {
            e7.printStackTrace();
        }
    }
}
