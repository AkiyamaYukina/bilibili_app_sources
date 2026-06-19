package com.bilibili.studio.centerplus.widgets;

import TB0.C2876h;
import Wj.c;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.bilibili.studio.centerplus.widgets.GeneralModLoadingView;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/widgets/GeneralModLoadingView.class */
public final class GeneralModLoadingView extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final C2876h f105306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Function1<? super Integer, Unit> f105307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public String f105308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public String f105309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f105310e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f105311f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/widgets/GeneralModLoadingView$a.class */
    public static final class a extends TimerTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GeneralModLoadingView f105312a;

        public a(GeneralModLoadingView generalModLoadingView) {
            this.f105312a = generalModLoadingView;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            final GeneralModLoadingView generalModLoadingView = this.f105312a;
            generalModLoadingView.post(new Runnable(generalModLoadingView) { // from class: fw0.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final GeneralModLoadingView f119642a;

                {
                    this.f119642a = generalModLoadingView;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    GeneralModLoadingView generalModLoadingView2 = this.f119642a;
                    Function1 function1 = generalModLoadingView2.f105307b;
                    if (function1 != null) {
                        function1.invoke(Integer.valueOf(generalModLoadingView2.f105311f));
                    }
                }
            });
        }
    }

    @JvmOverloads
    public GeneralModLoadingView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public GeneralModLoadingView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @JvmOverloads
    public GeneralModLoadingView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f105311f = -1;
        this.f105308c = context.getString(2131842107);
        this.f105309d = context.getString(2131842257);
        this.f105306a = C2876h.inflate(LayoutInflater.from(context), this, true);
    }

    public /* synthetic */ GeneralModLoadingView(Context context, AttributeSet attributeSet, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i8 & 2) != 0 ? null : attributeSet, (i8 & 4) != 0 ? 0 : i7);
    }

    private static /* synthetic */ void getLoadingState$annotations() {
    }

    public static /* synthetic */ void onFail$default(GeneralModLoadingView generalModLoadingView, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = 0;
        }
        generalModLoadingView.onFail(i7);
    }

    public final int getLoadingState() {
        return this.f105311f;
    }

    public final boolean isFailed() {
        return this.f105311f == 0;
    }

    public final boolean isLoading() {
        return this.f105311f == 2;
    }

    public final boolean isSuccess() {
        boolean z6 = true;
        if (this.f105311f != 1) {
            z6 = false;
        }
        return z6;
    }

    public final void j0() {
        LottieAnimationView lottieAnimationView;
        ImageView imageView;
        LottieAnimationView lottieAnimationView2;
        ImageView imageView2;
        if (this.f105311f == 0) {
            C2876h c2876h = this.f105306a;
            if (c2876h != null && (imageView2 = c2876h.f23798c) != null) {
                imageView2.setVisibility(0);
            }
            C2876h c2876h2 = this.f105306a;
            if (c2876h2 == null || (lottieAnimationView2 = c2876h2.f23799d) == null) {
                return;
            }
            lottieAnimationView2.setVisibility(8);
            return;
        }
        C2876h c2876h3 = this.f105306a;
        if (c2876h3 != null && (imageView = c2876h3.f23798c) != null) {
            imageView.setVisibility(8);
        }
        C2876h c2876h4 = this.f105306a;
        if (c2876h4 == null || (lottieAnimationView = c2876h4.f23799d) == null) {
            return;
        }
        lottieAnimationView.setVisibility(0);
    }

    public final void k0() {
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        String str = this.f105308c;
        if (str == null || str.length() == 0) {
            C2876h c2876h = this.f105306a;
            if (c2876h == null || (textView = c2876h.f23800e) == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        if (this.f105311f == 0) {
            C2876h c2876h2 = this.f105306a;
            if (c2876h2 != null && (textView4 = c2876h2.f23800e) != null) {
                textView4.setText(this.f105309d);
            }
        } else {
            C2876h c2876h3 = this.f105306a;
            if (c2876h3 != null && (textView2 = c2876h3.f23800e) != null) {
                textView2.setText(this.f105308c);
            }
        }
        C2876h c2876h4 = this.f105306a;
        if (c2876h4 == null || (textView3 = c2876h4.f23800e) == null) {
            return;
        }
        textView3.setVisibility(0);
    }

    public final void onFail(int i7) {
        this.f105311f = 0;
        j0();
        k0();
        if (i7 != 0) {
            new Timer().schedule(new a(this), i7);
            return;
        }
        Function1<? super Integer, Unit> function1 = this.f105307b;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(this.f105311f));
        }
    }

    public final void onLoading() {
        this.f105311f = 2;
        setVisibility(0);
        k0();
        if (this.f105310e) {
            C2876h c2876h = this.f105306a;
            if (c2876h != null) {
                c2876h.f23797b.setVisibility(0);
            }
            C2876h c2876h2 = this.f105306a;
            if (c2876h2 != null) {
                c2876h2.f23797b.setOnClickListener(new c(this, 3));
            }
        } else {
            C2876h c2876h3 = this.f105306a;
            if (c2876h3 != null) {
                c2876h3.f23797b.setVisibility(8);
            }
        }
        j0();
        Function1<? super Integer, Unit> function1 = this.f105307b;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(this.f105311f));
        }
    }

    public final void onSuccess() {
        this.f105311f = 1;
        setVisibility(8);
        Function1<? super Integer, Unit> function1 = this.f105307b;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(this.f105311f));
        }
    }

    @NotNull
    public final GeneralModLoadingView setLoadingErrorText(@Nullable String str) {
        this.f105309d = str;
        return this;
    }

    @NotNull
    public final GeneralModLoadingView setLoadingText(@Nullable String str) {
        this.f105308c = str;
        return this;
    }

    @NotNull
    public final GeneralModLoadingView setOnLoadingStateChange(@Nullable Function1<? super Integer, Unit> function1) {
        this.f105307b = function1;
        return this;
    }

    @NotNull
    public final GeneralModLoadingView setShowClose(boolean z6) {
        this.f105310e = z6;
        return this;
    }
}
