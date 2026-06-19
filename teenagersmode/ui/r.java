package com.bilibili.teenagersmode.ui;

import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.bapis.bilibili.app.interfaces.v1.ModifyPwdReq;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.biliid.api.BiliIds;
import com.bilibili.teenagersmode.ui.TeenagersModePwdFragment;
import rx.functions.Action1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/ui/r.class */
public final /* synthetic */ class r implements TeenagersModePwdFragment.f, Action1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f110686a;

    public /* synthetic */ r(Object obj) {
        this.f110686a = obj;
    }

    public void call(Object obj) {
        ((X50.s) this.f110686a).invoke(obj);
    }

    @Override // com.bilibili.teenagersmode.ui.TeenagersModePwdFragment.f
    public void onFinished() {
        TeenagersModePwdFragment teenagersModePwdFragment = (TeenagersModePwdFragment) this.f110686a;
        FragmentActivity fragmentActivityP3 = teenagersModePwdFragment.p3();
        if (TextUtils.isEmpty(teenagersModePwdFragment.f110627d) || teenagersModePwdFragment.f110627d.length() != 4 || fragmentActivityP3 == null) {
            return;
        }
        if (!teenagersModePwdFragment.f110627d.equals(teenagersModePwdFragment.f110634l)) {
            teenagersModePwdFragment.f110625b.j0();
            teenagersModePwdFragment.nf();
            ToastHelper.showToast(fragmentActivityP3, 2131856020, 0);
            return;
        }
        String str = teenagersModePwdFragment.f110633k;
        String str2 = teenagersModePwdFragment.f110627d;
        FragmentActivity fragmentActivityP32 = teenagersModePwdFragment.p3();
        if (fragmentActivityP32 == null) {
            return;
        }
        teenagersModePwdFragment.pf();
        A a7 = new A(teenagersModePwdFragment, new boolean[]{false}, fragmentActivityP32, str2);
        vD0.d dVar = vD0.d.a;
        ModifyPwdReq modifyPwdReqBuild = ModifyPwdReq.newBuilder().setOldPwd(str).setNewPwd(str2).setDeviceToken(BiliIds.buvidServer()).build();
        vD0.d.a.getClass();
        vD0.d.b.modifyPwd(modifyPwdReqBuild, vD0.d.a(a7));
    }
}
