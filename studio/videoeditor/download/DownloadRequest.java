package com.bilibili.studio.videoeditor.download;

import androidx.annotation.Keep;
import java.util.HashMap;
import java.util.Map;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/download/DownloadRequest.class */
@Keep
public class DownloadRequest implements Cloneable {
    public String dir;
    public boolean disableEnv;
    public String fileName;
    public Map<String, String> headers;
    public boolean isBackground;
    public String materialId;
    public long taskId;
    public String taskId2;
    public String trackFrom;
    public String url;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/download/DownloadRequest$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f109434a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f109435b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f109436c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f109437d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f109438e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f109439f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Map<String, String> f109440g = new HashMap();
        public boolean h;

        public final DownloadRequest a() {
            this.f109434a = System.nanoTime();
            return new DownloadRequest(this, 0);
        }
    }

    private DownloadRequest() {
    }

    private DownloadRequest(a aVar) {
        this.taskId = aVar.f109434a;
        this.taskId2 = null;
        this.materialId = null;
        this.url = aVar.f109435b;
        this.dir = aVar.f109436c;
        this.fileName = aVar.f109437d;
        this.isBackground = aVar.f109438e;
        this.trackFrom = aVar.f109439f;
        this.headers = aVar.f109440g;
        this.disableEnv = aVar.h;
    }

    public /* synthetic */ DownloadRequest(a aVar, int i7) {
        this(aVar);
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public DownloadRequest m10434clone() {
        try {
            DownloadRequest downloadRequest = (DownloadRequest) super.clone();
            downloadRequest.taskId = this.taskId;
            downloadRequest.taskId2 = this.taskId2;
            downloadRequest.materialId = this.materialId;
            downloadRequest.url = this.url;
            downloadRequest.dir = this.dir;
            downloadRequest.fileName = this.fileName;
            downloadRequest.isBackground = this.isBackground;
            downloadRequest.trackFrom = this.trackFrom;
            downloadRequest.headers = this.headers;
            return downloadRequest;
        } catch (CloneNotSupportedException e7) {
            throw new AssertionError(e7);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DownloadRequest{taskId=");
        sb.append(this.taskId);
        sb.append(", taskId2=");
        sb.append(this.taskId2);
        sb.append(", materialId=");
        sb.append(this.materialId);
        sb.append(", url='");
        sb.append(this.url);
        sb.append("', filePath='");
        sb.append(this.dir);
        sb.append("', fileName='");
        sb.append(this.fileName);
        sb.append("', isBackground='");
        sb.append(this.isBackground);
        sb.append("', trackFrom='");
        return C8770a.a(sb, this.trackFrom, "'}");
    }
}
