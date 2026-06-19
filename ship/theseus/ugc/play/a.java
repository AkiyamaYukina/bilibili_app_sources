package com.bilibili.ship.theseus.ugc.play;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.player.history.IMediaHistoryKeyParams;
import com.bilibili.ship.theseus.united.player.history.b;
import cq0.C6748a;
import java.util.Map;
import javax.inject.Inject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.IPlayDirector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/a.class */
@StabilityInferred(parameters = 0)
public final class a implements b.InterfaceC1167b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final IPlayDirector f98098a;

    @Inject
    public a(@NotNull IPlayDirector iPlayDirector) {
        this.f98098a = iPlayDirector;
    }

    @Override // com.bilibili.ship.theseus.united.player.history.b.InterfaceC1167b
    @NotNull
    public final IMediaHistoryKeyParams a(long j7) {
        return new C6748a(j7);
    }

    @Override // com.bilibili.ship.theseus.united.player.history.b.InterfaceC1167b
    @Nullable
    public final Map<String, String> b() {
        return null;
    }

    @Override // com.bilibili.ship.theseus.united.player.history.b.InterfaceC1167b
    public final int getType() {
        return 3;
    }

    @Override // com.bilibili.ship.theseus.united.player.history.b.InterfaceC1167b
    public final int itemCount() {
        return this.f98098a.itemCount();
    }
}
