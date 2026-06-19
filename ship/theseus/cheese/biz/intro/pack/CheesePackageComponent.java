package com.bilibili.ship.theseus.cheese.biz.intro.pack;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.animation.z;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
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
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextMeasurer;
import androidx.compose.ui.text.TextMeasurerHelperKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
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
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.G;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.H;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import com.bilibili.ship.theseus.cheese.biz.intro.pack.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/pack/CheesePackageComponent.class */
@StabilityInferred(parameters = 0)
public final class CheesePackageComponent implements UIComponent<UIComponent.b<ComposeView>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final w f89440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<com.bilibili.ship.theseus.cheese.biz.intro.pack.v> f89441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final SharedFlow<com.bilibili.ship.theseus.cheese.biz.intro.pack.v> f89442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f89443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.cheese.biz.intro.pack.s f89444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f89445f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/pack/CheesePackageComponent$a.class */
    public static final class a implements Function1<ConstrainScope, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f89446a = new Object();

        public final Object invoke(Object obj) {
            ConstrainScope constrainScope = (ConstrainScope) obj;
            HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(constrainScope.getTop(), constrainScope.getParent().getTop(), Dp.m3880constructorimpl(10), 0.0f, 4, null);
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getStart(), constrainScope.getParent().getStart(), 0.0f, 0.0f, 6, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/pack/CheesePackageComponent$b.class */
    public static final class b implements Function1<ConstrainScope, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConstrainedLayoutReference f89447a;

        public b(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f89447a = constrainedLayoutReference;
        }

        public final Object invoke(Object obj) {
            ConstrainScope constrainScope = (ConstrainScope) obj;
            HorizontalAnchorable top = constrainScope.getTop();
            ConstrainedLayoutReference constrainedLayoutReference = this.f89447a;
            HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(top, constrainedLayoutReference.getTop(), 0.0f, 0.0f, 6, null);
            HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(constrainScope.getBottom(), constrainedLayoutReference.getBottom(), 0.0f, 0.0f, 6, null);
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getStart(), constrainedLayoutReference.getEnd(), Dp.m3880constructorimpl(8), 0.0f, 4, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/pack/CheesePackageComponent$c.class */
    public static final class c implements Function1<ConstrainScope, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConstrainedLayoutReference f89448a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ConstrainedLayoutReference f89449b;

        public c(ConstrainedLayoutReference constrainedLayoutReference, ConstrainedLayoutReference constrainedLayoutReference2) {
            this.f89448a = constrainedLayoutReference;
            this.f89449b = constrainedLayoutReference2;
        }

        public final Object invoke(Object obj) {
            ConstrainScope constrainScope = (ConstrainScope) obj;
            HorizontalAnchorable top = constrainScope.getTop();
            ConstrainedLayoutReference constrainedLayoutReference = this.f89448a;
            HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(top, constrainedLayoutReference.getTop(), 0.0f, 0.0f, 6, null);
            HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(constrainScope.getBottom(), constrainedLayoutReference.getBottom(), 0.0f, 0.0f, 6, null);
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getEnd(), this.f89449b.getStart(), Dp.m3880constructorimpl(2), 0.0f, 4, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/pack/CheesePackageComponent$d.class */
    public static final class d implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CheesePackageComponent f89450a;

        public d(CheesePackageComponent cheesePackageComponent) {
            this.f89450a = cheesePackageComponent;
        }

        public final Object invoke() {
            this.f89450a.f89441b.tryEmit(v.b.f89579a);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/pack/CheesePackageComponent$e.class */
    public static final class e implements Function1<ConstrainScope, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConstrainedLayoutReference f89451a;

        public e(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f89451a = constrainedLayoutReference;
        }

        public final Object invoke(Object obj) {
            ConstrainScope constrainScope = (ConstrainScope) obj;
            HorizontalAnchorable top = constrainScope.getTop();
            ConstrainedLayoutReference constrainedLayoutReference = this.f89451a;
            HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(top, constrainedLayoutReference.getTop(), 0.0f, 0.0f, 6, null);
            HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(constrainScope.getBottom(), constrainedLayoutReference.getBottom(), 0.0f, 0.0f, 6, null);
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getEnd(), constrainScope.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/pack/CheesePackageComponent$f.class */
    public static final class f implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CheesePackageComponent f89452a;

        public f(CheesePackageComponent cheesePackageComponent) {
            this.f89452a = cheesePackageComponent;
        }

        public final Object invoke() {
            this.f89452a.f89441b.tryEmit(v.b.f89579a);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/pack/CheesePackageComponent$g.class */
    public static final class g implements Function1<ConstrainScope, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConstrainedLayoutReference f89453a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CheesePackageComponent f89454b;

        public g(ConstrainedLayoutReference constrainedLayoutReference, CheesePackageComponent cheesePackageComponent) {
            this.f89453a = constrainedLayoutReference;
            this.f89454b = cheesePackageComponent;
        }

        public final Object invoke(Object obj) {
            ConstrainScope constrainScope = (ConstrainScope) obj;
            ConstrainScope.m4145linkToR7zmacU$default(constrainScope, constrainScope.getParent().getStart(), this.f89453a.getBottom(), constrainScope.getParent().getEnd(), constrainScope.getParent().getBottom(), 0.0f, Dp.m3880constructorimpl(this.f89454b.f89443d ? 4 : 10), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 4048, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/pack/CheesePackageComponent$h.class */
    public static final class h implements Function1<LazyListScope, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CheesePackageComponent f89455a;

        public h(CheesePackageComponent cheesePackageComponent) {
            this.f89455a = cheesePackageComponent;
        }

        public final Object invoke(Object obj) {
            CheesePackageComponent cheesePackageComponent = this.f89455a;
            List<com.bilibili.ship.theseus.cheese.biz.intro.pack.t> list = cheesePackageComponent.f89444e.f89568b;
            ((LazyListScope) obj).items(((ArrayList) list).size(), null, new com.bilibili.ship.theseus.cheese.biz.intro.pack.i(list), ComposableLambdaKt.composableLambdaInstance(2039820996, true, new com.bilibili.ship.theseus.cheese.biz.intro.pack.j(list, cheesePackageComponent)));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/pack/CheesePackageComponent$i.class */
    public static final class i implements Function1<ConstrainScope, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f89456a = new Object();

        public final Object invoke(Object obj) {
            ConstrainScope constrainScope = (ConstrainScope) obj;
            HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(constrainScope.getTop(), constrainScope.getParent().getTop(), Dp.m3880constructorimpl(2), 0.0f, 4, null);
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getStart(), constrainScope.getParent().getStart(), 0.0f, 0.0f, 6, null);
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getEnd(), constrainScope.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/pack/CheesePackageComponent$j.class */
    public static final class j implements Function1<ConstrainScope, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConstrainedLayoutReference f89457a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CheesePackageComponent f89458b;

        public j(ConstrainedLayoutReference constrainedLayoutReference, CheesePackageComponent cheesePackageComponent) {
            this.f89457a = constrainedLayoutReference;
            this.f89458b = cheesePackageComponent;
        }

        public final Object invoke(Object obj) {
            ConstrainScope constrainScope = (ConstrainScope) obj;
            HorizontalAnchorable top = constrainScope.getTop();
            ConstrainedLayoutReference constrainedLayoutReference = this.f89457a;
            HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(top, constrainedLayoutReference.getBottom(), Dp.m3880constructorimpl(6), 0.0f, 4, null);
            if (!this.f89458b.f89443d) {
                HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(constrainScope.getBottom(), constrainScope.getParent().getBottom(), 0.0f, 0.0f, 6, null);
            }
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getStart(), constrainedLayoutReference.getStart(), 0.0f, 0.0f, 6, null);
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getEnd(), constrainedLayoutReference.getEnd(), 0.0f, 0.0f, 6, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/pack/CheesePackageComponent$k.class */
    public static final class k implements Function1<DrawScope, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f89459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Pair<Color, Color> f89460b;

        public k(Pair pair, boolean z6) {
            this.f89459a = z6;
            this.f89460b = pair;
        }

        public final Object invoke(Object obj) {
            DrawScope drawScope = (DrawScope) obj;
            Pair<Color, Color> pair = this.f89460b;
            boolean z6 = this.f89459a;
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/pack/CheesePackageComponent$l.class */
    public static final class l implements Function1<ConstrainScope, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConstrainedLayoutReference f89461a;

        public l(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f89461a = constrainedLayoutReference;
        }

        public final Object invoke(Object obj) {
            ConstrainScope constrainScope = (ConstrainScope) obj;
            HorizontalAnchorable bottom = constrainScope.getBottom();
            ConstrainedLayoutReference constrainedLayoutReference = this.f89461a;
            HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(bottom, constrainedLayoutReference.getBottom(), 0.0f, 0.0f, 6, null);
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getStart(), constrainedLayoutReference.getStart(), 0.0f, 0.0f, 6, null);
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getEnd(), constrainedLayoutReference.getEnd(), 0.0f, 0.0f, 6, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/pack/CheesePackageComponent$m.class */
    public static final class m implements Function1<ConstrainScope, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConstrainedLayoutReference f89462a;

        public m(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f89462a = constrainedLayoutReference;
        }

        public final Object invoke(Object obj) {
            ConstrainScope constrainScope = (ConstrainScope) obj;
            HorizontalAnchorable top = constrainScope.getTop();
            ConstrainedLayoutReference constrainedLayoutReference = this.f89462a;
            ConstraintLayoutBaseScope.HorizontalAnchor top2 = constrainedLayoutReference.getTop();
            float f7 = 4;
            HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(top, top2, Dp.m3880constructorimpl(f7), 0.0f, 4, null);
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getEnd(), constrainedLayoutReference.getEnd(), Dp.m3880constructorimpl(f7), 0.0f, 4, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/pack/CheesePackageComponent$n.class */
    public static final class n implements Function1<ConstrainScope, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConstrainedLayoutReference f89463a;

        public n(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f89463a = constrainedLayoutReference;
        }

        public final Object invoke(Object obj) {
            ConstrainedLayoutReference constrainedLayoutReference = this.f89463a;
            ConstraintLayoutBaseScope.HorizontalAnchor top = constrainedLayoutReference.getTop();
            ConstraintLayoutBaseScope.HorizontalAnchor bottom = constrainedLayoutReference.getBottom();
            ConstraintLayoutBaseScope.VerticalAnchor start = constrainedLayoutReference.getStart();
            ConstraintLayoutBaseScope.VerticalAnchor end = constrainedLayoutReference.getEnd();
            float f7 = 4;
            ConstrainScope.m4145linkToR7zmacU$default((ConstrainScope) obj, start, top, end, bottom, 0.0f, 0.0f, Dp.m3880constructorimpl(f7), Dp.m3880constructorimpl(f7), 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 3888, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/pack/CheesePackageComponent$o.class */
    public static final class o implements Function1<ConstrainScope, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConstrainedLayoutReference f89464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ConstrainedLayoutReference f89465b;

        public o(ConstrainedLayoutReference constrainedLayoutReference, ConstrainedLayoutReference constrainedLayoutReference2) {
            this.f89464a = constrainedLayoutReference;
            this.f89465b = constrainedLayoutReference2;
        }

        public final Object invoke(Object obj) {
            ConstrainScope constrainScope = (ConstrainScope) obj;
            HorizontalAnchorable top = constrainScope.getTop();
            ConstrainedLayoutReference constrainedLayoutReference = this.f89464a;
            ConstraintLayoutBaseScope.HorizontalAnchor bottom = constrainedLayoutReference.getBottom();
            float f7 = 5;
            HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(top, bottom, Dp.m3880constructorimpl(f7), 0.0f, 4, null);
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getStart(), constrainedLayoutReference.getStart(), 0.0f, 0.0f, 6, null);
            HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(constrainScope.getBottom(), this.f89465b.getTop(), Dp.m3880constructorimpl(f7), 0.0f, 4, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/pack/CheesePackageComponent$p.class */
    public static final class p implements Function1<ConstrainScope, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConstrainedLayoutReference f89466a;

        public p(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f89466a = constrainedLayoutReference;
        }

        public final Object invoke(Object obj) {
            ConstrainScope constrainScope = (ConstrainScope) obj;
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getStart(), this.f89466a.getStart(), 0.0f, 0.0f, 6, null);
            HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(constrainScope.getBottom(), constrainScope.getParent().getBottom(), Dp.m3880constructorimpl(7), 0.0f, 4, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/pack/CheesePackageComponent$q.class */
    public static final class q implements Function1<ConstrainScope, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final q f89467a = new Object();

        public final Object invoke(Object obj) {
            ConstrainScope constrainScope = (ConstrainScope) obj;
            HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(constrainScope.getTop(), constrainScope.getParent().getTop(), Dp.m3880constructorimpl(2), 0.0f, 4, null);
            HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(constrainScope.getBottom(), constrainScope.getParent().getBottom(), Dp.m3880constructorimpl(10), 0.0f, 4, null);
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getStart(), constrainScope.getParent().getStart(), 0.0f, 0.0f, 6, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/pack/CheesePackageComponent$r.class */
    public static final class r implements Function1<DrawScope, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f89468a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Pair<Color, Color> f89469b;

        public r(Pair pair, boolean z6) {
            this.f89468a = z6;
            this.f89469b = pair;
        }

        public final Object invoke(Object obj) {
            DrawScope drawScope = (DrawScope) obj;
            Pair<Color, Color> pair = this.f89469b;
            boolean z6 = this.f89468a;
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/pack/CheesePackageComponent$s.class */
    public static final class s implements Function1<ConstrainScope, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConstrainedLayoutReference f89470a;

        public s(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f89470a = constrainedLayoutReference;
        }

        public final Object invoke(Object obj) {
            ConstrainScope constrainScope = (ConstrainScope) obj;
            HorizontalAnchorable bottom = constrainScope.getBottom();
            ConstrainedLayoutReference constrainedLayoutReference = this.f89470a;
            HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(bottom, constrainedLayoutReference.getBottom(), 0.0f, 0.0f, 6, null);
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getStart(), constrainedLayoutReference.getStart(), 0.0f, 0.0f, 6, null);
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getEnd(), constrainedLayoutReference.getEnd(), 0.0f, 0.0f, 6, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/pack/CheesePackageComponent$t.class */
    public static final class t implements Function1<ConstrainScope, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConstrainedLayoutReference f89471a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ConstrainedLayoutReference f89472b;

        public t(ConstrainedLayoutReference constrainedLayoutReference, ConstrainedLayoutReference constrainedLayoutReference2) {
            this.f89471a = constrainedLayoutReference;
            this.f89472b = constrainedLayoutReference2;
        }

        public final Object invoke(Object obj) {
            ConstrainScope constrainScope = (ConstrainScope) obj;
            ConstrainScope.m4145linkToR7zmacU$default(constrainScope, constrainScope.getParent().getStart(), this.f89471a.getTop(), constrainScope.getParent().getEnd(), this.f89472b.getTop(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 4080, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/pack/CheesePackageComponent$u.class */
    public static final class u implements Function1<ConstrainScope, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConstrainedLayoutReference f89473a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ConstrainedLayoutReference f89474b;

        public u(ConstrainedLayoutReference constrainedLayoutReference, ConstrainedLayoutReference constrainedLayoutReference2) {
            this.f89473a = constrainedLayoutReference;
            this.f89474b = constrainedLayoutReference2;
        }

        public final Object invoke(Object obj) {
            ConstrainScope constrainScope = (ConstrainScope) obj;
            HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(constrainScope.getTop(), this.f89473a.getBottom(), Dp.m3880constructorimpl(7), 0.0f, 4, null);
            HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(constrainScope.getBottom(), this.f89474b.getTop(), Dp.m3880constructorimpl(3), 0.0f, 4, null);
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getStart(), constrainScope.getParent().getStart(), 0.0f, 0.0f, 6, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/pack/CheesePackageComponent$v.class */
    public static final class v implements Function1<ConstrainScope, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final v f89475a = new Object();

        public final Object invoke(Object obj) {
            ConstrainScope constrainScope = (ConstrainScope) obj;
            HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(constrainScope.getBottom(), constrainScope.getParent().getBottom(), Dp.m3880constructorimpl(7), 0.0f, 4, null);
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getStart(), constrainScope.getParent().getStart(), 0.0f, 0.0f, 6, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/pack/CheesePackageComponent$w.class */
    @StabilityInferred(parameters = 0)
    public static final class w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final com.bilibili.ship.theseus.cheese.biz.intro.pack.s f89476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f89477b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final StateFlow<Integer> f89478c;

        public w(@NotNull com.bilibili.ship.theseus.cheese.biz.intro.pack.s sVar, boolean z6, @NotNull StateFlow<Integer> stateFlow) {
            this.f89476a = sVar;
            this.f89477b = z6;
            this.f89478c = stateFlow;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof w)) {
                return false;
            }
            w wVar = (w) obj;
            return Intrinsics.areEqual(this.f89476a, wVar.f89476a) && this.f89477b == wVar.f89477b && Intrinsics.areEqual(this.f89478c, wVar.f89478c);
        }

        public final int hashCode() {
            return this.f89478c.hashCode() + z.a(this.f89476a.hashCode() * 31, 31, this.f89477b);
        }

        @NotNull
        public final String toString() {
            return "State(uiState=" + this.f89476a + ", hitPackageNewUIExp=" + this.f89477b + ", horizontalPaddingFlow=" + this.f89478c + ")";
        }
    }

    public CheesePackageComponent(@NotNull w wVar) {
        this.f89440a = wVar;
        MutableSharedFlow<com.bilibili.ship.theseus.cheese.biz.intro.pack.v> MutableSharedFlow = SharedFlowKt.MutableSharedFlow(0, 3, BufferOverflow.DROP_OLDEST);
        this.f89441b = MutableSharedFlow;
        this.f89442c = FlowKt.asSharedFlow(MutableSharedFlow);
        this.f89443d = wVar.f89477b;
        this.f89444e = wVar.f89476a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void a(Composer composer, int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-691617202);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-691617202, i8, -1, "com.bilibili.ship.theseus.cheese.biz.intro.pack.CheesePackageComponent.CheesePackageFloor (CheesePackageComponent.kt:76)");
            }
            BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(-1611081322, true, new Function2(this) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.pack.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final CheesePackageComponent f89520a;

                {
                    this.f89520a = this;
                }

                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1611081322, iIntValue, -1, "com.bilibili.ship.theseus.cheese.biz.intro.pack.CheesePackageComponent.CheesePackageFloor.<anonymous> (CheesePackageComponent.kt:78)");
                        }
                        CheesePackageComponent cheesePackageComponent = this.f89520a;
                        State stateCollectAsState = SnapshotStateKt.collectAsState(cheesePackageComponent.f89440a.f89478c, null, composer2, 0, 1);
                        Modifier.Companion companion = Modifier.Companion;
                        BiliTheme biliTheme = BiliTheme.INSTANCE;
                        int i9 = BiliTheme.$stable;
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m1344paddingVpY3zN4$default(BackgroundKt.m1169backgroundbw27NRU$default(companion, biliTheme.getColors(composer2, i9).getBg2-0d7_KjU(), null, 2, null), 0.0f, Dp.m3880constructorimpl(3), 1, null), 0.0f, 1, null);
                        Modifier modifierM1358height3ABfNKs = modifierFillMaxWidth$default;
                        if (!cheesePackageComponent.f89443d) {
                            modifierM1358height3ABfNKs = SizeKt.m1358height3ABfNKs(modifierFillMaxWidth$default, Dp.m3880constructorimpl(162));
                        }
                        Modifier modifierM1344paddingVpY3zN4$default = PaddingKt.m1344paddingVpY3zN4$default(H.a(8, modifierM1358height3ABfNKs, biliTheme.getColors(composer2, i9).getBg1-0d7_KjU()), Dp.m3880constructorimpl(((Number) stateCollectAsState.getValue()).intValue()), 0.0f, 2, null);
                        Object objA = C4550g.a(-270267587, composer2, -3687241);
                        Composer.Companion companion2 = Composer.Companion;
                        Object objA2 = objA;
                        if (objA == companion2.getEmpty()) {
                            objA2 = Yb.a.a(composer2);
                        }
                        composer2.endReplaceableGroup();
                        Measurer measurer = (Measurer) objA2;
                        composer2.startReplaceableGroup(-3687241);
                        Object objRememberedValue = composer2.rememberedValue();
                        Object objA3 = objRememberedValue;
                        if (objRememberedValue == companion2.getEmpty()) {
                            objA3 = C4551h.a(composer2);
                        }
                        composer2.endReplaceableGroup();
                        ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objA3;
                        composer2.startReplaceableGroup(-3687241);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        Object objMutableStateOf$default = objRememberedValue2;
                        if (objRememberedValue2 == companion2.getEmpty()) {
                            objMutableStateOf$default = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composer2.updateRememberedValue(objMutableStateOf$default);
                        }
                        composer2.endReplaceableGroup();
                        Pair<MeasurePolicy, Function0<Unit>> pairRememberConstraintLayoutMeasurePolicy = ConstraintLayoutKt.rememberConstraintLayoutMeasurePolicy(257, constraintLayoutScope, (MutableState<Boolean>) objMutableStateOf$default, measurer, composer2, 4544);
                        LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierM1344paddingVpY3zN4$default, false, new Function1<SemanticsPropertyReceiver, Unit>(measurer) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.pack.CheesePackageComponent$CheesePackageFloor$lambda$0$$inlined$ConstraintLayout$1
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
                        }, 1, null), ComposableLambdaKt.composableLambda(composer2, -819894182, true, new Function2<Composer, Integer, Unit>(constraintLayoutScope, 0, (Function0) pairRememberConstraintLayoutMeasurePolicy.component2(), cheesePackageComponent) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.pack.CheesePackageComponent$CheesePackageFloor$lambda$0$$inlined$ConstraintLayout$2
                            final int $$changed;
                            final Function0 $onHelpersChanged;
                            final ConstraintLayoutScope $scope;
                            final CheesePackageComponent this$0;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                                this.$scope = constraintLayoutScope;
                                this.$onHelpersChanged = function0;
                                this.this$0 = cheesePackageComponent;
                                this.$$changed = i;
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4) {
                                invoke((Composer) obj3, ((Number) obj4).intValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:27:0x01de  */
                            /* JADX WARN: Removed duplicated region for block: B:35:0x02ba  */
                            /* JADX WARN: Removed duplicated region for block: B:40:0x030d  */
                            /* JADX WARN: Removed duplicated region for block: B:45:0x03a1  */
                            /* JADX WARN: Removed duplicated region for block: B:50:0x03f8  */
                            /* JADX WARN: Removed duplicated region for block: B:56:0x049d  */
                            /* JADX WARN: Removed duplicated region for block: B:61:0x04eb  */
                            @androidx.compose.runtime.Composable
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            public final void invoke(@org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r27, int r28) {
                                /*
                                    Method dump skipped, instruction units count: 1331
                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.intro.pack.CheesePackageComponent$CheesePackageFloor$lambda$0$$inlined$ConstraintLayout$2.invoke(androidx.compose.runtime.Composer, int):void");
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
            scopeUpdateScopeEndRestartGroup.updateScope(new G(this, i7, 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d3  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(final int r15, final com.bilibili.ship.theseus.cheese.biz.intro.pack.t r16, final kotlin.Pair<androidx.compose.ui.graphics.Color, androidx.compose.ui.graphics.Color> r17, final boolean r18, androidx.compose.runtime.Composer r19, final int r20) {
        /*
            Method dump skipped, instruction units count: 849
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.intro.pack.CheesePackageComponent.b(int, com.bilibili.ship.theseus.cheese.biz.intro.pack.t, kotlin.Pair, boolean, androidx.compose.runtime.Composer, int):void");
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        ((ComposeView) ((UIComponent.b) viewEntry).a).setContent(ComposableLambdaKt.composableLambdaInstance(800071716, true, new Function2(this) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.pack.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CheesePackageComponent f89519a;

            {
                this.f89519a = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(800071716, iIntValue, -1, "com.bilibili.ship.theseus.cheese.biz.intro.pack.CheesePackageComponent.bindToView.<anonymous> (CheesePackageComponent.kt:71)");
                    }
                    this.f89519a.a(composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d2  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(final int r15, final com.bilibili.ship.theseus.cheese.biz.intro.pack.t r16, final kotlin.Pair<androidx.compose.ui.graphics.Color, androidx.compose.ui.graphics.Color> r17, final boolean r18, androidx.compose.runtime.Composer r19, final int r20) {
        /*
            Method dump skipped, instruction units count: 849
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.intro.pack.CheesePackageComponent.c(int, com.bilibili.ship.theseus.cheese.biz.intro.pack.t, kotlin.Pair, boolean, androidx.compose.runtime.Composer, int):void");
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        return new UIComponent.b(composeView);
    }

    @Composable
    public final void d(List<com.bilibili.ship.theseus.cheese.biz.intro.pack.t> list, Composer composer, int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(1478455423);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(this) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1478455423, i9, -1, "com.bilibili.ship.theseus.cheese.biz.intro.pack.CheesePackageComponent.calculateMaxWidth (CheesePackageComponent.kt:203)");
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                this.f89445f = Math.max(this.f89445f, (int) (TextMeasurer.m3576measurewNUYSr0$default(TextMeasurerHelperKt.rememberTextMeasurer(0, composerStartRestartGroup, 0, 1), ((com.bilibili.ship.theseus.cheese.biz.intro.pack.t) it.next()).f89571c, new TextStyle(0L, TextUnitKt.getSp(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(16), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646141, (DefaultConstructorMarker) null), 0, false, 0, 0L, null, null, null, false, 1020, null).m3573getSizeYbymL2g() >> 32));
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.bilibili.digital.card.action.using.p(i7, 1, this, list));
        }
    }
}
