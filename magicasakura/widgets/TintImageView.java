package com.bilibili.magicasakura.widgets;

import Sg0.C2862a;
import Ug0.C2905c;
import Ug0.h;
import Wg0.C3040a;
import Wg0.b;
import Wg0.f;
import Wg0.i;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import com.bilibili.magicasakura.utils.TintManager;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/magicasakura/widgets/TintImageView.class */
public class TintImageView extends AppCompatImageView implements Tintable, i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C3040a f65528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f f65529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f65530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f65531d;

    public TintImageView(Context context) {
        this(context, null);
    }

    public TintImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [Wg0.a, Wg0.b] */
    /* JADX WARN: Type inference failed for: r0v9, types: [Wg0.b, Wg0.f] */
    /* JADX WARN: Type inference failed for: r1v22, types: [Ug0.h, java.lang.Object] */
    public TintImageView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f65530c = true;
        if (isInEditMode()) {
            return;
        }
        TintManager tintManager = TintManager.get(context);
        ?? bVar = new b(this, tintManager);
        this.f65528a = bVar;
        bVar.b(attributeSet, i7);
        ?? bVar2 = new b(this, tintManager);
        this.f65529b = bVar2;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C2862a.f22930d, i7, 0);
        if (getDrawable() == null) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0);
            bVar2.f26856f = resourceId;
            Drawable drawable = tintManager.getDrawable(resourceId, bVar2.f26845d);
            if (drawable != null) {
                bVar2.c(drawable);
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            bVar2.f26857g = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            if (typedArrayObtainStyledAttributes.hasValue(2)) {
                PorterDuff.Mode modeK = C2905c.k(typedArrayObtainStyledAttributes.getInt(2, 0), null);
                if (bVar2.f26857g != 0 && modeK != null) {
                    if (bVar2.f26855e == null) {
                        bVar2.f26855e = new Object();
                    }
                    h hVar = bVar2.f26855e;
                    hVar.f24725c = true;
                    hVar.f24724b = modeK;
                }
            }
            bVar2.d(bVar2.f26857g);
        } else if (bVar2.f26856f == 0) {
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            bVar2.f26856f = resourceId2;
            Drawable drawable2 = tintManager.getDrawable(resourceId2, bVar2.f26845d);
            if (drawable2 != null) {
                bVar2.c(drawable2);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (getBackground() != null) {
            invalidateDrawable(getBackground());
        }
    }

    @Override // Wg0.i
    public int getViewThemeId() {
        return this.f65531d;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        super.setBackgroundColor(i7);
        C3040a c3040a = this.f65528a;
        if (c3040a != null) {
            c3040a.e(i7);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3040a c3040a = this.f65528a;
        if (c3040a != null) {
            c3040a.g(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.view.View
    public void setBackgroundResource(int i7) {
        C3040a c3040a = this.f65528a;
        if (c3040a != null) {
            c3040a.h(i7);
        } else {
            super.setBackgroundResource(i7);
        }
    }

    public void setBackgroundTintList(int i7) {
        C3040a c3040a = this.f65528a;
        if (c3040a != null) {
            c3040a.i(i7, null);
        }
    }

    public void setBackgroundTintList(int i7, PorterDuff.Mode mode) {
        C3040a c3040a = this.f65528a;
        if (c3040a != null) {
            c3040a.i(i7, mode);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        f fVar = this.f65529b;
        if (fVar == null || fVar.a()) {
            return;
        }
        fVar.b(0);
        fVar.f26844c = false;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i7) {
        f fVar = this.f65529b;
        if (fVar == null) {
            super.setImageResource(i7);
            return;
        }
        if (fVar.f26856f != i7) {
            fVar.b(i7);
            if (i7 != 0) {
                Drawable drawable = fVar.f26843b.getDrawable(i7, fVar.f26845d);
                if (drawable == null) {
                    drawable = ContextCompat.getDrawable(((ImageView) fVar.f26842a).getContext(), i7);
                }
                fVar.c(drawable);
            }
        }
    }

    public void setImageTintList(int i7) {
        f fVar = this.f65529b;
        if (fVar == null || fVar.f26857g == i7) {
            return;
        }
        fVar.f26857g = i7;
        h hVar = fVar.f26855e;
        if (hVar != null) {
            hVar.f24726d = false;
            hVar.f24723a = null;
        }
        fVar.d(i7);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [Ug0.h, java.lang.Object] */
    public void setImageTintList(int i7, PorterDuff.Mode mode) {
        f fVar = this.f65529b;
        if (fVar == null || fVar.f26857g == i7) {
            return;
        }
        fVar.f26857g = i7;
        h hVar = fVar.f26855e;
        if (hVar != null) {
            hVar.f24726d = false;
            hVar.f24723a = null;
        }
        if (i7 != 0 && mode != null) {
            if (hVar == null) {
                fVar.f26855e = new Object();
            }
            h hVar2 = fVar.f26855e;
            hVar2.f24725c = true;
            hVar2.f24724b = mode;
        }
        fVar.d(i7);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(@Nullable Uri uri) {
        super.setImageURI(uri);
        f fVar = this.f65529b;
        if (fVar != null) {
            if (fVar.f26856f == 0) {
                Uri uri2 = fVar.h;
                if (uri2 == uri) {
                    return;
                }
                if (uri != null && uri2 != null && uri.equals(uri2)) {
                    return;
                }
            }
            fVar.h = uri;
            fVar.b(0);
        }
    }

    public void setTintable(boolean z6) {
        this.f65530c = z6;
    }

    @Override // Wg0.i
    public void setViewThemeId(int i7) {
        this.f65531d = i7;
        C3040a c3040a = this.f65528a;
        if (c3040a != null) {
            c3040a.f26845d = i7;
        }
        f fVar = this.f65529b;
        if (fVar != null) {
            fVar.f26845d = i7;
        }
    }

    @Override // com.bilibili.magicasakura.widgets.Tintable
    public void tint() {
        if (this.f65530c) {
            C3040a c3040a = this.f65528a;
            if (c3040a != null) {
                c3040a.k();
            }
            f fVar = this.f65529b;
            if (fVar != null) {
                int i7 = fVar.f26857g;
                if (i7 == 0 || !fVar.d(i7)) {
                    Drawable drawable = fVar.f26843b.getDrawable(fVar.f26856f, fVar.f26845d);
                    Drawable drawable2 = drawable;
                    if (drawable == null) {
                        drawable2 = fVar.f26856f == 0 ? null : ContextCompat.getDrawable(((ImageView) fVar.f26842a).getContext(), fVar.f26856f);
                    }
                    if (drawable2 != null) {
                        fVar.c(drawable2);
                    }
                }
            }
        }
    }
}
