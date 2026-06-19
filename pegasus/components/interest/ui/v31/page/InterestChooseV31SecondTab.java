package com.bilibili.pegasus.components.interest.ui.v31.page;

import Mo0.q;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import aq0.C4867j;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.app.comm.list.widget.utils.PaddingUtilsKt;
import com.bilibili.app.comm.list.widget.utils.s;
import com.bilibili.bplus.followinglist.page.opus.z;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.pegasus.components.interest.t;
import com.bilibili.pegasus.components.interest.ui.udf.actions.Actions;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v31/page/InterestChooseV31SecondTab.class */
@StabilityInferred(parameters = 0)
public final class InterestChooseV31SecondTab extends androidx_fragment_app_Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public C4867j f76603b;

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v31.page.InterestChooseV31SecondTab$onViewCreated$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v31/page/InterestChooseV31SecondTab$onViewCreated$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final InterestChooseV31SecondTab this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v31.page.InterestChooseV31SecondTab$onViewCreated$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v31/page/InterestChooseV31SecondTab$onViewCreated$1$1.class */
        public static final class C04911 extends SuspendLambda implements Function2<Fo0.k, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final InterestChooseV31SecondTab this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04911(InterestChooseV31SecondTab interestChooseV31SecondTab, Continuation<? super C04911> continuation) {
                super(2, continuation);
                this.this$0 = interestChooseV31SecondTab;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C04911 c04911 = new C04911(this.this$0, continuation);
                c04911.L$0 = obj;
                return c04911;
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
                final InterestChooseV31SecondTab interestChooseV31SecondTab = this.this$0;
                final Fo0.h hVar = kVar.f6370a;
                C4867j c4867j = interestChooseV31SecondTab.f76603b;
                if (c4867j != null) {
                    c4867j.f54068g.setText(hVar.f6342i);
                }
                C4867j c4867j2 = interestChooseV31SecondTab.f76603b;
                if (c4867j2 != null) {
                    c4867j2.f54067f.setText(hVar.f6348o);
                }
                C4867j c4867j3 = interestChooseV31SecondTab.f76603b;
                if (c4867j3 != null) {
                    c4867j3.f54065d.setVisibility(0);
                }
                C4867j c4867j4 = interestChooseV31SecondTab.f76603b;
                if (c4867j4 != null) {
                    c4867j4.f54065d.setOnClickListener(new View.OnClickListener(interestChooseV31SecondTab) { // from class: com.bilibili.pegasus.components.interest.ui.v31.page.i

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final InterestChooseV31SecondTab f76620a;

                        {
                            this.f76620a = interestChooseV31SecondTab;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            InterestChooseV31PageViewModel interestChooseV31PageViewModelHf = this.f76620a.hf();
                            if (interestChooseV31PageViewModelHf != null) {
                                interestChooseV31PageViewModelHf.I0(Actions.e.f76422a);
                            }
                        }
                    });
                }
                C4867j c4867j5 = interestChooseV31SecondTab.f76603b;
                if (c4867j5 != null) {
                    c4867j5.f54064c.setOnClickListener(new View.OnClickListener(interestChooseV31SecondTab, hVar) { // from class: com.bilibili.pegasus.components.interest.ui.v31.page.j

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final InterestChooseV31SecondTab f76621a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final Fo0.h f76622b;

                        {
                            this.f76621a = interestChooseV31SecondTab;
                            this.f76622b = hVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            InterestChooseV31SecondTab interestChooseV31SecondTab2 = this.f76621a;
                            Fo0.h hVar2 = this.f76622b;
                            t.b(view.getContext(), interestChooseV31SecondTab2.hf(), hVar2.f6336b, hVar2.f6337c, null, null, 56);
                        }
                    });
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterestChooseV31SecondTab interestChooseV31SecondTab, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = interestChooseV31SecondTab;
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
                    C04911 c04911 = new C04911(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlow, c04911, this) == coroutine_suspended) {
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
        this.f76603b = c4867jInflate;
        return c4867jInflate != null ? c4867jInflate.f54062a : null;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f76603b = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        C4867j c4867j = this.f76603b;
        if (c4867j != null) {
            PaddingUtilsKt.setPaddingTop(c4867j.f54066e, ListExtentionsKt.toPx(33.5d));
        }
        C4867j c4867j2 = this.f76603b;
        if (c4867j2 != null) {
            c4867j2.f54066e.setItemAnimator(null);
        }
        C4867j c4867j3 = this.f76603b;
        if (c4867j3 != null) {
            RecyclerView recyclerView = c4867j3.f54066e;
            GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
            gridLayoutManager.setSpanSizeLookup(new k(this));
            recyclerView.setLayoutManager(gridLayoutManager);
        }
        C4867j c4867j4 = this.f76603b;
        if (c4867j4 != null) {
            c4867j4.f54066e.setAdapter(new q(new NI.n(this, 2), new h(this)));
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV31SecondTab$initRv$4(this, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        s.c(this, new z(this, 1));
    }
}
