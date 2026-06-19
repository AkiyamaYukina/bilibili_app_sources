package com.bilibili.lib.projection.selector;

import Te0.InterfaceC2894a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bilibili.lib.projection.ProjectionClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/selector/ProjectionSelectorContainer.class */
public interface ProjectionSelectorContainer {
    @Nullable
    ProjectionClient getProjectionClient();

    @Nullable
    View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @NotNull InterfaceC2894a interfaceC2894a);

    void onDismiss();

    void onShow();
}
