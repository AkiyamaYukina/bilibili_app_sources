package com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/strategy/bean/IgvStrategies.class */
@Keep
public final class IgvStrategies {

    @Nullable
    private List<IgvStrategy> data;

    @Nullable
    public final List<IgvStrategy> getData() {
        return this.data;
    }

    public final void setData(@Nullable List<IgvStrategy> list) {
        this.data = list;
    }
}
