package com.bilibili.ship.theseus.united.page.toolbar;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/MenuService$createSpeed$2.class */
final class MenuService$createSpeed$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final MutableStateFlow<Integer> $level;
    final List<String> $selects;
    int label;
    final MenuService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.MenuService$createSpeed$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/MenuService$createSpeed$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final MutableStateFlow<Integer> $level;
        final List<String> $selects;
        private Object L$0;
        int label;
        final MenuService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.MenuService$createSpeed$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/MenuService$createSpeed$2$1$1.class */
        public static final class C11251 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final MutableStateFlow<Integer> $level;
            final List<String> $selects;
            int label;
            final MenuService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.MenuService$createSpeed$2$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/MenuService$createSpeed$2$1$1$1.class */
            public static final class C11261 extends SuspendLambda implements Function2<Float, Continuation<? super Unit>, Object> {
                final MutableStateFlow<Integer> $level;
                final List<String> $selects;
                float F$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C11261(MutableStateFlow<Integer> mutableStateFlow, List<String> list, Continuation<? super C11261> continuation) {
                    super(2, continuation);
                    this.$level = mutableStateFlow;
                    this.$selects = list;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C11261 c11261 = new C11261(this.$level, this.$selects, continuation);
                    c11261.F$0 = ((Number) obj).floatValue();
                    return c11261;
                }

                public final Object invoke(float f7, Continuation<? super Unit> continuation) {
                    return create(Float.valueOf(f7), continuation).invokeSuspend(Unit.INSTANCE);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return invoke(((Number) obj).floatValue(), (Continuation<? super Unit>) obj2);
                }

                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.$level.setValue(Boxing.boxInt(this.$selects.indexOf(String.valueOf(this.F$0))));
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11251(MenuService menuService, MutableStateFlow<Integer> mutableStateFlow, List<String> list, Continuation<? super C11251> continuation) {
                super(2, continuation);
                this.this$0 = menuService;
                this.$level = mutableStateFlow;
                this.$selects = list;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C11251(this.this$0, this.$level, this.$selects, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Float> flowF = this.this$0.f103254m.f91108b.f();
                    C11261 c11261 = new C11261(this.$level, this.$selects, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowF, c11261, this) == coroutine_suspended) {
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
        public AnonymousClass1(MenuService menuService, MutableStateFlow<Integer> mutableStateFlow, List<String> list, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = menuService;
            this.$level = mutableStateFlow;
            this.$selects = list;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$level, this.$selects, continuation);
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
            BuildersKt.launch$default((CoroutineScope) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new C11251(this.this$0, this.$level, this.$selects, null), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuService$createSpeed$2(MenuService menuService, MutableStateFlow<Integer> mutableStateFlow, List<String> list, Continuation<? super MenuService$createSpeed$2> continuation) {
        super(1, continuation);
        this.this$0 = menuService;
        this.$level = mutableStateFlow;
        this.$selects = list;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new MenuService$createSpeed$2(this.this$0, this.$level, this.$selects, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$level, this.$selects, null);
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
