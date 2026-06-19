package com.bilibili.module.vip.combine;

import F3.V2;
import F3.X2;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.DialogFragment;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.performance.EntryPointKt;
import com.bilibili.module.vip.combine.VipPaymentTipsVM;
import com.bilibili.okretro.call.json.JsonUtilKt;
import j5.C7642d;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.ui.splash.ad.model.Splash;
import tv.danmaku.bili.ui.splash.ad.page.FullImageSplash;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/combine/VipPaymentTipsDialogFragment.class */
@StabilityInferred(parameters = 0)
public final class VipPaymentTipsDialogFragment extends DialogFragment {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final a f66149i = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public VipPaymentTipsVM f66150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f66151c = LazyKt.lazy(new NC.b(this, 6));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f66152d = LazyKt.lazy(new R9.a(this, 5));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public Function0<Unit> f66153e = new V2(8);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public Function1<? super Uri, Unit> f66154f = new m(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public Function0<Unit> f66155g = new X2(6);

    @NotNull
    public final Lazy h = LazyKt.lazy(new II.c(this, 5));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/combine/VipPaymentTipsDialogFragment$a.class */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(@org.jetbrains.annotations.NotNull com.bilibili.vip.VipPrivilegeType r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
            /*
                r5 = this;
                r0 = r7
                boolean r0 = r0 instanceof com.bilibili.module.vip.combine.VipPaymentTipsDialogFragment$Companion$requestPaymentTipsInfo$1
                if (r0 == 0) goto L29
                r0 = r7
                com.bilibili.module.vip.combine.VipPaymentTipsDialogFragment$Companion$requestPaymentTipsInfo$1 r0 = (com.bilibili.module.vip.combine.VipPaymentTipsDialogFragment$Companion$requestPaymentTipsInfo$1) r0
                r9 = r0
                r0 = r9
                int r0 = r0.label
                r8 = r0
                r0 = r8
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 & r1
                if (r0 == 0) goto L29
                r0 = r9
                r1 = r8
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                int r1 = r1 + r2
                r0.label = r1
                r0 = r9
                r7 = r0
                goto L33
            L29:
                com.bilibili.module.vip.combine.VipPaymentTipsDialogFragment$Companion$requestPaymentTipsInfo$1 r0 = new com.bilibili.module.vip.combine.VipPaymentTipsDialogFragment$Companion$requestPaymentTipsInfo$1
                r1 = r0
                r2 = r5
                r3 = r7
                r1.<init>(r2, r3)
                r7 = r0
            L33:
                r0 = r7
                java.lang.Object r0 = r0.result
                r9 = r0
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r10 = r0
                r0 = r7
                int r0 = r0.label
                r8 = r0
                r0 = r8
                if (r0 == 0) goto L61
                r0 = r8
                r1 = 1
                if (r0 != r1) goto L57
                r0 = r9
                kotlin.ResultKt.throwOnFailure(r0)
                r0 = r9
                r6 = r0
                goto L90
            L57:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r0
            L61:
                r0 = r9
                kotlin.ResultKt.throwOnFailure(r0)
                com.bilibili.module.vip.combine.e$a r0 = com.bilibili.module.vip.combine.e.f66176a
                java.lang.Class r0 = r0.getClass()
                com.bilibili.module.vip.combine.e r0 = com.bilibili.module.vip.combine.e.a.f66178b
                r1 = r6
                java.lang.String r1 = r1.getValue()
                com.bilibili.okretro.call.BiliCall r0 = r0.privilegeDialogInfo(r1)
                r6 = r0
                r0 = r7
                r1 = 1
                r0.label = r1
                r0 = r6
                r1 = r7
                java.lang.Object r0 = com.bilibili.lib.bilipay.utils.a.a(r0, r1)
                r7 = r0
                r0 = r7
                r6 = r0
                r0 = r7
                r1 = r10
                if (r0 != r1) goto L90
                r0 = r10
                return r0
            L90:
                r0 = r6
                com.bilibili.okretro.GeneralResponse r0 = (com.bilibili.okretro.GeneralResponse) r0
                r6 = r0
                r0 = r6
                if (r0 == 0) goto Lad
                r0 = r6
                T r0 = r0.data
                com.bilibili.module.vip.combine.VipPrivilege r0 = (com.bilibili.module.vip.combine.VipPrivilege) r0
                r6 = r0
                r0 = r6
                if (r0 == 0) goto Lad
                r0 = r6
                com.bilibili.module.vip.combine.VipPaymentTips r0 = r0.f66167a
                r6 = r0
                goto Laf
            Lad:
                r0 = 0
                r6 = r0
            Laf:
                r0 = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.module.vip.combine.VipPaymentTipsDialogFragment.a.a(com.bilibili.vip.VipPrivilegeType, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/combine/VipPaymentTipsDialogFragment$b.class */
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f66156a;

        static {
            int[] iArr = new int[VipActionType.values().length];
            try {
                iArr[VipActionType.Continue.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[VipActionType.OpenLink.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[VipActionType.Cancel.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f66156a = iArr;
        }
    }

    public final VipPaymentTips hf() {
        String string;
        Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("payment_tips_Info_json")) == null) ? null : (VipPaymentTips) JsonUtilKt.parseJson(string, VipPaymentTips.class);
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onAttach(@NotNull Context context) {
        super.onAttach(context);
        Neurons.reportExposure$default(false, "vip.membership-purchase.open-pop-up.0.show", (Map) this.h.getValue(), (List) null, 8, (Object) null);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@NotNull DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.f66155g.invoke();
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        VipPaymentTipsVM.Button button;
        super.onCreate(bundle);
        VipPaymentTipsVM vipPaymentTipsVM = new VipPaymentTipsVM(new com.bilibili.bililive.biz.entryEffect.uam.d(this, 3));
        vipPaymentTipsVM.f66158b.setValue(hf().a());
        vipPaymentTipsVM.f66159c.setValue(hf().f66145c);
        vipPaymentTipsVM.f66160d.setValue(hf().b());
        final n nVar = new n(this, 0);
        final VipPrivilegeButton vipPrivilegeButton = (VipPrivilegeButton) CollectionsKt.getOrNull(hf().f66148f, 0);
        if (vipPrivilegeButton != null) {
            VipPaymentTipsVM.Button.ButtonIndex buttonIndex = VipPaymentTipsVM.Button.ButtonIndex.FIRST;
            final int i7 = 0;
            button = new VipPaymentTipsVM.Button(vipPrivilegeButton.f66168a, new Function0(i7, nVar, vipPrivilegeButton) { // from class: com.bilibili.module.vip.combine.o

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f66191a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f66192b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Object f66193c;

                {
                    this.f66191a = i7;
                    this.f66192b = nVar;
                    this.f66193c = vipPrivilegeButton;
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                public final Object invoke() throws NoWhenBranchMatchedException {
                    switch (this.f66191a) {
                        case 0:
                            ((n) this.f66192b).invoke((VipPrivilegeButton) this.f66193c, 0);
                            break;
                        default:
                            Ref.BooleanRef booleanRef = (Ref.BooleanRef) this.f66192b;
                            if (!booleanRef.element) {
                                booleanRef.element = true;
                                ((FullImageSplash) this.f66193c).mf((Splash) null, (String) null, false);
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
            button.f66165c = buttonIndex;
        } else {
            button = null;
        }
        vipPaymentTipsVM.f66161e.setValue(button);
        final VipPrivilegeButton vipPrivilegeButton2 = (VipPrivilegeButton) CollectionsKt.getOrNull(hf().f66148f, 1);
        VipPaymentTipsVM.Button button2 = null;
        if (vipPrivilegeButton2 != null) {
            VipPaymentTipsVM.Button.ButtonIndex buttonIndex2 = VipPaymentTipsVM.Button.ButtonIndex.LAST;
            button2 = new VipPaymentTipsVM.Button(vipPrivilegeButton2.f66168a, new Function0(nVar, vipPrivilegeButton2) { // from class: com.bilibili.module.vip.combine.l

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final n f66186a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final VipPrivilegeButton f66187b;

                {
                    this.f66186a = nVar;
                    this.f66187b = vipPrivilegeButton2;
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                public final Object invoke() throws NoWhenBranchMatchedException {
                    this.f66186a.invoke(this.f66187b, 1);
                    return Unit.INSTANCE;
                }
            });
            button2.f66165c = buttonIndex2;
        }
        vipPaymentTipsVM.f66162f.setValue(button2);
        this.f66150b = vipPaymentTipsVM;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Window window;
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            C7642d.a(window, 0);
        }
        ComposeView composeView = new ComposeView(requireContext(), null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1931882243, true, new R9.g(this, 1)));
        return composeView;
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        if (EntryPointKt.getMemleakOptEnable()) {
            Dialog dialog = getDialog();
            if (dialog != null) {
                dialog.setDismissMessage(null);
            }
            Dialog dialog2 = getDialog();
            if (dialog2 != null) {
                dialog2.setOnCancelListener(null);
            }
            Dialog dialog3 = getDialog();
            if (dialog3 != null) {
                dialog3.setOnDismissListener(null);
            }
        }
        super.onDestroyView();
    }
}
