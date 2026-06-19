package com.bilibili.pegasus.components.interest.ui.v28.page;

import Jh.u;
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
import com.bilibili.pegasus.components.interest.ui.v27.vm.InterestChooseV27PageViewModel;
import com.bilibili.pegasus.components.interest.ui.v27.vm.InterestChooseV27PageViewModel$special$$inlined$map$3;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import com.bilibili.pegasus.data.interestchoose.InterestChooseItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
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
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v28/page/InterestChooseV28SecondTab.class */
@StabilityInferred(parameters = 0)
public final class InterestChooseV28SecondTab extends androidx_fragment_app_Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u f76521b;

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v28.page.InterestChooseV28SecondTab$onViewCreated$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v28/page/InterestChooseV28SecondTab$onViewCreated$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final InterestChooseV28SecondTab this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v28.page.InterestChooseV28SecondTab$onViewCreated$4$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v28/page/InterestChooseV28SecondTab$onViewCreated$4$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<List<? extends InterestChooseItem>, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final InterestChooseV28SecondTab this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InterestChooseV28SecondTab interestChooseV28SecondTab, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = interestChooseV28SecondTab;
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
                u uVar = this.this$0.f76521b;
                u uVar2 = uVar;
                if (uVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    uVar2 = null;
                }
                RecyclerView.Adapter adapter = uVar2.c.getAdapter();
                Io0.i iVar = null;
                if (adapter instanceof Io0.i) {
                    iVar = (Io0.i) adapter;
                }
                if (iVar != null) {
                    DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new Bo0.i(iVar.f10352c, list));
                    ((ArrayList) iVar.f10352c).clear();
                    ((ArrayList) iVar.f10352c).addAll(list);
                    diffResultCalculateDiff.dispatchUpdatesTo(iVar);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(InterestChooseV28SecondTab interestChooseV28SecondTab, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = interestChooseV28SecondTab;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            InterestChooseV27PageViewModel$special$$inlined$map$3 interestChooseV27PageViewModel$special$$inlined$map$3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                InterestChooseV27PageViewModel interestChooseV27PageViewModel = e.f76528a;
                if (interestChooseV27PageViewModel != null && (interestChooseV27PageViewModel$special$$inlined$map$3 = interestChooseV27PageViewModel.f76502j) != null) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(interestChooseV27PageViewModel$special$$inlined$map$3, anonymousClass1, this) == coroutine_suspended) {
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
        this.f76521b = u.inflate(layoutInflater);
        BLog.d("InterestChooseV28SecondTab", "onCreateView");
        u uVar = this.f76521b;
        u uVar2 = uVar;
        if (uVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            uVar2 = null;
        }
        return uVar2.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View$OnClickListener, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        StateFlow<InterestChoose> stateFlow;
        InterestChoose interestChoose;
        super.onViewCreated(view, bundle);
        u uVar = this.f76521b;
        u uVar2 = uVar;
        if (uVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            uVar2 = null;
        }
        ListExtentionsKt.visible(uVar2.b);
        u uVar3 = this.f76521b;
        u uVar4 = uVar3;
        if (uVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            uVar4 = null;
        }
        uVar4.b.setOnClickListener(new Object());
        InterestChooseV27PageViewModel interestChooseV27PageViewModel = e.f76528a;
        if (interestChooseV27PageViewModel == null || (stateFlow = interestChooseV27PageViewModel.f76495b) == null || (interestChoose = (InterestChoose) stateFlow.getValue()) == null) {
            return;
        }
        u uVar5 = this.f76521b;
        u uVar6 = uVar5;
        if (uVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            uVar6 = null;
        }
        uVar6.e.setText(interestChoose.J());
        u uVar7 = this.f76521b;
        u uVar8 = uVar7;
        if (uVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            uVar8 = null;
        }
        uVar8.d.setText(interestChoose.F());
        u uVar9 = this.f76521b;
        u uVar10 = uVar9;
        if (uVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            uVar10 = null;
        }
        uVar10.c.setItemAnimator(null);
        u uVar11 = this.f76521b;
        u uVar12 = uVar11;
        if (uVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            uVar12 = null;
        }
        uVar12.c.setLayoutManager(new LinearLayoutManager(getContext()));
        u uVar13 = this.f76521b;
        u uVar14 = uVar13;
        if (uVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            uVar14 = null;
        }
        uVar14.c.setOverScrollMode(2);
        u uVar15 = this.f76521b;
        u uVar16 = uVar15;
        if (uVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            uVar16 = null;
        }
        uVar16.c.setAdapter(new Io0.i(new j(this), new k(this, 0)));
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this, null), 3, (Object) null);
    }
}
