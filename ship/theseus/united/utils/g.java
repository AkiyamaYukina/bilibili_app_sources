package com.bilibili.ship.theseus.united.utils;

import android.graphics.Color;
import androidx.annotation.ColorInt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/utils/g.class */
public final class g {
    @ColorInt
    public static final int a(@ColorInt int i7, @Nullable String str) {
        if (str != null && !StringsKt.isBlank(str)) {
            try {
                return Color.parseColor(str);
            } catch (IllegalArgumentException e7) {
                com.bilibili.bangumi.logic.page.detail.service.f.a("[theseus-united-TheseusColorXKt-toColorIntOrDefault] ", android.support.v4.media.a.a("can not parse ", str, " to colo int"), "TheseusColorXKt-toColorIntOrDefault", (Throwable) null);
            }
        }
        return i7;
    }
}
