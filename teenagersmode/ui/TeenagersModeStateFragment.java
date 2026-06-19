package com.bilibili.teenagersmode.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.teenagersmode.TeenagersMode;
import com.bilibili.teenagersmode.model.TeenagersTextConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kntr.base.utils.foundation.InputMethodManagerHelper;
import sD0.InterfaceC8578a;
import tv.danmaku.android.util.AppBuildConfig;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/ui/TeenagersModeStateFragment.class */
public class TeenagersModeStateFragment extends BaseFragment implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f110653b;

    public static void jf(LinearLayout linearLayout, List list) {
        linearLayout.removeAllViews();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TeenagersTextConfig teenagersTextConfig = (TeenagersTextConfig) it.next();
            if (teenagersTextConfig != null) {
                B b7 = new B(linearLayout.getContext());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.bottomMargin = (int) LA.f.a(24, 1);
                b7.setLayoutParams(layoutParams);
                String icon = teenagersTextConfig.getIcon();
                String text = teenagersTextConfig.getText();
                BiliImageView biliImageView = b7.f110593a;
                if (biliImageView != null) {
                    BiliImageLoader.INSTANCE.with(b7.getContext()).url(icon).into(biliImageView);
                }
                TintTextView tintTextView = b7.f110594b;
                if (tintTextView != null) {
                    tintTextView.setText(text);
                }
                linearLayout.addView(b7);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC8578a interfaceC8578a = getParentFragment() instanceof InterfaceC8578a ? (InterfaceC8578a) getParentFragment() : p3() instanceof InterfaceC8578a ? (InterfaceC8578a) p3() : null;
        if (interfaceC8578a == null) {
            return;
        }
        int id = view.getId();
        Bundle bundle = new Bundle();
        bundle.putInt("source_event", this.f110653b);
        if (id == 2131308289) {
            bundle.putInt("state", 0);
            Neurons.reportClick(false, "main.teenagermodel.enter-detail.open.click", new HashMap());
            interfaceC8578a.G(bundle, TeenagersModePwdFragment.class.getName(), true);
        } else {
            if (id != 2131298371) {
                if (id == 2131307560) {
                    bundle.putInt("state", 2);
                    Neurons.reportClick(false, "main.teenagermodel.enter-detail.change-pswd.click", new HashMap());
                    interfaceC8578a.G(bundle, TeenagersModePwdFragment.class.getName(), true);
                    return;
                }
                return;
            }
            bundle.putInt("state", 5);
            Neurons.reportClick(false, "main.teenagermodel.enter-detail.close.click", new HashMap());
            if (TeenagersMode.getInstance().isForce()) {
                interfaceC8578a.G(bundle, TeenagersForceModeGuardianCertificationFragment.class.getName(), true);
            } else {
                interfaceC8578a.G(bundle, TeenagersModePwdFragment.class.getName(), true);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(AppBuildConfig.isHDApp(getContext()) ? 2131500146 : 2131500145, viewGroup, false);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (p3() != null) {
            InputMethodManagerHelper.tryHideSoftInput(p3());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0184  */
    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onViewCreated(@androidx.annotation.NonNull android.view.View r9, @androidx.annotation.Nullable android.os.Bundle r10) {
        /*
            Method dump skipped, instruction units count: 550
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.teenagersmode.ui.TeenagersModeStateFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
