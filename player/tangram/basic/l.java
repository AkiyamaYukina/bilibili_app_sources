package com.bilibili.player.tangram.basic;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/basic/l.class */
public interface l {
    @NotNull
    Flow<a> B();

    @NotNull
    Flow<a> H();

    @Nullable
    Object K(@NotNull c cVar, @NotNull ContinuationImpl continuationImpl);

    @Nullable
    a i();

    @NotNull
    Flow<List<a>> t();

    @Nullable
    a x();
}
