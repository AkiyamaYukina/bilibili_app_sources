package com.bilibili.ship.theseus.cheese.widget;

import Uj0.c;
import W60.w;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import com.bilibili.lib.avatar.AvatarStyle;
import com.bilibili.lib.avatar.NFTPendant;
import com.bilibili.lib.avatar.Pendant;
import com.bilibili.lib.avatar.PendantAvatarView;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.magicasakura.widgets.TintLinearLayout;
import com.bilibili.mobile.BLMobileHumanActionNative;
import e8.h;
import fu0.z;
import kotlin.jvm.JvmOverloads;
import m10.e;
import m10.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/widget/CheeseLivingPendantAvatarView.class */
@StabilityInferred(parameters = 0)
public final class CheeseLivingPendantAvatarView extends PendantAvatarView {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final z f90772j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f90773k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f90774l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f90775m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f90776n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f90777o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f90778p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f90779q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f90780r;

    @JvmOverloads
    public CheeseLivingPendantAvatarView(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @JvmOverloads
    public CheeseLivingPendantAvatarView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public CheeseLivingPendantAvatarView(Context context, AttributeSet attributeSet, int i7, int i8) {
        attributeSet = (i7 & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, 0);
        z zVarInflate = z.inflate(LayoutInflater.from(context), this);
        this.f90772j = zVarInflate;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Zt0.a.f29773a);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f90775m = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 0);
        this.f90774l = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
        this.f90773k = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, 0);
        this.f90776n = typedArrayObtainStyledAttributes.getFloat(8, 0.53f);
        this.f90777o = typedArrayObtainStyledAttributes.getFloat(9, 1.2f);
        this.f90779q = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.f90778p = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        zVarInflate.f119637f.setTextSize(0, this.f90775m);
        Drawable drawable = AppCompatResources.getDrawable(getContext(), 2131232651);
        Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
        if (drawableMutate instanceof GradientDrawable) {
            GradientDrawable gradientDrawable = (GradientDrawable) drawableMutate;
            gradientDrawable.setStroke((int) getAvatarBorderSize(), ResourcesCompat.getColor(getResources(), R$color.f64616Wh0, getContext().getTheme()));
            int i9 = this.f90778p;
            if (i9 != 0) {
                gradientDrawable.setColor(i9);
            }
            zVarInflate.f119635d.setBackground(drawableMutate);
        }
        TintImageView tintImageView = zVarInflate.f119634c;
        int i10 = this.f90778p;
        int colorById = i10 != 0 ? i10 : ThemeUtils.getColorById(getContext(), R$color.main_Pi5, getViewThemeId());
        GradientDrawable gradientDrawableA = h.a(1);
        gradientDrawableA.setStroke((int) (getAvatarBorderSize() / 2), colorById);
        tintImageView.setImageDrawable(gradientDrawableA);
    }

    public final void ensureStyle() {
        super.ensureStyle();
        if (this.f90780r) {
            AvatarStyle sizeStyle = getSizeStyle();
            setSizeStyle(sizeStyle instanceof Pendant ? f.a : sizeStyle instanceof NFTPendant ? e.a : getSizeStyle());
        }
    }

    public final void ensureVisibility() {
        super.ensureVisibility();
        if (this.f90780r) {
            getView().badgeImage.setVisibility(8);
            getView().nftBadgeImage.setVisibility(8);
            getView().pendantImage.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int getAvatarBorderColor() {
        return this.f90780r ? ContextCompat.getColor(getContext(), R$color.f64616Wh0) : super.getAvatarBorderColor();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int getAvatarViewSize() {
        int normalAvatarSize;
        if (this.f90780r) {
            setNormalAvatarSize(c.b(30, getContext()));
            normalAvatarSize = super.getAvatarViewSize();
        } else {
            setNormalAvatarSize(c.b(34, getContext()));
            normalAvatarSize = getNormalAvatarSize();
        }
        return normalAvatarSize;
    }

    public final void j() {
        int avatarBorderSize = (int) getAvatarBorderSize();
        int i7 = this.f90778p;
        if (i7 != 0) {
            this.f90772j.f119636e.setCustomPaintColor(i7);
            this.f90772j.f119633b.setCustomPaintColor(this.f90778p);
        }
        this.f90772j.f119636e.e(avatarBorderSize, (int) (getAvatarImageSize() * this.f90776n), (int) (getAvatarImageSize() * this.f90777o));
        this.f90772j.f119633b.e(avatarBorderSize, (int) (getAvatarImageSize() * this.f90776n), (int) (getAvatarImageSize() * this.f90777o));
        this.f90772j.f119633b.setRepeat(true);
        this.f90772j.f119633b.setOnAnimationStartListener(new w(this));
        this.f90772j.f119633b.b();
        this.f90772j.f119633b.setVisibility(0);
        this.f90772j.f119636e.setVisibility(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.widget.FrameLayout*/.onAttachedToWindow();
        if (this.f90780r) {
            j();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDetachedFromWindow() {
        super/*android.widget.FrameLayout*/.onDetachedFromWindow();
        this.f90772j.f119633b.d();
        this.f90772j.f119636e.d();
        this.f90772j.f119633b.setVisibility(8);
        this.f90772j.f119636e.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        super.onLayout(z6, i7, i8, i9, i10);
        if (this.f90772j.f119634c.getVisibility() != 8) {
            int badgeBorderSize = (int) getBadgeBorderSize();
            this.f90772j.f119634c.layout(getView().avatarImage.getLeft() - badgeBorderSize, getView().avatarImage.getTop() - badgeBorderSize, getView().avatarImage.getRight() + badgeBorderSize, getView().avatarImage.getBottom() + badgeBorderSize);
        } else {
            this.f90772j.f119634c.layout(0, 0, 0, 0);
        }
        TintLinearLayout tintLinearLayout = this.f90772j.f119635d;
        if (tintLinearLayout.getVisibility() == 8) {
            tintLinearLayout.layout(0, 0, 0, 0);
        } else if (this.f90779q == 0) {
            tintLinearLayout.layout(0, this.f90772j.f119634c.getBottom() - tintLinearLayout.getHeight(), getWidth(), this.f90772j.f119634c.getBottom());
        } else {
            tintLinearLayout.layout(0, (this.f90772j.f119634c.getBottom() - tintLinearLayout.getHeight()) + this.f90779q, getWidth(), this.f90772j.f119634c.getBottom() + this.f90779q);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        int avatarViewSize = getAvatarViewSize();
        if (this.f90772j.f119635d.getVisibility() == 0) {
            setMeasuredDimension(this.f90773k, avatarViewSize);
            BLog.d("cheese live avatar onMeasure liveWidth: " + this.f90773k + ", size: " + avatarViewSize);
        }
        this.f90772j.f119635d.measure(View.MeasureSpec.makeMeasureSpec(this.f90773k, BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE), View.MeasureSpec.makeMeasureSpec(this.f90774l, BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getHeight(), BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE);
        this.f90772j.f119633b.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f90772j.f119636e.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f90772j.f119634c.measure(View.MeasureSpec.makeMeasureSpec((((int) getAvatarBorderStyle().getBadgeBorderSize(getContext())) * 2) + getView().avatarImage.getWidth(), BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE), View.MeasureSpec.makeMeasureSpec((((int) getAvatarBorderStyle().getBadgeBorderSize(getContext())) * 2) + getView().avatarImage.getHeight(), BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE));
    }
}
