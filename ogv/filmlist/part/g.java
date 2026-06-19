package com.bilibili.ogv.filmlist.part;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import kntr.common.komponent.UiComposableLike;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/part/g.class */
@StabilityInferred(parameters = 1)
public final class g implements UiComposableLike<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UiComposableLike<Object> f67775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final a f67776b;

    public g(@NotNull UiComposableLike uiComposableLike, @NotNull a aVar) {
        this.f67775a = uiComposableLike;
        this.f67776b = aVar;
    }

    @Nullable
    public final Object getContentType() {
        return this.f67775a.getContentType();
    }

    @NotNull
    public final Object getKey() {
        return this.f67775a.getKey();
    }

    @Nullable
    public final Object getState() {
        return this.f67775a.getState();
    }

    @Composable
    public final void invoke(@NotNull Modifier modifier, @Nullable Composer composer, int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-439904755);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(this) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-439904755, i9, -1, "com.bilibili.ogv.filmlist.part.ItemEntry.invoke (PartReadyUiService.kt:0)");
            }
            this.f67775a.invoke(modifier, composerStartRestartGroup, i9 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new f(i7, 0, this, modifier));
        }
    }
}
