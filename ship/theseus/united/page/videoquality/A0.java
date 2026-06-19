package com.bilibili.ship.theseus.united.page.videoquality;

import Vr0.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.accountinfo.BiliAccountInfo;
import com.bilibili.lib.accounts.BiliAccounts;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/A0.class */
@StabilityInferred(parameters = 0)
public final class A0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f103689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.d f103690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final BiliAccounts f103691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final BiliAccountInfo f103692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Lazy f103693e = LazyKt.lazy(new CB.h(this, 3));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<b.C0134b> f103694f = StateFlowKt.MutableStateFlow((Object) null);

    @Inject
    public A0(@NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull com.bilibili.ship.theseus.united.page.view.d dVar, @NotNull BiliAccounts biliAccounts, @NotNull BiliAccountInfo biliAccountInfo) {
        this.f103689a = hVar;
        this.f103690b = dVar;
        this.f103691c = biliAccounts;
        this.f103692d = biliAccountInfo;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.videoquality.A0.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            r0 = r6
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.videoquality.VipViewMaterialRepository$updateVipViewMaterial$1
            if (r0 == 0) goto L25
            r0 = r6
            com.bilibili.ship.theseus.united.page.videoquality.VipViewMaterialRepository$updateVipViewMaterial$1 r0 = (com.bilibili.ship.theseus.united.page.videoquality.VipViewMaterialRepository$updateVipViewMaterial$1) r0
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
            com.bilibili.ship.theseus.united.page.videoquality.VipViewMaterialRepository$updateVipViewMaterial$1 r0 = new com.bilibili.ship.theseus.united.page.videoquality.VipViewMaterialRepository$updateVipViewMaterial$1
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
            if (r0 == 0) goto L60
            r0 = r7
            r1 = 1
            if (r0 != r1) goto L56
            r0 = r6
            java.lang.Object r0 = r0.L$0
            com.bilibili.ship.theseus.united.page.videoquality.A0 r0 = (com.bilibili.ship.theseus.united.page.videoquality.A0) r0
            r6 = r0
            r0 = r8
            kotlin.ResultKt.throwOnFailure(r0)
            goto L7f
        L56:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L60:
            r0 = r8
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r6
            r1 = r5
            r0.L$0 = r1
            r0 = r6
            r1 = 1
            r0.label = r1
            r0 = r5
            r1 = r6
            java.lang.Object r0 = r0.a(r1)
            r8 = r0
            r0 = r8
            r1 = r9
            if (r0 != r1) goto L7d
            r0 = r9
            return r0
        L7d:
            r0 = r5
            r6 = r0
        L7f:
            r0 = r8
            Vr0.b$b r0 = (Vr0.b.C0134b) r0
            r8 = r0
            r0 = r6
            kotlinx.coroutines.flow.MutableStateFlow<Vr0.b$b> r0 = r0.f103694f
            r1 = r8
            r0.setValue(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.videoquality.A0.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
