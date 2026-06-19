package com.bilibili.pegasus.components.interest.ui.v37.page;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import aq0.C4842T;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.app.comm.list.widget.utils.PaddingUtilsKt;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.pegasus.components.interest.ui.v37.vm.InterestChooseV37PageViewModel;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v37/page/InterestChooseV37ThirdTab.class */
@StabilityInferred(parameters = 0)
public final class InterestChooseV37ThirdTab extends androidx_fragment_app_Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public C4842T f76888b;

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v37.page.InterestChooseV37ThirdTab$onViewCreated$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v37/page/InterestChooseV37ThirdTab$onViewCreated$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final InterestChooseV37ThirdTab this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v37.page.InterestChooseV37ThirdTab$onViewCreated$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v37/page/InterestChooseV37ThirdTab$onViewCreated$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<InterestChoose, Continuation<? super Boolean>, Object> {
            Object L$0;
            int label;

            public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
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
        public AnonymousClass2(InterestChooseV37ThirdTab interestChooseV37ThirdTab, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = interestChooseV37ThirdTab;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
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
                InterestChooseV37PageViewModel interestChooseV37PageViewModel = j.f76896a;
                if (interestChooseV37PageViewModel != null && (stateFlow = interestChooseV37PageViewModel.f76903d) != null) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                    this.label = 1;
                    Object objFirst = FlowKt.first(stateFlow, anonymousClass1, this);
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
                InterestChooseV37ThirdTab interestChooseV37ThirdTab = this.this$0;
                C4842T c4842t = interestChooseV37ThirdTab.f76888b;
                if (c4842t != null) {
                    c4842t.f53869g.setText(interestChoose.M());
                }
                C4842T c4842t2 = interestChooseV37ThirdTab.f76888b;
                if (c4842t2 != null) {
                    c4842t2.f53868f.setText(interestChoose.L());
                }
                C4842T c4842t3 = interestChooseV37ThirdTab.f76888b;
                if (c4842t3 != null) {
                    c4842t3.f53866d.setVisibility(0);
                }
                C4842T c4842t4 = interestChooseV37ThirdTab.f76888b;
                if (c4842t4 != null) {
                    c4842t4.f53866d.setOnClickListener(new NR0.j(interestChoose, 1));
                }
                C4842T c4842t5 = interestChooseV37ThirdTab.f76888b;
                if (c4842t5 != null) {
                    c4842t5.f53865c.setOnClickListener(new Cx.g(interestChoose, 3));
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C4842T c4842tInflate = C4842T.inflate(layoutInflater);
        this.f76888b = c4842tInflate;
        return c4842tInflate.f53863a;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f76888b = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 != null) {
            ScreenAdjustUtilsKt.collectWindowSize$default(fragmentActivityP3, false, new Lr0.e(this, 4), 1, (Object) null);
        }
        C4842T c4842t = this.f76888b;
        if (c4842t != null) {
            PaddingUtilsKt.setPaddingTop(c4842t.f53867e, ListExtentionsKt.toPx(10));
        }
        C4842T c4842t2 = this.f76888b;
        if (c4842t2 != null) {
            c4842t2.f53867e.setItemAnimator(null);
        }
        C4842T c4842t3 = this.f76888b;
        if (c4842t3 != null) {
            c4842t3.f53867e.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        C4842T c4842t4 = this.f76888b;
        if (c4842t4 != null) {
            c4842t4.f53867e.setAdapter(new Wo0.f(new l(this), new com.bilibili.gripper.container.downloader.f(this, 1)));
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV37ThirdTab$initRv$3(this, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
    }
}
