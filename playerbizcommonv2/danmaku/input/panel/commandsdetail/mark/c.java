package com.bilibili.playerbizcommonv2.danmaku.input.panel.commandsdetail.mark;

import android.view.View;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.topix.center.EntranceButton;
import com.bilibili.topix.center.TopixCenterFragment;
import com.mall.ui.widget.MallPageTabStrip;
import java.util.Map;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/panel/commandsdetail/mark/c.class */
public final /* synthetic */ class c implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f81087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f81088b;

    public /* synthetic */ c(Object obj, int i7) {
        this.f81087a = i7;
        this.f81088b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String link;
        switch (this.f81087a) {
            case 0:
                ((MarkGoodsDialog) this.f81088b).dismissAllowingStateLoss();
                break;
            case 1:
                TopixCenterFragment topixCenterFragment = (TopixCenterFragment) this.f81088b;
                Neurons.reportClick$default(false, "dt.new-topic-center.top.my-topic.click", (Map) null, 4, (Object) null);
                EntranceButton value = topixCenterFragment.mf().f112365e.getValue();
                if (value != null && (link = value.getLink()) != null && !StringsKt.isBlank(link)) {
                    BLRouter.routeTo(RouteRequestKt.toRouteRequest(link), topixCenterFragment);
                    break;
                }
                break;
            default:
                MallPageTabStrip mallPageTabStrip = (MallPageTabStrip) this.f81088b;
                int i7 = MallPageTabStrip.Q;
                int iIntValue = ((Integer) view.getTag()).intValue();
                if (mallPageTabStrip.h.getCurrentItem() != iIntValue) {
                    MallPageTabStrip.e eVar = mallPageTabStrip.d;
                    if (eVar != null) {
                        eVar.onTabClick(iIntValue);
                    }
                    mallPageTabStrip.h.setCurrentItem(iIntValue, false);
                } else {
                    MallPageTabStrip.d dVar = mallPageTabStrip.c;
                    if (dVar != null) {
                        dVar.onReselected(iIntValue);
                    }
                }
                break;
        }
    }
}
