package com.bilibili.ogv.bdesign.placeholder;

import Di0.C1602f;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import com.bilibili.compose.theme.BiliTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.compose.resources.StringResource;
import org.jetbrains.compose.resources.StringResourcesKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/bdesign/placeholder/j.class */
public final class j {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x010c  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(androidx.compose.ui.Modifier r12, androidx.compose.runtime.Composer r13, final int r14) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.bdesign.placeholder.j.a(androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void b(@Nullable Modifier modifier, @Nullable String str, @Nullable Composer composer, final int i7, final int i8) {
        int i9;
        Modifier modifier2;
        String strStringResource;
        Modifier modifier3;
        int i10;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2015942177);
        int i11 = i8 & 1;
        if (i11 != 0) {
            i9 = i7 | 6;
        } else if ((i7 & 6) == 0) {
            i9 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i7;
        } else {
            i9 = i7;
        }
        int i12 = i9;
        if ((i7 & 48) == 0) {
            i12 = i9 | 16;
        }
        if (composerStartRestartGroup.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((1 & i7) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i11 != 0) {
                    modifier = Modifier.Companion;
                }
                modifier3 = modifier;
                strStringResource = StringResourcesKt.stringResource((StringResource) O3.a.f17688A.getValue(), composerStartRestartGroup, 0);
                i10 = i12 & (-113);
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                i10 = i12 & (-113);
                modifier3 = modifier;
                strStringResource = str;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2015942177, i10, -1, "com.bilibili.ogv.bdesign.placeholder.LoadingPlaceholder (Loading.kt:23)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.Companion.getCenterHorizontally(), composerStartRestartGroup, 54);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
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
            O4.d.c(companion, composerM2296constructorimpl, measurePolicyColumnMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            a(null, composerStartRestartGroup, 0);
            Modifier modifierM1346paddingqDBjuR0$default = PaddingKt.m1346paddingqDBjuR0$default(Modifier.Companion, 0.0f, Dp.m3880constructorimpl(6), 0.0f, 0.0f, 13, null);
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i13 = BiliTheme.$stable;
            BasicTextKt.m1512BasicTextRWo7tUw(strStringResource, modifierM1346paddingqDBjuR0$default, TextStyle.m3586copyp1EtxEg$default(biliTheme.getTextStyle(composerStartRestartGroup, i13).getT14(), biliTheme.getColors(composerStartRestartGroup, i13).getText3-0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), (Function1<? super TextLayoutResult, Unit>) null, 0, false, 0, 0, (ColorProducer) null, (TextAutoSize) null, composerStartRestartGroup, 48, 1016);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            strStringResource = str;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier4 = modifier2;
            final String str2 = strStringResource;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(i7, i8, modifier4, str2) { // from class: com.bilibili.ogv.bdesign.placeholder.f

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Modifier f67398a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f67399b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f67400c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final int f67401d;

                {
                    this.f67398a = modifier4;
                    this.f67399b = str2;
                    this.f67400c = i7;
                    this.f67401d = i8;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f67400c | 1);
                    String str3 = this.f67399b;
                    int i14 = this.f67401d;
                    j.b(this.f67398a, str3, (Composer) obj, iUpdateChangedFlags, i14);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
