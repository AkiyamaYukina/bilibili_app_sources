package com.bilibili.ogv.infra.util;

import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/util/i.class */
public final class i {
    /* JADX WARN: Removed duplicated region for block: B:6:0x000f  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T extends java.lang.CharSequence> T a(@org.jetbrains.annotations.Nullable T r2) {
        /*
            r0 = r2
            if (r0 == 0) goto Lf
            r0 = r2
            r3 = r0
            r0 = r2
            int r0 = r0.length()
            if (r0 != 0) goto L11
        Lf:
            r0 = 0
            r3 = r0
        L11:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.infra.util.i.a(java.lang.CharSequence):java.lang.CharSequence");
    }

    public static final int b(@Nullable String str, int i7) {
        int iIntValue = i7;
        if (str != null) {
            Integer intOrNull = StringsKt.toIntOrNull(str);
            iIntValue = i7;
            if (intOrNull != null) {
                iIntValue = intOrNull.intValue();
            }
        }
        return iIntValue;
    }

    public static final int c(@Nullable String str) {
        Integer intOrNull;
        return (str == null || (intOrNull = StringsKt.toIntOrNull(str)) == null) ? 0 : intOrNull.intValue();
    }

    public static final long d(@Nullable String str, long j7) {
        long jLongValue = j7;
        if (str != null) {
            Long longOrNull = StringsKt.toLongOrNull(str);
            jLongValue = j7;
            if (longOrNull != null) {
                jLongValue = longOrNull.longValue();
            }
        }
        return jLongValue;
    }

    public static final long e(@Nullable String str) {
        Long longOrNull;
        return (str == null || (longOrNull = StringsKt.toLongOrNull(str)) == null) ? 0L : longOrNull.longValue();
    }
}
