package com.bilibili.ship.theseus.ogv.videopiece;

import com.bilibili.adcommon.data.model.Card;
import com.bilibili.adcommon.data.model.CustomPlayUrl;
import com.bilibili.adcommon.data.model.FeedExtra;
import com.bilibili.adcommon.data.model.SourceContent;
import com.bilibili.adcommon.data.model.VideoBean;
import com.bilibili.adcommon.utils.AdMossHelper;
import com.bilibili.gripper.api.ad.biz.videodetail.piece.IAdPieceReport;
import com.bilibili.gripper.api.ad.biz.videodetail.piece.PieceReportData;
import com.bilibili.ship.theseus.keel.player.c;
import com.bilibili.ship.theseus.keel.player.f;
import com.bilibili.ship.theseus.keel.player.q;
import com.bilibili.ship.theseus.ogv.videopiece.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScopeKt;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videopiece/b.class */
public final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IAdPieceReport f94805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f94806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f94807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set<d> f94808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IPlayerCoreService f94809e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set<Pair<d, Integer>> f94810f;

    public b(IAdPieceReport iAdPieceReport, long j7, long j8, Set<d> set, IPlayerCoreService iPlayerCoreService, Set<Pair<d, Integer>> set2) {
        this.f94805a = iAdPieceReport;
        this.f94806b = j7;
        this.f94807c = j8;
        this.f94808d = set;
        this.f94809e = iPlayerCoreService;
        this.f94810f = set2;
    }

    @Override // com.bilibili.ship.theseus.keel.player.f
    public final Object a(q qVar, SuspendLambda suspendLambda) {
        SourceContent sourceContentCreateSourceContent;
        String str;
        ArrayList arrayList;
        FeedExtra extra;
        Card card;
        VideoBean video;
        List customPlayUrls;
        List listFilterNotNull;
        com.bilibili.ship.theseus.keel.player.c cVar = qVar.f91146g;
        if (cVar instanceof c.C0674c) {
            return Unit.INSTANCE;
        }
        c.a aVar = cVar instanceof c.a ? (c.a) cVar : null;
        if (aVar != null && (sourceContentCreateSourceContent = AdMossHelper.INSTANCE.createSourceContent(aVar.f91086b)) != null) {
            PiecePlayable pieceplayable = qVar.f91144e;
            Long lH = pieceplayable.h();
            int i7 = qVar.f91140a;
            int i8 = qVar.h;
            if (i7 < i8) {
                str = "prefix";
            } else if (i7 > i8) {
                str = "surfix";
            } else {
                BLog.w("AdPiecePlayReportModule$provide$1-run", "[theseus-ogv-AdPiecePlayReportModule$provide$1-run] Master piece should not be reported!", (Throwable) null);
                str = "";
            }
            this.f94805a.initWithReportData(new PieceReportData(qVar.f91141b, qVar.f91142c, lH, qVar.f91147i, qVar.f91148j, this.f94806b, this.f94807c, str, sourceContentCreateSourceContent, aVar.f91085a, (String) null, 1024, (DefaultConstructorMarker) null));
            this.f94808d.clear();
            Set<d> set = this.f94808d;
            Duration.Companion companion = Duration.Companion;
            DurationUnit durationUnit = DurationUnit.SECONDS;
            set.add(new d(DurationKt.toDuration(0.6d, durationUnit)));
            this.f94808d.add(new d(DurationKt.toDuration(3, durationUnit)));
            this.f94808d.add(new d(DurationKt.toDuration(5, durationUnit)));
            this.f94808d.add(new d(DurationKt.toDuration(10, durationUnit)));
            this.f94808d.add(new d(DurationKt.toDuration(15, durationUnit)));
            Long lH2 = pieceplayable.h();
            if (lH2 != null) {
                Set<d> set2 = this.f94808d;
                long jLongValue = lH2.longValue();
                set2.add(new d.c(0.25f, jLongValue));
                set2.add(new d.c(0.5f, jLongValue));
                set2.add(new d.c(0.75f, jLongValue));
                Boxing.boxBoolean(set2.add(new d.c(1.0f, jLongValue)));
            }
            SourceContent.AdContent adContent = sourceContentCreateSourceContent.getAdContent();
            if (adContent != null && (extra = adContent.getExtra()) != null && (card = extra.card) != null && (video = card.getVideo()) != null && (customPlayUrls = video.getCustomPlayUrls()) != null && (listFilterNotNull = CollectionsKt.filterNotNull(customPlayUrls)) != null) {
                List list = listFilterNotNull;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (true) {
                    arrayList = arrayList2;
                    if (!it.hasNext()) {
                        break;
                    }
                    arrayList2.add(Boxing.boxInt(((CustomPlayUrl) it.next()).getPlayTime()));
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                Set<d> set3 = this.f94808d;
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    int iIntValue = ((Number) it2.next()).intValue();
                    Duration.Companion companion2 = Duration.Companion;
                    set3.add(new d(DurationKt.toDuration(iIntValue, DurationUnit.SECONDS)));
                }
            }
            Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new AdPiecePlayReportModule$provide$1$3(this.f94809e, this.f94805a, qVar, this.f94808d, this.f94810f, null), suspendLambda);
            return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
