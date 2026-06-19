package com.bilibili.ship.theseus.ogv.media;

import com.bapis.bilibili.app.playerunite.pgcanymodel.PGCAnyModel;
import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bapis.bilibili.pgc.gateway.player.v2.ClipInfo;
import com.bapis.bilibili.pgc.gateway.player.v2.ClipType;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import tv.danmaku.biliplayerv2.service.interact.biz.model.ChronosThumbnailInfo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/media/l.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.SinglePlayViewScope")
@DaggerGenerated
@QualifierMetadata
public final class l implements Factory<List<ChronosThumbnailInfo.WatchPoint>> {
    public static List<ChronosThumbnailInfo.WatchPoint> a(PlayViewUniteReply playViewUniteReply, PGCAnyModel pGCAnyModel, com.bilibili.ship.theseus.united.player.mediaplay.c cVar) {
        Object next;
        Object next2;
        List listEmptyList;
        if (h.c(playViewUniteReply)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = pGCAnyModel.getBusiness().getClipInfoList().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((ClipInfo) next).getClipType() == ClipType.CLIP_TYPE_OP) {
                    break;
                }
            }
            ClipInfo clipInfo = (ClipInfo) next;
            if (clipInfo != null) {
                if (clipInfo.getStart() > 0) {
                    clipInfo = null;
                }
                if (clipInfo != null) {
                    Duration.Companion companion = Duration.Companion;
                    arrayList.add(h.a(Duration.plus-LRDsOJo(DurationKt.toDuration(clipInfo.getEnd(), DurationUnit.SECONDS), cVar.f104512a)));
                }
            }
            Iterator it2 = pGCAnyModel.getBusiness().getClipInfoList().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                if (((ClipInfo) next2).getClipType() == ClipType.CLIP_TYPE_ED) {
                    break;
                }
            }
            ClipInfo clipInfo2 = (ClipInfo) next2;
            if (clipInfo2 != null) {
                ClipInfo clipInfo3 = null;
                if (((long) (clipInfo2.getEnd() * 1000)) - playViewUniteReply.getPlayArc().getDurationMs() > -1500) {
                    clipInfo3 = clipInfo2;
                }
                if (clipInfo3 != null) {
                    Duration.Companion companion2 = Duration.Companion;
                    arrayList.add(h.a(Duration.plus-LRDsOJo(DurationKt.toDuration(clipInfo3.getStart(), DurationUnit.SECONDS), cVar.f104512a)));
                }
            }
            listEmptyList = arrayList;
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        return (List) Preconditions.checkNotNullFromProvides(listEmptyList);
    }
}
