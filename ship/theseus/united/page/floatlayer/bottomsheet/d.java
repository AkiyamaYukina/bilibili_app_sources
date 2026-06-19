package com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet;

import android.view.View;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import com.bilibili.app.screen.adjust.widget.z;
import com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.BottomOrRightSheetBehavior;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/bottomsheet/d.class */
public final class d extends BottomOrRightSheetBehavior.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c<ViewBinding> f99726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FrameLayout f99727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f99728c;

    public d(c<ViewBinding> cVar, FrameLayout frameLayout, View view) {
        this.f99726a = cVar;
        this.f99727b = frameLayout;
        this.f99728c = view;
    }

    @Override // com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.BottomOrRightSheetBehavior.a
    public final void a(float f7) {
        this.f99728c.setAlpha(f7);
    }

    @Override // com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.BottomOrRightSheetBehavior.a
    public final void b(int i7) {
        this.f99726a.f99723g.setValue(Integer.valueOf(i7));
        if (i7 == 5) {
            z.a(this.f99727b);
        }
    }
}
