package com.bilibili.pegasus.components.interest.ui.vm;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import com.bilibili.pegasus.data.interestchoose.InterestChooseAge;
import com.bilibili.pegasus.data.interestchoose.InterestChooseGender;
import com.bilibili.pegasus.data.interestchoose.InterestChooseItem;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/vm/InterestChooseViewModel.class */
@StabilityInferred(parameters = 0)
public final class InterestChooseViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<InterestChoose> f76970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterestChooseViewModel$special$$inlined$map$1 f76971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final InterestChooseViewModel$special$$inlined$map$2 f76972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final InterestChooseViewModel$special$$inlined$map$3 f76973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f76974e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f76975f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Flow<Boolean> f76976g;

    /* JADX WARN: Type inference failed for: r0v4, types: [com.bilibili.pegasus.components.interest.ui.vm.InterestChooseViewModel$special$$inlined$map$1, kotlinx.coroutines.flow.Flow] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.bilibili.pegasus.components.interest.ui.vm.InterestChooseViewModel$special$$inlined$map$2, kotlinx.coroutines.flow.Flow] */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.bilibili.pegasus.components.interest.ui.vm.InterestChooseViewModel$special$$inlined$map$3, kotlinx.coroutines.flow.Flow] */
    public InterestChooseViewModel() {
        final MutableStateFlow<InterestChoose> MutableStateFlow = StateFlowKt.MutableStateFlow((Object) null);
        this.f76970a = MutableStateFlow;
        ?? r02 = new Flow<List<? extends InterestChooseItem>>(MutableStateFlow, this) { // from class: com.bilibili.pegasus.components.interest.ui.vm.InterestChooseViewModel$special$$inlined$map$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MutableStateFlow f76977a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final InterestChooseViewModel f76978b;

            /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.vm.InterestChooseViewModel$special$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/vm/InterestChooseViewModel$special$$inlined$map$1$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f76979a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final InterestChooseViewModel f76980b;

                /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.vm.InterestChooseViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/vm/InterestChooseViewModel$special$$inlined$map$1$2$1.class */
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

                public AnonymousClass2(FlowCollector flowCollector, InterestChooseViewModel interestChooseViewModel) {
                    this.f76979a = flowCollector;
                    this.f76980b = interestChooseViewModel;
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
                        boolean r0 = r0 instanceof com.bilibili.pegasus.components.interest.ui.vm.InterestChooseViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L29
                        r0 = r7
                        com.bilibili.pegasus.components.interest.ui.vm.InterestChooseViewModel$special$$inlined$map$1$2$1 r0 = (com.bilibili.pegasus.components.interest.ui.vm.InterestChooseViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
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
                        com.bilibili.pegasus.components.interest.ui.vm.InterestChooseViewModel$special$$inlined$map$1$2$1 r0 = new com.bilibili.pegasus.components.interest.ui.vm.InterestChooseViewModel$special$$inlined$map$1$2$1
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
                        goto L89
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
                        com.bilibili.pegasus.data.interestchoose.InterestChoose r0 = (com.bilibili.pegasus.data.interestchoose.InterestChoose) r0
                        r6 = r0
                        r0 = r5
                        com.bilibili.pegasus.components.interest.ui.vm.InterestChooseViewModel r0 = r0.f76980b
                        r1 = r6
                        java.util.List r0 = r0.a(r1)
                        r6 = r0
                        r0 = r7
                        r1 = 1
                        r0.label = r1
                        r0 = r5
                        kotlinx.coroutines.flow.FlowCollector r0 = r0.f76979a
                        r1 = r6
                        r2 = r7
                        java.lang.Object r0 = r0.emit(r1, r2)
                        r1 = r9
                        if (r0 != r1) goto L89
                        r0 = r9
                        return r0
                    L89:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.vm.InterestChooseViewModel$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f76977a = MutableStateFlow;
                this.f76978b = this;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f76977a.collect(new AnonymousClass2(flowCollector, this.f76978b), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        this.f76971b = r02;
        ?? r03 = new Flow<InterestChooseGender>(MutableStateFlow) { // from class: com.bilibili.pegasus.components.interest.ui.vm.InterestChooseViewModel$special$$inlined$map$2

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MutableStateFlow f76981a;

            /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.vm.InterestChooseViewModel$special$$inlined$map$2$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/vm/InterestChooseViewModel$special$$inlined$map$2$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f76982a;

                /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.vm.InterestChooseViewModel$special$$inlined$map$2$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/vm/InterestChooseViewModel$special$$inlined$map$2$2$1.class */
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
                    this.f76982a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                    /*
                        Method dump skipped, instruction units count: 210
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.vm.InterestChooseViewModel$special$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f76981a = MutableStateFlow;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f76981a.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        this.f76972c = r03;
        ?? r04 = new Flow<InterestChooseAge>(MutableStateFlow) { // from class: com.bilibili.pegasus.components.interest.ui.vm.InterestChooseViewModel$special$$inlined$map$3

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MutableStateFlow f76983a;

            /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.vm.InterestChooseViewModel$special$$inlined$map$3$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/vm/InterestChooseViewModel$special$$inlined$map$3$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f76984a;

                /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.vm.InterestChooseViewModel$special$$inlined$map$3$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/vm/InterestChooseViewModel$special$$inlined$map$3$2$1.class */
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
                    this.f76984a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                    /*
                        Method dump skipped, instruction units count: 210
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.vm.InterestChooseViewModel$special$$inlined$map$3.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f76983a = MutableStateFlow;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f76983a.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        this.f76973d = r04;
        this.f76974e = -1;
        this.f76976g = FlowKt.combine((Flow) r02, (Flow) r03, (Flow) r04, new InterestChooseViewModel$interestChooseConfirmFlow$1(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.bilibili.pegasus.data.interestchoose.InterestChooseItem> a(@org.jetbrains.annotations.Nullable com.bilibili.pegasus.data.interestchoose.InterestChoose r4) {
        /*
            r3 = this;
            r0 = r4
            boolean r0 = kp0.C7781d.h(r0)
            r5 = r0
            r0 = 0
            r7 = r0
            r0 = r5
            if (r0 == 0) goto L8d
            r0 = r4
            if (r0 == 0) goto L5d
            r0 = r4
            java.util.List r0 = r0.q()
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L5d
            r0 = r6
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
        L24:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L43
            r0 = r8
            java.lang.Object r0 = r0.next()
            r6 = r0
            r0 = r6
            com.bilibili.pegasus.data.interestchoose.InterestChooseGender r0 = (com.bilibili.pegasus.data.interestchoose.InterestChooseGender) r0
            boolean r0 = r0.f77411g
            if (r0 == 0) goto L24
            goto L45
        L43:
            r0 = 0
            r6 = r0
        L45:
            r0 = r6
            com.bilibili.pegasus.data.interestchoose.InterestChooseGender r0 = (com.bilibili.pegasus.data.interestchoose.InterestChooseGender) r0
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L5d
            r0 = r6
            java.util.List r0 = r0.d()
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L5a
            goto L5d
        L5a:
            goto L99
        L5d:
            r0 = r7
            r6 = r0
            r0 = r4
            if (r0 == 0) goto L99
            r0 = r4
            java.util.List r0 = r0.q()
            r4 = r0
            r0 = r7
            r6 = r0
            r0 = r4
            if (r0 == 0) goto L99
            r0 = r4
            r1 = r3
            int r1 = r1.f76975f
            java.lang.Object r0 = r0.get(r1)
            com.bilibili.pegasus.data.interestchoose.InterestChooseGender r0 = (com.bilibili.pegasus.data.interestchoose.InterestChooseGender) r0
            r4 = r0
            r0 = r7
            r6 = r0
            r0 = r4
            if (r0 == 0) goto L99
            r0 = r4
            java.util.List r0 = r0.d()
            r6 = r0
            goto L99
        L8d:
            r0 = r7
            r6 = r0
            r0 = r4
            if (r0 == 0) goto L99
            r0 = r4
            java.util.List r0 = r0.u()
            r6 = r0
        L99:
            r0 = r6
            r4 = r0
            r0 = r6
            if (r0 != 0) goto La3
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            r4 = r0
        La3:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.vm.InterestChooseViewModel.a(com.bilibili.pegasus.data.interestchoose.InterestChoose):java.util.List");
    }
}
