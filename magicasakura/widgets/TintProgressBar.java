package com.bilibili.magicasakura.widgets;

import Sg0.C2862a;
import Wg0.b;
import Wg0.g;
import Wg0.i;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.annotation.ColorRes;
import com.bilibili.magicasakura.utils.TintManager;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/magicasakura/widgets/TintProgressBar.class */
public class TintProgressBar extends ProgressBar implements Tintable, i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f65537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f65538b;

    public TintProgressBar(Context context) {
        this(context, null);
    }

    public TintProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.progressBarStyle);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [Wg0.b, Wg0.g] */
    public TintProgressBar(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        if (isInEditMode()) {
            return;
        }
        ?? bVar = new b(this, TintManager.get(context));
        this.f65537a = bVar;
        try {
            TintProgressBar tintProgressBar = this;
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C2862a.f22931e, i7, 0);
            if (typedArrayObtainStyledAttributes.hasValue(1)) {
                bVar.f26858e = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                bVar.c(typedArrayObtainStyledAttributes.getColorStateList(1));
            }
            if (typedArrayObtainStyledAttributes.hasValue(0)) {
                bVar.f26859f = typedArrayObtainStyledAttributes.getResourceId(0, 0);
                bVar.b(typedArrayObtainStyledAttributes.getColorStateList(0));
            }
            typedArrayObtainStyledAttributes.recycle();
        } catch (Exception e7) {
            BLog.e("AppCompatProgressBarHelper", e7);
        }
    }

    @Override // Wg0.i
    public int getViewThemeId() {
        return this.f65538b;
    }

    public void setIndeterminateTint(@ColorRes int i7) {
        g gVar = this.f65537a;
        if (gVar != null) {
            gVar.f26859f = i7;
            gVar.b(gVar.f26843b.getColorStateList(i7, gVar.f26845d));
        }
    }

    public void setProgressTint(@ColorRes int i7) {
        g gVar = this.f65537a;
        if (gVar != null) {
            gVar.f26858e = i7;
            gVar.c(gVar.f26843b.getColorStateList(i7, gVar.f26845d));
        }
    }

    @Override // Wg0.i
    public void setViewThemeId(int i7) {
        this.f65538b = i7;
        g gVar = this.f65537a;
        if (gVar != null) {
            gVar.f26845d = i7;
        }
    }

    @Override // com.bilibili.magicasakura.widgets.Tintable
    public void tint() {
        g gVar = this.f65537a;
        if (gVar != null) {
            int i7 = gVar.f26858e;
            TintManager tintManager = gVar.f26843b;
            if (i7 != 0) {
                gVar.c(tintManager.getColorStateList(i7, gVar.f26845d));
            }
            int i8 = gVar.f26859f;
            if (i8 != 0) {
                gVar.b(tintManager.getColorStateList(i8, gVar.f26845d));
            }
        }
    }
}
