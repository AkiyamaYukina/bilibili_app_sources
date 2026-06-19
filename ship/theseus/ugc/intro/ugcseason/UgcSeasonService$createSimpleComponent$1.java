package com.bilibili.ship.theseus.ugc.intro.ugcseason;

import com.bilibili.ship.theseus.united.page.intro.module.season.C6353o;
import com.bilibili.ship.theseus.united.page.intro.module.season.C6354p;
import com.bilibili.ship.theseus.united.page.intro.module.season.C6355q;
import com.bilibili.ship.theseus.united.page.intro.module.season.Z;
import java.util.Iterator;
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
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import lv0.C7893a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcseason/UgcSeasonService$createSimpleComponent$1.class */
final class UgcSeasonService$createSimpleComponent$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final Ref.ObjectRef<j> $bindView;
    final Ref.ObjectRef<String> $count;
    final Ref.ObjectRef<C6353o> $data;
    final C6353o $seasonData;
    int label;
    final UgcSeasonService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcseason.UgcSeasonService$createSimpleComponent$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcseason/UgcSeasonService$createSimpleComponent$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Ref.ObjectRef<j> $bindView;
        final Ref.ObjectRef<String> $count;
        final Ref.ObjectRef<C6353o> $data;
        final C6353o $seasonData;
        private Object L$0;
        int label;
        final UgcSeasonService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcseason.UgcSeasonService$createSimpleComponent$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcseason/UgcSeasonService$createSimpleComponent$1$1$1.class */
        public static final class C08691 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final Ref.ObjectRef<j> $bindView;
            final Ref.ObjectRef<String> $count;
            final Ref.ObjectRef<C6353o> $data;
            int label;
            final UgcSeasonService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcseason.UgcSeasonService$createSimpleComponent$1$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcseason/UgcSeasonService$createSimpleComponent$1$1$1$1.class */
            public static final class C08701 extends SuspendLambda implements Function2<C7893a.C1318a, Continuation<? super Unit>, Object> {
                final Ref.ObjectRef<j> $bindView;
                final Ref.ObjectRef<String> $count;
                final Ref.ObjectRef<C6353o> $data;
                Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C08701(Ref.ObjectRef<j> objectRef, Ref.ObjectRef<C6353o> objectRef2, Ref.ObjectRef<String> objectRef3, Continuation<? super C08701> continuation) {
                    super(2, continuation);
                    this.$bindView = objectRef;
                    this.$data = objectRef2;
                    this.$count = objectRef3;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C08701 c08701 = new C08701(this.$bindView, this.$data, this.$count, continuation);
                    c08701.L$0 = obj;
                    return c08701;
                }

                public final Object invoke(C7893a.C1318a c1318a, Continuation<? super Unit> continuation) {
                    return create(c1318a, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    C7893a.C1318a.C1319a c1319a;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    C7893a.C1318a c1318a = (C7893a.C1318a) this.L$0;
                    if (c1318a == null || (c1319a = c1318a.f123395a) == null) {
                        return Unit.INSTANCE;
                    }
                    UgcSeasonService$createSimpleComponent$1.invokeSuspend$updateCount(this.$data, this.$count, c1319a.f123397a);
                    j jVar = (j) this.$bindView.element;
                    if (jVar != null) {
                        jVar.a();
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08691(UgcSeasonService ugcSeasonService, Ref.ObjectRef<j> objectRef, Ref.ObjectRef<C6353o> objectRef2, Ref.ObjectRef<String> objectRef3, Continuation<? super C08691> continuation) {
                super(2, continuation);
                this.this$0 = ugcSeasonService;
                this.$bindView = objectRef;
                this.$data = objectRef2;
                this.$count = objectRef3;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C08691(this.this$0, this.$bindView, this.$data, this.$count, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<C7893a.C1318a> stateFlow = this.this$0.f97455d.f123393f;
                    C08701 c08701 = new C08701(this.$bindView, this.$data, this.$count, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlow, c08701, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcseason.UgcSeasonService$createSimpleComponent$1$1$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcseason/UgcSeasonService$createSimpleComponent$1$1$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final Ref.ObjectRef<j> $bindView;
            final Ref.ObjectRef<String> $count;
            final Ref.ObjectRef<C6353o> $data;
            final C6353o $seasonData;
            int label;
            final UgcSeasonService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcseason.UgcSeasonService$createSimpleComponent$1$1$2$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcseason/UgcSeasonService$createSimpleComponent$1$1$2$1.class */
            public static final class C08711 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
                final Ref.ObjectRef<j> $bindView;
                final Ref.ObjectRef<String> $count;
                final Ref.ObjectRef<C6353o> $data;
                final C6353o $seasonData;
                boolean Z$0;
                int label;
                final UgcSeasonService this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C08711(Ref.ObjectRef<C6353o> objectRef, C6353o c6353o, UgcSeasonService ugcSeasonService, Ref.ObjectRef<j> objectRef2, Ref.ObjectRef<String> objectRef3, Continuation<? super C08711> continuation) {
                    super(2, continuation);
                    this.$data = objectRef;
                    this.$seasonData = c6353o;
                    this.this$0 = ugcSeasonService;
                    this.$bindView = objectRef2;
                    this.$count = objectRef3;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C08711 c08711 = new C08711(this.$data, this.$seasonData, this.this$0, this.$bindView, this.$count, continuation);
                    c08711.Z$0 = ((Boolean) obj).booleanValue();
                    return c08711;
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
                    boolean z6 = this.Z$0;
                    this.$data.element = z6 ? C6354p.a(this.$seasonData) : this.$seasonData;
                    Ref.ObjectRef<C6353o> objectRef = this.$data;
                    Ref.ObjectRef<String> objectRef2 = this.$count;
                    C7893a.C1318a c1318aC = this.this$0.f97455d.c();
                    UgcSeasonService$createSimpleComponent$1.invokeSuspend$updateCount(objectRef, objectRef2, c1318aC != null ? c1318aC.f123395a.f123397a : 0L);
                    j jVar = (j) this.$bindView.element;
                    if (jVar != null) {
                        jVar.a();
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(UgcSeasonService ugcSeasonService, Ref.ObjectRef<C6353o> objectRef, C6353o c6353o, Ref.ObjectRef<j> objectRef2, Ref.ObjectRef<String> objectRef3, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = ugcSeasonService;
                this.$data = objectRef;
                this.$seasonData = c6353o;
                this.$bindView = objectRef2;
                this.$count = objectRef3;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$data, this.$seasonData, this.$bindView, this.$count, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    UgcSeasonService ugcSeasonService = this.this$0;
                    MutableStateFlow mutableStateFlow = ugcSeasonService.h.f101701b;
                    C08711 c08711 = new C08711(this.$data, this.$seasonData, ugcSeasonService, this.$bindView, this.$count, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(mutableStateFlow, c08711, this) == coroutine_suspended) {
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
        public AnonymousClass1(UgcSeasonService ugcSeasonService, Ref.ObjectRef<j> objectRef, Ref.ObjectRef<C6353o> objectRef2, Ref.ObjectRef<String> objectRef3, C6353o c6353o, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ugcSeasonService;
            this.$bindView = objectRef;
            this.$data = objectRef2;
            this.$count = objectRef3;
            this.$seasonData = c6353o;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$bindView, this.$data, this.$count, this.$seasonData, continuation);
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
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C08691(this.this$0, this.$bindView, this.$data, this.$count, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$data, this.$seasonData, this.$bindView, this.$count, null), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcSeasonService$createSimpleComponent$1(UgcSeasonService ugcSeasonService, Ref.ObjectRef<j> objectRef, Ref.ObjectRef<C6353o> objectRef2, Ref.ObjectRef<String> objectRef3, C6353o c6353o, Continuation<? super UgcSeasonService$createSimpleComponent$1> continuation) {
        super(1, continuation);
        this.this$0 = ugcSeasonService;
        this.$bindView = objectRef;
        this.$data = objectRef2;
        this.$count = objectRef3;
        this.$seasonData = c6353o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$updateCount(Ref.ObjectRef<C6353o> objectRef, Ref.ObjectRef<String> objectRef2, long j7) {
        Object obj = objectRef.element;
        long j8 = ((C6353o) obj).f101672d;
        Iterator<Z> it = ((C6353o) obj).h.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Iterator<C6355q> it2 = it.next().f101648d.iterator();
            int i8 = i7;
            while (true) {
                i7 = i8;
                if (it2.hasNext()) {
                    if (it2.next().f101682b == j7) {
                        objectRef2.element = (i8 + 1) + "/" + j8;
                        return;
                    }
                    i8++;
                }
            }
        }
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new UgcSeasonService$createSimpleComponent$1(this.this$0, this.$bindView, this.$data, this.$count, this.$seasonData, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$bindView, this.$data, this.$count, this.$seasonData, null);
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
