package com.bilibili.studio.editor.moudle.editormain.ui;

import Py0.k;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/f.class */
public final class f implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliEditorMainActivity f106296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f106297b;

    public f(BiliEditorMainActivity biliEditorMainActivity, ConstraintLayout constraintLayout) {
        this.f106296a = biliEditorMainActivity;
        this.f106297b = constraintLayout;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        dz0.c cVar;
        int i15;
        if ((i7 == i11 && i9 == i13 && i8 == i12 && i10 == i14) || (cVar = ((Yv0.b) this.f106296a).B) == null) {
            return;
        }
        int width = this.f106297b.getWidth();
        int height = this.f106297b.getHeight();
        k kVar = cVar.e.v;
        int i16 = kVar.f19445m;
        if (i16 == 0 || (i15 = kVar.f19446n) == 0) {
            kVar.f19445m = width;
            kVar.f19446n = height;
        } else {
            if (i16 == width && i15 == height) {
                return;
            }
            kVar.f19445m = width;
            kVar.f19446n = height;
            Qy0.d dVar = kVar.h;
            if (dVar.f20260f) {
                kVar.n();
                dVar.s();
            }
        }
    }
}
