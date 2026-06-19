package com.bilibili.studio.editor.moudle.templatev2.vm;

import com.bilibili.studio.editor.moudle.music.manager.MusicDownloadData;
import com.bilibili.studio.editor.moudle.music.manager.b;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/templatev2/vm/i.class */
public final class i implements b.InterfaceC1198b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellableContinuationImpl f108192a;

    public i(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f108192a = cancellableContinuationImpl;
    }

    @Override // com.bilibili.studio.editor.moudle.music.manager.b.InterfaceC1198b
    public final void a(MusicDownloadData musicDownloadData) {
        CancellableContinuationImpl cancellableContinuationImpl = this.f108192a;
        if (cancellableContinuationImpl.isActive()) {
            cancellableContinuationImpl.resumeWith(Result.constructor-impl((Object) null));
        }
    }

    @Override // com.bilibili.studio.editor.moudle.music.manager.b.InterfaceC1198b
    public final void c(MusicDownloadData musicDownloadData) {
        CancellableContinuationImpl cancellableContinuationImpl = this.f108192a;
        if (cancellableContinuationImpl.isActive()) {
            cancellableContinuationImpl.resumeWith(Result.constructor-impl((Object) null));
        }
    }

    @Override // com.bilibili.studio.editor.moudle.music.manager.b.InterfaceC1198b
    public final void d(MusicDownloadData musicDownloadData, int i7) {
    }
}
