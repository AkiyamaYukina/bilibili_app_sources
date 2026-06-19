package com.bilibili.magicasakura.widgets;

import Wg0.C3040a;
import Wg0.b;
import Wg0.d;
import Wg0.i;
import android.R;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import com.bilibili.magicasakura.utils.TintManager;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/magicasakura/widgets/TintEditText.class */
public class TintEditText extends EditText implements Tintable, i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3040a f65525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f65526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f65527c;

    public TintEditText(Context context) {
        this(context, null);
    }

    public TintEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [Wg0.a, Wg0.b] */
    public TintEditText(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        if (isInEditMode()) {
            return;
        }
        TintManager tintManager = TintManager.get(getContext());
        ?? bVar = new b(this, tintManager);
        this.f65525a = bVar;
        bVar.b(attributeSet, i7);
        d dVar = new d(this, tintManager);
        this.f65526b = dVar;
        dVar.c(attributeSet, i7);
    }

    @Override // Wg0.i
    public int getViewThemeId() {
        return this.f65527c;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null) {
            return new InputConnectionWrapper(inputConnectionOnCreateInputConnection, false);
        }
        return null;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        super.setBackground(drawable);
        C3040a c3040a = this.f65525a;
        if (c3040a != null) {
            c3040a.g(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        C3040a c3040a = this.f65525a;
        if (c3040a != null) {
            c3040a.e(i7);
        } else {
            super.setBackgroundColor(i7);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        C3040a c3040a = this.f65525a;
        if (c3040a != null) {
            c3040a.h(i7);
        } else {
            super.setBackgroundResource(i7);
        }
    }

    public void setBackgroundTintList(int i7) {
        C3040a c3040a = this.f65525a;
        if (c3040a != null) {
            c3040a.i(i7, null);
        }
    }

    public void setBackgroundTintList(int i7, PorterDuff.Mode mode) {
        C3040a c3040a = this.f65525a;
        if (c3040a != null) {
            c3040a.i(i7, mode);
        }
    }

    public void setCompoundDrawableTintList(int i7, int i8, int i9, int i10) {
        d dVar = this.f65526b;
        if (dVar != null) {
            dVar.e(i7, i8, i9, i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i7, int i8, int i9, int i10) {
        d dVar = this.f65526b;
        if (dVar != null) {
            dVar.f(i7, i8, i9, i10);
        } else {
            super.setCompoundDrawablesWithIntrinsicBounds(i7, i8, i9, i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        d dVar = this.f65526b;
        if (dVar == null || dVar.a()) {
            return;
        }
        dVar.d(0, 0, 0, 0);
        dVar.f26844c = false;
    }

    @Override // Wg0.i
    public void setViewThemeId(int i7) {
        this.f65527c = i7;
        C3040a c3040a = this.f65525a;
        if (c3040a != null) {
            c3040a.f26845d = i7;
        }
        d dVar = this.f65526b;
        if (dVar != null) {
            dVar.f26845d = i7;
        }
    }

    @Override // com.bilibili.magicasakura.widgets.Tintable
    public void tint() {
        C3040a c3040a = this.f65525a;
        if (c3040a != null) {
            c3040a.k();
        }
        d dVar = this.f65526b;
        if (dVar != null) {
            dVar.h();
        }
    }
}
