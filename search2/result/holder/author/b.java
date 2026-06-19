package com.bilibili.search2.result.holder.author;

import com.bilibili.bililive.room.ui.common.tab.top.LiveRoomGoldRankFragmentV3;
import com.bilibili.inline.control.IInlineControl;
import com.bilibili.inline.utils.InlineExtensionKt;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.api.SearchAuthorNew;
import com.bilibili.upper.module.cover_v2.ui.MultiCoverActivity;
import java.util.Map;
import kntr.home.history.mvi.HistoryStateHolder;
import kntr.home.history.mvi.a;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import tv.danmaku.bili.ui.splash.ad.model.Splash;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/author/b.class */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f87817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f87818b;

    public /* synthetic */ b(Object obj, int i7) {
        this.f87817a = i7;
        this.f87818b = obj;
    }

    public final Object invoke(Object obj) {
        Object obj2 = this.f87818b;
        switch (this.f87817a) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                g gVar = (g) obj2;
                IInlineControl iInlineControlFindInlineControl = InlineExtensionKt.findInlineControl(gVar.getFragment());
                if (iInlineControlFindInlineControl != null) {
                    iInlineControlFindInlineControl.startPlay(gVar, zBooleanValue);
                }
                String linkType = ((SearchAuthorNew) gVar.getData()).getLinkType();
                String str = linkType;
                if (linkType == null) {
                    str = "app_user";
                }
                Xs0.b.i("search.search-result.search-card.all.click", null, str, (BaseSearchItem) gVar.getData(), null, null, Xs0.b.b("app-user", "startplay"), null, null, MapsKt.mapOf(new Pair("is_show_live_card", String.valueOf(((SearchAuthorNew) gVar.getData()).isInlineLive()))), false, null, 6912);
                break;
            case 1:
                int i7 = MultiCoverActivity.f112864K;
                ((MultiCoverActivity) obj2).X6().f112883f.setVisibility(0);
                break;
            case 2:
                Splash splash = (Splash) obj2;
                ((Map) obj).put(splash.isVideo() ? "video_from" : "pic_from", splash.isVideo() ? splash.videoFrom : splash.imageFrom);
                break;
            case 3:
                ((HistoryStateHolder) obj2).b(new a.A(((Boolean) obj).booleanValue()));
                break;
            default:
                ((Integer) obj).getClass();
                int i8 = LiveRoomGoldRankFragmentV3.P;
                ((LiveRoomGoldRankFragmentV3) obj2).getGoldRankLoadHelper().loadNextData();
                break;
        }
        return Unit.INSTANCE;
    }
}
