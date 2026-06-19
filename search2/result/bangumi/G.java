package com.bilibili.search2.result.bangumi;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.api.SearchOgvChannelItem;
import com.bilibili.search2.result.bangumi.L;
import com.mall.ui.page.cart.MallCartBottomBarModule;
import io.reactivex.rxjava3.subjects.PublishSubject;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/bangumi/G.class */
public final /* synthetic */ class G implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f87340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f87341b;

    public /* synthetic */ G(Object obj, int i7) {
        this.f87340a = i7;
        this.f87341b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [Z7.c, androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bilibili.search2.result.bangumi.L, dt0.b, dt0.f] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FragmentActivity fragmentActivityP3;
        switch (this.f87340a) {
            case 0:
                ?? r02 = (L) this.f87341b;
                String linkType = ((SearchOgvChannelItem) r02.getData()).getLinkType();
                String str = linkType;
                if (linkType == null) {
                    str = "";
                }
                Xs0.b.i("search.search-result.search-card.all.click", "", str, (BaseSearchItem) r02.getData(), null, null, Xs0.b.b(((SearchOgvChannelItem) r02.getData()).getLinkType(), "threepoint"), null, null, null, false, null, 6144);
                Fragment fragment = r02.getFragment();
                if (fragment != null && (fragmentActivityP3 = fragment.p3()) != null) {
                    com.bilibili.search2.share.r.l(com.bilibili.search2.share.r.f88699a, r02, r02.itemView.getContext(), new L.a(r02, fragmentActivityP3), false, 20);
                    break;
                }
                break;
            case 1:
                com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.c cVar = (com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.c) this.f87341b;
                BLog.i("BottomOrRightSheetComponent-createBinding$lambda$4", "[theseus-united-BottomOrRightSheetComponent-createBinding$lambda$4] shadow clicked: hide bottom sheet");
                cVar.f().setState(5);
                break;
            default:
                MallCartBottomBarModule mallCartBottomBarModule = (MallCartBottomBarModule) this.f87341b;
                com.mall.ui.page.cart.m mVar = mallCartBottomBarModule.b;
                if (mVar != null) {
                    mVar.a();
                }
                PublishSubject publishSubject = mallCartBottomBarModule.s;
                if (publishSubject != null) {
                    publishSubject.onNext(Long.valueOf(System.currentTimeMillis()));
                }
                break;
        }
    }
}
