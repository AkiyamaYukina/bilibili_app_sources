package com.bilibili.ship.theseus.united.player.oldway.playercontainer;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.player.tangram.basic.CompoundPlayStateProviderKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.PlayerSharingBundle;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/playercontainer/u.class */
@StabilityInferred(parameters = 0)
public final class u implements ei1.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.bilibili.ship.theseus.keel.player.h f104776a;

    @NotNull
    public final Flow<Boolean> X() {
        com.bilibili.ship.theseus.keel.player.h hVar = this.f104776a;
        com.bilibili.ship.theseus.keel.player.h hVar2 = hVar;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
            hVar2 = null;
        }
        return CompoundPlayStateProviderKt.b(hVar2);
    }

    public final void f0(@NotNull com.mall.videodetail.vd.mall.player.network.g gVar) {
        com.bilibili.ship.theseus.keel.player.h hVar = this.f104776a;
        com.bilibili.ship.theseus.keel.player.h hVar2 = hVar;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
            hVar2 = null;
        }
        hVar2.h(gVar);
    }

    public final void i(@NotNull Object obj) {
        com.bilibili.ship.theseus.keel.player.h hVar = this.f104776a;
        com.bilibili.ship.theseus.keel.player.h hVar2 = hVar;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
            hVar2 = null;
        }
        hVar2.i(obj);
    }

    public final void onStart(@Nullable PlayerSharingBundle playerSharingBundle) {
    }

    public final void onStop() {
    }

    public final void pause() {
        BLog.i("SuppressiblePlayerImpl-pause", "[theseus-united-SuppressiblePlayerImpl-pause] suppress call player pause");
        com.bilibili.ship.theseus.keel.player.h hVar = this.f104776a;
        com.bilibili.ship.theseus.keel.player.h hVar2 = hVar;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
            hVar2 = null;
        }
        hVar2.pause();
    }

    public final void resume() {
        com.bilibili.ship.theseus.keel.player.h hVar = this.f104776a;
        com.bilibili.ship.theseus.keel.player.h hVar2 = hVar;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
            hVar2 = null;
        }
        hVar2.p();
    }
}
