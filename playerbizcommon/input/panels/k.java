package com.bilibili.playerbizcommon.input.panels;

import kotlin.jvm.internal.Intrinsics;
import qq0.InterfaceC8478b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/input/panels/k.class */
public final class k implements qq0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f80212a;

    public k(i iVar) {
        this.f80212a = iVar;
    }

    @Override // qq0.d
    public final void a(InterfaceC8478b interfaceC8478b) {
        com.bilibili.playerbizcommon.features.danmaku.input.a danmakuColorful;
        i iVar = this.f80212a;
        m mVar = iVar.f80201n;
        if (mVar != null) {
            mVar.d(interfaceC8478b);
        }
        Cq0.b bVar = iVar.f80192d;
        Cq0.b bVar2 = bVar;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputController");
            bVar2 = null;
        }
        Qq0.a aVarE = bVar2.e();
        if (aVarE == null || (danmakuColorful = aVarE.getDanmakuColorful()) == null) {
            return;
        }
        danmakuColorful.f79675b = 0L;
    }

    @Override // qq0.d
    public final void b(InterfaceC8478b interfaceC8478b) {
        m mVar = this.f80212a.f80201n;
        if (mVar != null) {
            mVar.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b9  */
    @Override // qq0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(qq0.e r13, kotlin.jvm.functions.Function1 r14) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.input.panels.k.c(qq0.e, kotlin.jvm.functions.Function1):void");
    }
}
