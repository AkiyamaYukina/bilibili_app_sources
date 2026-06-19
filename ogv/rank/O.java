package com.bilibili.ogv.rank;

import YT0.i;
import android.os.SystemClock;
import android.view.View;
import com.mall.data.page.ip.bean.IpSortInfoBean;
import com.mall.logic.page.ip.IPHomeViewModel;
import com.mall.ui.page.ip.view.IPFragmentV2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/O.class */
public final /* synthetic */ class O implements i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f71864a;

    public void onClick(View view) {
        IPFragmentV2 iPFragmentV2 = (IPFragmentV2) this.f71864a;
        IPHomeViewModel iPHomeViewModel = iPFragmentV2.f;
        if (iPHomeViewModel != null) {
            String str = iPFragmentV2.n;
            String str2 = str;
            if (str == null) {
                str2 = "";
            }
            String str3 = iPFragmentV2.a1;
            IpSortInfoBean.Companion.getClass();
            IpSortInfoBean ipSortInfoBean = new IpSortInfoBean(str3, Intrinsics.areEqual(IpSortInfoBean.access$getPRICE$cp(), iPFragmentV2.a1) ? IpSortInfoBean.access$getPRICE_ASCEND$cp() : null);
            String str4 = iPFragmentV2.g1;
            String str5 = iPFragmentV2.r;
            iPHomeViewModel.K = SystemClock.elapsedRealtime();
            IPHomeViewModel.N0(iPHomeViewModel, str2, ipSortInfoBean, str4, true, false, false, str5, 32);
        }
    }
}
