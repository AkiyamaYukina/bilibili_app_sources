package com.bilibili.ship.theseus.united.page.intro.module.relate;

import com.bapis.bilibili.app.viewunite.common.BadgeInfo;
import com.bapis.bilibili.app.viewunite.common.CoverDimension;
import com.bapis.bilibili.app.viewunite.common.DislikeReasons;
import com.bapis.bilibili.app.viewunite.common.RelateConfig;
import com.bapis.bilibili.app.viewunite.common.RelateDislike;
import com.bapis.bilibili.app.viewunite.common.TranslateButton;
import com.bapis.bilibili.pagination.Pagination;
import com.bilibili.ship.theseus.united.page.view.StatData;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/j.class */
public final class C6320j {

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.j$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/j$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f101262a;

        static {
            int[] iArr = new int[com.bapis.bilibili.app.viewunite.common.RelateCardType.values().length];
            try {
                iArr[com.bapis.bilibili.app.viewunite.common.RelateCardType.AV.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[com.bapis.bilibili.app.viewunite.common.RelateCardType.BANGUMI.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[com.bapis.bilibili.app.viewunite.common.RelateCardType.RESOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[com.bapis.bilibili.app.viewunite.common.RelateCardType.GAME.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[com.bapis.bilibili.app.viewunite.common.RelateCardType.CM.ordinal()] = 5;
            } catch (NoSuchFieldError e11) {
            }
            try {
                iArr[com.bapis.bilibili.app.viewunite.common.RelateCardType.LIVE.ordinal()] = 6;
            } catch (NoSuchFieldError e12) {
            }
            try {
                iArr[com.bapis.bilibili.app.viewunite.common.RelateCardType.AI_RECOMMEND.ordinal()] = 7;
            } catch (NoSuchFieldError e13) {
            }
            try {
                iArr[com.bapis.bilibili.app.viewunite.common.RelateCardType.BANGUMI_AV.ordinal()] = 8;
            } catch (NoSuchFieldError e14) {
            }
            try {
                iArr[com.bapis.bilibili.app.viewunite.common.RelateCardType.BANGUMI_UGC.ordinal()] = 9;
            } catch (NoSuchFieldError e15) {
            }
            try {
                iArr[com.bapis.bilibili.app.viewunite.common.RelateCardType.SPECIAL.ordinal()] = 10;
            } catch (NoSuchFieldError e16) {
            }
            try {
                iArr[com.bapis.bilibili.app.viewunite.common.RelateCardType.COURSE.ordinal()] = 11;
            } catch (NoSuchFieldError e17) {
            }
            try {
                iArr[com.bapis.bilibili.app.viewunite.common.RelateCardType.MINI_PROGRAM.ordinal()] = 12;
            } catch (NoSuchFieldError e18) {
            }
            try {
                iArr[com.bapis.bilibili.app.viewunite.common.RelateCardType.HISTORY_AV.ordinal()] = 13;
            } catch (NoSuchFieldError e19) {
            }
            try {
                iArr[com.bapis.bilibili.app.viewunite.common.RelateCardType.PLACEHOLDER.ordinal()] = 14;
            } catch (NoSuchFieldError e20) {
            }
            f101262a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.j$b */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/j$b.class */
    public static final class b extends TypeToken<RelateBangumiResourceCard> {
    }

    @Nullable
    public static final com.bilibili.app.gemini.ugc.feature.o a(@NotNull o0 o0Var) {
        com.bilibili.app.gemini.ugc.feature.o oVar;
        TranslateButton translateButton;
        String str;
        C6321j0 c6321j0 = o0Var.f101321f;
        p0 p0Var = o0Var.f101318c;
        String str2 = p0Var.f101355m;
        if (!o0Var.a() || c6321j0 == null || Intrinsics.areEqual("operation", str2)) {
            oVar = null;
        } else {
            G0 g02 = o0Var.f101319d;
            boolean z6 = (g02 == null || (translateButton = g02.f101007e) == null || !Intrinsics.areEqual(translateButton.getButtonStatus(), "VIEW_ORIGIN") || (str = p0Var.f101360r) == null || StringsKt.isBlank(str)) ? false : true;
            com.bilibili.app.gemini.ugc.feature.o oVar2 = new com.bilibili.app.gemini.ugc.feature.o();
            oVar2.a = z6 ? p0Var.f101360r : p0Var.f101344a;
            StatData statData = c6321j0.f101266d;
            oVar2.b = String.valueOf(statData.b().f104027a);
            oVar2.c = statData.b().a() ? 1 : 0;
            oVar2.d = statData.b().f104028b;
            oVar2.e = p0Var.f101346c;
            oVar2.f = p0Var.f101353k.f104061d;
            oVar2.g = true;
            oVar2.h = statData.f104020b.f104028b;
            oVar2.i = o0Var.f101317b;
            oVar2.k = p0Var.f101348e;
            oVar2.l = p0Var.f101347d;
            oVar2.m = p0Var.f101354l;
            oVar2.n = c6321j0.f101263a;
            oVar2.j = "united.player-video-detail.relatedvideo.0";
            oVar = oVar2;
        }
        return oVar;
    }

    @NotNull
    public static final C6302a b(@NotNull BadgeInfo badgeInfo) {
        return new C6302a(badgeInfo.getText(), badgeInfo.getTextColor(), badgeInfo.getTextColorNight(), badgeInfo.getBgColor(), badgeInfo.getBgColorNight(), badgeInfo.getBorderColor(), badgeInfo.getBorderColorNight(), badgeInfo.getBgStyle(), badgeInfo.getImg(), badgeInfo.getType(), 0, 0, 7168);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:113:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x074a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0754  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0817  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0821  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x089c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x08a6  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x08f4  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x08fe  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x091a  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0924  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x098f  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0999  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x09af  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x09b9  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0a0a  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0a16  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x005c  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.bilibili.ship.theseus.united.page.intro.module.relate.o0 c(@org.jetbrains.annotations.NotNull com.bapis.bilibili.app.viewunite.common.RelateCard r24, long r25, @org.jetbrains.annotations.NotNull java.lang.String r27) {
        /*
            Method dump skipped, instruction units count: 2606
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.relate.C6320j.c(com.bapis.bilibili.app.viewunite.common.RelateCard, long, java.lang.String):com.bilibili.ship.theseus.united.page.intro.module.relate.o0");
    }

    @NotNull
    public static final r0 d(@NotNull RelateConfig relateConfig) {
        long validShowM = relateConfig.getValidShowM();
        long validShowN = relateConfig.getValidShowN();
        Pagination pagination = relateConfig.getPagination();
        C6313f0 c6313f0 = new C6313f0(pagination.getPageSize(), pagination.getNext());
        boolean canLoadMore = relateConfig.getCanLoadMore();
        C6306c c6306c = null;
        if (relateConfig.hasDimension()) {
            CoverDimension dimension = relateConfig.getDimension();
            c6306c = null;
            if (dimension != null) {
                c6306c = null;
                if (dimension.getWidth() > 0.0f) {
                    c6306c = dimension.getHeight() <= 0.0f ? null : new C6306c(dimension.getWidth(), dimension.getHeight());
                }
            }
        }
        return new r0(validShowM, validShowN, c6313f0, canLoadMore, c6306c);
    }

    @NotNull
    public static final t0 e(@NotNull RelateDislike relateDislike) {
        String title = relateDislike.getTitle();
        String subTitle = relateDislike.getSubTitle();
        String closedSubTitle = relateDislike.getClosedSubTitle();
        String pasteText = relateDislike.getPasteText();
        String closedPasteText = relateDislike.getClosedPasteText();
        List<DislikeReasons> dislikeReasonList = relateDislike.getDislikeReasonList();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(dislikeReasonList, 10));
        for (DislikeReasons dislikeReasons : dislikeReasonList) {
            arrayList.add(new E0(dislikeReasons.getId(), dislikeReasons.getMid(), dislikeReasons.getTagId(), dislikeReasons.getRid(), dislikeReasons.getName()));
        }
        return new t0(title, subTitle, closedSubTitle, pasteText, closedPasteText, arrayList, relateDislike.getToast(), relateDislike.getClosedToast());
    }
}
