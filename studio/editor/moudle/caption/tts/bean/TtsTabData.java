package com.bilibili.studio.editor.moudle.caption.tts.bean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/tts/bean/TtsTabData.class */
@Keep
public final class TtsTabData {

    @Nullable
    private Integer count;
    private int id;

    @Nullable
    private String name;

    public TtsTabData(int i7, @NotNull String str, int i8) {
        this.id = i7;
        this.name = str;
        this.count = Integer.valueOf(i8);
    }

    @Nullable
    public final Integer getCount() {
        return this.count;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final void setCount(@Nullable Integer num) {
        this.count = num;
    }

    public final void setId(int i7) {
        this.id = i7;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }
}
