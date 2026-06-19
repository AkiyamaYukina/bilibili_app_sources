package com.bilibili.search2.utils;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.droid.StringFormatter;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/utils/k.class */
@Deprecated(message = "use {@link com.bilibili.base.util.NumberFormat}")
@StabilityInferred(parameters = 1)
public final class k {
    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final String a(int i7, @NotNull String str) {
        long j7 = i7;
        if (j7 >= 100000000) {
            float f7 = j7 / 1.0E8f;
            double d7 = f7 % 1;
            str = (d7 >= 0.95d || d7 <= 0.049d) ? StringFormatter.format(Locale.CHINA, "%.0f".concat(B.n(2131847765)), new Object[]{Float.valueOf(f7)}) : StringFormatter.format(Locale.CHINA, "%.1f".concat(B.n(2131847765)), new Object[]{Float.valueOf(f7)});
        } else if (j7 >= 99999500) {
            str = "1".concat(B.n(2131847765));
        } else if (j7 >= 10000) {
            float f8 = j7 / 10000.0f;
            double d8 = f8 % 1;
            str = (d8 >= 0.95d || d8 <= 0.049d) ? StringFormatter.format(Locale.CHINA, "%.0f".concat(B.n(2131847705)), new Object[]{Float.valueOf(f8)}) : StringFormatter.format(Locale.CHINA, "%.1f".concat(B.n(2131847705)), new Object[]{Float.valueOf(f8)});
        } else if (j7 > 0) {
            str = String.valueOf(j7);
        }
        return str;
    }
}
