package com.bilibili.ship.theseus.cheese.biz.intro.pack;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.animation.z;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.compose.C4550g;
import androidx.constraintlayout.compose.C4551h;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.compose.ConstraintLayoutKt;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.HorizontalAnchorable;
import androidx.constraintlayout.compose.Measurer;
import androidx.constraintlayout.compose.ToolingUtilsKt;
import androidx.constraintlayout.compose.VerticalAnchorable;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import com.bilibili.ship.theseus.cheese.biz.intro.pack.CheesePackageLayerComponent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/pack/CheesePackageLayerComponent.class */
@StabilityInferred(parameters = 0)
public final class CheesePackageLayerComponent implements UIComponent<UIComponent.b<ComposeView>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f89479d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final o f89480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<v> f89481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final SharedFlow<v> f89482c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/pack/CheesePackageLayerComponent$a.class */
    public static final class a implements Function1<ConstrainScope, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f89483a = new Object();

        public final Object invoke(Object obj) {
            ConstrainScope constrainScope = (ConstrainScope) obj;
            HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(constrainScope.getTop(), constrainScope.getParent().getTop(), 0.0f, 0.0f, 6, null);
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getStart(), constrainScope.getParent().getStart(), 0.0f, 0.0f, 6, null);
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getEnd(), constrainScope.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/pack/CheesePackageLayerComponent$b.class */
    public static final class b implements Function1<ConstrainScope, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f89484a = new Object();

        public final Object invoke(Object obj) {
            ConstrainScope constrainScope = (ConstrainScope) obj;
            HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(constrainScope.getTop(), constrainScope.getParent().getTop(), 0.0f, 0.0f, 6, null);
            HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(constrainScope.getBottom(), constrainScope.getParent().getBottom(), 0.0f, 0.0f, 6, null);
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getStart(), constrainScope.getParent().getStart(), 0.0f, 0.0f, 6, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/pack/CheesePackageLayerComponent$c.class */
    public static final class c implements Function1<ConstrainScope, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConstrainedLayoutReference f89485a;

        public c(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f89485a = constrainedLayoutReference;
        }

        public final Object invoke(Object obj) {
            ConstrainScope constrainScope = (ConstrainScope) obj;
            HorizontalAnchorable top = constrainScope.getTop();
            ConstrainedLayoutReference constrainedLayoutReference = this.f89485a;
            HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(top, constrainedLayoutReference.getTop(), 0.0f, 0.0f, 6, null);
            HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(constrainScope.getBottom(), constrainedLayoutReference.getBottom(), 0.0f, 0.0f, 6, null);
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getEnd(), constrainScope.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/pack/CheesePackageLayerComponent$d.class */
    public static final class d implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function0<Unit> f89486a;

        public d(Function0<Unit> function0) {
            this.f89486a = function0;
        }

        public final Object invoke() {
            this.f89486a.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/pack/CheesePackageLayerComponent$e.class */
    public static final class e implements Function1<ConstrainScope, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConstrainedLayoutReference f89487a;

        public e(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f89487a = constrainedLayoutReference;
        }

        public final Object invoke(Object obj) {
            ConstrainScope constrainScope = (ConstrainScope) obj;
            HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(constrainScope.getTop(), this.f89487a.getBottom(), 0.0f, 0.0f, 6, null);
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getStart(), constrainScope.getParent().getStart(), 0.0f, 0.0f, 6, null);
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getEnd(), constrainScope.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/pack/CheesePackageLayerComponent$f.class */
    public static final class f implements Function1<ConstrainScope, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConstrainedLayoutReference f89488a;

        public f(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f89488a = constrainedLayoutReference;
        }

        public final Object invoke(Object obj) {
            ConstrainScope constrainScope = (ConstrainScope) obj;
            HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(constrainScope.getTop(), this.f89488a.getBottom(), 0.0f, 0.0f, 6, null);
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getStart(), constrainScope.getParent().getStart(), 0.0f, 0.0f, 6, null);
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getEnd(), constrainScope.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/pack/CheesePackageLayerComponent$g.class */
    public static final class g implements Function1<LazyListScope, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s f89489a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CheesePackageLayerComponent f89490b;

        public g(s sVar, CheesePackageLayerComponent cheesePackageLayerComponent) {
            this.f89489a = sVar;
            this.f89490b = cheesePackageLayerComponent;
        }

        public final Object invoke(Object obj) {
            List<t> list = this.f89489a.f89568b;
            ((LazyListScope) obj).items(((ArrayList) list).size(), null, new p(list), ComposableLambdaKt.composableLambdaInstance(2039820996, true, new q(list, this.f89490b)));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/pack/CheesePackageLayerComponent$h.class */
    public static final class h implements Function1<ConstrainScope, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f89491a;

        public h(boolean z6) {
            this.f89491a = z6;
        }

        public final Object invoke(Object obj) {
            ConstrainScope constrainScope = (ConstrainScope) obj;
            HorizontalAnchorable top = constrainScope.getTop();
            ConstraintLayoutBaseScope.HorizontalAnchor top2 = constrainScope.getParent().getTop();
            boolean z6 = this.f89491a;
            HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(top, top2, Dp.m3880constructorimpl(z6 ? 9 : 10), 0.0f, 4, null);
            if (z6) {
                HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(constrainScope.getBottom(), constrainScope.getParent().getBottom(), Dp.m3880constructorimpl(3), 0.0f, 4, null);
            }
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getStart(), constrainScope.getParent().getStart(), 0.0f, 0.0f, 6, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/pack/CheesePackageLayerComponent$i.class */
    public static final class i implements Function1<DrawScope, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f89492a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Pair<Color, Color> f89493b;

        public i(Pair pair, boolean z6) {
            this.f89492a = z6;
            this.f89493b = pair;
        }

        public final Object invoke(Object obj) {
            DrawScope drawScope = (DrawScope) obj;
            Pair<Color, Color> pair = this.f89493b;
            boolean z6 = this.f89492a;
            long jColor = z6 ? ColorKt.Color(4281282610L) : ((Color) pair.getFirst()).m2639unboximpl();
            long jM2447constructorimpl = Offset.m2447constructorimpl((((long) Float.floatToRawIntBits(drawScope.mo1270toPx0680j_4(Dp.m3880constructorimpl(12.0f)))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L));
            long jM2518constructorimpl = Size.m2518constructorimpl((((long) Float.floatToRawIntBits(drawScope.mo1270toPx0680j_4(Dp.m3880constructorimpl(104)))) << 32) | (((long) Float.floatToRawIntBits(drawScope.mo1270toPx0680j_4(Dp.m3880constructorimpl(56)))) & 4294967295L));
            float f7 = 3;
            float fMo1270toPx0680j_4 = drawScope.mo1270toPx0680j_4(Dp.m3880constructorimpl(f7));
            DrawScope.m2913drawRoundRectuAw5IA$default(drawScope, jColor, jM2447constructorimpl, jM2518constructorimpl, CornerRadius.m2425constructorimpl((((long) Float.floatToRawIntBits(fMo1270toPx0680j_4)) << 32) | (((long) Float.floatToRawIntBits(fMo1270toPx0680j_4)) & 4294967295L)), null, 0.0f, null, 0, 240, null);
            long jColor2 = z6 ? ColorKt.Color(4280690472L) : ((Color) pair.getSecond()).m2639unboximpl();
            long jM2447constructorimpl2 = Offset.m2447constructorimpl((((long) Float.floatToRawIntBits(drawScope.mo1270toPx0680j_4(Dp.m3880constructorimpl(6.0f)))) << 32) | (((long) Float.floatToRawIntBits(drawScope.mo1270toPx0680j_4(Dp.m3880constructorimpl(f7)))) & 4294967295L));
            long jM2518constructorimpl2 = Size.m2518constructorimpl((((long) Float.floatToRawIntBits(drawScope.mo1270toPx0680j_4(Dp.m3880constructorimpl(116)))) << 32) | (((long) Float.floatToRawIntBits(drawScope.mo1270toPx0680j_4(Dp.m3880constructorimpl(64)))) & 4294967295L));
            float fMo1270toPx0680j_42 = drawScope.mo1270toPx0680j_4(Dp.m3880constructorimpl(f7));
            DrawScope.m2913drawRoundRectuAw5IA$default(drawScope, jColor2, jM2447constructorimpl2, jM2518constructorimpl2, CornerRadius.m2425constructorimpl((((long) Float.floatToRawIntBits(fMo1270toPx0680j_42)) << 32) | (((long) Float.floatToRawIntBits(fMo1270toPx0680j_42)) & 4294967295L)), null, 0.0f, null, 0, 240, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/pack/CheesePackageLayerComponent$j.class */
    public static final class j implements Function1<ConstrainScope, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConstrainedLayoutReference f89494a;

        public j(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f89494a = constrainedLayoutReference;
        }

        public final Object invoke(Object obj) {
            ConstrainScope constrainScope = (ConstrainScope) obj;
            HorizontalAnchorable top = constrainScope.getTop();
            ConstrainedLayoutReference constrainedLayoutReference = this.f89494a;
            ConstraintLayoutBaseScope.HorizontalAnchor top2 = constrainedLayoutReference.getTop();
            float f7 = 4;
            HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(top, top2, Dp.m3880constructorimpl(f7), 0.0f, 4, null);
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getEnd(), constrainedLayoutReference.getEnd(), Dp.m3880constructorimpl(f7), 0.0f, 4, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/pack/CheesePackageLayerComponent$k.class */
    public static final class k implements Function1<ConstrainScope, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConstrainedLayoutReference f89495a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ConstrainedLayoutReference f89496b;

        public k(ConstrainedLayoutReference constrainedLayoutReference, ConstrainedLayoutReference constrainedLayoutReference2) {
            this.f89495a = constrainedLayoutReference;
            this.f89496b = constrainedLayoutReference2;
        }

        public final Object invoke(Object obj) {
            ConstrainScope constrainScope = (ConstrainScope) obj;
            ConstrainScope.m4145linkToR7zmacU$default(constrainScope, constrainScope.getParent().getStart(), this.f89495a.getTop(), constrainScope.getParent().getEnd(), this.f89496b.getTop(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 4080, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/pack/CheesePackageLayerComponent$l.class */
    public static final class l implements Function1<ConstrainScope, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f89497a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ConstrainedLayoutReference f89498b;

        public l(boolean z6, ConstrainedLayoutReference constrainedLayoutReference) {
            this.f89497a = z6;
            this.f89498b = constrainedLayoutReference;
        }

        public final Object invoke(Object obj) {
            ConstrainScope constrainScope = (ConstrainScope) obj;
            HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(constrainScope.getBottom(), (this.f89497a ? constrainScope.getParent() : this.f89498b).getBottom(), 0.0f, 0.0f, 6, null);
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getStart(), constrainScope.getParent().getStart(), 0.0f, 0.0f, 6, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/pack/CheesePackageLayerComponent$m.class */
    public static final class m implements Function1<ConstrainScope, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f89499a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ConstrainedLayoutReference f89500b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ConstrainedLayoutReference f89501c;

        public m(ConstrainedLayoutReference constrainedLayoutReference, ConstrainedLayoutReference constrainedLayoutReference2, boolean z6) {
            this.f89499a = z6;
            this.f89500b = constrainedLayoutReference;
            this.f89501c = constrainedLayoutReference2;
        }

        public final Object invoke(Object obj) {
            ConstrainScope constrainScope = (ConstrainScope) obj;
            boolean z6 = this.f89499a;
            if (z6) {
                HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(constrainScope.getTop(), this.f89500b.getBottom(), Dp.m3880constructorimpl(6), 0.0f, 4, null);
            }
            HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(constrainScope.getBottom(), this.f89501c.getTop(), Dp.m3880constructorimpl(z6 ? 3 : 0), 0.0f, 4, null);
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getStart(), constrainScope.getParent().getStart(), 0.0f, 0.0f, 6, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/pack/CheesePackageLayerComponent$n.class */
    public static final class n implements Function1<ConstrainScope, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConstrainedLayoutReference f89502a;

        public n(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f89502a = constrainedLayoutReference;
        }

        public final Object invoke(Object obj) {
            ConstrainScope constrainScope = (ConstrainScope) obj;
            HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(constrainScope.getTop(), this.f89502a.getBottom(), Dp.m3880constructorimpl(10), 0.0f, 4, null);
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getStart(), constrainScope.getParent().getStart(), 0.0f, 0.0f, 6, null);
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getEnd(), constrainScope.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/pack/CheesePackageLayerComponent$o.class */
    @StabilityInferred(parameters = 0)
    public static final class o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final s f89503a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f89504b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final StateFlow<Integer> f89505c;

        public o(@NotNull s sVar, boolean z6, @NotNull StateFlow<Integer> stateFlow) {
            this.f89503a = sVar;
            this.f89504b = z6;
            this.f89505c = stateFlow;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return Intrinsics.areEqual(this.f89503a, oVar.f89503a) && this.f89504b == oVar.f89504b && Intrinsics.areEqual(this.f89505c, oVar.f89505c);
        }

        public final int hashCode() {
            return this.f89505c.hashCode() + z.a(this.f89503a.hashCode() * 31, 31, this.f89504b);
        }

        @NotNull
        public final String toString() {
            return "State(uiState=" + this.f89503a + ", hitPackageNewUIExp=" + this.f89504b + ", horizontalPaddingFlow=" + this.f89505c + ")";
        }
    }

    public CheesePackageLayerComponent(@NotNull o oVar) {
        this.f89480a = oVar;
        MutableSharedFlow<v> MutableSharedFlow = SharedFlowKt.MutableSharedFlow(0, 3, BufferOverflow.DROP_OLDEST);
        this.f89481b = MutableSharedFlow;
        this.f89482c = FlowKt.asSharedFlow(MutableSharedFlow);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void a(final o oVar, final Function0<Unit> function0, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-568966604);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(oVar) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(function0) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changedInstance(this) ? 256 : 128);
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 147) != 146, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-568966604, i10, -1, "com.bilibili.ship.theseus.cheese.biz.intro.pack.CheesePackageLayerComponent.CheesePackageLayer (CheesePackageLayerComponent.kt:71)");
            }
            final State stateCollectAsState = SnapshotStateKt.collectAsState(oVar.f89505c, null, composerStartRestartGroup, 0, 1);
            final s sVar = oVar.f89503a;
            BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(2092657644, true, new Function2(sVar, this, stateCollectAsState, function0) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.pack.l

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final s f89547a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final CheesePackageLayerComponent f89548b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final State f89549c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Function0 f89550d;

                {
                    this.f89547a = sVar;
                    this.f89548b = this;
                    this.f89549c = stateCollectAsState;
                    this.f89550d = function0;
                }

                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2092657644, iIntValue, -1, "com.bilibili.ship.theseus.cheese.biz.intro.pack.CheesePackageLayerComponent.CheesePackageLayer.<anonymous> (CheesePackageLayerComponent.kt:75)");
                        }
                        Modifier modifierM1169backgroundbw27NRU$default = BackgroundKt.m1169backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), BiliTheme.INSTANCE.getColors(composer2, BiliTheme.$stable).getWh0-0d7_KjU(), null, 2, null);
                        Object objA = C4550g.a(-270267587, composer2, -3687241);
                        Composer.Companion companion = Composer.Companion;
                        Object objA2 = objA;
                        if (objA == companion.getEmpty()) {
                            objA2 = Yb.a.a(composer2);
                        }
                        composer2.endReplaceableGroup();
                        Measurer measurer = (Measurer) objA2;
                        composer2.startReplaceableGroup(-3687241);
                        Object objRememberedValue = composer2.rememberedValue();
                        Object objA3 = objRememberedValue;
                        if (objRememberedValue == companion.getEmpty()) {
                            objA3 = C4551h.a(composer2);
                        }
                        composer2.endReplaceableGroup();
                        ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objA3;
                        composer2.startReplaceableGroup(-3687241);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        Object objMutableStateOf$default = objRememberedValue2;
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objMutableStateOf$default = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composer2.updateRememberedValue(objMutableStateOf$default);
                        }
                        composer2.endReplaceableGroup();
                        Pair<MeasurePolicy, Function0<Unit>> pairRememberConstraintLayoutMeasurePolicy = ConstraintLayoutKt.rememberConstraintLayoutMeasurePolicy(257, constraintLayoutScope, (MutableState<Boolean>) objMutableStateOf$default, measurer, composer2, 4544);
                        LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierM1169backgroundbw27NRU$default, false, new Function1<SemanticsPropertyReceiver, Unit>(measurer) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.pack.CheesePackageLayerComponent$CheesePackageLayer$lambda$1$$inlined$ConstraintLayout$1
                            final Measurer $measurer;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                                this.$measurer = measurer;
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                                invoke((SemanticsPropertyReceiver) obj3);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                ToolingUtilsKt.setDesignInfoProvider(semanticsPropertyReceiver, this.$measurer);
                            }
                        }, 1, null), ComposableLambdaKt.composableLambda(composer2, -819894182, true, new Function2<Composer, Integer, Unit>(constraintLayoutScope, 0, (Function0) pairRememberConstraintLayoutMeasurePolicy.component2(), this.f89547a, this.f89548b, this.f89549c, this.f89550d) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.pack.CheesePackageLayerComponent$CheesePackageLayer$lambda$1$$inlined$ConstraintLayout$2
                            final int $$changed;
                            final Function0 $closeLayer$inlined;
                            final Function0 $onHelpersChanged;
                            final State $padding$delegate$inlined;
                            final ConstraintLayoutScope $scope;
                            final s $uiState$inlined;
                            final CheesePackageLayerComponent this$0;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                                this.$scope = constraintLayoutScope;
                                this.$onHelpersChanged = function0;
                                this.$uiState$inlined = sVar;
                                this.this$0 = cheesePackageLayerComponent;
                                this.$padding$delegate$inlined = state;
                                this.$closeLayer$inlined = function0;
                                this.$$changed = i;
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4) {
                                invoke((Composer) obj3, ((Number) obj4).intValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:24:0x01f5  */
                            /* JADX WARN: Removed duplicated region for block: B:29:0x0298  */
                            /* JADX WARN: Removed duplicated region for block: B:34:0x02f7  */
                            @androidx.compose.runtime.Composable
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            public final void invoke(@org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r15, int r16) {
                                /*
                                    Method dump skipped, instruction units count: 836
                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.intro.pack.CheesePackageLayerComponent$CheesePackageLayer$lambda$1$$inlined$ConstraintLayout$2.invoke(androidx.compose.runtime.Composer, int):void");
                            }
                        }), (MeasurePolicy) pairRememberConstraintLayoutMeasurePolicy.component1(), composer2, 48, 0);
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(this, oVar, function0, i7) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.pack.m

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final CheesePackageLayerComponent f89551a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final CheesePackageLayerComponent.o f89552b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Function0 f89553c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final int f89554d;

                {
                    this.f89551a = this;
                    this.f89552b = oVar;
                    this.f89553c = function0;
                    this.f89554d = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f89554d | 1);
                    this.f89551a.a(this.f89552b, this.f89553c, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0204  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(final int r15, final com.bilibili.ship.theseus.cheese.biz.intro.pack.t r16, final kotlin.Pair<androidx.compose.ui.graphics.Color, androidx.compose.ui.graphics.Color> r17, final boolean r18, androidx.compose.runtime.Composer r19, final int r20) {
        /*
            Method dump skipped, instruction units count: 903
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.intro.pack.CheesePackageLayerComponent.b(int, com.bilibili.ship.theseus.cheese.biz.intro.pack.t, kotlin.Pair, boolean, androidx.compose.runtime.Composer, int):void");
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        final UIComponent.b bVar = (UIComponent.b) viewEntry;
        ((ComposeView) bVar.a).setContent(ComposableLambdaKt.composableLambdaInstance(1647815154, true, new Function2(this, bVar) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.pack.k

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CheesePackageLayerComponent f89545a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final UIComponent.b f89546b;

            {
                this.f89545a = this;
                this.f89546b = bVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0073  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke(java.lang.Object r7, java.lang.Object r8) {
                /*
                    r6 = this;
                    r0 = r7
                    androidx.compose.runtime.Composer r0 = (androidx.compose.runtime.Composer) r0
                    r11 = r0
                    r0 = r8
                    java.lang.Integer r0 = (java.lang.Integer) r0
                    int r0 = r0.intValue()
                    r9 = r0
                    r0 = r9
                    r1 = 3
                    r0 = r0 & r1
                    r1 = 2
                    if (r0 == r1) goto L1b
                    r0 = 1
                    r10 = r0
                    goto L1e
                L1b:
                    r0 = 0
                    r10 = r0
                L1e:
                    r0 = r11
                    r1 = r10
                    r2 = r9
                    r3 = 1
                    r2 = r2 & r3
                    boolean r0 = r0.shouldExecute(r1, r2)
                    if (r0 == 0) goto La0
                    boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                    if (r0 == 0) goto L3c
                    r0 = 1647815154(0x6237a9f2, float:8.47E20)
                    r1 = r9
                    r2 = -1
                    java.lang.String r3 = "com.bilibili.ship.theseus.cheese.biz.intro.pack.CheesePackageLayerComponent.bindToView.<anonymous> (CheesePackageLayerComponent.kt:62)"
                    androidx.compose.runtime.ComposerKt.traceEventStart(r0, r1, r2, r3)
                L3c:
                    r0 = r6
                    com.bilibili.ship.theseus.cheese.biz.intro.pack.CheesePackageLayerComponent r0 = r0.f89545a
                    r12 = r0
                    r0 = r12
                    com.bilibili.ship.theseus.cheese.biz.intro.pack.CheesePackageLayerComponent$o r0 = r0.f89480a
                    r13 = r0
                    r0 = r6
                    com.bilibili.app.gemini.ui.UIComponent$b r0 = r0.f89546b
                    r14 = r0
                    r0 = r11
                    r1 = r14
                    boolean r0 = r0.changedInstance(r1)
                    r10 = r0
                    r0 = r11
                    java.lang.Object r0 = r0.rememberedValue()
                    r8 = r0
                    r0 = r10
                    if (r0 != 0) goto L73
                    r0 = r8
                    r7 = r0
                    r0 = r8
                    androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
                    java.lang.Object r1 = r1.getEmpty()
                    if (r0 != r1) goto L86
                L73:
                    GS0.C r0 = new GS0.C
                    r1 = r0
                    r2 = r14
                    r3 = 1
                    r1.<init>(r2, r3)
                    r7 = r0
                    r0 = r11
                    r1 = r7
                    r0.updateRememberedValue(r1)
                L86:
                    r0 = r12
                    r1 = r13
                    r2 = r7
                    kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
                    r3 = r11
                    r4 = 0
                    r0.a(r1, r2, r3, r4)
                    boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                    if (r0 == 0) goto La7
                    androidx.compose.runtime.ComposerKt.traceEventEnd()
                    goto La7
                La0:
                    r0 = r11
                    r0.skipToGroupEnd()
                La7:
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.intro.pack.k.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }));
        return Unit.INSTANCE;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        return new UIComponent.b(composeView);
    }
}
