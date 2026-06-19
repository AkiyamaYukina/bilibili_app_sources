package com.bilibili.ship.theseus.ogv.intro.section.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/bean/EpBgInfo.class */
@StabilityInferred(parameters = 1)
@Bson
public final class EpBgInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("float_layer")
    @Nullable
    private final BgInfo f93511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("no_float_layer")
    @Nullable
    private final BgInfo f93512b;

    public EpBgInfo(@Nullable BgInfo bgInfo, @Nullable BgInfo bgInfo2) {
        this.f93511a = bgInfo;
        this.f93512b = bgInfo2;
    }

    @Nullable
    public final BgInfo a() {
        return this.f93511a;
    }

    @Nullable
    public final BgInfo b() {
        return this.f93512b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EpBgInfo)) {
            return false;
        }
        EpBgInfo epBgInfo = (EpBgInfo) obj;
        return Intrinsics.areEqual(this.f93511a, epBgInfo.f93511a) && Intrinsics.areEqual(this.f93512b, epBgInfo.f93512b);
    }

    public final int hashCode() {
        BgInfo bgInfo = this.f93511a;
        int iHashCode = 0;
        int iHashCode2 = bgInfo == null ? 0 : bgInfo.hashCode();
        BgInfo bgInfo2 = this.f93512b;
        if (bgInfo2 != null) {
            iHashCode = bgInfo2.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        return "EpBgInfo(floatLayerSectionEpBgInfo=" + this.f93511a + ", nonFloatLayerSectionEpBgInfo=" + this.f93512b + ")";
    }
}
