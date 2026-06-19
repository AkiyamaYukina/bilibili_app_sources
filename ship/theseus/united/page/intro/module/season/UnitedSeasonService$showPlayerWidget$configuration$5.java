package com.bilibili.ship.theseus.united.page.intro.module.season;

import com.bilibili.ship.theseus.united.page.videolist.c;
import com.bilibili.ship.theseus.united.page.videolist.m;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonService$showPlayerWidget$configuration$5.class */
final class UnitedSeasonService$showPlayerWidget$configuration$5 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final List<C6353o> $allSeasonData;
    final MutableStateFlow<List<c.a>> $selectsFlow;
    final MutableStateFlow<List<m.a>> $tabsFlow;
    int label;
    final UnitedSeasonService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonService$showPlayerWidget$configuration$5$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonService$showPlayerWidget$configuration$5$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final List<C6353o> $allSeasonData;
        final MutableStateFlow<List<c.a>> $selectsFlow;
        final MutableStateFlow<List<m.a>> $tabsFlow;
        private Object L$0;
        int label;
        final UnitedSeasonService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonService$showPlayerWidget$configuration$5$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonService$showPlayerWidget$configuration$5$1$1.class */
        public static final class C10561 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final List<C6353o> $allSeasonData;
            final MutableStateFlow<List<c.a>> $selectsFlow;
            final MutableStateFlow<List<m.a>> $tabsFlow;
            int label;
            final UnitedSeasonService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonService$showPlayerWidget$configuration$5$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonService$showPlayerWidget$configuration$5$1$1$1.class */
            public static final class C10571 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
                final List<C6353o> $allSeasonData;
                final Ref.BooleanRef $reverse;
                final MutableStateFlow<List<c.a>> $selectsFlow;
                final MutableStateFlow<List<m.a>> $tabsFlow;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C10571(Ref.BooleanRef booleanRef, List<C6353o> list, MutableStateFlow<List<m.a>> mutableStateFlow, MutableStateFlow<List<c.a>> mutableStateFlow2, Continuation<? super C10571> continuation) {
                    super(2, continuation);
                    this.$reverse = booleanRef;
                    this.$allSeasonData = list;
                    this.$tabsFlow = mutableStateFlow;
                    this.$selectsFlow = mutableStateFlow2;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C10571(this.$reverse, this.$allSeasonData, this.$tabsFlow, this.$selectsFlow, continuation);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
                }

                public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                    return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.$reverse.element = !r0.element;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    List<C6353o> list = this.$allSeasonData;
                    Ref.BooleanRef booleanRef = this.$reverse;
                    for (C6353o c6353o : list) {
                        arrayList.addAll(U.b(c6353o, booleanRef.element));
                        arrayList2.addAll(U.a(c6353o, booleanRef.element));
                    }
                    this.$tabsFlow.setValue(arrayList);
                    this.$selectsFlow.setValue(arrayList2);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10561(UnitedSeasonService unitedSeasonService, List<C6353o> list, MutableStateFlow<List<m.a>> mutableStateFlow, MutableStateFlow<List<c.a>> mutableStateFlow2, Continuation<? super C10561> continuation) {
                super(2, continuation);
                this.this$0 = unitedSeasonService;
                this.$allSeasonData = list;
                this.$tabsFlow = mutableStateFlow;
                this.$selectsFlow = mutableStateFlow2;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C10561(this.this$0, this.$allSeasonData, this.$tabsFlow, this.$selectsFlow, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    Ref.BooleanRef booleanRefA = androidx.paging.Y.a(obj);
                    Flow flowDrop = FlowKt.drop(this.this$0.h.f101701b, 1);
                    C10571 c10571 = new C10571(booleanRefA, this.$allSeasonData, this.$tabsFlow, this.$selectsFlow, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDrop, c10571, this) == coroutine_suspended) {
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
        public AnonymousClass1(UnitedSeasonService unitedSeasonService, List<C6353o> list, MutableStateFlow<List<m.a>> mutableStateFlow, MutableStateFlow<List<c.a>> mutableStateFlow2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = unitedSeasonService;
            this.$allSeasonData = list;
            this.$tabsFlow = mutableStateFlow;
            this.$selectsFlow = mutableStateFlow2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$allSeasonData, this.$tabsFlow, this.$selectsFlow, continuation);
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
            BuildersKt.launch$default((CoroutineScope) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new C10561(this.this$0, this.$allSeasonData, this.$tabsFlow, this.$selectsFlow, null), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnitedSeasonService$showPlayerWidget$configuration$5(UnitedSeasonService unitedSeasonService, List<C6353o> list, MutableStateFlow<List<m.a>> mutableStateFlow, MutableStateFlow<List<c.a>> mutableStateFlow2, Continuation<? super UnitedSeasonService$showPlayerWidget$configuration$5> continuation) {
        super(1, continuation);
        this.this$0 = unitedSeasonService;
        this.$allSeasonData = list;
        this.$tabsFlow = mutableStateFlow;
        this.$selectsFlow = mutableStateFlow2;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new UnitedSeasonService$showPlayerWidget$configuration$5(this.this$0, this.$allSeasonData, this.$tabsFlow, this.$selectsFlow, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$allSeasonData, this.$tabsFlow, this.$selectsFlow, null);
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
