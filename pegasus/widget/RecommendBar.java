package com.bilibili.pegasus.widget;

import OS0.y0;
import OS0.z0;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.graphics.drawable.DrawableCompat;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.ui.util.NightTheme;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.magicasakura.widgets.TintConstraintLayout;
import com.bilibili.magicasakura.widgets.TintTextView;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import op0.C8250b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sp0.C8614c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/widget/RecommendBar.class */
@StabilityInferred(parameters = 0)
public final class RecommendBar extends TintConstraintLayout {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f79122k = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f79123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Lazy f79124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Lazy f79125f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f79126g;
    public final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f79127i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public jp0.e f79128j;

    @JvmOverloads
    public RecommendBar(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @JvmOverloads
    public RecommendBar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RecommendBar(Context context, AttributeSet attributeSet, int i7, int i8) {
        attributeSet = (i7 & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f79123d = LazyKt.lazy(lazyThreadSafetyMode, new y0(this, 1));
        this.f79124e = LazyKt.lazy(lazyThreadSafetyMode, new z0(this, 1));
        this.f79125f = LazyKt.lazy(lazyThreadSafetyMode, new HT0.b(this, 2));
        this.f79126g = ListExtentionsKt.toPx(10.0f);
        this.h = (int) TypedValue.applyDimension(2, 12.0f, getResources().getDisplayMetrics());
        View.inflate(context, 2131498416, this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Zp0.a.f29692a);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i9 = 0; i9 < indexCount; i9++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i9);
            if (index == 2) {
                setRecommendReasonSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.h));
            } else if (index == 1) {
                setRecommendReasonColor(typedArrayObtainStyledAttributes.getColor(index, -1));
            } else if (index == 0) {
                setRightIcon(typedArrayObtainStyledAttributes.getResourceId(index, 2131235816));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        tint();
    }

    private final BiliImageView getMLeftIcon() {
        return (BiliImageView) this.f79123d.getValue();
    }

    private final TintTextView getMReason() {
        return (TintTextView) this.f79124e.getValue();
    }

    private final ImageView getMRightIcon() {
        return (ImageView) this.f79125f.getValue();
    }

