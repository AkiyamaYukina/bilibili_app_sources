package com.bilibili.ogv.filmlist.share;

import androidx.compose.runtime.MutableState;
import kntr.common.komponent.KomponentScope;
import kntr.common.share.domain.model.ShareParams;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/share/c.class */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShareParams f67805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KomponentScope<?> f67806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MutableState<Boolean> f67807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.bilibili.ogv.filmlist.api.c f67808d;

    public c(ShareParams shareParams, KomponentScope<?> komponentScope, MutableState<Boolean> mutableState, com.bilibili.ogv.filmlist.api.c cVar) {
        this.f67805a = shareParams;
        this.f67806b = komponentScope;
        this.f67807c = mutableState;
        this.f67808d = cVar;
    }
}
