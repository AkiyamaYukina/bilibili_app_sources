package com.bilibili.ship.theseus.ogv.intro;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.brouter.uri.Uri;
import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import com.bilibili.ship.theseus.ogv.router.OpenPageProtocol;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import com.bilibili.ship.theseus.ogv.vip.d;
import java.util.Map;
import javax.inject.Inject;
import kntr.base.router.Router;
import kntr.common.router.UrisKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/D.class */
@StabilityInferred(parameters = 0)
public final class D implements com.bilibili.ship.theseus.united.page.restrictionlayer.t<com.bilibili.ship.theseus.united.page.restrictionlayer.P> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f92198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final OgvSeason f92199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final OgvCurrentEpisodeRepository f92200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.ogv.web.b f92201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.ogv.vip.a f92202e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Q f92203f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Router f92204g;

    @Inject
    public D(@NotNull CoroutineScope coroutineScope, @NotNull OgvSeason ogvSeason, @NotNull OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository, @NotNull com.bilibili.ship.theseus.ogv.web.b bVar, @NotNull com.bilibili.ship.theseus.ogv.vip.a aVar, @NotNull Q q7, @NotNull Router router) {
        this.f92198a = coroutineScope;
        this.f92199b = ogvSeason;
        this.f92200c = ogvCurrentEpisodeRepository;
        this.f92201d = bVar;
        this.f92202e = aVar;
        this.f92203f = q7;
        this.f92204g = router;
    }

    @Override // com.bilibili.ship.theseus.united.page.restrictionlayer.t
    public final void a(com.bilibili.ship.theseus.united.page.restrictionlayer.s sVar) {
        com.bilibili.ship.theseus.united.page.restrictionlayer.P p7 = (com.bilibili.ship.theseus.united.page.restrictionlayer.P) sVar;
        String str = p7.f102611a;
        Map<String, String> map = p7.f102613c;
        OgvSeason ogvSeason = this.f92199b;
        long j7 = ogvSeason.f94449a;
        OgvEpisode ogvEpisodeC = this.f92200c.c();
        Long lValueOf = ogvEpisodeC != null ? Long.valueOf(ogvEpisodeC.f93555a) : null;
        String str2 = p7.f102614d;
        String str3 = str2;
        if (str2 == null) {
            str3 = "vip";
        }
        String str4 = ogvSeason.f94450b + "-" + j7 + "-" + lValueOf + "-" + str3;
        boolean z6 = p7.f102615e;
        String str5 = p7.f102612b;
        if (!z6) {
            if (str == null || str.length() == 0) {
                BuildersKt.launch$default(this.f92198a, (CoroutineContext) null, (CoroutineStart) null, new OgvOperationActionHandler$handle$2(this, str5, str4, map, null), 3, (Object) null);
                return;
            } else {
                BuildersKt.launch$default(this.f92198a, (CoroutineContext) null, (CoroutineStart) null, new OgvOperationActionHandler$handle$1(str, this, str5, str4, map, null), 3, (Object) null);
                return;
            }
        }
        String str6 = (String) com.bilibili.ogv.infra.util.i.a(str);
        Uri uri = null;
        if (str6 != null) {
            uri = UrisKt.toUri(str6);
        }
        Map<String, String> mapEmptyMap = map;
        if (map == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        OpenPageProtocol.b(this.f92204g).launch(d.a.a(uri, str5, str4, mapEmptyMap));
    }

    @Override // com.bilibili.ship.theseus.united.page.restrictionlayer.t
    @NotNull
    public final Class<com.bilibili.ship.theseus.united.page.restrictionlayer.P> b() {
        return com.bilibili.ship.theseus.united.page.restrictionlayer.P.class;
    }
}
