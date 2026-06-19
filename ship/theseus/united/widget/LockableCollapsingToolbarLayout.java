package com.bilibili.ship.theseus.united.widget;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/widget/LockableCollapsingToolbarLayout.class */
@StabilityInferred(parameters = 0)
public final class LockableCollapsingToolbarLayout extends CollapsingToolbarLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f104885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f104886b;

    @JvmOverloads
    public LockableCollapsingToolbarLayout(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public LockableCollapsingToolbarLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public LockableCollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int getMinimumHeight() {
        return this.f104885a ? getHeight() - this.f104886b : super/*android.widget.FrameLayout*/.getMinimumHeight();
    }

    public void setContentScrimColor(int i7) {
        super.setContentScrim(new ColorDrawable(i7));
    }
}
