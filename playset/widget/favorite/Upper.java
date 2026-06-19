package com.bilibili.playset.widget.favorite;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/Upper.class */
@StabilityInferred(parameters = 1)
@Bson
@Keep
public final class Upper {
    public static final int $stable = 0;

    @SerializedName(EditCustomizeSticker.TAG_MID)
    private final long mid;

    @SerializedName("name")
    @NotNull
    private final String name;

    public Upper(long j7, @NotNull String str) {
        this.mid = j7;
        this.name = str;
    }

    public static /* synthetic */ Upper copy$default(Upper upper, long j7, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j7 = upper.mid;
        }
        if ((i7 & 2) != 0) {
            str = upper.name;
        }
        return upper.copy(j7, str);
    }

    public final long component1() {
        return this.mid;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    @NotNull
    public final Upper copy(long j7, @NotNull String str) {
        return new Upper(j7, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Upper)) {
            return false;
        }
        Upper upper = (Upper) obj;
        return this.mid == upper.mid && Intrinsics.areEqual(this.name, upper.name);
    }

    public final long getMid() {
        return this.mid;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode() + (Long.hashCode(this.mid) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sbA = com.bilibili.ad.adview.pegasus.banner.topview.res.n.a(this.mid, "Upper(mid=", ", name=", this.name);
        sbA.append(")");
        return sbA.toString();
    }
}
