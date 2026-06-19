package com.bilibili.biligame.business.pegasus.view;

import android.view.View;
import com.bilibili.biligame.report3.ReporterV3;
import com.bilibili.opd.app.bizcommon.hybridruntime.KFCHybridV2;
import com.bilibili.upper.module.manuscript.activity.ManuscriptProgressDetailsActivity;
import eI0.C6921b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ot0.C8265d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/pegasus/view/d.class */
public final /* synthetic */ class d implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f62744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f62745b;

    public /* synthetic */ d(Object obj, int i7) {
        this.f62744a = i7;
        this.f62745b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f62744a) {
            case 0:
                f fVar = (f) this.f62745b;
                fVar.f62761w.put("is_no_reminder", fVar.c().isChecked() ? "1" : "0");
                ReporterV3.reportClick(KFCHybridV2.Configuration.MALL_DOWNLOAD_DOMAIN, "reminder-window", "no-reminder", fVar.f62761w);
                break;
            case 1:
                ManuscriptProgressDetailsActivity manuscriptProgressDetailsActivity = (ManuscriptProgressDetailsActivity) this.f62745b;
                int i7 = ManuscriptProgressDetailsActivity.f113427E1;
                boolean z6 = manuscriptProgressDetailsActivity.P6().f113692o;
                TE0.b bVar = TE0.b.f24088a;
                long j7 = manuscriptProgressDetailsActivity.f113486w1;
                long j8 = manuscriptProgressDetailsActivity.y1;
                int iR6 = manuscriptProgressDetailsActivity.R6();
                boolean z7 = !z6;
                bVar.getClass();
                TE0.b.s0(j7, j8, iR6, z7, "稿件上传");
                manuscriptProgressDetailsActivity.g7(z7);
                break;
            case 2:
                C6921b c6921b = (C6921b) this.f62745b;
                Function1<Boolean, Unit> function1 = c6921b.f117240f;
                if (function1 != null) {
                }
                c6921b.dismiss();
                break;
            default:
                ((C8265d) this.f62745b).y0();
                break;
        }
    }
}
