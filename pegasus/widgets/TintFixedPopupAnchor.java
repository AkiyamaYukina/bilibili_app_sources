package com.bilibili.pegasus.widgets;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.magicasakura.widgets.TintFrameLayout;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/widgets/TintFixedPopupAnchor.class */
@StabilityInferred(parameters = 0)
public final class TintFixedPopupAnchor extends TintFrameLayout {
    @JvmOverloads
    public TintFixedPopupAnchor(@Nullable Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public TintFixedPopupAnchor(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public TintFixedPopupAnchor(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    @Override // android.view.View
    public final boolean requestRectangleOnScreen(@NotNull Rect rect, boolean z6) {
        return false;
    }
}
