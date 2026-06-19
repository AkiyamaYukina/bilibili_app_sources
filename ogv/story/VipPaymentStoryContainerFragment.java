package com.bilibili.ogv.story;

import android.app.Dialog;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import j5.C7642d;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/story/VipPaymentStoryContainerFragment.class */
@StabilityInferred(parameters = 0)
public final class VipPaymentStoryContainerFragment extends DialogFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Fragment f73049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Function0<Unit> f73050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Function0<Unit> f73051d;

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle bundleRequireArguments = requireArguments();
        bundleRequireArguments.putString("vip_pay_page", "story-half-pay");
        Uri.Builder builderBuildUpon = Uri.parse("bilibili://vip/cashier").buildUpon();
        for (String str : bundleRequireArguments.keySet()) {
            builderBuildUpon.appendQueryParameter(str, bundleRequireArguments.getString(str));
        }
        builderBuildUpon.appendQueryParameter("scene", "story");
        Qj0.d dVarA = Qj0.c.a(builderBuildUpon.build().toString());
        if (dVarA != null) {
            Fragment fragmentInstantiate = getChildFragmentManager().getFragmentFactory().instantiate(dVarA.f19963a.getClassLoader(), dVarA.f19963a.getName());
            this.f73049b = fragmentInstantiate;
            fragmentInstantiate.setArguments(dVarA.f19964b);
            if (fragmentInstantiate instanceof uK0.e) {
                BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new VipPaymentStoryContainerFragment$generateFragment$2(fragmentInstantiate, this, null), 3, (Object) null);
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
        final int i7 = 0;
        final FragmentActivity fragmentActivityRequireActivity = requireActivity();
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1627812438, true, new Function2(i7, fragmentActivityRequireActivity, this) { // from class: com.bilibili.ogv.story.y

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f73130a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f73131b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Object f73132c;

            {
                this.f73130a = i7;
                this.f73131b = fragmentActivityRequireActivity;
                this.f73132c = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:38:0x04a5  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke(java.lang.Object r28, java.lang.Object r29) {
                /*
                    Method dump skipped, instruction units count: 1471
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.story.y.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }));
        return composeView;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NotNull DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        Function0<Unit> function0 = this.f73051d;
        Function0<Unit> function02 = function0;
        if (function0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onDismiss");
            function02 = null;
        }
        function02.invoke();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Window window;
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.clearFlags(2);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 81;
            attributes.width = -1;
            window.setAttributes(attributes);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setOnShowListener(new DialogInterface.OnShowListener(this) { // from class: com.bilibili.ogv.story.z

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final VipPaymentStoryContainerFragment f73133a;

                {
                    this.f73133a = this;
                }

                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    Function0<Unit> function0 = this.f73133a.f73050c;
                    Function0<Unit> function02 = function0;
                    if (function0 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("onShow");
                        function02 = null;
                    }
                    function02.invoke();
                }
            });
        }
        Dialog dialog3 = getDialog();
        if (dialog3 != null) {
            dialog3.setCanceledOnTouchOutside(true);
        }
    }
}
