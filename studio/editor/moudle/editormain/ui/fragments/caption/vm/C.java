package com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.vm;

import com.bilibili.droid.ToastHelper;
import com.bilibili.studio.editor.moudle.caption.setting.ui.BiliEditorCaptionBaseFragment;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionListItem;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionTemplateV4Fragment;
import java.util.ArrayList;
import px0.e$b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/vm/C.class */
public final class C implements e$b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CaptionListItem f106656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BiliEditorCaptionBaseFragment f106657b;

    public C(BiliEditorCaptionBaseFragment biliEditorCaptionBaseFragment, CaptionListItem captionListItem) {
        this.f106656a = captionListItem;
        this.f106657b = biliEditorCaptionBaseFragment;
    }

    @Override // px0.e$b
    public final void a(int i7, String str) {
        BiliEditorCaptionBaseFragment biliEditorCaptionBaseFragment = this.f106657b;
        ToastHelper.showToast(biliEditorCaptionBaseFragment.getApplicationContext(), 2131842439, 0);
        biliEditorCaptionBaseFragment.pf();
    }

    @Override // px0.e$b
    public final void b(String str) {
        ArrayList<CaptionListItem> arrayList = BiliEditorCaptionTemplateV4Fragment.f106543n;
        BiliEditorCaptionTemplateV4Fragment.f106544o = BiliEditorCaptionTemplateV4Fragment.f106543n.indexOf(this.f106656a);
    }
}
