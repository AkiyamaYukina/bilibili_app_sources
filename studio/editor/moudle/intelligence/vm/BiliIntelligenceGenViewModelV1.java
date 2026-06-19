package com.bilibili.studio.editor.moudle.intelligence.vm;

import F3.C1692b;
import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.sharewrapper.basic.ThirdPartyExtraBuilder;
import com.bilibili.studio.editor.moudle.intelligence.data.IntelligenceAudioConfig;
import com.bilibili.studio.editor.moudle.intelligence.data.IntelligenceEnterResult;
import com.bilibili.studio.editor.moudle.intelligence.vm.a;
import com.bilibili.studio.editor.moudle.intelligence.vm.logic.A;
import com.bilibili.studio.editor.moudle.intelligence.vm.logic.C6571h;
import com.bilibili.studio.editor.moudle.intelligence.vm.logic.C6582t;
import com.bilibili.studio.editor.moudle.intelligence.vm.logic.I;
import com.bilibili.studio.editor.moudle.intelligence.vm.logic.N;
import com.bilibili.studio.editor.moudle.intelligence.vm.logic.T;
import com.bilibili.studio.module.tuwen.PublicTempDef;
import com.bilibili.studio.module.tuwen.model.PbMaterialError;
import com.bilibili.studio.module.tuwen.model.PbTemplateResult;
import com.bilibili.studio.videoeditor.bean.BClip;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoClip;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfoUtils;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoIntelligenceInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import tv.danmaku.android.log.BLog;
import zz0.C9270a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/BiliIntelligenceGenViewModelV1.class */
public class BiliIntelligenceGenViewModelV1 extends Yv0.c {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public static final Integer[] f107581v = {0, 20, 40, 60, 65, 70, 75, 80, 85, 90, 93, 95, 97, 98, 100};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public EditVideoInfo f107582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public IntelligenceEnterResult f107583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f107584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f107585f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f107586g;
    public long h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f107587i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f107588j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f107589k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f107590l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public String f107591m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public String f107592n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f107593o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final j f107594p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f107595q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<String> f107596r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public Job f107597s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public Job f107598t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f107599u;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/BiliIntelligenceGenViewModelV1$a.class */
    public static final class a implements a.InterfaceC1197a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f107600a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f107601b;

        public a(b bVar, long j7) {
            this.f107600a = bVar;
            this.f107601b = j7;
        }

        @Override // com.bilibili.studio.editor.moudle.intelligence.vm.a.InterfaceC1197a
        public final void a(EditVideoInfo editVideoInfo, boolean z6) {
            String strA = com.bilibili.ad.adview.pegasus.holders.inline.pegasus.g.a(System.currentTimeMillis() - this.f107601b, "[智能成片] 兜底项目生成结束 耗时=", ",生成结果=", z6);
            b bVar = this.f107600a;
            BiliIntelligenceGenViewModelV1.O0(strA);
            if (!z6 || editVideoInfo == null) {
                bVar.f107584e.postValue(Boolean.TRUE);
                bVar.P0("error", "强制生成失败");
            } else {
                bVar.f107582c = editVideoInfo;
                BiliIntelligenceGenViewModelV1.J0(bVar, -1);
                bVar.P0("success", "强制生成成功");
            }
            BiliIntelligenceGenViewModelV1.Q0();
        }

