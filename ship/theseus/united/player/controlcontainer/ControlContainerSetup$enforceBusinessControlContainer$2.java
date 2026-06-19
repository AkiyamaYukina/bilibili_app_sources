package com.bilibili.ship.theseus.united.player.controlcontainer;

import java.util.Iterator;
import java.util.Map;
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
import kotlinx.coroutines.YieldKt;
import tv.danmaku.biliplayerv2.ControlContainerConfig;
import tv.danmaku.biliplayerv2.ControlContainerType;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/controlcontainer/ControlContainerSetup$enforceBusinessControlContainer$2.class */
final class ControlContainerSetup$enforceBusinessControlContainer$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private Object L$0;
    int label;
    final b this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.controlcontainer.ControlContainerSetup$enforceBusinessControlContainer$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/controlcontainer/ControlContainerSetup$enforceBusinessControlContainer$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final com.bilibili.app.gemini.player.widget.a $controlContainerWidgetConfig;
        final ControlContainerType $currentType;
        int label;
        final b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ControlContainerType controlContainerType, b bVar, com.bilibili.app.gemini.player.widget.a aVar, Continuation<AnonymousClass2> continuation) {
            super(2, continuation);
            this.$currentType = controlContainerType;
            this.this$0 = bVar;
            this.$controlContainerWidgetConfig = aVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$currentType, this.this$0, this.$controlContainerWidgetConfig, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            ControlContainerConfig controlContainerConfig;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (YieldKt.yield(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            for (ControlContainerType controlContainerType : ControlContainerType.getEntries()) {
                if (controlContainerType != this.$currentType) {
                    Map<ControlContainerType, ControlContainerConfig> map = this.this$0.f104441g.f104630j;
                    if (((map == null || (controlContainerConfig = map.get(controlContainerType)) == null) ? null : controlContainerConfig.getInstance()) != null) {
                        b.a(this.this$0, controlContainerType, this.$controlContainerWidgetConfig);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ControlContainerSetup$enforceBusinessControlContainer$2(b bVar, Continuation<ControlContainerSetup$enforceBusinessControlContainer$2> continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ControlContainerSetup$enforceBusinessControlContainer$2 controlContainerSetup$enforceBusinessControlContainer$2 = new ControlContainerSetup$enforceBusinessControlContainer$2(this.this$0, continuation);
        controlContainerSetup$enforceBusinessControlContainer$2.L$0 = obj;
        return controlContainerSetup$enforceBusinessControlContainer$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        b bVar = this.this$0;
        com.bilibili.app.gemini.player.widget.a aVar = new com.bilibili.app.gemini.player.widget.a(new c(bVar, bVar.f104437c));
        Iterator it = this.this$0.f104439e.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(aVar);
        }
        ((yk.b) this.this$0.f104441g.f104629i.getValue()).c = aVar;
        ControlContainerType state = this.this$0.f104440f.getState();
        b.a(this.this$0, state, aVar);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(state, this.this$0, aVar, null), 3, (Object) null);
        defpackage.a.b("[theseus-united-ControlContainerSetup$enforceBusinessControlContainer$2-invokeSuspend] ", "in business scope, enforce business control container: " + state, "ControlContainerSetup$enforceBusinessControlContainer$2-invokeSuspend");
        return Unit.INSTANCE;
    }
}
