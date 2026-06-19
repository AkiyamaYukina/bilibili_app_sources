package com.bilibili.studio.material;

import com.bilibili.studio.material.internal.ProcessorItem;
import com.bilibili.studio.material.util.UtilsKt;
import j4.o;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/c.class */
public final class c extends IStrategy<ProcessorItem> {
    @Override // com.bilibili.studio.material.IStrategy
    @Nullable
    public final Object action(@NotNull ProcessorItem processorItem, @NotNull MaterialConfig materialConfig, @NotNull Continuation<? super Unit> continuation) {
        String fileName = processorItem.getRequest().getFileName();
        if (fileName.length() > 255) {
            String filePathNoEx = UtilsKt.getFilePathNoEx(fileName);
            String strA = com.bilibili.app.comm.bhcommon.utils.b.a(filePathNoEx.substring(0, RangesKt.coerceAtMost(50, filePathNoEx.length())), UtilsKt.DOT, UtilsKt.getExtension(fileName));
            o.a("changeFileNameLength: ", fileName, " =>  ", strA, UtilsKt.Material_TAG);
            processorItem.getRequest().setFileName(strA);
        }
        return Unit.INSTANCE;
    }
}
