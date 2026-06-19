package com.bilibili.pegasus.recommendlabel;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.pegasus.recommendlabel.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/f.class */
public final class C5737f {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(@NotNull final f0 f0Var, @NotNull final Function0<Unit> function0, @NotNull final Function0<Unit> function02, @Nullable Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(591236326);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(f0Var) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(function0) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changedInstance(function02) ? 256 : 128);
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 147) != 146, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(591236326, i10, -1, "com.bilibili.pegasus.recommendlabel.RollbackDialog (DialogCompose.kt:27)");
            }
            BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(-86454626, true, new Function2(f0Var, function0, function02) { // from class: com.bilibili.pegasus.recommendlabel.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Function0 f78687a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final f0 f78688b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Function0 f78689c;

                {
                    this.f78687a = function0;
                    this.f78688b = f0Var;
                    this.f78689c = function02;
                }

                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-86454626, iIntValue, -1, "com.bilibili.pegasus.recommendlabel.RollbackDialog.<anonymous> (DialogCompose.kt:29)");
                        }
                        final Function0 function03 = this.f78689c;
                        final f0 f0Var2 = this.f78688b;
                        final Function0 function04 = this.f78687a;
                        AndroidDialog_androidKt.Dialog(function04, null, ComposableLambdaKt.rememberComposableLambda(515219367, true, new Function2(f0Var2, function04, function03) { // from class: com.bilibili.pegasus.recommendlabel.e

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final f0 f78701a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final Function0 f78702b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final Function0 f78703c;

                            {
                                this.f78701a = f0Var2;
                                this.f78702b = function04;
                                this.f78703c = function03;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:40:0x027f  */
                            /* JADX WARN: Removed duplicated region for block: B:49:0x02e9  */
                            /* JADX WARN: Removed duplicated region for block: B:52:0x038d  */
                            /* JADX WARN: Removed duplicated region for block: B:55:0x03a1  */
                            /* JADX WARN: Removed duplicated region for block: B:56:0x03ad  */
                            /* JADX WARN: Removed duplicated region for block: B:59:0x045a  */
                            /* JADX WARN: Removed duplicated region for block: B:62:0x046e  */
                            /* JADX WARN: Removed duplicated region for block: B:63:0x047a  */
                            /* JADX WARN: Removed duplicated region for block: B:66:0x04ae  */
                            /* JADX WARN: Removed duplicated region for block: B:72:0x04c7  */
                            /* JADX WARN: Removed duplicated region for block: B:75:0x0572  */
                            /* JADX WARN: Removed duplicated region for block: B:78:0x0586  */
                            /* JADX WARN: Removed duplicated region for block: B:79:0x0592  */
                            /* JADX WARN: Removed duplicated region for block: B:82:0x05c5  */
                            /* JADX WARN: Removed duplicated region for block: B:88:0x05de  */
                            /* JADX WARN: Removed duplicated region for block: B:91:0x061f  */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            public final java.lang.Object invoke(java.lang.Object r27, java.lang.Object r28) {
                                /*
                                    Method dump skipped, instruction units count: 1584
                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.recommendlabel.C5736e.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                            }
                        }, composer2, 54), composer2, 384, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(f0Var, function0, function02, i7) { // from class: com.bilibili.pegasus.recommendlabel.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final f0 f78692a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Function0 f78693b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Function0 f78694c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final int f78695d;

                {
                    this.f78692a = f0Var;
                    this.f78693b = function0;
                    this.f78694c = function02;
                    this.f78695d = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f78695d | 1);
                    C5737f.a(this.f78692a, this.f78693b, this.f78694c, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
