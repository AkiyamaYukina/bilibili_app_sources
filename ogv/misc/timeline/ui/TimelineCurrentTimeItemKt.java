package com.bilibili.ogv.misc.timeline.ui;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.constraintlayout.compose.C4550g;
import androidx.constraintlayout.compose.C4551h;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutKt;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.compose.HorizontalAnchorable;
import androidx.constraintlayout.compose.Measurer;
import androidx.constraintlayout.compose.ToolingUtilsKt;
import androidx.constraintlayout.compose.VerticalAnchorable;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yk0.C9061a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/ui/TimelineCurrentTimeItemKt.class */
public final class TimelineCurrentTimeItemKt {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/ui/TimelineCurrentTimeItemKt$a.class */
    public static final class a implements Function1<ConstrainScope, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f69493a = new Object();

        public final Object invoke(Object obj) {
            ConstrainScope constrainScope = (ConstrainScope) obj;
            HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(constrainScope.getTop(), constrainScope.getParent().getTop(), 0.0f, 0.0f, 6, null);
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getStart(), constrainScope.getParent().getStart(), 0.0f, 0.0f, 6, null);
            HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(constrainScope.getBottom(), constrainScope.getParent().getBottom(), 0.0f, 0.0f, 6, null);
            constrainScope.setHeight(Dimension.Companion.getFillToConstraints());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/ui/TimelineCurrentTimeItemKt$b.class */
    public static final class b implements Function1<ConstrainScope, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConstrainedLayoutReference f69494a;

        public b(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f69494a = constrainedLayoutReference;
        }

        public final Object invoke(Object obj) {
            ConstrainScope constrainScope = (ConstrainScope) obj;
            HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(constrainScope.getTop(), constrainScope.getParent().getTop(), 0.0f, 0.0f, 6, null);
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getEnd(), constrainScope.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getStart(), this.f69494a.getEnd(), 0.0f, 0.0f, 6, null);
            constrainScope.setWidth(Dimension.Companion.getFillToConstraints());
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(@NotNull final C9061a c9061a, @NotNull final String str, @Nullable Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(1815858719);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(c9061a) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(str) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1815858719, i9, -1, "com.bilibili.ogv.misc.timeline.ui.TimelineCurrentTime (TimelineCurrentTimeItem.kt:19)");
            }
            Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), null, false, 3, null);
            Object objA = C4550g.a(-270267587, composerStartRestartGroup, -3687241);
            Composer.Companion companion = Composer.Companion;
            Object objA2 = objA;
            if (objA == companion.getEmpty()) {
                objA2 = Yb.a.a(composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final Measurer measurer = (Measurer) objA2;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Object objA3 = objRememberedValue;
            if (objRememberedValue == companion.getEmpty()) {
                objA3 = C4551h.a(composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objA3;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Object objMutableStateOf$default = objRememberedValue2;
            if (objRememberedValue2 == companion.getEmpty()) {
                objMutableStateOf$default = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objMutableStateOf$default);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Pair<MeasurePolicy, Function0<Unit>> pairRememberConstraintLayoutMeasurePolicy = ConstraintLayoutKt.rememberConstraintLayoutMeasurePolicy(257, constraintLayoutScope, (MutableState<Boolean>) objMutableStateOf$default, measurer, composerStartRestartGroup, 4544);
            MeasurePolicy measurePolicy = (MeasurePolicy) pairRememberConstraintLayoutMeasurePolicy.component1();
            final Function0 function0 = (Function0) pairRememberConstraintLayoutMeasurePolicy.component2();
            final int i10 = 6;
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierWrapContentHeight$default, false, new Function1<SemanticsPropertyReceiver, Unit>(measurer) { // from class: com.bilibili.ogv.misc.timeline.ui.TimelineCurrentTimeItemKt$TimelineCurrentTime$$inlined$ConstraintLayout$1
                final Measurer $measurer;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                    this.$measurer = measurer;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((SemanticsPropertyReceiver) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    ToolingUtilsKt.setDesignInfoProvider(semanticsPropertyReceiver, this.$measurer);
                }
            }, 1, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894182, true, new Function2<Composer, Integer, Unit>(constraintLayoutScope, i10, function0, str, c9061a) { // from class: com.bilibili.ogv.misc.timeline.ui.TimelineCurrentTimeItemKt$TimelineCurrentTime$$inlined$ConstraintLayout$2
                final int $$changed;
                final String $currentTime$inlined;
                final Function0 $onHelpersChanged;
                final ConstraintLayoutScope $scope;
                final C9061a $viewModel$inlined;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                    this.$scope = constraintLayoutScope;
                    this.$onHelpersChanged = function0;
                    this.$currentTime$inlined = str;
                    this.$viewModel$inlined = c9061a;
                    this.$$changed = i10;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:29:0x026b  */
                @androidx.compose.runtime.Composable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void invoke(@org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r34, int r35) {
                    /*
                        Method dump skipped, instruction units count: 1105
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.misc.timeline.ui.TimelineCurrentTimeItemKt$TimelineCurrentTime$$inlined$ConstraintLayout$2.invoke(androidx.compose.runtime.Composer, int):void");
                }
            }), measurePolicy, composerStartRestartGroup, 48, 0);
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(c9061a, str, i7) { // from class: com.bilibili.ogv.misc.timeline.ui.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final C9061a f69518a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f69519b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f69520c;

                {
                    this.f69518a = c9061a;
                    this.f69519b = str;
                    this.f69520c = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f69520c | 1);
                    TimelineCurrentTimeItemKt.a(this.f69518a, this.f69519b, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
