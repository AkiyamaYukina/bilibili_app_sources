package com.bilibili.teenagersmode.ui;

import Pi0.C2779a;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.bilibili.droid.BundleUtil;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.lib.ui.callback.IBackPress;
import com.bilibili.lib.ui.garb.GarbManager;
import com.bilibili.teenagersmode.TeenagersMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sD0.InterfaceC8578a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/ui/TeenagersModeContainerFragment.class */
@StabilityInferred(parameters = 0)
public final class TeenagersModeContainerFragment extends androidx_fragment_app_Fragment implements InterfaceC8578a, IBackPress {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f110616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f110617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FragmentManager f110618d;

    @Override // sD0.InterfaceC8578a
    public final void G(@Nullable Bundle bundle, @NotNull String str, boolean z6) {
        Fragment fragmentInstantiate = Fragment.instantiate(requireContext(), str, bundle);
        FragmentManager fragmentManager = this.f110618d;
        FragmentManager fragmentManager2 = fragmentManager;
        if (fragmentManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFragmentManager");
            fragmentManager2 = null;
        }
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager2.beginTransaction();
        fragmentTransactionBeginTransaction.replace(2131299392, fragmentInstantiate, str);
        if (z6) {
            fragmentTransactionBeginTransaction.addToBackStack(str);
        }
        fragmentTransactionBeginTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    @Override // com.bilibili.lib.ui.callback.IBackPress
    public final boolean onBackPressed() {
        if (getChildFragmentManager().getBackStackEntryCount() > 0) {
            getChildFragmentManager().popBackStack();
            return true;
        }
        if (this.f110616b != 1) {
            return false;
        }
        C2779a.a("main.teenagermodel.enter-detail.forbidden-page-continue.click", false);
        return false;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@androidx.annotation.Nullable @Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.f110618d = getChildFragmentManager();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f110616b = BundleUtil.getInteger(arguments, "page_type", new Integer[]{0}).intValue();
            this.f110617c = BundleUtil.getInteger(arguments, "source_event", new Integer[]{0}).intValue();
        }
        int i7 = this.f110616b;
        if (i7 == 0) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("source_event", this.f110617c);
            bundle2.putInt("teenagers_mode_state", TeenagersMode.getInstance().isEnable() ? 1 : 0);
            G(bundle2, TeenagersModeStateFragment.class.getName(), false);
            return;
        }
        if (i7 == 1) {
            G(null, TeenagersModeInterceptFragment.class.getName(), false);
            return;
        }
        if (i7 == 2) {
            Bundle bundleB = B1.a.b(8, "state");
            if (TeenagersMode.getInstance().isForce()) {
                G(bundleB, TeenagersForceModeGuardianCertificationFragment.class.getName(), false);
                return;
            } else {
                G(bundleB, TeenagersModePwdFragment.class.getName(), false);
                return;
            }
        }
        if (i7 == 3) {
            Bundle bundleB2 = B1.a.b(5, "state");
            bundleB2.putInt("source_event", this.f110617c);
            if (TeenagersMode.getInstance().isForce()) {
                G(bundleB2, TeenagersForceModeGuardianCertificationFragment.class.getName(), false);
                return;
            } else {
                G(bundleB2, TeenagersModePwdFragment.class.getName(), false);
                return;
            }
        }
        if (i7 == 4) {
            G(B1.a.b(9, "state"), TeenagersMode.getInstance().isForce() ? TeenagersForceModeGuardianCertificationFragment.class.getName() : TeenagersModePwdFragment.class.getName(), false);
        } else {
            if (i7 != 5) {
                return;
            }
            Integer integer = BundleUtil.getInteger(arguments, "age_set", new Integer[]{-1});
            Bundle bundleB3 = B1.a.b(11, "state");
            bundleB3.putInt("age_set", integer.intValue());
            G(bundleB3, TeenagersModePwdFragment.class.getName(), false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate = layoutInflater.inflate(2131503010, viewGroup, false);
        viewInflate.setPadding(viewInflate.getPaddingLeft(), viewInflate.getPaddingTop(), viewInflate.getPaddingRight(), (int) TypedValue.applyDimension(1, GarbManager.getGarbWithNightMode(viewInflate.getContext()).isPure() ? 53.0f : 68.0f, viewInflate.getResources().getDisplayMetrics()));
        viewInflate.findViewById(2131321843).setOnClickListener(new Sa0.e(this, 1));
        TextView textView = (TextView) viewInflate.findViewById(2131317857);
        int i7 = this.f110616b;
        String string = (i7 == 0 || i7 == 1 || i7 == 2) ? getString(2131855992) : i7 != 3 ? (i7 == 4 || i7 != 5) ? getString(2131855992) : getString(2131855992) : getString(2131855990);
        textView.setText(string);
        return viewInflate;
    }
}
