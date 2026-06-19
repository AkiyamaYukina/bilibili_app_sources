package com.bilibili.playset.detail.widget;

import Di0.C1602f;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.material.DividerKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.playset.detail.compose.C5913l;
import com.bilibili.playset.detail.compose.FavoritesArticleCardKt;
import com.bilibili.playset.detail.compose.FavoritesInvalidVideoCardKt;
import com.bilibili.playset.detail.compose.FavoritesVideoCardKt;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import os0.C8259e;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/widget/N.class */
public final class N implements Function4<LazyGridItemScope, Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f84616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.bilibili.playset.detail.data.h f84617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5930o f84618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function1 f84619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.bilibili.playset.detail.l f84620e;

    public N(List list, com.bilibili.playset.detail.data.h hVar, C5930o c5930o, Function1 function1, com.bilibili.playset.detail.l lVar) {
        this.f84616a = list;
        this.f84617b = hVar;
        this.f84618c = c5930o;
        this.f84619d = function1;
        this.f84620e = lVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i7;
        int i8;
        LazyGridItemScope lazyGridItemScope = (LazyGridItemScope) obj;
        int iIntValue = ((Number) obj2).intValue();
        Composer composer = (Composer) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i7 = (composer.changed(lazyGridItemScope) ? 4 : 2) | iIntValue2;
        } else {
            i7 = iIntValue2;
        }
        int i9 = i7;
        if ((iIntValue2 & 48) == 0) {
            i9 = i7 | (composer.changed(iIntValue) ? 32 : 16);
        }
        if (composer.shouldExecute((i9 & 147) != 146, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1942245546, i9, -1, "androidx.compose.foundation.lazy.grid.itemsIndexed.<anonymous> (LazyGridDsl.kt:576)");
            }
            com.bilibili.playset.api.a aVar = (com.bilibili.playset.api.a) this.f84616a.get(iIntValue);
            composer.startReplaceGroup(-1121536313);
            com.bilibili.playset.detail.data.h hVar = this.f84617b;
            int size = CollectionsKt.lastOrNull(hVar.f84515c) instanceof C8259e ? hVar.f84515c.size() - 1 : hVar.f84515c.size();
            C5930o c5930o = this.f84618c;
            if (size > 0) {
                int i10 = c5930o.f84655a;
                i8 = ((size - 1) / i10) * i10;
            } else {
                i8 = 0;
            }
            boolean z6 = size > 1 && iIntValue < i8;
            if (aVar instanceof com.bilibili.playset.api.c) {
                composer.startReplaceGroup(-1120986653);
                Modifier.Companion companion = Modifier.Companion;
                Modifier modifierAnimateItem$default = LazyGridItemScope.animateItem$default(lazyGridItemScope, companion, null, null, null, 7, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
                int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierAnimateItem$default);
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
                com.bilibili.playset.api.c cVar = (com.bilibili.playset.api.c) aVar;
                if (cVar.y()) {
                    composer.startReplaceGroup(-1297935608);
                    FavoritesInvalidVideoCardKt.a(cVar, iIntValue, c5930o.f84656b, this.f84619d, composer, i9 & 112);
                    composer.endReplaceGroup();
                } else if (cVar.l() == 302) {
                    composer.startReplaceGroup(-1297924093);
                    FavoritesArticleCardKt.b(cVar, iIntValue, c5930o.f84656b, this.f84619d, composer, i9 & 112);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-1297913567);
                    FavoritesVideoCardKt.a(cVar, iIntValue, c5930o.f84656b, this.f84619d, composer, i9 & 112);
                    composer.endReplaceGroup();
                }
                if (z6) {
                    composer.startReplaceGroup(-1580211880);
                    DividerKt.m1691DivideroMI9zvI(PaddingKt.m1346paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3880constructorimpl(this.f84620e.f84575a ? 12 : 20), 0.0f, 0.0f, 0.0f, 14, null), BiliTheme.INSTANCE.getColors(composer, BiliTheme.$stable).getLine_regular-0d7_KjU(), Dp.m3880constructorimpl((float) 0.5d), 0.0f, composer, 384, 8);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-1579806369);
                    composer.endReplaceGroup();
                }
                composer.endNode();
                composer.endReplaceGroup();
            } else if (aVar instanceof C8259e) {
                composer.startReplaceGroup(-1283030632);
                C5913l.a((C8259e) aVar, this.f84619d, composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1119192435);
                composer.endReplaceGroup();
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
