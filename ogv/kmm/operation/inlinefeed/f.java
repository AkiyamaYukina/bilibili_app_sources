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
import it0.C7615a;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinefeed/f.class */
public final class f implements UiComposableLike {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unit f68382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VertexContext f68383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KomponentScope f68384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f68385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C7615a f68386e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.bilibili.ogv.kmm.operation.inlinefeed.a f68387f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinefeed/f$a.class */
    public static final class a implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Modifier f68388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f68389b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C7615a f68390c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final com.bilibili.ogv.kmm.operation.inlinefeed.a f68391d;

        public a(Modifier modifier, List list, C7615a c7615a, com.bilibili.ogv.kmm.operation.inlinefeed.a aVar) {
            this.f68388a = modifier;
            this.f68389b = list;
            this.f68390c = c7615a;
            this.f68391d = aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            int iIntValue = ((Number) obj2).intValue();
            if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1461546774, iIntValue, -1, "kntr.common.komponent.setContent.<no name provided>.invoke.<anonymous> (Komponent.kt:79)");
                }
                composer.startReplaceGroup(2087527853);
                boolean zA = C8009e.a(composer);
                if (zA || ((ArrayList) this.f68389b).size() >= 3) {
                    List<e> listTake = zA ? CollectionsKt.take(this.f68389b, 1) : CollectionsKt.take(this.f68389b, 3);
                    Modifier modifierA = C8013d.a(this.f68388a, this.f68390c);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion = Alignment.Companion;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion.getStart(), composer, 0);
                    int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierA);
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
                    String str = this.f68391d.f68340b;
                    if (StringsKt.isBlank(str)) {
                        str = null;
                    }
                    if (str == null) {
                        composer.startReplaceGroup(-319607980);
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(-319607979);
                        k.a(48, composer, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), str);
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
                    composer.startReplaceGroup(356108792);
                    for (e eVar : listTake) {
                        k.b(eVar.f68377a, eVar.f68379c, eVar.f68380d, eVar.f68381e, C8013d.a(RowScope.weight$default(rowScopeInstance, PaddingKt.m1343paddingVpY3zN4(Modifier.Companion, Dp.m3880constructorimpl(4), Dp.m3880constructorimpl(6)), 1.0f, false, 2, null), eVar.f68378b), composer, 0);
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

    public f(Unit unit, VertexContext vertexContext, KomponentScope komponentScope, List list, C7615a c7615a, com.bilibili.ogv.kmm.operation.inlinefeed.a aVar) {
        this.f68383b = vertexContext;
        this.f68384c = komponentScope;
        this.f68385d = list;
        this.f68386e = c7615a;
        this.f68387f = aVar;
        this.f68382a = unit;
    }

    public final Object getContentType() {
        return Reflection.getOrCreateKotlinClass(f.class);
    }

    public final Object getKey() {
        return this.f68384c.getKey();
    }

    public final Object getState() {
        return this.f68382a;
    }

    @Composable
    public final void invoke(Modifier modifier, Composer composer, int i7) {
        composer.startReplaceGroup(1906618612);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1906618612, i7, -1, "kntr.common.komponent.setContent.<no name provided>.invoke (Komponent.kt:78)");
        }
        this.f68383b.ProvideCompositionLocals(ComposableLambdaKt.rememberComposableLambda(1461546774, true, new a(modifier, this.f68385d, this.f68386e, this.f68387f), composer, 54), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
