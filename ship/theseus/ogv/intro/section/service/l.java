package com.bilibili.ship.theseus.ogv.intro.section.service;

import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.C4496a;
import com.bilibili.ship.theseus.ogv.C6153e;
import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository;
import com.bilibili.ship.theseus.ogv.intro.section.bean.EpisodeStyle;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import com.bilibili.ship.theseus.ogv.intro.section.bean.SectionType;
import com.bilibili.ship.theseus.ogv.report.ExposureEntryRecordService;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.studio.material.util.UtilsKt;
import javax.inject.Inject;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vg.E;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/l.class */
@StabilityInferred(parameters = 0)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final OgvCurrentEpisodeRepository f93810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f93811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C6153e f93812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final OgvSeason f93813d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Lu0.a f93814e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final PageReportService f93815f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final ExposureEntryRecordService f93816g;

    @NotNull
    public final C8043a h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final wv0.a f93817i;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/l$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f93818a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int[] f93819b;

        static {
            int[] iArr = new int[EpisodeStyle.values().length];
            try {
                iArr[EpisodeStyle.LONG_TITLE.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[EpisodeStyle.COVER.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[EpisodeStyle.LONG_AND_SHORT_TITLE.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[EpisodeStyle.SHORT_TITLE.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            f93818a = iArr;
            int[] iArr2 = new int[SectionType.values().length];
            try {
                iArr2[SectionType.PUGV.ordinal()] = 1;
            } catch (NoSuchFieldError e11) {
            }
            try {
                iArr2[SectionType.RELATED.ordinal()] = 2;
            } catch (NoSuchFieldError e12) {
            }
            f93819b = iArr2;
        }
    }

    @Inject
    public l(@NotNull OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository, @NotNull Context context, @NotNull C6153e c6153e, @NotNull OgvSeason ogvSeason, @Nullable Lu0.a aVar, @NotNull PageReportService pageReportService, @NotNull ExposureEntryRecordService exposureEntryRecordService, @NotNull C8043a c8043a, @NotNull wv0.a aVar2) {
        this.f93810a = ogvCurrentEpisodeRepository;
        this.f93811b = context;
        this.f93812c = c6153e;
        this.f93813d = ogvSeason;
        this.f93814e = aVar;
        this.f93815f = pageReportService;
        this.f93816g = exposureEntryRecordService;
        this.h = c8043a;
        this.f93817i = aVar2;
    }

    public final void a(SectionType sectionType, OgvEpisode ogvEpisode) {
        String strA;
        boolean zA = this.f93817i.a();
        if ((sectionType == SectionType.FEATURE || Hu0.a.b(sectionType)) && !zA) {
            OgvCurrentEpisodeRepository.h(this.f93810a, ogvEpisode, null, null, null, 0, 14);
            return;
        }
        String strA2 = E.a(ogvEpisode.f93553I + 1, ogvEpisode.f93554J, UtilsKt.DOT);
        if (zA) {
            strA = "united.player-video-detail.playlist-episode.0";
        } else {
            int i7 = a.f93819b[sectionType.ordinal()];
            strA = i7 != 1 ? i7 != 2 ? "" : C4496a.a("united.player-video-detail.section-", strA2) : C4496a.a("united.player-video-detail.pugv-", strA2);
        }
        Qj0.g.e(this.f93811b, xl0.b.a(Uri.parse(ogvEpisode.f93575v), strA));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0300  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(com.bilibili.ship.theseus.ogv.intro.section.ui.m r8, com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode r9, com.bilibili.ship.theseus.ogv.intro.section.bean.EpisodeStyle r10, com.bilibili.ship.theseus.ogv.intro.section.floatlayer.v r11, com.bilibili.ship.theseus.ogv.intro.section.bean.BgInfo r12) {
        /*
            Method dump skipped, instruction units count: 1318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.section.service.l.b(com.bilibili.ship.theseus.ogv.intro.section.ui.m, com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode, com.bilibili.ship.theseus.ogv.intro.section.bean.EpisodeStyle, com.bilibili.ship.theseus.ogv.intro.section.floatlayer.v, com.bilibili.ship.theseus.ogv.intro.section.bean.BgInfo):void");
    }
}
