package com.bilibili.ship.theseus.cheese.pay.purchase.guide;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.bililive.room.ui.roomv3.ranks.i;
import com.bilibili.bplus.followinglist.module.item.draw.pro.v;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/pay/purchase/guide/b.class */
@StabilityInferred(parameters = 1)
public final class b implements UIComponent<UIComponent.b<ComposeView>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f90538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final c f90539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final d f90540c;

    public b(@NotNull String str, @NotNull c cVar, @NotNull d dVar) {
        this.f90538a = str;
        this.f90539b = cVar;
        this.f90540c = dVar;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void a(Composer composer, int i7, final String str) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1931663992);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(this) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1931663992, i9, -1, "com.bilibili.ship.theseus.cheese.pay.purchase.guide.CheesePurchaseGuideComponent.Content (CheesePurchaseGuideComponent.kt:41)");
            }
            BiliThemeKt.BiliTheme(ThemeStrategy.ForceDay, false, ComposableLambdaKt.rememberComposableLambda(-1875037888, true, new Function2(str, this) { // from class: com.bilibili.ship.theseus.cheese.pay.purchase.guide.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f90536a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final b f90537b;

                {
                    this.f90536a = str;
                    this.f90537b = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:29:0x0231  */
                /* JADX WARN: Removed duplicated region for block: B:41:0x0456  */
                /* JADX WARN: Removed duplicated region for block: B:46:0x04f9  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invoke(java.lang.Object r27, java.lang.Object r28) {
                    /*
                        Method dump skipped, instruction units count: 1347
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.pay.purchase.guide.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 390, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new v(i7, 1, this, str));
        }
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        ((ComposeView) ((UIComponent.b) viewEntry).a).setContent(ComposableLambdaKt.composableLambdaInstance(-674204113, true, new i(this, 1)));
        return Unit.INSTANCE;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        return new UIComponent.b(new ComposeView(context, null, 0, 6, null));
    }
}
