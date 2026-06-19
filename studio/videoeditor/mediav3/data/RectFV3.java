package com.bilibili.studio.videoeditor.mediav3.data;

import Dp.b;
import androidx.annotation.Keep;
import androidx.compose.animation.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/mediav3/data/RectFV3.class */
@Keep
public final class RectFV3 {
    private float height;
    private float width;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f109852x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f109853y;

    public RectFV3(float f7, float f8, float f9, float f10) {
        this.f109852x = f7;
        this.f109853y = f8;
        this.width = f9;
        this.height = f10;
    }

    public static /* synthetic */ RectFV3 copy$default(RectFV3 rectFV3, float f7, float f8, float f9, float f10, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            f7 = rectFV3.f109852x;
        }
        if ((i7 & 2) != 0) {
            f8 = rectFV3.f109853y;
        }
        if ((i7 & 4) != 0) {
            f9 = rectFV3.width;
        }
        if ((i7 & 8) != 0) {
            f10 = rectFV3.height;
        }
        return rectFV3.copy(f7, f8, f9, f10);
    }

    public final float component1() {
        return this.f109852x;
    }

    public final float component2() {
        return this.f109853y;
    }

    public final float component3() {
        return this.width;
    }

    public final float component4() {
        return this.height;
    }

    @NotNull
    public final RectFV3 copy(float f7, float f8, float f9, float f10) {
        return new RectFV3(f7, f8, f9, f10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RectFV3)) {
            return false;
        }
        RectFV3 rectFV3 = (RectFV3) obj;
        return Float.compare(this.f109852x, rectFV3.f109852x) == 0 && Float.compare(this.f109853y, rectFV3.f109853y) == 0 && Float.compare(this.width, rectFV3.width) == 0 && Float.compare(this.height, rectFV3.height) == 0;
    }

    public final float getHeight() {
        return this.height;
    }

    public final float getWidth() {
        return this.width;
    }

    public final float getX() {
        return this.f109852x;
    }

    public final float getY() {
        return this.f109853y;
    }

    public int hashCode() {
        return Float.hashCode(this.height) + n.a(this.width, n.a(this.f109853y, Float.hashCode(this.f109852x) * 31, 31), 31);
    }

    public final void setHeight(float f7) {
        this.height = f7;
    }

    public final void setWidth(float f7) {
        this.width = f7;
    }

    public final void setX(float f7) {
        this.f109852x = f7;
    }

    public final void setY(float f7) {
        this.f109853y = f7;
    }

    @NotNull
    public String toString() {
        float f7 = this.f109852x;
        float f8 = this.f109853y;
        float f9 = this.width;
        float f10 = this.height;
        StringBuilder sbA = b.a("RectFV3{ x= ", f7, ", y=", f8, ", width=");
        sbA.append(f9);
        sbA.append(", height=");
        sbA.append(f10);
        sbA.append(" }");
        return sbA.toString();
    }
}
