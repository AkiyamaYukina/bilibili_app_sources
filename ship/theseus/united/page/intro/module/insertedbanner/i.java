package com.bilibili.ship.theseus.united.page.intro.module.insertedbanner;

import G.p;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.mobile.BLMobileHumanActionNative;
import com.bilibili.ship.theseus.united.page.intro.module.insertedbanner.InsertedBanner;
import com.bilibili.ship.theseus.united.page.intro.module.insertedbanner.InsertedBannerUIComponentService;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/insertedbanner/i.class */
public final /* synthetic */ class i implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InsertedBannerUIComponentService f100189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InsertedBanner.Item f100190b;

    public /* synthetic */ i(InsertedBannerUIComponentService insertedBannerUIComponentService, InsertedBanner.Item item) {
        this.f100189a = insertedBannerUIComponentService;
        this.f100190b = item;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke() throws NoWhenBranchMatchedException {
        InsertedBannerUIComponentService insertedBannerUIComponentService = this.f100189a;
        PageReportService pageReportService = insertedBannerUIComponentService.f100155a;
        InsertedBanner.Item item = this.f100190b;
        PageReportService.g(pageReportService, "united.player-video-detail.middle-banner.0.click", item.f100154d, 4);
        int i7 = InsertedBannerUIComponentService.a.f100161a[item.a().ordinal()];
        String str = item.f100152b;
        if (i7 == 1) {
            BLRouter.routeTo(ec.c.a(str), insertedBannerUIComponentService.f100158d);
        } else if (i7 == 2) {
            BuildersKt.launch$default(insertedBannerUIComponentService.f100156b, (CoroutineContext) null, (CoroutineStart) null, new InsertedBannerUIComponentService$newInsertedSingleCardVm$2$1(insertedBannerUIComponentService, item, null), 3, (Object) null);
        } else {
            if (i7 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            try {
                Context context = insertedBannerUIComponentService.f100158d;
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.addFlags(BLMobileHumanActionNative.BL_MOBILE_ENABLE_DYNAMIC_GESTURE);
                context.startActivity(intent);
            } catch (ActivityNotFoundException e7) {
                com.bilibili.bangumi.logic.page.detail.service.e.a("[theseus-united-InsertedBannerUIComponentService-newInsertedSingleCardVm$lambda$1] ", p.a(str, " cannot be opened through the system's default browser "), "InsertedBannerUIComponentService-newInsertedSingleCardVm$lambda$1", (Throwable) null);
            }
            Unit unit = Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
