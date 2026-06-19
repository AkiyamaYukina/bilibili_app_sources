package com.bilibili.playerbizcommon.widget.function.timer;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.appcompat.widget.C3259x;
import androidx.core.content.ContextCompat;
import com.bilibili.lib.theme.R$color;
import com.bilibili.mediacore.mediacodec.MediaCodecInfoHelper;
import com.bilibili.mobile.BLMobileHumanActionNative;
import hr0.C7491b;
import java.text.NumberFormat;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import n.C8047a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.utils.DpUtils;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/function/timer/PlayerTimePicker.class */
public final class PlayerTimePicker extends LinearLayout {

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public static final int f80715s1 = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @Nullable
    public d f80716A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f80717B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @NotNull
    public final SparseArray<String> f80718C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f80719D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f80720E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f80721F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @NotNull
    public int[] f80722G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final Paint f80723H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f80724I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f80725J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f80726K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final C7491b f80727L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final C7491b f80728M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f80729N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f80730O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    @Nullable
    public a f80731P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public float f80732Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public float f80733R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public float f80734S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public float f80735T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    @Nullable
    public VelocityTracker f80736U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final int f80737V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final int f80738W;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public int f80739X0;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public final int f80740Y0;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public int f80741Z0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditText f80742a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f80743a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public int f80744a1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f80745b;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public int f80746b1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f80747c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f80748c0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public int f80749c1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f80750d;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public int f80751d1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f80752e;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public int f80753e1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f80754f;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public int f80755f1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f80756g;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public int f80757g1;
    public boolean h;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public int f80758h1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f80759i;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public int f80760i1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f80761j;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public boolean f80762j1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f80763k;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public float f80764k1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f80765l;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public boolean f80766l1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f80767m;
    public float m1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f80768n;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public int f80769n1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f80770o;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public boolean f80771o1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f80772p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f80773p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public NumberFormat f80774p1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f80775q;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public final ViewConfiguration f80776q1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f80777r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public Drawable f80778r0;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public int f80779r1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f80780s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f80781t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public String[] f80782u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f80783v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f80784v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f80785w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f80786x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public View.OnClickListener f80787y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public c f80788z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/function/timer/PlayerTimePicker$a.class */
    public final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f80789a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PlayerTimePicker f80790b;

        public a(PlayerTimePicker playerTimePicker) {
            this.f80790b = playerTimePicker;
        }

        @Override // java.lang.Runnable
        public final void run() {
            PlayerTimePicker playerTimePicker = this.f80790b;
            boolean z6 = this.f80789a;
            int i7 = PlayerTimePicker.f80715s1;
            playerTimePicker.a(z6);
            PlayerTimePicker playerTimePicker2 = this.f80790b;
            playerTimePicker2.postDelayed(this, playerTimePicker2.f80717B);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/function/timer/PlayerTimePicker$b.class */
    public interface b {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/function/timer/PlayerTimePicker$c.class */
    public interface c {
        void a();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/function/timer/PlayerTimePicker$d.class */
    public interface d {
        @NotNull
        String format(int i7);
    }

    public PlayerTimePicker(@NotNull Context context) {
        this(context, null, 0);
    }

    public PlayerTimePicker(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayerTimePicker(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, 0);
        int color = ContextCompat.getColor(getContext(), R$color.Wh0_u);
        this.f80750d = 1;
        this.f80752e = color;
        this.f80754f = 16.0f;
        this.f80767m = true;
        this.f80768n = 1;
        this.f80770o = color;
        this.f80772p = 14.0f;
        this.f80783v = 1;
        this.f80785w = 100;
        this.f80717B = 300L;
        this.f80718C = new SparseArray<>();
        this.f80719D = 7;
        this.f80720E = 7;
        this.f80721F = 3;
        this.f80722G = new int[7];
        this.f80725J = Integer.MIN_VALUE;
        this.f80748c0 = true;
        this.f80773p0 = true;
        this.f80784v0 = color;
        this.f80755f1 = 0;
        this.f80757g1 = -1;
        this.f80762j1 = true;
        this.f80764k1 = 0.9f;
        this.f80766l1 = true;
        this.m1 = 1.0f;
        this.f80769n1 = 8;
        this.f80771o1 = true;
        this.f80774p1 = NumberFormat.getInstance();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iApplyDimension = (int) TypedValue.applyDimension(1, 48, displayMetrics);
        int iApplyDimension2 = (int) TypedValue.applyDimension(1, 2, displayMetrics);
        this.f80739X0 = iApplyDimension;
        this.f80740Y0 = 360;
        this.f80741Z0 = iApplyDimension2;
        this.f80753e1 = 0;
        this.f80760i1 = 0;
        this.f80758h1 = 1;
        t();
        setWillNotDraw(false);
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(2131496471, (ViewGroup) this, true);
        EditText editText = (EditText) findViewById(2131308145);
        this.f80742a = editText;
        EditText editText2 = editText;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSelectedText");
            editText2 = null;
        }
        editText2.setEnabled(false);
        EditText editText3 = this.f80742a;
        EditText editText4 = editText3;
        if (editText3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSelectedText");
            editText4 = null;
        }
        editText4.setFocusable(false);
        EditText editText5 = this.f80742a;
        EditText editText6 = editText5;
        if (editText5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSelectedText");
            editText6 = null;
        }
        editText6.setImeOptions(1);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        this.f80723H = paint;
        setSelectedTextColor(this.f80752e);
        setTextColor(this.f80770o);
        setTextSize(this.f80772p);
        setSelectedTextSize(this.f80754f);
        setFormatter(this.f80716A);
        v();
        setMaxValue(this.f80785w);
        setMinValue(this.f80783v);
        setWheelItemCount(this.f80719D);
        setWrapSelectorWheel(this.f80748c0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f80776q1 = viewConfiguration;
        ViewConfiguration viewConfiguration2 = viewConfiguration;
        if (viewConfiguration == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewConfiguration");
            viewConfiguration2 = null;
        }
        this.f80737V = viewConfiguration2.getScaledTouchSlop();
        ViewConfiguration viewConfiguration3 = this.f80776q1;
        ViewConfiguration viewConfiguration4 = viewConfiguration3;
        if (viewConfiguration3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewConfiguration");
            viewConfiguration4 = null;
        }
        this.f80738W = viewConfiguration4.getScaledMinimumFlingVelocity();
        ViewConfiguration viewConfiguration5 = this.f80776q1;
        ViewConfiguration viewConfiguration6 = viewConfiguration5;
        if (viewConfiguration5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewConfiguration");
            viewConfiguration6 = null;
        }
        this.f80743a0 = viewConfiguration6.getScaledMaximumFlingVelocity() / this.f80769n1;
        this.f80727L = new C7491b(getContext(), null);
        this.f80728M = new C7491b(getContext(), new DecelerateInterpolator(2.5f));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        if (Build.VERSION.SDK_INT < 26 || getFocusable() != 16) {
            return;
        }
        setFocusable(1);
        setFocusableInTouchMode(true);
    }

    private final float getMaxTextSize() {
        return RangesKt.coerceAtLeast(this.f80772p, this.f80754f);
    }

    private final int[] getSelectorIndices() {
        return this.f80722G;
    }

    public static int l(int i7, int i8) {
        if (i8 == -1) {
            return i7;
        }
        int size = View.MeasureSpec.getSize(i7);
        int mode = View.MeasureSpec.getMode(i7);
        if (mode == Integer.MIN_VALUE) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i8), BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE);
        }
        if (mode == 0) {
            return View.MeasureSpec.makeMeasureSpec(i8, BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE);
        }
        if (mode == 1073741824) {
            return i7;
        }
        throw new IllegalArgumentException(C3259x.a(mode, "Unknown measure mode: "));
    }

