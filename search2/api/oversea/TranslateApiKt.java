package com.bilibili.search2.api.oversea;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/oversea/TranslateApiKt.class */
public final class TranslateApiKt {
    @Nullable
    public static final Object a(@NotNull List<? extends a> list, @NotNull Continuation<? super List<String>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new TranslateApiKt$translateTitle$2(list, null), continuation);
    }
}
