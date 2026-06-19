package com.bilibili.ship.theseus.ogv.censormark;

import com.bapis.bilibili.pgc.gateway.player.v2.RecordInfo;
import com.bilibili.ship.theseus.united.page.error.OnRenderLayerFloatLayerManager;
import com.bilibili.ship.theseus.united.page.floatlayer.FloatLayerManager;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/censormark/CensorMarkService$run$3.class */
final class CensorMarkService$run$3 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
    final RecordInfo $censorMark;
    boolean Z$0;
    int label;
    final CensorMarkService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.censormark.CensorMarkService$run$3$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/censormark/CensorMarkService$run$3$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final g $vm;
        private Object L$0;
        int label;
        final CensorMarkService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.censormark.CensorMarkService$run$3$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/censormark/CensorMarkService$run$3$1$1.class */
        public static final class C06801 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final g $vm;
            int label;
            final CensorMarkService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06801(CensorMarkService censorMarkService, g gVar, Continuation<? super C06801> continuation) {
                super(2, continuation);
                this.this$0 = censorMarkService;
                this.$vm = gVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06801(this.this$0, this.$vm, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    OnRenderLayerFloatLayerManager onRenderLayerFloatLayerManager = this.this$0.f91677a;
                    b bVar = new b(this.$vm);
                    this.label = 1;
                    if (FloatLayerManager.c(onRenderLayerFloatLayerManager, bVar, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.censormark.CensorMarkService$run$3$1$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/censormark/CensorMarkService$run$3$1$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function3<c.a, Boolean, Continuation<? super Unit>, Object> {
            final g $vm;
            Object L$0;
            boolean Z$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(g gVar, Continuation<? super AnonymousClass2> continuation) {
                super(3, continuation);
                this.$vm = gVar;
            }

            public final Object invoke(c.a aVar, boolean z6, Continuation<? super Unit> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$vm, continuation);
                anonymousClass2.L$0 = aVar;
                anonymousClass2.Z$0 = z6;
                return anonymousClass2.invokeSuspend(Unit.INSTANCE);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((c.a) obj, ((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) obj3);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c.a aVar = (c.a) this.L$0;
                boolean z6 = this.Z$0;
                this.$vm.f91695b.setValue(!aVar.f102987a ? z6 ? CensorMarkUiMode.LandscapeSmall : CensorMarkUiMode.Landscape : aVar.f102988b ? CensorMarkUiMode.PortraitFullscreen : CensorMarkUiMode.HalfScreen);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CensorMarkService censorMarkService, g gVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = censorMarkService;
            this.$vm = gVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$vm, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
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
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C06801(this.this$0, this.$vm, null), 3, (Object) null);
            FlowKt.launchIn(FlowKt.combine(this.this$0.f91678b.c(), this.this$0.f91679c.d, new AnonymousClass2(this.$vm, null)), coroutineScope);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CensorMarkService$run$3(RecordInfo recordInfo, CensorMarkService censorMarkService, Continuation<? super CensorMarkService$run$3> continuation) {
        super(2, continuation);
        this.$censorMark = recordInfo;
        this.this$0 = censorMarkService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CensorMarkService$run$3 censorMarkService$run$3 = new CensorMarkService$run$3(this.$censorMark, this.this$0, continuation);
        censorMarkService$run$3.Z$0 = ((Boolean) obj).booleanValue();
        return censorMarkService$run$3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
    }

    public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
        return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.Z$0) {
                return Unit.INSTANCE;
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, new g(this.$censorMark), null);
            this.label = 1;
            if (CoroutineScopeKt.coroutineScope(anonymousClass1, this) == coroutine_suspended) {
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
