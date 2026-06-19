package com.bilibili.ship.theseus.ugc.intro.ugcheadline;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bilibili.ship.theseus.united.page.comment.TheseusCommentService;
import kotlin.KotlinNothingValueException;
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
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/UgcHeadlineService$createIntroduction$1.class */
public final class UgcHeadlineService$createIntroduction$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final Ref.ObjectRef<r> $bindView;
    final Ref.IntRef $containerWidth;
    final MutableStateFlow<String> $onlineTextFlow;
    int label;
    final UgcHeadlineService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcHeadlineService$createIntroduction$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/UgcHeadlineService$createIntroduction$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Ref.ObjectRef<r> $bindView;
        final Ref.IntRef $containerWidth;
        final MutableStateFlow<String> $onlineTextFlow;
        private Object L$0;
        int label;
        final UgcHeadlineService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcHeadlineService$createIntroduction$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/UgcHeadlineService$createIntroduction$1$1$1.class */
        public static final class C08551 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final Ref.ObjectRef<r> $bindView;
            final Ref.IntRef $containerWidth;
            int label;
            final UgcHeadlineService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcHeadlineService$createIntroduction$1$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/UgcHeadlineService$createIntroduction$1$1$1$1.class */
            public static final class C08561 extends SuspendLambda implements Function2<TheseusCommentService.e, Continuation<? super Unit>, Object> {
                final Ref.ObjectRef<r> $bindView;
                final Ref.IntRef $containerWidth;
                Object L$0;
                Object L$1;
                int label;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcHeadlineService$createIntroduction$1$1$1$1$a */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/UgcHeadlineService$createIntroduction$1$1$1$1$a.class */
                public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Ref.IntRef f97267a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final ViewGroup f97268b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final Ref.ObjectRef<r> f97269c;

                    public a(Ref.IntRef intRef, ViewGroup viewGroup, Ref.ObjectRef<r> objectRef) {
                        this.f97267a = intRef;
                        this.f97268b = viewGroup;
                        this.f97269c = objectRef;
                    }

                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        if (this.f97267a.element != this.f97268b.getWidth()) {
                            this.f97267a.element = this.f97268b.getWidth();
                            this.f97268b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                            r rVar = (r) this.f97269c.element;
                            if (rVar != null) {
                                rVar.c();
                            }
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C08561(Ref.IntRef intRef, Ref.ObjectRef<r> objectRef, Continuation<? super C08561> continuation) {
                    super(2, continuation);
                    this.$containerWidth = intRef;
                    this.$bindView = objectRef;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C08561 c08561 = new C08561(this.$containerWidth, this.$bindView, continuation);
                    c08561.L$0 = obj;
                    return c08561;
                }

                public final Object invoke(TheseusCommentService.e eVar, Continuation<? super Unit> continuation) {
                    return create(eVar, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) throws Throwable {
                    ViewGroup viewGroup;
                    a aVar;
                    ViewGroup viewGroup2;
                    a aVar2;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i7 = this.label;
                    if (i7 == 0) {
                        ResultKt.throwOnFailure(obj);
                        TheseusCommentService.e eVar = (TheseusCommentService.e) this.L$0;
                        if (eVar == null) {
                            return Unit.INSTANCE;
                        }
                        viewGroup = eVar.f99288a;
                        int width = viewGroup.getWidth();
                        if (width > 0) {
                            this.$containerWidth.element = width;
                            return Unit.INSTANCE;
                        }
                        aVar = new a(this.$containerWidth, viewGroup, this.$bindView);
                        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(aVar);
                        try {
                            this.L$0 = viewGroup;
                            this.L$1 = aVar;
                            this.label = 1;
                            if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } catch (Throwable th) {
                            th = th;
                            viewGroup2 = viewGroup;
                            viewGroup2.getViewTreeObserver().removeOnGlobalLayoutListener(aVar);
                            throw th;
                        }
                    } else {
                        if (i7 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a aVar3 = (a) this.L$1;
                        viewGroup = (ViewGroup) this.L$0;
                        aVar2 = aVar3;
                        viewGroup2 = viewGroup;
                        try {
                            ResultKt.throwOnFailure(obj);
                            aVar = aVar3;
                        } catch (Throwable th2) {
                            aVar = aVar2;
                            th = th2;
                            viewGroup2.getViewTreeObserver().removeOnGlobalLayoutListener(aVar);
                            throw th;
                        }
                    }
                    aVar2 = aVar;
                    viewGroup2 = viewGroup;
                    throw new KotlinNothingValueException();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08551(UgcHeadlineService ugcHeadlineService, Ref.IntRef intRef, Ref.ObjectRef<r> objectRef, Continuation<? super C08551> continuation) {
                super(2, continuation);
                this.this$0 = ugcHeadlineService;
                this.$containerWidth = intRef;
                this.$bindView = objectRef;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C08551(this.this$0, this.$containerWidth, this.$bindView, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<TheseusCommentService.e> flow = this.this$0.f97240c;
                    C08561 c08561 = new C08561(this.$containerWidth, this.$bindView, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flow, c08561, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcHeadlineService$createIntroduction$1$1$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/UgcHeadlineService$createIntroduction$1$1$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final MutableStateFlow<String> $onlineTextFlow;
            int label;
            final UgcHeadlineService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcHeadlineService$createIntroduction$1$1$2$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/UgcHeadlineService$createIntroduction$1$1$2$1.class */
            public static final class C08571 extends SuspendLambda implements Function2<com.bilibili.ship.theseus.united.page.online.b, Continuation<? super Unit>, Object> {
                final MutableStateFlow<String> $onlineTextFlow;
                Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C08571(MutableStateFlow<String> mutableStateFlow, Continuation<? super C08571> continuation) {
                    super(2, continuation);
                    this.$onlineTextFlow = mutableStateFlow;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C08571 c08571 = new C08571(this.$onlineTextFlow, continuation);
                    c08571.L$0 = obj;
                    return c08571;
                }

                public final Object invoke(com.bilibili.ship.theseus.united.page.online.b bVar, Continuation<? super Unit> continuation) {
                    return create(bVar, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.$onlineTextFlow.setValue(((com.bilibili.ship.theseus.united.page.online.b) this.L$0).f102114b);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(UgcHeadlineService ugcHeadlineService, MutableStateFlow<String> mutableStateFlow, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = ugcHeadlineService;
                this.$onlineTextFlow = mutableStateFlow;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$onlineTextFlow, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<com.bilibili.ship.theseus.united.page.online.b> stateFlow = this.this$0.h.f102112e;
                    C08571 c08571 = new C08571(this.$onlineTextFlow, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlow, c08571, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcHeadlineService$createIntroduction$1$1$3, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/UgcHeadlineService$createIntroduction$1$1$3.class */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final Ref.ObjectRef<r> $bindView;
            int label;
            final UgcHeadlineService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcHeadlineService$createIntroduction$1$1$3$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/UgcHeadlineService$createIntroduction$1$1$3$1.class */
            public static final class C08581 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
                final Ref.ObjectRef<r> $bindView;
                boolean Z$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C08581(Ref.ObjectRef<r> objectRef, Continuation<? super C08581> continuation) {
                    super(2, continuation);
                    this.$bindView = objectRef;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C08581 c08581 = new C08581(this.$bindView, continuation);
                    c08581.Z$0 = ((Boolean) obj).booleanValue();
                    return c08581;
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
                    r rVar = (r) this.$bindView.element;
                    if (rVar != null) {
                        rVar.a(z6);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(UgcHeadlineService ugcHeadlineService, Ref.ObjectRef<r> objectRef, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = ugcHeadlineService;
                this.$bindView = objectRef;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, this.$bindView, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<Boolean> stateFlow = this.this$0.f97244g.f97374d;
                    C08581 c08581 = new C08581(this.$bindView, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlow, c08581, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcHeadlineService$createIntroduction$1$1$4, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/UgcHeadlineService$createIntroduction$1$1$4.class */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final Ref.ObjectRef<r> $bindView;
            int label;
            final UgcHeadlineService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcHeadlineService$createIntroduction$1$1$4$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/UgcHeadlineService$createIntroduction$1$1$4$1.class */
            public static final class C08591 extends SuspendLambda implements Function2<com.bilibili.ship.theseus.united.page.intro.module.tags.g, Continuation<? super Unit>, Object> {
                final Ref.ObjectRef<r> $bindView;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C08591(Ref.ObjectRef<r> objectRef, Continuation<? super C08591> continuation) {
                    super(2, continuation);
                    this.$bindView = objectRef;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C08591(this.$bindView, continuation);
                }

                public final Object invoke(com.bilibili.ship.theseus.united.page.intro.module.tags.g gVar, Continuation<? super Unit> continuation) {
                    return create(gVar, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    r rVar = (r) this.$bindView.element;
                    if (rVar != null) {
                        rVar.c();
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(UgcHeadlineService ugcHeadlineService, Ref.ObjectRef<r> objectRef, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = ugcHeadlineService;
                this.$bindView = objectRef;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.this$0, this.$bindView, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    com.bilibili.ship.theseus.united.page.intro.module.tags.i iVar = this.this$0.f97249m;
                    if (iVar.f101977d) {
                        C08591 c08591 = new C08591(this.$bindView, null);
                        this.label = 1;
                        if (FlowKt.collectLatest(iVar.f101976c, c08591, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
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
        public AnonymousClass1(UgcHeadlineService ugcHeadlineService, Ref.IntRef intRef, Ref.ObjectRef<r> objectRef, MutableStateFlow<String> mutableStateFlow, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ugcHeadlineService;
            this.$containerWidth = intRef;
            this.$bindView = objectRef;
            this.$onlineTextFlow = mutableStateFlow;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$containerWidth, this.$bindView, this.$onlineTextFlow, continuation);
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
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C08551(this.this$0, this.$containerWidth, this.$bindView, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$onlineTextFlow, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, this.$bindView, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this.this$0, this.$bindView, null), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcHeadlineService$createIntroduction$1(UgcHeadlineService ugcHeadlineService, Ref.IntRef intRef, Ref.ObjectRef<r> objectRef, MutableStateFlow<String> mutableStateFlow, Continuation<? super UgcHeadlineService$createIntroduction$1> continuation) {
        super(1, continuation);
        this.this$0 = ugcHeadlineService;
        this.$containerWidth = intRef;
        this.$bindView = objectRef;
        this.$onlineTextFlow = mutableStateFlow;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new UgcHeadlineService$createIntroduction$1(this.this$0, this.$containerWidth, this.$bindView, this.$onlineTextFlow, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$containerWidth, this.$bindView, this.$onlineTextFlow, null);
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
