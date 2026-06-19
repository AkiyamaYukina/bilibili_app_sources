package com.bilibili.ship.theseus.miniplayer.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vh0.AbstractC8809a;
import vh0.InterfaceC8810b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/miniplayer/ui/widget/MiniPlayerOutsideControl.class */
public final class MiniPlayerOutsideControl extends FrameLayout implements InterfaceC8810b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public AbstractC8809a f91191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final AppCompatImageView f91192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final AppCompatImageView f91193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MiniPlayerPlayPauseWidget f91194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final AppCompatImageView f91195e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final AppCompatImageView f91196f;

    @JvmOverloads
    public MiniPlayerOutsideControl(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public MiniPlayerOutsideControl(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public MiniPlayerOutsideControl(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        View.inflate(context, 2131500362, this);
        this.f91192b = (AppCompatImageView) findViewById(2131308562);
        this.f91193c = (AppCompatImageView) findViewById(2131308565);
        this.f91194d = (MiniPlayerPlayPauseWidget) findViewById(2131308564);
        this.f91195e = (AppCompatImageView) findViewById(2131310295);
        this.f91196f = (AppCompatImageView) findViewById(2131301407);
    }

    @NotNull
    public final AppCompatImageView getCloseBtn$theseus_miniplayer_release() {
        return this.f91192b;
    }

    @NotNull
    public final AppCompatImageView getFastForwardBtn$theseus_miniplayer_release() {
        return this.f91196f;
    }

    @Override // vh0.InterfaceC8810b
    @Nullable
    public AbstractC8809a getPanel() {
        return this.f91191a;
    }

    @NotNull
    public final MiniPlayerPlayPauseWidget getPlayPauseBtn$theseus_miniplayer_release() {
        return this.f91194d;
    }

    @NotNull
    public final AppCompatImageView getResumeBtn$theseus_miniplayer_release() {
        return this.f91193c;
    }

    @NotNull
    public final AppCompatImageView getRewindBtn$theseus_miniplayer_release() {
        return this.f91195e;
    }

    public final void setBottomBarVisible(boolean z6) {
        this.f91194d.setVisibility(!z6 ? 4 : 0);
        this.f91195e.setVisibility(!z6 ? 4 : 0);
        AppCompatImageView appCompatImageView = this.f91196f;
        int i7 = 0;
        if (!z6) {
            i7 = 4;
        }
        appCompatImageView.setVisibility(i7);
    }

    @Override // vh0.InterfaceC8810b
    public void setPanel(@Nullable AbstractC8809a abstractC8809a) {
        this.f91191a = abstractC8809a;
    }
}
