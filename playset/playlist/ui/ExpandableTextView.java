package com.bilibili.playset.playlist.ui;

import android.animation.ValueAnimator;
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
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.bilibili.lib.ui.util.NightTheme;
import com.bilibili.playset.O0;
import java.util.Arrays;
import us0.C8759a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/ui/ExpandableTextView.class */
public class ExpandableTextView extends C8759a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final e f85485q = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f85486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f85487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f85488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f85489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f85490e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f85491f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CharSequence f85492g;
    public CharSequence h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c f85493i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c f85494j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f85495k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f85496l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f85497m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f85498n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public f f85499o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f85500p;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/ui/ExpandableTextView$a.class */
    public final class a implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ExpandableTextView f85501a;

        public a(ExpandableTextView expandableTextView) {
            this.f85501a = expandableTextView;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            int height;
            ExpandableTextView expandableTextView = this.f85501a;
            if (expandableTextView.f85498n) {
                expandableTextView.setOnClickListener(null);
            }
            this.f85501a.getViewTreeObserver().removeOnPreDrawListener(this);
            Layout layout = this.f85501a.getLayout();
            if (layout == null) {
                return false;
            }
            ExpandableTextView expandableTextView2 = this.f85501a;
            expandableTextView2.f85487b = true;
            if (TextUtils.isEmpty(expandableTextView2.f85493i.b()) || !expandableTextView2.f85495k) {
                height = expandableTextView2.getHeight();
            } else {
                CharSequence charSequence = expandableTextView2.f85491f;
                f fVar = expandableTextView2.f85499o;
                if (fVar != null) {
                    if (expandableTextView2.f85492g == null) {
                        expandableTextView2.f85492g = fVar.b(charSequence, layout, expandableTextView2.f85493i);
                    }
                    charSequence = expandableTextView2.f85492g;
                }
                StaticLayout staticLayout = new StaticLayout(charSequence, layout.getPaint(), layout.getWidth(), layout.getAlignment(), layout.getSpacingMultiplier(), layout.getSpacingAdd(), false);
                height = ((layout.getBottomPadding() - layout.getTopPadding()) + staticLayout.getHeight()) - (staticLayout.getBottomPadding() - staticLayout.getTopPadding());
            }
            expandableTextView2.f85489d = height;
            int lineCount = layout.getLineCount();
            ExpandableTextView expandableTextView3 = this.f85501a;
            if (lineCount > expandableTextView3.f85497m) {
                expandableTextView3.f85486a = true;
                expandableTextView3.K();
                ExpandableTextView expandableTextView4 = this.f85501a;
                if (expandableTextView4.f85498n) {
                    expandableTextView4.setOnClickListener(expandableTextView4.f85500p);
                }
            } else {
                expandableTextView3.f85486a = false;
                expandableTextView3.J();
            }
            this.f85501a.getClass();
            return false;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/ui/ExpandableTextView$b.class */
    public final class b implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ExpandableTextView f85502a;

        public b(ExpandableTextView expandableTextView) {
            this.f85502a = expandableTextView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i7;
            int i8;
            ExpandableTextView expandableTextView = this.f85502a;
            boolean z6 = expandableTextView.f85486a;
            if (z6) {
                boolean z7 = expandableTextView.f85487b;
                if (z7) {
                    if (!expandableTextView.f85488c && z6 && z7) {
                        int i9 = expandableTextView.f85489d;
                        if (i9 == 0 || (i8 = expandableTextView.f85490e) == 0) {
                            expandableTextView.K();
                            return;
                        }
                        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i9, i8);
                        valueAnimatorOfInt.addUpdateListener(new us0.d(expandableTextView));
                        valueAnimatorOfInt.addListener(new us0.c(expandableTextView));
                        valueAnimatorOfInt.setDuration(300L);
                        valueAnimatorOfInt.setInterpolator(new FastOutSlowInInterpolator());
                        valueAnimatorOfInt.start();
                        return;
                    }
                    return;
                }
                if (expandableTextView.f85488c || !z6 || z7) {
                    return;
                }
                expandableTextView.f85490e = expandableTextView.getHeight();
                expandableTextView.J();
                int i10 = expandableTextView.f85489d;
                if (i10 <= 0 || (i7 = expandableTextView.f85490e) <= 0) {
                    return;
                }
                ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(i7, i10);
                valueAnimatorOfInt2.addUpdateListener(new us0.d(expandableTextView));
                valueAnimatorOfInt2.setDuration(300L);
                valueAnimatorOfInt2.setInterpolator(new FastOutSlowInInterpolator());
                valueAnimatorOfInt2.addListener(new us0.b(expandableTextView));
                valueAnimatorOfInt2.start();
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/ui/ExpandableTextView$c.class */
    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public CharSequence f85503a;

        public abstract CharSequence a();

        public final CharSequence b() {
            if (this.f85503a == null) {
                this.f85503a = a();
            }
            return this.f85503a;
        }

        public abstract float c(Paint paint);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/ui/ExpandableTextView$d.class */
    public static final class d implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CharSequence f85504a;

        public d(CharSequence charSequence) {
            this.f85504a = charSequence;
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

        @Override // com.bilibili.playset.playlist.ui.ExpandableTextView.f
        public final CharSequence a() {
            return this.f85504a;
        }

        @Override // com.bilibili.playset.playlist.ui.ExpandableTextView.f
        public final CharSequence b(CharSequence charSequence, Layout layout, c cVar) {
            if (TextUtils.isEmpty(charSequence) || layout == null || TextUtils.isEmpty(cVar.b())) {
                return charSequence;
            }
            TextPaint paint = layout.getPaint();
            StaticLayout staticLayout = new StaticLayout(charSequence, paint, layout.getWidth(), layout.getAlignment(), layout.getSpacingMultiplier(), layout.getSpacingAdd(), false);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            int lineCount = staticLayout.getLineCount();
            int lineCount2 = staticLayout.getLineCount();
            float fMax = Math.max(paint.measureText(ExpandableTextView.L(charSequence.subSequence(layout.getLineStart(0), layout.getLineEnd(0)), true).toString()), lineCount >= 2 ? paint.measureText(ExpandableTextView.L(charSequence.subSequence(layout.getLineStart(1), layout.getLineEnd(1)), true).toString()) : 0.0f);
            float lineMax = staticLayout.getLineMax(lineCount2 - 1);
            float fC = cVar.c(paint);
            float[] fArr = new float[1];
            float f7 = fMax - fC;
            if (lineMax > f7) {
                spannableStringBuilder.append((CharSequence) "\n");
                fArr[0] = 0.0f;
            } else {
                fArr[0] = lineMax;
            }
            d(spannableStringBuilder, paint, f7 - fArr[0]);
            spannableStringBuilder.append(cVar.b());
            return spannableStringBuilder;
        }

        @Override // com.bilibili.playset.playlist.ui.ExpandableTextView.f
        public final CharSequence c(CharSequence charSequence, Layout layout, c cVar, int i7) {
            if (TextUtils.isEmpty(charSequence) || layout == null) {
                return charSequence;
            }
            TextPaint paint = layout.getPaint();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i8 = i7 - 1;
            int lineStart = layout.getLineStart(i8);
            int lineEnd = layout.getLineEnd(i8);
            float fMax = Math.max(paint.measureText(ExpandableTextView.L(charSequence.subSequence(layout.getLineStart(0), layout.getLineEnd(0)), true).toString()), layout.getLineCount() >= 2 ? paint.measureText(ExpandableTextView.L(charSequence.subSequence(layout.getLineStart(1), layout.getLineEnd(1)), true).toString()) : 0.0f);
            CharSequence charSequenceL = ExpandableTextView.L(charSequence.subSequence(lineStart, lineEnd), false);
            int length = charSequenceL.length();
            float fC = (fMax - cVar.c(paint)) - paint.measureText("... ");
            float[] fArr = new float[1];
            int iBreakText = paint.breakText(charSequenceL, 0, length, true, fC, fArr);
            if (iBreakText <= 0) {
                spannableStringBuilder.append(charSequence.subSequence(0, lineStart));
            } else {
                spannableStringBuilder.append(ExpandableTextView.L(charSequence.subSequence(0, lineStart + iBreakText), false));
            }
            spannableStringBuilder.append((CharSequence) "...").append((CharSequence) " ");
            d(spannableStringBuilder, paint, fC - fArr[0]);
            spannableStringBuilder.append(cVar.b());
            return spannableStringBuilder;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/ui/ExpandableTextView$e.class */
    public static final class e extends c {
        @Override // com.bilibili.playset.playlist.ui.ExpandableTextView.c
        public final CharSequence a() {
            return "";
        }

        @Override // com.bilibili.playset.playlist.ui.ExpandableTextView.c
        public final float c(Paint paint) {
            return 0.0f;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/ui/ExpandableTextView$f.class */
    public interface f {
        CharSequence a();

        CharSequence b(CharSequence charSequence, Layout layout, c cVar);

        CharSequence c(CharSequence charSequence, Layout layout, c cVar, int i7);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/ui/ExpandableTextView$g.class */
    public interface g {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/ui/ExpandableTextView$h.class */
    public interface h {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/ui/ExpandableTextView$i.class */
    public static final class i extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f85505b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f85506c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Context f85507d;

        public i(Context context, String str, int i7) {
            this.f85507d = context;
            this.f85505b = str;
            this.f85506c = i7;
        }

        @Override // com.bilibili.playset.playlist.ui.ExpandableTextView.c
        public final CharSequence a() {
            String str = this.f85505b;
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            int color = NightTheme.isNightTheme(this.f85507d) ? Color.parseColor("#BB5B76") : this.f85506c;
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new ForegroundColorSpan(color), 0, spannableString.length(), 18);
            return spannableString;
        }

        @Override // com.bilibili.playset.playlist.ui.ExpandableTextView.c
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
        this.f85498n = true;
        this.f85500p = new b(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, O0.f83993a);
        String string = typedArrayObtainStyledAttributes.getString(2);
        String string2 = typedArrayObtainStyledAttributes.getString(5);
        this.f85495k = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.f85496l = typedArrayObtainStyledAttributes.getBoolean(7, true);
        int i7 = typedArrayObtainStyledAttributes.getInt(4, 1);
        this.f85497m = i7;
        this.f85497m = Math.max(i7, 1);
        int color = typedArrayObtainStyledAttributes.getColor(1, Color.parseColor("#FB7299"));
        typedArrayObtainStyledAttributes.recycle();
        boolean zIsEmpty = TextUtils.isEmpty(string);
        e eVar = f85485q;
        if (zIsEmpty) {
            this.f85493i = eVar;
        } else {
            this.f85493i = new i(getContext(), string, color);
        }
        if (TextUtils.isEmpty(string2)) {
            this.f85494j = eVar;
        } else {
            this.f85494j = new i(getContext(), string2, color);
        }
        context.getApplicationContext();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.CharSequence L(java.lang.CharSequence r4, boolean r5) {
        /*
            r0 = r4
            int r0 = r0.length()
            r8 = r0
            r0 = 0
            r7 = r0
            r0 = 0
            r6 = r0
            r0 = r5
            if (r0 == 0) goto L2c
        L10:
            r0 = r6
            r7 = r0
            r0 = r6
            r1 = r8
            if (r0 >= r1) goto L2c
            r0 = r6
            r7 = r0
            r0 = r4
            r1 = r6
            char r0 = r0.charAt(r1)
            r1 = 32
            if (r0 > r1) goto L2c
            int r6 = r6 + 1
            goto L10
        L2c:
            r0 = r8
            r6 = r0
        L2f:
            r0 = r6
            r1 = r7
            if (r0 <= r1) goto L48
            r0 = r4
            r1 = r6
            r2 = 1
            int r1 = r1 - r2
            char r0 = r0.charAt(r1)
            r1 = 32
            if (r0 > r1) goto L48
            int r6 = r6 + (-1)
            goto L2f
        L48:
            r0 = r7
            if (r0 > 0) goto L55
            r0 = r4
            r9 = r0
            r0 = r6
            r1 = r8
            if (r0 >= r1) goto L5f
        L55:
            r0 = r4
            r1 = r7
            r2 = r6
            java.lang.CharSequence r0 = r0.subSequence(r1, r2)
            r9 = r0
        L5f:
            r0 = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.playlist.ui.ExpandableTextView.L(java.lang.CharSequence, boolean):java.lang.CharSequence");
    }

    public final void J() {
        CharSequence charSequence = this.f85491f;
        if (charSequence == null || !this.f85486a || this.f85487b) {
            return;
        }
        this.f85487b = true;
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        Layout layout = getLayout();
        CharSequence charSequence2 = this.f85491f;
        f fVar = this.f85499o;
        if (fVar != null) {
            if (this.f85492g == null) {
                this.f85492g = fVar.b(charSequence2, layout, this.f85493i);
            }
            charSequence2 = this.f85492g;
        }
        setText(charSequence2);
    }

    public final void K() {
        CharSequence charSequence;
        if (this.f85491f != null && this.f85486a && this.f85487b) {
            this.f85487b = false;
            Layout layout = getLayout();
            CharSequence charSequence2 = this.f85491f;
            f fVar = this.f85499o;
            if (fVar == null) {
                charSequence = charSequence2;
            } else {
                c cVar = this.f85494j;
                if (!this.f85496l) {
                    cVar = f85485q;
                }
                if (this.h == null) {
                    this.h = fVar.c(charSequence2, layout, cVar, this.f85497m);
                }
                charSequence = this.h;
            }
            setText(charSequence);
        }
    }

    public void setEnableTouchToggle(boolean z6) {
        this.f85498n = z6;
    }

    public void setExpandListener(g gVar) {
    }

    public void setExpandedDesc(c cVar) {
        this.f85493i = cVar;
        if (cVar == null) {
            this.f85493i = f85485q;
        }
    }

    public void setMaxRetractLines(int i7) {
        this.f85497m = i7;
    }

    public void setOriginText(f fVar) {
        this.f85499o = fVar;
        if (fVar == null) {
            this.f85488c = false;
            this.f85487b = false;
            this.f85486a = false;
            this.f85489d = 0;
            this.f85490e = 0;
            this.f85491f = null;
            this.f85492g = null;
            this.h = null;
            setText((CharSequence) null);
            return;
        }
        CharSequence charSequenceA = fVar.a();
        if (TextUtils.equals(this.f85491f, charSequenceA)) {
            return;
        }
        this.f85488c = false;
        this.f85487b = false;
        this.f85486a = false;
        this.f85489d = 0;
        this.f85490e = 0;
        this.f85492g = null;
        this.h = null;
        this.f85491f = charSequenceA;
        getViewTreeObserver().addOnPreDrawListener(new a(this));
        setText(this.f85491f);
    }

    public void setRetractedDesc(c cVar) {
        this.f85494j = cVar;
        if (cVar == null) {
            this.f85494j = f85485q;
        }
    }

    public void setShowExpandedDesc(boolean z6) {
        this.f85495k = z6;
    }

    public void setShowRetractedDesc(boolean z6) {
        this.f85496l = z6;
    }

    public void setTextInterceptor(h hVar) {
    }
}
