package com.bilibili.upper.module.uppercenterlocal.jsb;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.credentials.p;
import com.alibaba.fastjson.JSON;
import com.bilibili.app.comm.rubick.api.IJsbContextV3;
import com.bilibili.jsb.PrivacyScope;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.MutableBundleLike;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.upper.api.bean.centerv4.UpperMainInspirationBean;
import com.bilibili.upper.api.bean.uppercenter.Inspiration;
import com.bilibili.upper.api.bean.uppercenter.UpperInspirationCategory;
import com.google.gson.Gson;
import eJ0.r;
import java.util.List;
import kntr.base.jsb.api.upper.E;
import kntr.base.jsb.api.upper.UpperArchiveJsbServiceApi;
import kntr.base.jsb.api.upper.s;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import o21.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q4.M;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenterlocal/jsb/d.class */
@StabilityInferred(parameters = 0)
public final class d implements UpperArchiveJsbServiceApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final IJsbContextV3 f114248a;

    public d(@NotNull IJsbContextV3 iJsbContextV3) {
        this.f114248a = iJsbContextV3;
    }

    @Nullable
    public final Unit A(@NotNull E e7) {
        String str = e7.c;
        if (StringsKt.isBlank(str)) {
            return Unit.INSTANCE;
        }
        final int i7 = 0;
        BLRouter.routeTo(new RouteRequest.Builder(Uri.parse("activity://uper/transweb/")).data(Uri.parse(str)).extras(new Function1(i7) { // from class: com.bilibili.upper.module.uppercenterlocal.jsb.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f114247a;

            {
                this.f114247a = i7;
            }

            public final Object invoke(Object obj) {
                switch (this.f114247a) {
                    case 0:
                        ((MutableBundleLike) obj).put("param_control", p.a("intent_hide_close", "intent_is_bg_trans", true, true));
                        return Unit.INSTANCE;
                    case 1:
                        return Unit.INSTANCE;
                    case 2:
                        return Integer.valueOf(((a.c.c) obj).h.d);
                    default:
                        MutableBundleLike mutableBundleLike = (MutableBundleLike) obj;
                        mutableBundleLike.put("scene", "main");
                        mutableBundleLike.put("key_prompt_scene", "main.my-information.my-login.0.click");
                        mutableBundleLike.put("from_spmid", "main.my-information.my-login.0");
                        return Unit.INSTANCE;
                }
            }
        }).build(), this.f114248a.getContext());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object C(@org.jetbrains.annotations.NotNull com.bilibili.jsb.PrivacyScope r6, @org.jetbrains.annotations.NotNull kntr.base.jsb.api.upper.M r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r5 = this;
            r0 = r8
            boolean r0 = r0 instanceof com.bilibili.upper.module.uppercenterlocal.jsb.UpperArchiveBridge$setUse4GUploadStatus$1
            if (r0 == 0) goto L2c
            r0 = r8
            com.bilibili.upper.module.uppercenterlocal.jsb.UpperArchiveBridge$setUse4GUploadStatus$1 r0 = (com.bilibili.upper.module.uppercenterlocal.jsb.UpperArchiveBridge$setUse4GUploadStatus$1) r0
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
            com.bilibili.upper.module.uppercenterlocal.jsb.UpperArchiveBridge$setUse4GUploadStatus$1 r0 = new com.bilibili.upper.module.uppercenterlocal.jsb.UpperArchiveBridge$setUse4GUploadStatus$1
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
            kntr.base.jsb.api.upper.M r0 = (kntr.base.jsb.api.upper.M) r0
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
            boolean r1 = r1.a
            r0.a1(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.uppercenterlocal.jsb.d.C(com.bilibili.jsb.PrivacyScope, kntr.base.jsb.api.upper.M, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object C0(@org.jetbrains.annotations.NotNull com.bilibili.jsb.PrivacyScope r6, @org.jetbrains.annotations.NotNull kntr.base.jsb.api.upper.g r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r5 = this;
            r0 = r8
            boolean r0 = r0 instanceof com.bilibili.upper.module.uppercenterlocal.jsb.UpperArchiveBridge$cancelArchiveTask$1
            if (r0 == 0) goto L2c
            r0 = r8
            com.bilibili.upper.module.uppercenterlocal.jsb.UpperArchiveBridge$cancelArchiveTask$1 r0 = (com.bilibili.upper.module.uppercenterlocal.jsb.UpperArchiveBridge$cancelArchiveTask$1) r0
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
            com.bilibili.upper.module.uppercenterlocal.jsb.UpperArchiveBridge$cancelArchiveTask$1 r0 = new com.bilibili.upper.module.uppercenterlocal.jsb.UpperArchiveBridge$cancelArchiveTask$1
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
            kntr.base.jsb.api.upper.g r0 = (kntr.base.jsb.api.upper.g) r0
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
            long r1 = r1.a
            r2 = r7
            boolean r2 = r2.b
            r0.O2(r1, r2)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.uppercenterlocal.jsb.d.C0(com.bilibili.jsb.PrivacyScope, kntr.base.jsb.api.upper.g, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object F(@org.jetbrains.annotations.NotNull com.bilibili.jsb.PrivacyScope r6, @org.jetbrains.annotations.NotNull kntr.base.jsb.api.upper.A r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r5 = this;
            r0 = r8
            boolean r0 = r0 instanceof com.bilibili.upper.module.uppercenterlocal.jsb.UpperArchiveBridge$registerArchiveTaskListener$1
            if (r0 == 0) goto L2c
            r0 = r8
            com.bilibili.upper.module.uppercenterlocal.jsb.UpperArchiveBridge$registerArchiveTaskListener$1 r0 = (com.bilibili.upper.module.uppercenterlocal.jsb.UpperArchiveBridge$registerArchiveTaskListener$1) r0
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
            com.bilibili.upper.module.uppercenterlocal.jsb.UpperArchiveBridge$registerArchiveTaskListener$1 r0 = new com.bilibili.upper.module.uppercenterlocal.jsb.UpperArchiveBridge$registerArchiveTaskListener$1
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
            kntr.base.jsb.api.upper.A r0 = (kntr.base.jsb.api.upper.A) r0
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
            java.lang.Long r1 = r1.a
            r0.f2(r1)
            r0 = r6
            kotlinx.coroutines.flow.SharedFlow r0 = r0.I()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.uppercenterlocal.jsb.d.F(com.bilibili.jsb.PrivacyScope, kntr.base.jsb.api.upper.A, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object K(@org.jetbrains.annotations.NotNull com.bilibili.jsb.PrivacyScope r6, @org.jetbrains.annotations.NotNull kntr.base.jsb.api.upper.y r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.uppercenterlocal.jsb.d.K(com.bilibili.jsb.PrivacyScope, kntr.base.jsb.api.upper.y, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Nullable
    public final Unit O1(@NotNull kntr.base.jsb.api.upper.a aVar) {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            Inspiration inspiration = (Inspiration) new Gson().fromJson(aVar.a, Inspiration.class);
            Lazy<r> lazy = r.f117287g;
            r.a.a().a(inspiration);
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            M.b("addInspirationRecord parse error: ", th2.getMessage(), "UpperArchiveBridge");
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object W(@org.jetbrains.annotations.NotNull com.bilibili.jsb.PrivacyScope r6, @org.jetbrains.annotations.NotNull kntr.base.jsb.api.upper.J r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r5 = this;
            r0 = r8
            boolean r0 = r0 instanceof com.bilibili.upper.module.uppercenterlocal.jsb.UpperArchiveBridge$unregisterArchiveTaskListener$1
            if (r0 == 0) goto L2c
            r0 = r8
            com.bilibili.upper.module.uppercenterlocal.jsb.UpperArchiveBridge$unregisterArchiveTaskListener$1 r0 = (com.bilibili.upper.module.uppercenterlocal.jsb.UpperArchiveBridge$unregisterArchiveTaskListener$1) r0
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
            com.bilibili.upper.module.uppercenterlocal.jsb.UpperArchiveBridge$unregisterArchiveTaskListener$1 r0 = new com.bilibili.upper.module.uppercenterlocal.jsb.UpperArchiveBridge$unregisterArchiveTaskListener$1
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
            kntr.base.jsb.api.upper.J r0 = (kntr.base.jsb.api.upper.J) r0
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
            java.lang.Long r1 = r1.a
            r0.i4(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.uppercenterlocal.jsb.d.W(com.bilibili.jsb.PrivacyScope, kntr.base.jsb.api.upper.J, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Y(@org.jetbrains.annotations.NotNull com.bilibili.jsb.PrivacyScope r6, @org.jetbrains.annotations.NotNull kntr.base.jsb.api.upper.f r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r5 = this;
            r0 = r8
            boolean r0 = r0 instanceof com.bilibili.upper.module.uppercenterlocal.jsb.UpperArchiveBridge$startArchiveTask$1
            if (r0 == 0) goto L2c
            r0 = r8
            com.bilibili.upper.module.uppercenterlocal.jsb.UpperArchiveBridge$startArchiveTask$1 r0 = (com.bilibili.upper.module.uppercenterlocal.jsb.UpperArchiveBridge$startArchiveTask$1) r0
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
            com.bilibili.upper.module.uppercenterlocal.jsb.UpperArchiveBridge$startArchiveTask$1 r0 = new com.bilibili.upper.module.uppercenterlocal.jsb.UpperArchiveBridge$startArchiveTask$1
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
            kntr.base.jsb.api.upper.f r0 = (kntr.base.jsb.api.upper.f) r0
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
            long r1 = r1.a
            r0.f1(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.uppercenterlocal.jsb.d.Y(com.bilibili.jsb.PrivacyScope, kntr.base.jsb.api.upper.f, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Nullable
    public final Object getTrackId(@NotNull PrivacyScope privacyScope, @NotNull Continuation<? super s> continuation) {
        return new s(Xz0.g.d());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i0(@org.jetbrains.annotations.NotNull com.bilibili.jsb.PrivacyScope r6, @org.jetbrains.annotations.NotNull kntr.base.jsb.api.upper.f r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r5 = this;
            r0 = r8
            boolean r0 = r0 instanceof com.bilibili.upper.module.uppercenterlocal.jsb.UpperArchiveBridge$pendingArchiveTask$1
            if (r0 == 0) goto L2c
            r0 = r8
            com.bilibili.upper.module.uppercenterlocal.jsb.UpperArchiveBridge$pendingArchiveTask$1 r0 = (com.bilibili.upper.module.uppercenterlocal.jsb.UpperArchiveBridge$pendingArchiveTask$1) r0
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
            com.bilibili.upper.module.uppercenterlocal.jsb.UpperArchiveBridge$pendingArchiveTask$1 r0 = new com.bilibili.upper.module.uppercenterlocal.jsb.UpperArchiveBridge$pendingArchiveTask$1
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
            kntr.base.jsb.api.upper.f r0 = (kntr.base.jsb.api.upper.f) r0
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
            long r1 = r1.a
            r0.I3(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.uppercenterlocal.jsb.d.i0(com.bilibili.jsb.PrivacyScope, kntr.base.jsb.api.upper.f, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(@org.jetbrains.annotations.NotNull com.bilibili.jsb.PrivacyScope r6, @org.jetbrains.annotations.NotNull kntr.base.jsb.api.upper.f r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r5 = this;
            r0 = r8
            boolean r0 = r0 instanceof com.bilibili.upper.module.uppercenterlocal.jsb.UpperArchiveBridge$pauseArchiveTask$1
            if (r0 == 0) goto L2c
            r0 = r8
            com.bilibili.upper.module.uppercenterlocal.jsb.UpperArchiveBridge$pauseArchiveTask$1 r0 = (com.bilibili.upper.module.uppercenterlocal.jsb.UpperArchiveBridge$pauseArchiveTask$1) r0
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
            com.bilibili.upper.module.uppercenterlocal.jsb.UpperArchiveBridge$pauseArchiveTask$1 r0 = new com.bilibili.upper.module.uppercenterlocal.jsb.UpperArchiveBridge$pauseArchiveTask$1
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
            kntr.base.jsb.api.upper.f r0 = (kntr.base.jsb.api.upper.f) r0
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
            long r1 = r1.a
            r0.Q5(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.uppercenterlocal.jsb.d.m(com.bilibili.jsb.PrivacyScope, kntr.base.jsb.api.upper.f, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m1(@org.jetbrains.annotations.NotNull com.bilibili.jsb.PrivacyScope r12, @org.jetbrains.annotations.NotNull kntr.base.jsb.api.upper.n r13, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.uppercenterlocal.jsb.d.m1(com.bilibili.jsb.PrivacyScope, kntr.base.jsb.api.upper.n, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Nullable
    public final Unit n0(@NotNull kntr.base.jsb.api.upper.b bVar) {
        Object obj;
        if (StringsKt.isBlank(bVar.a)) {
            return Unit.INSTANCE;
        }
        try {
            Result.Companion companion = Result.Companion;
            UpperMainInspirationBean upperMainInspirationBean = (UpperMainInspirationBean) JSON.parseObject(bVar.a, UpperMainInspirationBean.class);
            Lazy<r> lazy = r.f117287g;
            r.a.a().b(upperMainInspirationBean != null ? upperMainInspirationBean.getInspirationConf() : null);
            r rVarA = r.a.a();
            List<UpperInspirationCategory> list = null;
            if (upperMainInspirationBean != null) {
                list = upperMainInspirationBean.getList();
            }
            rVarA.c(list);
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            M.b("applyInspirationRecommendData parse error: ", th2.getMessage(), "UpperArchiveBridge");
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r1(@org.jetbrains.annotations.NotNull com.bilibili.jsb.PrivacyScope r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            r0 = r7
            boolean r0 = r0 instanceof com.bilibili.upper.module.uppercenterlocal.jsb.UpperArchiveBridge$getUse4GUploadStatus$1
            if (r0 == 0) goto L29
            r0 = r7
            com.bilibili.upper.module.uppercenterlocal.jsb.UpperArchiveBridge$getUse4GUploadStatus$1 r0 = (com.bilibili.upper.module.uppercenterlocal.jsb.UpperArchiveBridge$getUse4GUploadStatus$1) r0
            r9 = r0
            r0 = r9
            int r0 = r0.label
            r8 = r0
            r0 = r8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L29
            r0 = r9
            r1 = r8
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r9
            r7 = r0
            goto L33
        L29:
            com.bilibili.upper.module.uppercenterlocal.jsb.UpperArchiveBridge$getUse4GUploadStatus$1 r0 = new com.bilibili.upper.module.uppercenterlocal.jsb.UpperArchiveBridge$getUse4GUploadStatus$1
            r1 = r0
            r2 = r5
            r3 = r7
            r1.<init>(r2, r3)
            r7 = r0
        L33:
            r0 = r7
            java.lang.Object r0 = r0.result
            r9 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r10 = r0
            r0 = r7
            int r0 = r0.label
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L61
            r0 = r8
            r1 = 1
            if (r0 != r1) goto L57
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r9
            r6 = r0
            goto L87
        L57:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L61:
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            java.lang.Class<com.bilibili.upper.module.uppercenterlocal.service.b> r0 = com.bilibili.upper.module.uppercenterlocal.service.b.class
            kotlin.reflect.KClass r0 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r0)
            r9 = r0
            r0 = r7
            r1 = 1
            r0.label = r1
            r0 = r6
            r1 = r9
            r2 = r7
            java.lang.Object r0 = r0.findController(r1, r2)
            r7 = r0
            r0 = r7
            r6 = r0
            r0 = r7
            r1 = r10
            if (r0 != r1) goto L87
            r0 = r10
            return r0
        L87:
            r0 = r6
            com.bilibili.upper.module.uppercenterlocal.service.b r0 = (com.bilibili.upper.module.uppercenterlocal.service.b) r0
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L99
            kntr.base.jsb.api.upper.M r0 = new kntr.base.jsb.api.upper.M
            r1 = r0
            r2 = 0
            r1.<init>(r2)
            return r0
        L99:
            kntr.base.jsb.api.upper.M r0 = new kntr.base.jsb.api.upper.M
            r1 = r0
            r2 = r6
            boolean r2 = r2.i1()
            r1.<init>(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.uppercenterlocal.jsb.d.r1(com.bilibili.jsb.PrivacyScope, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object u(@org.jetbrains.annotations.NotNull com.bilibili.jsb.PrivacyScope r6, @org.jetbrains.annotations.NotNull kntr.base.jsb.api.upper.f r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r5 = this;
            r0 = r8
            boolean r0 = r0 instanceof com.bilibili.upper.module.uppercenterlocal.jsb.UpperArchiveBridge$interruptArchiveTask$1
            if (r0 == 0) goto L2c
            r0 = r8
            com.bilibili.upper.module.uppercenterlocal.jsb.UpperArchiveBridge$interruptArchiveTask$1 r0 = (com.bilibili.upper.module.uppercenterlocal.jsb.UpperArchiveBridge$interruptArchiveTask$1) r0
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
            com.bilibili.upper.module.uppercenterlocal.jsb.UpperArchiveBridge$interruptArchiveTask$1 r0 = new com.bilibili.upper.module.uppercenterlocal.jsb.UpperArchiveBridge$interruptArchiveTask$1
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
            kntr.base.jsb.api.upper.f r0 = (kntr.base.jsb.api.upper.f) r0
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
            long r1 = r1.a
            r0.D0(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.uppercenterlocal.jsb.d.u(com.bilibili.jsb.PrivacyScope, kntr.base.jsb.api.upper.f, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object x0(@org.jetbrains.annotations.NotNull com.bilibili.jsb.PrivacyScope r6, @org.jetbrains.annotations.NotNull kntr.base.jsb.api.upper.f r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r5 = this;
            r0 = r8
            boolean r0 = r0 instanceof com.bilibili.upper.module.uppercenterlocal.jsb.UpperArchiveBridge$quickStartArchiveTask$1
            if (r0 == 0) goto L2c
            r0 = r8
            com.bilibili.upper.module.uppercenterlocal.jsb.UpperArchiveBridge$quickStartArchiveTask$1 r0 = (com.bilibili.upper.module.uppercenterlocal.jsb.UpperArchiveBridge$quickStartArchiveTask$1) r0
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
            com.bilibili.upper.module.uppercenterlocal.jsb.UpperArchiveBridge$quickStartArchiveTask$1 r0 = new com.bilibili.upper.module.uppercenterlocal.jsb.UpperArchiveBridge$quickStartArchiveTask$1
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
            kntr.base.jsb.api.upper.f r0 = (kntr.base.jsb.api.upper.f) r0
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
            long r1 = r1.a
            r0.W2(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.uppercenterlocal.jsb.d.x0(com.bilibili.jsb.PrivacyScope, kntr.base.jsb.api.upper.f, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
