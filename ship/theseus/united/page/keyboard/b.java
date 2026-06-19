package com.bilibili.ship.theseus.united.page.keyboard;

import Aq0.C1416d;
import Aq0.RunnableC1415c;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import cf.p;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.playerbizcommon.gesture.TYPE;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.IPlayerContainer;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.PlayerSharingBundle;
import tv.danmaku.biliplayerv2.service.IPlayerService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/keyboard/b.class */
@StabilityInferred(parameters = 0)
public final class b implements IPlayerService, View.OnKeyListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PlayerContainer f102014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final C1416d f102015b = new C1416d();

    public final void bindPlayerContainer(@NotNull PlayerContainer playerContainer) {
        this.f102014a = playerContainer;
        C1416d c1416d = this.f102015b;
        PlayerContainer playerContainer2 = playerContainer;
        if (playerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            playerContainer2 = null;
        }
        c1416d.f493a = playerContainer2;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(@Nullable View view, int i7, @Nullable KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getAction() != 0) {
            return false;
        }
        if (i7 == 19) {
            C1416d c1416d = this.f102015b;
            TYPE type = TYPE.VOLUME;
            c1416d.b(type);
            this.f102015b.a(type, -0.05f);
            RunnableC1415c runnableC1415c = this.f102015b.f498f;
            HandlerThreads.remove(0, runnableC1415c);
            HandlerThreads.postDelayed(0, runnableC1415c, 1000L);
            p.b("type", "5", "player.player.peripheral-kb.hotkey.click", false);
            return true;
        }
        if (i7 != 20) {
            return false;
        }
        C1416d c1416d2 = this.f102015b;
        TYPE type2 = TYPE.VOLUME;
        c1416d2.b(type2);
        this.f102015b.a(type2, 0.05f);
        RunnableC1415c runnableC1415c2 = this.f102015b.f498f;
        HandlerThreads.remove(0, runnableC1415c2);
        HandlerThreads.postDelayed(0, runnableC1415c2, 1000L);
        p.b("type", "6", "player.player.peripheral-kb.hotkey.click", false);
        return true;
    }

    public final void onStart(@Nullable PlayerSharingBundle playerSharingBundle) {
        IPlayerContainer iPlayerContainer = this.f102014a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.addOnKeyListener(this);
    }

    public final void onStop() {
        IPlayerContainer iPlayerContainer = this.f102014a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.removeOnKeyListener(this);
    }
}
