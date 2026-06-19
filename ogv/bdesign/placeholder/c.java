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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/bdesign/placeholder/c.class */
public final class c {
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01fd  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final int r10, final int r11, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r12, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r13, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.painter.Painter r14, @org.jetbrains.annotations.Nullable java.lang.String r15, @org.jetbrains.annotations.Nullable java.lang.String r16) {
        /*
            Method dump skipped, instruction units count: 574
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.bdesign.placeholder.c.a(int, int, androidx.compose.runtime.Composer, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.painter.Painter, java.lang.String, java.lang.String):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void b(@NotNull final Function0<Unit> function0, @Nullable Modifier modifier, @Nullable Painter painter, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Composer composer, final int i7, final int i8) {
        int i9;
        int i10;
        String str4;
        String str5;
        Modifier modifier2;
        String str6;
        Painter painter2;
        String strStringResource;
        int i11;
        String str7;
        Modifier modifier3;
        String str8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-779011055);
        if ((i7 & 6) == 0) {
            i9 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i7;
        } else {
            i9 = i7;
        }
        int i12 = i9 | 48;
        if ((i7 & 384) == 0) {
            i12 = i9 | 176;
        }
        int i13 = i12 | 3072;
        if ((i7 & 24576) == 0) {
            i10 = i13 | (((i8 & 16) == 0 && composerStartRestartGroup.changed(str2)) ? 16384 : 8192);
        } else {
            i10 = i13;
        }
        int i14 = i10;
        if ((196608 & i7) == 0) {
            i14 = i10 | 65536;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i14) != 74898, i14 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i7 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                Modifier.Companion companion = Modifier.Companion;
                painter = ImageResourcesKt.painterResource((DrawableResource) Sa1.a.c.getValue(), composerStartRestartGroup, 0);
                int i15 = i14 & (-897);
                if ((i8 & 16) != 0) {
                    str2 = StringResourcesKt.stringResource((StringResource) O3.a.h.getValue(), composerStartRestartGroup, 0);
                    i15 = i14 & (-58241);
                }
                strStringResource = StringResourcesKt.stringResource((StringResource) O3.a.f17702a.getValue(), composerStartRestartGroup, 0);
                i11 = i15 & (-458753);
                str7 = str2;
                modifier3 = companion;
                str8 = "";
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                int i16 = i14 & (-897);
                if ((i8 & 16) != 0) {
                    i16 = i14 & (-58241);
                }
                i11 = i16 & (-458753);
                str7 = str2;
                str8 = str;
                modifier3 = modifier;
                strStringResource = str3;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-779011055, i11, -1, "com.bilibili.ogv.bdesign.placeholder.EmptyPlaceholder (EmptyPlaceholder.kt:21)");
            }
            int i17 = i11 >> 6;
            o.a(painter, str8, str7, new p(strStringResource, function0), modifier3, composerStartRestartGroup, Painter.$stable | (i17 & 112) | (i17 & 896) | ((i11 << 9) & 57344));
            painter2 = painter;
            str6 = str8;
            modifier2 = modifier3;
            str5 = str7;
            str4 = strStringResource;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                painter2 = painter;
                str6 = str8;
                modifier2 = modifier3;
                str5 = str7;
                str4 = strStringResource;
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            str4 = str3;
            str5 = str2;
            modifier2 = modifier;
            str6 = str;
            painter2 = painter;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier4 = modifier2;
            final Painter painter3 = painter2;
            final String str9 = str6;
            final String str10 = str5;
            final String str11 = str4;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(function0, modifier4, painter3, str9, str10, str11, i7, i8) { // from class: com.bilibili.ogv.bdesign.placeholder.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Function0 f67378a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Modifier f67379b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Painter f67380c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final String f67381d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final String f67382e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final String f67383f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final int f67384g;
                public final int h;

                {
                    this.f67378a = function0;
                    this.f67379b = modifier4;
                    this.f67380c = painter3;
                    this.f67381d = str9;
                    this.f67382e = str10;
                    this.f67383f = str11;
                    this.f67384g = i7;
                    this.h = i8;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f67384g | 1);
                    String str12 = this.f67383f;
                    int i18 = this.h;
                    c.b(this.f67378a, this.f67379b, this.f67380c, this.f67381d, this.f67382e, str12, (Composer) obj, iUpdateChangedFlags, i18);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
