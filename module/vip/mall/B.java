package com.bilibili.module.vip.mall;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.module.vip.mall.VipPayResultInfo;
import com.bilibili.okretro.ServiceGenerator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/mall/B.class */
@StabilityInferred(parameters = 0)
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final B f66198a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final VipApiService f66199b = (VipApiService) ServiceGenerator.createService(VipApiService.class);

    public static VipPayResultInfo.VipPayResultDialogContentInfo f(Context context, String str) {
        return new VipPayResultInfo.VipPayResultDialogContentInfo(context.getString(2131857834), context.getString(2131857899, String.valueOf(BiliAccounts.get(context).mid()), str), false, context.getString(2131857836), null, context.getString(2131857888), AX.f.a("vip", "url_open_record", "https://big.bilibili.com/mobile/openrecord"), null, "https://i0.hdslb.com/bfs/activity-plat/static/20220906/a5480f18ac08c1e30876e3fde84db784/ex07HNJx7P.png", 1928, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.content.Context r18, androidx.fragment.app.FragmentManager r19, java.util.Map r20, java.lang.String r21, com.bilibili.vip.VipPrivilegeType r22, kotlin.coroutines.jvm.internal.ContinuationImpl r23) {
        /*
            Method dump skipped, instruction units count: 955
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.module.vip.mall.B.a(android.content.Context, androidx.fragment.app.FragmentManager, java.util.Map, java.lang.String, com.bilibili.vip.VipPrivilegeType, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull android.content.Context r9, @org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentManager r10, @org.jetbrains.annotations.NotNull com.bilibili.vip.VipBuyParams r11, @org.jetbrains.annotations.Nullable com.bilibili.vip.VipPrivilegeType r12, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            r8 = this;
            r0 = r13
            boolean r0 = r0 instanceof com.bilibili.module.vip.mall.VipPurchaseService$buyVip$1
            if (r0 == 0) goto L2f
            r0 = r13
            com.bilibili.module.vip.mall.VipPurchaseService$buyVip$1 r0 = (com.bilibili.module.vip.mall.VipPurchaseService$buyVip$1) r0
            r15 = r0
            r0 = r15
            int r0 = r0.label
            r14 = r0
            r0 = r14
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2f
            r0 = r15
            r1 = r14
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r15
            r13 = r0
        L2c:
            goto L3e
        L2f:
            com.bilibili.module.vip.mall.VipPurchaseService$buyVip$1 r0 = new com.bilibili.module.vip.mall.VipPurchaseService$buyVip$1
            r1 = r0
            r2 = r8
            r3 = r13
            r1.<init>(r2, r3)
            r13 = r0
            goto L2c
        L3e:
            r0 = r13
            java.lang.Object r0 = r0.result
            r16 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r15 = r0
            r0 = r13
            int r0 = r0.label
            r14 = r0
            r0 = r14
            if (r0 == 0) goto L77
            r0 = r14
            r1 = 1
            if (r0 != r1) goto L6d
            r0 = r16
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r16
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.unbox-impl()
            r9 = r0
            goto Lb6
        L6d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L77:
            r0 = r16
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r11
            com.google.gson.JsonElement r0 = com.bilibili.okretro.call.json.JsonUtilKt.toJsonTree(r0)
            com.bilibili.module.vip.mall.w r1 = new com.bilibili.module.vip.mall.w
            r2 = r1
            r2.<init>()
            java.lang.reflect.Type r1 = r1.getType()
            java.lang.Object r0 = com.bilibili.okretro.call.json.JsonUtilKt.parseJson(r0, r1)
            java.util.Map r0 = (java.util.Map) r0
            r16 = r0
            r0 = r11
            java.lang.String r0 = r0.b()
            r11 = r0
            r0 = r13
            r1 = 1
            r0.label = r1
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r16
            r4 = r11
            r5 = r12
            r6 = r13
            java.lang.Object r0 = r0.a(r1, r2, r3, r4, r5, r6)
            r10 = r0
            r0 = r10
            r9 = r0
            r0 = r10
            r1 = r15
            if (r0 != r1) goto Lb6
            r0 = r15
            return r0
        Lb6:
            r0 = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.module.vip.mall.B.b(android.content.Context, androidx.fragment.app.FragmentManager, com.bilibili.vip.VipBuyParams, com.bilibili.vip.VipPrivilegeType, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, java.util.concurrent.Callable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(android.content.Context r8, java.lang.String r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.module.vip.mall.B.c(android.content.Context, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(android.content.Context r10, com.bilibili.module.vip.mall.VipSkuPlatformUseType r11, java.lang.String r12, java.lang.String r13, com.bilibili.vip.VipPrivilegeType r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            r9 = this;
            r0 = r15
            boolean r0 = r0 instanceof com.bilibili.module.vip.mall.VipPurchaseService$checkOrder$1
            if (r0 == 0) goto L2f
            r0 = r15
            com.bilibili.module.vip.mall.VipPurchaseService$checkOrder$1 r0 = (com.bilibili.module.vip.mall.VipPurchaseService$checkOrder$1) r0
            r17 = r0
            r0 = r17
            int r0 = r0.label
            r16 = r0
            r0 = r16
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2f
            r0 = r17
            r1 = r16
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r17
            r15 = r0
            goto L3b
        L2f:
            com.bilibili.module.vip.mall.VipPurchaseService$checkOrder$1 r0 = new com.bilibili.module.vip.mall.VipPurchaseService$checkOrder$1
            r1 = r0
            r2 = r9
            r3 = r15
            r1.<init>(r2, r3)
            r15 = r0
        L3b:
            r0 = r15
            java.lang.Object r0 = r0.result
            r17 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r18 = r0
            r0 = r15
            int r0 = r0.label
            r16 = r0
            r0 = r16
            if (r0 == 0) goto L6e
            r0 = r16
            r1 = 1
            if (r0 != r1) goto L64
            r0 = r17
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r17
            r10 = r0
            goto Lb7
        L64:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L6e:
            r0 = r17
            kotlin.ResultKt.throwOnFailure(r0)
            com.bilibili.module.vip.mall.VipPurchaseService$checkOrder$2 r0 = new com.bilibili.module.vip.mall.VipPurchaseService$checkOrder$2
            r1 = r0
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r10
            r7 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.flow(r0)
            r1 = 5
            com.bilibili.module.vip.mall.VipPurchaseService$checkOrder$3 r2 = new com.bilibili.module.vip.mall.VipPurchaseService$checkOrder$3
            r3 = r2
            r4 = 0
            r3.<init>(r4)
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.retry(r0, r1, r2)
            com.bilibili.module.vip.mall.VipPurchaseService$checkOrder$4 r1 = new com.bilibili.module.vip.mall.VipPurchaseService$checkOrder$4
            r2 = r1
            r3 = 0
            r2.<init>(r3)
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.catch(r0, r1)
            r10 = r0
            r0 = r15
            r1 = 1
            r0.label = r1
            r0 = r10
            r1 = r15
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt.first(r0, r1)
            r11 = r0
            r0 = r11
            r10 = r0
            r0 = r11
            r1 = r18
            if (r0 != r1) goto Lb7
            r0 = r18
            return r0
        Lb7:
            r0 = r10
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.unbox-impl()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.module.vip.mall.B.d(android.content.Context, com.bilibili.module.vip.mall.VipSkuPlatformUseType, java.lang.String, java.lang.String, com.bilibili.vip.VipPrivilegeType, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.gson.JsonSyntaxException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(android.content.Context r18, java.util.Map r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) throws com.google.gson.JsonSyntaxException {
        /*
            Method dump skipped, instruction units count: 633
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.module.vip.mall.B.e(android.content.Context, java.util.Map, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(android.content.Context r8, com.alibaba.fastjson.JSONObject r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.module.vip.mall.B.g(android.content.Context, com.alibaba.fastjson.JSONObject, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
