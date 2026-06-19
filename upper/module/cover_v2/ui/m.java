package com.bilibili.upper.module.cover_v2.ui;

import androidx.viewpager.widget.ViewPager;
import com.bilibili.studio.comm.ab.ABManager;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import com.bilibili.upper.module.cover_v2.ui.MultiCoverMenuFragment;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/ui/m.class */
public final class m extends KH0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MultiCoverMenuFragment f112967a;

    public m(MultiCoverMenuFragment multiCoverMenuFragment) {
        this.f112967a = multiCoverMenuFragment;
    }

    @Override // KH0.b
    public final void e(CaptionInfo captionInfo, boolean z6) {
        Object obj;
        MultiCoverMenuFragment.a aVar;
        MultiCoverMenuFragment.a aVar2;
        ViewPager viewPager;
        ViewPager viewPager2;
        if (captionInfo != null) {
            Map<String, String> map = ABManager.f105341a;
            String strA = ABManager.a(com.bilibili.studio.comm.ab.d.f105360l);
            switch (strA.hashCode()) {
                case -1504120493:
                    if (!strA.equals("cover_noguide")) {
                    }
                    MultiCoverMenuFragment multiCoverMenuFragment = this.f112967a;
                    aVar = multiCoverMenuFragment.f112905f;
                    if ((aVar != null || (viewPager2 = aVar.f112908c) == null || viewPager2.getCurrentItem() != 1) && (aVar2 = multiCoverMenuFragment.f112905f) != null && (viewPager = aVar2.f112908c) != null) {
                        viewPager.setCurrentItem(1, true);
                    }
                    break;
                case -595358701:
                    obj = "nocover_guide";
                    strA.equals(obj);
                    break;
                case 3387192:
                    obj = "none";
                    strA.equals(obj);
                    break;
                case 170921076:
                    if (!strA.equals("cover_guide")) {
                    }
                    MultiCoverMenuFragment multiCoverMenuFragment2 = this.f112967a;
                    aVar = multiCoverMenuFragment2.f112905f;
                    if (aVar != null) {
                    }
                    viewPager.setCurrentItem(1, true);
                    break;
            }
        }
    }
}
