package com.bilibili.studio.material.module.background;

import J3.C2370p1;
import com.bilibili.studio.material.MaterialConfig;
import com.bilibili.studio.material.MaterialType;
import com.bilibili.studio.material.g;
import com.bilibili.studio.material.internal.ProcessorItem;
import com.bilibili.studio.material.module.DefaultProcessor;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/module/background/BackgroundProcessor.class */
public final class BackgroundProcessor extends DefaultProcessor {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Lazy f108561o = LazyKt.lazy(new C2370p1(9));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/module/background/BackgroundProcessor$BackgroundIdToUrlStrategy.class */
    public static final class BackgroundIdToUrlStrategy extends g<ProcessorItem> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0396  */
        /* JADX WARN: Type inference failed for: r0v120 */
        /* JADX WARN: Type inference failed for: r0v81 */
        /* JADX WARN: Type inference failed for: r0v95 */
        /* JADX WARN: Type inference failed for: r9v10 */
        /* JADX WARN: Type inference failed for: r9v13 */
        /* JADX WARN: Type inference failed for: r9v14 */
        /* JADX WARN: Type inference failed for: r9v15 */
        /* JADX WARN: Type inference failed for: r9v6 */
        /* JADX WARN: Type inference failed for: r9v8 */
        @Override // com.bilibili.studio.material.g
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(@org.jetbrains.annotations.NotNull java.util.List<? extends com.bilibili.studio.material.internal.ProcessorItem> r9, @org.jetbrains.annotations.NotNull com.bilibili.studio.material.MaterialConfig r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
            /*
                Method dump skipped, instruction units count: 1176
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.material.module.background.BackgroundProcessor.BackgroundIdToUrlStrategy.a(java.util.List, com.bilibili.studio.material.MaterialConfig, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Override // com.bilibili.studio.material.module.DefaultProcessor, com.bilibili.studio.material.IMaterialProcessor
    @Nullable
    public final Object batchPreProcess(@NotNull List<? extends ProcessorItem> list, @NotNull MaterialConfig materialConfig, @NotNull Continuation<? super Unit> continuation) {
        Object objA = ((BackgroundIdToUrlStrategy) this.f108561o.getValue()).a(list, materialConfig, continuation);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Unit.INSTANCE;
    }

    @Override // com.bilibili.studio.material.IMaterialProcessor
    @NotNull
    public final MaterialType getMaterialType() {
        return MaterialType.Background.INSTANCE;
    }
}
