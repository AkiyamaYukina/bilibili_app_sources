package com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment;

import android.app.LoaderManager;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import cB0.d;
import com.bilibili.studio.videoeditor.bgm.bgmlist.BgmListActivity;
import com.bilibili.studio.videoeditor.bgm.e;
import com.bilibili.studio.videoeditor.util.S;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/bgmlist/ui/fragment/BgmHotListFragment.class */
public class BgmHotListFragment extends BaseBgmListFragment {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f109001n = true;

    @Override // com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment.BaseBgmListFragment
    public final String hf() {
        return S.a(this.f108993e, 2131850468);
    }

    @Override // com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment.BaseBgmListFragment
    /* JADX INFO: renamed from: if */
    public final boolean mo10410if() {
        return this.f109001n;
    }

    @Override // com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment.BaseBgmListFragment
    public final void mf(boolean z6) {
        this.f109001n = z6;
    }

    @Override // com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment.BaseBgmListFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        int i7;
        LoaderManager loaderManager;
        super.onViewCreated(view, bundle);
        BgmListActivity bgmListActivity = this.f108992d;
        if (bgmListActivity != null) {
            i7 = bgmListActivity.f108954x;
            loaderManager = bgmListActivity.getLoaderManager();
        } else {
            i7 = 2;
            loaderManager = null;
        }
        d.a().d(i7, loaderManager, new eB0.d(this));
    }

    @Override // com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment.BaseBgmListFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z6) {
        e eVar;
        super.setUserVisibleHint(z6);
        if (!z6 || (eVar = this.f108991c) == null) {
            return;
        }
        eVar.notifyDataSetChanged();
        Xz0.d dVar = Xz0.d.f28458a;
        String strHf = hf();
        dVar.getClass();
        Xz0.d.C(strHf);
    }
}
