package com.bilibili.search2.result.all;

import Fm0.C1896d;
import VT0.e;
import androidx.lifecycle.LifecycleOwner;
import com.bilibili.lib.image2.bean.ImageTintableCallback;
import com.bilibili.lib.image2.view.legacy.ScalableImageView2;
import com.bilibili.lib.ui.util.NightTheme;
import com.bilibili.opd.app.bizcommon.hybridruntime.web.HybridWebViewV2;
import com.mall.ui.page.base.MallWebFragmentV2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/I.class */
public final /* synthetic */ class I implements ImageTintableCallback, e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LifecycleOwner f87132a;

    public void a(VT0.a aVar, String str) {
        int i7 = MallWebFragmentV2.i1;
        MallWebFragmentV2 mallWebFragmentV2 = this.f87132a;
        HybridWebViewV2 hybridWebViewV2 = mallWebFragmentV2.f73673d;
        if (hybridWebViewV2 == null || hybridWebViewV2.getWebView() == null) {
            return;
        }
        C1896d.b(mallWebFragmentV2.f73673d.getWebView(), "if(window.onScreenshot) {window.onScreenshot();}");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bilibili.search2.result.all.J] */
    public void tint() {
        ?? r02 = (J) this.f87132a;
        boolean zIsNightTheme = NightTheme.isNightTheme(r02.itemView.getContext());
        ScalableImageView2 scalableImageView2 = r02.f87133a;
        if (zIsNightTheme) {
            scalableImageView2.setAlpha(0.7f);
        } else {
            scalableImageView2.setAlpha(1.0f);
        }
    }
}
