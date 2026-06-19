package com.bilibili.mini.player.common.panel.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.bilibili.magicasakura.widgets.TintProgressBar;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.video.bilicardplayer.player.BiliCardPlayerScene;
import vh0.AbstractC8809a;
import vh0.InterfaceC8810b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mini/player/common/panel/widget/MiniPlayerProgress.class */
public final class MiniPlayerProgress extends TintProgressBar implements InterfaceC8810b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public AbstractC8809a f66085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f66086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final a f66087e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mini/player/common/panel/widget/MiniPlayerProgress$a.class */
    public final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MiniPlayerProgress f66088a;

        public a(MiniPlayerProgress miniPlayerProgress) {
            this.f66088a = miniPlayerProgress;
        }

        @Override // java.lang.Runnable
        public final void run() {
            MiniPlayerProgress miniPlayerProgress = this.f66088a;
            if (miniPlayerProgress.f66086d) {
                AbstractC8809a panel = miniPlayerProgress.getPanel();
                BiliCardPlayerScene.CardPlayTask.Token token = panel != null ? panel.f128251b : null;
                if (token != null) {
                    int duration = (int) token.getDuration();
                    int currentPosition = (int) token.getCurrentPosition();
                    if (currentPosition >= 0 && duration > 0) {
                        int i7 = currentPosition;
                        if (currentPosition > duration) {
                            i7 = duration;
                        }
                        miniPlayerProgress.setMax(duration);
                        miniPlayerProgress.setProgress(i7);
                        miniPlayerProgress.setSecondaryProgress((int) token.getBufferedPosition());
                    }
                }
                this.f66088a.postDelayed(this, 1000L);
            }
        }
    }

    @JvmOverloads
    public MiniPlayerProgress(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @JvmOverloads
    public MiniPlayerProgress(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public MiniPlayerProgress(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        this.f66087e = new a(this);
    }

    @Override // vh0.InterfaceC8810b
    @Nullable
    public AbstractC8809a getPanel() {
        return this.f66085c;
    }

    @Override // vh0.InterfaceC8810b
    public final void onPanelAttach() {
        this.f66086d = true;
        this.f66087e.run();
    }

    @Override // vh0.InterfaceC8810b
    public final void onPanelDetach() {
        this.f66086d = false;
        setProgress(0);
        setMax(Integer.MAX_VALUE);
        removeCallbacks(this.f66087e);
    }

    @Override // vh0.InterfaceC8810b
    public void setPanel(@Nullable AbstractC8809a abstractC8809a) {
        this.f66085c = abstractC8809a;
    }
}
