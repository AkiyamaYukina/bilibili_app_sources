package com.bilibili.ship.theseus.united.page.videoquality;

import androidx.compose.ui.text.font.C4496a;
import androidx.navigationevent.DirectNavigationEventInput;
import com.bilibili.lib.media.resource.MediaResource;
import com.bilibili.lib.media.resource.PlayIndex;
import com.bilibili.lib.media.resource.VodIndex;
import com.bilibili.player.tangram.basic.c;
import com.bilibili.player.tangram.playercore.C5774b;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.videoplayer.coreV2.MediaItem;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/Y.class */
public final /* synthetic */ class Y implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f103845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f103846b;

    public /* synthetic */ Y(Object obj, int i7) {
        this.f103845a = i7;
        this.f103846b = obj;
    }

    public final Object invoke() {
        switch (this.f103845a) {
            case 0:
                TheseusPlayerQualityService theseusPlayerQualityService = (TheseusPlayerQualityService) this.f103846b;
                if (theseusPlayerQualityService.h.c()) {
                    TheseusPlayerVipQualityTrialService theseusPlayerVipQualityTrialService = theseusPlayerQualityService.h;
                    if (!theseusPlayerVipQualityTrialService.d() && !theseusPlayerVipQualityTrialService.l(true)) {
                        vk.e eVarE = theseusPlayerVipQualityTrialService.e();
                        vk.f fVar = eVarE != null ? new vk.f(eVarE.i) : null;
                        boolean zA = fVar == null ? false : vk.f.a(fVar.a, 2);
                        IPlayerCoreService iPlayerCoreService = theseusPlayerQualityService.f103776c;
                        int recommendMaxQn = Integer.MAX_VALUE;
                        if (zA) {
                            MediaItem currentMediaItem = iPlayerCoreService.getCurrentMediaItem();
                            recommendMaxQn = Integer.MAX_VALUE;
                            if (currentMediaItem != null) {
                                recommendMaxQn = (int) currentMediaItem.getRecommendMaxQn();
                                if (recommendMaxQn < 0) {
                                    recommendMaxQn = 0;
                                } else if (recommendMaxQn == 15) {
                                    recommendMaxQn = 16;
                                }
                            }
                        }
                        BLog.i("TheseusPlayerQualityService-_init_$lambda$1", "[theseus-united-TheseusPlayerQualityService-_init_$lambda$1] " + C4496a.a("trial recommend max quality:", String.valueOf(recommendMaxQn)));
                        MediaResource mediaResource = iPlayerCoreService.getMediaResource();
                        com.bilibili.player.tangram.basic.a aVar = null;
                        if (mediaResource != null) {
                            VodIndex vodIndex = mediaResource.mVodIndex;
                            aVar = null;
                            if (vodIndex != null) {
                                ArrayList arrayList = vodIndex.mVodList;
                                aVar = null;
                                if (arrayList != null) {
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        com.bilibili.player.tangram.basic.a aVarA = C5774b.a((PlayIndex) it.next());
                                        if (aVarA != null) {
                                            arrayList2.add(aVarA);
                                        }
                                    }
                                    ArrayList arrayList3 = new ArrayList();
                                    for (Object obj : arrayList2) {
                                        int i7 = ((com.bilibili.player.tangram.basic.a) obj).f79320a;
                                        if (Intrinsics.compare(i7, recommendMaxQn) <= 0 && theseusPlayerVipQualityTrialService.g().contains(new com.bilibili.player.tangram.basic.a(i7))) {
                                            arrayList3.add(obj);
                                        }
                                    }
                                    aVar = (com.bilibili.player.tangram.basic.a) CollectionsKt.maxOrNull(arrayList3);
                                }
                            }
                        }
                        if (aVar != null) {
                            theseusPlayerQualityService.e(new c.b(aVar.f79320a));
                        }
                    }
                }
                break;
            default:
                ((DirectNavigationEventInput) this.f103846b).backCompleted();
                break;
        }
        return Unit.INSTANCE;
    }
}
