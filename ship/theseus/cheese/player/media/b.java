package com.bilibili.ship.theseus.cheese.player.media;

import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bapis.bilibili.playershared.BizType;
import com.bilibili.bangumi.logic.page.detail.service.f;
import com.bilibili.ship.theseus.cheese.player.media.e;
import com.bilibili.ship.theseus.united.player.mediaplay.o;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/media/b.class */
public final /* synthetic */ class b implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e.a f90638a;

    @Override // com.bilibili.ship.theseus.united.player.mediaplay.o
    public final void a(CoroutineScope coroutineScope, PlayViewUniteReply playViewUniteReply) {
        if (playViewUniteReply.getPlayArc().getVideoType() == BizType.BIZ_TYPE_PUGV) {
            this.f90638a.a(coroutineScope, playViewUniteReply).a();
            return;
        }
        f.a("[theseus-cheese-CheesePlayViewRunnerModule-provideRunner$lambda$0] ", "can not run ugc play view component, because video type is " + playViewUniteReply.getPlayArc().getVideoType(), "CheesePlayViewRunnerModule-provideRunner$lambda$0", (Throwable) null);
    }
}
