package com.bilibili.playerbizcommonv2.danmaku.input.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/widget/PlayerInputPlaceholderView.class */
@StabilityInferred(parameters = 0)
public final class PlayerInputPlaceholderView extends View {
    @JvmOverloads
    public PlayerInputPlaceholderView(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public PlayerInputPlaceholderView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public PlayerInputPlaceholderView(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }
}
