package com.bilibili.biligame.booktri.benefit;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/booktri/benefit/j0.class */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f62423a;

    static {
        final int i7 = 0;
        f62423a = ComposableLambdaKt.composableLambdaInstance(-438523968, false, new Function2(i7) { // from class: com.bilibili.biligame.booktri.benefit.i0

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f62413a;

            {
                this.f62413a = i7;
            }

            public final Object invoke(Object obj, Object obj2) {
                int i8 = this.f62413a;
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                switch (i8) {
                    case 0:
                        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-438523968, iIntValue, -1, "com.bilibili.biligame.booktri.benefit.ComposableSingletons$BookTriBenefitCaptchaDialogKt.lambda$-438523968.<anonymous> (BookTriBenefitCaptchaDialog.kt:554)");
                            }
                            if (C.a(64, 6, composer, Modifier.Companion)) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer.skipToGroupEnd();
                        }
                        break;
                    default:
                        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1664412450, iIntValue, -1, "kntr.app.mall.mallDynamicPage.component.business.ComposableSingletons$FeedsComponentKt.lambda$-1664412450.<anonymous> (FeedsComponent.kt:187)");
                            }
                            kntr.app.mall.mallDynamicPage.component.business.n.a(composer, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer.skipToGroupEnd();
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        });
    }
}
