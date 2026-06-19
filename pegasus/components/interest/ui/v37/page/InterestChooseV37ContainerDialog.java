package com.bilibili.pegasus.components.interest.ui.v37.page;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewGroupKt;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import aq0.C4838O;
import com.bilibili.app.comm.list.common.widget.PromoToast;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.theme.ThemeWatcher;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.magicasakura.widgets.Tintable;
import com.bilibili.pegasus.components.interest.ui.reporter.InterestPageReturnReason;
import com.bilibili.pegasus.components.interest.ui.reporter.InterestPageType;
import com.bilibili.pegasus.components.interest.ui.v37.vm.InterestChooseV37PageViewModel;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v37/page/InterestChooseV37ContainerDialog.class */
@StabilityInferred(parameters = 0)
public final class InterestChooseV37ContainerDialog extends DialogFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public C4838O f76878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final a f76879c = new ThemeWatcher.Observer(this) { // from class: com.bilibili.pegasus.components.interest.ui.v37.page.a

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterestChooseV37ContainerDialog f76889a;

        {
            this.f76889a = this;
        }

        @Override // com.bilibili.lib.ui.theme.ThemeWatcher.Observer
        public final void onThemeChanged() {
            View view = this.f76889a.getView();
            if (view != null) {
                InterestChooseV37ContainerDialog.hf(view);
            }
        }
    };

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v37.page.InterestChooseV37ContainerDialog$onViewCreated$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v37/page/InterestChooseV37ContainerDialog$onViewCreated$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final InterestChooseV37ContainerDialog this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v37.page.InterestChooseV37ContainerDialog$onViewCreated$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v37/page/InterestChooseV37ContainerDialog$onViewCreated$2$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final InterestChooseV37ContainerDialog f76880a;

            public a(InterestChooseV37ContainerDialog interestChooseV37ContainerDialog) {
                this.f76880a = interestChooseV37ContainerDialog;
            }

            public final Object emit(Object obj, Continuation continuation) {
                int iIntValue = ((Number) obj).intValue();
                Context context = this.f76880a.getContext();
                if (context != null) {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    PromoToast.showMidToast(context, String.format(context.getString(2131845232), Arrays.copyOf(new Object[]{String.valueOf(iIntValue)}, 1)), 2131243891, R$color.Text_white);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(InterestChooseV37ContainerDialog interestChooseV37ContainerDialog, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = interestChooseV37ContainerDialog;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            SharedFlow<Integer> sharedFlow;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                InterestChooseV37PageViewModel interestChooseV37PageViewModel = j.f76896a;
                if (interestChooseV37PageViewModel == null || (sharedFlow = interestChooseV37PageViewModel.h) == null) {
                    return Unit.INSTANCE;
                }
                a aVar = new a(this.this$0);
                this.label = 1;
                if (sharedFlow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void hf(View view) {
        RecyclerView.Adapter adapter;
        if (view instanceof Tintable) {
            ((Tintable) view).tint();
        }
        if (view instanceof ViewGroup) {
            Iterator it = ViewGroupKt.getChildren((ViewGroup) view).iterator();
            while (it.hasNext()) {
                hf((View) it.next());
            }
            if (!(view instanceof RecyclerView) || (adapter = ((RecyclerView) view).getAdapter()) == null) {
                return;
            }
            adapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            ThemeWatcher.getInstance().subscribe(this.f76879c);
        } else {
            BLog.i("[Interest]InterestChooseV37ContainerDialog", "onCreate, from recover");
            dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    @NotNull
    public final Dialog onCreateDialog(@Nullable Bundle bundle) {
        WindowManager.LayoutParams attributes;
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        Window window = dialogOnCreateDialog.getWindow();
        if (window != null && (attributes = window.getAttributes()) != null) {
            attributes.windowAnimations = 2131889099;
        }
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C4838O c4838oInflate = C4838O.inflate(layoutInflater);
        this.f76878b = c4838oInflate;
        return c4838oInflate.f53783a;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        ThemeWatcher.getInstance().unSubscribe(this.f76879c);
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f76878b = null;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NotNull DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        InterestChooseV37PageViewModel interestChooseV37PageViewModel = j.f76896a;
        if (interestChooseV37PageViewModel != null) {
            interestChooseV37PageViewModel.b(0);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setDimAmount(0.0f);
        StatusBarCompat.tintStatusBar(window, ContextCompat.getColor(requireContext(), R$color.f64616Wh0));
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setOnKeyListener(new DialogInterface.OnKeyListener(this) { // from class: com.bilibili.pegasus.components.interest.ui.v37.page.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final InterestChooseV37ContainerDialog f76890a;

                {
                    this.f76890a = this;
                }

                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i7, KeyEvent keyEvent) {
                    StateFlow<Integer> stateFlow;
                    InterestChooseV37ContainerDialog interestChooseV37ContainerDialog = this.f76890a;
                    boolean z6 = false;
                    if (i7 == 4) {
                        z6 = false;
                        if (keyEvent.getAction() == 1) {
                            InterestChooseV37PageViewModel interestChooseV37PageViewModel = j.f76896a;
                            z6 = false;
                            if (interestChooseV37PageViewModel != null) {
                                StateFlow<InterestChoose> stateFlow2 = interestChooseV37PageViewModel.f76901b;
                                z6 = false;
                                if (stateFlow2 != null) {
                                    InterestChoose interestChoose = (InterestChoose) stateFlow2.getValue();
                                    if (interestChoose == null) {
                                        z6 = false;
                                    } else {
                                        InterestChooseV37PageViewModel interestChooseV37PageViewModel2 = j.f76896a;
                                        int iIntValue = (interestChooseV37PageViewModel2 == null || (stateFlow = interestChooseV37PageViewModel2.f76916r) == null) ? 1 : ((Number) stateFlow.getValue()).intValue();
                                        int iD = interestChoose.D();
                                        long jO = interestChoose.O();
                                        InterestPageReturnReason interestPageReturnReason = InterestPageReturnReason.GESTURE;
                                        InterestPageType interestPageType = iIntValue == 2 ? InterestPageType.INTEREST_2ND : InterestPageType.INTEREST_1ST;
                                        String strB = interestChoose.B();
                                        String str = strB;
                                        if (strB == null) {
                                            str = "";
                                        }
                                        com.bilibili.pegasus.components.interest.e.s(iD, jO, interestPageReturnReason, interestPageType, str);
                                        if (iIntValue > 1) {
                                            InterestChooseV37PageViewModel interestChooseV37PageViewModel3 = j.f76896a;
                                            if (interestChooseV37PageViewModel3 != null) {
                                                interestChooseV37PageViewModel3.b(iIntValue - 1);
                                            }
                                        } else {
                                            interestChooseV37ContainerDialog.dismissAllowingStateLoss();
                                        }
                                        z6 = true;
                                    }
                                }
                            }
                        }
                    }
                    return z6;
                }
            });
        }
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
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 != null) {
            ScreenAdjustUtilsKt.collectWindowSize$default(fragmentActivityP3, false, new c(this, 0), 1, (Object) null);
        }
        C4838O c4838o = this.f76878b;
        if (c4838o != null) {
            c4838o.f53784b.setOnClickListener(new Object());
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV37ContainerDialog$initConfirmButton$2(this, null), 3, (Object) null);
        C4838O c4838o2 = this.f76878b;
        if (c4838o2 != null) {
            c4838o2.f53785c.setUserInputEnabled(false);
        }
        C4838O c4838o3 = this.f76878b;
        if (c4838o3 != null) {
            c4838o3.f53785c.setAdapter(new FragmentStateAdapter(getChildFragmentManager(), getLifecycle()));
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV37ContainerDialog$initPage$1(this, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
    }
}
