package com.bilibili.search2.utils;

import android.content.Context;
import android.view.ViewGroup;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.search2.component.SearchWindowSize;
import com.bilibili.search2.utils.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/utils/s.class */
public final class s {
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static Pair a(Context context, CoverAspectRatio coverAspectRatio, boolean z6, boolean z7, int i7) throws NoWhenBranchMatchedException {
        int px = ListExtentionsKt.toPx(8);
        if ((i7 & 16) != 0) {
            z7 = false;
        }
        Integer numA = n.a(context, new n.a(px, 0, z6, 8, z7, true));
        return numA != null ? new Pair(numA, Integer.valueOf(coverAspectRatio.calculateHeight(numA.intValue()))) : null;
    }

    public static Integer b(Context context, int i7, boolean z6) {
        int px = ListExtentionsKt.toPx(8);
        if ((i7 & 4) != 0) {
            z6 = false;
        }
        return n.a(context, new n.a(px, 0, z6, 8, false, false));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static void c(BiliImageView biliImageView, Context context, CoverAspectRatio coverAspectRatio, boolean z6, boolean z7, boolean z8, int i7) throws NoWhenBranchMatchedException {
        int px = ListExtentionsKt.toPx(8);
        if ((i7 & 4) != 0) {
            coverAspectRatio = CoverAspectRatio.RATIO_16_9;
        }
        if ((i7 & 8) != 0) {
            z6 = false;
        }
        if ((i7 & 16) != 0) {
            z7 = false;
        }
        if ((i7 & 32) != 0) {
            z8 = false;
        }
        Integer numA = n.a(context, new n.a(px, 0, z6, 8, z7, z8));
        if (numA != null) {
            int iIntValue = numA.intValue();
            ViewGroup.LayoutParams layoutParams = biliImageView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = iIntValue;
                layoutParams.height = coverAspectRatio.calculateHeight(iIntValue);
            } else {
                layoutParams = null;
            }
            biliImageView.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static void d(BiliImageView biliImageView, Context context, int i7, int i8, Integer num) throws NoWhenBranchMatchedException {
        Integer numA = n.a(context, new n.a(ListExtentionsKt.toPx(8), 0, true, 8, false, true));
        if (numA != null) {
            int iIntValue = numA.intValue();
            int iIntValue2 = num.intValue();
            if (iIntValue2 > 0) {
                float f7 = iIntValue / iIntValue2;
                int i9 = (int) (i7 * f7);
                int i10 = (int) (i8 * f7);
                ViewGroup.LayoutParams layoutParams = biliImageView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = i10;
                    layoutParams.height = i9;
                } else {
                    layoutParams = null;
                }
                biliImageView.setLayoutParams(layoutParams);
            }
        }
    }

    public static final void e(@NotNull BiliImageView biliImageView, @NotNull Context context, @NotNull Pair<Integer, Integer> pair, @NotNull Pair<Integer, Integer> pair2) {
        Pair<Integer, Integer> pair3;
        if (com.bilibili.search2.component.a.b()) {
            pair3 = pair;
            if (com.bilibili.search2.component.e.b(context).f86401b != SearchWindowSize.COMPACT) {
                pair3 = com.bilibili.search2.component.e.b(context).f86403d < ListExtentionsKt.toPx(550) ? pair : pair2;
            }
        } else {
            pair3 = pair;
        }
        ViewGroup.LayoutParams layoutParams = biliImageView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = ((Number) pair3.getFirst()).intValue();
            layoutParams.height = ((Number) pair3.getSecond()).intValue();
        } else {
            layoutParams = null;
        }
        biliImageView.setLayoutParams(layoutParams);
    }
}
