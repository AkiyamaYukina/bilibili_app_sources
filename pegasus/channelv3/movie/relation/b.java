package com.bilibili.pegasus.channelv3.movie.relation;

import androidx.recyclerview.widget.GridLayoutManager;
import com.bilibili.pegasus.api.model.BasicIndexItem;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import uo0.C8744a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/relation/b.class */
public final class b extends GridLayoutManager.SpanSizeLookup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChannelMovieRelationFragment f75460a;

    public b(ChannelMovieRelationFragment channelMovieRelationFragment) {
        this.f75460a = channelMovieRelationFragment;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public final int getSpanSize(int i7) {
        C8744a c8744a = this.f75460a.f75456e;
        C8744a c8744a2 = c8744a;
        if (c8744a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            c8744a2 = null;
        }
        BasicIndexItem basicIndexItem = (BasicIndexItem) CollectionsKt.getOrNull(c8744a2.f127916g, i7);
        return basicIndexItem != null ? basicIndexItem.getSpanCount() : 1;
    }
}
