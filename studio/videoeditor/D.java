package com.bilibili.studio.videoeditor;

import android.content.Context;
import androidx.annotation.Nullable;
import com.bilibili.studio.videoeditor.bean.BClip;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/D.class */
public class D {
    private Context mContext;

    @Nullable
    private WeakReference<Context> mEditContext;
    private boolean mIsNewUI;
    private boolean mIsRecommendMusic;
    private boolean needOpenTemplatePanel = false;

    public D() {
    }

    public D(Context context) {
        this.mContext = context;
    }

    public Context getContext() {
        return this.mContext;
    }

    @Nullable
    public Context getEditContext() {
        WeakReference<Context> weakReference = this.mEditContext;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public boolean isNeedOpenTemplatePanel() {
        return this.needOpenTemplatePanel;
    }

    public boolean isNewUI() {
        return this.mIsNewUI;
    }

    public boolean isRecommendMusic() {
        return this.mIsRecommendMusic;
    }

    public void onConverted2BClipFinish(EditVideoInfo editVideoInfo, List<BClip> list) {
    }

    public boolean onEditVideoFinish(EditVideoInfo editVideoInfo, boolean z6) {
        return false;
    }

    public void setContext(Context context) {
        this.mContext = context;
    }

    public void setEditContext(Context context) {
        this.mEditContext = new WeakReference<>(context);
    }

    public D setIsNewUI(boolean z6) {
        this.mIsNewUI = z6;
        return this;
    }

    public void setNeedOpenTemplatePanel(boolean z6) {
        this.needOpenTemplatePanel = z6;
    }

    public void setRecommendMusic(boolean z6) {
        this.mIsRecommendMusic = z6;
    }

    public boolean supportClipAddMore() {
        return true;
    }
}
