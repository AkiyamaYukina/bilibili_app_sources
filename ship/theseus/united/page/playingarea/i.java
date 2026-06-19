package com.bilibili.ship.theseus.united.page.playingarea;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.HashSet;
import javax.inject.Inject;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/i.class */
@StabilityInferred(parameters = 0)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final HashSet<Object> f102365a = new HashSet<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f102366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f102367c;

    @Inject
    public i() {
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f102366b = MutableStateFlow;
        this.f102367c = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final void a(@NotNull Object obj) {
        this.f102365a.add(obj);
        this.f102366b.setValue(Boolean.valueOf(!this.f102365a.isEmpty()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.bilibili.ship.theseus.united.page.playingarea.i] */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.coroutines.Continuation, kotlin.coroutines.jvm.internal.ContinuationImpl] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v7 */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull java.lang.Object r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            r0 = r7
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaOccupationRepository$keepOccupation$1
            if (r0 == 0) goto L26
            r0 = r7
            com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaOccupationRepository$keepOccupation$1 r0 = (com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaOccupationRepository$keepOccupation$1) r0
            r9 = r0
            r0 = r9
            int r0 = r0.label
            r8 = r0
            r0 = r8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L26
            r0 = r9
            r1 = r8
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            goto L31
        L26:
            com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaOccupationRepository$keepOccupation$1 r0 = new com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaOccupationRepository$keepOccupation$1
            r1 = r0
            r2 = r5
            r3 = r7
            r1.<init>(r2, r3)
            r9 = r0
        L31:
            r0 = r9
            java.lang.Object r0 = r0.result
            r11 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r10 = r0
            r0 = r9
            int r0 = r0.label
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L6a
            r0 = r8
            r1 = 1
            if (r0 == r1) goto L56
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L56:
            r0 = r9
            java.lang.Object r0 = r0.L$0
            r6 = r0
            r0 = r6
            r7 = r0
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L66
            goto L93
        L66:
            r6 = move-exception
            goto La6
        L6a:
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r5
            r1 = r6
            r0.a(r1)
            r0 = r6
            r7 = r0
            r0 = r9
            r1 = r6
            r0.L$0 = r1     // Catch: java.lang.Throwable -> L66
            r0 = r6
            r7 = r0
            r0 = r9
            r1 = 1
            r0.label = r1     // Catch: java.lang.Throwable -> L66
            r0 = r6
            r7 = r0
            r0 = r9
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.awaitCancellation(r0)     // Catch: java.lang.Throwable -> L66
            r1 = r10
            if (r0 != r1) goto L93
            r0 = r10
            return r0
        L93:
            r0 = r6
            r7 = r0
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L66
            r9 = r0
            r0 = r6
            r7 = r0
            r0 = r9
            r0.<init>()     // Catch: java.lang.Throwable -> L66
            r0 = r6
            r7 = r0
            r0 = r9
            throw r0     // Catch: java.lang.Throwable -> L66
        La6:
            r0 = r5
            r1 = r7
            r0.c(r1)
            r0 = r6
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.playingarea.i.b(java.lang.Object, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void c(@NotNull Object obj) {
        this.f102365a.remove(obj);
        this.f102366b.setValue(Boolean.valueOf(!this.f102365a.isEmpty()));
    }
}
