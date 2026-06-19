package com.bilibili.pegasus.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.foundation.lazy.grid.b0;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.PagerSlidingTabStrip;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/widgets/ReportPagerSlidingTabStrip.class */
@StabilityInferred(parameters = 0)
public final class ReportPagerSlidingTabStrip extends PagerSlidingTabStrip {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f79193v = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public Function1<? super Integer, Unit> f79194u;

    public ReportPagerSlidingTabStrip(@NotNull Context context) {
        this(context, null);
    }

    public ReportPagerSlidingTabStrip(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ((PagerSlidingTabStrip) this).tabsContainer.setGravity(17);
    }

    public static Pair d(int i7, ReportPagerSlidingTabStrip reportPagerSlidingTabStrip) {
        return TuplesKt.to(Integer.valueOf(i7), ((PagerSlidingTabStrip) reportPagerSlidingTabStrip).tabsContainer.getChildAt(i7));
    }

    public final void e(final int i7) {
        Iterator it = SequencesKt.map(SequencesKt.filter(SequencesKt.filter(SequencesKt.filter(SequencesKt.map(CollectionsKt.asSequence(RangesKt.until(0, ((PagerSlidingTabStrip) this).tabsContainer.getChildCount())), new b0(this, 1)), new com.bilibili.lib.lynx.c(1)), new Function1(i7) { // from class: com.bilibili.pegasus.widgets.r

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f79266a;

            {
                this.f79266a = i7;
            }

            public final Object invoke(Object obj) {
                int i8 = ReportPagerSlidingTabStrip.f79193v;
                return Boolean.valueOf(((View) ((Pair) obj).getSecond()).getRight() >= this.f79266a);
            }
        }), new Function1(i7, this) { // from class: com.bilibili.pegasus.widgets.s

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f79267a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final ReportPagerSlidingTabStrip f79268b;

            {
                this.f79267a = i7;
                this.f79268b = this;
            }

            public final Object invoke(Object obj) {
                int i8 = ReportPagerSlidingTabStrip.f79193v;
                return Boolean.valueOf(((View) ((Pair) obj).getSecond()).getLeft() <= this.f79268b.getWidth() + this.f79267a);
            }
        }), new HX.a(1)).iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            Function1<? super Integer, Unit> function1 = this.f79194u;
            if (function1 != null) {
                function1.invoke(Integer.valueOf(iIntValue));
            }
        }
    }

    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        e(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onScrollChanged(int i7, int i8, int i9, int i10) {
        super/*android.widget.HorizontalScrollView*/.onScrollChanged(i7, i8, i9, i10);
        com.bilibili.bplus.im.protobuf.a.b(i9, i7, "Scroll from ", " to ", "ReportPagerSlidingTabStrip");
        e(i7);
    }

    public final void setOnTabItemShowListener(@Nullable Function1<? super Integer, Unit> function1) {
        this.f79194u = function1;
    }
}
