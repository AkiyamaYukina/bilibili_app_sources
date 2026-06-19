package com.bilibili.search2.result;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bilibili.search2.main.C6042i;
import com.bilibili.search2.main.M;
import com.bilibili.search2.main.x;
import com.bilibili.upper.module.contribute.up.ui.collections.detail.PublishCollectionEpisodeFragment;
import yt0.C9092e;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/c.class */
public final /* synthetic */ class c implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f87707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f87708b;

    public /* synthetic */ c(Object obj, int i7) {
        this.f87707a = i7;
        this.f87708b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C6042i c6042iM9;
        OH.e eVar;
        ConstraintLayout constraintLayout;
        cJ.u uVar;
        switch (this.f87707a) {
            case 0:
                BiliMainSearchResultFragment biliMainSearchResultFragment = (BiliMainSearchResultFragment) this.f87708b;
                x xVar = null;
                biliMainSearchResultFragment.Ef(null);
                androidx.core.content.g gVarP3 = biliMainSearchResultFragment.p3();
                if (gVarP3 instanceof x) {
                    xVar = (x) gVarP3;
                }
                if (xVar != null && (c6042iM9 = xVar.m9()) != null && (eVar = c6042iM9.f86836b) != null && (constraintLayout = ((M) eVar.b).f86722c) != null && constraintLayout.getVisibility() == 0 && (uVar = c6042iM9.f86837c) != null) {
                    uVar.invoke();
                    break;
                }
                break;
            case 1:
                ((PublishCollectionEpisodeFragment) this.f87708b).dismissAllowingStateLoss();
                break;
            default:
                ((C9092e) this.f87708b).e();
                break;
        }
    }
}
