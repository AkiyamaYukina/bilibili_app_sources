package com.bilibili.teenagersmode.ui;

import HS0.d0;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.droid.BundleUtil;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.dd.DeviceDecision;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.teenagersmode.c;
import com.bilibili.teenagersmode.utils.TeenagersRouter;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/ui/TeenagersForceModeTimeUpFragment.class */
@StabilityInferred(parameters = 0)
public final class TeenagersForceModeTimeUpFragment extends BaseFragment implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Integer f110611b = -1;

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i7, int i8, @Nullable Intent intent) {
        super.onActivityResult(i7, i8, intent);
        if (i7 == 10086) {
            ((g) R0.k.a(requireActivity(), g.class)).f110672a = false;
            if (i8 == -1 && intent != null && intent.getBooleanExtra("guardianVerified", false) && intent.getBooleanExtra("guardianVerified", false)) {
                Integer integer = BundleUtil.getInteger(getArguments(), "state", new Integer[0]);
                com.bilibili.teenagersmode.c cVar = c.C1213c.f110575a;
                if (integer != null && integer.intValue() == 6) {
                    com.bilibili.teenagersmode.b.j(getContext(), true);
                    Neurons.reportClick(false, "main.teenagermodel.enter-detail.curfew-clock-success.click", new HashMap());
                    cVar.n(null);
                } else if (integer != null && integer.intValue() == 7) {
                    sD0.i.c("1");
                    com.bilibili.teenagersmode.b.m(getContext(), true);
                    cVar.f110570p.c = true;
                    cVar.p(null);
                }
                cVar.getClass();
                com.bilibili.teenagersmode.c.l(false);
                cVar.u(getContext());
                ToastHelper.showToast(getContext(), 2131855986, 0);
                requireActivity().finish();
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View view) {
        if (view.getId() == 2131302477) {
            ((g) R0.k.a(requireActivity(), g.class)).f110672a = true;
            Integer num = this.f110611b;
            String str = (num != null && num.intValue() == 6) ? "main.teenagermodel.enter-detail.parents-curfew-verify.click" : (num != null && num.intValue() == 7) ? "main.teenagermodel.enter-detail.parents-overtime-verify.click" : null;
            if (str != null) {
                Neurons.reportClick(false, str);
            }
            BLRouter.routeTo(new RouteRequest.Builder(TeenagersRouter.a()).requestCode(10086).extras(new d0(this, 3)).build(), this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131500138, viewGroup, false);
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(2131302477);
        TextView textView = (TextView) view.findViewById(2131298661);
        TextView textView2 = (TextView) view.findViewById(2131310619);
        TintImageView tintImageView = (TintImageView) view.findViewById(2131302505);
        Integer integer = BundleUtil.getInteger(getArguments(), "state", new Integer[0]);
        this.f110611b = integer;
        if (integer != null && integer.intValue() == 7) {
            tintImageView.setImageDrawable(AppCompatResources.getDrawable(view.getContext(), 2131236643));
            textView2.setText(getString(2131855997));
            textView.setText(DeviceDecision.INSTANCE.dd("teenagers_mode_force_timelock_text_v2", requireContext().getResources().getString(2131856022)));
        } else {
            Integer num = this.f110611b;
            if (num != null && num.intValue() == 6) {
                tintImageView.setImageDrawable(AppCompatResources.getDrawable(view.getContext(), 2131236642));
                textView2.setText(getString(2131856023));
                textView.setText(DeviceDecision.INSTANCE.dd("teenagers_mode_force_night_text_v2", requireContext().getResources().getString(2131856028)));
            }
        }
        if (BiliAccounts.get(requireContext()).isLogin()) {
            viewFindViewById.setOnClickListener(this);
        } else {
            viewFindViewById.setVisibility(8);
        }
        Integer num2 = this.f110611b;
        if (num2 != null && num2.intValue() == 6) {
            Neurons.reportExposure(false, "main.teenagermodel.enter-detail.curfew.show", new HashMap());
            Neurons.reportExposure(false, "main.teenagermodel.enter-detail.force-curfew.show");
            com.bilibili.teenagersmode.b.j(p3(), false);
        } else {
            Integer num3 = this.f110611b;
            if (num3 != null && num3.intValue() == 7) {
                sD0.i.b("1");
                Neurons.reportExposure(false, "main.teenagermodel.enter-detail.force-overtime.show");
            }
        }
    }
}
