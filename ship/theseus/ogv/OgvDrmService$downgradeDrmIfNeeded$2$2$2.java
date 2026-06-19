package com.bilibili.ship.theseus.ogv;

import androidx.compose.ui.text.font.C4496a;
import com.alipay.sdk.app.PayTask;
import com.bilibili.lib.dd.DeviceDecision;
import com.bilibili.ship.theseus.ogv.OgvDrmService;
import com.bilibili.ship.theseus.united.page.drm.DrmType;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.DelayKt;
import vl0.C8833a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/OgvDrmService$downgradeDrmIfNeeded$2$2$2.class */
public final class OgvDrmService$downgradeDrmIfNeeded$2$2$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    long J$0;
    int label;
    final OgvDrmService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvDrmService$downgradeDrmIfNeeded$2$2$2(OgvDrmService ogvDrmService, Continuation<? super OgvDrmService$downgradeDrmIfNeeded$2$2$2> continuation) {
        super(1, continuation);
        this.this$0 = ogvDrmService;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new OgvDrmService$downgradeDrmIfNeeded$2$2$2(this.this$0, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        long duration;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            OgvDrmService ogvDrmService = this.this$0;
            ogvDrmService.getClass();
            duration = OgvDrmService.a.f91277a[ogvDrmService.f91273f.ordinal()] == 1 ? DurationKt.toDuration(com.bilibili.ogv.infra.util.i.d(DeviceDecision.INSTANCE.dd("ogv.wait_time_for_bili_drm_downgrading", ""), PayTask.f60018j), DurationUnit.MILLISECONDS) : DurationKt.toDuration(com.bilibili.ogv.infra.util.i.d(DeviceDecision.INSTANCE.dd("ogv.wait_time_for_wide_vine_drm_downgrading", ""), 8000L), DurationUnit.MILLISECONDS);
            this.J$0 = duration;
            this.label = 1;
            if (DelayKt.delay-VtjQ1oo(duration, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            duration = this.J$0;
            ResultKt.throwOnFailure(obj);
        }
        OgvDrmService ogvDrmService2 = this.this$0;
        DrmType drmType = ogvDrmService2.f91273f;
        C8833a.f128290b = drmType.name();
        defpackage.a.b("[theseus-ogv-OgvDrmService-downgradeDrm] ", C4496a.a("reload drm video... failed drm type ", drmType.name()), "OgvDrmService-downgradeDrm");
        ogvDrmService2.f91269b.a();
        defpackage.a.b("[theseus-ogv-OgvDrmService$downgradeDrmIfNeeded$2$2$2-invokeSuspend] ", android.support.v4.media.a.a("after delaying ", Duration.toString-impl(duration), ", downgrade drm..."), "OgvDrmService$downgradeDrmIfNeeded$2$2$2-invokeSuspend");
        return Unit.INSTANCE;
    }
}
