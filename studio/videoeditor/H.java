package com.bilibili.studio.videoeditor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/H.class */
public final class H {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile H f108865c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f108866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f108867b;

    public static H a() {
        H h;
        synchronized (H.class) {
            try {
                if (f108865c == null) {
                    H h7 = new H();
                    h7.f108866a = "undefined";
                    h7.f108867b = 0;
                    f108865c = h7;
                }
                h = f108865c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return h;
    }
}
