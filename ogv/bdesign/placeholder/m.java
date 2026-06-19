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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/bdesign/placeholder/m.class */
public final class m {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(@Nullable final Modifier modifier, @Nullable Painter painter, @Nullable String str, @Nullable String str2, @Nullable Composer composer, final int i7) {
        int i8;
        Painter painter2;
        String str3;
        String str4;
        int i9;
        Composer composerStartRestartGroup = composer.startRestartGroup(-764915854);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i10 = i8;
        if ((i7 & 48) == 0) {
            i10 = i8 | 16;
        }
        int i11 = i10 | 384;
        if ((i7 & 3072) == 0) {
            i11 = i10 | 1408;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 1171) != 1170, i11 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i7 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                painter = ImageResourcesKt.painterResource((DrawableResource) Sa1.a.d.getValue(), composerStartRestartGroup, 0);
                str2 = StringResourcesKt.stringResource((StringResource) O3.a.f17697J.getValue(), composerStartRestartGroup, 0);
                i9 = i11 & (-7281);
                str = "";
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                i9 = i11 & (-7281);
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-764915854, i9, -1, "com.bilibili.ogv.bdesign.placeholder.NetworkErrorPlaceholder (NetworkErrorPlaceholder.kt:37)");
            }
            o.a(painter, str, str2, null, modifier, composerStartRestartGroup, Painter.$stable | 3072 | ((i9 >> 3) & 112) | ((i9 << 12) & 57344));
            painter2 = painter;
            str3 = str;
            str4 = str2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                str4 = str2;
                str3 = str;
                painter2 = painter;
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            painter2 = painter;
            str3 = str;
            str4 = str2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Painter painter3 = painter2;
            final String str5 = str3;
            final String str6 = str4;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(modifier, painter3, str5, str6, i7) { // from class: com.bilibili.ogv.bdesign.placeholder.l

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Modifier f67411a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Painter f67412b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final String f67413c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final String f67414d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final int f67415e;

                {
                    this.f67411a = modifier;
                    this.f67412b = painter3;
                    this.f67413c = str5;
                    this.f67414d = str6;
                    this.f67415e = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f67415e | 1);
                    String str7 = this.f67413c;
                    String str8 = this.f67414d;
                    m.a(this.f67411a, this.f67412b, str7, str8, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void b(@NotNull final Function0<Unit> function0, @Nullable Modifier modifier, @Nullable Painter painter, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Composer composer, final int i7, final int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        Painter painterPainterResource;
        int i13;
        String str4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1185625963);
        if ((i7 & 6) == 0) {
            i9 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i7;
        } else {
            i9 = i7;
        }
        int i14 = i8 & 2;
        if (i14 != 0) {
            i10 = i9 | 48;
        } else {
            i10 = i9;
            if ((i7 & 48) == 0) {
                i10 = i9 | (composerStartRestartGroup.changed(modifier) ? 32 : 16);
            }
        }
        int i15 = i10;
        if ((i7 & 384) == 0) {
            i15 = i10 | 128;
        }
        int i16 = i15 | 3072;
        if ((i7 & 24576) == 0) {
            i11 = i16 | (((i8 & 16) == 0 && composerStartRestartGroup.changed(str2)) ? 16384 : 8192);
        } else {
            i11 = i16;
        }
        if ((196608 & i7) == 0) {
            i12 = i11 | (((i8 & 32) == 0 && composerStartRestartGroup.changed(str3)) ? 131072 : 65536);
        } else {
            i12 = i11;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i12) != 74898, i12 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i7 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i14 != 0) {
                    modifier = Modifier.Companion;
                }
                painterPainterResource = ImageResourcesKt.painterResource((DrawableResource) Sa1.a.d.getValue(), composerStartRestartGroup, 0);
                i13 = i12 & (-897);
                if ((i8 & 16) != 0) {
                    str2 = StringResourcesKt.stringResource((StringResource) O3.a.f17697J.getValue(), composerStartRestartGroup, 0);
                    i13 = i12 & (-58241);
                }
                if ((i8 & 32) != 0) {
                    str3 = StringResourcesKt.stringResource((StringResource) O3.a.f17702a.getValue(), composerStartRestartGroup, 0);
                    i13 &= -458753;
                }
                str4 = "";
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                int i17 = i12 & (-897);
                if ((i8 & 16) != 0) {
                    i17 = i12 & (-58241);
                }
                int i18 = i17;
                if ((i8 & 32) != 0) {
                    i18 = i17 & (-458753);
                }
                i13 = i18;
                str4 = str;
                painterPainterResource = painter;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1185625963, i13, -1, "com.bilibili.ogv.bdesign.placeholder.NetworkErrorPlaceholder (NetworkErrorPlaceholder.kt:21)");
            }
            int i19 = i13 >> 6;
            o.a(painterPainterResource, str4, str2, new p(str3, function0), modifier, composerStartRestartGroup, Painter.$stable | (i19 & 112) | (i19 & 896) | ((i13 << 9) & 57344));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            String str5 = str4;
            painter = painterPainterResource;
            str = str5;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = modifier;
            final Painter painter2 = painter;
            final String str6 = str;
            final String str7 = str2;
            final String str8 = str3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(function0, modifier2, painter2, str6, str7, str8, i7, i8) { // from class: com.bilibili.ogv.bdesign.placeholder.k

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Function0 f67404a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Modifier f67405b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Painter f67406c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final String f67407d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final String f67408e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final String f67409f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final int f67410g;
                public final int h;

                {
                    this.f67404a = function0;
                    this.f67405b = modifier2;
                    this.f67406c = painter2;
                    this.f67407d = str6;
                    this.f67408e = str7;
                    this.f67409f = str8;
                    this.f67410g = i7;
                    this.h = i8;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f67410g | 1);
                    String str9 = this.f67409f;
                    int i20 = this.h;
                    m.b(this.f67404a, this.f67405b, this.f67406c, this.f67407d, this.f67408e, str9, (Composer) obj, iUpdateChangedFlags, i20);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
