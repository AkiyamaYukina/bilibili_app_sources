package com.bilibili.ship.theseus.ogv.media;

import com.bilibili.player.tangram.basic.WithVideoProgress;
import com.bilibili.ship.theseus.ogv.media.OgvEpStartToastService;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function3;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import tv.danmaku.biliplayerv2.widget.toast.PlayerToast;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/media/d.class */
public final class d implements PlayerToast.MessageClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OgvEpStartToastService f94011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OgvEpStartToastService.a f94012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WithVideoProgress f94013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.bilibili.ship.theseus.united.player.mediaplay.c f94014d;

    public d(OgvEpStartToastService ogvEpStartToastService, OgvEpStartToastService.a aVar, WithVideoProgress withVideoProgress, com.bilibili.ship.theseus.united.player.mediaplay.c cVar) {
        this.f94011a = ogvEpStartToastService;
        this.f94012b = aVar;
        this.f94013c = withVideoProgress;
        this.f94014d = cVar;
    }

    public final void onActionWithCollapse(int i7, boolean z6) {
        OgvEpStartToastService ogvEpStartToastService = this.f94011a;
        ogvEpStartToastService.getClass();
        OgvEpStartToastService.a aVar = this.f94012b;
        uk.b bVar = aVar.f93988a;
        if (aVar.f93989b == OgvEpStartToastService.ActionType.SEEK) {
            BuildersKt.launch$default(ogvEpStartToastService.f93987f, (CoroutineContext) null, (CoroutineStart) null, new OgvEpStartToastService$onActionToastClick$1(bVar, this.f94013c, this.f94014d, null), 3, (Object) null);
        } else {
            Function3<? super Long, ? super ev0.i, ? super com.bilibili.ship.theseus.united.report.b, Unit> function3 = ogvEpStartToastService.f93984c.f91612b;
            long j7 = bVar.b;
            Duration.Companion companion = Duration.Companion;
            function3.invoke(Long.valueOf(j7), new ev0.i(DurationKt.toDuration(bVar.a, DurationUnit.SECONDS), false), new com.bilibili.ship.theseus.united.report.b(0));
        }
    }

    public final void onDismiss() {
    }
}
