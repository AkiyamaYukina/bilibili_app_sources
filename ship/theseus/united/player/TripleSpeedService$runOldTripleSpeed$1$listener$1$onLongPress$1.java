package com.bilibili.ship.theseus.united.player;

import com.bilibili.ogv.infra.coroutine.SelectKt$selectCancellingUnselected$scope$1;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;
import tv.danmaku.biliplayerv2.widget.IFunctionContainer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/TripleSpeedService$runOldTripleSpeed$1$listener$1$onLongPress$1.class */
public final class TripleSpeedService$runOldTripleSpeed$1$listener$1$onLongPress$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final IFunctionContainer.LayoutParams $layoutParams;
    final float $speed;
    long J$0;
    int label;
    final e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TripleSpeedService$runOldTripleSpeed$1$listener$1$onLongPress$1(e eVar, float f7, IFunctionContainer.LayoutParams layoutParams, Continuation<? super TripleSpeedService$runOldTripleSpeed$1$listener$1$onLongPress$1> continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$speed = f7;
        this.$layoutParams = layoutParams;
    }

    private static final Unit invokeSuspend$lambda$0(e eVar, float f7, IFunctionContainer.LayoutParams layoutParams, com.bilibili.ogv.infra.coroutine.c cVar) {
        cVar.b(new TripleSpeedService$runOldTripleSpeed$1$listener$1$onLongPress$1$1$1(eVar, f7, null));
        cVar.b(new TripleSpeedService$runOldTripleSpeed$1$listener$1$onLongPress$1$1$2(eVar, layoutParams, null));
        cVar.b(new TripleSpeedService$runOldTripleSpeed$1$listener$1$onLongPress$1$1$3(eVar, null));
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TripleSpeedService$runOldTripleSpeed$1$listener$1$onLongPress$1(this.this$0, this.$speed, this.$layoutParams, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        long jCurrentTimeMillis;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jCurrentTimeMillis = this.J$0;
            try {
                ResultKt.throwOnFailure(obj);
                this.this$0.f104452d.report(new NeuronsEvents.NormalEvent("player.player.gesture.speedup.player", new String[]{"level", String.valueOf(this.$speed), "speedup_duration", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)}));
                return Unit.INSTANCE;
            } catch (Throwable th) {
                th = th;
                this.this$0.f104452d.report(new NeuronsEvents.NormalEvent("player.player.gesture.speedup.player", new String[]{"level", String.valueOf(this.$speed), "speedup_duration", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)}));
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        jCurrentTimeMillis = System.currentTimeMillis();
        try {
            e eVar = this.this$0;
            float f7 = this.$speed;
            IFunctionContainer.LayoutParams layoutParams = this.$layoutParams;
            this.J$0 = jCurrentTimeMillis;
            this.label = 1;
            ArrayList arrayList = new ArrayList();
            invokeSuspend$lambda$0(eVar, f7, layoutParams, new SelectKt$selectCancellingUnselected$scope$1(arrayList));
            if (FlowKt.first(FlowKt.merge(arrayList), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.this$0.f104452d.report(new NeuronsEvents.NormalEvent("player.player.gesture.speedup.player", new String[]{"level", String.valueOf(this.$speed), "speedup_duration", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)}));
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            th = th2;
            this.this$0.f104452d.report(new NeuronsEvents.NormalEvent("player.player.gesture.speedup.player", new String[]{"level", String.valueOf(this.$speed), "speedup_duration", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)}));
            throw th;
        }
    }
}
