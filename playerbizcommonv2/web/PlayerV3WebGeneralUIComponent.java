package com.bilibili.playerbizcommonv2.web;

import By0.C1488q1;
import I3.C2276v0;
import I3.C2279w0;
import I3.C2282x0;
import I3.C2285y0;
import M3.C2592k;
import ZS0.M;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.animation.C3357h;
import androidx.compose.animation.E;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import com.bilibili.app.comm.aghanim.api.ContainerEvent;
import com.bilibili.app.comm.aghanim.api.IWebCustomModel;
import com.bilibili.app.comm.aghanim.api.IWebGeneralFragment;
import com.bilibili.app.comm.aghanim.api.IWebGeneralFragmentProvider;
import com.bilibili.app.comm.aghanim.api.ImmutableWebRequest;
import com.bilibili.app.comm.aghanim.api.WebContainerInsetsDispatcher;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.jsb.IPrivacyController;
import com.bilibili.lib.theme.R$color;
import com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent;
import com.bilibili.playerbizcommonv2.web.PlayerWebNestedSwipeDismissLayout;
import com.bilibili.playerbizcommonv2.web.w;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KClass;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/web/PlayerV3WebGeneralUIComponent.class */
@StabilityInferred(parameters = 0)
public final class PlayerV3WebGeneralUIComponent implements UIComponent<c> {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f82092y = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final FragmentManager f82093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final IWebGeneralFragmentProvider f82094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final b f82095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f82096d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final u f82097e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Flow<WindowInsetsCompat> f82098f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final Function0<Unit> f82099g;

    @NotNull
    public final ImmutableWebRequest h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap<Integer, IWebGeneralFragment> f82100i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f82101j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow f82102k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<ContainerEvent> f82103l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow f82104m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Integer> f82105n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Integer> f82106o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Integer> f82107p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f82108q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Integer> f82109r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<w> f82110s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public c f82111t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f82112u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f82113v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f82114w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public Animator f82115x;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/web/PlayerV3WebGeneralUIComponent$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public final boolean f82116A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public final int f82117B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public final int f82118C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public final int f82119D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public final boolean f82120E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        @NotNull
        public final Map<KClass<?>, IPrivacyController> f82121F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        @Nullable
        public final Flow<WindowInsetsCompat> f82122G;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f82123a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f82124b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f82125c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f82126d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f82127e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f82128f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f82129g;

        @Nullable
        public final Function0<Unit> h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f82130i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f82131j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        public final Function0<Boolean> f82132k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f82133l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f82134m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f82135n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final boolean f82136o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @NotNull
        public final String f82137p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final int f82138q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final int f82139r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f82140s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final boolean f82141t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final int f82142u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final int f82143v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final int f82144w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final int f82145x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final int f82146y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final int f82147z;

        public a() {
            throw null;
        }

        public a(boolean z6, M m7, boolean z7, boolean z8, boolean z9, boolean z10, int i7, int i8, int i9, Map map, Flow flow, int i10, int i11) {
            long jM2666getWhite0d7_KjU = Color.Companion.m2666getWhite0d7_KjU();
            z6 = (i10 & 256) != 0 ? false : z6;
            m7 = (i10 & 1024) != 0 ? new C2592k(2) : m7;
            z7 = (i10 & 2048) != 0 ? false : z7;
            z8 = (i10 & 8192) != 0 ? false : z8;
            z9 = (524288 & i10) != 0 ? false : z9;
            z10 = (67108864 & i10) != 0 ? true : z10;
            i7 = (134217728 & i10) != 0 ? 0 : i7;
            i8 = (268435456 & i10) != 0 ? 0 : i8;
            i9 = (536870912 & i10) != 0 ? 0 : i9;
            map = (i10 & Integer.MIN_VALUE) != 0 ? MapsKt.emptyMap() : map;
            flow = (i11 & 1) != 0 ? null : flow;
            this.f82123a = 100;
            this.f82124b = 100;
            this.f82125c = false;
            this.f82126d = false;
            this.f82127e = false;
            this.f82128f = 0.0f;
            this.f82129g = jM2666getWhite0d7_KjU;
            this.h = null;
            this.f82130i = z6;
            this.f82131j = true;
            this.f82132k = m7;
            this.f82133l = z7;
            this.f82134m = Integer.MIN_VALUE;
            this.f82135n = z8;
            this.f82136o = false;
            this.f82137p = "";
            this.f82138q = 0;
            this.f82139r = 0;
            this.f82140s = 0;
            this.f82141t = z9;
            this.f82142u = 0;
            this.f82143v = -1;
            this.f82144w = -1;
            this.f82145x = -1;
            this.f82146y = -1;
            this.f82147z = -1;
            this.f82116A = z10;
            this.f82117B = i7;
            this.f82118C = i8;
            this.f82119D = i9;
            this.f82120E = false;
            this.f82121F = map;
            this.f82122G = flow;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f82123a == aVar.f82123a && this.f82124b == aVar.f82124b && this.f82125c == aVar.f82125c && this.f82126d == aVar.f82126d && this.f82127e == aVar.f82127e && Float.compare(this.f82128f, aVar.f82128f) == 0 && Color.m2630equalsimpl0(this.f82129g, aVar.f82129g) && Intrinsics.areEqual(this.h, aVar.h) && this.f82130i == aVar.f82130i && this.f82131j == aVar.f82131j && Intrinsics.areEqual(this.f82132k, aVar.f82132k) && this.f82133l == aVar.f82133l && this.f82134m == aVar.f82134m && this.f82135n == aVar.f82135n && this.f82136o == aVar.f82136o && Intrinsics.areEqual(this.f82137p, aVar.f82137p) && this.f82138q == aVar.f82138q && this.f82139r == aVar.f82139r && this.f82140s == aVar.f82140s && this.f82141t == aVar.f82141t && this.f82142u == aVar.f82142u && this.f82143v == aVar.f82143v && this.f82144w == aVar.f82144w && this.f82145x == aVar.f82145x && this.f82146y == aVar.f82146y && this.f82147z == aVar.f82147z && this.f82116A == aVar.f82116A && this.f82117B == aVar.f82117B && this.f82118C == aVar.f82118C && this.f82119D == aVar.f82119D && this.f82120E == aVar.f82120E && Intrinsics.areEqual(this.f82121F, aVar.f82121F) && Intrinsics.areEqual(this.f82122G, aVar.f82122G);
        }

