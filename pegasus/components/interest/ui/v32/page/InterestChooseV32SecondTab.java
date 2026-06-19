package com.bilibili.pegasus.components.interest.ui.v32.page;

import No0.q;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v32/page/InterestChooseV32SecondTab.class */
@StabilityInferred(parameters = 0)
public final class InterestChooseV32SecondTab extends androidx_fragment_app_Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public C4879p f76668b;

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v32.page.InterestChooseV32SecondTab$onViewCreated$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v32/page/InterestChooseV32SecondTab$onViewCreated$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final InterestChooseV32SecondTab this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v32.page.InterestChooseV32SecondTab$onViewCreated$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v32/page/InterestChooseV32SecondTab$onViewCreated$1$1.class */
        public static final class C04931 extends SuspendLambda implements Function2<Fo0.k, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final InterestChooseV32SecondTab this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04931(InterestChooseV32SecondTab interestChooseV32SecondTab, Continuation<? super C04931> continuation) {
                super(2, continuation);
                this.this$0 = interestChooseV32SecondTab;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C04931 c04931 = new C04931(this.this$0, continuation);
                c04931.L$0 = obj;
                return c04931;
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
                final InterestChooseV32SecondTab interestChooseV32SecondTab = this.this$0;
                Fo0.h hVar = kVar.f6370a;
                C4879p c4879p = interestChooseV32SecondTab.f76668b;
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
                    tintTextView.setText(hVar.f6342i);
                }
                C4879p c4879p2 = interestChooseV32SecondTab.f76668b;
                if (c4879p2 != null) {
                    c4879p2.f54119e.setTextSize(12.0f);
                }
                C4879p c4879p3 = interestChooseV32SecondTab.f76668b;
                if (c4879p3 != null) {
                    c4879p3.f54119e.setText(hVar.f6348o);
                }
                C4879p c4879p4 = interestChooseV32SecondTab.f76668b;
                if (c4879p4 != null) {
                    c4879p4.f54117c.setVisibility(0);
                }
                C4879p c4879p5 = interestChooseV32SecondTab.f76668b;
                if (c4879p5 != null) {
                    final int i7 = 0;
                    c4879p5.f54117c.setOnClickListener(new View.OnClickListener(i7, interestChooseV32SecondTab) { // from class: com.bilibili.pegasus.components.interest.ui.v32.page.i

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final int f76683a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final androidx_fragment_app_Fragment f76684b;

                        {
                            this.f76683a = i7;
                            this.f76684b = interestChooseV32SecondTab;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
                        @Override // android.view.View.OnClickListener
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final void onClick(android.view.View r7) {
                            /*
                                Method dump skipped, instruction units count: 332
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.v32.page.i.onClick(android.view.View):void");
                        }
                    });
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterestChooseV32SecondTab interestChooseV32SecondTab, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = interestChooseV32SecondTab;
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
                    C04931 c04931 = new C04931(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlow, c04931, this) == coroutine_suspended) {
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
        this.f76668b = c4879pInflate;
        return c4879pInflate != null ? c4879pInflate.f54115a : null;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f76668b = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        C4879p c4879p = this.f76668b;
        if (c4879p != null) {
            PaddingUtilsKt.setPaddingTop(c4879p.f54118d, ListExtentionsKt.toPx(16.5d));
        }
        C4879p c4879p2 = this.f76668b;
        if (c4879p2 != null) {
            c4879p2.f54118d.setItemAnimator(null);
        }
        C4879p c4879p3 = this.f76668b;
        if (c4879p3 != null) {
            c4879p3.f54118d.setOverScrollMode(2);
        }
        C4879p c4879p4 = this.f76668b;
        if (c4879p4 != null) {
            RecyclerView recyclerView = c4879p4.f54118d;
            GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
            gridLayoutManager.setSpanSizeLookup(new l(this));
            recyclerView.setLayoutManager(gridLayoutManager);
        }
        C4879p c4879p5 = this.f76668b;
        if (c4879p5 != null) {
            c4879p5.f54118d.setAdapter(new q(new j(this, 0), new k(this)));
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV32SecondTab$initRv$4(this, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        s.c(this, new com.bilibili.bililive.biz.interactionpanel.pk.history.c(this, 2));
    }
}
