package com.bilibili.studio.editor.moudle.templatev2.vm;

import VC0.C2926b;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import c6.Q;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.category.Z;
import com.bilibili.studio.editor.moudle.intelligence.data.IntelligenceAudioConfig;
import com.bilibili.studio.editor.moudle.intelligence.data.IntelligenceMusicInfo;
import com.bilibili.studio.editor.moudle.intelligence.data.IntelligenceTemplateInfo;
import com.bilibili.studio.editor.moudle.templatev2.bean.EditorTemplateTabItemBean;
import com.bilibili.studio.videoeditor.bean.BClip;
import com.bilibili.studio.videoeditor.bgm.Bgm;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoIntelligenceInfo;
import com.bilibili.studio.videoeditor.editor.editdata.EditorEnterInfo;
import com.bilibili.studio.videoeditor.pb.PbTemplateEngine;
import com.bilibili.studio.videoeditor.template.BiliTemplateEngineManager;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/templatev2/vm/e.class */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LifecycleCoroutineScope f108164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PbTemplateEngine f108165b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<c> f108166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final SharedFlow<c> f108167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public volatile EditorTemplateTabItemBean f108168e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/templatev2/vm/e$a.class */
    public static final class a extends c {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/templatev2/vm/e$b.class */
    public static final class b extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f108169b;

        public b(@NotNull EditorTemplateTabItemBean editorTemplateTabItemBean, @NotNull String str) {
            super(editorTemplateTabItemBean);
            this.f108169b = str;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/templatev2/vm/e$c.class */
    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final EditorTemplateTabItemBean f108170a;

        public c(EditorTemplateTabItemBean editorTemplateTabItemBean) {
            this.f108170a = editorTemplateTabItemBean;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/templatev2/vm/e$d.class */
    public static final class d extends c {
    }

    /* JADX INFO: renamed from: com.bilibili.studio.editor.moudle.templatev2.vm.e$e, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/templatev2/vm/e$e.class */
    public static final class C1199e extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final EditVideoInfo f108171b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f108172c;

        public C1199e(@NotNull EditorTemplateTabItemBean editorTemplateTabItemBean, @NotNull EditVideoInfo editVideoInfo, long j7) {
            super(editorTemplateTabItemBean);
            this.f108171b = editVideoInfo;
            this.f108172c = j7;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/templatev2/vm/e$f.class */
    public static final class f implements C2926b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f108173a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f108174b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Activity f108175c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final EditVideoIntelligenceInfo f108176d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f108177e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final EditVideoInfo f108178f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final BiliTemplateEngineManager f108179g;
        public final int h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final EditorTemplateTabItemBean f108180i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Function3<Integer, EditorTemplateTabItemBean, String, Unit> f108181j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final Function3<Integer, EditVideoInfo, EditorTemplateTabItemBean, Unit> f108182k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Function2<Integer, EditorTemplateTabItemBean, Unit> f108183l;

        /* JADX WARN: Multi-variable type inference failed */
        public f(int i7, e eVar, Activity activity, EditVideoIntelligenceInfo editVideoIntelligenceInfo, int i8, EditVideoInfo editVideoInfo, BiliTemplateEngineManager biliTemplateEngineManager, int i9, EditorTemplateTabItemBean editorTemplateTabItemBean, Function3<? super Integer, ? super EditorTemplateTabItemBean, ? super String, Unit> function3, Function3<? super Integer, ? super EditVideoInfo, ? super EditorTemplateTabItemBean, Unit> function32, Function2<? super Integer, ? super EditorTemplateTabItemBean, Unit> function2) {
            this.f108173a = i7;
            this.f108174b = eVar;
            this.f108175c = activity;
            this.f108176d = editVideoIntelligenceInfo;
            this.f108177e = i8;
            this.f108178f = editVideoInfo;
            this.f108179g = biliTemplateEngineManager;
            this.h = i9;
            this.f108180i = editorTemplateTabItemBean;
            this.f108181j = function3;
            this.f108182k = function32;
            this.f108183l = function2;
        }

        @Override // VC0.C2926b.a
        public final void a(EditorTemplateTabItemBean editorTemplateTabItemBean) {
            Z.b(this.f108173a, "BiliEditorTemplateDownloader", new StringBuilder("智能成片-模板切换[单次] 取消 retryCount="));
            int i7 = this.h;
            this.f108183l.invoke(Integer.valueOf(i7), this.f108180i);
        }

        @Override // VC0.C2926b.a
        public final void b(EditVideoInfo editVideoInfo, EditorTemplateTabItemBean editorTemplateTabItemBean) {
            Z.b(this.f108173a, "BiliEditorTemplateDownloader", new StringBuilder("智能成片-模板切换[单次] 成功 retryCount="));
            int i7 = this.h;
            this.f108182k.invoke(Integer.valueOf(i7), editVideoInfo, this.f108180i);
        }

        @Override // VC0.C2926b.a
        public final void c(EditorTemplateTabItemBean editorTemplateTabItemBean, String str) {
            Z.b(this.f108173a, "BiliEditorTemplateDownloader", new StringBuilder("智能成片-模板切换[单次] 失败，开始重试 retryCount="));
            this.f108174b.c(this.f108175c, this.f108176d, this.f108177e, this.f108178f, this.f108179g, this.h, this.f108180i, this.f108181j, this.f108182k, this.f108183l);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.bilibili.studio.videoeditor.pb.PbTemplateEngine, java.lang.Object] */
    public e(@NotNull LifecycleCoroutineScope lifecycleCoroutineScope) {
        this.f108164a = lifecycleCoroutineScope;
        MutableStateFlow<c> MutableStateFlow = StateFlowKt.MutableStateFlow((Object) null);
        this.f108166c = MutableStateFlow;
        this.f108167d = FlowKt.asSharedFlow(MutableStateFlow);
    }

    public static final void a(e eVar, EditVideoInfo editVideoInfo, EditVideoIntelligenceInfo editVideoIntelligenceInfo) {
        eVar.getClass();
        IntelligenceTemplateInfo intelligenceTemplateInfo = editVideoIntelligenceInfo.templateInfo;
        if ((intelligenceTemplateInfo != null ? intelligenceTemplateInfo.pbBgm : null) != null) {
            BLog.e("BiliEditorTemplateDownloader", "切换推荐模板时，若已使用智能成片流程的关联音乐，则不需要重新配乐");
            return;
        }
        IntelligenceMusicInfo intelligenceMusicInfo = editVideoIntelligenceInfo.musicInfo;
        if (intelligenceMusicInfo != null) {
            IntelligenceAudioConfig intelligenceAudioConfig = editVideoIntelligenceInfo.audioConfig;
            if (intelligenceAudioConfig == null || intelligenceAudioConfig.autoBgm) {
                BLog.d("BiliMusicRhythmPointEngine", "reDoBgMusic");
                List<BClip> userTrackBClipList = editVideoInfo.getUserTrackBClipList();
                long outPoint = 0;
                long j7 = 0;
                if (userTrackBClipList != null) {
                    Iterator<T> it = userTrackBClipList.iterator();
                    while (true) {
                        j7 = outPoint;
                        if (!it.hasNext()) {
                            break;
                        }
                        BClip bClip = (BClip) it.next();
                        outPoint += bClip.getOutPoint() - bClip.getInPoint();
                    }
                }
                Bz0.a.a(editVideoInfo, intelligenceMusicInfo.localPath, intelligenceMusicInfo, Bz0.a.b(j7, Bz0.a.f(intelligenceMusicInfo)));
                editVideoInfo.setIsEdited(true);
            }
        }
    }

    public final void b(EditorTemplateTabItemBean editorTemplateTabItemBean, int i7) {
        if (editorTemplateTabItemBean != null) {
            editorTemplateTabItemBean.downloadState = i7;
        }
        if (i7 == 3) {
            EditorTemplateTabItemBean editorTemplateTabItemBean2 = this.f108168e;
            if (editorTemplateTabItemBean2 != null) {
                editorTemplateTabItemBean2.downloadState = 5;
            }
            this.f108168e = editorTemplateTabItemBean;
        }
    }

    public final void c(Activity activity, EditVideoIntelligenceInfo editVideoIntelligenceInfo, int i7, EditVideoInfo editVideoInfo, BiliTemplateEngineManager biliTemplateEngineManager, int i8, EditorTemplateTabItemBean editorTemplateTabItemBean, Function3<? super Integer, ? super EditorTemplateTabItemBean, ? super String, Unit> function3, Function3<? super Integer, ? super EditVideoInfo, ? super EditorTemplateTabItemBean, Unit> function32, Function2<? super Integer, ? super EditorTemplateTabItemBean, Unit> function2) {
        IntelligenceTemplateInfo intelligenceTemplateInfo;
        int i9 = i8 + 1;
        if (i9 > 3) {
            function3.invoke(Integer.valueOf(i9), editorTemplateTabItemBean, "retryCount > 3");
            return;
        }
        if (activity.isDestroyed()) {
            function3.invoke(Integer.valueOf(i9), editorTemplateTabItemBean, "context.isDestroyed");
            return;
        }
        EditorEnterInfo editorEnterInfo = editVideoInfo.getEditorEnterInfo();
        int videoCount = editorEnterInfo != null ? editorEnterInfo.getVideoCount() : i7;
        boolean z6 = editVideoIntelligenceInfo != null;
        Integer numValueOf = null;
        Bgm bgm = (editVideoIntelligenceInfo == null || (intelligenceTemplateInfo = editVideoIntelligenceInfo.templateInfo) == null) ? null : intelligenceTemplateInfo.pbBgm;
        PbTemplateEngine.Scene scene = z6 ? PbTemplateEngine.Scene.SWITCH_REC_TEMPLATE : PbTemplateEngine.Scene.SWITCH_TEMPLATE;
        if (editorEnterInfo != null) {
            numValueOf = Integer.valueOf(editorEnterInfo.getVideoCount());
        }
        String des = scene.getDes();
        StringBuilder sbA = z4.c.a(i8, "智能成片-模板切换[单次] 开始下载 retryCount=", ",isIntelligence=", ",useVideoCount=", z6);
        sbA.append(videoCount);
        sbA.append(",videoCount=");
        sbA.append(numValueOf);
        sbA.append(", scene=");
        sbA.append(des);
        BLog.i("BiliEditorTemplateDownloader", sbA.toString());
        PbTemplateEngine.a aVar = new PbTemplateEngine.a();
        aVar.f109863a = editVideoInfo;
        aVar.f109864b = editorTemplateTabItemBean;
        aVar.f109868f = z6;
        aVar.f109869g = videoCount;
        aVar.f109874m = bgm;
        aVar.f109876o = scene;
        this.f108165b.c(activity, biliTemplateEngineManager, aVar, new f(i8, this, activity, editVideoIntelligenceInfo, i7, editVideoInfo, biliTemplateEngineManager, i9, editorTemplateTabItemBean, function3, function32, function2));
    }

    public final void d(@Nullable FragmentActivity fragmentActivity, @Nullable EditVideoInfo editVideoInfo, @NotNull EditorTemplateTabItemBean editorTemplateTabItemBean, @Nullable BiliTemplateEngineManager biliTemplateEngineManager) {
        b(editorTemplateTabItemBean, 3);
        long jCurrentTimeMillis = System.currentTimeMillis();
        c cVar = new c(editorTemplateTabItemBean);
        MutableStateFlow<c> mutableStateFlow = this.f108166c;
        mutableStateFlow.tryEmit(cVar);
        EditVideoIntelligenceInfo intelligenceInfo = editVideoInfo != null ? editVideoInfo.getIntelligenceInfo() : null;
        Y0.c.c("switchRecommendTemplate templateItem=", "BiliEditorTemplateDownloader", editorTemplateTabItemBean.isValid());
        if (fragmentActivity != null && intelligenceInfo != null && biliTemplateEngineManager != null) {
            BuildersKt.launch$default(this.f108164a, Dispatchers.getIO(), (CoroutineStart) null, new BiliEditorTemplateDownloader$switchRecommendTemplate$1(editorTemplateTabItemBean, this, fragmentActivity, intelligenceInfo, editVideoInfo, biliTemplateEngineManager, jCurrentTimeMillis, null), 2, (Object) null);
            return;
        }
        b(editorTemplateTabItemBean, 5);
        boolean z6 = false;
        boolean z7 = fragmentActivity == null;
        boolean z8 = intelligenceInfo == null;
        if (biliTemplateEngineManager == null) {
            z6 = true;
        }
        StringBuilder sbA = Q.a("invalid param : ", ", ", ", ", z7, z8);
        sbA.append(z6);
        mutableStateFlow.tryEmit(new b(editorTemplateTabItemBean, sbA.toString()));
    }
}
