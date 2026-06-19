package com.bilibili.playerbizcommonv2.widget.base;

import android.content.Context;
import androidx.annotation.CallSuper;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.ControlContainerType;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.collection.Collections;
import tv.danmaku.biliplayerv2.service.ControlContainerObserver;
import tv.danmaku.biliplayerv2.service.IPlayerServiceManager;
import tv.danmaku.biliplayerv2.service.PlayerServiceManager;
import tv.danmaku.biliplayerv2.service.WindowInset;
import tv.danmaku.biliplayerv2.widget.AbsFunctionWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/base/j.class */
@StabilityInferred(parameters = 0)
public abstract class j extends AbsFunctionWidget {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PlayerContainer f82407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public WindowInset f82408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final PlayerServiceManager.Client<com.bilibili.playerbizcommonv2.service.g> f82409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final b f82410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final a f82411e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/base/j$a.class */
    public static final class a implements ControlContainerObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f82412a;

        public a(j jVar) {
            this.f82412a = jVar;
        }

        public final void onControlContainerChanged(ControlContainerType controlContainerType, ScreenModeType screenModeType) {
            this.f82412a.onControlContainerChanged(controlContainerType, screenModeType);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/base/j$b.class */
    public static final class b {
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.bilibili.playerbizcommonv2.widget.base.j$b, java.lang.Object] */
    public j(@NotNull Context context) {
        super(context);
        ScreenModeType screenModeType = ScreenModeType.THUMB;
        this.f82409c = new PlayerServiceManager.Client<>();
        this.f82410d = new Object();
        this.f82411e = new a(this);
    }

    @CallSuper
    public final void bindPlayerContainer(@NotNull PlayerContainer playerContainer) {
        this.f82407a = playerContainer;
    }

    public final void g() {
        int i7;
        int i8;
        WindowInset windowInset = this.f82408b;
        tv.danmaku.biliplayerv2.service.f functionInsetConfig = getFunctionInsetConfig();
        int i9 = 0;
        if (functionInsetConfig == null || !functionInsetConfig.a || windowInset == null) {
            getView().setPadding(0, 0, 0, 0);
            return;
        }
        int topPadding = windowInset.getTopPadding() > 0 ? windowInset.getTopPadding() > functionInsetConfig.c ? windowInset.getTopPadding() - functionInsetConfig.c : windowInset.getTopPadding() : 0;
        ScreenModeType screenModeType = ScreenModeType.THUMB;
        int leftPadding = windowInset.getLeftPadding();
        int i10 = functionInsetConfig.b;
        if (leftPadding > 0) {
            i7 = leftPadding;
            if (leftPadding > i10) {
                i7 = leftPadding - i10;
            }
        } else {
            i7 = 0;
        }
        int rightPadding = windowInset.getRightPadding();
        int i11 = functionInsetConfig.d;
        if (rightPadding > 0) {
            i8 = rightPadding;
            if (rightPadding > i11) {
                i8 = rightPadding - i11;
            }
        } else {
            i8 = 0;
        }
        int bottomPadding = windowInset.getBottomPadding();
        int i12 = functionInsetConfig.e;
        if (bottomPadding > 0) {
            i9 = bottomPadding > i12 ? bottomPadding - i12 : bottomPadding;
        }
        getView().setPadding(i7, topPadding, i8, i9);
    }

    @NotNull
    public final PlayerContainer h() {
        PlayerContainer playerContainer = this.f82407a;
        if (playerContainer != null) {
            return playerContainer;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
        return null;
    }

    @CallSuper
    public void onControlContainerChanged(@NotNull ControlContainerType controlContainerType, @NotNull ScreenModeType screenModeType) {
        g();
    }

    @CallSuper
    public void onWidgetDismiss() {
        super.onWidgetDismiss();
        IPlayerServiceManager playerServiceManager = h().getPlayerServiceManager();
        PlayerServiceManager.ServiceDescriptor serviceDescriptorObtain = PlayerServiceManager.ServiceDescriptor.Companion.obtain(com.bilibili.playerbizcommonv2.service.g.class);
        PlayerServiceManager.Client<com.bilibili.playerbizcommonv2.service.g> client = this.f82409c;
        playerServiceManager.unbindService(serviceDescriptorObtain, client);
        h().getControlContainerService().unregisterState(this.f82411e);
        com.bilibili.playerbizcommonv2.service.g gVar = (com.bilibili.playerbizcommonv2.service.g) client.getService();
        if (gVar != null) {
            gVar.f81874a.remove(this.f82410d);
        }
    }

    @CallSuper
    public void onWidgetShow() {
        super.onWidgetShow();
        IPlayerServiceManager playerServiceManager = h().getPlayerServiceManager();
        PlayerServiceManager.ServiceDescriptor serviceDescriptorObtain = PlayerServiceManager.ServiceDescriptor.Companion.obtain(com.bilibili.playerbizcommonv2.service.g.class);
        PlayerServiceManager.Client<com.bilibili.playerbizcommonv2.service.g> client = this.f82409c;
        playerServiceManager.bindService(serviceDescriptorObtain, client);
        h().getControlContainerService().registerState(this.f82411e);
        com.bilibili.playerbizcommonv2.service.g gVar = (com.bilibili.playerbizcommonv2.service.g) client.getService();
        if (gVar != null) {
            Collections.SafeIteratorList<Object> safeIteratorList = gVar.f81874a;
            b bVar = this.f82410d;
            if (!safeIteratorList.contains(bVar)) {
                safeIteratorList.add(bVar);
            }
        }
        h().getControlContainerService().getScreenModeType();
        g();
    }

    public final void onWindowInsetChanged(@NotNull WindowInset windowInset) {
        this.f82408b = windowInset;
        g();
    }
}
