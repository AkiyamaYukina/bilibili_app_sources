package com.bilibili.studio.videoeditor.editor.draftupdate.editvideoinfo;

import com.bilibili.studio.material.IMultiMaterialListener;
import com.bilibili.studio.material.MaterialResult;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editor/draftupdate/editvideoinfo/i.class */
public final class i implements IMultiMaterialListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellableContinuationImpl f109460a;

    public i(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f109460a = cancellableContinuationImpl;
    }

    @Override // com.bilibili.studio.material.IMultiMaterialListener
    public final void onResult(MaterialResult materialResult) {
        CancellableContinuationImpl cancellableContinuationImpl = this.f109460a;
        if (cancellableContinuationImpl.isActive()) {
            cancellableContinuationImpl.resumeWith(Result.constructor-impl(materialResult));
        }
    }
}
