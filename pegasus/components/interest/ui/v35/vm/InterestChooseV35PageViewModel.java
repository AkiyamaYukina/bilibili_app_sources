package com.bilibili.pegasus.components.interest.ui.v35.vm;

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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v35/vm/InterestChooseV35PageViewModel.class */
@StabilityInferred(parameters = 0)
public final class InterestChooseV35PageViewModel implements A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<InterestChoose> f76816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StateFlow<InterestChoose> f76817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<InterestChoose> f76818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final StateFlow<InterestChoose> f76819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f76820e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f76821f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Integer> f76822g;

    @NotNull
    public final SharedFlow<Integer> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<j> f76823i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final SharedFlow<j> f76824j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final InterestChooseV35PageViewModel$special$$inlined$map$2 f76825k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final InterestChooseV35PageViewModel$special$$inlined$map$3 f76826l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final List<Long> f76827m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final InterestChooseV35PageViewModel$special$$inlined$map$4 f76828n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Integer> f76829o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final StateFlow<Integer> f76830p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final Flow<To0.a> f76831q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final Flow<C7779b> f76832r;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v35/vm/InterestChooseV35PageViewModel$a.class */
    public static final class a<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterestChooseV35PageViewModel f76833a;

        public a(InterestChooseV35PageViewModel interestChooseV35PageViewModel) {
            this.f76833a = interestChooseV35PageViewModel;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t8) {
            return ComparisonsKt.compareValues(Integer.valueOf(((ArrayList) this.f76833a.f76827m).indexOf(Long.valueOf(((InterestChooseItem) t7).getId()))), Integer.valueOf(((ArrayList) this.f76833a.f76827m).indexOf(Long.valueOf(((InterestChooseItem) t8).getId()))));
        }
    }

    /* JADX WARN: Type inference failed for: r1v18, types: [com.bilibili.pegasus.components.interest.ui.v35.vm.InterestChooseV35PageViewModel$special$$inlined$map$2] */
    /* JADX WARN: Type inference failed for: r1v19, types: [com.bilibili.pegasus.components.interest.ui.v35.vm.InterestChooseV35PageViewModel$special$$inlined$map$3] */
    /* JADX WARN: Type inference failed for: r1v21, types: [com.bilibili.pegasus.components.interest.ui.v35.vm.InterestChooseV35PageViewModel$special$$inlined$map$4] */
    public InterestChooseV35PageViewModel() {
        final MutableStateFlow<InterestChoose> MutableStateFlow = StateFlowKt.MutableStateFlow((Object) null);
        this.f76816a = MutableStateFlow;
        this.f76817b = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<InterestChoose> MutableStateFlow2 = StateFlowKt.MutableStateFlow((Object) null);
        this.f76818c = MutableStateFlow2;
        this.f76819d = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f76820e = MutableStateFlow3;
        this.f76821f = FlowKt.asStateFlow(MutableStateFlow3);
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        MutableSharedFlow<Integer> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f76822g = mutableSharedFlowMutableSharedFlow$default;
        this.h = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<j> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f76823i = mutableSharedFlowMutableSharedFlow$default2;
        this.f76824j = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        final InterestChooseV35PageViewModel$special$$inlined$map$1 interestChooseV35PageViewModel$special$$inlined$map$1 = new InterestChooseV35PageViewModel$special$$inlined$map$1(MutableStateFlow2);
        this.f76825k = new Flow<List<? extends Object>>(MutableStateFlow) { // from class: com.bilibili.pegasus.components.interest.ui.v35.vm.InterestChooseV35PageViewModel$special$$inlined$map$2

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MutableStateFlow f76836a;

            /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v35.vm.InterestChooseV35PageViewModel$special$$inlined$map$2$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v35/vm/InterestChooseV35PageViewModel$special$$inlined$map$2$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f76837a;

                /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v35.vm.InterestChooseV35PageViewModel$special$$inlined$map$2$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v35/vm/InterestChooseV35PageViewModel$special$$inlined$map$2$2$1.class */
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
                    this.f76837a = flowCollector;
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
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.v35.vm.InterestChooseV35PageViewModel$special$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f76836a = MutableStateFlow;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f76836a.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        this.f76826l = new Flow<List<? extends InterestChooseItem>>(interestChooseV35PageViewModel$special$$inlined$map$1) { // from class: com.bilibili.pegasus.components.interest.ui.v35.vm.InterestChooseV35PageViewModel$special$$inlined$map$3

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final InterestChooseV35PageViewModel$special$$inlined$map$1 f76838a;

            /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v35.vm.InterestChooseV35PageViewModel$special$$inlined$map$3$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v35/vm/InterestChooseV35PageViewModel$special$$inlined$map$3$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f76839a;

                /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v35.vm.InterestChooseV35PageViewModel$special$$inlined$map$3$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v35/vm/InterestChooseV35PageViewModel$special$$inlined$map$3$2$1.class */
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
                    this.f76839a = flowCollector;
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
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.v35.vm.InterestChooseV35PageViewModel$special$$inlined$map$3.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f76838a = interestChooseV35PageViewModel$special$$inlined$map$1;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f76838a.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        this.f76827m = new ArrayList();
        this.f76828n = new Flow<List<? extends InterestChooseItem>>(interestChooseV35PageViewModel$special$$inlined$map$1, this) { // from class: com.bilibili.pegasus.components.interest.ui.v35.vm.InterestChooseV35PageViewModel$special$$inlined$map$4

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final InterestChooseV35PageViewModel$special$$inlined$map$1 f76840a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final InterestChooseV35PageViewModel f76841b;

            /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v35.vm.InterestChooseV35PageViewModel$special$$inlined$map$4$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v35/vm/InterestChooseV35PageViewModel$special$$inlined$map$4$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f76842a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final InterestChooseV35PageViewModel f76843b;

                /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v35.vm.InterestChooseV35PageViewModel$special$$inlined$map$4$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v35/vm/InterestChooseV35PageViewModel$special$$inlined$map$4$2$1.class */
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

                public AnonymousClass2(FlowCollector flowCollector, InterestChooseV35PageViewModel interestChooseV35PageViewModel) {
                    this.f76842a = flowCollector;
                    this.f76843b = interestChooseV35PageViewModel;
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
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.v35.vm.InterestChooseV35PageViewModel$special$$inlined$map$4.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f76840a = interestChooseV35PageViewModel$special$$inlined$map$1;
                this.f76841b = this;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f76840a.collect(new AnonymousClass2(flowCollector, this.f76841b), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        MutableStateFlow<Integer> MutableStateFlow4 = StateFlowKt.MutableStateFlow(0);
        this.f76829o = MutableStateFlow4;
        this.f76830p = FlowKt.asStateFlow(MutableStateFlow4);
        Flow<To0.a> flowCombine = FlowKt.combine(MutableStateFlow4, interestChooseV35PageViewModel$special$$inlined$map$1, new InterestChooseV35PageViewModel$secondPageItemFlow$1(null));
        this.f76831q = flowCombine;
        this.f76832r = FlowKt.combine(MutableStateFlow, interestChooseV35PageViewModel$special$$inlined$map$1, flowCombine, new InterestChooseV35PageViewModel$interestChooseConfirmButtonState$1(this, null));
    }

    @Override // com.bilibili.pegasus.components.interest.A
    public final void W(@Nullable InterestPageType interestPageType) {
        this.f76823i.tryEmit(new j(interestPageType, 2));
    }

    @Nullable
    public final String a() {
        Object next;
        Object next2;
        InterestChoose interestChoose = (InterestChoose) this.f76816a.getValue();
        if (interestChoose == null) {
            return null;
        }
        InterestChoose interestChoose2 = (InterestChoose) this.f76818c.getValue();
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
        this.f76829o.setValue(Integer.valueOf(i7));
        if (i7 == 0) {
            this.f76818c.setValue((Object) null);
            ((ArrayList) this.f76827m).clear();
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
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.v35.vm.InterestChooseV35PageViewModel.c(com.bilibili.pegasus.data.interestchoose.InterestChoose):void");
    }
}
