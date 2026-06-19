package com.bilibili.pegasus.channelv3.movie.video;

import androidx.recyclerview.widget.GridLayoutManager;
import com.bilibili.pegasus.api.model.BasicIndexItem;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/video/c.class */
public final class c extends GridLayoutManager.SpanSizeLookup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChannelMovieVideoFragment f75497a;

    public c(ChannelMovieVideoFragment channelMovieVideoFragment) {
        this.f75497a = channelMovieVideoFragment;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public final int getSpanSize(int i7) {
        BasicIndexItem basicIndexItem = (BasicIndexItem) CollectionsKt.getOrNull(this.f75497a.f75484f.f127916g, i7);
        return basicIndexItem != null ? basicIndexItem.getSpanCount() : 1;
    }
}
