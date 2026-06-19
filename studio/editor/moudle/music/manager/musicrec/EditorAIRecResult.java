package com.bilibili.studio.editor.moudle.music.manager.musicrec;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/music/manager/musicrec/EditorAIRecResult.class */
@Keep
public class EditorAIRecResult {

    @Nullable
    public Map<String, String> frameAndTag;

    @NonNull
    public MaterialLabelError labelError;

    @NonNull
    public String materialLabel;

    public EditorAIRecResult(@NonNull String str, @NonNull MaterialLabelError materialLabelError, @Nullable HashMap<String, String> map) {
        this.materialLabel = str;
        this.labelError = materialLabelError;
        this.frameAndTag = map;
    }

    @NonNull
    public String toString() {
        return "EditorAIRecResult{materialLabel='" + this.materialLabel + "', labelError=" + this.labelError + '}';
    }
}
