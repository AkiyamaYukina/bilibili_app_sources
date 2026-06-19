package com.bilibili.ship.theseus.ugc.intro;

import com.bilibili.ship.theseus.united.page.restrictionlayer.PlayNextOperationAction;
import ev0.InterfaceC7008a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/c.class */
public final class c implements com.bilibili.ship.theseus.united.page.restrictionlayer.t<PlayNextOperationAction> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rW0.a f96979a;

    public c(rW0.a aVar) {
        this.f96979a = aVar;
    }

    @Override // com.bilibili.ship.theseus.united.page.restrictionlayer.t
    public final void a(PlayNextOperationAction playNextOperationAction) {
        PlayNextOperationAction playNextOperationAction2 = playNextOperationAction;
        StringBuilder sbA = androidx.compose.runtime.snapshots.z.a(playNextOperationAction2.f102624a, "playNext action: aid=", ", cid=");
        sbA.append(playNextOperationAction2.f102625b);
        defpackage.a.b("[theseus-ugc-UGCCustomizedOperationActionHandlerModule$playNext$$inlined$OperationActionHandler$1-handle] ", sbA.toString(), "UGCCustomizedOperationActionHandlerModule$playNext$$inlined$OperationActionHandler$1-handle");
        com.bilibili.ship.theseus.ugc.c.a((InterfaceC7008a) this.f96979a.get(), playNextOperationAction2.f102624a, playNextOperationAction2.f102625b, null, null, playNextOperationAction2.f102626c, playNextOperationAction2.f102627d, false, 76);
    }

    @Override // com.bilibili.ship.theseus.united.page.restrictionlayer.t
    public final Class<PlayNextOperationAction> b() {
        return PlayNextOperationAction.class;
    }
}
