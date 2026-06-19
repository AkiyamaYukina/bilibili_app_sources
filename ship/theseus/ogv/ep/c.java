package com.bilibili.ship.theseus.ogv.ep;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import com.bilibili.ship.theseus.united.page.castscreen.TheseusCastScreenRepository;
import com.bilibili.ship.theseus.united.page.restrictionlayer.G;
import com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository;
import com.bilibili.ship.theseus.united.player.mediaplay.l;
import javax.inject.Inject;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/ep/c.class */
@StabilityInferred(parameters = 0)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f92158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TheseusCastScreenRepository f92159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Flow<l> f92160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final OgvCurrentEpisodeRepository f92161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Gu0.a f92162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final G f92163f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final OgvSeason f92164g;

    @NotNull
    public final ToolbarRepository h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Lifecycle f92165i;

    @Inject
    public c(@NotNull CoroutineScope coroutineScope, @NotNull TheseusCastScreenRepository theseusCastScreenRepository, @NotNull Flow flow, @NotNull OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository, @NotNull Gu0.a aVar, @NotNull G g7, @NotNull OgvSeason ogvSeason, @NotNull ToolbarRepository toolbarRepository, @NotNull Lifecycle lifecycle) {
        this.f92158a = coroutineScope;
        this.f92159b = theseusCastScreenRepository;
        this.f92160c = flow;
        this.f92161d = ogvCurrentEpisodeRepository;
        this.f92162e = aVar;
        this.f92163f = g7;
        this.f92164g = ogvSeason;
        this.h = toolbarRepository;
        this.f92165i = lifecycle;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new OgvInMediaPlayService$1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new OgvInMediaPlayService$2(this, null), 3, (Object) null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.ship.theseus.ogv.ep.c r7, com.bilibili.ship.theseus.united.player.mediaplay.l r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.ep.c.a(com.bilibili.ship.theseus.ogv.ep.c, com.bilibili.ship.theseus.united.player.mediaplay.l, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
