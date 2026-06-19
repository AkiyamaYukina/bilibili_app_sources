package com.bilibili.ogv.pub.community;

import I.E;
import M6.f;
import androidx.compose.animation.core.I;
import androidx.compose.foundation.C3554n0;
import androidx.compose.ui.graphics.e0;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/community/MediaInfo.class */
@Bson
public final class MediaInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f71506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f71507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f71508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f71509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f71510e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f71511f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final List<Area> f71512g;

    @NotNull
    public final Publish h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final BangumiBadgeInfo f71513i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final String f71514j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final String f71515k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final List<Style> f71516l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @SerializedName("celebrity")
    @NotNull
    private final List<Celebrity> f71517m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public final Actor f71518n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public final Staff f71519o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final String f71520p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final String f71521q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public final Float f71522r;

    public MediaInfo(long j7, int i7, long j8, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<Area> list, @NotNull Publish publish, @Nullable BangumiBadgeInfo bangumiBadgeInfo, @NotNull String str4, @NotNull String str5, @NotNull List<Style> list2, @NotNull List<Celebrity> list3, @Nullable Actor actor, @Nullable Staff staff, @NotNull String str6, @NotNull String str7, @Nullable Float f7) {
        this.f71506a = j7;
        this.f71507b = i7;
        this.f71508c = j8;
        this.f71509d = str;
        this.f71510e = str2;
        this.f71511f = str3;
        this.f71512g = list;
        this.h = publish;
        this.f71513i = bangumiBadgeInfo;
        this.f71514j = str4;
        this.f71515k = str5;
        this.f71516l = list2;
        this.f71517m = list3;
        this.f71518n = actor;
        this.f71519o = staff;
        this.f71520p = str6;
        this.f71521q = str7;
        this.f71522r = f7;
    }

    @NotNull
    public final List<Celebrity> a() {
        return this.f71517m;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaInfo)) {
            return false;
        }
        MediaInfo mediaInfo = (MediaInfo) obj;
        return this.f71506a == mediaInfo.f71506a && this.f71507b == mediaInfo.f71507b && this.f71508c == mediaInfo.f71508c && Intrinsics.areEqual(this.f71509d, mediaInfo.f71509d) && Intrinsics.areEqual(this.f71510e, mediaInfo.f71510e) && Intrinsics.areEqual(this.f71511f, mediaInfo.f71511f) && Intrinsics.areEqual(this.f71512g, mediaInfo.f71512g) && Intrinsics.areEqual(this.h, mediaInfo.h) && Intrinsics.areEqual(this.f71513i, mediaInfo.f71513i) && Intrinsics.areEqual(this.f71514j, mediaInfo.f71514j) && Intrinsics.areEqual(this.f71515k, mediaInfo.f71515k) && Intrinsics.areEqual(this.f71516l, mediaInfo.f71516l) && Intrinsics.areEqual(this.f71517m, mediaInfo.f71517m) && Intrinsics.areEqual(this.f71518n, mediaInfo.f71518n) && Intrinsics.areEqual(this.f71519o, mediaInfo.f71519o) && Intrinsics.areEqual(this.f71520p, mediaInfo.f71520p) && Intrinsics.areEqual(this.f71521q, mediaInfo.f71521q) && Intrinsics.areEqual(this.f71522r, mediaInfo.f71522r);
    }

    public final int hashCode() {
        int iA = e0.a(E.a(E.a(E.a(C3554n0.a(I.a(this.f71507b, Long.hashCode(this.f71506a) * 31, 31), 31, this.f71508c), 31, this.f71509d), 31, this.f71510e), 31, this.f71511f), 31, this.f71512g);
        int iHashCode = this.h.hashCode();
        BangumiBadgeInfo bangumiBadgeInfo = this.f71513i;
        int iA2 = e0.a(e0.a(E.a(E.a((((iHashCode + iA) * 31) + (bangumiBadgeInfo == null ? 0 : bangumiBadgeInfo.hashCode())) * 31, 31, this.f71514j), 31, this.f71515k), 31, this.f71516l), 31, this.f71517m);
        Actor actor = this.f71518n;
        int iHashCode2 = actor == null ? 0 : actor.hashCode();
        Staff staff = this.f71519o;
        int iA3 = E.a(E.a((((iA2 + iHashCode2) * 31) + (staff == null ? 0 : staff.hashCode())) * 31, 31, this.f71520p), 31, this.f71521q);
        Float f7 = this.f71522r;
        return iA3 + (f7 == null ? 0 : f7.hashCode());
    }

    @NotNull
    public final String toString() {
        List<Area> list = this.f71512g;
        List<Style> list2 = this.f71516l;
        List<Celebrity> list3 = this.f71517m;
        StringBuilder sb = new StringBuilder("MediaInfo(seasonId=");
        sb.append(this.f71506a);
        sb.append(", mediaType=");
        sb.append(this.f71507b);
        sb.append(", mediaId=");
        sb.append(this.f71508c);
        sb.append(", cover=");
        sb.append(this.f71509d);
        sb.append(", seasonTitle=");
        sb.append(this.f71510e);
        sb.append(", typeName=");
        f.a(this.f71511f, ", areas=", ", publish=", sb, list);
        sb.append(this.h);
        sb.append(", mediaBadgeInfo=");
        sb.append(this.f71513i);
        sb.append(", alias=");
        sb.append(this.f71514j);
        sb.append(", originName=");
        f.a(this.f71515k, ", styles=", ", celebrities=", sb, list2);
        sb.append(list3);
        sb.append(", actor=");
        sb.append(this.f71518n);
        sb.append(", staff=");
        sb.append(this.f71519o);
        sb.append(", evaluate=");
        sb.append(this.f71520p);
        sb.append(", linkUrl=");
        sb.append(this.f71521q);
        sb.append(", score=");
        sb.append(this.f71522r);
        sb.append(")");
        return sb.toString();
    }
}
