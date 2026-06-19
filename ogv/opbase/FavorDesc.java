package com.bilibili.ogv.opbase;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.c;
import com.alibaba.fastjson.annotation.JSONField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/FavorDesc.class */
@StabilityInferred(parameters = 0)
@Keep
public final class FavorDesc {
    public static final int $stable = 8;

    @JSONField(name = "text")
    @Nullable
    private String text;

    @JSONField(name = "type")
    private int type;

    public FavorDesc() {
        this(null, 0, 3, null);
    }

    public FavorDesc(@Nullable String str, int i7) {
        this.text = str;
        this.type = i7;
    }

    public /* synthetic */ FavorDesc(String str, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? "" : str, (i8 & 2) != 0 ? 1 : i7);
    }

    public static /* synthetic */ FavorDesc copy$default(FavorDesc favorDesc, String str, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = favorDesc.text;
        }
        if ((i8 & 2) != 0) {
            i7 = favorDesc.type;
        }
        return favorDesc.copy(str, i7);
    }

    @Nullable
    public final String component1() {
        return this.text;
    }

    public final int component2() {
        return this.type;
    }

    @NotNull
    public final FavorDesc copy(@Nullable String str, int i7) {
        return new FavorDesc(str, i7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FavorDesc)) {
            return false;
        }
        FavorDesc favorDesc = (FavorDesc) obj;
        return Intrinsics.areEqual(this.text, favorDesc.text) && this.type == favorDesc.type;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.text;
        return Integer.hashCode(this.type) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final void setText(@Nullable String str) {
        this.text = str;
    }

    public final void setType(int i7) {
        this.type = i7;
    }

    @NotNull
    public String toString() {
        return c.a(this.type, "FavorDesc(text=", this.text, ", type=", ")");
    }
}
