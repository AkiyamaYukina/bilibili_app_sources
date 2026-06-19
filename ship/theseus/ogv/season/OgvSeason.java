package com.bilibili.ship.theseus.ogv.season;

import Di0.C1602f;
import I.E;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.analytics.C4665g;
import com.bilibili.bson.common.Bson;
import com.bilibili.community.follow.FollowSeasonStatus;
import com.bilibili.ogv.pub.season.a;
import com.bilibili.ship.theseus.ogv.intro.download.bean.OgvEpisodeReserve;
import com.bilibili.ship.theseus.ogv.intro.section.floatlayer.v;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/season/OgvSeason.class */
@StabilityInferred(parameters = 0)
@Bson
public final class OgvSeason implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f94449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final a f94450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("show_season_type")
    @NotNull
    private final a f94451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final PayStatus f94452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f94453e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f94454f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final OgvSeasonRights f94455g;

    @NotNull
    public final UserStatus h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final OgvSeasonStat f94456i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final String f94457j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final OgvEpisodeReserve f94458k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @SerializedName("new_ep")
    @Nullable
    private final NewestEp f94459l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @SerializedName("ogv_switch")
    @NotNull
    private final TestSwitch f94460m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Publish f94461n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final SeasonMode f94462o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public final String f94463p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public final String f94464q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public final String f94465r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public final String f94466s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final String f94467t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final String f94468u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public final String f94469v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @SerializedName("cache_auth_config")
    @NotNull
    private final Map<String, CacheAuthConfig> f94470w;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/season/OgvSeason$CacheAuthConfig.class */
    @StabilityInferred(parameters = 1)
    @Bson
    public static final class CacheAuthConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final CacheDialog f94471a;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/season/OgvSeason$CacheAuthConfig$CacheDialog.class */
        @StabilityInferred(parameters = 1)
        @Bson
        public static final class CacheDialog {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final String f94472a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final String f94473b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @NotNull
            public final String f94474c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @NotNull
            public final String f94475d;

            public CacheDialog(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
                this.f94472a = str;
                this.f94473b = str2;
                this.f94474c = str3;
                this.f94475d = str4;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CacheDialog)) {
                    return false;
                }
                CacheDialog cacheDialog = (CacheDialog) obj;
                return Intrinsics.areEqual(this.f94472a, cacheDialog.f94472a) && Intrinsics.areEqual(this.f94473b, cacheDialog.f94473b) && Intrinsics.areEqual(this.f94474c, cacheDialog.f94474c) && Intrinsics.areEqual(this.f94475d, cacheDialog.f94475d);
            }

            public final int hashCode() {
                return this.f94475d.hashCode() + E.a(E.a(this.f94472a.hashCode() * 31, 31, this.f94473b), 31, this.f94474c);
            }

            @NotNull
            public final String toString() {
                StringBuilder sb = new StringBuilder("CacheDialog(title=");
                sb.append(this.f94472a);
                sb.append(", buttonTitle=");
                sb.append(this.f94473b);
                sb.append(", link=");
                sb.append(this.f94474c);
                sb.append(", bgImage=");
                return C8770a.a(sb, this.f94475d, ")");
            }
        }

        public CacheAuthConfig(@NotNull CacheDialog cacheDialog) {
            this.f94471a = cacheDialog;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CacheAuthConfig) && Intrinsics.areEqual(this.f94471a, ((CacheAuthConfig) obj).f94471a);
        }

        public final int hashCode() {
            return this.f94471a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "CacheAuthConfig(dialog=" + this.f94471a + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/season/OgvSeason$UserStatus.class */
    @StabilityInferred(parameters = 1)
    @Bson
    public static final class UserStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f94476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final FollowSeasonStatus f94477b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("pay")
        private final boolean f94478c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @SerializedName("sponsor")
        private final boolean f94479d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @SerializedName("vip")
        private final boolean f94480e;

        public UserStatus(boolean z6, FollowSeasonStatus followSeasonStatus, boolean z7, boolean z8, boolean z9, int i7) {
            followSeasonStatus = (i7 & 2) != 0 ? FollowSeasonStatus.UNKNOWN : followSeasonStatus;
            this.f94476a = z6;
            this.f94477b = followSeasonStatus;
            this.f94478c = z7;
            this.f94479d = z8;
            this.f94480e = z9;
        }

        public final boolean a() {
            return this.f94478c;
        }

        public final boolean b() {
            return this.f94479d;
        }

        public final boolean c() {
            return this.f94480e;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UserStatus)) {
                return false;
            }
            UserStatus userStatus = (UserStatus) obj;
            return this.f94476a == userStatus.f94476a && this.f94477b == userStatus.f94477b && this.f94478c == userStatus.f94478c && this.f94479d == userStatus.f94479d && this.f94480e == userStatus.f94480e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f94480e) + z.a(z.a((this.f94477b.hashCode() + (Boolean.hashCode(this.f94476a) * 31)) * 31, 31, this.f94478c), 31, this.f94479d);
        }

        @NotNull
        public final String toString() {
            boolean z6 = this.f94478c;
            boolean z7 = this.f94479d;
            boolean z8 = this.f94480e;
            StringBuilder sb = new StringBuilder("UserStatus(follow=");
            sb.append(this.f94476a);
            sb.append(", followStatus=");
            sb.append(this.f94477b);
            sb.append(", isPaid=");
            sb.append(z6);
            sb.append(", isSponsored=");
            return C1602f.a(", isVip=", ")", sb, z7, z8);
        }
    }

    public OgvSeason() {
        throw null;
    }

    public OgvSeason(long j7, a aVar, a aVar2, PayStatus payStatus, String str, long j8, OgvSeasonRights ogvSeasonRights, UserStatus userStatus, OgvSeasonStat ogvSeasonStat, String str2, OgvEpisodeReserve ogvEpisodeReserve, NewestEp newestEp, TestSwitch testSwitch, Publish publish, SeasonMode seasonMode, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Map map, int i7) {
        payStatus = (i7 & 8) != 0 ? PayStatus.STATUS_UNKNOWN : payStatus;
        seasonMode = (i7 & 16384) != 0 ? SeasonMode.MULTIPLE_EPISODE : seasonMode;
        this.f94449a = j7;
        this.f94450b = aVar;
        this.f94451c = aVar2;
        this.f94452d = payStatus;
        this.f94453e = str;
        this.f94454f = j8;
        this.f94455g = ogvSeasonRights;
        this.h = userStatus;
        this.f94456i = ogvSeasonStat;
        this.f94457j = str2;
        this.f94458k = ogvEpisodeReserve;
        this.f94459l = newestEp;
        this.f94460m = testSwitch;
        this.f94461n = publish;
        this.f94462o = seasonMode;
        this.f94463p = str3;
        this.f94464q = str4;
        this.f94465r = str5;
        this.f94466s = str6;
        this.f94467t = str7;
        this.f94468u = str8;
        this.f94469v = str9;
        this.f94470w = map;
    }

    @Override // com.bilibili.ship.theseus.ogv.intro.section.floatlayer.v
    @Nullable
    public final NewestEp a() {
        return this.f94459l;
    }

    @Override // com.bilibili.ship.theseus.ogv.intro.section.floatlayer.v
    @NotNull
    public final TestSwitch b() {
        return this.f94460m;
    }

    @Override // com.bilibili.ship.theseus.ogv.intro.section.floatlayer.v
    @NotNull
    public final a c() {
        return this.f94451c;
    }

    @NotNull
    public final Map<String, CacheAuthConfig> d() {
        return this.f94470w;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OgvSeason)) {
            return false;
        }
        OgvSeason ogvSeason = (OgvSeason) obj;
        return this.f94449a == ogvSeason.f94449a && Intrinsics.areEqual(this.f94450b, ogvSeason.f94450b) && Intrinsics.areEqual(this.f94451c, ogvSeason.f94451c) && this.f94452d == ogvSeason.f94452d && Intrinsics.areEqual(this.f94453e, ogvSeason.f94453e) && this.f94454f == ogvSeason.f94454f && Intrinsics.areEqual(this.f94455g, ogvSeason.f94455g) && Intrinsics.areEqual(this.h, ogvSeason.h) && Intrinsics.areEqual(this.f94456i, ogvSeason.f94456i) && Intrinsics.areEqual(this.f94457j, ogvSeason.f94457j) && Intrinsics.areEqual(this.f94458k, ogvSeason.f94458k) && Intrinsics.areEqual(this.f94459l, ogvSeason.f94459l) && Intrinsics.areEqual(this.f94460m, ogvSeason.f94460m) && Intrinsics.areEqual(this.f94461n, ogvSeason.f94461n) && this.f94462o == ogvSeason.f94462o && Intrinsics.areEqual(this.f94463p, ogvSeason.f94463p) && Intrinsics.areEqual(this.f94464q, ogvSeason.f94464q) && Intrinsics.areEqual(this.f94465r, ogvSeason.f94465r) && Intrinsics.areEqual(this.f94466s, ogvSeason.f94466s) && Intrinsics.areEqual(this.f94467t, ogvSeason.f94467t) && Intrinsics.areEqual(this.f94468u, ogvSeason.f94468u) && Intrinsics.areEqual(this.f94469v, ogvSeason.f94469v) && Intrinsics.areEqual(this.f94470w, ogvSeason.f94470w);
    }

    @Override // com.bilibili.ship.theseus.ogv.intro.section.floatlayer.v
    @NotNull
    public final Publish getPublish() {
        return this.f94461n;
    }

    @Override // com.bilibili.ship.theseus.ogv.intro.section.floatlayer.v
    @NotNull
    public final OgvSeasonRights getRights() {
        return this.f94455g;
    }

    @Override // com.bilibili.ship.theseus.ogv.intro.section.floatlayer.v
    public final long getSeasonId() {
        return this.f94449a;
    }

    public final int hashCode() {
        int iA = C3554n0.a(E.a((this.f94452d.hashCode() + I.a(this.f94451c.f71782a, I.a(this.f94450b.f71782a, Long.hashCode(this.f94449a) * 31, 31), 31)) * 31, 31, this.f94453e), 31, this.f94454f);
        int iA2 = E.a((this.f94456i.hashCode() + ((this.h.hashCode() + ((this.f94455g.hashCode() + iA) * 31)) * 31)) * 31, 31, this.f94457j);
        OgvEpisodeReserve ogvEpisodeReserve = this.f94458k;
        int iHashCode = ogvEpisodeReserve == null ? 0 : ogvEpisodeReserve.hashCode();
        NewestEp newestEp = this.f94459l;
        int iHashCode2 = newestEp == null ? 0 : newestEp.hashCode();
        int iHashCode3 = this.f94460m.hashCode();
        int iHashCode4 = this.f94461n.hashCode();
        int iHashCode5 = this.f94462o.hashCode();
        String str = this.f94463p;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        String str2 = this.f94464q;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.f94465r;
        int iHashCode8 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.f94466s;
        int iA3 = E.a(E.a((((((((((iHashCode5 + ((iHashCode4 + ((iHashCode3 + ((((iA2 + iHashCode) * 31) + iHashCode2) * 31)) * 31)) * 31)) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f94467t), 31, this.f94468u);
        String str5 = this.f94469v;
        return this.f94470w.hashCode() + ((iA3 + (str5 == null ? 0 : str5.hashCode())) * 31);
    }

    @NotNull
    public final String toString() {
        a aVar = this.f94451c;
        NewestEp newestEp = this.f94459l;
        TestSwitch testSwitch = this.f94460m;
        Map<String, CacheAuthConfig> map = this.f94470w;
        StringBuilder sb = new StringBuilder("OgvSeason(seasonId=");
        sb.append(this.f94449a);
        sb.append(", seasonType=");
        sb.append(this.f94450b);
        sb.append(", displayedSeasonType=");
        sb.append(aVar);
        sb.append(", status=");
        sb.append(this.f94452d);
        sb.append(", title=");
        sb.append(this.f94453e);
        sb.append(", mediaId=");
        sb.append(this.f94454f);
        sb.append(", rights=");
        sb.append(this.f94455g);
        sb.append(", userStatus=");
        sb.append(this.h);
        sb.append(", stat=");
        sb.append(this.f94456i);
        sb.append(", seasonName=");
        sb.append(this.f94457j);
        sb.append(", reserve=");
        sb.append(this.f94458k);
        sb.append(", newestEp=");
        sb.append(newestEp);
        sb.append(", testSwitch=");
        sb.append(testSwitch);
        sb.append(", publish=");
        sb.append(this.f94461n);
        sb.append(", mode=");
        sb.append(this.f94462o);
        sb.append(", shareUrl=");
        sb.append(this.f94463p);
        sb.append(", shortLink=");
        sb.append(this.f94464q);
        sb.append(", cover=");
        sb.append(this.f94465r);
        sb.append(", squareCover=");
        sb.append(this.f94466s);
        sb.append(", horizontalCover169=");
        sb.append(this.f94467t);
        sb.append(", horizontalCover1610=");
        sb.append(this.f94468u);
        sb.append(", dynamicSubtitle=");
        return C4665g.a(sb, this.f94469v, ", cacheAuthConfigMap=", map, ")");
    }
}
