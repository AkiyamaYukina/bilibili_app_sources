package com.bilibili.ship.theseus.ogv.continuousplay;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.app.viewunite.pgcanymodel.PlayStrategy;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.ogv.C6153e;
import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import javax.inject.Inject;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/continuousplay/a.class */
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f91799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Lu0.a f91800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final OgvCurrentEpisodeRepository f91801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final d f91802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final h f91803e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final C6153e f91804f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Gu0.a f91805g;

    @NotNull
    public final PageReportService h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final b f91806i;

    @Inject
    public a(@NotNull CoroutineScope coroutineScope, @Nullable Lu0.a aVar, @NotNull OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository, @NotNull a.p0.a aVar2, @NotNull a.p0.a aVar3, @NotNull d dVar, @NotNull h hVar, @NotNull C6153e c6153e, @NotNull Gu0.a aVar4, @NotNull PlayStrategy playStrategy, @NotNull PageReportService pageReportService) {
        b bVar;
        this.f91799a = coroutineScope;
        this.f91800b = aVar;
        this.f91801c = ogvCurrentEpisodeRepository;
        this.f91802d = dVar;
        this.f91803e = hVar;
        this.f91804f = c6153e;
        this.f91805g = aVar4;
        this.h = pageReportService;
        if (playStrategy.getStrategiesList().isEmpty()) {
            bVar = (b) aVar2.get();
            dVar.f91811a = 0;
        } else {
            bVar = (b) aVar3.get();
        }
        this.f91806i = bVar;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new ContinuousPlayService$1(this, null), 3, (Object) null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws kotlin.NoWhenBranchMatchedException, kotlin.KotlinNothingValueException {
        /*
            Method dump skipped, instruction units count: 932
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.continuousplay.a.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
