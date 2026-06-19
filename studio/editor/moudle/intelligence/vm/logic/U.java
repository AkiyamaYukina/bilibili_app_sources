package com.bilibili.studio.editor.moudle.intelligence.vm.logic;

import androidx.compose.ui.text.font.C4496a;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.studio.editor.moudle.templatev2.bean.EditorTemplateListByIdBean;
import com.bilibili.studio.editor.moudle.templatev2.bean.EditorTemplateMaterial;
import com.bilibili.studio.editor.moudle.templatev2.bean.EditorTemplateTabItemBean;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.random.Random;
import retrofit2.Call;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/logic/U.class */
public final class U extends BiliApiDataCallback<EditorTemplateListByIdBean> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f107774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.bilibili.studio.editor.moudle.intelligence.vm.m f107775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f107776d;

    public U(T t7, com.bilibili.studio.editor.moudle.intelligence.vm.m mVar, long j7) {
        this.f107774b = t7;
        this.f107775c = mVar;
        this.f107776d = j7;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(EditorTemplateListByIdBean editorTemplateListByIdBean) {
        List<EditorTemplateTabItemBean> list;
        EditorTemplateListByIdBean editorTemplateListByIdBean2 = editorTemplateListByIdBean;
        List<EditorTemplateTabItemBean> list2 = editorTemplateListByIdBean2 != null ? editorTemplateListByIdBean2.list : null;
        T t7 = this.f107774b;
        com.bilibili.studio.editor.moudle.intelligence.vm.m mVar = this.f107775c;
        if (list2 == null || list2.isEmpty()) {
            T.e(t7, false, "查询模板为空");
            mVar.b(System.currentTimeMillis() - this.f107776d, "查询模板为空");
            return;
        }
        T.e(t7, true, "");
        t7.i((editorTemplateListByIdBean2 == null || (list = editorTemplateListByIdBean2.list) == null) ? null : (EditorTemplateTabItemBean) CollectionsKt.t(list, Random.Default), 0, null, null, this.f107776d, mVar, null, null);
        List<EditorTemplateMaterial> list3 = null;
        if (editorTemplateListByIdBean2 != null) {
            list3 = editorTemplateListByIdBean2.childrenMaterial;
        }
        T.d(t7, list3);
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        T.e(this.f107774b, false, C4496a.a("接口失败：", th != null ? th.getMessage() : null));
        String message = null;
        if (th != null) {
            message = th.getMessage();
        }
        this.f107775c.b(System.currentTimeMillis() - this.f107776d, message);
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onFailure(Call<GeneralResponse<EditorTemplateListByIdBean>> call, Throwable th) {
        T.e(this.f107774b, false, C4496a.a("接口失败：", th.getMessage()));
        this.f107775c.b(System.currentTimeMillis() - this.f107776d, th.getMessage());
    }
}
