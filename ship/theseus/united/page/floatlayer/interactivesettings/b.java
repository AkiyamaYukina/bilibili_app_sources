package com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.InteractiveSettingsService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/interactivesettings/b.class */
@StabilityInferred(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final StateFlow<InteractiveSettingsService.a> f99799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final e f99800b = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<a> f99801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final SharedFlow<a> f99802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f99803e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/interactivesettings/b$a.class */
    @StabilityInferred(parameters = 1)
    public static abstract class a {

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/interactivesettings/b$a$a.class */
        @StabilityInferred(parameters = 0)
        public static final class C0990a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final InteractionItem f99804a;

            public C0990a(@NotNull InteractionItem interactionItem) {
                this.f99804a = interactionItem;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0990a) && Intrinsics.areEqual(this.f99804a, ((C0990a) obj).f99804a);
            }

            public final int hashCode() {
                return this.f99804a.hashCode();
            }

            @NotNull
            public final String toString() {
                return "ItemClicked(item=" + this.f99804a + ")";
            }
        }
    }

    public b(@NotNull StateFlow<InteractiveSettingsService.a> stateFlow) {
        this.f99799a = stateFlow;
        MutableSharedFlow<a> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, (BufferOverflow) null, 5, (Object) null);
        this.f99801c = mutableSharedFlowMutableSharedFlow$default;
        this.f99802d = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull android.view.View r8, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0 r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r7 = this;
            r0 = r10
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.InteractiveSettingsComponent$bindToView$1
            if (r0 == 0) goto L2c
            r0 = r10
            com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.InteractiveSettingsComponent$bindToView$1 r0 = (com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.InteractiveSettingsComponent$bindToView$1) r0
            r12 = r0
            r0 = r12
            int r0 = r0.label
            r11 = r0
            r0 = r11
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2c
            r0 = r12
            r1 = r11
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r12
            r10 = r0
            goto L36
        L2c:
            com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.InteractiveSettingsComponent$bindToView$1 r0 = new com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.InteractiveSettingsComponent$bindToView$1
            r1 = r0
            r2 = r7
            r3 = r10
            r1.<init>(r2, r3)
            r10 = r0
        L36:
            r0 = r10
            java.lang.Object r0 = r0.result
            r13 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r12 = r0
            r0 = r10
            int r0 = r0.label
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L64
            r0 = r11
            r1 = 1
            if (r0 != r1) goto L5a
            r0 = r13
            kotlin.ResultKt.throwOnFailure(r0)
            goto La4
        L5a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L64:
            r0 = r13
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r7
            r1 = r9
            r0.f99803e = r1
            r0 = r8
            dv0.M r0 = dv0.M.bind(r0)
            r9 = r0
            r0 = r9
            android.widget.TextView r0 = r0.f116827b
            r8 = r0
            r0 = r9
            androidx.recyclerview.widget.RecyclerView r0 = r0.f116828c
            r1 = r7
            com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.e r1 = r1.f99800b
            r0.setAdapter(r1)
            com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.InteractiveSettingsComponent$bindToView$2 r0 = new com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.InteractiveSettingsComponent$bindToView$2
            r1 = r0
            r2 = r7
            r3 = r8
            r4 = r9
            androidx.constraintlayout.widget.ConstraintLayout r4 = r4.f116826a
            r5 = 0
            r1.<init>(r2, r3, r4, r5)
            r8 = r0
            r0 = r10
            r1 = 1
            r0.label = r1
            r0 = r8
            r1 = r10
            java.lang.Object r0 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r0, r1)
            r1 = r12
            if (r0 != r1) goto La4
            r0 = r12
            return r0
        La4:
            HS0.F r0 = new HS0.F
            r1 = r0
            r2 = r7
            r3 = 6
            r1.<init>(r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.b.a(android.view.View, kotlin.jvm.functions.Function0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
