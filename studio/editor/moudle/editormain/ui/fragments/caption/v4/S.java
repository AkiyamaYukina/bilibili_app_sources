package com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4;

import com.bilibili.studio.editor.moudle.caption.v1.CaptionListItem;
import dx0.InterfaceC6890a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/v4/S.class */
public final class S implements InterfaceC6890a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliEditorCaptionTemplateListV4Fragment f106606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CaptionListItem f106607b;

    public S(BiliEditorCaptionTemplateListV4Fragment biliEditorCaptionTemplateListV4Fragment, CaptionListItem captionListItem) {
        this.f106606a = biliEditorCaptionTemplateListV4Fragment;
        this.f106607b = captionListItem;
    }

    @Override // dx0.InterfaceC6890a
    public final void c(CaptionListItem captionListItem) {
        BiliEditorCaptionTemplateListV4Fragment biliEditorCaptionTemplateListV4Fragment = this.f106606a;
        if (biliEditorCaptionTemplateListV4Fragment.lf()) {
            CaptionListItem captionListItem2 = this.f106607b;
            captionListItem2.setDownloading(false);
            biliEditorCaptionTemplateListV4Fragment.sf();
            biliEditorCaptionTemplateListV4Fragment.rf().L0(biliEditorCaptionTemplateListV4Fragment, captionListItem2);
        }
    }

    @Override // dx0.InterfaceC6890a
    public final void onCancel() {
        if (this.f106606a.lf()) {
            c(this.f106607b);
        }
    }
}
