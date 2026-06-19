package com.bilibili.pegasus.verticaltab.widget;

import DI0.f;
import Wp0.a;
import Wp0.b;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.FlowLayout;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/verticaltab/widget/VerticalTabsView.class */
@StabilityInferred(parameters = 0)
public final class VerticalTabsView extends FlowLayout {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Function1<? super Integer, Unit> f78988f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public List<? extends a> f78989g;

    @Nullable
    public View h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f78990i;

    @JvmOverloads
    public VerticalTabsView(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @JvmOverloads
    public VerticalTabsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public VerticalTabsView(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        this.f78989g = CollectionsKt.emptyList();
        this.f78990i = -1;
    }

    public final int getSelectedPosition() {
        return this.f78990i;
    }

    @Nullable
    public final Function1<Integer, Unit> getTagClickListener() {
        return this.f78988f;
    }

    @NotNull
    public final List<a> getTagList() {
        return this.f78989g;
    }

    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        super.onLayout(z6, i7, i8, i9, i10);
        List<FlowLayout.b> list = ((FlowLayout) this).lines;
        if (list != null) {
            for (FlowLayout.b bVar : list) {
                int i11 = bVar.i;
                for (int i12 = 0; i12 < i11; i12++) {
                    View view = bVar.a[i12];
                    FlowLayout.a layoutParams = view.getLayoutParams();
                    int i13 = layoutParams.j;
                    int i14 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    view.layout(i13 + i14, layoutParams.k + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, view.getMeasuredWidth() + i13 + i14, view.getMeasuredHeight() + layoutParams.k + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setSelectedPosition(int i7) {
        if (this.f78990i != i7) {
            this.f78990i = i7;
            View view = this.h;
            if (view != null) {
                view.setSelected(false);
            }
            if (this.f78990i != -1) {
                int childCount = getChildCount();
                for (int i8 = 0; i8 < childCount; i8++) {
                    View childAt = getChildAt(i8);
                    b bVar = childAt instanceof b ? (b) childAt : null;
                    Integer num = bVar != null ? bVar.f27034b : null;
                    if (num != null && num.intValue() == i7) {
                        this.h = childAt;
                        ((b) childAt).setSelected(true);
                        return;
                    }
                }
            }
        }
    }

    public final void setTagClickListener(@Nullable Function1<? super Integer, Unit> function1) {
        this.f78988f = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setTagList(@NotNull List<? extends a> list) {
        this.f78989g = list;
        removeAllViewsInLayout();
        setSelectedPosition(-1);
        this.h = null;
        List<? extends a> list2 = this.f78989g;
        ArrayList<b> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        int i7 = 0;
        for (Object obj : list2) {
            if (i7 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            a aVar = (a) obj;
            b bVar = new b(getContext(), 0);
            bVar.f27033a.setText(aVar.getTitle());
            bVar.f27034b = Integer.valueOf(i7);
            arrayList.add(bVar);
            i7++;
        }
        for (b bVar2 : arrayList) {
            addViewInLayout(bVar2, -1, generateDefaultLayoutParams());
            bVar2.setOnClickListener(new f(this, 1));
        }
        requestLayout();
    }
}
