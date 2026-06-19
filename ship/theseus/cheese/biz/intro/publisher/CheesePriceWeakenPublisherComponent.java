package com.bilibili.ship.theseus.cheese.biz.intro.publisher;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.viewbinding.ViewBinding;
import fu0.C7178E;
import nu0.C8143b;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.utils.DpUtils;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/publisher/CheesePriceWeakenPublisherComponent.class */
@StabilityInferred(parameters = 0)
public final class CheesePriceWeakenPublisherComponent extends com.bilibili.app.gemini.ui.m<C7178E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final C6112h f89811a;

    public CheesePriceWeakenPublisherComponent(@NotNull C6112h c6112h) {
        this.f89811a = c6112h;
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C7178E c7178eInflate = C7178E.inflate(layoutInflater, viewGroup, false);
        c7178eInflate.f119428c.addItemDecoration(new C8143b(0, (int) DpUtils.dp2px(context, 8.0f), (int) DpUtils.dp2px(context, 10.0f)));
        return c7178eInflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull fu0.C7178E r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            r0 = r8
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.cheese.biz.intro.publisher.CheesePriceWeakenPublisherComponent$bind$1
            if (r0 == 0) goto L29
            r0 = r8
            com.bilibili.ship.theseus.cheese.biz.intro.publisher.CheesePriceWeakenPublisherComponent$bind$1 r0 = (com.bilibili.ship.theseus.cheese.biz.intro.publisher.CheesePriceWeakenPublisherComponent$bind$1) r0
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
            com.bilibili.ship.theseus.cheese.biz.intro.publisher.CheesePriceWeakenPublisherComponent$bind$1 r0 = new com.bilibili.ship.theseus.cheese.biz.intro.publisher.CheesePriceWeakenPublisherComponent$bind$1
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            r8 = r0
        L33:
            r0 = r8
            java.lang.Object r0 = r0.result
            r11 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r10 = r0
            r0 = r8
            int r0 = r0.label
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L66
            r0 = r9
            r1 = 1
            if (r0 != r1) goto L5c
            r0 = r8
            java.lang.Object r0 = r0.L$0
            fu0.E r0 = (fu0.C7178E) r0
            r7 = r0
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)
            goto L8f
        L5c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L66:
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)
            com.bilibili.ship.theseus.cheese.biz.intro.publisher.CheesePriceWeakenPublisherComponent$bind$2 r0 = new com.bilibili.ship.theseus.cheese.biz.intro.publisher.CheesePriceWeakenPublisherComponent$bind$2
            r1 = r0
            r2 = r6
            r3 = r7
            r4 = 0
            r1.<init>(r2, r3, r4)
            r11 = r0
            r0 = r8
            r1 = r7
            r0.L$0 = r1
            r0 = r8
            r1 = 1
            r0.label = r1
            r0 = r11
            r1 = r8
            java.lang.Object r0 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r0, r1)
            r1 = r10
            if (r0 != r1) goto L8f
            r0 = r10
            return r0
        L8f:
            r0 = r7
            androidx.recyclerview.widget.RecyclerView r0 = r0.f119428c
            r8 = r0
            r0 = r6
            com.bilibili.ship.theseus.cheese.biz.intro.publisher.h r0 = r0.f89811a
            r10 = r0
            r0 = r8
            r1 = 0
            r2 = r10
            com.bilibili.ship.theseus.cheese.biz.intro.publisher.E r2 = r2.f89862a
            com.bilibili.ship.theseus.cheese.biz.intro.publisher.F r2 = r2.f89840d
            r3 = r10
            com.bilibili.ship.theseus.cheese.biz.intro.publisher.q r3 = r3.f89864c
            r4 = r10
            By0.H0 r4 = r4.f89865d
            com.bilibili.ship.theseus.cheese.biz.intro.publisher.H.a(r0, r1, r2, r3, r4)
            r0 = r7
            android.widget.TextView r0 = r0.f119429d
            r1 = r10
            com.bilibili.ship.theseus.cheese.biz.intro.publisher.E r1 = r1.f89862a
            eu0.w r1 = r1.f89837a
            java.lang.String r1 = r1.f117589a
            r0.setText(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.intro.publisher.CheesePriceWeakenPublisherComponent.a(fu0.E, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
