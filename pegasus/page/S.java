package com.bilibili.pegasus.page;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.coroutineextension.BiliCallExtKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/S.class */
@StabilityInferred(parameters = 0)
public final class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Lazy f78313a = LazyKt.lazy(new J80.a(7));

    @Nullable
    public static Object a(@NotNull lp0.c cVar, @NotNull com.bilibili.pegasus.request.i iVar, @NotNull ContinuationImpl continuationImpl) {
        return BiliCallExtKt.getResult(((com.bilibili.pegasus.request.d) f78313a.getValue()).getIndexList(cVar.f123309a, cVar.f123310b, 0, null, null, null, cVar.f123311c.getValue(), cVar.f123319l, cVar.f123320m, 0L, null, null, 0L, null, null, null, null, cVar.f123317j, cVar.f123318k).setParser(iVar), continuationImpl);
    }
}
