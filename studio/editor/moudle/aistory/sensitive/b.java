package com.bilibili.studio.editor.moudle.aistory.sensitive;

import com.bilibili.okretro.BiliApiCallback;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.studio.editor.moudle.aistory.sensitive.bean.SensitiveCheckResponse;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.SafeContinuation;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/sensitive/b.class */
public final class b extends BiliApiCallback<GeneralResponse<SensitiveCheckResponse>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SafeContinuation f105753b;

    public b(SafeContinuation safeContinuation) {
        this.f105753b = safeContinuation;
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        Result.Companion companion = Result.Companion;
        Throwable illegalStateException = th;
        if (th == null) {
            illegalStateException = new IllegalStateException("error");
        }
        this.f105753b.resumeWith(Result.constructor-impl(Result.box-impl(Result.constructor-impl(ResultKt.createFailure(illegalStateException)))));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    @Override // com.bilibili.okretro.BiliApiCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onSuccess(com.bilibili.okretro.GeneralResponse<com.bilibili.studio.editor.moudle.aistory.sensitive.bean.SensitiveCheckResponse> r6) {
        /*
            r5 = this;
            r0 = r6
            com.bilibili.okretro.GeneralResponse r0 = (com.bilibili.okretro.GeneralResponse) r0
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L1d
            r0 = r7
            T r0 = r0.data
            com.bilibili.studio.editor.moudle.aistory.sensitive.bean.SensitiveCheckResponse r0 = (com.bilibili.studio.editor.moudle.aistory.sensitive.bean.SensitiveCheckResponse) r0
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L1d
            r0 = r6
            java.util.List r0 = r0.getList()
            r6 = r0
            goto L1f
        L1d:
            r0 = 0
            r6 = r0
        L1f:
            r0 = r6
            java.util.Collection r0 = (java.util.Collection) r0
            r9 = r0
            r0 = r5
            kotlin.coroutines.SafeContinuation r0 = r0.f105753b
            r8 = r0
            r0 = r9
            if (r0 == 0) goto L4f
            r0 = r9
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L3c
            goto L4f
        L3c:
            r0 = r8
            r1 = r6
            java.lang.Object r1 = kotlin.Result.constructor-impl(r1)
            kotlin.Result r1 = kotlin.Result.box-impl(r1)
            java.lang.Object r1 = kotlin.Result.constructor-impl(r1)
            r0.resumeWith(r1)
            goto L7f
        L4f:
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            r6 = r0
            r0 = r7
            if (r0 == 0) goto L62
            r0 = r7
            java.lang.String r0 = r0.message
            r7 = r0
            r0 = r7
            r6 = r0
            r0 = r7
            if (r0 != 0) goto L65
        L62:
            java.lang.String r0 = "result is null"
            r6 = r0
        L65:
            r0 = r8
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r2 = r1
            r3 = r6
            r2.<init>(r3)
            java.lang.Object r1 = kotlin.ResultKt.createFailure(r1)
            java.lang.Object r1 = kotlin.Result.constructor-impl(r1)
            kotlin.Result r1 = kotlin.Result.box-impl(r1)
            java.lang.Object r1 = kotlin.Result.constructor-impl(r1)
            r0.resumeWith(r1)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.aistory.sensitive.b.onSuccess(java.lang.Object):void");
    }
}
