package com.bilibili.pegasus.components.interest.ui.v37.page;

import Cw0.m;
import Cw0.n;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.OneShotPreDrawListener;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.GridLayoutManager;
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
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v37/page/InterestChooseV37SecondTab.class */
@StabilityInferred(parameters = 0)
public final class InterestChooseV37SecondTab extends androidx_fragment_app_Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public C4842T f76887b;

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v37.page.InterestChooseV37SecondTab$onViewCreated$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v37/page/InterestChooseV37SecondTab$onViewCreated$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final InterestChooseV37SecondTab this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v37.page.InterestChooseV37SecondTab$onViewCreated$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v37/page/InterestChooseV37SecondTab$onViewCreated$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<InterestChoose, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final InterestChooseV37SecondTab this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InterestChooseV37SecondTab interestChooseV37SecondTab, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = interestChooseV37SecondTab;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
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
                    InterestChooseV37SecondTab interestChooseV37SecondTab = this.this$0;
                    C4842T c4842t = interestChooseV37SecondTab.f76887b;
                    if (c4842t != null) {
                        c4842t.f53869g.setText(interestChoose.J());
                    }
                    C4842T c4842t2 = interestChooseV37SecondTab.f76887b;
                    if (c4842t2 != null) {
                        c4842t2.f53868f.setText(interestChoose.I());
                    }
                    C4842T c4842t3 = interestChooseV37SecondTab.f76887b;
                    if (c4842t3 != null) {
                        c4842t3.f53866d.setVisibility(0);
                    }
                    C4842T c4842t4 = interestChooseV37SecondTab.f76887b;
                    if (c4842t4 != null) {
                        c4842t4.f53866d.setOnClickListener(new Cx.b(interestChoose, 3));
                    }
                    C4842T c4842t5 = interestChooseV37SecondTab.f76887b;
                    if (c4842t5 != null) {
                        c4842t5.f53865c.setOnClickListener(new com.bilibili.app.gemini.ugc.feature.endpage.c(interestChoose, 1));
                    }
                    C4842T c4842t6 = interestChooseV37SecondTab.f76887b;
                    if (c4842t6 != null) {
                        FrameLayout frameLayout = c4842t6.f53865c;
                        OneShotPreDrawListener.add(frameLayout, new k(frameLayout, interestChoose));
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(InterestChooseV37SecondTab interestChooseV37SecondTab, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = interestChooseV37SecondTab;
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
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C4842T c4842tInflate = C4842T.inflate(layoutInflater);
        this.f76887b = c4842tInflate;
        return c4842tInflate.f53863a;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f76887b = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 != null) {
            ScreenAdjustUtilsKt.collectWindowSize$default(fragmentActivityP3, false, new m(this, 3), 1, (Object) null);
        }
        C4842T c4842t = this.f76887b;
        if (c4842t != null) {
            PaddingUtilsKt.setPaddingTop(c4842t.f53867e, ListExtentionsKt.toPx(12.5d));
        }
        C4842T c4842t2 = this.f76887b;
        if (c4842t2 != null) {
            c4842t2.f53867e.setItemAnimator(null);
        }
        C4842T c4842t3 = this.f76887b;
        if (c4842t3 != null) {
            c4842t3.f53867e.setLayoutManager(new GridLayoutManager(getContext(), 2));
        }
        C4842T c4842t4 = this.f76887b;
        if (c4842t4 != null) {
            c4842t4.f53867e.setAdapter(new Wo0.e(new n(this, 2), new Lr0.a(this, 1)));
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV37SecondTab$initRv$3(this, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
    }
}
