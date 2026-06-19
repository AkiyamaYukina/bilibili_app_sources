package com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.unit.Dp;
import androidx.databinding.ViewDataBinding;
import com.bapis.bilibili.app.dynamic.v2.KToastDialog;
import com.bilibili.app.gemini.ui.DataBindingComponent;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import com.bilibili.ship.theseus.united.page.restrictionlayer.C6378c;
import com.bilibili.ship.theseus.united.page.restrictionlayer.C6385j;
import dv0.s0;
import kntr.app.tribee.steam.viewmodel.b;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/uicomponent/y.class */
@StabilityInferred(parameters = 0)
public final class C6415y extends DataBindingComponent<s0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.restrictionlayer.M f102913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.restrictionlayer.J f102914b;

    public C6415y(@NotNull com.bilibili.ship.theseus.united.page.restrictionlayer.M m7, @NotNull com.bilibili.ship.theseus.united.page.restrictionlayer.J j7) {
        this.f102913a = m7;
        this.f102914b = j7;
    }

    public final Object b(ViewDataBinding viewDataBinding, Continuation continuation) {
        s0 s0Var = (s0) viewDataBinding;
        com.bilibili.ship.theseus.united.page.restrictionlayer.M m7 = this.f102913a;
        s0Var.r(m7);
        s0Var.q(this.f102914b);
        C6378c c6378c = (C6378c) CollectionsKt.firstOrNull(m7.n());
        C6385j c6385j = c6378c != null ? c6378c.f102727a : null;
        int i7 = c6385j != null ? 0 : 8;
        ComposeView composeView = s0Var.f117127w;
        composeView.setVisibility(i7);
        if (c6385j != null) {
            final C6385j c6385j2 = c6385j;
            final int i8 = 0;
            composeView.setContent(ComposableLambdaKt.composableLambdaInstance(2027778387, true, new Function2(c6385j2, i8) { // from class: com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.w

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f102910a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f102911b;

                {
                    this.f102910a = i8;
                    this.f102911b = c6385j2;
                }

                public final Object invoke(Object obj, Object obj2) {
                    switch (this.f102910a) {
                        case 0:
                            Composer composer = (Composer) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2027778387, iIntValue, -1, "com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.RestrictionHorizontalImageUIComponent.bind.<anonymous> (RestrictionHorizontalImageUIComponent.kt:43)");
                                }
                                final com.bilibili.ship.theseus.united.page.restrictionlayer.y yVar = (com.bilibili.ship.theseus.united.page.restrictionlayer.y) this.f102911b;
                                BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(1763361547, true, new Function2(yVar) { // from class: com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.x

                                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                                    public final com.bilibili.ship.theseus.united.page.restrictionlayer.y f102912a;

                                    {
                                        this.f102912a = yVar;
                                    }

                                    public final Object invoke(Object obj3, Object obj4) {
                                        Composer composer2 = (Composer) obj3;
                                        int iIntValue2 = ((Integer) obj4).intValue();
                                        if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1763361547, iIntValue2, -1, "com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.RestrictionHorizontalImageUIComponent.bind.<anonymous>.<anonymous> (RestrictionHorizontalImageUIComponent.kt:44)");
                                            }
                                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
                                            com.bilibili.ship.theseus.united.page.restrictionlayer.y yVar2 = this.f102912a;
                                            Modifier modifierA = yVar2.a(modifierFillMaxSize$default);
                                            Brush brushC = yVar2.c(composer2, 0);
                                            Brush brush = brushC;
                                            if (brushC == null) {
                                                brush = com.bilibili.ship.theseus.united.page.restrictionlayer.A.f102500a;
                                            }
                                            com.bilibili.ship.theseus.united.page.restrictionlayer.A.a(yVar2, SizeKt.wrapContentSize$default(BackgroundKt.background$default(modifierA, brush, RoundedCornerShapeKt.m1502RoundedCornerShape0680j_4(Dp.m3880constructorimpl(4)), 0.0f, 4, null), null, false, 3, null), null, null, null, 0, false, 0, 0, null, null, composer2, 0, 0, 1022);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        } else {
                                            composer2.skipToGroupEnd();
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, composer, 54), composer, 384, 3);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer.skipToGroupEnd();
                            }
                            break;
                        default:
                            KToastDialog.KToastDialogType kToastDialogType = (KToastDialog.KToastDialogType) obj;
                            if (kToastDialogType instanceof KToastDialog.KToastDialogType.STEAM_ACCOUNT_RELEASE) {
                                s21.a.c("unbound", "sure");
                                ((Function1) this.f102911b).invoke(b.j.a);
                            } else if (kToastDialogType instanceof KToastDialog.KToastDialogType.GAME_STATS_NO_TRIBEE) {
                                s21.a.c("not_join", "sure");
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }));
        }
        s0Var.executePendingBindings();
        return Unit.INSTANCE;
    }

    public final ViewDataBinding d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return s0.inflate(layoutInflater, viewGroup, false);
    }
}
