package com.bilibili.studio.editor.moudle.intelligence.frame.strategy.run;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.bilibili.studio.editor.moudle.intelligence.frame.data.FileTimePart;
import com.bilibili.studio.editor.moudle.intelligence.frame.data.FrameConfigData;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/frame/strategy/run/BaseFrameRunStrategy.class */
@Keep
public abstract class BaseFrameRunStrategy {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/frame/strategy/run/BaseFrameRunStrategy$a.class */
    public interface a {
    }

    public abstract void cancel();

    public abstract void frameRun(List<FileTimePart> list, @NonNull FrameConfigData frameConfigData, a aVar);

    public abstract void pause();

    public abstract void resume();
}
