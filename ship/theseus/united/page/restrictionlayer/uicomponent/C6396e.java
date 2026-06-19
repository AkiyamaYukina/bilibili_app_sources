package com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/uicomponent/e.class */
public final class C6396e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f102850a = ComposableLambdaKt.composableLambdaInstance(337220694, false, new Object());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f102851b;

    static {
        final int i7 = 0;
        f102851b = ComposableLambdaKt.composableLambdaInstance(545310762, false, new Function2(i7) { // from class: com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f102847a;

            {
                this.f102847a = i7;
            }

            public final Object invoke(Object obj, Object obj2) {
                int i8 = this.f102847a;
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                switch (i8) {
                    case 0:
                        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(545310762, iIntValue, -1, "com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.ComposableSingletons$RestrictionPlaylistUIComponentKt.lambda$545310762.<anonymous> (RestrictionPlaylistUIComponent.kt:253)");
                            }
                            SpacerKt.Spacer(SizeKt.m1377width3ABfNKs(Modifier.Companion, Dp.m3880constructorimpl(12)), composer, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer.skipToGroupEnd();
                        }
                        return Unit.INSTANCE;
                    default:
                        composer.startReplaceGroup(1191121904);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1191121904, iIntValue, -1, "kntr.app.game.gamebind.ui.manager.GameManagerContent.<anonymous> (GameManagerPage.kt:647)");
                        }
                        WindowInsets WindowInsets = WindowInsetsKt.WindowInsets(0, 0, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer.endReplaceGroup();
                        return WindowInsets;
                }
            }
        });
    }
}
