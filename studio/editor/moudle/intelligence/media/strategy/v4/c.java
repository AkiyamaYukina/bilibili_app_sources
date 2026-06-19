package com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4;

import androidx.compose.runtime.C4277b;
import com.bilibili.search2.result.vertical.live.report.ReporterMap;
import kotlinx.coroutines.Deferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/strategy/v4/c.class */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f107468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Deferred<g> f107469b;

    public c(int i7, @Nullable Deferred<g> deferred) {
        this.f107468a = i7;
        this.f107469b = deferred;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            r0 = r6
            boolean r0 = r0 instanceof com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.GenerateJobWrap$join$1
            if (r0 == 0) goto L25
            r0 = r6
            com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.GenerateJobWrap$join$1 r0 = (com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.GenerateJobWrap$join$1) r0
            r8 = r0
            r0 = r8
            int r0 = r0.label
            r7 = r0
            r0 = r7
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L25
            r0 = r8
            r1 = r7
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r8
            r6 = r0
            goto L2f
        L25:
            com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.GenerateJobWrap$join$1 r0 = new com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.GenerateJobWrap$join$1
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            r6 = r0
        L2f:
            r0 = r6
            java.lang.Object r0 = r0.result
            r8 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r9 = r0
            r0 = r6
            int r0 = r0.label
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L5a
            r0 = r7
            r1 = 1
            if (r0 != r1) goto L50
            r0 = r8
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Exception -> L91
            r0 = r8
            r6 = r0
            goto L7f
        L50:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L5a:
            r0 = r8
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r5
            kotlinx.coroutines.Deferred<com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.g> r0 = r0.f107469b     // Catch: java.lang.Exception -> L91
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L8a
            r0 = r6
            r1 = 1
            r0.label = r1     // Catch: java.lang.Exception -> L91
            r0 = r8
            r1 = r6
            java.lang.Object r0 = r0.await(r1)     // Catch: java.lang.Exception -> L91
            r8 = r0
            r0 = r8
            r6 = r0
            r0 = r8
            r1 = r9
            if (r0 != r1) goto L7f
            r0 = r9
            return r0
        L7f:
            r0 = r6
            com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.g r0 = (com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.g) r0     // Catch: java.lang.Exception -> L91
            r8 = r0
            r0 = r8
            r6 = r0
            r0 = r8
            if (r0 != 0) goto L96
        L8a:
            com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.g r0 = com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.b.f107467a     // Catch: java.lang.Exception -> L91
            r6 = r0
            goto L96
        L91:
            r6 = move-exception
            com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.g r0 = com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.b.f107467a
            r6 = r0
        L96:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.c.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @NotNull
    public final String toString() {
        Deferred<g> deferred = this.f107469b;
        return C4277b.a(this.f107468a, ReporterMap.RIGHT_BRACES, androidx.core.content.d.b("{isCompleted=", ", version=", deferred != null ? deferred.isCompleted() : true));
    }
}
