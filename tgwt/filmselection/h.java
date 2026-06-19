package com.bilibili.tgwt.filmselection;

import android.view.View;
import com.bilibili.studio.videoeditor.bgm.bgmlist.BgmListActivity;
import com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment.BgmListSheetFragment;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/filmselection/h.class */
public final /* synthetic */ class h implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f111189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f111190b;

    public /* synthetic */ h(Object obj, int i7) {
        this.f111189a = i7;
        this.f111190b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f111189a) {
            case 0:
                ((j) this.f111190b).f111193b.invoke();
                break;
            default:
                BgmListSheetFragment bgmListSheetFragment = (BgmListSheetFragment) this.f111190b;
                int i7 = BgmListSheetFragment.f109029q;
                com.bilibili.studio.videoeditor.bgm.e eVar = bgmListSheetFragment.f108991c;
                eVar.N();
                eVar.notifyDataSetChanged();
                aD0.f.d().f("BgmListSheetFragment 1");
                BgmListActivity bgmListActivity = bgmListSheetFragment.f108992d;
                bgmListActivity.Q6().mf(true);
                bgmListActivity.f108956z.startAnimation(bgmListActivity.f108943C);
                bgmListActivity.f108956z.setVisibility(8);
                break;
        }
    }
}
