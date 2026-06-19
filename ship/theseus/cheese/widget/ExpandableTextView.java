package com.bilibili.ship.theseus.cheese.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import java.util.Arrays;
import ou0.C8267b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/widget/ExpandableTextView.class */
public class ExpandableTextView extends C8267b {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final c f90781u = new Object();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f90782v = Color.parseColor("#37648E");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f90783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f90784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f90785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f90786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f90787e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f90788f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f90789g;
    public CharSequence h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CharSequence f90790i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f90791j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a f90792k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f90793l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f90794m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f90795n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f90796o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f90797p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f90798q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public e f90799r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public d f90800s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final XD.f f90801t;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/widget/ExpandableTextView$a.class */
    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public CharSequence f90802a;

        public abstract CharSequence a();

        public final CharSequence b() {
            if (this.f90802a == null) {
                this.f90802a = a();
            }
            return this.f90802a;
        }

        public abstract float c(Paint paint);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/widget/ExpandableTextView$b.class */
    public static final class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CharSequence f90803a;

        public b(CharSequence charSequence) {
            this.f90803a = charSequence;
        }

        public static void d(SpannableStringBuilder spannableStringBuilder, Paint paint, float f7) {
            if (f7 <= 0.0f) {
                return;
            }
            float fMeasureText = paint.measureText(" ");
            int i7 = fMeasureText > 0.0f ? (int) (f7 / fMeasureText) : 0;
            int i8 = i7;
            if (f7 % fMeasureText < fMeasureText / 2.0f) {
                i8 = i7 - 1;
            }
            if (i8 > 0) {
                char[] cArr = new char[i8];
                Arrays.fill(cArr, ' ');
                StringBuilder sb = new StringBuilder();
                sb.append(cArr);
                spannableStringBuilder.append((CharSequence) sb);
            }
        }

        @Override // com.bilibili.ship.theseus.cheese.widget.ExpandableTextView.d
        public final CharSequence a() {
            return this.f90803a;
        }

        @Override // com.bilibili.ship.theseus.cheese.widget.ExpandableTextView.d
        public final CharSequence b(CharSequence charSequence, Layout layout, a aVar, boolean z6) {
            if (TextUtils.isEmpty(charSequence) || layout == null || TextUtils.isEmpty(aVar.b())) {
                return charSequence;
            }
            TextPaint paint = layout.getPaint();
            StaticLayout staticLayout = new StaticLayout(charSequence, paint, layout.getWidth(), layout.getAlignment(), layout.getSpacingMultiplier(), layout.getSpacingAdd(), false);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            int lineCount = staticLayout.getLineCount();
            float width = staticLayout.getWidth();
            float lineMax = staticLayout.getLineMax(lineCount - 1);
            float fC = aVar.c(paint);
            float[] fArr = new float[1];
            float f7 = width - fC;
            if (lineMax > f7) {
                spannableStringBuilder.append((CharSequence) "\n");
                fArr[0] = 0.0f;
            } else {
                fArr[0] = lineMax;
            }
            if (z6) {
                d(spannableStringBuilder, paint, f7 - fArr[0]);
            }
            spannableStringBuilder.append(aVar.b());
            return spannableStringBuilder;
        }

