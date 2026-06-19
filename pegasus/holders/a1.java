package com.bilibili.pegasus.holders;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import bolts.Continuation;
import bolts.Task;
import com.bapis.bilibili.polymer.list.FavoriteTabReq;
import com.bapis.bilibili.polymer.list.ListMoss;
import com.bilibili.biligame.ui.image.GameImageViewActivity;
import com.bilibili.biligame.ui.image.GameImageViewFragment;
import com.bilibili.lib.ui.PermissionsChecker;
import com.bilibili.upper.api.bean.uppercenter.UpperLimitReasons;
import gI0.p;
import op0.C8249a;
import tv.danmaku.bili.ui.favorite.BaseFavoritesFragment;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/a1.class */
public final /* synthetic */ class a1 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f77662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f77663b;

    public /* synthetic */ a1(Object obj, int i7) {
        this.f77662a = i7;
        this.f77663b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7;
        GameImageViewFragment gameImageViewFragment;
        FragmentActivity fragmentActivityP3;
        switch (this.f77662a) {
            case 0:
                C8249a.f((c1) this.f77663b, null, null, null, false, null, null, 255);
                break;
            case 1:
                p.a aVar = (p.a) this.f77663b;
                UpperLimitReasons.LimitReason limitReason = aVar.f119917s;
                if (limitReason != null && (i7 = limitReason.solve) == 0) {
                    defpackage.a.a(i7, "onBindViewHolder item.solve:", "LimitReasonAdapter");
                    aVar.f119913o.setVisibility(0);
                    aVar.f119915q.setVisibility(0);
                    aVar.f119920v = false;
                    aVar.f119914p.setText(aVar.f119919u);
                    aVar.f119914p.setSelection(aVar.f119919u.length());
                    aVar.q0(false);
                } else {
                    eJ0.H.a(2131851159, aVar.f119914p.getContext());
                }
                break;
            case 2:
                GameImageViewActivity.b bVar = ((GameImageViewActivity) this.f77663b).G;
                if (bVar != null && (gameImageViewFragment = bVar.b) != null && (fragmentActivityP3 = gameImageViewFragment.p3()) != null) {
                    PermissionsChecker.grantPermission(fragmentActivityP3, gameImageViewFragment.getLifecycle(), PermissionsChecker.STORAGE_PERMISSIONS, 16, 2131825995, gameImageViewFragment.getString(2131823941)).continueWith((Continuation<Void, TContinuationResult>) new ks.k(0, fragmentActivityP3, gameImageViewFragment), Task.UI_THREAD_EXECUTOR);
                    break;
                }
                break;
            default:
                BaseFavoritesFragment baseFavoritesFragment = (BaseFavoritesFragment) this.f77663b;
                baseFavoritesFragment.showLoadingView();
                new ListMoss().favoriteTab(FavoriteTabReq.newBuilder().build(), new tv.danmaku.bili.ui.favorite.b(baseFavoritesFragment));
                break;
        }
    }
}
