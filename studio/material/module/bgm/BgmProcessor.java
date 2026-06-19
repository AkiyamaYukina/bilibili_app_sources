package com.bilibili.studio.material.module.bgm;

import com.bilibili.studio.material.MaterialConfig;
import com.bilibili.studio.material.MaterialType;
import com.bilibili.studio.material.internal.ProcessorItem;
import com.bilibili.studio.material.module.DefaultProcessor;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/module/bgm/BgmProcessor.class */
public final class BgmProcessor extends DefaultProcessor {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public MaterialConfig f108562o;

    /* JADX INFO: renamed from: com.bilibili.studio.material.module.bgm.BgmProcessor$batchPreProcess$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/module/bgm/BgmProcessor$batchPreProcess$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final List<ProcessorItem> $items;
        private Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(List<? extends ProcessorItem> list, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$items = list;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$items, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0126  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x01e6  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x01e9  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0227  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x026e  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0341  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x01e9 -> B:33:0x01f3). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instruction units count: 843
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.material.module.bgm.BgmProcessor.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Override // com.bilibili.studio.material.module.DefaultProcessor, com.bilibili.studio.material.IMaterialProcessor
    @Nullable
    public final Object batchPreProcess(@NotNull List<? extends ProcessorItem> list, @NotNull MaterialConfig materialConfig, @NotNull Continuation<? super Unit> continuation) {
        Object objSupervisorScope = SupervisorKt.supervisorScope(new AnonymousClass2(list, null), continuation);
        return objSupervisorScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSupervisorScope : Unit.INSTANCE;
    }

    @Override // com.bilibili.studio.material.IMaterialProcessor
    @NotNull
    public final MaterialConfig getConfig() {
        return this.f108562o;
    }

    @Override // com.bilibili.studio.material.IMaterialProcessor
    @NotNull
    public final MaterialType getMaterialType() {
        return MaterialType.Bgm.INSTANCE;
    }

    @Override // com.bilibili.studio.material.IMaterialProcessor
    public final void setConfig(@NotNull MaterialConfig materialConfig) {
        this.f108562o = materialConfig;
    }
}
