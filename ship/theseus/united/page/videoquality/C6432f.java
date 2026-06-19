package com.bilibili.ship.theseus.united.page.videoquality;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videoquality.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/f.class */
public final class C6432f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f103865a = ComposableLambdaKt.composableLambdaInstance(-659000740, false, new Object());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f103866b = ComposableLambdaKt.composableLambdaInstance(114952057, false, new Object());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f103867c;

    static {
        final int i7 = 0;
        f103867c = ComposableLambdaKt.composableLambdaInstance(498531550, false, new Function3(i7) { // from class: com.bilibili.ship.theseus.united.page.videoquality.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f103860a;

            {
                this.f103860a = i7;
            }

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                switch (this.f103860a) {
                    case 0:
                        Modifier modifier = (Modifier) obj;
                        Composer composer = (Composer) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        int i8 = iIntValue;
                        if ((iIntValue & 6) == 0) {
                            i8 = iIntValue | (composer.changed(modifier) ? 4 : 2);
                        }
                        if (composer.shouldExecute((i8 & 19) != 18, i8 & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(498531550, i8, -1, "com.bilibili.ship.theseus.united.page.videoquality.ComposableSingletons$QualityListPanelKt.lambda$498531550.<anonymous> (QualityListPanel.kt:410)");
                            }
                            com.bilibili.playerbizcommonv2.widget.quality.h0.e(StringResources_androidKt.stringResource(2131841552, composer, 0), modifier, null, null, composer, (i8 << 3) & 112, 12);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer.skipToGroupEnd();
                        }
                        break;
                    default:
                        Composer composer2 = (Composer) obj2;
                        int iIntValue2 = ((Integer) obj3).intValue();
                        if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(509583128, iIntValue2, -1, "com.mall.ui.page.feeds.widget.ComposableSingletons$MallStoryFeedbackCardKt.lambda$509583128.<anonymous> (MallStoryFeedbackCard.kt:117)");
                            }
                            BoxKt.Box(SizeKt.m1358height3ABfNKs(Modifier.Companion, Dp.m3880constructorimpl(34)), composer2, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer2.skipToGroupEnd();
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        });
    }
}
