package com.bilibili.studio.editor.moudle.intelligence.vm.logic;

import F3.C1692b;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.v0;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.studio.editor.moudle.intelligence.data.IntelligenceEnterResult;
import com.bilibili.studio.editor.moudle.intelligence.data.IntelligenceMusicInfo;
import com.bilibili.studio.editor.moudle.intelligence.vm.logic.I;
import com.bilibili.studio.module.tuwen.common.PbMaterialType;
import com.bilibili.studio.videoeditor.capturev3.data.BgmMissionInfo;
import com.bilibili.studio.videoeditor.download.DownloadRequest;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import zz0.C9270a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/logic/I.class */
public final class I extends C9270a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.studio.editor.moudle.intelligence.logic.g f107700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile int f107701e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile int f107702f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/logic/I$a.class */
    public interface a {
        void a(@NotNull IntelligenceMusicInfo intelligenceMusicInfo, @NotNull List<String> list, long j7);

        void b(@NotNull BgmMissionInfo bgmMissionInfo, long j7);

        void c(long j7, @NotNull String str);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/logic/I$b.class */
    public static final class b extends UB0.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f107703a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f107704b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final IntelligenceMusicInfo f107705c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final I f107706d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f107707e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f107708f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List<String> f107709g;
        public final a h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final String f107710i;

        public b(String str, String str2, IntelligenceMusicInfo intelligenceMusicInfo, I i7, long j7, String str3, List<String> list, a aVar, String str4) {
            this.f107703a = str;
            this.f107704b = str2;
            this.f107705c = intelligenceMusicInfo;
            this.f107706d = i7;
            this.f107707e = j7;
            this.f107708f = str3;
            this.f107709g = list;
            this.h = aVar;
            this.f107710i = str4;
        }

        @Override // UB0.c
        public final void c(long j7, long j8, long j9, String str) {
            long j10 = this.f107705c.musicId;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j11 = this.f107707e;
            this.f107706d.getClass();
            Xz0.d.g(2, 1006, 2, jCurrentTimeMillis - j11, String.valueOf(j10));
            String str2 = str;
            if (str == null) {
                str2 = "music download error";
            }
            this.f107706d.h(this.f107707e, str2, this.f107708f, this.f107705c, this.f107709g, this.h);
        }

        @Override // UB0.c
        public final void d(long j7, float f7, long j8, long j9, int i7) {
        }

        @Override // UB0.c
        public final void f(long j7, String str, String str2) {
            File file = new File(this.f107703a + this.f107704b);
            long length = file.length() / ((long) 1024);
            String absolutePath = file.getAbsolutePath();
            IntelligenceMusicInfo intelligenceMusicInfo = this.f107705c;
            intelligenceMusicInfo.localPath = absolutePath;
            intelligenceMusicInfo.isMusicDownload = 1;
            long j8 = intelligenceMusicInfo.musicId;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j9 = this.f107707e;
            this.f107706d.getClass();
            Xz0.d.g(1, -1, 2, jCurrentTimeMillis - j9, String.valueOf(j8));
            I.i(this.f107706d, this.f107707e, length, this.f107708f, intelligenceMusicInfo, this.f107709g, this.h, this.f107710i, false, 128);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.bilibili.studio.editor.moudle.intelligence.logic.g, java.lang.Object] */
    public I(@Nullable EditVideoInfo editVideoInfo, @NotNull IntelligenceEnterResult intelligenceEnterResult) {
        super(editVideoInfo, intelligenceEnterResult);
        this.f107700d = new Object();
    }

    public static void i(I i7, long j7, long j8, String str, IntelligenceMusicInfo intelligenceMusicInfo, List list, a aVar, String str2, boolean z6, int i8) {
        if ((i8 & 64) != 0) {
            str2 = null;
        }
        if ((i8 & 128) != 0) {
            z6 = false;
        }
        i7.f107701e = 1;
        long jCurrentTimeMillis = System.currentTimeMillis() - j7;
        BLog.e("NetMusicRecLogic", com.bapis.bilibili.app.home.v1.l.a(intelligenceMusicInfo.isMusicDownload, jCurrentTimeMillis, "musicDownloadSuccess costTime=", ",isCache="));
        long j9 = intelligenceMusicInfo.musicId;
        String str3 = intelligenceMusicInfo.downloadUrl;
        Xz0.d.f28458a.getClass();
        HashMap map = new HashMap();
        map.put("task_id", str);
        map.put("music_size", String.valueOf(j8));
        map.put("music_id", String.valueOf(j9));
        String str4 = str3;
        if (str3 == null) {
            str4 = "";
        }
        map.put("music_download_url", str4);
        String str5 = str2;
        if (str2 == null) {
            str5 = "";
        }
        map.put("music_format", str5);
        map.put("hit_cache", z6 ? "1" : "0");
        Neurons.trackT(false, "creation.uper.ai_to_video.music_size.track", map, 1, new C1692b(6));
        C9270a.a(i7, str, "music_download", jCurrentTimeMillis, true, "", null, null, 224);
        i7.d(j7, intelligenceMusicInfo, list, aVar);
    }

    public final void d(long j7, IntelligenceMusicInfo intelligenceMusicInfo, List<String> list, a aVar) {
        boolean z6 = false;
        if ((this.f107702f == 1 || this.f107702f == 2) && (this.f107701e == 1 || this.f107701e == 2)) {
            long jCurrentTimeMillis = System.currentTimeMillis() - j7;
            if (this.f107701e == 2) {
                aVar.c(jCurrentTimeMillis, "音乐文件下载失败");
                return;
            } else {
                v0.b(jCurrentTimeMillis, "checkStateAfterDownload success costTime=", "NetMusicRecLogic");
                aVar.a(intelligenceMusicInfo, list, jCurrentTimeMillis);
                return;
            }
        }
        boolean z7 = this.f107702f == 1 || this.f107702f == 2;
        if (this.f107701e == 1 || this.f107701e == 2) {
            z6 = true;
        }
        BLog.e("NetMusicRecLogic", "checkStateAfterDownload mp=" + z7 + ",music=" + z6);
    }

    public final void e(final String str, final long j7, final IntelligenceMusicInfo intelligenceMusicInfo, BgmMissionInfo bgmMissionInfo, final List<String> list, final String str2, final a aVar) {
        this.f107700d.getClass();
        String strB = com.bilibili.studio.editor.moudle.intelligence.logic.g.b();
        String strE = com.bilibili.studio.editor.moudle.intelligence.logic.g.e(bgmMissionInfo);
        if (TextUtils.isEmpty(strB) || TextUtils.isEmpty(strE)) {
            BLog.e("NetMusicRecLogic", "downloadMusicImp fail dir or name is empty");
            h(j7, "dir or name is empty", str, intelligenceMusicInfo, list, aVar);
            return;
        }
        if (Intrinsics.areEqual(ConfigManager.Companion.ab().get("uper.jax_based_download_enable", Boolean.FALSE), Boolean.TRUE)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C6583u(intelligenceMusicInfo.downloadUrl, String.valueOf(intelligenceMusicInfo.musicId), PbMaterialType.BBSMDMusicModule.getValue(), strE));
            C6581s.a(arrayList, new Function2(j7, intelligenceMusicInfo, aVar, this, str, str2, list) { // from class: com.bilibili.studio.editor.moudle.intelligence.vm.logic.G

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final IntelligenceMusicInfo f107687a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final I f107688b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final long f107689c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final String f107690d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final List f107691e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final I.a f107692f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final String f107693g;

                {
                    this.f107687a = intelligenceMusicInfo;
                    this.f107688b = this;
                    this.f107689c = j7;
                    this.f107690d = str;
                    this.f107691e = list;
                    this.f107692f = aVar;
                    this.f107693g = str2;
                }

                public final Object invoke(Object obj, Object obj2) {
                    List list2 = this.f107691e;
                    String str3 = (String) obj;
                    long length = new File(str3).length() / ((long) 1024);
                    IntelligenceMusicInfo intelligenceMusicInfo2 = this.f107687a;
                    intelligenceMusicInfo2.localPath = str3;
                    intelligenceMusicInfo2.isMusicDownload = 1;
                    I.i(this.f107688b, this.f107689c, length, this.f107690d, intelligenceMusicInfo2, list2, this.f107692f, this.f107693g, false, 128);
                    return Unit.INSTANCE;
                }
            }, new Function2(this, j7, str, intelligenceMusicInfo, list, aVar) { // from class: com.bilibili.studio.editor.moudle.intelligence.vm.logic.H

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final I f107694a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final long f107695b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final String f107696c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final IntelligenceMusicInfo f107697d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final List f107698e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final I.a f107699f;

                {
                    this.f107694a = this;
                    this.f107695b = j7;
                    this.f107696c = str;
                    this.f107697d = intelligenceMusicInfo;
                    this.f107698e = list;
                    this.f107699f = aVar;
                }

                public final Object invoke(Object obj, Object obj2) {
                    List<String> list2 = this.f107698e;
                    String str3 = (String) obj2;
                    q4.M.b("download error is ", str3, "downloadPbMaterials");
                    this.f107694a.h(this.f107695b, str3, this.f107696c, this.f107697d, list2, this.f107699f);
                    return Unit.INSTANCE;
                }
            });
            return;
        }
        Xz0.d.g(0, -1, 2, 0L, String.valueOf(intelligenceMusicInfo.musicId));
        DownloadRequest.a aVar2 = new DownloadRequest.a();
        aVar2.f109435b = intelligenceMusicInfo.downloadUrl;
        aVar2.f109436c = strB;
        aVar2.f109437d = strE;
        DownloadRequest downloadRequestA = aVar2.a();
        UB0.b.a(downloadRequestA, new b(strB, strE, intelligenceMusicInfo, this, j7, str, list, aVar, str2));
        UB0.b.f(downloadRequestA.taskId);
    }

    public final void f(long j7, String str, String str2, IntelligenceMusicInfo intelligenceMusicInfo, List<String> list, a aVar) {
        long jCurrentTimeMillis = System.currentTimeMillis() - j7;
        C9270a.a(this, str2, "music_mp_download", jCurrentTimeMillis, false, str, null, null, 224);
        this.f107702f = 2;
        BLog.e("NetMusicRecLogic", androidx.compose.ui.input.pointer.k.b(jCurrentTimeMillis, "downloadMarkPoint fail, time=", ",errorMsg=", str));
        d(j7, intelligenceMusicInfo, list, aVar);
    }

    public final void g(long j7, String str, IntelligenceMusicInfo intelligenceMusicInfo, List<String> list, a aVar) {
        String str2 = intelligenceMusicInfo.localMarkPointPath;
        IntelligenceMusicInfo.MusicMarker musicMarker = null;
        if (!TextUtils.isEmpty(str2)) {
            try {
                musicMarker = (IntelligenceMusicInfo.MusicMarker) JSON.parseObject(PB0.c.d(str2), IntelligenceMusicInfo.MusicMarker.class);
            } catch (Exception e7) {
                e7.printStackTrace();
            }
        }
        intelligenceMusicInfo.musicMarker = musicMarker;
        long jCurrentTimeMillis = System.currentTimeMillis() - j7;
        v0.b(jCurrentTimeMillis, "markerDownloadSuccess time=", "NetMusicRecLogic");
        this.f107702f = 1;
        C9270a.a(this, str, "music_mp_download", jCurrentTimeMillis, true, "", null, null, 224);
        d(j7, intelligenceMusicInfo, list, aVar);
    }

    public final void h(long j7, String str, String str2, IntelligenceMusicInfo intelligenceMusicInfo, List<String> list, a aVar) {
        this.f107701e = 2;
        long jCurrentTimeMillis = System.currentTimeMillis() - j7;
        BLog.e("NetMusicRecLogic", androidx.compose.ui.input.pointer.k.b(jCurrentTimeMillis, "musicDownloadFail costTime=", ",errorMsg=", str));
        C9270a.a(this, str2, "music_download", jCurrentTimeMillis, false, str, null, null, 224);
        d(j7, intelligenceMusicInfo, list, aVar);
    }

    public final void j(List list, String str, Yv0.e eVar, String str2, long j7, com.bilibili.studio.editor.moudle.intelligence.vm.p pVar) {
        BLog.e("NetMusicRecLogic", "startNetMusicRec onDataSuccess list=" + (list != null ? Integer.valueOf(list.size()) : null));
        long jCurrentTimeMillis = System.currentTimeMillis() - j7;
        if (list == null) {
            C9270a.a(this, str2, "music_recom", jCurrentTimeMillis, false, "music rec is empty", null, O4.b.c("upload_id", str), 96);
            pVar.c(jCurrentTimeMillis, "音乐推荐列表为空");
            return;
        }
        C9270a.a(this, str2, "music_recom", jCurrentTimeMillis, true, "", null, null, 224);
        if (this.f130976c) {
            BLog.e("NetMusicRecLogic", "startMusicDownload canceled");
        } else if (list.isEmpty()) {
            pVar.c(0L, "音乐推荐列表为空-startMusicSelect");
        } else {
            BuildersKt.launch$default(eVar, (CoroutineContext) null, (CoroutineStart) null, new IntelligenceNetMusicRecLogic$startMusicSelect$1(System.currentTimeMillis(), this, str2, pVar, list, null), 3, (Object) null);
        }
    }
}
