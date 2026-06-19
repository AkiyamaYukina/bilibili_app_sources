package com.bilibili.ship.theseus.playlist.di.page;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.background.PageBackgroundPlayRepository;
import com.bilibili.ship.theseus.united.page.background.PageBackgroundPreloadService;
import com.bilibili.ship.theseus.united.player.toast.TheseusToastContainerService;
import javax.inject.Inject;
import kotlin.Lazy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/page/T.class */
@StabilityInferred(parameters = 0)
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.playlist.di.driver.b f95698a;

    static {
        boolean z6 = TheseusToastContainerService.f104792m;
        Lazy<Long> lazy = PageBackgroundPreloadService.f99015l;
        Lazy<Boolean> lazy2 = PageBackgroundPlayRepository.f98991v;
    }

    @Inject
    public T(@NotNull com.bilibili.ship.theseus.playlist.di.driver.b bVar) {
        this.f95698a = bVar;
    }
}
