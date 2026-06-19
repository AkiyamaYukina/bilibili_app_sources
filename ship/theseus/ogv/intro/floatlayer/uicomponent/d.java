package com.bilibili.ship.theseus.ogv.intro.floatlayer.uicomponent;

import androidx.viewpager2.widget.ViewPager2;
import com.bilibili.ship.theseus.ogv.intro.floatlayer.uicomponent.c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/uicomponent/d.class */
public final class d extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f93038a;

    public d(c cVar) {
        this.f93038a = cVar;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i7) {
        super.onPageSelected(i7);
        c cVar = this.f93038a;
        c.b bVar = cVar.f93018a;
        if (i7 != bVar.f93034j) {
            bVar.f93034j = i7;
            bVar.notifyPropertyChanged(141);
        }
        cVar.f93020c.invoke(Integer.valueOf(i7));
    }
}
