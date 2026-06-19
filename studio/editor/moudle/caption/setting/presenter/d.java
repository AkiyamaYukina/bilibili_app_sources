package com.bilibili.studio.editor.moudle.caption.setting.presenter;

import com.bilibili.droid.ToastHelper;
import com.bilibili.studio.editor.moudle.caption.setting.ui.BiliEditorCaptionBaseFragment;
import com.bilibili.studio.editor.moudle.caption.setting.ui.BiliEditorCaptionTemplateFragment;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionListItem;
import java.util.ArrayList;
import px0.e$b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/setting/presenter/d.class */
public final class d implements e$b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CaptionListItem f105791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BiliEditorCaptionBaseFragment f105792b;

    public d(BiliEditorCaptionBaseFragment biliEditorCaptionBaseFragment, CaptionListItem captionListItem) {
        this.f105791a = captionListItem;
        this.f105792b = biliEditorCaptionBaseFragment;
    }

    @Override // px0.e$b
    public final void a(int i7, String str) {
        BiliEditorCaptionBaseFragment biliEditorCaptionBaseFragment = this.f105792b;
        ToastHelper.showToast(biliEditorCaptionBaseFragment.getApplicationContext(), 2131842439, 0);
        biliEditorCaptionBaseFragment.pf();
    }

    @Override // px0.e$b
    public final void b(String str) {
        ArrayList<CaptionListItem> arrayList = BiliEditorCaptionTemplateFragment.f105811j;
        BiliEditorCaptionTemplateFragment.f105812k = BiliEditorCaptionTemplateFragment.f105811j.indexOf(this.f105791a);
    }
}
