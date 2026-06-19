package com.bilibili.ship.theseus.united.page.intro.module.kingposition;

import com.bapis.bilibili.app.viewunite.common.CoinExtend;
import com.bapis.bilibili.app.viewunite.common.KingPos;
import com.bapis.bilibili.app.viewunite.common.KingPosition;
import com.bapis.bilibili.app.viewunite.common.LikeExtend;
import com.bapis.bilibili.app.viewunite.common.PlayerAnimation;
import com.bapis.bilibili.app.viewunite.common.UpLikeImg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/q.class */
public final class q {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/q$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f100471a;

        static {
            int[] iArr = new int[com.bapis.bilibili.app.viewunite.common.KingPositionType.values().length];
            try {
                iArr[com.bapis.bilibili.app.viewunite.common.KingPositionType.LIKE.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[com.bapis.bilibili.app.viewunite.common.KingPositionType.DISLIKE.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[com.bapis.bilibili.app.viewunite.common.KingPositionType.COIN.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[com.bapis.bilibili.app.viewunite.common.KingPositionType.FAV.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[com.bapis.bilibili.app.viewunite.common.KingPositionType.DANMAKU.ordinal()] = 5;
            } catch (NoSuchFieldError e11) {
            }
            try {
                iArr[com.bapis.bilibili.app.viewunite.common.KingPositionType.CACHE.ordinal()] = 6;
            } catch (NoSuchFieldError e12) {
            }
            try {
                iArr[com.bapis.bilibili.app.viewunite.common.KingPositionType.SHARE.ordinal()] = 7;
            } catch (NoSuchFieldError e13) {
            }
            f100471a = iArr;
        }
    }

    @NotNull
    public static final C6289c a(@NotNull KingPos kingPos) {
        KingPositionType kingPositionType;
        switch (a.f100471a[kingPos.getType().ordinal()]) {
            case 1:
                kingPositionType = KingPositionType.LIKE;
                break;
            case 2:
                kingPositionType = KingPositionType.DISLIKE;
                break;
            case 3:
                kingPositionType = KingPositionType.COIN;
                break;
            case 4:
                kingPositionType = KingPositionType.FAVORITE;
                break;
            case 5:
                kingPositionType = KingPositionType.DANMAKU;
                break;
            case 6:
                kingPositionType = KingPositionType.CACHE;
                break;
            case 7:
                kingPositionType = KingPositionType.SHARE;
                break;
            default:
                kingPositionType = KingPositionType.KING_POS_UNSPECIFIED;
                break;
        }
        boolean disable = kingPos.getDisable();
        String disableToast = kingPos.getDisableToast();
        String icon = kingPos.getIcon();
        String checkedToast = kingPos.getCheckedToast();
        LikeExtend like = kingPos.getLike();
        String icon2 = kingPos.getIcon();
        UpLikeImg tripleLike = like.getTripleLike();
        O o7 = new O(tripleLike.getPreImg(), tripleLike.getSucImg(), tripleLike.getContent(), tripleLike.getType());
        String likeAnimation = like.getLikeAnimation();
        PlayerAnimation playerAnimation = like.getPlayerAnimation();
        H h = new H(o7, likeAnimation, new K(icon2, playerAnimation.getPlayerIcon(), playerAnimation.getPlayerTripleIcon()));
        CoinExtend coin = kingPos.getCoin();
        return new C6289c(kingPositionType, disable, disableToast, icon, checkedToast, h, new C6287a(coin.getCoinAppZipIcon(), coin.getCoinAppIcon1(), coin.getCoinAppIcon2(), coin.getCoinAppIcon3(), coin.getCoinAppIcon4()), 128);
    }

    @NotNull
    public static final p b(@NotNull KingPosition kingPosition) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List kingPosList = kingPosition.getKingPosList();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(kingPosList, 10));
        Iterator it = kingPosList.iterator();
        while (it.hasNext()) {
            C6289c c6289cA = a((KingPos) it.next());
            linkedHashMap.put(c6289cA.f100458a, c6289cA);
            arrayList.add(Unit.INSTANCE);
        }
        if (!kingPosition.getExtendList().isEmpty()) {
            KingPositionType kingPositionType = KingPositionType.SPLIT;
            linkedHashMap.put(kingPositionType, new C6289c(kingPositionType, false, "", null, null, null, null, 248));
            List extendList = kingPosition.getExtendList();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(extendList, 10));
            Iterator it2 = extendList.iterator();
            while (it2.hasNext()) {
                C6289c c6289cA2 = a((KingPos) it2.next());
                linkedHashMap.put(c6289cA2.f100458a, c6289cA2);
                arrayList2.add(Unit.INSTANCE);
            }
        }
        return new p(linkedHashMap);
    }
}
