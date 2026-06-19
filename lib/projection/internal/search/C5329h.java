package com.bilibili.lib.projection.internal.search;

import com.bilibili.lib.projection.internal.search.ProjectionGlobalLinkFragmentV2;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: renamed from: com.bilibili.lib.projection.internal.search.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/h.class */
public final class C5329h<T> implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProjectionGlobalLinkFragmentV2 f63725a;

    public C5329h(ProjectionGlobalLinkFragmentV2 projectionGlobalLinkFragmentV2) {
        this.f63725a = projectionGlobalLinkFragmentV2;
    }

    public final void accept(Object obj) {
        ProjectionGlobalLinkFragmentV2.b bVar = this.f63725a.f63556g;
        if (bVar != null) {
            bVar.notifyDataSetChanged();
        }
    }
}
