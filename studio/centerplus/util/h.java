package com.bilibili.studio.centerplus.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/util/h.class */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f105297a = Pattern.compile("topic_id=([0-9]*)");

    public static int a(@Nullable String str) {
        if (str == null) {
            return 0;
        }
        Matcher matcher = f105297a.matcher(str);
        int iIntValue = 0;
        if (matcher.find()) {
            String strGroup = matcher.group(1);
            iIntValue = 0;
            if (strGroup != null) {
                Integer intOrNull = StringsKt.toIntOrNull(strGroup);
                iIntValue = 0;
                if (intOrNull != null) {
                    iIntValue = intOrNull.intValue();
                }
            }
        }
        return iIntValue;
    }
}
