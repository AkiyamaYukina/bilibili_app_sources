package com.bilibili.ship.theseus.united.page.activitywindow;

import YT0.i;
import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.mall.logic.page.ip.IPGoodsViewModel;
import com.mall.ui.page.ip.view.IPGoodsFragment;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/activitywindow/g.class */
public final /* synthetic */ class g implements OnApplyWindowInsetsListener, i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f98866a;

    public /* synthetic */ g(Object obj) {
        this.f98866a = obj;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        ((ActivityWindowPropertyService) this.f98866a).a(windowInsetsCompat);
        return ViewCompat.onApplyWindowInsets(view, windowInsetsCompat);
    }

    public void onClick(View view) {
        IPGoodsViewModel iPGoodsViewModel = ((IPGoodsFragment) this.f98866a).q;
        if (iPGoodsViewModel != null) {
            iPGoodsViewModel.L0();
        }
    }
}
