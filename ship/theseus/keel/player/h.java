package com.bilibili.ship.theseus.keel.player;

import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.player.tangram.basic.CompoundPlayStateProviderImpl;
import com.bilibili.player.tangram.basic.PlaySpeedManagerImpl;
import com.bilibili.player.tangram.basic.PlayerAvailability;
import com.bilibili.player.tangram.basic.QualityPreferenceProviderImpl;
import com.bilibili.player.tangram.basic.c;
import com.bilibili.playerbizcommon.utils.PlayerSettingHelper;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/keel/player/h.class */
@StabilityInferred(parameters = 0)
public final class h implements com.bilibili.player.tangram.basic.d, com.bilibili.player.tangram.basic.f, com.bilibili.player.tangram.basic.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CompoundPlayStateProviderImpl f91107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PlaySpeedManagerImpl f91108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final QualityPreferenceProviderImpl f91109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Mutex f91110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<j> f91111e;

    public h() {
        this(true);
    }

    public h(boolean z6) {
        int i7;
        com.bilibili.player.tangram.basic.c bVar;
        this.f91107a = new CompoundPlayStateProviderImpl();
        this.f91108b = new PlaySpeedManagerImpl();
        if (z6 && PlayerSettingHelper.isQualityAutoSwitch()) {
            com.bilibili.biligame.ui.feed.preload.b.a("[gemini-TheseusKeelPlayerKt-storedQualityPreference] ", com.bilibili.app.comm.bh.x5.b.a("Quality Preference init auto ", z6), "TheseusKeelPlayerKt-storedQualityPreference");
            bVar = c.a.f79321a;
        } else {
            Log.i("TheseusKeelPlayerKt-storedQualityPreference", "[gemini-TheseusKeelPlayerKt-storedQualityPreference] " + com.bilibili.app.comm.bh.x5.b.a("Quality Preference init specific ", z6));
            int defaultQuality = PlayerSettingHelper.getDefaultQuality();
            if (defaultQuality < 0) {
                i7 = 0;
            } else {
                i7 = defaultQuality;
                if (defaultQuality == 15) {
                    i7 = 16;
                }
            }
            bVar = new c.b(i7);
        }
        this.f91109c = new QualityPreferenceProviderImpl(bVar);
        this.f91110d = MutexKt.Mutex$default(false, 1, (Object) null);
        this.f91111e = StateFlowKt.MutableStateFlow((Object) null);
    }

    @Override // com.bilibili.player.tangram.basic.d
    public final boolean a() {
        return this.f91107a.a();
    }

    @Override // com.bilibili.player.tangram.basic.g
    public final void b(@NotNull com.bilibili.player.tangram.basic.c cVar, @Nullable com.bilibili.player.tangram.basic.c cVar2) {
        this.f91109c.b(cVar, cVar2);
    }

    @Override // com.bilibili.player.tangram.basic.g
    @Nullable
    public final com.bilibili.player.tangram.basic.c c() {
        return this.f91109c.c();
    }

    @Override // com.bilibili.player.tangram.basic.d
    @NotNull
    public final Flow<PlayerAvailability> d() {
        return this.f91107a.f79286c;
    }

    @Override // com.bilibili.player.tangram.basic.g
    @Nullable
    public final Object e(@NotNull com.bilibili.player.tangram.basic.l lVar, @NotNull Continuation<? super Unit> continuation) {
        return this.f91109c.e(lVar, continuation);
    }

    @Override // com.bilibili.player.tangram.basic.f
    @NotNull
    public final Flow<Float> f() {
        return this.f91108b.f();
    }

    @Override // com.bilibili.player.tangram.basic.g
    @NotNull
    public final com.bilibili.player.tangram.basic.c g() {
        return this.f91109c.g();
    }

    public final void h(@NotNull Object obj) {
        this.f91107a.b(obj);
    }

    @Override // com.bilibili.player.tangram.basic.d
    public final void i(@NotNull Object obj) {
        this.f91107a.i(obj);
    }

    @Nullable
    public final j j() {
        return (j) this.f91111e.getValue();
    }

    @Override // com.bilibili.player.tangram.basic.d
    @NotNull
    public final PlayerAvailability k() {
        return this.f91107a.k();
    }

    @Override // com.bilibili.player.tangram.basic.d
    @NotNull
    public final Flow<Boolean> l() {
        return this.f91107a.f79285b;
    }

    @Override // com.bilibili.player.tangram.basic.d
    public final boolean m() {
        return this.f91107a.m();
    }

    @Override // com.bilibili.player.tangram.basic.d
    @NotNull
    public final Flow<Boolean> n() {
        return this.f91107a.f79284a;
    }

    @Override // com.bilibili.player.tangram.basic.d
    @Nullable
    public final Object o(@NotNull com.bilibili.player.tangram.basic.j jVar, @NotNull Continuation<? super Unit> continuation) {
        return this.f91107a.o(jVar, continuation);
    }

    public final void p() {
        this.f91107a.c();
    }

    @Override // com.bilibili.player.tangram.basic.d
    public final void pause() {
        this.f91107a.pause();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(@org.jetbrains.annotations.NotNull com.bilibili.ship.theseus.keel.player.j r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.keel.player.h.q(com.bilibili.ship.theseus.keel.player.j, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void r(float f7) {
        this.f91108b.f79291a.setValue(Float.valueOf(f7));
    }
}
