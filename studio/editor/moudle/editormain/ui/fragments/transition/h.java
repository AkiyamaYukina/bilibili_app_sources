package com.bilibili.studio.editor.moudle.editormain.ui.fragments.transition;

import com.bilibili.studio.videoeditor.bean.EditorMaterialEntity;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/transition/h.class */
public final class h implements Function1<EditorMaterialEntity, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellableContinuationImpl f107058a;

    public h(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f107058a = cancellableContinuationImpl;
    }

    public final Object invoke(Object obj) {
        EditorMaterialEntity editorMaterialEntity = (EditorMaterialEntity) obj;
        CancellableContinuationImpl cancellableContinuationImpl = this.f107058a;
        if (cancellableContinuationImpl.isActive()) {
            Result.Companion companion = Result.Companion;
            cancellableContinuationImpl.resumeWith(Result.constructor-impl(editorMaterialEntity.transWithCategory));
        }
        return Unit.INSTANCE;
    }
}
