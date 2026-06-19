package com.bilibili.ship.theseus.playlist.offline;

import I.E;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.app.i;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.viewbinding.ViewBinding;
import com.bilibili.app.gemini.ui.m;
import dv0.C6853a;
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
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/offline/e.class */
@StabilityInferred(parameters = 0)
public final class e extends m<C6853a> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f95812f = NewPlayerUtilsKt.toPx(41.0f);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f95813g = NewPlayerUtilsKt.toPx(15.0f);
    public static final int h = NewPlayerUtilsKt.toPx(134.0f);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f95814i = NewPlayerUtilsKt.toPx(30.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final StateFlow<b> f95815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<a> f95816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final SharedFlow<a> f95817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final GradientDrawable f95818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final GradientDrawable f95819e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/offline/e$a.class */
    public interface a {

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.offline.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/offline/e$a$a.class */
        @StabilityInferred(parameters = 1)
        public static final class C0794a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f95820a;

            public C0794a(boolean z6) {
                this.f95820a = z6;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0794a) && this.f95820a == ((C0794a) obj).f95820a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f95820a);
            }

            @NotNull
            public final String toString() {
                return i.a(new StringBuilder("SwitchDanmaku(target="), this.f95820a, ")");
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/offline/e$a$b.class */
        @StabilityInferred(parameters = 1)
        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f95821a = new Object();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/offline/e$b.class */
    @StabilityInferred(parameters = 1)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f95822a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f95823b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f95824c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f95825d;

        public b(@NotNull String str, boolean z6, boolean z7, boolean z8) {
            this.f95822a = z6;
            this.f95823b = str;
            this.f95824c = z7;
            this.f95825d = z8;
        }

        public static b a(b bVar, boolean z6, String str, boolean z7, boolean z8, int i7) {
            if ((i7 & 1) != 0) {
                z6 = bVar.f95822a;
            }
            if ((i7 & 2) != 0) {
                str = bVar.f95823b;
            }
            if ((i7 & 4) != 0) {
                z7 = bVar.f95824c;
            }
            if ((i7 & 8) != 0) {
                z8 = bVar.f95825d;
            }
            bVar.getClass();
            return new b(str, z6, z7, z8);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f95822a == bVar.f95822a && Intrinsics.areEqual(this.f95823b, bVar.f95823b) && this.f95824c == bVar.f95824c && this.f95825d == bVar.f95825d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f95825d) + z.a(E.a(Boolean.hashCode(this.f95822a) * 31, 31, this.f95823b), 31, this.f95824c);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("DanmakuInputState(open=");
            sb.append(this.f95822a);
            sb.append(", hint=");
            sb.append(this.f95823b);
            sb.append(", available=");
            sb.append(this.f95824c);
            sb.append(", withAnim=");
            return i.a(sb, this.f95825d, ")");
        }
    }

    public e(@NotNull StateFlow<b> stateFlow) {
        this.f95815a = stateFlow;
        MutableSharedFlow<a> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, (BufferOverflow) null, 7, (Object) null);
        this.f95816b = mutableSharedFlowMutableSharedFlow$default;
        this.f95817c = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.f95818d = new GradientDrawable();
        this.f95819e = new GradientDrawable();
    }

    public final Object a(ViewBinding viewBinding, Continuation continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new OfflineDanmakuInputComponent$bind$2((C6853a) viewBinding, this, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C6853a.inflate(layoutInflater, viewGroup, false);
    }
}
