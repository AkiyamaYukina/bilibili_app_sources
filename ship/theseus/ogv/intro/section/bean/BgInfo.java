package com.bilibili.ship.theseus.ogv.intro.section.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.motion.widget.p;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/bean/BgInfo.class */
@StabilityInferred(parameters = 1)
@Bson
public final class BgInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(alternate = {"lightLongBg"}, value = "light_long_bg")
    @NotNull
    private final String f93508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(alternate = {"darkLongBg"}, value = "dark_long_bg")
    @NotNull
    private final String f93509b;

    public BgInfo(@NotNull String str, @NotNull String str2) {
        this.f93508a = str;
        this.f93509b = str2;
    }

    @NotNull
    public final String a() {
        return this.f93509b;
    }

    @NotNull
    public final String b() {
        return this.f93508a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BgInfo)) {
            return false;
        }
        BgInfo bgInfo = (BgInfo) obj;
        return Intrinsics.areEqual(this.f93508a, bgInfo.f93508a) && Intrinsics.areEqual(this.f93509b, bgInfo.f93509b);
    }

    public final int hashCode() {
        return this.f93509b.hashCode() + (this.f93508a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return p.a("BgInfo(lightSectionEpBgUrl=", this.f93508a, ", darkSectionEpBgUrl=", this.f93509b, ")");
    }
}
