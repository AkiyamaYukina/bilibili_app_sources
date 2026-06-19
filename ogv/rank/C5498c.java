package com.bilibili.ogv.rank;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ol0.C8228b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.bilibili.ogv.rank.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/c.class */
public final class C5498c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f71958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f71959b = ComposableLambdaKt.composableLambdaInstance(350971413, false, new Object());

    static {
        final int i7 = 0;
        f71958a = ComposableLambdaKt.composableLambdaInstance(-1080008929, false, new Function2(i7) { // from class: com.bilibili.ogv.rank.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f71906a;

            {
                this.f71906a = i7;
            }

            public final Object invoke(Object obj, Object obj2) {
                int i8 = this.f71906a;
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                switch (i8) {
                    case 0:
                        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1080008929, iIntValue, -1, "com.bilibili.ogv.rank.ComposableSingletons$PageReadyUiKt.lambda$-1080008929.<anonymous> (PageReadyUi.kt:132)");
                            }
                            C8228b.a(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), composer, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer.skipToGroupEnd();
                        }
                        return Unit.INSTANCE;
                    case 1:
                        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-956604182, iIntValue, -1, "com.bilibili.vip.cashier2.ComposableSingletons$NonExpandableContainerUIServiceKt.lambda$-956604182.<anonymous> (NonExpandableContainerUIService.kt:110)");
                            }
                            com.bilibili.vip.cashier2.v.a(WindowInsetsPadding_androidKt.statusBarsPadding(Modifier.Companion), composer, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer.skipToGroupEnd();
                        }
                        return Unit.INSTANCE;
                    default:
                        composer.startReplaceGroup(737922617);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(737922617, iIntValue, -1, "im.keywordBlocking.KeywordItemMenu.<anonymous> (ItemMenu.kt:67)");
                        }
                        WindowInsets windowInsetsWindowInsets$default = WindowInsetsKt.WindowInsets$default(0, 0, 0, 0, 14, null);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer.endReplaceGroup();
                        return windowInsetsWindowInsets$default;
                }
            }
        });
    }
}
