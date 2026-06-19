package com.bilibili.ship.theseus.ogv.intro.section.bean;

import I.E;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import com.bilibili.bson.common.Bson;
import com.bilibili.ship.theseus.ogv.playviewextra.OgvBadgeInfo;
import com.bilibili.ship.theseus.ogv.season.PayStatus;
import com.bilibili.ship.theseus.united.bean.VideoDimension;
import com.bilibili.ship.theseus.united.page.intro.module.staffs.Staff;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/bean/OgvEpisode.class */
@StabilityInferred(parameters = 0)
@Bson
public final class OgvEpisode {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @SerializedName("stat_for_unity")
    @NotNull
    private final EpisodeStat f93545A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public final VideoDimension f93546B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @Nullable
    public final Map<String, String> f93547C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final long f93548D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @SerializedName(EditCustomizeSticker.TAG_DURATION)
    private final long f93549E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @SerializedName("bottom_right_badge")
    @NotNull
    private final String f93550F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public transient int f93551G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public transient int f93552H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public transient int f93553I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public transient long f93554J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f93555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f93556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f93557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final OgvBadgeInfo f93558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final PayStatus f93559e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("aid")
    private final long f93560f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f93561g;

    @NotNull
    public final String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final String f93562i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final String f93563j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final String f93564k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final String f93565l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final String f93566m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final String f93567n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final String f93568o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final String f93569p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final String f93570q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final String f93571r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final SectionType f93572s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @SerializedName("up_infos")
    @NotNull
    private final List<Staff> f93573t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @SerializedName("up_info")
    @Nullable
    private final Staff f93574u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final String f93575v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final String f93576w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @SerializedName("pv")
    private final boolean f93577x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @SerializedName("rights")
    @Nullable
    private final EpisodeRights f93578y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public final EpisodeInteraction f93579z;

    public OgvEpisode() {
        throw null;
    }

    public OgvEpisode(long j7, int i7, int i8, OgvBadgeInfo ogvBadgeInfo, PayStatus payStatus, long j8, long j9, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, SectionType sectionType, List list, Staff staff, String str12, String str13, boolean z6, EpisodeRights episodeRights, EpisodeInteraction episodeInteraction, EpisodeStat episodeStat, VideoDimension videoDimension, Map map, long j10, long j11, String str14, int i9) {
        i7 = (i9 & 2) != 0 ? 0 : i7;
        i8 = (i9 & 4) != 0 ? 0 : i8;
        payStatus = (i9 & 16) != 0 ? PayStatus.STATUS_UNKNOWN : payStatus;
        sectionType = (i9 & 262144) != 0 ? SectionType.FEATURE : sectionType;
        this.f93555a = j7;
        this.f93556b = i7;
        this.f93557c = i8;
        this.f93558d = ogvBadgeInfo;
        this.f93559e = payStatus;
        this.f93560f = j8;
        this.f93561g = j9;
        this.h = str;
        this.f93562i = str2;
        this.f93563j = str3;
        this.f93564k = str4;
        this.f93565l = str5;
        this.f93566m = str6;
        this.f93567n = str7;
        this.f93568o = str8;
        this.f93569p = str9;
        this.f93570q = str10;
        this.f93571r = str11;
        this.f93572s = sectionType;
        this.f93573t = list;
        this.f93574u = staff;
        this.f93575v = str12;
        this.f93576w = str13;
        this.f93577x = z6;
        this.f93578y = episodeRights;
        this.f93579z = episodeInteraction;
        this.f93545A = episodeStat;
        this.f93546B = videoDimension;
        this.f93547C = map;
        this.f93548D = j10;
        this.f93549E = j11;
        this.f93550F = str14;
        this.f93551G = -1;
    }

    public final long a() {
        return this.f93560f;
    }

    @NotNull
    public final String b() {
        return this.f93550F;
    }

    public final long c() {
        return this.f93549E;
    }

    @Nullable
    public final Staff d() {
        return this.f93574u;
    }