    public static void p(PlayerTimePicker playerTimePicker, boolean z6) {
        long longPressTimeout = ViewConfiguration.getLongPressTimeout();
        Runnable runnable = playerTimePicker.f80731P;
        if (runnable == null) {
            playerTimePicker.f80731P = new a(playerTimePicker);
        } else {
            playerTimePicker.removeCallbacks(runnable);
        }
        a aVar = playerTimePicker.f80731P;
        if (aVar != null) {
            aVar.f80789a = z6;
        }
        playerTimePicker.postDelayed(aVar, longPressTimeout);
    }

    public static int r(int i7, int i8, int i9) {
        int i10;
        if (i7 == -1) {
            return i8;
        }
        int iMax = Math.max(i7, i8);
        int mode = View.MeasureSpec.getMode(i9);
        int size = View.MeasureSpec.getSize(i9);
        if (mode != Integer.MIN_VALUE) {
            i10 = mode != 1073741824 ? iMax : size;
        } else {
            i10 = iMax;
            if (size < iMax) {
                i10 = 16777216 | size;
            }
        }
        return i10;
    }

    public final void a(boolean z6) {
        C7491b c7491b = this.f80727L;
        C7491b c7491b2 = c7491b;
        if (c7491b == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFlingPlayerTimerPickerScroller");
            c7491b2 = null;
        }
        if (!m(c7491b2)) {
            C7491b c7491b3 = this.f80728M;
            C7491b c7491b4 = c7491b3;
            if (c7491b3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdjustPlayerTimerPickerScroller");
                c7491b4 = null;
            }
            m(c7491b4);
        }
        int i7 = z6 ? -this.f80724I : this.f80724I;
        if (k()) {
            this.f80729N = 0;
            C7491b c7491b5 = this.f80727L;
            if (c7491b5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFlingPlayerTimerPickerScroller");
                c7491b5 = null;
            }
            c7491b5.b(i7, 0, 300);
        } else {
            this.f80730O = 0;
            C7491b c7491b6 = this.f80727L;
            if (c7491b6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFlingPlayerTimerPickerScroller");
                c7491b6 = null;
            }
            c7491b6.b(0, i7, 300);
        }
        invalidate();
    }

    public final void b(int[] iArr) {
        for (int length = iArr.length - 1; length > 0; length--) {
            iArr[length] = iArr[length - 1];
        }
        int i7 = iArr[1] - 1;
        int i8 = i7;
        if (this.f80748c0) {
            i8 = i7;
            if (i7 < this.f80783v) {
                i8 = this.f80785w;
            }
        }
        iArr[0] = i8;
        c(i8);
    }

    public final void c(int i7) {
        String strF;
        SparseArray<String> sparseArray = this.f80718C;
        if (sparseArray.get(i7) != null) {
            return;
        }
        int i8 = this.f80783v;
        if (i7 < i8 || i7 > this.f80785w) {
            strF = "";
        } else {
            String[] strArr = this.f80782u;
            if (strArr != null) {
                int i9 = i7 - i8;
                if (i9 >= strArr.length) {
                    sparseArray.remove(i7);
                    return;
                }
                strF = strArr[i9];
            } else {
                strF = f(i7);
            }
        }
        sparseArray.put(i7, strF);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return k() ? getWidth() : getHeight();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return k() ? this.f80726K : 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return k() ? ((this.f80785w - this.f80783v) + 1) * this.f80724I : 0;
    }

