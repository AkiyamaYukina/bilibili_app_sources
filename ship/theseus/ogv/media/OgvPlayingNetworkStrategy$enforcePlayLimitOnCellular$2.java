package com.bilibili.ship.theseus.ogv.media;

import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.playerbizcommon.features.network.PlayerNetworkFunctionWidget;
import com.bilibili.ship.theseus.ogv.media.OgvPlayingNetworkStrategy$enforcePlayLimitOnCellular$2;
import com.bilibili.ship.theseus.united.player.mediaplay.network.d;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/media/OgvPlayingNetworkStrategy$enforcePlayLimitOnCellular$2.class */
final class OgvPlayingNetworkStrategy$enforcePlayLimitOnCellular$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final Function1<Boolean, Unit> $continuePlay;
    final boolean $isLeftVisible;
    final String $rightText;
    final boolean $showFreeDataInfo;
    final String $tipText;
    private Object L$0;
    int label;
    final OgvPlayingNetworkStrategy this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.media.OgvPlayingNetworkStrategy$enforcePlayLimitOnCellular$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/media/OgvPlayingNetworkStrategy$enforcePlayLimitOnCellular$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<com.bilibili.player.tangram.playercore.u, Continuation<? super Boolean>, Object> {
        Object L$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(com.bilibili.player.tangram.playercore.u uVar, Continuation<? super Boolean> continuation) {
            return create(uVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(((com.bilibili.player.tangram.playercore.u) this.L$0) != null);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.media.OgvPlayingNetworkStrategy$enforcePlayLimitOnCellular$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/media/OgvPlayingNetworkStrategy$enforcePlayLimitOnCellular$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OgvPlayingNetworkStrategy this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.media.OgvPlayingNetworkStrategy$enforcePlayLimitOnCellular$2$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/media/OgvPlayingNetworkStrategy$enforcePlayLimitOnCellular$2$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final OgvPlayingNetworkStrategy this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(OgvPlayingNetworkStrategy ogvPlayingNetworkStrategy, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = ogvPlayingNetworkStrategy;
            }

            private static final d.c invokeSuspend$lambda$0(String str, d.c cVar) {
                return d.c.a(cVar, d.a.a(cVar.f104556a, null, null, str, 63), null, null, 30);
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
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
                MutableStateFlow<d.c> mutableStateFlowA = this.this$0.f94001g.a();
                do {
                    value = mutableStateFlowA.getValue();
                } while (!mutableStateFlowA.compareAndSet(value, invokeSuspend$lambda$0(str, (d.c) value)));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(OgvPlayingNetworkStrategy ogvPlayingNetworkStrategy, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = ogvPlayingNetworkStrategy;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                OgvPlayingNetworkStrategy ogvPlayingNetworkStrategy = this.this$0;
                MutableStateFlow<String> mutableStateFlow = ogvPlayingNetworkStrategy.f93998d.f121510a;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ogvPlayingNetworkStrategy, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableStateFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.media.OgvPlayingNetworkStrategy$enforcePlayLimitOnCellular$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/media/OgvPlayingNetworkStrategy$enforcePlayLimitOnCellular$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final boolean $showFreeDataInfo;
        Object L$0;
        int label;
        final OgvPlayingNetworkStrategy this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(OgvPlayingNetworkStrategy ogvPlayingNetworkStrategy, boolean z6, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = ogvPlayingNetworkStrategy;
            this.$showFreeDataInfo = z6;
        }

        private static final d.c invokeSuspend$lambda$0(final com.bilibili.ship.theseus.united.player.mediaplay.network.q qVar, final OgvPlayingNetworkStrategy ogvPlayingNetworkStrategy, final com.bilibili.ship.theseus.united.player.mediaplay.network.r rVar, d.c cVar) {
            return d.c.a(cVar, d.a.a(cVar.f104556a, qVar.f104597a, qVar.f104599c, null, 87), null, new Function0(ogvPlayingNetworkStrategy, qVar, rVar) { // from class: com.bilibili.ship.theseus.ogv.media.x

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final OgvPlayingNetworkStrategy f94026a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final com.bilibili.ship.theseus.united.player.mediaplay.network.q f94027b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final com.bilibili.ship.theseus.united.player.mediaplay.network.r f94028c;

                {
                    this.f94026a = ogvPlayingNetworkStrategy;
                    this.f94027b = qVar;
                    this.f94028c = rVar;
                }

                public final Object invoke() {
                    return OgvPlayingNetworkStrategy$enforcePlayLimitOnCellular$2.AnonymousClass3.invokeSuspend$lambda$0$0(this.f94026a, this.f94027b, this.f94028c);
                }
            }, 14);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0$0(OgvPlayingNetworkStrategy ogvPlayingNetworkStrategy, com.bilibili.ship.theseus.united.player.mediaplay.network.q qVar, com.bilibili.ship.theseus.united.player.mediaplay.network.r rVar) {
            ogvPlayingNetworkStrategy.h.b(Long.valueOf(rVar.f104600a), qVar.f104598b);
            Neurons.reportClick(false, "player.player.network-layer-freeflow.0.click", MapsKt.mapOf(TuplesKt.to("type", "1")));
            return Unit.INSTANCE;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, this.$showFreeDataInfo, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x010d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instruction units count: 285
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.media.OgvPlayingNetworkStrategy$enforcePlayLimitOnCellular$2.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OgvPlayingNetworkStrategy$enforcePlayLimitOnCellular$2(OgvPlayingNetworkStrategy ogvPlayingNetworkStrategy, String str, boolean z6, String str2, Function1<? super Boolean, Unit> function1, boolean z7, Continuation<? super OgvPlayingNetworkStrategy$enforcePlayLimitOnCellular$2> continuation) {
        super(2, continuation);
        this.this$0 = ogvPlayingNetworkStrategy;
        this.$tipText = str;
        this.$isLeftVisible = z6;
        this.$rightText = str2;
        this.$continuePlay = function1;
        this.$showFreeDataInfo = z7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(OgvPlayingNetworkStrategy ogvPlayingNetworkStrategy) {
        ogvPlayingNetworkStrategy.f93996b.getOnBackPressedDispatcher().onBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(OgvPlayingNetworkStrategy ogvPlayingNetworkStrategy) {
        com.bilibili.ship.theseus.united.player.mediaplay.network.a aVar = ogvPlayingNetworkStrategy.h;
        aVar.getClass();
        aVar.b(null, PlayerNetworkFunctionWidget.NORMAL_URL);
        Neurons.reportClick(false, "player.player.network-layer-freeflow.0.click", MapsKt.mapOf(TuplesKt.to("type", "1")));
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OgvPlayingNetworkStrategy$enforcePlayLimitOnCellular$2 ogvPlayingNetworkStrategy$enforcePlayLimitOnCellular$2 = new OgvPlayingNetworkStrategy$enforcePlayLimitOnCellular$2(this.this$0, this.$tipText, this.$isLeftVisible, this.$rightText, this.$continuePlay, this.$showFreeDataInfo, continuation);
        ogvPlayingNetworkStrategy$enforcePlayLimitOnCellular$2.L$0 = obj;
        return ogvPlayingNetworkStrategy$enforcePlayLimitOnCellular$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        d.a aVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            Flow<com.bilibili.player.tangram.playercore.u> flowB = this.this$0.f93997c.b();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            this.L$0 = coroutineScope;
            this.label = 1;
            if (FlowKt.first(flowB, anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            coroutineScope = coroutineScope2;
        }
        String str = this.$tipText;
        if (str == null || StringsKt.isBlank(str)) {
            aVar = new d.a(76, null, this.$rightText, "", false, this.$isLeftVisible);
        } else {
            aVar = new d.a(72, this.$tipText, this.$rightText, "", false, this.$isLeftVisible);
        }
        d.b bVarA = com.bilibili.ship.theseus.united.player.mediaplay.network.p.a(this.this$0.f93999e.h());
        final OgvPlayingNetworkStrategy ogvPlayingNetworkStrategy = this.this$0;
        d.c cVar = new d.c(aVar, bVarA, new Function0(ogvPlayingNetworkStrategy) { // from class: com.bilibili.ship.theseus.ogv.media.v

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final OgvPlayingNetworkStrategy f94024a;

            {
                this.f94024a = ogvPlayingNetworkStrategy;
            }

            public final Object invoke() {
                return OgvPlayingNetworkStrategy$enforcePlayLimitOnCellular$2.invokeSuspend$lambda$0(this.f94024a);
            }
        }, this.$continuePlay, new Function0(ogvPlayingNetworkStrategy) { // from class: com.bilibili.ship.theseus.ogv.media.w

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final OgvPlayingNetworkStrategy f94025a;

            {
                this.f94025a = ogvPlayingNetworkStrategy;
            }

            public final Object invoke() {
                return OgvPlayingNetworkStrategy$enforcePlayLimitOnCellular$2.invokeSuspend$lambda$1(this.f94025a);
            }
        });
        y.f94029a = true;
        com.bilibili.ship.theseus.united.player.mediaplay.network.o oVar = ogvPlayingNetworkStrategy.f94001g;
        oVar.a().setValue(cVar);
        oVar.f104595g.setValue(Boolean.TRUE);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, this.$showFreeDataInfo, null), 3, (Object) null);
    }
}
