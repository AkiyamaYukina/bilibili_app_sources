package com.bilibili.ship.theseus.united.page.intro.module.liveorder;

import com.bilibili.playerbizcommon.live.VideoLiveStateMessage;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/liveorder/DetailReserveService$create$4.class */
public final class DetailReserveService$create$4 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final f $data;
    final MutableStateFlow<Boolean> $followStateFlow;
    int label;
    final DetailReserveService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.liveorder.DetailReserveService$create$4$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/liveorder/DetailReserveService$create$4$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final f $data;
        final MutableStateFlow<Boolean> $followStateFlow;
        private Object L$0;
        int label;
        final DetailReserveService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.liveorder.DetailReserveService$create$4$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/liveorder/DetailReserveService$create$4$1$1.class */
        public static final class C10211 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final f $data;
            final MutableStateFlow<Boolean> $followStateFlow;
            int label;
            final DetailReserveService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.liveorder.DetailReserveService$create$4$1$1$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/liveorder/DetailReserveService$create$4$1$1$a.class */
            public static final class a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final f f100500a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final MutableStateFlow<Boolean> f100501b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final DetailReserveService f100502c;

                public a(f fVar, MutableStateFlow<Boolean> mutableStateFlow, DetailReserveService detailReserveService) {
                    this.f100500a = fVar;
                    this.f100501b = mutableStateFlow;
                    this.f100502c = detailReserveService;
                }

                public final Object emit(Object obj, Continuation continuation) {
                    VideoLiveStateMessage videoLiveStateMessage = (VideoLiveStateMessage) obj;
                    long sid = videoLiveStateMessage.getSid();
                    f fVar = this.f100500a;
                    if (sid == fVar.f100516a) {
                        fVar.f100519d = videoLiveStateMessage.isReserved();
                        this.f100501b.setValue(Boxing.boxBoolean(videoLiveStateMessage.isReserved()));
                        DetailReserveService.b(fVar, this.f100502c, false);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10211(f fVar, MutableStateFlow<Boolean> mutableStateFlow, DetailReserveService detailReserveService, Continuation<? super C10211> continuation) {
                super(2, continuation);
                this.$data = fVar;
                this.$followStateFlow = mutableStateFlow;
                this.this$0 = detailReserveService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C10211(this.$data, this.$followStateFlow, this.this$0, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowB = com.bilibili.ogv.infra.violet.c.b(Reflection.getOrCreateKotlinClass(VideoLiveStateMessage.class));
                    a aVar = new a(this.$data, this.$followStateFlow, this.this$0);
                    this.label = 1;
                    if (flowB.collect(aVar, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.liveorder.DetailReserveService$create$4$1$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/liveorder/DetailReserveService$create$4$1$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final f $data;
            int label;
            final DetailReserveService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(DetailReserveService detailReserveService, f fVar, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = detailReserveService;
                this.$data = fVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$data, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    DetailReserveService detailReserveService = this.this$0;
                    f fVar = this.$data;
                    this.label = 1;
                    detailReserveService.getClass();
                    Object objCollect = FlowKt.distinctUntilChanged(com.bilibili.ogv.infra.violet.c.b(Reflection.getOrCreateKotlinClass(VideoLiveStateMessage.class))).collect(new k(fVar, detailReserveService), this);
                    if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objCollect = Unit.INSTANCE;
                    }
                    if (objCollect == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(f fVar, MutableStateFlow<Boolean> mutableStateFlow, DetailReserveService detailReserveService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$data = fVar;
            this.$followStateFlow = mutableStateFlow;
            this.this$0 = detailReserveService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$data, this.$followStateFlow, this.this$0, continuation);
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
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C10211(this.$data, this.$followStateFlow, this.this$0, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$data, null), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailReserveService$create$4(f fVar, MutableStateFlow<Boolean> mutableStateFlow, DetailReserveService detailReserveService, Continuation<? super DetailReserveService$create$4> continuation) {
        super(1, continuation);
        this.$data = fVar;
        this.$followStateFlow = mutableStateFlow;
        this.this$0 = detailReserveService;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new DetailReserveService$create$4(this.$data, this.$followStateFlow, this.this$0, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$data, this.$followStateFlow, this.this$0, null);
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
