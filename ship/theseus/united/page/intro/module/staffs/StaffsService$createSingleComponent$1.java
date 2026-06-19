package com.bilibili.ship.theseus.united.page.intro.module.staffs;

import com.bilibili.community.follow.FollowUpperRepository$flowOfFollowUpper$;
import com.bilibili.relation.FollowStateManager;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/StaffsService$createSingleComponent$1.class */
final class StaffsService$createSingleComponent$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final Ref.ObjectRef<InterfaceC6365b> $bindView;
    final H $followStateChangeListener;
    final Staff $staff;
    int label;
    final StaffsService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.staffs.StaffsService$createSingleComponent$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/StaffsService$createSingleComponent$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Ref.ObjectRef<InterfaceC6365b> $bindView;
        final H $followStateChangeListener;
        final Staff $staff;
        private Object L$0;
        int label;
        final StaffsService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.staffs.StaffsService$createSingleComponent$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/StaffsService$createSingleComponent$1$1$1.class */
        public static final class C10611 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final Ref.ObjectRef<InterfaceC6365b> $bindView;
            final Staff $staff;
            int label;
            final StaffsService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.staffs.StaffsService$createSingleComponent$1$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/StaffsService$createSingleComponent$1$1$1$1.class */
            public static final class C10621 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
                final Ref.ObjectRef<InterfaceC6365b> $bindView;
                final Staff $staff;
                Object L$0;
                int label;
                final StaffsService this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C10621(Staff staff, StaffsService staffsService, Ref.ObjectRef<InterfaceC6365b> objectRef, Continuation<? super C10621> continuation) {
                    super(2, continuation);
                    this.$staff = staff;
                    this.this$0 = staffsService;
                    this.$bindView = objectRef;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C10621 c10621 = new C10621(this.$staff, this.this$0, this.$bindView, continuation);
                    c10621.L$0 = obj;
                    return c10621;
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
                        Staff staff = this.$staff;
                        StaffsService.a(staff, this.this$0, this.$bindView, staff.f101786a, Boxing.boxBoolean(bool.booleanValue()));
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10611(Staff staff, StaffsService staffsService, Ref.ObjectRef<InterfaceC6365b> objectRef, Continuation<? super C10611> continuation) {
                super(2, continuation);
                this.$staff = staff;
                this.this$0 = staffsService;
                this.$bindView = objectRef;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C10611(this.$staff, this.this$0, this.$bindView, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    long j7 = this.$staff.f101786a;
                    com.bilibili.community.follow.f fVar = com.bilibili.community.follow.f.a;
                    FollowUpperRepository$flowOfFollowUpper$.inlined.map.1 r02 = new FollowUpperRepository$flowOfFollowUpper$.inlined.map.1(com.bilibili.community.follow.f.c.b(com.bilibili.community.follow.f.f(j7)));
                    C10621 c10621 = new C10621(this.$staff, this.this$0, this.$bindView, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(r02, c10621, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.staffs.StaffsService$createSingleComponent$1$1$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/StaffsService$createSingleComponent$1$1$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final H $followStateChangeListener;
            final Staff $staff;
            int label;
            final StaffsService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(StaffsService staffsService, Staff staff, H h, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = staffsService;
                this.$staff = staff;
                this.$followStateChangeListener = h;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$staff, this.$followStateChangeListener, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                try {
                    if (i7 == 0) {
                        ResultKt.throwOnFailure(obj);
                        StaffsService staffsService = this.this$0;
                        Staff staff = this.$staff;
                        H h = this.$followStateChangeListener;
                        long j7 = staff.f101786a;
                        long j8 = staff.f101786a;
                        if (j7 > 0) {
                            FollowStateManager.Companion.getInstance().unregister(j8, h);
                        }
                        if (staffsService.f101836e.f() > 0) {
                            FollowStateManager.Companion.getInstance().register(j8, h);
                        }
                        this.label = 1;
                        if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i7 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    throw new KotlinNothingValueException();
                } catch (Throwable th) {
                    Staff staff2 = this.$staff;
                    H h7 = this.$followStateChangeListener;
                    if (staff2.f101786a > 0) {
                        FollowStateManager.Companion.getInstance().unregister(staff2.f101786a, h7);
                    }
                    throw th;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(StaffsService staffsService, Staff staff, Ref.ObjectRef<InterfaceC6365b> objectRef, H h, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = staffsService;
            this.$staff = staff;
            this.$bindView = objectRef;
            this.$followStateChangeListener = h;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$staff, this.$bindView, this.$followStateChangeListener, continuation);
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
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C10611(this.$staff, this.this$0, this.$bindView, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$staff, this.$followStateChangeListener, null), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaffsService$createSingleComponent$1(StaffsService staffsService, Staff staff, Ref.ObjectRef<InterfaceC6365b> objectRef, H h, Continuation<? super StaffsService$createSingleComponent$1> continuation) {
        super(1, continuation);
        this.this$0 = staffsService;
        this.$staff = staff;
        this.$bindView = objectRef;
        this.$followStateChangeListener = h;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new StaffsService$createSingleComponent$1(this.this$0, this.$staff, this.$bindView, this.$followStateChangeListener, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$staff, this.$bindView, this.$followStateChangeListener, null);
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
