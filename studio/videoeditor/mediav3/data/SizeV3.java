package com.bilibili.studio.videoeditor.mediav3.data;

import androidx.annotation.Keep;
import androidx.compose.runtime.collection.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/mediav3/data/SizeV3.class */
@Keep
public final class SizeV3 {
    private int height;
    private int width;

    public SizeV3() {
        this(0, 0, 3, null);
    }

    public SizeV3(int i7, int i8) {
        this.width = i7;
        this.height = i8;
    }

    public /* synthetic */ SizeV3(int i7, int i8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? 0 : i7, (i9 & 2) != 0 ? 0 : i8);
    }

    public static /* synthetic */ SizeV3 copy$default(SizeV3 sizeV3, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i7 = sizeV3.width;
        }
        if ((i9 & 2) != 0) {
            i8 = sizeV3.height;
        }
        return sizeV3.copy(i7, i8);
    }

    public final int component1() {
        return this.width;
    }

    public final int component2() {
        return this.height;
    }

    @NotNull
    public final SizeV3 copy(int i7, int i8) {
        return new SizeV3(i7, i8);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeV3)) {
            return false;
        }
        SizeV3 sizeV3 = (SizeV3) obj;
        return this.width == sizeV3.width && this.height == sizeV3.height;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Integer.hashCode(this.height) + (Integer.hashCode(this.width) * 31);
    }

    public final void setHeight(int i7) {
        this.height = i7;
    }

    public final void setWidth(int i7) {
        this.width = i7;
    }

    @NotNull
    public String toString() {
        return d.a(this.width, this.height, "SizeV3(width=", ", height=", ")");
    }
}
