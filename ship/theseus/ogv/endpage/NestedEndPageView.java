package com.bilibili.ship.theseus.ogv.endpage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/endpage/NestedEndPageView.class */
public class NestedEndPageView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f91924a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/endpage/NestedEndPageView$a.class */
    public interface a {
        boolean a(MotionEvent motionEvent);
    }

    public NestedEndPageView(@NonNull Context context) {
        super(context);
    }

    public NestedEndPageView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        a aVar = this.f91924a;
        boolean z6 = aVar != null && aVar.a(motionEvent);
        if (motionEvent.getActionMasked() == 2 && z6) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setTouchInterceptor(a aVar) {
        this.f91924a = aVar;
    }
}
