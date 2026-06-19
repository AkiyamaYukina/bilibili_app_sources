package com.bilibili.ship.theseus.ogv.intro.reservereminder;

import I.E;
import J2.g;
import androidx.compose.animation.z;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/reservereminder/OgvReserveReminderVo.class */
@StabilityInferred(parameters = 0)
@Bson
public final class OgvReserveReminderVo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f93393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f93394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f93395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final CalendarInfo f93396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f93397e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f93398f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f93399g;
    public final boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f93400i;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/reservereminder/OgvReserveReminderVo$CalendarInfo.class */
    @StabilityInferred(parameters = 1)
    @Bson
    public static final class CalendarInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f93401a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f93402b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f93403c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f93404d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final String f93405e;

        public CalendarInfo(long j7, long j8, @NotNull String str, @NotNull String str2, @NotNull String str3) {
            this.f93401a = str;
            this.f93402b = j7;
            this.f93403c = j8;
            this.f93404d = str2;
            this.f93405e = str3;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CalendarInfo)) {
                return false;
            }
            CalendarInfo calendarInfo = (CalendarInfo) obj;
            return Intrinsics.areEqual(this.f93401a, calendarInfo.f93401a) && this.f93402b == calendarInfo.f93402b && this.f93403c == calendarInfo.f93403c && Intrinsics.areEqual(this.f93404d, calendarInfo.f93404d) && Intrinsics.areEqual(this.f93405e, calendarInfo.f93405e);
        }

        public final int hashCode() {
            return this.f93405e.hashCode() + E.a(C3554n0.a(C3554n0.a(this.f93401a.hashCode() * 31, 31, this.f93402b), 31, this.f93403c), 31, this.f93404d);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("CalendarInfo(title=");
            sb.append(this.f93401a);
            sb.append(", startTs=");
            sb.append(this.f93402b);
            sb.append(", endTs=");
            sb.append(this.f93403c);
            sb.append(", description=");
            sb.append(this.f93404d);
            sb.append(", businessId=");
            return C8770a.a(sb, this.f93405e, ")");
        }
    }

    public OgvReserveReminderVo() {
        throw null;
    }

    public OgvReserveReminderVo(String str, String str2, String str3, CalendarInfo calendarInfo, boolean z6, Map map, String str4, boolean z7, long j7, int i7) {
        z6 = (i7 & 16) != 0 ? false : z6;
        map = (i7 & 32) != 0 ? MapsKt.emptyMap() : map;
        z7 = (i7 & 128) != 0 ? false : z7;
        j7 = (i7 & 256) != 0 ? 0L : j7;
        this.f93393a = str;
        this.f93394b = str2;
        this.f93395c = str3;
        this.f93396d = calendarInfo;
        this.f93397e = z6;
        this.f93398f = map;
        this.f93399g = str4;
        this.h = z7;
        this.f93400i = j7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OgvReserveReminderVo)) {
            return false;
        }
        OgvReserveReminderVo ogvReserveReminderVo = (OgvReserveReminderVo) obj;
        return Intrinsics.areEqual(this.f93393a, ogvReserveReminderVo.f93393a) && Intrinsics.areEqual(this.f93394b, ogvReserveReminderVo.f93394b) && Intrinsics.areEqual(this.f93395c, ogvReserveReminderVo.f93395c) && Intrinsics.areEqual(this.f93396d, ogvReserveReminderVo.f93396d) && this.f93397e == ogvReserveReminderVo.f93397e && Intrinsics.areEqual(this.f93398f, ogvReserveReminderVo.f93398f) && Intrinsics.areEqual(this.f93399g, ogvReserveReminderVo.f93399g) && this.h == ogvReserveReminderVo.h && this.f93400i == ogvReserveReminderVo.f93400i;
    }

    public final int hashCode() {
        int iA = E.a(E.a(this.f93393a.hashCode() * 31, 31, this.f93394b), 31, this.f93395c);
        CalendarInfo calendarInfo = this.f93396d;
        return Long.hashCode(this.f93400i) + z.a(E.a(g.a(z.a((iA + (calendarInfo == null ? 0 : calendarInfo.hashCode())) * 31, 31, this.f93397e), this.f93398f, 31), 31, this.f93399g), 31, this.h);
    }

    @NotNull
    public final String toString() {
        Map<String, String> map = this.f93398f;
        StringBuilder sb = new StringBuilder("OgvReserveReminderVo(title=");
        sb.append(this.f93393a);
        sb.append(", icon=");
        sb.append(this.f93394b);
        sb.append(", buttonText=");
        sb.append(this.f93395c);
        sb.append(", calendarInfo=");
        sb.append(this.f93396d);
        sb.append(", followVideoIsReserveBroadcast=");
        sb.append(this.f93397e);
        sb.append(", report=");
        sb.append(map);
        sb.append(", countdownText=");
        sb.append(this.f93399g);
        sb.append(", refreshWhenCountdownEnd=");
        sb.append(this.h);
        sb.append(", currentTime=");
        return android.support.v4.media.session.a.a(sb, this.f93400i, ")");
    }
}
