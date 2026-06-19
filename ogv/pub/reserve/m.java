package com.bilibili.ogv.pub.reserve;

import com.bilibili.studio.videoeditor.ms.transition.TransitionInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.videoplayer.core.media.ijk.IjkFnHelper;
import tv.danmaku.videoplayer.core.media.ijk.IjkOptionsHelper;
import video.biz.offline.base.model.entity.OfflineVideoEntity;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/reserve/m.class */
public final class m extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f71689a;

    public m(@NotNull CoroutineScope coroutineScope) {
        this.f71689a = coroutineScope;
    }

    @Override // com.bilibili.ogv.pub.reserve.a
    @Nullable
    public final Object a(@NotNull List list, int i7, boolean z6, @NotNull Continuation continuation) {
        String str;
        Object next;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ReserveEpisode reserveEpisode = ((l) it.next()).f71683f;
                String str2 = reserveEpisode != null ? reserveEpisode.f71629b : null;
                if (str2 != null) {
                    str = str2;
                    if (str2.length() != 0) {
                        break;
                    }
                }
            }
            str = "";
        } else {
            str = "";
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            l lVar = (l) it2.next();
            ReserveEpisode reserveEpisode2 = lVar.f71683f;
            if (reserveEpisode2 != null) {
                long j7 = ((long) reserveEpisode2.f71633f) * TransitionInfo.DEFAULT_DURATION;
                long j8 = reserveEpisode2.f71632e;
                long jA = reserveEpisode2.a();
                String str3 = lVar.f71686j;
                String str4 = str3 == null ? "" : str3;
                if (str3 == null) {
                    str3 = "";
                }
                OfflineVideoEntity.BizType bizType = OfflineVideoEntity.BizType.OGV;
                OfflineVideoEntity.SeasonType.Companion.getClass();
                Iterator it3 = OfflineVideoEntity.SeasonType.getEntries().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                    if (((OfflineVideoEntity.SeasonType) next).getSeasonType() == lVar.h) {
                        break;
                    }
                }
                OfflineVideoEntity.SeasonType seasonType = (OfflineVideoEntity.SeasonType) next;
                if (seasonType == null) {
                    seasonType = OfflineVideoEntity.SeasonType.UNKNOWN;
                }
                List listEmptyList = CollectionsKt.emptyList();
                long j9 = lVar.f71685i;
                Cj1.h hVar = new Cj1.h(0, j9, jA, reserveEpisode2.f71630c, j9, lVar.f71679b, reserveEpisode2.f71637k, str4, str3, reserveEpisode2.f71631d, "", 0L, str, bizType, j7, j7 + j8, seasonType, reserveEpisode2.h, "", listEmptyList, 0);
                IjkFnHelper ijkFnHelper = IjkFnHelper.INSTANCE;
                arrayList.add(new Cj1.c(hVar, new Cj1.a(lVar.f71684g, ijkFnHelper.getFnVer(), ijkFnHelper.getFnVal(), IjkOptionsHelper.isSupport4K(), 0, 0L, false, 0)));
            }
        }
        if (arrayList.isEmpty()) {
            return Unit.INSTANCE;
        }
        BuildersKt.launch$default(this.f71689a, Dispatchers.getIO(), (CoroutineStart) null, new VipReserveKOfflineProcessor$realDownload$2(arrayList, null), 2, (Object) null);
        return Unit.INSTANCE;
    }
}
