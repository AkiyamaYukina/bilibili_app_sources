package com.bilibili.music.podcast.view;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.bilibili.lib.theme.R$color;
import com.bilibili.music.podcast.view.k;
import kotlin.Lazy;
import kotlin.LazyKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/k.class */
public class k extends View {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f67243k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Paint f67244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final RectF f67245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Rect f67246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f67247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f67248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f67249f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f67250g;
    public float h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f67251i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Lazy f67252j;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/k$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final k f67253a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f67254b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f67255c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f67256d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f67257e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public InterfaceC0388a f67258f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public String f67259g;

        @Nullable
        public Integer h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public Drawable f67260i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f67261j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f67262k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @Nullable
        public c f67263l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @Nullable
        public b f67264m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @NotNull
        public final ValueAnimator f67265n;

        /* JADX INFO: renamed from: com.bilibili.music.podcast.view.k$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/k$a$a.class */
        public interface InterfaceC0388a {
            void a(boolean z6);

            boolean b();

            @CallSuper
            default void c() {
                if (b()) {
                    return;
                }
                d().b();
                a(true);
            }

            @NotNull
            a d();

            @Nullable
            Drawable getIcon();

            @NotNull
            String getText();

            int getTextColor();

            @CallSuper
            default void start() {
                a(false);
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/k$a$b.class */
        public static final class b implements InterfaceC0388a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final a f67266a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final String f67267b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f67268c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @Nullable
            public final Drawable f67269d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public boolean f67270e;

            /* JADX INFO: renamed from: com.bilibili.music.podcast.view.k$a$b$a, reason: collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/k$a$b$a.class */
            public static final class C0389a implements Animator.AnimatorListener {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final b f67271a;

                public C0389a(b bVar) {
                    this.f67271a = bVar;
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    this.f67271a.f67266a.f67262k = 1;
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    this.f67271a.f67266a.f67262k = 3;
                }
            }

            public b(@NotNull a aVar) {
                Drawable drawableWrap;
                this.f67266a = aVar;
                this.f67267b = aVar.f67254b;
                int i7 = aVar.f67256d;
                this.f67268c = i7;
                Drawable drawable = ContextCompat.getDrawable(aVar.f67253a.getContext(), 2131236654);
                if (drawable != null) {
                    drawableWrap = DrawableCompat.wrap(drawable);
                    DrawableCompat.setTint(drawableWrap, i7);
                } else {
                    drawableWrap = null;
                }
                this.f67269d = drawableWrap;
                if (drawableWrap != null) {
                    DrawableCompat.setTint(DrawableCompat.wrap(drawableWrap), i7);
                }
            }

            @Override // com.bilibili.music.podcast.view.k.a.InterfaceC0388a
            public final void a(boolean z6) {
                this.f67270e = z6;
            }

            @Override // com.bilibili.music.podcast.view.k.a.InterfaceC0388a
            public final boolean b() {
                return this.f67270e;
            }

            @Override // com.bilibili.music.podcast.view.k.a.InterfaceC0388a
            public final void c() {
                if (this.f67266a.f67261j <= 0.5f) {
                    super.c();
                }
            }

            @Override // com.bilibili.music.podcast.view.k.a.InterfaceC0388a
            @NotNull
            public final a d() {
                return this.f67266a;
            }

            @Override // com.bilibili.music.podcast.view.k.a.InterfaceC0388a
            @Nullable
            public final Drawable getIcon() {
                return this.f67269d;
            }

            @Override // com.bilibili.music.podcast.view.k.a.InterfaceC0388a
            @NotNull
            public final String getText() {
                return this.f67267b;
            }

            @Override // com.bilibili.music.podcast.view.k.a.InterfaceC0388a
            public final int getTextColor() {
                return this.f67268c;
            }

            @Override // com.bilibili.music.podcast.view.k.a.InterfaceC0388a
            public final void start() {
                this.f67270e = false;
                ValueAnimator valueAnimator = this.f67266a.f67265n;
                valueAnimator.addListener(new C0389a(this));
                valueAnimator.start();
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/k$a$c.class */
        public static final class c implements InterfaceC0388a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final a f67272a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final String f67273b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f67274c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @Nullable
            public final Drawable f67275d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public boolean f67276e;

            /* JADX INFO: renamed from: com.bilibili.music.podcast.view.k$a$c$a, reason: collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/k$a$c$a.class */
            public static final class C0390a implements Animator.AnimatorListener {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final c f67277a;

                public C0390a(c cVar) {
                    this.f67277a = cVar;
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    this.f67277a.f67272a.f67262k = 0;
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    this.f67277a.f67272a.f67262k = 3;
                }
            }

            public c(@NotNull a aVar) {
                Drawable drawableWrap;
                this.f67272a = aVar;
                this.f67273b = aVar.f67255c;
                int i7 = aVar.f67257e;
                this.f67274c = i7;
                Drawable drawable = ContextCompat.getDrawable(aVar.f67253a.getContext(), 2131236668);
                if (drawable != null) {
                    drawableWrap = DrawableCompat.wrap(drawable);
                    DrawableCompat.setTint(drawableWrap, i7);
                } else {
                    drawableWrap = null;
                }
                this.f67275d = drawableWrap;
            }

            @Override // com.bilibili.music.podcast.view.k.a.InterfaceC0388a
            public final void a(boolean z6) {
                this.f67276e = z6;
            }

            @Override // com.bilibili.music.podcast.view.k.a.InterfaceC0388a
            public final boolean b() {
                return this.f67276e;
            }

            @Override // com.bilibili.music.podcast.view.k.a.InterfaceC0388a
            public final void c() {
                if (this.f67272a.f67261j >= 0.5f) {
                    super.c();
                }
            }

            @Override // com.bilibili.music.podcast.view.k.a.InterfaceC0388a
            @NotNull
            public final a d() {
                return this.f67272a;
            }

            @Override // com.bilibili.music.podcast.view.k.a.InterfaceC0388a
            @Nullable
            public final Drawable getIcon() {
                return this.f67275d;
            }

            @Override // com.bilibili.music.podcast.view.k.a.InterfaceC0388a
            @NotNull
            public final String getText() {
                return this.f67273b;
            }

            @Override // com.bilibili.music.podcast.view.k.a.InterfaceC0388a
            public final int getTextColor() {
                return this.f67274c;
            }

            @Override // com.bilibili.music.podcast.view.k.a.InterfaceC0388a
            public final void start() {
                this.f67276e = false;
                ValueAnimator valueAnimator = this.f67272a.f67265n;
                valueAnimator.addListener(new C0390a(this));
                valueAnimator.reverse();
            }
        }

        public a(@NotNull k kVar) {
            this.f67253a = kVar;
            this.f67254b = kVar.getResources().getString(2131847636);
            this.f67255c = kVar.getResources().getString(2131847635);
            this.f67256d = kVar.f67249f;
            this.f67257e = kVar.f67250g;
            float f7 = this.f67261j;
            final ValueAnimator duration = ValueAnimator.ofFloat(f7, 1.0f - f7).setDuration(300L);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this, duration) { // from class: com.bilibili.music.podcast.view.j

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final k.a f67241a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final ValueAnimator f67242b;

                {
                    this.f67241a = this;
                    this.f67242b = duration;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    k.a aVar = this.f67241a;
                    aVar.f67261j = this.f67242b.getAnimatedFraction();
                    k.a.InterfaceC0388a interfaceC0388a = aVar.f67258f;
                    if (interfaceC0388a != null) {
                        interfaceC0388a.c();
                    }
                    aVar.f67253a.requestLayout();
                }
            });
            this.f67265n = duration;
        }

