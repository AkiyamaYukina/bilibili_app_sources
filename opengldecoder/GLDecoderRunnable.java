package com.bilibili.opengldecoder;

import C0.d;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.util.Log;
import android.view.Surface;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opengldecoder/GLDecoderRunnable.class */
public class GLDecoderRunnable implements Runnable {
    private static final String TAG = "GLDecoderRunnable";
    protected int EGLVersion;
    private EGL10 egl;
    protected EGLContext eglContext;
    private EGLDisplay eglDisplay;
    private EGLSurface eglSurface;
    private boolean enableTexture;
    protected volatile boolean frameAvailable;
    protected int height;
    protected volatile boolean lockUpdate;
    private SurfaceTexture mDisplayTexture;
    protected EGLContext mSharedContext;
    private Surface mSurface;
    protected SurfaceTexture.OnFrameAvailableListener mSurfaceFrameListener;
    protected DecoderRunnableListener mSurfaceListener;
    protected SurfaceTexture mVideoTexture;
    protected volatile boolean running;
    private int[] textures;
    protected int width;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opengldecoder/GLDecoderRunnable$DecoderRunnableListener.class */
    public interface DecoderRunnableListener {
        void onFrameAvailable(SurfaceTexture surfaceTexture);

        void onSurfaceCreated();
    }

    public GLDecoderRunnable(SurfaceTexture surfaceTexture, int i7, int i8, DecoderRunnableListener decoderRunnableListener) {
        this.textures = new int[1];
        this.mSharedContext = EGL10.EGL_NO_CONTEXT;
        this.EGLVersion = 2;
        this.width = 512;
        this.height = 512;
        this.enableTexture = true;
        this.mDisplayTexture = surfaceTexture;
        this.running = true;
        this.width = i7;
        this.height = i8;
        this.mSurfaceListener = decoderRunnableListener;
    }

    public GLDecoderRunnable(Surface surface, int i7, int i8, DecoderRunnableListener decoderRunnableListener) {
        this.textures = new int[1];
        this.mSharedContext = EGL10.EGL_NO_CONTEXT;
        this.EGLVersion = 2;
        this.width = 512;
        this.height = 512;
        this.enableTexture = true;
        this.mSurface = surface;
        this.running = true;
        this.width = i7;
        this.height = i8;
        this.mSurfaceListener = decoderRunnableListener;
    }

    public GLDecoderRunnable(EGLContext eGLContext, int i7, int i8, int i9, DecoderRunnableListener decoderRunnableListener) {
        this.textures = new int[1];
        this.width = 512;
        this.height = 512;
        this.enableTexture = true;
        this.mSharedContext = eGLContext;
        this.EGLVersion = i7;
        this.running = true;
        this.width = i8;
        this.height = i9;
        this.mSurfaceListener = decoderRunnableListener;
    }

    public GLDecoderRunnable(EGLContext eGLContext, int i7, int i8, DecoderRunnableListener decoderRunnableListener) {
        this.textures = new int[1];
        this.EGLVersion = 2;
        this.width = 512;
        this.height = 512;
        this.enableTexture = true;
        this.mSharedContext = eGLContext;
        this.running = true;
        this.width = i7;
        this.height = i8;
        this.mSurfaceListener = decoderRunnableListener;
    }

    public GLDecoderRunnable(EGLContext eGLContext, int i7, int i8, DecoderRunnableListener decoderRunnableListener, boolean z6) {
        this.textures = new int[1];
        this.EGLVersion = 2;
        this.width = 512;
        this.height = 512;
        this.enableTexture = true;
        this.mSharedContext = eGLContext;
        this.running = true;
        this.width = i7;
        this.height = i8;
        this.mSurfaceListener = decoderRunnableListener;
        this.enableTexture = z6;
    }

    private EGLConfig chooseEglConfig(boolean z6) {
        int[] iArr = new int[1];
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (this.egl.eglChooseConfig(this.eglDisplay, z6 ? getAttributes() : getPBufferAttributes(), eGLConfigArr, 1, iArr)) {
            if (iArr[0] > 0) {
                return eGLConfigArr[0];
            }
            return null;
        }
        throw new IllegalArgumentException("Failed to choose config:" + GLUtils.getEGLErrorString(this.egl.eglGetError()));
    }

