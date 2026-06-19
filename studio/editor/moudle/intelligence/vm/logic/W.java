package com.bilibili.studio.editor.moudle.intelligence.vm.logic;

import VC0.D;
import com.bilibili.app.producers.ability.l0;
import com.bilibili.studio.editor.moudle.templatev2.bean.EditorTemplateTabItemBean;
import com.bilibili.studio.videoeditor.pb.PbTemplateEngine;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/logic/W.class */
public final class W implements D.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f107782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f107783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EditorTemplateTabItemBean f107784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f107785d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final P f107786e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Q f107787f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final S f107788g;

    public W(T t7, int i7, EditorTemplateTabItemBean editorTemplateTabItemBean, String str, P p7, Q q7, S s7) {
        this.f107782a = t7;
        this.f107783b = i7;
        this.f107784c = editorTemplateTabItemBean;
        this.f107785d = str;
        this.f107786e = p7;
        this.f107787f = q7;
        this.f107788g = s7;
    }

    @Override // VC0.D.a
    public final void a(EditorTemplateTabItemBean editorTemplateTabItemBean, String str) {
        StringBuilder sbA = l0.a("[智能成片][", this.f107782a.h(), "][单次] 失败 开始重试 retryCount=");
        sbA.append(this.f107783b);
        sbA.append(", errorMsg = ");
        sbA.append(str);
        BLog.e("intelligence_tag", sbA.toString());
        this.f107782a.g(this.f107783b, this.f107784c, this.f107785d, this.f107786e, this.f107787f, this.f107788g, str);
    }

    @Override // VC0.D.a
    public final void b(EditorTemplateTabItemBean editorTemplateTabItemBean) {
        StringBuilder sbA = l0.a("[智能成片][", this.f107782a.h(), "][单次] 取消 retryCount=");
        int i7 = this.f107783b;
        sbA.append(i7);
        BLog.e("intelligence_tag", sbA.toString());
        this.f107788g.invoke(Integer.valueOf(i7));
    }

    @Override // VC0.D.a
    public final void c(PbTemplateEngine.a aVar, EditorTemplateTabItemBean editorTemplateTabItemBean) {
        StringBuilder sbA = l0.a("[智能成片][", this.f107782a.h(), "][单次] 成功 retryCount=");
        int i7 = this.f107783b;
        sbA.append(i7);
        BLog.e("intelligence_tag", sbA.toString());
        this.f107787f.invoke(aVar, editorTemplateTabItemBean, Integer.valueOf(i7));
    }
}