        @Override // com.bilibili.ship.theseus.cheese.widget.ExpandableTextView.d
        public final CharSequence c(CharSequence charSequence, Layout layout, a aVar, int i7, boolean z6) {
            if (TextUtils.isEmpty(charSequence) || layout == null) {
                return charSequence;
            }
            if (i7 == 0) {
                return null;
            }
            TextPaint paint = layout.getPaint();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i8 = i7 - 1;
            int lineStart = layout.getLineStart(i8);
            int lineEnd = layout.getLineEnd(i8);
            float width = layout.getWidth();
            CharSequence charSequenceL = ExpandableTextView.L(charSequence.subSequence(lineStart, lineEnd));
            int length = charSequenceL.length();
            float fC = (width - aVar.c(paint)) - paint.measureText("... ");
            float[] fArr = new float[1];
            int iBreakText = paint.breakText(charSequenceL, 0, length, true, fC, fArr);
            if (iBreakText <= 0) {
                spannableStringBuilder.append(charSequence.subSequence(0, lineStart));
            } else {
                spannableStringBuilder.append(ExpandableTextView.L(charSequence.subSequence(0, lineStart + iBreakText)));
            }
            spannableStringBuilder.append((CharSequence) "...").append((CharSequence) " ");
            if (z6) {
                d(spannableStringBuilder, paint, fC - fArr[0]);
            }
            spannableStringBuilder.append(aVar.b());
            return spannableStringBuilder;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/widget/ExpandableTextView$c.class */
    public static final class c extends a {
        @Override // com.bilibili.ship.theseus.cheese.widget.ExpandableTextView.a
        public final CharSequence a() {
            return "";
        }

        @Override // com.bilibili.ship.theseus.cheese.widget.ExpandableTextView.a
        public final float c(Paint paint) {
            return 0.0f;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/widget/ExpandableTextView$d.class */
    public interface d {
        CharSequence a();

        CharSequence b(CharSequence charSequence, Layout layout, a aVar, boolean z6);

        CharSequence c(CharSequence charSequence, Layout layout, a aVar, int i7, boolean z6);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/widget/ExpandableTextView$e.class */
    public interface e {
        void a(boolean z6);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/widget/ExpandableTextView$f.class */
    public static class f implements e {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/widget/ExpandableTextView$g.class */
    public interface g {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/widget/ExpandableTextView$h.class */
    public static final class h extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f90804b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f90805c;

        public h(String str, int i7) {
            this.f90804b = str;
            this.f90805c = i7;
        }

        @Override // com.bilibili.ship.theseus.cheese.widget.ExpandableTextView.a
        public final CharSequence a() {
            String str = this.f90804b;
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new ForegroundColorSpan(this.f90805c), 0, spannableString.length(), 18);
            return spannableString;
        }

        @Override // com.bilibili.ship.theseus.cheese.widget.ExpandableTextView.a
        public final float c(Paint paint) {
            CharSequence charSequenceB = b();
            if (TextUtils.isEmpty(charSequenceB)) {
                return 0.0f;
            }
            return paint.measureText(charSequenceB, 0, charSequenceB.length());
        }
    }

    public ExpandableTextView(Context context) {
        this(context, null);
    }

    public ExpandableTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f90786d = false;
        this.f90797p = true;
        this.f90798q = true;
        this.f90801t = new XD.f(this, 2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Zt0.a.f29774b);
        String string = typedArrayObtainStyledAttributes.getString(2);
        String string2 = typedArrayObtainStyledAttributes.getString(5);
        this.f90794m = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.f90795n = typedArrayObtainStyledAttributes.getBoolean(7, true);
        int i7 = typedArrayObtainStyledAttributes.getInt(4, 1);
        this.f90796o = i7;
        this.f90796o = Math.max(i7, 0);
        this.f90789g = typedArrayObtainStyledAttributes.getColor(1, f90782v);
        this.f90798q = typedArrayObtainStyledAttributes.getBoolean(3, true);
        typedArrayObtainStyledAttributes.recycle();
        boolean zIsEmpty = TextUtils.isEmpty(string);
        c cVar = f90781u;
        if (zIsEmpty) {
            this.f90792k = cVar;
        } else {
            getContext();
            this.f90792k = new h(string, this.f90789g);
        }
        if (TextUtils.isEmpty(string2)) {
            this.f90793l = cVar;
        } else {
            getContext();
            this.f90793l = new h(string2, this.f90789g);
        }
    }

    public static CharSequence L(CharSequence charSequence) {
        int length = charSequence.length();
        int i7 = length;
        while (i7 > 0 && charSequence.charAt(i7 - 1) <= ' ') {
            i7--;
        }
        CharSequence charSequenceSubSequence = charSequence;
        if (i7 < length) {
            charSequenceSubSequence = charSequence.subSequence(0, i7);
        }
        return charSequenceSubSequence;
    }

    public final void J() {
        CharSequence charSequence = this.h;
        if (charSequence == null || !this.f90783a || this.f90784b) {
            return;
        }
        this.f90784b = true;
        if (!TextUtils.isEmpty(charSequence)) {
            Layout layout = getLayout();
            CharSequence charSequence2 = this.h;
            d dVar = this.f90800s;
            if (dVar != null) {
                if (this.f90790i == null) {
                    this.f90790i = dVar.b(charSequence2, layout, this.f90792k, this.f90798q);
                }
                charSequence2 = this.f90790i;
            }
            setText(charSequence2);
        }
        e eVar = this.f90799r;
        if (eVar != null) {
            eVar.a(this.f90784b);
        }
    }

    public final void K() {
        CharSequence charSequence;
        if (this.h != null && this.f90783a && this.f90784b) {
            this.f90784b = false;
            Layout layout = getLayout();
            CharSequence charSequence2 = this.h;
            d dVar = this.f90800s;
            if (dVar == null) {
                charSequence = charSequence2;
            } else {
                a aVar = this.f90793l;
                if (!this.f90795n) {
                    aVar = f90781u;
                }
                if (this.f90791j == null) {
                    this.f90791j = dVar.c(charSequence2, layout, aVar, this.f90796o, this.f90798q);
                }
                charSequence = this.f90791j;
            }
            setText(charSequence);
            e eVar = this.f90799r;
            if (eVar != null) {
                eVar.a(this.f90784b);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r5, int r6) {
        /*
            r4 = this;
            r0 = r4
            boolean r0 = r0.f90786d
            if (r0 != 0) goto L1c
            r0 = r6
            r7 = r0
            r0 = r4
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            if (r0 == 0) goto L23
            r0 = r6
            r7 = r0
            r0 = r4
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            int r0 = r0.height
            if (r0 != 0) goto L23
        L1c:
            r0 = 0
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r7 = r0
        L23:
            r0 = r4
            r1 = r5
            r2 = r7
            super.onMeasure(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.widget.ExpandableTextView.onMeasure(int, int):void");
    }

    public void setEnableTouchToggle(boolean z6) {
        this.f90797p = z6;
    }

    public void setExpandListener(e eVar) {
        this.f90799r = eVar;
    }

    public void setExpandedDesc(a aVar) {
        this.f90792k = aVar;
        if (aVar == null) {
            this.f90792k = f90781u;
        }
    }

    public void setMaxRetractLines(int i7) {
        this.f90796o = i7;
    }

    public void setOriginText(d dVar) {
        this.f90800s = dVar;
        if (dVar == null) {
            this.f90785c = false;
            this.f90784b = false;
            this.f90783a = false;
            this.f90787e = 0;
            this.f90788f = 0;
            this.h = null;
            this.f90790i = null;
            this.f90791j = null;
            setText((CharSequence) null);
            return;
        }
        CharSequence charSequenceA = dVar.a();
        if (TextUtils.equals(this.h, charSequenceA)) {
            return;
        }
        this.f90785c = false;
        this.f90784b = false;
        this.f90783a = false;
        this.f90787e = 0;
        this.f90788f = 0;
        this.f90790i = null;
        this.f90791j = null;
        this.h = charSequenceA;
        getViewTreeObserver().addOnPreDrawListener(new com.bilibili.ship.theseus.cheese.widget.a(this));
        setText(this.h);
        requestLayout();
    }

    public void setRetractedDesc(a aVar) {
        this.f90793l = aVar;
        if (aVar == null) {
            this.f90793l = f90781u;
        }
    }

    public void setShowExpandedDesc(boolean z6) {
        this.f90794m = z6;
    }

    public void setShowRetractedDesc(boolean z6) {
        this.f90795n = z6;
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.f90786d = charSequence == null || charSequence.length() == 0;
        super.setText(charSequence, bufferType);
    }

    public void setTextInterceptor(g gVar) {
    }
}
