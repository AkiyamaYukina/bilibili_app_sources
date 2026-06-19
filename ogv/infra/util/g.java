package com.bilibili.ogv.infra.util;

import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/util/g.class */
public final class g {
    @NotNull
    public static final f a(@NotNull List list, @NotNull Function1 function1) {
        return list instanceof RandomAccess ? new f(list, function1) : new f(list, function1);
    }
}
