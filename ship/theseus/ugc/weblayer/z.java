package com.bilibili.ship.theseus.ugc.weblayer;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.Map;
import javax.inject.Inject;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import lv0.C7893a;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.remote.IRemoteHandler;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/weblayer/z.class */
@StabilityInferred(parameters = 0)
public final class z implements com.bilibili.ship.theseus.united.page.weblayer.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f98714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final IInteractLayerService f98715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C7893a f98716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a f98717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final C8043a f98718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final PageReportService f98719f;

    @Inject
    public z(@NotNull CoroutineScope coroutineScope, @NotNull IInteractLayerService iInteractLayerService, @NotNull C7893a c7893a, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar, @NotNull C8043a c8043a, @NotNull PageReportService pageReportService) {
        this.f98714a = coroutineScope;
        this.f98715b = iInteractLayerService;
        this.f98716c = c7893a;
        this.f98717d = aVar;
        this.f98718e = c8043a;
        this.f98719f = pageReportService;
    }

    @Override // com.bilibili.ship.theseus.united.page.weblayer.j
    @NotNull
    public final Map a(@NotNull final com.bilibili.ship.theseus.united.page.weblayer.n nVar) {
        return MapsKt.mapOf(TuplesKt.to(Reflection.getOrCreateKotlinClass(com.bilibili.playerbizcommonv2.web.coinguess.c.class), new com.bilibili.playerbizcommonv2.web.coinguess.c(this, nVar) { // from class: com.bilibili.ship.theseus.ugc.weblayer.UGCCoinGuessV3WebService$createPrivacyControllers$controller$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final z f98666a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final com.bilibili.ship.theseus.united.page.weblayer.n f98667b;

            {
                this.f98666a = this;
                this.f98667b = nVar;
            }

            @Override // com.bilibili.playerbizcommonv2.web.coinguess.c
            public final Object h2(com.bilibili.playerbizcommonv2.web.coinguess.e eVar, Continuation<? super Unit> continuation) {
                z zVar = this.f98666a;
                BuildersKt.launch$default(zVar.f98714a, (CoroutineContext) null, (CoroutineStart) null, new UGCCoinGuessV3WebService$createPrivacyControllers$controller$1$coinGuessingSubmit$2(eVar, zVar, this.f98667b, null), 3, (Object) null);
                return Unit.INSTANCE;
            }

            @Override // com.bilibili.playerbizcommonv2.web.coinguess.c
            public final Object l4(com.bilibili.playerbizcommonv2.web.coinguess.d dVar, Continuation<? super Unit> continuation) {
                String strA = com.bilibili.playerbizcommonv2.web.coinguess.f.a(dVar);
                defpackage.a.b("coinGuessingPublish received ", strA, "UGCCoinGuessV3Web");
                IRemoteHandler remoteHandler = this.f98666a.f98715b.getRemoteHandler();
                if (remoteHandler == null) {
                    R9.v.a("coinGuessingPublish skipped reason=no_remote_handler ", strA, "UGCCoinGuessV3Web");
                    return Unit.INSTANCE;
                }
                remoteHandler.appendCommandDanmaku(com.bilibili.playerbizcommonv2.web.coinguess.f.c(dVar));
                BLog.i("UGCCoinGuessV3Web", "coinGuessingPublish appended " + strA);
                this.f98667b.a("publish_success", "coinGuessingPublish", strA);
                return Unit.INSTANCE;
            }
        }));
    }
}
