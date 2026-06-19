package com.bilibili.studio.videoeditor.mediav3.data;

import O4.b;
import androidx.annotation.Keep;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/mediav3/data/RenderBeautifyV3.class */
@Keep
public final class RenderBeautifyV3 {
    private boolean inheritBeauty;
    private boolean inheritFilter;

    public RenderBeautifyV3() {
        this(false, false, 3, null);
    }

    public RenderBeautifyV3(boolean z6, boolean z7) {
        this.inheritFilter = z6;
        this.inheritBeauty = z7;
    }

    public /* synthetic */ RenderBeautifyV3(boolean z6, boolean z7, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? true : z6, (i7 & 2) != 0 ? true : z7);
    }

    public static /* synthetic */ RenderBeautifyV3 copy$default(RenderBeautifyV3 renderBeautifyV3, boolean z6, boolean z7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z6 = renderBeautifyV3.inheritFilter;
        }
        if ((i7 & 2) != 0) {
            z7 = renderBeautifyV3.inheritBeauty;
        }
        return renderBeautifyV3.copy(z6, z7);
    }

    public final boolean component1() {
        return this.inheritFilter;
    }

    public final boolean component2() {
        return this.inheritBeauty;
    }

    @NotNull
    public final RenderBeautifyV3 copy(boolean z6, boolean z7) {
        return new RenderBeautifyV3(z6, z7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RenderBeautifyV3)) {
            return false;
        }
        RenderBeautifyV3 renderBeautifyV3 = (RenderBeautifyV3) obj;
        return this.inheritFilter == renderBeautifyV3.inheritFilter && this.inheritBeauty == renderBeautifyV3.inheritBeauty;
    }

    public final boolean getInheritBeauty() {
        return this.inheritBeauty;
    }

    public final boolean getInheritFilter() {
        return this.inheritFilter;
    }

    public int hashCode() {
        return Boolean.hashCode(this.inheritBeauty) + (Boolean.hashCode(this.inheritFilter) * 31);
    }

    public final void setInheritBeauty(boolean z6) {
        this.inheritBeauty = z6;
    }

    public final void setInheritFilter(boolean z6) {
        this.inheritFilter = z6;
    }

    @NotNull
    public String toString() {
        return b.b("RenderBeautifyV3(inheritFilter=", ", inheritBeauty=", ")", this.inheritFilter, this.inheritBeauty);
    }
}
