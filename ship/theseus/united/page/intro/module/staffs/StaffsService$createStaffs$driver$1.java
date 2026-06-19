package com.bilibili.ship.theseus.united.page.intro.module.staffs;

import com.bilibili.community.follow.FollowUpperRepository$flowOfFollowUpper$;
import com.bilibili.relation.FollowStateEvent;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/StaffsService$createStaffs$driver$1.class */
final class StaffsService$createStaffs$driver$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final long $upMid;
    int label;
    final StaffsService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.staffs.StaffsService$createStaffs$driver$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/StaffsService$createStaffs$driver$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final long $upMid;
        private Object L$0;
        int label;
        final StaffsService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.staffs.StaffsService$createStaffs$driver$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/StaffsService$createStaffs$driver$1$1$1.class */
        public static final class C10631 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final long $upMid;
            int label;
            final StaffsService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.staffs.StaffsService$createStaffs$driver$1$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/StaffsService$createStaffs$driver$1$1$1$1.class */
            public static final class C10641 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
                final long $upMid;
                Object L$0;
                int label;
                final StaffsService this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C10641(long j7, StaffsService staffsService, Continuation<? super C10641> continuation) {
                    super(2, continuation);
                    this.$upMid = j7;
                    this.this$0 = staffsService;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C10641 c10641 = new C10641(this.$upMid, this.this$0, continuation);
                    c10641.L$0 = obj;
                    return c10641;
                }

                public final Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return create(bool, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Boolean bool = (Boolean) this.L$0;
                    if (bool != null) {
                        long j7 = this.$upMid;
                        StaffsService.b(this.this$0, j7, j7, bool.booleanValue());
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10631(long j7, StaffsService staffsService, Continuation<? super C10631> continuation) {
                super(2, continuation);
                this.$upMid = j7;
                this.this$0 = staffsService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C10631(this.$upMid, this.this$0, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    long j7 = this.$upMid;
                    com.bilibili.community.follow.f fVar = com.bilibili.community.follow.f.a;
                    FollowUpperRepository$flowOfFollowUpper$.inlined.map.1 r02 = new FollowUpperRepository$flowOfFollowUpper$.inlined.map.1(com.bilibili.community.follow.f.c.b(com.bilibili.community.follow.f.f(j7)));
                    C10641 c10641 = new C10641(this.$upMid, this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(r02, c10641, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.staffs.StaffsService$createStaffs$driver$1$1$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/StaffsService$createStaffs$driver$1$1$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final long $upMid;
            int label;
            final StaffsService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.staffs.StaffsService$createStaffs$driver$1$1$2$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/StaffsService$createStaffs$driver$1$1$2$a.class */
            public static final class a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final StaffsService f101858a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final long f101859b;

                public a(StaffsService staffsService, long j7) {
                    this.f101858a = staffsService;
                    this.f101859b = j7;
                }

                public final Object emit(Object obj, Continuation continuation) {
                    FollowStateEvent followStateEvent = (FollowStateEvent) obj;
                    StaffsService.b(this.f101858a, this.f101859b, followStateEvent.getUid(), followStateEvent.isFollow());
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(StaffsService staffsService, long j7, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = staffsService;
                this.$upMid = j7;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$upMid, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowA = com.bilibili.ogv.infra.violet.c.a(FollowStateEvent.class);
                    a aVar = new a(this.this$0, this.$upMid);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(StaffsService staffsService, long j7, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = staffsService;
            this.$upMid = j7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$upMid, continuation);
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
            B b7 = this.this$0.f101826A;
            if (b7 != null) {
                b7.a();
            }
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C10631(this.$upMid, this.this$0, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$upMid, null), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaffsService$createStaffs$driver$1(StaffsService staffsService, long j7, Continuation<? super StaffsService$createStaffs$driver$1> continuation) {
        super(1, continuation);
        this.this$0 = staffsService;
        this.$upMid = j7;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new StaffsService$createStaffs$driver$1(this.this$0, this.$upMid, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$upMid, null);
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
