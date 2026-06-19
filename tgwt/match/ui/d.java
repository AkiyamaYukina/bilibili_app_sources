package com.bilibili.tgwt.match.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/match/ui/d.class */
public final /* synthetic */ class d implements View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                ViewParent parent = view.getParent();
                if (parent == null) {
                    return false;
                }
                parent.requestDisallowInterceptTouchEvent(false);
                return false;
            }
            if (action != 2) {
                return false;
            }
        }
        ViewParent parent2 = view.getParent();
        if (parent2 == null) {
            return false;
        }
        parent2.requestDisallowInterceptTouchEvent(true);
        return false;
    }
}
