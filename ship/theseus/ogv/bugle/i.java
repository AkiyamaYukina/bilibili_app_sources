package com.bilibili.ship.theseus.ogv.bugle;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.IconKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import com.bilibili.compose.iconfont.BiliIconfont;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/bugle/i.class */
public final class i {
    /* JADX WARN: Removed duplicated region for block: B:60:0x019d  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final com.bilibili.ship.theseus.ogv.bugle.a r26, final boolean r27, androidx.compose.runtime.Composer r28, final int r29) {
        /*
            Method dump skipped, instruction units count: 984
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.bugle.i.a(com.bilibili.ship.theseus.ogv.bugle.a, boolean, androidx.compose.runtime.Composer, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void b(final float f7, final int i7, final long j7, Composer composer) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(1702293500);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(f7) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(j7) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1702293500, i9, -1, "com.bilibili.ship.theseus.ogv.bugle.LeftIconUi (PlayerBugleFunctionWidget.kt:307)");
            }
            IconKt.m1714Iconww6aTOc(BiliIconfont.INSTANCE.getLoudspeaker_promote_line_500(composerStartRestartGroup, 6), (String) null, SizeKt.m1372size3ABfNKs(Modifier.Companion, f7), j7, composerStartRestartGroup, Painter.$stable | 48 | ((i9 << 6) & 7168), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(f7, j7, i7) { // from class: com.bilibili.ship.theseus.ogv.bugle.h

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final float f91653a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final long f91654b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f91655c;

                {
                    this.f91653a = f7;
                    this.f91654b = j7;
                    this.f91655c = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f91655c | 1);
                    i.b(this.f91653a, iUpdateChangedFlags, this.f91654b, (Composer) obj);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
