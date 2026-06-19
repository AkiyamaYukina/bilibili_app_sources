package com.bilibili.ship.theseus.united.player.history;

import F3.O;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.motion.widget.p;
import androidx.lifecycle.Lifecycle;
import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.player.history.IMediaHistoryKeyParams;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.keel.player.j;
import dagger.assisted.AssistedInject;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/history/b.class */
@StabilityInferred(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f104470l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f104471m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final h f104472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lifecycle f104473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final BiliAccounts f104474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final InterfaceC1167b f104475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.playerbizcommon.features.background.h f104476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final j f104477f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final GeminiCommonPlayableParams f104478g;
    public long h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Lazy f104479i = LazyKt.lazy(new O(11));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public a f104480j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public com.bilibili.ship.theseus.united.player.history.a f104481k;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/history/b$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f104482a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f104483b;

        public a(long j7, long j8) {
            this.f104482a = j7;
            this.f104483b = j8;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Duration.equals-impl0(this.f104482a, aVar.f104482a) && Duration.equals-impl0(this.f104483b, aVar.f104483b);
        }

        public final int hashCode() {
            return Duration.hashCode-impl(this.f104483b) + (Duration.hashCode-impl(this.f104482a) * 31);
        }

        @NotNull
        public final String toString() {
            return p.a("State(duration=", Duration.toString-impl(this.f104482a), ", position=", Duration.toString-impl(this.f104483b), ")");
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.history.b$b, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/history/b$b.class */
    public interface InterfaceC1167b {
        @NotNull
        IMediaHistoryKeyParams a(long j7);

        @Nullable
        Map<String, String> b();

        int getType();

        int itemCount();
    }

    static {
        Duration.Companion companion = Duration.Companion;
        f104470l = DurationKt.toDuration(5000, DurationUnit.MILLISECONDS);
    }

    @AssistedInject
    public b(@NotNull h hVar, @NotNull Lifecycle lifecycle, @NotNull BiliAccounts biliAccounts, @NotNull InterfaceC1167b interfaceC1167b, @NotNull com.bilibili.playerbizcommon.features.background.h hVar2, @NotNull j jVar, @NotNull GeminiCommonPlayableParams geminiCommonPlayableParams) {
        this.f104472a = hVar;
        this.f104473b = lifecycle;
        this.f104474c = biliAccounts;
        this.f104475d = interfaceC1167b;
        this.f104476e = hVar2;
        this.f104477f = jVar;
        this.f104478g = geminiCommonPlayableParams;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(long r22) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 1029
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.player.history.b.a(long):void");
    }

    @Nullable
    public final Object c(@NotNull SuspendLambda suspendLambda) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new TheseusHistoryService$run$2(this, null), suspendLambda);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }
}
