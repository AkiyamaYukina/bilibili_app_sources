package com.bilibili.studio.editor.moudle.intelligence.frame.strategy.run;

import androidx.annotation.NonNull;
import com.bilibili.studio.editor.moudle.intelligence.frame.d;
import com.bilibili.studio.editor.moudle.intelligence.frame.data.FileTimePart;
import com.bilibili.studio.editor.moudle.intelligence.frame.data.FrameConfigData;
import com.bilibili.studio.editor.moudle.intelligence.frame.strategy.run.BaseFrameRunStrategy;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import nz0.InterfaceC8146a;
import rz0.h;
import rz0.i;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/frame/strategy/run/a.class */
public final class a extends BaseFrameRunStrategy {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList<i> f107321b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList<i> f107322c = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList<i> f107323d = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f107324e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public BaseFrameRunStrategy.a f107325f = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f107320a = 3;

    /* JADX INFO: renamed from: com.bilibili.studio.editor.moudle.intelligence.frame.strategy.run.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/frame/strategy/run/a$a.class */
    public final class C1195a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f107326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f107327b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f107328c;

        public C1195a(a aVar, i iVar, List list) {
            this.f107328c = aVar;
            this.f107326a = iVar;
            this.f107327b = list;
        }

        public final void a() {
            a aVar = this.f107328c;
            CopyOnWriteArrayList<i> copyOnWriteArrayList = aVar.f107321b;
            i iVar = this.f107326a;
            copyOnWriteArrayList.remove(iVar);
            BaseFrameRunStrategy.a aVar2 = aVar.f107325f;
            if (aVar2 != null) {
                ((com.bilibili.studio.editor.moudle.intelligence.frame.b) aVar2).a(iVar.j, new i.a(this.f107327b, iVar.l, iVar.m));
            }
            if (aVar.f107322c.isEmpty() && aVar.f107321b.isEmpty() && aVar.f107323d.isEmpty()) {
                aVar.f107325f = null;
            }
            aVar.runTaskImpl();
        }

        public final void b(long j7, long j8, File file) {
            BaseFrameRunStrategy.a aVar = this.f107328c.f107325f;
            if (aVar != null) {
                FileTimePart fileTimePart = this.f107326a.j;
                com.bilibili.studio.editor.moudle.intelligence.frame.b bVar = (com.bilibili.studio.editor.moudle.intelligence.frame.b) aVar;
                d dVar = bVar.f107298a;
                InterfaceC8146a interfaceC8146a = dVar.f107300a;
                if (interfaceC8146a != null) {
                    interfaceC8146a.b(fileTimePart.rotation, file, fileTimePart.filePath);
                    com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload.d dVar2 = dVar.f107302c;
                    if (dVar2 != null) {
                        dVar2.b(dVar.f107305f, fileTimePart, j7, j8, file, new com.bilibili.studio.editor.moudle.intelligence.frame.a(bVar));
                    }
                }
            }
            ((ArrayList) this.f107327b).add(file);
        }
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.frame.strategy.run.BaseFrameRunStrategy
    public final void cancel() {
        this.f107321b.clear();
        this.f107322c.clear();
        this.f107323d.clear();
        this.f107325f = null;
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.frame.strategy.run.BaseFrameRunStrategy
    public final void frameRun(List<FileTimePart> list, @NonNull FrameConfigData frameConfigData, BaseFrameRunStrategy.a aVar) {
        this.f107325f = aVar;
        Iterator<FileTimePart> it = list.iterator();
        while (it.hasNext()) {
            this.f107322c.add(new h(it.next(), frameConfigData.taskId, frameConfigData.curDirPath));
        }
        runTaskImpl();
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.frame.strategy.run.BaseFrameRunStrategy
    public final void pause() {
        this.f107324e = true;
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.frame.strategy.run.BaseFrameRunStrategy
    public final void resume() {
        if (!this.f107324e || this.f107323d.isEmpty()) {
            return;
        }
        this.f107324e = false;
        this.f107322c.addAll(0, this.f107323d);
        this.f107323d.clear();
        runTaskImpl();
    }

    public final void runTaskImpl() {
        if (this.f107323d.size() + this.f107321b.size() >= this.f107320a) {
            BLog.e("FrameConcurrentRunStrategyV2", "runTaskImpl is Full " + this.f107321b.size() + ", " + this.f107323d.size());
            return;
        }
        if (this.f107322c.isEmpty()) {
            BLog.e("FrameConcurrentRunStrategyV2", "waitingTask is empty " + this.f107321b.size() + ", " + this.f107323d.size());
            return;
        }
        while (this.f107323d.size() + this.f107321b.size() < this.f107320a && !this.f107322c.isEmpty()) {
            i iVarRemove = this.f107322c.remove(0);
            synchronized (this) {
                if (this.f107324e) {
                    this.f107323d.add(iVarRemove);
                    return;
                }
            }
            this.f107321b.add(iVarRemove);
            iVarRemove.i(new C1195a(this, iVarRemove, new ArrayList()));
        }
    }
}
