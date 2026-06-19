package com.bilibili.ogv.misc.timeline.ui;

import Di0.C1602f;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.material3.C4162p;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.compose.HorizontalAnchorable;
import androidx.constraintlayout.compose.VerticalAnchorable;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.lib.theme.R$color;
import com.bilibili.ogv.misc.timeline.ui.entity.BangumiTimeline;
import com.bilibili.ogv.misc.timeline.ui.entity.BangumiTimelineDay;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yk0.C9061a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/ui/TimelinePagerKt.class */
public final class TimelinePagerKt {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/ui/TimelinePagerKt$a.class */
    public static final class a implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C9061a f69495a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f69496b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CoroutineScope f69497c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final LazyListState f69498d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f69499e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final PagerState f69500f;

        public a(C9061a c9061a, int i7, CoroutineScope coroutineScope, LazyListState lazyListState, int i8, PagerState pagerState) {
            this.f69495a = c9061a;
            this.f69496b = i7;
            this.f69497c = coroutineScope;
            this.f69498d = lazyListState;
            this.f69499e = i8;
            this.f69500f = pagerState;
        }

        public final Object invoke() {
            this.f69495a.f129728p.setValue(Integer.valueOf(this.f69496b));
            BuildersKt.launch$default(this.f69497c, (CoroutineContext) null, (CoroutineStart) null, new TimelinePagerKt$NewTimelinePager$1$3$1$1$1$1$1(this.f69498d, this.f69496b, this.f69499e, this.f69500f, null), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/ui/TimelinePagerKt$b.class */
    public static final class b implements Function1<ConstrainScope, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConstrainedLayoutReference f69501a;

        public b(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f69501a = constrainedLayoutReference;
        }

        public final Object invoke(Object obj) {
            ConstrainScope constrainScope = (ConstrainScope) obj;
            HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(constrainScope.getTop(), constrainScope.getParent().getTop(), 0.0f, 0.0f, 6, null);
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getStart(), constrainScope.getParent().getStart(), 0.0f, 0.0f, 6, null);
            HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(constrainScope.getBottom(), this.f69501a.getBottom(), 0.0f, 0.0f, 6, null);
            constrainScope.setHeight(Dimension.Companion.getFillToConstraints());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/ui/TimelinePagerKt$c.class */
    public static final class c implements Function1<ConstrainScope, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f69502a = new Object();

        public final Object invoke(Object obj) {
            ConstrainScope constrainScope = (ConstrainScope) obj;
            HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(constrainScope.getTop(), constrainScope.getParent().getTop(), 0.0f, 0.0f, 6, null);
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getStart(), constrainScope.getParent().getStart(), 0.0f, 0.0f, 6, null);
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getEnd(), constrainScope.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            constrainScope.setHeight(Dimension.Companion.getWrapContent());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/ui/TimelinePagerKt$d.class */
    public static final class d implements Function1<LazyListScope, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<BangumiTimeline> f69503a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C9061a f69504b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final BangumiTimelineDay f69505c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f69506d;

        public d(List<BangumiTimeline> list, C9061a c9061a, BangumiTimelineDay bangumiTimelineDay, int i7) {
            this.f69503a = list;
            this.f69504b = c9061a;
            this.f69505c = bangumiTimelineDay;
            this.f69506d = i7;
        }

        public final Object invoke(Object obj) {
            List<BangumiTimeline> list = this.f69503a;
            ((LazyListScope) obj).items(list.size(), null, new v(list), ComposableLambdaKt.composableLambdaInstance(2039820996, true, new w(list, list, this.f69504b, this.f69505c, this.f69506d)));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/ui/TimelinePagerKt$e.class */
    public static final class e implements Function1<ConstrainScope, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f69507a = new Object();

        public final Object invoke(Object obj) {
            ConstrainScope constrainScope = (ConstrainScope) obj;
            HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(constrainScope.getTop(), constrainScope.getParent().getTop(), 0.0f, 0.0f, 6, null);
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getStart(), constrainScope.getParent().getStart(), 0.0f, 0.0f, 6, null);
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getEnd(), constrainScope.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/ui/TimelinePagerKt$f.class */
    public static final class f implements Function1<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f69508a;

        public f(List list) {
            this.f69508a = list;
        }

        public final Object invoke(Object obj) {
            this.f69508a.get(((Number) obj).intValue());
            return null;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/ui/TimelinePagerKt$g.class */
    public static final class g implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f69509a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PagerState f69510b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C9061a f69511c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final CoroutineScope f69512d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final LazyListState f69513e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f69514f;

        public g(List list, PagerState pagerState, C9061a c9061a, CoroutineScope coroutineScope, LazyListState lazyListState, int i7) {
            this.f69509a = list;
            this.f69510b = pagerState;
            this.f69511c = c9061a;
            this.f69512d = coroutineScope;
            this.f69513e = lazyListState;
            this.f69514f = i7;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x013d  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x01ab  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 518
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.misc.timeline.ui.TimelinePagerKt.g.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0240  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(@org.jetbrains.annotations.NotNull final yk0.C9061a r21, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function0<kotlin.Unit> r22, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function0<kotlin.Unit> r23, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r24, final int r25) {
        /*
            Method dump skipped, instruction units count: 1362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.misc.timeline.ui.TimelinePagerKt.a(yk0.a, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void b(@NotNull final String str, @NotNull final String str2, final boolean z6, @NotNull final Function0<Unit> function0, final boolean z7, @Nullable Composer composer, final int i7) {
        int i8;
        long jM2664getTransparent0d7_KjU;
        long jM2664getTransparent0d7_KjU2;
        long jColorResource;
        Composer composerStartRestartGroup = composer.startRestartGroup(1883249372);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(str2) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changed(z6) ? 256 : 128);
        }
        int i11 = i10;
        if ((i7 & 3072) == 0) {
            i11 = i10 | (composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024);
        }
        int i12 = i11;
        if ((i7 & 24576) == 0) {
            i12 = i11 | (composerStartRestartGroup.changed(z7) ? 16384 : 8192);
        }
        if (composerStartRestartGroup.shouldExecute((i12 & 9363) != 9362, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1883249372, i12, -1, "com.bilibili.ogv.misc.timeline.ui.TimelineDayFilterItem (TimelinePager.kt:161)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM1357defaultMinSizeVpY3zN4$default = SizeKt.m1357defaultMinSizeVpY3zN4$default(SizeKt.m1377width3ABfNKs(companion, Dp.m3880constructorimpl(48)), 0.0f, Dp.m3880constructorimpl(50), 1, null);
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), companion2.getCenterHorizontally(), composerStartRestartGroup, 54);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1357defaultMinSizeVpY3zN4$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2296constructorimpl = Updater.m2296constructorimpl(composerStartRestartGroup);
            O4.d.c(companion3, composerM2296constructorimpl, measurePolicyColumnMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierClip = ClipKt.clip(companion, RoundedCornerShapeKt.getCircleShape());
            float f7 = 4;
            Modifier modifierM1356defaultMinSizeVpY3zN4 = SizeKt.m1356defaultMinSizeVpY3zN4(modifierClip, Dp.m3880constructorimpl(f7), Dp.m3880constructorimpl(f7));
            if (z7) {
                composerStartRestartGroup.startReplaceGroup(1156863792);
                jM2664getTransparent0d7_KjU = com.bilibili.ad.composecomponent.button.livereverse.t.a(BiliTheme.INSTANCE, composerStartRestartGroup, BiliTheme.$stable);
            } else {
                composerStartRestartGroup.startReplaceGroup(1156864497);
                composerStartRestartGroup.endReplaceGroup();
                jM2664getTransparent0d7_KjU = Color.Companion.m2664getTransparent0d7_KjU();
            }
            BoxKt.Box(BackgroundKt.m1169backgroundbw27NRU$default(modifierM1356defaultMinSizeVpY3zN4, jM2664getTransparent0d7_KjU, null, 2, null), composerStartRestartGroup, 0);
            SpacerKt.Spacer(SizeKt.m1358height3ABfNKs(companion, Dp.m3880constructorimpl(f7)), composerStartRestartGroup, 6);
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i13 = BiliTheme.$stable;
            BasicTextKt.m1512BasicTextRWo7tUw(str, ClickableKt.m1186clickableoSLSa3U$default(companion, false, null, null, null, function0, 15, null), TextStyle.m3586copyp1EtxEg$default(biliTheme.getTextStyle(composerStartRestartGroup, i13).getT12(), biliTheme.getColors(composerStartRestartGroup, i13).getText1-0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), (Function1<? super TextLayoutResult, Unit>) null, 0, false, 0, 0, (ColorProducer) null, (TextAutoSize) null, composerStartRestartGroup, i12 & 14, 1016);
            Modifier modifierM1372size3ABfNKs = SizeKt.m1372size3ABfNKs(companion, Dp.m3880constructorimpl(28));
            if (z6) {
                composerStartRestartGroup.startReplaceGroup(1503474085);
                jM2664getTransparent0d7_KjU2 = ColorResources_androidKt.colorResource(R$color.Brand_pink, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1503564977);
                composerStartRestartGroup.endReplaceGroup();
                jM2664getTransparent0d7_KjU2 = Color.Companion.m2664getTransparent0d7_KjU();
            }
            Modifier modifierM1168backgroundbw27NRU = BackgroundKt.m1168backgroundbw27NRU(modifierM1372size3ABfNKs, jM2664getTransparent0d7_KjU2, RoundedCornerShapeKt.getCircleShape());
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1168backgroundbw27NRU);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2296constructorimpl2 = Updater.m2296constructorimpl(composerStartRestartGroup);
            O4.d.c(companion3, composerM2296constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM2296constructorimpl2, currentCompositionLocalMap2);
            Updater.m2304setimpl(composerM2296constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl2, Integer.valueOf(iHashCode2), composerM2296constructorimpl2));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierM1186clickableoSLSa3U$default = ClickableKt.m1186clickableoSLSa3U$default(companion, false, null, null, null, function0, 15, null);
            if (z6) {
                composerStartRestartGroup.startReplaceGroup(-1672704474);
                jColorResource = ColorResources_androidKt.colorResource(R$color.Text_white, composerStartRestartGroup, 0);
            } else {
                composerStartRestartGroup.startReplaceGroup(-314164149);
                jColorResource = ColorResources_androidKt.colorResource(R$color.Text1, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            TextKt.m2186TextNvy7gAk(str2, modifierM1186clickableoSLSa3U$default, jColorResource, null, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composerStartRestartGroup, (14 & (i12 >> 3)) | 24576, 0, 262120);
            if (C4162p.a(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(str, str2, z6, function0, z7, i7) { // from class: com.bilibili.ogv.misc.timeline.ui.t

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f69598a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f69599b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final boolean f69600c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Function0 f69601d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final boolean f69602e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final int f69603f;

                {
                    this.f69598a = str;
                    this.f69599b = str2;
                    this.f69600c = z6;
                    this.f69601d = function0;
                    this.f69602e = z7;
                    this.f69603f = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f69603f | 1);
                    TimelinePagerKt.b(this.f69598a, this.f69599b, this.f69600c, this.f69601d, this.f69602e, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
