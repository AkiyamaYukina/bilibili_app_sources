package com.bilibili.pegasus.promo.setting;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.airbnb.lottie.LottieAnimationView;
import com.bilibili.app.comm.list.common.feed.PegasusStyle;
import com.bilibili.app.comm.list.common.feed.PegasusStyleEnum;
import com.bilibili.app.comm.list.common.feed.PegasusStyleKt;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.magicasakura.widgets.TintLinearLayout;
import com.bilibili.magicasakura.widgets.TintTextView;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/promo/setting/IndexCardStyleLayoutV2.class */
@StabilityInferred(parameters = 0)
public final class IndexCardStyleLayoutV2 extends TintLinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final View f78532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final View f78533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Function1<? super PegasusStyleEnum, Unit> f78534e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/promo/setting/IndexCardStyleLayoutV2$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final View f78535a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f78536b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f78537c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final TintImageView f78538d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final FrameLayout f78539e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final LottieAnimationView f78540f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final AppCompatImageView f78541g;
        public final TintTextView h;

        public a(@NotNull View view, @NotNull String str, @NotNull String str2) {
            this.f78535a = view;
            this.f78536b = str;
            this.f78537c = str2;
            this.f78538d = (TintImageView) view.findViewById(2131312491);
            this.f78539e = (FrameLayout) view.findViewById(2131312488);
            this.f78540f = (LottieAnimationView) view.findViewById(2131312493);
            this.f78541g = (AppCompatImageView) view.findViewById(2131312494);
            this.h = (TintTextView) view.findViewById(2131312495);
        }

        public final void a() {
            if (MultipleThemeUtils.isNightTheme(this.f78535a.getContext())) {
                ListExtentionsKt.playLocalAnimation$default(this.f78540f, this.f78537c, false, false, 6, (Object) null);
            } else {
                ListExtentionsKt.playLocalAnimation$default(this.f78540f, this.f78536b, false, false, 6, (Object) null);
            }
        }

        public final void b(boolean z6) {
            this.f78539e.setSelected(z6);
            TintImageView tintImageView = this.f78538d;
            tintImageView.setSelected(z6);
            this.f78541g.setSelected(z6);
            int visibility = ListExtentionsKt.toVisibility(false);
            LottieAnimationView lottieAnimationView = this.f78540f;
            lottieAnimationView.setVisibility(visibility);
            tintImageView.setVisibility(ListExtentionsKt.toVisibility(true));
            if (lottieAnimationView.isAnimating()) {
                lottieAnimationView.cancelAnimation();
                lottieAnimationView.setProgress(0.0f);
            }
        }
    }

    @JvmOverloads
    public IndexCardStyleLayoutV2(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @JvmOverloads
    public IndexCardStyleLayoutV2(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public IndexCardStyleLayoutV2(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        View.inflate(context, 2131496253, this);
        setOrientation(1);
        View viewFindViewById = findViewById(2131300282);
        this.f78532c = viewFindViewById;
        viewFindViewById.setOnClickListener(this);
        a aVar = new a(this, "double.json", "double_night.json");
        aVar.h.setText(context.getString(2131845330));
        aVar.a();
        LottieAnimationView lottieAnimationView = aVar.f78540f;
        lottieAnimationView.cancelAnimation();
        lottieAnimationView.setProgress(0.0f);
        aVar.f78538d.setImageResource(2131234796);
        View viewFindViewById2 = findViewById(2131311380);
        this.f78533d = viewFindViewById2;
        viewFindViewById2.setOnClickListener(this);
        a aVar2 = new a(viewFindViewById2, "single.json", "single_night.json");
        aVar2.h.setText(context.getString(2131845362));
        aVar2.a();
        LottieAnimationView lottieAnimationView2 = aVar2.f78540f;
        lottieAnimationView2.cancelAnimation();
        lottieAnimationView2.setProgress(0.0f);
        aVar2.f78538d.setImageResource(2131236185);
        if (PegasusStyleKt.currentIsSingleColumn(PegasusStyle.INSTANCE)) {
            aVar2.b(true);
            aVar.b(false);
        } else {
            aVar2.b(false);
            aVar.b(true);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        Function1<? super PegasusStyleEnum, Unit> function1;
        if (view == null) {
            return;
        }
        int id = view.getId();
        if (id == 2131300282) {
            Function1<? super PegasusStyleEnum, Unit> function12 = this.f78534e;
            if (function12 != null) {
                function12.invoke(PegasusStyleEnum.USER_DOUBLE_COLUMN);
                return;
            }
            return;
        }
        if (id != 2131311380 || (function1 = this.f78534e) == null) {
            return;
        }
        function1.invoke(PegasusStyleEnum.USER_SINGLE_COLUMN);
    }

    public final void setOnSideClick(@NotNull Function1<? super PegasusStyleEnum, Unit> function1) {
        if (Intrinsics.areEqual(function1, this.f78534e)) {
            return;
        }
        this.f78534e = function1;
    }
}
