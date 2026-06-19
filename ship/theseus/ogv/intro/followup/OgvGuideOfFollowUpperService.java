package com.bilibili.ship.theseus.ogv.intro.followup;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import com.bilibili.ship.theseus.united.page.intro.module.staffs.OfficialVerifyType;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import javax.inject.Inject;
import kotlinx.coroutines.CoroutineScope;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/followup/OgvGuideOfFollowUpperService.class */
@StabilityInferred(parameters = 0)
public final class OgvGuideOfFollowUpperService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f93049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f93050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final BiliAccounts f93051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final PageReportService f93052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final C8043a f93053e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final OgvCurrentEpisodeRepository f93054f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final IntroContentSizeRepository f93055g;

    @NotNull
    public final OgvSeason h;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/followup/OgvGuideOfFollowUpperService$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f93056a;

        static {
            int[] iArr = new int[OfficialVerifyType.values().length];
            try {
                iArr[OfficialVerifyType.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[OfficialVerifyType.IDENTITY.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[OfficialVerifyType.COMPANY.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[OfficialVerifyType.GOVERNMENT.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[OfficialVerifyType.MEDIA.ordinal()] = 5;
            } catch (NoSuchFieldError e11) {
            }
            try {
                iArr[OfficialVerifyType.OTHER.ordinal()] = 6;
            } catch (NoSuchFieldError e12) {
            }
            f93056a = iArr;
        }
    }

    @Inject
    public OgvGuideOfFollowUpperService(@NotNull CoroutineScope coroutineScope, @NotNull Context context, @NotNull BiliAccounts biliAccounts, @NotNull PageReportService pageReportService, @NotNull C8043a c8043a, @NotNull OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository, @NotNull IntroContentSizeRepository introContentSizeRepository, @NotNull OgvSeason ogvSeason) {
        this.f93049a = coroutineScope;
        this.f93050b = context;
        this.f93051c = biliAccounts;
        this.f93052d = pageReportService;
        this.f93053e = c8043a;
        this.f93054f = ogvCurrentEpisodeRepository;
        this.f93055g = introContentSizeRepository;
        this.h = ogvSeason;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0053  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bilibili.app.gemini.ui.RunningUIComponent a(@org.jetbrains.annotations.NotNull com.bilibili.ship.theseus.ogv.intro.followup.OgvGuideOfFollowUpperData r12) {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.followup.OgvGuideOfFollowUpperService.a(com.bilibili.ship.theseus.ogv.intro.followup.OgvGuideOfFollowUpperData):com.bilibili.app.gemini.ui.RunningUIComponent");
    }
}