    @Override // android.view.View
    public final void computeScroll() {
        float fA;
        float f7;
        if (this.f80766l1) {
            C7491b c7491b = this.f80727L;
            C7491b c7491b2 = c7491b;
            if (c7491b == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFlingPlayerTimerPickerScroller");
                c7491b2 = null;
            }
            C7491b c7491b3 = c7491b2;
            if (c7491b2.f121409p) {
                C7491b c7491b4 = this.f80728M;
                if (c7491b4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAdjustPlayerTimerPickerScroller");
                    c7491b4 = null;
                }
                if (c7491b4.f121409p) {
                    return;
                } else {
                    c7491b3 = c7491b4;
                }
            }
            if (!c7491b3.f121409p) {
                int iCurrentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - c7491b3.f121404k);
                int i7 = c7491b3.f121405l;
                if (iCurrentAnimationTimeMillis < i7) {
                    int i8 = c7491b3.f121396b;
                    if (i8 == 0) {
                        float interpolation = c7491b3.f121395a.getInterpolation(iCurrentAnimationTimeMillis * c7491b3.f121406m);
                        c7491b3.f121402i = MathKt.roundToInt(c7491b3.f121407n * interpolation) + c7491b3.f121397c;
                        c7491b3.f121403j = MathKt.roundToInt(interpolation * c7491b3.f121408o) + c7491b3.f121398d;
                    } else if (i8 == 1) {
                        float f8 = iCurrentAnimationTimeMillis;
                        float f9 = i7;
                        float f10 = f8 / f9;
                        float f11 = 100;
                        int i9 = (int) (f11 * f10);
                        if (i9 < 100) {
                            float f12 = i9 / f11;
                            int i10 = i9 + 1;
                            float f13 = i10 / f11;
                            float[] fArr = C7491b.f121394z;
                            float f14 = fArr[i9];
                            f7 = (fArr[i10] - f14) / (f13 - f12);
                            fA = C8047a.a(f10, f12, f7, f14);
                        } else {
                            fA = 1.0f;
                            f7 = 0.0f;
                        }
                        c7491b3.f121411r = ((f7 * c7491b3.f121412s) / f9) * 1000.0f;
                        int iRoundToInt = MathKt.roundToInt((c7491b3.f121399e - r0) * fA) + c7491b3.f121397c;
                        c7491b3.f121402i = iRoundToInt;
                        int iCoerceAtMost = RangesKt.coerceAtMost(iRoundToInt, c7491b3.f121401g);
                        c7491b3.f121402i = iCoerceAtMost;
                        c7491b3.f121402i = RangesKt.coerceAtLeast(iCoerceAtMost, 0);
                        int iRound = Math.round(fA * (c7491b3.f121400f - r0)) + c7491b3.f121398d;
                        c7491b3.f121403j = iRound;
                        int iCoerceAtMost2 = RangesKt.coerceAtMost(iRound, c7491b3.h);
                        c7491b3.f121403j = iCoerceAtMost2;
                        int iCoerceAtLeast = RangesKt.coerceAtLeast(iCoerceAtMost2, 0);
                        c7491b3.f121403j = iCoerceAtLeast;
                        if (c7491b3.f121402i == c7491b3.f121399e && iCoerceAtLeast == c7491b3.f121400f) {
                            c7491b3.f121409p = true;
                        }
                    }
                } else {
                    c7491b3.f121402i = c7491b3.f121399e;
                    c7491b3.f121403j = c7491b3.f121400f;
                    c7491b3.f121409p = true;
                }
            }
            if (k()) {
                int i11 = c7491b3.f121402i;
                if (this.f80729N == 0) {
                    this.f80729N = c7491b3.f121397c;
                }
                scrollBy(i11 - this.f80729N, 0);
                this.f80729N = i11;
            } else {
                int i12 = c7491b3.f121403j;
                if (this.f80730O == 0) {
                    this.f80730O = c7491b3.f121398d;
                }
                scrollBy(0, i12 - this.f80730O);
                this.f80730O = i12;
            }
            if (c7491b3.f121409p) {
                o(c7491b3);
            } else {
                postInvalidate();
            }
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return k() ? getWidth() : getHeight();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return !k() ? this.f80726K : 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        return !k() ? ((this.f80785w - this.f80783v) + 1) * this.f80724I : 0;
    }

