package com.bilibili.studio.videoeditor.nvsstreaming;

import androidx.annotation.Keep;
import com.bilibili.studio.videoeditor.editor.editdata.EditFxClip;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/nvsstreaming/AudioClipInfo.class */
@Keep
public class AudioClipInfo extends EditFxClip {

    @JvmField
    public boolean fadeIn;

    @JvmField
    public long trimIn;

    @JvmField
    public long trimOut;

    @JvmField
    public boolean fadeOut = true;

    @JvmField
    @Nullable
    public String localPath = "";
    private float leftVolume = 1.0f;
    private float rightVolume = 1.0f;

    public final float getLeftVolume() {
        return this.leftVolume;
    }

    public final float getRightVolume() {
        return this.rightVolume;
    }

    public final void setLeftVolume(float f7) {
        this.leftVolume = f7;
    }

    public final void setRightVolume(float f7) {
        this.rightVolume = f7;
    }
}
