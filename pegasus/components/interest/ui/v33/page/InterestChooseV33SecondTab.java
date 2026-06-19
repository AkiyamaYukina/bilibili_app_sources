package com.bilibili.pegasus.components.interest.ui.v33.page;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import aq0.C4891v;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.app.comm.list.widget.utils.PaddingUtilsKt;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.pegasus.components.interest.t;
import com.bilibili.pegasus.components.interest.ui.v33.vm.InterestChooseV33PageViewModel;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v33/page/InterestChooseV33SecondTab.class */
@StabilityInferred(parameters = 0)
public final class InterestChooseV33SecondTab extends androidx_fragment_app_Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public C4891v f76721b;

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v33.page.InterestChooseV33SecondTab$onViewCreated$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v33/page/InterestChooseV33SecondTab$onViewCreated$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final InterestChooseV33SecondTab this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v33.page.InterestChooseV33SecondTab$onViewCreated$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v33/page/InterestChooseV33SecondTab$onViewCreated$1$1.class */
        public static final class C04951 extends SuspendLambda implements Function2<InterestChoose, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final InterestChooseV33SecondTab this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04951(InterestChooseV33SecondTab interestChooseV33SecondTab, Continuation<? super C04951> continuation) {
                super(2, continuation);
                this.this$0 = interestChooseV33SecondTab;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C04951 c04951 = new C04951(this.this$0, continuation);
                c04951.L$0 = obj;
                return c04951;
            }

            public final Object invoke(InterestChoose interestChoose, Continuation<? super Unit> continuation) {
                return create(interestChoose, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View$OnClickListener, java.lang.Object] */
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
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final InterestChoose interestChoose = (InterestChoose) this.L$0;
                if (interestChoose != null) {
                    InterestChooseV33SecondTab interestChooseV33SecondTab = this.this$0;
                    C4891v c4891v = interestChooseV33SecondTab.f76721b;
                    if (c4891v != null) {
                        c4891v.f54170g.setText(interestChoose.J());
                    }
                    C4891v c4891v2 = interestChooseV33SecondTab.f76721b;
                    if (c4891v2 != null) {
                        c4891v2.f54169f.setText(interestChoose.I());
                    }
                    C4891v c4891v3 = interestChooseV33SecondTab.f76721b;
                    if (c4891v3 != null) {
                        c4891v3.f54167d.setVisibility(0);
                    }
                    C4891v c4891v4 = interestChooseV33SecondTab.f76721b;
                    if (c4891v4 != null) {
                        c4891v4.f54167d.setOnClickListener(new Object());
                    }
                    C4891v c4891v5 = interestChooseV33SecondTab.f76721b;
                    if (c4891v5 != null) {
                        final int i7 = 0;
                        c4891v5.f54166c.setOnClickListener(new View.OnClickListener(interestChoose, i7) { // from class: com.bilibili.pegasus.components.interest.ui.v33.page.k

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final int f76735a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final Object f76736b;

                            {
                                this.f76735a = i7;
                                this.f76736b = interestChoose;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (this.f76735a) {
                                    case 0:
                                        InterestChoose interestChoose2 = (InterestChoose) this.f76736b;
                                        t.b(view.getContext(), c.f76724a, interestChoose2.D(), interestChoose2.O(), null, null, 56);
                                        break;
                                    default:
                                        ((EditText) this.f76736b).setText("");
                                        break;
                                }
                            }
                        });
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterestChooseV33SecondTab interestChooseV33SecondTab, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = interestChooseV33SecondTab;
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
                InterestChooseV33PageViewModel interestChooseV33PageViewModel = c.f76724a;
                if (interestChooseV33PageViewModel != null && (stateFlow = interestChooseV33PageViewModel.h) != null) {
                    C04951 c04951 = new C04951(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlow, c04951, this) == coroutine_suspended) {
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
        C4891v c4891vInflate = C4891v.inflate(layoutInflater);
        this.f76721b = c4891vInflate;
        return c4891vInflate != null ? c4891vInflate.f54164a : null;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f76721b = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        C4891v c4891v = this.f76721b;
        if (c4891v != null) {
            PaddingUtilsKt.setPaddingTop(c4891v.f54168e, ListExtentionsKt.toPx(20));
        }
        C4891v c4891v2 = this.f76721b;
        if (c4891v2 != null) {
            c4891v2.f54168e.setItemAnimator(null);
        }
        C4891v c4891v3 = this.f76721b;
        if (c4891v3 != null) {
            c4891v3.f54168e.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        C4891v c4891v4 = this.f76721b;
        if (c4891v4 != null) {
            c4891v4.f54168e.setAdapter(new Oo0.h(new h(this), new i(this, 0)));
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV33SecondTab$initRv$3(this, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
