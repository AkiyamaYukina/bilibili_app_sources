package com.bilibili.studio.editor.moudle.music.manager;

import TC0.h;
import UB0.f;
import UB0.g;
import UB0.m;
import UB0.n;
import android.app.Application;
import android.os.Environment;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import androidx.compose.ui.text.font.C4496a;
import com.bilibili.base.BiliContext;
import com.bilibili.droid.ToastHelper;
import com.bilibili.studio.videoeditor.bgm.Bgm;
import com.bilibili.studio.videoeditor.download.DownloadRequest;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/music/manager/b.class */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static b f107902d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public InterfaceC1198b f107903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MusicDownloadData f107904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<DownloadRequest> f107905c = new ArrayList();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/music/manager/b$a.class */
    public final class a extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MusicDownloadData f107906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DownloadRequest f107907b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Bgm f107908c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b f107909d;

        public a(b bVar, MusicDownloadData musicDownloadData, DownloadRequest downloadRequest, Bgm bgm) {
            this.f107909d = bVar;
            this.f107906a = musicDownloadData;
            this.f107907b = downloadRequest;
            this.f107908c = bgm;
        }

        @Override // UB0.m, UB0.c
        public final void J(long j7) {
            long j8 = this.f107908c.sid;
            this.f107909d.getClass();
            Xz0.d dVar = Xz0.d.f28458a;
            String string = Long.valueOf(j8).toString();
            dVar.getClass();
            Xz0.d.y("editor", "cancel", "bgm", string, "");
        }

        @Override // UB0.c
        public final void c(long j7, long j8, long j9, String str) {
            DownloadRequest downloadRequest = this.f107907b;
            f.a(downloadRequest.url, null);
            b bVar = this.f107909d;
            ((ArrayList) bVar.f107905c).remove(downloadRequest);
            b.a(bVar, this.f107906a);
            long j10 = this.f107908c.sid;
            String strA = C4496a.a(" download failed : ", str);
            Xz0.d dVar = Xz0.d.f28458a;
            String string = Long.valueOf(j10).toString();
            dVar.getClass();
            Xz0.d.y("editor", "error", "bgm", string, strA);
        }

        @Override // UB0.c
        public final void d(long j7, float f7, long j8, long j9, int i7) {
            b bVar = this.f107909d;
            InterfaceC1198b interfaceC1198b = bVar.f107903a;
            if (interfaceC1198b == null) {
                return;
            }
            MusicDownloadData musicDownloadData = bVar.f107904b;
            MusicDownloadData musicDownloadData2 = this.f107906a;
            if (musicDownloadData == musicDownloadData2) {
                interfaceC1198b.d(musicDownloadData2, i7);
            }
        }

        @Override // UB0.c
        public final void f(long j7, String str, String str2) {
            DownloadRequest downloadRequest = this.f107907b;
            f.a(downloadRequest.url, str);
            b bVar = this.f107909d;
            ((ArrayList) bVar.f107905c).remove(downloadRequest);
            InterfaceC1198b interfaceC1198b = bVar.f107903a;
            if (interfaceC1198b != null) {
                MusicDownloadData musicDownloadData = bVar.f107904b;
                MusicDownloadData musicDownloadData2 = this.f107906a;
                if (musicDownloadData == musicDownloadData2) {
                    interfaceC1198b.a(musicDownloadData2);
                    bVar.f107904b = null;
                } else {
                    BLog.e("b", "callbackSuccess 不回调 数据不一致 downloadData=" + musicDownloadData2 + ",curDownloadData=" + bVar.f107904b);
                }
            }
            long j8 = this.f107908c.sid;
            Xz0.d dVar = Xz0.d.f28458a;
            String string = Long.valueOf(j8).toString();
            dVar.getClass();
            Xz0.d.y("editor", "success", "bgm", string, null);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.studio.editor.moudle.music.manager.b$b, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/music/manager/b$b.class */
    public interface InterfaceC1198b {
        void a(MusicDownloadData musicDownloadData);

        void c(MusicDownloadData musicDownloadData);

        void d(MusicDownloadData musicDownloadData, int i7);
    }

    public static void a(b bVar, MusicDownloadData musicDownloadData) {
        InterfaceC1198b interfaceC1198b = bVar.f107903a;
        if (interfaceC1198b == null) {
            BLog.e("b", "callbackFail  musicDownloadListener == null 不再回调");
            return;
        }
        if (bVar.f107904b == musicDownloadData) {
            interfaceC1198b.c(musicDownloadData);
            bVar.f107904b = null;
            return;
        }
        BLog.e("b", "callbackFail 不回调 数据不一致 downloadData=" + musicDownloadData + ",curDownloadData=" + bVar.f107904b);
    }

    public static b d() {
        if (f107902d == null) {
            synchronized (b.class) {
                try {
                    if (f107902d == null) {
                        f107902d = new b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f107902d;
    }

    @MainThread
    public final void b() {
        if (((ArrayList) this.f107905c).isEmpty()) {
            return;
        }
        Iterator it = ((ArrayList) this.f107905c).iterator();
        while (it.hasNext()) {
            g gVarA = n.a(((DownloadRequest) it.next()).taskId);
            if (gVarA != null) {
                gVarA.f24597a.f24608e = 7;
            }
        }
        ((ArrayList) this.f107905c).clear();
        this.f107903a = null;
        this.f107904b = null;
    }

    @MainThread
    public final void c(MusicDownloadData musicDownloadData) {
        this.f107904b = musicDownloadData;
        Bgm downloadBgmInfo = musicDownloadData.getDownloadBgmInfo();
        long j7 = downloadBgmInfo.sid;
        Xz0.d dVar = Xz0.d.f28458a;
        String string = Long.valueOf(j7).toString();
        dVar.getClass();
        Xz0.d.y("editor", "start", "bgm", string, null);
        if (TextUtils.isEmpty(downloadBgmInfo.playurl)) {
            h.a(BiliContext.application(), downloadBgmInfo.sid, new com.bilibili.studio.editor.moudle.music.manager.a(this, downloadBgmInfo, musicDownloadData));
        } else {
            e(musicDownloadData);
        }
    }

    public final void e(MusicDownloadData musicDownloadData) {
        Application application = BiliContext.application();
        if (application == null) {
            return;
        }
        File externalFilesDir = application.getExternalFilesDir(Environment.DIRECTORY_MUSIC);
        File cacheDir = externalFilesDir;
        if (externalFilesDir == null) {
            cacheDir = application.getCacheDir();
        }
        if (cacheDir == null) {
            ToastHelper.showToastShort(application, 2131842044);
            return;
        }
        Bgm downloadBgmInfo = musicDownloadData.getDownloadBgmInfo();
        String str = cacheDir.getAbsolutePath() + File.separator;
        String str2 = downloadBgmInfo.name + ".mp3";
        musicDownloadData.setFileName(str2);
        musicDownloadData.setLocalFilePath(str);
        DownloadRequest.a aVar = new DownloadRequest.a();
        aVar.f109435b = downloadBgmInfo.playurl;
        aVar.f109436c = str;
        aVar.f109437d = str2;
        aVar.f109438e = true;
        DownloadRequest downloadRequestA = aVar.a();
        UB0.b.a(downloadRequestA, new a(this, musicDownloadData, downloadRequestA, downloadBgmInfo));
        String str3 = downloadRequestA.url;
        WeakHashMap<String, Long> weakHashMap = f.f24596a;
        if (!TextUtils.isEmpty(str3)) {
            f.f24596a.put(str3, Long.valueOf(System.currentTimeMillis()));
        }
        UB0.b.f(downloadRequestA.taskId);
        ((ArrayList) this.f107905c).add(downloadRequestA);
        S9.b.a(new StringBuilder("startDownloadBgm "), musicDownloadData.getDownloadBgmInfo().name, "b");
    }
}
