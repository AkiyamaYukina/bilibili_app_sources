package com.bilibili.ship.theseus.cheese.biz.intro.pack;

import Di0.C1602f;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.compose.theme.ThemeDayNight;
import com.bilibili.search2.api.SearchBangumiItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/pack/j.class */
public final class j implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f89543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CheesePackageComponent f89544b;

    public j(List list, CheesePackageComponent cheesePackageComponent) {
        this.f89543a = list;
        this.f89544b = cheesePackageComponent;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i7;
        LazyItemScope lazyItemScope = (LazyItemScope) obj;
        int iIntValue = ((Number) obj2).intValue();
        Composer composer = (Composer) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i7 = (composer.changed(lazyItemScope) ? 4 : 2) | iIntValue2;
        } else {
            i7 = iIntValue2;
        }
        int i8 = i7;
        if ((iIntValue2 & 48) == 0) {
            i8 = i7 | (composer.changed(iIntValue) ? 32 : 16);
        }
        if (composer.shouldExecute((i8 & 147) != 146, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2039820996, i8, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            Object obj5 = ((ArrayList) this.f89543a).get(iIntValue);
            int i9 = i8 & SearchBangumiItem.TYPE_FULLNET_MOVIE;
            t tVar = (t) obj5;
            composer.startReplaceGroup(4420939);
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composer, 0);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
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
            O4.d.c(companion2, composerM2296constructorimpl, measurePolicyRowMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (iIntValue != 0) {
                composer.startReplaceGroup(1933861789);
                H0.e.a(10, 6, composer, companion);
            } else {
                composer.startReplaceGroup(1933961733);
                composer.endReplaceGroup();
            }
            CheesePackageComponent cheesePackageComponent = this.f89544b;
            boolean z6 = cheesePackageComponent.f89443d;
            s sVar = cheesePackageComponent.f89444e;
            if (z6 && ((ArrayList) sVar.f89568b).size() == 1) {
                composer.startReplaceGroup(1934050114);
                BiliTheme biliTheme = BiliTheme.INSTANCE;
                int i10 = BiliTheme.$stable;
                this.f89544b.c(iIntValue, tVar, new Pair<>(Color.m2619boximpl(biliTheme.getColors(composer, i10).getGa1-0d7_KjU()), Color.m2619boximpl(biliTheme.getColors(composer, i10).getGa2-0d7_KjU())), biliTheme.getDayNightTheme(composer, i10) == ThemeDayNight.Night, composer, (i9 >> 3) & 14);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1934249413);
                BiliTheme biliTheme2 = BiliTheme.INSTANCE;
                int i11 = BiliTheme.$stable;
                this.f89544b.b(iIntValue, tVar, new Pair<>(Color.m2619boximpl(biliTheme2.getColors(composer, i11).getGa1-0d7_KjU()), Color.m2619boximpl(biliTheme2.getColors(composer, i11).getGa2-0d7_KjU())), biliTheme2.getDayNightTheme(composer, i11) == ThemeDayNight.Night, composer, (i9 >> 3) & 14);
                composer.endReplaceGroup();
            }
            if (iIntValue == ((ArrayList) sVar.f89568b).size() - 1) {
                composer.startReplaceGroup(1934505597);
                H0.e.a(10, 6, composer, companion);
            } else {
                composer.startReplaceGroup(1934605541);
                composer.endReplaceGroup();
            }
            if (F0.a.c(composer)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
