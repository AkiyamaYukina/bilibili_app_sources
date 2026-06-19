package com.bilibili.live.streaming.gl;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import com.bilibili.live.streaming.gl.BGLException;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/gl/BEGLCurrentState.class */
public class BEGLCurrentState {
    private EGLContext mPrevContext;
    private EGLDisplay mPrevDisplay;
    private EGLSurface mPrevReadSurface;
    private EGLSurface mPrevWriteSurface;

    public static void clean() {
        EGLDisplay eGLDisplayEglGetCurrentDisplay = EGL14.eglGetCurrentDisplay();
        if (eGLDisplayEglGetCurrentDisplay == EGL14.EGL_NO_DISPLAY) {
            return;
        }
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplayEglGetCurrentDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        try {
            BGLUtil.logEGLErrAndThrow("BGLUtil", BGLException.ID.MAKE_CURRENT, "eglMakeCurrent error");
        } catch (BGLException e7) {
        }
    }

    public static BEGLCurrentState save() {
        BEGLCurrentState bEGLCurrentState = new BEGLCurrentState();
        bEGLCurrentState.mPrevContext = EGL14.eglGetCurrentContext();
        bEGLCurrentState.mPrevDisplay = EGL14.eglGetCurrentDisplay();
        bEGLCurrentState.mPrevReadSurface = EGL14.eglGetCurrentSurface(12378);
        bEGLCurrentState.mPrevWriteSurface = EGL14.eglGetCurrentSurface(12377);
        return bEGLCurrentState;
    }

    public void clear() {
        this.mPrevContext = null;
        this.mPrevDisplay = null;
        this.mPrevReadSurface = null;
        this.mPrevWriteSurface = null;
    }

    public void restore() {
        EGLDisplay eGLDisplay = this.mPrevDisplay;
        if (eGLDisplay == EGL14.EGL_NO_DISPLAY) {
            return;
        }
        EGL14.eglMakeCurrent(eGLDisplay, this.mPrevWriteSurface, this.mPrevReadSurface, this.mPrevContext);
    }
}
