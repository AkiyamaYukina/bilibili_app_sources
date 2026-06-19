package com.bilibili.ship.theseus.ogv.media;

import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bapis.bilibili.playershared.BizType;
import com.bilibili.ship.theseus.ogv.media.A;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/media/m.class */
public final /* synthetic */ class m implements com.bilibili.ship.theseus.united.player.mediaplay.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A.a f94019a;

    @Override // com.bilibili.ship.theseus.united.player.mediaplay.o
    public final void a(CoroutineScope coroutineScope, PlayViewUniteReply playViewUniteReply) {
        if (playViewUniteReply.getPlayArc().getVideoType() == BizType.BIZ_TYPE_PGC) {
            this.f94019a.a(coroutineScope, playViewUniteReply).a();
            return;
        }
        com.bilibili.bangumi.logic.page.detail.service.f.a("[theseus-ogv-OgvPlayViewRunnerModule-provideRunner$lambda$0] ", "can not run ogv play view component, because video type is " + playViewUniteReply.getPlayArc().getVideoType(), "OgvPlayViewRunnerModule-provideRunner$lambda$0", (Throwable) null);
    }
}
