package com.bilibili.playerbizcommon.features.network;

import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.playerbizcommon.features.network.PlayerNetworkFunctionWidget;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.IPlayerService;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;
import tv.danmaku.biliplayerv2.widget.AbsFunctionWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/network/IPlayerNetworkService.class */
public interface IPlayerNetworkService extends IPlayerService {

    @NotNull
    public static final Companion Companion = Companion.f79843a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/network/IPlayerNetworkService$Companion.class */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Companion f79843a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f79844b;

        static {
            String str = (String) ConfigManager.Companion.config().get("videodetail.show_cellular_panel_interval", "168");
            f79844b = Integer.parseInt(str != null ? str : "168");
        }

        public final boolean isInNetworkPanelAlertInterval() {
            return Math.abs(System.currentTimeMillis() - IPlayerSettingService.Companion.getLong("key_last_show_network_dialog_time", 0L)) < ((long) (f79844b * 3600000));
        }
    }

    void allowToContinuePlay();

    default void allowToContinuePlayOneTime() {
    }

    long getCurrentMediaSize();

    @Nullable
    INetworkAlertHandler getNetworkAlertHandler();

    @Nullable
    VideoEnvironment getVideoEnvironment();

    default void goToFreeData() {
    }

    boolean isNetworkPanelShowed();

    void refreshFreeDataPanel(@NotNull Map<String, PlayerNetworkFunctionWidget.PanelCustomData> map);

    default void refreshOnFreeDataActive() {
    }

    void registerVideoEnvironmentObserver(@NotNull VideoEnvironmentObserver videoEnvironmentObserver);

    void replayAfterFreeDataActive();

    void setEnableResumePlay(boolean z6);

    void setNetworkAlertHandler(@Nullable INetworkAlertHandler iNetworkAlertHandler);

    void setNetworkStrategy(int i7);

    default void setNetworkToastHandler(@Nullable INetworkToastHandler iNetworkToastHandler) {
    }

    void setNetworkWidgetClass(@NotNull Class<? extends AbsFunctionWidget> cls);

    void setShowAlertMode(@NotNull ShowAlertMode showAlertMode);

    void showToastForNetWorkState(int i7);

    void unregisterVideoEnvironmentObserver(@NotNull VideoEnvironmentObserver videoEnvironmentObserver);
}
