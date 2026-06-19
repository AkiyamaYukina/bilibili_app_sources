package com.bilibili.studio.editor.moudle.intelligence.frame.strategy.run;

import AT0.c;
import Xz0.g;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import bolts.Continuation;
import bolts.Task;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.sharewrapper.basic.ThirdPartyExtraBuilder;
import com.bilibili.studio.comm.manager.d;
import com.bilibili.studio.editor.moudle.intelligence.frame.data.FileTimePart;
import com.bilibili.studio.editor.moudle.intelligence.frame.data.FrameConfigData;
import com.bilibili.studio.editor.moudle.intelligence.frame.strategy.run.BaseFrameRunStrategy;
import com.bilibili.studio.editor.moudle.intelligence.frame.task.RunTaskType;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import pf.h;
import rz0.i;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/frame/strategy/run/FrameConcurrentRunStrategy.class */
@Keep
public class FrameConcurrentRunStrategy extends BaseFrameRunStrategy {
    private static final String TAG = "FrameConcurrentRunStrategy";
    private final int maxSize;
    private final CopyOnWriteArrayList<i> runningTask = new CopyOnWriteArrayList<>();
    private final CopyOnWriteArrayList<i> waitingTask = new CopyOnWriteArrayList<>();
    private final CopyOnWriteArrayList<i> pausedTask = new CopyOnWriteArrayList<>();
    private volatile boolean isPaused = false;
    private FrameConfigData frameConfig = null;
    private BaseFrameRunStrategy.a callback = null;

    public FrameConcurrentRunStrategy(int i7) {
        this.maxSize = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task lambda$runTaskImpl$0(i iVar, long j7, Task task) throws Exception {
        this.runningTask.remove(iVar);
        i.a aVar = (i.a) task.getResult();
        BaseFrameRunStrategy.a aVar2 = this.callback;
        if (aVar2 != null) {
            ((com.bilibili.studio.editor.moudle.intelligence.frame.b) aVar2).a(iVar.j, aVar);
        }
        List list = aVar.a;
        reportFrameResult(iVar, j7, (list == null || list.isEmpty()) ? false : true);
        releaseIfOver();
        runTaskImpl();
        return null;
    }

    private void releaseIfOver() {
        if (this.waitingTask.isEmpty() && this.runningTask.isEmpty() && this.pausedTask.isEmpty()) {
            this.frameConfig = null;
            this.callback = null;
        }
    }

    private void reportFrameResult(i iVar, long j7, boolean z6) {
        FileTimePart fileTimePart;
        String str;
        if (iVar == null || (fileTimePart = iVar.j) == null) {
            return;
        }
        if (fileTimePart.isImage()) {
            str = "image";
        } else {
            FrameConfigData frameConfigData = this.frameConfig;
            str = (frameConfigData == null || frameConfigData.runTaskType != RunTaskType.COVER) ? "video" : "video_cover";
        }
        int size = fileTimePart.times.size();
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i7 = iVar.k;
        long j8 = fileTimePart.isImage() ? 0L : fileTimePart.duration / 1000;
        HashMap mapC = O4.b.c("type", str);
        P4.a.a(size, ThirdPartyExtraBuilder.KEY_RESULT, z6 ? "1" : "0", "num", mapC);
        mapC.put("no_cache_count", h.a(i7, jCurrentTimeMillis - j7, "cost_time", mapC));
        mapC.put(EditCustomizeSticker.TAG_DURATION, String.valueOf(j8));
        mapC.put("material_page_ab", ((Boolean) d.f105389a.getValue()).booleanValue() ? "1" : "0");
        g.c(mapC);
        Neurons.trackT(false, "creation.matter.smart.analysis.frame.tracker", mapC, 1, new c(8));
    }

    private void runTaskImpl() {
        if (this.pausedTask.size() + this.runningTask.size() >= this.maxSize) {
            BLog.e(TAG, "runTaskImpl is Full " + this.runningTask.size() + ", " + this.pausedTask.size());
            return;
        }
        if (this.waitingTask.isEmpty()) {
            BLog.e(TAG, "waitingTask is empty " + this.runningTask.size() + ", " + this.pausedTask.size());
            return;
        }
        while (this.pausedTask.size() + this.runningTask.size() < this.maxSize && !this.waitingTask.isEmpty()) {
            i iVarRemove = this.waitingTask.remove(0);
            synchronized (this) {
                if (this.isPaused) {
                    this.pausedTask.add(iVarRemove);
                    return;
                }
            }
            this.runningTask.add(iVarRemove);
            long jCurrentTimeMillis = System.currentTimeMillis();
            Objects.requireNonNull(iVarRemove);
            Task.callInBackground(new oz0.a(iVarRemove)).continueWithTask((Continuation) new oz0.b(this, iVarRemove, jCurrentTimeMillis), Task.UI_THREAD_EXECUTOR);
        }
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.frame.strategy.run.BaseFrameRunStrategy
    public void cancel() {
        this.runningTask.clear();
        this.waitingTask.clear();
        this.pausedTask.clear();
        this.callback = null;
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.frame.strategy.run.BaseFrameRunStrategy
    public void frameRun(List<FileTimePart> list, @NonNull FrameConfigData frameConfigData, BaseFrameRunStrategy.a aVar) {
        this.frameConfig = frameConfigData;
        this.callback = aVar;
        for (FileTimePart fileTimePart : list) {
            RunTaskType runTaskType = frameConfigData.runTaskType;
            this.waitingTask.add(runTaskType == RunTaskType.COVER ? new i(fileTimePart, frameConfigData.taskId, frameConfigData.curDirPath) : runTaskType == RunTaskType.NET ? new i(fileTimePart, frameConfigData.taskId, frameConfigData.curDirPath) : runTaskType == RunTaskType.SILENCE ? new i(fileTimePart, frameConfigData.taskId, frameConfigData.curDirPath) : new i(fileTimePart, frameConfigData.taskId, frameConfigData.curDirPath));
        }
        runTaskImpl();
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.frame.strategy.run.BaseFrameRunStrategy
    public void pause() {
        synchronized (this) {
            this.isPaused = true;
        }
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.frame.strategy.run.BaseFrameRunStrategy
    public void resume() {
        synchronized (this) {
            if (this.isPaused && !this.pausedTask.isEmpty()) {
                this.isPaused = false;
                this.waitingTask.addAll(0, this.pausedTask);
                this.pausedTask.clear();
                runTaskImpl();
            }
        }
    }
}