        public final int hashCode() {
            int iA = E.a(androidx.compose.animation.n.a(this.f82128f, z.a(z.a(z.a(I.a(this.f82124b, Integer.hashCode(this.f82123a) * 31, 31), 31, this.f82125c), 31, this.f82126d), 31, this.f82127e), 31), 31, this.f82129g);
            Function0<Unit> function0 = this.h;
            int iA2 = J2.g.a(z.a(I.a(this.f82119D, I.a(this.f82118C, I.a(this.f82117B, z.a(I.a(this.f82147z, I.a(this.f82146y, I.a(this.f82145x, I.a(this.f82144w, I.a(this.f82143v, I.a(this.f82142u, z.a(I.a(this.f82140s, I.a(this.f82139r, I.a(this.f82138q, I.E.a(z.a(z.a(I.a(this.f82134m, z.a(C3357h.a(z.a(z.a((iA + (function0 == null ? 0 : function0.hashCode())) * 31, 31, this.f82130i), 31, this.f82131j), 31, this.f82132k), 31, this.f82133l), 31), 31, this.f82135n), 31, this.f82136o), 31, this.f82137p), 31), 31), 31), 31, this.f82141t), 31), 31), 31), 31), 31), 31), 31, this.f82116A), 31), 31), 31), 31, this.f82120E), this.f82121F, 31);
            Flow<WindowInsetsCompat> flow = this.f82122G;
            return iA2 + (flow == null ? 0 : flow.hashCode());
        }

