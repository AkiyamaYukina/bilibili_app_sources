package com.bilibili.teenagersmode.ui;

import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import com.bapis.bilibili.app.interfaces.v1.ModifyPwdReply;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.moss.api.MossException;
import com.bilibili.lib.moss.api.MossResponseHandler;
import com.bilibili.lib.neuron.api.Neurons;
import java.util.HashMap;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/ui/A.class */
public final class A implements MossResponseHandler<ModifyPwdReply> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean[] f110590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FragmentActivity f110591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TeenagersModePwdFragment f110592c;

    public A(TeenagersModePwdFragment teenagersModePwdFragment, boolean[] zArr, FragmentActivity fragmentActivity, String str) {
        this.f110592c = teenagersModePwdFragment;
        this.f110590a = zArr;
        this.f110591b = fragmentActivity;
    }

    public final void onCompleted() {
        if (this.f110590a[0]) {
            return;
        }
        TeenagersModePwdFragment teenagersModePwdFragment = this.f110592c;
        TeenagersModePwdFragment.kf(teenagersModePwdFragment);
        teenagersModePwdFragment.f110627d = "";
        ToastHelper.showToast(this.f110591b, 2131856024, 0);
        Neurons.reportClick(false, "main.teenagermodel.enter-detail.change-pswd-success.click", new HashMap());
        if (teenagersModePwdFragment.p3() != null) {
            teenagersModePwdFragment.p3().finish();
        }
    }

    public final void onError(@Nullable MossException mossException) {
        this.f110590a[0] = true;
        TeenagersModePwdFragment teenagersModePwdFragment = this.f110592c;
        TeenagersModePwdFragment.kf(teenagersModePwdFragment);
        teenagersModePwdFragment.f110625b.j0();
        TeenagersModePwdFragment.jf(teenagersModePwdFragment, mossException);
    }

    public final /* bridge */ /* synthetic */ void onNext(@Nullable Object obj) {
    }
}
