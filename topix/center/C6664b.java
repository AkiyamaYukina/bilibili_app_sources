package com.bilibili.topix.center;

import android.graphics.Canvas;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.bilibili.topix.center.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/center/b.class */
@StabilityInferred(parameters = 0)
public final class C6664b extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final C6663a f112412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final int[] f112413b = new int[2];

    public C6664b(@NotNull C6663a c6663a) {
        this.f112412a = c6663a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDrawOver(@NotNull Canvas canvas, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        super.onDrawOver(canvas, recyclerView, state);
        int childCount = recyclerView.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(recyclerView.getChildAt(i7));
            if (childViewHolder instanceof D) {
                LinearLayout linearLayout = ((D) childViewHolder).f112355a.f18592b;
                int[] iArr = this.f112413b;
                linearLayout.getLocationInWindow(iArr);
                int i8 = iArr[1];
                recyclerView.getLocationInWindow(iArr);
                int i9 = iArr[1];
                int width = recyclerView.getWidth();
                C6663a c6663a = this.f112412a;
                String str = c6663a.f112391a;
                float f7 = c6663a.f112392b;
                float f8 = c6663a.f112393c;
                int i10 = c6663a.f112394d;
                int i11 = c6663a.f112395e;
                float f9 = c6663a.f112396f;
                int i12 = c6663a.f112397g;
                int i13 = c6663a.h;
                float f10 = c6663a.f112398i;
                float f11 = c6663a.f112399j;
                float f12 = c6663a.f112400k;
                float f13 = c6663a.f112401l;
                float f14 = c6663a.f112402m;
                float f15 = c6663a.f112404o;
                float f16 = c6663a.f112405p;
                C6663a c6663a2 = new C6663a(str, f7, f8, i10, i11, f9, i12, i13, f10, f11, f12, f13, f14, width, f15, f16);
                float width2 = recyclerView.getWidth();
                float px = ListExtentionsKt.toPx(12.0f);
                float fB = c6663a2.b();
                float px2 = ListExtentionsKt.toPx(c6663a.f112404o);
                float height = linearLayout.getHeight() + (i8 - i9);
                float px3 = ListExtentionsKt.toPx(f16);
                int iSave = canvas.save();
                canvas.translate(((width2 - px) - fB) + px2, height + px3);
                try {
                    C6665c.a(canvas, c6663a2);
                    return;
                } finally {
                    canvas.restoreToCount(iSave);
                }
            }
        }
    }
}
