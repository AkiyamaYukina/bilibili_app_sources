package com.bilibili.search2.api.oversea;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/oversea/b.class */
public final class b {
    @Nullable
    public static final String a(@NotNull a aVar) {
        return b(aVar) ? aVar.getTranslatedTitle() : aVar.getTitle();
    }

    public static final boolean b(@NotNull a aVar) {
        return aVar.getTranslatedStatus() == 1;
    }
}
