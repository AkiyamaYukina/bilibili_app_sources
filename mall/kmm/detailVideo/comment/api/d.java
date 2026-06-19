package com.bilibili.mall.kmm.detailVideo.comment.api;

import kntr.app.upper.collectionsmanage.CollectionsManageScreenViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/detailVideo/comment/api/d.class */
public final class d {
    public d() {
        final int i7 = 0;
        JsonKt.Json$default((Json) null, new Function1(i7) { // from class: com.bilibili.mall.kmm.detailVideo.comment.api.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f65617a;

            {
                this.f65617a = i7;
            }

            public final Object invoke(Object obj) {
                switch (this.f65617a) {
                    case 0:
                        JsonBuilder jsonBuilder = (JsonBuilder) obj;
                        jsonBuilder.setIgnoreUnknownKeys(true);
                        jsonBuilder.setLenient(true);
                        return Unit.INSTANCE;
                    default:
                        return new CollectionsManageScreenViewModel();
                }
            }
        }, 1, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull java.util.Map r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6 = this;
            r0 = r8
            boolean r0 = r0 instanceof com.bilibili.mall.kmm.detailVideo.comment.api.MallDetailCommentActionServiceImpl$thumbAction$1
            if (r0 == 0) goto L29
            r0 = r8
            com.bilibili.mall.kmm.detailVideo.comment.api.MallDetailCommentActionServiceImpl$thumbAction$1 r0 = (com.bilibili.mall.kmm.detailVideo.comment.api.MallDetailCommentActionServiceImpl$thumbAction$1) r0
            r10 = r0
            r0 = r10
            int r0 = r0.label
            r9 = r0
            r0 = r9
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L29
            r0 = r10
            r1 = r9
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r10
            r8 = r0
            goto L33
        L29:
            com.bilibili.mall.kmm.detailVideo.comment.api.MallDetailCommentActionServiceImpl$thumbAction$1 r0 = new com.bilibili.mall.kmm.detailVideo.comment.api.MallDetailCommentActionServiceImpl$thumbAction$1
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            r8 = r0
        L33:
            r0 = r8
            java.lang.Object r0 = r0.result
            r10 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r11 = r0
            r0 = r8
            int r0 = r0.label
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L69
            r0 = r9
            r1 = 1
            if (r0 != r1) goto L5f
            r0 = r8
            java.lang.Object r0 = r0.L$0
            java.util.Map r0 = (java.util.Map) r0
            r7 = r0
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r10
            r7 = r0
            goto L91
        L5f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L69:
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r8
            r1 = r7
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r1)
            r0.L$0 = r1
            r0 = r8
            r1 = 1
            r0.label = r1
            java.lang.String r0 = "https://mall.bilibili.com/community-hub/tab3_ugc/comment_action"
            java.lang.String r1 = "POST"
            r2 = 0
            r3 = r7
            r4 = r8
            java.lang.Object r0 = com.bilibili.mall.kmm.base.c.a(r0, r1, r2, r3, r4)
            r8 = r0
            r0 = r8
            r7 = r0
            r0 = r8
            r1 = r11
            if (r0 != r1) goto L91
            r0 = r11
            return r0
        L91:
            r0 = r7
            java.lang.String r0 = (java.lang.String) r0
            r7 = r0
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.mall.kmm.detailVideo.comment.api.d.a(java.util.Map, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
