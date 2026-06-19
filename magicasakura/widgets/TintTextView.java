package com.bilibili.magicasakura.widgets;

import Wg0.C3040a;
import Wg0.d;
import Wg0.h;
import Wg0.i;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import androidx.annotation.ColorRes;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/magicasakura/widgets/TintTextView.class */
public class TintTextView extends AppCompatTextView implements Tintable, i {
    private C3040a mBackgroundHelper;
    private d mCompoundDrawableHelper;
    private P90.a mFontHelper;
    private boolean mIsTintable;
    private h mTextHelper;
    private int mViewThemeId;

    public TintTextView(Context context) {
        this(context, null);
    }

    public TintTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0547  */
    /* JADX WARN: Type inference failed for: r0v122, types: [Wg0.b, Wg0.h] */
    /* JADX WARN: Type inference failed for: r0v125, types: [Wg0.a, Wg0.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TintTextView(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            Method dump skipped, instruction units count: 1477
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.magicasakura.widgets.TintTextView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (getBackground() != null) {
            invalidateDrawable(getBackground());
        }
    }

    @Override // Wg0.i
    public int getViewThemeId() {
        return this.mViewThemeId;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0b24  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x0b62  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x0b78  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x0b94  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x0bc8  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0bcf  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onAttachedToWindow() throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 3089
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.magicasakura.widgets.TintTextView.onAttachedToWindow():void");
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null) {
            return new InputConnectionWrapper(inputConnectionOnCreateInputConnection, false);
        }
        return null;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        super.setBackgroundColor(i7);
        C3040a c3040a = this.mBackgroundHelper;
        if (c3040a != null) {
            c3040a.e(i7);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3040a c3040a = this.mBackgroundHelper;
        if (c3040a != null) {
            c3040a.g(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public void setBackgroundResource(int i7) {
        C3040a c3040a = this.mBackgroundHelper;
        if (c3040a != null) {
            c3040a.h(i7);
        } else {
            super.setBackgroundResource(i7);
        }
    }

    public void setBackgroundTintList(int i7) {
        C3040a c3040a = this.mBackgroundHelper;
        if (c3040a != null) {
            c3040a.i(i7, null);
        }
    }

    public void setBackgroundTintList(int i7, PorterDuff.Mode mode) {
        C3040a c3040a = this.mBackgroundHelper;
        if (c3040a != null) {
            c3040a.i(i7, mode);
        }
    }

    public void setCompoundDrawableTintList(int i7, int i8, int i9, int i10) {
        d dVar = this.mCompoundDrawableHelper;
        if (dVar != null) {
            dVar.e(i7, i8, i9, i10);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i7, int i8, int i9, int i10) {
        d dVar = this.mCompoundDrawableHelper;
        if (dVar != null) {
            dVar.f(i7, i8, i9, i10);
        } else {
            super.setCompoundDrawablesWithIntrinsicBounds(i7, i8, i9, i10);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        d dVar = this.mCompoundDrawableHelper;
        if (dVar == null || dVar.a()) {
            return;
        }
        dVar.d(0, 0, 0, 0);
        dVar.f26844c = false;
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i7) {
        super.setTextAppearance(i7);
        h hVar = this.mTextHelper;
        if (hVar != null) {
            hVar.e(i7, true);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        h hVar = this.mTextHelper;
        if (hVar != null) {
            hVar.e(i7, true);
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(int i7) {
        super.setTextColor(i7);
        h hVar = this.mTextHelper;
        if (hVar != null) {
            hVar.f();
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        h hVar = this.mTextHelper;
        if (hVar != null) {
            hVar.f();
        }
    }

    public void setTextColorById(@ColorRes int i7) {
        h hVar = this.mTextHelper;
        if (hVar != null) {
            hVar.g(i7);
        }
    }

    public void setTintable(boolean z6) {
        this.mIsTintable = z6;
    }

    @Override // Wg0.i
    public void setViewThemeId(int i7) {
        this.mViewThemeId = i7;
        h hVar = this.mTextHelper;
        if (hVar != null) {
            hVar.f26845d = i7;
        }
        C3040a c3040a = this.mBackgroundHelper;
        if (c3040a != null) {
            c3040a.f26845d = i7;
        }
        d dVar = this.mCompoundDrawableHelper;
        if (dVar != null) {
            dVar.f26845d = i7;
        }
    }

    @Override // com.bilibili.magicasakura.widgets.Tintable
    public void tint() {
        if (this.mIsTintable) {
            h hVar = this.mTextHelper;
            if (hVar != null) {
                hVar.h();
            }
            C3040a c3040a = this.mBackgroundHelper;
            if (c3040a != null) {
                c3040a.k();
            }
            d dVar = this.mCompoundDrawableHelper;
            if (dVar != null) {
                dVar.h();
            }
        }
    }
}
