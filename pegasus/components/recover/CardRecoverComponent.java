package com.bilibili.pegasus.components.recover;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.pegasus.BasePegasusComponent;
import com.bilibili.pegasus.IPegasusViewModel;
import com.bilibili.pegasus.PegasusHeaderManager;
import com.bilibili.pegasus.PegasusVisibleState;
import j4.t;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import lp0.C7879b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/recover/CardRecoverComponent.class */
@StabilityInferred(parameters = 0)
public final class CardRecoverComponent extends BasePegasusComponent {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public Job f77128m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public Job f77129n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public ComposeView f77130o;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final String f77126k = "CardRecoverComponent";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f77127l = CoroutineScopeKt.MainScope();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f77131p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final c f77132q = new c(this);

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.recover.CardRecoverComponent$onViewCreated$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/recover/CardRecoverComponent$onViewCreated$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CardRecoverComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.recover.CardRecoverComponent$onViewCreated$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/recover/CardRecoverComponent$onViewCreated$1$1.class */
        public static final class C05011 extends SuspendLambda implements Function2<j, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final CardRecoverComponent this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05011(CardRecoverComponent cardRecoverComponent, Continuation<? super C05011> continuation) {
                super(2, continuation);
                this.this$0 = cardRecoverComponent;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C05011 c05011 = new C05011(this.this$0, continuation);
                c05011.L$0 = obj;
                return c05011;
            }

