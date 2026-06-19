package com.bilibili.search2.result.column;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewCompat;
import com.bilibili.magicasakura.utils.ThemeUtils;
import java.util.Arrays;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/column/a.class */
@StabilityInferred(parameters = 1)
public final class a {
    @Nullable
    public static CharSequence a(@Nullable Context context, @NotNull String str) {
        String strA;
        Spanned spannedFromHtml;
        if (TextUtils.isEmpty(str)) {
            spannedFromHtml = null;
        } else {
            if (str.length() <= 0) {
                str = null;
            }
            if (str == null) {
                strA = null;
            } else {
                int colorById = ThemeUtils.getColorById(context, 2131103284);
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                strA = Cp.b.a("&lt;/em&gt;", Cp.b.a("&lt;em class=\"keyword\"&gt;", Cp.b.a(">", Cp.b.a("<", str, "&lt;"), "&gt;"), String.format("<font color=\"%s\">", Arrays.copyOf(new Object[]{String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(colorById & ViewCompat.MEASURED_SIZE_MASK)}, 1))}, 1))), "</font>");
            }
            spannedFromHtml = Html.fromHtml(strA);
        }
        return spannedFromHtml;
    }
}
