package com.bilibili.playerbizcommonv2.danmaku.input.panel;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/panel/q.class */
public final class q implements mr0.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f81161a;

    public q(r rVar) {
        this.f81161a = rVar;
    }

    @Override // mr0.f
    public final void onCloseClick() {
        r rVar = this.f81161a;
        rVar.f81168g = true;
        rVar.dismiss();
    }
}
