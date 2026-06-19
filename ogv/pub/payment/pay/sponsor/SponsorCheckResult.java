package com.bilibili.ogv.pub.payment.pay.sponsor;

import M6.f;
import androidx.compose.animation.core.I;
import androidx.compose.ui.graphics.e0;
import androidx.paging.M;
import com.bilibili.biligame.api.cloudgame.bean.BCGToken;
import com.bilibili.bson.common.Bson;
import com.bilibili.ogv.pub.sponsor.BangumiPendant;
import com.bilibili.ogv.pub.sponsor.BangumiSponsorEvent;
import com.bilibili.ogv.pub.sponsor.BangumiSponsorResult;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/payment/pay/sponsor/SponsorCheckResult.class */
@Bson
public final class SponsorCheckResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f71575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f71576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f71577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("days_text")
    @Nullable
    private final String f71578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final String f71579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final List<BangumiPendant> f71580f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SerializedName("vip_point_activity")
    @Nullable
    private final VipPointActivities f71581g;

    @Nullable
    public transient String h = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final transient boolean f71582i;

    public SponsorCheckResult(int i7, int i8, int i9, @Nullable String str, @Nullable String str2, @NotNull List<BangumiPendant> list, @Nullable VipPointActivities vipPointActivities) {
        this.f71575a = i7;
        this.f71576b = i8;
        this.f71577c = i9;
        this.f71578d = str;
        this.f71579e = str2;
        this.f71580f = list;
        this.f71581g = vipPointActivities;
        this.f71582i = StringsKt.equals(BCGToken.SCHEDULE_STATUS_SUCCESS, str2, true);
    }

    @Nullable
    public final String a() {
        return this.f71578d;
    }

    @Nullable
    public final VipPointActivities b() {
        return this.f71581g;
    }

    @NotNull
    public final BangumiSponsorResult c(int i7, long j7) {
        String str = this.f71579e;
        if (str == null || str.length() == 0) {
            String str2 = this.h;
            BangumiSponsorResult bangumiSponsorResult = new BangumiSponsorResult();
            bangumiSponsorResult.f71791a = false;
            bangumiSponsorResult.f71792b = str2;
            bangumiSponsorResult.f71793c = String.valueOf(j7);
            bangumiSponsorResult.f71794d = i7;
            return bangumiSponsorResult;
        }
        BangumiSponsorResult bangumiSponsorResult2 = new BangumiSponsorResult();
        bangumiSponsorResult2.f71791a = this.f71582i;
        bangumiSponsorResult2.f71792b = this.h;
        bangumiSponsorResult2.f71793c = String.valueOf(j7);
        bangumiSponsorResult2.f71794d = i7;
        bangumiSponsorResult2.f71797g = this.f71575a;
        bangumiSponsorResult2.h = this.f71576b;
        bangumiSponsorResult2.f71798i = this.f71577c;
        bangumiSponsorResult2.f71799j = this.f71578d;
        bangumiSponsorResult2.f71800k = this.f71580f;
        VipPointActivities vipPointActivities = this.f71581g;
        if (vipPointActivities != null) {
            String strC = vipPointActivities.c();
            String str3 = strC;
            if (strC == null) {
                str3 = "";
            }
            String strA = vipPointActivities.a();
            String str4 = strA;
            if (strA == null) {
                str4 = "";
            }
            String strB = vipPointActivities.b();
            bangumiSponsorResult2.f71801l = new BangumiSponsorEvent(str3, str4, strB != null ? strB : "");
        }
        return bangumiSponsorResult2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SponsorCheckResult)) {
            return false;
        }
        SponsorCheckResult sponsorCheckResult = (SponsorCheckResult) obj;
        return this.f71575a == sponsorCheckResult.f71575a && this.f71576b == sponsorCheckResult.f71576b && this.f71577c == sponsorCheckResult.f71577c && Intrinsics.areEqual(this.f71578d, sponsorCheckResult.f71578d) && Intrinsics.areEqual(this.f71579e, sponsorCheckResult.f71579e) && Intrinsics.areEqual(this.f71580f, sponsorCheckResult.f71580f) && Intrinsics.areEqual(this.f71581g, sponsorCheckResult.f71581g);
    }

    public final int hashCode() {
        int iA = I.a(this.f71577c, I.a(this.f71576b, Integer.hashCode(this.f71575a) * 31, 31), 31);
        String str = this.f71578d;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f71579e;
        int iA2 = e0.a((((iA + iHashCode) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f71580f);
        VipPointActivities vipPointActivities = this.f71581g;
        return iA2 + (vipPointActivities == null ? 0 : vipPointActivities.hashCode());
    }

    @NotNull
    public final String toString() {
        String str = this.f71578d;
        List<BangumiPendant> list = this.f71580f;
        VipPointActivities vipPointActivities = this.f71581g;
        StringBuilder sb = new StringBuilder("SponsorCheckResult(exp=");
        sb.append(this.f71575a);
        sb.append(", point=");
        sb.append(this.f71576b);
        sb.append(", days=");
        M.a(this.f71577c, ", daysDesc=", str, ", state=", sb);
        f.a(this.f71579e, ", pendants=", ", vipPointActivities=", sb, list);
        sb.append(vipPointActivities);
        sb.append(")");
        return sb.toString();
    }
}
