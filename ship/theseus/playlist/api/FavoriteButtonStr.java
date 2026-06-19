package com.bilibili.ship.theseus.playlist.api;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.motion.widget.p;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/api/FavoriteButtonStr.class */
@StabilityInferred(parameters = 1)
@Bson
public final class FavoriteButtonStr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("select_ed")
    @NotNull
    private final String f95200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("un_select")
    @NotNull
    private final String f95201b;

    public FavoriteButtonStr() {
        this(null, null, 3);
    }

    public FavoriteButtonStr(String str, String str2, int i7) {
        str = (i7 & 1) != 0 ? "" : str;
        str2 = (i7 & 2) != 0 ? "" : str2;
        this.f95200a = str;
        this.f95201b = str2;
    }

    @NotNull
    public final String a() {
        return this.f95200a;
    }

    @NotNull
    public final String b() {
        return this.f95201b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FavoriteButtonStr)) {
            return false;
        }
        FavoriteButtonStr favoriteButtonStr = (FavoriteButtonStr) obj;
        return Intrinsics.areEqual(this.f95200a, favoriteButtonStr.f95200a) && Intrinsics.areEqual(this.f95201b, favoriteButtonStr.f95201b);
    }

    public final int hashCode() {
        return this.f95201b.hashCode() + (this.f95200a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return p.a("FavoriteButtonStr(select=", this.f95200a, ", unselect=", this.f95201b, ")");
    }
}
