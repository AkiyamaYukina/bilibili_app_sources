package com.bilibili.studio.editor.smarttitle;

import Pb.E;
import bA0.C4936c;
import bA0.e;
import com.bilibili.studio.editor.smarttitle.constans.SmartTitleType;
import com.bilibili.studio.editor.smarttitle.entity.aitask.SmartTitleAITaskResult;
import com.bilibili.upper.module.contribute.up.ai.title.f;
import com.bilibili.upper.module.contribute.up.ai.title.g;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/smarttitle/a.class */
public final class a implements e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f108218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f108219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f108220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f108221d;

    public a(AtomicBoolean atomicBoolean, String str, g gVar, f fVar) {
        this.f108218a = atomicBoolean;
        this.f108219b = str;
        this.f108220c = gVar;
        this.f108221d = fVar;
    }

    @Override // bA0.e.a
    public final void a(SmartTitleType smartTitleType, String str) {
        if (this.f108218a.get()) {
            return;
        }
        this.f108218a.set(true);
        StringBuilder sb = new StringBuilder("querySmartTitleByStyle[");
        String str2 = this.f108219b;
        sb.append(str2);
        sb.append("] failed,task is fail");
        BLog.e("BiliEditorSmartTitle", sb.toString());
        c.f108229d.d(str, smartTitleType, str2, this);
        this.f108220c.invoke("Task fail,get result failed");
    }

    @Override // bA0.e.a
    public final void b(SmartTitleType smartTitleType, String str) {
        if (this.f108218a.get()) {
            return;
        }
        this.f108218a.set(true);
        e eVar = c.f108229d;
        String str2 = this.f108219b;
        eVar.d(str, smartTitleType, str2, this);
        C4936c c4936c = c.f108228c;
        SmartTitleAITaskResult smartTitleAITaskResultB = c4936c.b(str, str2);
        if (smartTitleAITaskResultB == null) {
            E.a("querySmartTitleByStyle[", str2, "] error !!!!!!!!这种情况不应该哎～", "BiliEditorSmartTitle");
            this.f108220c.invoke("Task success,but result is null");
            return;
        }
        BLog.e("BiliEditorSmartTitle", "querySmartTitleByStyle[" + str2 + "],waiting success,return " + smartTitleAITaskResultB.titleList);
        List<String> list = smartTitleAITaskResultB.titleList;
        List<String> arrayList = list;
        if (list == null) {
            arrayList = new ArrayList();
        }
        int i7 = smartTitleAITaskResultB.code;
        Zz0.c cVar = new Zz0.c(i7, str2, arrayList);
        if (arrayList.isEmpty() || i7 != 0) {
            c4936c.e(str, str2);
        }
        this.f108221d.invoke(cVar);
    }
}
