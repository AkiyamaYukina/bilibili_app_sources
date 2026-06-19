package com.bilibili.studio.editor.moudle.home.presenter;

import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/home/presenter/c.class */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditVideoInfo f107232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f107233b;

    public /* synthetic */ c(j jVar, EditVideoInfo editVideoInfo) {
        this.f107232a = editVideoInfo;
        this.f107233b = jVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        int iIntValue = ((Integer) obj).intValue();
        int iIntValue2 = ((Integer) obj2).intValue();
        EditVideoInfo editVideoInfo = this.f107232a;
        editVideoInfo.setFrameExtractCount(iIntValue);
        editVideoInfo.setFrameUploadCount(iIntValue2);
        this.f107233b.a(editVideoInfo);
        return Unit.INSTANCE;
    }
}