        @Override // com.bilibili.studio.editor.moudle.intelligence.vm.a.InterfaceC1197a
        public final void b(String str) {
            BLog.e("BiliIntelligenceGenViewModelV1", "genProjectAnyway onLogicProgress type=".concat(str));
        }
    }

    public BiliIntelligenceGenViewModelV1(@NotNull Application application) {
        super(application);
        this.f107584e = new MutableLiveData<>();
        this.f107589k = 2;
        this.f107591m = "";
        this.f107592n = "";
        this.f107593o = 2;
        this.f107594p = new j(((Yv0.c) this).b);
        this.f107595q = new MutableLiveData<>();
        this.f107596r = new MutableLiveData<>();
        new MutableLiveData();
        this.f107599u = 10;
    }

    public static final void J0(BiliIntelligenceGenViewModelV1 biliIntelligenceGenViewModelV1, int i7) {
        if (biliIntelligenceGenViewModelV1.f107585f) {
            e9.a.a(i7, " updateProgress step=", " ,return", "BiliIntelligenceGenViewModelV1");
            return;
        }
        BLog.i("BiliIntelligenceGenViewModelV1", " updateProgress isProgressFinish=" + biliIntelligenceGenViewModelV1.f107586g + ",step=" + i7);
        if (biliIntelligenceGenViewModelV1.f107586g) {
            return;
        }
        if (i7 == -1) {
            biliIntelligenceGenViewModelV1.f107586g = true;
        }
        Job job = biliIntelligenceGenViewModelV1.f107598t;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        MutableLiveData<String> mutableLiveData = biliIntelligenceGenViewModelV1.f107596r;
        if (i7 == -1) {
            mutableLiveData.postValue("100%");
        } else {
            Ref.FloatRef floatRef = new Ref.FloatRef();
            Integer[] numArr = f107581v;
            if (((Integer) ArraysKt.getOrNull(numArr, i7)) != null) {
                floatRef.element = r0.intValue();
                Integer num = (Integer) ArraysKt.getOrNull(numArr, i7 + 1);
                if (num != null) {
                    int iIntValue = num.intValue();
                    mutableLiveData.postValue(((int) floatRef.element) + "%");
                    biliIntelligenceGenViewModelV1.f107598t = BuildersKt.launch$default(((Yv0.c) biliIntelligenceGenViewModelV1).b, Dispatchers.getIO(), (CoroutineStart) null, new BiliIntelligenceGenViewModelV1$smoothUpdateProgress$1(33L, floatRef, (((float) iIntValue) - floatRef.element) / ((float) 30), biliIntelligenceGenViewModelV1, null), 2, (Object) null);
                }
            }
        }
        biliIntelligenceGenViewModelV1.f107595q.postValue(Integer.valueOf(i7));
    }

    public static void O0(String str) {
        BLog.e("intelligence_tag", str);
    }

    public static void Q0() {
        List<PbMaterialError> pbMaterialErrorList;
        PbTemplateResult pbTemplateResult = PublicTempDef.INSTANCE.getPbTemplateResult();
        if (pbTemplateResult == null || (pbMaterialErrorList = pbTemplateResult.getPbMaterialErrorList()) == null) {
            return;
        }
        for (PbMaterialError pbMaterialError : pbMaterialErrorList) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("material_id", pbMaterialError.getMaterialId());
            linkedHashMap.put("material_type", pbMaterialError.getMaterialType());
            linkedHashMap.put("err_msg", pbMaterialError.getErrorMsg());
            Neurons.trackT(false, "creation.uper.ai_to_video.material_download_fail.track", linkedHashMap, 1, new AT0.c(8));
        }
    }

    public final void K0() throws JSONException {
        int i7;
        String str;
        j jVar = this.f107594p;
        jVar.getClass();
        zz0.b bVar = zz0.b.a;
        String strE = jVar.e();
        C6582t c6582t = jVar.f107638i;
        int i8 = c6582t != null ? c6582t.f107771i : 0;
        int i9 = i8;
        if (i8 == 0) {
            T t7 = jVar.h;
            i9 = t7 != null ? t7.f107771i : 0;
        }
        synchronized (bVar) {
            if (Intrinsics.areEqual(zz0.b.c, "start")) {
                zz0.b.c = "cancel";
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
                    Xz0.d.i(Xz0.d.f28458a, zz0.b.d, (String) entry.getKey(), System.currentTimeMillis() - ((Number) entry.getValue()).longValue(), "cancel", "用户取消", i7, str);
                }
                zz0.b.b.clear();
            } else {
                zz0.b.c(zz0.b.d, "取消状态异常");
            }
        }
        this.f107594p.b();
        EditVideoInfo editVideoInfo = this.f107582c;
        if (editVideoInfo != null) {
            editVideoInfo.setCancelByUser(true);
        }
        com.bilibili.studio.videoeditor.extension.l.a(this.f107582c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v102, types: [com.bilibili.studio.editor.moudle.intelligence.vm.logic.N, zz0.a] */
    /* JADX WARN: Type inference failed for: r0v105, types: [com.bilibili.studio.editor.moudle.intelligence.vm.logic.T, com.bilibili.studio.editor.moudle.intelligence.vm.logic.t] */
    /* JADX WARN: Type inference failed for: r0v92, types: [com.bilibili.studio.editor.moudle.intelligence.vm.logic.y, zz0.a] */
    public final void L0(@NotNull EditVideoInfo editVideoInfo, @Nullable FragmentActivity fragmentActivity) {
        EditVideoClip userVideoTrack;
        if (editVideoInfo != null) {
            editVideoInfo.putReportData("fast_video", "1");
        }
        this.f107590l = System.currentTimeMillis();
        String strA = ec.a.a(com.bilibili.adcommon.utils.a.a(), System.currentTimeMillis(), "_");
        this.f107592n = strA;
        defpackage.a.b("genPicVideoId ", strA, "BiliIntelligenceGenViewModelV1");
        Xz0.m.f28476a.put(this.f107592n, Long.valueOf(System.currentTimeMillis()));
        zz0.b bVar = zz0.b.a;
        String str = this.f107592n;
        Xz0.d.f28458a.getClass();
        HashMap map = new HashMap();
        map.put("task_id", str);
        map.put("total_cost", "0");
        map.put(ThirdPartyExtraBuilder.KEY_RESULT, "start");
        map.put("error_msg", "");
        Xz0.g.c(map);
        Neurons.trackT(false, "creation.uper.ai_to_video.total_result", map, 1, new C1692b(6));
        synchronized (bVar) {
            zz0.b.b.clear();
            zz0.b.c = "start";
            zz0.b.d = str;
        }
        this.f107582c = editVideoInfo;
        j jVar = this.f107594p;
        String str2 = this.f107592n;
        jVar.getClass();
        j.g("[智能成片][Mod资源] 开始下载");
        jVar.f107633c.c(str2, jVar.f107632b, new k(jVar));
        EditVideoInfo editVideoInfo2 = this.f107582c;
        if (editVideoInfo2 == null || this.f107583d == null) {
            return;
        }
        EditVideoClip userVideoTrack2 = editVideoInfo2.getUserVideoTrack();
        List<BClip> bClipList = userVideoTrack2 != null ? userVideoTrack2.getBClipList() : null;
        if (bClipList == null || bClipList.isEmpty()) {
            List<BClip> listConvertBClipListCopy = EditVideoInfoUtils.convertBClipListCopy(this.f107582c.getSelectVideoList(), new com.bilibili.studio.videoeditor.editor.editdata.a(new ArrayList()));
            EditVideoInfo editVideoInfo3 = this.f107582c;
            if (editVideoInfo3 != null && (userVideoTrack = editVideoInfo3.getUserVideoTrack()) != null) {
                userVideoTrack.setBClipListAndUpdate(listConvertBClipListCopy);
            }
        }
        String strD = Xz0.g.d();
        this.f107591m = strD;
        defpackage.a.b("genUploadId ", strD, "BiliIntelligenceGenViewModelV1");
        j jVar2 = this.f107594p;
        EditVideoInfo editVideoInfoM10450clone = editVideoInfo.m10450clone();
        IntelligenceEnterResult intelligenceEnterResult = this.f107583d;
        String str3 = this.f107592n;
        String str4 = this.f107591m;
        long j7 = this.h;
        boolean z6 = this.f107587i;
        boolean z7 = this.f107588j;
        jVar2.getClass();
        ?? c9270a = new C9270a(editVideoInfoM10450clone, intelligenceEnterResult);
        c9270a.f107875f = new AtomicBoolean(false);
        jVar2.f107634d = c9270a;
        jVar2.f107635e = new I(editVideoInfoM10450clone, intelligenceEnterResult);
        jVar2.f107636f = new A(editVideoInfoM10450clone, intelligenceEnterResult);
        jVar2.f107637g = intelligenceEnterResult.isNewEditor ? new C6571h(editVideoInfoM10450clone, intelligenceEnterResult) : new C6571h(editVideoInfoM10450clone, intelligenceEnterResult);
        jVar2.h = new T(editVideoInfoM10450clone, intelligenceEnterResult, fragmentActivity);
        ?? c9270a2 = new C9270a(editVideoInfoM10450clone, intelligenceEnterResult);
        c9270a2.f107741d = 1;
        jVar2.f107639j = c9270a2;
        ?? t7 = new T(editVideoInfoM10450clone, intelligenceEnterResult, fragmentActivity);
        jVar2.f107638i = t7;
        jVar2.f107640k = str3;
        jVar2.f107641l = str4;
        jVar2.f107642m = j7;
        jVar2.f107643n = z6;
        jVar2.f107644o = z7;
        C6571h c6571h = jVar2.f107637g;
        if (c6571h != null) {
            c6571h.f107815e = str3;
        }
        T t8 = jVar2.h;
        if (t8 != null) {
            t8.f107773k = str3;
        }
        t7.f107773k = str3;
        this.f107594p.f107602a = new q((b) this);
        O0("[智能成片] =========start=========");
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new BiliIntelligenceGenViewModelV1$genIntelligenceProject$2(this, null), 3, (Object) null);
    }

    public final void M0() {
        O0("[智能成片] 流程超时，开始生成兜底项目");
        long jCurrentTimeMillis = System.currentTimeMillis();
        N n7 = this.f107594p.f107639j;
        if (n7 != null && n7.f107751o) {
            BLog.e("BiliIntelligenceGenViewModelV1", "genProjectAnyway fail ");
            return;
        }
        this.f107594p.b();
        j jVar = this.f107594p;
        jVar.f107602a = new a((b) this, jCurrentTimeMillis);
        j.g("[智能成片][项目生成] 强制生成项目流程");
        N n8 = jVar.f107639j;
        if (n8 == null || n8.f107745i != null) {
            jVar.j();
        } else if (jVar.c(true)) {
            jVar.f107651v.set(true);
            BuildersKt.launch$default(jVar.f107632b, Dispatchers.getIO(), (CoroutineStart) null, new BiliIntelligenceGenLogicManagerNew$startProjectGenAnyway$1(jVar, null), 2, (Object) null);
        }
    }

    public final void N0() {
        this.f107597s = BuildersKt.launch$default(((Yv0.c) this).b, Dispatchers.getIO(), (CoroutineStart) null, new BiliIntelligenceGenViewModelV1$initProgressUI$1(this, null), 2, (Object) null);
    }

    public final void P0(@NotNull String str, @NotNull String str2) {
        int i7;
        IntelligenceAudioConfig intelligenceAudioConfig;
        Long lRemove = Xz0.m.f28476a.remove(this.f107592n);
        Long lValueOf = lRemove != null ? Long.valueOf(System.currentTimeMillis() - lRemove.longValue()) : null;
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue();
            String strE = this.f107594p.e();
            StringBuilder sbA = com.bilibili.playerbizcommon.features.background.b.a(jLongValue, "[智能成片] 生成结果=", str, ",耗时=");
            sbA.append(",错误原因=");
            sbA.append(str2);
            O0(sbA.toString());
            O0("[智能成片] =========end=========");
            Intrinsics.areEqual(str, "success");
            EditVideoInfo editVideoInfo = this.f107582c;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (editVideoInfo != null && editVideoInfo.getIntelligenceInfo() != null) {
                linkedHashMap.put("asr", com.bilibili.studio.videoeditor.extension.f.a(editVideoInfo));
                EditVideoIntelligenceInfo intelligenceInfo = editVideoInfo.getIntelligenceInfo();
                linkedHashMap.put("asr_new", (intelligenceInfo == null || (intelligenceAudioConfig = intelligenceInfo.audioConfig) == null) ? "0" : String.valueOf((intelligenceAudioConfig.asrResult * 10) + intelligenceAudioConfig.fastAsrResult));
                linkedHashMap.put("bgm", com.bilibili.studio.videoeditor.extension.f.b(editVideoInfo));
                linkedHashMap.put("template", com.bilibili.studio.videoeditor.extension.f.w(editVideoInfo));
            }
            Map mutableMap = MapsKt.toMutableMap(linkedHashMap);
            if (Intrinsics.areEqual(str, "success")) {
                PbTemplateResult pbTemplateResult = PublicTempDef.INSTANCE.getPbTemplateResult();
                i7 = (pbTemplateResult == null || !pbTemplateResult.getPbCompleteSuccess()) ? 1 : 2;
            } else {
                i7 = 0;
            }
            mutableMap.put("template_new", String.valueOf(i7));
            zz0.b bVar = zz0.b.a;
            String str3 = this.f107592n;
            Xz0.d.f28458a.getClass();
            HashMap map = new HashMap();
            map.put("task_id", str3);
            map.put("total_cost", String.valueOf(jLongValue));
            map.put(ThirdPartyExtraBuilder.KEY_RESULT, str);
            map.put("error_msg", str2);
            map.put("template_type", strE);
            map.putAll(mutableMap);
            Xz0.g.c(map);
            Neurons.trackT(false, "creation.uper.ai_to_video.total_result", map, 1, new C1692b(6));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0306  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCleared() {
        /*
            Method dump skipped, instruction units count: 1169
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.intelligence.vm.BiliIntelligenceGenViewModelV1.onCleared():void");
    }
}