        @NotNull
        public final String toString() {
            return "Config(widthPercent=" + this.f82123a + ", heightPercent=" + this.f82124b + ", navVisible=" + this.f82125c + ", halfCloseButtonVisible=" + this.f82126d + ", maskCloseEnable=" + this.f82127e + ", maskTransparency=" + this.f82128f + ", containerBackgroundColor=" + Color.m2637toStringimpl(this.f82129g) + ", onContainerDestroyed=" + this.h + ", dialogAnimation=" + this.f82130i + ", dragToCloseEnabled=" + this.f82131j + ", isLargeLandscape=" + this.f82132k + ", shadowEnabled=" + this.f82133l + ", shadowColor=" + this.f82134m + ", shadowMatchParent=" + this.f82135n + ", titleEnabled=" + this.f82136o + ", title=" + this.f82137p + ", titleBgColor=" + this.f82138q + ", titleTextColor=" + this.f82139r + ", topSplitColor=" + this.f82140s + ", useImmersiveCloseBtn=" + this.f82141t + ", closeImageTintColor=" + this.f82142u + ", containerBg=" + this.f82143v + ", containerBgColor=" + this.f82144w + ", viewBgColor=" + this.f82145x + ", loadingBgColor=" + this.f82146y + ", errorBgColor=" + this.f82147z + ", enableRoundCorner=" + this.f82116A + ", componentTopSpaceHeight=" + this.f82117B + ", componentMaxWidth=" + this.f82118C + ", componentContentHeight=" + this.f82119D + ", useBuiltInLoadingUi=" + this.f82120E + ", privacyControllers=" + this.f82121F + ", windowInsetsCompatFlow=" + this.f82122G + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/web/PlayerV3WebGeneralUIComponent$b.class */
    public static final class b implements IWebCustomModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final C1488q1 f82148a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Z9.d f82149b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final Map<KClass<?>, IPrivacyController> f82150c;

        public b(@NotNull C1488q1 c1488q1, @NotNull Z9.d dVar, @NotNull Map map) {
            this.f82148a = c1488q1;
            this.f82149b = dVar;
            this.f82150c = map;
        }

        @NotNull
        public final Map<KClass<?>, IPrivacyController> getPrivacyControllers() {
            return this.f82150c;
        }

        public final boolean onContainerCloseRequested() {
            this.f82149b.invoke();
            return Boolean.TRUE.booleanValue();
        }

        public void onContainerEvent(@NotNull ContainerEvent containerEvent) {
            this.f82148a.invoke(containerEvent);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent$bindToView$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/web/PlayerV3WebGeneralUIComponent$bindToView$1.class */
    public static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        Object result;
        final PlayerV3WebGeneralUIComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PlayerV3WebGeneralUIComponent playerV3WebGeneralUIComponent, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = playerV3WebGeneralUIComponent;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.bindToView(null, this);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent$bindToView$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/web/PlayerV3WebGeneralUIComponent$bindToView$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<?>, Object> {
        final WebContainerInsetsDispatcher $insetsDispatcher;
        final c $viewEntry;
        private Object L$0;
        int label;
        final PlayerV3WebGeneralUIComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent$bindToView$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/web/PlayerV3WebGeneralUIComponent$bindToView$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final c $viewEntry;
            int label;
            final PlayerV3WebGeneralUIComponent this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PlayerV3WebGeneralUIComponent playerV3WebGeneralUIComponent, c cVar, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = playerV3WebGeneralUIComponent;
                this.$viewEntry = cVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$viewEntry, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    PlayerV3WebGeneralUIComponent playerV3WebGeneralUIComponent = this.this$0;
                    c cVar = this.$viewEntry;
                    this.label = 1;
                    Object objCollect = FlowKt.drop(playerV3WebGeneralUIComponent.f82105n, 1).collect(new p(cVar, playerV3WebGeneralUIComponent), this);
                    if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objCollect = Unit.INSTANCE;
                    }
                    if (objCollect == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent$bindToView$2$2, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/web/PlayerV3WebGeneralUIComponent$bindToView$2$2.class */
        public static final class C05342 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final c $viewEntry;
            int label;
            final PlayerV3WebGeneralUIComponent this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05342(PlayerV3WebGeneralUIComponent playerV3WebGeneralUIComponent, c cVar, Continuation<? super C05342> continuation) {
                super(2, continuation);
                this.this$0 = playerV3WebGeneralUIComponent;
                this.$viewEntry = cVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05342(this.this$0, this.$viewEntry, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    PlayerV3WebGeneralUIComponent playerV3WebGeneralUIComponent = this.this$0;
                    c cVar = this.$viewEntry;
                    this.label = 1;
                    if (PlayerV3WebGeneralUIComponent.a(playerV3WebGeneralUIComponent, cVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent$bindToView$2$3, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/web/PlayerV3WebGeneralUIComponent$bindToView$2$3.class */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final c $viewEntry;
            int label;
            final PlayerV3WebGeneralUIComponent this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(PlayerV3WebGeneralUIComponent playerV3WebGeneralUIComponent, c cVar, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = playerV3WebGeneralUIComponent;
                this.$viewEntry = cVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, this.$viewEntry, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    PlayerV3WebGeneralUIComponent playerV3WebGeneralUIComponent = this.this$0;
                    c cVar = this.$viewEntry;
                    this.label = 1;
                    if (PlayerV3WebGeneralUIComponent.c(playerV3WebGeneralUIComponent, cVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent$bindToView$2$4, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/web/PlayerV3WebGeneralUIComponent$bindToView$2$4.class */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final c $viewEntry;
            int label;
            final PlayerV3WebGeneralUIComponent this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(PlayerV3WebGeneralUIComponent playerV3WebGeneralUIComponent, c cVar, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = playerV3WebGeneralUIComponent;
                this.$viewEntry = cVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.this$0, this.$viewEntry, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    PlayerV3WebGeneralUIComponent playerV3WebGeneralUIComponent = this.this$0;
                    c cVar = this.$viewEntry;
                    this.label = 1;
                    Object objCollect = FlowKt.drop(playerV3WebGeneralUIComponent.f82108q, 1).collect(new n(cVar), this);
                    if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objCollect = Unit.INSTANCE;
                    }
                    if (objCollect == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent$bindToView$2$5, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/web/PlayerV3WebGeneralUIComponent$bindToView$2$5.class */
        public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final c $viewEntry;
            int label;
            final PlayerV3WebGeneralUIComponent this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass5(PlayerV3WebGeneralUIComponent playerV3WebGeneralUIComponent, c cVar, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.this$0 = playerV3WebGeneralUIComponent;
                this.$viewEntry = cVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass5(this.this$0, this.$viewEntry, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    PlayerV3WebGeneralUIComponent playerV3WebGeneralUIComponent = this.this$0;
                    c cVar = this.$viewEntry;
                    this.label = 1;
                    Object objCollect = FlowKt.drop(playerV3WebGeneralUIComponent.f82109r, 1).collect(new l(cVar, playerV3WebGeneralUIComponent), this);
                    if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objCollect = Unit.INSTANCE;
                    }
                    if (objCollect == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent$bindToView$2$6, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/web/PlayerV3WebGeneralUIComponent$bindToView$2$6.class */
        public static final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final c $viewEntry;
            int label;
            final PlayerV3WebGeneralUIComponent this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass6(PlayerV3WebGeneralUIComponent playerV3WebGeneralUIComponent, c cVar, Continuation<? super AnonymousClass6> continuation) {
                super(2, continuation);
                this.this$0 = playerV3WebGeneralUIComponent;
                this.$viewEntry = cVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass6(this.this$0, this.$viewEntry, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    PlayerV3WebGeneralUIComponent playerV3WebGeneralUIComponent = this.this$0;
                    c cVar = this.$viewEntry;
                    this.label = 1;
                    if (PlayerV3WebGeneralUIComponent.b(playerV3WebGeneralUIComponent, cVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent$bindToView$2$7, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/web/PlayerV3WebGeneralUIComponent$bindToView$2$7.class */
        public static final class AnonymousClass7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final WebContainerInsetsDispatcher $insetsDispatcher;
            int label;
            final PlayerV3WebGeneralUIComponent this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass7(PlayerV3WebGeneralUIComponent playerV3WebGeneralUIComponent, WebContainerInsetsDispatcher webContainerInsetsDispatcher, Continuation<? super AnonymousClass7> continuation) {
                super(2, continuation);
                this.this$0 = playerV3WebGeneralUIComponent;
                this.$insetsDispatcher = webContainerInsetsDispatcher;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass7(this.this$0, this.$insetsDispatcher, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object objCollectLatest;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    PlayerV3WebGeneralUIComponent playerV3WebGeneralUIComponent = this.this$0;
                    WebContainerInsetsDispatcher webContainerInsetsDispatcher = this.$insetsDispatcher;
                    this.label = 1;
                    Flow<WindowInsetsCompat> flow = playerV3WebGeneralUIComponent.f82098f;
                    if (flow != null) {
                        objCollectLatest = FlowKt.collectLatest(flow, new PlayerV3WebGeneralUIComponent$collectWindowInsetsCompat$2(webContainerInsetsDispatcher, null), this);
                        if (objCollectLatest != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            objCollectLatest = Unit.INSTANCE;
                        }
                    } else {
                        objCollectLatest = Unit.INSTANCE;
                    }
                    if (objCollectLatest == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(WebContainerInsetsDispatcher webContainerInsetsDispatcher, PlayerV3WebGeneralUIComponent playerV3WebGeneralUIComponent, c cVar, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$insetsDispatcher = webContainerInsetsDispatcher;
            this.this$0 = playerV3WebGeneralUIComponent;
            this.$viewEntry = cVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$insetsDispatcher, this.this$0, this.$viewEntry, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<?> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$viewEntry, null), 3, (Object) null);
                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C05342(this.this$0, this.$viewEntry, null), 3, (Object) null);
                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, this.$viewEntry, null), 3, (Object) null);
                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this.this$0, this.$viewEntry, null), 3, (Object) null);
                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this.this$0, this.$viewEntry, null), 3, (Object) null);
                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass6(this.this$0, this.$viewEntry, null), 3, (Object) null);
                WebContainerInsetsDispatcher webContainerInsetsDispatcher = this.$insetsDispatcher;
                if (webContainerInsetsDispatcher != null) {
                    BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass7(this.this$0, webContainerInsetsDispatcher, null), 3, (Object) null);
                }
                this.label = 1;
                if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/web/PlayerV3WebGeneralUIComponent$c.class */
    @StabilityInferred(parameters = 0)
    public static final class c implements UIComponent.ViewEntry {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ConstraintLayout f82151a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final View f82152b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final View f82153c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final View f82154d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final View f82155e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final ImageView f82156f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final ConstraintLayout f82157g;

        @NotNull
        public final ImageView h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public final View f82158i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public final PlayerWebNestedSwipeDismissLayout f82159j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        public final FragmentContainerView f82160k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NotNull
        public final ConstraintLayout f82161l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @NotNull
        public final ConstraintLayout f82162m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @NotNull
        public final TextView f82163n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @NotNull
        public final View f82164o;

        public c(@NotNull ConstraintLayout constraintLayout, @NotNull View view, @NotNull View view2, @NotNull View view3, @NotNull View view4, @NotNull ImageView imageView, @NotNull ConstraintLayout constraintLayout2, @NotNull ImageView imageView2, @NotNull View view5, @NotNull PlayerWebNestedSwipeDismissLayout playerWebNestedSwipeDismissLayout, @NotNull FragmentContainerView fragmentContainerView, @NotNull ConstraintLayout constraintLayout3, @NotNull ConstraintLayout constraintLayout4, @NotNull TextView textView, @NotNull View view6) {
            this.f82151a = constraintLayout;
            this.f82152b = view;
            this.f82153c = view2;
            this.f82154d = view3;
            this.f82155e = view4;
            this.f82156f = imageView;
            this.f82157g = constraintLayout2;
            this.h = imageView2;
            this.f82158i = view5;
            this.f82159j = playerWebNestedSwipeDismissLayout;
            this.f82160k = fragmentContainerView;
            this.f82161l = constraintLayout3;
            this.f82162m = constraintLayout4;
            this.f82163n = textView;
            this.f82164o = view6;
        }

        public final View getRoot() {
            return this.f82151a;
        }
    }

    public PlayerV3WebGeneralUIComponent() {
        throw null;
    }

    public PlayerV3WebGeneralUIComponent(FragmentManager fragmentManager, IWebGeneralFragmentProvider iWebGeneralFragmentProvider, String str, h hVar, b bVar, String str2, u uVar, Flow flow, Function0 function0) {
        this.f82093a = fragmentManager;
        this.f82094b = iWebGeneralFragmentProvider;
        this.f82095c = bVar;
        this.f82096d = str2;
        this.f82097e = uVar;
        this.f82098f = flow;
        this.f82099g = function0;
        this.h = (ImmutableWebRequest) hVar.invoke(str);
        this.f82100i = new LinkedHashMap<>();
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, (BufferOverflow) null, 5, (Object) null);
        this.f82101j = mutableSharedFlowMutableSharedFlow$default;
        this.f82102k = mutableSharedFlowMutableSharedFlow$default;
        MutableSharedFlow<ContainerEvent> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, Integer.MAX_VALUE, (BufferOverflow) null, 5, (Object) null);
        this.f82103l = mutableSharedFlowMutableSharedFlow$default2;
        this.f82104m = mutableSharedFlowMutableSharedFlow$default2;
        this.f82105n = StateFlowKt.MutableStateFlow(0);
        this.f82106o = StateFlowKt.MutableStateFlow(Integer.valueOf(uVar.f82263u));
        this.f82107p = StateFlowKt.MutableStateFlow(Integer.valueOf(uVar.f82262t));
        this.f82108q = StateFlowKt.MutableStateFlow(Boolean.valueOf(uVar.f82249f));
        this.f82109r = StateFlowKt.MutableStateFlow(0);
        this.f82110s = StateFlowKt.MutableStateFlow(w.b.f82267a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent r5, com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent.c r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws kotlin.KotlinNothingValueException {
        /*
            r0 = r5
            java.lang.Class r0 = r0.getClass()
            r0 = r7
            boolean r0 = r0 instanceof com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent$collectContentMaxWidth$1
            if (r0 == 0) goto L2e
            r0 = r7
            com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent$collectContentMaxWidth$1 r0 = (com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent$collectContentMaxWidth$1) r0
            r9 = r0
            r0 = r9
            int r0 = r0.label
            r8 = r0
            r0 = r8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2e
            r0 = r9
            r1 = r8
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r9
            r7 = r0
            goto L38
        L2e:
            com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent$collectContentMaxWidth$1 r0 = new com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent$collectContentMaxWidth$1
            r1 = r0
            r2 = r5
            r3 = r7
            r1.<init>(r2, r3)
            r7 = r0
        L38:
            r0 = r7
            java.lang.Object r0 = r0.result
            r10 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r9 = r0
            r0 = r7
            int r0 = r0.label
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L63
            r0 = r8
            r1 = 1
            if (r0 == r1) goto L5b
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L5b:
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            goto L89
        L63:
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            com.bilibili.playerbizcommonv2.web.k r0 = new com.bilibili.playerbizcommonv2.web.k
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            r6 = r0
            r0 = r7
            r1 = 1
            r0.label = r1
            r0 = r5
            kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> r0 = r0.f82106o
            r1 = r6
            r2 = r7
            java.lang.Object r0 = r0.collect(r1, r2)
            r1 = r9
            if (r0 != r1) goto L89
            r0 = r9
            return r0
        L89:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r1 = r0
            r1.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent.a(com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent, com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent$c, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent r5, com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent.c r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws kotlin.KotlinNothingValueException {
        /*
            r0 = r5
            java.lang.Class r0 = r0.getClass()
            r0 = r7
            boolean r0 = r0 instanceof com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent$collectLoadStateUi$1
            if (r0 == 0) goto L2e
            r0 = r7
            com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent$collectLoadStateUi$1 r0 = (com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent$collectLoadStateUi$1) r0
            r9 = r0
            r0 = r9
            int r0 = r0.label
            r8 = r0
            r0 = r8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2e
            r0 = r9
            r1 = r8
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r9
            r7 = r0
            goto L38
        L2e:
            com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent$collectLoadStateUi$1 r0 = new com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent$collectLoadStateUi$1
            r1 = r0
            r2 = r5
            r3 = r7
            r1.<init>(r2, r3)
            r7 = r0
        L38:
            r0 = r7
            java.lang.Object r0 = r0.result
            r10 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r9 = r0
            r0 = r7
            int r0 = r0.label
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L63
            r0 = r8
            r1 = 1
            if (r0 == r1) goto L5b
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L5b:
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            goto L9c
        L63:
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r5
            com.bilibili.playerbizcommonv2.web.u r0 = r0.f82097e
            boolean r0 = r0.f82265w
            if (r0 != 0) goto L79
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            r5 = r0
            goto L9a
        L79:
            com.bilibili.playerbizcommonv2.web.m r0 = new com.bilibili.playerbizcommonv2.web.m
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            r6 = r0
            r0 = r7
            r1 = 1
            r0.label = r1
            r0 = r5
            kotlinx.coroutines.flow.MutableStateFlow<com.bilibili.playerbizcommonv2.web.w> r0 = r0.f82110s
            r1 = r6
            r2 = r7
            java.lang.Object r0 = r0.collect(r1, r2)
            r1 = r9
            if (r0 != r1) goto L9c
            r0 = r9
            r5 = r0
        L9a:
            r0 = r5
            return r0
        L9c:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r1 = r0
            r1.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent.b(com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent, com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent$c, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent r5, com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent.c r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws kotlin.KotlinNothingValueException {
        /*
            r0 = r5
            java.lang.Class r0 = r0.getClass()
            r0 = r7
            boolean r0 = r0 instanceof com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent$collectTopSpaceHeight$1
            if (r0 == 0) goto L2e
            r0 = r7
            com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent$collectTopSpaceHeight$1 r0 = (com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent$collectTopSpaceHeight$1) r0
            r9 = r0
            r0 = r9
            int r0 = r0.label
            r8 = r0
            r0 = r8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2e
            r0 = r9
            r1 = r8
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r9
            r7 = r0
            goto L38
        L2e:
            com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent$collectTopSpaceHeight$1 r0 = new com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent$collectTopSpaceHeight$1
            r1 = r0
            r2 = r5
            r3 = r7
            r1.<init>(r2, r3)
            r7 = r0
        L38:
            r0 = r7
            java.lang.Object r0 = r0.result
            r10 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r9 = r0
            r0 = r7
            int r0 = r0.label
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L63
            r0 = r8
            r1 = 1
            if (r0 == r1) goto L5b
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L5b:
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            goto L8a
        L63:
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            com.bilibili.playerbizcommonv2.web.o r0 = new com.bilibili.playerbizcommonv2.web.o
            r1 = r0
            r2 = r6
            r3 = r5
            r1.<init>(r2, r3)
            r6 = r0
            r0 = r7
            r1 = 1
            r0.label = r1
            r0 = r5
            kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> r0 = r0.f82107p
            r1 = r6
            r2 = r7
            java.lang.Object r0 = r0.collect(r1, r2)
            r1 = r9
            if (r0 != r1) goto L8a
            r0 = r9
            return r0
        L8a:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r1 = r0
            r1.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent.c(com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent, com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent$c, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        Drawable drawable;
        Drawable drawable2;
        int iGenerateViewId = View.generateViewId();
        Lazy lazy = LazyKt.lazy(new C2276v0(7));
        Lazy lazy2 = LazyKt.lazy(new C2279w0(8));
        Lazy lazy3 = LazyKt.lazy(new C2282x0(8));
        Lazy lazy4 = LazyKt.lazy(new C2285y0(6));
        Lazy lazy5 = LazyKt.lazy(new Eh.a(9));
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        constraintLayout.setClickable(true);
        constraintLayout.setFocusable(true);
        View view = new View(context);
        view.setId(View.generateViewId());
        View view2 = new View(context);
        view2.setId(View.generateViewId());
        u uVar = this.f82097e;
        view2.setBackgroundColor(uVar.f82247d ? uVar.f82248e : 0);
        boolean z6 = uVar.f82247d;
        view2.setClickable(z6);
        view2.setFocusable(z6);
        View view3 = new View(context);
        view3.setId(View.generateViewId());
        int i7 = uVar.f82256n;
        if (i7 != -1) {
            view3.setBackgroundResource(i7);
        } else {
            int i8 = uVar.f82257o;
            if (i8 == -1) {
                i8 = -1;
            }
            view3.setBackgroundColor(i8);
        }
        PlayerWebNestedSwipeDismissLayout playerWebNestedSwipeDismissLayout = new PlayerWebNestedSwipeDismissLayout(context, null);
        playerWebNestedSwipeDismissLayout.setId(View.generateViewId());
        playerWebNestedSwipeDismissLayout.setClipChildren(false);
        playerWebNestedSwipeDismissLayout.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(View.generateViewId());
        Function0<Boolean> function0 = uVar.f82246c;
        if (!((Boolean) function0.invoke()).booleanValue()) {
            frameLayout.setBackgroundColor(ContextCompat.getColor(frameLayout.getContext(), R$color.Bg2_float));
        }
        ImageView imageView = new ImageView(context);
        imageView.setId(View.generateViewId());
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImportantForAccessibility(2);
        if (!((Boolean) function0.invoke()).booleanValue()) {
            imageView.setImageResource(2131239499);
        }
        ConstraintLayout constraintLayout2 = new ConstraintLayout(context);
        constraintLayout2.setId(View.generateViewId());
        boolean z7 = uVar.f82250g;
        constraintLayout2.setVisibility(z7 ? 0 : 8);
        int i9 = uVar.f82251i;
        if (i9 != 0) {
            constraintLayout2.setBackgroundColor(i9);
        }
        TextView textView = new TextView(context);
        textView.setId(View.generateViewId());
        textView.setText(uVar.h);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(14.0f);
        textView.setGravity(16);
        int i10 = uVar.f82252j;
        if (i10 != 0) {
            textView.setTextColor(i10);
        }
        textView.setPadding(((Number) lazy2.getValue()).intValue(), 0, ((Number) lazy2.getValue()).intValue(), 0);
        ImageView imageView2 = new ImageView(context);
        imageView2.setId(View.generateViewId());
        imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView2.setImageResource(2131239056);
        boolean z8 = uVar.f82254l;
        imageView2.setVisibility((z8 || !z7) ? 8 : 0);
        if (uVar.f82255m != 0 && (drawable2 = imageView2.getDrawable()) != null) {
            Drawable drawableWrap = DrawableCompat.wrap(drawable2.mutate());
            DrawableCompat.setTint(drawableWrap, uVar.f82255m);
            DrawableCompat.setTintMode(drawableWrap, PorterDuff.Mode.SRC_IN);
            imageView2.setImageDrawable(drawableWrap);
        }
        View view4 = new View(context);
        view4.setId(View.generateViewId());
        int i11 = uVar.f82253k;
        if (i11 != 0) {
            view4.setBackgroundColor(i11);
        }
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        fragmentContainerView.setId(View.generateViewId());
        int i12 = uVar.f82258p;
        if (i12 == -1) {
            i12 = -1;
        }
        fragmentContainerView.setBackgroundColor(i12);
        ConstraintLayout constraintLayout3 = new ConstraintLayout(context);
        constraintLayout3.setId(View.generateViewId());
        constraintLayout3.setVisibility(uVar.f82265w ? 0 : 8);
        int i13 = uVar.f82259q;
        if (i13 == -1) {
            i13 = -1;
        }
        constraintLayout3.setBackgroundColor(i13);
        ProgressBar progressBar = new ProgressBar(context);
        progressBar.setId(View.generateViewId());
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
        layoutParams.topToTop = 0;
        layoutParams.bottomToBottom = 0;
        layoutParams.leftToLeft = 0;
        layoutParams.rightToRight = 0;
        Unit unit = Unit.INSTANCE;
        constraintLayout3.addView(progressBar, layoutParams);
        ConstraintLayout constraintLayout4 = new ConstraintLayout(context);
        constraintLayout4.setId(View.generateViewId());
        constraintLayout4.setVisibility(8);
        int i14 = uVar.f82260r;
        if (i14 == -1) {
            i14 = -1;
        }
        constraintLayout4.setBackgroundColor(i14);
        TextView textView2 = new TextView(context);
        textView2.setId(iGenerateViewId);
        textView2.setText("加载失败，点击重试");
        textView2.setTextSize(14.0f);
        textView2.setTextColor(android.graphics.Color.parseColor("#999999"));
        textView2.setGravity(17);
        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(-2, -2);
        layoutParams2.topToTop = 0;
        layoutParams2.bottomToBottom = 0;
        layoutParams2.leftToLeft = 0;
        layoutParams2.rightToRight = 0;
        constraintLayout4.addView(textView2, layoutParams2);
        TextView textView3 = (TextView) constraintLayout4.findViewById(iGenerateViewId);
        ImageView imageView3 = new ImageView(context);
        imageView3.setId(View.generateViewId());
        imageView3.setImageResource(2131239055);
        imageView3.setImageTintList(ColorStateList.valueOf(-1));
        imageView3.setVisibility(z8 ? 0 : 8);
        if (uVar.f82255m != 0 && (drawable = imageView3.getDrawable()) != null) {
            Drawable drawableWrap2 = DrawableCompat.wrap(drawable.mutate());
            DrawableCompat.setTint(drawableWrap2, uVar.f82255m);
            DrawableCompat.setTintMode(drawableWrap2, PorterDuff.Mode.SRC_IN);
            imageView3.setImageDrawable(drawableWrap2);
        }
        constraintLayout.addView(view);
        constraintLayout.addView(view2);
        constraintLayout.addView(playerWebNestedSwipeDismissLayout);
        playerWebNestedSwipeDismissLayout.addView(view3);
        playerWebNestedSwipeDismissLayout.addView(frameLayout);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(DimenUtilsKt.dpToPx(30), DimenUtilsKt.dpToPx(3), 17));
        playerWebNestedSwipeDismissLayout.addView(constraintLayout2);
        constraintLayout2.addView(textView);
        constraintLayout2.addView(imageView2);
        constraintLayout2.addView(view4);
        playerWebNestedSwipeDismissLayout.addView(fragmentContainerView);
        playerWebNestedSwipeDismissLayout.addView(constraintLayout3);
        playerWebNestedSwipeDismissLayout.addView(constraintLayout4);
        playerWebNestedSwipeDismissLayout.addView(imageView3);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(constraintLayout);
        int iCoerceAtLeast = RangesKt.coerceAtLeast(uVar.f82264v, 0);
        constraintSet.constrainWidth(view.getId(), 0);
        constraintSet.constrainHeight(view.getId(), RangesKt.coerceAtLeast(uVar.f82262t, 0));
        int i15 = uVar.f82263u;
        if (i15 > 0) {
            constraintSet.constrainMaxWidth(view.getId(), i15);
        }
        constraintSet.connect(view.getId(), 1, 0, 1);
        constraintSet.connect(view.getId(), 2, 0, 2);
        constraintSet.connect(view.getId(), 3, 0, 3);
        constraintSet.constrainWidth(view2.getId(), 0);
        constraintSet.constrainHeight(view2.getId(), 0);
        constraintSet.connect(view2.getId(), 1, 0, 1);
        constraintSet.connect(view2.getId(), 2, 0, 2);
        constraintSet.connect(view2.getId(), 4, 0, 4);
        if (uVar.f82249f) {
            constraintSet.connect(view2.getId(), 3, 0, 3);
        } else {
            constraintSet.connect(view2.getId(), 3, view.getId(), 4);
        }
        constraintSet.constrainWidth(playerWebNestedSwipeDismissLayout.getId(), 0);
        constraintSet.constrainHeight(playerWebNestedSwipeDismissLayout.getId(), iCoerceAtLeast > 0 ? iCoerceAtLeast : 0);
        constraintSet.connect(playerWebNestedSwipeDismissLayout.getId(), 1, view.getId(), 1);
        constraintSet.connect(playerWebNestedSwipeDismissLayout.getId(), 2, view.getId(), 2);
        constraintSet.connect(playerWebNestedSwipeDismissLayout.getId(), 4, 0, 4);
        if (iCoerceAtLeast <= 0) {
            constraintSet.connect(playerWebNestedSwipeDismissLayout.getId(), 3, view.getId(), 4);
        }
        constraintSet.applyTo(constraintLayout);
        ConstraintSet constraintSet2 = new ConstraintSet();
        constraintSet2.clone(playerWebNestedSwipeDismissLayout);
        constraintSet2.constrainWidth(view3.getId(), 0);
        constraintSet2.constrainHeight(view3.getId(), 0);
        constraintSet2.connect(view3.getId(), 1, 0, 1);
        constraintSet2.connect(view3.getId(), 2, 0, 2);
        constraintSet2.connect(view3.getId(), 3, 0, 3);
        constraintSet2.connect(view3.getId(), 4, 0, 4);
        constraintSet2.constrainWidth(frameLayout.getId(), 0);
        constraintSet2.constrainHeight(frameLayout.getId(), ((!((Boolean) function0.invoke()).booleanValue() ? DimenUtilsKt.dpToPx(8) : DimenUtilsKt.dpToPx(4.5f)) * 2) + DimenUtilsKt.dpToPx(3));
        constraintSet2.connect(frameLayout.getId(), 1, view3.getId(), 1);
        constraintSet2.connect(frameLayout.getId(), 2, view3.getId(), 2);
        constraintSet2.connect(frameLayout.getId(), 3, view3.getId(), 3);
        constraintSet2.constrainWidth(constraintLayout2.getId(), 0);
        constraintSet2.constrainHeight(constraintLayout2.getId(), ((Number) lazy.getValue()).intValue());
        constraintSet2.connect(constraintLayout2.getId(), 1, view3.getId(), 1);
        constraintSet2.connect(constraintLayout2.getId(), 2, view3.getId(), 2);
        constraintSet2.connect(constraintLayout2.getId(), 3, frameLayout.getId(), 4);
        int id = constraintLayout2.getId();
        int i16 = 8;
        if (z7) {
            i16 = 0;
        }
        constraintSet2.setVisibility(id, i16);
        constraintSet2.constrainWidth(fragmentContainerView.getId(), 0);
        constraintSet2.constrainHeight(fragmentContainerView.getId(), 0);
        constraintSet2.connect(fragmentContainerView.getId(), 1, view3.getId(), 1);
        constraintSet2.connect(fragmentContainerView.getId(), 2, view3.getId(), 2);
        constraintSet2.connect(fragmentContainerView.getId(), 3, z7 ? constraintLayout2.getId() : frameLayout.getId(), 4);
        constraintSet2.connect(fragmentContainerView.getId(), 4, view3.getId(), 4);
        Iterator it = CollectionsKt.listOf(new Integer[]{Integer.valueOf(constraintLayout3.getId()), Integer.valueOf(constraintLayout4.getId())}).iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            constraintSet2.constrainWidth(iIntValue, 0);
            constraintSet2.constrainHeight(iIntValue, 0);
            constraintSet2.connect(iIntValue, 1, fragmentContainerView.getId(), 1);
            constraintSet2.connect(iIntValue, 2, fragmentContainerView.getId(), 2);
            constraintSet2.connect(iIntValue, 3, fragmentContainerView.getId(), 3);
            constraintSet2.connect(iIntValue, 4, fragmentContainerView.getId(), 4);
        }
        constraintSet2.constrainWidth(imageView3.getId(), ((Number) lazy4.getValue()).intValue());
        constraintSet2.constrainHeight(imageView3.getId(), ((Number) lazy4.getValue()).intValue());
        constraintSet2.connect(imageView3.getId(), 2, view3.getId(), 2, ((Number) lazy5.getValue()).intValue());
        constraintSet2.connect(imageView3.getId(), 3, view3.getId(), 3, ((Number) lazy5.getValue()).intValue());
        constraintSet2.applyTo(playerWebNestedSwipeDismissLayout);
        ConstraintSet constraintSet3 = new ConstraintSet();
        constraintSet3.clone(constraintLayout2);
        constraintSet3.constrainWidth(textView.getId(), 0);
        constraintSet3.constrainHeight(textView.getId(), -1);
        constraintSet3.connect(textView.getId(), 1, 0, 1);
        constraintSet3.connect(textView.getId(), 2, imageView2.getId(), 1);
        constraintSet3.connect(textView.getId(), 3, 0, 3);
        constraintSet3.connect(textView.getId(), 4, 0, 4);
        constraintSet3.constrainWidth(imageView2.getId(), ((Number) lazy3.getValue()).intValue());
        constraintSet3.constrainHeight(imageView2.getId(), -1);
        constraintSet3.connect(imageView2.getId(), 2, 0, 2);
        constraintSet3.connect(imageView2.getId(), 3, 0, 3);
        constraintSet3.connect(imageView2.getId(), 4, 0, 4);
        constraintSet3.constrainWidth(view4.getId(), -1);
        constraintSet3.constrainHeight(view4.getId(), 1);
        constraintSet3.connect(view4.getId(), 1, 0, 1);
        constraintSet3.connect(view4.getId(), 2, 0, 2);
        constraintSet3.connect(view4.getId(), 4, 0, 4);
        constraintSet3.applyTo(constraintLayout2);
        c cVar = new c(constraintLayout, view, view2, view3, frameLayout, imageView, constraintLayout2, imageView2, view4, playerWebNestedSwipeDismissLayout, fragmentContainerView, constraintLayout3, constraintLayout4, textView3, imageView3);
        if (uVar.f82244a) {
            constraintLayout.setAlpha(0.0f);
        }
        return cVar;
    }

    public final void d() {
        if (this.f82112u) {
            return;
        }
        final c cVar = this.f82111t;
        u uVar = this.f82097e;
        if (uVar.f82244a && cVar != null) {
            ConstraintLayout constraintLayout = cVar.f82151a;
            if (constraintLayout.getWidth() != 0 && constraintLayout.getHeight() != 0) {
                this.f82112u = true;
                final boolean zBooleanValue = ((Boolean) uVar.f82246c.invoke()).booleanValue();
                float width = zBooleanValue ? constraintLayout.getWidth() : constraintLayout.getHeight();
                PlayerWebNestedSwipeDismissLayout playerWebNestedSwipeDismissLayout = cVar.f82159j;
                final List listListOf = CollectionsKt.listOf(playerWebNestedSwipeDismissLayout);
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(zBooleanValue ? playerWebNestedSwipeDismissLayout.getTranslationX() : playerWebNestedSwipeDismissLayout.getTranslationY(), width);
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(listListOf, zBooleanValue) { // from class: com.bilibili.playerbizcommonv2.web.f

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final List f82224a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final boolean f82225b;

                    {
                        this.f82224a = listListOf;
                        this.f82225b = zBooleanValue;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        v.a(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f82224a, this.f82225b);
                    }
                });
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(cVar.f82153c.getAlpha(), 0.0f);
                valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(cVar) { // from class: com.bilibili.playerbizcommonv2.web.g

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final PlayerV3WebGeneralUIComponent.c f82226a;

                    {
                        this.f82226a = cVar;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        this.f82226a.f82153c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    }
                });
                Animator animator = this.f82115x;
                if (animator != null) {
                    animator.cancel();
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
                animatorSet.setDuration(200L);
                animatorSet.setInterpolator(new DecelerateInterpolator());
                animatorSet.addListener(new i(this));
                this.f82115x = animatorSet;
                animatorSet.start();
                return;
            }
        }
        this.f82101j.tryEmit(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x04de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object bindToView(@org.jetbrains.annotations.NotNull com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent.c r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent.bindToView(com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent$c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final PlayerWebNestedSwipeDismissLayout.Direction f() {
        return ((Boolean) this.f82097e.f82246c.invoke()).booleanValue() ? PlayerWebNestedSwipeDismissLayout.Direction.RIGHT : PlayerWebNestedSwipeDismissLayout.Direction.BOTTOM;
    }

    public final void g(c cVar) {
        u uVar = this.f82097e;
        boolean zBooleanValue = ((Boolean) uVar.f82246c.invoke()).booleanValue();
        PlayerWebNestedSwipeDismissLayout playerWebNestedSwipeDismissLayout = cVar.f82159j;
        PlayerWebNestedSwipeDismissLayout.Direction directionF = f();
        if (playerWebNestedSwipeDismissLayout.f82176g != directionF) {
            playerWebNestedSwipeDismissLayout.f82176g = directionF;
            playerWebNestedSwipeDismissLayout.C0(true);
        }
        View view = cVar.f82155e;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).height = ((!zBooleanValue ? DimenUtilsKt.dpToPx(8) : DimenUtilsKt.dpToPx(4.5f)) * 2) + DimenUtilsKt.dpToPx(3);
        view.setLayoutParams(layoutParams2);
        if (uVar.f82261s) {
            float fDpToPx = !zBooleanValue ? DimenUtilsKt.dpToPx(12.0f) : 0.0f;
            View view2 = cVar.f82154d;
            view2.setOutlineProvider(new j(fDpToPx));
            view2.setClipToOutline(true);
            View view3 = cVar.f82155e;
            view3.setOutlineProvider(new j(fDpToPx));
            view3.setClipToOutline(true);
        }
        if (zBooleanValue) {
            cVar.f82155e.setBackgroundColor(0);
            cVar.f82156f.setImageDrawable(null);
        } else {
            View view4 = cVar.f82155e;
            view4.setBackgroundColor(ContextCompat.getColor(view4.getContext(), R$color.Bg2_float));
            cVar.f82156f.setImageResource(2131239499);
        }
    }
}
