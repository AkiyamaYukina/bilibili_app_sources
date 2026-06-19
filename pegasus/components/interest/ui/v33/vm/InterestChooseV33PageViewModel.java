package com.bilibili.pegasus.components.interest.ui.v33.vm;

import Po0.a;
import V0.f;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pegasus.components.interest.A;
import com.bilibili.pegasus.components.interest.ui.reporter.InterestPageType;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import com.bilibili.pegasus.data.interestchoose.InterestChooseAge;
import com.bilibili.pegasus.data.interestchoose.InterestChooseGender;
import com.bilibili.pegasus.data.interestchoose.InterestChooseItem;
import com.bilibili.pegasus.data.interestchoose.InterestChooseSubItem;
import com.bilibili.studio.material.util.UtilsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kp0.C7779b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v33/vm/InterestChooseV33PageViewModel.class */
@StabilityInferred(parameters = 0)
public final class InterestChooseV33PageViewModel implements A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f76737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Unit> f76738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Integer> f76739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Integer> f76740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<InterestChoose> f76741e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final StateFlow<InterestChoose> f76742f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<InterestChoose> f76743g;

    @NotNull
    public final StateFlow<InterestChoose> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final InterestChooseV33PageViewModel$special$$inlined$map$1 f76744i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final InterestChooseV33PageViewModel$special$$inlined$map$2 f76745j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Integer> f76746k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final StateFlow<Integer> f76747l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Flow<a> f76748m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Flow<C7779b> f76749n;

    /* JADX WARN: Type inference failed for: r0v18, types: [com.bilibili.pegasus.components.interest.ui.v33.vm.InterestChooseV33PageViewModel$special$$inlined$map$1, kotlinx.coroutines.flow.Flow] */
    /* JADX WARN: Type inference failed for: r1v16, types: [com.bilibili.pegasus.components.interest.ui.v33.vm.InterestChooseV33PageViewModel$special$$inlined$map$2] */
    public InterestChooseV33PageViewModel() {
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f76737a = mutableSharedFlowMutableSharedFlow$default;
        this.f76738b = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<Integer> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f76739c = mutableSharedFlowMutableSharedFlow$default2;
        this.f76740d = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        final MutableStateFlow<InterestChoose> MutableStateFlow = StateFlowKt.MutableStateFlow((Object) null);
        this.f76741e = MutableStateFlow;
        this.f76742f = FlowKt.asStateFlow(MutableStateFlow);
        final MutableStateFlow<InterestChoose> MutableStateFlow2 = StateFlowKt.MutableStateFlow((Object) null);
        this.f76743g = MutableStateFlow2;
        this.h = FlowKt.asStateFlow(MutableStateFlow2);
        ?? r02 = new Flow<List<? extends InterestChooseItem>>(MutableStateFlow2) { // from class: com.bilibili.pegasus.components.interest.ui.v33.vm.InterestChooseV33PageViewModel$special$$inlined$map$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MutableStateFlow f76750a;

            /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v33.vm.InterestChooseV33PageViewModel$special$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v33/vm/InterestChooseV33PageViewModel$special$$inlined$map$1$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f76751a;

                /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v33.vm.InterestChooseV33PageViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v33/vm/InterestChooseV33PageViewModel$special$$inlined$map$1$2$1.class */
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
                    this.f76751a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x007a  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                    /*
                        r5 = this;
                        r0 = r7
                        boolean r0 = r0 instanceof com.bilibili.pegasus.components.interest.ui.v33.vm.InterestChooseV33PageViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L29
                        r0 = r7
                        com.bilibili.pegasus.components.interest.ui.v33.vm.InterestChooseV33PageViewModel$special$$inlined$map$1$2$1 r0 = (com.bilibili.pegasus.components.interest.ui.v33.vm.InterestChooseV33PageViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
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
                        com.bilibili.pegasus.components.interest.ui.v33.vm.InterestChooseV33PageViewModel$special$$inlined$map$1$2$1 r0 = new com.bilibili.pegasus.components.interest.ui.v33.vm.InterestChooseV33PageViewModel$special$$inlined$map$1$2$1
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
                        goto L96
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
                        com.bilibili.pegasus.data.interestchoose.InterestChoose r0 = (com.bilibili.pegasus.data.interestchoose.InterestChoose) r0
                        r6 = r0
                        r0 = r6
                        if (r0 == 0) goto L7a
                        r0 = r6
                        java.util.List r0 = r0.u()
                        r9 = r0
                        r0 = r9
                        r6 = r0
                        r0 = r9
                        if (r0 != 0) goto L7e
                    L7a:
                        java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
                        r6 = r0
                    L7e:
                        r0 = r7
                        r1 = 1
                        r0.label = r1
                        r0 = r5
                        kotlinx.coroutines.flow.FlowCollector r0 = r0.f76751a
                        r1 = r6
                        r2 = r7
                        java.lang.Object r0 = r0.emit(r1, r2)
                        r1 = r10
                        if (r0 != r1) goto L96
                        r0 = r10
                        return r0
                    L96:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.v33.vm.InterestChooseV33PageViewModel$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f76750a = MutableStateFlow2;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f76750a.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        this.f76744i = r02;
        this.f76745j = new Flow<List<? extends Object>>(MutableStateFlow) { // from class: com.bilibili.pegasus.components.interest.ui.v33.vm.InterestChooseV33PageViewModel$special$$inlined$map$2

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MutableStateFlow f76752a;

            /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v33.vm.InterestChooseV33PageViewModel$special$$inlined$map$2$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v33/vm/InterestChooseV33PageViewModel$special$$inlined$map$2$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f76753a;

                /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v33.vm.InterestChooseV33PageViewModel$special$$inlined$map$2$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v33/vm/InterestChooseV33PageViewModel$special$$inlined$map$2$2$1.class */
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
                    this.f76753a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                    /*
                        Method dump skipped, instruction units count: 255
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.v33.vm.InterestChooseV33PageViewModel$special$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f76752a = MutableStateFlow;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f76752a.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        MutableStateFlow<Integer> MutableStateFlow3 = StateFlowKt.MutableStateFlow(0);
        this.f76746k = MutableStateFlow3;
        this.f76747l = FlowKt.asStateFlow(MutableStateFlow3);
        Flow<a> flowCombine = FlowKt.combine(MutableStateFlow3, (Flow) r02, new InterestChooseV33PageViewModel$secondPageItemFlow$1(null));
        this.f76748m = flowCombine;
        this.f76749n = FlowKt.combine(MutableStateFlow, MutableStateFlow2, flowCombine, new InterestChooseV33PageViewModel$interestChooseConfirmButtonState$1(null));
    }

    @Override // com.bilibili.pegasus.components.interest.A
    public final void W(@Nullable InterestPageType interestPageType) {
        this.f76737a.tryEmit(Unit.INSTANCE);
    }

    @Nullable
    public final String a() {
        Object next;
        Object next2;
        InterestChoose interestChoose = (InterestChoose) this.f76741e.getValue();
        if (interestChoose == null) {
            return null;
        }
        InterestChoose interestChoose2 = (InterestChoose) this.f76743g.getValue();
        List<InterestChooseItem> listU = interestChoose2 != null ? interestChoose2.u() : null;
        ArrayList arrayList = new ArrayList();
        if (listU != null) {
            for (InterestChooseItem interestChooseItem : listU) {
                List<InterestChooseSubItem> subItems = interestChooseItem.getSubItems();
                if (subItems != null) {
                    List<InterestChooseSubItem> list = subItems;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : list) {
                        if (((InterestChooseSubItem) obj).f77422g) {
                            arrayList2.add(obj);
                        }
                    }
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        f.b(interestChooseItem.getId(), UtilsKt.DOT, ((InterestChooseSubItem) it.next()).i(), arrayList);
                    }
                }
            }
        }
        List<InterestChooseGender> listQ = interestChoose.q();
        if (listQ != null) {
            Iterator<T> it2 = listQ.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                if (((InterestChooseGender) next2).f77411g) {
                    break;
                }
            }
            InterestChooseGender interestChooseGender = (InterestChooseGender) next2;
            if (interestChooseGender != null) {
                arrayList.add(String.valueOf(interestChooseGender.getId()));
            }
        }
        List<InterestChooseAge> listC = interestChoose.c();
        if (listC != null) {
            Iterator<T> it3 = listC.iterator();
            do {
                next = null;
                if (!it3.hasNext()) {
                    break;
                }
                next = it3.next();
            } while (!((InterestChooseAge) next).f77403e);
            InterestChooseAge interestChooseAge = (InterestChooseAge) next;
            if (interestChooseAge != null) {
                arrayList.add(String.valueOf(interestChooseAge.getId()));
            }
        }
        return CollectionsKt.p(arrayList, ",", (CharSequence) null, (CharSequence) null, (Function1) null, 62);
    }

    public final void b(int i7) {
        this.f76746k.setValue(Integer.valueOf(i7));
        if (i7 == 0) {
            this.f76743g.setValue((Object) null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(@org.jetbrains.annotations.Nullable com.bilibili.pegasus.data.interestchoose.InterestChoose r23) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.v33.vm.InterestChooseV33PageViewModel.c(com.bilibili.pegasus.data.interestchoose.InterestChoose):void");
    }
}
