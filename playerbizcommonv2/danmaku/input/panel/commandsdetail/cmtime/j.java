package com.bilibili.playerbizcommonv2.danmaku.input.panel.commandsdetail.cmtime;

import K7.N;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Window;
import androidx.activity.ComponentDialog;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import com.bilibili.playerbizcommonv2.danmaku.input.panel.commandsdetail.cmtime.CommercialTimeView$showUpperSloganSelector$1;
import com.mall.data.page.create.submit.ButtonInfoVO;
import com.mall.data.page.create.submit.MainPriceVO;
import com.mall.data.page.create.submit.OrderInfoBean;
import com.mall.data.page.create.submit.SubPriceVO;
import com.mall.ui.page.create3.MallOrderCrossStorePaymentFragmentV2;
import fh0.C7075b;
import fh0.C7077c;
import fh0.L0;
import fh0.X;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.interact.core.command.CommandsPanel;
import yR0.o;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/panel/commandsdetail/cmtime/j.class */
@StabilityInferred(parameters = 0)
public final class j extends ComponentDialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f81047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CommercialTimeView$showUpperSloganSelector$1.a f81048b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/panel/commandsdetail/cmtime/j$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f81049a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f81050b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final List<CommandsPanel.Panel.Extra.GuideMaterial> f81051c;

        public a(int i7, int i8, @NotNull List<CommandsPanel.Panel.Extra.GuideMaterial> list) {
            this.f81049a = i7;
            this.f81050b = i8;
            this.f81051c = list;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f81049a == aVar.f81049a && this.f81050b == aVar.f81050b && Intrinsics.areEqual(this.f81051c, aVar.f81051c);
        }

        public final int hashCode() {
            return this.f81051c.hashCode() + I.a(this.f81050b, Integer.hashCode(this.f81049a) * 31, 31);
        }

        @NotNull
        public final String toString() {
            List<CommandsPanel.Panel.Extra.GuideMaterial> list = this.f81051c;
            StringBuilder sb = new StringBuilder("Args(selectedIndex=");
            sb.append(this.f81049a);
            sb.append(", height=");
            return N.a(sb, this.f81050b, ", data=", list, ")");
        }
    }

    public j(@NotNull Context context, @NotNull a aVar, @NotNull CommercialTimeView$showUpperSloganSelector$1.a aVar2) {
        super(context, 2131886241);
        this.f81047a = aVar;
        this.f81048b = aVar2;
    }

    public static Unit j(j jVar) {
        super.dismiss();
        return Unit.INSTANCE;
    }

    public static Unit k(j jVar) {
        super.dismiss();
        return Unit.INSTANCE;
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setGravity(80);
        }
        setCanceledOnTouchOutside(true);
        final ComposeView composeView = new ComposeView(getContext(), null, 0, 6, null);
        final int i7 = 0;
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(449636108, true, new Function2(i7, this, composeView) { // from class: com.bilibili.playerbizcommonv2.danmaku.input.panel.commandsdetail.cmtime.h

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f81042a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f81043b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Object f81044c;

            {
                this.f81042a = i7;
                this.f81043b = this;
                this.f81044c = composeView;
            }

            public final Object invoke(Object obj, Object obj2) {
                Object obj3 = this.f81043b;
                Object obj4 = this.f81044c;
                boolean z6 = false;
                int i8 = this.f81042a;
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                switch (i8) {
                    case 0:
                        if ((iIntValue & 3) != 2) {
                            z6 = true;
                        }
                        if (composer.shouldExecute(z6, iIntValue & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(449636108, iIntValue, -1, "com.bilibili.playerbizcommonv2.danmaku.input.panel.commandsdetail.cmtime.SloganSelectorDialog.contentView.<anonymous>.<anonymous> (SloganSelectorDialog.kt:69)");
                            }
                            final ComposeView composeView2 = (ComposeView) obj4;
                            final j jVar = (j) obj3;
                            BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(1550468292, true, new Function2(jVar, composeView2) { // from class: com.bilibili.playerbizcommonv2.danmaku.input.panel.commandsdetail.cmtime.i

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final j f81045a;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final ComposeView f81046b;

                                {
                                    this.f81045a = jVar;
                                    this.f81046b = composeView2;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:22:0x0138  */
                                /* JADX WARN: Removed duplicated region for block: B:34:0x0274  */
                                /* JADX WARN: Removed duplicated region for block: B:39:0x03b4  */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public final java.lang.Object invoke(java.lang.Object r55, java.lang.Object r56) {
                                    /*
                                        Method dump skipped, instruction units count: 1020
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.danmaku.input.panel.commandsdetail.cmtime.i.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
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
                        KProperty[] kPropertyArr = MallOrderCrossStorePaymentFragmentV2.C;
                        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1668814378, iIntValue, -1, "com.mall.ui.page.create3.MallOrderCrossStorePaymentFragmentV2.initComposeButton.<anonymous> (MallOrderCrossStorePaymentFragmentV2.kt:750)");
                            }
                            OrderInfoBean orderInfoBean = new OrderInfoBean();
                            C7075b c7075b = ((X) obj4).f117896B0;
                            MallOrderCrossStorePaymentFragmentV2 mallOrderCrossStorePaymentFragmentV2 = (MallOrderCrossStorePaymentFragmentV2) obj3;
                            ButtonInfoVO buttonInfoVO = null;
                            SubPriceVO subPriceVO = null;
                            if (c7075b != null) {
                                mallOrderCrossStorePaymentFragmentV2.getClass();
                                C7077c c7077c = c7075b.f117995c;
                                MainPriceVO mainPriceVO = c7077c != null ? new MainPriceVO(c7077c.f118000a, c7077c.f118001b, c7077c.f118002c, c7077c.f118003d, c7077c.f118004e) : null;
                                L0 l02 = c7075b.f117996d;
                                if (l02 != null) {
                                    subPriceVO = new SubPriceVO(l02.f117865a, l02.f117866b, l02.f117867c, l02.f117868d);
                                }
                                buttonInfoVO = new ButtonInfoVO(mainPriceVO, subPriceVO);
                            }
                            orderInfoBean.buttonInfoVo = buttonInfoVO;
                            o oVar = mallOrderCrossStorePaymentFragmentV2.x;
                            if (oVar == null) {
                                composer.startReplaceGroup(-1402510073);
                            } else {
                                composer.startReplaceGroup(-1707810246);
                                LR0.o oVar2 = mallOrderCrossStorePaymentFragmentV2.u;
                                oVar.a(orderInfoBean, (oVar2 == null || oVar2.d()) ? false : true, composer, 0);
                            }
                            composer.endReplaceGroup();
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
        }));
        setContentView(composeView);
    }
}
