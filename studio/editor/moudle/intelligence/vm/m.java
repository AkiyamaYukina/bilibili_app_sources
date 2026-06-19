package com.bilibili.studio.editor.moudle.intelligence.vm;

import com.bilibili.studio.editor.moudle.intelligence.data.IntelligenceTemplateInfo;
import com.bilibili.studio.editor.moudle.intelligence.vm.logic.T;
import com.bilibili.studio.editor.moudle.templatev2.bean.EditorTemplateTabItemBean;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/m.class */
public final class m implements T.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f107881a;

    public m(j jVar) {
        this.f107881a = jVar;
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.vm.logic.T.a
    public final void a(IntelligenceTemplateInfo intelligenceTemplateInfo, EditorTemplateTabItemBean editorTemplateTabItemBean, long j7) {
        j jVar = this.f107881a;
        jVar.getClass();
        j.g("[智能成片][智能模板]ID下载模板成功，time=" + j7 + ", " + intelligenceTemplateInfo);
        jVar.m(intelligenceTemplateInfo, editorTemplateTabItemBean);
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.vm.logic.T.a
    public final void b(long j7, String str) {
        j.g("[智能成片][智能模板] ID下载模板失败 mTempPicLabel=" + this.f107881a.f107654y);
        this.f107881a.f107646q = true;
        j jVar = this.f107881a;
        String str2 = jVar.f107654y;
        if (str2 != null) {
            jVar.d(str2, jVar.f107655z);
        }
    }
}
