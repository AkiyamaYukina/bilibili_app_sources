package com.bilibili.mirror;

import Ds0.c;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;
import com.bilibili.gl.b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mirror/LocalSurface.class */
public final class LocalSurface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f66109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SurfaceTexture f66110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Surface f66111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f66112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Type f66113e = Type.Normal;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f66114f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mirror/LocalSurface$Type.class */
    public enum Type {
        Normal,
        External
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mirror/LocalSurface$a.class */
    public interface a {
        void a(SurfaceTexture surfaceTexture, c cVar);

        void b(SurfaceTexture surfaceTexture);
    }

    public LocalSurface() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        this.f66110b = surfaceTexture;
        surfaceTexture.detachFromGLContext();
        this.f66111c = new Surface(surfaceTexture);
    }

    public final void a() {
        int i7 = b.a;
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        b.a("glGenTextures");
        int i8 = iArr[0];
        GLES20.glBindTexture(36197, i8);
        b.a("glBindTexture " + i8);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        this.f66109a = i8;
        this.f66110b.attachToGLContext(i8);
        this.f66112d = true;
        a aVar = this.f66114f;
        if (aVar != null) {
            aVar.b(this.f66110b);
        }
    }
}
