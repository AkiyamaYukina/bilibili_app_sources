package com.bilibili.ship.theseus.playlist.uicomponent;

import android.content.Context;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/s.class */
public final class s {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(@NotNull final Modifier modifier, @NotNull final t tVar, @NotNull final Context context, @NotNull final Function0<Unit> function0, @NotNull final Function0<Unit> function02, @NotNull final Function0<Unit> function03, @NotNull final Function0<Unit> function04, @Nullable Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1075883144);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(tVar) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changedInstance(context) ? 256 : 128);
        }
        int i11 = i10;
        if ((i7 & 3072) == 0) {
            i11 = i10 | (composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024);
        }
        if ((i7 & 24576) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
        }
        int i12 = i11;
        if ((196608 & i7) == 0) {
            i12 = i11 | (composerStartRestartGroup.changedInstance(function03) ? 131072 : 65536);
        }
        int i13 = i12;
        if ((1572864 & i7) == 0) {
            i13 = i12 | (composerStartRestartGroup.changedInstance(function04) ? 1048576 : 524288);
        }
        if (composerStartRestartGroup.shouldExecute((599187 & i13) != 599186, i13 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1075883144, i13, -1, "com.bilibili.ship.theseus.playlist.uicomponent.PlaylistMorePopupUi (PlaylistMorePopupUIComponent.kt:65)");
            }
            BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(1326989504, true, new Function2(modifier, function04, tVar, function0, function02, function03, context) { // from class: com.bilibili.ship.theseus.playlist.uicomponent.p

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Modifier f96073a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Function0 f96074b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final t f96075c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Function0 f96076d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final Function0 f96077e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final Function0 f96078f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final Context f96079g;

                {
                    this.f96073a = modifier;
                    this.f96074b = function04;
                    this.f96075c = tVar;
                    this.f96076d = function0;
                    this.f96077e = function02;
                    this.f96078f = function03;
                    this.f96079g = context;
                }

                /* JADX WARN: Removed duplicated region for block: B:100:0x08d8  */
                /* JADX WARN: Removed duplicated region for block: B:18:0x00cc  */
                /* JADX WARN: Removed duplicated region for block: B:43:0x02cc  */
                /* JADX WARN: Removed duplicated region for block: B:59:0x04c1  */
                /* JADX WARN: Removed duplicated region for block: B:75:0x06c4  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invoke(java.lang.Object r54, java.lang.Object r55) {
                    /*
                        Method dump skipped, instruction units count: 2453
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.playlist.uicomponent.p.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(modifier, tVar, context, function0, function02, function03, function04, i7) { // from class: com.bilibili.ship.theseus.playlist.uicomponent.q

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Modifier f96080a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final t f96081b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Context f96082c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Function0 f96083d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final Function0 f96084e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final Function0 f96085f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final Function0 f96086g;
                public final int h;

                {
                    this.f96080a = modifier;
                    this.f96081b = tVar;
                    this.f96082c = context;
                    this.f96083d = function0;
                    this.f96084e = function02;
                    this.f96085f = function03;
                    this.f96086g = function04;
                    this.h = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.h | 1);
                    s.a(this.f96080a, this.f96081b, this.f96082c, this.f96083d, this.f96084e, this.f96085f, this.f96086g, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
