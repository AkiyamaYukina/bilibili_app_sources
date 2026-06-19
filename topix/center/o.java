package com.bilibili.topix.center;

import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/center/o.class */
@StabilityInferred(parameters = 0)
public final class o extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f112432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f112433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Paint f112434c;

    public o(int i7, int i8) {
        this.f112432a = i7;
        this.f112433b = i8;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f112434c = paint;
    }

    public static C6667e a(RecyclerView recyclerView) {
        Object next;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null) {
            return null;
        }
        if (adapter instanceof C6667e) {
            return (C6667e) adapter;
        }
        C6667e c6667e = null;
        if (adapter instanceof ConcatAdapter) {
            Iterator<T> it = ((ConcatAdapter) adapter).O().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((RecyclerView.Adapter) next) instanceof C6667e) {
                    break;
                }
            }
            RecyclerView.Adapter adapter2 = (RecyclerView.Adapter) next;
            c6667e = null;
            if (adapter2 != null) {
                RecyclerView.Adapter adapter3 = null;
                if (adapter2 instanceof C6667e) {
                    adapter3 = adapter2;
                }
                c6667e = (C6667e) adapter3;
            }
        }
        return c6667e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(@NotNull Rect rect, @NotNull View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        C6667e c6667eA = a(recyclerView);
        if (c6667eA == null) {
            return;
        }
        int itemViewType = c6667eA.getItemViewType(childAdapterPosition);
        n nVar = (n) CollectionsKt.getOrNull(c6667eA.f112417b, childAdapterPosition);
        if (itemViewType == TopixCenterItemType.TOPIC_COLLECTED_LIST.ordinal()) {
            rect.bottom = ListExtentionsKt.toPx(10);
            if (childAdapterPosition < 1 || c6667eA.getItemViewType(childAdapterPosition - 1) != TopixCenterItemType.TOPIC_IP.ordinal()) {
                return;
            }
            rect.top = ListExtentionsKt.toPx(12);
            return;
        }
        boolean z6 = nVar instanceof Section;
        if (z6 && ((Section) nVar).getChildType() == TopixCenterItemType.TOPIC_COMMON) {
            if (childAdapterPosition < 1 || c6667eA.getItemViewType(childAdapterPosition - 1) != TopixCenterItemType.TOPIC_HOT.ordinal()) {
                rect.top = ListExtentionsKt.toPx(12);
                return;
            } else {
                rect.top = ListExtentionsKt.toPx(22);
                return;
            }
        }
        if (z6) {
            if (((Section) nVar).getChildType() != TopixCenterItemType.TOPIC_IP) {
                rect.top = ListExtentionsKt.toPx(12);
            } else {
                rect.top = ListExtentionsKt.toPx(6);
                rect.bottom = ListExtentionsKt.toPx(2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0111  */
    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDrawOver(@org.jetbrains.annotations.NotNull android.graphics.Canvas r9, @org.jetbrains.annotations.NotNull androidx.recyclerview.widget.RecyclerView r10, @org.jetbrains.annotations.NotNull androidx.recyclerview.widget.RecyclerView.State r11) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.topix.center.o.onDrawOver(android.graphics.Canvas, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$State):void");
    }
}
