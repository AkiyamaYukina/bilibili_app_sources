package com.bilibili.ship.theseus.united.page.videopiece;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import javax.inject.Inject;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videopiece/a.class */
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PlayViewUniteReply f103679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.player.mediaplay.c f103680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Er0.a f103681c;

    @Inject
    public a(@NotNull PlayViewUniteReply playViewUniteReply, @NotNull com.bilibili.ship.theseus.united.player.mediaplay.c cVar, @NotNull Er0.a aVar, @NotNull CoroutineScope coroutineScope, @NotNull b bVar) {
        this.f103679a = playViewUniteReply;
        this.f103680b = cVar;
        this.f103681c = aVar;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new MasterPieceSectionService$1(this, bVar, null), 3, (Object) null);
    }
}
