package com.bilibili.studio.editor.moudle.home.presenter;

import Ky0.q0;
import com.bilibili.studio.editor.moudle.music.manager.musicrec.EditorAIRecResult;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/home/presenter/h.class */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditVideoInfo f107243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f107244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q0 f107245c;

    public /* synthetic */ h(EditVideoInfo editVideoInfo, j jVar, q0 q0Var) {
        this.f107243a = editVideoInfo;
        this.f107244b = jVar;
        this.f107245c = q0Var;
    }

    public final Object invoke(Object obj) {
        EditorAIRecResult editorAIRecResult = (EditorAIRecResult) obj;
        String str = editorAIRecResult.materialLabel;
        EditVideoInfo editVideoInfo = this.f107243a;
        editVideoInfo.setImageLabels(str);
        editVideoInfo.setSmartTitleLabel(editorAIRecResult);
        this.f107244b.a(editVideoInfo);
        this.f107245c.invoke(editorAIRecResult);
        return Unit.INSTANCE;
    }
}
