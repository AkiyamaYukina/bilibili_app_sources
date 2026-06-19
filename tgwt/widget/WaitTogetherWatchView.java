package com.bilibili.tgwt.widget;

import MD0.b;
import Uj0.c;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import com.bilibili.app.comm.supermenu.core.MenuView;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.ImageRequestBuilder;
import com.bilibili.lib.image2.bean.IThumbnailSizeController;
import com.bilibili.lib.image2.bean.ThumbUrlTransformStrategyUtils;
import com.bilibili.lib.image2.view.legacy.ScalableImageView2;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.theme.R$color;
import com.bilibili.tgwt.widget.WaitTogetherWatchView;
import java.util.List;
import java.util.Map;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import lV.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/widget/WaitTogetherWatchView.class */
@StabilityInferred(parameters = 0)
public final class WaitTogetherWatchView extends FrameLayout {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f112330p = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextSwitcher f112331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ScalableImageView2 f112332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ScalableImageView2 f112333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final TextView f112334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ScalableImageView2 f112335e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final View f112336f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final View f112337g;

    @Nullable
    public final View h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final MenuView f112338i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f112339j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f112340k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public b f112341l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public MD0.a f112342m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final a f112343n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final String[] f112344o;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/widget/WaitTogetherWatchView$a.class */
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WaitTogetherWatchView f112345a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Context f112346b;

        /* JADX INFO: renamed from: com.bilibili.tgwt.widget.WaitTogetherWatchView$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/widget/WaitTogetherWatchView$a$a.class */
        public static final class C1222a extends z {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final WaitTogetherWatchView f112347b;

            public C1222a(WaitTogetherWatchView waitTogetherWatchView) {
                this.f112347b = waitTogetherWatchView;
            }

            public final void onClick(View view) {
                Neurons.reportClick$default(false, "pgc.watch-together-cinema.rolling-phrase.change-room.click", (Map) null, 4, (Object) null);
                b bVar = this.f112347b.f112341l;
                if (bVar != null) {
                    bVar.a();
                }
            }
        }

