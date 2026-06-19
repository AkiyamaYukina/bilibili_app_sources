package com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4;

import androidx.viewpager.widget.ViewPager;
import bx0.C5168a;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/v4/j.class */
public final class C6533j implements ViewPager.OnPageChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliEditorCaptionAnimationV4Fragment f106624a;

    public C6533j(BiliEditorCaptionAnimationV4Fragment biliEditorCaptionAnimationV4Fragment) {
        this.f106624a = biliEditorCaptionAnimationV4Fragment;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrollStateChanged(int i7) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrolled(int i7, float f7, int i8) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageSelected(int i7) {
        C5168a c5168a;
        BiliEditorCaptionAnimationV4Fragment biliEditorCaptionAnimationV4Fragment = this.f106624a;
        BiliEditorCaptionAnimationListV4Fragment biliEditorCaptionAnimationListV4Fragment = (BiliEditorCaptionAnimationListV4Fragment) CollectionsKt.getOrNull(biliEditorCaptionAnimationV4Fragment.f106481p, i7);
        if (biliEditorCaptionAnimationListV4Fragment != null) {
            biliEditorCaptionAnimationListV4Fragment.wf();
        }
        ArrayList<C5168a> arrayList = biliEditorCaptionAnimationV4Fragment.f106480o;
        if (arrayList == null || (c5168a = (C5168a) CollectionsKt.getOrNull(arrayList, i7)) == null) {
            return;
        }
        biliEditorCaptionAnimationV4Fragment.wf();
        biliEditorCaptionAnimationV4Fragment.yf(c5168a.f57116b);
    }
}
