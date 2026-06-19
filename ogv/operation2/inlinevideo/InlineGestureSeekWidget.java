package com.bilibili.ogv.operation2.inlinevideo;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.common.inline.view.InlineGestureSeekBar;
import com.bilibili.app.comm.list.common.inline.view.InlineGestureSeekBarContainer;
import com.bilibili.app.comm.list.common.inline.widgetV3.GestureSeekFrameLayout;
import com.bilibili.app.comm.list.common.inline.widgetV3.OnSeekStateChangeListener;
import com.bilibili.inline.panel.PanelWidgetKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;
import tv.danmaku.video.bilicardplayer.ICardPlayerContext;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/inlinevideo/InlineGestureSeekWidget.class */
@StabilityInferred(parameters = 0)
public final class InlineGestureSeekWidget extends GestureSeekFrameLayout {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f70873v = 8;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f70874o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f70875p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    private InlineGestureSeekBarContainer f70876q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    private InlineGestureSeekBar f70877r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f70878s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private OnSeekStateChangeListener f70879t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    private final a f70880u;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/inlinevideo/InlineGestureSeekWidget$a.class */
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final InlineGestureSeekWidget f70881a;

        public a(InlineGestureSeekWidget inlineGestureSeekWidget) {
            this.f70881a = inlineGestureSeekWidget;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [android.widget.FrameLayout, com.bilibili.ogv.operation2.inlinevideo.InlineGestureSeekWidget] */
        @Override // java.lang.Runnable
        public void run() {
            ICardPlayerContext playerContext;
            if (!this.f70881a.f70878s || (playerContext = PanelWidgetKt.getPlayerContext(this.f70881a)) == null) {
                return;
            }
            ?? r02 = this.f70881a;
            r02.updateCardProgress((int) playerContext.getCurrentPosition(), (int) playerContext.getDuration(), false);
            r02.postDelayed(this, 1000L);
        }
    }

    @JvmOverloads
    public InlineGestureSeekWidget(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public InlineGestureSeekWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @JvmOverloads
    public InlineGestureSeekWidget(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f70880u = new a(this);
    }

    public /* synthetic */ InlineGestureSeekWidget(Context context, AttributeSet attributeSet, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i8 & 2) != 0 ? null : attributeSet, (i8 & 4) != 0 ? 0 : i7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void i() {
        removeCallbacks(this.f70880u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateCardProgress(int i7, int i8, boolean z6) {
        int i9 = i7 + this.f70875p;
        if (i9 < 0 || i8 <= 0 || i9 > i8) {
            return;
        }
        boolean z7 = this.f70874o;
        if ((z7 || z6) && !(z7 && z6)) {
            return;
        }
        com.bilibili.bplus.im.protobuf.a.b(i9, i8, "update card progress position = ", ", max = ", "SeekWidget");
        InlineGestureSeekBar inlineGestureSeekBar = this.f70877r;
        if (inlineGestureSeekBar != null) {
            inlineGestureSeekBar.setMax(i8);
        }
        InlineGestureSeekBar inlineGestureSeekBar2 = this.f70877r;
        if (inlineGestureSeekBar2 != null) {
            inlineGestureSeekBar2.setProgress(i9);
        }
    }

    public boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent) {
        return false;
    }

    public final void j(@NotNull InlineGestureSeekBarContainer inlineGestureSeekBarContainer, @Nullable Drawable drawable) {
        InlineGestureSeekBar inlineGestureSeekBar;
        Context context = inlineGestureSeekBarContainer.getContext();
        this.f70876q = inlineGestureSeekBarContainer;
        InlineGestureSeekBar inlineGestureSeekBar2 = new InlineGestureSeekBar(context);
        this.f70877r = inlineGestureSeekBar2;
        inlineGestureSeekBar2.setAnimateDuration(200);
        if (drawable != null && (inlineGestureSeekBar = this.f70877r) != null) {
            inlineGestureSeekBar.setProgressDrawable(drawable);
        }
        InlineGestureSeekBar inlineGestureSeekBar3 = this.f70877r;
        if (inlineGestureSeekBar3 != null) {
            inlineGestureSeekBar3.setProgressHeightRange(NewPlayerUtilsKt.toPx(2.0f), NewPlayerUtilsKt.toPx(4.0f));
        }
        inlineGestureSeekBarContainer.setInlineGestureSeekBar(this.f70877r);
        inlineGestureSeekBarContainer.removeAllViews();
        inlineGestureSeekBarContainer.addView(this.f70877r, new FrameLayout.LayoutParams(-1, -1));
        this.f70880u.run();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        super/*android.widget.FrameLayout*/.onAttachedToWindow();
        this.f70878s = true;
        this.f70880u.run();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        super/*android.widget.FrameLayout*/.onDetachedFromWindow();
        this.f70878s = false;
        i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onVisibilityChanged(@NotNull View view, int i7) {
        super/*android.widget.FrameLayout*/.onVisibilityChanged(view, i7);
        if (this.f70878s) {
            this.f70880u.run();
        }
    }

    public final void setFakeStartProgress(int i7) {
        this.f70875p = i7;
    }

    public final void setOnSeekStateChangeListener(@Nullable OnSeekStateChangeListener onSeekStateChangeListener) {
        this.f70879t = onSeekStateChangeListener;
    }
}
