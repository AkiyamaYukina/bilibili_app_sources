package com.bilibili.playerbizcommon.features.danmaku.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/danmaku/view/PlayerVerticalExpandableView.class */
public final class PlayerVerticalExpandableView extends LinearLayout {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/danmaku/view/PlayerVerticalExpandableView$a.class */
    public interface a {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/danmaku/view/PlayerVerticalExpandableView$b.class */
    public interface b {
    }

    public PlayerVerticalExpandableView(@NotNull Context context) {
        super(context);
        super.setOrientation(1);
    }

    public PlayerVerticalExpandableView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setOrientation(1);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
    }

    public final void setOnSizeChangedListener(@NotNull a aVar) {
    }

    public final void setOnSwitchListener(@NotNull b bVar) {
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i7) {
    }
}
