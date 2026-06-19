package com.bilibili.studio.videoeditor.bgm;

import androidx.media3.common.C4618g;
import androidx.viewpager.widget.ViewPager;
import com.bilibili.lib.infoeyes.InfoEyesManager;
import com.bilibili.studio.videoeditor.util.C6635h;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/d.class */
public final class d implements ViewPager.OnPageChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f109050a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f109051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BgmTab f109052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f109053d;

    public d(e eVar, int i7, BgmTab bgmTab) {
        this.f109053d = eVar;
        this.f109051b = i7;
        this.f109052c = bgmTab;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrollStateChanged(int i7) {
        this.f109050a = i7 == 0;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrolled(int i7, float f7, int i8) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageSelected(int i7) {
        e eVar = this.f109053d;
        int i8 = eVar.f109055b;
        if (!this.f109050a && i8 == this.f109051b) {
            eVar.N();
            eVar.notifyItemChanged(i8);
            aD0.f.d().a("BgmListAdapter onPageSelected");
        }
        if (this.f109050a) {
            return;
        }
        InfoEyesManager.getInstance().report2(false, "000225", new String[]{"musiclist_class_slide", "click", C6635h.e(), C6635h.g(), this.f109052c.name, C4618g.a(i7 + 1, "")});
    }
}
