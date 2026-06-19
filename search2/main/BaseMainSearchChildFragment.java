package com.bilibili.search2.main;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.ui.BaseFragment;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/BaseMainSearchChildFragment.class */
@StabilityInferred(parameters = 0)
public class BaseMainSearchChildFragment extends BaseFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f86621b;

    @NotNull
    public String jf() {
        return "";
    }

    @NotNull
    public String kf() {
        return "";
    }

    public void lf(boolean z6) {
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z6) {
        super.onHiddenChanged(z6);
        if (this.f86621b) {
            lf(z6);
        } else {
            this.f86621b = true;
        }
    }
}
