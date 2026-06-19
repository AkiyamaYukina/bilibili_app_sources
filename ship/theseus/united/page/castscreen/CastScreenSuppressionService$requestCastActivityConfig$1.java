package com.bilibili.ship.theseus.united.page.castscreen;

import com.bilibili.lib.projection.internal.api.model.ProjectionOperationConfig;
import com.bilibili.ship.theseus.united.page.castscreen.CastScreenSuppressionService;
import com.bilibili.ship.theseus.united.page.castscreen.CastScreenSuppressionService$requestCastActivityConfig$1;
import com.bilibili.ship.theseus.united.page.toolbar.actionview.projection.ToolbarCastScreenRepository;
import java.util.HashSet;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/castscreen/CastScreenSuppressionService$requestCastActivityConfig$1.class */
public final class CastScreenSuppressionService$requestCastActivityConfig$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final CastScreenSuppressionService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.castscreen.CastScreenSuppressionService$requestCastActivityConfig$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/castscreen/CastScreenSuppressionService$requestCastActivityConfig$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<ProducerScope<? super CastScreenSuppressionService.a>, Continuation<? super Unit>, Object> {
        private Object L$0;
        int label;
        final CastScreenSuppressionService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.castscreen.CastScreenSuppressionService$requestCastActivityConfig$1$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/castscreen/CastScreenSuppressionService$requestCastActivityConfig$1$1$a.class */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ProducerScope<CastScreenSuppressionService.a> f99122a;

            /* JADX WARN: Multi-variable type inference failed */
            public a(ProducerScope<? super CastScreenSuppressionService.a> producerScope) {
                this.f99122a = producerScope;
            }

            public final void a(boolean z6, ProjectionOperationConfig.ProjButtonBubbleConfig projButtonBubbleConfig) {
                this.f99122a.trySend-JP2dKIU(new CastScreenSuppressionService.a.C0953a(z6, projButtonBubbleConfig));
            }

            public final void b(boolean z6, ProjectionOperationConfig.DotConfig dotConfig) {
                this.f99122a.trySend-JP2dKIU(new CastScreenSuppressionService.a.b(z6, dotConfig));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CastScreenSuppressionService castScreenSuppressionService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = castScreenSuppressionService;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(a aVar) {
            Lazy lazy = he0.e.f120842a;
            he0.e.f120845d.clear();
            HashSet<Object> hashSet = he0.e.f120857q;
            if (hashSet.contains(aVar)) {
                hashSet.remove(aVar);
            }
            he0.e.a();
            return Unit.INSTANCE;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(ProducerScope<? super CastScreenSuppressionService.a> producerScope, Continuation<? super Unit> continuation) {
            return create(producerScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                ProducerScope producerScope = (ProducerScope) this.L$0;
                ToolbarCastScreenRepository toolbarCastScreenRepository = this.this$0.f99110c;
                toolbarCastScreenRepository.f103361v.setValue(Boolean.TRUE);
                final a aVar = new a(producerScope);
                Lazy lazy = he0.e.f120842a;
                he0.e.c(this.this$0.f99114g.a(), this.this$0.f99114g.c(), 0L, 0L, this.this$0.f99110c.e(), this.this$0.f99115i, aVar);
                Function0 function0 = new Function0(aVar) { // from class: com.bilibili.ship.theseus.united.page.castscreen.d

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final CastScreenSuppressionService$requestCastActivityConfig$1.AnonymousClass1.a f99146a;

                    {
                        this.f99146a = aVar;
                    }

                    public final Object invoke() {
                        return CastScreenSuppressionService$requestCastActivityConfig$1.AnonymousClass1.invokeSuspend$lambda$0(this.f99146a);
                    }
                };
                this.label = 1;
                if (ProduceKt.awaitClose(producerScope, function0, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/castscreen/CastScreenSuppressionService$requestCastActivityConfig$1$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CastScreenSuppressionService f99123a;

        public a(CastScreenSuppressionService castScreenSuppressionService) {
            this.f99123a = castScreenSuppressionService;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final Object emit(Object obj, Continuation continuation) throws NoWhenBranchMatchedException {
            this.f99123a.f99110c.f((CastScreenSuppressionService.a) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CastScreenSuppressionService$requestCastActivityConfig$1(CastScreenSuppressionService castScreenSuppressionService, Continuation<? super CastScreenSuppressionService$requestCastActivityConfig$1> continuation) {
        super(2, continuation);
        this.this$0 = castScreenSuppressionService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CastScreenSuppressionService$requestCastActivityConfig$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowCallbackFlow = FlowKt.callbackFlow(new AnonymousClass1(this.this$0, null));
            a aVar = new a(this.this$0);
            this.label = 1;
            if (flowCallbackFlow.collect(aVar, this) == coroutine_suspended) {
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
