package com.bilibili.ship.theseus.cheese.biz.intro.pack;

import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/pack/r.class */
public final class r {
    @NotNull
    public static final String a(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        String strA = B0.a.a(str2, "=", str3);
        String strA2 = str;
        if (!StringsKt.n(str, str2)) {
            strA2 = StringsKt.n(str, "?") ? B0.a.a(str, "&", strA) : B0.a.a(str, "?", strA);
        }
        return strA2;
    }
}
