package com.bilibili.ship.theseus.united.page.intro.module.liveorder;

import Se.p;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.bilibili.app.gemini.ui.m;
import com.bilibili.bplus.followingpublish.fragments.B0;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.framework.exposure.core.collecter.ViewExposureLayoutInfoCollectorKt;
import dv0.X;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/liveorder/e.class */
@StabilityInferred(parameters = 0)
public final class e extends m<X> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f100509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow f100510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final StateFlow<Integer> f100511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final g f100512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final p f100513e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final h f100514f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f100515g;

    @NotNull
    public final ExposureEntry h = new ExposureEntry(com.bilibili.ship.theseus.united.page.report.a.f102493a, new com.bilibili.bililive.compose.businesscoupon.b(this, 2));

    public e(@NotNull String str, @NotNull MutableStateFlow mutableStateFlow, @NotNull StateFlow stateFlow, @NotNull g gVar, @NotNull p pVar, @NotNull h hVar) {
        this.f100509a = str;
        this.f100510b = mutableStateFlow;
        this.f100511c = stateFlow;
        this.f100512d = gVar;
        this.f100513e = pVar;
        this.f100514f = hVar;
    }

    public final Object a(ViewBinding viewBinding, Continuation continuation) {
        X x6 = (X) viewBinding;
        Context context = x6.f116865a.getContext();
        ExposureEntry exposureEntry = this.h;
        final ConstraintLayout constraintLayout = x6.f116865a;
        ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(constraintLayout, exposureEntry);
        if (this.f100515g == 0) {
            constraintLayout.getViewTreeObserver().addOnGlobalLayoutListener(new c(constraintLayout, this));
        }
        TextView textView = x6.f116868d;
        x6.f116869e.setText(this.f100509a);
        x6.f116866b.setOnClickListener(new View.OnClickListener(constraintLayout, this) { // from class: com.bilibili.ship.theseus.united.page.intro.module.liveorder.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final e f100503a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final ConstraintLayout f100504b;

            {
                this.f100503a = this;
                this.f100504b = constraintLayout;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e eVar = this.f100503a;
                final ConstraintLayout constraintLayout2 = this.f100504b;
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(eVar.f100515g, 0);
                valueAnimatorOfInt.setDuration(300L);
                valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(constraintLayout2) { // from class: com.bilibili.ship.theseus.united.page.intro.module.liveorder.b

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final ConstraintLayout f100505a;

                    {
                        this.f100505a = constraintLayout2;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ConstraintLayout constraintLayout3 = this.f100505a;
                        constraintLayout3.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        constraintLayout3.requestLayout();
                    }
                });
                valueAnimatorOfInt.addListener(new d(eVar));
                valueAnimatorOfInt.start();
            }
        });
        textView.setOnClickListener(new B0(this, 1));
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new DetailReserveComponent$bind$5(this, constraintLayout, textView, context, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return X.inflate(layoutInflater, viewGroup, false);
    }
}
