package com.bilibili.music.podcast.fragment;

import com.bilibili.lib.ui.BaseFragment;
import org.jetbrains.annotations.Nullable;
import qi0.InterfaceC8437g;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/AbsListDetailFragment.class */
public abstract class AbsListDetailFragment extends BaseFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public InterfaceC8437g f66497b;

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f66497b = null;
    }
}
