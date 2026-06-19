package com.bilibili.ogv.secondary;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.search2.api.SearchBangumiItem;
import dagger.hilt.EntryPoints;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/G.class */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final D f72606a = ((E) EntryPoints.get(FoundationAlias.getFapp(), E.class)).q();

    @Composable
    public static final void a(@NotNull final H h, @Nullable final Modifier modifier, @Nullable Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-640600852);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(h) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(modifier) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-640600852, i9, -1, "com.bilibili.ogv.secondary.SecondaryOperationWeb (SecondaryOperationWebComponent.android.kt:25)");
            }
            f72606a.a(h, modifier, composerStartRestartGroup, i9 & SearchBangumiItem.TYPE_FULLNET_MOVIE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(h, modifier, i7) { // from class: com.bilibili.ogv.secondary.F

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final H f72603a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Modifier f72604b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f72605c;

                {
                    this.f72603a = h;
                    this.f72604b = modifier;
                    this.f72605c = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f72605c | 1);
                    G.a(this.f72603a, this.f72604b, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
