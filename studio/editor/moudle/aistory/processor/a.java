package com.bilibili.studio.editor.moudle.aistory.processor;

import Qh1.V;
import androidx.appcompat.widget.C3259x;
import com.bilibili.studio.editor.moudle.aistory.bean.AIStoryFrameBean;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.SafeContinuation;
import nz0.InterfaceC8146a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/processor/a.class */
public final class a implements InterfaceC8146a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f105734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f105735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SafeContinuation f105736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<AIStoryFrameBean> f105737d;

    public a(long j7, b bVar, SafeContinuation safeContinuation, List list) {
        this.f105734a = j7;
        this.f105735b = bVar;
        this.f105736c = safeContinuation;
        this.f105737d = list;
    }

    @Override // nz0.InterfaceC8146a
    public final void c(int i7, String str, List list, String str2) {
        if (list != null) {
            List<AIStoryFrameBean> list2 = this.f105737d;
            AIStoryFrameBean aIStoryFrameBean = new AIStoryFrameBean();
            aIStoryFrameBean.setFilePath(str2);
            aIStoryFrameBean.setRotation(i7);
            aIStoryFrameBean.setFrameList(list);
            list2.add(aIStoryFrameBean);
        }
    }

    @Override // nz0.InterfaceC8146a
    public final void f(int i7, String str, boolean z6) {
        Tw0.b.e("fail", -4, Long.valueOf(System.currentTimeMillis() - this.f105734a), C3259x.a(i7, "errorCode="), Integer.valueOf(this.f105735b.f105739b));
        Result.Companion companion = Result.Companion;
        this.f105736c.resumeWith(V.a("取帧失败"));
    }

    @Override // nz0.InterfaceC8146a
    public final void g(String str, String str2) {
        Tw0.b.g("success", -4, Long.valueOf(System.currentTimeMillis() - this.f105734a), null, Integer.valueOf(this.f105735b.f105739b), 8);
        Result.Companion companion = Result.Companion;
        this.f105736c.resumeWith(Result.constructor-impl(this.f105737d));
    }
}
