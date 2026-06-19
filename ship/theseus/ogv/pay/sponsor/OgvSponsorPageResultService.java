package com.bilibili.ship.theseus.ogv.pay.sponsor;

import androidx.activity.ComponentActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ogv.pub.payment.pay.sponsor.SponsorCheckResult;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import javax.inject.Inject;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/pay/sponsor/OgvSponsorPageResultService.class */
@StabilityInferred(parameters = 0)
public final class OgvSponsorPageResultService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f94224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ComponentActivity f94225b;

    @Inject
    public OgvSponsorPageResultService(@NotNull CoroutineScope coroutineScope, @NotNull ComponentActivity componentActivity) {
        this.f94224a = coroutineScope;
        this.f94225b = componentActivity;
    }

    public final void a(@NotNull OgvSeason ogvSeason, @NotNull SponsorCheckResult sponsorCheckResult) {
        BuildersKt.launch$default(this.f94224a, (CoroutineContext) null, (CoroutineStart) null, new OgvSponsorPageResultService$goToSponsorResultPage$1(this, sponsorCheckResult, ogvSeason.f94449a, ogvSeason.f94450b.f71782a, ogvSeason, null), 3, (Object) null);
    }
}
