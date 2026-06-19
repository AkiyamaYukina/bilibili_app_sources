package com.bilibili.playerbizcommonv2.widget.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir0.C7613b;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.B;
import tv.danmaku.biliplayerv2.service.IActivityStateService;
import tv.danmaku.biliplayerv2.service.WindowInset;
import tv.danmaku.biliplayerv2.widget.IControlWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/base/PlayerInsetControllerWidget.class */
@StabilityInferred(parameters = 0)
public final class PlayerInsetControllerWidget extends ConstraintLayout implements IControlWidget {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Drawable f82340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Drawable f82341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f82342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f82343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f82344e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f82345f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f82346g;
    public final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Inject
    public IActivityStateService f82347i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final a f82348j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f82349k;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/base/PlayerInsetControllerWidget$a.class */
    public static final class a implements B {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerInsetControllerWidget f82350a;

        public a(PlayerInsetControllerWidget playerInsetControllerWidget) {
            this.f82350a = playerInsetControllerWidget;
        }

        public final void onWindowInsetChanged(WindowInset windowInset) {
            int leftPadding = windowInset.getLeftPadding();
            int bottomPadding = 0;
            PlayerInsetControllerWidget playerInsetControllerWidget = this.f82350a;
            int leftPadding2 = leftPadding > 0 ? windowInset.getLeftPadding() > playerInsetControllerWidget.f82346g ? windowInset.getLeftPadding() - playerInsetControllerWidget.f82346g : windowInset.getLeftPadding() : 0;
            int topPadding = windowInset.getTopPadding() > 0 ? windowInset.getTopPadding() > playerInsetControllerWidget.f82344e ? windowInset.getTopPadding() - playerInsetControllerWidget.f82344e : windowInset.getTopPadding() : 0;
            int rightPadding = windowInset.getRightPadding() > 0 ? windowInset.getRightPadding() > playerInsetControllerWidget.h ? windowInset.getRightPadding() - playerInsetControllerWidget.h : windowInset.getRightPadding() : 0;
            if (windowInset.getBottomPadding() > 0) {
                bottomPadding = windowInset.getBottomPadding() > playerInsetControllerWidget.f82345f ? windowInset.getBottomPadding() - playerInsetControllerWidget.f82345f : windowInset.getBottomPadding();
            }
            playerInsetControllerWidget.setPadding(leftPadding2, topPadding, rightPadding, bottomPadding);
        }
    }

    public PlayerInsetControllerWidget(@NotNull Context context) {
        this(context, null, 0);
    }

    public PlayerInsetControllerWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayerInsetControllerWidget(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, 0);
        this.f82348j = new a(this);
        this.f82349k = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7613b.f122204k, 0, 0);
        this.f82340a = typedArrayObtainStyledAttributes.getDrawable(9);
        this.f82341b = typedArrayObtainStyledAttributes.getDrawable(0);
        if (this.f82340a != null) {
            this.f82342c = typedArrayObtainStyledAttributes.getDimensionPixelOffset(10, 0);
        }
        if (this.f82341b != null) {
            this.f82343d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        }
        this.f82344e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0);
        this.f82345f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0);
        this.f82346g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0);
        this.h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(4, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(@NotNull Canvas canvas) {
        j0(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final void draw(@NotNull Canvas canvas) {
        j0(canvas);
        super.draw(canvas);
    }

    @NotNull
    public final IActivityStateService getActivityStateService() {
        IActivityStateService iActivityStateService = this.f82347i;
        if (iActivityStateService != null) {
            return iActivityStateService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("activityStateService");
        return null;
    }

    public boolean getMembersInjector() {
        return this.f82349k;
    }

    public final void j0(Canvas canvas) {
        int i7;
        int i8;
        if (canvas == null) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredHeight <= 0 || measuredWidth <= 0) {
            return;
        }
        Drawable drawable = this.f82340a;
        if (drawable != null && (i8 = this.f82342c) > 0) {
            if (drawable != null) {
                drawable.setBounds(0, 0, measuredWidth, i8);
            }
            k0(this.f82340a, canvas);
        }
        Drawable drawable2 = this.f82341b;
        if (drawable2 == null || (i7 = this.f82343d) <= 0) {
            return;
        }
        if (drawable2 != null) {
            drawable2.setBounds(0, measuredHeight - i7, measuredWidth, measuredHeight);
        }
        k0(this.f82341b, canvas);
    }

    public final void k0(Drawable drawable, Canvas canvas) {
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        if ((scrollX | scrollY) == 0) {
            drawable.draw(canvas);
            return;
        }
        canvas.translate(scrollX, scrollY);
        drawable.draw(canvas);
        canvas.translate(-scrollX, -scrollY);
    }

    public final void onWidgetActive() {
        getActivityStateService().registerWindowInset(this.f82348j);
        this.f82348j.onWindowInsetChanged(getActivityStateService().getWindowInset());
    }

    public final void onWidgetInactive() {
        getActivityStateService().unregisterWindowInset(this.f82348j);
    }

    public final void setActivityStateService(@NotNull IActivityStateService iActivityStateService) {
        this.f82347i = iActivityStateService;
    }
}
