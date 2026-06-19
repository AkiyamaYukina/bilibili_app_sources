package com.bilibili.teenagersmode.ui;

import androidx.fragment.app.FragmentActivity;
import com.bapis.bilibili.app.interfaces.v1.PwdFrom;
import com.bapis.bilibili.app.interfaces.v1.SetTeenagersModelAgeReq;
import com.bilibili.droid.BundleUtil;
import com.bilibili.lib.biliid.api.BiliIds;
import com.bilibili.teenagersmode.c;
import com.bilibili.teenagersmode.ui.TeenagersModePwdFragment;
import kotlin.Unit;
import kotlin.jvm.internal.Ref;
import rx.Emitter;
import rx.functions.Action1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/ui/u.class */
public final /* synthetic */ class u implements TeenagersModePwdFragment.f, Action1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f110689a;

    public /* synthetic */ u(TeenagersModePwdFragment teenagersModePwdFragment) {
        this.f110689a = teenagersModePwdFragment;
    }

    public void call(Object obj) {
        ((Ref.ObjectRef) this.f110689a).element = (Emitter) obj;
        Unit unit = Unit.INSTANCE;
    }

    @Override // com.bilibili.teenagersmode.ui.TeenagersModePwdFragment.f
    public void onFinished() {
        TeenagersModePwdFragment teenagersModePwdFragment = (TeenagersModePwdFragment) this.f110689a;
        FragmentActivity fragmentActivityP3 = teenagersModePwdFragment.p3();
        if (fragmentActivityP3 == null) {
            return;
        }
        int iIntValue = BundleUtil.getInteger(teenagersModePwdFragment.getArguments(), "age_set", new Integer[]{-1}).intValue();
        String str = teenagersModePwdFragment.f110627d;
        PwdFrom pwdFromLf = teenagersModePwdFragment.lf(11);
        boolean zG = c.C1213c.f110575a.g(fragmentActivityP3);
        y yVar = new y(teenagersModePwdFragment, new boolean[]{false}, iIntValue, fragmentActivityP3);
        vD0.d dVar = vD0.d.a;
        SetTeenagersModelAgeReq setTeenagersModelAgeReqBuild = SetTeenagersModelAgeReq.newBuilder().setAge(iIntValue).setPwd(str).setPwdFrom(pwdFromLf).setDeviceToken(BiliIds.buvidServer()).setIsDynamic(zG).build();
        vD0.d.a.getClass();
        vD0.d.b.setTeenagersModelAge(setTeenagersModelAgeReqBuild, vD0.d.a(yVar));
    }
}
