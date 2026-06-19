package com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.cm;

import com.bilibili.adcommon.data.model.SourceContent;
import com.bilibili.gripper.api.ad.biz.videodetail.AdVideoExtraBuilder;
import com.bilibili.gripper.api.ad.core.GAdCoreKt;
import com.bilibili.gripper.api.ad.core.report.IAdReporter;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/relatedrecommand/cm/UGCEndPageCMRelatedComponentsTransformer$createCMEndPageRunningUIComponent$exposureEntryV$1$2.class */
public final class UGCEndPageCMRelatedComponentsTransformer$createCMEndPageRunningUIComponent$exposureEntryV$1$2 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
    final Long $id;
    final SourceContent $sc;
    final String $title;
    int label;
    final UGCEndPageCMRelatedComponentsTransformer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UGCEndPageCMRelatedComponentsTransformer$createCMEndPageRunningUIComponent$exposureEntryV$1$2(Long l7, String str, SourceContent sourceContent, UGCEndPageCMRelatedComponentsTransformer uGCEndPageCMRelatedComponentsTransformer, Continuation<? super UGCEndPageCMRelatedComponentsTransformer$createCMEndPageRunningUIComponent$exposureEntryV$1$2> continuation) {
        super(2, continuation);
        this.$id = l7;
        this.$title = str;
        this.$sc = sourceContent;
        this.this$0 = uGCEndPageCMRelatedComponentsTransformer;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UGCEndPageCMRelatedComponentsTransformer$createCMEndPageRunningUIComponent$exposureEntryV$1$2(this.$id, this.$title, this.$sc, this.this$0, continuation);
    }

    public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
        return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        BLog.i("UGCEndPageCMRelatedComponentsTransformer", "reportAdStrictExpose, " + this.$id + " " + this.$title);
        IAdReporter.strictExposeAll$default(GAdCoreKt.getGAdReport(), this.$sc, AdVideoExtraBuilder.INSTANCE.invoke(this.this$0.f96865f).build(), (String) null, false, 12, (Object) null);
        return Unit.INSTANCE;
    }
}
