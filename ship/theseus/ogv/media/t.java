package com.bilibili.ship.theseus.ogv.media;

import com.bapis.bilibili.app.playerunite.pgcanymodel.PGCAnyModel;
import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bapis.bilibili.pgc.gateway.player.v2.ClipInfo;
import com.bapis.bilibili.pgc.gateway.player.v2.ClipType;
import com.bapis.bilibili.pgc.gateway.player.v2.InlineType;
import com.bilibili.lib.moss.util.any.AnyKt;
import com.google.protobuf.Any;
import java.util.Iterator;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/media/t.class */
public final class t {
    public static final long a(@NotNull PlayViewUniteReply playViewUniteReply) {
        Object next;
        Any supplement = playViewUniteReply.getSupplement();
        PGCAnyModel defaultInstance = !Intrinsics.areEqual(supplement.getTypeUrl(), "type.googleapis.com/bilibili.app.playerunite.pgcanymodel.PGCAnyModel") ? PGCAnyModel.getDefaultInstance() : AnyKt.unpackSansTypeUrl(supplement, PGCAnyModel.class);
        if (SetsKt.setOf(new InlineType[]{InlineType.TYPE_HE_CLIP, InlineType.TYPE_PREVIEW}).contains(defaultInstance.getBusiness().getInlineType())) {
            return Duration.Companion.getZERO-UwyO8pc();
        }
        Iterator it = defaultInstance.getBusiness().getClipInfoList().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ClipInfo) next).getClipType() == ClipType.CLIP_TYPE_HE) {
                break;
            }
        }
        ClipInfo clipInfo = (ClipInfo) next;
        if (clipInfo == null) {
            Duration.Companion companion = Duration.Companion;
            return DurationKt.toDuration(playViewUniteReply.getHistory().getCurrentVideo().getProgress(), DurationUnit.SECONDS);
        }
        com.bilibili.ship.theseus.united.player.mediaplay.c cVarB = com.bilibili.ship.theseus.united.page.playview.a.b(playViewUniteReply);
        Duration.Companion companion2 = Duration.Companion;
        return Duration.plus-LRDsOJo(DurationKt.toDuration(clipInfo.getStart(), DurationUnit.SECONDS), cVarB.f104512a);
    }
}
