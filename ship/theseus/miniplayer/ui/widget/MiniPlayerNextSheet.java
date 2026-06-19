package com.bilibili.ship.theseus.miniplayer.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/miniplayer/ui/widget/MiniPlayerNextSheet.class */
public final class MiniPlayerNextSheet extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final AppCompatTextView f91188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final AppCompatTextView f91189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final AppCompatImageView f91190c;

    @JvmOverloads
    public MiniPlayerNextSheet(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public MiniPlayerNextSheet(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public MiniPlayerNextSheet(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        View.inflate(context, 2131500363, this);
        this.f91188a = (AppCompatTextView) findViewById(2131309133);
        AppCompatTextView appCompatTextView = (AppCompatTextView) findViewById(2131307880);
        this.f91189b = appCompatTextView;
        appCompatTextView.setSelected(true);
        this.f91190c = (AppCompatImageView) findViewById(2131307877);
    }

    @NotNull
    public final AppCompatImageView getNextButton$theseus_miniplayer_release() {
        return this.f91190c;
    }

    @NotNull
    public final AppCompatTextView getNextTipsTextView$theseus_miniplayer_release() {
        return this.f91188a;
    }

    @NotNull
    public final AppCompatTextView getNextTitleTextView$theseus_miniplayer_release() {
        return this.f91189b;
    }
}
