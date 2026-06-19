package com.bilibili.ogv.misc.roledetail;

import android.content.Context;
import android.content.res.TypedArray;
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
import androidx.core.view.OneShotPreDrawListener;
import com.bilibili.ogv.misc.roledetail.ExpandableTextView;
import com.bilibili.upper.module.contribute.up.ui.a1;
import java.util.Arrays;
import nk0.C8103a;
import vk0.C8829j;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/roledetail/ExpandableTextView.class */
public class ExpandableTextView extends C8829j {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final c f69230r = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f69231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f69232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f69233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f69234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f69235e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f69236f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CharSequence f69237g;
    public CharSequence h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CharSequence f69238i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f69239j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a f69240k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f69241l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f69242m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f69243n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f69244o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public d f69245p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a1 f69246q;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/roledetail/ExpandableTextView$a.class */
    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public CharSequence f69247a;

        public abstract CharSequence a();

        public final CharSequence b() {
            if (this.f69247a == null) {
                this.f69247a = a();
            }
            return this.f69247a;
        }

        public abstract float c(Paint paint);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/roledetail/ExpandableTextView$b.class */
    public static final class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public CharSequence f69248a;

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

        @Override // com.bilibili.ogv.misc.roledetail.ExpandableTextView.d
        public final CharSequence a() {
            return this.f69248a;
        }

        @Override // com.bilibili.ogv.misc.roledetail.ExpandableTextView.d
        public final CharSequence b(CharSequence charSequence, Layout layout, a aVar, int i7) {
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
            CharSequence charSequenceM = ExpandableTextView.M(charSequence.subSequence(lineStart, lineEnd));
            int length = charSequenceM.length();
            float fC = (width - aVar.c(paint)) - paint.measureText("... ");
            float[] fArr = new float[1];
            int iBreakText = paint.breakText(charSequenceM, 0, length, true, fC, fArr);
            if (iBreakText <= 0) {
                spannableStringBuilder.append(charSequence.subSequence(0, lineStart));
            } else {
                spannableStringBuilder.append(ExpandableTextView.M(charSequence.subSequence(0, lineStart + iBreakText)));
            }
            spannableStringBuilder.append((CharSequence) "...").append((CharSequence) " ");
            d(spannableStringBuilder, paint, fC - fArr[0]);
            spannableStringBuilder.append(aVar.b());
            return spannableStringBuilder;
        }

