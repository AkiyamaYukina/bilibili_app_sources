package com.bilibili.pegasus.widgets.inline;

import Yp0.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.widget.play.CardFragmentPlayerContainerLayout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/widgets/inline/CardFragmentWithScrollContainer.class */
@StabilityInferred(parameters = 0)
public final class CardFragmentWithScrollContainer extends CardFragmentPlayerContainerLayout {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f79241l = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f79242j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public View.OnClickListener f79243k;

    public CardFragmentWithScrollContainer(@NotNull Context context) {
        this(context, null);
    }

    public CardFragmentWithScrollContainer(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f79243k = new a(this, 0);
    }

    @NotNull
    public View.OnClickListener getClickToPlayListener() {
        return this.f79243k;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f79242j = false;
    }

    public void setClickToPlayListener(@NotNull View.OnClickListener onClickListener) {
        this.f79243k = onClickListener;
    }

    public final void setManual(boolean z6) {
        this.f79242j = z6;
    }

    public final boolean startPlay() {
        return startPlay(this.f79242j);
    }

    public final boolean startPlay(boolean z6) {
        boolean zStartPlay = super.startPlay(z6);
        this.f79242j = false;
        return zStartPlay;
    }
}
