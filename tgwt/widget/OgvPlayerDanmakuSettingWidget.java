package com.bilibili.tgwt.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.playerbizcommonv2.danmaku.setting.PlayerDanmakuSettingWidget;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/widget/OgvPlayerDanmakuSettingWidget.class */
@StabilityInferred(parameters = 0)
public final class OgvPlayerDanmakuSettingWidget extends PlayerDanmakuSettingWidget {
    public OgvPlayerDanmakuSettingWidget(@NotNull Context context) {
        super(context);
    }

    public OgvPlayerDanmakuSettingWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.bilibili.playerbizcommonv2.danmaku.setting.PlayerDanmakuSettingWidget
    public boolean getMembersInjector() {
        return false;
    }
}
