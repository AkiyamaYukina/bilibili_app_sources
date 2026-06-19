package com.bilibili.pegasus.channelv3.movie.relation;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/relation/a.class */
public final /* synthetic */ class a implements SwipeRefreshLayout.OnRefreshListener, lg.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f75459a;

    public Object call(Object obj) {
        return ((com.bilibili.app.comm.comment2.comments.viewmodel.d) this.f75459a).b(true);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        KProperty<Object>[] kPropertyArr = ChannelMovieRelationFragment.f75452f;
        ((ChannelMovieRelationFragment) this.f75459a).kf().refresh();
    }
}
