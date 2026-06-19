package com.bilibili.ogv.bdesign.placeholder;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.compose.resources.DrawableResource;
import org.jetbrains.compose.resources.ImageResourcesKt;
import org.jetbrains.compose.resources.StringResource;
import org.jetbrains.compose.resources.StringResourcesKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/bdesign/placeholder/e.class */
public final class e {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(@NotNull final Function0<Unit> function0, @Nullable Modifier modifier, @Nullable Painter painter, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Composer composer, final int i7, final int i8) {
        int i9;
        int i10;
        String str4;
        String str5;
        String str6;
        Painter painter2;
        Modifier modifier2;
        Modifier modifier3;
        Painter painterPainterResource;
        String strStringResource;
        String strStringResource2;
        String str7;
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-601695169);
        if ((i7 & 6) == 0) {
            i9 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i7;
        } else {
            i9 = i7;
        }
        int i12 = i8 & 2;
        if (i12 != 0) {
            i10 = i9 | 48;
        } else {
            i10 = i9;
            if ((i7 & 48) == 0) {
                i10 = i9 | (composerStartRestartGroup.changed(modifier) ? 32 : 16);
            }
        }
        int i13 = i10;
        if ((i7 & 384) == 0) {
            i13 = i10 | 128;
        }
        int i14 = i13 | 3072;
        if ((i7 & 24576) == 0) {
            i14 = i13 | 11264;
        }
        int i15 = i14;
        if ((196608 & i7) == 0) {
            i15 = i14 | 65536;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i15) != 74898, i15 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i7 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                modifier3 = i12 != 0 ? Modifier.Companion : modifier;
                painterPainterResource = ImageResourcesKt.painterResource((DrawableResource) Sa1.a.e.getValue(), composerStartRestartGroup, 0);
                strStringResource = StringResourcesKt.stringResource((StringResource) O3.a.f17716p.getValue(), composerStartRestartGroup, 0);
                strStringResource2 = StringResourcesKt.stringResource((StringResource) O3.a.f17702a.getValue(), composerStartRestartGroup, 0);
                str7 = "";
                i11 = i15 & (-516993);
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                i11 = i15 & (-516993);
                str7 = str;
                modifier3 = modifier;
                painterPainterResource = painter;
                strStringResource = str2;
                strStringResource2 = str3;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-601695169, i11, -1, "com.bilibili.ogv.bdesign.placeholder.LoadFailurePlaceholder (LoadFailurePlaceholder.kt:21)");
            }
            o.a(painterPainterResource, str7, strStringResource, new p(strStringResource2, function0), modifier3, composerStartRestartGroup, Painter.$stable | ((i11 >> 6) & 112) | ((i11 << 9) & 57344));
            modifier2 = modifier3;
            painter2 = painterPainterResource;
            str6 = str7;
            str5 = strStringResource;
            str4 = strStringResource2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                modifier2 = modifier3;
                painter2 = painterPainterResource;
                str6 = str7;
                str5 = strStringResource;
                str4 = strStringResource2;
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            str4 = str3;
            str5 = str2;
            str6 = str;
            painter2 = painter;
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier4 = modifier2;
            final Painter painter3 = painter2;
            final String str8 = str6;
            final String str9 = str5;
            final String str10 = str4;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(function0, modifier4, painter3, str8, str9, str10, i7, i8) { // from class: com.bilibili.ogv.bdesign.placeholder.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Function0 f67391a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Modifier f67392b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Painter f67393c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final String f67394d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final String f67395e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final String f67396f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final int f67397g;
                public final int h;

                {
                    this.f67391a = function0;
                    this.f67392b = modifier4;
                    this.f67393c = painter3;
                    this.f67394d = str8;
                    this.f67395e = str9;
                    this.f67396f = str10;
                    this.f67397g = i7;
                    this.h = i8;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f67397g | 1);
                    String str11 = this.f67396f;
                    int i16 = this.h;
                    e.a(this.f67391a, this.f67392b, this.f67393c, this.f67394d, this.f67395e, str11, (Composer) obj, iUpdateChangedFlags, i16);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
