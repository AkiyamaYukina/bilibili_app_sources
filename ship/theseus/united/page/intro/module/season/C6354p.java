package com.bilibili.ship.theseus.united.page.intro.module.season;

import com.bapis.bilibili.app.viewunite.common.Author;
import com.bapis.bilibili.app.viewunite.common.Page;
import com.bapis.bilibili.app.viewunite.common.SeasonHead;
import com.bapis.bilibili.app.viewunite.common.SeasonShow;
import com.bapis.bilibili.app.viewunite.common.SeasonType;
import com.bapis.bilibili.app.viewunite.common.UgcEpisode;
import com.bapis.bilibili.app.viewunite.common.UgcSeasonActivity;
import com.bapis.bilibili.app.viewunite.common.UgcSeasons;
import com.bapis.bilibili.app.viewunite.common.UgcSection;
import com.bapis.bilibili.app.viewunite.common.UserActivity;
import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import com.bilibili.lib.projection.internal.projectionitem.ProjectionItemData;
import com.bilibili.ship.theseus.united.di.BusinessType;
import com.bilibili.ship.theseus.united.page.intro.module.relate.C6302a;
import com.bilibili.ship.theseus.united.page.intro.module.relate.C6320j;
import com.bilibili.ship.theseus.united.page.view.StatInfoData;
import com.bilibili.userfeedback.laserreport.LogReportStrategy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.videoplayer.coreV2.VideoBizType;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.season.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/p.class */
public final class C6354p {

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.season.p$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/p$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f101679a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int[] f101680b;

