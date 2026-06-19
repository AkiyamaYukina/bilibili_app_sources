package com.bilibili.studio.videoeditor.media.base.opengl;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLSurfaceView;
import android.opengl.GLUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.TextureView;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/media/base/opengl/GLTextureView.class */
public class GLTextureView extends TextureView implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GLSurfaceView.Renderer f109820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SurfaceTexture f109821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public EGLDisplay f109822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EGLSurface f109823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EGLContext f109824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EGL10 f109825f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public EGLConfig f109826g;
    public GL10 h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public EGLContext f109827i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f109828j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f109829k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f109830l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f109831m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f109832n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f109833o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f109834p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public a f109835q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f109836r;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/media/base/opengl/GLTextureView$a.class */
    public final class a extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GLTextureView f109837a;

        public a(GLTextureView gLTextureView) {
            this.f109837a = gLTextureView;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            GLTextureView gLTextureView;
            GLSurfaceView.Renderer renderer;
            boolean z6;
            boolean z7;
            GLTextureView gLTextureView2 = this.f109837a;
            gLTextureView2.f109832n = true;
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            gLTextureView2.f109825f = egl10;
            EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            gLTextureView2.f109822c = eGLDisplayEglGetDisplay;
            if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                throw new RuntimeException("eglGetDisplay failed " + GLUtils.getEGLErrorString(gLTextureView2.f109825f.eglGetError()));
            }
            if (!gLTextureView2.f109825f.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
                throw new RuntimeException("eglInitialize failed " + GLUtils.getEGLErrorString(gLTextureView2.f109825f.eglGetError()));
            }
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            gLTextureView2.f109826g = null;
            if (!gLTextureView2.f109825f.eglChooseConfig(gLTextureView2.f109822c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                throw new IllegalArgumentException("eglChooseConfig failed " + GLUtils.getEGLErrorString(gLTextureView2.f109825f.eglGetError()));
            }
            if (iArr[0] > 0) {
                gLTextureView2.f109826g = eGLConfigArr[0];
            }
            EGLConfig eGLConfig = gLTextureView2.f109826g;
            if (eGLConfig == null) {
                throw new RuntimeException("eglConfig not initialized");
            }
            gLTextureView2.f109824e = gLTextureView2.f109825f.eglCreateContext(gLTextureView2.f109822c, eGLConfig, gLTextureView2.f109827i, new int[]{12440, 3, 12344});
            gLTextureView2.b();
            gLTextureView2.f109823d = gLTextureView2.f109825f.eglCreateWindowSurface(gLTextureView2.f109822c, gLTextureView2.f109826g, gLTextureView2.f109821b, null);
            gLTextureView2.b();
            EGLSurface eGLSurface = gLTextureView2.f109823d;
            if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
                int iEglGetError = gLTextureView2.f109825f.eglGetError();
                if (iEglGetError != 12299) {
                    throw new RuntimeException("eglCreateWindowSurface failed " + GLUtils.getEGLErrorString(iEglGetError));
                }
                Log.e("RenderThread", "eglCreateWindowSurface returned EGL10.EGL_BAD_NATIVE_WINDOW");
            } else {
                if (!gLTextureView2.f109825f.eglMakeCurrent(gLTextureView2.f109822c, eGLSurface, eGLSurface, gLTextureView2.f109824e)) {
                    throw new RuntimeException("eglMakeCurrent failed " + GLUtils.getEGLErrorString(gLTextureView2.f109825f.eglGetError()));
                }
                gLTextureView2.b();
                gLTextureView2.h = (GL10) gLTextureView2.f109824e.getGL();
                gLTextureView2.b();
            }
            this.f109837a.c();
            long jCurrentTimeMillis = System.currentTimeMillis();
            while (this.f109837a.f109832n) {
                while (true) {
                    gLTextureView = this.f109837a;
                    renderer = gLTextureView.f109820a;
                    if (renderer != null) {
                        break;
                    } else {
                        try {
                            Thread.sleep(100L);
                        } catch (InterruptedException e7) {
                        }
                    }
                }
                if (gLTextureView.f109834p) {
                    synchronized (gLTextureView) {
                        if (gLTextureView.f109832n) {
                            renderer.onSurfaceCreated(gLTextureView.h, gLTextureView.f109826g);
                            renderer.onSurfaceChanged(gLTextureView.h, gLTextureView.f109830l, gLTextureView.f109829k);
                        }
                    }
                    this.f109837a.f109834p = false;
                }
                GLTextureView gLTextureView3 = this.f109837a;
                synchronized (gLTextureView3) {
                    z6 = gLTextureView3.f109833o;
                }
                long jCurrentTimeMillis2 = jCurrentTimeMillis;
                if (!z6) {
                    if (gLTextureView3.f109820a == null) {
                        jCurrentTimeMillis2 = jCurrentTimeMillis;
                    } else {
                        jCurrentTimeMillis2 = System.currentTimeMillis();
                        GLTextureView gLTextureView4 = this.f109837a;
                        synchronized (gLTextureView4) {
                            gLTextureView4.a();
                            GLSurfaceView.Renderer renderer2 = gLTextureView4.f109820a;
                            if (renderer2 != null) {
                                renderer2.onDrawFrame(gLTextureView4.h);
                            }
                            gLTextureView4.c();
                            if (!gLTextureView4.f109825f.eglSwapBuffers(gLTextureView4.f109822c, gLTextureView4.f109823d)) {
                                Log.e("RenderThread", "cannot swap buffers!");
                            }
                        }
                    }
                }
                try {
                    GLTextureView gLTextureView5 = this.f109837a;
                    synchronized (gLTextureView5) {
                        z7 = gLTextureView5.f109833o;
                    }
                    if (z7 || gLTextureView5.f109820a == null) {
                        Thread.sleep(100L);
                        jCurrentTimeMillis = jCurrentTimeMillis2;
                    } else {
                        jCurrentTimeMillis = System.currentTimeMillis();
                        try {
                            Thread.sleep(Math.max(10L, ((long) this.f109837a.f109828j) - (jCurrentTimeMillis - jCurrentTimeMillis2)));
                        } catch (InterruptedException e8) {
                        }
                    }
                } catch (InterruptedException e9) {
                    jCurrentTimeMillis = jCurrentTimeMillis2;
                }
            }
        }
    }

    public GLTextureView(Context context) {
        super(context);
        this.f109827i = EGL10.EGL_NO_CONTEXT;
        this.f109831m = false;
        this.f109832n = false;
        this.f109833o = false;
        this.f109834p = false;
        this.f109836r = 20;
        setSurfaceTextureListener(this);
    }

    public GLTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f109827i = EGL10.EGL_NO_CONTEXT;
        this.f109831m = false;
        this.f109832n = false;
        this.f109833o = false;
        this.f109834p = false;
        this.f109836r = 20;
        setSurfaceTextureListener(this);
    }

    public final void a() {
        if (this.f109824e.equals(this.f109825f.eglGetCurrentContext()) && this.f109823d.equals(this.f109825f.eglGetCurrentSurface(12377))) {
            return;
        }
        b();
        EGL10 egl10 = this.f109825f;
        EGLDisplay eGLDisplay = this.f109822c;
        EGLSurface eGLSurface = this.f109823d;
        if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f109824e)) {
            b();
        } else {
            throw new RuntimeException("eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.f109825f.eglGetError()));
        }
    }

    public final void b() {
        int iEglGetError = this.f109825f.eglGetError();
        if (iEglGetError != 12288) {
            Log.e("RenderThread", "EGL error = 0x" + Integer.toHexString(iEglGetError));
        }
    }

    public final void c() {
        int iGlGetError = this.h.glGetError();
        if (iGlGetError != 0) {
            Log.e("RenderThread", "GL error = 0x" + Integer.toHexString(iGlGetError));
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i8) {
        if (this.f109831m) {
            return;
        }
        float f7 = this.f109836r;
        a aVar = new a(this);
        this.f109835q = aVar;
        this.f109821b = surfaceTexture;
        this.f109830l = i7;
        this.f109829k = i8;
        this.f109828j = (int) ((1.0f / f7) * 1000.0f);
        aVar.start();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        a aVar = this.f109835q;
        if (aVar == null) {
            return false;
        }
        this.f109832n = false;
        try {
            aVar.join();
        } catch (InterruptedException e7) {
            e7.printStackTrace();
        }
        this.f109835q = null;
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i8) {
        this.f109830l = i7;
        this.f109829k = i8;
        GLSurfaceView.Renderer renderer = this.f109820a;
        if (renderer != null) {
            renderer.onSurfaceChanged(this.h, i7, i8);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void setPaused(boolean z6) {
        synchronized (this) {
            new StringBuilder("Setting GLTextureView paused to ").append(z6);
            this.f109833o = z6;
        }
    }

    public void setRenderer(GLSurfaceView.Renderer renderer) {
        synchronized (this) {
            this.f109820a = renderer;
            this.f109834p = true;
        }
    }

    public void setSharedEGLContext(EGLContext eGLContext) {
        synchronized (this) {
            this.f109827i = eGLContext;
        }
    }
}