    private EGLContext createContext(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i7) {
        return this.egl.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, new int[]{12440, i7, 12344});
    }

    private void deinitEGL() {
        EGL10 egl10 = this.egl;
        if (egl10 != null) {
            EGLDisplay eGLDisplay = this.eglDisplay;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.egl.eglDestroySurface(this.eglDisplay, this.eglSurface);
            this.egl.eglDestroyContext(this.eglDisplay, this.eglContext);
            this.egl.eglTerminate(this.eglDisplay);
        }
    }

    private int[] getAttributes() {
        return new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12326, 0, 12344};
    }

    private int[] getPBufferAttributes() {
        return new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12326, 0, 12339, 1, 12344};
    }

    private void setupTexture() {
        GLES20.glActiveTexture(33984);
        GLES20.glGenTextures(1, this.textures, 0);
        checkGlError("Texture generate");
        GLES20.glBindTexture(36197, this.textures[0]);
        checkGlError("Texture bind");
        this.mSurfaceFrameListener = new SurfaceTexture.OnFrameAvailableListener(this) { // from class: com.bilibili.opengldecoder.GLDecoderRunnable.1
            final GLDecoderRunnable this$0;

            {
                this.this$0 = this;
            }

            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                synchronized (this.this$0) {
                    this.this$0.frameAvailable = true;
                    DecoderRunnableListener decoderRunnableListener = this.this$0.mSurfaceListener;
                    if (decoderRunnableListener != null) {
                        decoderRunnableListener.onFrameAvailable(surfaceTexture);
                    }
                }
            }
        };
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.textures[0]);
        this.mVideoTexture = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this.mSurfaceFrameListener);
    }

    public void checkGlError(String str) {
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                return;
            }
            StringBuilder sbA = d.a(str, ": glError ");
            sbA.append(GLUtils.getEGLErrorString(iGlGetError));
            Log.e(TAG, sbA.toString());
        }
    }

    public void deinitGLComponents() {
        GLES20.glDeleteTextures(1, this.textures, 0);
        this.mVideoTexture.release();
        this.mVideoTexture.setOnFrameAvailableListener(null);
        this.mSurfaceFrameListener = null;
    }

    public boolean draw() {
        synchronized (this) {
            if (!this.frameAvailable || this.lockUpdate) {
                return false;
            }
            this.mVideoTexture.updateTexImage();
            this.frameAvailable = false;
            return false;
        }
    }

    public SurfaceTexture.OnFrameAvailableListener getSurfaceFrameListener() {
        return this.mSurfaceFrameListener;
    }

    public SurfaceTexture getSurfaceTexture() {
        return this.mVideoTexture;
    }

    public int getTextureId() {
        return this.textures[0];
    }

    public void initDraw() {
    }

    public void initEGL() {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.egl = egl10;
        EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.eglDisplay = eGLDisplayEglGetDisplay;
        this.egl.eglInitialize(eGLDisplayEglGetDisplay, new int[2]);
        EGLConfig eGLConfigChooseEglConfig = chooseEglConfig((this.mDisplayTexture == null && this.mSurface == null) ? false : true);
        SurfaceTexture surfaceTexture = this.mDisplayTexture;
        if (surfaceTexture != null) {
            this.eglSurface = this.egl.eglCreateWindowSurface(this.eglDisplay, eGLConfigChooseEglConfig, surfaceTexture, new int[]{12344});
        } else {
            Surface surface = this.mSurface;
            if (surface != null) {
                this.eglSurface = this.egl.eglCreateWindowSurface(this.eglDisplay, eGLConfigChooseEglConfig, surface, new int[]{12344});
            } else {
                this.eglSurface = this.egl.eglCreatePbufferSurface(this.eglDisplay, eGLConfigChooseEglConfig, new int[]{12375, this.width, 12374, this.height, 12344});
            }
        }
        EGLContext eGLContextCreateContext = createContext(this.eglDisplay, eGLConfigChooseEglConfig, this.mSharedContext, this.EGLVersion);
        this.eglContext = eGLContextCreateContext;
        try {
            EGLSurface eGLSurface = this.eglSurface;
            if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
                throw new RuntimeException("GL error:" + GLUtils.getEGLErrorString(this.egl.eglGetError()));
            }
            if (this.egl.eglMakeCurrent(this.eglDisplay, eGLSurface, eGLSurface, eGLContextCreateContext)) {
                return;
            }
            throw new RuntimeException("GL Make current Error" + GLUtils.getEGLErrorString(this.egl.eglGetError()));
        } catch (Exception e7) {
            e7.printStackTrace();
        }
    }

    public void initGLComponents() {
        setupTexture();
    }

    public void releaseDraw() {
    }

    @Override // java.lang.Runnable
    public void run() {
        initEGL();
        if (this.enableTexture) {
            initGLComponents();
        }
        this.mSurfaceListener.onSurfaceCreated();
        initDraw();
        while (this.running) {
            if (draw()) {
                swapBuffer();
            }
        }
        releaseDraw();
        if (this.enableTexture) {
            deinitGLComponents();
        }
        deinitEGL();
    }

    public void setLockUpdate(boolean z6) {
        synchronized (this) {
            this.lockUpdate = z6;
        }
    }

    public void stopDraw() {
        this.running = false;
    }

    public void swapBuffer() {
        this.egl.eglSwapBuffers(this.eglDisplay, this.eglSurface);
    }
}
