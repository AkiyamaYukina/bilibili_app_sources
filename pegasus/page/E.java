package com.bilibili.pegasus.page;

import android.app.Dialog;
import android.view.View;
import com.mall.ui.page.ip.view.IPFragment;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/E.class */
public final /* synthetic */ class E implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f78282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f78283b;

    public /* synthetic */ E(Dialog dialog) {
        this.f78282a = 1;
        this.f78283b = dialog;
    }

    public /* synthetic */ E(Object obj, int i7) {
        this.f78282a = i7;
        this.f78283b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f78282a) {
            case 0:
                ((TimeMachinePegasusFragment) this.f78283b).rf();
                break;
            case 1:
                IPFragment.__Ghost$Insertion$com_bilibili_kaptbundle_BgThreadUIAccessDetectKt_hookDialogDismiss((Dialog) this.f78283b);
                break;
            default:
                oR.e eVar = (oR.e) this.f78283b;
                int i7 = oR.e.D;
                oR.a aVar = ((KS.k) eVar).b;
                if (aVar != null) {
                    aVar.f(((KS.k) eVar).c, ((KS.k) eVar).d);
                }
                break;
        }
    }
}
