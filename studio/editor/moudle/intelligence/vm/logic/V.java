package com.bilibili.studio.editor.moudle.intelligence.vm.logic;

import androidx.compose.ui.text.font.C4496a;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.studio.editor.moudle.intelligence.vm.j;
import com.bilibili.studio.editor.moudle.templatev2.bean.EditorTemplateListBean;
import com.bilibili.studio.videoeditor.template.BiliTemplateEngineManager;
import retrofit2.Call;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/logic/V.class */
public final class V extends BiliApiDataCallback<EditorTemplateListBean> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f107777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j.b f107778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f107779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f107780e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f107781f;

    public V(T t7, j.b bVar, long j7, String str, String str2) {
        this.f107777b = t7;
        this.f107778c = bVar;
        this.f107779d = j7;
        this.f107780e = str;
        this.f107781f = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
    @Override // com.bilibili.okretro.BiliApiDataCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDataSuccess(com.bilibili.studio.editor.moudle.templatev2.bean.EditorTemplateListBean r12) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.intelligence.vm.logic.V.onDataSuccess(java.lang.Object):void");
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        BiliTemplateEngineManager biliTemplateEngineManager = C6581s.f107856a;
        C6581s.f107859d = System.currentTimeMillis() - C6581s.f107858c;
        T.e(this.f107777b, false, C4496a.a("接口失败：", th != null ? th.getMessage() : null));
        String message = null;
        if (th != null) {
            message = th.getMessage();
        }
        this.f107778c.b(System.currentTimeMillis() - this.f107779d, message);
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onFailure(Call<GeneralResponse<EditorTemplateListBean>> call, Throwable th) {
        BiliTemplateEngineManager biliTemplateEngineManager = C6581s.f107856a;
        C6581s.f107859d = System.currentTimeMillis() - C6581s.f107858c;
        T.e(this.f107777b, false, C4496a.a("接口失败：", th.getMessage()));
        this.f107778c.b(System.currentTimeMillis() - this.f107779d, th.getMessage());
    }
}
