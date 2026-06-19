package com.bilibili.ship.theseus.united.page.ad;

import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.gripper.api.ad.biz.videodetail.IWrapperPanelHelper;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import tv.danmaku.biliplayerv2.service.ControlContainerObserver;
import tv.danmaku.biliplayerv2.service.PlayerStateObserver;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/ad/b.class */
public final class b implements IWrapperPanelHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdPanelRepository f98955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AdPanelHelper f98956b;

    public b(AdPanelHelper adPanelHelper) {
        this.f98956b = adPanelHelper;
        this.f98955a = adPanelHelper.h;
    }

    public final void addAppBarOnOffsetChangedListener(AppBarLayout.OnOffsetChangedListener onOffsetChangedListener) {
        this.f98955a.f98914n = onOffsetChangedListener;
    }

    public final void dismissPanel() {
        this.f98956b.a(null, true);
    }

    public final AppBarLayout getAppBarLayout() {
        return this.f98955a.f98915o;
    }

    public final int getPanelTopMargin() {
        return this.f98955a.getPanelTopMargin();
    }

    public final Function0<Integer> getPausedPageAnchorLocationY() {
        return this.f98955a.f98918r;
    }

    public final Flow<Integer> getPausedPageBaseHeightPxFlow() {
        return this.f98955a.f98923w;
    }

    public final Function0<Boolean> getPausedPageTopReached() {
        return this.f98955a.f98919s;
    }

    public final Flow<Integer> getPausedPageVisibleHeightPxFlow() {
        return this.f98955a.f98922v;
    }

    public final CoroutineScope getScope() {
        return this.f98955a.f98902a;
    }

    public final Function0<Integer> getUnderViewHeight() {
        return this.f98955a.f98921u;
    }

    public final Function0<Integer> getUnderViewLocationY() {
        return this.f98955a.f98920t;
    }

    public final WindowSizeClass getWindowSize() {
        return this.f98955a.f98910j.b();
    }

    public final Flow<WindowSizeClass> getWindowSizeFlow() {
        return this.f98955a.f98910j.f102939c;
    }

    public final boolean isNested() {
        return this.f98955a.isNested();
    }

    public final boolean isNewDetailPage() {
        return this.f98955a.isNewDetailPage();
    }

    public final boolean isVertical() {
        return this.f98955a.isVertical();
    }

    public final boolean isVideoPlaying() {
        return this.f98955a.isVideoPlaying();
    }

    public final void observeControllerTypeChanged(ControlContainerObserver controlContainerObserver) {
        this.f98955a.f98917q = controlContainerObserver;
    }

    public final void observePlayerSizeChanged(IWrapperPanelHelper.OnPlayerSizeChangeListener onPlayerSizeChangeListener) {
        this.f98955a.f98913m = onPlayerSizeChangeListener;
    }

    public final void observePlayerState(PlayerStateObserver playerStateObserver) {
        this.f98955a.f98916p = playerStateObserver;
    }

    public final void pauseVideo() {
        this.f98955a.pauseVideo();
    }

    public final void removeAppBarOnOffsetChangedListener(AppBarLayout.OnOffsetChangedListener onOffsetChangedListener) {
        this.f98955a.f98914n = null;
    }

    public final void removeControllerTypeChanged(ControlContainerObserver controlContainerObserver) {
        this.f98955a.f98917q = null;
    }

    public final void removePlayerSizeChanged(IWrapperPanelHelper.OnPlayerSizeChangeListener onPlayerSizeChangeListener) {
        this.f98955a.f98913m = null;
    }

    public final void removePlayerState(PlayerStateObserver playerStateObserver) {
        this.f98955a.f98916p = null;
    }

    public final void resumeVideo() {
        this.f98955a.resumeVideo();
    }
}
