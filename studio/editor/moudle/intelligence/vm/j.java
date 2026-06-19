package com.bilibili.studio.editor.moudle.intelligence.vm;

import android.text.TextUtils;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.studio.editor.asr.bean.CaptionRecognition;
import com.bilibili.studio.editor.moudle.intelligence.data.FileFrameResult;
import com.bilibili.studio.editor.moudle.intelligence.data.IntelligenceAudioConfig;
import com.bilibili.studio.editor.moudle.intelligence.data.IntelligenceDefaultTemplateBean;
import com.bilibili.studio.editor.moudle.intelligence.data.IntelligenceMusicInfo;
import com.bilibili.studio.editor.moudle.intelligence.data.IntelligenceTemplateInfo;
import com.bilibili.studio.editor.moudle.intelligence.vm.a;
import com.bilibili.studio.editor.moudle.intelligence.vm.e;
import com.bilibili.studio.editor.moudle.intelligence.vm.j;
import com.bilibili.studio.editor.moudle.intelligence.vm.logic.A;
import com.bilibili.studio.editor.moudle.intelligence.vm.logic.C6571h;
import com.bilibili.studio.editor.moudle.intelligence.vm.logic.C6581s;
import com.bilibili.studio.editor.moudle.intelligence.vm.logic.C6582t;
import com.bilibili.studio.editor.moudle.intelligence.vm.logic.I;
import com.bilibili.studio.editor.moudle.intelligence.vm.logic.IntelligenceModDownloadLogic;
import com.bilibili.studio.editor.moudle.intelligence.vm.logic.N;
import com.bilibili.studio.editor.moudle.intelligence.vm.logic.T;
import com.bilibili.studio.editor.moudle.intelligence.vm.logic.y;
import com.bilibili.studio.editor.moudle.music.manager.musicrec.MaterialLabelError;
import com.bilibili.studio.editor.moudle.templatev2.bean.EditorTemplateTabItemBean;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bvc.bilimusicrmdjni.BLMobileMusicRecommender;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q4.M;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/j.class */
public final class j extends com.bilibili.studio.editor.moudle.intelligence.vm.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Yv0.e f107632b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public y f107634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public I f107635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public A f107636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public C6571h f107637g;

    @Nullable
    public T h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public C6582t f107638i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public N f107639j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f107642m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f107643n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f107644o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile boolean f107645p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile boolean f107646q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile int f107647r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public List<FileFrameResult> f107648s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public com.bilibili.studio.editor.moudle.home.presenter.k f107652w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f107653x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public String f107654y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public MaterialLabelError f107655z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final IntelligenceModDownloadLogic f107633c = new IntelligenceModDownloadLogic();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public String f107640k = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public String f107641l = "";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f107649t = new AtomicBoolean(false);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final yz0.a f107650u = new Object();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f107651v = new AtomicBoolean(false);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/j$a.class */
    public static final class a implements T.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f107656a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f107657b;

        public a(j jVar, boolean z6) {
            this.f107656a = jVar;
            this.f107657b = z6;
        }

        @Override // com.bilibili.studio.editor.moudle.intelligence.vm.logic.T.a
        public final void a(IntelligenceTemplateInfo intelligenceTemplateInfo, EditorTemplateTabItemBean editorTemplateTabItemBean, long j7) {
            j jVar = this.f107656a;
            jVar.getClass();
            j.g("[智能成片][默认模板] 下载模板成功，耗时=" + j7 + ", " + intelligenceTemplateInfo);
            if (!this.f107657b) {
                jVar.m(intelligenceTemplateInfo, editorTemplateTabItemBean);
                return;
            }
            N n7 = jVar.f107639j;
            if (n7 != null) {
                C6582t c6582t = jVar.f107638i;
                n7.f107745i = intelligenceTemplateInfo;
                n7.f107746j = editorTemplateTabItemBean;
                n7.f107747k = c6582t;
            }
            jVar.j();
        }

        @Override // com.bilibili.studio.editor.moudle.intelligence.vm.logic.T.a
        public final void b(long j7, String str) {
            String strB = androidx.compose.ui.input.pointer.k.b(j7, "[智能成片][默认模板] 下载失败，耗时=", ",原因=", str);
            j jVar = this.f107656a;
            jVar.getClass();
            j.g(strB);
            if (this.f107657b) {
                jVar.j();
            } else {
                jVar.m(null, null);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/j$b.class */
    public static final class b implements T.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f107658a;

        public b(j jVar) {
            this.f107658a = jVar;
        }

        @Override // com.bilibili.studio.editor.moudle.intelligence.vm.logic.T.a
        public final void a(IntelligenceTemplateInfo intelligenceTemplateInfo, EditorTemplateTabItemBean editorTemplateTabItemBean, long j7) {
            j jVar = this.f107658a;
            jVar.getClass();
            j.g("[智能成片][智能模板] 标签下载模板成功，耗时=" + j7 + ", " + intelligenceTemplateInfo);
            jVar.m(intelligenceTemplateInfo, editorTemplateTabItemBean);
        }

        @Override // com.bilibili.studio.editor.moudle.intelligence.vm.logic.T.a
        public final void b(long j7, String str) {
            String strB = androidx.compose.ui.input.pointer.k.b(j7, "[智能成片][智能模板] 标签下载模板失败，耗时=", "，原因=", str);
            j jVar = this.f107658a;
            jVar.getClass();
            j.g(strB);
            if (jVar.f107651v.get()) {
                j.g("[智能成片][智能模板] 已经走过超时兜底模板，不再走兜底下载了");
            } else {
                jVar.c(false);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/j$c.class */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f107659a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<FileFrameResult> f107660b;

        public c(j jVar, List<FileFrameResult> list) {
            this.f107659a = jVar;
            this.f107660b = list;
        }

        public final void a(long j7) {
            String strA = androidx.compose.ui.input.pointer.k.a(j7, "[智能成片][画面识别] 失败,耗时=", ",原因：画面标签为空");
            j jVar = this.f107659a;
            jVar.getClass();
            j.g(strA);
            MaterialLabelError materialLabelError = MaterialLabelError.ERROR_SDK_REC;
            jVar.d("", materialLabelError);
            yz0.a aVar = jVar.f107650u;
            aVar.a = true;
            aVar.g = materialLabelError;
            aVar.a();
            jVar.i();
        }

        public final void b(long j7, String str) {
            String strB = androidx.compose.ui.input.pointer.k.b(j7, "[智能成片][画面识别] 成功,耗时=", ",画面标签=", str);
            j jVar = this.f107659a;
            jVar.getClass();
            j.g(strB);
            List<FileFrameResult> list = this.f107660b;
            HashMap map = new HashMap();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Map<String, String> map2 = ((FileFrameResult) it.next()).tagResult;
                if (map2 != null) {
                    map.putAll(map2);
                }
            }
            N n7 = jVar.f107639j;
            if (n7 != null) {
                n7.f107748l = str;
            }
            if (n7 != null) {
                n7.f107749m = map;
            }
            jVar.d(str, MaterialLabelError.SUCCESS_READY);
            yz0.a aVar = jVar.f107650u;
            aVar.a = true;
            aVar.f = str;
            aVar.a();
            jVar.i();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/j$d.class */
    public static final class d implements N.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f107661a;

        public d(j jVar) {
            this.f107661a = jVar;
        }

        @Override // com.bilibili.studio.editor.moudle.intelligence.vm.logic.N.a
        public final void a(EditVideoInfo editVideoInfo, boolean z6, long j7) {
            String strA = com.bilibili.ad.adview.pegasus.holders.inline.pegasus.g.a(j7, "[智能成片][项目生成] 结束，耗时=", ", 结果=", z6);
            j jVar = this.f107661a;
            jVar.getClass();
            j.g(strA);
            a.InterfaceC1197a interfaceC1197a = jVar.f107602a;
            if (interfaceC1197a != null) {
                interfaceC1197a.a(editVideoInfo, z6);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/j$e.class */
    public static final class e implements N.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f107662a;

        public e(j jVar) {
            this.f107662a = jVar;
        }

        @Override // com.bilibili.studio.editor.moudle.intelligence.vm.logic.N.a
        public final void a(EditVideoInfo editVideoInfo, boolean z6, long j7) {
            String strA = com.bilibili.ad.adview.pegasus.holders.inline.pegasus.g.a(j7, "[智能成片][项目生成] 结束，耗时=", ", 结果=", z6);
            j jVar = this.f107662a;
            jVar.getClass();
            j.g(strA);
            a.InterfaceC1197a interfaceC1197a = jVar.f107602a;
            if (interfaceC1197a != null) {
                interfaceC1197a.a(editVideoInfo, z6);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/j$f.class */
    public static final class f implements N.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f107663a;

        public f(j jVar) {
            this.f107663a = jVar;
        }

        @Override // com.bilibili.studio.editor.moudle.intelligence.vm.logic.N.a
        public final void a(EditVideoInfo editVideoInfo, boolean z6, long j7) {
            String strA = com.bilibili.ad.adview.pegasus.holders.inline.pegasus.g.a(j7, "[智能成片][项目生成] 结束，耗时=", ", 结果=", z6);
            j jVar = this.f107663a;
            jVar.getClass();
            j.g(strA);
            a.InterfaceC1197a interfaceC1197a = jVar.f107602a;
            if (interfaceC1197a != null) {
                interfaceC1197a.a(editVideoInfo, z6);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/j$g.class */
    public static final class g implements N.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f107664a;

        public g(j jVar) {
            this.f107664a = jVar;
        }

        @Override // com.bilibili.studio.editor.moudle.intelligence.vm.logic.N.a
        public final void a(EditVideoInfo editVideoInfo, boolean z6, long j7) {
            String strA = com.bilibili.ad.adview.pegasus.holders.inline.pegasus.g.a(j7, "[智能成片][项目生成] 结束，耗时=", ", 结果=", z6);
            j jVar = this.f107664a;
            jVar.getClass();
            j.g(strA);
            a.InterfaceC1197a interfaceC1197a = jVar.f107602a;
            if (interfaceC1197a != null) {
                interfaceC1197a.a(editVideoInfo, z6);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, yz0.a] */
    public j(@NotNull Yv0.e eVar) {
        this.f107632b = eVar;
    }

    public static final void a(j jVar, List list) {
        jVar.getClass();
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            MaterialLabelError materialLabelError = MaterialLabelError.ERROR_FRAME_EMPTY;
            jVar.d("", materialLabelError);
            yz0.a aVar = jVar.f107650u;
            aVar.c = true;
            aVar.j = null;
            aVar.a = true;
            aVar.g = materialLabelError;
            aVar.a();
            jVar.i();
            return;
        }
        if (jVar.f107647r == 0) {
            jVar.f107648s = arrayList;
            return;
        }
        if (jVar.f107647r == 2) {
            g("[智能成片][画面识别] 失败 mod下载失败");
            MaterialLabelError materialLabelError2 = MaterialLabelError.ERROR_MOD_DOWNLOAD;
            jVar.d("", materialLabelError2);
            yz0.a aVar2 = jVar.f107650u;
            aVar2.a = true;
            aVar2.g = materialLabelError2;
            aVar2.a();
            jVar.i();
            return;
        }
        if (jVar.f107645p) {
            jVar.h(arrayList);
            return;
        }
        com.bilibili.studio.comm.manager.j jVarB = jVar.f107633c.b();
        if (!jVarB.a()) {
            g("[智能成片][画面识别] 失败 mod路径获取失败");
            MaterialLabelError materialLabelError3 = MaterialLabelError.ERROR_MOD_DIR;
            jVar.d("", materialLabelError3);
            yz0.a aVar3 = jVar.f107650u;
            aVar3.a = true;
            aVar3.g = materialLabelError3;
            aVar3.a();
            jVar.i();
            return;
        }
        if (jVar.f(jVarB)) {
            jVar.h(arrayList);
            return;
        }
        g("[智能成片][画面识别] 失败 SDK初始化失败");
        MaterialLabelError materialLabelError4 = MaterialLabelError.ERROR_SDK_INIT;
        jVar.d("", materialLabelError4);
        yz0.a aVar4 = jVar.f107650u;
        aVar4.a = true;
        aVar4.g = materialLabelError4;
        aVar4.a();
        jVar.i();
    }

    public static void g(String str) {
        BLog.e("intelligence_tag", str);
    }

    public final void b() {
        A a7 = this.f107636f;
        if (a7 != null) {
            a7.f130976c = true;
        }
        I i7 = this.f107635e;
        if (i7 != null) {
            i7.f130976c = true;
        }
        C6571h c6571h = this.f107637g;
        if (c6571h != null) {
            c6571h.f130976c = true;
        }
        N n7 = this.f107639j;
        if (n7 != null) {
            n7.f130976c = true;
        }
        T t7 = this.h;
        if (t7 != null) {
            t7.f130976c = true;
        }
        this.f107650u.e = null;
    }

    public final boolean c(boolean z6) {
        IntelligenceDefaultTemplateBean intelligenceDefaultTemplateBeanB;
        Lazy<com.bilibili.studio.editor.moudle.intelligence.vm.e> lazy = com.bilibili.studio.editor.moudle.intelligence.vm.e.f107608g;
        com.bilibili.studio.editor.moudle.intelligence.vm.e eVarA = e.a.a();
        if (((ArrayList) eVarA.f107610b).isEmpty()) {
            BLog.e("intelligence_tag", "[默认模板][后台下载] getDefaultTemplate 当前没有下载完成的模板 ");
            intelligenceDefaultTemplateBeanB = null;
        } else if (((ArrayList) eVarA.f107610b).size() == 1) {
            intelligenceDefaultTemplateBeanB = (IntelligenceDefaultTemplateBean) ((ArrayList) eVarA.f107610b).get(0);
        } else if (TextUtils.isEmpty(eVarA.f107614f)) {
            intelligenceDefaultTemplateBeanB = com.bilibili.studio.editor.moudle.intelligence.vm.e.b(eVarA.f107610b);
            eVarA.c(intelligenceDefaultTemplateBeanB.templateId);
        } else {
            List<IntelligenceDefaultTemplateBean> list = eVarA.f107610b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : (ArrayList) list) {
                if (!Intrinsics.areEqual(eVarA.f107614f, ((IntelligenceDefaultTemplateBean) obj).templateId)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                intelligenceDefaultTemplateBeanB = com.bilibili.studio.editor.moudle.intelligence.vm.e.b(eVarA.f107610b);
                eVarA.c(intelligenceDefaultTemplateBeanB.templateId);
            } else {
                intelligenceDefaultTemplateBeanB = com.bilibili.studio.editor.moudle.intelligence.vm.e.b(arrayList);
                eVarA.c(intelligenceDefaultTemplateBeanB.templateId);
            }
        }
        g("[智能成片][默认模板] 尝试使用默认模板 templateId=" + (intelligenceDefaultTemplateBeanB != null ? intelligenceDefaultTemplateBeanB.templateId : null));
        if (intelligenceDefaultTemplateBeanB == null) {
            g("[智能成片][默认模板] 默认模板为空，失败了啊");
            if (z6) {
                j();
                return false;
            }
            m(null, null);
            return false;
        }
        T t7 = this.h;
        if (t7 != null) {
            t7.f130976c = true;
        }
        C6582t c6582t = this.f107638i;
        if (c6582t == null) {
            return true;
        }
        a aVar = new a(this, z6);
        long jCurrentTimeMillis = System.currentTimeMillis();
        c6582t.f107772j = z6;
        c6582t.h = "default";
        C6581s.f107859d = 0L;
        c6582t.i(intelligenceDefaultTemplateBeanB.templateTabItemBean, 2, null, intelligenceDefaultTemplateBeanB.downloadUrl, jCurrentTimeMillis, aVar, null, null);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.lang.String r11, com.bilibili.studio.editor.moudle.music.manager.musicrec.MaterialLabelError r12) {
        /*
            Method dump skipped, instruction units count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.intelligence.vm.j.d(java.lang.String, com.bilibili.studio.editor.moudle.music.manager.musicrec.MaterialLabelError):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String e() {
        /*
            r2 = this;
            r0 = r2
            com.bilibili.studio.editor.moudle.intelligence.vm.logic.t r0 = r0.f107638i
            r3 = r0
            r0 = 0
            r5 = r0
            r0 = r3
            if (r0 == 0) goto L13
            r0 = r3
            java.lang.String r0 = r0.h
            r4 = r0
            goto L15
        L13:
            r0 = 0
            r4 = r0
        L15:
            r0 = r4
            if (r0 == 0) goto L24
            r0 = r4
            r3 = r0
            r0 = r4
            int r0 = r0.length()
            if (r0 != 0) goto L34
        L24:
            r0 = r2
            com.bilibili.studio.editor.moudle.intelligence.vm.logic.T r0 = r0.h
            r4 = r0
            r0 = r5
            r3 = r0
            r0 = r4
            if (r0 == 0) goto L34
            r0 = r4
            java.lang.String r0 = r0.h
            r3 = r0
        L34:
            r0 = r3
            r4 = r0
            r0 = r3
            if (r0 != 0) goto L3d
            java.lang.String r0 = ""
            r4 = r0
        L3d:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.intelligence.vm.j.e():java.lang.String");
    }

    public final boolean f(com.bilibili.studio.comm.manager.j jVar) {
        A a7 = this.f107636f;
        Boolean boolValueOf = null;
        if (a7 != null) {
            boolean z6 = true;
            if (!a7.f107669e) {
                String str = jVar.f105404a;
                xz0.a aVar = a7.f107668d;
                if (aVar.e(str) == 0) {
                    BLMobileMusicRecommender bLMobileMusicRecommender = aVar.a;
                    String version = null;
                    if (bLMobileMusicRecommender != null) {
                        version = bLMobileMusicRecommender.getVersion();
                    }
                    M.b("SDK初始化成功 result=", version, "ImageRecognitionLogic");
                    aVar.b(jVar.f105405b);
                    a7.f107669e = true;
                } else {
                    z6 = false;
                }
            }
            boolValueOf = Boolean.valueOf(z6);
        }
        return Intrinsics.areEqual(boolValueOf, Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(java.util.List<com.bilibili.studio.editor.moudle.intelligence.data.FileFrameResult> r12) {
        /*
            Method dump skipped, instruction units count: 557
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.intelligence.vm.j.h(java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i() {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.intelligence.vm.j.i():void");
    }

    public final void j() {
        int i7;
        String str;
        if (this.f107649t.get()) {
            g("[智能成片][项目生成] 不再重复执行");
            return;
        }
        this.f107649t.set(true);
        zz0.b bVar = zz0.b.a;
        String strE = e();
        C6582t c6582t = this.f107638i;
        int i8 = c6582t != null ? c6582t.f107771i : 0;
        int i9 = i8;
        if (i8 == 0) {
            T t7 = this.h;
            i9 = t7 != null ? t7.f107771i : 0;
        }
        synchronized (bVar) {
            if (Intrinsics.areEqual(zz0.b.c, "start")) {
                zz0.b.c = "timeout";
                for (Map.Entry entry : zz0.b.b.entrySet()) {
                    if (Intrinsics.areEqual(entry.getKey(), "download_template")) {
                        str = strE;
                        i7 = i9;
                    } else if (Intrinsics.areEqual(entry.getKey(), "download_template")) {
                        str = strE;
                        i7 = 0;
                    } else {
                        i7 = 0;
                        str = "";
                    }
                    Xz0.d.i(Xz0.d.f28458a, zz0.b.d, (String) entry.getKey(), System.currentTimeMillis() - ((Number) entry.getValue()).longValue(), "timeout", "超时", i7, str);
                }
                zz0.b.b.clear();
            } else {
                zz0.b.c(zz0.b.d, "超时状态异常");
            }
        }
        a.InterfaceC1197a interfaceC1197a = this.f107602a;
        if (interfaceC1197a != null) {
            interfaceC1197a.b("step_project_gen");
        }
        N n7 = this.f107639j;
        if (n7 != null) {
            d dVar = new d(this);
            synchronized (n7) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (!n7.f107751o) {
                    n7.f107751o = true;
                    if (n7.f130974a != null) {
                        if (n7.d()) {
                            dVar.a(n7.f130974a, false, 0L);
                        } else {
                            n7.e(dVar, jCurrentTimeMillis);
                        }
                    }
                }
            }
        }
    }

    public final void k(IntelligenceAudioConfig intelligenceAudioConfig, List<CaptionRecognition> list) {
        g("[智能成片][项目生成][ASR识别后] 开始");
        a.InterfaceC1197a interfaceC1197a = this.f107602a;
        if (interfaceC1197a != null) {
            interfaceC1197a.b("step_project_gen");
        }
        N n7 = this.f107639j;
        if (n7 != null) {
            e eVar = new e(this);
            synchronized (n7) {
                n7.f107741d |= 8;
                n7.f107744g = intelligenceAudioConfig;
                n7.h = list;
                if (!(n7.f107741d == 15)) {
                    BLog.e("IntelligenceProjectLogic", "startProjectGenByASR fail state=" + n7.f107741d);
                } else if (n7.f130976c) {
                    BLog.e("IntelligenceProjectLogic", "startProjectGenByASR isCanceled");
                } else {
                    n7.g(eVar);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.studio.editor.moudle.intelligence.vm.i] */
    public final void l(IntelligenceMusicInfo intelligenceMusicInfo, List<String> list) {
        final int i7 = 0;
        ?? r02 = new Runnable(this, i7) { // from class: com.bilibili.studio.editor.moudle.intelligence.vm.i

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f107630a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f107631b;

            {
                this.f107630a = i7;
                this.f107631b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (this.f107630a) {
                    case 0:
                        j jVar = (j) this.f107631b;
                        yz0.a aVar = jVar.f107650u;
                        IntelligenceMusicInfo intelligenceMusicInfo2 = aVar.h;
                        List<String> list2 = aVar.i;
                        j.g("[智能成片][项目生成][音乐下载后] 开始");
                        a.InterfaceC1197a interfaceC1197a = jVar.f107602a;
                        if (interfaceC1197a != null) {
                            interfaceC1197a.b("step_project_gen");
                        }
                        N n7 = jVar.f107639j;
                        if (n7 != null) {
                            j.f fVar = new j.f(jVar);
                            synchronized (n7) {
                                n7.f107741d |= 2;
                                n7.f107742e = intelligenceMusicInfo2;
                                n7.f107743f = list2;
                                if (!(n7.f107741d == 15)) {
                                    BLog.e("IntelligenceProjectLogic", "startProjectGenByMusic fail state=" + n7.f107741d);
                                } else if (n7.f130976c) {
                                    BLog.e("IntelligenceProjectLogic", "startProjectGenByMusic isCanceled");
                                } else {
                                    n7.g(fVar);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        gD.a aVar2 = (gD.a) this.f107631b;
                        aVar2.c = false;
                        HandlerThreads.remove(0, aVar2.a);
                        Function0 function0 = aVar2.b;
                        if (function0 != null) {
                            function0.invoke();
                        }
                        aVar2.e = 0;
                        return;
                }
            }
        };
        yz0.a aVar = this.f107650u;
        aVar.h = intelligenceMusicInfo;
        aVar.i = list;
        aVar.b = true;
        aVar.e = r02;
        aVar.a();
    }

    public final void m(IntelligenceTemplateInfo intelligenceTemplateInfo, EditorTemplateTabItemBean editorTemplateTabItemBean) {
        g("[智能成片][项目生成][模板下载后] 开始");
        a.InterfaceC1197a interfaceC1197a = this.f107602a;
        if (interfaceC1197a != null) {
            interfaceC1197a.b("step_project_gen");
        }
        N n7 = this.f107639j;
        if (n7 != null) {
            T t7 = this.h;
            g gVar = new g(this);
            synchronized (n7) {
                n7.f107741d |= 4;
                n7.f107745i = intelligenceTemplateInfo;
                n7.f107746j = editorTemplateTabItemBean;
                n7.f107747k = t7;
                if (!(n7.f107741d == 15)) {
                    BLog.e("IntelligenceProjectLogic", "startProjectGenByConfig fail state=" + n7.f107741d);
                } else if (n7.f130976c) {
                    BLog.e("IntelligenceProjectLogic", "startProjectGenByConfig isCanceled");
                } else {
                    n7.g(gVar);
                }
            }
        }
    }
}
