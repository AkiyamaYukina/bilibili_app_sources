package com.bilibili.studio.material;

import cn.com.chinatelecom.account.api.d.m;
import com.bilibili.studio.material.internal.ProcessorItem;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/b.class */
public final class b extends IStrategy<ProcessorItem> {
    @Override // com.bilibili.studio.material.IStrategy
    @Nullable
    public final Object action(@NotNull ProcessorItem processorItem, @NotNull MaterialConfig materialConfig, @NotNull Continuation<? super Unit> continuation) {
        String filePath = materialConfig.getFilePath();
        if (!m.b(filePath)) {
            new File(filePath).mkdirs();
        }
        processorItem.getRequest().setFilePath(filePath);
        return Unit.INSTANCE;
    }
}
