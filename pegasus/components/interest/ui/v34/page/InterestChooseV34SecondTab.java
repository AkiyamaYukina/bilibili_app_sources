package com.bilibili.pegasus.components.interest.ui.v34.page;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import aq0.C4893w;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.app.comm.list.widget.utils.PaddingUtilsKt;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.pegasus.components.interest.ui.v34.vm.InterestChooseV34PageViewModel;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v34/page/InterestChooseV34SecondTab.class */
@StabilityInferred(parameters = 0)
public final class InterestChooseV34SecondTab extends androidx_fragment_app_Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public C4893w f76766b;

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v34.page.InterestChooseV34SecondTab$onViewCreated$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v34/page/InterestChooseV34SecondTab$onViewCreated$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final InterestChooseV34SecondTab this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v34.page.InterestChooseV34SecondTab$onViewCreated$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v34/page/InterestChooseV34SecondTab$onViewCreated$1$1.class */
        public static final class C04961 extends SuspendLambda implements Function2<InterestChoose, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final InterestChooseV34SecondTab this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04961(InterestChooseV34SecondTab interestChooseV34SecondTab, Continuation<? super C04961> continuation) {
                super(2, continuation);
                this.this$0 = interestChooseV34SecondTab;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C04961 c04961 = new C04961(this.this$0, continuation);
                c04961.L$0 = obj;
                return c04961;
            }

            public final Object invoke(InterestChoose interestChoose, Continuation<? super Unit> continuation) {
                return create(interestChoose, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View$OnClickListener, java.lang.Object] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            public final Object invokeSuspend(Object obj) {
                TintImageView tintImageView;
                TintImageView tintImageView2;
                TintTextView tintTextView;
                TintTextView tintTextView2;
                TintTextView tintTextView3;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                InterestChoose interestChoose = (InterestChoose) this.L$0;
                if (interestChoose != null) {
                    InterestChooseV34SecondTab interestChooseV34SecondTab = this.this$0;
                    C4893w c4893w = interestChooseV34SecondTab.f76766b;
                    if (c4893w != null && (tintTextView3 = c4893w.f54181g) != null) {
                        ViewGroup.LayoutParams layoutParams = tintTextView3.getLayoutParams();
                        if (layoutParams == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.topMargin = 1;
                        tintTextView3.setLayoutParams(marginLayoutParams);
                        tintTextView3.setTextSize(16.0f);
                        tintTextView3.setText(interestChoose.J());
                    }
                    C4893w c4893w2 = interestChooseV34SecondTab.f76766b;
                    if (c4893w2 != null && (tintTextView2 = c4893w2.f54180f) != null) {
                        tintTextView2.setTextSize(12.0f);
                    }
                    C4893w c4893w3 = interestChooseV34SecondTab.f76766b;
                    if (c4893w3 != null && (tintTextView = c4893w3.f54180f) != null) {
                        tintTextView.setText(interestChoose.I());
                    }
                    C4893w c4893w4 = interestChooseV34SecondTab.f76766b;
                    if (c4893w4 != null && (tintImageView2 = c4893w4.f54178d) != null) {
                        tintImageView2.setVisibility(0);
                    }
                    C4893w c4893w5 = interestChooseV34SecondTab.f76766b;
                    if (c4893w5 != null && (tintImageView = c4893w5.f54178d) != 0) {
                        tintImageView.setOnClickListener(new Object());
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterestChooseV34SecondTab interestChooseV34SecondTab, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = interestChooseV34SecondTab;
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
                InterestChooseV34PageViewModel interestChooseV34PageViewModel = e.f76773a;
                if (interestChooseV34PageViewModel != null && (stateFlow = interestChooseV34PageViewModel.f76785f) != null) {
                    C04961 c04961 = new C04961(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlow, c04961, this) == coroutine_suspended) {
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
        C4893w c4893wInflate = C4893w.inflate(layoutInflater);
        this.f76766b = c4893wInflate;
        return c4893wInflate != null ? c4893wInflate.f54175a : null;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f76766b = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        C4893w c4893w = this.f76766b;
        if (c4893w != null) {
            PaddingUtilsKt.setPaddingTop(c4893w.f54179e, ListExtentionsKt.toPx(20));
        }
        C4893w c4893w2 = this.f76766b;
        if (c4893w2 != null) {
            c4893w2.f54179e.setItemAnimator(null);
        }
        C4893w c4893w3 = this.f76766b;
        if (c4893w3 != null) {
            c4893w3.f54179e.setOverScrollMode(2);
        }
        C4893w c4893w4 = this.f76766b;
        if (c4893w4 != null) {
            c4893w4.f54179e.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        C4893w c4893w5 = this.f76766b;
        if (c4893w5 != null) {
            c4893w5.f54179e.setAdapter(new Qo0.h(new i(this), new Ct0.g(1, this)));
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV34SecondTab$initRv$3(this, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
