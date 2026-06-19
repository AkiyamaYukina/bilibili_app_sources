package com.bilibili.ship.theseus.ogv.activity;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import javax.inject.Inject;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.IToastService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/c.class */
@StabilityInferred(parameters = 0)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f91507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f91508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final IToastService f91509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Context f91510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final PageReportService f91511e;

    @Inject
    public c(long j7, @NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull IToastService iToastService, @NotNull Context context, @NotNull PageReportService pageReportService) {
        this.f91507a = j7;
        this.f91508b = hVar;
        this.f91509c = iToastService;
        this.f91510d = context;
        this.f91511e = pageReportService;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.ship.theseus.ogv.activity.c r5, java.lang.String r6, java.lang.String r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.activity.c.a(com.bilibili.ship.theseus.ogv.activity.c, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(com.bilibili.ship.theseus.ogv.activity.c r6, com.bilibili.ship.theseus.ogv.activity.OgvActivityDeliveryResult.PlayAreaToast r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.activity.c.b(com.bilibili.ship.theseus.ogv.activity.c, com.bilibili.ship.theseus.ogv.activity.OgvActivityDeliveryResult$PlayAreaToast, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Nullable
    public final Object c(@NotNull String str, @Nullable String str2, @NotNull ActivityDialogActionType activityDialogActionType, @NotNull SuspendLambda suspendLambda) {
        return CoroutineScopeKt.coroutineScope(new DeliverAction$invoke$2(str, str2, activityDialogActionType, this, null), suspendLambda);
    }
}
