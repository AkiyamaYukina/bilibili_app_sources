package com.bilibili.studio.editor.moudle.editormain.ui.fragments.clip;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/clip/e.class */
public final /* synthetic */ class e implements View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return true;
        }
        view.performClick();
        return true;
    }
}
