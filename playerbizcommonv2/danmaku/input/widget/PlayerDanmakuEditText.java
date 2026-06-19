package com.bilibili.playerbizcommonv2.danmaku.input.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import com.bilibili.magicasakura.widgets.TintEditText;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.utils.DpUtils;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/widget/PlayerDanmakuEditText.class */
@StabilityInferred(parameters = 0)
public final class PlayerDanmakuEditText extends TintEditText {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public c f81169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public b f81170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public VectorDrawableCompat f81171f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f81172g;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f81173i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f81174j;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/widget/PlayerDanmakuEditText$a.class */
    public interface a {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/widget/PlayerDanmakuEditText$b.class */
    public interface b {
        void a(boolean z6);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/widget/PlayerDanmakuEditText$c.class */
    public interface c {
        void a();
    }

    public PlayerDanmakuEditText(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f81174j = (int) DpUtils.dp2px(context, 12.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(boolean r8) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.danmaku.input.widget.PlayerDanmakuEditText.a(boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(boolean r5) {
        /*
            r4 = this;
            r0 = 0
            r7 = r0
            r0 = r5
            if (r0 != 0) goto L32
            r0 = r4
            boolean r0 = r0.f81173i
            r5 = r0
            r0 = r4
            android.text.Editable r0 = r0.getText()
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L28
            r0 = r8
            int r0 = r0.length()
            if (r0 != 0) goto L23
            goto L28
        L23:
            r0 = 0
            r6 = r0
            goto L2a
        L28:
            r0 = 1
            r6 = r0
        L2a:
            r0 = r5
            r1 = r6
            r2 = 1
            r1 = r1 ^ r2
            if (r0 != r1) goto L32
            return
        L32:
            r0 = r4
            android.text.Editable r0 = r0.getText()
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L49
            r0 = r7
            r5 = r0
            r0 = r8
            int r0 = r0.length()
            if (r0 != 0) goto L4b
        L49:
            r0 = 1
            r5 = r0
        L4b:
            r0 = r4
            r1 = r5
            r2 = 1
            r1 = r1 ^ r2
            r0.f81173i = r1
            r0 = r4
            com.bilibili.playerbizcommonv2.danmaku.input.widget.PlayerDanmakuEditText$b r0 = r0.f81170e
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L65
            r0 = r8
            r1 = r5
            r0.a(r1)
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.danmaku.input.widget.PlayerDanmakuEditText.b(boolean):void");
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i7, @NotNull KeyEvent keyEvent) {
        if (i7 == 4) {
            keyEvent.getAction();
            keyEvent.getAction();
        }
        return super.onKeyPreIme(i7, keyEvent);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(@NotNull CharSequence charSequence, int i7, int i8, int i9) {
        super.onTextChanged(charSequence, i7, i8, i9);
        if (this.f81171f != null) {
            a(false);
        } else {
            b(false);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        boolean zOnTouchEvent;
        if (this.f81171f != null) {
            float x6 = motionEvent.getX();
            if (x6 > (getWidth() - getTotalPaddingRight()) + this.f81174j && x6 < (getWidth() - getPaddingRight()) + this.f81174j) {
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                setText("");
                c cVar = this.f81169d;
                if (cVar == null) {
                    return true;
                }
                cVar.a();
                return true;
            }
        }
        try {
            zOnTouchEvent = super.onTouchEvent(motionEvent);
        } catch (Exception e7) {
            zOnTouchEvent = true;
        }
        return zOnTouchEvent;
    }

    public final void setOnKeyPreImeListener(@NotNull a aVar) {
    }

    public final void setOnTextChangeListener(@NotNull b bVar) {
        this.f81170e = bVar;
    }

    public final void setOnTextClearListener(@NotNull c cVar) {
        this.f81169d = cVar;
    }
}
