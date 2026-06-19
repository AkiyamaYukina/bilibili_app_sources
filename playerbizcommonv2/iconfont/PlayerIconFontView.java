package com.bilibili.playerbizcommonv2.iconfont;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/iconfont/PlayerIconFontView.class */
@StabilityInferred(parameters = 0)
public final class PlayerIconFontView extends AppCompatTextView {
    @JvmOverloads
    public PlayerIconFontView(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @JvmOverloads
    public PlayerIconFontView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public PlayerIconFontView(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        setTypeface(Typeface.createFromAsset(getContext().getAssets(), "iconfont.ttf"));
    }
}
