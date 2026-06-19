package com.bilibili.live.streaming.gl;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.view.Surface;
import com.bilibili.live.streaming.gl.BEGLSurface;
import com.bilibili.live.streaming.gl.BGLDrawer;
import com.bilibili.live.streaming.gl.BGLException;
import com.bilibili.live.streaming.gl.Shaders;
import com.bilibili.live.streaming.log.LivePusherLog;
import java.nio.IntBuffer;
import java.util.LinkedList;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/gl/BEGLContext.class */
public class BEGLContext {
    private static final int EGL_RECORDABLE_ANDROID = 12610;
    static final String TAG = "LIVEGL-BEGLContext";
    private EGLContext mBackgroundEglCtx;
    private BEGLSurface mBackgroundPBufSurface;
    private EGLConfig mEglConfig;
    private EGLConfig mEglConfig10;
    private EGLContext mEglCtx;
    private long mForegroundThreadId;
    private int mMaxTexResolution;
    private BEGLSurface mPBufSurface;
    private EGLContext mSharedContext;
    private BGLDrawer[][][][][] mTexDrawer;
    private LinkedList<BGLTransState> mTransState;
    private EGLContext mEglCtx10 = EGL14.EGL_NO_CONTEXT;
    private String eglExtensions = "";
    private boolean mForRecording = false;
    private EGLDisplay mEglDisplay = EGL14.EGL_NO_DISPLAY;

    private BEGLContext() {
        EGLContext eGLContext = EGL14.EGL_NO_CONTEXT;
        this.mSharedContext = eGLContext;
        this.mEglCtx = eGLContext;
        this.mBackgroundEglCtx = eGLContext;
        this.mPBufSurface = null;
        this.mBackgroundPBufSurface = null;
    }

    private void Init() throws BGLException {
        chooseDisplay();
        initializeEGL();
        eglQueryDisplayExtensions();
        initConfig();
        createContext();
        createPBufSurface();
        queryCaps();
        this.mTransState = new LinkedList<>();
        pushTransState();
        int length = Shaders.Transfer.values().length;
        int length2 = Shaders.Primaries.values().length;
        this.mTexDrawer = new BGLDrawer[length][length2][Shaders.EETF.values().length][length2][length];
    }

    private EGLConfig chooseConfig(boolean z6) throws BGLException {
        IntBuffer intBufferAllocate = IntBuffer.allocate(32);
        int i7 = 8;
        int i8 = z6 ? 10 : 8;
        int i9 = z6 ? 10 : 8;
        int i10 = z6 ? 10 : 8;
        if (z6) {
            i7 = 2;
        }
        intBufferAllocate.put(new int[]{12352, 64, 12324, i8, 12323, i9, 12322, i10, 12321, i7, 12325, 0, 12326, 0});
        if (this.mForRecording) {
            intBufferAllocate.put(new int[]{EGL_RECORDABLE_ANDROID, 1});
        }
        intBufferAllocate.put(new int[]{12344});
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        if (EGL14.eglChooseConfig(this.mEglDisplay, intBufferAllocate.array(), 0, eGLConfigArr, 0, 1, iArr, 0) && iArr[0] != 0) {
            return eGLConfigArr[0];
        }
        return null;
    }

    private void chooseDisplay() throws BGLException {
        boolean z6 = this.mEglDisplay != EGL14.EGL_NO_DISPLAY;
        BGLException.ID id = BGLException.ID.FAIL_INIT;
        BGLUtil.logAndThrow(TAG, z6, id, "GetDisplay: duplicated calling BEGLContext.GetDisplay");
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.mEglDisplay = eGLDisplayEglGetDisplay;
        BGLUtil.logAndThrow(TAG, eGLDisplayEglGetDisplay == EGL14.EGL_NO_DISPLAY, id, "getDisplay: fail to get egl default display");
    }

    public static BEGLContext create(EGLContext eGLContext, boolean z6) throws BGLException {
        BEGLContext bEGLContext = new BEGLContext();
        bEGLContext.mSharedContext = eGLContext;
        bEGLContext.mForRecording = z6;
        bEGLContext.Init();
        return bEGLContext;
    }

