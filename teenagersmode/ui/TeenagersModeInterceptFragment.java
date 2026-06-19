package com.bilibili.teenagersmode.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.teenagersmode.TeenagersMode;
import java.util.HashMap;
import kntr.base.utils.foundation.InputMethodManagerHelper;
import sD0.InterfaceC8578a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/ui/TeenagersModeInterceptFragment.class */
public class TeenagersModeInterceptFragment extends BaseFragment implements View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        InterfaceC8578a interfaceC8578a = getParentFragment() instanceof InterfaceC8578a ? (InterfaceC8578a) getParentFragment() : p3() instanceof InterfaceC8578a ? (InterfaceC8578a) p3() : null;
        if (interfaceC8578a != null && id == 2131298371) {
            Neurons.reportClick(false, "main.teenagermodel.enter-detail.forbidden-page-close.click", new HashMap());
            Bundle bundle = new Bundle();
            bundle.putInt("state", 5);
            interfaceC8578a.G(bundle, (TeenagersMode.getInstance().isForce() ? TeenagersForceModeGuardianCertificationFragment.class : TeenagersModePwdFragment.class).getName(), true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131500143, viewGroup, false);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (p3() != null) {
            InputMethodManagerHelper.tryHideSoftInput(p3());
        }
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.findViewById(2131298371).setOnClickListener(this);
        Neurons.reportExposure(false, "main.teenagermodel.enter-detail.forbidden-page.show", new HashMap());
    }
}