        public final void a(boolean z6) {
            if (this.f67263l == null) {
                this.f67263l = new c(this);
            }
            this.f67258f = this.f67263l;
            this.f67261j = 0.0f;
            this.f67262k = 0;
            b();
            if (!z6) {
                if (this.f67262k == 3) {
                    this.f67265n.end();
                }
                this.f67253a.requestLayout();
            } else {
                InterfaceC0388a interfaceC0388a = this.f67258f;
                if (interfaceC0388a != null) {
                    interfaceC0388a.start();
                }
            }
        }

        public final void b() {
            InterfaceC0388a interfaceC0388a = this.f67258f;
            this.f67259g = interfaceC0388a != null ? interfaceC0388a.getText() : null;
            InterfaceC0388a interfaceC0388a2 = this.f67258f;
            this.h = interfaceC0388a2 != null ? Integer.valueOf(interfaceC0388a2.getTextColor()) : null;
            InterfaceC0388a interfaceC0388a3 = this.f67258f;
            Drawable icon = null;
            if (interfaceC0388a3 != null) {
                icon = interfaceC0388a3.getIcon();
            }
            this.f67260i = icon;
        }
    }

    public k(@NotNull Context context) {
        this(context, null, 0);
    }

    public k(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public k(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, 0);
        this.f67244a = qe.i.a(true);
        this.f67245b = new RectF();
        this.f67246c = new Rect();
        int color = ContextCompat.getColor(getContext(), R$color.Ga2_u);
        this.f67247d = color;
        int color2 = ContextCompat.getColor(getContext(), R$color.Pi5);
        this.f67248e = color2;
        int color3 = ContextCompat.getColor(getContext(), R$color.Ga5_u);
        this.f67249f = color3;
        int color4 = ContextCompat.getColor(getContext(), R$color.Wh0_u);
        this.f67250g = color4;
        this.f67252j = LazyKt.lazy(new Lg0.t(this, 2));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.bilibili.music.podcast.d.f66413a, 0, 0);
        this.f67248e = typedArrayObtainStyledAttributes.getColor(2, color2);
        this.f67247d = typedArrayObtainStyledAttributes.getColor(0, color);
        this.f67249f = typedArrayObtainStyledAttributes.getColor(1, color3);
        this.f67250g = typedArrayObtainStyledAttributes.getColor(3, color4);
        typedArrayObtainStyledAttributes.recycle();
        getMStateManager().a(false);
    }

    private final Paint getBackgroundPaint() {
        Object objEvaluate = new ArgbEvaluator().evaluate(getMStateManager().f67261j, Integer.valueOf(this.f67248e), Integer.valueOf(this.f67247d));
        Integer num = objEvaluate instanceof Integer ? (Integer) objEvaluate : null;
        if (num == null) {
            return this.f67244a;
        }
        int iIntValue = num.intValue();
        Paint paint = this.f67244a;
        paint.setColor(iIntValue);
        return paint;
    }

    private final a getMStateManager() {
        return (a) this.f67252j.getValue();
    }

    private final Paint getTextPaint() {
        Paint paint = this.f67244a;
        Integer num = getMStateManager().h;
        if (num != null) {
            paint.setColor(num.intValue());
        }
        return paint;
    }

    public void a(boolean z6) {
        a mStateManager = getMStateManager();
        if (mStateManager.f67264m == null) {
            mStateManager.f67264m = new a.b(mStateManager);
        }
        mStateManager.f67258f = mStateManager.f67264m;
        mStateManager.f67261j = 1.0f;
        mStateManager.f67262k = 1;
        mStateManager.b();
        if (!z6) {
            if (mStateManager.f67262k == 3) {
                mStateManager.f67265n.end();
            }
            mStateManager.f67253a.requestLayout();
        } else {
            a.InterfaceC0388a interfaceC0388a = mStateManager.f67258f;
            if (interfaceC0388a != null) {
                interfaceC0388a.start();
            }
        }
    }

    public void b(boolean z6) {
        getMStateManager().a(z6);
    }

    @Override // android.view.View
    public final void dispatchDraw(@NotNull Canvas canvas) {
        Resources resources;
        super.dispatchDraw(canvas);
        RectF rectF = this.f67245b;
        float f7 = this.f67251i;
        canvas.drawRoundRect(rectF, f7, f7, getBackgroundPaint());
        String str = getMStateManager().f67259g;
        if (str != null) {
            float measuredHeight = getMeasuredHeight();
            Context context = getContext();
            canvas.drawText(str, ((context == null || (resources = context.getResources()) == null) ? 3 : resources.getDisplayMetrics().density * 3) + measuredHeight, this.h, getTextPaint());
        }
        if (getMStateManager().f67261j != 0.0f) {
            canvas.rotate((1 - getMStateManager().f67261j) * 90, getMeasuredHeight() * 0.6875f, getMeasuredHeight() / 2.0f);
        }
        Drawable drawable = getMStateManager().f67260i;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        super.onLayout(z6, i7, i8, i9, i10);
        this.f67251i = getMeasuredHeight() / 2.0f;
        this.f67246c.set((int) (getMeasuredHeight() * 0.375f), (int) (getMeasuredHeight() * 0.1875f), getMeasuredHeight(), (int) (getMeasuredHeight() * 0.8125f));
        this.f67245b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        a.InterfaceC0388a interfaceC0388a = getMStateManager().f67258f;
        if (interfaceC0388a != null) {
            Rect rect = this.f67246c;
            Drawable icon = interfaceC0388a.getIcon();
            if (icon != null) {
                icon.setBounds(rect);
            }
        }
        Paint.FontMetrics fontMetrics = this.f67244a.getFontMetrics();
        float f7 = fontMetrics.descent;
        this.h = (getMeasuredHeight() / 2.0f) + (((f7 - fontMetrics.ascent) / 2) - f7);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        Resources resources;
        float size = View.MeasureSpec.getSize(i8);
        this.f67244a.setTextSize(size / 2.0f);
        float fMeasureText = this.f67244a.measureText(getMStateManager().f67255c);
        float fMeasureText2 = this.f67244a.measureText(getMStateManager().f67254b);
        Context context = getContext();
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (((fMeasureText2 - fMeasureText) * getMStateManager().f67261j) + ((context == null || (resources = context.getResources()) == null) ? 8 : resources.getDisplayMetrics().density * 8) + (size * 0.75f) + fMeasureText2), Integer.MIN_VALUE), i8);
    }
}
