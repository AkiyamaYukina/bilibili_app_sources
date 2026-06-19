package com.bilibili.studio.videoeditor.editor.draftupdate.editvideoinfo;

import com.bilibili.studio.editor.moudle.caption.v1.CaptionAssetBean;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editor/draftupdate/editvideoinfo/a.class */
public final class a extends gC0.b<EditVideoInfo> {
    @Override // gC0.b
    public final void b(Object obj, gC0.a aVar) {
        EditVideoInfo editVideoInfo = (EditVideoInfo) obj;
        editVideoInfo.setProjectVersion(7730000L);
        for (CaptionInfo captionInfo : editVideoInfo.getCaptionInfoList()) {
            String str = captionInfo.templatePath;
            if (str != null && str.length() != 0) {
                CaptionAssetBean captionAssetBean = new CaptionAssetBean();
                captionInfo.captionAssetBean = captionAssetBean;
                OC0.h.N(captionAssetBean, captionInfo.templatePath);
                OC0.h.N(captionInfo.captionAssetBean, captionInfo.templateLicPath);
            }
        }
        aVar.invoke(Boolean.TRUE);
    }

    @Override // gC0.b
    public final boolean c(EditVideoInfo editVideoInfo, String str) {
        return editVideoInfo.getProjectVersion() < 7730000;
    }
}