    public final void d() {
        int i7 = this.f80725J - this.f80726K;
        if (i7 == 0) {
            return;
        }
        int iAbs = Math.abs(i7);
        int i8 = this.f80724I;
        int i9 = i7;
        if (iAbs > i8 / 2) {
            int i10 = i8;
            if (i7 > 0) {
                i10 = -i8;
            }
            i9 = i7 + i10;
        }
        C7491b c7491b = null;
        if (k()) {
            this.f80729N = 0;
            C7491b c7491b2 = this.f80728M;
            if (c7491b2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdjustPlayerTimerPickerScroller");
            } else {
                c7491b = c7491b2;
            }
            c7491b.b(i9, 0, MediaCodecInfoHelper.RANK_TESTED);
        } else {
            this.f80730O = 0;
            C7491b c7491b3 = this.f80728M;
            if (c7491b3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdjustPlayerTimerPickerScroller");
                c7491b3 = null;
            }
            c7491b3.b(0, i9, MediaCodecInfoHelper.RANK_TESTED);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(@NotNull KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19 || keyCode == 20) {
            int action = keyEvent.getAction();
            if (action == 0) {
                if (!this.f80748c0) {
                    int i7 = this.f80786x;
                    if (keyCode != 20) {
                    }
                }
                requestFocus();
                this.f80757g1 = keyCode;
                q();
                C7491b c7491b = this.f80727L;
                C7491b c7491b2 = c7491b;
                if (c7491b == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mFlingPlayerTimerPickerScroller");
                    c7491b2 = null;
                }
                if (!c7491b2.f121409p) {
                    return true;
                }
                a(keyCode == 20);
                return true;
            }
            if (action == 1 && this.f80757g1 == keyCode) {
                this.f80757g1 = -1;
                return true;
            }
        } else if (keyCode == 23 || keyCode == 66) {
            q();
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(@NotNull MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 1 || action == 3) {
            q();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTrackballEvent(@NotNull MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 1 || action == 3) {
            q();
        }
        return super.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f80778r0;
        if (drawable != null && drawable.isStateful() && this.f80778r0.setState(getDrawableState())) {
            invalidateDrawable(this.f80778r0);
        }
    }

    public final void e(int i7) {
        if (k()) {
            this.f80729N = 0;
            if (i7 > 0) {
                C7491b c7491b = this.f80727L;
                if (c7491b == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mFlingPlayerTimerPickerScroller");
                    c7491b = null;
                }
                c7491b.a(0, 0, i7, 0, Integer.MAX_VALUE, 0);
            } else {
                C7491b c7491b2 = this.f80727L;
                if (c7491b2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mFlingPlayerTimerPickerScroller");
                    c7491b2 = null;
                }
                c7491b2.a(Integer.MAX_VALUE, 0, i7, 0, Integer.MAX_VALUE, 0);
            }
        } else {
            this.f80730O = 0;
            if (i7 > 0) {
                C7491b c7491b3 = this.f80727L;
                if (c7491b3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mFlingPlayerTimerPickerScroller");
                    c7491b3 = null;
                }
                c7491b3.a(0, 0, 0, i7, 0, Integer.MAX_VALUE);
            } else {
                C7491b c7491b4 = this.f80727L;
                if (c7491b4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mFlingPlayerTimerPickerScroller");
                    c7491b4 = null;
                }
                c7491b4.a(0, Integer.MAX_VALUE, 0, i7, 0, Integer.MAX_VALUE);
            }
        }
        invalidate();
    }

    public final String f(int i7) {
        String str;
        d dVar = this.f80716A;
        if (dVar != null) {
            str = dVar.format(i7);
        } else {
            NumberFormat numberFormat = this.f80774p1;
            NumberFormat numberFormat2 = numberFormat;
            if (numberFormat == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mNumberFormatter");
                numberFormat2 = null;
            }
            str = numberFormat2.format(i7);
        }
        return str;
    }

    public final float g(boolean z6) {
        return (z6 && this.f80762j1) ? this.f80764k1 : 0.0f;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        return g(!k());
    }

    @Nullable
    public final String[] getDisplayedValues() {
        return this.f80782u;
    }

    public final int getDividerColor() {
        return this.f80784v0;
    }

    public final float getDividerDistance() {
        return DpUtils.px2dp(getContext(), this.f80739X0);
    }

    public final float getDividerThickness() {
        return DpUtils.px2dp(getContext(), this.f80741Z0);
    }

    @Override // android.view.View
    public float getLeftFadingEdgeStrength() {
        return g(k());
    }

    public final boolean getMAccessibilityDescriptionEnabled() {
        return this.f80771o1;
    }

    public final int getMCurrentValue() {
        return this.f80786x;
    }

    public final float getMFadingEdgeStrength() {
        return this.f80764k1;
    }

    public final int getMItemSpacing() {
        return this.f80779r1;
    }

    public final float getMLineSpacingMultiplier() {
        return this.m1;
    }

    public final boolean getMScrollerEnabled() {
        return this.f80766l1;
    }

    public final int getMSelectedTextAlign() {
        return this.f80750d;
    }

    public final boolean getMSelectedTextStrikeThru() {
        return this.f80756g;
    }

    public final boolean getMSelectedTextUnderline() {
        return this.h;
    }

    public final int getMTextAlign() {
        return this.f80768n;
    }

    public final boolean getMTextStrikeThru() {
        return this.f80775q;
    }

    public final boolean getMTextUnderline() {
        return this.f80777r;
    }

    public final int getMaxFlingVelocityCoefficient() {
        return this.f80769n1;
    }

    public final int getMaxValue() {
        return this.f80785w;
    }

    public final int getMinValue() {
        return this.f80783v;
    }

    public final int getOrder() {
        return this.f80760i1;
    }

    @Override // android.widget.LinearLayout
    public int getOrientation() {
        return this.f80758h1;
    }

    @Override // android.view.View
    public float getRightFadingEdgeStrength() {
        return g(k());
    }

    public final int getSelectedTextColor() {
        return this.f80752e;
    }

    public final float getSelectedTextSize() {
        return this.f80754f;
    }

    public final int getTextColor() {
        return this.f80770o;
    }

    public final float getTextSize() {
        return TypedValue.applyDimension(2, this.f80772p, getResources().getDisplayMetrics());
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        return g(!k());
    }

    public final int getWheelItemCount() {
        return this.f80719D;
    }

    public final int h(int i7) {
        int i8 = this.f80785w;
        if (i7 > i8) {
            int i9 = this.f80783v;
            return (((i7 - i8) % (i8 - i9)) + i9) - 1;
        }
        int i10 = this.f80783v;
        return i7 < i10 ? (i8 - ((i10 - i7) % (i8 - i10))) + 1 : i7;
    }

    public final void i(int[] iArr) {
        int length = iArr.length;
        int i7 = 0;
        while (true) {
            int i8 = i7;
            if (i8 >= length - 1) {
                break;
            }
            int i9 = i8 + 1;
            iArr[i8] = iArr[i9];
            i7 = i9;
        }
        int i10 = iArr[iArr.length - 2] + 1;
        int i11 = i10;
        if (this.f80748c0) {
            i11 = i10;
            if (i10 > this.f80785w) {
                i11 = this.f80783v;
            }
        }
        iArr[iArr.length - 1] = i11;
        c(i11);
    }

    public final void j() {
        this.f80718C.clear();
        int[] selectorIndices = getSelectorIndices();
        int i7 = this.f80786x;
        int length = selectorIndices.length;
        for (int i8 = 0; i8 < length; i8++) {
            int i9 = (i8 - this.f80721F) + i7;
            int iH = i9;
            if (this.f80748c0) {
                iH = h(i9);
            }
            selectorIndices[i8] = iH;
            c(iH);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f80778r0;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final boolean k() {
        return getOrientation() == 0;
    }

    public final boolean m(C7491b c7491b) {
        c7491b.f121409p = true;
        if (k()) {
            int i7 = c7491b.f121399e - c7491b.f121402i;
            int i8 = this.f80725J - ((this.f80726K + i7) % this.f80724I);
            if (i8 == 0) {
                return false;
            }
            int iAbs = Math.abs(i8);
            int i9 = this.f80724I;
            int i10 = i8;
            if (iAbs > i9 / 2) {
                i10 = i8 > 0 ? i8 - i9 : i8 + i9;
            }
            scrollBy(i7 + i10, 0);
            return true;
        }
        int i11 = c7491b.f121400f - c7491b.f121403j;
        int i12 = this.f80725J - ((this.f80726K + i11) % this.f80724I);
        if (i12 == 0) {
            return false;
        }
        int iAbs2 = Math.abs(i12);
        int i13 = this.f80724I;
        int i14 = i12;
        if (iAbs2 > i13 / 2) {
            i14 = i12 > 0 ? i12 - i13 : i12 + i13;
        }
        scrollBy(0, i11 + i14);
        return true;
    }

    public final void n(int i7) {
        if (this.f80755f1 == i7) {
            return;
        }
        this.f80755f1 = i7;
    }

    public final void o(C7491b c7491b) {
        C7491b c7491b2 = this.f80727L;
        C7491b c7491b3 = c7491b2;
        if (c7491b2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFlingPlayerTimerPickerScroller");
            c7491b3 = null;
        }
        if (c7491b == c7491b3) {
            d();
            v();
            n(0);
        } else if (this.f80755f1 != 1) {
            v();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(@NotNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f80774p1 = NumberFormat.getInstance();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q();
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0297  */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDraw(@org.jetbrains.annotations.NotNull android.graphics.Canvas r8) {
        /*
            Method dump skipped, instruction units count: 1606
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.widget.function.timer.PlayerTimePicker.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(@NotNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("com.bilibili.playerbizcommon.widget.function.timer.PlayerTimePicker");
        accessibilityEvent.setScrollable(this.f80766l1);
        int i7 = this.f80783v;
        int i8 = this.f80786x;
        int i9 = this.f80724I;
        int i10 = (i8 + i7) * i9;
        int i11 = (this.f80785w - i7) * i9;
        if (k()) {
            accessibilityEvent.setScrollX(i10);
            accessibilityEvent.setMaxScrollX(i11);
        } else {
            accessibilityEvent.setScrollY(i10);
            accessibilityEvent.setMaxScrollY(i11);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(@NotNull MotionEvent motionEvent) {
        if (!isEnabled() || (motionEvent.getAction() & 255) != 0) {
            return false;
        }
        q();
        getParent().requestDisallowInterceptTouchEvent(true);
        if (!k()) {
            float y6 = motionEvent.getY();
            this.f80733R = y6;
            this.f80735T = y6;
            C7491b c7491b = this.f80727L;
            C7491b c7491b2 = c7491b;
            if (c7491b == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFlingPlayerTimerPickerScroller");
                c7491b2 = null;
            }
            if (!c7491b2.f121409p) {
                C7491b c7491b3 = this.f80727L;
                C7491b c7491b4 = c7491b3;
                if (c7491b3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mFlingPlayerTimerPickerScroller");
                    c7491b4 = null;
                }
                c7491b4.f121409p = true;
                C7491b c7491b5 = this.f80728M;
                if (c7491b5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAdjustPlayerTimerPickerScroller");
                    c7491b5 = null;
                }
                c7491b5.f121409p = true;
                n(0);
                return true;
            }
            C7491b c7491b6 = this.f80728M;
            C7491b c7491b7 = c7491b6;
            if (c7491b6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdjustPlayerTimerPickerScroller");
                c7491b7 = null;
            }
            if (!c7491b7.f121409p) {
                C7491b c7491b8 = this.f80727L;
                C7491b c7491b9 = c7491b8;
                if (c7491b8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mFlingPlayerTimerPickerScroller");
                    c7491b9 = null;
                }
                c7491b9.f121409p = true;
                C7491b c7491b10 = this.f80728M;
                if (c7491b10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAdjustPlayerTimerPickerScroller");
                    c7491b10 = null;
                }
                c7491b10.f121409p = true;
                return true;
            }
            float f7 = this.f80733R;
            float f8 = this.f80744a1;
            if (f7 >= f8 && f7 <= this.f80746b1) {
                View.OnClickListener onClickListener = this.f80787y;
                if (onClickListener == null) {
                    return true;
                }
                onClickListener.onClick(this);
                return true;
            }
            if (f7 < f8) {
                p(this, false);
                return true;
            }
            if (f7 <= this.f80746b1) {
                return true;
            }
            p(this, true);
            return true;
        }
        float x6 = motionEvent.getX();
        this.f80732Q = x6;
        this.f80734S = x6;
        C7491b c7491b11 = this.f80727L;
        C7491b c7491b12 = c7491b11;
        if (c7491b11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFlingPlayerTimerPickerScroller");
            c7491b12 = null;
        }
        if (!c7491b12.f121409p) {
            C7491b c7491b13 = this.f80727L;
            C7491b c7491b14 = c7491b13;
            if (c7491b13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFlingPlayerTimerPickerScroller");
                c7491b14 = null;
            }
            c7491b14.f121409p = true;
            C7491b c7491b15 = this.f80728M;
            C7491b c7491b16 = c7491b15;
            if (c7491b15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdjustPlayerTimerPickerScroller");
                c7491b16 = null;
            }
            c7491b16.f121409p = true;
            C7491b c7491b17 = this.f80727L;
            if (c7491b17 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFlingPlayerTimerPickerScroller");
                c7491b17 = null;
            }
            o(c7491b17);
            n(0);
            return true;
        }
        C7491b c7491b18 = this.f80728M;
        C7491b c7491b19 = c7491b18;
        if (c7491b18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdjustPlayerTimerPickerScroller");
            c7491b19 = null;
        }
        if (c7491b19.f121409p) {
            float f9 = this.f80732Q;
            float f10 = this.f80749c1;
            if (f9 >= f10 && f9 <= this.f80751d1) {
                View.OnClickListener onClickListener2 = this.f80787y;
                if (onClickListener2 == null) {
                    return true;
                }
                onClickListener2.onClick(this);
                return true;
            }
            if (f9 < f10) {
                p(this, false);
                return true;
            }
            if (f9 <= this.f80751d1) {
                return true;
            }
            p(this, true);
            return true;
        }
        C7491b c7491b20 = this.f80727L;
        C7491b c7491b21 = c7491b20;
        if (c7491b20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFlingPlayerTimerPickerScroller");
            c7491b21 = null;
        }
        c7491b21.f121409p = true;
        C7491b c7491b22 = this.f80728M;
        C7491b c7491b23 = c7491b22;
        if (c7491b22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdjustPlayerTimerPickerScroller");
            c7491b23 = null;
        }
        c7491b23.f121409p = true;
        C7491b c7491b24 = this.f80728M;
        if (c7491b24 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdjustPlayerTimerPickerScroller");
            c7491b24 = null;
        }
        o(c7491b24);
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        EditText editText = this.f80742a;
        EditText editText2 = editText;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSelectedText");
            editText2 = null;
        }
        int measuredWidth2 = editText2.getMeasuredWidth();
        EditText editText3 = this.f80742a;
        EditText editText4 = editText3;
        if (editText3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSelectedText");
            editText4 = null;
        }
        int measuredHeight2 = editText4.getMeasuredHeight();
        int i11 = (measuredWidth - measuredWidth2) / 2;
        int i12 = (measuredHeight - measuredHeight2) / 2;
        EditText editText5 = this.f80742a;
        EditText editText6 = editText5;
        if (editText5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSelectedText");
            editText6 = null;
        }
        editText6.layout(i11, i12, measuredWidth2 + i11, measuredHeight2 + i12);
        EditText editText7 = this.f80742a;
        EditText editText8 = editText7;
        if (editText7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSelectedText");
            editText8 = null;
        }
        float x6 = editText8.getX();
        EditText editText9 = this.f80742a;
        EditText editText10 = editText9;
        if (editText9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSelectedText");
            editText10 = null;
        }
        this.f80745b = ((editText10.getMeasuredWidth() / 2.0f) + x6) - 2.0f;
        EditText editText11 = this.f80742a;
        EditText editText12 = editText11;
        if (editText11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSelectedText");
            editText12 = null;
        }
        float y6 = editText12.getY();
        EditText editText13 = this.f80742a;
        if (editText13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSelectedText");
            editText13 = null;
        }
        this.f80747c = ((editText13.getMeasuredHeight() / 2.0f) + y6) - 5.0f;
        if (z6) {
            j();
            int[] selectorIndices = getSelectorIndices();
            int length = (int) (((selectorIndices.length - 1) * this.f80772p) + this.f80754f);
            float length2 = selectorIndices.length;
            if (k()) {
                this.f80780s = (int) (((getRight() - getLeft()) - length) / length2);
                this.f80724I = ((int) getMaxTextSize()) + this.f80780s;
                this.f80725J = (int) (this.f80745b - (r0 * this.f80721F));
            } else {
                this.f80781t = (int) (((getBottom() - getTop()) - length) / length2);
                this.f80724I = ((int) getMaxTextSize()) + this.f80781t;
                this.f80725J = (int) (this.f80747c - (r0 * this.f80721F));
            }
            this.f80726K = this.f80725J;
            v();
            if (k()) {
                setHorizontalFadingEdgeEnabled(true);
                setVerticalFadingEdgeEnabled(false);
                setFadingEdgeLength(((getRight() - getLeft()) - ((int) this.f80772p)) / 2);
            } else {
                setHorizontalFadingEdgeEnabled(false);
                setVerticalFadingEdgeEnabled(true);
                setFadingEdgeLength(((getBottom() - getTop()) - ((int) this.f80772p)) / 2);
            }
            int i13 = (this.f80741Z0 * 2) + this.f80739X0;
            if (!k()) {
                int height = ((getHeight() - this.f80739X0) / 2) - this.f80741Z0;
                this.f80744a1 = height;
                this.f80746b1 = height + i13;
            } else {
                int width = ((getWidth() - this.f80739X0) / 2) - this.f80741Z0;
                this.f80749c1 = width;
                this.f80751d1 = width + i13;
                this.f80746b1 = getHeight();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        super.onMeasure(l(i7, this.f80765l), l(i8, this.f80761j));
        setMeasuredDimension(r(this.f80763k, getMeasuredWidth(), i7), r(this.f80759i, getMeasuredHeight(), i8));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        if (!isEnabled() || !this.f80766l1) {
            return false;
        }
        if (this.f80736U == null) {
            this.f80736U = VelocityTracker.obtain();
        }
        this.f80736U.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 1) {
            if (action != 2) {
                return true;
            }
            if (k()) {
                float x6 = motionEvent.getX();
                if (this.f80755f1 == 1) {
                    scrollBy((int) (x6 - this.f80734S), 0);
                    invalidate();
                } else if (((int) Math.abs(x6 - this.f80732Q)) > this.f80737V) {
                    q();
                    n(1);
                }
                this.f80734S = x6;
                return true;
            }
            float y6 = motionEvent.getY();
            if (this.f80755f1 == 1) {
                scrollBy(0, (int) (y6 - this.f80735T));
                invalidate();
            } else if (((int) Math.abs(y6 - this.f80733R)) > this.f80737V) {
                q();
                n(1);
            }
            this.f80735T = y6;
            return true;
        }
        a aVar = this.f80731P;
        if (aVar != null) {
            removeCallbacks(aVar);
        }
        VelocityTracker velocityTracker = this.f80736U;
        velocityTracker.computeCurrentVelocity(1000, this.f80743a0);
        if (k()) {
            int xVelocity = (int) velocityTracker.getXVelocity();
            if (Math.abs(xVelocity) > this.f80738W) {
                e(xVelocity);
                n(2);
            } else {
                int x7 = (int) motionEvent.getX();
                if (((int) Math.abs(x7 - this.f80732Q)) <= this.f80737V) {
                    int i7 = (x7 / this.f80724I) - this.f80721F;
                    if (i7 > 0) {
                        a(true);
                    } else if (i7 < 0) {
                        a(false);
                    } else {
                        d();
                    }
                } else {
                    d();
                }
                n(0);
            }
        } else {
            int yVelocity = (int) velocityTracker.getYVelocity();
            if (Math.abs(yVelocity) > this.f80738W) {
                e(yVelocity);
                n(2);
            } else {
                int y7 = (int) motionEvent.getY();
                if (((int) Math.abs(y7 - this.f80733R)) <= this.f80737V) {
                    int i8 = (y7 / this.f80724I) - this.f80721F;
                    if (i8 > 0) {
                        a(true);
                    } else if (i8 < 0) {
                        a(false);
                    } else {
                        d();
                    }
                } else {
                    d();
                }
                n(0);
            }
        }
        this.f80736U.recycle();
        this.f80736U = null;
        return true;
    }

    public final void q() {
        a aVar = this.f80731P;
        if (aVar != null) {
            removeCallbacks(aVar);
        }
    }

    public final void s(int i7, boolean z6) {
        c cVar;
        if (this.f80786x == i7) {
            return;
        }
        setCurrentValue(this.f80748c0 ? h(i7) : Math.min(Math.max(i7, this.f80783v), this.f80785w));
        if (this.f80755f1 != 2) {
            v();
        }
        if (z6 && (cVar = this.f80788z) != null) {
            cVar.a();
        }
        j();
        if (this.f80771o1) {
            setContentDescription(String.valueOf(this.f80786x));
        }
        invalidate();
    }

    @Override // android.view.View
    public final void scrollBy(int i7, int i8) {
        int i9;
        if (this.f80766l1) {
            int[] selectorIndices = getSelectorIndices();
            int i10 = this.f80726K;
            int maxTextSize = (int) getMaxTextSize();
            if (k()) {
                if (getOrder() == 0) {
                    boolean z6 = this.f80748c0;
                    if (!z6 && i7 > 0 && selectorIndices[this.f80721F] <= this.f80783v) {
                        this.f80726K = this.f80725J;
                        return;
                    } else if (!z6 && i7 < 0 && selectorIndices[this.f80721F] >= this.f80785w) {
                        this.f80726K = this.f80725J;
                        return;
                    }
                } else {
                    boolean z7 = this.f80748c0;
                    if (!z7 && i7 > 0 && selectorIndices[this.f80721F] >= this.f80785w) {
                        this.f80726K = this.f80725J;
                        return;
                    } else if (!z7 && i7 < 0 && selectorIndices[this.f80721F] <= this.f80783v) {
                        this.f80726K = this.f80725J;
                        return;
                    }
                }
                this.f80726K += i7;
            } else {
                if (getOrder() == 0) {
                    boolean z8 = this.f80748c0;
                    if (!z8 && i8 > 0 && selectorIndices[this.f80721F] <= this.f80783v) {
                        this.f80726K = this.f80725J;
                        return;
                    } else if (!z8 && i8 < 0 && selectorIndices[this.f80721F] >= this.f80785w) {
                        this.f80726K = this.f80725J;
                        return;
                    }
                } else {
                    boolean z9 = this.f80748c0;
                    if (!z9 && i8 > 0 && selectorIndices[this.f80721F] >= this.f80785w) {
                        this.f80726K = this.f80725J;
                        return;
                    } else if (!z9 && i8 < 0 && selectorIndices[this.f80721F] <= this.f80783v) {
                        this.f80726K = this.f80725J;
                        return;
                    }
                }
                this.f80726K += i8;
            }
            while (true) {
                int i11 = this.f80726K;
                if (i11 - this.f80725J <= maxTextSize) {
                    break;
                }
                this.f80726K = i11 - this.f80724I;
                if (getOrder() == 0) {
                    b(selectorIndices);
                } else {
                    i(selectorIndices);
                }
                s(selectorIndices[this.f80721F], true);
                if (!this.f80748c0 && selectorIndices[this.f80721F] < this.f80783v) {
                    this.f80726K = this.f80725J;
                }
            }
            while (true) {
                i9 = this.f80726K;
                if (i9 - this.f80725J >= (-maxTextSize)) {
                    break;
                }
                this.f80726K = i9 + this.f80724I;
                if (getOrder() == 0) {
                    i(selectorIndices);
                } else {
                    b(selectorIndices);
                }
                s(selectorIndices[this.f80721F], true);
                if (!this.f80748c0 && selectorIndices[this.f80721F] > this.f80785w) {
                    this.f80726K = this.f80725J;
                }
            }
            if (i10 != i9) {
                if (k()) {
                    onScrollChanged(this.f80726K, 0, i10, 0);
                } else {
                    onScrollChanged(0, this.f80726K, 0, i10);
                }
            }
        }
    }

    public final void setCurrentValue(int i7) {
        this.f80786x = i7;
        s(i7, false);
    }

    public final void setDisplayedValues(@NotNull String[] strArr) {
        if (Intrinsics.areEqual(this.f80782u, strArr)) {
            return;
        }
        this.f80782u = strArr;
        if (strArr != null) {
            EditText editText = this.f80742a;
            if (editText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSelectedText");
                editText = null;
            }
            editText.setRawInputType(655360);
        } else {
            EditText editText2 = this.f80742a;
            if (editText2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSelectedText");
                editText2 = null;
            }
            editText2.setRawInputType(2);
        }
        v();
        j();
        u();
    }

    public final void setDividerColor(int i7) {
        this.f80784v0 = i7;
        this.f80778r0 = new ColorDrawable(i7);
    }

    public final void setDividerColorResource(int i7) {
        setDividerColor(ContextCompat.getColor(getContext(), i7));
    }

    public final void setDividerDistance(int i7) {
        this.f80739X0 = i7;
    }

    public final void setDividerDistanceResource(int i7) {
        setDividerDistance(getResources().getDimensionPixelSize(i7));
    }

    public final void setDividerThickness(int i7) {
        this.f80741Z0 = i7;
    }

    public final void setDividerThicknessResource(int i7) {
        setDividerThickness(getResources().getDimensionPixelSize(i7));
    }

    public final void setDividerType(int i7) {
        this.f80753e1 = i7;
        invalidate();
    }

    @Override // android.view.View
    public void setEnabled(boolean z6) {
        super.setEnabled(z6);
        EditText editText = this.f80742a;
        EditText editText2 = editText;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSelectedText");
            editText2 = null;
        }
        editText2.setEnabled(z6);
    }

    public final void setFadingEdgeEnabled(boolean z6) {
        this.f80762j1 = z6;
    }

    public final void setFormatter(int i7) {
        setFormatter(getContext().getString(i7));
    }

    public final void setFormatter(@Nullable d dVar) {
        if (dVar == this.f80716A) {
            return;
        }
        this.f80716A = dVar;
        j();
        v();
    }

    public final void setFormatter(@Nullable String str) {
        if (str == null || StringsKt.isBlank(str)) {
            return;
        }
        com.bilibili.playerbizcommon.widget.function.timer.a aVar = StringsKt.isBlank(str) ? null : new com.bilibili.playerbizcommon.widget.function.timer.a(str);
        if (aVar == null) {
            return;
        }
        setFormatter(aVar);
    }

    public final void setMAccessibilityDescriptionEnabled(boolean z6) {
        this.f80771o1 = z6;
    }

    public final void setMFadingEdgeStrength(float f7) {
        this.f80764k1 = f7;
    }

    public final void setMItemSpacing(int i7) {
        this.f80779r1 = i7;
    }

    public final void setMLineSpacingMultiplier(float f7) {
        this.m1 = f7;
    }

    public final void setMScrollerEnabled(boolean z6) {
        this.f80766l1 = z6;
    }

    public final void setMSelectedTextAlign(int i7) {
        this.f80750d = i7;
    }

    public final void setMSelectedTextStrikeThru(boolean z6) {
        this.f80756g = z6;
    }

    public final void setMSelectedTextUnderline(boolean z6) {
        this.h = z6;
    }

    public final void setMTextAlign(int i7) {
        this.f80768n = i7;
    }

    public final void setMTextStrikeThru(boolean z6) {
        this.f80775q = z6;
    }

    public final void setMTextUnderline(boolean z6) {
        this.f80777r = z6;
    }

    public final void setMaxFlingVelocityCoefficient(int i7) {
        this.f80769n1 = i7;
        ViewConfiguration viewConfiguration = this.f80776q1;
        ViewConfiguration viewConfiguration2 = viewConfiguration;
        if (viewConfiguration == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewConfiguration");
            viewConfiguration2 = null;
        }
        this.f80743a0 = viewConfiguration2.getScaledMaximumFlingVelocity() / this.f80769n1;
    }

    public final void setMaxValue(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("maxValue must be >= 0");
        }
        this.f80785w = i7;
        if (i7 < this.f80786x) {
            setCurrentValue(i7);
        }
        w();
        j();
        v();
        u();
        invalidate();
    }

    public final void setMinValue(int i7) {
        this.f80783v = i7;
        if (i7 > this.f80786x) {
            setCurrentValue(i7);
        }
        w();
        j();
        v();
        u();
        invalidate();
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.f80787y = onClickListener;
    }

    public final void setOnLongPressUpdateInterval(long j7) {
        this.f80717B = j7;
    }

    public final void setOnScrollListener(@Nullable b bVar) {
    }

    public final void setOnValueChangedListener(@Nullable c cVar) {
        this.f80788z = cVar;
    }

    public final void setOrder(int i7) {
        this.f80760i1 = i7;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i7) {
        this.f80758h1 = i7;
        t();
        requestLayout();
    }

    public final void setSelectedTextColor(int i7) {
        this.f80752e = i7;
        EditText editText = this.f80742a;
        EditText editText2 = editText;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSelectedText");
            editText2 = null;
        }
        editText2.setTextColor(this.f80752e);
    }

    public final void setSelectedTextColorResource(int i7) {
        setSelectedTextColor(ContextCompat.getColor(getContext(), i7));
    }

    public final void setSelectedTextSize(float f7) {
        float fDp2px = DpUtils.dp2px(getContext(), f7);
        this.f80754f = fDp2px;
        EditText editText = this.f80742a;
        EditText editText2 = editText;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSelectedText");
            editText2 = null;
        }
        editText2.setTextSize(fDp2px / getResources().getDisplayMetrics().scaledDensity);
    }

    public final void setTextColor(int i7) {
        this.f80770o = i7;
        Paint paint = this.f80723H;
        Paint paint2 = paint;
        if (paint == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSelectorWheelPaint");
            paint2 = null;
        }
        paint2.setColor(this.f80770o);
    }

    public final void setTextColorResource(int i7) {
        setTextColor(ContextCompat.getColor(getContext(), i7));
    }

    public final void setTextSize(float f7) {
        float fDp2px = DpUtils.dp2px(getContext(), f7);
        this.f80772p = fDp2px;
        Paint paint = this.f80723H;
        Paint paint2 = paint;
        if (paint == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSelectorWheelPaint");
            paint2 = null;
        }
        paint2.setTextSize(fDp2px);
    }

    public final void setWheelItemCount(int i7) {
        if (i7 < 1) {
            throw new IllegalArgumentException("Wheel item count must be >= 1");
        }
        this.f80720E = i7;
        int iCoerceAtLeast = RangesKt.coerceAtLeast(i7, 7);
        this.f80719D = iCoerceAtLeast;
        this.f80721F = iCoerceAtLeast / 2;
        this.f80722G = new int[iCoerceAtLeast];
    }

    public final void setWrapSelectorWheel(boolean z6) {
        this.f80773p0 = z6;
        w();
    }

    public final void t() {
        if (k()) {
            this.f80759i = -1;
            this.f80761j = (int) DpUtils.dp2px(getContext(), 64);
            this.f80763k = (int) DpUtils.dp2px(getContext(), 180);
            this.f80765l = -1;
            return;
        }
        this.f80759i = -1;
        this.f80761j = (int) DpUtils.dp2px(getContext(), 180);
        this.f80763k = (int) DpUtils.dp2px(getContext(), 64);
        this.f80765l = -1;
    }

    public final void u() {
        int i7;
        if (this.f80767m) {
            Paint paint = this.f80723H;
            Paint paint2 = paint;
            if (paint == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSelectorWheelPaint");
                paint2 = null;
            }
            paint2.setTextSize(getMaxTextSize());
            String[] strArr = this.f80782u;
            int i8 = 0;
            if (strArr == null) {
                float f7 = 0.0f;
                int i9 = 0;
                while (i9 < 10) {
                    Paint paint3 = this.f80723H;
                    Paint paint4 = paint3;
                    if (paint3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mSelectorWheelPaint");
                        paint4 = null;
                    }
                    float fMeasureText = paint4.measureText(f(i9));
                    float f8 = f7;
                    if (fMeasureText > f7) {
                        f8 = fMeasureText;
                    }
                    i9++;
                    f7 = f8;
                }
                int i10 = this.f80785w;
                while (true) {
                    int i11 = i10;
                    if (i11 <= 0) {
                        break;
                    }
                    i8++;
                    i10 = i11 / 10;
                }
                i7 = (int) (i8 * f7);
            } else {
                int length = strArr.length;
                i7 = 0;
                int i12 = 0;
                while (i12 < length) {
                    String str = strArr[i12];
                    Paint paint5 = this.f80723H;
                    Paint paint6 = paint5;
                    if (paint5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mSelectorWheelPaint");
                        paint6 = null;
                    }
                    float fMeasureText2 = paint6.measureText(str);
                    int i13 = i7;
                    if (fMeasureText2 > i7) {
                        i13 = (int) fMeasureText2;
                    }
                    i12++;
                    i7 = i13;
                }
            }
            EditText editText = this.f80742a;
            EditText editText2 = editText;
            if (editText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSelectedText");
                editText2 = null;
            }
            int paddingLeft = editText2.getPaddingLeft();
            EditText editText3 = this.f80742a;
            if (editText3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSelectedText");
                editText3 = null;
            }
            int paddingRight = editText3.getPaddingRight() + paddingLeft + i7;
            if (this.f80765l != paddingRight) {
                this.f80765l = Math.max(paddingRight, this.f80763k);
                invalidate();
            }
        }
    }

    public final void v() {
        String[] strArr = this.f80782u;
        String strF = strArr == null ? f(this.f80786x) : strArr[this.f80786x - this.f80783v];
        if (TextUtils.isEmpty(strF)) {
            return;
        }
        EditText editText = this.f80742a;
        EditText editText2 = editText;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSelectedText");
            editText2 = null;
        }
        if (Intrinsics.areEqual(strF, editText2.getText().toString())) {
            return;
        }
        EditText editText3 = this.f80742a;
        if (editText3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSelectedText");
            editText3 = null;
        }
        editText3.setText(strF);
    }

    public final void w() {
        boolean z6 = true;
        if (this.f80785w - this.f80783v < this.f80722G.length - 1 || !this.f80773p0) {
            z6 = false;
        }
        this.f80748c0 = z6;
    }
}
