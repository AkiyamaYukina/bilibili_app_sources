package com.bilibili.pegasus.components.interest.ui.v27.vm;

import Ho0.b;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v27/vm/InterestChooseV27PageViewModel.class */
@StabilityInferred(parameters = 0)
public final class InterestChooseV27PageViewModel implements A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<InterestChoose> f76494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StateFlow<InterestChoose> f76495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f76496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f76497d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Integer> f76498e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Integer> f76499f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f76500g;

    @NotNull
    public final SharedFlow<Unit> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final InterestChooseV27PageViewModel$special$$inlined$map$2 f76501i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final InterestChooseV27PageViewModel$special$$inlined$map$3 f76502j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Integer> f76503k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final StateFlow<Integer> f76504l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Flow<b> f76505m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Flow<C7779b> f76506n;

    /* JADX WARN: Type inference failed for: r1v15, types: [com.bilibili.pegasus.components.interest.ui.v27.vm.InterestChooseV27PageViewModel$special$$inlined$map$2] */
    /* JADX WARN: Type inference failed for: r1v16, types: [com.bilibili.pegasus.components.interest.ui.v27.vm.InterestChooseV27PageViewModel$special$$inlined$map$3] */
    public InterestChooseV27PageViewModel() {
        final MutableStateFlow<InterestChoose> MutableStateFlow = StateFlowKt.MutableStateFlow((Object) null);
        this.f76494a = MutableStateFlow;
        this.f76495b = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f76496c = MutableStateFlow2;
        this.f76497d = FlowKt.asStateFlow(MutableStateFlow2);
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        MutableSharedFlow<Integer> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f76498e = mutableSharedFlowMutableSharedFlow$default;
        this.f76499f = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f76500g = mutableSharedFlowMutableSharedFlow$default2;
        this.h = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        final InterestChooseV27PageViewModel$special$$inlined$map$1 interestChooseV27PageViewModel$special$$inlined$map$1 = new InterestChooseV27PageViewModel$special$$inlined$map$1(MutableStateFlow);
        this.f76501i = new Flow<List<? extends Object>>(MutableStateFlow) { // from class: com.bilibili.pegasus.components.interest.ui.v27.vm.InterestChooseV27PageViewModel$special$$inlined$map$2

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MutableStateFlow f76509a;

            /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v27.vm.InterestChooseV27PageViewModel$special$$inlined$map$2$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v27/vm/InterestChooseV27PageViewModel$special$$inlined$map$2$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f76510a;

                /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v27.vm.InterestChooseV27PageViewModel$special$$inlined$map$2$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v27/vm/InterestChooseV27PageViewModel$special$$inlined$map$2$2$1.class */
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
                    this.f76510a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
                    /*
                        Method dump skipped, instruction units count: 488
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.v27.vm.InterestChooseV27PageViewModel$special$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f76509a = MutableStateFlow;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f76509a.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        this.f76502j = new Flow<List<? extends InterestChooseItem>>(interestChooseV27PageViewModel$special$$inlined$map$1) { // from class: com.bilibili.pegasus.components.interest.ui.v27.vm.InterestChooseV27PageViewModel$special$$inlined$map$3

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final InterestChooseV27PageViewModel$special$$inlined$map$1 f76511a;

            /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v27.vm.InterestChooseV27PageViewModel$special$$inlined$map$3$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v27/vm/InterestChooseV27PageViewModel$special$$inlined$map$3$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f76512a;

                /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v27.vm.InterestChooseV27PageViewModel$special$$inlined$map$3$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v27/vm/InterestChooseV27PageViewModel$special$$inlined$map$3$2$1.class */
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
                    this.f76512a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                    /*
                        Method dump skipped, instruction units count: 227
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.v27.vm.InterestChooseV27PageViewModel$special$$inlined$map$3.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f76511a = interestChooseV27PageViewModel$special$$inlined$map$1;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f76511a.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        MutableStateFlow<Integer> MutableStateFlow3 = StateFlowKt.MutableStateFlow(0);
        this.f76503k = MutableStateFlow3;
        this.f76504l = FlowKt.asStateFlow(MutableStateFlow3);
        Flow<b> flowCombine = FlowKt.combine(MutableStateFlow3, interestChooseV27PageViewModel$special$$inlined$map$1, new InterestChooseV27PageViewModel$secondPageItemFlow$1(null));
        this.f76505m = flowCombine;
        this.f76506n = FlowKt.combine(interestChooseV27PageViewModel$special$$inlined$map$1, flowCombine, new InterestChooseV27PageViewModel$interestChooseConfirmButtonState$1(this, null));
    }

    @Override // com.bilibili.pegasus.components.interest.A
    public final void W(@Nullable InterestPageType interestPageType) {
        this.f76500g.tryEmit(Unit.INSTANCE);
    }

    @NotNull
    public final String a() {
        List<InterestChooseItem> listU;
        InterestChoose interestChoose = (InterestChoose) this.f76495b.getValue();
        if (interestChoose == null || (listU = interestChoose.u()) == null) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        for (InterestChooseItem interestChooseItem : listU) {
            List<InterestChooseSubItem> subItems = interestChooseItem.getSubItems();
            if (subItems == null || subItems.isEmpty()) {
                arrayList.add(String.valueOf(interestChooseItem.getId()));
            } else {
                List<InterestChooseSubItem> subItems2 = interestChooseItem.getSubItems();
                if (subItems2 != null) {
                    Iterator<T> it = subItems2.iterator();
                    while (it.hasNext()) {
                        f.b(interestChooseItem.getId(), UtilsKt.DOT, ((InterestChooseSubItem) it.next()).i(), arrayList);
                    }
                }
            }
        }
        return CollectionsKt.p(arrayList, ",", (CharSequence) null, (CharSequence) null, (Function1) null, 62);
    }

    @Nullable
    public final String b() {
        List<InterestChooseItem> listU;
        Object next;
        Object next2;
        InterestChoose interestChoose = (InterestChoose) this.f76495b.getValue();
        if (interestChoose == null || (listU = interestChoose.u()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        List<InterestChooseItem> list = listU;
        ArrayList<InterestChooseItem> arrayList2 = new ArrayList();
        for (Object obj : list) {
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
                    List<InterestChooseSubItem> list2 = subItems2;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : list2) {
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

    public final void c(@NotNull InterestChooseAge interestChooseAge) {
        List<InterestChooseAge> listC;
        MutableStateFlow<InterestChoose> mutableStateFlow = this.f76494a;
        InterestChoose interestChoose = (InterestChoose) mutableStateFlow.getValue();
        if (interestChoose == null || (listC = interestChoose.c()) == null) {
            return;
        }
        InterestChoose interestChoose2 = (InterestChoose) mutableStateFlow.getValue();
        InterestChoose interestChooseA = null;
        if (interestChoose2 != null) {
            List mutableList = CollectionsKt.toMutableList(listC);
            int i7 = 0;
            for (Object obj : mutableList) {
                if (i7 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                InterestChooseAge interestChooseAge2 = (InterestChooseAge) obj;
                mutableList.set(i7, InterestChooseAge.a(interestChooseAge2, 0, interestChooseAge.f77402d == interestChooseAge2.f77402d, 47));
                i7++;
            }
            Unit unit = Unit.INSTANCE;
            interestChooseA = InterestChoose.a(interestChoose2, null, null, mutableList, 536870783);
        }
        mutableStateFlow.setValue(interestChooseA);
    }

    public final void d(@NotNull InterestChooseGender interestChooseGender) {
        List<InterestChooseGender> listQ;
        MutableStateFlow<InterestChoose> mutableStateFlow = this.f76494a;
        InterestChoose interestChoose = (InterestChoose) mutableStateFlow.getValue();
        if (interestChoose == null || (listQ = interestChoose.q()) == null) {
            return;
        }
        InterestChoose interestChoose2 = (InterestChoose) mutableStateFlow.getValue();
        InterestChoose interestChooseA = null;
        if (interestChoose2 != null) {
            List mutableList = CollectionsKt.toMutableList(listQ);
            int i7 = 0;
            for (Object obj : mutableList) {
                if (i7 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                InterestChooseGender interestChooseGender2 = (InterestChooseGender) obj;
                mutableList.set(i7, InterestChooseGender.a(interestChooseGender2, null, 0, interestChooseGender2.f77410f == interestChooseGender.f77410f, 191));
                i7++;
            }
            Unit unit = Unit.INSTANCE;
            interestChooseA = InterestChoose.a(interestChoose2, null, mutableList, null, 536870847);
        }
        mutableStateFlow.setValue(interestChooseA);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(@org.jetbrains.annotations.NotNull com.bilibili.pegasus.data.interestchoose.InterestChooseItem r23) {
        /*
            Method dump skipped, instruction units count: 483
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.v27.vm.InterestChooseV27PageViewModel.e(com.bilibili.pegasus.data.interestchoose.InterestChooseItem):void");
    }

    public final void f(int i7, int i8) {
        List<InterestChooseItem> listU;
        InterestChooseItem interestChooseItem;
        List list;
        List mutableList;
        MutableStateFlow<InterestChoose> mutableStateFlow = this.f76494a;
        InterestChoose interestChoose = (InterestChoose) mutableStateFlow.getValue();
        if (interestChoose == null || (listU = interestChoose.u()) == null || (interestChooseItem = (InterestChooseItem) CollectionsKt.getOrNull(listU, i7)) == null) {
            return;
        }
        InterestChoose interestChoose2 = (InterestChoose) mutableStateFlow.getValue();
        InterestChoose interestChooseA = null;
        if (interestChoose2 != null) {
            List mutableList2 = CollectionsKt.toMutableList(listU);
            List<InterestChooseSubItem> subItems = interestChooseItem.getSubItems();
            InterestChooseSubItem interestChooseSubItem = subItems != null ? (InterestChooseSubItem) CollectionsKt.getOrNull(subItems, i8) : null;
            List<InterestChooseSubItem> subItems2 = interestChooseItem.getSubItems();
            if (subItems2 == null || (mutableList = CollectionsKt.toMutableList(subItems2)) == null) {
                list = null;
            } else {
                if (interestChooseSubItem != null) {
                    mutableList.set(i8, InterestChooseSubItem.a(interestChooseSubItem, !interestChooseSubItem.f77422g, 0, 447));
                }
                list = mutableList;
            }
            mutableList2.set(interestChooseItem.getOriginPos(), InterestChooseItem.copy$default(interestChooseItem, 0L, null, null, null, null, 0, null, null, list, 0, 0, false, 0, false, 0, 32511, null));
            Unit unit = Unit.INSTANCE;
            interestChooseA = InterestChoose.a(interestChoose2, mutableList2, null, null, 536870895);
        }
        mutableStateFlow.setValue(interestChooseA);
    }

    public final void g(int i7) {
        this.f76503k.setValue(Integer.valueOf(i7));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(@org.jetbrains.annotations.Nullable com.bilibili.pegasus.data.interestchoose.InterestChoose r23) {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.v27.vm.InterestChooseV27PageViewModel.h(com.bilibili.pegasus.data.interestchoose.InterestChoose):void");
    }
}
