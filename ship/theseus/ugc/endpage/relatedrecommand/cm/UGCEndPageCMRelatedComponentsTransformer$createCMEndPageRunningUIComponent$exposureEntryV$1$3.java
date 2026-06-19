package com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.cm;

import com.bapis.bilibili.app.viewunite.common.RelateCard;
import com.bilibili.gripper.api.ad.biz.videodetail.endpage.EndPageCMModel;
import com.bilibili.pvtracker.PageViewTracker;
import com.bilibili.ship.theseus.united.page.intro.module.relate.C6320j;
import com.bilibili.ship.theseus.united.page.intro.module.relate.o0;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import mv0.C8043a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/relatedrecommand/cm/UGCEndPageCMRelatedComponentsTransformer$createCMEndPageRunningUIComponent$exposureEntryV$1$3.class */
public final class UGCEndPageCMRelatedComponentsTransformer$createCMEndPageRunningUIComponent$exposureEntryV$1$3 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
    final String $creativeIdStr;
    final EndPageCMModel $endPageCMModel;
    final String $saleTypeStr;
    int label;
    final UGCEndPageCMRelatedComponentsTransformer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UGCEndPageCMRelatedComponentsTransformer$createCMEndPageRunningUIComponent$exposureEntryV$1$3(String str, String str2, EndPageCMModel endPageCMModel, UGCEndPageCMRelatedComponentsTransformer uGCEndPageCMRelatedComponentsTransformer, Continuation<? super UGCEndPageCMRelatedComponentsTransformer$createCMEndPageRunningUIComponent$exposureEntryV$1$3> continuation) {
        super(2, continuation);
        this.$creativeIdStr = str;
        this.$saleTypeStr = str2;
        this.$endPageCMModel = endPageCMModel;
        this.this$0 = uGCEndPageCMRelatedComponentsTransformer;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UGCEndPageCMRelatedComponentsTransformer$createCMEndPageRunningUIComponent$exposureEntryV$1$3(this.$creativeIdStr, this.$saleTypeStr, this.$endPageCMModel, this.this$0, continuation);
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
        Map mapMapOf = MapsKt.mapOf(new Pair[]{TuplesKt.to("creative_id", this.$creativeIdStr), TuplesKt.to("sale_type", this.$saleTypeStr)});
        RelateCard relateCard = this.$endPageCMModel.getRelateCard();
        UGCEndPageCMRelatedComponentsTransformer uGCEndPageCMRelatedComponentsTransformer = this.this$0;
        PageReportService pageReportService = uGCEndPageCMRelatedComponentsTransformer.f96863d;
        C8043a c8043a = uGCEndPageCMRelatedComponentsTransformer.f96864e;
        o0 o0VarC = C6320j.c(relateCard, Long.MIN_VALUE, "");
        HashMap map = new HashMap();
        map.put("goto", o0VarC.f101317b);
        String strCurrentPolarisActionId = PageViewTracker.getInstance().currentPolarisActionId();
        map.put("action_id", strCurrentPolarisActionId != null ? strCurrentPolarisActionId : "");
        map.put("track_id", c8043a.a().f123882d);
        map.putAll(mapMapOf);
        pageReportService.h("player.player.full-endpage-insertcard.0.show", map, true);
        return Unit.INSTANCE;
    }
}
