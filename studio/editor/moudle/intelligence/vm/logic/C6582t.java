package com.bilibili.studio.editor.moudle.intelligence.vm.logic;

import android.text.TextUtils;
import com.bilibili.studio.editor.moudle.templatev2.bean.EditorTemplateTabItemBean;
import com.bilibili.studio.videoeditor.pb.PbTemplateEngine;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.studio.editor.moudle.intelligence.vm.logic.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/logic/t.class */
public final class C6582t extends T {
    @Override // com.bilibili.studio.editor.moudle.intelligence.vm.logic.T
    @NotNull
    public final PbTemplateEngine.a f(@NotNull EditorTemplateTabItemBean editorTemplateTabItemBean, @Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return super.f(editorTemplateTabItemBean, str);
        }
        PbTemplateEngine.a aVar = new PbTemplateEngine.a();
        aVar.f109863a = this.f130974a;
        aVar.f109864b = editorTemplateTabItemBean;
        aVar.f109868f = true;
        aVar.f109869g = -1;
        aVar.h = true;
        aVar.f109871j = str;
        String str2 = this.f107773k;
        String str3 = str2;
        if (str2 == null) {
            str3 = "";
        }
        aVar.f109870i = str3;
        aVar.f109876o = PbTemplateEngine.Scene.INTELLIGENCE;
        return aVar;
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.vm.logic.T
    @NotNull
    public final String h() {
        return "默认模板下载";
    }
}
