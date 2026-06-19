package com.bilibili.search2.widget;

import I.s;
import Yt0.Y;
import Yt0.a0;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.droid.ScreenUtil;
import com.bilibili.search2.api.SearchTimeAxisItem;
import com.bilibili.search2.api.VideoTimeAxisItem;
import com.bilibili.search2.component.e;
import com.bilibili.search2.utils.x;
import com.bilibili.search2.widget.TimeAxisViewV2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/widget/TimeAxisViewV2.class */
@StabilityInferred(parameters = 0)
public final class TimeAxisViewV2 extends FrameLayout {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f88959p = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ArrayList<a0> f88960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Y f88961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f88962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ArrayList<Long> f88963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f88964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final ArrayList<Integer> f88965f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f88966g;
    public float h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f88967i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f88968j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f88969k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f88970l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f88971m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f88972n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f88973o;

    @JvmOverloads
    public TimeAxisViewV2(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public TimeAxisViewV2(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public TimeAxisViewV2(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        this.f88960a = new ArrayList<>();
        Y y6 = new Y(context, 0);
        this.f88961b = y6;
        this.f88962c = ((ScreenUtil.getScreenWidth(context) - ListExtentionsKt.toPx(48)) / 3.5f) + ListExtentionsKt.toPx(8);
        this.f88963d = new ArrayList<>();
        this.f88965f = new ArrayList<>();
        this.f88966g = 3;
        this.h = Float.MAX_VALUE;
        this.f88968j = ListExtentionsKt.toPx(8);
        this.f88969k = ListExtentionsKt.toPx(8);
        this.f88970l = ListExtentionsKt.toPx(6);
        this.f88971m = ListExtentionsKt.toPx(6);
        this.f88972n = ListExtentionsKt.toPx(4.5d);
        this.f88973o = 1;
        addView(y6);
    }

    private final float getProgressFullLength() {
        return (getWidth() - this.f88968j) - this.f88969k;
    }

    private final void setColorType(int i7) {
        this.f88973o = i7;
        this.f88961b.setColorType(i7);
    }

    private final void setCurrentViewState(SearchTimeAxisItem searchTimeAxisItem) {
        int foldingStartPosition = searchTimeAxisItem.getFoldingStartPosition(getContext());
        this.f88966g = (int) searchTimeAxisItem.getFoldingSegment(getContext());
        if (searchTimeAxisItem.needFoldingShowFull(getContext()) || searchTimeAxisItem.isFoldingToEnd(getContext())) {
            this.f88961b.setProgress(getProgressFullLength());
        } else {
            this.f88961b.setProgress(((Integer) CollectionsKt.getOrNull(this.f88965f, (this.f88966g - 1) + foldingStartPosition)) != null ? r0.intValue() : 0);
        }
        if (searchTimeAxisItem.needFoldingShowFull(getContext())) {
            Iterator<T> it = this.f88960a.iterator();
            while (it.hasNext()) {
                ((a0) it.next()).a(1.0f, false);
            }
            return;
        }
        int i7 = 0;
        for (Object obj : this.f88960a) {
            if (i7 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            a0 a0Var = (a0) obj;
            if (foldingStartPosition <= i7 && i7 < this.f88966g + foldingStartPosition) {
                a0Var.a(1.0f, false);
            } else if (i7 >= this.f88966g + foldingStartPosition) {
                a0Var.a(0.0f, false);
            } else {
                a0Var.a(0.0f, true);
            }
            i7++;
        }
    }

    private final void setTimeList(List<Long> list) {
        int iE;
        this.f88963d.clear();
        this.f88963d.addAll(list);
        this.f88965f.clear();
        if (getWidth() > 0) {
            iE = getWidth();
        } else {
            Context context = getContext();
            iE = e.e(ScreenUtil.getScreenWidth(context), context) - ListExtentionsKt.toPx(e.b(context).f86404e * 2);
        }
        final int i7 = iE;
        this.f88965f.addAll(SequencesKt.toList(SequencesKt.map(CollectionsKt.asSequence(this.f88963d), new Function1(this, i7) { // from class: Yt0.b0

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TimeAxisViewV2 f29187a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f29188b;

            {
                this.f29187a = this;
                this.f29188b = i7;
            }

            public final Object invoke(Object obj) {
                return Integer.valueOf((int) ((((Long) obj).longValue() / this.f29187a.f88964e) * ((this.f29188b - r0.f88968j) - r0.f88969k)));
            }
        })));
        Iterator<a0> it = this.f88960a.iterator();
        while (it.hasNext()) {
            removeView((a0) it.next());
        }
        this.f88960a.clear();
        Iterator<Long> it2 = this.f88963d.iterator();
        while (it2.hasNext()) {
            it2.next().longValue();
            a0 a0Var = new a0(getContext(), 0);
            a0Var.setColorType(this.f88973o);
            this.f88960a.add(a0Var);
            addView(a0Var);
        }
    }

    public final void a() {
        this.f88961b.setProgress(1.0f * getProgressFullLength());
    }

    public final void b(float f7, float f8) {
        float f9 = 2;
        if (f8 >= this.h - f9 || this.f88967i) {
            this.f88961b.setProgress(getProgressFullLength());
            ArrayList<a0> arrayList = this.f88960a;
            a0 a0Var = (a0) CollectionsKt.getOrNull(arrayList, CollectionsKt.getLastIndex(arrayList));
            if (a0Var != null) {
                a0Var.a(1.0f, false);
            }
            ArrayList<a0> arrayList2 = this.f88960a;
            a0 a0Var2 = (a0) CollectionsKt.getOrNull(arrayList2, CollectionsKt.getLastIndex(arrayList2) - this.f88966g);
            if (a0Var2 != null) {
                a0Var2.a(0.0f, true);
                return;
            }
            return;
        }
        int i7 = this.f88966g;
        float f10 = this.f88962c;
        int i8 = (int) (f7 / f10);
        float f11 = f7 % f10;
        if (f11 != 0.0f && Math.signum(f11) != Math.signum(f10)) {
            f11 += f10;
        }
        int i9 = i7 + i8;
        float px = (f11 * 1.0f) / (i9 == this.f88965f.size() - 1 ? (this.f88962c / f9) + ListExtentionsKt.toPx(8) : this.f88962c);
        Integer num = (Integer) CollectionsKt.getOrNull(this.f88965f, i9);
        int iIntValue = num != null ? num.intValue() : getWidth() - ListExtentionsKt.toPx(24);
        int i10 = i8 - 1;
        int i11 = i7 + i10;
        Integer num2 = (Integer) CollectionsKt.getOrNull(this.f88965f, i11);
        float fIntValue = iIntValue - (num2 != null ? num2.intValue() : 0);
        a0 a0Var3 = (a0) CollectionsKt.getOrNull(this.f88960a, i9);
        if (a0Var3 != null) {
            a0Var3.a(px, false);
        }
        a0 a0Var4 = (a0) CollectionsKt.getOrNull(this.f88960a, i9 - 1);
        if (a0Var4 != null) {
            a0Var4.a(1.0f, false);
        }
        a0 a0Var5 = (a0) CollectionsKt.getOrNull(this.f88960a, i9 + 1);
        if (a0Var5 != null) {
            a0Var5.a(0.0f, false);
        }
        a0 a0Var6 = (a0) CollectionsKt.getOrNull(this.f88960a, i8);
        if (a0Var6 != null) {
            a0Var6.a(1 - px, true);
        }
        a0 a0Var7 = (a0) CollectionsKt.getOrNull(this.f88960a, i10);
        if (a0Var7 != null) {
            a0Var7.a(0.0f, true);
        }
        a0 a0Var8 = (a0) CollectionsKt.getOrNull(this.f88960a, i8 + 1);
        if (a0Var8 != null) {
            a0Var8.a(1.0f, false);
        }
        Y y6 = this.f88961b;
        float fIntValue2 = 0.0f;
        if (((Integer) CollectionsKt.getOrNull(this.f88965f, i11)) != null) {
            fIntValue2 = r0.intValue() + (fIntValue * px);
        }
        y6.setProgress(fIntValue2);
    }

    public final int getCircleRadius() {
        return this.f88972n;
    }

    public final float getListMaxOffset() {
        return this.h;
    }

    public final int getMarginBottom() {
        return this.f88971m;
    }

    public final int getMarginTop() {
        return this.f88970l;
    }

    public final boolean getNeedShowFull() {
        return this.f88967i;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        super.onLayout(z6, i7, i8, i9, i10);
        if (!this.f88963d.isEmpty() && getWidth() > 0) {
            this.f88965f.clear();
            float width = (getWidth() - this.f88968j) - this.f88969k;
            ArrayList<Integer> arrayList = this.f88965f;
            ArrayList<Long> arrayList2 = this.f88963d;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator<Long> it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(Integer.valueOf((int) ((it.next().longValue() / this.f88964e) * width)));
            }
            arrayList.addAll(arrayList3);
        }
        int i11 = 0;
        for (a0 a0Var : this.f88960a) {
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            a0 a0Var2 = a0Var;
            Integer num = (Integer) CollectionsKt.getOrNull(this.f88965f, i11);
            int px = ListExtentionsKt.toPx(1.5d) + (num != null ? num.intValue() : 0) + this.f88968j;
            int px2 = ListExtentionsKt.toPx(1.5d) + this.f88970l;
            int i12 = this.f88972n;
            a0Var2.layout(px - i12, px2 - i12, px + i12, px2 + i12);
            a0Var2.invalidate();
            i11++;
        }
        this.f88961b.layout(this.f88968j, this.f88970l, getWidth() - this.f88969k, ListExtentionsKt.toPx(3) + this.f88970l);
    }

    public final void setCircleRadius(int i7) {
        this.f88972n = i7;
    }

    public final void setListMaxOffset(float f7) {
        this.h = f7;
    }

    public final void setMarginBottom(int i7) {
        this.f88971m = i7;
    }

    public final void setMarginTop(int i7) {
        this.f88970l = i7;
    }

    public final void setNeedShowFull(boolean z6) {
        this.f88967i = z6;
    }

    public final void setTimeAxisViewData(@NotNull SearchTimeAxisItem searchTimeAxisItem) {
        Sequence sequenceAsSequence;
        Sequence map;
        List<Long> mutableList;
        setVisibility(0);
        this.f88964e = (searchTimeAxisItem.getEndSecond() - searchTimeAxisItem.getStartSecond()) + 1;
        setColorType(searchTimeAxisItem.getColor());
        this.f88967i = searchTimeAxisItem.needFoldingShowFull(getContext());
        this.f88962c = x.a(searchTimeAxisItem.getFoldingSegment(getContext()), getContext()) + ListExtentionsKt.toPx(8);
        List<VideoTimeAxisItem> items = searchTimeAxisItem.getItems();
        if (items != null && (sequenceAsSequence = CollectionsKt.asSequence(items)) != null && (map = SequencesKt.map(sequenceAsSequence, new s(searchTimeAxisItem, 1))) != null && (mutableList = SequencesKt.toMutableList(map)) != null) {
            setTimeList(mutableList);
        }
        setCurrentViewState(searchTimeAxisItem);
    }
}
