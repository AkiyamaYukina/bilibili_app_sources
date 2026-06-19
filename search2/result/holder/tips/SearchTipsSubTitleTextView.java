package com.bilibili.search2.result.holder.tips;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.magicasakura.widgets.TintTextView;
import kotlin.jvm.JvmOverloads;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/tips/SearchTipsSubTitleTextView.class */
@StabilityInferred(parameters = 0)
public final class SearchTipsSubTitleTextView extends TintTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f88221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f88222b;

    @JvmOverloads
    public SearchTipsSubTitleTextView(@Nullable Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public SearchTipsSubTitleTextView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public SearchTipsSubTitleTextView(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    private final int getCurrentTopMargin() {
        return getLayout().getLineCount() > 1 ? this.f88222b : this.f88221a;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        float currentTopMargin = getCurrentTopMargin();
        canvas.translate(0.0f, currentTopMargin);
        super.onDraw(canvas);
        canvas.translate(0.0f, -currentTopMargin);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        CharSequence text = getText();
        if (text == null || StringsKt.isBlank(text)) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight() + getCurrentTopMargin());
    }
}