    private void createContext() throws BGLException {
        int[] iArr = {12440, 3, 12539, 1, 12344};
        this.mForegroundThreadId = Thread.currentThread().getId();
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.mEglDisplay, this.mEglConfig, this.mSharedContext, iArr, 0);
        this.mEglCtx = eGLContextEglCreateContext;
        boolean z6 = eGLContextEglCreateContext == EGL14.EGL_NO_CONTEXT;
        BGLException.ID id = BGLException.ID.FAIL_INIT;
        BGLUtil.logAndThrow(TAG, z6, id, "createContext: fail to createEGLContext EGLContext");
        EGLContext eGLContextEglCreateContext2 = EGL14.eglCreateContext(this.mEglDisplay, this.mEglConfig, this.mEglCtx, iArr, 0);
        this.mBackgroundEglCtx = eGLContextEglCreateContext2;
        BGLUtil.logAndThrow(TAG, eGLContextEglCreateContext2 == EGL14.EGL_NO_CONTEXT, id, "createContext: fail to createEGLContext background EGLContext");
    }

    private void createPBufSurface() throws BGLException {
        this.mPBufSurface = createSurface(1, 1);
        this.mBackgroundPBufSurface = createSurface(1, 1);
    }

    private BEGLSurface createSurfaceInternal(Object obj, BEGLSurface.RenderMode renderMode) throws BGLException {
        boolean zIsHDR = BEGLSurface.isHDR(renderMode);
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.mEglDisplay, getConfigForMode(zIsHDR), obj, getSurfaceAttributesForMode(renderMode), 0);
        BGLUtil.logAndThrow(TAG, eGLSurfaceEglCreateWindowSurface == EGL14.EGL_NO_SURFACE, BGLException.ID.SURFACE_ERROR, "createSurface: fail to createEGLContext surface");
        BEGLSurface.RenderMode renderMode2 = BEGLSurface.RenderMode.HDR_HLG;
        if (renderMode == renderMode2 || renderMode == BEGLSurface.RenderMode.HDR_PQ) {
            if (renderMode == BEGLSurface.RenderMode.HDR_PQ) {
                EGL14.eglSurfaceAttrib(this.mEglDisplay, eGLSurfaceEglCreateWindowSurface, 13129, 500000000);
            } else if (renderMode == renderMode2) {
                EGL14.eglSurfaceAttrib(this.mEglDisplay, eGLSurfaceEglCreateWindowSurface, 13129, 50000000);
            }
            EGL14.eglSurfaceAttrib(this.mEglDisplay, eGLSurfaceEglCreateWindowSurface, 13130, 0);
            EGL14.eglSurfaceAttrib(this.mEglDisplay, eGLSurfaceEglCreateWindowSurface, 13121, 35400);
            EGL14.eglSurfaceAttrib(this.mEglDisplay, eGLSurfaceEglCreateWindowSurface, 13122, 14600);
            EGL14.eglSurfaceAttrib(this.mEglDisplay, eGLSurfaceEglCreateWindowSurface, 13123, 8500);
            EGL14.eglSurfaceAttrib(this.mEglDisplay, eGLSurfaceEglCreateWindowSurface, 13124, 39850);
            EGL14.eglSurfaceAttrib(this.mEglDisplay, eGLSurfaceEglCreateWindowSurface, 13125, 6550);
            EGL14.eglSurfaceAttrib(this.mEglDisplay, eGLSurfaceEglCreateWindowSurface, 13126, 2300);
            EGL14.eglSurfaceAttrib(this.mEglDisplay, eGLSurfaceEglCreateWindowSurface, 13127, 15635);
            EGL14.eglSurfaceAttrib(this.mEglDisplay, eGLSurfaceEglCreateWindowSurface, 13128, 16450);
        }
        BEGLSurface bEGLFilterSurface = renderMode == BEGLSurface.RenderMode.HDR_HLG_FILTER2P3 ? new BEGLFilterSurface(this, renderMode) : new BEGLSurface(this, renderMode);
        bEGLFilterSurface.mEglSurface = eGLSurfaceEglCreateWindowSurface;
        return bEGLFilterSurface;
    }

    private void destroyContext() {
        EGLContext eGLContext = this.mEglCtx10;
        if (eGLContext != EGL14.EGL_NO_CONTEXT) {
            EGL14.eglDestroyContext(this.mEglDisplay, eGLContext);
            this.mEglCtx10 = EGL14.EGL_NO_CONTEXT;
        }
        EGLContext eGLContext2 = this.mEglCtx;
        if (eGLContext2 != EGL14.EGL_NO_CONTEXT) {
            EGL14.eglDestroyContext(this.mEglDisplay, eGLContext2);
            this.mEglCtx = EGL14.EGL_NO_CONTEXT;
        }
        EGLContext eGLContext3 = this.mBackgroundEglCtx;
        if (eGLContext3 != EGL14.EGL_NO_CONTEXT) {
            EGL14.eglDestroyContext(this.mEglDisplay, eGLContext3);
            this.mBackgroundEglCtx = EGL14.EGL_NO_CONTEXT;
        }
    }

    private void destroyPBufSurface() {
        BEGLSurface bEGLSurface = this.mPBufSurface;
        if (bEGLSurface != null) {
            bEGLSurface.destroy();
            this.mPBufSurface = null;
        }
        BEGLSurface bEGLSurface2 = this.mBackgroundPBufSurface;
        if (bEGLSurface2 != null) {
            bEGLSurface2.destroy();
            this.mBackgroundPBufSurface = null;
        }
    }

    private void destroyTexDrawer() throws Throwable {
        BEGLCurrentState bEGLCurrentStateSave = BEGLCurrentState.save();
        try {
            makeCurrent();
        } catch (BGLException e7) {
            e = e7;
        } catch (Throwable th) {
            th = th;
            bEGLCurrentStateSave.restore();
            throw th;
        }
        try {
            try {
                for (BGLDrawer[][][][] bGLDrawerArr : this.mTexDrawer) {
                    for (BGLDrawer[][][] bGLDrawerArr2 : bGLDrawerArr) {
                        for (BGLDrawer[][] bGLDrawerArr3 : bGLDrawerArr2) {
                            for (BGLDrawer[] bGLDrawerArr4 : bGLDrawerArr3) {
                                for (BGLDrawer bGLDrawer : bGLDrawerArr4) {
                                    if (bGLDrawer != null) {
                                        bGLDrawer.destroy();
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                bEGLCurrentStateSave.restore();
                throw th;
            }
        } catch (BGLException e8) {
            e = e8;
            LivePusherLog.e(TAG, "BEGLContext.destroy exception: ", e);
        }
        bEGLCurrentStateSave.restore();
    }

    private void eglQueryDisplayExtensions() {
        EGLDisplay eGLDisplay = this.mEglDisplay;
        if (eGLDisplay == EGL14.EGL_NO_DISPLAY) {
            return;
        }
        this.eglExtensions = EGL14.eglQueryString(eGLDisplay, 12373);
    }

    private EGLConfig getConfigForMode(boolean z6) {
        return z6 ? this.mEglConfig10 : this.mEglConfig;
    }

    private int[] getSurfaceAttributesForMode(BEGLSurface.RenderMode renderMode) {
        return renderMode == BEGLSurface.RenderMode.HDR_PQ ? new int[]{12445, 13120, 12344} : renderMode == BEGLSurface.RenderMode.HDR_HLG ? new int[]{12445, 13632, 12344} : renderMode == BEGLSurface.RenderMode.HDR_HLG_FILTER2P3 ? new int[]{12445, 13456, 12344} : new int[]{12344};
    }

    private BGLDrawer getTexDrawer(Shaders.Transfer transfer, Shaders.Primaries primaries, Shaders.EETF eetf, Shaders.Primaries primaries2, Shaders.Transfer transfer2) throws BGLException {
        if (this.mTexDrawer[transfer.ordinal()][primaries.ordinal()][eetf.ordinal()][primaries2.ordinal()][transfer2.ordinal()] == null) {
            this.mTexDrawer[transfer.ordinal()][primaries.ordinal()][eetf.ordinal()][primaries2.ordinal()][transfer2.ordinal()] = BGLDrawer.create(getTransProvider(), transfer, primaries, eetf, primaries2, transfer2);
        }
        return this.mTexDrawer[transfer.ordinal()][primaries.ordinal()][eetf.ordinal()][primaries2.ordinal()][transfer2.ordinal()];
    }

    private BGLDrawer.TransStateProvider getTransProvider() {
        return new BGLDrawer.TransStateProvider(this) { // from class: com.bilibili.live.streaming.gl.BEGLContext.1
            final BEGLContext this$0;

            {
                this.this$0 = this;
            }

            @Override // com.bilibili.live.streaming.gl.BGLDrawer.TransStateProvider
            public BGLTransState getTransState() {
                return this.this$0.getTransState();
            }
        };
    }

    private void initConfig() throws BGLException {
        EGLConfig eGLConfigChooseConfig = chooseConfig(false);
        this.mEglConfig = eGLConfigChooseConfig;
        if (eGLConfigChooseConfig == null) {
            BGLUtil.logAndThrow(TAG, BGLException.ID.FAIL_INIT, "Init: no suitable EGLConfig found for 8-bit config");
        }
        try {
            EGLConfig eGLConfigChooseConfig2 = chooseConfig(true);
            this.mEglConfig10 = eGLConfigChooseConfig2;
            if (eGLConfigChooseConfig2 == null) {
                LivePusherLog.w(TAG, "Init: no suitable EGLConfig found for 10-bit config, HDR output will be unavailable", new Exception("No 10-bit EGLConfig"));
            }
        } catch (Exception e7) {
            LivePusherLog.e(TAG, "Init: no suitable EGLConfig found for 10-bit config, HDR output will be unavailable", e7);
            this.mEglConfig10 = null;
        }
    }

    private void initializeEGL() throws BGLException {
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(this.mEglDisplay, iArr, 0, iArr, 1)) {
            return;
        }
        BGLUtil.logAndThrow(TAG, BGLException.ID.FAIL_INIT, "initializeEGL");
    }

    private void queryCaps() throws BGLException {
        makeCurrent();
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(3379, iArr, 0);
        if (GLES20.glGetError() != 0) {
            iArr[0] = 1024;
        }
        this.mMaxTexResolution = iArr[0];
    }

    public BEGLSurface createSurface(int i7, int i8) throws BGLException {
        return createSurface(i7, i8, BEGLSurface.RenderMode.SDR_SRGB);
    }

    public BEGLSurface createSurface(int i7, int i8, BEGLSurface.RenderMode renderMode) throws BGLException {
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.mEglDisplay, getConfigForMode(BEGLSurface.isHDR(renderMode)), new int[]{12375, i7, 12374, i8, 12344}, 0);
        BGLUtil.logAndThrow(TAG, eGLSurfaceEglCreatePbufferSurface == EGL14.EGL_NO_SURFACE, BGLException.ID.SURFACE_ERROR, "createSurface: fail to createEGLContext off-screen surface");
        BEGLSurface bEGLSurface = new BEGLSurface(this, renderMode);
        bEGLSurface.mEglSurface = eGLSurfaceEglCreatePbufferSurface;
        bEGLSurface.mUseFloatFramebuffer = false;
        return bEGLSurface;
    }

    public BEGLSurface createSurface(SurfaceTexture surfaceTexture) throws BGLException {
        return createSurfaceInternal(surfaceTexture, BEGLSurface.RenderMode.SDR_SRGB);
    }

    public BEGLSurface createSurface(SurfaceTexture surfaceTexture, BEGLSurface.RenderMode renderMode) throws BGLException {
        return createSurfaceInternal(surfaceTexture, renderMode);
    }

    public BEGLSurface createSurface(Surface surface) throws BGLException {
        return createSurfaceInternal(surface, BEGLSurface.RenderMode.SDR_SRGB);
    }

    public BEGLSurface createSurface(Surface surface, BEGLSurface.RenderMode renderMode) throws BGLException {
        return createSurfaceInternal(surface, renderMode);
    }

    public EGLContext createSurfaceContext(boolean z6) throws BGLException {
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.mEglDisplay, getConfigForMode(z6), this.mEglCtx, new int[]{12440, 3, 12539, 1, 12344}, 0);
        BGLUtil.logAndThrow(TAG, eGLContextEglCreateContext == EGL14.EGL_NO_CONTEXT, BGLException.ID.FAIL_INIT, "createSurfaceContext: fail to create surface EGLContext");
        return eGLContextEglCreateContext;
    }

    public void destroy() throws Throwable {
        if (this.mEglDisplay == EGL14.EGL_NO_DISPLAY || this.mEglCtx == EGL14.EGL_NO_CONTEXT) {
            return;
        }
        destroyTexDrawer();
        BEGLCurrentState.clean();
        destroyPBufSurface();
        destroyContext();
        EGL14.eglReleaseThread();
        EGL14.eglTerminate(this.mEglDisplay);
        this.mEglDisplay = EGL14.EGL_NO_DISPLAY;
    }

    public BGLDrawer getInputTexDrawer(Shaders.Transfer transfer, Shaders.Primaries primaries) throws BGLException {
        return getInputTexDrawer(transfer, primaries, Shaders.EETF.NO_CONV);
    }

    public BGLDrawer getInputTexDrawer(Shaders.Transfer transfer, Shaders.Primaries primaries, Shaders.EETF eetf) throws BGLException {
        return getTexDrawer(transfer, primaries, eetf, Shaders.Primaries.NO_CONV, Shaders.Transfer.NO_CONV);
    }

    public BGLDrawer getOutputTexDrawer(Shaders.EETF eetf, Shaders.Primaries primaries, Shaders.Transfer transfer) throws BGLException {
        return getTexDrawer(Shaders.Transfer.NO_CONV, Shaders.Primaries.NO_CONV, eetf, primaries, transfer);
    }

    public EGLContext getSharedContext() {
        if (this.mSharedContext == EGL14.EGL_NO_CONTEXT) {
            this.mSharedContext = this.mEglCtx;
        }
        return this.mSharedContext;
    }

    public OpenGLConfig getSupportedOpenGLConfig() {
        OpenGLConfig openGLConfig = new OpenGLConfig();
        openGLConfig.setBt2020PqSupported(this.eglExtensions.contains("EGL_EXT_gl_colorspace_bt2020_pq"));
        openGLConfig.setSMPTE2086MetadataSupported(this.eglExtensions.contains("EGL_EXT_surface_SMPTE2086_metadata"));
        return openGLConfig;
    }

    public int getTextureMaxResolution() {
        return this.mMaxTexResolution;
    }

    public BGLTransState getTransState() {
        return this.mTransState.getLast();
    }

    public EGLContext internalGetContext() {
        return Thread.currentThread().getId() == this.mForegroundThreadId ? this.mEglCtx : this.mBackgroundEglCtx;
    }

    public EGLDisplay internalGetDisplay() {
        return this.mEglDisplay;
    }

    public boolean is10BitSupported() {
        return this.mEglConfig10 != null;
    }

    public void makeCurrent() throws BGLException {
        if (Thread.currentThread().getId() == this.mForegroundThreadId) {
            this.mPBufSurface.makeCurrent();
        } else {
            this.mBackgroundPBufSurface.makeCurrent();
        }
        BGLUtil.clearErrors();
    }

    public void popTransState() {
        this.mTransState.removeLast();
    }

    public void pushTransState() {
        this.mTransState.addLast(new BGLTransState());
    }

    public void swapBuffer() {
        BEGLSurface bEGLSurface = this.mPBufSurface;
        if (bEGLSurface == null) {
            return;
        }
        bEGLSurface.swapBuffer();
    }
}
