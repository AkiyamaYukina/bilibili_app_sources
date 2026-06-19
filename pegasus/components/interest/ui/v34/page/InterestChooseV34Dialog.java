package com.bilibili.pegasus.components.interest.ui.v34.page;

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
import aq0.C4885s;
import com.bilibili.app.comm.list.common.widget.PromoToast;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.app.dialogmanager.MainDialogManager;
import com.bilibili.bililive.biz.interactionpanel.pk.widget.r;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.widgets.TintFrameLayout;
import com.bilibili.pegasus.components.interest.InterestChainErrorCode;
import com.bilibili.pegasus.components.interest.InterestChainProcess;
import com.bilibili.pegasus.components.interest.m;
import com.bilibili.pegasus.components.interest.ui.reporter.InterestPageCloseReason;
import com.bilibili.pegasus.components.interest.ui.v34.vm.InterestChooseV34PageViewModel;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import com.bilibili.pegasus.data.interestchoose.InterestChooseAge;
import com.bilibili.pegasus.data.interestchoose.InterestChooseGender;
import com.bilibili.pegasus.data.interestchoose.InterestChooseItem;
import com.bilibili.pegasus.interest.reporter.InterestErrorType;
import com.bilibili.pegasus.interest.reporter.InterestEvent;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q4.Q;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v34/page/InterestChooseV34Dialog.class */
@StabilityInferred(parameters = 0)
public final class InterestChooseV34Dialog extends BottomSheetDialogFragment implements com.bilibili.pegasus.components.interest.ui.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public m f76754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public String f76755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public InterestChoose f76756d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f76758f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f76759g;

    @Nullable
    public C4885s h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f76757e = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f76760i = ListExtentionsKt.toPx(668);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public List<InterestChooseItem> f76761j = CollectionsKt.emptyList();

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v34.page.InterestChooseV34Dialog$onViewCreated$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v34/page/InterestChooseV34Dialog$onViewCreated$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final InterestChooseV34Dialog this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v34.page.InterestChooseV34Dialog$onViewCreated$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v34/page/InterestChooseV34Dialog$onViewCreated$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final InterestChooseV34Dialog f76764a;

            public a(InterestChooseV34Dialog interestChooseV34Dialog) {
                this.f76764a = interestChooseV34Dialog;
            }

            public final Object emit(Object obj, Continuation continuation) {
                int iIntValue = ((Number) obj).intValue();
                Context context = this.f76764a.getContext();
                if (context != null) {
                    PromoToast.showMidToast(context, context.getResources().getQuantityString(2131689723, iIntValue, String.valueOf(iIntValue)), 2131243891, R$color.Text_white);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterestChooseV34Dialog interestChooseV34Dialog, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = interestChooseV34Dialog;
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
                InterestChooseV34PageViewModel interestChooseV34PageViewModel = e.f76773a;
                if (interestChooseV34PageViewModel == null || (sharedFlow = interestChooseV34PageViewModel.f76781b) == null) {
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
            if (view instanceof RecyclerView) {
                ((RecyclerView) view).setNestedScrollingEnabled(z6);
                return;
            }
            Iterator<View> it = ViewGroupKt.iterator((ViewGroup) view);
            while (it.hasNext()) {
                hf(it.next(), z6);
            }
        }
    }

    @Override // com.bilibili.pegasus.components.interest.ui.c
    public final void T8(@NotNull final InterestChoose interestChoose, @NotNull final Fragment fragment) {
        MainDialogManager.addDialog(new MainDialogManager.DialogManagerInfo("pegasus_interest_chose", new MainDialogManager.IDialogInterface(fragment, this, interestChoose) { // from class: com.bilibili.pegasus.components.interest.ui.v34.page.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Fragment f76769a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final InterestChooseV34Dialog f76770b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final InterestChoose f76771c;

            {
                this.f76769a = fragment;
                this.f76770b = this;
                this.f76771c = interestChoose;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment, com.bilibili.pegasus.components.interest.ui.v34.page.InterestChooseV34Dialog, java.lang.Object] */
            public final void onShow() {
                InterestChoose interestChoose2 = this.f76771c;
                Fragment fragment2 = this.f76769a;
                boolean zIsDestroyed = fragment2.getChildFragmentManager().isDestroyed();
                ?? r02 = this.f76770b;
                if (zIsDestroyed) {
                    com.bilibili.pegasus.components.interest.e.b(InterestChainProcess.ERROR, 0, InterestChainErrorCode.PAGE_INVISIBLE, null, null, com.bilibili.pegasus.components.interest.e.a(), 24);
                    Gp0.a.b(InterestEvent.ERROR, InterestErrorType.PAGE_INVISIBLE, MapsKt.mapOf(TuplesKt.to(CaptureSchema.JUMP_PARAMS_EXTRA, "page_destroy")), null, 8);
                    m mVar = r02.f76754b;
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
                    r02.show(childFragmentManager, "InterestChooseV34Dialog");
                } catch (Exception e7) {
                    Gp0.a.b(InterestEvent.ERROR, InterestErrorType.EXCEPTION, MapsKt.mapOf(TuplesKt.to(CaptureSchema.JUMP_PARAMS_EXTRA, "after_dialog")), null, 8);
                    com.bilibili.pegasus.components.interest.e.b(InterestChainProcess.ERROR, 0, InterestChainErrorCode.DIALOG_CRASH, null, null, com.bilibili.pegasus.components.interest.e.a(), 24);
                    BLog.i("InterestChooseV34Dialog", "show dialog failed", e7);
                    m mVar2 = r02.f76754b;
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
        this.f76755c = str;
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
        this.f76754b = mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(@Nullable Bundle bundle) {
        List list;
        List list2;
        List<InterestChooseAge> listC;
        List mutableList;
        List<InterestChooseGender> listQ;
        List mutableList2;
        super/*androidx.fragment.app.DialogFragment*/.onCreate(bundle);
        Bundle arguments = getArguments();
        InterestChoose interestChooseA = null;
        InterestChoose interestChoose = arguments != null ? (InterestChoose) arguments.getParcelable("key_interest_choose_data") : null;
        this.f76756d = interestChoose;
        boolean z6 = false;
        if (interestChoose == null || bundle != null) {
            boolean z7 = interestChoose == null;
            if (bundle != null) {
                z6 = true;
            }
            Q.a("onCreate, data invalid = ", ", from recover = ", "InterestChooseV34Dialog", z7, z6);
            dismissAllowingStateLoss();
            return;
        }
        setStyle(0, 2131888801);
        InterestChooseV34PageViewModel interestChooseV34PageViewModel = new InterestChooseV34PageViewModel();
        InterestChoose interestChoose2 = this.f76756d;
        if (interestChoose2 != null && (listQ = interestChoose2.q()) != null && (mutableList2 = CollectionsKt.toMutableList(listQ)) != null) {
            Iterator it = mutableList2.iterator();
            int i7 = 0;
            while (true) {
                list = mutableList2;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (i7 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                mutableList2.set(i7, InterestChooseGender.a((InterestChooseGender) next, null, i7, false, 223));
                i7++;
            }
        } else {
            list = null;
        }
        if (interestChoose2 != null && (listC = interestChoose2.c()) != null && (mutableList = CollectionsKt.toMutableList(listC)) != null) {
            Iterator it2 = mutableList.iterator();
            int i8 = 0;
            while (true) {
                list2 = mutableList;
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (i8 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                mutableList.set(i8, InterestChooseAge.a((InterestChooseAge) next2, i8, false, 55));
                i8++;
            }
        } else {
            list2 = null;
        }
        if (interestChoose2 != null) {
            interestChooseA = InterestChoose.a(interestChoose2, null, list, list2, 536870719);
        }
        interestChooseV34PageViewModel.f76782c.setValue(interestChooseA);
        e.f76773a = interestChooseV34PageViewModel;
    }

    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        TintFrameLayout tintFrameLayout;
        C4885s c4885sInflate = C4885s.inflate(layoutInflater);
        this.h = c4885sInflate;
        TintFrameLayout tintFrameLayout2 = null;
        if (c4885sInflate != null && (tintFrameLayout = c4885sInflate.f54139a) != null) {
            tintFrameLayout.setBackgroundDrawable(null);
        }
        C4885s c4885s = this.h;
        if (c4885s != null) {
            tintFrameLayout2 = c4885s.f54139a;
        }
        return tintFrameLayout2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDestroy() {
        super/*com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment*/.onDestroy();
        e.f76773a = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDismiss(@org.jetbrains.annotations.NotNull android.content.DialogInterface r15) {
        /*
            Method dump skipped, instruction units count: 649
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.v34.page.InterestChooseV34Dialog.onDismiss(android.content.DialogInterface):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onStart() {
        View viewFindViewById;
        ViewGroup.LayoutParams layoutParams;
        super/*androidx.fragment.app.DialogFragment*/.onStart();
        Dialog dialog = getDialog();
        FrameLayout frameLayout = dialog != null ? (FrameLayout) dialog.findViewById(2131299837) : null;
        if (frameLayout != null && (layoutParams = frameLayout.getLayoutParams()) != null) {
            layoutParams.height = this.f76760i;
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (viewFindViewById = dialog2.findViewById(2131313772)) != null) {
            viewFindViewById.setOnClickListener(new r(1, this));
        }
        Dialog dialog3 = getDialog();
        if (dialog3 != null) {
            dialog3.setOnKeyListener(new DialogInterface.OnKeyListener(this) { // from class: com.bilibili.pegasus.components.interest.ui.v34.page.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final InterestChooseV34Dialog f76767a;

                {
                    this.f76767a = this;
                }

                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i7, KeyEvent keyEvent) {
                    InterestChooseV34Dialog interestChooseV34Dialog = this.f76767a;
                    boolean z6 = false;
                    if (i7 == 4) {
                        z6 = false;
                        if (keyEvent.getAction() == 1) {
                            InterestChooseV34PageViewModel interestChooseV34PageViewModel = e.f76773a;
                            int iIntValue = 0;
                            if (interestChooseV34PageViewModel != null) {
                                StateFlow<Integer> stateFlow = interestChooseV34PageViewModel.f76788j;
                                iIntValue = 0;
                                if (stateFlow != null) {
                                    iIntValue = ((Number) stateFlow.getValue()).intValue();
                                }
                            }
                            if (iIntValue > 0) {
                                InterestChooseV34PageViewModel interestChooseV34PageViewModel2 = e.f76773a;
                                if (interestChooseV34PageViewModel2 != null) {
                                    interestChooseV34PageViewModel2.b(iIntValue - 1);
                                }
                            } else {
                                interestChooseV34Dialog.kc(null);
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
    /* JADX WARN: Removed duplicated region for block: B:47:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onViewCreated(@org.jetbrains.annotations.NotNull android.view.View r9, @org.jetbrains.annotations.Nullable android.os.Bundle r10) {
        /*
            Method dump skipped, instruction units count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.v34.page.InterestChooseV34Dialog.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
