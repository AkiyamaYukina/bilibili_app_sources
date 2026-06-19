package com.bilibili.studio.material.internal.download;

import X1.C3081k;
import android.content.Context;
import com.bilibili.lib.okdownloader.BiliDownloader;
import com.bilibili.lib.okdownloader.Task;
import com.bilibili.lib.okdownloader.TaskFactory;
import com.bilibili.studio.material.util.UtilsKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/internal/download/b.class */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Context f108551a;

    public b(@Nullable Context context) {
        this.f108551a = context;
    }

    @Override // com.bilibili.studio.material.internal.download.c
    @NotNull
    public final String a(@NotNull DownloadRequest downloadRequest, @NotNull e eVar) {
        String strL;
        String url = downloadRequest.getUrl();
        if (url == null) {
            strL = "";
        } else {
            strL = url;
            if (StringsKt.Z(url, "http://")) {
                strL = StringsKt.L(url, "http://", "https://");
            }
        }
        String fileName = downloadRequest.getFileName();
        String filePath = downloadRequest.getFilePath();
        if (this.f108551a == null || strL == null || fileName == null || filePath == null) {
            return "";
        }
        bilibili.live.app.service.resolver.b.a(C3081k.b("createAndStartTask: ", strL, " ", " ", fileName.length() == 0), filePath, UtilsKt.Material_TAG);
        TaskFactory taskFactory = BiliDownloader.Companion.get(this.f108551a);
        String business = downloadRequest.getBusiness();
        String str = business;
        if (business == null) {
            str = "studio_creation";
        }
        com.bilibili.lib.okdownloader.DownloadRequest downloadRequestAddListener = taskFactory.create(strL, str).rejectedWhenFileExists().fileName(StringsKt.L(StringsKt.L(fileName, "\r", ""), "\n", "")).into(filePath).retryTime(3).intercept(false).addListener(new a(eVar, filePath, fileName));
        Map<String, String> headers = downloadRequest.getHeaders();
        if (headers != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                if (entry.getValue().length() > 0) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                downloadRequestAddListener.addHeader((String) entry2.getKey(), (String) entry2.getValue());
            }
        }
        Task taskBuild = downloadRequestAddListener.build();
        taskBuild.enqueue();
        return taskBuild.getTaskId();
    }

    @Override // com.bilibili.studio.material.internal.download.c
    public final void b(@Nullable Context context, @NotNull String str) {
        if (context != null) {
            BiliDownloader.Companion.getInstance(context).cancel(str);
        }
    }
}
