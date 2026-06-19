package com.bilibili.ship.theseus.ogv;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import javax.inject.Inject;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/OgvShareMenuChatService.class */
@StabilityInferred(parameters = 0)
public final class OgvShareMenuChatService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f91326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final OgvSeason f91327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final OgvCurrentEpisodeRepository f91328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Context f91329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final C8043a f91330e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final BiliAccounts f91331f;

    @Inject
    public OgvShareMenuChatService(@NotNull CoroutineScope coroutineScope, @NotNull OgvSeason ogvSeason, @NotNull OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository, @NotNull Context context, @NotNull C8043a c8043a, @NotNull BiliAccounts biliAccounts) {
        this.f91326a = coroutineScope;
        this.f91327b = ogvSeason;
        this.f91328c = ogvCurrentEpisodeRepository;
        this.f91329d = context;
        this.f91330e = c8043a;
        this.f91331f = biliAccounts;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.ship.theseus.ogv.OgvShareMenuChatService r13, long r14, long r16, int r18, java.lang.String r19, boolean r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 573
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.OgvShareMenuChatService.a(com.bilibili.ship.theseus.ogv.OgvShareMenuChatService, long, long, int, java.lang.String, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final boolean b() {
        OgvEpisode ogvEpisodeC = this.f91328c.c();
        if (ogvEpisodeC == null) {
            return false;
        }
        OgvSeason ogvSeason = this.f91327b;
        BuildersKt.launch$default(this.f91326a, (CoroutineContext) null, (CoroutineStart) null, new OgvShareMenuChatService$onChatClick$1(ogvSeason.f94449a, ogvEpisodeC.f93555a, ogvSeason.f94450b.f71782a, this, null), 3, (Object) null);
        return true;
    }
}