            public final Object invoke(j jVar, Continuation<? super Unit> continuation) {
                return create(jVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                j jVar = (j) this.L$0;
                BLog.i("[Pegasus]CardRecoverComponent", "onViewCreated, receive showTips action cardListSize = " + jVar.f77160b.size() + ", tips = " + jVar.f77159a);
                CardRecoverComponent cardRecoverComponent = this.this$0;
                LifecycleOwner viewLifecycleOwner = cardRecoverComponent.getViewLifecycleOwner();
                Job jobLaunch$default = null;
                if (viewLifecycleOwner != null) {
                    LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner);
                    jobLaunch$default = null;
                    if (lifecycleScope != null) {
                        jobLaunch$default = BuildersKt.launch$default(lifecycleScope, (CoroutineContext) null, (CoroutineStart) null, new CardRecoverComponent$showRecoverTips$1(cardRecoverComponent, jVar, null), 3, (Object) null);
                    }
                }
                cardRecoverComponent.f77128m = jobLaunch$default;
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CardRecoverComponent cardRecoverComponent, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cardRecoverComponent;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            final StateFlow stateAction;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                IPegasusViewModel viewModel = this.this$0.getViewModel();
                if (viewModel != null && (stateAction = viewModel.getStateAction()) != null) {
                    Flow<Object> flow = new Flow<Object>(stateAction) { // from class: com.bilibili.pegasus.components.recover.CardRecoverComponent$onViewCreated$1$invokeSuspend$$inlined$filterIsInstance$1

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final StateFlow f77133a;

                        /* JADX INFO: renamed from: com.bilibili.pegasus.components.recover.CardRecoverComponent$onViewCreated$1$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/recover/CardRecoverComponent$onViewCreated$1$invokeSuspend$$inlined$filterIsInstance$1$2.class */
                        public static final class AnonymousClass2<T> implements FlowCollector {

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final FlowCollector f77134a;

                            /* JADX INFO: renamed from: com.bilibili.pegasus.components.recover.CardRecoverComponent$onViewCreated$1$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/recover/CardRecoverComponent$onViewCreated$1$invokeSuspend$$inlined$filterIsInstance$1$2$1.class */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                Object L$1;
                                int label;
                                Object result;
                                final AnonymousClass2 this$0;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass1(AnonymousClass2 anonymousClass2, Continuation continuation) {
                                    super(continuation);
                                    this.this$0 = anonymousClass2;
                                }

                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return this.this$0.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.f77134a = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                                /*
                                    r5 = this;
                                    r0 = r7
                                    boolean r0 = r0 instanceof com.bilibili.pegasus.components.recover.CardRecoverComponent$onViewCreated$1$invokeSuspend$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1
                                    if (r0 == 0) goto L29
                                    r0 = r7
                                    com.bilibili.pegasus.components.recover.CardRecoverComponent$onViewCreated$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 r0 = (com.bilibili.pegasus.components.recover.CardRecoverComponent$onViewCreated$1$invokeSuspend$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1) r0
                                    r9 = r0
                                    r0 = r9
                                    int r0 = r0.label
                                    r8 = r0
                                    r0 = r8
                                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                                    r0 = r0 & r1
                                    if (r0 == 0) goto L29
                                    r0 = r9
                                    r1 = r8
                                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                    int r1 = r1 + r2
                                    r0.label = r1
                                    r0 = r9
                                    r7 = r0
                                    goto L33
                                L29:
                                    com.bilibili.pegasus.components.recover.CardRecoverComponent$onViewCreated$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 r0 = new com.bilibili.pegasus.components.recover.CardRecoverComponent$onViewCreated$1$invokeSuspend$$inlined$filterIsInstance$1$2$1
                                    r1 = r0
                                    r2 = r5
                                    r3 = r7
                                    r1.<init>(r2, r3)
                                    r7 = r0
                                L33:
                                    r0 = r7
                                    java.lang.Object r0 = r0.result
                                    r9 = r0
                                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                    r10 = r0
                                    r0 = r7
                                    int r0 = r0.label
                                    r8 = r0
                                    r0 = r8
                                    if (r0 == 0) goto L5e
                                    r0 = r8
                                    r1 = 1
                                    if (r0 != r1) goto L54
                                    r0 = r9
                                    kotlin.ResultKt.throwOnFailure(r0)
                                    goto L82
                                L54:
                                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                                    r1 = r0
                                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                                    r1.<init>(r2)
                                    throw r0
                                L5e:
                                    r0 = r9
                                    kotlin.ResultKt.throwOnFailure(r0)
                                    r0 = r6
                                    boolean r0 = r0 instanceof com.bilibili.pegasus.components.recover.j
                                    if (r0 == 0) goto L82
                                    r0 = r7
                                    r1 = 1
                                    r0.label = r1
                                    r0 = r5
                                    kotlinx.coroutines.flow.FlowCollector r0 = r0.f77134a
                                    r1 = r6
                                    r2 = r7
                                    java.lang.Object r0 = r0.emit(r1, r2)
                                    r1 = r10
                                    if (r0 != r1) goto L82
                                    r0 = r10
                                    return r0
                                L82:
                                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                                    return r0
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.recover.CardRecoverComponent$onViewCreated$1$invokeSuspend$$inlined$filterIsInstance$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                            }
                        }

                        {
                            this.f77133a = stateAction;
                        }

                        public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                            Object objCollect = this.f77133a.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    };
                    C05011 c05011 = new C05011(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flow, c05011, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.recover.CardRecoverComponent$onViewCreated$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/recover/CardRecoverComponent$onViewCreated$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CardRecoverComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.recover.CardRecoverComponent$onViewCreated$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/recover/CardRecoverComponent$onViewCreated$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<C7879b, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final CardRecoverComponent this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CardRecoverComponent cardRecoverComponent, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cardRecoverComponent;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(C7879b c7879b, Continuation<? super Unit> continuation) {
                return create(c7879b, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (((C7879b) this.L$0).f123308b) {
                    this.this$0.c("new refresh");
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CardRecoverComponent cardRecoverComponent, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = cardRecoverComponent;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            final StateFlow stateAction;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                IPegasusViewModel viewModel = this.this$0.getViewModel();
                if (viewModel != null && (stateAction = viewModel.getStateAction()) != null) {
                    Flow<Object> flow = new Flow<Object>(stateAction) { // from class: com.bilibili.pegasus.components.recover.CardRecoverComponent$onViewCreated$2$invokeSuspend$$inlined$filterIsInstance$1

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final StateFlow f77135a;

                        /* JADX INFO: renamed from: com.bilibili.pegasus.components.recover.CardRecoverComponent$onViewCreated$2$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/recover/CardRecoverComponent$onViewCreated$2$invokeSuspend$$inlined$filterIsInstance$1$2.class */
                        public static final class AnonymousClass2<T> implements FlowCollector {

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final FlowCollector f77136a;

                            /* JADX INFO: renamed from: com.bilibili.pegasus.components.recover.CardRecoverComponent$onViewCreated$2$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/recover/CardRecoverComponent$onViewCreated$2$invokeSuspend$$inlined$filterIsInstance$1$2$1.class */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                Object L$1;
                                int label;
                                Object result;
                                final AnonymousClass2 this$0;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass1(AnonymousClass2 anonymousClass2, Continuation continuation) {
                                    super(continuation);
                                    this.this$0 = anonymousClass2;
                                }

                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return this.this$0.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.f77136a = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                                /*
                                    r5 = this;
                                    r0 = r7
                                    boolean r0 = r0 instanceof com.bilibili.pegasus.components.recover.CardRecoverComponent$onViewCreated$2$invokeSuspend$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1
                                    if (r0 == 0) goto L29
                                    r0 = r7
                                    com.bilibili.pegasus.components.recover.CardRecoverComponent$onViewCreated$2$invokeSuspend$$inlined$filterIsInstance$1$2$1 r0 = (com.bilibili.pegasus.components.recover.CardRecoverComponent$onViewCreated$2$invokeSuspend$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1) r0
                                    r9 = r0
                                    r0 = r9
                                    int r0 = r0.label
                                    r8 = r0
                                    r0 = r8
                                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                                    r0 = r0 & r1
                                    if (r0 == 0) goto L29
                                    r0 = r9
                                    r1 = r8
                                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                    int r1 = r1 + r2
                                    r0.label = r1
                                    r0 = r9
                                    r7 = r0
                                    goto L33
                                L29:
                                    com.bilibili.pegasus.components.recover.CardRecoverComponent$onViewCreated$2$invokeSuspend$$inlined$filterIsInstance$1$2$1 r0 = new com.bilibili.pegasus.components.recover.CardRecoverComponent$onViewCreated$2$invokeSuspend$$inlined$filterIsInstance$1$2$1
                                    r1 = r0
                                    r2 = r5
                                    r3 = r7
                                    r1.<init>(r2, r3)
                                    r7 = r0
                                L33:
                                    r0 = r7
                                    java.lang.Object r0 = r0.result
                                    r9 = r0
                                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                    r10 = r0
                                    r0 = r7
                                    int r0 = r0.label
                                    r8 = r0
                                    r0 = r8
                                    if (r0 == 0) goto L5e
                                    r0 = r8
                                    r1 = 1
                                    if (r0 != r1) goto L54
                                    r0 = r9
                                    kotlin.ResultKt.throwOnFailure(r0)
                                    goto L82
                                L54:
                                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                                    r1 = r0
                                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                                    r1.<init>(r2)
                                    throw r0
                                L5e:
                                    r0 = r9
                                    kotlin.ResultKt.throwOnFailure(r0)
                                    r0 = r6
                                    boolean r0 = r0 instanceof lp0.C7879b
                                    if (r0 == 0) goto L82
                                    r0 = r7
                                    r1 = 1
                                    r0.label = r1
                                    r0 = r5
                                    kotlinx.coroutines.flow.FlowCollector r0 = r0.f77136a
                                    r1 = r6
                                    r2 = r7
                                    java.lang.Object r0 = r0.emit(r1, r2)
                                    r1 = r10
                                    if (r0 != r1) goto L82
                                    r0 = r10
                                    return r0
                                L82:
                                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                                    return r0
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.recover.CardRecoverComponent$onViewCreated$2$invokeSuspend$$inlined$filterIsInstance$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                            }
                        }

                        {
                            this.f77135a = stateAction;
                        }

                        public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                            Object objCollect = this.f77135a.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    };
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(com.bilibili.pegasus.components.recover.CardRecoverComponent r8, com.bilibili.pegasus.data.config.FlushRecoverConfig r9, int r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.recover.CardRecoverComponent.b(com.bilibili.pegasus.components.recover.CardRecoverComponent, com.bilibili.pegasus.data.config.FlushRecoverConfig, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void c(String str) {
        Job job = this.f77128m;
        if (job == null || !job.isActive()) {
            return;
        }
        BLog.i("[Pegasus]CardRecoverComponent", "onScrollStateChanged, cancelTips, from = ".concat(str));
        Job job2 = this.f77128m;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        this.f77128m = null;
        e();
    }

    public final void d(ViewGroup viewGroup) {
        ComposeView composeView = this.f77130o;
        if (composeView != null) {
            f(composeView);
        }
        for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (Intrinsics.areEqual(childAt.getTag(), "pegasus_recover_tips_view")) {
                f(childAt);
            }
        }
        this.f77130o = null;
    }

    public final void e() {
        t.a("time out to close，hitTipsView  = ", "[Pegasus]CardRecoverComponent", this.f77130o != null);
        if (this.f77130o == null) {
            Fragment fragment = getFragment();
            View view = fragment != null ? fragment.getView() : null;
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup != null) {
                d(viewGroup);
            }
        }
        final ComposeView composeView = this.f77130o;
        if (composeView != null) {
            Job job = this.f77129n;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            int i7 = this.f77131p;
            if (i7 == 1) {
                composeView.animate().alpha(0.0f).setDuration(150L).withEndAction(new Runnable(this, composeView) { // from class: com.bilibili.pegasus.components.recover.a

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final CardRecoverComponent f77148a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final ComposeView f77149b;

                    {
                        this.f77148a = this;
                        this.f77149b = composeView;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f77148a.f(this.f77149b);
                    }
                }).start();
                Job job2 = this.f77129n;
                if (job2 != null) {
                    Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                }
                this.f77129n = BuildersKt.launch$default(this.f77127l, (CoroutineContext) null, (CoroutineStart) null, new CardRecoverComponent$scheduleForceRemove$1(450L, this, composeView, null), 3, (Object) null);
            } else if (i7 == 2) {
                composeView.animate().alpha(0.0f).translationX(composeView.getWidth()).setDuration(100L).withEndAction(new Runnable(this, composeView) { // from class: com.bilibili.pegasus.components.recover.b

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final CardRecoverComponent f77150a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final ComposeView f77151b;

                    {
                        this.f77150a = this;
                        this.f77151b = composeView;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f77150a.f(this.f77151b);
                    }
                }).start();
                Job job3 = this.f77129n;
                if (job3 != null) {
                    Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (Object) null);
                }
                this.f77129n = BuildersKt.launch$default(this.f77127l, (CoroutineContext) null, (CoroutineStart) null, new CardRecoverComponent$scheduleForceRemove$1(400L, this, composeView, null), 3, (Object) null);
            }
        }
        this.f77130o = null;
    }

    public final void f(View view) {
        ViewGroup viewGroup = null;
        this.f77129n = null;
        view.animate().setListener(null);
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        }
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
    }

    @NotNull
    public final String getComponentName() {
        return this.f77126k;
    }

    public final void onDestroy() {
        super.onDestroy();
        CoroutineScopeKt.cancel$default(this.f77127l, (CancellationException) null, 1, (Object) null);
    }

    public final void onDestroyView() {
        super.onDestroyView();
        Job job = this.f77129n;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(this.f77132q);
        }
    }

    public final void onViewCreated(@NotNull View view, @NotNull RecyclerView recyclerView, @NotNull PegasusHeaderManager pegasusHeaderManager) {
        LifecycleCoroutineScope lifecycleScope;
        LifecycleCoroutineScope lifecycleScope2;
        Job job;
        super.onViewCreated(view, recyclerView, pegasusHeaderManager);
        Job job2 = this.f77128m;
        if (job2 != null && job2.isActive() && (job = this.f77128m) != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        if (viewLifecycleOwner != null && (lifecycleScope2 = LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner)) != null) {
            BuildersKt.launch$default(lifecycleScope2, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        }
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        if (viewLifecycleOwner2 != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2)) != null) {
            BuildersKt.launch$default(lifecycleScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        }
        recyclerView.addOnScrollListener(this.f77132q);
    }

    /* JADX INFO: renamed from: onVisibleStateChanged-9haIX0A, reason: not valid java name */
    public final void m8068onVisibleStateChanged9haIX0A(int i7, int i8) {
        super.onVisibleStateChanged-9haIX0A(i7, i8);
        if (PegasusVisibleState.getVisibleInViewPager-impl(i8) && PegasusVisibleState.getVisibleInLifecycle-impl(i8)) {
            return;
        }
        c("onVisibleStateChanged");
    }
}
