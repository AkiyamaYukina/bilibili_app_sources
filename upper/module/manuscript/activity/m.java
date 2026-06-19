package com.bilibili.upper.module.manuscript.activity;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.bilibili.lib.fasthybrid.wallpaper.WallpaperPreCheckActivity;
import com.bilibili.upper.module.manuscript.bean.ManuscriptVideosEntity;
import kotlin.jvm.internal.Intrinsics;
import rx.Observable;
import rx.functions.Func1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/activity/m.class */
public final /* synthetic */ class m implements SwipeRefreshLayout.OnRefreshListener, Func1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f113548a;

    public Object call(Object obj) {
        int i7 = WallpaperPreCheckActivity.D;
        return (Observable) ((Kq.i) this.f113548a).invoke(obj);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        ManuscriptProgressDetailsActivity manuscriptProgressDetailsActivity = (ManuscriptProgressDetailsActivity) this.f113548a;
        gI0.G g7 = manuscriptProgressDetailsActivity.f113482t1;
        gI0.G g8 = g7;
        if (g7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mManuscriptSubsetDetailsAdapter");
            g8 = null;
        }
        ManuscriptVideosEntity.ManuscriptVideoDetailsEntity manuscriptVideoDetailsEntity = g8.f119770c;
        manuscriptProgressDetailsActivity.T6((manuscriptVideoDetailsEntity != null ? manuscriptVideoDetailsEntity.index : 0) - 1);
    }
}
