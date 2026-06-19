package com.bilibili.studio.videoeditor.mediav3.data;

import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.C4277b;
import com.bilibili.search2.result.vertical.live.report.ReporterMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/mediav3/data/CoCaptureRectV3.class */
@Keep
public final class CoCaptureRectV3 {
    public static final int CAMERA_CONTENT = 0;

    @NotNull
    public static final a Companion = new Object();
    public static final int ROTATION_0 = 0;
    public static final int ROTATION_180 = 2;
    public static final int ROTATION_270 = 3;
    public static final int ROTATION_90 = 1;
    public static final int VIDEO_CONTENT = 1;
    private int contentType;

    @NotNull
    private RectFV3 rectV3;
    private int rotation;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/mediav3/data/CoCaptureRectV3$a.class */
    public static final class a {
    }

    public CoCaptureRectV3(@NotNull RectFV3 rectFV3, int i7, int i8) {
        this.rectV3 = rectFV3;
        this.contentType = i7;
        this.rotation = i8;
    }

    public static /* synthetic */ CoCaptureRectV3 copy$default(CoCaptureRectV3 coCaptureRectV3, RectFV3 rectFV3, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            rectFV3 = coCaptureRectV3.rectV3;
        }
        if ((i9 & 2) != 0) {
            i7 = coCaptureRectV3.contentType;
        }
        if ((i9 & 4) != 0) {
            i8 = coCaptureRectV3.rotation;
        }
        return coCaptureRectV3.copy(rectFV3, i7, i8);
    }

    @NotNull
    public final RectFV3 component1() {
        return this.rectV3;
    }

    public final int component2() {
        return this.contentType;
    }

    public final int component3() {
        return this.rotation;
    }

    @NotNull
    public final CoCaptureRectV3 copy(@NotNull RectFV3 rectFV3, int i7, int i8) {
        return new CoCaptureRectV3(rectFV3, i7, i8);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoCaptureRectV3)) {
            return false;
        }
        CoCaptureRectV3 coCaptureRectV3 = (CoCaptureRectV3) obj;
        return Intrinsics.areEqual(this.rectV3, coCaptureRectV3.rectV3) && this.contentType == coCaptureRectV3.contentType && this.rotation == coCaptureRectV3.rotation;
    }

    public final int getContentType() {
        return this.contentType;
    }

    @NotNull
    public final RectFV3 getRectV3() {
        return this.rectV3;
    }

    public final int getRotation() {
        return this.rotation;
    }

    public int hashCode() {
        return Integer.hashCode(this.rotation) + I.a(this.contentType, this.rectV3.hashCode() * 31, 31);
    }

    public final void setContentType(int i7) {
        this.contentType = i7;
    }

    public final void setRectV3(@NotNull RectFV3 rectFV3) {
        this.rectV3 = rectFV3;
    }

    public final void setRotation(int i7) {
        this.rotation = i7;
    }

    @NotNull
    public String toString() {
        RectFV3 rectFV3 = this.rectV3;
        int i7 = this.contentType;
        int i8 = this.rotation;
        StringBuilder sb = new StringBuilder("CoCaptureRectV3{ rectV3=");
        sb.append(rectFV3);
        sb.append(", contentType=");
        sb.append(i7);
        sb.append(", rotation=");
        return C4277b.a(i8, ReporterMap.RIGHT_BRACES, sb);
    }
}
