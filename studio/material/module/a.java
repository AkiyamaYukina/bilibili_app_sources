package com.bilibili.studio.material.module;

import com.bilibili.studio.material.FailReason;
import com.bilibili.studio.material.IMaterialProcessor;
import com.bilibili.studio.material.MaterialType;
import com.bilibili.studio.material.Result;
import com.bilibili.studio.material.internal.ProcessorData;
import com.bilibili.studio.material.internal.ProcessorItem;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/module/a.class */
public final class a extends IMaterialProcessor<ProcessorData> {
    @Override // com.bilibili.studio.material.IMaterialProcessor
    @NotNull
    public final MaterialType getMaterialType() {
        return MaterialType.UnUsed.INSTANCE;
    }

    @Override // com.bilibili.studio.material.IMaterialProcessor
    @Nullable
    public final Object preProcess(@NotNull ProcessorItem processorItem, @NotNull Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    @Override // com.bilibili.studio.material.IMaterialProcessor
    @Nullable
    public final Object proProcess(@NotNull ProcessorItem processorItem, @NotNull Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    @Override // com.bilibili.studio.material.IMaterialProcessor
    @Nullable
    public final Object process(@NotNull ProcessorItem processorItem, @Nullable Function3<? super Float, ? super Integer, ? super Integer, Unit> function3, @NotNull Continuation<? super Unit> continuation) {
        Result result = new Result(false, processorItem.getRequest().getFilePath(), null, 0.0d, null, null, null, false, null, null, 1020, null);
        result.setId(processorItem.getRequest().getMaterialId());
        result.setUrl(processorItem.getRequest().getMaterialUrl());
        result.setMaterialType(processorItem.getRequest().getMaterialType());
        result.setFailReason(new FailReason.b("Missing Processor for type: " + processorItem.getRequest().getMaterialType()));
        processorItem.setResult(result);
        return Unit.INSTANCE;
    }
}
