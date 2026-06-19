package com.bilibili.pegasus.holders.bannerv8.items;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bilibili.bilibili.giftPanel.biz.balance.LiveCurrencyContainerManager;
import com.bilibili.bililive.room.ui.roomv3.gift.view.panel.base.LiveBaseRoomGiftPanel;
import com.bilibili.inline.control.IInlineControl;
import com.mall.ui.page.ip.dress.MallIpDressPendantFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import tv.danmaku.bili.ui.favorites.fragment.FavoritesEditTabFragment;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/items/f.class */
public final /* synthetic */ class f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f77752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f77753b;

    public /* synthetic */ f(Object obj, int i7) {
        this.f77752a = i7;
        this.f77753b = obj;
    }

    public final Object invoke() {
        Object obj = this.f77753b;
        switch (this.f77752a) {
            case 0:
                g gVar = (g) obj;
                IInlineControl iInlineControl = gVar.f77755b;
                if (iInlineControl != null) {
                    iInlineControl.stopPlay(gVar);
                }
                return Unit.INSTANCE;
            case 1:
                View view = ((MallIpDressPendantFragment) obj).b;
                return view != null ? view.findViewById(2131306592) : null;
            case 2:
                LiveBaseRoomGiftPanel liveBaseRoomGiftPanel = (LiveBaseRoomGiftPanel) obj;
                return new LiveCurrencyContainerManager((LinearLayout) liveBaseRoomGiftPanel.h.getValue(liveBaseRoomGiftPanel, LiveBaseRoomGiftPanel.N[2]));
            case 3:
                return (TextView) ((qk0.o) obj).f126116b.findViewById(2131315724);
            default:
                int i7 = FavoritesEditTabFragment.p;
                return Boolean.valueOf(((FavoritesEditTabFragment) obj).qf());
        }
    }
}
