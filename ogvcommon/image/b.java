package com.bilibili.ogvcommon.image;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/image/b.class */
public final class b {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    @kotlin.Deprecated(message = "Use await extension for ImageDataSource.")
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(@org.jetbrains.annotations.NotNull com.bilibili.lib.image2.DrawableAcquireRequestBuilder r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r0 = r5
            boolean r0 = r0 instanceof com.bilibili.ogvcommon.image.BiliImageLoaderUtilsKt$getDrawable$1
            if (r0 == 0) goto L25
            r0 = r5
            com.bilibili.ogvcommon.image.BiliImageLoaderUtilsKt$getDrawable$1 r0 = (com.bilibili.ogvcommon.image.BiliImageLoaderUtilsKt$getDrawable$1) r0
            r7 = r0
            r0 = r7
            int r0 = r0.label
            r6 = r0
            r0 = r6
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L25
            r0 = r7
            r1 = r6
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r7
            r5 = r0
            goto L2e
        L25:
            com.bilibili.ogvcommon.image.BiliImageLoaderUtilsKt$getDrawable$1 r0 = new com.bilibili.ogvcommon.image.BiliImageLoaderUtilsKt$getDrawable$1
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r5 = r0
        L2e:
            r0 = r5
            java.lang.Object r0 = r0.result
            r8 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r7 = r0
            r0 = r5
            int r0 = r0.label
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L61
            r0 = r6
            r1 = 1
            if (r0 != r1) goto L57
            r0 = r8
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r8
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.unbox-impl()
            r4 = r0
            goto L7f
        L57:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L61:
            r0 = r8
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r4
            com.bilibili.lib.image2.bean.ImageDataSource r0 = r0.submit()
            r4 = r0
            r0 = r5
            r1 = 1
            r0.label = r1
            r0 = r4
            r1 = r5
            java.lang.Object r0 = com.bilibili.ogv.infra.biliimage.c.a(r0, r1)
            r5 = r0
            r0 = r5
            r4 = r0
            r0 = r5
            r1 = r7
            if (r0 != r1) goto L7f
            r0 = r7
            return r0
        L7f:
            r0 = r4
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogvcommon.image.b.a(com.bilibili.lib.image2.DrawableAcquireRequestBuilder, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
