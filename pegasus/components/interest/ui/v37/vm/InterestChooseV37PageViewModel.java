package com.bilibili.pegasus.components.interest.ui.v37.vm;

import V0.f;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pegasus.components.interest.A;
import com.bilibili.pegasus.components.interest.ui.common.j;
import com.bilibili.pegasus.components.interest.ui.reporter.InterestPageType;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import com.bilibili.pegasus.data.interestchoose.InterestChooseAge;
import com.bilibili.pegasus.data.interestchoose.InterestChooseGender;
import com.bilibili.pegasus.data.interestchoose.InterestChooseItem;
import com.bilibili.pegasus.data.interestchoose.InterestChooseSubItem;
import com.bilibili.studio.material.util.UtilsKt;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v37/vm/InterestChooseV37PageViewModel.class */
@StabilityInferred(parameters = 0)
public final class InterestChooseV37PageViewModel implements A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<InterestChoose> f76900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StateFlow<InterestChoose> f76901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<InterestChoose> f76902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final StateFlow<InterestChoose> f76903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f76904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f76905f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Integer> f76906g;

    @NotNull
    public final SharedFlow<Integer> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<j> f76907i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final SharedFlow<j> f76908j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f76909k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Unit> f76910l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final InterestChooseV37PageViewModel$special$$inlined$map$2 f76911m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final InterestChooseV37PageViewModel$special$$inlined$map$3 f76912n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final List<Long> f76913o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final InterestChooseV37PageViewModel$special$$inlined$map$4 f76914p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Integer> f76915q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final StateFlow<Integer> f76916r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final Flow<Xo0.a> f76917s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final Flow<C7779b> f76918t;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v37/vm/InterestChooseV37PageViewModel$a.class */
    public static final class a<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterestChooseV37PageViewModel f76919a;

        public a(InterestChooseV37PageViewModel interestChooseV37PageViewModel) {
            this.f76919a = interestChooseV37PageViewModel;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t8) {
            return ComparisonsKt.compareValues(Integer.valueOf(((ArrayList) this.f76919a.f76913o).indexOf(Long.valueOf(((InterestChooseItem) t7).getId()))), Integer.valueOf(((ArrayList) this.f76919a.f76913o).indexOf(Long.valueOf(((InterestChooseItem) t8).getId()))));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v37/vm/InterestChooseV37PageViewModel$b.class */
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t8) {
            return ComparisonsKt.compareValues(Integer.valueOf(((InterestChooseItem) t8).getDefaultSelected()), Integer.valueOf(((InterestChooseItem) t7).getDefaultSelected()));
        }
    }

    /* JADX WARN: Type inference failed for: r1v22, types: [com.bilibili.pegasus.components.interest.ui.v37.vm.InterestChooseV37PageViewModel$special$$inlined$map$2] */
    /* JADX WARN: Type inference failed for: r1v23, types: [com.bilibili.pegasus.components.interest.ui.v37.vm.InterestChooseV37PageViewModel$special$$inlined$map$3] */
    /* JADX WARN: Type inference failed for: r1v25, types: [com.bilibili.pegasus.components.interest.ui.v37.vm.InterestChooseV37PageViewModel$special$$inlined$map$4] */
    public InterestChooseV37PageViewModel() {
        final MutableStateFlow<InterestChoose> MutableStateFlow = StateFlowKt.MutableStateFlow((Object) null);
        this.f76900a = MutableStateFlow;
        this.f76901b = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<InterestChoose> MutableStateFlow2 = StateFlowKt.MutableStateFlow((Object) null);
        this.f76902c = MutableStateFlow2;
        this.f76903d = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f76904e = MutableStateFlow3;
        this.f76905f = FlowKt.asStateFlow(MutableStateFlow3);
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        MutableSharedFlow<Integer> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f76906g = mutableSharedFlowMutableSharedFlow$default;
        this.h = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<j> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f76907i = mutableSharedFlowMutableSharedFlow$default2;
        this.f76908j = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f76909k = mutableSharedFlowMutableSharedFlow$default3;
        this.f76910l = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
        final InterestChooseV37PageViewModel$special$$inlined$map$1 interestChooseV37PageViewModel$special$$inlined$map$1 = new InterestChooseV37PageViewModel$special$$inlined$map$1(MutableStateFlow2);
        this.f76911m = new Flow<List<? extends Object>>(MutableStateFlow) { // from class: com.bilibili.pegasus.components.interest.ui.v37.vm.InterestChooseV37PageViewModel$special$$inlined$map$2

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MutableStateFlow f76922a;

            /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v37.vm.InterestChooseV37PageViewModel$special$$inlined$map$2$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v37/vm/InterestChooseV37PageViewModel$special$$inlined$map$2$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f76923a;

                /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v37.vm.InterestChooseV37PageViewModel$special$$inlined$map$2$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v37/vm/InterestChooseV37PageViewModel$special$$inlined$map$2$2$1.class */
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
                    this.f76923a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                    /*
                        Method dump skipped, instruction units count: 231
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.v37.vm.InterestChooseV37PageViewModel$special$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f76922a = MutableStateFlow;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f76922a.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        this.f76912n = new Flow<List<? extends InterestChooseItem>>(interestChooseV37PageViewModel$special$$inlined$map$1) { // from class: com.bilibili.pegasus.components.interest.ui.v37.vm.InterestChooseV37PageViewModel$special$$inlined$map$3

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final InterestChooseV37PageViewModel$special$$inlined$map$1 f76924a;

            /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v37.vm.InterestChooseV37PageViewModel$special$$inlined$map$3$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v37/vm/InterestChooseV37PageViewModel$special$$inlined$map$3$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f76925a;

                /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v37.vm.InterestChooseV37PageViewModel$special$$inlined$map$3$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v37/vm/InterestChooseV37PageViewModel$special$$inlined$map$3$2$1.class */
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
                    this.f76925a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:36:0x0123  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                    /*
                        Method dump skipped, instruction units count: 298
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.v37.vm.InterestChooseV37PageViewModel$special$$inlined$map$3.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f76924a = interestChooseV37PageViewModel$special$$inlined$map$1;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f76924a.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        this.f76913o = new ArrayList();
        this.f76914p = new Flow<List<? extends InterestChooseItem>>(interestChooseV37PageViewModel$special$$inlined$map$1, this) { // from class: com.bilibili.pegasus.components.interest.ui.v37.vm.InterestChooseV37PageViewModel$special$$inlined$map$4

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final InterestChooseV37PageViewModel$special$$inlined$map$1 f76926a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final InterestChooseV37PageViewModel f76927b;

            /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v37.vm.InterestChooseV37PageViewModel$special$$inlined$map$4$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v37/vm/InterestChooseV37PageViewModel$special$$inlined$map$4$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f76928a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final InterestChooseV37PageViewModel f76929b;

                /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v37.vm.InterestChooseV37PageViewModel$special$$inlined$map$4$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v37/vm/InterestChooseV37PageViewModel$special$$inlined$map$4$2$1.class */
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

                public AnonymousClass2(FlowCollector flowCollector, InterestChooseV37PageViewModel interestChooseV37PageViewModel) {
                    this.f76928a = flowCollector;
                    this.f76929b = interestChooseV37PageViewModel;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                    /*
                        Method dump skipped, instruction units count: 241
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.v37.vm.InterestChooseV37PageViewModel$special$$inlined$map$4.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f76926a = interestChooseV37PageViewModel$special$$inlined$map$1;
                this.f76927b = this;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f76926a.collect(new AnonymousClass2(flowCollector, this.f76927b), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        MutableStateFlow<Integer> MutableStateFlow4 = StateFlowKt.MutableStateFlow(0);
        this.f76915q = MutableStateFlow4;
        this.f76916r = FlowKt.asStateFlow(MutableStateFlow4);
        Flow<Xo0.a> flowCombine = FlowKt.combine(MutableStateFlow4, interestChooseV37PageViewModel$special$$inlined$map$1, new InterestChooseV37PageViewModel$secondPageItemFlow$1(null));
        this.f76917s = flowCombine;
        this.f76918t = FlowKt.combine(MutableStateFlow, interestChooseV37PageViewModel$special$$inlined$map$1, flowCombine, new InterestChooseV37PageViewModel$interestChooseConfirmButtonState$1(this, null));
    }

    @Override // com.bilibili.pegasus.components.interest.A
    public final void W(@Nullable InterestPageType interestPageType) {
        this.f76907i.tryEmit(new j(interestPageType, 2));
    }

    @Nullable
    public final String a() {
        Object next;
        Object next2;
        InterestChoose interestChoose = (InterestChoose) this.f76900a.getValue();
        if (interestChoose == null) {
            return null;
        }
        InterestChoose interestChoose2 = (InterestChoose) this.f76902c.getValue();
        List<InterestChooseItem> listU = interestChoose2 != null ? interestChoose2.u() : null;
        ArrayList arrayList = new ArrayList();
        if (listU != null) {
            ArrayList<InterestChooseItem> arrayList2 = new ArrayList();
            for (Object obj : listU) {
                if (((InterestChooseItem) obj).isSelected()) {
                    arrayList2.add(obj);
                }
            }
            for (InterestChooseItem interestChooseItem : arrayList2) {
                List<InterestChooseSubItem> subItems = interestChooseItem.getSubItems();
                if (subItems == null || subItems.isEmpty()) {
                    arrayList.add(String.valueOf(interestChooseItem.getId()));
                } else {
                    List<InterestChooseSubItem> subItems2 = interestChooseItem.getSubItems();
                    if (subItems2 != null) {
                        List<InterestChooseSubItem> list = subItems2;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj2 : list) {
                            if (((InterestChooseSubItem) obj2).f77422g) {
                                arrayList3.add(obj2);
                            }
                        }
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            f.b(interestChooseItem.getId(), UtilsKt.DOT, ((InterestChooseSubItem) it.next()).i(), arrayList);
                        }
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
        this.f76915q.setValue(Integer.valueOf(i7));
        if (i7 == 0) {
            this.f76902c.setValue((Object) null);
            ((ArrayList) this.f76913o).clear();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0129  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Comparator] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(@org.jetbrains.annotations.Nullable com.bilibili.pegasus.data.interestchoose.InterestChoose r23) {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.v37.vm.InterestChooseV37PageViewModel.c(com.bilibili.pegasus.data.interestchoose.InterestChoose):void");
    }
}
