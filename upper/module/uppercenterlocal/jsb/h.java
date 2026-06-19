package com.bilibili.upper.module.uppercenterlocal.jsb;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.rubick.api.IJsbContextV3;
import kntr.base.jsb.api.upper.UpperUploadJsbServiceApi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenterlocal/jsb/h.class */
@StabilityInferred(parameters = 0)
public final class h implements UpperUploadJsbServiceApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final IJsbContextV3 f114252a;

    public h(@NotNull IJsbContextV3 iJsbContextV3) {
        this.f114252a = iJsbContextV3;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object G1(@org.jetbrains.annotations.NotNull com.bilibili.jsb.PrivacyScope r6, @org.jetbrains.annotations.NotNull kntr.base.jsb.api.upper.w r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.uppercenterlocal.jsb.h.G1(com.bilibili.jsb.PrivacyScope, kntr.base.jsb.api.upper.w, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object I0(@org.jetbrains.annotations.NotNull com.bilibili.jsb.PrivacyScope r6, @org.jetbrains.annotations.NotNull kntr.base.jsb.api.upper.H r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.uppercenterlocal.jsb.h.I0(com.bilibili.jsb.PrivacyScope, kntr.base.jsb.api.upper.H, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object O(@org.jetbrains.annotations.NotNull com.bilibili.jsb.PrivacyScope r6, @org.jetbrains.annotations.NotNull kntr.base.jsb.api.upper.B r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r5 = this;
            r0 = r8
            boolean r0 = r0 instanceof com.bilibili.upper.module.uppercenterlocal.jsb.UpperUploadBridge$registerUploadListener$1
            if (r0 == 0) goto L2c
            r0 = r8
            com.bilibili.upper.module.uppercenterlocal.jsb.UpperUploadBridge$registerUploadListener$1 r0 = (com.bilibili.upper.module.uppercenterlocal.jsb.UpperUploadBridge$registerUploadListener$1) r0
            r10 = r0
            r0 = r10
            int r0 = r0.label
            r9 = r0
            r0 = r9
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2c
            r0 = r10
            r1 = r9
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r10
            r8 = r0
            goto L36
        L2c:
            com.bilibili.upper.module.uppercenterlocal.jsb.UpperUploadBridge$registerUploadListener$1 r0 = new com.bilibili.upper.module.uppercenterlocal.jsb.UpperUploadBridge$registerUploadListener$1
            r1 = r0
            r2 = r5
            r3 = r8
            r1.<init>(r2, r3)
            r8 = r0
        L36:
            r0 = r8
            java.lang.Object r0 = r0.result
            r10 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r11 = r0
            r0 = r8
            int r0 = r0.label
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L6f
            r0 = r9
            r1 = 1
            if (r0 != r1) goto L65
            r0 = r8
            java.lang.Object r0 = r0.L$0
            kntr.base.jsb.api.upper.B r0 = (kntr.base.jsb.api.upper.B) r0
            r7 = r0
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r10
            r6 = r0
            goto L9a
        L65:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L6f:
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            java.lang.Class<com.bilibili.upper.module.uppercenterlocal.service.b> r0 = com.bilibili.upper.module.uppercenterlocal.service.b.class
            kotlin.reflect.KClass r0 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r0)
            r10 = r0
            r0 = r8
            r1 = r7
            r0.L$0 = r1
            r0 = r8
            r1 = 1
            r0.label = r1
            r0 = r6
            r1 = r10
            r2 = r8
            java.lang.Object r0 = r0.findController(r1, r2)
            r8 = r0
            r0 = r8
            r6 = r0
            r0 = r8
            r1 = r11
            if (r0 != r1) goto L9a
            r0 = r11
            return r0
        L9a:
            r0 = r6
            com.bilibili.upper.module.uppercenterlocal.service.b r0 = (com.bilibili.upper.module.uppercenterlocal.service.b) r0
            r6 = r0
            r0 = r6
            if (r0 != 0) goto La7
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.emptyFlow()
            return r0
        La7:
            r0 = r6
            r1 = r7
            java.lang.String r1 = r1.a
            r2 = r7
            boolean r2 = r2.b
            r0.S2(r1, r2)
            r0 = r6
            kotlinx.coroutines.flow.SharedFlow r0 = r0.H()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.uppercenterlocal.jsb.h.O(com.bilibili.jsb.PrivacyScope, kntr.base.jsb.api.upper.B, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(@org.jetbrains.annotations.NotNull com.bilibili.jsb.PrivacyScope r8, @org.jetbrains.annotations.NotNull kntr.base.jsb.api.upper.t r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.uppercenterlocal.jsb.h.h(com.bilibili.jsb.PrivacyScope, kntr.base.jsb.api.upper.t, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i1(@org.jetbrains.annotations.NotNull com.bilibili.jsb.PrivacyScope r6, @org.jetbrains.annotations.NotNull kntr.base.jsb.api.upper.l r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.uppercenterlocal.jsb.h.i1(com.bilibili.jsb.PrivacyScope, kntr.base.jsb.api.upper.l, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object u0(@org.jetbrains.annotations.NotNull com.bilibili.jsb.PrivacyScope r6, @org.jetbrains.annotations.NotNull kntr.base.jsb.api.upper.K r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r5 = this;
            r0 = r8
            boolean r0 = r0 instanceof com.bilibili.upper.module.uppercenterlocal.jsb.UpperUploadBridge$unregisterUploadListener$1
            if (r0 == 0) goto L2c
            r0 = r8
            com.bilibili.upper.module.uppercenterlocal.jsb.UpperUploadBridge$unregisterUploadListener$1 r0 = (com.bilibili.upper.module.uppercenterlocal.jsb.UpperUploadBridge$unregisterUploadListener$1) r0
            r10 = r0
            r0 = r10
            int r0 = r0.label
            r9 = r0
            r0 = r9
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2c
            r0 = r10
            r1 = r9
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r10
            r8 = r0
            goto L36
        L2c:
            com.bilibili.upper.module.uppercenterlocal.jsb.UpperUploadBridge$unregisterUploadListener$1 r0 = new com.bilibili.upper.module.uppercenterlocal.jsb.UpperUploadBridge$unregisterUploadListener$1
            r1 = r0
            r2 = r5
            r3 = r8
            r1.<init>(r2, r3)
            r8 = r0
        L36:
            r0 = r8
            java.lang.Object r0 = r0.result
            r10 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r11 = r0
            r0 = r8
            int r0 = r0.label
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L6f
            r0 = r9
            r1 = 1
            if (r0 != r1) goto L65
            r0 = r8
            java.lang.Object r0 = r0.L$0
            kntr.base.jsb.api.upper.K r0 = (kntr.base.jsb.api.upper.K) r0
            r7 = r0
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r10
            r6 = r0
            goto L9a
        L65:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L6f:
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            java.lang.Class<com.bilibili.upper.module.uppercenterlocal.service.b> r0 = com.bilibili.upper.module.uppercenterlocal.service.b.class
            kotlin.reflect.KClass r0 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r0)
            r10 = r0
            r0 = r8
            r1 = r7
            r0.L$0 = r1
            r0 = r8
            r1 = 1
            r0.label = r1
            r0 = r6
            r1 = r10
            r2 = r8
            java.lang.Object r0 = r0.findController(r1, r2)
            r8 = r0
            r0 = r8
            r6 = r0
            r0 = r8
            r1 = r11
            if (r0 != r1) goto L9a
            r0 = r11
            return r0
        L9a:
            r0 = r6
            com.bilibili.upper.module.uppercenterlocal.service.b r0 = (com.bilibili.upper.module.uppercenterlocal.service.b) r0
            r6 = r0
            r0 = r6
            if (r0 != 0) goto La7
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        La7:
            r0 = r6
            r1 = r7
            java.lang.String r1 = r1.a
            r0.I0(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.uppercenterlocal.jsb.h.u0(com.bilibili.jsb.PrivacyScope, kntr.base.jsb.api.upper.K, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object w1(@org.jetbrains.annotations.NotNull com.bilibili.jsb.PrivacyScope r6, @org.jetbrains.annotations.NotNull kntr.base.jsb.api.upper.i r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.uppercenterlocal.jsb.h.w1(com.bilibili.jsb.PrivacyScope, kntr.base.jsb.api.upper.i, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
