package com.bilibili.music.podcast.fragment;

import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.lib.ui.mixin.Flag;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/BaseLoadFragment.class */
public abstract class BaseLoadFragment extends BaseFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f66559b = true;

    public void loadData() {
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, com.bilibili.lib.ui.mixin.IFragmentShowHide
    public final void onFragmentShow(@NotNull Flag flag) {
        super.onFragmentShow(flag);
        if (this.f66559b) {
            loadData();
        }
        this.f66559b = false;
    }
}
