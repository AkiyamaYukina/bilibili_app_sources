package com.bilibili.playerbizcommonv2.widget.dowanload;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.viewbinding.ViewBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.bilibili.droid.DimenUtilsKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/m.class */
@StabilityInferred(parameters = 0)
public final class m extends com.bilibili.app.gemini.ui.m<Dr0.j> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f82570c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Pair<a, a> f82571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StateFlow<Long> f82572b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/m$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f82573a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f82574b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final StateFlow<l> f82575c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final com.bilibili.ugc.offline.download.q f82576d;

        public a(long j7, @NotNull String str, @NotNull StateFlow stateFlow, @NotNull com.bilibili.ugc.offline.download.q qVar) {
            this.f82573a = j7;
            this.f82574b = str;
            this.f82575c = stateFlow;
            this.f82576d = qVar;
        }
    }

    public m(@NotNull Pair<a, a> pair, @NotNull StateFlow<Long> stateFlow) {
        this.f82571a = pair;
        this.f82572b = stateFlow;
    }

    public static final void c(LottieAnimationView lottieAnimationView, TextView textView, String str) {
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
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new VideoDownloadMultiPageComponent$bind$2((Dr0.j) viewBinding, this, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return Dr0.j.inflate(LayoutInflater.from(context), viewGroup, false);
    }
}
