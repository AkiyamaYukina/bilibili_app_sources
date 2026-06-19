package com.bilibili.pegasus.components.interest.ui.v35.page;

import Ct0.s;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.GridLayoutManager;
import aq0.C4825B;
import bF0.AbstractC4972d3;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.app.comm.list.widget.utils.PaddingUtilsKt;
import com.bilibili.base.SharedPreferencesHelper;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.pegasus.components.interest.t;
import com.bilibili.pegasus.components.interest.ui.reporter.InterestPageType;
import com.bilibili.pegasus.components.interest.ui.v35.vm.InterestChooseV35PageViewModel;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import com.bilibili.upper.module.contribute.picker.v3.fragment.AlbumCurrentFragmentV2;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v35/page/InterestChooseV35SecondTab.class */
@StabilityInferred(parameters = 0)
public final class InterestChooseV35SecondTab extends androidx_fragment_app_Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public C4825B f76800b;

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v35.page.InterestChooseV35SecondTab$onViewCreated$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v35/page/InterestChooseV35SecondTab$onViewCreated$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final InterestChooseV35SecondTab this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v35.page.InterestChooseV35SecondTab$onViewCreated$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v35/page/InterestChooseV35SecondTab$onViewCreated$1$1.class */
        public static final class C04971 extends SuspendLambda implements Function2<InterestChoose, Continuation<? super Boolean>, Object> {
            Object L$0;
            int label;

            public C04971(Continuation<? super C04971> continuation) {
                super(2, continuation);
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C04971 c04971 = new C04971(continuation);
                c04971.L$0 = obj;
                return c04971;
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
        public AnonymousClass1(InterestChooseV35SecondTab interestChooseV35SecondTab, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = interestChooseV35SecondTab;
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
                    C04971 c04971 = new C04971(null);
                    this.label = 1;
                    Object objFirst = FlowKt.first(stateFlow, c04971, this);
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
            final InterestChoose interestChoose = (InterestChoose) obj;
            if (interestChoose != null) {
                InterestChooseV35SecondTab interestChooseV35SecondTab = this.this$0;
                C4825B c4825b = interestChooseV35SecondTab.f76800b;
                if (c4825b != null) {
                    c4825b.f53668g.setText(interestChoose.J());
                }
                C4825B c4825b2 = interestChooseV35SecondTab.f76800b;
                if (c4825b2 != null) {
                    c4825b2.f53667f.setText(interestChoose.I());
                }
                C4825B c4825b3 = interestChooseV35SecondTab.f76800b;
                if (c4825b3 != null) {
                    c4825b3.f53665d.setVisibility(0);
                }
                C4825B c4825b4 = interestChooseV35SecondTab.f76800b;
                if (c4825b4 != null) {
                    c4825b4.f53665d.setOnClickListener(new s(interestChoose, 1));
                }
                C4825B c4825b5 = interestChooseV35SecondTab.f76800b;
                if (c4825b5 != null) {
                    final int i8 = 0;
                    c4825b5.f53664c.setOnClickListener(new View.OnClickListener(interestChoose, i8) { // from class: com.bilibili.pegasus.components.interest.ui.v35.page.j

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final int f76814a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final Object f76815b;

                        {
                            this.f76814a = i8;
                            this.f76815b = interestChoose;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (this.f76814a) {
                                case 0:
                                    InterestChoose interestChoose2 = (InterestChoose) this.f76815b;
                                    t.b(view.getContext(), c.f76804a, interestChoose2.D(), interestChoose2.O(), InterestPageType.INTEREST_1ST, interestChoose2.B(), 32);
                                    break;
                                default:
                                    AlbumCurrentFragmentV2 albumCurrentFragmentV2 = (AlbumCurrentFragmentV2) this.f76815b;
                                    AbstractC4972d3 abstractC4972d3 = albumCurrentFragmentV2.g;
                                    AbstractC4972d3 abstractC4972d32 = abstractC4972d3;
                                    if (abstractC4972d3 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                                        abstractC4972d32 = null;
                                    }
                                    abstractC4972d32.f55496D.setVisibility(8);
                                    new SharedPreferencesHelper(albumCurrentFragmentV2.getApplicationContext()).setBoolean("display_submission_tip1", false);
                                    break;
                            }
                        }
                    });
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C4825B c4825bInflate = C4825B.inflate(layoutInflater);
        this.f76800b = c4825bInflate;
        return c4825bInflate.f53662a;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f76800b = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        C4825B c4825b = this.f76800b;
        if (c4825b != null) {
            PaddingUtilsKt.setPaddingTop(c4825b.f53666e, ListExtentionsKt.toPx(12.5d));
        }
        C4825B c4825b2 = this.f76800b;
        if (c4825b2 != null) {
            c4825b2.f53666e.setItemAnimator(null);
        }
        C4825B c4825b3 = this.f76800b;
        if (c4825b3 != null) {
            c4825b3.f53666e.setLayoutManager(new GridLayoutManager(getContext(), 2));
        }
        C4825B c4825b4 = this.f76800b;
        if (c4825b4 != null) {
            c4825b4.f53666e.setAdapter(new So0.i(new i(this, 0), new com.bilibili.app.authorspace.ui.pages.video.a(1, this)));
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV35SecondTab$initRv$3(this, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
