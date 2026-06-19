package com.bilibili.biligame.business.pegasus.view;

import android.view.View;
import com.bilibili.biligame.download.GameDownloadManager;
import com.bilibili.biligame.report3.ReporterV3;
import com.bilibili.biligame.ui.pointmall.PointMallHomeActivity;
import com.bilibili.biligame.ui.pointmall.mall.MallFragment;
import com.bilibili.game.service.bean.DownloadInfo;
import com.bilibili.opd.app.bizcommon.hybridruntime.KFCHybridV2;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/pegasus/view/h.class */
public final /* synthetic */ class h implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f62766a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f62767b;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f62766a) {
            case 0:
                j jVar = (j) this.f62767b;
                Iterator<T> it = jVar.f62769i.iterator();
                while (it.hasNext()) {
                    GameDownloadManager.INSTANCE.install(jVar.getContext(), (DownloadInfo) it.next());
                }
                jVar.f62784x.put("is_no_reminder", jVar.c().isChecked() ? "1" : "0");
                ReporterV3.reportClick(KFCHybridV2.Configuration.MALL_DOWNLOAD_DOMAIN, "reminder-window", "button", jVar.f62784x);
                jVar.dismiss();
                break;
            default:
                MallFragment mallFragment = (MallFragment) this.f62767b;
                KProperty[] kPropertyArr = MallFragment.h;
                ReporterV3.reportClick("game-ball.points-mall-shopping-mall.info.0.click", MapsKt.hashMapOf(new Pair[]{TuplesKt.to("module", "get_method")}));
                PointMallHomeActivity pointMallHomeActivityP3 = mallFragment.p3();
                PointMallHomeActivity pointMallHomeActivity = pointMallHomeActivityP3 instanceof PointMallHomeActivity ? pointMallHomeActivityP3 : null;
                if (pointMallHomeActivity != null) {
                    pointMallHomeActivity.U6();
                }
                break;
        }
    }
}
