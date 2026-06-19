package com.bilibili.pegasus.widgets;

import android.view.View;
import com.bilibili.upper.module.cover_v2.ui.MultiCoverGuideDialog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/widgets/i.class */
public final /* synthetic */ class i implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f79239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f79240b;

    public /* synthetic */ i(Object obj, int i7) {
        this.f79239a = i7;
        this.f79240b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f79239a) {
            case 0:
                PegasusAutoInlineSettingView.c((PegasusAutoInlineSettingView) this.f79240b);
                break;
            case 1:
                ((com.bilibili.search2.result.holder.author.g) this.f79240b).q0();
                break;
            default:
                ((MultiCoverGuideDialog) this.f79240b).dismiss();
                break;
        }
    }
}
