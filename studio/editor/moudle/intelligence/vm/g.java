package com.bilibili.studio.editor.moudle.intelligence.vm;

import VC0.H;
import android.app.Activity;
import com.bilibili.studio.editor.moudle.intelligence.data.IntelligenceDefaultTemplateBean;
import com.bilibili.studio.videoeditor.template.BiliTemplateEngineManager;
import java.util.ArrayList;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/g.class */
public final class g implements H.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f107620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f107621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IntelligenceDefaultTemplateBean f107622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Activity f107623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BiliTemplateEngineManager f107624e;

    public g(long j7, e eVar, IntelligenceDefaultTemplateBean intelligenceDefaultTemplateBean, Activity activity, BiliTemplateEngineManager biliTemplateEngineManager) {
        this.f107620a = j7;
        this.f107621b = eVar;
        this.f107622c = intelligenceDefaultTemplateBean;
        this.f107623d = activity;
        this.f107624e = biliTemplateEngineManager;
    }

    @Override // VC0.H.a
    public final void a(String str) {
        e eVar = this.f107621b;
        ArrayList arrayList = (ArrayList) eVar.f107610b;
        IntelligenceDefaultTemplateBean intelligenceDefaultTemplateBean = this.f107622c;
        arrayList.add(intelligenceDefaultTemplateBean);
        ((ArrayList) eVar.f107609a).remove(intelligenceDefaultTemplateBean);
        BLog.e("intelligence_tag", androidx.core.content.c.b(System.currentTimeMillis() - this.f107620a, "[默认模板][后台下载] 下载完成 templateId=", str, "，time="));
        e.a(eVar, this.f107623d, this.f107624e);
    }

    @Override // VC0.H.a
    public final void b(String str) {
        BLog.e("intelligence_tag", androidx.core.content.c.b(System.currentTimeMillis() - this.f107620a, "[默认模板][后台下载] 取消下载 templateId=", str, "，time="));
    }

    @Override // VC0.H.a
    public final void c(String str, String str2) {
        Os.f.b(G0.b.a("[默认模板][后台下载] 下载失败 templateId=", str, "，errorMsg = ", str2, ", time="), System.currentTimeMillis() - this.f107620a, "intelligence_tag");
        e eVar = this.f107621b;
        ((ArrayList) eVar.f107609a).remove(this.f107622c);
        e.a(eVar, this.f107623d, this.f107624e);
    }
}
