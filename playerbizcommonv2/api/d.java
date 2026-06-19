package com.bilibili.playerbizcommonv2.api;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/api/d.class */
public final class d {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(@org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r0 = r7
            boolean r0 = r0 instanceof com.bilibili.playerbizcommonv2.api.TranslationMaterialServiceKt$requestTranslationIntro$1
            if (r0 == 0) goto L25
            r0 = r7
            com.bilibili.playerbizcommonv2.api.TranslationMaterialServiceKt$requestTranslationIntro$1 r0 = (com.bilibili.playerbizcommonv2.api.TranslationMaterialServiceKt$requestTranslationIntro$1) r0
            r9 = r0
            r0 = r9
            int r0 = r0.label
            r8 = r0
            r0 = r8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L25
            r0 = r9
            r1 = r8
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r9
            r7 = r0
            goto L2e
        L25:
            com.bilibili.playerbizcommonv2.api.TranslationMaterialServiceKt$requestTranslationIntro$1 r0 = new com.bilibili.playerbizcommonv2.api.TranslationMaterialServiceKt$requestTranslationIntro$1
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            r7 = r0
        L2e:
            r0 = r7
            java.lang.Object r0 = r0.result
            r10 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r11 = r0
            r0 = r7
            int r0 = r0.label
            r8 = r0
            r0 = 0
            r9 = r0
            r0 = r8
            if (r0 == 0) goto L5f
            r0 = r8
            r1 = 1
            if (r0 != r1) goto L55
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.util.concurrent.CancellationException -> L51 java.lang.Exception -> Lae
            r0 = r10
            r7 = r0
            goto L9a
        L51:
            r7 = move-exception
            goto Lac
        L55:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L5f:
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            com.bapis.bilibili.app.playerunite.v1.PlayAdditionReq$c r0 = com.bapis.bilibili.app.playerunite.v1.PlayAdditionReq.newBuilder()
            com.bapis.bilibili.app.playerunite.v1.AdditionType r1 = com.bapis.bilibili.app.playerunite.v1.AdditionType.ADDITION_TYPE_TRANSLATION_INTRO
            com.bapis.bilibili.app.playerunite.v1.PlayAdditionReq$c r0 = r0.addTypes(r1)
            com.google.protobuf.GeneratedMessageLite r0 = r0.build()
            com.bapis.bilibili.app.playerunite.v1.PlayAdditionReq r0 = (com.bapis.bilibili.app.playerunite.v1.PlayAdditionReq) r0
            r12 = r0
            com.bapis.bilibili.app.playerunite.v1.PlayerMoss r0 = new com.bapis.bilibili.app.playerunite.v1.PlayerMoss     // Catch: java.util.concurrent.CancellationException -> L51 java.lang.Exception -> Lae
            r10 = r0
            r0 = r10
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 7
            r5 = 0
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.util.concurrent.CancellationException -> L51 java.lang.Exception -> Lae
            r0 = r7
            r1 = 1
            r0.label = r1     // Catch: java.util.concurrent.CancellationException -> L51 java.lang.Exception -> Lae
            r0 = r10
            r1 = r12
            r2 = r7
            java.lang.Object r0 = com.bapis.bilibili.app.playerunite.v1.PlayeruniteMossKtxKt.suspendPlayAddition(r0, r1, r2)     // Catch: java.util.concurrent.CancellationException -> L51 java.lang.Exception -> Lae
            r10 = r0
            r0 = r10
            r7 = r0
            r0 = r10
            r1 = r11
            if (r0 != r1) goto L9a
            r0 = r11
            return r0
        L9a:
            r0 = r7
            com.bapis.bilibili.app.playerunite.v1.PlayAdditionReply r0 = (com.bapis.bilibili.app.playerunite.v1.PlayAdditionReply) r0     // Catch: java.util.concurrent.CancellationException -> L51 java.lang.Exception -> Lae
            r10 = r0
            r0 = r9
            r7 = r0
            r0 = r10
            if (r0 == 0) goto Laa
            r0 = r10
            com.bapis.bilibili.app.playerunite.v1.TranslationIntro r0 = r0.getTranslationIntro()     // Catch: java.util.concurrent.CancellationException -> L51 java.lang.Exception -> Lae
            r7 = r0
        Laa:
            r0 = r7
            return r0
        Lac:
            r0 = r7
            throw r0
        Lae:
            r7 = move-exception
            r0 = r9
            r7 = r0
            goto Laa
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.api.d.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
