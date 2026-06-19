package com.bilibili.search2.result.column;

import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.teenagersmode.ui.TeenagersModePwdFragment;
import tv.danmaku.bili.widget.dropdownmenu.DropDownMenuHead;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/column/g.class */
public final /* synthetic */ class g implements DropDownMenuHead.e, TeenagersModePwdFragment.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseFragment f87745a;

    public /* synthetic */ g(BaseFragment baseFragment) {
        this.f87745a = baseFragment;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(int r5, int r6, java.lang.String r7, Hh1.c r8) {
        /*
            Method dump skipped, instruction units count: 465
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.column.g.a(int, int, java.lang.String, Hh1.c):void");
    }

    @Override // com.bilibili.teenagersmode.ui.TeenagersModePwdFragment.f
    public void onFinished() {
        TeenagersModePwdFragment teenagersModePwdFragment = (TeenagersModePwdFragment) this.f87745a;
        FragmentActivity fragmentActivityP3 = teenagersModePwdFragment.p3();
        if (TextUtils.isEmpty(teenagersModePwdFragment.f110627d) || teenagersModePwdFragment.f110627d.length() != 4 || fragmentActivityP3 == null) {
            return;
        }
        if (TextUtils.equals(teenagersModePwdFragment.f110632j, teenagersModePwdFragment.f110627d)) {
            teenagersModePwdFragment.qf(10, teenagersModePwdFragment.f110627d, true);
            return;
        }
        teenagersModePwdFragment.f110625b.j0();
        teenagersModePwdFragment.nf();
        ToastHelper.showToast(fragmentActivityP3, 2131856020, 0);
    }
}
