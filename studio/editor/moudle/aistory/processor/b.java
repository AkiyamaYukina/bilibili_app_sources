package com.bilibili.studio.editor.moudle.aistory.processor;

import com.bilibili.studio.editor.moudle.aistory.bean.AIStoryProcessorBean;
import com.bilibili.upper.module.aistory.model.q;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/processor/b.class */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public com.bilibili.studio.editor.moudle.intelligence.frame.d f105738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f105739b;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.studio.editor.moudle.aistory.processor.b r6, com.bilibili.studio.editor.moudle.aistory.bean.AIStoryProcessorBean r7, java.util.List r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.aistory.processor.b.a(com.bilibili.studio.editor.moudle.aistory.processor.b, com.bilibili.studio.editor.moudle.aistory.bean.AIStoryProcessorBean, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Nullable
    public final Unit b(@NotNull AIStoryProcessorBean aIStoryProcessorBean, @NotNull q qVar, int i7) {
        this.f105739b = i7;
        BuildersKt.runBlocking$default((CoroutineContext) null, new AIStoryGenFrameProcessor$process$2(aIStoryProcessorBean, this, qVar, null), 1, (Object) null);
        return Unit.INSTANCE;
    }
}
