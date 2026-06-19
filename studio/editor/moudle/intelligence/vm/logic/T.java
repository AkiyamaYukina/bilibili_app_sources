package com.bilibili.studio.editor.moudle.intelligence.vm.logic;

import androidx.fragment.app.FragmentActivity;
import com.bilibili.studio.editor.moudle.intelligence.data.IntelligenceEnterResult;
import com.bilibili.studio.editor.moudle.intelligence.data.IntelligenceTemplateInfo;
import com.bilibili.studio.editor.moudle.templatev2.bean.EditorTemplateListBean;
import com.bilibili.studio.editor.moudle.templatev2.bean.EditorTemplateMaterial;
import com.bilibili.studio.editor.moudle.templatev2.bean.EditorTemplateTabItemBean;
import com.bilibili.studio.module.tuwen.PublicTempDef;
import com.bilibili.studio.module.tuwen.model.PbTemplateResult;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.pb.PbTemplateEngine;
import com.bilibili.studio.videoeditor.template.BiliTemplateEngineManager;
import gD0.InterfaceC7248b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import zz0.C9270a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/logic/T.class */
public class T extends C9270a implements InterfaceC7248b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public FragmentActivity f107767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final BiliTemplateEngineManager f107768e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final PbTemplateEngine f107769f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public PbTemplateEngine.a f107770g;

    @NotNull
    public String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f107771i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f107772j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public String f107773k;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/logic/T$a.class */
    public interface a {
        default void a(@NotNull IntelligenceTemplateInfo intelligenceTemplateInfo, @Nullable EditorTemplateTabItemBean editorTemplateTabItemBean, long j7) {
        }

        default void b(long j7, @Nullable String str) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.bilibili.studio.videoeditor.pb.PbTemplateEngine, java.lang.Object] */
    public T(@Nullable EditVideoInfo editVideoInfo, @NotNull IntelligenceEnterResult intelligenceEnterResult, @Nullable FragmentActivity fragmentActivity) {
        super(editVideoInfo, intelligenceEnterResult);
        this.f107767d = fragmentActivity;
        BiliTemplateEngineManager biliTemplateEngineManager = new BiliTemplateEngineManager(6);
        this.f107768e = biliTemplateEngineManager;
        this.f107769f = new Object();
        this.h = "";
        biliTemplateEngineManager.i(fragmentActivity);
        biliTemplateEngineManager.f109919k = this;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
    public static final void d(T t7, List list) {
        t7.getClass();
        if (list == null || !(!list.isEmpty())) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EditorTemplateMaterial editorTemplateMaterial = (EditorTemplateMaterial) it.next();
            arrayList.add(new C6583u(editorTemplateMaterial.getDownloadUrl(), editorTemplateMaterial.getMaterialId(), editorTemplateMaterial.getMaterialType(), 8));
        }
        C6581s.a(arrayList, new com.bilibili.lib.accounts.B(1), new Object());
    }

    public static final void e(T t7, boolean z6, String str) {
        String str2 = t7.f107773k;
        if (str2 != null) {
            if (str2.length() <= 0) {
                str2 = null;
            }
            if (str2 != null) {
                C9270a.a(t7, str2, "get_template_info", 0L, z6, str, t7.h, null, 160);
            }
        }
    }

    @Override // gD0.InterfaceC7248b
    public final void K8() {
    }

    @Override // gD0.InterfaceC7248b
    public final void Z2(int i7) {
    }

    @NotNull
    public PbTemplateEngine.a f(@NotNull EditorTemplateTabItemBean editorTemplateTabItemBean, @Nullable String str) {
        int i7 = this.f130975b.videoCount;
        PbTemplateEngine.a aVar = new PbTemplateEngine.a();
        aVar.f109863a = this.f130974a;
        aVar.f109864b = editorTemplateTabItemBean;
        aVar.f109868f = true;
        aVar.f109869g = i7;
        aVar.h = false;
        String str2 = this.f107773k;
        String str3 = str2;
        if (str2 == null) {
            str3 = "";
        }
        aVar.f109870i = str3;
        aVar.f109876o = PbTemplateEngine.Scene.INTELLIGENCE;
        return aVar;
    }

    @Override // gD0.InterfaceC7248b
    public final void f1() {
    }

    /* JADX WARN: Type inference failed for: r0v39, types: [VC0.D, java.lang.Object] */
    public final void g(int i7, EditorTemplateTabItemBean editorTemplateTabItemBean, String str, P p7, Q q7, S s7, String str2) {
        if (this.f130976c) {
            return;
        }
        int i8 = i7 + 1;
        this.f107771i = i8;
        BLog.e("intelligence_tag", "[智能成片][" + h() + "][单次] 开始 curRetryCount=" + i8);
        if (i8 > 3) {
            p7.invoke(Integer.valueOf(i7), str2);
            return;
        }
        if (this.f107767d == null || editorTemplateTabItemBean == null) {
            p7.invoke(Integer.valueOf(i8), str2);
            return;
        }
        PbTemplateEngine.a aVarF = f(editorTemplateTabItemBean, str);
        FragmentActivity fragmentActivity = this.f107767d;
        W w7 = new W(this, i8, editorTemplateTabItemBean, str, p7, q7, s7);
        PbTemplateEngine pbTemplateEngine = this.f107769f;
        pbTemplateEngine.getClass();
        defpackage.a.b("loadPbTemplate, ", aVarF.f109876o.getDes(), "TemplateAction");
        if (aVarF.f109863a == null || aVarF.f109864b == null) {
            w7.a(aVarF.f109864b, "illegal argument");
            return;
        }
        VC0.D d7 = pbTemplateEngine.f109861a;
        if (d7 != null) {
            d7.c();
        }
        ?? obj = new Object();
        pbTemplateEngine.f109861a = obj;
        obj.e(fragmentActivity, this.f107768e, aVarF, w7);
    }

    @NotNull
    public String h() {
        return "普通模板下载";
    }

    public final void i(@Nullable EditorTemplateTabItemBean editorTemplateTabItemBean, int i7, @Nullable String str, @Nullable String str2, long j7, @NotNull a aVar, @Nullable String str3, @Nullable EditorTemplateListBean editorTemplateListBean) {
        if (this.f130976c) {
            return;
        }
        String str4 = this.f107773k;
        if (str4 != null) {
            if (str4.length() <= 0) {
                str4 = null;
            }
            if (str4 != null) {
                zz0.b.a.b(str4, "download_template", this.h, new LinkedHashMap());
            }
        }
        if (this.f107767d == null || this.f130974a == null || editorTemplateTabItemBean == null) {
            j(1, "null data", false);
            aVar.b(System.currentTimeMillis() - j7, "null data");
            return;
        }
        String strH = h();
        long j8 = editorTemplateTabItemBean.id;
        String str5 = editorTemplateTabItemBean.name;
        StringBuilder sbA = com.bilibili.playerbizcommon.features.background.b.a(j8, "[智能成片][", strH, "] 开始下载～id=");
        sbA.append(", name=");
        sbA.append(str5);
        BLog.e("intelligence_tag", sbA.toString());
        g(i7, editorTemplateTabItemBean, str2, new P(this, aVar, j7), new Q(this, str, editorTemplateListBean, str3, aVar, j7), new S(this, aVar, j7), null);
    }

    public final void j(int i7, String str, boolean z6) {
        if (z6 || Intrinsics.areEqual(this.h, "default")) {
            String str2 = this.f107772j ? "timeout" : z6 ? "success" : "error";
            String str3 = this.f107773k;
            if (str3 != null) {
                if (str3.length() <= 0) {
                    str3 = null;
                }
                if (str3 != null) {
                    long j7 = C6581s.f107859d;
                    zz0.b bVar = zz0.b.a;
                    Long l7 = (Long) zz0.b.b.get("download_template");
                    long jLongValue = (l7 != null ? Long.valueOf(System.currentTimeMillis() - l7.longValue()) : 0L).longValue();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("download_template_all_time", String.valueOf(jLongValue + j7));
                    PublicTempDef publicTempDef = PublicTempDef.INSTANCE;
                    PbTemplateResult pbTemplateResult = publicTempDef.getPbTemplateResult();
                    linkedHashMap.put("complete_success", (pbTemplateResult == null || !pbTemplateResult.getPbCompleteSuccess()) ? "0" : "1");
                    PbTemplateResult pbTemplateResult2 = publicTempDef.getPbTemplateResult();
                    String string = null;
                    if (pbTemplateResult2 != null) {
                        string = pbTemplateResult2.toString();
                    }
                    String strA = G.p.a(str, string);
                    String str4 = this.h;
                    Long lA = bVar.a("download_template", str2, str3);
                    if (lA != null) {
                        long jLongValue2 = lA.longValue();
                        Xz0.d.f28458a.getClass();
                        Xz0.d.h(str3, "download_template", jLongValue2, str2, strA, i7, str4, linkedHashMap);
                    }
                }
            }
        }
    }
}
