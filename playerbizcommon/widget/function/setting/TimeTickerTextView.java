package com.bilibili.playerbizcommon.widget.function.setting;

import android.content.Context;
import android.util.AttributeSet;
import com.bilibili.playerbizcommon.view.FixedDrawableTextView;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.service.PlayerServiceManager;
import tv.danmaku.biliplayerv2.service.business.ShutOffTimingService;
import tv.danmaku.biliplayerv2.utils.TimeFormater;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/function/setting/TimeTickerTextView.class */
public final class TimeTickerTextView extends FixedDrawableTextView {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f80706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public PlayerContainer f80707e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f80708f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f80709g;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f80710i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final PlayerServiceManager.Client<ShutOffTimingService> f80711j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final a f80712k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public zj.a f80713l;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/function/setting/TimeTickerTextView$a.class */
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TimeTickerTextView f80714a;

        public a(TimeTickerTextView timeTickerTextView) {
            this.f80714a = timeTickerTextView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            TimeTickerTextView timeTickerTextView = this.f80714a;
            if (timeTickerTextView.f80708f) {
                ShutOffTimingService service = timeTickerTextView.f80711j.getService();
                long leftTime = service != null ? service.getLeftTime() : 0L;
                TimeTickerTextView timeTickerTextView2 = this.f80714a;
                if (!timeTickerTextView2.h || timeTickerTextView2.f80709g || leftTime <= 0) {
                    timeTickerTextView2.h = false;
                    timeTickerTextView2.setText(timeTickerTextView2.f80706d);
                    TimeTickerTextView timeTickerTextView3 = this.f80714a;
                    timeTickerTextView3.setContentDescription(timeTickerTextView3.f80706d);
                    return;
                }
                timeTickerTextView2.setText(TimeFormater.INSTANCE.formatTime(leftTime, true, true));
                TimeTickerTextView timeTickerTextView4 = this.f80714a;
                timeTickerTextView4.setContentDescription(timeTickerTextView4.f80706d + ((Object) timeTickerTextView4.getText()));
                this.f80714a.postDelayed(this, 1000L);
            }
        }
    }

    public TimeTickerTextView(@NotNull Context context) {
        super(context);
        this.f80706d = getContext().getString(2131847161);
        this.f80711j = new PlayerServiceManager.Client<>();
        this.f80712k = new a(this);
    }

    public TimeTickerTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f80706d = getContext().getString(2131847161);
        this.f80711j = new PlayerServiceManager.Client<>();
        this.f80712k = new a(this);
    }

    public final void J() {
        ShutOffTimingService service;
        if (this.f80710i) {
            return;
        }
        PlayerContainer playerContainer = this.f80707e;
        if (playerContainer != null) {
            playerContainer.getPlayerServiceManager().bindService(PlayerServiceManager.ServiceDescriptor.Companion.obtain(ShutOffTimingService.class), this.f80711j);
        }
        zj.a aVar = this.f80713l;
        if (aVar != null && (service = this.f80711j.getService()) != null) {
            service.registerTimingCallback(aVar);
        }
        this.f80710i = true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // com.bilibili.magicasakura.widgets.TintTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() throws NoWhenBranchMatchedException {
        super.onAttachedToWindow();
        this.f80708f = true;
        if (this.h) {
            J();
            post(this.f80712k);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public final void onDetachedFromWindow() {
        ShutOffTimingService service;
        zj.a aVar = this.f80713l;
        if (aVar != null && (service = this.f80711j.getService()) != null) {
            service.unregisterTimingCallback(aVar);
        }
        PlayerContainer playerContainer = this.f80707e;
        if (playerContainer != null) {
            playerContainer.getPlayerServiceManager().unbindService(PlayerServiceManager.ServiceDescriptor.Companion.obtain(ShutOffTimingService.class), this.f80711j);
        }
        this.f80710i = false;
        removeCallbacks(this.f80712k);
        this.f80708f = false;
        super.onDetachedFromWindow();
    }

    public final void setEditMode(boolean z6) {
        this.f80709g = z6;
        removeCallbacks(this.f80712k);
        post(this.f80712k);
    }
}
