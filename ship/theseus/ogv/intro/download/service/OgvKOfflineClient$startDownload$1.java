package com.bilibili.ship.theseus.ogv.intro.download.service;

import Cj1.h;
import com.bilibili.playerbizcommon.utils.PlayUrlFlagsManager;
import com.bilibili.playerbizcommon.utils.PlayerSettingHelper;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import com.bilibili.ship.theseus.united.utils.i;
import com.bilibili.studio.videoeditor.ms.transition.TransitionInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.videoplayer.core.media.ijk.IjkOptionsHelper;
import video.biz.offline.base.model.entity.OfflineVideoEntity;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/service/OgvKOfflineClient$startDownload$1.class */
public final class OgvKOfflineClient$startDownload$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final List<a> $models;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvKOfflineClient$startDownload$1(List<a> list, Continuation<? super OgvKOfflineClient$startDownload$1> continuation) {
        super(2, continuation);
        this.$models = list;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvKOfflineClient$startDownload$1(this.$models, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            video.biz.offline.base.facade.a aVar = video.biz.offline.base.facade.b.a;
            List<a> list = this.$models;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (a aVar2 : list) {
                OgvEpisode ogvEpisode = aVar2.f92396d;
                long j7 = ogvEpisode.f93557c;
                long j8 = ogvEpisode.f93556b;
                String str = aVar2.f92393a;
                Long longOrNull = StringsKt.toLongOrNull(str);
                long jLongValue = longOrNull != null ? longOrNull.longValue() : 0L;
                OgvEpisode ogvEpisode2 = aVar2.f92396d;
                long jA = ogvEpisode2.a();
                Long longOrNull2 = StringsKt.toLongOrNull(str);
                long jLongValue2 = longOrNull2 != null ? longOrNull2.longValue() : 0L;
                OfflineVideoEntity.BizType bizType = OfflineVideoEntity.BizType.OGV;
                long j9 = ogvEpisode2.f93557c;
                com.bilibili.ogv.pub.season.a aVar3 = com.bilibili.ogv.pub.season.a.f71775b;
                com.bilibili.ogv.pub.season.a aVar4 = aVar2.f92395c;
                h hVar = new h(0, jLongValue, jA, ogvEpisode2.f93561g, jLongValue2, ogvEpisode2.f93555a, ogvEpisode2.f93576w, aVar2.f92394b, ogvEpisode2.f93563j, ogvEpisode2.f93564k, "", 0L, aVar2.h, bizType, j9 * TransitionInfo.DEFAULT_DURATION, (j7 * TransitionInfo.DEFAULT_DURATION) + j8, Intrinsics.areEqual(aVar4, aVar3) ? OfflineVideoEntity.SeasonType.BANGUMI : Intrinsics.areEqual(aVar4, com.bilibili.ogv.pub.season.a.f71776c) ? OfflineVideoEntity.SeasonType.MOVIE : Intrinsics.areEqual(aVar4, com.bilibili.ogv.pub.season.a.f71777d) ? OfflineVideoEntity.SeasonType.DOCUMENTARY : Intrinsics.areEqual(aVar4, com.bilibili.ogv.pub.season.a.f71778e) ? OfflineVideoEntity.SeasonType.CN_BANGUMI : Intrinsics.areEqual(aVar4, com.bilibili.ogv.pub.season.a.f71779f) ? OfflineVideoEntity.SeasonType.TV_SERIES : Intrinsics.areEqual(aVar4, com.bilibili.ogv.pub.season.a.f71780g) ? OfflineVideoEntity.SeasonType.VARIETY : OfflineVideoEntity.SeasonType.UNKNOWN, ogvEpisode2.h, "", CollectionsKt.emptyList(), ogvEpisode2.f93559e.m9146getValue().intValue());
                int fnVer = PlayUrlFlagsManager.getFnVer();
                int fnVal = PlayUrlFlagsManager.getFnVal();
                boolean zIsSupport4K = PlayerSettingHelper.isSupport4K();
                int number = i.a().getNumber();
                long j10 = 0;
                if (IjkOptionsHelper.getVolumeBalance()) {
                    j10 = 1;
                }
                arrayList.add(new Cj1.c(hVar, new Cj1.a(aVar2.f92397e, fnVer, fnVal, j10, number, aVar2.f92398f ? 1 : 0, zIsSupport4K)));
            }
            this.label = 1;
            if (aVar.c(arrayList, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
