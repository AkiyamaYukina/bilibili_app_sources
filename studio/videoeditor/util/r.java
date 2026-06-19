package com.bilibili.studio.videoeditor.util;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AlertDialog;
import com.bilibili.lib.neuron.api.Neurons;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/r.class */
public final class r implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f110246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Intent f110247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AlertDialog f110248c;

    public r(Activity activity, Intent intent, AlertDialog alertDialog) {
        this.f110246a = activity;
        this.f110247b = intent;
        this.f110248c = alertDialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            this.f110246a.startActivity(this.f110247b);
        } catch (Throwable th) {
            com.bilibili.adcommon.utils.e.a("goto sys page fail :", "showNeededCleanStorageDialog", th);
        }
        this.f110248c.dismiss();
        Xz0.d.f28458a.getClass();
        Map mapE = Xz0.d.e();
        ((HashMap) mapE).put("click_type", "1");
        Neurons.reportClick(false, "creation.video-editor.pop-up.lack-of-storage.click", mapE);
    }
}
