package com.bilibili.lib.projection.internal.search;

import android.view.View;
import com.bilibili.gripper.api.ad.core.GAdCoreKt;
import com.mall.ui.page.cart.adapter.holder.view.MallCartActivityTimeView;
import io.reactivex.rxjava3.functions.Consumer;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/F.class */
public final class F implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f63533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f63534b;

    public /* synthetic */ F(Object obj, int i7) {
        this.f63533a = i7;
        this.f63534b = obj;
    }

    public void a() {
        com.bilibili.ad.adview.pegasus.holders.card1.hd.b bVar = (com.bilibili.ad.adview.pegasus.holders.card1.hd.b) this.f63534b;
        com.bilibili.ad.adview.pegasus.holders.inline.pegasus.n.c(bVar);
        GAdCoreKt.getGAdReport().uiEvent("desc_btn_click", bVar.q().v(), new com.bilibili.app.comment3.ui.d(bVar, 2));
    }

    public void accept(Object obj) {
        Unit unit;
        MallCartActivityTimeView mallCartActivityTimeView;
        Object obj2 = this.f63534b;
        switch (this.f63533a) {
            case 0:
                ((ProjectionSearchFragment) obj2).kf();
                break;
            default:
                Long l7 = (Long) obj;
                eR0.G g7 = (eR0.G) obj2;
                try {
                    Result.Companion companion = Result.Companion;
                    View view = g7.a;
                    if (view != null) {
                        if (KQ0.h.a(view) > 0.0f && (mallCartActivityTimeView = g7.d) != null) {
                            mallCartActivityTimeView.setTime(l7.longValue());
                        }
                        unit = Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                    Result.constructor-impl(unit);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    Result.constructor-impl(ResultKt.createFailure(th));
                }
                break;
        }
    }
}
