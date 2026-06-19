package com.bilibili.ogv.secondary.part;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import im.session.common.IMSessionPageKt;
import im.session.common.IMSessionPageStateKt;
import kntr.common.komponent.KomponentHostScope;
import kntr.common.komponent.UiComposableLike;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/y.class */
@StabilityInferred(parameters = 1)
public final class y implements UiComposableLike<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UiComposableLike<Object> f72917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final KomponentHostScope f72918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final InterfaceC5533c f72919c;

    public y(@NotNull UiComposableLike<? extends Object> uiComposableLike, @NotNull KomponentHostScope komponentHostScope, @NotNull InterfaceC5533c interfaceC5533c) {
        this.f72917a = uiComposableLike;
        this.f72918b = komponentHostScope;
        this.f72919c = interfaceC5533c;
    }

    @Nullable
    public final Object getContentType() {
        return this.f72917a.getContentType();
    }

    @NotNull
    public final Object getKey() {
        return this.f72917a.getKey();
    }

    @Nullable
    public final Object getState() {
        return this.f72917a.getState();
    }

    @Composable
    public final void invoke(@NotNull final Modifier modifier, @Nullable Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(902119823);
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
                ComposerKt.traceEventStart(902119823, i9, -1, "com.bilibili.ogv.secondary.part.ItemEntry.invoke (PartReadyUiService.kt:0)");
            }
            this.f72917a.invoke(modifier, composerStartRestartGroup, i9 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i10 = 0;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(i7, i10, this, modifier) { // from class: com.bilibili.ogv.secondary.part.x

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f72913a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f72914b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Object f72915c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Object f72916d;

                {
                    this.f72913a = i10;
                    this.f72915c = this;
                    this.f72916d = modifier;
                    this.f72914b = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    Integer num = (Integer) obj2;
                    switch (this.f72913a) {
                        case 0:
                            num.intValue();
                            ((y) this.f72915c).invoke((Modifier) this.f72916d, composer2, RecomposeScopeImplKt.updateChangedFlags(this.f72914b | 1));
                            break;
                        default:
                            num.getClass();
                            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f72914b | 1);
                            IMSessionPageKt.b((im.session.model.h) this.f72915c, (IMSessionPageStateKt.a) this.f72916d, composer2, iUpdateChangedFlags);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
