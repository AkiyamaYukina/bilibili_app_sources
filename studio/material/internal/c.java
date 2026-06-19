package com.bilibili.studio.material.internal;

import com.bilibili.studio.material.IMaterialProcessor;
import com.bilibili.studio.material.MaterialType;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/internal/c.class */
public final class c extends BaseDispatcher {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Map<MaterialType, IMaterialProcessor<? extends ProcessorData>> f108542f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Lazy f108543g = LazyKt.lazy(new Dg0.d(9));

    /* JADX WARN: Multi-variable type inference failed */
    public c(@NotNull Map<MaterialType, ? extends IMaterialProcessor<? extends ProcessorData>> map) {
        this.f108542f = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    @Override // com.bilibili.studio.material.internal.b
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineScope r12, @org.jetbrains.annotations.NotNull com.bilibili.studio.material.MaterialRequest r13, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instruction units count: 673
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.material.internal.c.a(kotlinx.coroutines.CoroutineScope, com.bilibili.studio.material.MaterialRequest, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
