package com.bilibili.ship.theseus.united.page.videolist;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.style.LeadingMarginSpan;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.viewbinding.ViewBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.framework.exposure.core.collecter.ViewExposureLayoutInfoCollectorKt;
import dv0.I0;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videolist/d.class */
@StabilityInferred(parameters = 0)
public final class d extends com.bilibili.app.gemini.ui.m<I0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Triple<a, a, a> f103608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final b f103609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final StateFlow<Long> f103610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f103611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Function1<a, Unit> f103612e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f103613f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videolist/d$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f103614a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f103615b;

        public a(long j7, @NotNull String str) {
            this.f103614a = j7;
            this.f103615b = str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@NotNull Triple<a, a, a> triple, @NotNull b bVar, @NotNull StateFlow<Long> stateFlow, boolean z6, @NotNull Function1<? super a, Unit> function1, @NotNull Function0<Unit> function0) {
        this.f103608a = triple;
        this.f103609b = bVar;
        this.f103610c = stateFlow;
        this.f103611d = z6;
        this.f103612e = function1;
        this.f103613f = function0;
    }

    public static final void c(d dVar, String str, long j7, TextView textView, LottieAnimationView lottieAnimationView) {
        long jLongValue = ((Number) dVar.f103610c.getValue()).longValue();
        b bVar = dVar.f103609b;
        if (j7 != jLongValue) {
            d(lottieAnimationView, textView, null);
            textView.setText(str);
            textView.setTextColor(bVar.f103582a);
            textView.setTypeface(Typeface.DEFAULT, 0);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new LeadingMarginSpan.Standard(DimenUtilsKt.dpToPx(12.0f), 0), 0, spannableStringBuilder.length(), 33);
        textView.setText(spannableStringBuilder);
        textView.setTextColor(bVar.f103586e);
        textView.setTypeface(Typeface.DEFAULT, 1);
        if (textView.getWidth() <= 0) {
            textView.getViewTreeObserver().addOnGlobalLayoutListener(new k(textView, j7, dVar, spannableStringBuilder, lottieAnimationView));
        } else {
            d(lottieAnimationView, textView, spannableStringBuilder.toString());
        }
    }

    public static final void d(LottieAnimationView lottieAnimationView, TextView textView, String str) {
        if (str == null || str.length() == 0) {
            lottieAnimationView.cancelAnimation();
            lottieAnimationView.setVisibility(8);
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) lottieAnimationView.getLayoutParams();
        if ((((textView.getWidth() - textView.getPaint().measureText(str.toString())) - textView.getPaddingLeft()) - textView.getPaddingRight()) - DimenUtilsKt.dpToPx(12.0f) > 0.0f) {
            marginLayoutParams.topMargin = DimenUtilsKt.dpToPx(24.0f);
        } else {
            marginLayoutParams.topMargin = DimenUtilsKt.dpToPx(15.0f);
        }
        lottieAnimationView.setLayoutParams(marginLayoutParams);
        lottieAnimationView.setVisibility(0);
        lottieAnimationView.playAnimation();
    }

    public final Object a(ViewBinding viewBinding, Continuation continuation) {
        I0 i02 = (I0) viewBinding;
        ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(i02.f116792a, new ExposureEntry(com.bilibili.ship.theseus.united.page.report.a.f102493a, new WS0.w(this, 5)));
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new VideoSelectListPageComponent$bind$3(i02, this, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return I0.inflate(LayoutInflater.from(context), viewGroup, false);
    }
}
