package com.bilibili.ship.theseus.ogv.intro.community;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.community.follow.c;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository;
import com.bilibili.ship.theseus.ogv.intro.reservereminder.OgvReserveReminderUIComponentService;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import javax.inject.Inject;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/community/a.class */
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f92327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final BiliAccounts f92328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final OgvSeason f92329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final OgvCurrentEpisodeRepository f92330d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.ogv.intro.livereserve.a f92331e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final OgvReserveReminderUIComponentService f92332f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f92333g;

    @Inject
    public a(@NotNull Context context, @NotNull BiliAccounts biliAccounts, @NotNull OgvSeason ogvSeason, @NotNull OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository, @NotNull com.bilibili.ship.theseus.ogv.intro.livereserve.a aVar, @NotNull OgvReserveReminderUIComponentService ogvReserveReminderUIComponentService, @NotNull CoroutineScope coroutineScope) {
        this.f92327a = context;
        this.f92328b = biliAccounts;
        this.f92329c = ogvSeason;
        this.f92330d = ogvCurrentEpisodeRepository;
        this.f92331e = aVar;
        this.f92332f = ogvReserveReminderUIComponentService;
        this.f92333g = coroutineScope;
        long j7 = ogvSeason.f94449a;
        OgvSeason.UserStatus userStatus = ogvSeason.h;
        boolean z6 = userStatus.f94476a;
        c cVar = c.a;
        c.b(j7, z6, userStatus.f94477b);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(boolean r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            Method dump skipped, instruction units count: 700
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.community.a.a(boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
