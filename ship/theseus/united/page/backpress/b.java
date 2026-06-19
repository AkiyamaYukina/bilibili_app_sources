package com.bilibili.ship.theseus.united.page.backpress;

import SI.e;
import androidx.compose.runtime.internal.StabilityInferred;
import javax.inject.Inject;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.PlayerContainer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/backpress/b.class */
@StabilityInferred(parameters = 1)
public final class b {
    @Inject
    public b(@NotNull PlayerContainer playerContainer, @NotNull BackActionRepository backActionRepository) {
        backActionRepository.f99047b.add(new e<>(playerContainer, 4));
    }
}
