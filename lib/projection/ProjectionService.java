package com.bilibili.lib.projection;

import Se0.a;
import android.app.Application;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/ProjectionService.class */
public interface ProjectionService {
    long getActiveProjectionLiveRoomID();

    @NotNull
    Application getApp();

    boolean getInForegroundProjection();

    boolean getInGlobalLinkMode();

    boolean getSavedDanmakuShow();

    float getSavedProjectionSpeed();

    long getSavedSeasonId();

    boolean hasBiliProjectionDevice();

    boolean hasProjectionDevice();

    void hideFloatView();

    void hideProjectionControlDialog(@NotNull ComponentActivity componentActivity);

    void init(@NotNull Application application);

    void maintainSeekBar();

    @NotNull
    ProjectionClient newClient(@NotNull ProjectionClientConfig projectionClientConfig);

    void registerGlobalItemResolverFactory(@NotNull a.InterfaceC0117a interfaceC0117a);

    void registerStandardItemResolver(int i7, @NotNull Se0.a<StandardProjectionItem> aVar);

    void setSavedDanmakuShow(boolean z6);

    void setSavedSeasonId(long j7);

    void showFloatView(@NotNull ViewGroup viewGroup);

    void showProjectionControlDialog(@Nullable Integer num, @NotNull ComponentActivity componentActivity);
}
