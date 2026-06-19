package com.bilibili.playerbizcommonv2.widget.subtitle;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.playerbizcommonv2.widget.base.RightInsetWithShadowFunctionWidget;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/subtitle/D.class */
@StabilityInferred(parameters = 0)
public final class D extends x0 {
    public D(@NotNull Context context) {
        super(context);
    }

    @Override // com.bilibili.playerbizcommonv2.widget.subtitle.x0, com.bilibili.playerbizcommonv2.widget.base.RightInsetWithShadowFunctionWidget
    @NotNull
    public final RightInsetWithShadowFunctionWidget.ShadowSize shadowSize() {
        return RightInsetWithShadowFunctionWidget.ShadowSize.SMALL;
    }
}
