package com.bilibili.pegasus.components.interest.ui.v36.page;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import aq0.C4831H;
import bS.h;
import com.bilibili.ad.adview.search.inline.card155.q0;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.app.comm.list.widget.utils.PaddingUtilsKt;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.pegasus.components.interest.ui.v36.vm.InterestChooseV36PageViewModel;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v36/page/InterestChooseV36SecondTab.class */
@StabilityInferred(parameters = 0)
public final class InterestChooseV36SecondTab extends androidx_fragment_app_Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public C4831H f76847b;

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v36.page.InterestChooseV36SecondTab$onViewCreated$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v36/page/InterestChooseV36SecondTab$onViewCreated$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final InterestChooseV36SecondTab this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v36.page.InterestChooseV36SecondTab$onViewCreated$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v36/page/InterestChooseV36SecondTab$onViewCreated$1$1.class */
        public static final class C05001 extends SuspendLambda implements Function2<InterestChoose, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final InterestChooseV36SecondTab this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05001(InterestChooseV36SecondTab interestChooseV36SecondTab, Continuation<? super C05001> continuation) {
                super(2, continuation);
                this.this$0 = interestChooseV36SecondTab;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C05001 c05001 = new C05001(this.this$0, continuation);
                c05001.L$0 = obj;
                return c05001;
            }

            public final Object invoke(InterestChoose interestChoose, Continuation<? super Unit> continuation) {
                return create(interestChoose, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                InterestChoose interestChoose = (InterestChoose) this.L$0;
                if (interestChoose != null) {
                    InterestChooseV36SecondTab interestChooseV36SecondTab = this.this$0;
                    C4831H c4831h = interestChooseV36SecondTab.f76847b;
                    if (c4831h != null) {
                        c4831h.f53714f.setText(interestChoose.M());
                    }
                    C4831H c4831h2 = interestChooseV36SecondTab.f76847b;
                    if (c4831h2 != null) {
                        c4831h2.f53713e.setText(interestChoose.L());
                    }
                    C4831H c4831h3 = interestChooseV36SecondTab.f76847b;
                    if (c4831h3 != null) {
                        c4831h3.f53711c.setVisibility(0);
                    }
                    C4831H c4831h4 = interestChooseV36SecondTab.f76847b;
                    if (c4831h4 != null) {
                        c4831h4.f53711c.setOnClickListener(new h(interestChoose, 2));
                    }
                    C4831H c4831h5 = interestChooseV36SecondTab.f76847b;
                    if (c4831h5 != null) {
                        c4831h5.f53710b.setOnClickListener(new WY.b(interestChoose, 2));
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterestChooseV36SecondTab interestChooseV36SecondTab, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = interestChooseV36SecondTab;
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
                InterestChooseV36PageViewModel interestChooseV36PageViewModel = c.f76850a;
                if (interestChooseV36PageViewModel != null && (stateFlow = interestChooseV36PageViewModel.f76856b) != null) {
                    C05001 c05001 = new C05001(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlow, c05001, this) == coroutine_suspended) {
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
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C4831H c4831hInflate = C4831H.inflate(layoutInflater);
        this.f76847b = c4831hInflate;
        return c4831hInflate.f53709a;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f76847b = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        C4831H c4831h = this.f76847b;
        if (c4831h != null) {
            PaddingUtilsKt.setPaddingTop(c4831h.f53712d, ListExtentionsKt.toPx(10));
        }
        C4831H c4831h2 = this.f76847b;
        if (c4831h2 != null) {
            c4831h2.f53712d.setItemAnimator(null);
        }
        C4831H c4831h3 = this.f76847b;
        if (c4831h3 != null) {
            c4831h3.f53712d.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        C4831H c4831h4 = this.f76847b;
        if (c4831h4 != null) {
            c4831h4.f53712d.setAdapter(new Uo0.g(new q0(this, 1), new g(this)));
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV36SecondTab$initRv$3(this, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