        static {
            int[] iArr = new int[SeasonType.values().length];
            try {
                iArr[SeasonType.Base.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[SeasonType.Good.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f101679a = iArr;
            int[] iArr2 = new int[BusinessType.values().length];
            try {
                iArr2[BusinessType.UGC.ordinal()] = 1;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr2[BusinessType.CHEESE.ordinal()] = 2;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr2[BusinessType.OGV.ordinal()] = 3;
            } catch (NoSuchFieldError e11) {
            }
            f101680b = iArr2;
        }
    }

    @NotNull
    public static final C6353o a(@NotNull C6353o c6353o) {
        long j7 = c6353o.f101669a;
        List<Z> listReversed = CollectionsKt.reversed(c6353o.h);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listReversed, 10));
        for (Z z6 : listReversed) {
            long j8 = z6.f101645a;
            List listReversed2 = CollectionsKt.reversed(z6.f101648d);
            arrayList.add(new Z(j8, z6.f101647c, z6.f101646b, listReversed2));
        }
        UnitedSeasonActivity unitedSeasonActivity = c6353o.f101678k;
        return new C6353o(j7, c6353o.f101670b, c6353o.f101671c, c6353o.f101672d, c6353o.f101673e, c6353o.f101674f, c6353o.f101675g, arrayList, c6353o.f101676i, c6353o.f101677j, unitedSeasonActivity);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @NotNull
    public static final GeminiCommonPlayableParams b(@NotNull C6355q c6355q, @NotNull GeminiCommonPlayableParams geminiCommonPlayableParams, int i7, @Nullable Map<String, String> map) throws NoWhenBranchMatchedException {
        VideoBizType videoBizType;
        GeminiCommonPlayableParams geminiCommonPlayableParams2 = new GeminiCommonPlayableParams();
        geminiCommonPlayableParams2.setAvid(c6355q.f101682b);
        geminiCommonPlayableParams2.setCid(c6355q.f101683c);
        geminiCommonPlayableParams2.setTitle(c6355q.f101684d);
        BusinessType businessType = c6355q.f101694o;
        int i8 = businessType == null ? -1 : a.f101680b[businessType.ordinal()];
        if (i8 == -1) {
            BLog.w("UnitedSeasonDataKt-toGeminiCommonPlayableParams", "[theseus-united-UnitedSeasonDataKt-toGeminiCommonPlayableParams] episode.bizType is null", (Throwable) null);
            videoBizType = VideoBizType.UNKNOWN;
        } else if (i8 == 1) {
            videoBizType = VideoBizType.UGC;
        } else if (i8 == 2) {
            videoBizType = VideoBizType.PUGV;
        } else {
            if (i8 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            videoBizType = VideoBizType.PGC;
        }
        geminiCommonPlayableParams2.setBizType(videoBizType);
        geminiCommonPlayableParams2.setDisplayRotate(1.0f / ((Av0.a) CollectionsKt.first(c6355q.f101689j)).f596g.a());
        geminiCommonPlayableParams2.setFromSpmid(geminiCommonPlayableParams.getSpmid());
        geminiCommonPlayableParams2.setSpmid(geminiCommonPlayableParams.getSpmid());
        geminiCommonPlayableParams2.setTrackId(geminiCommonPlayableParams.getTrackId());
        geminiCommonPlayableParams2.setFrom(geminiCommonPlayableParams.getFrom());
        geminiCommonPlayableParams2.setCover(c6355q.f101685e);
        geminiCommonPlayableParams2.setFromScene(geminiCommonPlayableParams.getFromScene());
        geminiCommonPlayableParams2.setFromAutoPlay(i7);
        geminiCommonPlayableParams2.setLegacyExtra(map);
        return geminiCommonPlayableParams2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @NotNull
    public static final ProjectionItemData c(@NotNull C6355q c6355q, @NotNull String str, @NotNull String str2, long j7) throws NoWhenBranchMatchedException {
        BusinessType businessType = c6355q.f101694o;
        int i7 = businessType == null ? -1 : a.f101680b[businessType.ordinal()];
        int i8 = 1;
        if (i7 == -1) {
            BLog.w("UnitedSeasonDataKt-transform", "[theseus-united-UnitedSeasonDataKt-transform] episode.bizType is null", (Throwable) null);
        } else if (i7 != 1) {
            i8 = 3;
            if (i7 != 2) {
                if (i7 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i8 = 2;
            }
        }
        return new ProjectionItemData(i8, c6355q.f101682b, "", c6355q.f101683c, 0L, 0L, 0L, str, str2, c6355q.f101684d, LJ0.c.a(LogReportStrategy.TAG_DEFAULT, "video").appendPath(String.valueOf(c6355q.f101682b)).appendQueryParameter("cid", String.valueOf(c6355q.f101683c)).build().toString(), 1, 101, j7, 0L, 0, 1, 0, null, com.bilibili.ship.theseus.united.di.v.a(businessType));
    }

    @Nullable
    public static final BusinessType d(int i7) {
        BusinessType businessType;
        if (i7 == 1) {
            businessType = BusinessType.UGC;
        } else if (i7 == 2) {
            businessType = BusinessType.OGV;
        } else if (i7 != 3) {
            businessType = null;
            BLog.e("UnitedSeasonDataKt-transform", "[theseus-united-UnitedSeasonDataKt-transform] failed to convert int to business type, unknown type", (Throwable) null);
        } else {
            businessType = BusinessType.CHEESE;
        }
        return businessType;
    }

    @NotNull
    public static final C6353o e(@NotNull UgcSeasons ugcSeasons) {
        r rVar;
        UnitedSeasonActivity unitedSeasonActivity;
        long id = ugcSeasons.getId();
        String title = ugcSeasons.getTitle();
        String cover = ugcSeasons.getCover();
        long epCount = ugcSeasons.getEpCount();
        int i7 = a.f101679a[ugcSeasons.getSeasonType().ordinal()];
        UnitedSeasonType unitedSeasonType = i7 != 1 ? i7 != 2 ? UnitedSeasonType.UNKNOWN : UnitedSeasonType.FINE : UnitedSeasonType.SIMPLE;
        String unionTitle = ugcSeasons.getUnionTitle();
        String supernatantTitle = ugcSeasons.getSupernatantTitle();
        List<UgcSection> sectionList = ugcSeasons.getSectionList();
        int i8 = 10;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(sectionList, 10));
        for (UgcSection ugcSection : sectionList) {
            long id2 = ugcSection.getId();
            String title2 = ugcSection.getTitle();
            long type = ugcSection.getType();
            List<UgcEpisode> episodesList = ugcSection.getEpisodesList();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(episodesList, i8));
            for (UgcEpisode ugcEpisode : episodesList) {
                long id3 = ugcEpisode.getId();
                long aid = ugcEpisode.getAid();
                long cid = ugcEpisode.getCid();
                String title3 = ugcEpisode.getTitle();
                String cover2 = ugcEpisode.getCover();
                String coverRightText = ugcEpisode.getCoverRightText();
                double progressPercent = ugcEpisode.getProgressPercent();
                Duration.Companion companion = Duration.Companion;
                long duration = DurationKt.toDuration(ugcEpisode.getDuration(), DurationUnit.SECONDS);
                Av0.a aVarB = Av0.b.b(ugcEpisode.getPage(), ugcEpisode.getAid(), 1, ugcEpisode.getTitle(), ugcEpisode.getCover(), d(ugcEpisode.getBizTypeValue()));
                List pagesList = ugcEpisode.getPagesList();
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(pagesList, 10));
                Iterator it = pagesList.iterator();
                int i9 = 0;
                while (true) {
                    int i10 = i9;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    arrayList3.add(Av0.b.b((Page) next, ugcEpisode.getAid(), i11, ugcEpisode.getTitle(), ugcEpisode.getCover(), d(ugcEpisode.getBizTypeValue())));
                    i9 = i11;
                }
                StatInfoData statInfoDataB = com.bilibili.ship.theseus.united.page.view.b.b(ugcEpisode.getVt());
                StatInfoData statInfoDataB2 = com.bilibili.ship.theseus.united.page.view.b.b(ugcEpisode.getDanmaku());
                C6302a c6302aB = C6320j.b(ugcEpisode.getBadge());
                Author author = ugcEpisode.getAuthor();
                arrayList2.add(new C6355q(id3, aid, cid, title3, cover2, coverRightText, progressPercent, duration, aVarB, arrayList3, statInfoDataB, statInfoDataB2, c6302aB, new com.bilibili.ship.theseus.united.page.view.c(author.getMid(), author.getName()), d(ugcEpisode.getBizTypeValue()), ugcEpisode.hasDownload() ? new C6339a(ugcEpisode.getDownload().getDisableDownload(), ugcEpisode.getDownload().getDisableToast()) : null));
                i8 = 10;
            }
            arrayList.add(new Z(id2, type, title2, arrayList2));
        }
        List seasonAbilityList = ugcSeasons.getSeasonAbilityList();
        String str = (seasonAbilityList == null || seasonAbilityList.isEmpty()) ? null : (String) CollectionsKt.firstOrNull(ugcSeasons.getSeasonAbilityList());
        if (ugcSeasons.hasHead()) {
            SeasonHead head = ugcSeasons.getHead();
            rVar = new r(head.getTitle(), head.getIntro(), com.bilibili.ship.theseus.united.page.view.b.b(head.getVt()), com.bilibili.ship.theseus.united.page.view.b.b(head.getDanmaku()));
        } else {
            rVar = null;
        }
        if (ugcSeasons.hasActivity()) {
            UgcSeasonActivity activity = ugcSeasons.getActivity();
            int type2 = activity.getType();
            long oid = activity.getOid();
            long activityId = activity.getActivityId();
            String title4 = activity.getTitle();
            String intro = activity.getIntro();
            int dayCount = activity.getDayCount();
            int userCount = activity.getUserCount();
            long joinDeadline = activity.getJoinDeadline();
            long j7 = 1000;
            long activityDeadline = activity.getActivityDeadline();
            int checkinViewTime = activity.getCheckinViewTime();
            boolean newActivity = activity.getNewActivity();
            UserActivity userActivity = activity.getUserActivity();
            UnitedSeasonUserActivity unitedSeasonUserActivity = new UnitedSeasonUserActivity(userActivity.getPortrait(), userActivity.getUserState(), userActivity.getCheckinToday(), userActivity.getUserDayCount(), userActivity.getUserViewTime(), userActivity.getLastCheckinDate());
            SeasonShow seasonShow = activity.getSeasonShow();
            unitedSeasonActivity = new UnitedSeasonActivity(type2, oid, activityId, title4, intro, dayCount, userCount, joinDeadline * j7, activityDeadline * j7, checkinViewTime, newActivity, unitedSeasonUserActivity, new UnitedActivitySeasonShow(seasonShow.getButtonText(), seasonShow.getJoinText(), seasonShow.getRuleText(), seasonShow.getCheckinText(), seasonShow.getCheckinPrompt()));
        } else {
            unitedSeasonActivity = null;
        }
        return new C6353o(id, title, cover, epCount, unitedSeasonType, unionTitle, supernatantTitle, arrayList, str, rVar, unitedSeasonActivity);
    }
}
