package com.bilibili.playset.detail.widget;

import androidx.compose.foundation.lazy.grid.InterfaceC3458u;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.runtime.SnapshotStateKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/widget/StaggeredMixedLayoutKt$onItemExposureWithReset$1$1.class */
public final class StaggeredMixedLayoutKt$onItemExposureWithReset$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Set<Integer> $exposedIndices;
    final Function1<Integer, Unit> $onExposure;
    final LazyGridState $this_onItemExposureWithReset;
    int label;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/widget/StaggeredMixedLayoutKt$onItemExposureWithReset$1$1$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set<Integer> f84624a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Function1<Integer, Unit> f84625b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Set<Integer> set, Function1<? super Integer, Unit> function1) {
            this.f84624a = set;
            this.f84625b = function1;
        }

        public final Object emit(Object obj, Continuation continuation) {
            Sequence sequenceFilter = SequencesKt.filter(CollectionsKt.asSequence((List) obj), new DJ.i(this.f84624a, 2));
            Set<Integer> set = this.f84624a;
            Iterator it = sequenceFilter.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                set.add(Boxing.boxInt(iIntValue));
                this.f84625b.invoke(Boxing.boxInt(iIntValue));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public StaggeredMixedLayoutKt$onItemExposureWithReset$1$1(LazyGridState lazyGridState, Set<Integer> set, Function1<? super Integer, Unit> function1, Continuation<? super StaggeredMixedLayoutKt$onItemExposureWithReset$1$1> continuation) {
        super(2, continuation);
        this.$this_onItemExposureWithReset = lazyGridState;
        this.$exposedIndices = set;
        this.$onExposure = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List invokeSuspend$lambda$0(LazyGridState lazyGridState) {
        List<InterfaceC3458u> visibleItemsInfo = lazyGridState.getLayoutInfo().getVisibleItemsInfo();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(visibleItemsInfo, 10));
        Iterator<T> it = visibleItemsInfo.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((InterfaceC3458u) it.next()).getIndex()));
        }
        return arrayList;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StaggeredMixedLayoutKt$onItemExposureWithReset$1$1(this.$this_onItemExposureWithReset, this.$exposedIndices, this.$onExposure, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            final LazyGridState lazyGridState = this.$this_onItemExposureWithReset;
            Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0(lazyGridState) { // from class: com.bilibili.playset.detail.widget.P

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final LazyGridState f84622a;

                {
                    this.f84622a = lazyGridState;
                }

                public final Object invoke() {
                    return StaggeredMixedLayoutKt$onItemExposureWithReset$1$1.invokeSuspend$lambda$0(this.f84622a);
                }
            });
            a aVar = new a(this.$exposedIndices, this.$onExposure);
            this.label = 1;
            if (flowSnapshotFlow.collect(aVar, this) == coroutine_suspended) {
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
