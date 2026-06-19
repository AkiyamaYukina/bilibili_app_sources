package com.bilibili.ship.theseus.ogv.pay;

import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import com.bilibili.ship.theseus.ogv.pay.sponsor.BangumiSponsorRankSummary;
import com.bilibili.ship.theseus.ogv.pay.sponsor.OgvSponsorPageResultService;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import ev0.InterfaceC7008a;
import javax.inject.Inject;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xl0.C8986a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/pay/OgvPayService.class */
@StabilityInferred(parameters = 0)
public final class OgvPayService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f94152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final OgvCurrentEpisodeRepository f94153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Context f94154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ComponentActivity f94155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final OgvSeason f94156e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final InterfaceC7008a f94157f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final BiliAccounts f94158g;

    @Nullable
    public final BangumiSponsorRankSummary h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.ogv.intro.community.a f94159i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final OgvSponsorPageResultService f94160j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f94161k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f94162l;

    @Inject
    public OgvPayService(@NotNull CoroutineScope coroutineScope, @NotNull OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository, @NotNull Context context, @NotNull ComponentActivity componentActivity, @NotNull OgvSeason ogvSeason, @NotNull InterfaceC7008a interfaceC7008a, @NotNull BiliAccounts biliAccounts, @Nullable BangumiSponsorRankSummary bangumiSponsorRankSummary, @NotNull com.bilibili.ship.theseus.ogv.intro.community.a aVar, @NotNull OgvSponsorPageResultService ogvSponsorPageResultService) {
        this.f94152a = coroutineScope;
        this.f94153b = ogvCurrentEpisodeRepository;
        this.f94154c = context;
        this.f94155d = componentActivity;
        this.f94156e = ogvSeason;
        this.f94157f = interfaceC7008a;
        this.f94158g = biliAccounts;
        this.h = bangumiSponsorRankSummary;
        this.f94159i = aVar;
        this.f94160j = ogvSponsorPageResultService;
        this.f94161k = ogvSeason.f94449a;
        this.f94162l = ogvSeason.f94450b.f71782a;
    }

    public static void a(OgvPayService ogvPayService, String str, String str2, Long l7, String str3, int i7) {
        if ((i7 & 1) != 0) {
            str = null;
        }
        if ((i7 & 2) != 0) {
            str2 = null;
        }
        if ((i7 & 4) != 0) {
            l7 = null;
        }
        if ((i7 & 8) != 0) {
            str3 = null;
        }
        if (ogvPayService.b()) {
            BuildersKt.launch$default(ogvPayService.f94152a, (CoroutineContext) null, (CoroutineStart) null, new OgvPayService$buyCurSeason$1(ogvPayService, str, str2, l7, str3, null), 3, (Object) null);
        }
    }

    public final boolean b() {
        if (this.f94158g.isLogin()) {
            return true;
        }
        Qj0.g.e(this.f94154c, C8986a.a());
        return false;
    }

    public final void c(@NotNull String str, long j7) {
        if (b()) {
            OgvEpisode ogvEpisodeC = this.f94153b.c();
            Long lValueOf = ogvEpisodeC != null ? Long.valueOf(ogvEpisodeC.f93555a) : null;
            if (lValueOf != null) {
                BuildersKt.launch$default(this.f94152a, (CoroutineContext) null, (CoroutineStart) null, new OgvPayService$exchange$1(this, lValueOf.longValue(), str, j7, null), 3, (Object) null);
            }
        }
    }

    public final void d() {
        if (this.h == null) {
            return;
        }
        BuildersKt.launch$default(this.f94152a, (CoroutineContext) null, (CoroutineStart) null, new OgvPayService$showSponsorDialog$1(this, null), 3, (Object) null);
    }
}
