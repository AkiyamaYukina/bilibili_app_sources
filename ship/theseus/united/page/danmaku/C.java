package com.bilibili.ship.theseus.united.page.danmaku;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.viewbinding.ViewBinding;
import dv0.C6855b;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/C.class */
@StabilityInferred(parameters = 0)
public final class C extends com.bilibili.app.gemini.ui.m<C6855b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final StateFlow<b> f99313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<a> f99314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final SharedFlow f99315c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/C$a.class */
    public interface a {

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.C$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/C$a$a.class */
        @StabilityInferred(parameters = 1)
        public static final class C0970a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final String f99316a;

            public C0970a(@NotNull String str) {
                this.f99316a = str;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0970a) && Intrinsics.areEqual(this.f99316a, ((C0970a) obj).f99316a);
            }

            public final int hashCode() {
                return this.f99316a.hashCode();
            }

            @NotNull
            public final String toString() {
                return C8770a.a(new StringBuilder("UpdateSwitcherWord(word="), this.f99316a, ")");
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/C$b.class */
    @StabilityInferred(parameters = 1)
    public static abstract class b {

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/C$b$a.class */
        @StabilityInferred(parameters = 1)
        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f99317a = new b();
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.C$b$b, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/C$b$b.class */
        @StabilityInferred(parameters = 1)
        public static final class C0971b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0971b f99318a = new b();
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/C$b$c.class */
        @StabilityInferred(parameters = 1)
        public static final class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final c f99319a = new b();
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/C$b$d.class */
        @StabilityInferred(parameters = 0)
        public static final class d extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final long f99320a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f99321b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final long f99322c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @NotNull
            public final List<String> f99323d;

            public d(@NotNull List list, long j7, long j8, long j9) {
                this.f99320a = j7;
                this.f99321b = j8;
                this.f99322c = j9;
                this.f99323d = list;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C(@NotNull StateFlow<? extends b> stateFlow) {
        this.f99313a = stateFlow;
        MutableSharedFlow<a> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, (BufferOverflow) null, 7, (Object) null);
        this.f99314b = mutableSharedFlowMutableSharedFlow$default;
        this.f99315c = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    public final Object a(ViewBinding viewBinding, Continuation continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new HalfScreenDanmakuRecommendSwitcherComponent$bind$2((C6855b) viewBinding, this, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C6855b.inflate(layoutInflater, viewGroup, false);
    }
}
