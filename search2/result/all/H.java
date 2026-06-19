package com.bilibili.search2.result.all;

import androidx.media3.common.C4618g;
import java.util.Calendar;
import kntr.base.localization.Locale;
import kntr.base.localization.Localization;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/H.class */
public final class H {
    @NotNull
    public static final String a(@NotNull Calendar calendar) {
        boolean zD = kntr.base.localization.q.d((Locale) Localization.INSTANCE.getLocaleFlow().getValue());
        return B0.a.a(zD ? C4618g.a(calendar.get(1), "年") : C4618g.a(calendar.get(1), "-"), zD ? C4618g.a(calendar.get(2) + 1, "月") : C4618g.a(calendar.get(2) + 1, "-"), zD ? C4618g.a(calendar.get(5), "日") : String.valueOf(calendar.get(5)));
    }
}
