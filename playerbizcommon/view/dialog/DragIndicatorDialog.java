package com.bilibili.playerbizcommon.view.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.CallSuper;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.bilibili.lib.theme.R$color;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/view/dialog/DragIndicatorDialog.class */
public class DragIndicatorDialog extends BottomSheetDialog implements LifecycleOwner {

    @Nullable
    private LifecycleRegistry _lifecycleRegistry;

    @Nullable
    private FrameLayout bottomSheet;
    private boolean showDragIndicator;

    public DragIndicatorDialog(@NotNull Context context) {
        super(context);
        this.showDragIndicator = true;
    }

    public DragIndicatorDialog(@NotNull Context context, int i7) {
        super(context, i7);
        this.showDragIndicator = true;
    }

    public DragIndicatorDialog(@NotNull Context context, boolean z6, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        super(context, z6, onCancelListener);
        this.showDragIndicator = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ensureBottomSheet() {
        this.bottomSheet = (FrameLayout) findViewById(2131299837);
    }

    private final LifecycleRegistry getLifecycleRegistry() {
        LifecycleRegistry lifecycleRegistry = this._lifecycleRegistry;
        LifecycleRegistry lifecycleRegistry2 = lifecycleRegistry;
        if (lifecycleRegistry == null) {
            lifecycleRegistry2 = new LifecycleRegistry(this);
            this._lifecycleRegistry = lifecycleRegistry2;
        }
        return lifecycleRegistry2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initViewTreeOwners() {
        ViewTreeLifecycleOwner.set(getWindow().getDecorView(), this);
    }

    private final void setDragHandler() {
        FrameLayout frameLayout;
        if (!this.showDragIndicator || (frameLayout = this.bottomSheet) == null) {
            return;
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(frameLayout.getContext());
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(NewPlayerUtilsKt.toFloatPx(2.0f));
        gradientDrawable.setColor(ContextCompat.getColor(appCompatImageView.getContext(), R$color.Ga3));
        appCompatImageView.setBackgroundDrawable(gradientDrawable);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(NewPlayerUtilsKt.toPx(30.0f), NewPlayerUtilsKt.toPx(3.0f));
        layoutParams.topMargin = NewPlayerUtilsKt.toPx(8.0f);
        layoutParams.gravity = 1;
        Unit unit = Unit.INSTANCE;
        frameLayout.addView(appCompatImageView, layoutParams);
    }

    @Nullable
    public final FrameLayout getBottomSheet() {
        return this.bottomSheet;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @NotNull
    public Lifecycle getLifecycle() {
        return getLifecycleRegistry();
    }

    public final boolean getShowDragIndicator() {
        return this.showDragIndicator;
    }

    @CallSuper
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
    }

    @CallSuper
    public void onStart() {
        super.onStart();
        getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CallSuper
    public void onStop() {
        getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        this._lifecycleRegistry = null;
        super/*androidx.appcompat.app.AppCompatDialog*/.onStop();
    }

    public final void setBottomSheet(@Nullable FrameLayout frameLayout) {
        this.bottomSheet = frameLayout;
    }

    public void setContentView(int i7) {
        initViewTreeOwners();
        super.setContentView(i7);
        ensureBottomSheet();
        setDragHandler();
    }

    public void setContentView(@NotNull View view) {
        initViewTreeOwners();
        super.setContentView(view);
        ensureBottomSheet();
        setDragHandler();
    }

    public void setContentView(@NotNull View view, @Nullable ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.setContentView(view, layoutParams);
        ensureBottomSheet();
        setDragHandler();
    }

    public final void setShowDragIndicator(boolean z6) {
        this.showDragIndicator = z6;
    }
}
