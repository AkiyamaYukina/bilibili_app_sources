package com.bilibili.pegasus.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.widget.play.CardFragmentPlayerContainerLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/widget/CardFragmentWithScrollContainer.class */
@StabilityInferred(parameters = 0)
public final class CardFragmentWithScrollContainer extends CardFragmentPlayerContainerLayout {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f79103m = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f79104j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f79105k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public View.OnClickListener f79106l;

    public CardFragmentWithScrollContainer(@NotNull Context context) {
        this(context, null);
    }

    public CardFragmentWithScrollContainer(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f79106l = new BB0.a(this, 1);
    }

    @NotNull
    public View.OnClickListener getClickToPlayListener() {
        return this.f79106l;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f79104j = false;
    }

    public void setClickToPlayListener(@NotNull View.OnClickListener onClickListener) {
        this.f79106l = onClickListener;
    }

    public final void setManual(boolean z6) {
        this.f79104j = z6;
    }

    public final boolean startPlay() {
        return startPlay(this.f79104j);
    }

    public final boolean startPlay(boolean z6) {
        boolean zStartPlay = super.startPlay(z6);
        this.f79104j = false;
        return zStartPlay;
    }
}
