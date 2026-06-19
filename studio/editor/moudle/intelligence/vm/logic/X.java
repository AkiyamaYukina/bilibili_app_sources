package com.bilibili.studio.editor.moudle.intelligence.vm.logic;

import VC0.C2926b;
import com.bilibili.studio.editor.moudle.intelligence.vm.logic.N;
import com.bilibili.studio.editor.moudle.templatev2.bean.EditorTemplateTabItemBean;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/logic/X.class */
public final class X implements C2926b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N.b f107789a;

    public X(N.b bVar, long j7) {
        this.f107789a = bVar;
    }

    @Override // VC0.C2926b.a
    public final void a(EditorTemplateTabItemBean editorTemplateTabItemBean) {
        BLog.e("intelligence_tag", "[智能成片][解析模板] 失败，原因：取消");
        System.currentTimeMillis();
        this.f107789a.a();
    }

    @Override // VC0.C2926b.a
    public final void b(EditVideoInfo editVideoInfo, EditorTemplateTabItemBean editorTemplateTabItemBean) {
        BLog.e("intelligence_tag", "[智能成片][解析模板] 成功");
        System.currentTimeMillis();
        N.b bVar = this.f107789a;
        bVar.f107752a.f(bVar.f107753b, bVar.f107754c);
    }

    @Override // VC0.C2926b.a
    public final void c(EditorTemplateTabItemBean editorTemplateTabItemBean, String str) {
        BLog.e("intelligence_tag", "[智能成片][解析模板] 失败，原因：" + str);
        System.currentTimeMillis();
        this.f107789a.a();
    }
}
