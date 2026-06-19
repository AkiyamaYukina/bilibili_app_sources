package com.bilibili.ship.theseus.cheese.biz.intro.studyrecord;

import Di0.C1602f;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.framework.exposure.core.collecter.ComposeExposureLayoutInfoCollectorKt;
import com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.CheeseStudyCompletedComponent;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/studyrecord/a.class */
public final /* synthetic */ class C6113a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheeseStudyCompletedComponent f90219a;

    public /* synthetic */ C6113a(CheeseStudyCompletedComponent cheeseStudyCompletedComponent) {
        this.f90219a = cheeseStudyCompletedComponent;
    }

    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-635497653, iIntValue, -1, "com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.CheeseStudyCompletedComponent.bindToView.<anonymous> (CheeseStudyCompletedComponent.kt:110)");
            }
            final CheeseStudyCompletedComponent cheeseStudyCompletedComponent = this.f90219a;
            final int i7 = 0;
            BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(-1221176173, true, new Function2(cheeseStudyCompletedComponent, i7) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f90220a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f90221b;

                {
                    this.f90220a = i7;
                    this.f90221b = cheeseStudyCompletedComponent;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final Object invoke(Object obj3, Object obj4) {
                    Function2 function2;
                    Object obj5 = this.f90221b;
                    switch (this.f90220a) {
                        case 0:
                            Composer composer2 = (Composer) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1221176173, iIntValue2, -1, "com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.CheeseStudyCompletedComponent.bindToView.<anonymous>.<anonymous> (CheeseStudyCompletedComponent.kt:111)");
                                }
                                Modifier.Companion companion = Modifier.Companion;
                                CheeseStudyCompletedComponent cheeseStudyCompletedComponent2 = (CheeseStudyCompletedComponent) obj5;
                                Modifier modifierCollectExposureLayoutInfo = ComposeExposureLayoutInfoCollectorKt.collectExposureLayoutInfo(companion, cheeseStudyCompletedComponent2.f90140a.f90146f);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                                int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierCollectExposureLayoutInfo);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                if (composer2.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM2296constructorimpl = Updater.m2296constructorimpl(composer2);
                                O4.d.c(companion2, composerM2296constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
                                Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                CheeseStudyCompletedComponent.a aVar = cheeseStudyCompletedComponent2.f90140a;
                                if (!((c.a) aVar.f90152m.getValue()).f102988b) {
                                    composer2.startReplaceGroup(-1921886022);
                                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                                    int i8 = ExposureEntry.$stable;
                                    cheeseStudyCompletedComponent2.c(aVar, modifierFillMaxSize$default, composer2, (i8 << 6) | i8 | 48);
                                    composer2.endReplaceGroup();
                                } else if (((c.a) aVar.f90152m.getValue()).f102988b) {
                                    composer2.startReplaceGroup(-1921557670);
                                    Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                                    int i9 = ExposureEntry.$stable;
                                    cheeseStudyCompletedComponent2.b(aVar, modifierFillMaxSize$default2, composer2, (i9 << 6) | i9 | 48);
                                    composer2.endReplaceGroup();
                                } else {
                                    composer2.startReplaceGroup(-1921275415);
                                    composer2.endReplaceGroup();
                                }
                                composer2.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            List list = (List) obj3;
                            Boolean bool = (Boolean) obj4;
                            bool.booleanValue();
                            ed.g gVar = ((ed.e) obj5).b;
                            if (gVar != null && (function2 = gVar.e) != null) {
                                function2.invoke(list, bool);
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, composer, 54), composer, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
