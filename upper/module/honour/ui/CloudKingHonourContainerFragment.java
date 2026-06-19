package com.bilibili.upper.module.honour.ui;

import H3.q0;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.lib.ui.mixin.Flag;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.upper.module.honour.bean.KingHonourAccountBean;
import com.bilibili.upper.module.honour.bean.KingHonourResponseBean;
import com.bilibili.upper.module.honour.net.KingHonourApiService;
import dI0.C6793a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/ui/CloudKingHonourContainerFragment.class */
@StabilityInferred(parameters = 0)
public final class CloudKingHonourContainerFragment extends BaseFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f113211b = LazyKt.lazy(new q0(7));

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(layoutInflater.getContext());
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout2.setId(((Number) this.f113211b.getValue()).intValue());
        frameLayout.addView(frameLayout2);
        return frameLayout;
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, com.bilibili.lib.ui.mixin.IFragmentShowHide
    public final void onFragmentShow(@NotNull Flag flag) {
        super.onFragmentShow(flag);
        if (getChildFragmentManager().findFragmentById(((Number) this.f113211b.getValue()).intValue()) == null) {
            BiliCall<GeneralResponse<KingHonourResponseBean<KingHonourAccountBean>>> bindingContent = ((KingHonourApiService) ServiceGenerator.createService(KingHonourApiService.class)).getBindingContent();
            if (bindingContent != null) {
                bindingContent.enqueue(new C6793a(this));
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
