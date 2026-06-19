package com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.BindingAdapter;
import com.bilibili.compose.theme.BiliTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/uicomponent/b.class */
public final class C6393b {
    @BindingAdapter({"operationButton"})
    public static final void a(@NotNull ComposeView composeView, @Nullable final com.bilibili.ship.theseus.united.page.restrictionlayer.y yVar) {
        composeView.setVisibility(yVar != null ? 0 : 8);
        if (yVar == null) {
            return;
        }
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-605612193, true, new Function2(yVar) { // from class: com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final com.bilibili.ship.theseus.united.page.restrictionlayer.y f102841a;

            {
                this.f102841a = yVar;
            }

            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-605612193, iIntValue, -1, "com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.bindButton.<anonymous> (ButtonBinding.kt:20)");
                    }
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
                    com.bilibili.ship.theseus.united.page.restrictionlayer.y yVar2 = this.f102841a;
                    Modifier modifierA = yVar2.a(modifierFillMaxSize$default);
                    Brush brushC = yVar2.c(composer, 0);
                    Brush brush = brushC;
                    if (brushC == null) {
                        brush = com.bilibili.ship.theseus.united.page.restrictionlayer.A.f102500a;
                    }
                    com.bilibili.ship.theseus.united.page.restrictionlayer.A.a(yVar2, SizeKt.wrapContentSize$default(BackgroundKt.background$default(modifierA, brush, RoundedCornerShapeKt.getCircleShape(), 0.0f, 4, null), null, false, 3, null), null, BiliTheme.INSTANCE.getTextStyle(composer, BiliTheme.$stable).getT14(), null, 0, false, 1, 0, null, null, composer, 12582912, 0, 954);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            }
        }));
    }
}
