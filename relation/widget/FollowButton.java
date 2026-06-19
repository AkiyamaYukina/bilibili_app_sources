package com.bilibili.relation.widget;

import AX.g;
import LA.f;
import UR0.D;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import com.bilibili.app.comment3.utils.r;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.magicasakura.widgets.TintLinearLayout;
import com.bilibili.mobile.BLMobileHumanActionNative;
import com.bilibili.relation.utils.FollowFlowHelper;
import com.bilibili.relation.utils.FollowHelperConfig;
import java.util.HashMap;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/widget/FollowButton.class */
@StabilityInferred(parameters = 0)
public class FollowButton extends TintLinearLayout {
    public static final int $stable = 8;

    @NotNull
    public static final a Companion = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final AppCompatImageView f86197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final AppCompatTextView f86198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f86199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f86200f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f86201g;

    @DrawableRes
    public final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @DrawableRes
    public final int f86202i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @ColorRes
    public int f86203j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @ColorRes
    public int f86204k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @ColorInt
    public int f86205l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @ColorInt
    public int f86206m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public Drawable f86207n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public Drawable f86208o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @StringRes
    public final int f86209p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @StringRes
    public final int f86210q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @StringRes
    public final int f86211r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f86212s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Dimension
    public final int f86213t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f86214u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f86215v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f86216w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f86217x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f86218y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public FollowFlowHelper f86219z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/widget/FollowButton$a.class */
    public static final class a {
    }

