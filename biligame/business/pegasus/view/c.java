package com.bilibili.biligame.business.pegasus.view;

import android.view.View;
import com.bilibili.biligame.video.settings.HomeAutoPlaySettingDialog;
import com.bilibili.upper.module.manuscript.activity.ManuscriptProgressDetailsActivity;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/pegasus/view/c.class */
public final /* synthetic */ class c implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f62742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f62743b;

    public /* synthetic */ c(Object obj, int i7) {
        this.f62742a = i7;
        this.f62743b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f62742a) {
            case 0:
                ((f) this.f62743b).c().performClick();
                break;
            case 1:
                ManuscriptProgressDetailsActivity manuscriptProgressDetailsActivity = (ManuscriptProgressDetailsActivity) this.f62743b;
                int i7 = ManuscriptProgressDetailsActivity.f113427E1;
                manuscriptProgressDetailsActivity.finish();
                break;
            default:
                HomeAutoPlaySettingDialog homeAutoPlaySettingDialog = (HomeAutoPlaySettingDialog) this.f62743b;
                int i8 = HomeAutoPlaySettingDialog.$stable;
                homeAutoPlaySettingDialog.dismiss();
                break;
        }
    }
}
