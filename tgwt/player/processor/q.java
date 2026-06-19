package com.bilibili.tgwt.player.processor;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/processor/q.class */
public final class q<T> implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f111698a;

    public q(r rVar) {
        this.f111698a = rVar;
    }

    public final void accept(Object obj) {
        float f7 = ((Ql.c) obj).a;
        r rVar = this.f111698a;
        rVar.getClass();
        int paddingBottom = rVar.b().getPaddingBottom();
        if (paddingBottom > 0) {
            rVar.b().setPadding(0, 0, 0, paddingBottom);
        }
    }
}
