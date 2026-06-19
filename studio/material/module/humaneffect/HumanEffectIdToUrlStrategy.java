package com.bilibili.studio.material.module.humaneffect;

import com.bilibili.studio.material.g;
import com.bilibili.studio.material.internal.ProcessorItem;
import com.bilibili.studio.material.internal.net.DownloadUrlLevel;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/module/humaneffect/HumanEffectIdToUrlStrategy.class */
public final class HumanEffectIdToUrlStrategy extends g<ProcessorItem> {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/module/humaneffect/HumanEffectIdToUrlStrategy$a.class */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t8) {
            return ComparisonsKt.compareValues(Integer.valueOf(((DownloadUrlLevel) t7).getLevelValue()), Integer.valueOf(((DownloadUrlLevel) t8).getLevelValue()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, java.util.Comparator] */
    @Override // com.bilibili.studio.material.g
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull java.util.List<? extends com.bilibili.studio.material.internal.ProcessorItem> r9, @org.jetbrains.annotations.NotNull com.bilibili.studio.material.MaterialConfig r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instruction units count: 967
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.material.module.humaneffect.HumanEffectIdToUrlStrategy.a(java.util.List, com.bilibili.studio.material.MaterialConfig, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
