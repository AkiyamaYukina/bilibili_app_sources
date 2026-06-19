package com.bilibili.ship.theseus.united.player.oldway.playercontainer;

import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.player.feature.zoom.ZoomContainerService;
import com.bilibili.gripper.api.ad.biz.GAdBizKt;
import com.bilibili.playerbizcommon.features.background.BackgroundPlayService;
import com.bilibili.playerbizcommon.features.headset.PlayerHeadsetService;
import com.bilibili.playerbizcommon.gesture.GestureService;
import com.bilibili.playerbizcommonv2.danmaku.postpanel.DanmakuTimerService;
import com.bilibili.playerbizcommonv2.service.DanmakuInputWindowService;
import com.bilibili.playerbizcommonv2.service.ai.PlayerAiService;
import dagger.Module;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.IPlayerService;
import tv.danmaku.biliplayerv2.service.SeekService;
import tv.danmaku.biliplayerv2.service.business.ShutOffTimingService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/playercontainer/w.class */
@StabilityInferred(parameters = 0)
@Module
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final List<Class<? extends IPlayerService>> f104781a = CollectionsKt.listOf(new Class[]{GestureService.class, ShutOffTimingService.class, BackgroundPlayService.class, SeekService.class, Gr0.e.class, PlayerHeadsetService.class, DanmakuInputWindowService.class, DanmakuTimerService.class, ZoomContainerService.class, GAdBizKt.getGAdVideoDetail().getAdPlayerV2Unite(), GAdBizKt.getGAdVideoDetail().getCommercialChronosService(), com.bilibili.app.gemini.share.d.class, com.bilibili.app.gemini.player.feature.snapshot.y.class, Fr0.j.class, PlayerAiService.class, Ki1.b.class});

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/playercontainer/w$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ViewGroup f104782a;

        public a(@NotNull ViewGroup viewGroup) {
            this.f104782a = viewGroup;
        }
    }
}
