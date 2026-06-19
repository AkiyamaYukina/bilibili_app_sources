package com.bilibili.ship.theseus.ogv.dubbing;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.widget.IControlWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/dubbing/i.class */
@StabilityInferred(parameters = 0)
public final class i extends AppCompatTextView implements IControlWidget {
    public i(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setText(context.getString(2131855521));
    }

    public final void onWidgetActive() {
    }

    public final void onWidgetInactive() {
    }
}
