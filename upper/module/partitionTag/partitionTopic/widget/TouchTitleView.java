package com.bilibili.upper.module.partitionTag.partitionTopic.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bilibili.droid.ScreenUtil;
import com.bilibili.lib.ui.util.StatusBarCompat;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/widget/TouchTitleView.class */
public class TouchTitleView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f113883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f113884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f113885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f113886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f113887e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f113888f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f113889g;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/widget/TouchTitleView$a.class */
    public interface a {
        void a(int i7);

        void b(int i7);
    }

    public TouchTitleView(@NonNull Context context) {
        super(context);
        this.f113885c = 0;
        this.f113886d = 0;
        this.f113887e = 3;
        this.f113888f = -1.0f;
        this.f113889g = new int[2];
    }

    public TouchTitleView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f113885c = 0;
        this.f113886d = 0;
        this.f113887e = 3;
        this.f113888f = -1.0f;
        this.f113889g = new int[2];
    }

    public final void a(int i7) {
        a aVar = this.f113883a;
        if (aVar != null) {
            aVar.a(i7);
        }
    }

    public final void b(int i7, int i8, int i9) {
        this.f113884b = i8;
        this.f113885c = i8 - i9;
        this.f113886d = ScreenUtil.getScreenHeight(getContext()) - i7;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f113888f = motionEvent.getRawY();
            a(1);
            return true;
        }
        if (action != 1) {
            if (action != 2) {
                return true;
            }
            if (this.f113888f == -1.0f) {
                this.f113888f = motionEvent.getRawY();
            }
            int rawY = (int) (this.f113888f - motionEvent.getRawY());
            a aVar = this.f113883a;
            if (aVar != null) {
                aVar.b(rawY);
            }
            this.f113888f = motionEvent.getRawY();
            return true;
        }
        this.f113888f = motionEvent.getRawY();
        int statusBarHeight = StatusBarCompat.getStatusBarHeight(getContext());
        getLocationInWindow(this.f113889g);
        int i7 = this.f113889g[1] - statusBarHeight;
        if (i7 <= this.f113885c || i7 >= this.f113884b) {
            int i8 = this.f113887e;
            if (i8 == 2) {
                if (Math.abs(i7 - this.f113886d) <= 10) {
                    a(this.f113887e);
                    return true;
                }
                a(4);
                a(5);
                this.f113887e = 5;
            } else if (i8 != 3) {
                a(2);
                this.f113887e = 2;
            } else {
                if (Math.abs(i7 - this.f113884b) <= 10) {
                    a(this.f113887e);
                    return true;
                }
                if (i7 < this.f113884b) {
                    a(2);
                    this.f113887e = 2;
                } else {
                    a(4);
                    a(5);
                    this.f113887e = 5;
                }
            }
        } else if (this.f113887e == 3) {
            a(3);
            this.f113887e = 3;
        } else {
            a(2);
            this.f113887e = 2;
        }
        this.f113888f = -1.0f;
        return true;
    }

    public void setCallback(a aVar) {
        this.f113883a = aVar;
    }
}
