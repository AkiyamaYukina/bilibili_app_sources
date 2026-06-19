package com.bilibili.playerbizcommon.widget.control;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bilibili.magicasakura.widgets.TintImageView;
import kotlin.Lazy;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.PlayerStateObserver;
import tv.danmaku.biliplayerv2.service.report.statistics.StatisticsService;
import tv.danmaku.biliplayerv2.widget.IControlWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/PlayerPlayPauseWidget.class */
public class PlayerPlayPauseWidget extends TintImageView implements IControlWidget, View.OnClickListener, PlayerStateObserver {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public PlayerContainer f80509e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public IPlayerCoreService f80510f;

    public PlayerPlayPauseWidget(@NotNull Context context) {
        super(context);
        q();
    }

    public PlayerPlayPauseWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        q();
    }

    public PlayerPlayPauseWidget(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        q();
    }

    private final void setWidgetState(boolean z6) {
        if (z6) {
            setImageLevel(1);
            AX.g.a(this, "暂停");
        } else {
            setImageLevel(0);
            AX.g.a(this, "播放");
        }
    }

    public void bindPlayerContainer(@NotNull PlayerContainer playerContainer) {
        this.f80509e = playerContainer;
    }

    @Nullable
    public final PlayerContainer getMPlayerContainer() {
        return this.f80509e;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View view) {
        IPlayerCoreService iPlayerCoreService = this.f80510f;
        if (iPlayerCoreService == null) {
            return;
        }
        if (iPlayerCoreService.getState() != 4) {
            this.f80510f.resume();
            BLog.i("BiliPlayerV2", "[player]video start");
            return;
        }
        PlayerContainer playerContainer = this.f80509e;
        if (playerContainer != null) {
            Lazy lazy = StatisticsService.t;
            StatisticsService.a.a(playerContainer, "1");
        }
        this.f80510f.pause();
        BLog.i("BiliPlayerV2", "[player]video pause");
    }

    public void onPlayerStateChanged(int i7) {
        if (i7 == 4) {
            setWidgetState(true);
        } else {
            setWidgetState(false);
        }
    }

    public void onWidgetActive() {
        PlayerContainer playerContainer = this.f80509e;
        if (playerContainer != null) {
            setOnClickListener(this);
            IPlayerCoreService playerCoreService = playerContainer.getPlayerCoreService();
            this.f80510f = playerCoreService;
            if (playerCoreService != null) {
                playerCoreService.registerState(this, new int[]{4, 5, 6, 8});
            }
            IPlayerCoreService iPlayerCoreService = this.f80510f;
            if (iPlayerCoreService == null || iPlayerCoreService.getState() != 4) {
                setWidgetState(false);
            } else {
                setWidgetState(true);
            }
        }
    }

    public void onWidgetInactive() {
        if (this.f80509e != null) {
            setOnClickListener(null);
            IPlayerCoreService iPlayerCoreService = this.f80510f;
            if (iPlayerCoreService != null) {
                iPlayerCoreService.unregisterState(this);
            }
        }
    }

    public final void q() {
        setImageResource(2131232475);
    }

    public final void setMPlayerContainer(@Nullable PlayerContainer playerContainer) {
        this.f80509e = playerContainer;
    }
}
