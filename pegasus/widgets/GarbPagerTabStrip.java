package com.bilibili.pegasus.widgets;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.viewpager.widget.ViewPager;
import com.bilibili.lib.ui.garb.Garb;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.PagerSlidingTabStrip;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/widgets/GarbPagerTabStrip.class */
@StabilityInferred(parameters = 0)
public final class GarbPagerTabStrip extends PagerSlidingTabStrip {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f79171v = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public Garb f79172u;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/widgets/GarbPagerTabStrip$a.class */
    public static final class a extends PagerSlidingTabStrip.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final GarbPagerTabStrip f79173b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(GarbPagerTabStrip garbPagerTabStrip) {
            super(garbPagerTabStrip);
            this.f79173b = garbPagerTabStrip;
        }

        public final void onPageSelected(int i7) {
            super.onPageSelected(i7);
            int i8 = GarbPagerTabStrip.f79171v;
            this.f79173b.d(i7);
        }
    }

    public GarbPagerTabStrip(@NotNull Context context) {
        this(context, null);
    }

    public GarbPagerTabStrip(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public static /* synthetic */ void getGarb$annotations() {
    }

    public final void d(int i7) {
        int i8 = 0;
        IntRange intRangeUntil = RangesKt.until(0, ((PagerSlidingTabStrip) this).tabsContainer.getChildCount());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        IntIterator it = intRangeUntil.iterator();
        while (it.hasNext()) {
            arrayList.add(((PagerSlidingTabStrip) this).tabsContainer.getChildAt(it.nextInt()));
        }
        for (Object obj : arrayList) {
            if (i8 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            View view = (View) obj;
            TextView textView = view instanceof TextView ? (TextView) view : null;
            if (textView != null) {
                Garb garb = this.f79172u;
                if (garb != null && !garb.isPure()) {
                    textView.setTextColor(garb.getFontColor());
                }
                textView.setTypeface(i8 == i7 ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
            }
            i8++;
        }
    }

    @Nullable
    public final Garb getGarb() {
        return this.f79172u;
    }

    @NotNull
    public ViewPager.OnPageChangeListener getPageListener() {
        return new a(this);
    }

    public final void setGarb(@Nullable Garb garb) {
        this.f79172u = garb;
        if (garb != null && !garb.isPure()) {
            setIndicatorColor(garb.getFontColor());
        }
        updateTabStyles();
    }

    public final void updateTabStyles() {
        super.updateTabStyles();
        d(((PagerSlidingTabStrip) this).currentPosition);
    }

    public final void updateTextViewStyle(@Nullable TextView textView) {
        super.updateTextViewStyle(textView);
        Garb garb = this.f79172u;
        if (garb == null || garb.isPure() || textView == null) {
            return;
        }
        textView.setTextColor(garb.getFontColor());
    }
}
