package com.bilibili.search2.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.magicasakura.widgets.TintConstraintLayout;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/widget/SearchArticleConstraintLayout.class */
@StabilityInferred(parameters = 0)
public final class SearchArticleConstraintLayout extends TintConstraintLayout {
    @JvmOverloads
    public SearchArticleConstraintLayout(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public SearchArticleConstraintLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public SearchArticleConstraintLayout(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        boolean z6;
        super.onMeasure(i7, i8);
        int childCount = getChildCount();
        int i9 = 0;
        boolean z7 = false;
        while (true) {
            z6 = z7;
            if (i9 >= childCount) {
                break;
            }
            View childAt = getChildAt(i9);
            boolean z8 = z6;
            if (childAt.getId() == 2131308958) {
                TextView textView = childAt instanceof TextView ? (TextView) childAt : null;
                z8 = z6;
                if (textView != null) {
                    z8 = z6;
                    if (textView.getLineCount() > 1) {
                        z8 = true;
                    }
                }
            }
            if (childAt.getId() == 2131296873) {
                if (z8) {
                    TextView textView2 = null;
                    if (childAt instanceof TextView) {
                        textView2 = (TextView) childAt;
                    }
                    if (textView2 != null) {
                        textView2.setMaxLines(1);
                    }
                } else {
                    TextView textView3 = null;
                    if (childAt instanceof TextView) {
                        textView3 = (TextView) childAt;
                    }
                    if (textView3 != null) {
                        textView3.setMaxLines(2);
                    }
                }
            }
            i9++;
            z7 = z8;
        }
        if (z6) {
            super.onMeasure(i7, i8);
        }
    }
}
