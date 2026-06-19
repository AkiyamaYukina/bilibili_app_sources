package com.bilibili.pegasus.promo.setting;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.dd.DeviceDecision;
import com.bilibili.magicasakura.widgets.TintTextView;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/promo/setting/InlineTitleTextView.class */
@StabilityInferred(parameters = 0)
public final class InlineTitleTextView extends TintTextView {
    @JvmOverloads
    public InlineTitleTextView(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @JvmOverloads
    public InlineTitleTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public InlineTitleTextView(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        setText(DeviceDecision.INSTANCE.dd("pegasus_auto_play_setting_title", context.getString(2131845098)));
    }
}
