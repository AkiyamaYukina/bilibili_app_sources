package com.bilibili.biligame.booktri.benefit;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.analytics.C4668j;
import com.bilibili.biligame.api.BiligameMainGame;
import com.bilibili.biligame.api.bean.GameOfficialInfo;
import com.bilibili.biligame.api.bean.gamedetail.ActivityInfoBean;
import com.bilibili.biligame.api.book.AutoDownloadStatus;
import com.bilibili.biligame.bean.BiligameNewGiftDetail;
import com.bilibili.biligame.ui.coupons.bean.UserCouponsDetailBean;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.biligame.booktri.benefit.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/booktri/benefit/e.class */
@StabilityInferred(parameters = 0)
public final class C5294e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f62376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final AutoDownloadStatus f62377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Boolean f62378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f62379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f62380e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final GameOfficialInfo f62381f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f62382g;

    @NotNull
    public final List<BiligameMainGame> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final List<BiligameNewGiftDetail> f62383i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final List<UserCouponsDetailBean> f62384j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final List<ActivityInfoBean> f62385k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public final List<Integer> f62386l;

    /* JADX WARN: Multi-variable type inference failed */
    public C5294e(@NotNull String str, @Nullable AutoDownloadStatus autoDownloadStatus, @Nullable Boolean bool, @NotNull String str2, @NotNull String str3, @Nullable GameOfficialInfo gameOfficialInfo, boolean z6, @NotNull List<? extends BiligameMainGame> list, @NotNull List<BiligameNewGiftDetail> list2, @NotNull List<UserCouponsDetailBean> list3, @NotNull List<ActivityInfoBean> list4, @Nullable List<Integer> list5) {
        this.f62376a = str;
        this.f62377b = autoDownloadStatus;
        this.f62378c = bool;
        this.f62379d = str2;
        this.f62380e = str3;
        this.f62381f = gameOfficialInfo;
        this.f62382g = z6;
        this.h = list;
        this.f62383i = list2;
        this.f62384j = list3;
        this.f62385k = list4;
        this.f62386l = list5;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5294e)) {
            return false;
        }
        C5294e c5294e = (C5294e) obj;
        return Intrinsics.areEqual(this.f62376a, c5294e.f62376a) && Intrinsics.areEqual(this.f62377b, c5294e.f62377b) && Intrinsics.areEqual(this.f62378c, c5294e.f62378c) && Intrinsics.areEqual(this.f62379d, c5294e.f62379d) && Intrinsics.areEqual(this.f62380e, c5294e.f62380e) && Intrinsics.areEqual(this.f62381f, c5294e.f62381f) && this.f62382g == c5294e.f62382g && Intrinsics.areEqual(this.h, c5294e.h) && Intrinsics.areEqual(this.f62383i, c5294e.f62383i) && Intrinsics.areEqual(this.f62384j, c5294e.f62384j) && Intrinsics.areEqual(this.f62385k, c5294e.f62385k) && Intrinsics.areEqual(this.f62386l, c5294e.f62386l);
    }

    public final int hashCode() {
        int iHashCode = this.f62376a.hashCode();
        AutoDownloadStatus autoDownloadStatus = this.f62377b;
        int iA = I.E.a(I.E.a((this.f62378c.hashCode() + (((iHashCode * 31) + (autoDownloadStatus == null ? 0 : autoDownloadStatus.hashCode())) * 31)) * 31, 31, this.f62379d), 31, this.f62380e);
        GameOfficialInfo gameOfficialInfo = this.f62381f;
        int iA2 = androidx.compose.ui.graphics.e0.a(androidx.compose.ui.graphics.e0.a(androidx.compose.ui.graphics.e0.a(androidx.compose.ui.graphics.e0.a(androidx.compose.animation.z.a((iA + (gameOfficialInfo == null ? 0 : gameOfficialInfo.hashCode())) * 31, 31, this.f62382g), 31, this.h), 31, this.f62383i), 31, this.f62384j), 31, this.f62385k);
        List<Integer> list = this.f62386l;
        return iA2 + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public final String toString() {
        List<BiligameMainGame> list = this.h;
        List<BiligameNewGiftDetail> list2 = this.f62383i;
        List<UserCouponsDetailBean> list3 = this.f62384j;
        List<ActivityInfoBean> list4 = this.f62385k;
        List<Integer> list5 = this.f62386l;
        StringBuilder sb = new StringBuilder("BookSuccessData(title=");
        sb.append(this.f62376a);
        sb.append(", showAutoDownload=");
        sb.append(this.f62377b);
        sb.append(", autoDownloadSelect=");
        sb.append(this.f62378c);
        sb.append(", autoDownloadText=");
        sb.append(this.f62379d);
        sb.append(", autoDownloadTipText=");
        sb.append(this.f62380e);
        sb.append(", wxOfficialInfo=");
        sb.append(this.f62381f);
        sb.append(", isAlreadyBooked=");
        K7.L.b(sb, this.f62382g, ", recommendGameList=", list, ", giftList=");
        X1.F.c(", couponList=", ", activityList=", sb, list2, list3);
        return C4668j.a(", reservedGames=", ")", sb, list4, list5);
    }
}
