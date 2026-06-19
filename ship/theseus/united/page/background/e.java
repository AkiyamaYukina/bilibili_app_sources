package com.bilibili.ship.theseus.united.page.background;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.playerbizcommon.features.headset.PlayerHeadsetService;
import javax.inject.Inject;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/background/e.class */
@StabilityInferred(parameters = 0)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f99041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final IPlayerSettingService f99042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final PlayerHeadsetService f99043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f99044d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final d f99045e = new d(this);

    @Inject
    public e(@NotNull CoroutineScope coroutineScope, @NotNull IPlayerSettingService iPlayerSettingService, @NotNull PlayerHeadsetService playerHeadsetService) {
        this.f99041a = coroutineScope;
        this.f99042b = iPlayerSettingService;
        this.f99043c = playerHeadsetService;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PageBackgroundResourceRepository$1(this, null), 3, (Object) null);
    }
}
