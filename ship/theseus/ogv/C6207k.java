package com.bilibili.ship.theseus.ogv;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import com.bilibili.lib.media.resource.ExtraInfo;
import com.bilibili.ship.theseus.ogv.playviewextra.EpUserStatus;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/k.class */
@StabilityInferred(parameters = 0)
public final class C6207k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.j f93959a;

    @Inject
    public C6207k(@NotNull ExtraInfo extraInfo, @NotNull com.bilibili.ship.theseus.keel.player.j jVar) {
        this.f93959a = jVar;
        GeminiCommonPlayableParams geminiCommonPlayableParamsF = jVar.f();
        EpUserStatus epUserStatus = (EpUserStatus) Ju0.a.f11697d.a(extraInfo);
        geminiCommonPlayableParamsF.setCurrentCTCC(Intrinsics.areEqual(epUserStatus != null ? epUserStatus.f94345c : null, "CAN_WATCH_CTCC_HOME_NETWORK"));
    }
}
