package com.bilibili.pegasus.components.interest.ui.v32.page;

import No0.w;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.material3.C4231w;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import aq0.C4879p;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.app.comm.list.widget.utils.PaddingUtilsKt;
import com.bilibili.app.comm.list.widget.utils.s;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.pegasus.components.interest.ui.v32.vm.InterestChooseV32PageViewModel;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v32/page/InterestChooseV32ThirdTab.class */
@StabilityInferred(parameters = 0)
public final class InterestChooseV32ThirdTab extends androidx_fragment_app_Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public C4879p f76671b;

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v32.page.InterestChooseV32ThirdTab$onViewCreated$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v32/page/InterestChooseV32ThirdTab$onViewCreated$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final InterestChooseV32ThirdTab this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v32.page.InterestChooseV32ThirdTab$onViewCreated$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v32/page/InterestChooseV32ThirdTab$onViewCreated$1$1.class */
        public static final class C04941 extends SuspendLambda implements Function2<Fo0.k, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final InterestChooseV32ThirdTab this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04941(InterestChooseV32ThirdTab interestChooseV32ThirdTab, Continuation<? super C04941> continuation) {
                super(2, continuation);
                this.this$0 = interestChooseV32ThirdTab;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C04941 c04941 = new C04941(this.this$0, continuation);
                c04941.L$0 = obj;
                return c04941;
            }

            public final Object invoke(Fo0.k kVar, Continuation<? super Unit> continuation) {
                return create(kVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Fo0.k kVar = (Fo0.k) this.L$0;
                InterestChooseV32ThirdTab interestChooseV32ThirdTab = this.this$0;
                Fo0.h hVar = kVar.f6370a;
                C4879p c4879p = interestChooseV32ThirdTab.f76671b;
                if (c4879p != null) {
                    TintTextView tintTextView = c4879p.f54120f;
                    ViewGroup.LayoutParams layoutParams = tintTextView.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = 1;
                    tintTextView.setLayoutParams(marginLayoutParams);
                    tintTextView.setTextSize(16.0f);
                    tintTextView.setText(hVar.f6343j);
                }
                C4879p c4879p2 = interestChooseV32ThirdTab.f76671b;
                if (c4879p2 != null) {
                    c4879p2.f54119e.setTextSize(12.0f);
                }
                C4879p c4879p3 = interestChooseV32ThirdTab.f76671b;
                if (c4879p3 != null) {
                    c4879p3.f54119e.setText(hVar.f6349p);
                }
                C4879p c4879p4 = interestChooseV32ThirdTab.f76671b;
                if (c4879p4 != null) {
                    c4879p4.f54117c.setVisibility(0);
                }
                C4879p c4879p5 = interestChooseV32ThirdTab.f76671b;
                if (c4879p5 != null) {
                    c4879p5.f54117c.setOnClickListener(new RI.a(1, interestChooseV32ThirdTab));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterestChooseV32ThirdTab interestChooseV32ThirdTab, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = interestChooseV32ThirdTab;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            StateFlow<Fo0.k> stateFlow;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                InterestChooseV32PageViewModel interestChooseV32PageViewModelHf = this.this$0.hf();
                if (interestChooseV32PageViewModelHf != null && (stateFlow = interestChooseV32PageViewModelHf.f76698g) != null) {
                    C04941 c04941 = new C04941(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlow, c04941, this) == coroutine_suspended) {
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

    public final InterestChooseV32PageViewModel hf() {
        Object parentFragment = getParentFragment();
        InterestChooseV32PageViewModel interestChooseV32PageViewModelJf = null;
        InterestChooseV32Dialog interestChooseV32Dialog = parentFragment instanceof InterestChooseV32Dialog ? (InterestChooseV32Dialog) parentFragment : null;
        if (interestChooseV32Dialog != null) {
            interestChooseV32PageViewModelJf = interestChooseV32Dialog.jf();
        }
        return interestChooseV32PageViewModelJf;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        C4879p c4879pInflate = C4879p.inflate(layoutInflater);
        this.f76671b = c4879pInflate;
        return c4879pInflate != null ? c4879pInflate.f54115a : null;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f76671b = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        C4879p c4879p = this.f76671b;
        if (c4879p != null) {
            PaddingUtilsKt.setPaddingTop(c4879p.f54118d, ListExtentionsKt.toPx(24));
        }
        C4879p c4879p2 = this.f76671b;
        if (c4879p2 != null) {
            c4879p2.f54118d.setItemAnimator(null);
        }
        C4879p c4879p3 = this.f76671b;
        if (c4879p3 != null) {
            c4879p3.f54118d.setOverScrollMode(2);
        }
        C4879p c4879p4 = this.f76671b;
        if (c4879p4 != null) {
            c4879p4.f54118d.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        C4879p c4879p5 = this.f76671b;
        if (c4879p5 != null) {
            c4879p5.f54118d.setAdapter(new w(new C4231w(this, 1), new m(this), new n(this, 0)));
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV32ThirdTab$initRv$4(this, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        s.c(this, new bL0.e(this, 1));
    }
}
