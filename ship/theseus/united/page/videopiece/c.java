package com.bilibili.ship.theseus.united.page.videopiece;

import X1.F;
import com.bilibili.ship.theseus.keel.player.f;
import com.bilibili.ship.theseus.keel.player.q;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videopiece/c.class */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f103684a;

    public c(b bVar) {
        this.f103684a = bVar;
    }

    @Override // com.bilibili.ship.theseus.keel.player.f
    public final Object a(q qVar, SuspendLambda suspendLambda) {
        b bVar = this.f103684a;
        bVar.getClass();
        StringBuilder sbB = F.b(qVar.h, "mi:", " ma:");
        sbB.append(qVar.f91147i);
        sbB.append(" mc:");
        sbB.append(qVar.f91148j);
        sbB.append(" pi:");
        sbB.append(qVar.f91140a);
        sbB.append(" pa:");
        sbB.append(qVar.f91141b);
        sbB.append(" pc:");
        defpackage.a.b("[theseus-united-VideoPieceRepository-updateVideoPiece] ", android.support.v4.media.session.a.a(sbB, qVar.f91142c, " "), "VideoPieceRepository-updateVideoPiece");
        bVar.f103682a.setValue(qVar);
        return Unit.INSTANCE;
    }
}
