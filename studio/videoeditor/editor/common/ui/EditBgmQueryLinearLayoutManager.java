package com.bilibili.studio.videoeditor.editor.common.ui;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editor/common/ui/EditBgmQueryLinearLayoutManager.class */
public class EditBgmQueryLinearLayoutManager extends LinearLayoutManager {
    public EditBgmQueryLinearLayoutManager(Context context) {
        super(context);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean supportsPredictiveItemAnimations() {
        return false;
    }
}