    public final void j0() {
        String strL;
        GradientDrawable gradientDrawable;
        jp0.e eVar = this.f79128j;
        if (eVar == null || (strL = eVar.l()) == null || StringsKt.isBlank(strL)) {
            setVisibility(8);
            return;
        }
        if (getVisibility() != 0) {
            setVisibility(0);
        }
        jp0.e eVar2 = this.f79128j;
        if (eVar2 != null) {
            setRecommendReason(eVar2.l());
            Drawable drawableMutate = DrawableCompat.wrap(getMRightIcon().getDrawable()).mutate();
            if (drawableMutate.isStateful()) {
                drawableMutate.setState(getMRightIcon().getDrawableState());
            }
            if (this.f79127i) {
                getMLeftIcon().getGenericProperties().setPlaceholderImage(ListExtentionsKt.getDrawableFromCache$default(2131236063, 0, false, (Function0) null, 14, (Object) null));
                setLeftIcon(eVar2.h());
                getMReason().setTextColor(C8250b.a(eVar2.n()));
                getMRightIcon().setImageDrawable(ThemeUtils.tintDrawable(drawableMutate, C8250b.a(eVar2.n())));
            } else {
                getMLeftIcon().getGenericProperties().setPlaceholderImage(ListExtentionsKt.getDrawableFromCache$default(2131236063, 0, false, (Function0) null, 14, (Object) null));
                setLeftIcon(eVar2.j());
                getMReason().setTextColor(C8250b.a(eVar2.m()));
                getMRightIcon().setImageDrawable(ThemeUtils.tintDrawable(drawableMutate, C8250b.a(eVar2.m())));
            }
            int iA = C8250b.a(eVar2.a());
            int iA2 = C8250b.a(eVar2.b());
            int iA3 = C8250b.a(eVar2.d());
            int iA4 = C8250b.a(eVar2.e());
            int iC = eVar2.c();
            GradientDrawable gradientDrawable2 = null;
            if (iC == 1) {
                Drawable drawableFromCache$default = ListExtentionsKt.getDrawableFromCache$default(2131239892, 0, false, (Function0) null, 14, (Object) null);
                if (drawableFromCache$default instanceof GradientDrawable) {
                    gradientDrawable2 = (GradientDrawable) drawableFromCache$default;
                }
                if (gradientDrawable2 != null) {
                    int i7 = iA;
                    if (this.f79127i) {
                        i7 = iA2;
                    }
                    gradientDrawable2.setColor(i7);
                }
                if (gradientDrawable2 != null) {
                    gradientDrawable2.setCornerRadius(this.f79126g);
                }
                gradientDrawable = gradientDrawable2;
                if (gradientDrawable2 != null) {
                    gradientDrawable2.setStroke(0, 0);
                    gradientDrawable = gradientDrawable2;
                }
            } else if (iC != 2) {
                gradientDrawable = null;
            } else {
                Drawable drawableFromCache$default2 = ListExtentionsKt.getDrawableFromCache$default(2131240031, 0, false, (Function0) null, 14, (Object) null);
                GradientDrawable gradientDrawable3 = null;
                if (drawableFromCache$default2 instanceof GradientDrawable) {
                    gradientDrawable3 = (GradientDrawable) drawableFromCache$default2;
                }
                if (gradientDrawable3 != null) {
                    gradientDrawable3.setColor(0);
                }
                if (gradientDrawable3 != null) {
                    gradientDrawable3.setCornerRadius(this.f79126g);
                }
                gradientDrawable = gradientDrawable3;
                if (gradientDrawable3 != null) {
                    int px = ListExtentionsKt.toPx(0.5f);
                    if (this.f79127i) {
                        iA3 = iA4;
                    }
                    gradientDrawable3.setStroke(px, iA3);
                    gradientDrawable = gradientDrawable3;
                }
            }
            int measuredHeight = getMeasuredHeight();
            int i8 = this.f79126g;
            if (measuredHeight < i8) {
                if (gradientDrawable != null) {
                    gradientDrawable.setCornerRadius(i8);
                }
                getViewTreeObserver().addOnGlobalLayoutListener(new i(this));
            } else if (gradientDrawable != null) {
                gradientDrawable.setCornerRadius(getMeasuredHeight() / 2.0f);
            }
            setBackgroundDrawable(gradientDrawable);
        }
    }

    public final void setLeftIcon(@Nullable String str) {
        C8614c.c(getMLeftIcon(), str);
    }

    public final void setRecommendReason(@StringRes int i7) {
        getMReason().setText(i7);
    }

    public final void setRecommendReason(@Nullable CharSequence charSequence) {
        String str;
        TintTextView mReason = getMReason();
        String string = charSequence != null ? charSequence.toString() : null;
        if (string == null || StringsKt.isBlank(string)) {
            str = "";
        } else {
            char[] charArray = string.toCharArray();
            int length = charArray.length;
            int i7 = 0;
            int i8 = 0;
            while (i7 < length) {
                char c7 = charArray[i7];
                if (c7 == 12288) {
                    charArray[i8] = ' ';
                } else if (65281 <= c7 && c7 <= 65374) {
                    charArray[i8] = (char) (c7 - 65248);
                }
                i7++;
                i8++;
            }
            str = new String(charArray);
        }
        mReason.setText(str);
    }

    public final void setRecommendReasonColor(@ColorInt int i7) {
        getMReason().setTextColor(i7);
    }

    public final void setRecommendReasonSize(float f7) {
        getMReason().setTextSize(0, f7);
    }

    public final void setRightIcon(@DrawableRes int i7) {
        getMRightIcon().setImageResource(i7);
    }

    public final void setTagData(@Nullable jp0.e eVar) {
        this.f79128j = eVar;
        j0();
    }

    @Override // com.bilibili.magicasakura.widgets.TintConstraintLayout, androidx.constraintlayout.widget.ConstraintLayout, com.bilibili.magicasakura.widgets.Tintable
    public final void tint() {
        this.f79127i = NightTheme.isNightTheme(getContext());
        j0();
    }
}
