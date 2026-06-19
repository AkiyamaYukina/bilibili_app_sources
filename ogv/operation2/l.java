package com.bilibili.ogv.operation2;

import com.bilibili.bilibili.giftPanel.biz.balance.view.OnComponentClickListener;
import com.bilibili.bililive.infra.arch.jetpack.liveData.SafeMutableLiveData;
import com.bilibili.bililive.infra.trace.LiveReporter;
import com.bilibili.bililive.room.ui.roomv3.gift.LiveRoomGiftViewModel;
import com.bilibili.bililive.room.ui.roomv3.gift.view.panel.base.LiveBaseRoomGiftPanel;
import com.bilibili.bililive.videoliveplayer.net.beans.gift.BiliLiveGiftData;
import com.bilibili.bililive.videoliveplayer.net.beans.gift.LiveRoomBaseGift;
import com.opensource.svgaplayer.SVGACallback;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import tI.B;
import util.GiftPanelUrlParamsData;
import util.LiveGiftUrlSplicingKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/l.class */
public final class l implements SVGACallback, OnComponentClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f71004a;

    public /* synthetic */ l(Object obj) {
        this.f71004a = obj;
    }

    public void onCurrencyClick() {
        KProperty[] kPropertyArr = LiveBaseRoomGiftPanel.N;
        LiveBaseRoomGiftPanel liveBaseRoomGiftPanel = (LiveBaseRoomGiftPanel) this.f71004a;
        liveBaseRoomGiftPanel.Bf("on recharge button");
        liveBaseRoomGiftPanel.jf().J9(new B(2, 0L, 2, "gold"));
        LiveRoomGiftViewModel liveRoomGiftViewModelQf = liveBaseRoomGiftPanel.qf();
        HashMap mapA = qI.c.a(liveRoomGiftViewModelQf, new HashMap());
        BiliLiveGiftData.LiveRoomRedDot liveRoomRedDot = (BiliLiveGiftData.LiveRoomRedDot) liveRoomGiftViewModelQf.y.getValue();
        mapA.put("red_dot", (liveRoomRedDot == null || !liveRoomRedDot.hasRedDot()) ? "2" : "1");
        String str = null;
        LiveReporter.reportClick$default("live.live-room-detail.battery.0.click", mapA, false, 4, (Object) null);
        SafeMutableLiveData safeMutableLiveData = liveBaseRoomGiftPanel.qf().y;
        BiliLiveGiftData.LiveRoomRedDot liveRoomRedDot2 = (BiliLiveGiftData.LiveRoomRedDot) safeMutableLiveData.getValue();
        if (liveRoomRedDot2 != null) {
            str = liveRoomRedDot2.module;
        }
        if (liveRoomRedDot2 == null || !liveRoomRedDot2.hasRedDot() || str == null || !(!StringsKt.isBlank(str))) {
            return;
        }
        liveRoomRedDot2.clearRedDot();
        safeMutableLiveData.setValue(liveRoomRedDot2);
    }

    public void onFinished() {
        ((BangumiHomeFlowAnimationLayerKt$AnimationContent$1) this.f71004a).f70795b.complete(Unit.INSTANCE);
    }

    public void onRightsCenterClick(String str) {
        LiveRoomGiftViewModel liveRoomGiftViewModelQf = ((LiveBaseRoomGiftPanel) this.f71004a).qf();
        LiveRoomBaseGift liveRoomBaseGift = liveRoomGiftViewModelQf.v;
        liveRoomGiftViewModelQf.J9(new tI.c(LiveGiftUrlSplicingKt.attachLiveRoomParamsFromGiftPanelJumpUrl(new GiftPanelUrlParamsData(str, liveRoomBaseGift != null ? liveRoomBaseGift.getOriginId() : 0L, ((com.bilibili.bililive.room.ui.roomv3.base.viewmodel.f) liveRoomGiftViewModelQf).b.Id(), liveRoomGiftViewModelQf.M(), (Map) null, (Long) null, 48, (DefaultConstructorMarker) null)), 0, 6));
    }
}
