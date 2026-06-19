package com.bilibili.ship.theseus.cheese.biz.intro.primary;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import androidx.viewbinding.ViewBinding;
import eu0.C6978A;
import eu0.C7007z;
import fu0.C7174A;
import java.util.List;
import java.util.Map;
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

/* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.primary.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/b.class */
@StabilityInferred(parameters = 0)
public final class C6081b extends com.bilibili.app.gemini.ui.m<C7174A> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f89711d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final C0619b f89712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<a> f89713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final SharedFlow<a> f89714c;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.primary.b$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/b$a.class */
    @StabilityInferred(parameters = 1)
    public static abstract class a {

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.primary.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/b$a$a.class */
        @StabilityInferred(parameters = 1)
        public static final class C0617a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0617a f89715a = new a();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof C0617a);
            }

            public final int hashCode() {
                return -1952527445;
            }

            @NotNull
            public final String toString() {
                return "OnClickCoupon";
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.primary.b$a$b, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/b$a$b.class */
        @StabilityInferred(parameters = 1)
        public static final class C0618b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0618b f89716a = new a();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof C0618b);
            }

            public final int hashCode() {
                return -1302034737;
            }

            @NotNull
            public final String toString() {
                return "OnClickLabel";
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.primary.b$a$c */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/b$a$c.class */
        @StabilityInferred(parameters = 1)
        public static final class c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final c f89717a = new a();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 1066556657;
            }

            @NotNull
            public final String toString() {
                return "OnClickRank";
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.primary.b$a$d */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/b$a$d.class */
        @StabilityInferred(parameters = 1)
        public static final class d extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final d f89718a = new a();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 449752848;
            }

            @NotNull
            public final String toString() {
                return "OnExposureCoupon";
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.primary.b$a$e */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/b$a$e.class */
        @StabilityInferred(parameters = 1)
        public static final class e extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final e f89719a = new a();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 1269310154;
            }

            @NotNull
            public final String toString() {
                return "OnExposureLabel";
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.primary.b$a$f */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/b$a$f.class */
        @StabilityInferred(parameters = 1)
        public static final class f extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final f f89720a = new a();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return 733861270;
            }

            @NotNull
            public final String toString() {
                return "OnExposureRank";
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.primary.b$a$g */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/b$a$g.class */
        @StabilityInferred(parameters = 1)
        public static final class g extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final long f89721a;

            public g(long j7) {
                this.f89721a = j7;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && this.f89721a == ((g) obj).f89721a;
            }

            public final int hashCode() {
                return Long.hashCode(this.f89721a);
            }

            @NotNull
            public final String toString() {
                return android.support.v4.media.session.a.a(new StringBuilder("OnRelatedCoursesClick(id="), this.f89721a, ")");
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.primary.b$a$h */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/b$a$h.class */
        @StabilityInferred(parameters = 0)
        public static final class h extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final long f89722a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final Map<String, String> f89723b;

            public h(long j7, @NotNull Map<String, String> map) {
                this.f89722a = j7;
                this.f89723b = map;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h)) {
                    return false;
                }
                h hVar = (h) obj;
                return this.f89722a == hVar.f89722a && Intrinsics.areEqual(this.f89723b, hVar.f89723b);
            }

            public final int hashCode() {
                return this.f89723b.hashCode() + (Long.hashCode(this.f89722a) * 31);
            }

            @NotNull
            public final String toString() {
                return "OnRelatedCoursesItemClick(seasonId=" + this.f89722a + ", reportParams=" + this.f89723b + ")";
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.primary.b$a$i */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/b$a$i.class */
        @StabilityInferred(parameters = 0)
        public static final class i extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final Map<String, String> f89724a;

            public i(@NotNull Map<String, String> map) {
                this.f89724a = map;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof i) && Intrinsics.areEqual(this.f89724a, ((i) obj).f89724a);
            }

            public final int hashCode() {
                return this.f89724a.hashCode();
            }

            @NotNull
            public final String toString() {
                return com.bapis.bilibili.account.interfaces.v1.j.a("OnRelatedCoursesItemExposure(reportParams=", ")", this.f89724a);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.primary.b$a$j */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/b$a$j.class */
        @StabilityInferred(parameters = 1)
        public static final class j extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final j f89725a = new a();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof j);
            }

            public final int hashCode() {
                return 1622138485;
            }

            @NotNull
            public final String toString() {
                return "OnSceneCouponCountdownFinish";
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.primary.b$b, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/b$b.class */
    @StabilityInferred(parameters = 0)
    public static final class C0619b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f89726a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f89727b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final C6978A f89728c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final V f89729d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final List<S> f89730e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final StateFlow<Integer> f89731f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final StateFlow<C7007z> f89732g;
        public final boolean h;

        public C0619b(boolean z6, boolean z7, @NotNull C6978A c6978a, @NotNull V v7, @NotNull List<S> list, @NotNull StateFlow<Integer> stateFlow, @NotNull StateFlow<C7007z> stateFlow2, boolean z8) {
            this.f89726a = z6;
            this.f89727b = z7;
            this.f89728c = c6978a;
            this.f89729d = v7;
            this.f89730e = list;
            this.f89731f = stateFlow;
            this.f89732g = stateFlow2;
            this.h = z8;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0619b)) {
                return false;
            }
            C0619b c0619b = (C0619b) obj;
            return this.f89726a == c0619b.f89726a && this.f89727b == c0619b.f89727b && Intrinsics.areEqual(this.f89728c, c0619b.f89728c) && Intrinsics.areEqual(this.f89729d, c0619b.f89729d) && Intrinsics.areEqual(this.f89730e, c0619b.f89730e) && Intrinsics.areEqual(this.f89731f, c0619b.f89731f) && Intrinsics.areEqual(this.f89732g, c0619b.f89732g) && this.h == c0619b.h;
        }

        public final int hashCode() {
            int iA = androidx.compose.animation.z.a(Boolean.hashCode(this.f89726a) * 31, 31, this.f89727b);
            return Boolean.hashCode(this.h) + androidx.core.content.b.a(this.f89732g, androidx.core.content.b.a(this.f89731f, e0.a((this.f89729d.hashCode() + ((this.f89728c.hashCode() + iA) * 31)) * 31, 31, this.f89730e), 31), 31);
        }

        @NotNull
        public final String toString() {
            List<S> list = this.f89730e;
            StringBuilder sb = new StringBuilder("State(paidState=");
            sb.append(this.f89726a);
            sb.append(", isStopSell=");
            sb.append(this.f89727b);
            sb.append(", payment=");
            sb.append(this.f89728c);
            sb.append(", primary=");
            sb.append(this.f89729d);
            sb.append(", badges=");
            sb.append(list);
            sb.append(", horizontalPaddingFlow=");
            sb.append(this.f89731f);
            sb.append(", couponFlow=");
            sb.append(this.f89732g);
            sb.append(", hitPriceWeakenExp=");
            return androidx.appcompat.app.i.a(sb, this.h, ")");
        }
    }

    public C6081b(@NotNull C0619b c0619b) {
        this.f89712a = c0619b;
        MutableSharedFlow<a> MutableSharedFlow = SharedFlowKt.MutableSharedFlow(0, 3, BufferOverflow.DROP_OLDEST);
        this.f89713b = MutableSharedFlow;
        this.f89714c = FlowKt.asSharedFlow(MutableSharedFlow);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(com.bilibili.ship.theseus.cheese.biz.intro.primary.C6081b r7, com.bilibili.ship.theseus.cheese.biz.intro.primary.S r8, android.widget.TextView r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            Method dump skipped, instruction units count: 491
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.intro.primary.C6081b.d(com.bilibili.ship.theseus.cheese.biz.intro.primary.b, com.bilibili.ship.theseus.cheese.biz.intro.primary.S, android.widget.TextView, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(com.bilibili.ship.theseus.cheese.biz.intro.primary.C6081b r9, android.widget.TextView r10, java.lang.String r11, java.util.List r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.intro.primary.C6081b.e(com.bilibili.ship.theseus.cheese.biz.intro.primary.b, android.widget.TextView, java.lang.String, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object a(ViewBinding viewBinding, Continuation continuation) {
        C7174A c7174a = (C7174A) viewBinding;
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new CheesePrimaryComponent$bind$2(c7174a, this, c7174a.f119397a.getContext(), null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C7174A.inflate(LayoutInflater.from(context), viewGroup, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0620  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(final eu0.C7007z r34, final androidx.compose.ui.Modifier r35, androidx.compose.runtime.Composer r36, final int r37) {
        /*
            Method dump skipped, instruction units count: 2321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.intro.primary.C6081b.c(eu0.z, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }
}
