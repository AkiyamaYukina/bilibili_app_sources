package com.bilibili.studio.editor.moudle.intelligence.frame;

import F3.C1692b;
import bolts.Continuation;
import bolts.Task;
import com.bilibili.adcommon.utils.i;
import com.bilibili.base.BiliContext;
import com.bilibili.commons.io.FileUtils;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.studio.editor.moudle.intelligence.frame.data.FileTimePart;
import com.bilibili.studio.editor.moudle.intelligence.frame.data.FrameConfigData;
import com.bilibili.studio.editor.moudle.intelligence.frame.data.FrameUploadData;
import com.bilibili.studio.editor.moudle.intelligence.frame.strategy.run.BaseFrameRunStrategy;
import com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload.SubsectionFrameUploadStrategy;
import com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload.d;
import com.bilibili.studio.editor.moudle.intelligence.frame.task.RunTaskType;
import com.bilibili.studio.videoeditor.util.V;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import nz0.InterfaceC8146a;
import pz0.f;
import q4.M;
import tv.danmaku.android.log.BLog;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/frame/d.class */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC8146a f107300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nonnull
    public final f f107301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload.d f107302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nonnull
    public final BaseFrameRunStrategy f107303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f107304e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f107305f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f107306g;
    public String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicInteger f107307i = new AtomicInteger(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f107308j = new AtomicBoolean(false);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f107309k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nonnull
    public final RunTaskType f107310l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nonnull
    public final FrameSceneType f107311m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final mz0.a f107312n;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/frame/d$a.class */
    public final class a implements d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f107313a;

        public a(d dVar) {
            this.f107313a = dVar;
        }

        @Override // com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload.d.a
        public final void a() {
            InterfaceC8146a interfaceC8146a = this.f107313a.f107300a;
            if (interfaceC8146a != null) {
                interfaceC8146a.e();
            }
        }

        @Override // com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload.d.a
        public final void b(int i7, String str, String str2) {
            M.b("zipAndUploadFrame onUploadFail errorMsg=", str, "AiFrameManager");
            d dVar = this.f107313a;
            InterfaceC8146a interfaceC8146a = dVar.f107300a;
            if (interfaceC8146a != null) {
                if (i7 == 1) {
                    interfaceC8146a.f(i7, str2, true);
                } else {
                    interfaceC8146a.d(dVar.f107306g, str2, true);
                }
            }
        }

        @Override // com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload.d.a
        public final void c(int i7, long j7, String str) {
            d dVar = this.f107313a;
            if (dVar.f107300a != null) {
                dVar.f107300a.a(dVar.f107306g, new FrameUploadData(str, j7, i7, true, d.a(dVar)));
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/frame/d$b.class */
    public static final class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public String f107317d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload.d f107314a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nonnull
        public f f107315b = new f();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nonnull
        public BaseFrameRunStrategy f107316c = new BaseFrameRunStrategy();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nonnull
        public RunTaskType f107318e = RunTaskType.NET;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public FrameSceneType f107319f = FrameSceneType.DEFAULT;

        public final d a() {
            com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload.d dVar = this.f107314a;
            if (((dVar instanceof SubsectionFrameUploadStrategy) || (dVar instanceof com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload.a)) && !(this.f107316c instanceof com.bilibili.studio.editor.moudle.intelligence.frame.strategy.run.a)) {
                throw new IllegalArgumentException("uploadStrategy is (SubsectionFrameUploadStrategy or DescriptionFrameUploadStrategy),runStrategy must be FrameConcurrentRunStrategyV2");
            }
            return new d(this);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, mz0.a] */
    public d(b bVar) {
        ?? obj = new Object();
        this.f107312n = obj;
        File externalFilesDir = BiliContext.application().getExternalFilesDir("edit_ai_frame");
        if (externalFilesDir != null) {
            this.f107304e = externalFilesDir.getAbsolutePath() + File.separator;
        } else {
            this.f107304e = BiliContext.application().getFilesDir() + File.separator;
        }
        String str = bVar.f107317d;
        if (str != null) {
            this.f107304e = str;
        }
        com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload.d dVar = bVar.f107314a;
        if (dVar != null) {
            this.f107302c = dVar;
        }
        this.f107301b = bVar.f107315b;
        this.f107303d = bVar.f107316c;
        this.f107310l = bVar.f107318e;
        this.f107311m = bVar.f107319f;
        ((mz0.a) obj).a = 0;
        ((mz0.a) obj).b = 0;
        ((mz0.a) obj).c = 0;
        ((mz0.a) obj).d = 0;
        ((mz0.a) obj).e = 0;
        ((mz0.a) obj).f = 0;
        ((mz0.a) obj).g = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(com.bilibili.studio.editor.moudle.intelligence.frame.d r3) {
        /*
            r0 = r3
            com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload.d r0 = r0.f107302c
            r8 = r0
            r0 = 0
            r5 = r0
            r0 = 0
            r4 = r0
            r0 = r8
            if (r0 != 0) goto L14
            r0 = r5
            r4 = r0
            goto L57
        L14:
            r0 = r8
            boolean r0 = r0 instanceof com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload.SubsectionFrameUploadStrategy
            if (r0 == 0) goto L3d
            r0 = r8
            com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload.SubsectionFrameUploadStrategy r0 = (com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload.SubsectionFrameUploadStrategy) r0
            com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload.SubsectionFrameUploadStrategy$UploadStrategyConfig r0 = r0.f107329c
            int r0 = r0.subUploadSize
            r7 = r0
            r0 = r3
            mz0.a r0 = r0.f107312n
            r3 = r0
            r0 = r3
            int r0 = r0.a
            r1 = r3
            int r1 = r1.b
            int r0 = r0 + r1
            r6 = r0
            r0 = r7
            if (r0 > 0) goto L42
        L3d:
            r0 = 1
            r4 = r0
            goto L57
        L42:
            r0 = r6
            r1 = r7
            int r0 = r0 / r1
            r5 = r0
            r0 = r6
            r1 = r7
            int r0 = r0 % r1
            if (r0 != 0) goto L51
            goto L53
        L51:
            r0 = 1
            r4 = r0
        L53:
            r0 = r4
            r1 = r5
            int r0 = r0 + r1
            r4 = r0
        L57:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.intelligence.frame.d.a(com.bilibili.studio.editor.moudle.intelligence.frame.d):int");
    }

    public final void b() {
        FrameSceneType frameSceneType = FrameSceneType.DEFAULT;
        FrameSceneType frameSceneType2 = this.f107311m;
        if (frameSceneType2 != frameSceneType) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            mz0.a aVar = this.f107312n;
            long j7 = aVar.g;
            Xz0.d.f28458a.getClass();
            HashMap map = new HashMap();
            map.put("image_total_count", String.valueOf(aVar.a));
            map.put("video_total_count", String.valueOf(aVar.b));
            map.put("image_success_count", String.valueOf(aVar.c));
            map.put("video_success_count", String.valueOf(aVar.d));
            map.put("image_cache_count", String.valueOf(aVar.e));
            map.put("video_cache_count", String.valueOf(aVar.f));
            map.put("scene_type", frameSceneType2.getValue());
            map.put("cost_time", String.valueOf(jCurrentTimeMillis - j7));
            Neurons.trackT(false, "creation.uper.ai_to_video.frame_cache.track", map, 1, new C1692b(6));
        }
        InterfaceC8146a interfaceC8146a = this.f107300a;
        if (interfaceC8146a != null) {
            interfaceC8146a.g(this.f107306g, this.f107305f);
        }
    }

    public final void c(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f107304e);
        String strA = C8770a.a(sb, File.separator, str);
        File file = new File(strA);
        i.a("清理帧文件目录～markId=", str, ",tag=", str2, "AiFrameManager");
        if (file.exists()) {
            if (file.isDirectory()) {
                try {
                    FileUtils.deleteDirectory(file);
                    return;
                } catch (IOException e7) {
                    e7.printStackTrace();
                    return;
                }
            }
            BLog.i("AiFrameManager", " clearFrame delete=" + file.delete() + ",deleteDir=" + strA);
        }
    }

    public final void d(@Nonnull String str, @Nullable String str2, List<FileTimePart> list) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        mz0.a aVar = this.f107312n;
        aVar.g = jCurrentTimeMillis;
        this.f107306g = str;
        this.h = str2;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f107304e);
        this.f107305f = C8770a.a(sb, File.separator, str);
        this.f107308j.set(false);
        List<FileTimePart> listC = this.f107301b.c(list);
        if (!listC.isEmpty()) {
            int size = 0;
            int size2 = 0;
            for (FileTimePart fileTimePart : listC) {
                if (!V.e(fileTimePart.times)) {
                    if (fileTimePart.isVideo()) {
                        size2 = fileTimePart.times.size() + size2;
                    } else if (fileTimePart.isImage()) {
                        size = fileTimePart.times.size() + size;
                    }
                }
            }
            aVar.a = size;
            aVar.b = size2;
        }
        this.f107307i.set(0);
        this.f107309k = listC.size();
        FrameConfigData frameConfigData = new FrameConfigData();
        frameConfigData.curDirPath = this.f107305f;
        frameConfigData.taskId = this.h;
        frameConfigData.runTaskType = this.f107310l;
        this.f107303d.frameRun(listC, frameConfigData, new com.bilibili.studio.editor.moudle.intelligence.frame.b(this));
    }

    public final void e(String str) {
        com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload.d dVar = this.f107302c;
        if (dVar != null) {
            File file = new File(this.f107305f);
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, "frames.zip");
            Task.callInBackground(new qz0.d(str, file2)).continueWith((Continuation) new Ah.f(dVar, 1, new a(this), file2), Task.UI_THREAD_EXECUTOR);
        }
    }
}
