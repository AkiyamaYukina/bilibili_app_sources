package com.bilibili.opd.app.bizcommon.hybridruntime.scroll;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.opd.app.bizcommon.hybridruntime.scroll.ConsecutiveScrollerLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/hybridruntime/scroll/c.class */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Rect f73623a = new Rect();

    public static void a(List<View> list, View view, int i7, int i8) {
        if (h(view) && i(i7, i8, view)) {
            ((ArrayList) list).add(view);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i9 = 0; i9 < childCount; i9++) {
                    a(list, viewGroup.getChildAt(i9), i7, i8);
                }
            }
        }
    }

    public static boolean b(View view, int i7) {
        View viewG = g(view);
        if (!(viewG instanceof RecyclerView)) {
            return viewG.canScrollVertically(i7);
        }
        RecyclerView recyclerView = (RecyclerView) viewG;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        boolean z6 = false;
        if (layoutManager != null) {
            z6 = false;
            if (adapter != null) {
                z6 = false;
                if (adapter.getItemCount() > 0) {
                    if (layoutManager.findViewByPosition(i7 > 0 ? adapter.getItemCount() - 1 : 0) == null) {
                        return true;
                    }
                    int childCount = recyclerView.getChildCount();
                    if (i7 > 0) {
                        int i8 = childCount - 1;
                        while (true) {
                            z6 = false;
                            if (i8 < 0) {
                                break;
                            }
                            View childAt = recyclerView.getChildAt(i8);
                            Rect rect = f73623a;
                            recyclerView.getDecoratedBoundsWithMargins(childAt, rect);
                            if (rect.bottom > recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                                break;
                            }
                            i8--;
                        }
                        z6 = true;
                    } else {
                        int i9 = 0;
                        while (true) {
                            z6 = false;
                            if (i9 >= childCount) {
                                break;
                            }
                            View childAt2 = recyclerView.getChildAt(i9);
                            Rect rect2 = f73623a;
                            recyclerView.getDecoratedBoundsWithMargins(childAt2, rect2);
                            if (rect2.top < recyclerView.getPaddingTop()) {
                                break;
                            }
                            i9++;
                        }
                        z6 = true;
                    }
                }
            }
        }
        return z6;
    }

    public static int c(View view) {
        return g(view).getScrollY();
    }

    public static int d(ConsecutiveScrollerLayout consecutiveScrollerLayout, MotionEvent motionEvent, int i7) {
        consecutiveScrollerLayout.getLocationOnScreen(new int[2]);
        return (int) (motionEvent.getX(i7) + r0[0]);
    }

    public static int e(ConsecutiveScrollerLayout consecutiveScrollerLayout, MotionEvent motionEvent, int i7) {
        consecutiveScrollerLayout.getLocationOnScreen(new int[2]);
        return (int) (motionEvent.getY(i7) + r0[1]);
    }

    public static int f(View view) {
        if (h(view) && b(view, 1)) {
            return Math.max(-c(view), 1);
        }
        return 0;
    }

    public static View g(View view) {
        View currentScrollerView;
        while (true) {
            currentScrollerView = view;
            if (!(view instanceof b)) {
                break;
            }
            currentScrollerView = ((b) view).getCurrentScrollerView();
            if (view == currentScrollerView) {
                break;
            }
            view = currentScrollerView;
        }
        return currentScrollerView;
    }

    public static boolean h(View view) {
        if (view == null) {
            return false;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConsecutiveScrollerLayout.LayoutParams) {
            return ((ConsecutiveScrollerLayout.LayoutParams) layoutParams).f73619a;
        }
        return true;
    }

    public static boolean i(int i7, int i8, View view) {
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i9 = iArr[0];
        int i10 = iArr[1];
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        boolean z6 = false;
        if (i7 >= i9) {
            z6 = false;
            if (i7 <= measuredWidth + i9) {
                z6 = false;
                if (i8 >= i10) {
                    z6 = false;
                    if (i8 <= measuredHeight + i10) {
                        z6 = true;
                    }
                }
            }
        }
        return z6;
    }
}
