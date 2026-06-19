package com.bilibili.ogv.infra.coroutine;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/coroutine/SelectKt.class */
public final class SelectKt {
    @Nullable
    public static final <R> Object a(@NotNull Function1<? super c<? super R>, Unit> function1, @NotNull Continuation<? super R> continuation) {
        ArrayList arrayList = new ArrayList();
        function1.invoke(new SelectKt$selectCancellingUnselected$scope$1(arrayList));
        return FlowKt.first(FlowKt.merge(arrayList), continuation);
    }
}
