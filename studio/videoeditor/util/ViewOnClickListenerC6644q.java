package com.bilibili.studio.videoeditor.util;

import By0.C1448d0;
import android.view.View;
import androidx.appcompat.app.AlertDialog;
import com.bilibili.lib.neuron.api.Neurons;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.bilibili.studio.videoeditor.util.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/q.class */
public final class ViewOnClickListenerC6644q implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1448d0 f110244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AlertDialog f110245b;

    public ViewOnClickListenerC6644q(C1448d0 c1448d0, AlertDialog alertDialog) {
        this.f110244a = c1448d0;
        this.f110245b = alertDialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        bz0.e eVar = ((Ey0.l) this.f110244a.f1226a).f4879b;
        if (eVar != null) {
            eVar.invoke();
        }
        this.f110245b.dismiss();
        Xz0.d.f28458a.getClass();
        Map mapE = Xz0.d.e();
        ((HashMap) mapE).put("click_type", "0");
        Neurons.reportClick(false, "creation.video-editor.pop-up.lack-of-storage.click", mapE);
    }
}
