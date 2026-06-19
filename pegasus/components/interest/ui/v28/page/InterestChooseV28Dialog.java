package com.bilibili.pegasus.components.interest.ui.v28.page;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewGroupKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import aq0.C4872l0;
import com.bilibili.app.comm.list.common.widget.PromoToast;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.app.dialogmanager.MainDialogManager;
import com.bilibili.magicasakura.widgets.TintFrameLayout;
import com.bilibili.pegasus.components.interest.InterestChainErrorCode;
import com.bilibili.pegasus.components.interest.InterestChainProcess;
import com.bilibili.pegasus.components.interest.m;
import com.bilibili.pegasus.components.interest.ui.reporter.InterestPageCloseReason;
import com.bilibili.pegasus.components.interest.ui.v27.vm.InterestChooseV27PageViewModel;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import com.bilibili.pegasus.data.interestchoose.InterestChooseAge;
import com.bilibili.pegasus.data.interestchoose.InterestChooseGender;
import com.bilibili.pegasus.interest.reporter.InterestErrorType;
import com.bilibili.pegasus.interest.reporter.InterestEvent;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v28/page/InterestChooseV28Dialog.class */
@StabilityInferred(parameters = 0)
public final class InterestChooseV28Dialog extends BottomSheetDialogFragment implements com.bilibili.pegasus.components.interest.ui.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public C4872l0 f76513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public m f76514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public String f76515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public InterestChoose f76516e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f76518g;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f76517f = true;
    public final int h = ListExtentionsKt.toPx(668);

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v28.page.InterestChooseV28Dialog$onViewCreated$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v28/page/InterestChooseV28Dialog$onViewCreated$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final InterestChooseV28Dialog this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v28.page.InterestChooseV28Dialog$onViewCreated$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v28/page/InterestChooseV28Dialog$onViewCreated$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final InterestChooseV28Dialog f76519a;

            public a(InterestChooseV28Dialog interestChooseV28Dialog) {
                this.f76519a = interestChooseV28Dialog;
            }

            public final Object emit(Object obj, Continuation continuation) {
                int iIntValue = ((Number) obj).intValue();
                Context context = this.f76519a.getContext();
                if (context != null) {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    PromoToast.showMidToast(context, String.format(context.getResources().getQuantityString(2131689723, iIntValue), Arrays.copyOf(new Object[]{Boxing.boxInt(iIntValue)}, 1)));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterestChooseV28Dialog interestChooseV28Dialog, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = interestChooseV28Dialog;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
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
                InterestChooseV27PageViewModel interestChooseV27PageViewModel = e.f76528a;
                if (interestChooseV27PageViewModel == null || (sharedFlow = interestChooseV27PageViewModel.f76499f) == null) {
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

    public static void hf(View view, boolean z6) {
        if (view instanceof ViewGroup) {
            if (!(view instanceof RecyclerView)) {
                Iterator<View> it = ViewGroupKt.iterator((ViewGroup) view);
                while (it.hasNext()) {
                    hf(it.next(), z6);
                }
                return;
            }
            RecyclerView recyclerView = (RecyclerView) view;
            recyclerView.setNestedScrollingEnabled(z6);
            BLog.d("InterestChooseV28Dialog", recyclerView.getId() + " isNestedScrollingEnabled = " + z6);
        }
    }

    @Override // com.bilibili.pegasus.components.interest.ui.c
    public final void T8(@NotNull final InterestChoose interestChoose, @NotNull final Fragment fragment) {
        MainDialogManager.addDialog(new MainDialogManager.DialogManagerInfo("pegasus_interest_chose", new MainDialogManager.IDialogInterface(fragment, this, interestChoose) { // from class: com.bilibili.pegasus.components.interest.ui.v28.page.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Fragment f76524a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final InterestChooseV28Dialog f76525b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final InterestChoose f76526c;

            {
                this.f76524a = fragment;
                this.f76525b = this;
                this.f76526c = interestChoose;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment, com.bilibili.pegasus.components.interest.ui.v28.page.InterestChooseV28Dialog, java.lang.Object] */
            public final void onShow() {
                InterestChoose interestChoose2 = this.f76526c;
                Fragment fragment2 = this.f76524a;
                boolean zIsDestroyed = fragment2.getChildFragmentManager().isDestroyed();
                ?? r02 = this.f76525b;
                if (zIsDestroyed) {
                    com.bilibili.pegasus.components.interest.e.b(InterestChainProcess.ERROR, 0, InterestChainErrorCode.PAGE_INVISIBLE, null, null, com.bilibili.pegasus.components.interest.e.a(), 24);
                    Gp0.a.b(InterestEvent.ERROR, InterestErrorType.PAGE_INVISIBLE, MapsKt.mapOf(TuplesKt.to(CaptureSchema.JUMP_PARAMS_EXTRA, "page_destroy")), null, 8);
                    m mVar = r02.f76514c;
                    if (mVar != null) {
                        mVar.a(false, null);
                    }
                    MainDialogManager.showNextDialog("pegasus_interest_chose", false, (Context) null);
                    return;
                }
                try {
                    FragmentManager childFragmentManager = fragment2.getChildFragmentManager();
                    r02.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("key_interest_choose_data", interestChoose2);
                    r02.setArguments(bundle);
                    r02.show(childFragmentManager, "SubCategoryInterestChooseDialog");
                } catch (Exception e7) {
                    Gp0.a.b(InterestEvent.ERROR, InterestErrorType.EXCEPTION, MapsKt.mapOf(TuplesKt.to(CaptureSchema.JUMP_PARAMS_EXTRA, "after_dialog")), null, 8);
                    com.bilibili.pegasus.components.interest.e.b(InterestChainProcess.ERROR, 0, InterestChainErrorCode.DIALOG_CRASH, null, null, com.bilibili.pegasus.components.interest.e.a(), 24);
                    BLog.i("InterestChooseV28Dialog", "show dialog failed", e7);
                    m mVar2 = r02.f76514c;
                    if (mVar2 != null) {
                        mVar2.a(false, null);
                    }
                    MainDialogManager.showNextDialog("pegasus_interest_chose", false, (Context) null);
                }
            }
        }, 95, false), fragment.getContext());
        if (MainDialogManager.isDialogShowing("biz_block_dialog")) {
            MainDialogManager.showNextDialog("biz_block_dialog", false, fragment.getContext());
        }
        MainDialogManager.removeDialog("biz_block_dialog");
    }

    @Override // com.bilibili.pegasus.components.interest.ui.c
    public final void c1(@Nullable String str) {
        this.f76515d = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.pegasus.components.interest.ui.c
    public final void kc(@Nullable InterestPageCloseReason interestPageCloseReason) {
        if (isAdded()) {
            dismissAllowingStateLoss();
        }
    }

    @Override // com.bilibili.pegasus.components.interest.ui.c
    public final void o9(@Nullable m mVar) {
        this.f76514c = mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(@Nullable Bundle bundle) {
        super/*androidx.fragment.app.DialogFragment*/.onCreate(bundle);
        Bundle arguments = getArguments();
        InterestChoose interestChoose = arguments != null ? (InterestChoose) arguments.getParcelable("key_interest_choose_data") : null;
        this.f76516e = interestChoose;
        if (interestChoose == null || bundle != null) {
            dismissAllowingStateLoss();
            return;
        }
        setStyle(0, 2131888801);
        InterestChooseV27PageViewModel interestChooseV27PageViewModel = new InterestChooseV27PageViewModel();
        interestChooseV27PageViewModel.h(this.f76516e);
        e.f76528a = interestChooseV27PageViewModel;
    }

    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        TintFrameLayout tintFrameLayout;
        C4872l0 c4872l0Inflate = C4872l0.inflate(layoutInflater);
        this.f76513b = c4872l0Inflate;
        TintFrameLayout tintFrameLayout2 = null;
        if (c4872l0Inflate != null && (tintFrameLayout = c4872l0Inflate.f54084a) != null) {
            tintFrameLayout.setBackgroundDrawable(null);
        }
        C4872l0 c4872l0 = this.f76513b;
        if (c4872l0 != null) {
            tintFrameLayout2 = c4872l0.f54084a;
        }
        return tintFrameLayout2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDestroy() {
        super/*com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment*/.onDestroy();
        e.f76528a = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDismiss(@NotNull DialogInterface dialogInterface) {
        InterestChooseGender interestChooseGender;
        InterestChooseAge interestChooseAge;
        Object next;
        Object next2;
        StateFlow<InterestChoose> stateFlow;
        super/*androidx.fragment.app.DialogFragment*/.onDismiss(dialogInterface);
        InterestChooseV27PageViewModel interestChooseV27PageViewModel = e.f76528a;
        InterestChoose interestChoose = (interestChooseV27PageViewModel == null || (stateFlow = interestChooseV27PageViewModel.f76495b) == null) ? null : (InterestChoose) stateFlow.getValue();
        if (interestChoose == null) {
            MainDialogManager.showNextDialog("pegasus_interest_chose", false, (Context) null);
            return;
        }
        m mVar = this.f76514c;
        if (mVar != null) {
            boolean z6 = this.f76518g;
            long jO = interestChoose.O();
            List<InterestChooseGender> listQ = interestChoose.q();
            if (listQ != null) {
                Iterator<T> it = listQ.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    } else {
                        next2 = it.next();
                        if (((InterestChooseGender) next2).f77411g) {
                            break;
                        }
                    }
                }
                interestChooseGender = (InterestChooseGender) next2;
            } else {
                interestChooseGender = null;
            }
            List<InterestChooseAge> listC = interestChoose.c();
            if (listC != null) {
                Iterator<T> it2 = listC.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it2.next();
                        if (((InterestChooseAge) next).f77403e) {
                            break;
                        }
                    }
                }
                interestChooseAge = (InterestChooseAge) next;
            } else {
                interestChooseAge = null;
            }
            InterestChooseV27PageViewModel interestChooseV27PageViewModel2 = e.f76528a;
            String strB = interestChooseV27PageViewModel2 != null ? interestChooseV27PageViewModel2.b() : null;
            InterestChooseV27PageViewModel interestChooseV27PageViewModel3 = e.f76528a;
            mVar.a(z6, new kp0.f(jO, null, interestChooseV27PageViewModel3 != null ? interestChooseV27PageViewModel3.a() : null, interestChooseGender, interestChooseAge, strB, false, 66));
        }
        if (this.f76517f) {
            com.bilibili.pegasus.components.interest.e.f(this.f76515d, interestChoose.O(), interestChoose.D(), false, 16);
        }
        MainDialogManager.showNextDialog("pegasus_interest_chose", false, (Context) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onStart() {
        super/*androidx.fragment.app.DialogFragment*/.onStart();
        Dialog dialog = getDialog();
        (dialog != null ? (FrameLayout) dialog.findViewById(2131299837) : null).getLayoutParams().height = this.h;
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setOnKeyListener(new DialogInterface.OnKeyListener(this) { // from class: com.bilibili.pegasus.components.interest.ui.v28.page.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final InterestChooseV28Dialog f76523a;

                {
                    this.f76523a = this;
                }

                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i7, KeyEvent keyEvent) {
                    StateFlow<Integer> stateFlow;
                    InterestChooseV28Dialog interestChooseV28Dialog = this.f76523a;
                    boolean z6 = false;
                    if (i7 == 4) {
                        z6 = false;
                        if (keyEvent.getAction() == 1) {
                            InterestChooseV27PageViewModel interestChooseV27PageViewModel = e.f76528a;
                            if (interestChooseV27PageViewModel == null || (stateFlow = interestChooseV27PageViewModel.f76504l) == null || ((Number) stateFlow.getValue()).intValue() != 1) {
                                interestChooseV28Dialog.kc(null);
                            } else {
                                InterestChooseV27PageViewModel interestChooseV27PageViewModel2 = e.f76528a;
                                if (interestChooseV27PageViewModel2 != null) {
                                    interestChooseV27PageViewModel2.g(0);
                                }
                            }
                            z6 = true;
                        }
                    }
                    return z6;
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0292  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onViewCreated(@org.jetbrains.annotations.NotNull android.view.View r9, @org.jetbrains.annotations.Nullable android.os.Bundle r10) {
        /*
            Method dump skipped, instruction units count: 694
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.v28.page.InterestChooseV28Dialog.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
