package com.bilibili.ship.theseus.united.player.controlcontainer;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.ControlContainerType;
import tv.danmaku.biliplayerv2.widget.IControlWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/controlcontainer/d.class */
public interface d {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/controlcontainer/d$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Context f104444a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final ControlContainerType f104445b;

        public a(@NotNull Context context, @NotNull ControlContainerType controlContainerType) {
            this.f104444a = context;
            this.f104445b = controlContainerType;
        }
    }

    @NotNull
    IControlWidget a(@NotNull a aVar);
}
