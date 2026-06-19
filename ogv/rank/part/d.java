package com.bilibili.ogv.rank.part;

import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/part/d.class */
public final class d implements B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutableStateFlow<com.bilibili.ogv.rank.api.a> f72045a;

    public d(MutableStateFlow<com.bilibili.ogv.rank.api.a> mutableStateFlow) {
        this.f72045a = mutableStateFlow;
    }

    @Override // com.bilibili.ogv.rank.part.B
    public final MutableStateFlow a() {
        return this.f72045a;
    }
}
