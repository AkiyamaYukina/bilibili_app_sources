package com.bilibili.studio.editor.moudle.editormain.ui.fragments.sticker.vm;

import com.bilibili.studio.editor.moudle.sticker.v1.EditStickerItem;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/sticker/vm/b.class */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f106988a;

    public /* synthetic */ b(a aVar) {
        this.f106988a = aVar;
    }

    public final Object invoke(Object obj) {
        return BiliEditorStickerListViewModel$handleDownloadStickerV2$1.invokeSuspend$lambda$0(this.f106988a, (EditStickerItem) obj);
    }
}
