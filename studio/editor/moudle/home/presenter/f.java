package com.bilibili.studio.editor.moudle.home.presenter;

import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/home/presenter/f.class */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditVideoInfo f107238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f107239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Jk0.c f107240c;

    public /* synthetic */ f(EditVideoInfo editVideoInfo, j jVar, Jk0.c cVar) {
        this.f107238a = editVideoInfo;
        this.f107239b = jVar;
        this.f107240c = cVar;
    }

    public final Object invoke(Object obj) {
        String str = (String) obj;
        EditVideoInfo editVideoInfo = this.f107238a;
        editVideoInfo.setRecMusicSids(str);
        this.f107239b.a(editVideoInfo);
        this.f107240c.invoke(str);
        return Unit.INSTANCE;
    }
}
