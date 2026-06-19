package com.bilibili.ogv.infra.util;

import kotlin.sequences.Sequence;
import kotlin.sequences.o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/util/SequencesKt.class */
public final class SequencesKt {
    @NotNull
    public static final <T> Sequence<T> a(@NotNull Iterable<? extends T> iterable, int i7) {
        return o.sequence(new SequencesKt$repeatAsSequence$1(i7, iterable, null));
    }
}
