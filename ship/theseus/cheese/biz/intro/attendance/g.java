package com.bilibili.ship.theseus.cheese.biz.intro.attendance;

import Di0.C1602f;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.J;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.compose.theme.ThemeDayNight;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/attendance/g.class */
public final class g {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/attendance/g$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f89308a;

        static {
            int[] iArr = new int[ThemeDayNight.values().length];
            try {
                iArr[ThemeDayNight.Day.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[ThemeDayNight.Night.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f89308a = iArr;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0d98  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final com.bilibili.ship.theseus.cheese.biz.intro.attendance.h r26, final kotlinx.coroutines.flow.StateFlow r27, final kotlinx.coroutines.flow.StateFlow r28, final kotlinx.coroutines.flow.StateFlow r29, final com.bilibili.ship.theseus.cheese.biz.intro.attendance.j r30, androidx.compose.runtime.Composer r31, final int r32) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 3875
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.intro.attendance.g.a(com.bilibili.ship.theseus.cheese.biz.intro.attendance.h, kotlinx.coroutines.flow.StateFlow, kotlinx.coroutines.flow.StateFlow, kotlinx.coroutines.flow.StateFlow, com.bilibili.ship.theseus.cheese.biz.intro.attendance.j, androidx.compose.runtime.Composer, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void b(Composer composer, final int i7) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1445179319);
        if (composerStartRestartGroup.shouldExecute(i7 != 0, i7 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1445179319, i7, -1, "com.bilibili.ship.theseus.cheese.biz.intro.attendance.DefaultBackground (CheeseAttendanceComponent.kt:270)");
            }
            BoxKt.Box(BackgroundKt.m1169backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), BiliTheme.INSTANCE.getDayNightTheme(composerStartRestartGroup, BiliTheme.$stable) == ThemeDayNight.Night ? ColorKt.Color(4280295715L) : ColorKt.Color(4294375416L), null, 2, null), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(i7) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.attendance.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f89303a;

                {
                    this.f89303a = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    g.b((Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f89303a | 1));
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void c(final Modifier modifier, final h hVar, final CheeseAttendanceTheme cheeseAttendanceTheme, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(2014234082);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(hVar) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changed(cheeseAttendanceTheme.ordinal()) ? 256 : 128);
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 147) != 146, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2014234082, i10, -1, "com.bilibili.ship.theseus.cheese.biz.intro.attendance.DescContent (CheeseAttendanceComponent.kt:244)");
            }
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composerStartRestartGroup, 48);
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
            O4.d.c(companion, composerM2296constructorimpl, measurePolicyRowMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier.Companion companion2 = Modifier.Companion;
            Modifier modifierWeight = rowScopeInstance.weight(companion2, 1.0f, false);
            String str = hVar.f89310b;
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i11 = BiliTheme.$stable;
            TextKt.m1772Text4IGK_g(str, modifierWeight, d(cheeseAttendanceTheme), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m3827getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, biliTheme.getTextStyle(composerStartRestartGroup, i11).getT11(), composerStartRestartGroup, 0, 3120, 55288);
            float f7 = 5;
            J.a(f7, 6, composerStartRestartGroup, companion2);
            TextKt.m1772Text4IGK_g("·", (Modifier) null, d(cheeseAttendanceTheme), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, biliTheme.getTextStyle(composerStartRestartGroup, i11).getT11(), composerStartRestartGroup, 6, 0, 65530);
            J.a(f7, 6, composerStartRestartGroup, companion2);
            TextKt.m1772Text4IGK_g(hVar.f89311c, (Modifier) null, d(cheeseAttendanceTheme), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, biliTheme.getTextStyle(composerStartRestartGroup, i11).getT11(), composerStartRestartGroup, 0, 0, 65530);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(modifier, hVar, cheeseAttendanceTheme, i7) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.attendance.f

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Modifier f89304a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final h f89305b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final CheeseAttendanceTheme f89306c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final int f89307d;

                {
                    this.f89304a = modifier;
                    this.f89305b = hVar;
                    this.f89306c = cheeseAttendanceTheme;
                    this.f89307d = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f89307d | 1);
                    g.c(this.f89304a, this.f89305b, this.f89306c, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public static final long d(CheeseAttendanceTheme cheeseAttendanceTheme) {
        return Color.m2628copywmQWz5c$default(e(cheeseAttendanceTheme), 0.6f, 0.0f, 0.0f, 0.0f, 14, null);
    }

    public static final long e(CheeseAttendanceTheme cheeseAttendanceTheme) {
        return cheeseAttendanceTheme == CheeseAttendanceTheme.LIGHT ? Color.Companion.m2655getBlack0d7_KjU() : Color.Companion.m2666getWhite0d7_KjU();
    }
}
