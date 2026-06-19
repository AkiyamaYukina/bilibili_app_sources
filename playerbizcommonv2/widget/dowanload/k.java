package com.bilibili.playerbizcommonv2.widget.dowanload;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.viewbinding.ViewBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.bilibili.app.comment3.ui.nextholder.handle.x;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.gripper.api.ad.core.GAdCoreKt;
import com.bilibili.gripper.api.ad.core.GAdReport;
import com.bilibili.gripper.api.ad.core.report.IReportPreset;
import com.bilibili.gripper.api.ad.core.report.ReportPresetKt;
import com.bilibili.gripper.api.ad.core.report.UIExtraParams;
import com.bilibili.iconfont.IconFont;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.theme.R$color;
import com.bilibili.playerbizcommon.view.RingProgressBar;
import com.bilibili.playerbizcommonv2.widget.dowanload.m;
import java.util.List;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/k.class */
@StabilityInferred(parameters = 0)
public final class k extends com.bilibili.app.gemini.ui.m<Dr0.i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f82553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StateFlow<Long> f82554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final f f82555c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/k$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f82556a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f82557b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f82558c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f82559d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final String f82560e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f82561f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public final String f82562g;
        public final int h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public final Jr0.f f82563i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public final List<m.a> f82564j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        public final StateFlow<l> f82565k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NotNull
        public final androidx.compose.foundation.text.input.internal.selection.l f82566l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @NotNull
        public final com.bilibili.lib.fasthybrid.game.engine.ability.impl.update.a f82567m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @NotNull
        public final MutableStateFlow<Boolean> f82568n;

        public a(long j7, long j8, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z6, @Nullable String str4, int i7, @NotNull Jr0.f fVar, @NotNull List list, @NotNull StateFlow stateFlow, @NotNull androidx.compose.foundation.text.input.internal.selection.l lVar, @NotNull com.bilibili.lib.fasthybrid.game.engine.ability.impl.update.a aVar) {
            this.f82556a = j7;
            this.f82557b = j8;
            this.f82558c = str;
            this.f82559d = str2;
            this.f82560e = str3;
            this.f82561f = z6;
            this.f82562g = str4;
            this.h = i7;
            this.f82563i = fVar;
            this.f82564j = list;
            this.f82565k = stateFlow;
            this.f82566l = lVar;
            this.f82567m = aVar;
            MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
            this.f82568n = MutableStateFlow;
            ((Boolean) MutableStateFlow.getValue()).getClass();
        }
    }

    public k(@NotNull a aVar, @NotNull StateFlow stateFlow, @NotNull f fVar) {
        this.f82553a = aVar;
        this.f82554b = stateFlow;
        this.f82555c = fVar;
    }

    public final Object a(ViewBinding viewBinding, Continuation continuation) {
        Dr0.i iVar = (Dr0.i) viewBinding;
        ConstraintLayout constraintLayout = iVar.f3082a;
        Context context = constraintLayout.getContext();
        TextView textView = iVar.f3091k;
        TextView textView2 = iVar.f3088g;
        ImageView imageView = iVar.f3090j;
        View view = iVar.f3084c;
        ComposeView composeView = iVar.f3085d;
        AppCompatImageView appCompatImageView = iVar.f3083b;
        LottieAnimationView lottieAnimationView = iVar.h;
        List<View> listListOf = CollectionsKt.listOf(new View[]{view, composeView, textView2, appCompatImageView, lottieAnimationView});
        Lazy lazy = com.bilibili.playerbizcommonv2.utils.p.f81943a;
        imageView.setVisibility(8);
        RingProgressBar ringProgressBar = iVar.f3089i;
        ringProgressBar.setVisibility(8);
        a aVar = this.f82553a;
        iVar.f3086e.setVisibility(aVar.f82561f ? 0 : 8);
        ringProgressBar.setRingColor(com.bilibili.playerbizcommonv2.utils.p.c(context, R$color.Ga3, 0.5f));
        ringProgressBar.setRingProgressColor(ContextCompat.getColor(context, R$color.Pi5));
        ringProgressBar.setClockwise(true);
        BiliImageLoader.INSTANCE.with(context).url(aVar.f82559d).into(view);
        textView.setText(aVar.f82558c);
        textView2.setText(aVar.f82560e);
        textView2.setBackground(com.bilibili.playerbizcommonv2.utils.p.f(com.bilibili.playerbizcommonv2.utils.p.c(context, R$color.Ba0_u, 0.5f), 0.0f, 2, 0));
        Drawable iconDrawable = IconFont.getIconDrawable("arrow-download-down-line@500", ContextCompat.getColor(context, R$color.Ga8));
        int iDpToPx = DimenUtilsKt.dpToPx(16.0f);
        if (iconDrawable != null) {
            iconDrawable.setBounds(0, 0, iDpToPx, iDpToPx);
        }
        AppCompatTextView appCompatTextView = iVar.f3087f;
        appCompatTextView.setCompoundDrawables(iconDrawable, null, null, null);
        constraintLayout.setOnClickListener(new ZI.f(this, 2));
        appCompatImageView.setVisibility((aVar.f82564j.size() > 1 || aVar.h > 1) ? 0 : 8);
        if (aVar.f82564j.size() > 1) {
            appCompatImageView.setOnClickListener(new x(this, 2));
        }
        appCompatTextView.setOnClickListener(new ZI.h(this, 1));
        if (aVar.f82563i.a()) {
            composeView.setVisibility(0);
            final int i7 = 0;
            composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1190333107, true, new Function2(this, i7) { // from class: com.bilibili.playerbizcommonv2.widget.dowanload.j

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f82551a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f82552b;

                {
                    this.f82551a = i7;
                    this.f82552b = this;
                }

                public final Object invoke(Object obj, Object obj2) {
                    Object obj3 = this.f82552b;
                    switch (this.f82551a) {
                        case 0:
                            Composer composer = (Composer) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (composer.shouldExecute((iIntValue & 3) != 2, 1 & iIntValue)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1190333107, iIntValue, -1, "com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadEpisodeComponent.bind.<anonymous> (VideoDownloadEpisodeComponent.kt:111)");
                                }
                                Jr0.e.a(((k) obj3).f82553a.f82563i, 0, 0, 0, 0, false, composer, 0, 62);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer.skipToGroupEnd();
                            }
                            break;
                        default:
                            String str = (String) obj;
                            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                            GAdReport gAdReport = GAdCoreKt.getGAdReport();
                            String str2 = zBooleanValue ? "appointment_suc" : "appointment_fail";
                            IReportPreset iReportPresetAddUrl = ReportPresetKt.addUrl(com.lynx.tasm.a.b(((va.a) obj3).q().a), str);
                            UIExtraParams uIExtraParamsA = w8.m.a(1, str, (Bundle) null, (DefaultConstructorMarker) null);
                            Unit unit = Unit.INSTANCE;
                            gAdReport.uiEvent(str2, iReportPresetAddUrl, uIExtraParamsA);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }));
        } else {
            composeView.setVisibility(8);
        }
        for (View view2 : listListOf) {
            if (view2.getVisibility() == 0) {
                view2.setAlpha(aVar.f82561f ? 0.5f : 1.0f);
            }
        }
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new VideoDownloadEpisodeComponent$bind$7(this, lottieAnimationView, textView, context, appCompatImageView, appCompatTextView, imageView, ringProgressBar, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return Dr0.i.inflate(LayoutInflater.from(context), viewGroup, false);
    }
}