    @Nullable
    public final EpisodeRights e() {
        return this.f93578y;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OgvEpisode)) {
            return false;
        }
        OgvEpisode ogvEpisode = (OgvEpisode) obj;
        return this.f93555a == ogvEpisode.f93555a && this.f93556b == ogvEpisode.f93556b && this.f93557c == ogvEpisode.f93557c && Intrinsics.areEqual(this.f93558d, ogvEpisode.f93558d) && this.f93559e == ogvEpisode.f93559e && this.f93560f == ogvEpisode.f93560f && this.f93561g == ogvEpisode.f93561g && Intrinsics.areEqual(this.h, ogvEpisode.h) && Intrinsics.areEqual(this.f93562i, ogvEpisode.f93562i) && Intrinsics.areEqual(this.f93563j, ogvEpisode.f93563j) && Intrinsics.areEqual(this.f93564k, ogvEpisode.f93564k) && Intrinsics.areEqual(this.f93565l, ogvEpisode.f93565l) && Intrinsics.areEqual(this.f93566m, ogvEpisode.f93566m) && Intrinsics.areEqual(this.f93567n, ogvEpisode.f93567n) && Intrinsics.areEqual(this.f93568o, ogvEpisode.f93568o) && Intrinsics.areEqual(this.f93569p, ogvEpisode.f93569p) && Intrinsics.areEqual(this.f93570q, ogvEpisode.f93570q) && Intrinsics.areEqual(this.f93571r, ogvEpisode.f93571r) && this.f93572s == ogvEpisode.f93572s && Intrinsics.areEqual(this.f93573t, ogvEpisode.f93573t) && Intrinsics.areEqual(this.f93574u, ogvEpisode.f93574u) && Intrinsics.areEqual(this.f93575v, ogvEpisode.f93575v) && Intrinsics.areEqual(this.f93576w, ogvEpisode.f93576w) && this.f93577x == ogvEpisode.f93577x && Intrinsics.areEqual(this.f93578y, ogvEpisode.f93578y) && Intrinsics.areEqual(this.f93579z, ogvEpisode.f93579z) && Intrinsics.areEqual(this.f93545A, ogvEpisode.f93545A) && Intrinsics.areEqual(this.f93546B, ogvEpisode.f93546B) && Intrinsics.areEqual(this.f93547C, ogvEpisode.f93547C) && this.f93548D == ogvEpisode.f93548D && this.f93549E == ogvEpisode.f93549E && Intrinsics.areEqual(this.f93550F, ogvEpisode.f93550F);
    }

    @NotNull
    public final EpisodeStat f() {
        return this.f93545A;
    }

    @NotNull
    public final List<Staff> g() {
        return this.f93573t;
    }

    public final boolean h() {
        return this.f93579z != null;
    }

    public final int hashCode() {
        int iA = I.a(this.f93557c, I.a(this.f93556b, Long.hashCode(this.f93555a) * 31, 31), 31);
        int iHashCode = 0;
        OgvBadgeInfo ogvBadgeInfo = this.f93558d;
        int iA2 = e0.a((this.f93572s.hashCode() + E.a(E.a(E.a(E.a(E.a(E.a(E.a(E.a(E.a(E.a(E.a(C3554n0.a(C3554n0.a((this.f93559e.hashCode() + ((iA + (ogvBadgeInfo == null ? 0 : ogvBadgeInfo.hashCode())) * 31)) * 31, 31, this.f93560f), 31, this.f93561g), 31, this.h), 31, this.f93562i), 31, this.f93563j), 31, this.f93564k), 31, this.f93565l), 31, this.f93566m), 31, this.f93567n), 31, this.f93568o), 31, this.f93569p), 31, this.f93570q), 31, this.f93571r)) * 31, 31, this.f93573t);
        Staff staff = this.f93574u;
        int iA3 = z.a(E.a(E.a((iA2 + (staff == null ? 0 : staff.hashCode())) * 31, 31, this.f93575v), 31, this.f93576w), 31, this.f93577x);
        EpisodeRights episodeRights = this.f93578y;
        int iHashCode2 = episodeRights == null ? 0 : episodeRights.hashCode();
        EpisodeInteraction episodeInteraction = this.f93579z;
        int iHashCode3 = episodeInteraction == null ? 0 : episodeInteraction.hashCode();
        int iHashCode4 = this.f93545A.hashCode();
        int iHashCode5 = this.f93546B.hashCode();
        Map<String, String> map = this.f93547C;
        if (map != null) {
            iHashCode = map.hashCode();
        }
        return this.f93550F.hashCode() + C3554n0.a(C3554n0.a((((iHashCode5 + ((iHashCode4 + ((((iA3 + iHashCode2) * 31) + iHashCode3) * 31)) * 31)) * 31) + iHashCode) * 31, 31, this.f93548D), 31, this.f93549E);
    }

    public final boolean i() {
        return this.f93577x;
    }

    @NotNull
    public final String toString() {
        long j7 = this.f93560f;
        StringBuilder sb = new StringBuilder("Episode(id=");
        sb.append(this.f93555a);
        J1.z.a(j7, ", avid=", ", cid=", sb);
        sb.append(this.f93561g);
        sb.append(", title=");
        sb.append(this.f93563j);
        sb.append(", longTitle=");
        return C8770a.a(sb, this.f93564k, ")");
    }
}
