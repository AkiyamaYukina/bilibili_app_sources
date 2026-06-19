package com.bilibili.ship.theseus.cheese.biz.intro.primary;

import com.bapis.bilibili.app.viewunite.common.PugvSeasonCombine;
import com.bapis.bilibili.app.viewunite.common.PugvSeasonCombineItem;
import com.bapis.bilibili.app.viewunite.common.PugvSeasonPrimaryBadge;
import com.bapis.bilibili.app.viewunite.common.PugvSeasonPrimaryHotRank;
import com.bapis.bilibili.app.viewunite.common.PugvSeasonPrimaryInfo;
import com.bapis.bilibili.app.viewunite.common.PugvSeasonPrimarySellPoint;
import com.bapis.bilibili.app.viewunite.common.PugvSeasonPrimarySellPointInfo;
import com.bapis.bilibili.app.viewunite.common.StatInfo;
import com.bilibili.ship.theseus.cheese.biz.intro.primary.RelatedCourses;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.primary.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/o.class */
public final class C6094o {

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.primary.o$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/o$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f89750a;

        static {
            int[] iArr = new int[com.bapis.bilibili.app.viewunite.common.PugvBadgeType.values().length];
            try {
                iArr[com.bapis.bilibili.app.viewunite.common.PugvBadgeType.PUGV_BADGE_TYPE_PRODUCTION.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[com.bapis.bilibili.app.viewunite.common.PugvBadgeType.PUGV_BADGE_TYPE_EXCLUSIVE.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[com.bapis.bilibili.app.viewunite.common.PugvBadgeType.PUGV_BADGE_TYPE_FIRST.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[com.bapis.bilibili.app.viewunite.common.PugvBadgeType.PUGV_BADGE_TYPE_SELECTED.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[com.bapis.bilibili.app.viewunite.common.PugvBadgeType.PUGV_BADGE_TYPE_AI.ordinal()] = 5;
            } catch (NoSuchFieldError e11) {
            }
            f89750a = iArr;
        }
    }

    @NotNull
    public static final V a() {
        return new V("", "", new a0(0L, "", "", ""), new W(new U("", "")), new Y(0, CollectionsKt.emptyList()), new T(""), false, CollectionsKt.emptyList(), null);
    }

    @NotNull
    public static final V b(@NotNull PugvSeasonPrimaryInfo pugvSeasonPrimaryInfo) {
        RelatedCourses relatedCourses;
        String title = pugvSeasonPrimaryInfo.getTitle();
        String subtitle = pugvSeasonPrimaryInfo.getSubtitle();
        StatInfo statInfo = pugvSeasonPrimaryInfo.getStatInfo();
        a0 a0Var = new a0(statInfo.getValue(), statInfo.getText(), statInfo.getPureText(), statInfo.getIcon());
        PugvSeasonPrimaryHotRank hotRank = pugvSeasonPrimaryInfo.getRankInfo().getHotRank();
        W w7 = new W(new U(hotRank.getText(), hotRank.getLink()));
        PugvSeasonPrimarySellPointInfo sellPointInfo = pugvSeasonPrimaryInfo.getSellPointInfo();
        int typeValue = sellPointInfo.getTypeValue();
        List<PugvSeasonPrimarySellPoint> sellPointsList = sellPointInfo.getSellPointsList();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(sellPointsList, 10));
        for (PugvSeasonPrimarySellPoint pugvSeasonPrimarySellPoint : sellPointsList) {
            arrayList.add(new X(pugvSeasonPrimarySellPoint.getTitle(), pugvSeasonPrimarySellPoint.getDetail()));
        }
        Y y6 = new Y(typeValue, arrayList);
        T t7 = new T(pugvSeasonPrimaryInfo.getCustomInfo().getExpiryInfo());
        boolean showPayment = pugvSeasonPrimaryInfo.getShowPayment();
        List<PugvSeasonPrimaryBadge> badgesList = pugvSeasonPrimaryInfo.getBadgesList();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(badgesList, 10));
        for (PugvSeasonPrimaryBadge pugvSeasonPrimaryBadge : badgesList) {
            String icon = pugvSeasonPrimaryBadge.getIcon();
            String link = pugvSeasonPrimaryBadge.getLink();
            String nightIcon = pugvSeasonPrimaryBadge.getNightIcon();
            int i7 = a.f89750a[pugvSeasonPrimaryBadge.getType().ordinal()];
            arrayList2.add(new S(icon, link, nightIcon, i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? PugvBadgeType.PUGV_BADGE_TYPE_UNKNOWN : PugvBadgeType.PUGV_BADGE_TYPE_AI : PugvBadgeType.PUGV_BADGE_TYPE_SELECTED : PugvBadgeType.PUGV_BADGE_TYPE_FIRST : PugvBadgeType.PUGV_BADGE_TYPE_EXCLUSIVE : PugvBadgeType.PUGV_BADGE_TYPE_PRODUCTION, pugvSeasonPrimaryBadge.getWidth(), pugvSeasonPrimaryBadge.getHeight()));
        }
        if (pugvSeasonPrimaryInfo.hasCombineSeason()) {
            PugvSeasonCombine combineSeason = pugvSeasonPrimaryInfo.getCombineSeason();
            String title2 = combineSeason.getTitle();
            long combineId = combineSeason.getCombineId();
            List<PugvSeasonCombineItem> itemsList = combineSeason.getItemsList();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(itemsList, 10));
            for (PugvSeasonCombineItem pugvSeasonCombineItem : itemsList) {
                arrayList3.add(new RelatedCourses.Item(pugvSeasonCombineItem.getTitle(), pugvSeasonCombineItem.getSeasonId(), pugvSeasonCombineItem.getSelected(), pugvSeasonCombineItem.getReportMap()));
            }
            relatedCourses = new RelatedCourses(combineId, arrayList3, title2);
        } else {
            relatedCourses = null;
        }
        return new V(title, subtitle, a0Var, w7, y6, t7, showPayment, arrayList2, relatedCourses);
    }
}
