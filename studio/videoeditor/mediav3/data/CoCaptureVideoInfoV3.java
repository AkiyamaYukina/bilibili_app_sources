package com.bilibili.studio.videoeditor.mediav3.data;

import C.d;
import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.media3.exoplayer.C4690e;
import javax.microedition.khronos.egl.EGLContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/mediav3/data/CoCaptureVideoInfoV3.class */
@Keep
public final class CoCaptureVideoInfoV3 {
    private float degree;

    @Nullable
    private EGLContext eglContext;
    private int height;
    private int textureId;
    private int width;

    public CoCaptureVideoInfoV3() {
        this(null, 0, 0, 0, 0.0f, 31, null);
    }

    public CoCaptureVideoInfoV3(@Nullable EGLContext eGLContext, int i7, int i8, int i9, float f7) {
        this.eglContext = eGLContext;
        this.textureId = i7;
        this.width = i8;
        this.height = i9;
        this.degree = f7;
    }

    public /* synthetic */ CoCaptureVideoInfoV3(EGLContext eGLContext, int i7, int i8, int i9, float f7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : eGLContext, (i10 & 2) != 0 ? 0 : i7, (i10 & 4) != 0 ? 0 : i8, (i10 & 8) != 0 ? 0 : i9, (i10 & 16) != 0 ? 0.0f : f7);
    }

    public static /* synthetic */ CoCaptureVideoInfoV3 copy$default(CoCaptureVideoInfoV3 coCaptureVideoInfoV3, EGLContext eGLContext, int i7, int i8, int i9, float f7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            eGLContext = coCaptureVideoInfoV3.eglContext;
        }
        if ((i10 & 2) != 0) {
            i7 = coCaptureVideoInfoV3.textureId;
        }
        if ((i10 & 4) != 0) {
            i8 = coCaptureVideoInfoV3.width;
        }
        if ((i10 & 8) != 0) {
            i9 = coCaptureVideoInfoV3.height;
        }
        if ((i10 & 16) != 0) {
            f7 = coCaptureVideoInfoV3.degree;
        }
        return coCaptureVideoInfoV3.copy(eGLContext, i7, i8, i9, f7);
    }

    @Nullable
    public final EGLContext component1() {
        return this.eglContext;
    }

    public final int component2() {
        return this.textureId;
    }

    public final int component3() {
        return this.width;
    }

    public final int component4() {
        return this.height;
    }

    public final float component5() {
        return this.degree;
    }

    @NotNull
    public final CoCaptureVideoInfoV3 copy(@Nullable EGLContext eGLContext, int i7, int i8, int i9, float f7) {
        return new CoCaptureVideoInfoV3(eGLContext, i7, i8, i9, f7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoCaptureVideoInfoV3)) {
            return false;
        }
        CoCaptureVideoInfoV3 coCaptureVideoInfoV3 = (CoCaptureVideoInfoV3) obj;
        return Intrinsics.areEqual(this.eglContext, coCaptureVideoInfoV3.eglContext) && this.textureId == coCaptureVideoInfoV3.textureId && this.width == coCaptureVideoInfoV3.width && this.height == coCaptureVideoInfoV3.height && Float.compare(this.degree, coCaptureVideoInfoV3.degree) == 0;
    }

    public final float getDegree() {
        return this.degree;
    }

    @Nullable
    public final EGLContext getEglContext() {
        return this.eglContext;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getTextureId() {
        return this.textureId;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        EGLContext eGLContext = this.eglContext;
        return Float.hashCode(this.degree) + I.a(this.height, I.a(this.width, I.a(this.textureId, (eGLContext == null ? 0 : eGLContext.hashCode()) * 31, 31), 31), 31);
    }

    public final void setDegree(float f7) {
        this.degree = f7;
    }

    public final void setEglContext(@Nullable EGLContext eGLContext) {
        this.eglContext = eGLContext;
    }

    public final void setHeight(int i7) {
        this.height = i7;
    }

    public final void setTextureId(int i7) {
        this.textureId = i7;
    }

    public final void setWidth(int i7) {
        this.width = i7;
    }

    @NotNull
    public String toString() {
        EGLContext eGLContext = this.eglContext;
        int i7 = this.textureId;
        int i8 = this.width;
        int i9 = this.height;
        float f7 = this.degree;
        StringBuilder sb = new StringBuilder("CoCaptureVideoInfoV3(eglContext=");
        sb.append(eGLContext);
        sb.append(", textureId=");
        sb.append(i7);
        sb.append(", width=");
        C4690e.a(i8, i9, ", height=", ", degree=", sb);
        return d.a(f7, ")", sb);
    }
}
