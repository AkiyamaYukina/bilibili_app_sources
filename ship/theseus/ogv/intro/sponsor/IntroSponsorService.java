package com.bilibili.ship.theseus.ogv.intro.sponsor;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.accountinfo.BiliAccountInfo;
import com.bilibili.lib.accountinfo.model.AccountInfo;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.ship.theseus.ogv.intro.sponsor.a;
import com.bilibili.ship.theseus.ogv.pay.OgvPayService;
import com.bilibili.ship.theseus.ogv.pay.sponsor.BangumiSponsorRankSummary;
import com.bilibili.ship.theseus.ogv.pay.sponsor.BangumiSponsorRankUser;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/sponsor/IntroSponsorService.class */
@StabilityInferred(parameters = 0)
public final class IntroSponsorService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f93906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final OgvSeason f93907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final OgvPayService f93908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final BiliAccounts f93909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final BiliAccountInfo f93910e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final PageReportService f93911f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final IntroContentSizeRepository f93912g;

    @Inject
    public IntroSponsorService(@NotNull Context context, @NotNull OgvSeason ogvSeason, @NotNull OgvPayService ogvPayService, @NotNull BiliAccounts biliAccounts, @NotNull BiliAccountInfo biliAccountInfo, @NotNull PageReportService pageReportService, @NotNull IntroContentSizeRepository introContentSizeRepository) {
        this.f93906a = context;
        this.f93907b = ogvSeason;
        this.f93908c = ogvPayService;
        this.f93909d = biliAccounts;
        this.f93910e = biliAccountInfo;
        this.f93911f = pageReportService;
        this.f93912g = introContentSizeRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x02fd  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bilibili.app.gemini.ui.RunningUIComponent a(@org.jetbrains.annotations.NotNull com.bilibili.ship.theseus.ogv.pay.sponsor.BangumiSponsorRankSummary r14) {
        /*
            Method dump skipped, instruction units count: 1305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.sponsor.IntroSponsorService.a(com.bilibili.ship.theseus.ogv.pay.sponsor.BangumiSponsorRankSummary):com.bilibili.app.gemini.ui.RunningUIComponent");
    }

    public final void b(a.C0735a c0735a, BangumiSponsorRankSummary bangumiSponsorRankSummary) {
        if (bangumiSponsorRankSummary == null) {
            return;
        }
        List<BangumiSponsorRankUser> listA = bangumiSponsorRankSummary.a();
        List mutableList = CollectionsKt.toMutableList(listA.subList(0, listA.size() > 4 ? 4 : listA.size()));
        if (bangumiSponsorRankSummary.b().f94206b > 4) {
            BangumiSponsorRankUser bangumiSponsorRankUser = new BangumiSponsorRankUser(0L, null, null, null, 15);
            AccountInfo accountInfoFromCache = this.f93910e.getAccountInfoFromCache();
            if (accountInfoFromCache != null) {
                bangumiSponsorRankUser.d(accountInfoFromCache.getAvatar());
            }
            mutableList.set(mutableList.size() - 1, bangumiSponsorRankUser);
        }
        Iterator it = mutableList.iterator();
        int i7 = 0;
        int i8 = 0;
        while (true) {
            String str = "";
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (i7 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            BangumiSponsorRankUser bangumiSponsorRankUser2 = (BangumiSponsorRankUser) next;
            List<Pair<String, Boolean>> list = c0735a.f93932s;
            String strA = bangumiSponsorRankUser2.a();
            if (strA != null) {
                str = strA;
            }
            list.set(i7, new Pair<>(str, Boolean.TRUE));
            i8++;
            i7++;
        }
        int size = c0735a.f93932s.size();
        while (i8 < size) {
            c0735a.f93932s.set(i8, new Pair<>("", Boolean.FALSE));
            i8++;
        }
    }
}
