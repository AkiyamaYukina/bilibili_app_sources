package com.bilibili.ship.theseus.ogv.vip.playerlayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.panel.IPlayerLayer;
import tv.danmaku.biliplayerv2.service.B;
import tv.danmaku.biliplayerv2.service.WindowInset;
import zu0.q1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/vip/playerlayer/a.class */
@StabilityInferred(parameters = 0)
public final class a implements IPlayerLayer<View>, B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final q1 f94856a;

    public a(@NotNull Context context, @NotNull e eVar, @NotNull WindowInset windowInset) {
        q1 q1VarInflate = q1.inflate(LayoutInflater.from(context), null, false);
        q1VarInflate.getRoot().setPadding(windowInset.getLeftPadding(), windowInset.getTopPadding(), windowInset.getRightPadding(), windowInset.getBottomPadding());
        q1VarInflate.q(eVar);
        this.f94856a = q1VarInflate;
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
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.ogv.vip.playerlayer.OgvVipBarPlayerLayer$getVipBarExpandedWidth$1
            if (r0 == 0) goto L25
            r0 = r6
            com.bilibili.ship.theseus.ogv.vip.playerlayer.OgvVipBarPlayerLayer$getVipBarExpandedWidth$1 r0 = (com.bilibili.ship.theseus.ogv.vip.playerlayer.OgvVipBarPlayerLayer$getVipBarExpandedWidth$1) r0
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
            com.bilibili.ship.theseus.ogv.vip.playerlayer.OgvVipBarPlayerLayer$getVipBarExpandedWidth$1 r0 = new com.bilibili.ship.theseus.ogv.vip.playerlayer.OgvVipBarPlayerLayer$getVipBarExpandedWidth$1
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
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r6 = r0
            r0 = r8
            kotlin.ResultKt.throwOnFailure(r0)
            goto L85
        L56:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L60:
            r0 = r8
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r5
            zu0.q1 r0 = r0.f94856a
            androidx.constraintlayout.widget.ConstraintLayout r0 = r0.f130845D
            r8 = r0
            r0 = r6
            r1 = r8
            r0.L$0 = r1
            r0 = r6
            r1 = 1
            r0.label = r1
            r0 = r8
            r1 = r6
            java.lang.Object r0 = com.bilibili.ogv.infra.android.view.d.a(r0, r1)
            r1 = r9
            if (r0 != r1) goto L83
            r0 = r9
            return r0
        L83:
            r0 = r8
            r6 = r0
        L85:
            r0 = r6
            int r0 = r0.getWidth()
            float r0 = (float) r0
            java.lang.Float r0 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.vip.playerlayer.a.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @NotNull
    public final View getView() {
        return this.f94856a.getRoot();
    }

    public final void onWindowInsetChanged(@NotNull WindowInset windowInset) {
        this.f94856a.getRoot().setPadding(windowInset.getLeftPadding(), windowInset.getTopPadding(), windowInset.getRightPadding(), windowInset.getBottomPadding());
    }
}
