package com.bilibili.studio.material.module;

import com.bilibili.studio.material.IMaterialProcessor;
import com.bilibili.studio.material.MaterialConfig;
import com.bilibili.studio.material.internal.ProcessorData;
import com.bilibili.studio.material.internal.ProcessorItem;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/module/DefaultProcessor.class */
public abstract class DefaultProcessor extends IMaterialProcessor<ProcessorData> {

    /* JADX INFO: renamed from: com.bilibili.studio.material.module.DefaultProcessor$batchPreProcess$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/module/DefaultProcessor$batchPreProcess$1.class */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        Object result;
        final DefaultProcessor this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DefaultProcessor defaultProcessor, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = defaultProcessor;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultProcessor.b(this.this$0, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.studio.material.module.DefaultProcessor$preProcess$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/module/DefaultProcessor$preProcess$1.class */
    public static final class C65911 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        Object result;
        final DefaultProcessor this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C65911(DefaultProcessor defaultProcessor, Continuation<? super C65911> continuation) {
            super(continuation);
            this.this$0 = defaultProcessor;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultProcessor.c(this.this$0, null, this);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.studio.material.module.DefaultProcessor$proProcess$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/module/DefaultProcessor$proProcess$1.class */
    public static final class C65921 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        Object result;
        final DefaultProcessor this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C65921(DefaultProcessor defaultProcessor, Continuation<? super C65921> continuation) {
            super(continuation);
            this.this$0 = defaultProcessor;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultProcessor.d(this.this$0, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object b(com.bilibili.studio.material.module.DefaultProcessor r5, java.util.List<? extends com.bilibili.studio.material.internal.ProcessorItem> r6, com.bilibili.studio.material.MaterialConfig r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.material.module.DefaultProcessor.b(com.bilibili.studio.material.module.DefaultProcessor, java.util.List, com.bilibili.studio.material.MaterialConfig, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object c(com.bilibili.studio.material.module.DefaultProcessor r5, com.bilibili.studio.material.internal.ProcessorItem r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.material.module.DefaultProcessor.c(com.bilibili.studio.material.module.DefaultProcessor, com.bilibili.studio.material.internal.ProcessorItem, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object d(com.bilibili.studio.material.module.DefaultProcessor r5, com.bilibili.studio.material.internal.ProcessorItem r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.material.module.DefaultProcessor.d(com.bilibili.studio.material.module.DefaultProcessor, com.bilibili.studio.material.internal.ProcessorItem, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.bilibili.studio.material.IMaterialProcessor
    @Nullable
    public Object batchPreProcess(@NotNull List<? extends ProcessorItem> list, @NotNull MaterialConfig materialConfig, @NotNull Continuation<? super Unit> continuation) {
        return b(this, list, materialConfig, continuation);
    }

    @Override // com.bilibili.studio.material.IMaterialProcessor
    @Nullable
    public Object preProcess(@NotNull ProcessorItem processorItem, @NotNull Continuation<? super Unit> continuation) {
        return c(this, processorItem, continuation);
    }

    @Override // com.bilibili.studio.material.IMaterialProcessor
    @Nullable
    public Object proProcess(@NotNull ProcessorItem processorItem, @NotNull Continuation<? super Unit> continuation) {
        return d(this, processorItem, continuation);
    }
}
