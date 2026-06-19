package com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload;

import bolts.Continuation;
import bolts.Task;
import com.bilibili.studio.editor.moudle.intelligence.frame.data.FileTimePart;
import com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload.bean.FrameUploadBean;
import com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload.task.SubFrameUploadPreTask;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/frame/strategy/upload/a.class */
public final class a extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<FrameUploadBean> f107334c;

    public a(String str) {
        super(str);
        this.f107334c = com.bilibili.app.dialogmanager2.c.a();
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload.d
    public final void a(String str, com.bilibili.studio.editor.moudle.intelligence.frame.c cVar) {
        synchronized (this) {
            if (this.f107334c.isEmpty()) {
                cVar.b(2, "cacheFrameList.isEmpty", "");
                cVar.a();
            } else {
                ArrayList arrayList = new ArrayList(this.f107334c);
                this.f107334c.clear();
                SubFrameUploadPreTask subFrameUploadPreTask = new SubFrameUploadPreTask(str, arrayList, cVar);
                Task.callInBackground(new qz0.a(subFrameUploadPreTask)).continueWithTask((Continuation) new qz0.b(this, subFrameUploadPreTask), Task.UI_THREAD_EXECUTOR);
            }
        }
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload.d
    public final void b(String str, FileTimePart fileTimePart, long j7, long j8, File file, com.bilibili.studio.editor.moudle.intelligence.frame.a aVar) {
        synchronized (this) {
            this.f107334c.add(FrameUploadBean.createFrameBean(fileTimePart, j7, file, j8));
        }
    }
}
