package com.bilibili.ship.theseus.ogv.activity;

import I.E;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.A;
import com.bilibili.app.producers.ability.l0;
import com.bilibili.bson.common.Bson;
import com.bilibili.ogv.infra.gson.DurationFromSecondsTypeAdapter;
import com.bilibili.ship.theseus.ogv.activity.OgvActivityDeliveryResult;
import com.bilibili.ship.theseus.ogv.intro.limitedtimefree.LimitedTimeFreeImageInfo;
import com.bilibili.ship.theseus.ogv.intro.limitedtimefree.LimitedTimeFreeImages;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvOperationGuideFloatingVo.class */
@StabilityInferred(parameters = 0)
@Bson
public final class OgvOperationGuideFloatingVo implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("win_id")
    @NotNull
    private final String f91481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LimitedTimeFreeImages f91482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Countdown f91483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f91484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final LimitedTimeFreeImageInfo f91485e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final OgvActivityDeliveryResult.Button f91486f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SerializedName("login")
    private final boolean f91487g;

    @Nullable
    public final ActivityDialogActionType h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f91488i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @SerializedName("showTime")
    @NotNull
    private final ActivityDialogShowOccasion f91489j;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvOperationGuideFloatingVo$Countdown.class */
    @StabilityInferred(parameters = 1)
    @Bson
    public static final class Countdown {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final String f91490a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @JsonAdapter(DurationFromSecondsTypeAdapter.class)
        public final long f91491b;

        public Countdown(String str, long j7) {
            this.f91490a = str;
            this.f91491b = j7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Countdown)) {
                return false;
            }
            Countdown countdown = (Countdown) obj;
            return Intrinsics.areEqual(this.f91490a, countdown.f91490a) && Duration.equals-impl0(this.f91491b, countdown.f91491b);
        }

        public final int hashCode() {
            String str = this.f91490a;
            return Duration.hashCode-impl(this.f91491b) + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @NotNull
        public final String toString() {
            return A.a(this.f91490a, ", remaining_time=", Duration.toString-impl(this.f91491b), ")", new StringBuilder("Countdown(text="));
        }
    }

    public OgvOperationGuideFloatingVo() {
        throw null;
    }

    public OgvOperationGuideFloatingVo(String str, LimitedTimeFreeImages limitedTimeFreeImages, Countdown countdown, String str2, LimitedTimeFreeImageInfo limitedTimeFreeImageInfo, OgvActivityDeliveryResult.Button button, boolean z6, ActivityDialogActionType activityDialogActionType, Map map, ActivityDialogShowOccasion activityDialogShowOccasion, int i7) {
        map = (i7 & 256) != 0 ? MapsKt.emptyMap() : map;
        activityDialogShowOccasion = (i7 & 512) != 0 ? ActivityDialogShowOccasion.IMMEDIATE : activityDialogShowOccasion;
        this.f91481a = str;
        this.f91482b = limitedTimeFreeImages;
        this.f91483c = countdown;
        this.f91484d = str2;
        this.f91485e = limitedTimeFreeImageInfo;
        this.f91486f = button;
        this.f91487g = z6;
        this.h = activityDialogActionType;
        this.f91488i = map;
        this.f91489j = activityDialogShowOccasion;
    }

    @NotNull
    public final String a() {
        return this.f91481a;
    }

    @NotNull
    public final ActivityDialogShowOccasion b() {
        return this.f91489j;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OgvOperationGuideFloatingVo)) {
            return false;
        }
        OgvOperationGuideFloatingVo ogvOperationGuideFloatingVo = (OgvOperationGuideFloatingVo) obj;
        return Intrinsics.areEqual(this.f91481a, ogvOperationGuideFloatingVo.f91481a) && Intrinsics.areEqual(this.f91482b, ogvOperationGuideFloatingVo.f91482b) && Intrinsics.areEqual(this.f91483c, ogvOperationGuideFloatingVo.f91483c) && Intrinsics.areEqual(this.f91484d, ogvOperationGuideFloatingVo.f91484d) && Intrinsics.areEqual(this.f91485e, ogvOperationGuideFloatingVo.f91485e) && Intrinsics.areEqual(this.f91486f, ogvOperationGuideFloatingVo.f91486f) && this.f91487g == ogvOperationGuideFloatingVo.f91487g && this.h == ogvOperationGuideFloatingVo.h && Intrinsics.areEqual(this.f91488i, ogvOperationGuideFloatingVo.f91488i) && this.f91489j == ogvOperationGuideFloatingVo.f91489j;
    }

    @Override // com.bilibili.ship.theseus.ogv.activity.d
    @Nullable
    public final ActivityDialogActionType getAction() {
        return this.h;
    }

    @Override // com.bilibili.ship.theseus.ogv.activity.d
    public final boolean getNeedLogin() {
        return this.f91487g;
    }

    public final int hashCode() {
        int iHashCode = this.f91481a.hashCode();
        int iHashCode2 = this.f91482b.hashCode();
        Countdown countdown = this.f91483c;
        int iA = E.a((((iHashCode2 + (iHashCode * 31)) * 31) + (countdown == null ? 0 : countdown.hashCode())) * 31, 31, this.f91484d);
        LimitedTimeFreeImageInfo limitedTimeFreeImageInfo = this.f91485e;
        int iA2 = z.a((this.f91486f.hashCode() + ((iA + (limitedTimeFreeImageInfo == null ? 0 : limitedTimeFreeImageInfo.hashCode())) * 31)) * 31, 31, this.f91487g);
        ActivityDialogActionType activityDialogActionType = this.h;
        return this.f91489j.hashCode() + J2.g.a((iA2 + (activityDialogActionType == null ? 0 : activityDialogActionType.hashCode())) * 31, this.f91488i, 31);
    }

    @NotNull
    public final String toString() {
        String str = this.f91481a;
        String strA = C8770a.a(new StringBuilder("CloseType(value="), this.f91484d, ")");
        boolean z6 = this.f91487g;
        Map<String, String> map = this.f91488i;
        ActivityDialogShowOccasion activityDialogShowOccasion = this.f91489j;
        StringBuilder sbA = l0.a("OgvOperationGuideFloatingVo(id=", str, ", images=");
        sbA.append(this.f91482b);
        sbA.append(", countdown=");
        sbA.append(this.f91483c);
        sbA.append(", closeType=");
        sbA.append(strA);
        sbA.append(", img_title=");
        sbA.append(this.f91485e);
        sbA.append(", button=");
        sbA.append(this.f91486f);
        sbA.append(", needLogin=");
        sbA.append(z6);
        sbA.append(", action=");
        sbA.append(this.h);
        sbA.append(", report=");
        sbA.append(map);
        sbA.append(", showOccasion=");
        sbA.append(activityDialogShowOccasion);
        sbA.append(")");
        return sbA.toString();
    }
}
