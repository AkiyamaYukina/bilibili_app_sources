package com.bilibili.ogv.rank.part;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import kntr.common.komponent.KomponentHostScope;
import kntr.common.komponent.UiComposableLike;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/part/q.class */
@StabilityInferred(parameters = 1)
public final class q implements UiComposableLike<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UiComposableLike<Object> f72115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final KomponentHostScope f72116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C5512a f72117c;

    public q(@NotNull UiComposableLike uiComposableLike, @NotNull KomponentHostScope komponentHostScope, @NotNull C5512a c5512a) {
        this.f72115a = uiComposableLike;
        this.f72116b = komponentHostScope;
        this.f72117c = c5512a;
    }

    @Nullable
    public final Object getContentType() {
        return this.f72115a.getContentType();
    }

    @NotNull
    public final Object getKey() {
        return this.f72115a.getKey();
    }

    @Nullable
    public final Object getState() {
        return this.f72115a.getState();
    }

    @Composable
    public final void invoke(@NotNull final Modifier modifier, @Nullable Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-385357289);
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
                ComposerKt.traceEventStart(-385357289, i9, -1, "com.bilibili.ogv.rank.part.ItemEntry.invoke (PartReadyUiService.kt:0)");
            }
            this.f72115a.invoke(modifier, composerStartRestartGroup, i9 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(this, modifier, i7) { // from class: com.bilibili.ogv.rank.part.p

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final q f72112a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Modifier f72113b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f72114c;

                {
                    this.f72112a = this;
                    this.f72113b = modifier;
                    this.f72114c = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f72114c | 1);
                    this.f72112a.invoke(this.f72113b, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
