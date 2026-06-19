package com.bilibili.ship.theseus.united.player.oldway.playercontainer;

import androidx.compose.animation.core.Animatable;
import com.bilibili.lib.media.resource.MediaResource;
import com.bilibili.lib.media.resource.PlayerCodecConfig;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import tv.danmaku.biliplayerv2.clock.PlayerProgressRangeObserver;
import tv.danmaku.biliplayerv2.service.BufferingObserver;
import tv.danmaku.biliplayerv2.service.F;
import tv.danmaku.biliplayerv2.service.G;
import tv.danmaku.biliplayerv2.service.H;
import tv.danmaku.biliplayerv2.service.IMediaResourceObserver;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.IPlayerPerformanceListener;
import tv.danmaku.biliplayerv2.service.IPlayerReleaseObserver;
import tv.danmaku.biliplayerv2.service.IPlayerSpeedChangedObserver;
import tv.danmaku.biliplayerv2.service.IRenderStartObserver;
import tv.danmaku.biliplayerv2.service.K;
import tv.danmaku.biliplayerv2.service.OnMeteredNetworkUrlHookListener;
import tv.danmaku.biliplayerv2.service.PlayerErrorObserver;
import tv.danmaku.biliplayerv2.service.PlayerProgressObserver;
import tv.danmaku.biliplayerv2.service.PlayerSeekObserver;
import tv.danmaku.biliplayerv2.service.PlayerStateObserver;
import tv.danmaku.biliplayerv2.service.lock.DisablePlayLock;
import tv.danmaku.ijk.media.player.IjkMediaAsset;
import tv.danmaku.videoplayer.coreV2.IMediaPlayParams;
import tv.danmaku.videoplayer.coreV2.MediaItem;
import tv.danmaku.videoplayer.coreV2.transformer.MediaItemParams;
import tv.danmaku.videoplayer.coreV2.transformer.P2PParams;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/playercontainer/v.class */
public final /* synthetic */ class v implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f104777a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f104778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f104779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f104780d;

    public /* synthetic */ v(Ref.ObjectRef objectRef, com.bilibili.ship.theseus.keel.player.h hVar, CoroutineScope coroutineScope) {
        this.f104779c = objectRef;
        this.f104780d = hVar;
        this.f104778b = coroutineScope;
    }

    public /* synthetic */ v(CoroutineScope coroutineScope, Animatable animatable, Animatable animatable2) {
        this.f104778b = coroutineScope;
        this.f104779c = animatable;
        this.f104780d = animatable2;
    }

    public final Object invoke(Object obj) {
        switch (this.f104777a) {
            case 0:
                final IPlayerCoreService iPlayerCoreService = (IPlayerCoreService) obj;
                ((Ref.ObjectRef) this.f104779c).element = iPlayerCoreService;
                final com.bilibili.ship.theseus.keel.player.h hVar = (com.bilibili.ship.theseus.keel.player.h) this.f104780d;
                final CoroutineScope coroutineScope = this.f104778b;
                return new IPlayerCoreService(iPlayerCoreService, hVar, coroutineScope) { // from class: com.bilibili.ship.theseus.united.player.oldway.playercontainer.TheseusPlayerContainerProvider$providePlayerContainer$playerContainer$1$1$1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final IPlayerCoreService f104769a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final com.bilibili.ship.theseus.keel.player.h f104770b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final CoroutineScope f104771c;

                    {
                        this.f104770b = hVar;
                        this.f104771c = coroutineScope;
                        this.f104769a = iPlayerCoreService;
                    }

                    public final DisablePlayLock acquireDisablePlayLock(String str) {
                        return this.f104769a.acquireDisablePlayLock(str);
                    }

                    public final void addAssetUpdateObserver(tv.danmaku.biliplayerv2.service.g gVar) {
                        this.f104769a.addAssetUpdateObserver(gVar);
                    }

                    public final void addMediaCenterObserver(tv.danmaku.biliplayerv2.service.j jVar) {
                        this.f104769a.addMediaCenterObserver(jVar);
                    }

                    public final void addMediaResourceObserver(IMediaResourceObserver iMediaResourceObserver) {
                        this.f104769a.addMediaResourceObserver(iMediaResourceObserver);
                    }

                    public final void addPlayerClockChangedObserver(tv.danmaku.biliplayerv2.service.l lVar) {
                        this.f104769a.addPlayerClockChangedObserver(lVar);
                    }

                    public final void addPlayerLoopObserver(tv.danmaku.biliplayerv2.service.u uVar) {
                        this.f104769a.addPlayerLoopObserver(uVar);
                    }

                    public final void addPlayerOnRawDataWriteObserver(G g7) {
                        this.f104769a.addPlayerOnRawDataWriteObserver(g7);
                    }

                    public final void addPlayerOnTrackInfoObserver(H h) {
                        this.f104769a.addPlayerOnTrackInfoObserver(h);
                    }

                    public final void addPlayerReleaseObserver(IPlayerReleaseObserver iPlayerReleaseObserver) {
                        this.f104769a.addPlayerReleaseObserver(iPlayerReleaseObserver);
                    }

                    public final void addPlayerSourceObserver(tv.danmaku.biliplayerv2.service.x xVar) {
                        this.f104769a.addPlayerSourceObserver(xVar);
                    }

                    public final void addPlayerSpeedChangedObserver(IPlayerSpeedChangedObserver iPlayerSpeedChangedObserver) {
                        this.f104769a.addPlayerSpeedChangedObserver(iPlayerSpeedChangedObserver);
                    }

                    public final void addRenderStartObserver(IRenderStartObserver iRenderStartObserver) {
                        this.f104769a.addRenderStartObserver(iRenderStartObserver);
                    }

                    public final void addSeekInterceptor(tv.danmaku.biliplayerv2.service.y yVar) {
                        this.f104769a.addSeekInterceptor(yVar);
                    }

                    public final MediaItem<?> createMediaItem(MediaItemParams mediaItemParams, MediaResource mediaResource) {
                        return this.f104769a.createMediaItem(mediaItemParams, mediaResource);
                    }

                    public final tv.danmaku.videoplayer.coreV2.a createMultiMediaContext(IMediaPlayParams iMediaPlayParams) {
                        return this.f104769a.createMultiMediaContext(iMediaPlayParams);
                    }

                    public final int[] getAudioStreamsIndex() {
                        return this.f104769a.getAudioStreamsIndex();
                    }

                    public final float getBufferedPercentage() {
                        return this.f104769a.getBufferedPercentage();
                    }

                    public final int getCurrentAudioIndex() {
                        return this.f104769a.getCurrentAudioIndex();
                    }

                    public final int getCurrentAudioStream() {
                        return this.f104769a.getCurrentAudioStream();
                    }

                    public final MediaItem<?> getCurrentMediaItem() {
                        return this.f104769a.getCurrentMediaItem();
                    }

                    public final String getCurrentPlayUrl(boolean z6) {
                        return this.f104769a.getCurrentPlayUrl(z6);
                    }

                    public final int getCurrentPosition() {
                        return this.f104769a.getCurrentPosition();
                    }

                    public final int getCurrentQuality() {
                        return this.f104769a.getCurrentQuality();
                    }

                    public final boolean getDashAuto() {
                        return this.f104769a.getDashAuto();
                    }

                    public final int getDefaultAudioIndex() {
                        return this.f104769a.getDefaultAudioIndex();
                    }

                    public final int getDuration() {
                        return this.f104769a.getDuration();
                    }

                    public final MediaResource getMediaResource() {
                        return this.f104769a.getMediaResource();
                    }

                    public final long getMediaSize(IjkMediaAsset.VideoCodecType videoCodecType) {
                        return this.f104769a.getMediaSize(videoCodecType);
                    }

                    public final OnMeteredNetworkUrlHookListener getMeteredNetworkUrlHookListener() {
                        return this.f104769a.getMeteredNetworkUrlHookListener();
                    }

                    public final String getPlayFailReason() {
                        return this.f104769a.getPlayFailReason();
                    }

                    public final float getPlaySpeed(boolean z6) {
                        return this.f104769a.getPlaySpeed(z6);
                    }

                    public final PlayerCodecConfig getPlayerCodecConfig() {
                        return this.f104769a.getPlayerCodecConfig();
                    }

                    public final int getRealCurrentPosition() {
                        return this.f104769a.getRealCurrentPosition();
                    }

                    public final int getRealDuration() {
                        return this.f104769a.getRealDuration();
                    }

                    public final tv.danmaku.biliplayerv2.service.A getStartStreamIdSelector() {
                        return this.f104769a.getStartStreamIdSelector();
                    }

                    public final int getState() {
                        return this.f104769a.getState();
                    }

                    public final long getTcpSpeed() {
                        return this.f104769a.getTcpSpeed();
                    }

                    public final float getVideoFps() {
                        return this.f104769a.getVideoFps();
                    }

                    public final Pair<Float, Float> getVolume() {
                        return this.f104769a.getVolume();
                    }

                    public final int interceptSeekTarget(int i7) {
                        return this.f104769a.interceptSeekTarget(i7);
                    }

                    public final boolean isBufferLimit() {
                        return this.f104769a.isBufferLimit();
                    }

                    public final boolean isCorePlayerActive() {
                        return this.f104769a.isCorePlayerActive();
                    }

                    public final boolean isMiniPlayerAvailable() {
                        return this.f104769a.isMiniPlayerAvailable();
                    }

                    public final boolean isProjectionScreenAvailable() {
                        return this.f104769a.isProjectionScreenAvailable();
                    }

                    public final boolean isThirdPlayer() {
                        return this.f104769a.isThirdPlayer();
                    }

                    public final Boolean isVariableResolutionRatio() {
                        return this.f104769a.isVariableResolutionRatio();
                    }

                    public final void pause() {
                        this.f104770b.pause();
                    }

                    public final void play() {
                        this.f104769a.play();
                    }

                    public final boolean playFromShared(Function0<Unit> function0, Function0<Unit> function02) {
                        return this.f104769a.playFromShared(function0, function02);
                    }

                    public final void registerBufferingState(BufferingObserver bufferingObserver) {
                        this.f104769a.registerBufferingState(bufferingObserver);
                    }

                    public final void registerPlayerErrorObserver(PlayerErrorObserver playerErrorObserver) {
                        this.f104769a.registerPlayerErrorObserver(playerErrorObserver);
                    }

                    public final void registerPlayerProgressObserver(PlayerProgressObserver playerProgressObserver) {
                        this.f104769a.registerPlayerProgressObserver(playerProgressObserver);
                    }

                    public final void registerPlayerProgressRangeObserver(PlayerProgressRangeObserver playerProgressRangeObserver, long j7, long j8) {
                        this.f104769a.registerPlayerProgressRangeObserver(playerProgressRangeObserver, j7, j8);
                    }

                    public final void registerSeekObserver(PlayerSeekObserver playerSeekObserver) {
                        this.f104769a.registerSeekObserver(playerSeekObserver);
                    }

                    public final void registerState(PlayerStateObserver playerStateObserver, int... iArr) {
                        this.f104769a.registerState(playerStateObserver, iArr);
                    }

                    public final void registerVolumeChangeObserver(K k7) {
                        this.f104769a.registerVolumeChangeObserver(k7);
                    }

                    public final void releaseDisablePlayLock(DisablePlayLock disablePlayLock) {
                        this.f104769a.releaseDisablePlayLock(disablePlayLock);
                    }

                    public final void releaseMultiMediaContext(tv.danmaku.videoplayer.coreV2.a aVar) {
                        this.f104769a.releaseMultiMediaContext(aVar);
                    }

                    public final void removeAssetUpdateObserver(tv.danmaku.biliplayerv2.service.g gVar) {
                        this.f104769a.removeAssetUpdateObserver(gVar);
                    }

                    public final void removeCurrentSource() {
                        this.f104769a.removeCurrentSource();
                    }

                    public final void removeMediaCenterObserver(tv.danmaku.biliplayerv2.service.j jVar) {
                        this.f104769a.removeMediaCenterObserver(jVar);
                    }

                    public final void removeMediaResourceObserver(IMediaResourceObserver iMediaResourceObserver) {
                        this.f104769a.removeMediaResourceObserver(iMediaResourceObserver);
                    }

                    public final void removePlayerClockChangedObserver(tv.danmaku.biliplayerv2.service.l lVar) {
                        this.f104769a.removePlayerClockChangedObserver(lVar);
                    }

                    public final void removePlayerLoopObserver(tv.danmaku.biliplayerv2.service.u uVar) {
                        this.f104769a.removePlayerLoopObserver(uVar);
                    }

                    public final void removePlayerOnRawDataWriteObserver(G g7) {
                        this.f104769a.removePlayerOnRawDataWriteObserver(g7);
                    }

                    public final void removePlayerOnTrackInfoObserver(H h) {
                        this.f104769a.removePlayerOnTrackInfoObserver(h);
                    }

                    public final void removePlayerReleaseObserver(IPlayerReleaseObserver iPlayerReleaseObserver) {
                        this.f104769a.removePlayerReleaseObserver(iPlayerReleaseObserver);
                    }

                    public final void removePlayerSourceObserver(tv.danmaku.biliplayerv2.service.x xVar) {
                        this.f104769a.removePlayerSourceObserver(xVar);
                    }

                    public final void removePlayerSpeedChangedObserver(IPlayerSpeedChangedObserver iPlayerSpeedChangedObserver) {
                        this.f104769a.removePlayerSpeedChangedObserver(iPlayerSpeedChangedObserver);
                    }

                    public final void removeRenderStartObserver(IRenderStartObserver iRenderStartObserver) {
                        this.f104769a.removeRenderStartObserver(iRenderStartObserver);
                    }

                    public final void removeSeekInterceptor(tv.danmaku.biliplayerv2.service.y yVar) {
                        this.f104769a.removeSeekInterceptor(yVar);
                    }

                    public final void resetAudioIndex() {
                        this.f104769a.resetAudioIndex();
                    }

                    public final void resume() {
                        com.bilibili.ship.theseus.keel.player.h hVar2 = this.f104770b;
                        hVar2.p();
                        com.bilibili.ship.theseus.keel.player.j jVarJ = hVar2.j();
                        if (jVarJ != null) {
                            jVarJ.n();
                        }
                    }

                    public final void seekTo(int i7) {
                        seekTo(i7, false);
                    }

                    public final void seekTo(int i7, boolean z6) {
                        BuildersKt.launch$default(this.f104771c, (CoroutineContext) null, (CoroutineStart) null, new TheseusPlayerContainerProvider$providePlayerContainer$playerContainer$1$1$1$seekTo$1(this.f104770b, i7, z6, null), 3, (Object) null);
                    }

                    public final void setAssetUpdateListener(F f7) {
                        this.f104769a.setAssetUpdateListener(f7);
                    }

                    public final int setAudioIndex(Integer num) {
                        return this.f104769a.setAudioIndex(num);
                    }

                    public final void setAudioOnly(boolean z6) {
                        this.f104769a.setAudioOnly(z6);
                    }

                    public final void setAudioStreamId(int i7) {
                        this.f104769a.setAudioStreamId(i7);
                    }

                    public final void setBufferLimit(boolean z6) {
                        this.f104769a.setBufferLimit(z6);
                    }

                    public final void setCurrentPositionInterceptor(tv.danmaku.biliplayerv2.service.h hVar2) {
                        this.f104769a.setCurrentPositionInterceptor(hVar2);
                    }

                    public final void setDashAuto(boolean z6, int i7, int i8) {
                        this.f104769a.setDashAuto(z6, i7, i8);
                    }

                    public final void setDurationInterceptor(tv.danmaku.biliplayerv2.service.i iVar) {
                        this.f104769a.setDurationInterceptor(iVar);
                    }

                    public final void setLooping(boolean z6) {
                        this.f104769a.setLooping(z6);
                    }

                    public final void setMediaResource(MediaResource mediaResource, boolean z6, MediaItemParams mediaItemParams) {
                        this.f104769a.setMediaResource(mediaResource, z6, mediaItemParams);
                    }

                    public final void setMediaResource(MediaItem<?> mediaItem, MediaResource mediaResource, boolean z6, MediaItemParams mediaItemParams) {
                        this.f104769a.setMediaResource(mediaItem, mediaResource, z6, mediaItemParams);
                    }

                    public final void setMeteredNetworkUrlHookListener(OnMeteredNetworkUrlHookListener onMeteredNetworkUrlHookListener) {
                        this.f104769a.setMeteredNetworkUrlHookListener(onMeteredNetworkUrlHookListener);
                    }

                    public final void setMiniPlayerAvailable(boolean z6) {
                        this.f104769a.setMiniPlayerAvailable(z6);
                    }

                    public final void setPlaySpeed(float f7) {
                        this.f104770b.r(f7);
                    }

                    public final void setPlayerPerformanceListener(IPlayerPerformanceListener iPlayerPerformanceListener) {
                        this.f104769a.setPlayerPerformanceListener(iPlayerPerformanceListener);
                    }

                    public final void setProjectionScreenAvailable(boolean z6) {
                        this.f104769a.setProjectionScreenAvailable(z6);
                    }

                    public final void setStartStreamIdSelector(tv.danmaku.biliplayerv2.service.A a7) {
                        this.f104769a.setStartStreamIdSelector(a7);
                    }

                    public final void setVolume(float f7, float f8) {
                        this.f104769a.setVolume(f7, f8);
                    }

                    public final void stop() {
                        this.f104769a.stop();
                    }

                    public final boolean supportMiniPlayer() {
                        return this.f104769a.supportMiniPlayer();
                    }

                    public final boolean supportProjectionScreen() {
                        return this.f104769a.supportProjectionScreen();
                    }

                    public final boolean supportQuality(int i7) {
                        return this.f104769a.supportQuality(i7);
                    }

                    public final void switchAutoQuality(int i7, int i8) {
                        this.f104769a.switchAutoQuality(i7, i8);
                    }

                    public final void switchQuality(int i7) {
                        this.f104769a.switchQuality(i7);
                    }

                    public final boolean tryToRestoreFromShutDownByOthers() {
                        return this.f104769a.tryToRestoreFromShutDownByOthers();
                    }

                    public final void unregisterBufferingState(BufferingObserver bufferingObserver) {
                        this.f104769a.unregisterBufferingState(bufferingObserver);
                    }

                    public final void unregisterPlayerErrorObserver(PlayerErrorObserver playerErrorObserver) {
                        this.f104769a.unregisterPlayerErrorObserver(playerErrorObserver);
                    }

                    public final void unregisterPlayerProgressObserver(PlayerProgressObserver playerProgressObserver) {
                        this.f104769a.unregisterPlayerProgressObserver(playerProgressObserver);
                    }

                    public final void unregisterPlayerProgressRangeObserver(PlayerProgressRangeObserver playerProgressRangeObserver) {
                        this.f104769a.unregisterPlayerProgressRangeObserver(playerProgressRangeObserver);
                    }

                    public final void unregisterSeekObserver(PlayerSeekObserver playerSeekObserver) {
                        this.f104769a.unregisterSeekObserver(playerSeekObserver);
                    }

                    public final void unregisterState(PlayerStateObserver playerStateObserver) {
                        this.f104769a.unregisterState(playerStateObserver);
                    }

                    public final void unregisterVolumeChangeObserver(K k7) {
                        this.f104769a.unregisterVolumeChangeObserver(k7);
                    }

                    public final void updateMediaResource(MediaResource mediaResource) {
                        this.f104769a.updateMediaResource(mediaResource);
                    }

                    public final void updateP2PParams(P2PParams p2PParams) {
                        this.f104769a.updateP2PParams(p2PParams);
                    }
                };
            default:
                return new kntr.common.ouro.common.ui.toolPanel.picture.c(this.f104778b, (Animatable) this.f104779c, (Animatable) this.f104780d);
        }
    }
}
