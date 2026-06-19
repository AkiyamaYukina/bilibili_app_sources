package com.bilibili.studio.editor.moudle.intelligence.vm.logic;

import com.bilibili.studio.editor.moudle.intelligence.data.IntelligenceTemplateInfo;
import com.bilibili.studio.editor.moudle.intelligence.vm.logic.T;
import com.bilibili.studio.editor.moudle.templatev2.bean.EditorTemplateListBean;
import com.bilibili.studio.editor.moudle.templatev2.bean.EditorTemplateTabItemBean;
import com.bilibili.studio.videoeditor.pb.PbTemplateEngine;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/logic/Q.class */
public final /* synthetic */ class Q implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f107758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EditorTemplateListBean f107760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f107761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final T.a f107762e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f107763f;

    public /* synthetic */ Q(T t7, String str, EditorTemplateListBean editorTemplateListBean, String str2, T.a aVar, long j7) {
        this.f107758a = t7;
        this.f107759b = str;
        this.f107760c = editorTemplateListBean;
        this.f107761d = str2;
        this.f107762e = aVar;
        this.f107763f = j7;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PbTemplateEngine.a aVar = (PbTemplateEngine.a) obj;
        EditorTemplateTabItemBean editorTemplateTabItemBean = (EditorTemplateTabItemBean) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        T t7 = this.f107758a;
        BLog.e("intelligence_tag", "[智能成片][" + t7.h() + "][最终] 成功 重试次数=" + iIntValue);
        t7.f107770g = aVar;
        long originId = 0L;
        long j7 = editorTemplateTabItemBean != null ? editorTemplateTabItemBean.id : 0L;
        if (editorTemplateTabItemBean != null) {
            originId = editorTemplateTabItemBean.getOriginId();
        }
        String str = editorTemplateTabItemBean != null ? editorTemplateTabItemBean.name : null;
        if (str == null) {
            str = "";
        }
        IntelligenceTemplateInfo intelligenceTemplateInfo = new IntelligenceTemplateInfo(j7, originId, this.f107759b, str, editorTemplateTabItemBean);
        intelligenceTemplateInfo.pbBgm = aVar.f109874m;
        intelligenceTemplateInfo.responseByTag = this.f107760c;
        intelligenceTemplateInfo.ratio = this.f107761d;
        t7.j(iIntValue, "", true);
        this.f107762e.a(intelligenceTemplateInfo, editorTemplateTabItemBean, System.currentTimeMillis() - this.f107763f);
        return Unit.INSTANCE;
    }
}
