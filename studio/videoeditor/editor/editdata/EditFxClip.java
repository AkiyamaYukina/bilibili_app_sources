package com.bilibili.studio.videoeditor.editor.editdata;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.compose.runtime.C4277b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editor/editdata/EditFxClip.class */
@Keep
public class EditFxClip implements Cloneable {
    public long inPoint;
    public long outPoint;
    public int trackLevelIndex = -1;

    @Override // 
    /* JADX INFO: renamed from: clone */
    public EditFxClip mo9886clone() {
        try {
            return (EditFxClip) super.clone();
        } catch (CloneNotSupportedException e7) {
            throw new AssertionError();
        }
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("EditFxClip[inPoint=");
        sb.append(this.inPoint);
        sb.append(", outPoint=");
        sb.append(this.outPoint);
        sb.append(", trackLevelIndex=");
        return C4277b.a(this.trackLevelIndex, "]", sb);
    }
}
