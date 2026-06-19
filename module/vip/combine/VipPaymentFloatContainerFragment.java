package com.bilibili.module.vip.combine;

import android.app.Dialog;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bili.rvext.ThreadLayoutInflater;
import com.bilibili.ad.adview.pegasus.holders.inline.card149.FeedAdHolder149;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import com.bilibili.video.story.player.M;
import com.bilibili.vip.VipPaymentCombineException;
import j5.C7642d;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/combine/VipPaymentFloatContainerFragment.class */
@StabilityInferred(parameters = 0)
public final class VipPaymentFloatContainerFragment extends DialogFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Fragment f66140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public Function1<? super Result<Unit>, Unit> f66141c;

    public VipPaymentFloatContainerFragment() {
        final int i7 = 0;
        this.f66141c = new Function1(i7) { // from class: com.bilibili.module.vip.combine.h

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f66181a;

            {
                this.f66181a = i7;
            }

            public final Object invoke(Object obj) {
                switch (this.f66181a) {
                    case 0:
                        return Unit.INSTANCE;
                    default:
                        ViewGroup viewGroup = (ViewGroup) obj;
                        return new FeedAdHolder149(M.a(viewGroup, ThreadLayoutInflater.Companion, 2131502364, viewGroup, false));
                }
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object hf(@org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentManager r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            r0 = r7
            boolean r0 = r0 instanceof com.bilibili.module.vip.combine.VipPaymentFloatContainerFragment$await$1
            if (r0 == 0) goto L29
            r0 = r7
            com.bilibili.module.vip.combine.VipPaymentFloatContainerFragment$await$1 r0 = (com.bilibili.module.vip.combine.VipPaymentFloatContainerFragment$await$1) r0
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
            com.bilibili.module.vip.combine.VipPaymentFloatContainerFragment$await$1 r0 = new com.bilibili.module.vip.combine.VipPaymentFloatContainerFragment$await$1
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
            if (r0 == 0) goto L69
            r0 = r8
            r1 = 1
            if (r0 != r1) goto L5f
            r0 = r7
            java.lang.Object r0 = r0.L$0
            androidx.fragment.app.FragmentManager r0 = (androidx.fragment.app.FragmentManager) r0
            r6 = r0
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r9
            r6 = r0
            goto Lbe
        L5f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L69:
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r7
            r1 = r6
            r0.L$0 = r1
            r0 = r7
            r1 = 1
            r0.label = r1
            kotlinx.coroutines.CancellableContinuationImpl r0 = new kotlinx.coroutines.CancellableContinuationImpl
            r1 = r0
            r2 = r7
            kotlin.coroutines.Continuation r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r2)
            r3 = 1
            r1.<init>(r2, r3)
            r9 = r0
            r0 = r9
            r0.initCancellability()
            r0 = r5
            r1 = r6
            r2 = 0
            r0.show(r1, r2)
            r0 = r5
            com.bilibili.module.vip.combine.k r1 = new com.bilibili.module.vip.combine.k
            r2 = r1
            r3 = r9
            r2.<init>(r3)
            r0.f66141c = r1
            r0 = r9
            java.lang.Object r0 = r0.getResult()
            r9 = r0
            r0 = r9
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto Lb1
            r0 = r7
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)
        Lb1:
            r0 = r9
            r6 = r0
            r0 = r9
            r1 = r10
            if (r0 != r1) goto Lbe
            r0 = r10
            return r0
        Lbe:
            r0 = r6
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.unbox-impl()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.module.vip.combine.VipPaymentFloatContainerFragment.hf(androidx.fragment.app.FragmentManager, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@NotNull DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        Function1<? super Result<Unit>, Unit> function1 = this.f66141c;
        Result.Companion companion = Result.Companion;
        function1.invoke(Result.box-impl(Result.constructor-impl(ResultKt.createFailure(VipPaymentCombineException.PaymentCancel.INSTANCE))));
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle bundleRequireArguments = requireArguments();
        Uri.Builder builderBuildUpon = Uri.parse("bilibili://vip/cashier").buildUpon();
        for (String str : bundleRequireArguments.keySet()) {
            builderBuildUpon.appendQueryParameter(str, bundleRequireArguments.getString(str));
        }
        builderBuildUpon.appendQueryParameter("scene", "privilege");
        Qj0.d dVarA = Qj0.c.a(builderBuildUpon.build().toString());
        if (dVarA != null) {
            Fragment fragmentInstantiate = getChildFragmentManager().getFragmentFactory().instantiate(dVarA.f19963a.getClassLoader(), dVarA.f19963a.getName());
            this.f66140b = fragmentInstantiate;
            fragmentInstantiate.setArguments(dVarA.f19964b);
            if (fragmentInstantiate instanceof uK0.e) {
                BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new VipPaymentFloatContainerFragment$generateFragment$2(fragmentInstantiate, this, null), 3, (Object) null);
            }
        }
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
        final FragmentActivity fragmentActivityRequireActivity = requireActivity();
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-116110029, true, new Function2(fragmentActivityRequireActivity, this) { // from class: com.bilibili.module.vip.combine.g

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final FragmentActivity f66179a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final VipPaymentFloatContainerFragment f66180b;

            {
                this.f66179a = fragmentActivityRequireActivity;
                this.f66180b = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-116110029, iIntValue, -1, "com.bilibili.module.vip.combine.VipPaymentFloatContainerFragment.onCreateView.<anonymous>.<anonymous> (VipPaymentFloatContainerFragment.kt:94)");
                    }
                    FragmentActivity fragmentActivity = this.f66179a;
                    final State stateCollectAsState = SnapshotStateKt.collectAsState(ScreenAdjustUtilsKt.windowSizeFlow(fragmentActivity), ScreenAdjustUtilsKt.windowSize(fragmentActivity), null, composer, 0, 2);
                    final VipPaymentFloatContainerFragment vipPaymentFloatContainerFragment = this.f66180b;
                    BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(-934754181, true, new Function2(vipPaymentFloatContainerFragment, stateCollectAsState) { // from class: com.bilibili.module.vip.combine.i

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final VipPaymentFloatContainerFragment f66182a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final State f66183b;

                        {
                            this.f66182a = vipPaymentFloatContainerFragment;
                            this.f66183b = stateCollectAsState;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:15:0x0079  */
                        /* JADX WARN: Removed duplicated region for block: B:37:0x0215  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object invoke(java.lang.Object r10, java.lang.Object r11) {
                            /*
                                Method dump skipped, instruction units count: 598
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.module.vip.combine.i.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                        }
                    }, composer, 54), composer, 384, 3);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            }
        }));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Window window;
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = 81;
        attributes.width = -1;
        window.setAttributes(attributes);
    }
}