        public a(WaitTogetherWatchView waitTogetherWatchView, Context context) {
            this.f112345a = waitTogetherWatchView;
            this.f112346b = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            WaitTogetherWatchView waitTogetherWatchView = this.f112345a;
            int length = waitTogetherWatchView.f112339j % waitTogetherWatchView.f112344o.length;
            waitTogetherWatchView.f112339j = length;
            TextSwitcher textSwitcher = null;
            if (length == 2) {
                if (!waitTogetherWatchView.f112340k) {
                    Neurons.reportExposure$default(false, "pgc.watch-together-cinema.rolling-phrase.change-room.show", (Map) null, (List) null, 12, (Object) null);
                }
                WaitTogetherWatchView waitTogetherWatchView2 = this.f112345a;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(waitTogetherWatchView2.f112344o[waitTogetherWatchView2.f112339j]);
                spannableStringBuilder.append((CharSequence) " 换放映室");
                C1222a c1222a = new C1222a(this.f112345a);
                WaitTogetherWatchView waitTogetherWatchView3 = this.f112345a;
                spannableStringBuilder.setSpan(c1222a, waitTogetherWatchView3.f112344o[waitTogetherWatchView3.f112339j].length(), spannableStringBuilder.length(), 33);
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(ContextCompat.getColor(this.f112346b, 2131103284));
                WaitTogetherWatchView waitTogetherWatchView4 = this.f112345a;
                spannableStringBuilder.setSpan(foregroundColorSpan, waitTogetherWatchView4.f112344o[waitTogetherWatchView4.f112339j].length(), spannableStringBuilder.length(), 17);
                TextSwitcher textSwitcher2 = this.f112345a.f112331a;
                if (textSwitcher2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mHints");
                } else {
                    textSwitcher = textSwitcher2;
                }
                textSwitcher.setText(spannableStringBuilder);
            } else {
                TextSwitcher textSwitcher3 = waitTogetherWatchView.f112331a;
                if (textSwitcher3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mHints");
                    textSwitcher3 = null;
                }
                WaitTogetherWatchView waitTogetherWatchView5 = this.f112345a;
                textSwitcher3.setText(waitTogetherWatchView5.f112344o[waitTogetherWatchView5.f112339j]);
            }
            WaitTogetherWatchView waitTogetherWatchView6 = this.f112345a;
            waitTogetherWatchView6.f112339j++;
            waitTogetherWatchView6.postDelayed(this, 5000L);
        }
    }

    @JvmOverloads
    public WaitTogetherWatchView(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public WaitTogetherWatchView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public WaitTogetherWatchView(final Context context, AttributeSet attributeSet, int i7) {
        TextSwitcher textSwitcher;
        GradientDrawable gradientDrawable;
        TextSwitcher textSwitcher2;
        TextSwitcher textSwitcher3;
        attributeSet = (i7 & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, 0);
        ViewSwitcher.ViewFactory viewFactory = new ViewSwitcher.ViewFactory(this, context) { // from class: MD0.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final WaitTogetherWatchView f16007a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Context f16008b;

            {
                this.f16007a = this;
                this.f16008b = context;
            }

            @Override // android.widget.ViewSwitcher.ViewFactory
            public final View makeView() {
                WaitTogetherWatchView waitTogetherWatchView = this.f16007a;
                Context context2 = this.f16008b;
                int i8 = WaitTogetherWatchView.f112330p;
                AppCompatTextView appCompatTextView = new AppCompatTextView(waitTogetherWatchView.getContext());
                appCompatTextView.setTextSize(2, 12.0f);
                appCompatTextView.setTextColor(ContextCompat.getColor(context2, 2131103906));
                appCompatTextView.setMovementMethod(LinkMovementMethod.getInstance());
                appCompatTextView.setCompoundDrawablesWithIntrinsicBounds(AppCompatResources.getDrawable(context2, 2131235754), (Drawable) null, (Drawable) null, (Drawable) null);
                TextViewCompat.setCompoundDrawableTintList(appCompatTextView, AppCompatResources.getColorStateList(context2, waitTogetherWatchView.f112340k ? 2131103901 : 2131100304));
                appCompatTextView.setCompoundDrawablePadding(4);
                appCompatTextView.setGravity(17);
                return appCompatTextView;
            }
        };
        this.f112343n = new a(this, context);
        this.f112344o = new String[]{"正在召唤小伙伴陪你一起看~", "你的小伙伴在火速赶来啦~(/ω＼)", "等好久了~去其他放映室坐坐吧~ "};
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AD0.a.f205a, 0, 0);
        boolean z6 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        this.f112340k = z6;
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = z6 ? LayoutInflater.from(context).inflate(2131500192, (ViewGroup) this, false) : LayoutInflater.from(context).inflate(2131500204, (ViewGroup) this, false);
        if (!z6) {
            this.h = viewInflate.findViewById(2131297693);
            this.f112338i = viewInflate.findViewById(2131311215);
        }
        this.f112332b = viewInflate.findViewById(2131296796);
        TextSwitcher textSwitcher4 = (TextSwitcher) viewInflate.findViewById(2131313154);
        this.f112331a = textSwitcher4;
        this.f112337g = viewInflate.findViewById(2131298069);
        this.f112333c = viewInflate.findViewById(2131297008);
        this.f112334d = (TextView) viewInflate.findViewById(2131313153);
        this.f112335e = viewInflate.findViewById(2131302953);
        this.f112336f = viewInflate.findViewById(2131299341);
        if (textSwitcher4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHints");
            textSwitcher = null;
        } else {
            textSwitcher = textSwitcher4;
        }
        if (z6) {
            gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(c.a(15.0f, context));
            gradientDrawable.setColor(234881023);
        } else {
            gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(c.a(15.0f, context));
            gradientDrawable.setColor(ContextCompat.getColor(context, R$color.Ga1_s));
        }
        textSwitcher.setBackground(gradientDrawable);
        if (textSwitcher4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHints");
            textSwitcher2 = null;
        } else {
            textSwitcher2 = textSwitcher4;
        }
        textSwitcher2.setFactory(viewFactory);
        if (textSwitcher4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHints");
            textSwitcher3 = null;
        } else {
            textSwitcher3 = textSwitcher4;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setDuration(300L);
        textSwitcher3.setInAnimation(translateAnimation);
        TextSwitcher textSwitcher5 = textSwitcher4;
        if (textSwitcher4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHints");
            textSwitcher5 = null;
        }
        TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
        translateAnimation2.setDuration(300L);
        textSwitcher5.setOutAnimation(translateAnimation2);
        ImageRequestBuilder.enableAutoPlayAnimation$default(ImageRequestBuilder.enableAnimate$default(BiliImageLoader.INSTANCE.with(context).thumbnailUrlTransformStrategy(ThumbUrlTransformStrategyUtils.stylingStrategy$default("common-ogv", (IThumbnailSizeController) null, 2, (Object) null)).url("http://i0.hdslb.com/bfs/bangumi/image/4274b4139286eb1852c53d9bbd592c21372d8818.webp"), true, (Boolean) null, 2, (Object) null), true, false, 2, (Object) null).into(viewInflate.findViewById(2131320431));
        addView(viewInflate);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        post(this.f112343n);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f112343n);
    }

    public final void setMasterAvatar(@Nullable String str) {
        BiliImageLoader.INSTANCE.with(getContext()).thumbnailUrlTransformStrategy(ThumbUrlTransformStrategyUtils.stylingStrategy$default("common-ogv", (IThumbnailSizeController) null, 2, (Object) null)).url(str).into(this.f112332b);
    }

    public final void setShareMenuListener(@Nullable MD0.a aVar) {
        this.f112342m = aVar;
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        if (getVisibility() != i7) {
            if (i7 == 0) {
                post(this.f112343n);
            } else {
                removeCallbacks(this.f112343n);
            }
        }
        super.setVisibility(i7);
    }

    public final void setWaitTogetherClickListener(@Nullable b bVar) {
        this.f112341l = bVar;
    }
}
