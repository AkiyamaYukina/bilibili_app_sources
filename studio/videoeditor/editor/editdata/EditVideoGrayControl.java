package com.bilibili.studio.videoeditor.editor.editdata;

import androidx.annotation.Keep;
import com.bilibili.studio.videoeditor.capturev3.data.ModuleShow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editor/editdata/EditVideoGrayControl.class */
@Keep
public class EditVideoGrayControl {
    private boolean mSupportSticker = false;
    private boolean mSupportTheme = false;

    public boolean isSupportSticker() {
        return this.mSupportSticker;
    }

    public boolean isSupportTheme() {
        return this.mSupportTheme;
    }

    public void update(ModuleShow moduleShow) {
        if (moduleShow == null) {
            return;
        }
        this.mSupportSticker = moduleShow.videoup_sticker;
        this.mSupportTheme = moduleShow.theme;
    }
}
