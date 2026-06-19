package com.bilibili.search2.result.bangumi;

import android.app.Dialog;
import android.view.View;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.api.SearchOgvChannelItem;
import com.mall.ui.page.cart.MallCartBottomBarModule;
import com.mall.ui.page.ip.view.j1;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/bangumi/F.class */
public final /* synthetic */ class F implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f87338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f87339b;

    public /* synthetic */ F(Object obj, int i7) {
        this.f87338a = i7;
        this.f87339b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.mall.ui.page.cart.f fVar;
        com.mall.ui.page.cart.f fVar2;
        com.mall.ui.page.cart.f fVar3;
        switch (this.f87338a) {
            case 0:
                L l7 = (L) this.f87339b;
                l7.q0(Xs0.b.d((BaseSearchItem) l7.getData(), null, null, 3), ((SearchOgvChannelItem) l7.getData()).getUri(), MapsKt.emptyMap());
                break;
            case 1:
                MallCartBottomBarModule mallCartBottomBarModule = (MallCartBottomBarModule) this.f87339b;
                com.mall.ui.page.cart.m mVar = mallCartBottomBarModule.b;
                if (mVar != null && (fVar = (com.mall.ui.page.cart.f) ((LinkedHashMap) mVar.b).get(1)) != null) {
                    Dialog dialog = fVar.b;
                    boolean z6 = false;
                    boolean zIsShowing = dialog != null ? dialog.isShowing() : false;
                    com.mall.ui.page.cart.m mVar2 = mallCartBottomBarModule.b;
                    if (!zIsShowing) {
                        if (mVar2 != null && (fVar3 = (com.mall.ui.page.cart.f) ((LinkedHashMap) mVar2.b).get(1)) != null) {
                            Map map = mVar2.a;
                            if (map != null) {
                                z6 = false;
                                for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                                    if (((Boolean) entry.getValue()).booleanValue()) {
                                        if (Intrinsics.areEqual(entry.getKey(), fVar3)) {
                                            z6 = true;
                                        } else {
                                            Dialog dialog2 = ((com.mall.ui.page.cart.f) entry.getKey()).b;
                                            if (dialog2 != null ? dialog2.isShowing() : false) {
                                                mVar2.a.put(entry.getKey(), Boolean.FALSE);
                                                ((com.mall.ui.page.cart.f) entry.getKey()).b();
                                            } else {
                                                mVar2.a.put(entry.getKey(), Boolean.FALSE);
                                            }
                                        }
                                    }
                                }
                            }
                            if (!z6) {
                                fVar3.a();
                                try {
                                    HashMap map2 = new HashMap();
                                    Integer num = fVar3.a;
                                    if (num != null && num.intValue() == 1) {
                                        map2.put("url", com.mall.logic.support.router.y.c("cart"));
                                        KQ0.e.l(2131830292, map2, 2131830296);
                                    }
                                    Dialog dialog3 = fVar3.b;
                                    if (dialog3 != null) {
                                        dialog3.show();
                                    }
                                    break;
                                } catch (Exception e7) {
                                }
                                mVar2.a.put(fVar3, Boolean.TRUE);
                            }
                            break;
                        }
                    } else if (mVar2 != null && (fVar2 = (com.mall.ui.page.cart.f) ((LinkedHashMap) mVar2.b).get(1)) != null) {
                        mVar2.a.put(fVar2, Boolean.FALSE);
                        fVar2.b();
                        break;
                    }
                }
                break;
            default:
                ((j1) this.f87339b).m();
                break;
        }
    }
}