        @Override // com.bilibili.ogv.misc.roledetail.ExpandableTextView.d
        public final CharSequence c(CharSequence charSequence, Layout layout, a aVar) {
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
            d(spannableStringBuilder, paint, f7 - fArr[0]);
            spannableStringBuilder.append(aVar.b());
            return spannableStringBuilder;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/roledetail/ExpandableTextView$c.class */
    public static final class c extends a {
        @Override // com.bilibili.ogv.misc.roledetail.ExpandableTextView.a
        public final CharSequence a() {
            return "";
        }

        @Override // com.bilibili.ogv.misc.roledetail.ExpandableTextView.a
        public final float c(Paint paint) {
            return 0.0f;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/roledetail/ExpandableTextView$d.class */
    public interface d {
        CharSequence a();

        CharSequence b(CharSequence charSequence, Layout layout, a aVar, int i7);

        CharSequence c(CharSequence charSequence, Layout layout, a aVar);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/roledetail/ExpandableTextView$e.class */
    public interface e {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/roledetail/ExpandableTextView$f.class */
    public interface f {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/roledetail/ExpandableTextView$g.class */
    public static final class g extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f69249b;

        public g(String str) {
            this.f69249b = str;
        }

        @Override // com.bilibili.ogv.misc.roledetail.ExpandableTextView.a
        public final CharSequence a() {
            String str = this.f69249b;
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new ForegroundColorSpan(-13146994), 0, spannableString.length(), 18);
            return spannableString;
        }

        @Override // com.bilibili.ogv.misc.roledetail.ExpandableTextView.a
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
        this.f69234d = false;
        this.f69244o = true;
        this.f69246q = new a1(this, 1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8103a.f124253a);
        String string = typedArrayObtainStyledAttributes.getString(2);
        String string2 = typedArrayObtainStyledAttributes.getString(5);
        this.f69241l = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.f69242m = typedArrayObtainStyledAttributes.getBoolean(7, true);
        int i7 = typedArrayObtainStyledAttributes.getInt(4, 1);
        this.f69243n = i7;
        this.f69243n = Math.max(i7, 0);
        typedArrayObtainStyledAttributes.recycle();
        boolean zIsEmpty = TextUtils.isEmpty(string);
        c cVar = f69230r;
        if (zIsEmpty) {
            this.f69239j = cVar;
        } else {
            getContext();
            this.f69239j = new g(string);
        }
        if (TextUtils.isEmpty(string2)) {
            this.f69240k = cVar;
        } else {
            getContext();
            this.f69240k = new g(string2);
        }
    }

    public static CharSequence M(CharSequence charSequence) {
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
        CharSequence charSequence = this.f69237g;
        if (charSequence == null || !this.f69231a || this.f69232b) {
            return;
        }
        this.f69232b = true;
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        Layout layout = getLayout();
        CharSequence charSequence2 = this.f69237g;
        d dVar = this.f69245p;
        if (dVar != null) {
            if (this.h == null) {
                this.h = dVar.c(charSequence2, layout, this.f69239j);
            }
            charSequence2 = this.h;
        }
        setText(charSequence2);
    }

    public final void K() {
        this.f69233c = false;
        this.f69232b = false;
        this.f69231a = false;
        this.f69235e = 0;
        this.f69236f = 0;
        this.f69237g = null;
        this.h = null;
        this.f69238i = null;
    }

    public final void L() {
        CharSequence charSequence;
        if (this.f69237g != null && this.f69231a && this.f69232b) {
            this.f69232b = false;
            Layout layout = getLayout();
            CharSequence charSequence2 = this.f69237g;
            d dVar = this.f69245p;
            if (dVar == null) {
                charSequence = charSequence2;
            } else {
                a aVar = this.f69240k;
                if (!this.f69242m) {
                    aVar = f69230r;
                }
                if (this.f69238i == null) {
                    this.f69238i = dVar.b(charSequence2, layout, aVar, this.f69243n);
                }
                charSequence = this.f69238i;
            }
            setText(charSequence);
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
            boolean r0 = r0.f69234d
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
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.misc.roledetail.ExpandableTextView.onMeasure(int, int):void");
    }

    public void setEnableTouchToggle(boolean z6) {
        this.f69244o = z6;
    }

    public void setExpandListener(e eVar) {
    }

    public void setExpandedDesc(a aVar) {
        this.f69239j = aVar;
        if (aVar == null) {
            this.f69239j = f69230r;
        }
    }

    public void setMaxRetractLines(int i7) {
        this.f69243n = i7;
    }

    public void setOriginText(d dVar) {
        this.f69245p = dVar;
        if (dVar == null) {
            K();
            setText((CharSequence) null);
            return;
        }
        CharSequence charSequenceA = dVar.a();
        if (TextUtils.equals(this.f69237g, charSequenceA)) {
            return;
        }
        K();
        this.f69237g = charSequenceA;
        OneShotPreDrawListener.add(this, new Runnable(this) { // from class: vk0.k

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ExpandableTextView f128285a;

            {
                this.f128285a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int height;
                ExpandableTextView expandableTextView = this.f128285a;
                if (expandableTextView.f69244o) {
                    expandableTextView.setOnClickListener(null);
                }
                Layout layout = expandableTextView.getLayout();
                if (layout == null) {
                    return;
                }
                expandableTextView.f69232b = true;
                if (TextUtils.isEmpty(expandableTextView.f69239j.b()) || !expandableTextView.f69241l) {
                    height = expandableTextView.getHeight();
                } else {
                    CharSequence charSequence = expandableTextView.f69237g;
                    ExpandableTextView.d dVar2 = expandableTextView.f69245p;
                    if (dVar2 != null) {
                        if (expandableTextView.h == null) {
                            expandableTextView.h = dVar2.c(charSequence, layout, expandableTextView.f69239j);
                        }
                        charSequence = expandableTextView.h;
                    }
                    StaticLayout staticLayout = new StaticLayout(charSequence, layout.getPaint(), layout.getWidth(), layout.getAlignment(), layout.getSpacingMultiplier(), layout.getSpacingAdd(), false);
                    height = ((layout.getBottomPadding() - layout.getTopPadding()) + staticLayout.getHeight()) - (staticLayout.getBottomPadding() - staticLayout.getTopPadding());
                }
                expandableTextView.f69235e = height;
                if (layout.getLineCount() <= expandableTextView.f69243n || TextUtils.isEmpty(expandableTextView.f69237g)) {
                    expandableTextView.f69231a = false;
                    expandableTextView.J();
                    expandableTextView.requestLayout();
                } else {
                    expandableTextView.f69231a = true;
                    expandableTextView.L();
                    expandableTextView.requestLayout();
                    if (expandableTextView.f69244o) {
                        expandableTextView.setOnClickListener(expandableTextView.f69246q);
                    }
                }
            }
        });
        setText(this.f69237g);
        requestLayout();
    }

    public void setRetractedDesc(a aVar) {
        this.f69240k = aVar;
        if (aVar == null) {
            this.f69240k = f69230r;
        }
    }

    public void setShowExpandedDesc(boolean z6) {
        this.f69241l = z6;
    }

    public void setShowRetractedDesc(boolean z6) {
        this.f69242m = z6;
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.f69234d = charSequence == null || charSequence.length() == 0;
        super.setText(charSequence, bufferType);
    }

    public void setTextInterceptor(f fVar) {
    }
}
