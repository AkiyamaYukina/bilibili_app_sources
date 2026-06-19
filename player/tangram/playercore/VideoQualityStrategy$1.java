package com.bilibili.player.tangram.playercore;

import com.bilibili.app.authorspace.ui.C0;
import com.bilibili.lib.accountinfo.BiliAccountInfo;
import com.bilibili.lib.media.resource.MediaResource;
import com.bilibili.lib.media.resource.PlayIndex;
import com.bilibili.playerbizcommon.utils.PlayerSettingHelper;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/VideoQualityStrategy$1.class */
final /* synthetic */ class VideoQualityStrategy$1 extends FunctionReferenceImpl implements Function2<u, com.bilibili.player.tangram.basic.a, com.bilibili.player.tangram.basic.a> {
    public static final VideoQualityStrategy$1 INSTANCE = new VideoQualityStrategy$1();

    public VideoQualityStrategy$1() {
        super(2, F.class, "defaultAutoQualityStarter", "defaultAutoQualityStarter-odkAKWg(Lcom/bilibili/player/tangram/playercore/PCSMedia;I)I", 1);
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new com.bilibili.player.tangram.basic.a(m8247invokeDkVobPw((u) obj, ((com.bilibili.player.tangram.basic.a) obj2).f79320a));
    }

    /* JADX INFO: renamed from: invoke-DkVobPw, reason: not valid java name */
    public final int m8247invokeDkVobPw(u uVar, int i7) {
        int i8;
        ArrayList arrayList;
        int defaultQuality = PlayerSettingHelper.getDefaultQuality();
        if (defaultQuality < 0) {
            i8 = 0;
        } else {
            i8 = defaultQuality;
            if (defaultQuality == 15) {
                i8 = 16;
            }
        }
        if (uVar != null) {
            int i9 = com.bilibili.player.tangram.basic.a.c(i7) ? i7 : 80;
            MediaResource mediaResource = uVar.f79460c;
            PlayIndex playIndex = mediaResource.getPlayIndex();
            int i10 = playIndex != null ? playIndex.mQuality : i8;
            if (i10 <= i7) {
                i8 = i10 < 0 ? 0 : i10 == 15 ? 16 : i10;
            } else {
                boolean zB = C0.b();
                boolean z6 = false;
                if (zB) {
                    z6 = false;
                    if (BiliAccountInfo.Companion.get().isEffectiveVip()) {
                        z6 = true;
                    }
                }
                ArrayList arrayList2 = mediaResource.mVodIndex.mVodList;
                if (arrayList2 != null) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : arrayList2) {
                        PlayIndex playIndex2 = (PlayIndex) obj;
                        if (z6 || !playIndex2.mNeedVip) {
                            if (zB || !playIndex2.mNeedLogin) {
                                arrayList3.add(obj);
                            }
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it = arrayList3.iterator();
                    while (true) {
                        arrayList = arrayList4;
                        if (!it.hasNext()) {
                            break;
                        }
                        com.bilibili.player.tangram.basic.a aVarA = C5774b.a((PlayIndex) it.next());
                        if (aVarA != null) {
                            arrayList4.add(aVarA);
                        }
                    }
                } else {
                    arrayList = null;
                }
                Object objEmptyList = arrayList;
                if (arrayList == null) {
                    objEmptyList = CollectionsKt.emptyList();
                }
                Iterable iterable = (Iterable) objEmptyList;
                ArrayList arrayList5 = new ArrayList();
                for (Object obj2 : iterable) {
                    if (Intrinsics.compare(((com.bilibili.player.tangram.basic.a) obj2).f79320a, i9) <= 0) {
                        arrayList5.add(obj2);
                    }
                }
                com.bilibili.player.tangram.basic.a aVar = (com.bilibili.player.tangram.basic.a) CollectionsKt.maxOrNull(arrayList5);
                defpackage.a.b("[tangram-player-core-VideoQualityStrategyKt-defaultAutoQualityStarter-odkAKWg] ", "Auto start quality maxUsable:" + aVar + " maxQuality:" + String.valueOf(i9) + " runningQuality:" + i10, "VideoQualityStrategyKt-defaultAutoQualityStarter-odkAKWg");
                if (aVar != null) {
                    i8 = aVar.f79320a;
                } else {
                    com.bilibili.player.tangram.basic.a aVar2 = (com.bilibili.player.tangram.basic.a) CollectionsKt.minOrNull(iterable);
                    if (aVar2 != null) {
                        i8 = aVar2.f79320a;
                    }
                }
            }
        }
        return i8;
    }
}
