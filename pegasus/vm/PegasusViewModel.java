package com.bilibili.pegasus.vm;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bilibili.lib.homepage.splash.SplashViewModel;
import com.bilibili.pegasus.Action;
import com.bilibili.pegasus.IPegasusViewModel;
import com.bilibili.pegasus.PegasusHolderData;
import com.bilibili.pegasus.Store;
import com.bilibili.pegasus.components.InterfaceC5637s;
import com.bilibili.pegasus.components.l0;
import com.bilibili.pegasus.data.ToastConfig;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import com.bilibili.pegasus.data.request.PegasusFlush;
import dp0.C6828a;
import java.util.List;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import mp0.C8026a;
import mp0.C8028c;
import mp0.InterfaceC8027b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/vm/PegasusViewModel.class */
@StabilityInferred(parameters = 0)
public final class PegasusViewModel extends ViewModel implements Store<C8028c>, IPegasusViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.bilibili.pegasus.request.i f79009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<com.bilibili.pegasus.d> f79010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<C8028c> f79011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final v f79012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Action> f79013e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Action> f79014f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Action> f79015g;

    @NotNull
    public final StateFlow<Action> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public lp0.c f79016i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public n f79017j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public Deferred<? extends Action> f79018k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public lp0.c f79019l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final StateFlow<C8028c> f79020m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Flow<C8026a> f79021n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final PegasusViewModel$special$$inlined$map$2 f79022o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Flow<InterfaceC8027b> f79023p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final Flow<Boolean> f79024q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final Flow<Boolean> f79025r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final Flow<Boolean> f79026s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final StateFlow<C6828a> f79027t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final StateFlow<ToastConfig> f79028u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final StateFlow<InterestChoose> f79029v;

    /* JADX WARN: Type inference failed for: r1v11, types: [com.bilibili.pegasus.vm.v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v24, types: [com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$2] */
    @Inject
    public PegasusViewModel(@NotNull com.bilibili.pegasus.request.i iVar, @NotNull InterfaceC5637s interfaceC5637s) {
        this.f79009a = iVar;
        this.f79010b = CollectionsKt.plus(CollectionsKt.plus(CollectionsKt.plus(super.D(), new Object()), new com.bilibili.pegasus.components.customreporter.e(this)), interfaceC5637s.a(iVar, new Kd.a(this, 2)));
        final MutableStateFlow<C8028c> MutableStateFlow = StateFlowKt.MutableStateFlow(new C8028c(0));
        this.f79011c = MutableStateFlow;
        this.f79012d = new Object();
        MutableSharedFlow<Action> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, (BufferOverflow) null, 4, (Object) null);
        this.f79013e = mutableSharedFlowMutableSharedFlow$default;
        this.f79014f = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableStateFlow<Action> MutableStateFlow2 = StateFlowKt.MutableStateFlow((Object) null);
        this.f79015g = MutableStateFlow2;
        this.h = FlowKt.asStateFlow(MutableStateFlow2);
        this.f79016i = new lp0.c(false, null, 0, 0, 8191);
        this.f79020m = FlowKt.asStateFlow(MutableStateFlow);
        final Flow<C8026a> flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<C8026a>(MutableStateFlow) { // from class: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MutableStateFlow f79030a;

            /* JADX INFO: renamed from: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/vm/PegasusViewModel$special$$inlined$map$1$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f79031a;

                /* JADX INFO: renamed from: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/vm/PegasusViewModel$special$$inlined$map$1$2$1.class */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
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
                    this.f79031a = flowCollector;
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
                        boolean r0 = r0 instanceof com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L29
                        r0 = r7
                        com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$1$2$1 r0 = (com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
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
                        com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$1$2$1 r0 = new com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$1$2$1
                        r1 = r0
                        r2 = r5
                        r3 = r7
                        r1.<init>(r2, r3)
                        r7 = r0
                    L33:
                        r0 = r7
                        java.lang.Object r0 = r0.result
                        r10 = r0
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        r9 = r0
                        r0 = r7
                        int r0 = r0.label
                        r8 = r0
                        r0 = r8
                        if (r0 == 0) goto L5e
                        r0 = r8
                        r1 = 1
                        if (r0 != r1) goto L54
                        r0 = r10
                        kotlin.ResultKt.throwOnFailure(r0)
                        goto L83
                    L54:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        r1 = r0
                        java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r2)
                        throw r0
                    L5e:
                        r0 = r10
                        kotlin.ResultKt.throwOnFailure(r0)
                        r0 = r6
                        mp0.c r0 = (mp0.C8028c) r0
                        mp0.a r0 = r0.f123831a
                        r6 = r0
                        r0 = r7
                        r1 = 1
                        r0.label = r1
                        r0 = r5
                        kotlinx.coroutines.flow.FlowCollector r0 = r0.f79031a
                        r1 = r6
                        r2 = r7
                        java.lang.Object r0 = r0.emit(r1, r2)
                        r1 = r9
                        if (r0 != r1) goto L83
                        r0 = r9
                        return r0
                    L83:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f79030a = MutableStateFlow;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f79030a.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
        this.f79021n = flowDistinctUntilChanged;
        this.f79022o = new Flow<List<? extends PegasusHolderData>>(flowDistinctUntilChanged) { // from class: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$2

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Flow f79032a;

            /* JADX INFO: renamed from: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$2$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/vm/PegasusViewModel$special$$inlined$map$2$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f79033a;

                /* JADX INFO: renamed from: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$2$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/vm/PegasusViewModel$special$$inlined$map$2$2$1.class */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
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
                    this.f79033a = flowCollector;
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
                        boolean r0 = r0 instanceof com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L29
                        r0 = r7
                        com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$2$2$1 r0 = (com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
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
                        com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$2$2$1 r0 = new com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$2$2$1
                        r1 = r0
                        r2 = r5
                        r3 = r7
                        r1.<init>(r2, r3)
                        r7 = r0
                    L33:
                        r0 = r7
                        java.lang.Object r0 = r0.result
                        r10 = r0
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        r9 = r0
                        r0 = r7
                        int r0 = r0.label
                        r8 = r0
                        r0 = r8
                        if (r0 == 0) goto L5e
                        r0 = r8
                        r1 = 1
                        if (r0 != r1) goto L54
                        r0 = r10
                        kotlin.ResultKt.throwOnFailure(r0)
                        goto L83
                    L54:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        r1 = r0
                        java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r2)
                        throw r0
                    L5e:
                        r0 = r10
                        kotlin.ResultKt.throwOnFailure(r0)
                        r0 = r6
                        mp0.a r0 = (mp0.C8026a) r0
                        java.util.List<com.bilibili.pegasus.PegasusHolderData> r0 = r0.f123826a
                        r6 = r0
                        r0 = r7
                        r1 = 1
                        r0.label = r1
                        r0 = r5
                        kotlinx.coroutines.flow.FlowCollector r0 = r0.f79033a
                        r1 = r6
                        r2 = r7
                        java.lang.Object r0 = r0.emit(r1, r2)
                        r1 = r9
                        if (r0 != r1) goto L83
                        r0 = r9
                        return r0
                    L83:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f79032a = flowDistinctUntilChanged;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f79032a.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        this.f79023p = FlowKt.distinctUntilChanged(new Flow<InterfaceC8027b>(MutableStateFlow) { // from class: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$3

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MutableStateFlow f79034a;

            /* JADX INFO: renamed from: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$3$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/vm/PegasusViewModel$special$$inlined$map$3$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f79035a;

                /* JADX INFO: renamed from: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$3$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/vm/PegasusViewModel$special$$inlined$map$3$2$1.class */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
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
                    this.f79035a = flowCollector;
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
                        boolean r0 = r0 instanceof com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$3.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L29
                        r0 = r7
                        com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$3$2$1 r0 = (com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$3.AnonymousClass2.AnonymousClass1) r0
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
                        com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$3$2$1 r0 = new com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$3$2$1
                        r1 = r0
                        r2 = r5
                        r3 = r7
                        r1.<init>(r2, r3)
                        r7 = r0
                    L33:
                        r0 = r7
                        java.lang.Object r0 = r0.result
                        r10 = r0
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        r9 = r0
                        r0 = r7
                        int r0 = r0.label
                        r8 = r0
                        r0 = r8
                        if (r0 == 0) goto L5e
                        r0 = r8
                        r1 = 1
                        if (r0 != r1) goto L54
                        r0 = r10
                        kotlin.ResultKt.throwOnFailure(r0)
                        goto L83
                    L54:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        r1 = r0
                        java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r2)
                        throw r0
                    L5e:
                        r0 = r10
                        kotlin.ResultKt.throwOnFailure(r0)
                        r0 = r6
                        mp0.c r0 = (mp0.C8028c) r0
                        mp0.b r0 = r0.f123833c
                        r6 = r0
                        r0 = r7
                        r1 = 1
                        r0.label = r1
                        r0 = r5
                        kotlinx.coroutines.flow.FlowCollector r0 = r0.f79035a
                        r1 = r6
                        r2 = r7
                        java.lang.Object r0 = r0.emit(r1, r2)
                        r1 = r9
                        if (r0 != r1) goto L83
                        r0 = r9
                        return r0
                    L83:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$3.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f79034a = MutableStateFlow;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f79034a.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
        this.f79024q = FlowKt.distinctUntilChanged(new Flow<Boolean>(flowDistinctUntilChanged) { // from class: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$4

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Flow f79036a;

            /* JADX INFO: renamed from: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$4$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/vm/PegasusViewModel$special$$inlined$map$4$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f79037a;

                /* JADX INFO: renamed from: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$4$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/vm/PegasusViewModel$special$$inlined$map$4$2$1.class */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
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
                    this.f79037a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                    /*
                        Method dump skipped, instruction units count: 233
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$4.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f79036a = flowDistinctUntilChanged;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f79036a.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
        this.f79025r = FlowKt.distinctUntilChanged(new Flow<Boolean>(MutableStateFlow) { // from class: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$5

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MutableStateFlow f79038a;

            /* JADX INFO: renamed from: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$5$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/vm/PegasusViewModel$special$$inlined$map$5$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f79039a;

                /* JADX INFO: renamed from: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$5$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/vm/PegasusViewModel$special$$inlined$map$5$2$1.class */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
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
                    this.f79039a = flowCollector;
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
                        boolean r0 = r0 instanceof com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$5.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L29
                        r0 = r7
                        com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$5$2$1 r0 = (com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$5.AnonymousClass2.AnonymousClass1) r0
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
                        com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$5$2$1 r0 = new com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$5$2$1
                        r1 = r0
                        r2 = r5
                        r3 = r7
                        r1.<init>(r2, r3)
                        r7 = r0
                    L33:
                        r0 = r7
                        java.lang.Object r0 = r0.result
                        r10 = r0
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        r9 = r0
                        r0 = r7
                        int r0 = r0.label
                        r8 = r0
                        r0 = r8
                        if (r0 == 0) goto L5e
                        r0 = r8
                        r1 = 1
                        if (r0 != r1) goto L54
                        r0 = r10
                        kotlin.ResultKt.throwOnFailure(r0)
                        goto L86
                    L54:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        r1 = r0
                        java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r2)
                        throw r0
                    L5e:
                        r0 = r10
                        kotlin.ResultKt.throwOnFailure(r0)
                        r0 = r6
                        mp0.c r0 = (mp0.C8028c) r0
                        boolean r0 = r0.f123832b
                        java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
                        r6 = r0
                        r0 = r7
                        r1 = 1
                        r0.label = r1
                        r0 = r5
                        kotlinx.coroutines.flow.FlowCollector r0 = r0.f79039a
                        r1 = r6
                        r2 = r7
                        java.lang.Object r0 = r0.emit(r1, r2)
                        r1 = r9
                        if (r0 != r1) goto L86
                        r0 = r9
                        return r0
                    L86:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$5.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f79038a = MutableStateFlow;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f79038a.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
        this.f79026s = FlowKt.distinctUntilChanged(new Flow<Boolean>(MutableStateFlow) { // from class: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$6

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MutableStateFlow f79040a;

            /* JADX INFO: renamed from: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$6$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/vm/PegasusViewModel$special$$inlined$map$6$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f79041a;

                /* JADX INFO: renamed from: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$6$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/vm/PegasusViewModel$special$$inlined$map$6$2$1.class */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
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
                    this.f79041a = flowCollector;
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
                        boolean r0 = r0 instanceof com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$6.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L29
                        r0 = r7
                        com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$6$2$1 r0 = (com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$6.AnonymousClass2.AnonymousClass1) r0
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
                        com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$6$2$1 r0 = new com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$6$2$1
                        r1 = r0
                        r2 = r5
                        r3 = r7
                        r1.<init>(r2, r3)
                        r7 = r0
                    L33:
                        r0 = r7
                        java.lang.Object r0 = r0.result
                        r10 = r0
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        r9 = r0
                        r0 = r7
                        int r0 = r0.label
                        r8 = r0
                        r0 = r8
                        if (r0 == 0) goto L5e
                        r0 = r8
                        r1 = 1
                        if (r0 != r1) goto L54
                        r0 = r10
                        kotlin.ResultKt.throwOnFailure(r0)
                        goto L86
                    L54:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        r1 = r0
                        java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r2)
                        throw r0
                    L5e:
                        r0 = r10
                        kotlin.ResultKt.throwOnFailure(r0)
                        r0 = r6
                        mp0.c r0 = (mp0.C8028c) r0
                        boolean r0 = r0.d()
                        java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
                        r6 = r0
                        r0 = r7
                        r1 = 1
                        r0.label = r1
                        r0 = r5
                        kotlinx.coroutines.flow.FlowCollector r0 = r0.f79041a
                        r1 = r6
                        r2 = r7
                        java.lang.Object r0 = r0.emit(r1, r2)
                        r1 = r9
                        if (r0 != r1) goto L86
                        r0 = r9
                        return r0
                    L86:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$6.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f79040a = MutableStateFlow;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f79040a.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
        Flow flowDistinctUntilChanged2 = FlowKt.distinctUntilChanged(new Flow<C6828a>(MutableStateFlow) { // from class: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$7

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MutableStateFlow f79042a;

            /* JADX INFO: renamed from: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$7$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/vm/PegasusViewModel$special$$inlined$map$7$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f79043a;

                /* JADX INFO: renamed from: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$7$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/vm/PegasusViewModel$special$$inlined$map$7$2$1.class */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
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
                    this.f79043a = flowCollector;
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
                        boolean r0 = r0 instanceof com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$7.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L29
                        r0 = r7
                        com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$7$2$1 r0 = (com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$7.AnonymousClass2.AnonymousClass1) r0
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
                        com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$7$2$1 r0 = new com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$7$2$1
                        r1 = r0
                        r2 = r5
                        r3 = r7
                        r1.<init>(r2, r3)
                        r7 = r0
                    L33:
                        r0 = r7
                        java.lang.Object r0 = r0.result
                        r10 = r0
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        r9 = r0
                        r0 = r7
                        int r0 = r0.label
                        r8 = r0
                        r0 = r8
                        if (r0 == 0) goto L5e
                        r0 = r8
                        r1 = 1
                        if (r0 != r1) goto L54
                        r0 = r10
                        kotlin.ResultKt.throwOnFailure(r0)
                        goto L92
                    L54:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        r1 = r0
                        java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r2)
                        throw r0
                    L5e:
                        r0 = r10
                        kotlin.ResultKt.throwOnFailure(r0)
                        r0 = r6
                        mp0.c r0 = (mp0.C8028c) r0
                        dp0.a r0 = r0.f123834d
                        r10 = r0
                        r0 = 0
                        r6 = r0
                        r0 = r10
                        if (r0 == 0) goto L7a
                        r0 = r10
                        r1 = 0
                        dp0.a r0 = dp0.C6828a.a(r0, r1)
                        r6 = r0
                    L7a:
                        r0 = r7
                        r1 = 1
                        r0.label = r1
                        r0 = r5
                        kotlinx.coroutines.flow.FlowCollector r0 = r0.f79043a
                        r1 = r6
                        r2 = r7
                        java.lang.Object r0 = r0.emit(r1, r2)
                        r1 = r9
                        if (r0 != r1) goto L92
                        r0 = r9
                        return r0
                    L92:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$7.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f79042a = MutableStateFlow;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f79042a.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
        CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        this.f79027t = FlowKt.stateIn(flowDistinctUntilChanged2, viewModelScope, companion.getEagerly(), (Object) null);
        this.f79028u = FlowKt.stateIn(new Flow<ToastConfig>(MutableStateFlow) { // from class: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$8

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MutableStateFlow f79044a;

            /* JADX INFO: renamed from: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$8$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/vm/PegasusViewModel$special$$inlined$map$8$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f79045a;

                /* JADX INFO: renamed from: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$8$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/vm/PegasusViewModel$special$$inlined$map$8$2$1.class */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
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
                    this.f79045a = flowCollector;
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
                        boolean r0 = r0 instanceof com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$8.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L29
                        r0 = r7
                        com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$8$2$1 r0 = (com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$8.AnonymousClass2.AnonymousClass1) r0
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
                        com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$8$2$1 r0 = new com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$8$2$1
                        r1 = r0
                        r2 = r5
                        r3 = r7
                        r1.<init>(r2, r3)
                        r7 = r0
                    L33:
                        r0 = r7
                        java.lang.Object r0 = r0.result
                        r10 = r0
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        r9 = r0
                        r0 = r7
                        int r0 = r0.label
                        r8 = r0
                        r0 = r8
                        if (r0 == 0) goto L5e
                        r0 = r8
                        r1 = 1
                        if (r0 != r1) goto L54
                        r0 = r10
                        kotlin.ResultKt.throwOnFailure(r0)
                        goto L91
                    L54:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        r1 = r0
                        java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r2)
                        throw r0
                    L5e:
                        r0 = r10
                        kotlin.ResultKt.throwOnFailure(r0)
                        r0 = r6
                        mp0.c r0 = (mp0.C8028c) r0
                        dp0.a r0 = r0.f123834d
                        r6 = r0
                        r0 = r6
                        if (r0 == 0) goto L77
                        r0 = r6
                        com.bilibili.pegasus.data.ToastConfig r0 = r0.L()
                        r6 = r0
                        goto L79
                    L77:
                        r0 = 0
                        r6 = r0
                    L79:
                        r0 = r7
                        r1 = 1
                        r0.label = r1
                        r0 = r5
                        kotlinx.coroutines.flow.FlowCollector r0 = r0.f79045a
                        r1 = r6
                        r2 = r7
                        java.lang.Object r0 = r0.emit(r1, r2)
                        r1 = r9
                        if (r0 != r1) goto L91
                        r0 = r9
                        return r0
                    L91:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$8.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f79044a = MutableStateFlow;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f79044a.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, ViewModelKt.getViewModelScope(this), companion.getEagerly(), (Object) null);
        this.f79029v = FlowKt.stateIn(FlowKt.distinctUntilChanged(new Flow<InterestChoose>(MutableStateFlow) { // from class: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$9

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MutableStateFlow f79046a;

            /* JADX INFO: renamed from: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$9$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/vm/PegasusViewModel$special$$inlined$map$9$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f79047a;

                /* JADX INFO: renamed from: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$9$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/vm/PegasusViewModel$special$$inlined$map$9$2$1.class */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
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
                    this.f79047a = flowCollector;
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
                        boolean r0 = r0 instanceof com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$9.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L29
                        r0 = r7
                        com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$9$2$1 r0 = (com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$9.AnonymousClass2.AnonymousClass1) r0
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
                        com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$9$2$1 r0 = new com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$9$2$1
                        r1 = r0
                        r2 = r5
                        r3 = r7
                        r1.<init>(r2, r3)
                        r7 = r0
                    L33:
                        r0 = r7
                        java.lang.Object r0 = r0.result
                        r10 = r0
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        r9 = r0
                        r0 = r7
                        int r0 = r0.label
                        r8 = r0
                        r0 = r8
                        if (r0 == 0) goto L5e
                        r0 = r8
                        r1 = 1
                        if (r0 != r1) goto L54
                        r0 = r10
                        kotlin.ResultKt.throwOnFailure(r0)
                        goto L83
                    L54:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        r1 = r0
                        java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r2)
                        throw r0
                    L5e:
                        r0 = r10
                        kotlin.ResultKt.throwOnFailure(r0)
                        r0 = r6
                        mp0.c r0 = (mp0.C8028c) r0
                        com.bilibili.pegasus.data.interestchoose.InterestChoose r0 = r0.f123836f
                        r6 = r0
                        r0 = r7
                        r1 = 1
                        r0.label = r1
                        r0 = r5
                        kotlinx.coroutines.flow.FlowCollector r0 = r0.f79047a
                        r1 = r6
                        r2 = r7
                        java.lang.Object r0 = r0.emit(r1, r2)
                        r1 = r9
                        if (r0 != r1) goto L83
                        r0 = r9
                        return r0
                    L83:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$9.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f79046a = MutableStateFlow;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f79046a.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }), ViewModelKt.getViewModelScope(this), companion.getEagerly(), (Object) null);
        iVar.b();
    }

    public static void K0(PegasusViewModel pegasusViewModel, boolean z6, PegasusFlush pegasusFlush, String str, String str2, kp0.f fVar, String str3, int i7, int i8, Function0 function0, int i9) {
        Deferred<? extends Action> deferred;
        if ((i9 & 1) != 0) {
            z6 = pegasusViewModel.f79016i.f123310b;
        }
        PegasusFlush pegasusFlush2 = (i9 & 2) != 0 ? pegasusViewModel.f79016i.f123311c : pegasusFlush;
        String str4 = (i9 & 4) != 0 ? pegasusViewModel.f79016i.f123312d : str;
        String str5 = (i9 & 8) != 0 ? pegasusViewModel.f79016i.f123313e : str2;
        kp0.f fVar2 = (i9 & 16) != 0 ? pegasusViewModel.f79016i.f123315g : fVar;
        String str6 = (i9 & 32) != 0 ? null : str3;
        if ((i9 & 64) != 0) {
            i7 = pegasusViewModel.f79016i.f123317j;
        }
        if ((i9 & 128) != 0) {
            i8 = pegasusViewModel.f79016i.f123318k;
        }
        Function0 function02 = (i9 & 256) != 0 ? null : function0;
        lp0.c cVar = pegasusViewModel.f79016i;
        int i10 = cVar.f123319l;
        int i11 = cVar.f123320m;
        long jB = pegasusViewModel.getState().b();
        SplashViewModel.Companion.getClass();
        long j7 = ((ga0.c) SplashViewModel.access$getGlobalState$cp().getValue()).a;
        cVar.getClass();
        pegasusViewModel.f79016i = new lp0.c(jB, z6, pegasusFlush2, str4, str5, j7, fVar2, function02, str6, i7, i8, i10, i11);
        Lazy lazy = com.bilibili.pegasus.common.o.f75659c;
        boolean zBooleanValue = ((Boolean) lazy.getValue()).booleanValue();
        com.bilibili.pegasus.request.i iVar = pegasusViewModel.f79009a;
        if (zBooleanValue) {
            lp0.c cVar2 = pegasusViewModel.f79016i;
            if (cVar2.f123310b) {
                if (cVar2.f123311c == PegasusFlush.PULL_DOWN && (deferred = pegasusViewModel.f79018k) != null && Intrinsics.areEqual(pegasusViewModel.f79019l, cVar2)) {
                    BLog.i("[Pegasus]PegasusViewModel", "commit preloaded pull down refresh");
                    pegasusViewModel.f79018k = null;
                    pegasusViewModel.f79019l = null;
                    pegasusViewModel.z(pegasusViewModel, new CommitPreloadedRefreshAction(pegasusViewModel.f79016i, iVar, deferred));
                    pegasusViewModel.I0(str4, str5);
                    return;
                }
            }
        }
        if (((Boolean) lazy.getValue()).booleanValue()) {
            lp0.c cVar3 = pegasusViewModel.f79016i;
            if (cVar3.f123310b) {
                if (cVar3.f123311c == PegasusFlush.PULL_DOWN) {
                    Deferred<? extends Action> deferred2 = pegasusViewModel.f79018k;
                    if (deferred2 != null) {
                        Job.DefaultImpls.cancel$default(deferred2, (CancellationException) null, 1, (Object) null);
                    }
                    pegasusViewModel.f79018k = null;
                    pegasusViewModel.f79019l = null;
                }
            }
        }
        l0.f77081d++;
        lp0.c cVar4 = pegasusViewModel.f79016i;
        pegasusViewModel.z(pegasusViewModel, cVar4.f123310b ? new RefreshAction(cVar4, iVar) : new LoadMoreAction(cVar4, iVar));
        pegasusViewModel.I0(str4, str5);
    }

    @NotNull
    public final List<com.bilibili.pegasus.d> D() {
        return this.f79010b;
    }

    public final void I0(String str, String str2) {
        M0(null);
        if (str != null && !StringsKt.isBlank(str)) {
            this.f79016i = lp0.c.a(this.f79016i, 0L, false, null, 0L, null, 0, 0, 8183);
        }
        if (str2 == null || StringsKt.isBlank(str2)) {
            return;
        }
        this.f79016i = lp0.c.a(this.f79016i, 0L, false, null, 0L, null, 0, 0, 8175);
    }

    @NotNull
    /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] */
    public final C8028c getState() {
        return (C8028c) this.f79020m.getValue();
    }

    public final void L0() {
        if (((Boolean) com.bilibili.pegasus.common.o.f75659c.getValue()).booleanValue() && !getState().d()) {
            Deferred<? extends Action> deferred = this.f79018k;
            if (deferred == null || !deferred.isActive()) {
                if (deferred != null) {
                    this.f79018k = null;
                    this.f79019l = null;
                }
                lp0.c cVar = this.f79016i;
                long jB = getState().b();
                PegasusFlush pegasusFlush = PegasusFlush.PULL_DOWN;
                SplashViewModel.Companion.getClass();
                lp0.c cVarA = lp0.c.a(cVar, jB, true, pegasusFlush, ((ga0.c) SplashViewModel.access$getGlobalState$cp().getValue()).a, null, 0, 0, 7768);
                BLog.i("[Pegasus]PegasusViewModel", "preload pull down refresh");
                this.f79019l = cVarA;
                l0.f77081d++;
                this.f79018k = BuildersKt.async$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new PegasusViewModel$preloadPullDownRefresh$1(cVarA, this, null), 3, (Object) null);
            }
        }
    }

    public final void M0(@Nullable kp0.f fVar) {
        this.f79016i = lp0.c.a(this.f79016i, 0L, false, null, 0L, fVar, 0, 0, 8127);
    }

    public final Flow getActionFlow() {
        return this.f79014f;
    }

    @NotNull
    public final Flow<List<PegasusHolderData>> getFeedsFlow() {
        return this.f79022o;
    }

    @NotNull
    public final StateFlow<Action> getStateAction() {
        return this.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:159:0x077c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    /* JADX WARN: Type inference failed for: r3v34, types: [mp0.b] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object s(@org.jetbrains.annotations.NotNull com.bilibili.pegasus.Action r12, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instruction units count: 3671
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.vm.PegasusViewModel.s(com.bilibili.pegasus.Action, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
