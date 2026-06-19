package com.bilibili.ogv.operation3.module.feedback;

import Di0.C1602f;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import com.bilibili.compose.theme.BiliTheme;
import java.util.List;
import kntr.common.comment.card.ui.AnswerCardUiKt;
import kntr.common.trio.toast.Toaster;
import kntr.common.trio.toast.ToasterKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/feedback/v.class */
public final class v {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(final int i7, @Nullable Composer composer, @NotNull final List list, @NotNull final Function0 function0, @NotNull final Function1 function1) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1308562825);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(function0) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changedInstance(function1) ? 256 : 128);
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 147) != 146, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1308562825, i10, -1, "com.bilibili.ogv.operation3.module.feedback.FeedbackBottomDialogContent (FeedbackBottomDialogContent.kt:22)");
            }
            d.a(function0, ComposableLambdaKt.rememberComposableLambda(419232472, true, new Function2(list, function1, function0) { // from class: com.bilibili.ogv.operation3.module.feedback.o

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final List f71233a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Function1 f71234b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Function0 f71235c;

                {
                    this.f71233a = list;
                    this.f71234b = function1;
                    this.f71235c = function0;
                }

                /* JADX WARN: Removed duplicated region for block: B:22:0x0179  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invoke(java.lang.Object r28, java.lang.Object r29) {
                    /*
                        Method dump skipped, instruction units count: 599
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.operation3.module.feedback.o.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i10 >> 3) & 14) | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i11 = 0;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(i7, i11, list, function0, function1) { // from class: com.bilibili.ogv.operation3.module.feedback.p

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f71236a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f71237b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Object f71238c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Object f71239d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final Object f71240e;

                {
                    this.f71236a = i11;
                    this.f71238c = list;
                    this.f71239d = function0;
                    this.f71240e = function1;
                    this.f71237b = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    switch (this.f71236a) {
                        case 0:
                            List list2 = (List) this.f71238c;
                            ((Integer) obj2).intValue();
                            v.a(RecomposeScopeImplKt.updateChangedFlags(this.f71237b | 1), (Composer) obj, list2, (Function0) this.f71239d, (Function1) this.f71240e);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f71237b | 1);
                            AnswerCardUiKt.c((S41.c) this.f71238c, (m51.a) this.f71239d, (Modifier) this.f71240e, (Composer) obj, iUpdateChangedFlags);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void b(@NotNull final w wVar, @NotNull final Function1 function1, @Nullable final Modifier modifier, @Nullable Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-487725742);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(wVar) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(function1) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changed(modifier) ? 256 : 128);
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 147) != 146, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-487725742, i10, -1, "com.bilibili.ogv.operation3.module.feedback.FeedbackOptionsItemUi (FeedbackBottomDialogContent.kt:72)");
            }
            final Toaster toaster = (Toaster) composerStartRestartGroup.consume(ToasterKt.getLocalToaster());
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
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
            O4.d.c(companion2, composerM2296constructorimpl, measurePolicyColumnMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.Companion;
            Modifier modifierM1358height3ABfNKs = SizeKt.m1358height3ABfNKs(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), Dp.m3880constructorimpl(35));
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getBottom(), composerStartRestartGroup, 48);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1358height3ABfNKs);
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
            O4.d.c(companion2, composerM2296constructorimpl2, measurePolicyRowMeasurePolicy, composerM2296constructorimpl2, currentCompositionLocalMap2);
            Updater.m2304setimpl(composerM2296constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl2, Integer.valueOf(iHashCode2), composerM2296constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            String str = wVar.f71256b;
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i11 = BiliTheme.$stable;
            TextStyle t12 = biliTheme.getTextStyle(composerStartRestartGroup, i11).getT12();
            long j7 = biliTheme.getColors(composerStartRestartGroup, i11).getText1-0d7_KjU();
            TextOverflow.Companion companion4 = TextOverflow.Companion;
            TextKt.m2186TextNvy7gAk(str, null, j7, null, 0L, null, null, null, 0L, null, null, 0L, companion4.m3827getEllipsisgIe3tQ8(), false, 1, 0, null, t12, composerStartRestartGroup, 0, 24960, 110586);
            TextKt.m2186TextNvy7gAk(wVar.f71257c, null, biliTheme.getColors(composerStartRestartGroup, i11).getText3-0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, companion4.m3827getEllipsisgIe3tQ8(), false, 1, 0, null, biliTheme.getTextStyle(composerStartRestartGroup, i11).getT12(), composerStartRestartGroup, 0, 24960, 110586);
            composerStartRestartGroup.endNode();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
            float f7 = 14;
            FlowLayoutKt.FlowRow(PaddingKt.m1346paddingqDBjuR0$default(modifierFillMaxWidth$default, 0.0f, Dp.m3880constructorimpl(f7), 0.0f, Dp.m3880constructorimpl(16), 5, null), arrangement.getSpaceBetween(), arrangement.m1302spacedBy0680j_4(Dp.m3880constructorimpl(f7)), null, 2, 0, ComposableLambdaKt.rememberComposableLambda(-1673949097, true, new Function3(wVar, function1, toaster) { // from class: com.bilibili.ogv.operation3.module.feedback.r

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final w f71243a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Function1 f71244b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Toaster f71245c;

                {
                    this.f71243a = wVar;
                    this.f71244b = function1;
                    this.f71245c = toaster;
                }

                /* JADX WARN: Removed duplicated region for block: B:25:0x01a4  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invoke(java.lang.Object r28, java.lang.Object r29, java.lang.Object r30) {
                    /*
                        Method dump skipped, instruction units count: 533
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.operation3.module.feedback.r.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 1597878, 40);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(wVar, function1, modifier, i7) { // from class: com.bilibili.ogv.operation3.module.feedback.s

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final w f71246a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Function1 f71247b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Modifier f71248c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final int f71249d;

                {
                    this.f71246a = wVar;
                    this.f71247b = function1;
                    this.f71248c = modifier;
                    this.f71249d = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f71249d | 1);
                    Function1 function12 = this.f71247b;
                    Modifier modifier2 = this.f71248c;
                    v.b(this.f71246a, function12, modifier2, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
