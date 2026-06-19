package com.bilibili.music.podcast.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Vibrator;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.core.content.ContextCompat;
import com.bilibili.lib.theme.R$color;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.utils.DpUtils;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/PodcastSpeedSeekBar.class */
public final class PodcastSpeedSeekBar extends AppCompatSeekBar {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f67167w = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f67168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f67169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f67170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f67171e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f67172f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f67173g;
    public final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f67174i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f67175j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f67176k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f67177l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f67178m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Paint f67179n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Paint f67180o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Paint f67181p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Paint.FontMetrics f67182q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public a f67183r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public Vibrator f67184s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f67185t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final List<Pair<Float, String>> f67186u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final float[] f67187v;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/PodcastSpeedSeekBar$a.class */
    public interface a {
        void a(float f7);
    }

    public PodcastSpeedSeekBar(@NotNull Context context) {
        this(context, null);
    }

    public PodcastSpeedSeekBar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ArrayList arrayList = new ArrayList();
        this.f67186u = arrayList;
        this.f67187v = new float[]{0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.bilibili.music.podcast.d.f66417e);
        this.f67168b = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, (int) DpUtils.dp2px(context, 12.0f));
        this.f67169c = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, (int) DpUtils.dp2px(context, 4.0f));
        this.f67170d = typedArrayObtainStyledAttributes.getColor(1, ContextCompat.getColor(context, R$color.Graph_bg_thick));
        this.f67171e = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, (int) DpUtils.dp2px(context, 12.0f));
        this.f67172f = typedArrayObtainStyledAttributes.getColor(9, ContextCompat.getColor(context, R$color.Text2));
        this.f67173g = typedArrayObtainStyledAttributes.getColor(10, ContextCompat.getColor(context, R$color.Brand_pink));
        this.h = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, (int) DpUtils.dp2px(context, 8.0f));
        this.f67174i = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, (int) DpUtils.dp2px(context, 12.0f));
        this.f67175j = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, 0);
        this.f67176k = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        this.f67177l = typedArrayObtainStyledAttributes.getColor(4, ContextCompat.getColor(context, R$color.Graph_bg_thick));
        this.f67178m = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, (int) DpUtils.dp2px(context, 1.0f));
        this.f67185t = typedArrayObtainStyledAttributes.getInt(6, 0);
        typedArrayObtainStyledAttributes.recycle();
        arrayList.clear();
        for (int i7 = 0; i7 < 6; i7++) {
            float f7 = this.f67187v[i7];
            ((ArrayList) this.f67186u).add(new Pair(Float.valueOf(f7), G.p.a(String.valueOf(f7), "x")));
        }
        setMax(RangesKt.coerceAtLeast(0, ((ArrayList) this.f67186u).size() - 1) * 100);
        setSelectIndex(this.f67185t);
        Paint paintA = qe.i.a(true);
        paintA.setColor(this.f67170d);
        this.f67179n = paintA;
        Paint paintA2 = qe.i.a(true);
        paintA2.setTextSize(this.f67171e);
        paintA2.setTextAlign(Paint.Align.CENTER);
        this.f67180o = paintA2;
        Paint paintA3 = qe.i.a(true);
        paintA3.setColor(this.f67177l);
        paintA3.setStyle(Paint.Style.FILL);
        paintA3.setStrokeWidth(this.f67178m);
        this.f67181p = paintA3;
        Paint paint = this.f67180o;
        Paint paint2 = paint;
        if (paint == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTextPaint");
            paint2 = null;
        }
        this.f67182q = paint2.getFontMetrics();
        setOnSeekBarChangeListener(new x(this));
    }

    private final void setNotSeekPadding(int i7) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int size = ((ArrayList) this.f67186u).size();
        float f7 = (size <= 0 ? 0.0f : ((i7 - this.f67175j) - this.f67176k) / size) / 2;
        float f8 = this.f67176k + f7;
        int i8 = (int) (this.f67175j + f7);
        if (i8 == paddingLeft && ((int) f8) == paddingRight) {
            return;
        }
        setPadding(i8, getPaddingTop(), (int) f8, getPaddingBottom());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSelectIndex(int i7) {
        a aVar;
        if (i7 < 0 || i7 > ((ArrayList) this.f67186u).size()) {
            return;
        }
        this.f67185t = i7;
        setProgress(i7 * 100);
        Pair pair = (Pair) CollectionsKt.getOrNull(this.f67186u, i7);
        if (pair == null || (aVar = this.f67183r) == null) {
            return;
        }
        aVar.a(((Number) pair.getFirst()).floatValue());
    }

    @Override // androidx.appcompat.widget.AppCompatSeekBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        int width = getWidth();
        int iCoerceAtLeast = RangesKt.coerceAtLeast(this.f67168b, this.f67169c);
        float f7 = this.f67178m / 2.0f;
        float f8 = (this.f67174i + iCoerceAtLeast) - f7;
        float f9 = this.f67175j;
        float width2 = getWidth();
        float f10 = this.f67176k;
        float f11 = this.f67178m;
        Paint paint = this.f67181p;
        if (paint == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLinePaint");
            paint = null;
        }
        canvas.drawLine(f9, f8, width2 - f10, f8 + f11, paint);
        int size = ((ArrayList) this.f67186u).size();
        float f12 = f8 + f7;
        float f13 = size <= 0 ? 0.0f : ((width - this.f67175j) - this.f67176k) / size;
        float f14 = (f13 / 2.0f) + this.f67175j;
        Paint.FontMetrics fontMetrics = this.f67182q;
        Paint.FontMetrics fontMetrics2 = fontMetrics;
        if (fontMetrics == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTextFontMetrics");
            fontMetrics2 = null;
        }
        float fAbs = Math.abs(fontMetrics2.ascent);
        int i7 = 0;
        for (Object obj : (ArrayList) this.f67186u) {
            if (i7 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Pair pair = (Pair) obj;
            float f15 = this.f67169c;
            Paint paint2 = this.f67179n;
            Paint paint3 = paint2;
            if (paint2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCirclePaint");
                paint3 = null;
            }
            canvas.drawCircle(f14, f12, f15, paint3);
            String str = (String) pair.getSecond();
            float f16 = iCoerceAtLeast;
            float f17 = this.h;
            Paint paint4 = this.f67180o;
            Paint paint5 = paint4;
            if (paint4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTextPaint");
                paint5 = null;
            }
            paint5.setColor(i7 == this.f67185t ? this.f67173g : this.f67172f);
            Unit unit = Unit.INSTANCE;
            canvas.drawText(str, f14, f16 + f12 + f17 + fAbs, paint5);
            f14 += f13;
            i7++;
        }
        if (getThumb() != null) {
            Rect bounds = getThumb().getBounds();
            int iHeight = bounds.height();
            Drawable thumb = getThumb();
            int i8 = bounds.left;
            float f18 = iHeight / 2.0f;
            thumb.setBounds(i8, (int) (f12 - f18), bounds.right, (int) (f18 + f12));
        }
        Rect bounds2 = getProgressDrawable().getBounds();
        getProgressDrawable().setBounds(bounds2.left, (int) (f12 - f7), bounds2.right, (int) (f12 + f7));
        super.onDraw(canvas);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        setNotSeekPadding(measuredWidth);
        Paint.FontMetrics fontMetrics = this.f67182q;
        Paint.FontMetrics fontMetrics2 = fontMetrics;
        if (fontMetrics == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTextFontMetrics");
            fontMetrics2 = null;
        }
        float f7 = fontMetrics2.descent;
        Paint.FontMetrics fontMetrics3 = this.f67182q;
        if (fontMetrics3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTextFontMetrics");
            fontMetrics3 = null;
        }
        setMeasuredDimension(measuredWidth, RangesKt.coerceAtLeast(measuredHeight, (RangesKt.coerceAtLeast(this.f67168b, this.f67169c) * 2) + this.f67174i + this.h + ((int) (f7 - fontMetrics3.ascent))));
    }

    public final void setSpeed(float f7) {
        int length = this.f67187v.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                float[] fArr = this.f67187v;
                int length2 = fArr.length;
                i7 = 0;
                while (true) {
                    if (i7 >= length2) {
                        i7 = -1;
                        break;
                    } else if (fArr[i7] == 1.0f) {
                        break;
                    } else {
                        i7++;
                    }
                }
            } else if (Math.abs(f7 - this.f67187v[i7]) < 0.1d) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 >= 0) {
            setSelectIndex(i7);
        }
    }

    public final void setSpeedPointSelectListener(@NotNull a aVar) {
        this.f67183r = aVar;
    }
}
