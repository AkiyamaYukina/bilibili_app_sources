package com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload;

import android.app.Application;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.fileupload.FileUploadManager;
import com.bilibili.lib.fileupload.FileUploadTask;
import com.bilibili.studio.editor.moudle.intelligence.frame.data.FileTimePart;
import com.bilibili.upos.videoupload.UpOSTask;
import java.io.File;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/frame/strategy/upload/d.class */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public UpOSTask f107343b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/frame/strategy/upload/d$a.class */
    public interface a {
        void a();

        void b(int i7, String str, String str2);

        void c(int i7, long j7, String str);
    }

    public d(String str) {
        this.f107342a = str;
    }

    public void a(String str, com.bilibili.studio.editor.moudle.intelligence.frame.c cVar) {
        synchronized (this) {
        }
    }

    public void b(String str, FileTimePart fileTimePart, long j7, long j8, File file, com.bilibili.studio.editor.moudle.intelligence.frame.a aVar) {
        synchronized (this) {
        }
    }

    public void c(int i7, a aVar, File file) {
        if (!file.exists() || file.length() == 0) {
            aVar.b(1, "uploadFile is not exist", file.getAbsolutePath());
            aVar.a();
            return;
        }
        Application application = BiliContext.application();
        if (application == null) {
            return;
        }
        UpOSTask upOSTaskBuild = new UpOSTask.Builder(application, file.getAbsolutePath()).disableMergeProfile(true).setProfile("svf/android").build();
        this.f107343b = upOSTaskBuild;
        if (upOSTaskBuild == null) {
            aVar.b(2, "uploadTask create fail", file.getAbsolutePath());
            aVar.a();
        } else {
            upOSTaskBuild.addUploadCallback(new b(this, aVar, file, i7));
            this.f107343b.start();
        }
    }

    public final void d(int i7, a aVar, File file) {
        if (file.exists() && file.length() != 0) {
            FileUploadTask fileUploadTaskBuild = new FileUploadTask.Builder().setProfile("svf/android").setSignId(this.f107342a).setFilePath(file.getPath()).build();
            fileUploadTaskBuild.addUploadCallback(new c(i7, aVar, file));
            FileUploadManager.Companion.getInstance().addUploadTask(fileUploadTaskBuild);
        } else if (aVar != null) {
            aVar.b(1, "uploadFile is not exists", file.getAbsolutePath());
            aVar.a();
        }
    }
}
