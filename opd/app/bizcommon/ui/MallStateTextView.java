package com.bilibili.opd.app.bizcommon.ui;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RotateDrawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import com.bilibili.lib.theme.R$color;
import com.bilibili.opd.app.bizcommon.context.KFCFragmentLoaderActivity;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/ui/MallStateTextView.class */
public final class MallStateTextView extends AppCompatTextView {

    @NotNull
    public static final a Companion = new Object();
    public static final int DRAWABLE_GRAVITY_END = 1;
    public static final int DRAWABLE_GRAVITY_START = 0;
    public static final int DRAWABLE_GRAVITY_TEXT_END = 3;
    public static final int DRAWABLE_GRAVITY_TEXT_START = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f74532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f74533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f74534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f74535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Drawable f74536e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f74537f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f74538g;
    public final float h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Paint f74539i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final RectF f74540j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f74541k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f74542l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f74543m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public State f74544n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f74545o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public final ValueAnimator f74546p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final Paint f74547q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final Paint f74548r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final Paint f74549s;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/ui/MallStateTextView$State.class */
    public static final class State {
        private static final EnumEntries $ENTRIES;
        private static final State[] $VALUES;
        public static final State NORMAL = new State("NORMAL", 0);
        public static final State STATE_RUNNING = new State("STATE_RUNNING", 1);

        private static final /* synthetic */ State[] $values() {
            return new State[]{NORMAL, STATE_RUNNING};
        }

        static {
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(stateArr$values);
        }

