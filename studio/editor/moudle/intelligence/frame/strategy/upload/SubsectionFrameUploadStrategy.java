package com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import bolts.Continuation;
import bolts.Task;
import com.bilibili.studio.editor.moudle.intelligence.frame.data.FileTimePart;
import com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload.bean.FrameUploadBean;
import com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload.d;
import com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload.task.SubFrameUploadPreTask;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import qz0.e;
import qz0.f;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/frame/strategy/upload/SubsectionFrameUploadStrategy.class */
public final class SubsectionFrameUploadStrategy extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UploadStrategyConfig f107329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<FrameUploadBean> f107330d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<SubFrameUploadPreTask> f107331e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SubFrameUploadPreTask f107332f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/frame/strategy/upload/SubsectionFrameUploadStrategy$UploadStrategyConfig.class */
    @Keep
    public static class UploadStrategyConfig {
        public int subUploadSize;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/frame/strategy/upload/SubsectionFrameUploadStrategy$a.class */
    public final class a implements d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SubsectionFrameUploadStrategy f107333a;

        public a(SubsectionFrameUploadStrategy subsectionFrameUploadStrategy) {
            this.f107333a = subsectionFrameUploadStrategy;
        }

        @Override // com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload.d.a
        public final void a() {
            d.a aVar;
            SubsectionFrameUploadStrategy subsectionFrameUploadStrategy = this.f107333a;
            SubFrameUploadPreTask subFrameUploadPreTask = subsectionFrameUploadStrategy.f107332f;
            if (subFrameUploadPreTask != null && (aVar = subFrameUploadPreTask.mListener) != null) {
                aVar.a();
            }
            subsectionFrameUploadStrategy.f107332f = null;
            subsectionFrameUploadStrategy.f();
        }

        @Override // com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload.d.a
        public final void b(int i7, String str, String str2) {
            d.a aVar;
            SubFrameUploadPreTask subFrameUploadPreTask = this.f107333a.f107332f;
            if (subFrameUploadPreTask == null || (aVar = subFrameUploadPreTask.mListener) == null) {
                return;
            }
            aVar.b(i7, str, str2);
        }

        @Override // com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload.d.a
        public final void c(int i7, long j7, String str) {
            d.a aVar;
            SubFrameUploadPreTask subFrameUploadPreTask = this.f107333a.f107332f;
            if (subFrameUploadPreTask == null || (aVar = subFrameUploadPreTask.mListener) == null) {
                return;
            }
            aVar.c(i7, j7, str);
        }
    }

    public SubsectionFrameUploadStrategy(@NonNull UploadStrategyConfig uploadStrategyConfig) {
        super("");
        this.f107330d = com.bilibili.app.dialogmanager2.c.a();
        this.f107331e = new ArrayList();
        this.f107332f = null;
        this.f107329c = uploadStrategyConfig;
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload.d
    public final void a(String str, com.bilibili.studio.editor.moudle.intelligence.frame.c cVar) {
        synchronized (this) {
            e(str, true, cVar);
        }
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload.d
    public final void b(String str, FileTimePart fileTimePart, long j7, long j8, File file, com.bilibili.studio.editor.moudle.intelligence.frame.a aVar) {
        synchronized (this) {
            this.f107330d.add(FrameUploadBean.createFrameBean(fileTimePart, j7, file, j8));
            e(str, false, aVar);
        }
    }

    public final void e(String str, boolean z6, d.a aVar) {
        if (this.f107330d.size() >= this.f107329c.subUploadSize || z6) {
            ArrayList arrayList = new ArrayList(this.f107330d);
            this.f107330d.clear();
            ((ArrayList) this.f107331e).add(new SubFrameUploadPreTask(str, arrayList, aVar));
            f();
        }
    }

    public final void f() {
        if (this.f107332f == null && !((ArrayList) this.f107331e).isEmpty()) {
            this.f107332f = (SubFrameUploadPreTask) ((ArrayList) this.f107331e).remove(0);
            Task.callInBackground(new e(this)).continueWithTask((Continuation) new f(this), Task.UI_THREAD_EXECUTOR);
        }
    }
}
