package com.bilibili.playerbizcommonv2.danmaku.input.panel;

import ES0.W0;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pr0.InterfaceC8348b;
import pr0.InterfaceC8350d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/panel/n.class */
public final class n implements InterfaceC8350d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f81158a;

    public n(l lVar) {
        this.f81158a = lVar;
    }

    @Override // pr0.InterfaceC8350d
    public final void a(InterfaceC8348b interfaceC8348b) {
        s sVar = this.f81158a.f81148n;
        if (sVar != null) {
            sVar.a();
        }
    }

    @Override // pr0.InterfaceC8350d
    public final void b(Cr0.c cVar, Function1 function1) {
        l lVar = this.f81158a;
        s sVar = lVar.f81148n;
        if (sVar != null) {
            sVar.i(cVar);
        }
        com.bilibili.playerbizcommonv2.danmaku.input.a aVar = lVar.f81139d;
        com.bilibili.playerbizcommonv2.danmaku.input.a aVar2 = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputController");
            aVar2 = null;
        }
        if (!aVar2.t().getDanmakuColorful().f81820a) {
            s sVar2 = lVar.f81148n;
            if (sVar2 != null) {
                sVar2.h(cVar);
            }
            com.bilibili.playerbizcommonv2.danmaku.input.a aVar3 = lVar.f81139d;
            if (aVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mInputController");
                aVar3 = null;
            }
            aVar3.t().getDanmakuColorful().f81821b = cVar.getVipColorfulType();
            function1.invoke(Boolean.TRUE);
            return;
        }
        ViewGroup viewGroup = lVar.f81142g;
        if (viewGroup == null || viewGroup.getContext() == null) {
            return;
        }
        lVar.f81151q = cVar;
        lVar.f81152r = function1;
        com.bilibili.playerbizcommonv2.danmaku.input.a aVar4 = lVar.f81139d;
        com.bilibili.playerbizcommonv2.danmaku.input.a aVar5 = aVar4;
        if (aVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputController");
            aVar5 = null;
        }
        String str = aVar5.n().f126280d;
        com.bilibili.playerbizcommonv2.danmaku.input.a aVar6 = lVar.f81139d;
        com.bilibili.playerbizcommonv2.danmaku.input.a aVar7 = aVar6;
        if (aVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputController");
            aVar7 = null;
        }
        com.bilibili.playerbizcommonv2.service.c cVar2 = new com.bilibili.playerbizcommonv2.service.c(str, aVar7.t().j(), cVar.getVipColorfulType(), new W0(lVar, 4));
        com.bilibili.playerbizcommonv2.danmaku.input.a aVar8 = lVar.f81139d;
        if (aVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputController");
            aVar8 = null;
        }
        aVar8.e().u(cVar2);
    }

    @Override // pr0.InterfaceC8350d
    public final void c(InterfaceC8348b interfaceC8348b) {
        l lVar = this.f81158a;
        s sVar = lVar.f81148n;
        if (sVar != null) {
            sVar.e(interfaceC8348b);
        }
        com.bilibili.playerbizcommonv2.danmaku.input.a aVar = lVar.f81139d;
        com.bilibili.playerbizcommonv2.danmaku.input.a aVar2 = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputController");
            aVar2 = null;
        }
        aVar2.t().getDanmakuColorful().f81821b = 0L;
    }
}
