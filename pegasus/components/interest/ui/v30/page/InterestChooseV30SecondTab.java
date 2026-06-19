package com.bilibili.pegasus.components.interest.ui.v30.page;

import Jh.v;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.module.vip.mall.u;
import com.bilibili.pegasus.components.interest.ui.v30.vm.InterestChooseV30PageViewModel;
import com.bilibili.pegasus.components.interest.ui.v30.vm.InterestChooseV30PageViewModel$special$$inlined$map$3;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import com.bilibili.pegasus.data.interestchoose.InterestChooseItem;
import com.bilibili.pegasus.data.interestchoose.InterestChooseSubItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v30/page/InterestChooseV30SecondTab.class */
@StabilityInferred(parameters = 0)
public final class InterestChooseV30SecondTab extends androidx_fragment_app_Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v f76567b;

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v30.page.InterestChooseV30SecondTab$onViewCreated$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v30/page/InterestChooseV30SecondTab$onViewCreated$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final InterestChooseV30SecondTab this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v30.page.InterestChooseV30SecondTab$onViewCreated$4$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v30/page/InterestChooseV30SecondTab$onViewCreated$4$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<List<? extends InterestChooseItem>, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final InterestChooseV30SecondTab this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InterestChooseV30SecondTab interestChooseV30SecondTab, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = interestChooseV30SecondTab;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(List<InterestChooseItem> list, Continuation<? super Unit> continuation) {
                return create(list, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                List list = (List) this.L$0;
                v vVar = this.this$0.f76567b;
                v vVar2 = vVar;
                if (vVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    vVar2 = null;
                }
                RecyclerView.Adapter adapter = vVar2.d.getAdapter();
                Lo0.h hVar = null;
                if (adapter instanceof Lo0.h) {
                    hVar = (Lo0.h) adapter;
                }
                if (hVar != null) {
                    DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new Bo0.i(hVar.f14751c, list));
                    ((ArrayList) hVar.f14751c).clear();
                    ((ArrayList) hVar.f14751c).addAll(list);
                    diffResultCalculateDiff.dispatchUpdatesTo(hVar);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(InterestChooseV30SecondTab interestChooseV30SecondTab, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = interestChooseV30SecondTab;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            InterestChooseV30PageViewModel$special$$inlined$map$3 interestChooseV30PageViewModel$special$$inlined$map$3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                InterestChooseV30PageViewModel interestChooseV30PageViewModel = e.f76574a;
                if (interestChooseV30PageViewModel != null && (interestChooseV30PageViewModel$special$$inlined$map$3 = interestChooseV30PageViewModel.f76585f) != null) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(interestChooseV30PageViewModel$special$$inlined$map$3, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v30.page.InterestChooseV30SecondTab$onViewCreated$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v30/page/InterestChooseV30SecondTab$onViewCreated$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final InterestChooseV30SecondTab this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v30.page.InterestChooseV30SecondTab$onViewCreated$5$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v30/page/InterestChooseV30SecondTab$onViewCreated$5$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            int label;
            final InterestChooseV30SecondTab this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InterestChooseV30SecondTab interestChooseV30SecondTab, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = interestChooseV30SecondTab;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            public final Object invoke(int i7, Continuation<? super Unit> continuation) {
                return create(Integer.valueOf(i7), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).intValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invokeSuspend(Object obj) {
                StateFlow<Integer> stateFlow;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                InterestChooseV30PageViewModel interestChooseV30PageViewModel = e.f76574a;
                if (interestChooseV30PageViewModel != null && (stateFlow = interestChooseV30PageViewModel.h) != null && ((Number) stateFlow.getValue()).intValue() == 1) {
                    v vVar = this.this$0.f76567b;
                    v vVar2 = vVar;
                    if (vVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        vVar2 = null;
                    }
                    RecyclerView.Adapter adapter = vVar2.d.getAdapter();
                    Lo0.h hVar = adapter instanceof Lo0.h ? (Lo0.h) adapter : null;
                    if (hVar != null) {
                        for (InterestChooseItem interestChooseItem : (ArrayList) hVar.f14751c) {
                            List<InterestChooseSubItem> subItems = interestChooseItem.getSubItems();
                            List<InterestChooseSubItem> listEmptyList = subItems;
                            if (subItems == null) {
                                listEmptyList = CollectionsKt.emptyList();
                            }
                            for (InterestChooseSubItem interestChooseSubItem : listEmptyList) {
                                if (!interestChooseSubItem.h) {
                                    hVar.f14750b.invoke(Integer.valueOf(interestChooseItem.getOriginPos()), Integer.valueOf(interestChooseSubItem.f77423i));
                                }
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(InterestChooseV30SecondTab interestChooseV30SecondTab, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = interestChooseV30SecondTab;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass5(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            StateFlow<Integer> stateFlow;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                InterestChooseV30PageViewModel interestChooseV30PageViewModel = e.f76574a;
                if (interestChooseV30PageViewModel != null && (stateFlow = interestChooseV30PageViewModel.h) != null) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        v vVarInflate = v.inflate(layoutInflater);
        this.f76567b = vVarInflate;
        v vVar = vVarInflate;
        if (vVarInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vVar = null;
        }
        return vVar.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View$OnClickListener, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        StateFlow<InterestChoose> stateFlow;
        InterestChoose interestChoose;
        super.onViewCreated(view, bundle);
        v vVar = this.f76567b;
        v vVar2 = vVar;
        if (vVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vVar2 = null;
        }
        ListExtentionsKt.visible(vVar2.c);
        v vVar3 = this.f76567b;
        v vVar4 = vVar3;
        if (vVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vVar4 = null;
        }
        vVar4.c.setOnClickListener(new Object());
        InterestChooseV30PageViewModel interestChooseV30PageViewModel = e.f76574a;
        if (interestChooseV30PageViewModel == null || (stateFlow = interestChooseV30PageViewModel.f76581b) == null || (interestChoose = (InterestChoose) stateFlow.getValue()) == null) {
            return;
        }
        v vVar5 = this.f76567b;
        v vVar6 = vVar5;
        if (vVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vVar6 = null;
        }
        vVar6.f.setText(interestChoose.J());
        v vVar7 = this.f76567b;
        v vVar8 = vVar7;
        if (vVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vVar8 = null;
        }
        vVar8.e.setText(interestChoose.F());
        v vVar9 = this.f76567b;
        v vVar10 = vVar9;
        if (vVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vVar10 = null;
        }
        vVar10.d.setItemAnimator(null);
        v vVar11 = this.f76567b;
        v vVar12 = vVar11;
        if (vVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vVar12 = null;
        }
        vVar12.d.setOverScrollMode(2);
        v vVar13 = this.f76567b;
        v vVar14 = vVar13;
        if (vVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vVar14 = null;
        }
        vVar14.d.setLayoutManager(new LinearLayoutManager(getContext()));
        v vVar15 = this.f76567b;
        v vVar16 = vVar15;
        if (vVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vVar16 = null;
        }
        vVar16.d.setAdapter(new Lo0.h(new u(this, 1), new a71.b(this, 2)));
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this, null), 3, (Object) null);
    }
}
