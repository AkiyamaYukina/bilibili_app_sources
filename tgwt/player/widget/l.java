package com.bilibili.tgwt.player.widget;

import Aq0.F;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformSeason;
import com.bilibili.bangumi.logic.page.detail.service.BangumiPlayerContainerService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.NewSeasonService;
import com.bilibili.bangumi.module.chatroom.ChatRoomInfo;
import com.bilibili.playerbizcommon.gesture.IGestureService;
import com.bilibili.tgwt.chatroom.ChatRoomManagerService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.panel.IPlayerLayer;
import tv.danmaku.biliplayerv2.service.B;
import tv.danmaku.biliplayerv2.service.WindowInset;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/widget/l.class */
@StabilityInferred(parameters = 0)
public final class l extends FrameLayout implements IPlayerLayer<View>, View.OnClickListener, B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ChatRoomManagerService f111837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final BangumiPlayerContainerService f111838b;

    public l(@NotNull Context context, @NotNull ChatRoomManagerService chatRoomManagerService, @NotNull NewSeasonService newSeasonService, @NotNull BangumiPlayerContainerService bangumiPlayerContainerService) {
        ChatRoomInfo chatRoomInfo;
        super(context);
        this.f111837a = chatRoomManagerService;
        this.f111838b = bangumiPlayerContainerService;
        TextView textView = (TextView) LayoutInflater.from(context).inflate(2131500533, (ViewGroup) this, true).findViewById(2131314958);
        BangumiUniformSeason season = newSeasonService.getSeason();
        textView.setText((season == null || (chatRoomInfo = season.E) == null || chatRoomInfo.u() != 0) ? context.getString(2131836315) : context.getString(2131836314));
        setOnClickListener(this);
    }

    public final void a() {
        if (this.f111837a.f110907U) {
            return;
        }
        this.f111838b.getPlayerServiceController().v(this);
        IGestureService iGestureService = this.f111838b.getPlayerServiceController().a.j;
        IPlayerLayer<F> gestureLayer = iGestureService != null ? iGestureService.getGestureLayer() : null;
        if (gestureLayer != null) {
            this.f111838b.getPlayerServiceController().b.addPlayerLayer(gestureLayer, this);
        }
        IGestureService iGestureService2 = this.f111838b.getPlayerServiceController().a.j;
        if (iGestureService2 != null) {
            iGestureService2.forbiddenInnerTouchEvent(true);
        }
        IGestureService iGestureService3 = this.f111838b.getPlayerServiceController().a.j;
        if (iGestureService3 != null) {
            iGestureService3.forbiddenResizeGesture(true);
        }
        this.f111837a.f110907U = true;
    }

    public final void b() {
        this.f111838b.getPlayerServiceController().v(this);
        IGestureService iGestureService = this.f111838b.getPlayerServiceController().a.j;
        if (iGestureService != null) {
            iGestureService.forbiddenInnerTouchEvent(false);
        }
        IGestureService iGestureService2 = this.f111838b.getPlayerServiceController().a.j;
        if (iGestureService2 != null) {
            iGestureService2.forbiddenResizeGesture(false);
        }
        this.f111837a.f110907U = false;
    }

    @NotNull
    public View getView() {
        return this;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        this.f111838b.getPlayerServiceController().p();
        if (this.f111838b.getPlayerServiceController().p()) {
            this.f111838b.getPlayerServiceController().n();
        } else {
            this.f111838b.getPlayerServiceController().c().show();
        }
    }

    public final void onWindowInsetChanged(@NotNull WindowInset windowInset) {
        setPadding(windowInset.getLeftPadding(), windowInset.getTopPadding(), windowInset.getRightPadding(), windowInset.getBottomPadding());
    }
}
