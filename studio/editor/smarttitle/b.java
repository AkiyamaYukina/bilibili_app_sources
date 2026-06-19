package com.bilibili.studio.editor.smarttitle;

import Zz0.d;
import bA0.e;
import bA0.f;
import com.bilibili.studio.editor.smarttitle.constans.SmartTitleType;
import com.bilibili.upper.module.contribute.up.ai.title.h;
import com.bilibili.upper.module.contribute.up.ai.title.i;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/smarttitle/b.class */
public final class b implements e.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f108222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Zz0.a f108223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f108224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f108225d;

    public b(AtomicBoolean atomicBoolean, Zz0.a aVar, i iVar, h hVar) {
        this.f108222a = atomicBoolean;
        this.f108223b = aVar;
        this.f108224c = iVar;
        this.f108225d = hVar;
    }

    @Override // bA0.e.b
    public final void a(SmartTitleType smartTitleType) {
        BLog.e("BiliEditorSmartTitle", "querySmartTitleStyles fail ,style is error~");
        if (this.f108222a.get()) {
            return;
        }
        this.f108222a.set(true);
        f.a(c.f108229d, this.f108223b, smartTitleType, this);
        this.f108224c.invoke("Task fail,get style is fail");
    }

    @Override // bA0.e.b
    public final void b(SmartTitleType smartTitleType, String str) {
        if (this.f108222a.get()) {
            return;
        }
        this.f108222a.set(true);
        f.a(c.f108229d, this.f108223b, smartTitleType, this);
        ArrayList arrayListC = c.f108228c.c(smartTitleType, str);
        if (arrayListC.isEmpty()) {
            BLog.e("BiliEditorSmartTitle", "querySmartTitleStyles,error !!!!!!这种情况不应该哎～");
            this.f108224c.invoke("Task fail,style list is empty");
            return;
        }
        d dVar = new d(smartTitleType, str, arrayListC);
        BLog.e("BiliEditorSmartTitle", "querySmartTitleStyles,waiting finish,return " + arrayListC);
        this.f108225d.invoke(dVar);
    }
}
