package com.bilibili.playerbizcommonv2.widget.speed;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.widget.AbsFunctionWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/speed/l.class */
@StabilityInferred(parameters = 0)
public final class l extends AbsFunctionWidget {
    public l(@NotNull Context context) {
        super(context);
    }

    @NotNull
    public final View createContentView(@NotNull Context context) {
        return LayoutInflater.from(context).inflate(2131496645, (ViewGroup) null);
    }

    @NotNull
    public final String getTag() {
        return "TripleSpeedFunctionWidget";
    }

    public final void onRelease() {
    }
}
