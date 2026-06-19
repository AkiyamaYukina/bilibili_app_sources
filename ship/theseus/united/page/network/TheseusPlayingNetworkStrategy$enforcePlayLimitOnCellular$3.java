package com.bilibili.ship.theseus.united.page.network;

import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.playerbizcommon.features.network.PlayerNetworkFunctionWidget;
import com.bilibili.ship.theseus.united.page.network.TheseusPlayingNetworkStrategy$enforcePlayLimitOnCellular$3;
import com.bilibili.ship.theseus.united.player.mediaplay.network.d;
import com.bilibili.ship.theseus.united.player.mediaplay.network.o;
import com.bilibili.ship.theseus.united.player.mediaplay.network.p;
import com.bilibili.ship.theseus.united.player.mediaplay.network.q;
import com.bilibili.ship.theseus.united.player.mediaplay.network.r;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/network/TheseusPlayingNetworkStrategy$enforcePlayLimitOnCellular$3.class */
final class TheseusPlayingNetworkStrategy$enforcePlayLimitOnCellular$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final d.a $content;
    final Function1<Boolean, Unit> $continuePlay;
    private Object L$0;
    int label;
    final TheseusPlayingNetworkStrategy this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.network.TheseusPlayingNetworkStrategy$enforcePlayLimitOnCellular$3$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/network/TheseusPlayingNetworkStrategy$enforcePlayLimitOnCellular$3$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusPlayingNetworkStrategy this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.network.TheseusPlayingNetworkStrategy$enforcePlayLimitOnCellular$3$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/network/TheseusPlayingNetworkStrategy$enforcePlayLimitOnCellular$3$1$1.class */
        public static final class C10751 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final TheseusPlayingNetworkStrategy this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10751(TheseusPlayingNetworkStrategy theseusPlayingNetworkStrategy, Continuation<? super C10751> continuation) {
                super(2, continuation);
                this.this$0 = theseusPlayingNetworkStrategy;
            }

            private static final d.c invokeSuspend$lambda$0(String str, d.c cVar) {
                return d.c.a(cVar, d.a.a(cVar.f104556a, null, null, str, 63), null, null, 30);
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C10751 c10751 = new C10751(this.this$0, continuation);
                c10751.L$0 = obj;
                return c10751;
            }

            public final Object invoke(String str, Continuation<? super Unit> continuation) {
                return create(str, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object value;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                String str = (String) this.L$0;
                if (str == null) {
                    return Unit.INSTANCE;
                }
                MutableStateFlow<d.c> mutableStateFlowA = this.this$0.f102087f.a();
                do {
                    value = mutableStateFlowA.getValue();
                } while (!mutableStateFlowA.compareAndSet(value, invokeSuspend$lambda$0(str, (d.c) value)));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TheseusPlayingNetworkStrategy theseusPlayingNetworkStrategy, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = theseusPlayingNetworkStrategy;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                TheseusPlayingNetworkStrategy theseusPlayingNetworkStrategy = this.this$0;
                MutableStateFlow<String> mutableStateFlow = theseusPlayingNetworkStrategy.f102085d.f121510a;
                C10751 c10751 = new C10751(theseusPlayingNetworkStrategy, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableStateFlow, c10751, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.network.TheseusPlayingNetworkStrategy$enforcePlayLimitOnCellular$3$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/network/TheseusPlayingNetworkStrategy$enforcePlayLimitOnCellular$3$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final TheseusPlayingNetworkStrategy this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(TheseusPlayingNetworkStrategy theseusPlayingNetworkStrategy, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = theseusPlayingNetworkStrategy;
        }

        private static final d.c invokeSuspend$lambda$0(final q qVar, final TheseusPlayingNetworkStrategy theseusPlayingNetworkStrategy, final r rVar, d.c cVar) {
            return d.c.a(cVar, d.a.a(cVar.f104556a, qVar.f104597a, null, null, 119), null, new Function0(theseusPlayingNetworkStrategy, qVar, rVar) { // from class: com.bilibili.ship.theseus.united.page.network.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final TheseusPlayingNetworkStrategy f102094a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final q f102095b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final r f102096c;

                {
                    this.f102094a = theseusPlayingNetworkStrategy;
                    this.f102095b = qVar;
                    this.f102096c = rVar;
                }

                public final Object invoke() {
                    return TheseusPlayingNetworkStrategy$enforcePlayLimitOnCellular$3.AnonymousClass2.invokeSuspend$lambda$0$0(this.f102094a, this.f102095b, this.f102096c);
                }
            }, 14);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0$0(TheseusPlayingNetworkStrategy theseusPlayingNetworkStrategy, q qVar, r rVar) {
            theseusPlayingNetworkStrategy.f102088g.b(Long.valueOf(rVar.f104600a), qVar.f104598b);
            Neurons.reportClick(false, "player.player.network-layer-freeflow.0.click", MapsKt.mapOf(TuplesKt.to("type", "1")));
            return Unit.INSTANCE;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00f5  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instruction units count: 257
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.network.TheseusPlayingNetworkStrategy$enforcePlayLimitOnCellular$3.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TheseusPlayingNetworkStrategy$enforcePlayLimitOnCellular$3(d.a aVar, TheseusPlayingNetworkStrategy theseusPlayingNetworkStrategy, Function1<? super Boolean, Unit> function1, Continuation<? super TheseusPlayingNetworkStrategy$enforcePlayLimitOnCellular$3> continuation) {
        super(2, continuation);
        this.$content = aVar;
        this.this$0 = theseusPlayingNetworkStrategy;
        this.$continuePlay = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(TheseusPlayingNetworkStrategy theseusPlayingNetworkStrategy) {
        theseusPlayingNetworkStrategy.f102083b.getOnBackPressedDispatcher().onBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(TheseusPlayingNetworkStrategy theseusPlayingNetworkStrategy) {
        com.bilibili.ship.theseus.united.player.mediaplay.network.a aVar = theseusPlayingNetworkStrategy.f102088g;
        aVar.getClass();
        aVar.b(null, PlayerNetworkFunctionWidget.NORMAL_URL);
        Neurons.reportClick(false, "player.player.network-layer-freeflow.0.click", MapsKt.mapOf(TuplesKt.to("type", "1")));
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TheseusPlayingNetworkStrategy$enforcePlayLimitOnCellular$3 theseusPlayingNetworkStrategy$enforcePlayLimitOnCellular$3 = new TheseusPlayingNetworkStrategy$enforcePlayLimitOnCellular$3(this.$content, this.this$0, this.$continuePlay, continuation);
        theseusPlayingNetworkStrategy$enforcePlayLimitOnCellular$3.L$0 = obj;
        return theseusPlayingNetworkStrategy$enforcePlayLimitOnCellular$3;
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
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        d.a aVar = this.$content;
        d.b bVarA = p.a(this.this$0.f102086e.h());
        final TheseusPlayingNetworkStrategy theseusPlayingNetworkStrategy = this.this$0;
        d.c cVar = new d.c(aVar, bVarA, new Function0(theseusPlayingNetworkStrategy) { // from class: com.bilibili.ship.theseus.united.page.network.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TheseusPlayingNetworkStrategy f102092a;

            {
                this.f102092a = theseusPlayingNetworkStrategy;
            }

            public final Object invoke() {
                return TheseusPlayingNetworkStrategy$enforcePlayLimitOnCellular$3.invokeSuspend$lambda$0(this.f102092a);
            }
        }, this.$continuePlay, new Function0(theseusPlayingNetworkStrategy) { // from class: com.bilibili.ship.theseus.united.page.network.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TheseusPlayingNetworkStrategy f102093a;

            {
                this.f102093a = theseusPlayingNetworkStrategy;
            }

            public final Object invoke() {
                return TheseusPlayingNetworkStrategy$enforcePlayLimitOnCellular$3.invokeSuspend$lambda$1(this.f102093a);
            }
        });
        o oVar = theseusPlayingNetworkStrategy.f102087f;
        oVar.a().setValue(cVar);
        oVar.f104595g.setValue(Boolean.TRUE);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, null), 3, (Object) null);
        c71.b.a.getClass();
        if (c71.b.b()) {
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, null), 3, (Object) null);
        }
        return Unit.INSTANCE;
    }
}
