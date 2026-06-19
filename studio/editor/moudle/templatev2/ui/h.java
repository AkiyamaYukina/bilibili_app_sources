package com.bilibili.studio.editor.moudle.templatev2.ui;

import com.bilibili.studio.editor.moudle.intelligence.ui.BiliIntelligenceDialogFragment;
import com.bilibili.studio.editor.moudle.templatev2.bean.EditorTemplateTabItemBean;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoIntelligenceInfo;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/templatev2/ui/h.class */
public final class h implements BiliIntelligenceDialogFragment.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliEditorTemplateMusicFragment f108110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f108111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EditorTemplateTabItemBean f108112c;

    public h(BiliEditorTemplateMusicFragment biliEditorTemplateMusicFragment, long j7, EditorTemplateTabItemBean editorTemplateTabItemBean) {
        this.f108110a = biliEditorTemplateMusicFragment;
        this.f108111b = j7;
        this.f108112c = editorTemplateTabItemBean;
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.ui.BiliIntelligenceDialogFragment.a
    public final void a(EditVideoInfo editVideoInfo, boolean z6) {
        ey0.a aVar;
        Y0.c.c("onIntelligenceFinish isSuccess=", "BiliEditorTemplateMusicFragment", z6);
        BiliEditorTemplateMusicFragment biliEditorTemplateMusicFragment = this.f108110a;
        if (!z6 || editVideoInfo == null) {
            biliEditorTemplateMusicFragment.jf(this.f108112c, false, "onIntelligenceFailed");
            return;
        }
        EditVideoIntelligenceInfo intelligenceInfo = editVideoInfo.getIntelligenceInfo();
        List<String> list = intelligenceInfo != null ? intelligenceInfo.recMusicIds : null;
        if (list != null && !list.isEmpty() && (aVar = biliEditorTemplateMusicFragment.of().f108195c) != null) {
            aVar.j(editVideoInfo);
        }
        this.f108110a.kf(this.f108111b, editVideoInfo, this.f108112c, true);
    }
}
