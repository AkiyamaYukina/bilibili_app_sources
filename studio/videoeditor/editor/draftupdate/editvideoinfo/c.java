package com.bilibili.studio.videoeditor.editor.draftupdate.editvideoinfo;

import com.bilibili.studio.material.IMultiMaterialListener;
import com.bilibili.studio.material.MaterialResult;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editor/draftupdate/editvideoinfo/c.class */
public final class c implements IMultiMaterialListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellableContinuationImpl f109456a;

    public c(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f109456a = cancellableContinuationImpl;
    }

    @Override // com.bilibili.studio.material.IMultiMaterialListener
    public final void onResult(MaterialResult materialResult) {
        CancellableContinuationImpl cancellableContinuationImpl = this.f109456a;
        if (cancellableContinuationImpl.isActive()) {
            cancellableContinuationImpl.resumeWith(Result.constructor-impl(materialResult));
        }
    }
}
