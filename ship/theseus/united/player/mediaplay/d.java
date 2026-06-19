package com.bilibili.ship.theseus.united.player.mediaplay;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.playershared.Fragment;
import com.bilibili.ship.theseus.united.player.mediaplay.f;
import dagger.Module;
import dagger.Provides;
import ev0.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/d.class */
@StabilityInferred(parameters = 0)
@Module
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final j.a f104513a;

    public d(@NotNull j.a aVar) {
        this.f104513a = aVar;
    }

    @Provides
    @Nullable
    public final Fragment a() {
        f fVar = this.f104513a.f117660d;
        Fragment fragment = null;
        f.c cVar = fVar instanceof f.c ? (f.c) fVar : null;
        if (cVar != null) {
            fragment = cVar.f104520e;
        }
        return fragment;
    }
}
