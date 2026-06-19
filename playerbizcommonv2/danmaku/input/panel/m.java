package com.bilibili.playerbizcommonv2.danmaku.input.panel;

import pr0.InterfaceC8348b;
import pr0.InterfaceC8350d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/panel/m.class */
public final class m implements InterfaceC8350d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f81157a;

    public m(l lVar) {
        this.f81157a = lVar;
    }

    @Override // pr0.InterfaceC8350d
    public final void a(InterfaceC8348b interfaceC8348b) {
        s sVar = this.f81157a.f81148n;
        if (sVar != null) {
            sVar.d(interfaceC8348b);
        }
    }

    @Override // pr0.InterfaceC8350d
    public final void c(InterfaceC8348b interfaceC8348b) {
        s sVar = this.f81157a.f81148n;
        if (sVar != null) {
            sVar.g(interfaceC8348b);
        }
    }
}
