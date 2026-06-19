package com.bilibili.ship.theseus.united.page.videolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.framework.exposure.core.collecter.ViewExposureLayoutInfoCollectorKt;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.ImageRequestBuilder;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.widgets.TintProgressBar;
import com.bilibili.ship.theseus.united.page.intro.module.relate.C6302a;
import com.bilibili.ship.theseus.united.page.videolist.d;
import dv0.H0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videolist/c.class */
@StabilityInferred(parameters = 0)
public final class c extends com.bilibili.app.gemini.ui.m<H0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f103589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final b f103590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final StateFlow<Long> f103591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final q f103592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final r f103593e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final s f103594f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videolist/c$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f103595a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f103596b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f103597c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f103598d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final String f103599e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final String f103600f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final String f103601g;

        @NotNull
        public final String h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public final String f103602i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final double f103603j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        public final C6302a f103604k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NotNull
        public final List<d.a> f103605l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f103606m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @NotNull
        public final MutableStateFlow<Boolean> f103607n = StateFlowKt.MutableStateFlow(Boolean.FALSE);

        public a(long j7, long j8, long j9, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, double d7, @NotNull C6302a c6302a, @NotNull List<d.a> list, boolean z6) {
            this.f103595a = j7;
            this.f103596b = j8;
            this.f103597c = j9;
            this.f103598d = str;
            this.f103599e = str2;
            this.f103600f = str3;
            this.f103601g = str4;
            this.h = str5;
            this.f103602i = str6;
            this.f103603j = d7;
            this.f103604k = c6302a;
            this.f103605l = list;
            this.f103606m = z6;
        }
    }

    public c(@NotNull a aVar, @NotNull b bVar, @NotNull StateFlow stateFlow, @NotNull q qVar, @NotNull r rVar, @NotNull s sVar) {
        this.f103589a = aVar;
        this.f103590b = bVar;
        this.f103591c = stateFlow;
        this.f103592d = qVar;
        this.f103593e = rVar;
        this.f103594f = sVar;
    }

    public final Object a(ViewBinding viewBinding, Continuation continuation) {
        H0 h02 = (H0) viewBinding;
        ConstraintLayout constraintLayout = h02.f116776a;
        Context context = constraintLayout.getContext();
        TextView textView = h02.h;
        View view = h02.f116778c;
        TextView textView2 = h02.f116785k;
        TextView textView3 = h02.f116782g;
        ImageRequestBuilder imageRequestBuilderWith = BiliImageLoader.INSTANCE.with(context);
        a aVar = this.f103589a;
        imageRequestBuilderWith.url(aVar.f103599e).into(h02.f116779d);
        textView2.setText(aVar.f103598d);
        textView.setText(aVar.f103600f);
        h02.f116786l.setText(aVar.h);
        h02.f116781f.setText(aVar.f103602i);
        textView3.setText(aVar.f103601g);
        textView3.setBackground(com.bilibili.playerbizcommonv2.utils.p.f(com.bilibili.playerbizcommonv2.utils.p.c(context, R$color.Ba0_u, 0.5f), 0.0f, 2, 0));
        double d7 = aVar.f103603j;
        TintProgressBar tintProgressBar = h02.f116784j;
        if (d7 <= 0.0d) {
            tintProgressBar.setVisibility(4);
        } else {
            tintProgressBar.setVisibility(0);
            tintProgressBar.setProgress(RangesKt.coerceAtMost(MathKt.roundToInt(((double) 100) * d7), 100));
        }
        constraintLayout.setOnClickListener(new Eq.g(this, 2));
        int i7 = ((ArrayList) aVar.f103605l).size() > 1 ? 0 : 8;
        AppCompatImageView appCompatImageView = h02.f116777b;
        appCompatImageView.setVisibility(i7);
        view.setOnClickListener(new Mf.c(this, 3));
        boolean zA = aVar.f103604k.a();
        ComposeView composeView = h02.f116780e;
        if (zA) {
            composeView.setVisibility(0);
            composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1133259699, true, new TR0.a(this, 2)));
        } else {
            composeView.setVisibility(8);
        }
        ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int iDpToPx = 0;
        if (aVar.f103606m) {
            iDpToPx = DimenUtilsKt.dpToPx(10.0f);
        }
        marginLayoutParams.topMargin = iDpToPx;
        textView2.setLayoutParams(marginLayoutParams);
        ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(constraintLayout, new ExposureEntry(com.bilibili.ship.theseus.united.page.report.a.f102493a, new WS0.v(this, 4)));
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new VideoSelectListEpisodeComponent$bind$7(this, h02.f116783i, textView2, appCompatImageView, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return H0.inflate(LayoutInflater.from(context), viewGroup, false);
    }
}
