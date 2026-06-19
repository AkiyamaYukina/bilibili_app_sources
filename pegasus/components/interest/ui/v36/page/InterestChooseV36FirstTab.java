package com.bilibili.pegasus.components.interest.ui.v36.page;

import Zu.h;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.material3.C4173q0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.OneShotPreDrawListener;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.GridLayoutManager;
import aq0.C4831H;
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
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v36/page/InterestChooseV36FirstTab.class */
@StabilityInferred(parameters = 0)
public final class InterestChooseV36FirstTab extends androidx_fragment_app_Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public C4831H f76846b;

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v36.page.InterestChooseV36FirstTab$onViewCreated$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v36/page/InterestChooseV36FirstTab$onViewCreated$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final InterestChooseV36FirstTab this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v36.page.InterestChooseV36FirstTab$onViewCreated$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v36/page/InterestChooseV36FirstTab$onViewCreated$1$1.class */
        public static final class C04991 extends SuspendLambda implements Function2<InterestChoose, Continuation<? super Boolean>, Object> {
            Object L$0;
            int label;

            public C04991(Continuation<? super C04991> continuation) {
                super(2, continuation);
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C04991 c04991 = new C04991(continuation);
                c04991.L$0 = obj;
                return c04991;
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
        public AnonymousClass1(InterestChooseV36FirstTab interestChooseV36FirstTab, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = interestChooseV36FirstTab;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v6, types: [android.view.View$OnClickListener, java.lang.Object] */
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
            StateFlow<InterestChoose> stateFlow;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                InterestChooseV36PageViewModel interestChooseV36PageViewModel = c.f76850a;
                if (interestChooseV36PageViewModel != null && (stateFlow = interestChooseV36PageViewModel.f76856b) != null) {
                    C04991 c04991 = new C04991(null);
                    this.label = 1;
                    Object objFirst = FlowKt.first(stateFlow, c04991, this);
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
                InterestChooseV36FirstTab interestChooseV36FirstTab = this.this$0;
                C4831H c4831h = interestChooseV36FirstTab.f76846b;
                if (c4831h != null) {
                    c4831h.f53714f.setText(interestChoose.getTitle());
                }
                C4831H c4831h2 = interestChooseV36FirstTab.f76846b;
                if (c4831h2 != null) {
                    c4831h2.f53713e.setText(interestChoose.I());
                }
                C4831H c4831h3 = interestChooseV36FirstTab.f76846b;
                if (c4831h3 != null) {
                    c4831h3.f53711c.setVisibility(0);
                }
                C4831H c4831h4 = interestChooseV36FirstTab.f76846b;
                if (c4831h4 != null) {
                    c4831h4.f53711c.setOnClickListener(new Object());
                }
                C4831H c4831h5 = interestChooseV36FirstTab.f76846b;
                if (c4831h5 != null) {
                    c4831h5.f53710b.setOnClickListener(new h(interestChoose, 2));
                }
                C4831H c4831h6 = interestChooseV36FirstTab.f76846b;
                if (c4831h6 != null) {
                    FrameLayout frameLayout = c4831h6.f53710b;
                    OneShotPreDrawListener.add(frameLayout, new f(frameLayout, interestChoose));
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C4831H c4831hInflate = C4831H.inflate(layoutInflater);
        this.f76846b = c4831hInflate;
        return c4831hInflate.f53709a;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f76846b = null;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [com.bilibili.pegasus.components.interest.ui.v36.page.e] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        C4831H c4831h = this.f76846b;
        if (c4831h != null) {
            PaddingUtilsKt.setPaddingTop(c4831h.f53712d, ListExtentionsKt.toPx(12.5d));
        }
        C4831H c4831h2 = this.f76846b;
        if (c4831h2 != null) {
            c4831h2.f53712d.setItemAnimator(null);
        }
        C4831H c4831h3 = this.f76846b;
        if (c4831h3 != null) {
            c4831h3.f53712d.setLayoutManager(new GridLayoutManager(getContext(), 2));
        }
        C4831H c4831h4 = this.f76846b;
        if (c4831h4 != null) {
            c4831h4.f53712d.setAdapter(new Uo0.e(new Function1(this) { // from class: com.bilibili.pegasus.components.interest.ui.v36.page.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final InterestChooseV36FirstTab f76851a;

                {
                    this.f76851a = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:51:0x0190  */
                /* JADX WARN: Removed duplicated region for block: B:63:0x01f2  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invoke(java.lang.Object r23) {
                    /*
                        Method dump skipped, instruction units count: 682
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.v36.page.e.invoke(java.lang.Object):java.lang.Object");
                }
            }, new C4173q0(this, 2)));
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV36FirstTab$initRv$3(this, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
