package com.bilibili.ship.theseus.playlist.api;

import androidx.compose.animation.core.I;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.e;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/api/Badge.class */
@StabilityInferred(parameters = 1)
@Bson
public final class Badge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("text")
    @NotNull
    private final String f95193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("bg_style")
    private final int f95194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("img")
    @NotNull
    private final String f95195c;

    public Badge(@NotNull String str, int i7, @NotNull String str2) {
        this.f95193a = str;
        this.f95194b = i7;
        this.f95195c = str2;
    }

    public final int a() {
        return this.f95194b;
    }

    @NotNull
    public final String b() {
        return this.f95195c;
    }

    @NotNull
    public final String c() {
        return this.f95193a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Badge)) {
            return false;
        }
        Badge badge = (Badge) obj;
        return Intrinsics.areEqual(this.f95193a, badge.f95193a) && this.f95194b == badge.f95194b && Intrinsics.areEqual(this.f95195c, badge.f95195c);
    }

    public final int hashCode() {
        return this.f95195c.hashCode() + I.a(this.f95194b, this.f95193a.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        String str = this.f95193a;
        int i7 = this.f95194b;
        return C8770a.a(e.a(i7, "Badge(name=", str, ", bgStyle=", ", img="), this.f95195c, ")");
    }
}
