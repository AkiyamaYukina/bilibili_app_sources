package com.bilibili.studio.editor.moudle.intelligence.vm;

import Vn.A;
import com.bilibili.lib.ui.BaseAppCompatActivity;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.studio.editor.moudle.intelligence.data.IntelligenceDefaultTemplateBean;
import com.bilibili.studio.editor.moudle.templatev2.bean.EditorTemplateListByIdBean;
import com.bilibili.studio.editor.moudle.templatev2.bean.EditorTemplateTabItemBean;
import com.bilibili.studio.videoeditor.template.BiliTemplateEngineManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/h.class */
public final class h extends BiliApiDataCallback<EditorTemplateListByIdBean> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f107625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f107626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BaseAppCompatActivity f107627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BiliTemplateEngineManager f107628e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap<String, String> f107629f;

    public h(e eVar, long j7, BaseAppCompatActivity baseAppCompatActivity, BiliTemplateEngineManager biliTemplateEngineManager, HashMap map) {
        this.f107625b = eVar;
        this.f107626c = j7;
        this.f107627d = baseAppCompatActivity;
        this.f107628e = biliTemplateEngineManager;
        this.f107629f = map;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(EditorTemplateListByIdBean editorTemplateListByIdBean) {
        List<EditorTemplateTabItemBean> list;
        EditorTemplateListByIdBean editorTemplateListByIdBean2 = editorTemplateListByIdBean;
        if (editorTemplateListByIdBean2 == null || (list = editorTemplateListByIdBean2.list) == null || !(!list.isEmpty())) {
            BLog.e("intelligence_tag", "[默认模板][后台下载] getTemplateInfo list is empty ");
            this.f107625b.f107613e = 2;
            return;
        }
        ((ArrayList) this.f107625b.f107609a).clear();
        List<EditorTemplateTabItemBean> list2 = editorTemplateListByIdBean2.list;
        HashMap<String, String> map = this.f107629f;
        e eVar = this.f107625b;
        for (EditorTemplateTabItemBean editorTemplateTabItemBean : list2) {
            String strValueOf = String.valueOf(editorTemplateTabItemBean.id);
            String str = map.get(strValueOf);
            IntelligenceDefaultTemplateBean intelligenceDefaultTemplateBean = new IntelligenceDefaultTemplateBean();
            intelligenceDefaultTemplateBean.templateId = strValueOf;
            intelligenceDefaultTemplateBean.downloadUrl = str;
            intelligenceDefaultTemplateBean.templateTabItemBean = editorTemplateTabItemBean;
            ((ArrayList) eVar.f107609a).add(intelligenceDefaultTemplateBean);
        }
        this.f107625b.f107613e = 1;
        Os.f.b(A.b(((ArrayList) this.f107625b.f107609a).size(), ((ArrayList) this.f107625b.f107610b).size(), "[默认模板][后台下载] 获取模板列表 wait.size=", ",ready.size=", ",time="), System.currentTimeMillis() - this.f107626c, "intelligence_tag");
        e.a(this.f107625b, this.f107627d, this.f107628e);
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        BLog.e("intelligence_tag", "[默认模板][后台下载] getTemplateInfo error");
    }
}
