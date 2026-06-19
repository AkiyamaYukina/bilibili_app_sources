package com.bilibili.upper.module.manuscript.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import bF0.C1;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.upper.module.contribute.picker.widget.UpperPinchImageView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/fragment/ViolationPicItemFragment.class */
@StabilityInferred(parameters = 0)
public final class ViolationPicItemFragment extends BaseFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public C1 f113653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public String f113654c;

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        C1 c1Inflate = C1.inflate(layoutInflater, viewGroup, false);
        this.f113653b = c1Inflate;
        return c1Inflate != null ? c1Inflate.f54657a : null;
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        UpperPinchImageView upperPinchImageView;
        UpperPinchImageView upperPinchImageView2;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        this.f113654c = arguments != null ? arguments.getString("pic_src") : null;
        C1 c12 = this.f113653b;
        if (c12 != null && (upperPinchImageView2 = c12.f54658b) != null) {
            BiliImageLoader.INSTANCE.with(upperPinchImageView2.getContext()).url(this.f113654c).useOrigin().into(upperPinchImageView2);
        }
        C1 c13 = this.f113653b;
        if (c13 == null || (upperPinchImageView = c13.f54658b) == null) {
            return;
        }
        upperPinchImageView.setEnableClosingDrag(false);
    }
}
