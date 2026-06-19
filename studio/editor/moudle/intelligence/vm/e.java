package com.bilibili.studio.editor.moudle.intelligence.vm;

import J3.C2350j;
import VC0.C2934j;
import VC0.H;
import VC0.r;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import bolts.Continuation;
import bolts.Task;
import com.alibaba.fastjson.JSON;
import com.bilibili.aurorasdk.AuroraVersion;
import com.bilibili.base.BiliContext;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.neuron.util.SamplesKt;
import com.bilibili.lib.performance.EntryPointKt;
import com.bilibili.lib.ui.BaseAppCompatActivity;
import com.bilibili.montage.MontageVersion;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.studio.editor.moudle.intelligence.data.IntelligenceDefTemConfig;
import com.bilibili.studio.editor.moudle.intelligence.data.IntelligenceDefaultTemplateBean;
import com.bilibili.studio.videoeditor.pb.PbTemplateEngine;
import com.bilibili.studio.videoeditor.template.BiliTemplateEngineManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q4.M;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.ui.splash.brand.model.BrandShowInfo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/e.class */
public final class e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final Lazy<e> f107608g = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new C2350j(8));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public List<? extends IntelligenceDefTemConfig> f107612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile int f107613e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<IntelligenceDefaultTemplateBean> f107609a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<IntelligenceDefaultTemplateBean> f107610b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final PbTemplateEngine f107611c = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public volatile String f107614f = "";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/e$a.class */
    public static final class a {
        @NotNull
        public static e a() {
            return (e) e.f107608g.getValue();
        }
    }

    public static final void a(e eVar, Activity activity, BiliTemplateEngineManager biliTemplateEngineManager) {
        eVar.getClass();
        if (activity.isDestroyed() || biliTemplateEngineManager == null) {
            BLog.e("intelligence_tag", "[默认模板][后台下载] downloadTemplateLoop 中断 activity.isDestroyed");
            eVar.f107613e = 2;
            return;
        }
        if (((ArrayList) eVar.f107609a).isEmpty()) {
            eVar.f107613e = 2;
            BLog.e("intelligence_tag", "[默认模板][后台下载] 全部下载完成了");
            return;
        }
        if (eVar.f107613e == 3) {
            BLog.e("intelligence_tag", "[默认模板][后台下载] downloadTemplateLoop 中断 return");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        IntelligenceDefaultTemplateBean intelligenceDefaultTemplateBean = (IntelligenceDefaultTemplateBean) ((ArrayList) eVar.f107609a).get(0);
        PbTemplateEngine.a aVar = new PbTemplateEngine.a();
        aVar.f109867e = intelligenceDefaultTemplateBean.templateId;
        aVar.f109871j = intelligenceDefaultTemplateBean.downloadUrl;
        aVar.f109876o = PbTemplateEngine.Scene.PRE_DOWNLOAD;
        if (!EntryPointKt.getMemleakOptEnable()) {
            eVar.f107611c.a(activity, biliTemplateEngineManager, aVar, new g(jCurrentTimeMillis, eVar, intelligenceDefaultTemplateBean, activity, biliTemplateEngineManager));
        } else {
            eVar.f107611c.a(activity, biliTemplateEngineManager, aVar, new f(jCurrentTimeMillis, eVar, intelligenceDefaultTemplateBean, new WeakReference(activity), biliTemplateEngineManager));
        }
    }

    public static IntelligenceDefaultTemplateBean b(List list) {
        ArrayList arrayList = (ArrayList) list;
        return arrayList.size() == 1 ? (IntelligenceDefaultTemplateBean) arrayList.get(0) : (IntelligenceDefaultTemplateBean) arrayList.get(SamplesKt.randInt(0, arrayList.size() - 1));
    }

    public final void c(String str) {
        this.f107614f = str;
        Application application = BiliContext.application();
        if (application == null) {
            return;
        }
        BLog.e("intelligence_tag", "[默认模板][后台下载] 记录上次使用的模板id =" + str);
        BiliGlobalPreferenceHelper.getInstance(application).setString("upper_key_last_template", str);
    }

    public final void d(@NotNull final BaseAppCompatActivity baseAppCompatActivity, @Nullable final BiliTemplateEngineManager biliTemplateEngineManager) {
        if (baseAppCompatActivity.isDestroyed() || biliTemplateEngineManager == null) {
            return;
        }
        final int i7 = 0;
        Task.callInBackground(new Callable(this, i7) { // from class: com.bilibili.studio.editor.moudle.intelligence.vm.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f107603a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f107604b;

            {
                this.f107603a = i7;
                this.f107604b = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                List<? extends IntelligenceDefTemConfig> array;
                BrandShowInfo brandShowInfo = null;
                switch (this.f107603a) {
                    case 0:
                        e eVar = (e) this.f107604b;
                        eVar.getClass();
                        Application application = BiliContext.application();
                        eVar.f107614f = application != null ? BiliGlobalPreferenceHelper.getInstance(application).optString("upper_key_last_template", "") : "";
                        if (eVar.f107612d == null) {
                            Lazy lazy = zw0.b.f130950a;
                            try {
                                array = JSON.parseArray((String) Contract.get$default(ConfigManager.Companion.config(), "upper.smart_video_def_tem_config", (Object) null, 2, (Object) null), IntelligenceDefTemConfig.class);
                            } catch (Exception e7) {
                                BLog.e("intelligence_tag", e7.toString());
                                array = null;
                            }
                            eVar.f107612d = array;
                            break;
                        }
                        List<? extends IntelligenceDefTemConfig> list = eVar.f107612d;
                        return list != null ? list.isEmpty() ? null : eVar.f107612d : null;
                    default:
                        BrandShowInfo brandShowInfoD = qg1.c.a.d((Context) this.f107604b);
                        if (brandShowInfoD != null) {
                            brandShowInfoD.setLocalBitmap(rg1.a.a(brandShowInfoD));
                            brandShowInfo = brandShowInfoD;
                        }
                        return brandShowInfo;
                }
            }
        }).continueWith(new Continuation(this, baseAppCompatActivity, biliTemplateEngineManager) { // from class: com.bilibili.studio.editor.moudle.intelligence.vm.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final e f107605a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final BaseAppCompatActivity f107606b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final BiliTemplateEngineManager f107607c;

            {
                this.f107605a = this;
                this.f107606b = baseAppCompatActivity;
                this.f107607c = biliTemplateEngineManager;
            }

            @Override // bolts.Continuation
            public final Object then(Task task) {
                BiliTemplateEngineManager biliTemplateEngineManager2;
                List list = (List) task.getResult();
                List list2 = list;
                if (list2 == null || list2.isEmpty()) {
                    BLog.e("intelligence_tag", "[默认模板][后台下载]Fawkes 配置读取异常 config=null");
                } else {
                    e eVar = this.f107605a;
                    eVar.getClass();
                    BaseAppCompatActivity baseAppCompatActivity2 = this.f107606b;
                    if (baseAppCompatActivity2.isDestroyed() || (biliTemplateEngineManager2 = this.f107607c) == null || list.isEmpty()) {
                        BLog.e("intelligence_tag", "[默认模板][后台下载] 状态异常 不再请求");
                    } else {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        ArrayList<IntelligenceDefTemConfig> arrayList = new ArrayList();
                        int iCoerceAtMost = RangesKt.coerceAtMost(2, list.size());
                        int i8 = 0;
                        while (true) {
                            boolean z6 = true;
                            if (i8 >= iCoerceAtMost) {
                                break;
                            }
                            IntelligenceDefTemConfig intelligenceDefTemConfig = (IntelligenceDefTemConfig) list.get(i8);
                            for (IntelligenceDefaultTemplateBean intelligenceDefaultTemplateBean : (ArrayList) eVar.f107610b) {
                                boolean z7 = z6;
                                if (Intrinsics.areEqual(intelligenceDefaultTemplateBean.downloadUrl, intelligenceDefTemConfig.templateUrl)) {
                                    z7 = z6;
                                    if (Intrinsics.areEqual(intelligenceDefaultTemplateBean.templateId, intelligenceDefTemConfig.templateId)) {
                                        M.b("[默认模板][后台下载] 数据过滤 不再下载=", intelligenceDefTemConfig.templateId, "intelligence_tag");
                                        z7 = false;
                                    }
                                }
                                z6 = z7;
                            }
                            if (z6) {
                                arrayList.add(intelligenceDefTemConfig);
                            }
                            i8++;
                        }
                        BLog.e("intelligence_tag", "[默认模板][后台下载] 数据过滤 time=" + (System.currentTimeMillis() - jCurrentTimeMillis));
                        if (arrayList.isEmpty()) {
                            T7.a.a(((ArrayList) eVar.f107610b).size(), "[默认模板][后台下载] 已全部下载完成，readyList.size=", "intelligence_tag");
                        } else if (baseAppCompatActivity2.isDestroyed() || arrayList.isEmpty()) {
                            BLog.e("intelligence_tag", "[默认模板][后台下载] 状态异常 不再请求");
                        } else {
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            StringBuilder sb = new StringBuilder();
                            HashMap map = new HashMap();
                            for (IntelligenceDefTemConfig intelligenceDefTemConfig2 : arrayList) {
                                String str = intelligenceDefTemConfig2.templateId;
                                if (!TextUtils.isEmpty(str)) {
                                    sb.append(intelligenceDefTemConfig2.templateId + ",");
                                    map.put(str, intelligenceDefTemConfig2.templateUrl);
                                }
                            }
                            if (TextUtils.isEmpty(sb.toString())) {
                                BLog.e("intelligence_tag", "[默认模板][后台下载] 配置数据异常 ids=" + ((Object) sb));
                            } else {
                                String strSubstring = sb.substring(0, sb.length() - 1);
                                TC0.g gVar = (TC0.g) ServiceGenerator.createService(TC0.g.class);
                                com.bilibili.studio.editor.timeline.d.f108285a.getClass();
                                String auroraVersion = AuroraVersion.getAuroraVersion();
                                String str2 = auroraVersion;
                                if (auroraVersion == null) {
                                    str2 = "";
                                }
                                gVar.getTemplateItemListById(strSubstring, 0, "mon", str2, MontageVersion.getVersion()).enqueue(new h(eVar, jCurrentTimeMillis2, baseAppCompatActivity2, biliTemplateEngineManager2, map));
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }, Task.UI_THREAD_EXECUTOR);
    }

    public final void e() {
        if (this.f107613e == 1) {
            this.f107613e = 3;
            H h = this.f107611c.f109862b;
            if (h != null) {
                C2934j c2934j = h.f25323a;
                if (c2934j != null) {
                    c2934j.a();
                }
                r rVar = h.f25324b;
                if (rVar != null) {
                    rVar.a();
                }
                C2934j c2934j2 = h.f25323a;
                String str = c2934j2 != null ? c2934j2.f25335d : null;
                if (h.f25325c != 0) {
                    BLog.e("TemplateActionOnly", "applyTemplateFail return ,is other state now");
                    return;
                }
                h.f25325c = 3;
                H.a aVar = h.f25326d;
                if (aVar != null) {
                    aVar.b(str);
                }
                if (EntryPointKt.getMemleakOptEnable()) {
                    h.f25326d = null;
                }
            }
        }
    }
}
