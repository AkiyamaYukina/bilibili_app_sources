package com.bilibili.ship.theseus.united.page.videoquality;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videoquality.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/j.class */
public interface InterfaceC6436j {
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object b(com.bilibili.ship.theseus.united.page.videoquality.InterfaceC6436j r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws kotlin.KotlinNothingValueException {
        /*
            r0 = r6
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.videoquality.QualityActions$awaitForAutoTrial$1
            if (r0 == 0) goto L25
            r0 = r6
            com.bilibili.ship.theseus.united.page.videoquality.QualityActions$awaitForAutoTrial$1 r0 = (com.bilibili.ship.theseus.united.page.videoquality.QualityActions$awaitForAutoTrial$1) r0
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
            r5 = r0
            goto L2f
        L25:
            com.bilibili.ship.theseus.united.page.videoquality.QualityActions$awaitForAutoTrial$1 r0 = new com.bilibili.ship.theseus.united.page.videoquality.QualityActions$awaitForAutoTrial$1
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            r5 = r0
        L2f:
            r0 = r5
            java.lang.Object r0 = r0.result
            r6 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r8 = r0
            r0 = r5
            int r0 = r0.label
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L57
            r0 = r7
            r1 = 1
            if (r0 == r1) goto L50
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L50:
            r0 = r6
            kotlin.ResultKt.throwOnFailure(r0)
            goto L6a
        L57:
            r0 = r6
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r5
            r1 = 1
            r0.label = r1
            r0 = r5
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.awaitCancellation(r0)
            r1 = r8
            if (r0 != r1) goto L6a
            r0 = r8
            return r0
        L6a:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r1 = r0
            r1.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.videoquality.InterfaceC6436j.b(com.bilibili.ship.theseus.united.page.videoquality.j, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    void a(int i7, @Nullable String str);

    @NotNull
    C6426a c(@NotNull BuyVipScene buyVipScene, @Nullable com.bilibili.player.tangram.basic.a aVar);

    default boolean d(int i7) {
        return false;
    }

    @Nullable
    default Object e(long j7, @NotNull Continuation<? super Unit> continuation) {
        Object obj = DelayKt.delay-VtjQ1oo(j7, continuation);
        if (obj != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            obj = Unit.INSTANCE;
        }
        return obj;
    }

    @Nullable
    default Object f(@NotNull vk.e eVar, @NotNull Continuation<? super Unit> continuation) {
        return b(this, (ContinuationImpl) continuation);
    }

    default boolean g() {
        return false;
    }
}
