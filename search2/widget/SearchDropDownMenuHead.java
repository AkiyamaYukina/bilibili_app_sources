package com.bilibili.search2.widget;

import Hh1.c;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.dropdownmenu.DropDownMenuContent;
import tv.danmaku.bili.widget.dropdownmenu.DropDownMenuHead;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/widget/SearchDropDownMenuHead.class */
@StabilityInferred(parameters = 0)
public final class SearchDropDownMenuHead extends DropDownMenuHead {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @Nullable
    public final LinearLayout f88927F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f88928G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f88929H;

    @JvmOverloads
    public SearchDropDownMenuHead(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public SearchDropDownMenuHead(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchDropDownMenuHead(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        this.f88927F = (LinearLayout) findViewById(2131307369);
    }

    public static void g(int i7, int i8, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return;
        }
        layoutParams2.removeRule(i7);
        layoutParams2.addRule(i8);
        view.setLayoutParams(layoutParams2);
    }

    public final void e(@NotNull DropDownMenuContent dropDownMenuContent, @NotNull ArrayList<? extends c> arrayList, @Nullable Hh1.a<? extends c> aVar) {
        LinearLayout linearLayout;
        View viewFindViewById;
        super.e(dropDownMenuContent, arrayList, aVar);
        if (!this.f88928G || (linearLayout = this.f88927F) == null) {
            return;
        }
        int childCount = linearLayout.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = linearLayout.getChildAt(i7);
            childAt.setLayoutParams(this.f88928G ? new LinearLayout.LayoutParams(-2, -1) : new LinearLayout.LayoutParams(0, -1, 1.0f));
            childAt.setPaddingRelative(this.f88928G ? this.f88929H : 0, childAt.getPaddingTop(), this.f88928G ? this.f88929H : 0, childAt.getPaddingBottom());
            View viewFindViewById2 = childAt.findViewById(2131307359);
            if (viewFindViewById2 != null && (viewFindViewById = childAt.findViewById(2131296843)) != null) {
                ImageView imageView = viewFindViewById instanceof ImageView ? (ImageView) viewFindViewById : null;
                if (imageView != null) {
                    imageView.setImageResource(2131245382);
                }
                if (this.f88928G) {
                    g(13, 15, viewFindViewById2);
                    g(13, 15, viewFindViewById);
                } else {
                    g(15, 13, viewFindViewById2);
                    g(15, 13, viewFindViewById);
                }
            }
        }
    }
}
