package com.bilibili.ogv.pub.reserve;

import com.bilibili.ogv.pub.reserve.VipReserveDownloadProcessor;
import com.bilibili.videodownloader.model.VideoDownloadSeasonEpEntry;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/reserve/VipReserveDownloadProcessor$realDownload$2.class */
final class VipReserveDownloadProcessor$realDownload$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final List<VideoDownloadSeasonEpEntry> $entry;
    final boolean $isAutoStartDownload;
    int label;
    final VipReserveDownloadProcessor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VipReserveDownloadProcessor$realDownload$2(VipReserveDownloadProcessor vipReserveDownloadProcessor, List<VideoDownloadSeasonEpEntry> list, boolean z6, Continuation<? super VipReserveDownloadProcessor$realDownload$2> continuation) {
        super(2, continuation);
        this.this$0 = vipReserveDownloadProcessor;
        this.$entry = list;
        this.$isAutoStartDownload = z6;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VipReserveDownloadProcessor$realDownload$2(this.this$0, this.$entry, this.$isAutoStartDownload, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        VipReserveDownloadProcessor vipReserveDownloadProcessor = this.this$0;
        List<VideoDownloadSeasonEpEntry> list = this.$entry;
        boolean z6 = this.$isAutoStartDownload;
        vipReserveDownloadProcessor.getClass();
        for (VideoDownloadSeasonEpEntry videoDownloadSeasonEpEntry : list) {
            VipReserveDownloadProcessor.AnonymousClass1.a aVar = vipReserveDownloadProcessor.f71660a;
            if (aVar != null) {
                aVar.j(videoDownloadSeasonEpEntry, z6);
            }
        }
        return Unit.INSTANCE;
    }
}
