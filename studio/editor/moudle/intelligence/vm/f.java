package com.bilibili.studio.editor.moudle.intelligence.vm;

import VC0.H;
import android.app.Activity;
import com.bilibili.studio.editor.moudle.intelligence.data.IntelligenceDefaultTemplateBean;
import com.bilibili.studio.videoeditor.template.BiliTemplateEngineManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/f.class */
public final class f implements H.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f107615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f107616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IntelligenceDefaultTemplateBean f107617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakReference<Activity> f107618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BiliTemplateEngineManager f107619e;

    public f(long j7, e eVar, IntelligenceDefaultTemplateBean intelligenceDefaultTemplateBean, WeakReference<Activity> weakReference, BiliTemplateEngineManager biliTemplateEngineManager) {
        this.f107615a = j7;
        this.f107616b = eVar;
        this.f107617c = intelligenceDefaultTemplateBean;
        this.f107618d = weakReference;
        this.f107619e = biliTemplateEngineManager;
    }

    @Override // VC0.H.a
    public final void a(String str) {
        e eVar = this.f107616b;
        ArrayList arrayList = (ArrayList) eVar.f107610b;
        IntelligenceDefaultTemplateBean intelligenceDefaultTemplateBean = this.f107617c;
        arrayList.add(intelligenceDefaultTemplateBean);
        ((ArrayList) eVar.f107609a).remove(intelligenceDefaultTemplateBean);
        BLog.e("intelligence_tag", androidx.core.content.c.b(System.currentTimeMillis() - this.f107615a, "[默认模板][后台下载] 下载完成 templateId=", str, "，time="));
        Activity activity = this.f107618d.get();
        if (activity == null) {
            return;
        }
        e.a(eVar, activity, this.f107619e);
    }

    @Override // VC0.H.a
    public final void b(String str) {
        BLog.e("intelligence_tag", androidx.core.content.c.b(System.currentTimeMillis() - this.f107615a, "[默认模板][后台下载] 取消下载 templateId=", str, "，time="));
    }

    @Override // VC0.H.a
    public final void c(String str, String str2) {
        Os.f.b(G0.b.a("[默认模板][后台下载] 下载失败 templateId=", str, "，errorMsg = ", str2, ", time="), System.currentTimeMillis() - this.f107615a, "intelligence_tag");
        e eVar = this.f107616b;
        ((ArrayList) eVar.f107609a).remove(this.f107617c);
        Activity activity = this.f107618d.get();
        if (activity == null) {
            return;
        }
        e.a(eVar, activity, this.f107619e);
    }
}
