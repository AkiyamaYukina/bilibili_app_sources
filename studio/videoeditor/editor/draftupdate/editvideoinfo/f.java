package com.bilibili.studio.videoeditor.editor.draftupdate.editvideoinfo;

import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.editor.editdata.MultiPArchive;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editor/draftupdate/editvideoinfo/f.class */
public final class f extends gC0.b<EditVideoInfo> {
    @Override // gC0.b
    public final void b(Object obj, gC0.a aVar) {
        EditVideoInfo editVideoInfo = (EditVideoInfo) obj;
        editVideoInfo.setProjectVersion(8760000L);
        List<MultiPArchive> multiP = editVideoInfo.getMultiP();
        if (multiP != null) {
            Iterator<T> it = multiP.iterator();
            while (it.hasNext()) {
                ((MultiPArchive) it.next()).infoJson = null;
            }
        }
        aVar.invoke(Boolean.TRUE);
    }

    @Override // gC0.b
    public final boolean c(EditVideoInfo editVideoInfo, String str) {
        return editVideoInfo.getProjectVersion() < 8760000;
    }
}
