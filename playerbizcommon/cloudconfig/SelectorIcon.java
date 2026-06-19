package com.bilibili.playerbizcommon.cloudconfig;

import android.content.Context;
import android.util.AttributeSet;
import com.bilibili.magicasakura.widgets.TintImageView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/cloudconfig/SelectorIcon.class */
public final class SelectorIcon extends TintImageView {
    public SelectorIcon(@NotNull Context context) {
        this(context, null);
    }

    public SelectorIcon(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.widget.ImageView, android.view.View
    public void setSelected(boolean z6) {
        super.setSelected(z6);
        setVisibility(z6 ? 0 : 8);
    }
}
