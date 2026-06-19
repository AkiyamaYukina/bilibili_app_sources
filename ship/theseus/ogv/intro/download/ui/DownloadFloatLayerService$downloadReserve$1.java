package com.bilibili.ship.theseus.ogv.intro.download.ui;

import com.bapis.bilibili.playershared.DolbyItem;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/DownloadFloatLayerService$downloadReserve$1.class */
final class DownloadFloatLayerService$downloadReserve$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final DolbyItem.Type $currentAudioType;
    final int $currentQuality;
    final c0 $downloadReserveVm;
    final OgvEpisode $reserveEpisode;
    int label;
    final DownloadFloatLayerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadFloatLayerService$downloadReserve$1(DownloadFloatLayerService downloadFloatLayerService, OgvEpisode ogvEpisode, int i7, DolbyItem.Type type, c0 c0Var, Continuation<? super DownloadFloatLayerService$downloadReserve$1> continuation) {
        super(2, continuation);
        this.this$0 = downloadFloatLayerService;
        this.$reserveEpisode = ogvEpisode;
        this.$currentQuality = i7;
        this.$currentAudioType = type;
        this.$downloadReserveVm = c0Var;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DownloadFloatLayerService$downloadReserve$1(this.this$0, this.$reserveEpisode, this.$currentQuality, this.$currentAudioType, this.$downloadReserveVm, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 455
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.download.ui.DownloadFloatLayerService$downloadReserve$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
