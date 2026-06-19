package com.bilibili.player.tangram.basic;

import java.util.HashSet;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/basic/CompoundPlayStateProviderImpl.class */
public final class CompoundPlayStateProviderImpl implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f79284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f79285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<PlayerAvailability> f79286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final HashSet<Object> f79287d;

    public CompoundPlayStateProviderImpl() {
        Boolean bool = Boolean.FALSE;
        this.f79284a = StateFlowKt.MutableStateFlow(bool);
        this.f79285b = StateFlowKt.MutableStateFlow(bool);
        this.f79286c = StateFlowKt.MutableStateFlow(PlayerAvailability.IDLE);
        this.f79287d = new HashSet<>();
    }

    @Override // com.bilibili.player.tangram.basic.d
    public final boolean a() {
        return ((Boolean) this.f79284a.getValue()).booleanValue();
    }

    public final void b(@NotNull Object obj) {
        defpackage.a.b("[tangram-basic-CompoundPlayStateProviderImpl-doSuppressionWith] ", Fp.c.b(obj, "do suppression with "), "CompoundPlayStateProviderImpl-doSuppressionWith");
        this.f79287d.add(obj);
        this.f79285b.setValue(Boolean.valueOf(!this.f79287d.isEmpty()));
    }

    public final void c() {
        BLog.i("CompoundPlayStateProviderImpl-resume", "[tangram-basic-CompoundPlayStateProviderImpl-resume] call player resume");
        this.f79284a.setValue(Boolean.TRUE);
    }

    @Override // com.bilibili.player.tangram.basic.d
    @NotNull
    public final Flow<PlayerAvailability> d() {
        return this.f79286c;
    }

    @Override // com.bilibili.player.tangram.basic.d
    public final void i(@NotNull Object obj) {
        defpackage.a.b("[tangram-basic-CompoundPlayStateProviderImpl-undoSuppressionOf] ", Fp.c.b(obj, "undo suppression of "), "CompoundPlayStateProviderImpl-undoSuppressionOf");
        this.f79287d.remove(obj);
        this.f79285b.setValue(Boolean.valueOf(!this.f79287d.isEmpty()));
    }

    @Override // com.bilibili.player.tangram.basic.d
    @NotNull
    public final PlayerAvailability k() {
        return (PlayerAvailability) this.f79286c.getValue();
    }

    @Override // com.bilibili.player.tangram.basic.d
    @NotNull
    public final Flow<Boolean> l() {
        return this.f79285b;
    }

    @Override // com.bilibili.player.tangram.basic.d
    public final boolean m() {
        return ((Boolean) this.f79285b.getValue()).booleanValue();
    }

    @Override // com.bilibili.player.tangram.basic.d
    @NotNull
    public final Flow<Boolean> n() {
        return this.f79284a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @Override // com.bilibili.player.tangram.basic.d
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(@org.jetbrains.annotations.NotNull com.bilibili.player.tangram.basic.j r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            r0 = r7
            boolean r0 = r0 instanceof com.bilibili.player.tangram.basic.CompoundPlayStateProviderImpl$associateWith$1
            if (r0 == 0) goto L29
            r0 = r7
            com.bilibili.player.tangram.basic.CompoundPlayStateProviderImpl$associateWith$1 r0 = (com.bilibili.player.tangram.basic.CompoundPlayStateProviderImpl$associateWith$1) r0
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
            com.bilibili.player.tangram.basic.CompoundPlayStateProviderImpl$associateWith$1 r0 = new com.bilibili.player.tangram.basic.CompoundPlayStateProviderImpl$associateWith$1
            r1 = r0
            r2 = r5
            r3 = r7
            r1.<init>(r2, r3)
            r7 = r0
        L33:
            r0 = r7
            java.lang.Object r0 = r0.result
            r11 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r10 = r0
            r0 = r7
            int r0 = r0.label
            r8 = r0
            r0 = r5
            kotlinx.coroutines.flow.MutableStateFlow<com.bilibili.player.tangram.basic.PlayerAvailability> r0 = r0.f79286c
            r9 = r0
            r0 = r8
            if (r0 == 0) goto L68
            r0 = r8
            r1 = 1
            if (r0 != r1) goto L5e
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L5a
            goto L95
        L5a:
            r6 = move-exception
            goto La3
        L5e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L68:
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r6
            kotlinx.coroutines.flow.Flow r0 = r0.d()     // Catch: java.lang.Throwable -> L5a
            r11 = r0
            com.bilibili.player.tangram.basic.CompoundPlayStateProviderImpl$associateWith$2 r0 = new com.bilibili.player.tangram.basic.CompoundPlayStateProviderImpl$associateWith$2     // Catch: java.lang.Throwable -> L5a
            r6 = r0
            r0 = r6
            r1 = r5
            r2 = 0
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L5a
            r0 = r7
            r1 = 1
            r0.label = r1     // Catch: java.lang.Throwable -> L5a
            r0 = r11
            r1 = r6
            r2 = r7
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt.collectLatest(r0, r1, r2)     // Catch: java.lang.Throwable -> L5a
            r6 = r0
            r0 = r6
            r1 = r10
            if (r0 != r1) goto L95
            r0 = r10
            return r0
        L95:
            r0 = r9
            com.bilibili.player.tangram.basic.PlayerAvailability r1 = com.bilibili.player.tangram.basic.PlayerAvailability.IDLE
            r0.setValue(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        La3:
            r0 = r9
            com.bilibili.player.tangram.basic.PlayerAvailability r1 = com.bilibili.player.tangram.basic.PlayerAvailability.IDLE
            r0.setValue(r1)
            r0 = r6
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.player.tangram.basic.CompoundPlayStateProviderImpl.o(com.bilibili.player.tangram.basic.j, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.bilibili.player.tangram.basic.d
    public final void pause() {
        BLog.i("CompoundPlayStateProviderImpl-pause", "[tangram-basic-CompoundPlayStateProviderImpl-pause] call player pause");
        this.f79284a.setValue(Boolean.FALSE);
    }
}
