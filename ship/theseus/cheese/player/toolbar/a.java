package com.bilibili.ship.theseus.cheese.player.toolbar;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.cheese.player.play.CheesePlayRepository;
import com.bilibili.ship.theseus.united.page.toolbar.actionview.miniplayer.ToolbarMiniPlayerRepository;
import com.bilibili.ship.theseus.united.page.toolbar.actionview.projection.ToolbarCastScreenRepository;
import javax.inject.Inject;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/toolbar/a.class */
@StabilityInferred(parameters = 1)
public final class a {
    @Inject
    public a(@NotNull CoroutineScope coroutineScope, @NotNull ToolbarCastScreenRepository toolbarCastScreenRepository, @NotNull ToolbarMiniPlayerRepository toolbarMiniPlayerRepository, @NotNull CheesePlayRepository cheesePlayRepository) {
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new CheeseToolbarActionsListRepository$1(toolbarCastScreenRepository, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new CheeseToolbarActionsListRepository$2(cheesePlayRepository, toolbarMiniPlayerRepository, null), 3, (Object) null);
    }
}
