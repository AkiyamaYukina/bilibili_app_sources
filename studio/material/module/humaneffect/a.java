package com.bilibili.studio.material.module.humaneffect;

import com.bilibili.studio.material.MaterialConfig;
import com.bilibili.studio.material.MaterialType;
import com.bilibili.studio.material.g;
import com.bilibili.studio.material.internal.ProcessorItem;
import com.bilibili.studio.material.module.DefaultProcessor;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/module/humaneffect/a.class */
public final class a extends DefaultProcessor {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final HumanEffectIdToUrlStrategy f108563o = new g();

    @Override // com.bilibili.studio.material.module.DefaultProcessor, com.bilibili.studio.material.IMaterialProcessor
    @Nullable
    public final Object batchPreProcess(@NotNull List<? extends ProcessorItem> list, @NotNull MaterialConfig materialConfig, @NotNull Continuation<? super Unit> continuation) {
        Object objA = this.f108563o.a(list, materialConfig, continuation);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Unit.INSTANCE;
    }

    @Override // com.bilibili.studio.material.IMaterialProcessor
    @NotNull
    public final MaterialType getMaterialType() {
        return MaterialType.HumanEffect.INSTANCE;
    }
}
