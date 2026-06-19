package com.bilibili.lib.projection.internal.panel.fullscreen;

import android.view.View;
import le0.InterfaceC7845m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.lib.projection.internal.panel.fullscreen.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/panel/fullscreen/a.class */
public interface InterfaceC5317a {
    @Nullable
    InterfaceC7845m M6();

    void Td(@NotNull ProjectionDialogFragment projectionDialogFragment);

    @Nullable
    default View Y4() {
        return null;
    }

    void showPanel(@NotNull String str);
}
