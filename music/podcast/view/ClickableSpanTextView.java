package com.bilibili.music.podcast.view;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.View;
import com.bilibili.magicasakura.widgets.TintTextView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/ClickableSpanTextView.class */
public class ClickableSpanTextView extends TintTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f67046a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/ClickableSpanTextView$a.class */
    public static abstract class a extends ClickableSpan {
        public abstract void b();

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint textPaint) {
        }
    }

    public ClickableSpanTextView(Context context) {
        super(context);
    }

    public ClickableSpanTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ed  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.music.podcast.view.ClickableSpanTextView.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
