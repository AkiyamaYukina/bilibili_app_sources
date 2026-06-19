package com.bilibili.playset.playlist.search2;

import LG0.a;
import android.view.View;
import com.bilibili.upper.module.contribute.up.model.ManuscriptEditV5ViewModel;
import com.bilibili.upper.module.contribute.up.ui.ManuscriptEditV6Fragment;
import gI0.C7263m;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search2/a.class */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f85440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f85441b;

    public /* synthetic */ a(Object obj, int i7) {
        this.f85440a = i7;
        this.f85441b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f85440a) {
            case 0:
                CollectionSearchActivity collectionSearchActivity = (CollectionSearchActivity) this.f85441b;
                int i7 = CollectionSearchActivity.f85393J;
                collectionSearchActivity.onBackPressed();
                break;
            case 1:
                ManuscriptEditV5ViewModel manuscriptEditV5ViewModelQf = ((ManuscriptEditV6Fragment) this.f85441b).Qf();
                if (manuscriptEditV5ViewModelQf != null) {
                    manuscriptEditV5ViewModelQf.V0(a.c.f14525a);
                }
                break;
            default:
                C7263m.a aVar = (C7263m.a) this.f85441b;
                aVar.q0(aVar.f119871m);
                break;
        }
    }
}
