package com.bilibili.ship.theseus.ogv.dubbing;

import com.bapis.bilibili.pgc.gateway.player.v2.PlayDubbingInfo;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import tv.danmaku.biliplayerv2.service.ControlContainerServiceKtxKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/dubbing/SwitchDubbingService$4.class */
final class SwitchDubbingService$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final q this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/dubbing/SwitchDubbingService$4$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q f91831a;

        public a(q qVar) {
            this.f91831a = qVar;
        }

        public final Object emit(Object obj, Continuation continuation) {
            b bVar;
            b bVar2;
            PlayDubbingInfo playDubbingInfo;
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            q qVar = this.f91831a;
            c.a aVarH = qVar.f91887b.h();
            if (zBooleanValue && aVarH.f102988b && (playDubbingInfo = qVar.f91900p) != null) {
                L9.n nVar = new L9.n(qVar, 2);
                if (playDubbingInfo.getGuideText() != null) {
                    Pair<Long, Integer> pairA = qVar.f91899o.a(qVar.f91887b.h().f102988b);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long jLongValue = ((Number) pairA.getFirst()).longValue();
                    if (((Number) pairA.getSecond()).intValue() < 3 && (((Number) pairA.getSecond()).intValue() <= 0 || Math.abs(jCurrentTimeMillis - jLongValue) > TimeUnit.DAYS.toMillis(1L))) {
                        b bVar3 = qVar.f91906v;
                        if (bVar3 != null) {
                            bVar3.dismiss();
                            qVar.f91906v = null;
                        }
                        b bVarA = qVar.f91893i.a(nVar);
                        qVar.f91906v = bVarA;
                        bVarA.f91843g.add(BuildersKt.launch$default(bVarA.f91840d, (CoroutineContext) null, (CoroutineStart) null, new DubbingGuidePopupWindow$scheduleShowDubbingGuideTip$1(bVarA, qVar.f91898n, null), 3, (Object) null));
                        bVarA.f91843g.add(BuildersKt.launch$default(bVarA.f91840d, (CoroutineContext) null, (CoroutineStart) null, new DubbingGuidePopupWindow$scheduleShowDubbingGuideTip$2(bVarA, null), 3, (Object) null));
                    }
                }
            }
            if (!zBooleanValue && (bVar = qVar.f91906v) != null && bVar.isShowing() && (bVar2 = qVar.f91906v) != null) {
                bVar2.dismiss();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchDubbingService$4(q qVar, Continuation<? super SwitchDubbingService$4> continuation) {
        super(2, continuation);
        this.this$0 = qVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SwitchDubbingService$4(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowA = ControlContainerServiceKtxKt.a(this.this$0.f91897m);
            a aVar = new a(this.this$0);
            this.label = 1;
            if (flowA.collect(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
