package com.bilibili.opd.app.bizcommon.imageselector.page;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.opd.app.bizcommon.context.KFCToolbarFragment;
import com.bilibili.opd.app.bizcommon.context.StatusBarMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/page/MallMediaBaseFragment.class */
@StabilityInferred(parameters = 0)
public abstract class MallMediaBaseFragment extends KFCToolbarFragment {
    public static final int $stable = 8;

    @NotNull
    public String getTitle() {
        return "";
    }

    public void initToolbar(@Nullable View view) {
        setStatusBarMode(StatusBarMode.IMMERSIVE_FULL_TRANSPARENT);
    }

    @Override // com.bilibili.opd.app.bizcommon.context.KFCToolbarFragment, com.bilibili.opd.app.bizcommon.context.KFCFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        try {
            if (supportToolbar() && p3() != null && (p3() instanceof AppCompatActivity) && ((AppCompatActivity) p3()).getSupportActionBar() != null) {
                ((AppCompatActivity) p3()).getSupportActionBar().setDisplayShowTitleEnabled(false);
            }
        } catch (Exception e7) {
        }
        super.onActivityCreated(bundle);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
    }

    @Override // com.bilibili.opd.app.bizcommon.context.KFCToolbarFragment
    @Nullable
    public View onCreateContentView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewOnCreateView = onCreateView(layoutInflater, viewGroup);
        return viewOnCreateView != null ? viewOnCreateView : layoutInflater.inflate(2131499011, viewGroup, false);
    }

    @Nullable
    public abstract View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup);

    @Override // com.bilibili.opd.app.bizcommon.context.KFCFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
    }

    @Override // com.bilibili.opd.app.bizcommon.context.KFCFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
    }

    @Override // com.bilibili.opd.app.bizcommon.context.KFCFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    public final void resetStatusBarTextColor() {
        if (p3() != null) {
            StatusBarCompat.setStatusBarLightMode(p3());
        }
    }

    public boolean supportToolbar() {
        return true;
    }
}
