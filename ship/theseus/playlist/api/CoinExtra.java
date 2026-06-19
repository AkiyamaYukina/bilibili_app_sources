package com.bilibili.ship.theseus.playlist.api;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.d;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/api/CoinExtra.class */
@StabilityInferred(parameters = 1)
@Bson
public final class CoinExtra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f95197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("coin_number")
    private final int f95198b;

    public CoinExtra() {
        this(0, 0, 3);
    }

    public CoinExtra(int i7, int i8, int i9) {
        i7 = (i9 & 1) != 0 ? 0 : i7;
        i8 = (i9 & 2) != 0 ? 0 : i8;
        this.f95197a = i7;
        this.f95198b = i8;
    }

    public final int a() {
        return this.f95198b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoinExtra)) {
            return false;
        }
        CoinExtra coinExtra = (CoinExtra) obj;
        return this.f95197a == coinExtra.f95197a && this.f95198b == coinExtra.f95198b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f95198b) + (Integer.hashCode(this.f95197a) * 31);
    }

    @NotNull
    public final String toString() {
        return d.a(this.f95197a, this.f95198b, ", coinNum=", ")", new StringBuilder("CoinExtra(maxNum="));
    }
}
