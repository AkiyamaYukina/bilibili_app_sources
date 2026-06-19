package com.bilibili.ogv.kmm.operation.inlinefeed;

import Di0.C1602f;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.bilibili.compose.theme.BiliTheme;
import java.util.ArrayList;
import java.util.List;
import kntr.common.komponent.KomponentScope;
import kntr.common.komponent.UiComposableLike;
import kntr.common.trio.vertex.VertexContext;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import mk0.C8009e;
import ml0.C8013d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinefeed/t.class */
public final class t implements UiComposableLike {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unit f68425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VertexContext f68426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KomponentScope f68427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f68428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w f68429e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f68430f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinefeed/t$a.class */
    public static final class a implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Modifier f68431a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f68432b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final w f68433c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f68434d;

        public a(Modifier modifier, List list, w wVar, String str) {
            this.f68431a = modifier;
            this.f68432b = list;
            this.f68433c = wVar;
            this.f68434d = str;
        }

        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            int iIntValue = ((Number) obj2).intValue();
            if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1461546774, iIntValue, -1, "kntr.common.komponent.setContent.<no name provided>.invoke.<anonymous> (Komponent.kt:79)");
                }
                composer.startReplaceGroup(-101135022);
                boolean zA = C8009e.a(composer);
                if (zA || ((ArrayList) this.f68432b).size() >= 3) {
                    List<s> listTake = zA ? CollectionsKt.take(this.f68432b, 1) : CollectionsKt.take(this.f68432b, 3);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion = Alignment.Companion;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion.getStart(), composer, 0);
                    int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, this.f68431a);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM2296constructorimpl = Updater.m2296constructorimpl(composer);
                    O4.d.c(companion2, composerM2296constructorimpl, measurePolicyColumnMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
                    Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    w wVar = this.f68433c;
                    if (StringsKt.isBlank(wVar.f68442b)) {
                        composer.startReplaceGroup(-850631185);
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(-850732090);
                        Zj0.k.b(48, composer, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), wVar.f68442b);
                        composer.endReplaceGroup();
                    }
                    Modifier modifierM1344paddingVpY3zN4$default = PaddingKt.m1344paddingVpY3zN4$default(BackgroundKt.m1169backgroundbw27NRU$default(Modifier.Companion, BiliTheme.INSTANCE.getColors(composer, BiliTheme.$stable).getBg1-0d7_KjU(), null, 2, null), Dp.m3880constructorimpl(8), 0.0f, 2, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getTop(), composer, 0);
                    int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                    CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierM1344paddingVpY3zN4$default);
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor2);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM2296constructorimpl2 = Updater.m2296constructorimpl(composer);
                    O4.d.c(companion2, composerM2296constructorimpl2, measurePolicyRowMeasurePolicy, composerM2296constructorimpl2, currentCompositionLocalMap2);
                    Updater.m2304setimpl(composerM2296constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl2, Integer.valueOf(iHashCode2), composerM2296constructorimpl2));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    composer.startReplaceGroup(-1214802127);
                    for (s sVar : listTake) {
                        v.a(sVar.f68421a, sVar.f68423c, sVar.f68424d, this.f68434d, C8013d.a(RowScope.weight$default(rowScopeInstance, PaddingKt.m1343paddingVpY3zN4(Modifier.Companion, Dp.m3880constructorimpl(4), Dp.m3880constructorimpl(6)), 1.0f, false, 2, null), sVar.f68422b), composer, 0);
                    }
                    composer.endReplaceGroup();
                    composer.endNode();
                    composer.endNode();
                }
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer.skipToGroupEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public t(Unit unit, VertexContext vertexContext, KomponentScope komponentScope, List list, w wVar, String str) {
        this.f68426b = vertexContext;
        this.f68427c = komponentScope;
        this.f68428d = list;
        this.f68429e = wVar;
        this.f68430f = str;
        this.f68425a = unit;
    }

    public final Object getContentType() {
        return Reflection.getOrCreateKotlinClass(t.class);
    }

    public final Object getKey() {
        return this.f68427c.getKey();
    }

    public final Object getState() {
        return this.f68425a;
    }

    @Composable
    public final void invoke(Modifier modifier, Composer composer, int i7) {
        composer.startReplaceGroup(1906618612);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1906618612, i7, -1, "kntr.common.komponent.setContent.<no name provided>.invoke (Komponent.kt:78)");
        }
        this.f68426b.ProvideCompositionLocals(ComposableLambdaKt.rememberComposableLambda(1461546774, true, new a(modifier, this.f68428d, this.f68429e, this.f68430f), composer, 54), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
