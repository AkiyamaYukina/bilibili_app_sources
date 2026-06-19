package com.bilibili.ship.theseus.united.page.intro.module.relate;

import com.bilibili.adcommon.data.model.AdRelateItem;
import com.bilibili.gripper.api.ad.biz.videodetail.AdVideoExtraBuilder;
import com.bilibili.gripper.api.ad.core.GAdCoreKt;
import com.bilibili.gripper.api.ad.core.GAdReport;
import com.bilibili.gripper.api.ad.core.report.ExtraParams;
import com.bilibili.gripper.api.ad.core.report.IAdReporter;
import com.bilibili.search2.api.SearchBangumiItem;
import java.util.List;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailRelateService$createCMComponent$exposureEntry$1$1.class */
final class DetailRelateService$createCMComponent$exposureEntry$1$1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
    final o0 $card;
    final Lazy<ExtraParams> $widgetExposeParams$delegate;
    int label;
    final DetailRelateService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailRelateService$createCMComponent$exposureEntry$1$1(o0 o0Var, DetailRelateService detailRelateService, Lazy<ExtraParams> lazy, Continuation<? super DetailRelateService$createCMComponent$exposureEntry$1$1> continuation) {
        super(2, continuation);
        this.$card = o0Var;
        this.this$0 = detailRelateService;
        this.$widgetExposeParams$delegate = lazy;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DetailRelateService$createCMComponent$exposureEntry$1$1(this.$card, this.this$0, this.$widgetExposeParams$delegate, continuation);
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
        p0 p0Var = this.$card.f101318c;
        BLog.i("DetailRelateService", "reportAdExpose, " + p0Var.f101354l + " " + p0Var.f101344a);
        GAdReport gAdReport = GAdCoreKt.getGAdReport();
        AdRelateItem adRelateItem = this.$card.f101325k.f101304k;
        ExtraParams extraParamsBuild = AdVideoExtraBuilder.INSTANCE.invoke(this.this$0.f100867b).build();
        DetailRelateService detailRelateService = this.this$0;
        o0 o0Var = this.$card;
        detailRelateService.getClass();
        IAdReporter.exposeAll$default(gAdReport, adRelateItem, extraParamsBuild.plus(DetailRelateService.i(o0Var)).plus((ExtraParams) this.$widgetExposeParams$delegate.getValue()), (String) null, false, (List) null, (String) null, false, SearchBangumiItem.TYPE_FULLNET_VARIETY, (Object) null);
        return Unit.INSTANCE;
    }
}
