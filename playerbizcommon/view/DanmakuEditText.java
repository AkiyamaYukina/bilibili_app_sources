package com.bilibili.playerbizcommon.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import com.bilibili.magicasakura.widgets.TintEditText;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.utils.DpUtils;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/view/DanmakuEditText.class */
public final class DanmakuEditText extends TintEditText {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public c f80332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public b f80333e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public VectorDrawableCompat f80334f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f80335g;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f80336i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f80337j;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/view/DanmakuEditText$a.class */
    public interface a {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/view/DanmakuEditText$b.class */
    public interface b {
        void a(boolean z6);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/view/DanmakuEditText$c.class */
    public interface c {
        void a();
    }

    public DanmakuEditText(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f80337j = (int) DpUtils.dp2px(context, 12.0f);
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
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.view.DanmakuEditText.a(boolean):void");
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
        if (this.f80334f != null) {
            a(false);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        boolean zOnTouchEvent = true;
        if (this.f80334f != null) {
            float x6 = motionEvent.getX();
            if (x6 > (getWidth() - getTotalPaddingRight()) + this.f80337j && x6 < (getWidth() - getPaddingRight()) + this.f80337j) {
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                setText("");
                c cVar = this.f80332d;
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
        }
        return zOnTouchEvent;
    }

    public final void setOnKeyPreImeListener(@NotNull a aVar) {
    }

    public final void setOnTextChangeListener(@NotNull b bVar) {
        this.f80333e = bVar;
    }

    public final void setOnTextClearListener(@NotNull c cVar) {
        this.f80332d = cVar;
    }
}
