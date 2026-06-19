package com.bilibili.tgwt.player.processor;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bilibili.bangumi.logic.page.detail.service.BangumiPlayerContainerService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/processor/h.class */
public final class h implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f111656a;

    public h(k kVar) {
        this.f111656a = kVar;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        k kVar = this.f111656a;
        BangumiPlayerContainerService bangumiPlayerContainerService = kVar.f111661c;
        bangumiPlayerContainerService.getPlayerServiceController().a.c().removeOnWidgetStateChangeListener(kVar.f111666i);
        bangumiPlayerContainerService.getPlayerServiceController().y(kVar.f111667j);
    }
}
