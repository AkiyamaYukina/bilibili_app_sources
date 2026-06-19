package com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.vm;

import com.bilibili.studio.editor.moudle.caption.v1.CaptionListItem;
import dx0.InterfaceC6890a;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/vm/A.class */
public final class A implements InterfaceC6890a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellableContinuationImpl f106642a;

    public A(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f106642a = cancellableContinuationImpl;
    }

    @Override // dx0.InterfaceC6890a
    public final void c(CaptionListItem captionListItem) {
        CancellableContinuationImpl cancellableContinuationImpl = this.f106642a;
        if (cancellableContinuationImpl.isActive()) {
            Result.Companion companion = Result.Companion;
            cancellableContinuationImpl.resumeWith(Result.constructor-impl(Boolean.TRUE));
        }
    }

    @Override // dx0.InterfaceC6890a
    public final void onCancel() {
        CancellableContinuationImpl cancellableContinuationImpl = this.f106642a;
        if (cancellableContinuationImpl.isActive()) {
            Result.Companion companion = Result.Companion;
            cancellableContinuationImpl.resumeWith(Result.constructor-impl(Boolean.FALSE));
        }
    }
}
