package com.bilibili.studio.editor.moudle.intelligence.frame.strategy.run;

import androidx.annotation.NonNull;
import bolts.Continuation;
import bolts.Task;
import com.bilibili.app.comm.supermenu.share.pic.ui.c;
import com.bilibili.studio.editor.moudle.intelligence.frame.data.FileTimePart;
import com.bilibili.studio.editor.moudle.intelligence.frame.data.FrameConfigData;
import com.bilibili.studio.editor.moudle.intelligence.frame.strategy.run.BaseFrameRunStrategy;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/frame/strategy/run/b.class */
public final class b extends BaseFrameRunStrategy {
    @Override // com.bilibili.studio.editor.moudle.intelligence.frame.strategy.run.BaseFrameRunStrategy
    public final void cancel() {
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.frame.strategy.run.BaseFrameRunStrategy
    public final void frameRun(List<FileTimePart> list, @NonNull FrameConfigData frameConfigData, BaseFrameRunStrategy.a aVar) {
        for (FileTimePart fileTimePart : list) {
            Task.callInBackground(new com.bilibili.app.comm.supermenu.share.pic.ui.b(1, frameConfigData, fileTimePart)).continueWithTask((Continuation) new c(aVar, frameConfigData, fileTimePart), Task.UI_THREAD_EXECUTOR);
        }
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.frame.strategy.run.BaseFrameRunStrategy
    public final void pause() {
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.frame.strategy.run.BaseFrameRunStrategy
    public final void resume() {
    }
}
