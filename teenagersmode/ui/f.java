package com.bilibili.teenagersmode.ui;

import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.bapis.bilibili.app.interfaces.v1.FacialRecognitionVerifyReply;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.moss.api.BusinessException;
import com.bilibili.lib.moss.api.MossException;
import com.bilibili.lib.moss.api.MossResponseHandler;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.magicasakura.widgets.TintProgressDialog;
import com.bilibili.teenagersmode.c;
import java.util.HashMap;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/ui/f.class */
public final class f implements MossResponseHandler<FacialRecognitionVerifyReply> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TeenagerModeFindPwdComposeView f110670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FragmentActivity f110671b;

    public f(TeenagerModeFindPwdComposeView teenagerModeFindPwdComposeView, FragmentActivity fragmentActivity) {
        this.f110670a = teenagerModeFindPwdComposeView;
        this.f110671b = fragmentActivity;
    }

    public final void onCompleted() {
        TintProgressDialog tintProgressDialog = this.f110670a.f110605c;
        if (tintProgressDialog != null) {
            tintProgressDialog.dismiss();
        }
        com.bilibili.teenagersmode.c cVar = c.C1213c.f110575a;
        FragmentActivity fragmentActivity = this.f110671b;
        cVar.o(fragmentActivity, false);
        ToastHelper.showToast(fragmentActivity, 2131856007, 0);
        HashMap map = new HashMap();
        map.put("source_event", "1");
        Neurons.reportClick(false, "main.teenagermodel.enter-detail.close-success.click", map);
        com.bilibili.teenagersmode.c.c(fragmentActivity, null);
    }

    public final void onError(MossException mossException) {
        TintProgressDialog tintProgressDialog = this.f110670a.f110605c;
        if (tintProgressDialog != null) {
            tintProgressDialog.dismiss();
        }
        if (mossException != null) {
            boolean z6 = mossException instanceof BusinessException;
            FragmentActivity fragmentActivity = this.f110671b;
            if (!z6 || TextUtils.isEmpty(mossException.getMessage())) {
                ToastHelper.showToast(fragmentActivity, 2131856000, 0);
            } else {
                ToastHelper.showToast(fragmentActivity, mossException.getMessage(), 0);
            }
        }
    }

    public final /* bridge */ /* synthetic */ void onNext(Object obj) {
    }
}
