package com.bilibili.pegasus.components.windowpane;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.bilibili.compose.theme.BiliTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/windowpane/b.class */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f77232a;

    static {
        final int i7 = 0;
        f77232a = ComposableLambdaKt.composableLambdaInstance(-871586102, false, new Function3(i7) { // from class: com.bilibili.pegasus.components.windowpane.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f77231a;

            {
                this.f77231a = i7;
            }

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                switch (this.f77231a) {
                    case 0:
                        Composer composer = (Composer) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-871586102, iIntValue, -1, "com.bilibili.pegasus.components.windowpane.ComposableSingletons$PegasusStyleDialogFragmentKt.lambda$-871586102.<anonymous> (PegasusStyleDialogFragment.kt:104)");
                            }
                            String strStringResource = StringResources_androidKt.stringResource(2131841539, composer, 0);
                            BiliTheme biliTheme = BiliTheme.INSTANCE;
                            int i8 = BiliTheme.$stable;
                            TextKt.m1772Text4IGK_g(strStringResource, (Modifier) null, biliTheme.getColors(composer, i8).getText_white-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, biliTheme.getTextStyle(composer, i8).getT14(), composer, 0, 0, 65530);
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
                                ComposerKt.traceEventStart(-596992692, iIntValue2, -1, "com.bilibili.video.story.space.ComposableSingletons$StoryRelatedVideoDialogFragmentKt.lambda$-596992692.<anonymous> (StoryRelatedVideoDialogFragment.kt:242)");
                            }
                            String strStringResource2 = StringResources_androidKt.stringResource(2131841701, composer2, 0);
                            BiliTheme biliTheme2 = BiliTheme.INSTANCE;
                            int i9 = BiliTheme.$stable;
                            TextStyle t12 = biliTheme2.getTextStyle(composer2, i9).getT12();
                            float f7 = 8;
                            TextKt.m1772Text4IGK_g(strStringResource2, SizeKt.fillMaxWidth$default(PaddingKt.m1346paddingqDBjuR0$default(Modifier.Companion, 0.0f, Dp.m3880constructorimpl(f7), 0.0f, Dp.m3880constructorimpl(f7), 5, null), 0.0f, 1, null), biliTheme2.getColors(composer2, i9).getText3-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3787boximpl(TextAlign.Companion.m3794getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, t12, composer2, 48, 0, 65016);
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
