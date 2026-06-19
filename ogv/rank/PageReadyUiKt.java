package com.bilibili.ogv.rank;

import Di0.C1602f;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TabRowDefaults;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.bilibili.app.comm.aphro.mediaselect.compose.X;
import com.bilibili.compose.iconfont.BiliIconfont;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.search2.api.SearchBangumiItem;
import java.util.List;
import kntr.common.trio.navigationevent.BackHandlerKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/PageReadyUiKt.class */
public final class PageReadyUiKt {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/PageReadyUiKt$a.class */
    public static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MutableFloatState f71871a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TopAppBarScrollBehavior f71872b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CoroutineScope f71873c;

        public a(TopAppBarScrollBehavior topAppBarScrollBehavior, MutableFloatState mutableFloatState, CoroutineScope coroutineScope) {
            this.f71871a = mutableFloatState;
            this.f71872b = topAppBarScrollBehavior;
            this.f71873c = coroutineScope;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
            final CoroutineScope coroutineScope = this.f71873c;
            final MutableFloatState mutableFloatState = this.f71871a;
            final TopAppBarScrollBehavior topAppBarScrollBehavior = this.f71872b;
            final int i7 = 0;
            Object objDetectDragGestures$default = DragGestureDetectorKt.detectDragGestures$default(pointerInputScope, null, new Function0(topAppBarScrollBehavior, mutableFloatState, coroutineScope) { // from class: com.bilibili.ogv.rank.s

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final CoroutineScope f72144a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final MutableFloatState f72145b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final TopAppBarScrollBehavior f72146c;

                {
                    this.f72144a = coroutineScope;
                    this.f72145b = mutableFloatState;
                    this.f72146c = topAppBarScrollBehavior;
                }

                public final Object invoke() {
                    BuildersKt.launch$default(this.f72144a, (CoroutineContext) null, (CoroutineStart) null, new PageReadyUiKt$createDragGestureHandler$2$1(this.f72145b, this.f72146c, null), 3, (Object) null);
                    return Unit.INSTANCE;
                }
            }, null, new Function2(i7, mutableFloatState, topAppBarScrollBehavior) { // from class: com.bilibili.ogv.rank.t

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f72147a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f72148b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Object f72149c;

                {
                    this.f72147a = i7;
                    this.f72148b = mutableFloatState;
                    this.f72149c = topAppBarScrollBehavior;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:19:0x00b8  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invoke(java.lang.Object r8, java.lang.Object r9) {
                    /*
                        Method dump skipped, instruction units count: 423
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.rank.C5516t.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, continuation, 5, null);
            if (objDetectDragGestures$default != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objDetectDragGestures$default = Unit.INSTANCE;
            }
            return objDetectDragGestures$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectDragGestures$default : Unit.INSTANCE;
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void a(final float f7, final U u7, final ComposableLambda composableLambda, final ComposableLambda composableLambda2, final Modifier modifier, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(169560202);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(f7) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(u7) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changedInstance(composableLambda) ? 256 : 128);
        }
        int i11 = i10;
        if ((i7 & 3072) == 0) {
            i11 = i10 | (composerStartRestartGroup.changedInstance(composableLambda2) ? 2048 : 1024);
        }
        int i12 = i11;
        if ((i7 & 24576) == 0) {
            i12 = i11 | (composerStartRestartGroup.changed(modifier) ? 16384 : 8192);
        }
        if (composerStartRestartGroup.shouldExecute((i12 & 9363) != 9362, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(169560202, i12, -1, "com.bilibili.ogv.rank.AppBarContent (PageReadyUi.kt:500)");
            }
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            O4.d.c(companion2, composerM2296constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.Companion;
            Modifier modifierAlpha = AlphaKt.alpha(SizeKt.m1361requiredHeight3ABfNKs(companion3, u7.f71897a), 1.0f - f7);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAlpha);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
            O4.d.c(companion2, composerM2296constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM2296constructorimpl2, currentCompositionLocalMap2);
            Updater.m2304setimpl(composerM2296constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl2, Integer.valueOf(iHashCode2), composerM2296constructorimpl2));
            composableLambda.invoke(boxScopeInstance, composerStartRestartGroup, Integer.valueOf(((((i12 << 3) & 7168) >> 6) & 112) | 6));
            composerStartRestartGroup.endNode();
            Modifier modifierAlpha2 = AlphaKt.alpha(SizeKt.m1361requiredHeight3ABfNKs(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), u7.f71898b), f7);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenterStart(), false);
            int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAlpha2);
            Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2296constructorimpl3 = Updater.m2296constructorimpl(composerStartRestartGroup);
            O4.d.c(companion2, composerM2296constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM2296constructorimpl3, currentCompositionLocalMap3);
            Updater.m2304setimpl(composerM2296constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl3, Integer.valueOf(iHashCode3), composerM2296constructorimpl3));
            composableLambda2.invoke(boxScopeInstance, composerStartRestartGroup, Integer.valueOf(((((i12 & 7168) | 48) >> 6) & 112) | 6));
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(f7, u7, composableLambda, composableLambda2, modifier, i7) { // from class: com.bilibili.ogv.rank.u

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final float f72150a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final U f72151b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final ComposableLambda f72152c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final ComposableLambda f72153d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final Modifier f72154e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final int f72155f;

                {
                    this.f72150a = f7;
                    this.f72151b = u7;
                    this.f72152c = composableLambda;
                    this.f72153d = composableLambda2;
                    this.f72154e = modifier;
                    this.f72155f = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f72155f | 1);
                    U u8 = this.f72151b;
                    ComposableLambda composableLambda3 = this.f72153d;
                    Modifier modifier2 = this.f72154e;
                    PageReadyUiKt.a(this.f72150a, u8, this.f72152c, composableLambda3, modifier2, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void b(final long j7, final U u7, final Modifier modifier, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(1966477446);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(j7) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(u7) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changed(modifier) ? 256 : 128);
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 147) != 146, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1966477446, i10, -1, "com.bilibili.ogv.rank.BackIcon (PageReadyUi.kt:221)");
            }
            IconKt.m2023Iconww6aTOc(BiliIconfont.INSTANCE.getArrow_back_left_line_500(composerStartRestartGroup, 6), "back", BackHandlerKt.goBackOnClick-cJG_KMw(SizeKt.m1372size3ABfNKs(modifier, u7.f71902f), false, (String) null, (Role) null, (MutableInteractionSource) null, composerStartRestartGroup, 0, 15), j7, composerStartRestartGroup, Painter.$stable | 48 | ((i10 << 9) & 7168), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(j7, u7, modifier, i7) { // from class: com.bilibili.ogv.rank.o

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final long f72007a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final U f72008b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Modifier f72009c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final int f72010d;

                {
                    this.f72007a = j7;
                    this.f72008b = u7;
                    this.f72009c = modifier;
                    this.f72010d = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f72010d | 1);
                    U u8 = this.f72008b;
                    Modifier modifier2 = this.f72009c;
                    PageReadyUiKt.b(this.f72007a, u8, modifier2, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void c(final String str, final U u7, final Modifier modifier, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1092622812);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(u7) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changed(modifier) ? 256 : 128);
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 147) != 146, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1092622812, i10, -1, "com.bilibili.ogv.rank.CollapsedTopBarContent (PageReadyUi.kt:195)");
            }
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenterStart(), false);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            O4.d.c(companion, composerM2296constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i11 = BiliTheme.$stable;
            long j7 = biliTheme.getColors(composerStartRestartGroup, i11).getText1-0d7_KjU();
            Modifier.Companion companion2 = Modifier.Companion;
            float f7 = 10;
            b(j7, u7, PaddingKt.m1346paddingqDBjuR0$default(companion2, Dp.m3880constructorimpl(12), Dp.m3880constructorimpl(f7), 0.0f, Dp.m3880constructorimpl(f7), 4, null), composerStartRestartGroup, (i10 & 112) | 384);
            TextKt.m2186TextNvy7gAk(str, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), biliTheme.getColors(composerStartRestartGroup, i11).getText1-0d7_KjU(), null, 0L, null, null, null, 0L, null, TextAlign.m3787boximpl(TextAlign.Companion.m3794getCentere0LSkKk()), 0L, 0, false, 0, 0, null, biliTheme.getTextStyle(composerStartRestartGroup, i11).getT15(), composerStartRestartGroup, (i10 & 14) | 48, 0, 130040);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(str, u7, modifier, i7) { // from class: com.bilibili.ogv.rank.D

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f71819a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final U f71820b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Modifier f71821c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final int f71822d;

                {
                    this.f71819a = str;
                    this.f71820b = u7;
                    this.f71821c = modifier;
                    this.f71822d = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f71822d | 1);
                    PageReadyUiKt.c(this.f71819a, this.f71820b, this.f71821c, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01af  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(final androidx.compose.foundation.pager.PagerState r18, final java.util.List<com.bilibili.ogv.rank.C5505j> r19, final androidx.compose.material3.TopAppBarScrollBehavior r20, final com.bilibili.ogv.rank.U r21, final kotlinx.coroutines.CoroutineScope r22, androidx.compose.runtime.Composer r23, final int r24) {
        /*
            Method dump skipped, instruction units count: 587
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.rank.PageReadyUiKt.d(androidx.compose.foundation.pager.PagerState, java.util.List, androidx.compose.material3.TopAppBarScrollBehavior, com.bilibili.ogv.rank.U, kotlinx.coroutines.CoroutineScope, androidx.compose.runtime.Composer, int):void");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void e(@Nullable final String str, final float f7, @NotNull final ComposableLambda composableLambda, @NotNull final ComposableLambda composableLambda2, @Nullable final Modifier modifier, final long j7, @Nullable final U u7, @Nullable Composer composer, final int i7) {
        int i8;
        int i9;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1371291699);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i10 = i8;
        if ((i7 & 48) == 0) {
            i10 = i8 | (composerStartRestartGroup.changed(f7) ? 32 : 16);
        }
        int i11 = i10;
        if ((i7 & 384) == 0) {
            i11 = i10 | (composerStartRestartGroup.changedInstance(composableLambda) ? 256 : 128);
        }
        int i12 = i11;
        if ((i7 & 3072) == 0) {
            i12 = i11 | (composerStartRestartGroup.changedInstance(composableLambda2) ? 2048 : 1024);
        }
        int i13 = i12;
        if ((i7 & 24576) == 0) {
            i13 = i12 | (composerStartRestartGroup.changed(modifier) ? 16384 : 8192);
        }
        if ((196608 & i7) == 0) {
            i9 = i13 | (composerStartRestartGroup.changed(j7) ? 131072 : 65536);
        } else {
            i9 = i13;
        }
        int i14 = i9;
        if ((1572864 & i7) == 0) {
            i14 = i9 | (composerStartRestartGroup.changed(u7) ? 1048576 : 524288);
        }
        if (composerStartRestartGroup.shouldExecute((599187 & i14) != 599186, i14 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i7 & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1371291699, i14, -1, "com.bilibili.ogv.rank.CustomTopAppBar (PageReadyUi.kt:457)");
            }
            float fM3880constructorimpl = Dp.m3880constructorimpl(u7.f71897a + X.b(WindowInsets.Companion, composerStartRestartGroup, 6, composerStartRestartGroup, 0));
            Modifier modifierClipToBounds = ClipKt.clipToBounds(modifier);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getBottomCenter(), false);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierClipToBounds);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            O4.d.c(companion, composerM2296constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion2 = Modifier.Companion;
            k(i14 & 14, composerStartRestartGroup, SizeKt.m1361requiredHeight3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), fM3880constructorimpl), str);
            BoxKt.Box(BackgroundKt.m1169backgroundbw27NRU$default(boxScopeInstance.matchParentSize(companion2), Color.m2628copywmQWz5c$default(j7, f7, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composerStartRestartGroup, 0);
            a(f7, u7, composableLambda, composableLambda2, WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), TopAppBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, TopAppBarDefaults.$stable)), composerStartRestartGroup, ((i14 >> 3) & 14) | ((i14 >> 15) & 112) | (i14 & 896) | (i14 & 7168));
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(str, f7, composableLambda, composableLambda2, modifier, j7, u7, i7) { // from class: com.bilibili.ogv.rank.E

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f71823a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final float f71824b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final ComposableLambda f71825c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final ComposableLambda f71826d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final Modifier f71827e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final long f71828f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final U f71829g;
                public final int h;

                {
                    this.f71823a = str;
                    this.f71824b = f7;
                    this.f71825c = composableLambda;
                    this.f71826d = composableLambda2;
                    this.f71827e = modifier;
                    this.f71828f = j7;
                    this.f71829g = u7;
                    this.h = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.h | 1);
                    long j8 = this.f71828f;
                    U u8 = this.f71829g;
                    PageReadyUiKt.e(this.f71823a, this.f71824b, this.f71825c, this.f71826d, this.f71827e, j8, u8, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x027d  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void f(com.bilibili.ogv.rank.api.a r33, com.bilibili.ogv.rank.U r34, androidx.compose.ui.Modifier r35, androidx.compose.runtime.Composer r36, int r37) {
        /*
            Method dump skipped, instruction units count: 857
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.rank.PageReadyUiKt.f(com.bilibili.ogv.rank.api.a, com.bilibili.ogv.rank.U, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void g(final PagerState pagerState, final List<C5505j> list, final String str, final String str2, final long j7, final TopAppBarScrollBehavior topAppBarScrollBehavior, final PaddingValues paddingValues, final U u7, final CoroutineScope coroutineScope, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(1012746870);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(pagerState) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(list) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changed(str) ? 256 : 128);
        }
        int i11 = i10;
        if ((i7 & 3072) == 0) {
            i11 = i10 | (composerStartRestartGroup.changed(str2) ? 2048 : 1024);
        }
        int i12 = i11;
        if ((i7 & 24576) == 0) {
            i12 = i11 | (composerStartRestartGroup.changed(j7) ? 16384 : 8192);
        }
        int i13 = i12;
        if ((196608 & i7) == 0) {
            i13 = i12 | (composerStartRestartGroup.changed(topAppBarScrollBehavior) ? 131072 : 65536);
        }
        int i14 = i13;
        if ((1572864 & i7) == 0) {
            i14 = i13 | (composerStartRestartGroup.changed(paddingValues) ? 1048576 : 524288);
        }
        int i15 = i14;
        if ((12582912 & i7) == 0) {
            i15 = i14 | (composerStartRestartGroup.changed(u7) ? 8388608 : 4194304);
        }
        int i16 = i15;
        if ((100663296 & i7) == 0) {
            i16 = i15 | (composerStartRestartGroup.changedInstance(coroutineScope) ? 67108864 : 33554432);
        }
        if (composerStartRestartGroup.shouldExecute((38347923 & i16) != 38347922, i16 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1012746870, i16, -1, "com.bilibili.ogv.rank.MainContent (PageReadyUi.kt:242)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM1346paddingqDBjuR0$default = PaddingKt.m1346paddingqDBjuR0$default(SizeKt.fillMaxSize$default(ZIndexModifierKt.zIndex(companion, 1.0f), 0.0f, 1, null), 0.0f, Li0.l.a(11, paddingValues.mo1351calculateTopPaddingD9Ej5fM()), 0.0f, 0.0f, 13, null);
            float f7 = u7.f71899c;
            Modifier modifierM1168backgroundbw27NRU = BackgroundKt.m1168backgroundbw27NRU(modifierM1346paddingqDBjuR0$default, j7, RoundedCornerShapeKt.m1504RoundedCornerShapea9UjIt4$default(f7, f7, 0.0f, 0.0f, 12, null));
            LayoutDirection layoutDirection = LayoutDirection.Ltr;
            Modifier modifierM1346paddingqDBjuR0$default2 = PaddingKt.m1346paddingqDBjuR0$default(modifierM1168backgroundbw27NRU, PaddingKt.calculateStartPadding(paddingValues, layoutDirection), 0.0f, PaddingKt.calculateEndPadding(paddingValues, layoutDirection), 0.0f, 10, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1346paddingqDBjuR0$default2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            O4.d.c(companion2, composerM2296constructorimpl, measurePolicyColumnMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i17 = i16 >> 12;
            d(pagerState, list, topAppBarScrollBehavior, u7, coroutineScope, composerStartRestartGroup, (i16 & SearchBangumiItem.TYPE_FULLNET_MOVIE) | ((i16 >> 9) & 896) | (i17 & 7168) | (i17 & 57344));
            PagerKt.m1477HorizontalPager8jOkeI(pagerState, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1852663763, true, new Function4(str, pagerState, list, str2) { // from class: com.bilibili.ogv.rank.B

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f71806a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final PagerState f71807b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final List f71808c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final String f71809d;

                {
                    this.f71806a = str;
                    this.f71807b = pagerState;
                    this.f71808c = list;
                    this.f71809d = str2;
                }

                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    List list2 = this.f71808c;
                    int iIntValue = ((Integer) obj2).intValue();
                    Composer composer2 = (Composer) obj3;
                    int iIntValue2 = ((Integer) obj4).intValue();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1852663763, iIntValue2, -1, "com.bilibili.ogv.rank.MainContent.<anonymous>.<anonymous> (PageReadyUi.kt:273)");
                    }
                    kntr.common.pv.compose.PagerKt.a(C8770a.a(new StringBuilder("pgc."), this.f71806a, "-ranklist.0.0.pv"), this.f71807b, iIntValue, composer2, (iIntValue2 << 3) & 896).updateExtra(MapsKt.mapOf(new Pair[]{TuplesKt.to("index", this.f71809d), TuplesKt.to("ranklist_id", ((C5505j) list2.get(iIntValue)).f71988a.f71950c)}));
                    ((C5505j) list2.get(iIntValue)).f71989b.invoke(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i16 & 14) | 48, 24576, 16380);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(pagerState, list, str, str2, j7, topAppBarScrollBehavior, paddingValues, u7, coroutineScope, i7) { // from class: com.bilibili.ogv.rank.C

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final PagerState f71810a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final List f71811b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final String f71812c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final String f71813d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final long f71814e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final TopAppBarScrollBehavior f71815f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final PaddingValues f71816g;
                public final U h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final CoroutineScope f71817i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final int f71818j;

                {
                    this.f71810a = pagerState;
                    this.f71811b = list;
                    this.f71812c = str;
                    this.f71813d = str2;
                    this.f71814e = j7;
                    this.f71815f = topAppBarScrollBehavior;
                    this.f71816g = paddingValues;
                    this.h = u7;
                    this.f71817i = coroutineScope;
                    this.f71818j = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f71818j | 1);
                    PageReadyUiKt.g(this.f71810a, this.f71811b, this.f71812c, this.f71813d, this.f71814e, this.f71815f, this.f71816g, this.h, this.f71817i, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b7  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void h(@org.jetbrains.annotations.NotNull final androidx.compose.foundation.pager.PagerState r25, @org.jetbrains.annotations.NotNull final java.util.List r26, @org.jetbrains.annotations.NotNull final java.lang.String r27, @org.jetbrains.annotations.NotNull final java.lang.String r28, @org.jetbrains.annotations.Nullable final androidx.compose.ui.Modifier r29, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r30, final int r31) {
        /*
            Method dump skipped, instruction units count: 1171
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.rank.PageReadyUiKt.h(androidx.compose.foundation.pager.PagerState, java.util.List, java.lang.String, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0150  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void i(final int r15, final com.bilibili.ogv.rank.C5505j r16, final androidx.compose.foundation.pager.PagerState r17, final kotlinx.coroutines.CoroutineScope r18, androidx.compose.runtime.Composer r19, final int r20) {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.rank.PageReadyUiKt.i(int, com.bilibili.ogv.rank.j, androidx.compose.foundation.pager.PagerState, kotlinx.coroutines.CoroutineScope, androidx.compose.runtime.Composer, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void j(final List<com.bilibili.ogv.bdesign.tab.e> list, final PagerState pagerState, final U u7, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(725715786);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(pagerState) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changed(u7) ? 256 : 128);
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 147) != 146, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(725715786, i10, -1, "com.bilibili.ogv.rank.TabIndicator (PageReadyUi.kt:366)");
            }
            TabRowDefaults.INSTANCE.m2123SecondaryIndicator9IZ8Weo(ClipKt.clip(PaddingKt.m1346paddingqDBjuR0$default(com.bilibili.ogv.bdesign.tab.m.c(Modifier.Companion, list.get(pagerState.getCurrentPage()), composerStartRestartGroup), 0.0f, 0.0f, 0.0f, Dp.m3880constructorimpl(10), 7, null), RoundedCornerShapeKt.m1502RoundedCornerShape0680j_4(u7.f71900d)), 0.0f, BiliTheme.INSTANCE.getColors(composerStartRestartGroup, BiliTheme.$stable).getText1-0d7_KjU(), composerStartRestartGroup, TabRowDefaults.$stable << 9, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(list, pagerState, u7, i7) { // from class: com.bilibili.ogv.rank.x

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final List f72166a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final PagerState f72167b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final U f72168c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final int f72169d;

                {
                    this.f72166a = list;
                    this.f72167b = pagerState;
                    this.f72168c = u7;
                    this.f72169d = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f72169d | 1);
                    PageReadyUiKt.j(this.f72166a, this.f72167b, this.f72168c, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00e2  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void k(final int r14, androidx.compose.runtime.Composer r15, final androidx.compose.ui.Modifier r16, final java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.rank.PageReadyUiKt.k(int, androidx.compose.runtime.Composer, androidx.compose.ui.Modifier, java.lang.String):void");
    }

    public static final boolean l(float f7, float f8) {
        boolean z6 = true;
        if ((f7 <= 0.0f || f8 <= 0.001f) && (f7 >= 0.0f || f8 >= 0.999f)) {
            z6 = false;
        }
        return z6;
    }
}
