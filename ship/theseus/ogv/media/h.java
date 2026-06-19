package com.bilibili.ship.theseus.ogv.media;

import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bapis.bilibili.playershared.ArcConf;
import com.bilibili.ship.theseus.ogv.playviewextra.ViewInfoClipInfo;
import kotlin.time.Duration;
import tv.danmaku.biliplayerv2.service.interact.biz.model.ChronosThumbnailInfo;
import tv.danmaku.biliplayerv2.service.interact.biz.model.viewprogress.uniteviewprogress.VideoPoint;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/media/h.class */
public final class h {
    public static final ChronosThumbnailInfo.WatchPoint a(long j7) {
        ChronosThumbnailInfo.WatchPoint watchPoint = new ChronosThumbnailInfo.WatchPoint();
        VideoPoint videoPoint = new VideoPoint();
        videoPoint.setType(10);
        videoPoint.setFrom(Duration.getInWholeSeconds-impl(j7));
        videoPoint.setTo(Duration.getInWholeSeconds-impl(j7));
        watchPoint.setVideoPoint(videoPoint);
        return watchPoint;
    }

    public static final ViewInfoClipInfo b(ViewInfoClipInfo viewInfoClipInfo, long j7) {
        return new ViewInfoClipInfo(viewInfoClipInfo.f94377a, Duration.plus-LRDsOJo(viewInfoClipInfo.f94378b, j7), Duration.plus-LRDsOJo(viewInfoClipInfo.f94379c, j7), viewInfoClipInfo.f94380d, viewInfoClipInfo.f94381e);
    }

    public static final boolean c(PlayViewUniteReply playViewUniteReply) {
        ArcConf arcConf = (ArcConf) playViewUniteReply.getPlayArcConf().getArcConfsMap().get(33);
        boolean z6 = false;
        if (arcConf != null) {
            z6 = false;
            if (arcConf.getIsSupport()) {
                z6 = true;
            }
        }
        return z6;
    }
}
