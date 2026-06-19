package com.bilibili.studio.editor.moudle.editormain.ui.fragments.sticker;

import Nz0.r;
import androidx.viewpager.widget.ViewPager;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.bilibili.studio.kaleidoscope.adapter.KaleidoscopeFactory;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/sticker/j.class */
public final class j implements ViewPager.OnPageChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliEditorStickerListFragment f106977a;

    public j(BiliEditorStickerListFragment biliEditorStickerListFragment) {
        this.f106977a = biliEditorStickerListFragment;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrollStateChanged(int i7) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrolled(int i7, float f7, int i8) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageSelected(int i7) {
        r rVar = this.f106977a.f106953i;
        r rVar2 = rVar;
        if (rVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStickerPagerAdapter");
            rVar2 = null;
        }
        String strValueOf = String.valueOf(rVar2.getPageTitle(i7));
        Xz0.d.f28458a.getClass();
        HashMap map = new HashMap();
        map.put("sticker_class", strValueOf);
        Neurons.reportExposure$default(false, "creation.video-editor.sticker-panel.list-tab.show", map, (List) null, 8, (Object) null);
        Xz0.j.c("sdk_type", KaleidoscopeFactory.SDK_MON);
        Xz0.j.c("router_topic_id", Xz0.g.f28463b);
        Map mapB = Xz0.j.b(Xz0.k.f28475b);
        HashMap map2 = (HashMap) mapB;
        map2.put("sticker_class", strValueOf);
        map2.put(EditCustomizeSticker.TAG_ID, "0");
        Neurons.reportClick(false, "creation.video-editor.sticker-panel.sticker.click", mapB);
    }
}
