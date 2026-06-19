package com.bilibili.ship.theseus.united.player.oldway.playercontainer;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.lifecycle.Lifecycle;
import com.alipay.sdk.app.PayTask;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.ship.theseus.united.player.oldway.playercontainer.w;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.videopage.common.performance.PerformanceTracerImpl;
import tv.danmaku.biliplayerv2.ControlContainerType;
import tv.danmaku.biliplayerv2.DirectorVersion;
import tv.danmaku.biliplayerv2.IPlayerContainer;
import tv.danmaku.biliplayerv2.PlayerConfiguration;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.PlayerParamsV2;
import tv.danmaku.biliplayerv2.service.IPlayerService;
import tv.danmaku.biliplayerv2.service.IPlayerServiceManager;
import tv.danmaku.biliplayerv2.service.PlayerServiceManager;
import tv.danmaku.videoplayer.core.videoview.AspectRatio;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/playercontainer/A.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.PageScope")
@DaggerGenerated
@QualifierMetadata({"com.bilibili.ship.theseus.united.di.PageCoroutineScope"})
public final class A implements Factory<PlayerContainer> {
    public static PlayerContainer a(Context context, com.bilibili.ship.theseus.keel.player.h hVar, CoroutineScope coroutineScope, Flow<w.a> flow, Lifecycle lifecycle, @Nullable AspectRatio aspectRatio, @Nullable IPlayerContainer.SharedRecord sharedRecord, com.bilibili.ship.theseus.united.page.performance.a aVar) {
        List<Class<? extends IPlayerService>> list = w.f104781a;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        IPlayerContainer.Builder controlContainerConfig = new IPlayerContainer.Builder().setContext(context).setControlContainerConfig(MapsKt.emptyMap());
        PlayerParamsV2 playerParamsV2 = new PlayerParamsV2();
        playerParamsV2.setSharingBundle(sharedRecord != null ? sharedRecord.getSharingBundle() : null);
        playerParamsV2.getConfig().setDirectorVersion(DirectorVersion.V3);
        playerParamsV2.getConfig().setMLoadingDelayTime(800L);
        playerParamsV2.getConfig().setUpdateVideoRenderViewPortEnable(true);
        playerParamsV2.getConfig().setControlContainerLazyMode(true);
        playerParamsV2.getConfig().setControlContainerInheritsVisibility(true);
        playerParamsV2.getConfig().setInitialControlContainerType(ControlContainerType.NONE);
        PlayerConfiguration config = playerParamsV2.getConfig();
        if (com.bilibili.playerbizcommonv2.utils.f.f81913a) {
            config.setControlContainerShowDuration(PayTask.f60018j);
        } else if (com.bilibili.playerbizcommonv2.utils.f.f81914b || com.bilibili.playerbizcommonv2.utils.f.f81915c) {
            config.setControlContainerShowDuration(PayTask.f60018j);
            config.setHideControlInFullScreen(true);
        }
        playerParamsV2.setPlayerCoreServiceDecorator(new v(objectRef, hVar, coroutineScope));
        PlayerContainer playerContainerBuild = controlContainerConfig.setPlayerParams(playerParamsV2).build();
        playerContainerBuild.onCreate((Bundle) null);
        ii1.a playerProfiler = playerContainerBuild.getPlayerProfiler();
        if (playerProfiler != null) {
            playerProfiler.b(aVar.f102236b, new String[]{"resolve_play_url_fire", "set_media_item", "start_resolve_play_url", "end_resolve_play_url", "startUgcBusinessService"});
        } else {
            aVar.getClass();
        }
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.TRUE);
        lifecycle.addObserver(new x(playerContainerBuild, MutableStateFlow));
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new TheseusPlayerContainerProvider$providePlayerContainer$2(flow, MutableStateFlow, playerContainerBuild, context, aVar, aspectRatio, lifecycle, null), 3, (Object) null);
        playerContainerBuild.getPlayerCoreService().setCurrentPositionInterceptor(new y(hVar));
        playerContainerBuild.getPlayerCoreService().setDurationInterceptor(new z(hVar));
        IPlayerServiceManager playerServiceManager = playerContainerBuild.getPlayerServiceManager();
        PlayerServiceManager.ServiceDescriptor.Companion companion = PlayerServiceManager.ServiceDescriptor.Companion;
        playerServiceManager.bindService(companion.obtain(u.class), new PlayerServiceManager.Client());
        PlayerServiceManager.ServiceDescriptor serviceDescriptorObtain = companion.obtain(u.class);
        PlayerServiceManager.Client client = new PlayerServiceManager.Client();
        playerContainerBuild.getPlayerServiceManager().bindService(serviceDescriptorObtain, client, false);
        u service = client.getService();
        playerContainerBuild.getPlayerServiceManager().unbindService(serviceDescriptorObtain, client);
        service.f104776a = hVar;
        playerContainerBuild.getPlayerServiceManager().bindService(companion.obtain(Er0.a.class), new PlayerServiceManager.Client());
        PlayerServiceManager.ServiceDescriptor serviceDescriptorObtain2 = companion.obtain(Er0.a.class);
        PlayerServiceManager.Client client2 = new PlayerServiceManager.Client();
        playerContainerBuild.getPlayerServiceManager().bindService(serviceDescriptorObtain2, client2, false);
        IPlayerService service2 = client2.getService();
        playerContainerBuild.getPlayerServiceManager().unbindService(serviceDescriptorObtain2, client2);
        ((Er0.a) service2).put(t.f104775a, objectRef.element);
        Iterator<T> it = w.f104781a.iterator();
        while (it.hasNext()) {
            playerContainerBuild.getPlayerServiceManager().bindService(PlayerServiceManager.ServiceDescriptor.Companion.obtain((Class) it.next()), new PlayerServiceManager.Client());
        }
        ii1.a playerProfiler2 = playerContainerBuild.getPlayerProfiler();
        if (playerProfiler2 != null) {
            playerProfiler2.a("startUgcBusinessService", (Map) null);
            if ((sharedRecord != null ? sharedRecord.getSharingBundle() : null) != null) {
                if (ConfigManager.Companion.ab2().getWithDefault("ff_united_profiler_enable_when_share", false)) {
                    playerProfiler2.a("set_media_item", (Map) null);
                    aVar.c(PerformanceTracerImpl.Entry.ON_PLAYER_PREPARED.attach(SystemClock.elapsedRealtime()));
                } else {
                    aVar.f102235a.d = true;
                }
            }
        }
        playerContainerBuild.getInteractLayerService().setAutomaticViewProgressRequestDisabled(true);
        return (PlayerContainer) Preconditions.checkNotNullFromProvides(playerContainerBuild);
    }
}
