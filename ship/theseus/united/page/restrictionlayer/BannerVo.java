package com.bilibili.ship.theseus.united.page.restrictionlayer;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/BannerVo.class */
@StabilityInferred(parameters = 0)
@Bson
public final class BannerVo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f102508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f102509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f102510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final ReportVo f102511d;

    public BannerVo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable ReportVo reportVo) {
        this.f102508a = str;
        this.f102509b = str2;
        this.f102510c = str3;
        this.f102511d = reportVo;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerVo)) {
            return false;
        }
        BannerVo bannerVo = (BannerVo) obj;
        return Intrinsics.areEqual(this.f102508a, bannerVo.f102508a) && Intrinsics.areEqual(this.f102509b, bannerVo.f102509b) && Intrinsics.areEqual(this.f102510c, bannerVo.f102510c) && Intrinsics.areEqual(this.f102511d, bannerVo.f102511d);
    }

    public final int hashCode() {
        int iHashCode = 0;
        String str = this.f102508a;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.f102509b;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.f102510c;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        ReportVo reportVo = this.f102511d;
        if (reportVo != null) {
            iHashCode = reportVo.hashCode();
        }
        return (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        return "BannerVo(jumpLink=" + this.f102508a + ", imageLink=" + this.f102509b + ", halfImageLink=" + this.f102510c + ", report=" + this.f102511d + ")";
    }
}
