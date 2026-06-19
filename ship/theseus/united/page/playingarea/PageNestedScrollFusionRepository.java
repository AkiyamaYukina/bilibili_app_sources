package com.bilibili.ship.theseus.united.page.playingarea;

import androidx.appcompat.widget.C3259x;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c6.Q;
import com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleRepository;
import com.bilibili.ship.theseus.united.widget.AppBarScrollObserverBehavior;
import com.bilibili.ship.theseus.united.widget.LockableCollapsingToolbarLayout;
import com.bilibili.ship.theseus.united.widget.TheseusAncestorLayout;
import com.google.android.material.appbar.AppBarLayout;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PageNestedScrollFusionRepository.class */
@StabilityInferred(parameters = 0)
public final class PageNestedScrollFusionRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f102250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TheseusPageUIStyleRepository f102251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.a f102252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Flow<c> f102253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Integer> f102254e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final StateFlow<Integer> f102255f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<b> f102256g;

    @NotNull
    public final StateFlow<b> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Integer> f102257i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Integer> f102258j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Boolean> f102259k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<a> f102260l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f102261m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f102262n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f102263o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public Job f102264p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f102265q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f102266r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f102267s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f102268t;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.PageNestedScrollFusionRepository$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PageNestedScrollFusionRepository$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PageNestedScrollFusionRepository this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.PageNestedScrollFusionRepository$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PageNestedScrollFusionRepository$1$1.class */
        public static final class C10841 extends SuspendLambda implements Function2<c, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final PageNestedScrollFusionRepository this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.PageNestedScrollFusionRepository$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PageNestedScrollFusionRepository$1$1$1.class */
            public static final class C10851 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final c $views;
                private Object L$0;
                int label;
                final PageNestedScrollFusionRepository this$0;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.PageNestedScrollFusionRepository$1$1$1$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PageNestedScrollFusionRepository$1$1$1$1.class */
                public static final class C10861 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final c $views;
                    int label;
                    final PageNestedScrollFusionRepository this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C10861(PageNestedScrollFusionRepository pageNestedScrollFusionRepository, c cVar, Continuation<? super C10861> continuation) {
                        super(2, continuation);
                        this.this$0 = pageNestedScrollFusionRepository;
                        this.$views = cVar;
                    }

                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C10861(this.this$0, this.$views, continuation);
                    }

                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object objCollectLatest;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i7 = this.label;
                        if (i7 == 0) {
                            ResultKt.throwOnFailure(obj);
                            PageNestedScrollFusionRepository pageNestedScrollFusionRepository = this.this$0;
                            c cVar = this.$views;
                            TheseusAncestorLayout theseusAncestorLayout = cVar.f102274a;
                            LockableCollapsingToolbarLayout lockableCollapsingToolbarLayout = cVar.f102276c;
                            AppBarLayout appBarLayout = cVar.f102275b;
                            this.label = 1;
                            pageNestedScrollFusionRepository.getClass();
                            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) appBarLayout.getLayoutParams()).getBehavior();
                            if (behavior instanceof AppBarScrollObserverBehavior) {
                                objCollectLatest = FlowKt.collectLatest(pageNestedScrollFusionRepository.f102257i, new PageNestedScrollFusionRepository$collectSpecifiedHeight$2(lockableCollapsingToolbarLayout, appBarLayout, behavior, theseusAncestorLayout, null), this);
                                if (objCollectLatest != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                    objCollectLatest = Unit.INSTANCE;
                                }
                            } else {
                                objCollectLatest = Unit.INSTANCE;
                            }
                            if (objCollectLatest == coroutine_suspended) {
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

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.PageNestedScrollFusionRepository$1$1$1$2, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PageNestedScrollFusionRepository$1$1$1$2.class */
                public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final c $views;
                    int label;
                    final PageNestedScrollFusionRepository this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass2(PageNestedScrollFusionRepository pageNestedScrollFusionRepository, c cVar, Continuation<? super AnonymousClass2> continuation) {
                        super(2, continuation);
                        this.this$0 = pageNestedScrollFusionRepository;
                        this.$views = cVar;
                    }

                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new AnonymousClass2(this.this$0, this.$views, continuation);
                    }

                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i7 = this.label;
                        if (i7 == 0) {
                            ResultKt.throwOnFailure(obj);
                            PageNestedScrollFusionRepository pageNestedScrollFusionRepository = this.this$0;
                            LockableCollapsingToolbarLayout lockableCollapsingToolbarLayout = this.$views.f102276c;
                            this.label = 1;
                            pageNestedScrollFusionRepository.getClass();
                            Object objCollectLatest = FlowKt.collectLatest(pageNestedScrollFusionRepository.f102259k, new PageNestedScrollFusionRepository$collectScrollEnable$2(pageNestedScrollFusionRepository, lockableCollapsingToolbarLayout, null), this);
                            if (objCollectLatest != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                objCollectLatest = Unit.INSTANCE;
                            }
                            if (objCollectLatest == coroutine_suspended) {
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

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.PageNestedScrollFusionRepository$1$1$1$3, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PageNestedScrollFusionRepository$1$1$1$3.class */
                public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final c $views;
                    int label;
                    final PageNestedScrollFusionRepository this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass3(PageNestedScrollFusionRepository pageNestedScrollFusionRepository, c cVar, Continuation<? super AnonymousClass3> continuation) {
                        super(2, continuation);
                        this.this$0 = pageNestedScrollFusionRepository;
                        this.$views = cVar;
                    }

                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new AnonymousClass3(this.this$0, this.$views, continuation);
                    }

                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i7 = this.label;
                        if (i7 == 0) {
                            ResultKt.throwOnFailure(obj);
                            PageNestedScrollFusionRepository pageNestedScrollFusionRepository = this.this$0;
                            LockableCollapsingToolbarLayout lockableCollapsingToolbarLayout = this.$views.f102276c;
                            this.label = 1;
                            pageNestedScrollFusionRepository.getClass();
                            Object objCollectLatest = FlowKt.collectLatest(pageNestedScrollFusionRepository.f102258j, new PageNestedScrollFusionRepository$collectMaxScrollDistance$2(lockableCollapsingToolbarLayout, null), this);
                            if (objCollectLatest != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                objCollectLatest = Unit.INSTANCE;
                            }
                            if (objCollectLatest == coroutine_suspended) {
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

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.PageNestedScrollFusionRepository$1$1$1$4, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PageNestedScrollFusionRepository$1$1$1$4.class */
                public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final c $views;
                    int label;
                    final PageNestedScrollFusionRepository this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass4(PageNestedScrollFusionRepository pageNestedScrollFusionRepository, c cVar, Continuation<? super AnonymousClass4> continuation) {
                        super(2, continuation);
                        this.this$0 = pageNestedScrollFusionRepository;
                        this.$views = cVar;
                    }

                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new AnonymousClass4(this.this$0, this.$views, continuation);
                    }

                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i7 = this.label;
                        if (i7 == 0) {
                            ResultKt.throwOnFailure(obj);
                            PageNestedScrollFusionRepository pageNestedScrollFusionRepository = this.this$0;
                            AppBarLayout appBarLayout = this.$views.f102275b;
                            this.label = 1;
                            pageNestedScrollFusionRepository.getClass();
                            Object objCollectLatest = FlowKt.collectLatest(pageNestedScrollFusionRepository.f102260l, new PageNestedScrollFusionRepository$collectAppBarAction$2(appBarLayout, null), this);
                            if (objCollectLatest != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                objCollectLatest = Unit.INSTANCE;
                            }
                            if (objCollectLatest == coroutine_suspended) {
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

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.PageNestedScrollFusionRepository$1$1$1$5, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PageNestedScrollFusionRepository$1$1$1$5.class */
                public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final c $views;
                    int label;
                    final PageNestedScrollFusionRepository this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass5(PageNestedScrollFusionRepository pageNestedScrollFusionRepository, c cVar, Continuation<? super AnonymousClass5> continuation) {
                        super(2, continuation);
                        this.this$0 = pageNestedScrollFusionRepository;
                        this.$views = cVar;
                    }

                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new AnonymousClass5(this.this$0, this.$views, continuation);
                    }

                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i7 = this.label;
                        if (i7 == 0) {
                            ResultKt.throwOnFailure(obj);
                            PageNestedScrollFusionRepository pageNestedScrollFusionRepository = this.this$0;
                            c cVar = this.$views;
                            this.label = 1;
                            pageNestedScrollFusionRepository.getClass();
                            Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new PageNestedScrollFusionRepository$collectAppBarLayout$2(cVar, pageNestedScrollFusionRepository, null), this);
                            if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                objCoroutineScope = Unit.INSTANCE;
                            }
                            if (objCoroutineScope == coroutine_suspended) {
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

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.PageNestedScrollFusionRepository$1$1$1$6, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PageNestedScrollFusionRepository$1$1$1$6.class */
                public static final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final c $views;
                    int label;
                    final PageNestedScrollFusionRepository this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass6(PageNestedScrollFusionRepository pageNestedScrollFusionRepository, c cVar, Continuation<? super AnonymousClass6> continuation) {
                        super(2, continuation);
                        this.this$0 = pageNestedScrollFusionRepository;
                        this.$views = cVar;
                    }

                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new AnonymousClass6(this.this$0, this.$views, continuation);
                    }

                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i7 = this.label;
                        if (i7 == 0) {
                            ResultKt.throwOnFailure(obj);
                            PageNestedScrollFusionRepository pageNestedScrollFusionRepository = this.this$0;
                            AppBarLayout appBarLayout = this.$views.f102275b;
                            this.label = 1;
                            if (PageNestedScrollFusionRepository.b(pageNestedScrollFusionRepository, appBarLayout, this) == coroutine_suspended) {
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
                public C10851(PageNestedScrollFusionRepository pageNestedScrollFusionRepository, c cVar, Continuation<? super C10851> continuation) {
                    super(2, continuation);
                    this.this$0 = pageNestedScrollFusionRepository;
                    this.$views = cVar;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C10851 c10851 = new C10851(this.this$0, this.$views, continuation);
                    c10851.L$0 = obj;
                    return c10851;
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
                    BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C10861(this.this$0, this.$views, null), 3, (Object) null);
                    BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$views, null), 3, (Object) null);
                    BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, this.$views, null), 3, (Object) null);
                    BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this.this$0, this.$views, null), 3, (Object) null);
                    BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this.this$0, this.$views, null), 3, (Object) null);
                    BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass6(this.this$0, this.$views, null), 3, (Object) null);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10841(PageNestedScrollFusionRepository pageNestedScrollFusionRepository, Continuation<? super C10841> continuation) {
                super(2, continuation);
                this.this$0 = pageNestedScrollFusionRepository;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C10841 c10841 = new C10841(this.this$0, continuation);
                c10841.L$0 = obj;
                return c10841;
            }

            public final Object invoke(c cVar, Continuation<? super Unit> continuation) {
                return create(cVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    c cVar = (c) this.L$0;
                    if (cVar == null) {
                        this.this$0.f102265q.setValue(Boxing.boxBoolean(false));
                        this.this$0.d(b.a.f102271a);
                        this.this$0.f102254e.setValue(0);
                        return Unit.INSTANCE;
                    }
                    C10851 c10851 = new C10851(this.this$0, cVar, null);
                    this.label = 1;
                    if (CoroutineScopeKt.coroutineScope(c10851, this) == coroutine_suspended) {
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
        public AnonymousClass1(PageNestedScrollFusionRepository pageNestedScrollFusionRepository, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = pageNestedScrollFusionRepository;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                PageNestedScrollFusionRepository pageNestedScrollFusionRepository = this.this$0;
                Flow<c> flow = pageNestedScrollFusionRepository.f102253d;
                C10841 c10841 = new C10841(pageNestedScrollFusionRepository, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, c10841, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PageNestedScrollFusionRepository$a.class */
    public interface a {

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.PageNestedScrollFusionRepository$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PageNestedScrollFusionRepository$a$a.class */
        @StabilityInferred(parameters = 1)
        public static final class C1087a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f102269a;

            public C1087a(boolean z6) {
                this.f102269a = z6;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1087a) && this.f102269a == ((C1087a) obj).f102269a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f102269a);
            }

            @NotNull
            public final String toString() {
                return androidx.appcompat.app.i.a(new StringBuilder("Expand(animate="), this.f102269a, ")");
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PageNestedScrollFusionRepository$a$b.class */
        @StabilityInferred(parameters = 1)
        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f102270a;

            public b(boolean z6) {
                this.f102270a = z6;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f102270a == ((b) obj).f102270a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f102270a);
            }

            @NotNull
            public final String toString() {
                return androidx.appcompat.app.i.a(new StringBuilder("Shrink(animate="), this.f102270a, ")");
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PageNestedScrollFusionRepository$b.class */
    public interface b {

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PageNestedScrollFusionRepository$b$a.class */
        @StabilityInferred(parameters = 1)
        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f102271a = new Object();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -704642474;
            }

            @NotNull
            public final String toString() {
                return "Expanded";
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.PageNestedScrollFusionRepository$b$b, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PageNestedScrollFusionRepository$b$b.class */
        @StabilityInferred(parameters = 0)
        public static final class C1088b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final b f102272a;

            public C1088b(@NotNull b bVar) {
                this.f102272a = bVar;
                if (bVar instanceof C1088b) {
                    throw new IllegalArgumentException("PageNestedScroll state next state can't be intermediate");
                }
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1088b) && Intrinsics.areEqual(this.f102272a, ((C1088b) obj).f102272a);
            }

            public final int hashCode() {
                return this.f102272a.hashCode();
            }

            @NotNull
            public final String toString() {
                return "Running(next=" + this.f102272a + ")";
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PageNestedScrollFusionRepository$b$c.class */
        @StabilityInferred(parameters = 1)
        public static final class c implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final c f102273a = new Object();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -182219790;
            }

            @NotNull
            public final String toString() {
                return "Shrunk";
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PageNestedScrollFusionRepository$c.class */
    @StabilityInferred(parameters = 0)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final TheseusAncestorLayout f102274a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final AppBarLayout f102275b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final LockableCollapsingToolbarLayout f102276c;

        public c(@NotNull TheseusAncestorLayout theseusAncestorLayout, @NotNull AppBarLayout appBarLayout, @NotNull LockableCollapsingToolbarLayout lockableCollapsingToolbarLayout) {
            this.f102274a = theseusAncestorLayout;
            this.f102275b = appBarLayout;
            this.f102276c = lockableCollapsingToolbarLayout;
        }
    }

    @Inject
    public PageNestedScrollFusionRepository(@NotNull CoroutineScope coroutineScope, @NotNull TheseusPageUIStyleRepository theseusPageUIStyleRepository, @NotNull com.bilibili.ship.theseus.united.page.playingarea.a aVar, @NotNull Flow<c> flow) {
        this.f102250a = coroutineScope;
        this.f102251b = theseusPageUIStyleRepository;
        this.f102252c = aVar;
        this.f102253d = flow;
        MutableStateFlow<Integer> MutableStateFlow = StateFlowKt.MutableStateFlow(0);
        this.f102254e = MutableStateFlow;
        this.f102255f = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<b> MutableStateFlow2 = StateFlowKt.MutableStateFlow(b.a.f102271a);
        this.f102256g = MutableStateFlow2;
        this.h = FlowKt.asStateFlow(MutableStateFlow2);
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        this.f102257i = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f102258j = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f102259k = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f102260l = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f102261m = -1;
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f102265q = MutableStateFlow3;
        this.f102266r = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<Boolean> MutableStateFlow4 = StateFlowKt.MutableStateFlow(Boolean.TRUE);
        this.f102267s = MutableStateFlow4;
        this.f102268t = FlowKt.asStateFlow(MutableStateFlow4);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.ship.theseus.united.page.playingarea.PageNestedScrollFusionRepository r5, com.google.android.material.appbar.AppBarLayout r6, com.bilibili.ship.theseus.united.page.playingarea.PageNestedScrollFusionRepository.b r7, int r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 549
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.playingarea.PageNestedScrollFusionRepository.a(com.bilibili.ship.theseus.united.page.playingarea.PageNestedScrollFusionRepository, com.google.android.material.appbar.AppBarLayout, com.bilibili.ship.theseus.united.page.playingarea.PageNestedScrollFusionRepository$b, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(com.bilibili.ship.theseus.united.page.playingarea.PageNestedScrollFusionRepository r5, com.google.android.material.appbar.AppBarLayout r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.playingarea.PageNestedScrollFusionRepository.b(com.bilibili.ship.theseus.united.page.playingarea.PageNestedScrollFusionRepository, com.google.android.material.appbar.AppBarLayout, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final b c() {
        return (b) this.f102256g.getValue();
    }

    public final void d(b bVar) {
        this.f102256g.setValue(bVar);
    }

    public final void e(boolean z6, boolean z7) {
        b bVarC = c();
        boolean z8 = this.f102263o;
        StringBuilder sbA = Q.a("set expand: ", ", showAnim: ", " ", z6, z7);
        sbA.append(bVarC);
        sbA.append(" ");
        sbA.append(z8);
        BLog.i("PageNestedScrollFusionRepository-setExpand", "[theseus-united-PageNestedScrollFusionRepository-setExpand] " + sbA.toString());
        if (c() instanceof b.C1088b) {
            return;
        }
        boolean z9 = this.f102263o;
        MutableSharedFlow<a> mutableSharedFlow = this.f102260l;
        if (z9) {
            mutableSharedFlow.tryEmit(z6 ? new a.C1087a(false) : new a.b(false));
            d(z6 ? b.a.f102271a : b.c.f102273a);
            return;
        }
        MutableStateFlow<Integer> mutableStateFlow = this.f102254e;
        if (z6) {
            mutableSharedFlow.tryEmit(new a.C1087a(z7));
            if (((Number) mutableStateFlow.getValue()).intValue() >= 0) {
                d(b.a.f102271a);
            }
        } else {
            mutableSharedFlow.tryEmit(new a.b(z7));
            if (Math.abs(((Number) mutableStateFlow.getValue()).intValue()) >= this.f102261m) {
                d(b.c.f102273a);
            }
        }
        d(z6 ? new b.C1088b(b.a.f102271a) : new b.C1088b(b.c.f102273a));
    }

    public final void f(int i7) {
        BLog.i("PageNestedScrollFusionRepository-setMaxScrollDistance", "[theseus-united-PageNestedScrollFusionRepository-setMaxScrollDistance] " + C3259x.a(i7, "set max scroll distance: "));
        this.f102258j.tryEmit(Integer.valueOf(i7));
        this.f102261m = i7;
    }

    public final void g(boolean z6) {
        BLog.i("PageNestedScrollFusionRepository-setScrollEnabled", "[theseus-united-PageNestedScrollFusionRepository-setScrollEnabled] " + com.bilibili.app.comm.bh.x5.b.a("set scroll enabled: ", z6));
        this.f102259k.tryEmit(Boolean.valueOf(z6));
    }
}
