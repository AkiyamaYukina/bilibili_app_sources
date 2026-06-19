package com.bilibili.ship.theseus.united.player.mediaplay;

import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bilibili.lib.media.resource.ExtraInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/TheseusPlayableFactory$create$1.class */
final /* synthetic */ class TheseusPlayableFactory$create$1 extends FunctionReferenceImpl implements Function1<PlayViewUniteReply, ExtraInfo> {
    public TheseusPlayableFactory$create$1(Object obj) {
        super(1, obj, p.class, "extractExtraInfo", "extractExtraInfo(Lcom/bapis/bilibili/app/playerunite/v1/PlayViewUniteReply;)Lcom/bilibili/lib/media/resource/ExtraInfo;", 0);
    }

    public final ExtraInfo invoke(PlayViewUniteReply playViewUniteReply) {
        return ((p) ((CallableReference) this).receiver).b(playViewUniteReply);
    }
}
