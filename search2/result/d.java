package com.bilibili.search2.result;

import androidx.lifecycle.LifecycleOwner;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.result.pages.BiliMainSearchResultPage;
import com.bilibili.search2.utils.B;
import java.util.List;
import tv.danmaku.bili.widget.PagerSlidingTabStrip;
import yt0.C9095h;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/d.class */
public final /* synthetic */ class d implements PagerSlidingTabStrip.TabClickListener, mi.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LifecycleOwner f87748a;

    public /* synthetic */ d(LifecycleOwner lifecycleOwner) {
        this.f87748a = lifecycleOwner;
    }

    public void a(int i7) {
        C9095h c9095h = (C9095h) this.f87748a;
        Xs0.b.i("search.search-result.search-card.all.click", null, c9095h.getModuleType(), (BaseSearchItem) c9095h.getData(), null, null, Xs0.b.d((BaseSearchItem) c9095h.getData(), "button", null, 2), B.k(Integer.valueOf(i7)), null, null, false, null, 7984);
    }

    public void onTabClick(int i7) {
        BiliMainSearchResultFragment biliMainSearchResultFragment = (BiliMainSearchResultFragment) this.f87748a;
        biliMainSearchResultFragment.f87070F = i7;
        Kt0.a aVar = biliMainSearchResultFragment.f87092p;
        String str = "";
        if (aVar != null) {
            List<BiliMainSearchResultPage> list = aVar.f13006c;
            str = "";
            if (list != null) {
                BiliMainSearchResultPage biliMainSearchResultPage = list.get(i7);
                str = "";
                if (biliMainSearchResultPage != null) {
                    str = biliMainSearchResultPage.f88510f;
                    if (str == null) {
                        str = "";
                    }
                }
            }
        }
        Xs0.b.t(str, false);
    }
}
