package com.bilibili.teenagersmode.ui;

import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import com.bapis.bilibili.app.interfaces.v1.PwdFrom;
import com.bapis.bilibili.app.interfaces.v1.UpdateStatusReply;
import com.bilibili.app.comm.restrict.utils.TeenagersModeKt;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.moss.api.MossException;
import com.bilibili.lib.moss.api.MossResponseHandler;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.magicasakura.widgets.TintProgressDialog;
import com.bilibili.teenagersmode.c;
import java.util.HashMap;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/ui/z.class */
public final class z implements MossResponseHandler<UpdateStatusReply> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean[] f110704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f110705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PwdFrom f110706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FragmentActivity f110707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TeenagersModePwdFragment f110708e;

    public z(TeenagersModePwdFragment teenagersModePwdFragment, boolean[] zArr, boolean z6, PwdFrom pwdFrom, FragmentActivity fragmentActivity) {
        this.f110708e = teenagersModePwdFragment;
        this.f110704a = zArr;
        this.f110705b = z6;
        this.f110706c = pwdFrom;
        this.f110707d = fragmentActivity;
    }

    public final void onCompleted() {
        if (this.f110704a[0]) {
            return;
        }
        StringBuilder sb = new StringBuilder("Update status to ");
        boolean z6 = this.f110705b;
        sb.append(z6);
        sb.append(" success from ");
        sb.append(this.f110706c.name());
        BLog.i("TeenagersMode", sb.toString());
        TeenagersModePwdFragment teenagersModePwdFragment = this.f110708e;
        TeenagersModePwdFragment.kf(teenagersModePwdFragment);
        teenagersModePwdFragment.f110625b.k0();
        FragmentActivity fragmentActivity = this.f110707d;
        if (z6) {
            BLog.i("TeenagersMode", "Enabling app teen mode.");
            teenagersModePwdFragment.f110627d = "";
            teenagersModePwdFragment.f110631i.o(fragmentActivity, true);
            ToastHelper.showToast(fragmentActivity, 2131855976, 0);
            int i7 = teenagersModePwdFragment.f110629f;
            HashMap map = new HashMap();
            map.put("source_event", String.valueOf(i7));
            Neurons.reportClick(false, "main.teenagermodel.enter-detail.open-success.click", map);
        } else {
            boolean zD = TeenagersModeKt.d();
            j4.t.a("Closing app teen mode, osEnabled: ", "TeenagersMode", zD);
            if (zD) {
                BLog.w("TeenagersMode", "Os teen enabled, skip closing");
                c.C1213c.f110575a.getClass();
                com.bilibili.teenagersmode.c.c(fragmentActivity, null);
            } else {
                teenagersModePwdFragment.f110631i.o(fragmentActivity, false);
                ToastHelper.showToast(fragmentActivity, 2131856007, 0);
                HashMap map2 = new HashMap();
                map2.put("source_event", "2");
                Neurons.reportClick(false, "main.teenagermodel.enter-detail.close-success.click", map2);
            }
        }
        c.C1213c.f110575a.getClass();
        com.bilibili.teenagersmode.c.c(fragmentActivity, null);
    }

    public final void onError(@Nullable MossException mossException) {
        this.f110704a[0] = true;
        BLog.e("TeenagersMode", "Fail to update teen status to " + this.f110705b + " from " + this.f110706c.name(), mossException);
        TeenagersModePwdFragment teenagersModePwdFragment = this.f110708e;
        teenagersModePwdFragment.f110625b.j0();
        TintProgressDialog tintProgressDialog = teenagersModePwdFragment.f110626c;
        if (tintProgressDialog != null) {
            tintProgressDialog.dismiss();
        }
        teenagersModePwdFragment.nf();
        TeenagersModePwdFragment.jf(teenagersModePwdFragment, mossException);
    }

    public final /* bridge */ /* synthetic */ void onNext(@Nullable Object obj) {
    }
}
