package com.bilibili.studio.centerplus.util;

import android.net.Uri;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/util/l.class */
public final class l {
    @NotNull
    public static String a(@Nullable String str, @Nullable String str2, @Nullable String str3, boolean z6) {
        String string;
        if (str == null || str3 == null) {
            return "";
        }
        Uri uri = Uri.parse(str);
        if (uri.getQueryParameterNames().contains(str2)) {
            string = str;
            if (z6) {
                string = new Regex(android.support.v4.media.a.a("(", str2, "=[^&]*)")).replace(str, str2 + "=" + str3);
            }
        } else {
            string = uri.buildUpon().appendQueryParameter(str2, str3).toString();
        }
        return string;
    }
}
