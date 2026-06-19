package com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment;

import Sg.a;
import android.app.LoaderManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import cB0.d;
import com.bilibili.studio.videoeditor.bgm.bgmlist.BgmListActivity;
import com.bilibili.studio.videoeditor.util.S;
import eB0.e;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/bgmlist/ui/fragment/BgmListGalleryFragment.class */
public class BgmListGalleryFragment extends BaseBgmListFragment {
    @Override // com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment.BaseBgmListFragment
    public final String hf() {
        return S.a(this.f108993e, 2131850220);
    }

    @Override // com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment.BaseBgmListFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.f108991c.f109064l = new a(this);
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
        d.a().d(i7, loaderManager, new e(this));
    }

    @Override // com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment.BaseBgmListFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z6) {
        com.bilibili.studio.videoeditor.bgm.e eVar;
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
