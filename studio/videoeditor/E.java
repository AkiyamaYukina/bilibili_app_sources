package com.bilibili.studio.videoeditor;

import android.content.Context;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.gamemaker.GameSchemeBean;
import com.bilibili.studio.videoeditor.help.compiler.sdk.i;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/E.class */
public class E extends D {
    public E(Context context) {
        super(context);
    }

    @Override // com.bilibili.studio.videoeditor.D
    public final boolean onEditVideoFinish(EditVideoInfo editVideoInfo, boolean z6) {
        Context editContext = getEditContext() != null ? getEditContext() : getContext();
        if (!z6) {
            eC0.d.a(editContext, editVideoInfo, isNewUI(), (GameSchemeBean) null);
            return true;
        }
        eC0.d.b(editContext, editVideoInfo, isNewUI(), (GameSchemeBean) null);
        com.bilibili.studio.videoeditor.help.compiler.sdk.i iVarA = i.a.a(getContext().getApplicationContext());
        iVarA.c(editVideoInfo.getMuxInfo(getContext()));
        iVarA.h();
        return true;
    }

    @Override // com.bilibili.studio.videoeditor.D
    public final boolean supportClipAddMore() {
        return true;
    }
}
