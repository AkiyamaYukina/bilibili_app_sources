package com.bilibili.studio.editor.moudle.aistory.step;

import F3.C1728f3;
import com.bilibili.studio.editor.tts.TtsManager;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/step/h.class */
public final class h extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Lazy f105762a = LazyKt.lazy(new C1728f3(8));

    @Override // com.bilibili.studio.editor.moudle.aistory.step.n
    public final int a() {
        return 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005d  */
    @Override // com.bilibili.studio.editor.moudle.aistory.step.n
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull android.content.Context r16, @org.jetbrains.annotations.NotNull com.bilibili.studio.editor.moudle.aistory.bean.AIStoryBean r17, @org.jetbrains.annotations.NotNull com.bilibili.studio.editor.moudle.aistory.a r18, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r19) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.aistory.step.h.b(android.content.Context, com.bilibili.studio.editor.moudle.aistory.bean.AIStoryBean, com.bilibili.studio.editor.moudle.aistory.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.bilibili.studio.editor.moudle.aistory.step.m, com.bilibili.studio.editor.moudle.aistory.step.n
    public final void cancel() {
        CoroutineScopeKt.cancel$default(((TtsManager) this.f105762a.getValue()).f108316a, (CancellationException) null, 1, (Object) null);
    }
}
