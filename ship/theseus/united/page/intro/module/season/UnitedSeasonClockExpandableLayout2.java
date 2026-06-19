package com.bilibili.ship.theseus.united.page.intro.module.season;

import android.content.Context;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.droid.thread.HandlerThreads;
import kotlin.jvm.JvmOverloads;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.videopage.common.widget.view.ExpandableTextView;
import tv.danmaku.biliplayerv2.utils.DpUtils;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonClockExpandableLayout2.class */
@StabilityInferred(parameters = 0)
public final class UnitedSeasonClockExpandableLayout2 extends LinearLayout {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f101522l = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f101523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f101524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f101525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f101526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f101527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f101528f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f101529g;

    @Nullable
    public InterfaceC6341c h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public CharSequence f101530i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public CharSequence f101531j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public TextView f101532k;

    @JvmOverloads
    public UnitedSeasonClockExpandableLayout2(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public UnitedSeasonClockExpandableLayout2(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public UnitedSeasonClockExpandableLayout2(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        this.f101523a = (int) DpUtils.dp2px(context, 44.0f);
        this.f101527e = true;
    }

    public static CharSequence a(Layout layout, CharSequence charSequence) {
        yh1.e eVar;
        int spanStart;
        if (charSequence == null || charSequence.length() == 0) {
            return "";
        }
        TextPaint paint = layout.getPaint();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int lineStart = layout.getLineStart(0);
        int lineEnd = layout.getLineEnd(0);
        float width = layout.getWidth();
        CharSequence charSequenceS = ExpandableTextView.S(charSequence.subSequence(lineStart, lineEnd));
        float fMeasureText = width - paint.measureText("... ");
        if (charSequenceS instanceof SpannableStringBuilder) {
            SpannableStringBuilder spannableStringBuilder2 = (SpannableStringBuilder) charSequenceS;
            yh1.e[] eVarArr = (yh1.e[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), yh1.e.class);
            if (eVarArr.length != 0 && (spanStart = spannableStringBuilder2.getSpanStart((eVar = eVarArr[0]))) == 0) {
                spannableStringBuilder2.subSequence(spanStart, spannableStringBuilder2.getSpanEnd(eVar));
                paint.getFontMetricsInt();
                eVar.getClass();
                throw null;
            }
        }
        float[] fArr = new float[1];
        int iBreakText = paint.breakText(charSequenceS, 0, charSequenceS.length(), true, fMeasureText, fArr);
        if (iBreakText <= 0) {
            spannableStringBuilder.append(charSequence.subSequence(0, lineStart));
        } else {
            spannableStringBuilder.append(ExpandableTextView.S(charSequence.subSequence(0, lineStart)));
            spannableStringBuilder.append(charSequenceS.subSequence(0, RangesKt.coerceAtMost(charSequenceS.length(), iBreakText)));
        }
        spannableStringBuilder.append((CharSequence) "...").append((CharSequence) " ");
        ExpandableTextView.d.e(spannableStringBuilder, paint, fMeasureText - fArr[0]);
        return spannableStringBuilder;
    }

    public final void b() {
        if (getParent().isLayoutRequested()) {
            HandlerThreads.post(0, new com.bilibili.bplus.followinglist.detail.g(this, 1));
        } else {
            requestLayout();
        }
    }

    public final void c() {
        if (!this.f101526d || this.f101525c) {
            return;
        }
        this.f101525c = true;
        TextView textView = this.f101532k;
        if (textView != null) {
            textView.setText(this.f101530i);
        }
        InterfaceC6341c interfaceC6341c = this.h;
        if (interfaceC6341c != null) {
            interfaceC6341c.onStateChange();
        }
        getLayoutParams().height = this.f101524b;
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        if (getChildCount() <= 0) {
            super.onMeasure(i7, i8);
            return;
        }
        super.onMeasure(i7, i8);
        if (this.f101527e) {
            this.f101524b = getMeasuredHeight();
            int childCount = getChildCount();
            int i9 = 0;
            while (true) {
                if (i9 >= childCount) {
                    break;
                }
                if (getChildAt(i9).getVisibility() == 0) {
                    View childAt = getChildAt(i9);
                    TextView textView = childAt instanceof TextView ? (TextView) childAt : null;
                    boolean z6 = true;
                    if (textView != null) {
                        this.f101532k = textView;
                        this.f101530i = textView.getText();
                        textView.getPaint().measureText(textView.getText().toString());
                        StaticLayout staticLayout = new StaticLayout(this.f101530i, textView.getPaint(), getMeasuredWidth() - getPaddingRight(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                        this.f101526d = getChildCount() > 1 || staticLayout.getLineCount() > 1;
                        if (staticLayout.getLineCount() > 0) {
                            this.f101523a = staticLayout.getLineBottom(0) - staticLayout.getLineTop(0);
                        }
                        if (this.f101526d) {
                            this.f101531j = textView.getLineCount() > 1 ? a(staticLayout, this.f101530i) : this.f101530i;
                        }
                    } else {
                        if (getChildCount() <= 1) {
                            z6 = false;
                        }
                        this.f101526d = z6;
                    }
                    InterfaceC6341c interfaceC6341c = this.h;
                    if (interfaceC6341c != null) {
                        interfaceC6341c.a(this.f101526d);
                    }
                } else {
                    i9++;
                }
            }
            if (this.f101525c) {
                c();
                b();
            } else {
                this.f101525c = false;
                TextView textView2 = this.f101532k;
                if (textView2 != null) {
                    textView2.setText(this.f101531j);
                }
                InterfaceC6341c interfaceC6341c2 = this.h;
                if (interfaceC6341c2 != null) {
                    interfaceC6341c2.onStateChange();
                }
                getLayoutParams().height = this.f101523a;
                b();
            }
            this.f101527e = false;
        }
    }

    public final void setExpandListener(@NotNull InterfaceC6341c interfaceC6341c) {
        this.h = interfaceC6341c;
    }
}
