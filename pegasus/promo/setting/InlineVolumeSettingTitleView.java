package com.bilibili.pegasus.promo.setting;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.magicasakura.widgets.TintTextView;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/promo/setting/InlineVolumeSettingTitleView.class */
@StabilityInferred(parameters = 0)
public final class InlineVolumeSettingTitleView extends TintTextView {
    public InlineVolumeSettingTitleView(@Nullable Context context) {
        super(context);
        setText(d.a().getSettingTitle());
    }

    public InlineVolumeSettingTitleView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setText(d.a().getSettingTitle());
    }
}