        private State(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<State> getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/ui/MallStateTextView$a.class */
    public static final class a {
    }

    @JvmOverloads
    public MallStateTextView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public MallStateTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @JvmOverloads
    public MallStateTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        Drawable drawable;
        Drawable drawableMutate;
        super(context, attributeSet, i7);
        Paint paint = new Paint();
        paint.setColor(ResourcesCompat.getColor(context.getResources(), R$color.Ba0, null));
        paint.setAlpha(25);
        paint.setStyle(Paint.Style.FILL);
        this.f74539i = paint;
        this.f74540j = new RectF();
        this.f74543m = true;
        State state = State.NORMAL;
        this.f74544n = state;
        this.f74545o = -1;
        Paint paint2 = new Paint();
        this.f74547q = paint2;
        Paint paint3 = new Paint();
        this.f74548r = paint3;
        Paint paint4 = new Paint();
        this.f74549s = paint4;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, Cn0.a.f1640d);
        this.f74532a = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
        this.f74533b = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.f74544n = typedArrayObtainStyledAttributes.getInteger(10, 0) == 1 ? State.STATE_RUNNING : state;
        this.f74543m = typedArrayObtainStyledAttributes.getBoolean(0, true);
        this.f74534c = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, 0);
        this.f74535d = typedArrayObtainStyledAttributes.getColor(8, 0);
        K();
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        if (resourceId != 0) {
            this.f74536e = AppCompatResources.getDrawable(context, resourceId);
        }
        Drawable drawable2 = this.f74536e;
        RotateDrawable rotateDrawable = drawable2 instanceof RotateDrawable ? (RotateDrawable) drawable2 : null;
        if (rotateDrawable != null) {
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(rotateDrawable, "level", 0, KFCFragmentLoaderActivity.REQ_CODE_LOGIN);
            this.f74546p = objectAnimatorOfInt;
            if (objectAnimatorOfInt != null) {
                objectAnimatorOfInt.setRepeatCount(-1);
            }
            if (objectAnimatorOfInt != null) {
                objectAnimatorOfInt.setDuration(800L);
            }
            if (objectAnimatorOfInt != null) {
                objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
            }
        }
        int color = typedArrayObtainStyledAttributes.getColor(2, 0);
        this.f74541k = color;
        if (color != 0 && (drawable = this.f74536e) != null && (drawableMutate = drawable.mutate()) != null) {
            DrawableCompat.setTint(drawableMutate, this.f74541k);
        }
        this.f74537f = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 0);
        this.f74542l = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.f74538g = typedArrayObtainStyledAttributes.getInteger(3, 0);
        typedArrayObtainStyledAttributes.recycle();
        setCompoundDrawablePadding(this.f74542l);
        this.h = getAlpha();
        paint2.setAntiAlias(true);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        paint3.setAntiAlias(true);
        paint4.setAntiAlias(true);
        paint4.setStyle(Paint.Style.STROKE);
        if (getBackground() == null) {
            setBackgroundColor(getResources().getColor(R.color.transparent));
        }
    }

    public /* synthetic */ MallStateTextView(Context context, AttributeSet attributeSet, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i8 & 2) != 0 ? null : attributeSet, (i8 & 4) != 0 ? 0 : i7);
    }

    private static /* synthetic */ void getMStateDrawableGravity$annotations() {
    }

    private final void setInnerRadius(@FloatRange(from = 0.0d) float f7) {
        this.f74532a = f7;
    }

    public final void J() {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        ValueAnimator valueAnimator3;
        ValueAnimator valueAnimator4;
        if (this.f74544n != State.STATE_RUNNING) {
            if ((this.f74536e instanceof RotateDrawable) && (valueAnimator = this.f74546p) != null && valueAnimator.isRunning() && (valueAnimator2 = this.f74546p) != null) {
                valueAnimator2.cancel();
            }
            setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        if ((this.f74536e instanceof RotateDrawable) && (valueAnimator3 = this.f74546p) != null && !valueAnimator3.isRunning() && (valueAnimator4 = this.f74546p) != null) {
            valueAnimator4.start();
        }
        if (CollectionsKt.listOf(new Integer[]{0, 2}).contains(Integer.valueOf(this.f74538g))) {
            TextViewCompat.setCompoundDrawablesRelative(this, this.f74536e, null, null, null);
        } else {
            TextViewCompat.setCompoundDrawablesRelative(this, null, null, this.f74536e, null);
        }
    }

    public final void K() {
        this.f74549s.setColor(this.f74535d);
        this.f74549s.setStrokeWidth(this.f74534c);
        invalidate();
    }

    public final void L(boolean z6) {
        Drawable drawable = this.f74536e;
        if (drawable != null) {
            Drawable drawableMutate = DrawableCompat.wrap(drawable).mutate();
            this.f74536e = drawableMutate;
            int intrinsicWidth = this.f74537f;
            if (intrinsicWidth == 0) {
                intrinsicWidth = drawableMutate.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f74537f;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f74536e.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f74536e;
            int i7 = this.f74545o;
            drawable2.setBounds(i7, 0, intrinsicWidth + i7, intrinsicHeight);
        }
        boolean zContains = CollectionsKt.listOf(new Integer[]{0, 2}).contains(Integer.valueOf(this.f74538g));
        if (z6) {
            J();
            return;
        }
        Drawable[] compoundDrawablesRelative = TextViewCompat.getCompoundDrawablesRelative(this);
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[2];
        if ((!zContains || drawable3 == this.f74536e) && (zContains || drawable4 == this.f74536e)) {
            return;
        }
        J();
    }

    public final void M() {
        if (this.f74536e == null || getLayout() == null || this.f74544n != State.STATE_RUNNING) {
            return;
        }
        int i7 = this.f74538g;
        if (i7 == 0 || i7 == 1) {
            this.f74545o = 0;
            L(false);
            return;
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        String string2 = string;
        if (getTransformationMethod() != null) {
            string2 = getTransformationMethod().getTransformation(string, this).toString();
        }
        int iMin = Math.min((int) paint.measureText(string2), getLayout().getEllipsizedWidth());
        int i8 = this.f74537f;
        int intrinsicWidth = i8;
        if (i8 == 0) {
            Drawable drawable = this.f74536e;
            intrinsicWidth = drawable != null ? drawable.getIntrinsicWidth() : 0;
        }
        int measuredWidth = (((((getMeasuredWidth() - iMin) - ViewCompat.getPaddingEnd(this)) - intrinsicWidth) - this.f74542l) - ViewCompat.getPaddingStart(this)) / 2;
        int i9 = measuredWidth;
        if (this.f74538g != 2) {
            i9 = -measuredWidth;
        }
        if (this.f74545o != i9) {
            this.f74545o = i9;
            L(false);
        }
    }

    @Override // android.view.View
    public void draw(@NotNull Canvas canvas) {
        float fMin = Math.min(this.f74532a, Math.min(this.f74540j.width(), this.f74540j.height()) * 0.5f);
        canvas.saveLayer(this.f74540j, this.f74548r, 31);
        canvas.drawRoundRect(this.f74540j, fMin, fMin, this.f74548r);
        canvas.saveLayer(this.f74540j, this.f74547q, 31);
        super.draw(canvas);
        canvas.restore();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f74546p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        float fMin = Math.min(this.f74532a, Math.min(this.f74540j.width(), this.f74540j.height()) * 0.5f);
        if (isPressed() && this.f74543m) {
            canvas.drawRoundRect(this.f74540j, fMin, fMin, this.f74539i);
        }
        if (this.f74549s.getStrokeWidth() > 0.0f) {
            canvas.drawRoundRect(this.f74540j, fMin, fMin, this.f74549s);
        }
        super.onDraw(canvas);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        setRound(this.f74533b);
        this.f74540j.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        M();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void onTextChanged(@Nullable CharSequence charSequence, int i7, int i8, int i9) {
        super.onTextChanged(charSequence, i7, i8, i9);
        M();
    }

    public final void setEnableColorRule(boolean z6) {
        this.f74543m = z6;
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z6) {
        if (z6) {
            setAlpha(this.h);
        } else if (getAlpha() == this.h && this.f74543m) {
            setAlpha(getAlpha() * 0.5f);
        }
        super.setEnabled(z6);
    }

    @Override // android.view.View
    public void setPressed(boolean z6) {
        invalidate();
        super.setPressed(z6);
    }

    public final void setRadius(@FloatRange(from = 0.0d) float f7) {
        this.f74533b = false;
        this.f74532a = f7;
    }

    public final void setRound(boolean z6) {
        this.f74533b = z6;
        int measuredHeight = getMeasuredHeight();
        if (this.f74533b) {
            setInnerRadius(measuredHeight / 2.0f);
        }
    }

    public final void setState(@NotNull State state) {
        if (state != this.f74544n) {
            this.f74544n = state;
            L(true);
        }
    }

    public final void setStateDrawable(@Nullable Drawable drawable) {
        if (drawable != this.f74536e) {
            this.f74536e = drawable;
            L(true);
        }
    }

    public final void setStateDrawableColor(@ColorInt int i7) {
        Drawable drawableMutate;
        if (i7 != 0) {
            this.f74541k = i7;
            Drawable drawable = this.f74536e;
            if (drawable == null || (drawableMutate = drawable.mutate()) == null) {
                return;
            }
            DrawableCompat.setTint(drawableMutate, this.f74541k);
        }
    }

    public final void setStateDrawableGravity(int i7) {
        if (i7 != this.f74538g) {
            this.f74538g = i7;
            M();
        }
    }

    public final void setStateDrawablePadding(int i7) {
        if (i7 != this.f74542l) {
            this.f74542l = i7;
            setCompoundDrawablePadding(i7);
        }
    }

    public final void setStateDrawableSize(int i7) {
        if (this.f74537f != i7) {
            this.f74537f = i7;
            L(true);
        }
    }

    public final void setStrokeColor(@ColorInt int i7) {
        if (i7 != 0) {
            this.f74535d = i7;
        }
        K();
    }

    public final void setStrokeWidth(float f7) {
        this.f74534c = f7;
        K();
    }
}
