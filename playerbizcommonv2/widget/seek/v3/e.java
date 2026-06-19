package com.bilibili.playerbizcommonv2.widget.seek.v3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.bilibili.lib.theme.R$color;
import java.util.Iterator;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/seek/v3/e.class */
@StabilityInferred(parameters = 0)
public class e extends AppCompatSeekBar {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f82961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f82962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f82963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f82964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f82965f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f82966g;

    @NotNull
    public final k h;

    public e(@NotNull Context context) {
        this(context, null);
    }

    public e(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public e(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, 2130970800);
        k kVar = new k(ContextCompat.getColor(getContext(), 2131100084), ContextCompat.getColor(getContext(), 2131100086), ContextCompat.getColor(getContext(), R$color.Pi5_u), ContextCompat.getColor(getContext(), R$color.Ga5_u), ContextCompat.getColor(getContext(), R$color.Wh0_u), ContextCompat.getColor(getContext(), R$color.Pi5_u), ContextCompat.getColor(getContext(), R$color.Ga5_u), ContextCompat.getColor(getContext(), 2131100084), NewPlayerUtilsKt.toFloatPx(1.0f), NewPlayerUtilsKt.toFloatPx(1.0f));
        this.h = kVar;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Nh1.a.g);
            int i8 = typedArrayObtainStyledAttributes.getInt(0, 1);
            typedArrayObtainStyledAttributes.recycle();
            kVar.f83012w = i8;
        }
        setSplitTrack(false);
        this.f82966g = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // android.view.View
    public final void draw(@NotNull Canvas canvas) {
        try {
            super.draw(canvas);
        } catch (Exception e7) {
            BLog.e("PlayerDotSeekBar", e7);
        }
    }

    @NotNull
    public final k getSeekbarProgressDrawable() {
        return this.h;
    }

    @Override // androidx.appcompat.widget.AppCompatSeekBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        k kVar = this.h;
        if (kVar.f83015z) {
            kVar.f83013x.setColor(kVar.f82996f);
            canvas.drawRect(kVar.f83006q, kVar.f83013x);
        } else {
            kVar.f83013x.setColor(kVar.f82997g);
            canvas.drawRect(kVar.f83006q, kVar.f83013x);
        }
        kVar.f83013x.setColor(kVar.h);
        canvas.drawRect(kVar.f83007r, kVar.f83013x);
        super.onDraw(canvas);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void onSizeChanged(int i7, int i8, int i9, int i10) {
        try {
            super.onSizeChanged(i7, i8, i9, i10);
        } catch (Exception e7) {
        }
        k kVar = this.h;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        kVar.f83000k = width;
        kVar.f83001l = height;
        kVar.f83002m = paddingLeft;
        kVar.f83003n = paddingTop;
        kVar.f83004o = paddingRight;
        kVar.f83005p = paddingBottom;
        k.d(this.h, this.f82961b, false, true, 2);
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public final boolean onTouchEvent(@Nullable MotionEvent motionEvent) {
        Pair pair;
        boolean z6 = false;
        if (!isEnabled() || getVisibility() != 0 || motionEvent == null) {
            return false;
        }
        float x6 = motionEvent.getX();
        float y6 = motionEvent.getY();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f82962c = false;
            int width = getWidth();
            int paddingLeft = getPaddingLeft();
            float paddingRight = (width - paddingLeft) - getPaddingRight();
            float progress = (getProgress() / getMax()) - ((x6 - getPaddingLeft()) / paddingRight);
            float f7 = progress;
            if (Math.abs(progress * paddingRight) > getThumbOffset()) {
                f7 = 0.0f;
            }
            if (Math.abs(f7) > 0.0f) {
                z6 = true;
            }
            this.f82963d = z6;
            this.f82964e = x6;
            float fMin = ((Math.min(getProgress() + 1, getMax()) / getMax()) * paddingRight) + getPaddingLeft();
            this.f82965f = fMin;
            motionEvent.setLocation(fMin, y6);
            super.onTouchEvent(motionEvent);
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (!this.f82963d) {
                    motionEvent.setLocation((x6 - this.f82964e) + this.f82965f, y6);
                }
                super.onTouchEvent(motionEvent);
                return true;
            }
            if (!this.f82962c && Math.abs(this.f82964e - x6) >= this.f82966g) {
                this.f82962c = true;
            }
            if (!this.f82963d) {
                motionEvent.setLocation((x6 - this.f82964e) + this.f82965f, y6);
            }
            super.onTouchEvent(motionEvent);
            return true;
        }
        if (this.f82962c) {
            if (!this.f82963d) {
                motionEvent.setLocation((x6 - this.f82964e) + this.f82965f, y6);
            }
            super.onTouchEvent(motionEvent);
            return true;
        }
        k kVar = this.h;
        int i7 = kVar.f83008s;
        if (i7 > 0) {
            int i8 = kVar.f83000k;
            int i9 = kVar.f83002m;
            int i10 = kVar.f83004o;
            float f8 = x6 - i9;
            Iterator<s> it = kVar.f83009t.iterator();
            while (true) {
                pair = null;
                if (!it.hasNext()) {
                    break;
                }
                s next = it.next();
                if (next.f83069c) {
                    int i11 = next.f83068b;
                    int i12 = next.f83067a;
                    float f9 = (i11 + i12) / 2.0f;
                    float f10 = i7;
                    float f11 = f9 / f10;
                    float f12 = (i8 - i9) - i10;
                    float f13 = f11 * f12;
                    float fMax = Math.max(24.0f, ((i11 - i12) / f10) * f12) / 2;
                    if (f8 <= fMax + f13 && f13 - fMax <= f8) {
                        pair = new Pair(next, Float.valueOf(f13));
                        break;
                    }
                }
            }
        } else {
            pair = null;
        }
        if (pair != null) {
            motionEvent.setLocation(this.f82965f, y6);
        }
        super.onTouchEvent(motionEvent);
        if (pair == null) {
            return true;
        }
        ((Boolean) ((s) pair.getFirst()).f83070d.invoke(pair.getSecond())).getClass();
        return true;
    }

    public final void setSeeking(boolean z6) {
        this.f82961b = z6;
    }
}
