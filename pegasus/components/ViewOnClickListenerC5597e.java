package com.bilibili.pegasus.components;

import android.view.View;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.upper.module.bcut.fragment.MaterialPreviewDialogFragment;
import com.google.android.material.snackbar.Snackbar;
import com.tencent.connect.common.Constants;
import hr0.C7490a;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import tv.danmaku.android.log.BLog;

/* JADX INFO: renamed from: com.bilibili.pegasus.components.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/e.class */
public final /* synthetic */ class ViewOnClickListenerC5597e implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f75954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f75955b;

    public /* synthetic */ ViewOnClickListenerC5597e(Object obj, int i7) {
        this.f75954a = i7;
        this.f75955b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f75954a) {
            case 0:
                Snackbar snackbar = (Snackbar) this.f75955b;
                BLog.i("PegasusCommonConfigPlugin", "showNightFollowSystemSnackbar: btn_dismiss clicked");
                Neurons.reportClick(false, "app.night-follow.notify.snackbar.click", MapsKt.mapOf(TuplesKt.to("button", "dismiss")));
                snackbar.dismiss();
                break;
            case 1:
                ((MaterialPreviewDialogFragment) this.f75955b).if();
                break;
            default:
                C7490a.g((C7490a) this.f75955b, view, 15L, Constants.VIA_REPORT_TYPE_WPA_STATE);
                break;
        }
    }
}
