package com.bilibili.pegasus.components.interest.ui.v27.page;

import Cr.w;
import R9.k;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import aq0.C4874m0;
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
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v27/page/InterestChooseV27SecondTab.class */
@StabilityInferred(parameters = 0)
public final class InterestChooseV27SecondTab extends androidx_fragment_app_Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public C4874m0 f76479b;

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v27.page.InterestChooseV27SecondTab$onViewCreated$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v27/page/InterestChooseV27SecondTab$onViewCreated$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final InterestChooseV27SecondTab this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v27.page.InterestChooseV27SecondTab$onViewCreated$4$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v27/page/InterestChooseV27SecondTab$onViewCreated$4$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<List<? extends InterestChooseItem>, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final InterestChooseV27SecondTab this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InterestChooseV27SecondTab interestChooseV27SecondTab, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = interestChooseV27SecondTab;
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
                RecyclerView recyclerView;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                List list = (List) this.L$0;
                C4874m0 c4874m0 = this.this$0.f76479b;
                Go0.i iVar = null;
                RecyclerView.Adapter adapter = (c4874m0 == null || (recyclerView = c4874m0.f54097e) == null) ? null : recyclerView.getAdapter();
                if (adapter instanceof Go0.i) {
                    iVar = (Go0.i) adapter;
                }
                if (iVar != null) {
                    DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new Bo0.i(iVar.f7322c, list));
                    ((ArrayList) iVar.f7322c).clear();
                    ((ArrayList) iVar.f7322c).addAll(list);
                    diffResultCalculateDiff.dispatchUpdatesTo(iVar);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(InterestChooseV27SecondTab interestChooseV27SecondTab, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = interestChooseV27SecondTab;
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
                InterestChooseV27PageViewModel interestChooseV27PageViewModel = c.f76482a;
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
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        C4874m0 c4874m0Inflate = C4874m0.inflate(layoutInflater);
        this.f76479b = c4874m0Inflate;
        return c4874m0Inflate != null ? c4874m0Inflate.f54093a : null;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f76479b = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        StateFlow<InterestChoose> stateFlow;
        InterestChoose interestChoose;
        super.onViewCreated(view, bundle);
        C4874m0 c4874m0 = this.f76479b;
        if (c4874m0 != null) {
            c4874m0.f54096d.setVisibility(0);
        }
        C4874m0 c4874m02 = this.f76479b;
        if (c4874m02 != null) {
            final int i7 = 0;
            c4874m02.f54096d.setOnClickListener(new View.OnClickListener(i7) { // from class: com.bilibili.pegasus.components.interest.ui.v27.page.i

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f76491a;

                {
                    this.f76491a = i7;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (this.f76491a) {
                        case 0:
                            InterestChooseV27PageViewModel interestChooseV27PageViewModel = c.f76482a;
                            if (interestChooseV27PageViewModel != null) {
                                interestChooseV27PageViewModel.g(0);
                            }
                            break;
                        default:
                            float f7 = com.mall.ui.page.home.plantseeds.viewholder.j.i;
                            break;
                    }
                }
            });
        }
        InterestChooseV27PageViewModel interestChooseV27PageViewModel = c.f76482a;
        if (interestChooseV27PageViewModel == null || (stateFlow = interestChooseV27PageViewModel.f76495b) == null || (interestChoose = (InterestChoose) stateFlow.getValue()) == null) {
            return;
        }
        C4874m0 c4874m03 = this.f76479b;
        if (c4874m03 != null) {
            c4874m03.f54099g.setText(interestChoose.J());
        }
        C4874m0 c4874m04 = this.f76479b;
        if (c4874m04 != null) {
            c4874m04.f54098f.setText(interestChoose.F());
        }
        C4874m0 c4874m05 = this.f76479b;
        if (c4874m05 != null) {
            c4874m05.f54097e.setItemAnimator(null);
        }
        C4874m0 c4874m06 = this.f76479b;
        if (c4874m06 != null) {
            c4874m06.f54097e.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        C4874m0 c4874m07 = this.f76479b;
        if (c4874m07 != null) {
            c4874m07.f54097e.setAdapter(new Go0.i(new k(this, 2), new j(this, 0)));
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this, null), 3, (Object) null);
        C4874m0 c4874m08 = this.f76479b;
        if (c4874m08 != null) {
            c4874m08.f54095c.setOnClickListener(new w(interestChoose, 4));
        }
    }
}
