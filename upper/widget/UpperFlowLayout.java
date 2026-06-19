package com.bilibili.upper.widget;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bilibili.lib.infoeyes.InfoEyesManager;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.upper.module.manuscript.activity.ManuscriptsSearchActivity;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/UpperFlowLayout.class */
public class UpperFlowLayout extends ViewGroup {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f114431c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f114432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GestureDetector f114433b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/UpperFlowLayout$a.class */
    public static class a<T> extends TintTextView {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f114434a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f114435b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f114436c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f114437d;

        public a(Context context) {
            super(context, null, 0);
            this.f114434a = 16;
            this.f114435b = 6;
            this.f114436c = 5;
            this.f114437d = 4;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/UpperFlowLayout$b.class */
    public final class b implements GestureDetector.OnGestureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UpperFlowLayout f114438a;

        public b(UpperFlowLayout upperFlowLayout) {
            this.f114438a = upperFlowLayout;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f8) {
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final void onLongPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f8) {
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final void onShowPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            String string;
            W60.n nVar;
            UpperFlowLayout upperFlowLayout = this.f114438a;
            int i7 = UpperFlowLayout.f114431c;
            int i8 = 0;
            while (true) {
                if (i8 >= upperFlowLayout.getChildCount()) {
                    string = "";
                    break;
                }
                View childAt = upperFlowLayout.getChildAt(i8);
                if ((childAt instanceof TextView) && motionEvent.getX() >= childAt.getLeft() && motionEvent.getX() <= childAt.getRight() && motionEvent.getY() >= childAt.getTop() && motionEvent.getY() <= childAt.getBottom()) {
                    string = ((TextView) childAt).getText().toString();
                    break;
                }
                i8++;
            }
            if (TextUtils.isEmpty(string) || (nVar = this.f114438a.f114432a) == null) {
                return true;
            }
            ManuscriptsSearchActivity manuscriptsSearchActivity = (ManuscriptsSearchActivity) nVar.a;
            manuscriptsSearchActivity.f113506Q.setContent(string);
            manuscriptsSearchActivity.Q6(string);
            InfoEyesManager.getInstance().report2(false, "000225", new String[]{"ugc_center_contribution_history", "click"});
            return true;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/UpperFlowLayout$c.class */
    public interface c {
    }

    public UpperFlowLayout(Context context) {
        this(context, null);
    }

    public UpperFlowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f114433b = new GestureDetector(getContext(), new b(this));
        setClickable(true);
        setLongClickable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f114433b.onTouchEvent(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            Rect rect = (Rect) getChildAt(i11).getTag();
            childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        measureChildren(i7, i8);
        int size = View.MeasureSpec.getSize(i7);
        View.MeasureSpec.getMode(i7);
        int mode = View.MeasureSpec.getMode(i8);
        int size2 = View.MeasureSpec.getSize(i8);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int i9 = 0;
        int i10 = 0;
        while (i9 < getChildCount()) {
            View childAt = getChildAt(i9);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int i11 = marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + measuredWidth;
            int i12 = marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + measuredHeight;
            int iMax = Math.max(i10, i12);
            int paddingLeft2 = paddingLeft;
            int i13 = paddingTop;
            i10 = iMax;
            if (getPaddingRight() + paddingLeft + i11 > size) {
                paddingLeft2 = getPaddingLeft();
                i13 = paddingTop + iMax;
                i10 = i12;
            }
            paddingLeft = paddingLeft2 + i11;
            childAt.setTag(new Rect((paddingLeft - i11) + marginLayoutParams.leftMargin, marginLayoutParams.topMargin + i13, paddingLeft - marginLayoutParams.rightMargin, (i12 + i13) - marginLayoutParams.bottomMargin));
            i9++;
            paddingTop = i13;
        }
        int[] iArr = {size, getPaddingBottom() + paddingTop + i10};
        setMeasuredDimension(iArr[0], mode == 1073741824 ? size2 : mode == Integer.MIN_VALUE ? iArr[1] : 0);
    }

    public void setOnItemClick(c cVar) {
        this.f114432a = cVar;
    }
}
