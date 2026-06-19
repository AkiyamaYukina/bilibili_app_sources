package com.bilibili.pegasus.components.interest.ui.v31.page;

import Mo0.w;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import aq0.C4867j;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.app.comm.list.widget.utils.PaddingUtilsKt;
import com.bilibili.app.comm.list.widget.utils.s;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.pegasus.components.interest.t;
import com.bilibili.pegasus.components.interest.ui.v31.vm.InterestChooseV31PageViewModel;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v31/page/InterestChooseV31ThirdTab.class */
@StabilityInferred(parameters = 0)
public final class InterestChooseV31ThirdTab extends androidx_fragment_app_Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public C4867j f76608b;

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v31.page.InterestChooseV31ThirdTab$onViewCreated$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v31/page/InterestChooseV31ThirdTab$onViewCreated$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final InterestChooseV31ThirdTab this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v31.page.InterestChooseV31ThirdTab$onViewCreated$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v31/page/InterestChooseV31ThirdTab$onViewCreated$1$1.class */
        public static final class C04921 extends SuspendLambda implements Function2<Fo0.k, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final InterestChooseV31ThirdTab this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04921(InterestChooseV31ThirdTab interestChooseV31ThirdTab, Continuation<? super C04921> continuation) {
                super(2, continuation);
                this.this$0 = interestChooseV31ThirdTab;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C04921 c04921 = new C04921(this.this$0, continuation);
                c04921.L$0 = obj;
                return c04921;
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
                final InterestChooseV31ThirdTab interestChooseV31ThirdTab = this.this$0;
                final Fo0.h hVar = kVar.f6370a;
                C4867j c4867j = interestChooseV31ThirdTab.f76608b;
                if (c4867j != null) {
                    c4867j.f54068g.setText(hVar.f6343j);
                }
                C4867j c4867j2 = interestChooseV31ThirdTab.f76608b;
                if (c4867j2 != null) {
                    c4867j2.f54067f.setText(hVar.f6349p);
                }
                C4867j c4867j3 = interestChooseV31ThirdTab.f76608b;
                if (c4867j3 != null) {
                    c4867j3.f54065d.setVisibility(0);
                }
                C4867j c4867j4 = interestChooseV31ThirdTab.f76608b;
                if (c4867j4 != null) {
                    c4867j4.f54065d.setOnClickListener(new com.bilibili.app.gemini.player.widget.like.c(interestChooseV31ThirdTab, 1));
                }
                C4867j c4867j5 = interestChooseV31ThirdTab.f76608b;
                if (c4867j5 != null) {
                    c4867j5.f54064c.setOnClickListener(new View.OnClickListener(interestChooseV31ThirdTab, hVar) { // from class: com.bilibili.pegasus.components.interest.ui.v31.page.n

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final InterestChooseV31ThirdTab f76626a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final Fo0.h f76627b;

                        {
                            this.f76626a = interestChooseV31ThirdTab;
                            this.f76627b = hVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            InterestChooseV31ThirdTab interestChooseV31ThirdTab2 = this.f76626a;
                            Fo0.h hVar2 = this.f76627b;
                            t.b(view.getContext(), interestChooseV31ThirdTab2.hf(), hVar2.f6336b, hVar2.f6337c, null, null, 56);
                        }
                    });
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterestChooseV31ThirdTab interestChooseV31ThirdTab, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = interestChooseV31ThirdTab;
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
                InterestChooseV31PageViewModel interestChooseV31PageViewModelHf = this.this$0.hf();
                if (interestChooseV31PageViewModelHf != null && (stateFlow = interestChooseV31PageViewModelHf.f76634g) != null) {
                    C04921 c04921 = new C04921(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlow, c04921, this) == coroutine_suspended) {
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

    public final InterestChooseV31PageViewModel hf() {
        Fragment parentFragment = getParentFragment();
        InterestChooseV31PageViewModel interestChooseV31PageViewModelKf = null;
        InterestChooseV31Dialog interestChooseV31Dialog = parentFragment instanceof InterestChooseV31Dialog ? (InterestChooseV31Dialog) parentFragment : null;
        if (interestChooseV31Dialog != null) {
            interestChooseV31PageViewModelKf = interestChooseV31Dialog.kf();
        }
        return interestChooseV31PageViewModelKf;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        C4867j c4867jInflate = C4867j.inflate(layoutInflater);
        this.f76608b = c4867jInflate;
        return c4867jInflate != null ? c4867jInflate.f54062a : null;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f76608b = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        C4867j c4867j = this.f76608b;
        if (c4867j != null) {
            PaddingUtilsKt.setPaddingTop(c4867j.f54066e, ListExtentionsKt.toPx(41));
        }
        C4867j c4867j2 = this.f76608b;
        if (c4867j2 != null) {
            c4867j2.f54066e.setItemAnimator(null);
        }
        C4867j c4867j3 = this.f76608b;
        if (c4867j3 != null) {
            c4867j3.f54066e.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        C4867j c4867j4 = this.f76608b;
        if (c4867j4 != null) {
            c4867j4.f54066e.setAdapter(new w(new l(this), new m(this), new RE.g(this, 3)));
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV31ThirdTab$initRv$4(this, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        s.c(this, new Zj0.h(this, 4));
    }
}
