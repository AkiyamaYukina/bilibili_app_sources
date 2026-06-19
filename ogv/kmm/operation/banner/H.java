package com.bilibili.ogv.kmm.operation.banner;

import G3.J1;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import com.bilibili.compose.theme.BiliTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ol0.C8228b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.compose.resources.StringResource;
import org.jetbrains.compose.resources.StringResourcesKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/H.class */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f68027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f68028b = ComposableLambdaKt.composableLambdaInstance(952906992, false, new Object());

    static {
        final int i7 = 0;
        f68027a = ComposableLambdaKt.composableLambdaInstance(-1843915738, false, new Function2(i7) { // from class: com.bilibili.ogv.kmm.operation.banner.F

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f68026a;

            {
                this.f68026a = i7;
            }

            public final Object invoke(Object obj, Object obj2) {
                switch (this.f68026a) {
                    case 0:
                        Composer composer = (Composer) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1843915738, iIntValue, -1, "com.bilibili.ogv.kmm.operation.banner.ComposableSingletons$BannerUiKt.lambda$-1843915738.<anonymous> (BannerUi.kt:114)");
                            }
                            C8228b.a(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), composer, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer.skipToGroupEnd();
                        }
                        break;
                    default:
                        Composer composer2 = (Composer) obj;
                        int iIntValue2 = ((Integer) obj2).intValue();
                        if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1147735559, iIntValue2, -1, "kntr.app.article.publish.ui.component.dialog.ComposableSingletons$ExitConfirmDialogKt.lambda$1147735559.<anonymous> (ExitConfirmDialog.kt:42)");
                            }
                            String strStringResource = StringResourcesKt.stringResource((StringResource) J1.f6810z.getValue(), composer2, 0);
                            BiliTheme biliTheme = BiliTheme.INSTANCE;
                            int i8 = BiliTheme.$stable;
                            TextKt.m2186TextNvy7gAk(strStringResource, PaddingKt.m1343paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Dp.m3880constructorimpl(20), Dp.m3880constructorimpl(24)), biliTheme.getColors(composer2, i8).getText1-0d7_KjU(), null, 0L, null, null, null, 0L, null, TextAlign.m3787boximpl(TextAlign.Companion.m3794getCentere0LSkKk()), 0L, 0, false, 0, 0, null, biliTheme.getTextStyle(composer2, i8).getT16b(), composer2, 0, 0, 130040);
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
