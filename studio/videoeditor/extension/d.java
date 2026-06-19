package com.bilibili.studio.videoeditor.extension;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/extension/d.class */
public final class d {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.coroutines.Continuation, kotlin.coroutines.jvm.internal.ContinuationImpl] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineScope r6, @org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0 r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r0 = r9
            boolean r0 = r0 instanceof com.bilibili.studio.videoeditor.extension.ContinuationExtKt$postMainSafeCallback$1
            if (r0 == 0) goto L29
            r0 = r9
            com.bilibili.studio.videoeditor.extension.ContinuationExtKt$postMainSafeCallback$1 r0 = (com.bilibili.studio.videoeditor.extension.ContinuationExtKt$postMainSafeCallback$1) r0
            r11 = r0
            r0 = r11
            int r0 = r0.label
            r10 = r0
            r0 = r10
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L29
            r0 = r11
            r1 = r10
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            goto L33
        L29:
            com.bilibili.studio.videoeditor.extension.ContinuationExtKt$postMainSafeCallback$1 r0 = new com.bilibili.studio.videoeditor.extension.ContinuationExtKt$postMainSafeCallback$1
            r1 = r0
            r2 = r9
            r1.<init>(r2)
            r11 = r0
        L33:
            r0 = r11
            java.lang.Object r0 = r0.result
            r13 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r12 = r0
            r0 = r11
            int r0 = r0.label
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L70
            r0 = r10
            r1 = 1
            if (r0 != r1) goto L66
            r0 = r11
            java.lang.Object r0 = r0.L$0
            java.lang.String r0 = (java.lang.String) r0
            r9 = r0
            r0 = r13
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Exception -> L62
            goto Lbd
        L62:
            r6 = move-exception
            goto Lb3
        L66:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L70:
            r0 = r13
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r7
            r9 = r0
            kotlinx.coroutines.MainCoroutineDispatcher r0 = kotlinx.coroutines.Dispatchers.getMain()     // Catch: java.lang.Exception -> L62
            r14 = r0
            r0 = r7
            r9 = r0
            com.bilibili.studio.videoeditor.extension.ContinuationExtKt$postMainSafeCallback$2 r0 = new com.bilibili.studio.videoeditor.extension.ContinuationExtKt$postMainSafeCallback$2     // Catch: java.lang.Exception -> L62
            r13 = r0
            r0 = r7
            r9 = r0
            r0 = r13
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = 0
            r0.<init>(r1, r2, r3, r4)     // Catch: java.lang.Exception -> L62
            r0 = r7
            r9 = r0
            r0 = r11
            r1 = r7
            r0.L$0 = r1     // Catch: java.lang.Exception -> L62
            r0 = r7
            r9 = r0
            r0 = r11
            r1 = 1
            r0.label = r1     // Catch: java.lang.Exception -> L62
            r0 = r7
            r9 = r0
            r0 = r14
            r1 = r13
            r2 = r11
            java.lang.Object r0 = kotlinx.coroutines.BuildersKt.withContext(r0, r1, r2)     // Catch: java.lang.Exception -> L62
            r6 = r0
            r0 = r6
            r1 = r12
            if (r0 != r1) goto Lbd
            r0 = r12
            return r0
        Lb3:
            java.lang.String r0 = "postMainSafeCallback exception: "
            r1 = r6
            java.lang.String r1 = r1.getMessage()
            r2 = r9
            q4.M.b(r0, r1, r2)
        Lbd:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.extension.d.a(kotlinx.coroutines.CoroutineScope, java.lang.String, kotlin.jvm.functions.Function0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final void b(Object obj, @NotNull Continuation continuation) {
        Object obj2;
        try {
            continuation.resumeWith(Result.constructor-impl(obj));
            obj2 = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion = Result.Companion;
            obj2 = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj2);
        if (th2 != null) {
            th2.printStackTrace();
        }
    }
}
