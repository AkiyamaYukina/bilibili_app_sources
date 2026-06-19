package com.bilibili.music.podcast.view;

import android.graphics.Canvas;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.mobile.BLMobileHumanActionNative;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/r.class */
public final class r extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f67316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f67317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GestureDetector f67318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f67319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<Long, RecyclerView.ViewHolder> f67320e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f67321f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f67322g;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/r$a.class */
    public interface a<T extends RecyclerView.ViewHolder> {
        RecyclerView.ViewHolder a(int i7, RecyclerView recyclerView);

        long b(int i7);

        void d(int i7, RecyclerView.ViewHolder viewHolder);

        boolean e(MotionEvent motionEvent, int i7);
    }

    public r(RecyclerView recyclerView, a aVar) {
        this.f67316a = recyclerView;
        this.f67317b = aVar;
        this.f67318c = new GestureDetector(recyclerView.getContext(), new p(this, recyclerView));
        q qVar = new q(this);
        this.f67319d = qVar;
        this.f67316a.addOnItemTouchListener(qVar);
    }

    public final void a() {
        this.f67316a.removeItemDecoration(this);
        this.f67316a.removeOnItemTouchListener(this.f67319d);
        this.f67316a = null;
        ((HashMap) this.f67320e).clear();
    }

    public final RecyclerView.ViewHolder b(int i7, RecyclerView recyclerView) {
        a aVar = this.f67317b;
        long jB = aVar.b(i7);
        if (((HashMap) this.f67320e).containsKey(Long.valueOf(jB))) {
            return (RecyclerView.ViewHolder) ((HashMap) this.f67320e).get(Long.valueOf(jB));
        }
        RecyclerView.ViewHolder viewHolderA = aVar.a(i7, recyclerView);
        View view = viewHolderA.itemView;
        aVar.d(i7, viewHolderA);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(recyclerView.getMeasuredWidth(), BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(recyclerView.getMeasuredHeight(), 0);
        view.measure(ViewGroup.getChildMeasureSpec(iMakeMeasureSpec, recyclerView.getPaddingRight() + recyclerView.getPaddingLeft(), view.getLayoutParams().width), ViewGroup.getChildMeasureSpec(iMakeMeasureSpec2, recyclerView.getPaddingBottom() + recyclerView.getPaddingTop(), view.getLayoutParams().height));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        ((HashMap) this.f67320e).put(Long.valueOf(jB), viewHolderA);
        return viewHolderA;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void getItemOffsets(android.graphics.Rect r7, android.view.View r8, androidx.recyclerview.widget.RecyclerView r9, androidx.recyclerview.widget.RecyclerView.State r10) {
        /*
            r6 = this;
            r0 = r9
            r1 = r8
            int r0 = r0.getChildAdapterPosition(r1)
            r11 = r0
            r0 = r11
            r1 = -1
            if (r0 == r1) goto L5e
            r0 = r6
            com.bilibili.music.podcast.view.r$a r0 = r0.f67317b
            r1 = r11
            long r0 = r0.b(r1)
            r1 = -1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L5e
            r0 = r11
            if (r0 != 0) goto L27
            goto L42
        L27:
            r0 = r6
            com.bilibili.music.podcast.view.r$a r0 = r0.f67317b
            r8 = r0
            r0 = r8
            r1 = r11
            r2 = 1
            int r1 = r1 - r2
            long r0 = r0.b(r1)
            r1 = r8
            r2 = r11
            long r1 = r1.b(r2)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L5e
        L42:
            r0 = r6
            r1 = r11
            r2 = r9
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r0.b(r1, r2)
            android.view.View r0 = r0.itemView
            int r0 = r0.getHeight()
            r11 = r0
            r0 = r6
            r1 = r11
            r0.f67322g = r1
            r0 = r6
            boolean r0 = r0.f67321f
            if (r0 == 0) goto L61
        L5e:
            r0 = 0
            r11 = r0
        L61:
            r0 = r7
            r1 = 0
            r2 = r11
            r3 = 0
            r4 = 0
            r0.set(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.music.podcast.view.r.getItemOffsets(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$State):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int iMax;
        int childCount = recyclerView.getChildCount();
        long j7 = -1;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = recyclerView.getChildAt(i7);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
            if (childAdapterPosition != -1 && this.f67317b.b(childAdapterPosition) != -1) {
                a aVar = this.f67317b;
                long jB = aVar.b(childAdapterPosition);
                if (jB != j7) {
                    View view = b(childAdapterPosition, recyclerView).itemView;
                    canvas.save();
                    int left = childAt.getLeft();
                    int height = view.getHeight();
                    this.f67322g = height;
                    if (this.f67321f) {
                        height = 0;
                    }
                    int y6 = ((int) childAt.getY()) - height;
                    if (i7 == 0) {
                        int childCount2 = recyclerView.getChildCount();
                        long jB2 = aVar.b(childAdapterPosition);
                        int i8 = 1;
                        while (true) {
                            if (i8 >= childCount2) {
                                break;
                            }
                            int childAdapterPosition2 = recyclerView.getChildAdapterPosition(recyclerView.getChildAt(i8));
                            if (childAdapterPosition2 != -1 && aVar.b(childAdapterPosition2) != jB2) {
                                iMax = ((int) recyclerView.getChildAt(i8).getY()) - (b(childAdapterPosition2, recyclerView).itemView.getHeight() + height);
                                if (iMax >= 0) {
                                    break;
                                }
                            } else {
                                i8++;
                            }
                        }
                        iMax = Math.max(0, y6);
                    } else {
                        iMax = y6;
                    }
                    float f7 = left;
                    float f8 = iMax;
                    canvas.translate(f7, f8);
                    view.setTranslationX(f7);
                    view.setTranslationY(f8);
                    view.draw(canvas);
                    canvas.restore();
                    j7 = jB;
                }
            }
        }
    }
}
