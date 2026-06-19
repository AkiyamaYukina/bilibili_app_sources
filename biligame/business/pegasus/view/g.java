package com.bilibili.biligame.business.pegasus.view;

import android.view.View;
import com.bilibili.biligame.report3.ReporterV3;
import com.bilibili.biligame.ui.pointmall.mall.MallFragment;
import com.bilibili.search2.result.holder.recommend.SearchRelatedAuthorAdapter;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/pegasus/view/g.class */
public final /* synthetic */ class g implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f62764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f62765b;

    public /* synthetic */ g(MallFragment mallFragment) {
        this.f62764a = 1;
        this.f62765b = mallFragment;
    }

    public /* synthetic */ g(Object obj, int i7) {
        this.f62764a = i7;
        this.f62765b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f62764a) {
            case 0:
                ((j) this.f62765b).c().performClick();
                break;
            case 1:
                MallFragment mallFragment = (MallFragment) this.f62765b;
                KProperty[] kPropertyArr = MallFragment.h;
                ReporterV3.reportClick("game-ball.points-mall-shopping-mall.info.0.click", MapsKt.hashMapOf(new Pair[]{TuplesKt.to("module", "explanation")}));
                As.c cVar = mallFragment.g;
                if (cVar != null) {
                    As.c.c(cVar);
                }
                break;
            default:
                SearchRelatedAuthorAdapter.SearchRelatedAuthorItem3Holder.bind$lambda$5((SearchRelatedAuthorAdapter.SearchRelatedAuthorItem3Holder) this.f62765b, view);
                break;
        }
    }
}
