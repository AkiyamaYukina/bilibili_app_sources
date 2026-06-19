package com.bilibili.pegasus.components.interest.ui.v35.page;

import Ct0.u;
import So0.k;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import aq0.C4825B;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.app.comm.list.widget.utils.PaddingUtilsKt;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.pegasus.components.interest.ui.v35.vm.InterestChooseV35PageViewModel;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v35/page/InterestChooseV35ThirdTab.class */
@StabilityInferred(parameters = 0)
public final class InterestChooseV35ThirdTab extends androidx_fragment_app_Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public C4825B f76801b;

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v35.page.InterestChooseV35ThirdTab$onViewCreated$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v35/page/InterestChooseV35ThirdTab$onViewCreated$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final InterestChooseV35ThirdTab this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v35.page.InterestChooseV35ThirdTab$onViewCreated$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v35/page/InterestChooseV35ThirdTab$onViewCreated$1$1.class */
        public static final class C04981 extends SuspendLambda implements Function2<InterestChoose, Continuation<? super Boolean>, Object> {
            Object L$0;
            int label;

            public C04981(Continuation<? super C04981> continuation) {
                super(2, continuation);
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C04981 c04981 = new C04981(continuation);
                c04981.L$0 = obj;
                return c04981;
            }

            public final Object invoke(InterestChoose interestChoose, Continuation<? super Boolean> continuation) {
                return create(interestChoose, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(((InterestChoose) this.L$0) != null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterestChooseV35ThirdTab interestChooseV35ThirdTab, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = interestChooseV35ThirdTab;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            StateFlow<InterestChoose> stateFlow;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                InterestChooseV35PageViewModel interestChooseV35PageViewModel = c.f76804a;
                if (interestChooseV35PageViewModel != null && (stateFlow = interestChooseV35PageViewModel.f76819d) != null) {
                    C04981 c04981 = new C04981(null);
                    this.label = 1;
                    Object objFirst = FlowKt.first(stateFlow, c04981, this);
                    obj = objFirst;
                    if (objFirst == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            InterestChoose interestChoose = (InterestChoose) obj;
            if (interestChoose != null) {
                InterestChooseV35ThirdTab interestChooseV35ThirdTab = this.this$0;
                C4825B c4825b = interestChooseV35ThirdTab.f76801b;
                if (c4825b != null) {
                    c4825b.f53668g.setText(interestChoose.M());
                }
                C4825B c4825b2 = interestChooseV35ThirdTab.f76801b;
                if (c4825b2 != null) {
                    c4825b2.f53667f.setText(interestChoose.L());
                }
                C4825B c4825b3 = interestChooseV35ThirdTab.f76801b;
                if (c4825b3 != null) {
                    c4825b3.f53665d.setVisibility(0);
                }
                C4825B c4825b4 = interestChooseV35ThirdTab.f76801b;
                if (c4825b4 != null) {
                    c4825b4.f53665d.setOnClickListener(new u(interestChoose, 4));
                }
                C4825B c4825b5 = interestChooseV35ThirdTab.f76801b;
                if (c4825b5 != null) {
                    c4825b5.f53664c.setOnClickListener(new Zu.d(interestChoose, 2));
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C4825B c4825bInflate = C4825B.inflate(layoutInflater);
        this.f76801b = c4825bInflate;
        return c4825bInflate.f53662a;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f76801b = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        C4825B c4825b = this.f76801b;
        if (c4825b != null) {
            PaddingUtilsKt.setPaddingTop(c4825b.f53666e, ListExtentionsKt.toPx(10));
        }
        C4825B c4825b2 = this.f76801b;
        if (c4825b2 != null) {
            c4825b2.f53666e.setItemAnimator(null);
        }
        C4825B c4825b3 = this.f76801b;
        if (c4825b3 != null) {
            c4825b3.f53666e.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        C4825B c4825b4 = this.f76801b;
        if (c4825b4 != null) {
            c4825b4.f53666e.setAdapter(new k(new Zu.e(1, this), new NQ.a(this, 1)));
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV35ThirdTab$initRv$3(this, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
