package com.bilibili.ogv.filmlist.part;

import androidx.compose.runtime.internal.StabilityInferred;
import javax.inject.Inject;
import kntr.base.router.Router;
import org.jetbrains.annotations.NotNull;
import xj0.C8983d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/part/d.class */
@StabilityInferred(parameters = 0)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ogv.filmlist.favorite.a f67758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ogv.operation3.module.followable.d f67759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C8983d f67760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Router f67761d;

    @Inject
    public d(@NotNull com.bilibili.ogv.filmlist.favorite.a aVar, @NotNull com.bilibili.ogv.operation3.module.followable.d dVar, @NotNull com.bilibili.ogv.filmlist.share.d dVar2, @NotNull com.bilibili.ogv.filmlist.guide.d dVar3, @NotNull C8983d c8983d, @NotNull Router router) {
        this.f67758a = aVar;
        this.f67759b = dVar;
        this.f67760c = c8983d;
        this.f67761d = router;
    }
}