    @JvmOverloads
    public FollowButton(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @JvmOverloads
    public FollowButton(@Nullable Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f86201g = true;
        this.f86205l = -1;
        this.f86206m = -1;
        this.f86212s = Integer.MAX_VALUE;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, jj.a.a);
        int iA = (int) f.a(16, 1);
        this.f86199e = typedArrayObtainStyledAttributes.getBoolean(8, false);
        this.f86213t = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, 0);
        this.f86200f = typedArrayObtainStyledAttributes.getInt(10, 0);
        this.h = typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.f86202i = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f86203j = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f86204k = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, iA);
        this.f86217x = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, (int) f.a(2, 1));
        this.f86212s = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, Integer.MAX_VALUE);
        this.f86209p = typedArrayObtainStyledAttributes.getResourceId(6, 0);
        this.f86210q = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.f86211r = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (this.f86203j == 0) {
            this.f86203j = this.f86200f == 0 ? R$color.Wh0_u : 2131103284;
        }
        if (this.f86204k == 0) {
            this.f86204k = R$color.main_Ga5;
        }
        if (this.f86213t == 0) {
            this.f86213t = (int) TypedValue.applyDimension(2, this.f86200f == 2 ? 14 : 13, getResources().getDisplayMetrics());
        }
        if (this.h == 0) {
            int i8 = this.f86200f;
            this.h = i8 != 1 ? i8 != 2 ? 2131239681 : 17170445 : 2131239679;
        }
        if (this.f86202i == 0) {
            this.f86202i = this.f86200f == 2 ? 17170445 : 2131239676;
        }
        this.f86215v = dimensionPixelSize;
        this.f86216w = (int) f.a(12, 1);
        int i9 = this.f86215v;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i9, i9);
        layoutParams.rightMargin = this.f86217x;
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
        this.f86197c = appCompatImageView;
        appCompatImageView.setLayoutParams(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f86198d = appCompatTextView;
        appCompatTextView.setLayoutParams(layoutParams2);
        AppCompatTextView appCompatTextView2 = this.f86198d;
        if (appCompatTextView2 != null) {
            appCompatTextView2.setMaxLines(1);
        }
        AppCompatTextView appCompatTextView3 = this.f86198d;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setTextSize(0, this.f86213t);
        }
        addView(this.f86197c);
        addView(this.f86198d);
        setOrientation(0);
        setGravity(17);
    }

    public /* synthetic */ FollowButton(Context context, AttributeSet attributeSet, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i8 & 4) != 0 ? 0 : i7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void bind$default(FollowButton followButton, long j7, boolean z6, boolean z7, int i7, String str, FollowFlowHelper.SimpleCallback simpleCallback, HashMap map, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bind");
        }
        if ((i8 & 64) != 0) {
            map = null;
        }
        followButton.bind(j7, z6, z7, i7, str, simpleCallback, map);
    }

    @Deprecated(message = "Deprecated", replaceWith = @ReplaceWith(expression = "bind(config: FollowButtonConfig)", imports = {}))
    public final void bind(long j7, boolean z6, int i7, @Nullable FollowFlowHelper.SimpleCallback simpleCallback) {
        bind(j7, z6, i7, (String) null, simpleCallback);
    }

    @Deprecated(message = "Deprecated", replaceWith = @ReplaceWith(expression = "bind(config: FollowButtonConfig)", imports = {}))
    public final void bind(long j7, boolean z6, int i7, @Nullable String str, @Nullable FollowFlowHelper.SimpleCallback simpleCallback) {
        if (simpleCallback == null) {
            return;
        }
        updateUI(z6);
        FollowFlowHelper followFlowHelper = new FollowFlowHelper();
        this.f86219z = followFlowHelper;
        followFlowHelper.bind(this, z6, j7, this.f86199e, i7, str, simpleCallback);
    }

    @Deprecated(message = "Deprecated", replaceWith = @ReplaceWith(expression = "bind(config: FollowButtonConfig)", imports = {}))
    public final void bind(long j7, boolean z6, boolean z7, int i7, @Nullable FollowFlowHelper.SimpleCallback simpleCallback) {
        bind$default(this, j7, z6, z7, i7, null, simpleCallback, null, 64, null);
    }

    @Deprecated(message = "Deprecated", replaceWith = @ReplaceWith(expression = "bind(config: FollowButtonConfig)", imports = {}))
    @JvmOverloads
    public final void bind(long j7, boolean z6, boolean z7, int i7, @Nullable String str, @Nullable FollowFlowHelper.SimpleCallback simpleCallback) {
        bind$default(this, j7, z6, z7, i7, str, simpleCallback, null, 64, null);
    }

    @Deprecated(message = "Deprecated", replaceWith = @ReplaceWith(expression = "bind(config: FollowButtonConfig)", imports = {}))
    @JvmOverloads
    public final void bind(long j7, boolean z6, boolean z7, int i7, @Nullable String str, @Nullable FollowFlowHelper.SimpleCallback simpleCallback, @Nullable HashMap<String, String> map) {
        String str2;
        Boolean booleanStrictOrNull;
        if (simpleCallback == null) {
            return;
        }
        updateUI(z6, z7);
        this.f86219z = new FollowFlowHelper();
        if (map != null) {
            map.put(NotificationCompat.CATEGORY_STATUS, D.c(z6, z7));
            FollowFlowHelper followFlowHelper = this.f86219z;
            if (followFlowHelper != null) {
                followFlowHelper.setClickReportExtras(map);
            }
        }
        boolean zBooleanValue = (map == null || (str2 = map.get("showMenuGroup")) == null || (booleanStrictOrNull = StringsKt.toBooleanStrictOrNull(str2)) == null) ? true : booleanStrictOrNull.booleanValue();
        this.f86201g = zBooleanValue;
        FollowFlowHelper followFlowHelper2 = this.f86219z;
        if (followFlowHelper2 != null) {
            followFlowHelper2.setShowMenuGroup(zBooleanValue);
        }
        FollowFlowHelper followFlowHelper3 = this.f86219z;
        if (followFlowHelper3 != null) {
            followFlowHelper3.bind(this, z6, j7, this.f86199e, i7, str, simpleCallback);
        }
    }

    public final void bind(@NotNull FollowButtonConfig followButtonConfig) {
        if (followButtonConfig.getCallback() == null) {
            return;
        }
        if (followButtonConfig.isGuestAttention() == null) {
            updateUI(followButtonConfig.isAttention());
        } else {
            updateUI(followButtonConfig.isAttention(), followButtonConfig.isGuestAttention().booleanValue());
        }
        this.f86219z = new FollowFlowHelper();
        HashMap<String, String> clickReportExtras = followButtonConfig.getClickReportExtras();
        if (clickReportExtras != null) {
            clickReportExtras.put(NotificationCompat.CATEGORY_STATUS, D.c(followButtonConfig.isAttention(), followButtonConfig.isGuestAttention().booleanValue()));
            FollowFlowHelper followFlowHelper = this.f86219z;
            if (followFlowHelper != null) {
                followFlowHelper.setClickReportExtras(clickReportExtras);
            }
        }
        FollowHelperConfig followHelperConfigBuild = new FollowHelperConfig.Builder(this, followButtonConfig.isAttention(), followButtonConfig.getMid(), this.f86199e, followButtonConfig.getFrom(), followButtonConfig.getCallback()).setSpmid(followButtonConfig.getSpmid()).setFromSpmid(followButtonConfig.getFromSpmid()).setFromScmid(followButtonConfig.getFromScmid()).setExtendContent(followButtonConfig.getExtendContent()).build();
        FollowFlowHelper followFlowHelper2 = this.f86219z;
        if (followFlowHelper2 != null) {
            followFlowHelper2.bind(followHelperConfigBuild);
        }
    }

    @ColorInt
    public final int c(boolean z6) {
        int colorById;
        if (z6) {
            int i7 = this.f86205l;
            colorById = i7;
            if (i7 == -1) {
                colorById = ThemeUtils.getColorById(getContext(), this.f86204k, getViewThemeId());
            }
        } else {
            int i8 = this.f86206m;
            colorById = i8;
            if (i8 == -1) {
                colorById = ThemeUtils.getColorById(getContext(), this.f86203j, getViewThemeId());
            }
        }
        return colorById;
    }

    @Nullable
    public final FollowFlowHelper getMFollowFlowHelper() {
        return this.f86219z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        FollowFlowHelper followFlowHelper = this.f86219z;
        if (followFlowHelper != null) {
            followFlowHelper.registerFollowChangeListener();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        FollowFlowHelper followFlowHelper = this.f86219z;
        if (followFlowHelper != null) {
            followFlowHelper.unRegisterFollowChangeListener();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i7, int i8) {
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        AppCompatTextView appCompatTextView = this.f86198d;
        if (appCompatTextView != null) {
            appCompatTextView.measure(0, 0);
        }
        AppCompatImageView appCompatImageView = this.f86197c;
        int visibility = appCompatImageView != null ? appCompatImageView.getVisibility() : 8;
        int i9 = visibility == 0 ? this.f86215v + this.f86217x : 0;
        AppCompatTextView appCompatTextView2 = this.f86198d;
        int measuredWidth = appCompatTextView2 != null ? appCompatTextView2.getMeasuredWidth() : 0;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int i10 = i9 + measuredWidth + paddingRight;
        int minimumWidth = getMinimumWidth();
        int i11 = size;
        if (mode != Integer.MIN_VALUE) {
            i11 = size;
            if (mode != 1073741824) {
                i11 = this.f86212s;
            }
        }
        int i12 = i10 < minimumWidth ? minimumWidth : i10 > i11 ? i11 : i10;
        if (mode == 1073741824 || mode == Integer.MIN_VALUE || i10 > i11) {
            if (i10 <= i12 || visibility != 0) {
                AppCompatImageView appCompatImageView2 = this.f86197c;
                if (appCompatImageView2 != null) {
                    appCompatImageView2.setVisibility(visibility);
                }
            } else {
                AppCompatImageView appCompatImageView3 = this.f86197c;
                if (appCompatImageView3 != null) {
                    appCompatImageView3.setVisibility(8);
                }
            }
            AppCompatImageView appCompatImageView4 = this.f86197c;
            if (appCompatImageView4 == null || appCompatImageView4.getVisibility() != 8 || measuredWidth + paddingRight <= i12) {
                AppCompatTextView appCompatTextView3 = this.f86198d;
                if (appCompatTextView3 != null) {
                    appCompatTextView3.setTextSize(0, this.f86213t);
                }
            } else {
                int i13 = this.f86213t;
                AppCompatTextView appCompatTextView4 = this.f86198d;
                if (appCompatTextView4 != null) {
                    appCompatTextView4.setTextSize(0, i13 - 2);
                }
                AppCompatTextView appCompatTextView5 = this.f86198d;
                if (appCompatTextView5 != null) {
                    appCompatTextView5.measure(0, 0);
                }
            }
        }
        if (mode != 1073741824) {
            i7 = View.MeasureSpec.makeMeasureSpec(i12, BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE);
        }
        super.onMeasure(i7, i8);
    }

    public final void releaseFollowStatus() {
        FollowFlowHelper followFlowHelper = this.f86219z;
        if (followFlowHelper != null) {
            followFlowHelper.unRegisterFollowChangeListener();
        }
        this.f86219z = null;
    }

    public final void setCustomStyle(@ColorInt int i7, @ColorInt int i8, @ColorInt int i9, @ColorInt int i10) {
        Drawable drawableA;
        Drawable drawableA2;
        this.f86205l = i7;
        this.f86206m = i8;
        Drawable drawable = ContextCompat.getDrawable(getContext(), this.f86202i);
        if (drawable == null) {
            drawableA = null;
        } else {
            drawableA = r.a(i9, drawable);
            DrawableCompat.setTintMode(drawable, PorterDuff.Mode.SRC_IN);
        }
        this.f86207n = drawableA;
        Drawable drawable2 = ContextCompat.getDrawable(getContext(), this.h);
        if (drawable2 == null) {
            drawableA2 = null;
        } else {
            drawableA2 = r.a(i10, drawable2);
            DrawableCompat.setTintMode(drawable2, PorterDuff.Mode.SRC_IN);
        }
        this.f86208o = drawableA2;
        updateUI(this.f86214u, this.f86218y);
    }

    public final void setCustomStyle(@ColorInt int i7, @ColorInt int i8, @Nullable Drawable drawable, @Nullable Drawable drawable2) {
        this.f86205l = i7;
        this.f86206m = i8;
        this.f86207n = drawable;
        this.f86208o = drawable2;
        updateUI(this.f86214u, this.f86218y);
    }

    public final void setFollowTextColorRes(@ColorRes int i7) {
        if (i7 != 0) {
            this.f86204k = i7;
        }
        updateUI(this.f86214u, this.f86218y);
    }

    public final void setMFollowFlowHelper(@Nullable FollowFlowHelper followFlowHelper) {
        this.f86219z = followFlowHelper;
    }

    public final void setTextColor(@ColorRes int i7) {
        if (i7 != 0) {
            this.f86203j = i7;
        }
        updateUI(this.f86214u);
    }

    @Override // com.bilibili.magicasakura.widgets.TintLinearLayout, com.bilibili.magicasakura.widgets.Tintable
    public void tint() {
        super.tint();
        if (this.f86197c == null || this.f86198d == null) {
            return;
        }
        updateUI(this.f86214u, this.f86218y);
    }

    public final void updateUI(boolean z6) {
        Drawable drawableCreate;
        int i7;
        this.f86214u = z6;
        FollowFlowHelper followFlowHelper = this.f86219z;
        if (followFlowHelper != null) {
            followFlowHelper.setIsAttention(z6);
        }
        suppressLayout(true);
        try {
            int iC = c(z6);
            if (z6) {
                drawableCreate = null;
                if (this.f86199e) {
                    drawableCreate = !this.f86201g ? null : VectorDrawableCompat.create(getResources(), 2131236673, null);
                }
            } else {
                drawableCreate = VectorDrawableCompat.create(getResources(), 2131236668, null);
            }
            if (drawableCreate == null) {
                AppCompatImageView appCompatImageView = this.f86197c;
                if (appCompatImageView != null) {
                    appCompatImageView.setVisibility(8);
                }
            } else {
                Drawable.ConstantState constantState = drawableCreate.getConstantState();
                Drawable drawableNewDrawable = drawableCreate;
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable();
                    if (drawableNewDrawable == null) {
                        drawableNewDrawable = drawableCreate;
                    }
                }
                Drawable drawableMutate = DrawableCompat.wrap(drawableNewDrawable).mutate();
                DrawableCompat.setTint(drawableMutate, iC);
                AppCompatImageView appCompatImageView2 = this.f86197c;
                if (appCompatImageView2 != null) {
                    appCompatImageView2.setImageDrawable(drawableMutate);
                }
                AppCompatImageView appCompatImageView3 = this.f86197c;
                if (appCompatImageView3 != null) {
                    appCompatImageView3.setVisibility(0);
                }
            }
            AppCompatTextView appCompatTextView = this.f86198d;
            if (appCompatTextView != null) {
                appCompatTextView.setTextColor(iC);
            }
            AppCompatTextView appCompatTextView2 = this.f86198d;
            if (appCompatTextView2 != null) {
                if (z6) {
                    i7 = this.f86209p;
                    if (i7 == 0) {
                        i7 = 2131847636;
                    }
                } else {
                    i7 = this.f86210q;
                    if (i7 == 0) {
                        i7 = 2131847635;
                    }
                }
                appCompatTextView2.setText(i7);
            }
            g.b(this, z6 ? "取消关注" : "关注up主");
            Drawable drawable = z6 ? this.f86207n : this.f86208o;
            if (drawable == null) {
                setBackgroundResource(z6 ? this.f86202i : this.h);
            } else {
                setBackground(drawable);
            }
        } finally {
            suppressLayout(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void updateUI(boolean r5, boolean r6) {
        /*
            Method dump skipped, instruction units count: 543
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.relation.widget.FollowButton.updateUI(boolean, boolean):void");
    }
}
