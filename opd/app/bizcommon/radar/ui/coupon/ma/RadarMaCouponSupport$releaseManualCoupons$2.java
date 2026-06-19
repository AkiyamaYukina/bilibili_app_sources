package com.bilibili.opd.app.bizcommon.radar.ui.coupon.ma;

import com.bilibili.opd.app.bizcommon.radar.data.AttachPageInfo;
import com.bilibili.opd.app.bizcommon.radar.data.ManualCouponReleaseRequest;
import com.bilibili.opd.app.bizcommon.radar.data.ManualCouponReleaseResponse;
import com.bilibili.opd.app.bizcommon.radar.data.RadarTriggerContent;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/ui/coupon/ma/RadarMaCouponSupport$releaseManualCoupons$2.class */
final class RadarMaCouponSupport$releaseManualCoupons$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ManualCouponReleaseResponse>, Object> {
    final RadarTriggerContent $content;
    final x $model;
    final fn0.a $repo;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadarMaCouponSupport$releaseManualCoupons$2(fn0.a aVar, RadarTriggerContent radarTriggerContent, x xVar, Continuation<? super RadarMaCouponSupport$releaseManualCoupons$2> continuation) {
        super(2, continuation);
        this.$repo = aVar;
        this.$content = radarTriggerContent;
        this.$model = xVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RadarMaCouponSupport$releaseManualCoupons$2(this.$repo, this.$content, this.$model, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ManualCouponReleaseResponse> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ManualCouponReleaseResponse manualCouponReleaseResponse;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            fn0.a aVar = this.$repo;
            manualCouponReleaseResponse = null;
            if (aVar != null) {
                String id = this.$content.getId();
                String str = id;
                if (id == null) {
                    str = "";
                }
                AttachPageInfo attachInfo = this.$content.getAttachInfo();
                String eventName = null;
                if (attachInfo != null) {
                    eventName = attachInfo.getEventName();
                }
                if (eventName == null) {
                    eventName = "";
                }
                ManualCouponReleaseRequest manualCouponReleaseRequest = new ManualCouponReleaseRequest(str, eventName, this.$model.f74402g);
                this.label = 1;
                Object objA = aVar.a(manualCouponReleaseRequest, this);
                obj = objA;
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return manualCouponReleaseResponse;
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        manualCouponReleaseResponse = (ManualCouponReleaseResponse) obj;
        return manualCouponReleaseResponse;
    }
}
