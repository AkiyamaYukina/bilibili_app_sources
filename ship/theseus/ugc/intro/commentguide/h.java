package com.bilibili.ship.theseus.ugc.intro.commentguide;

import com.bilibili.app.comm.comment2.model.BiliCommentAddResult;
import com.bilibili.okretro.BiliApiCallback;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.ship.theseus.united.utils.q;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/commentguide/h.class */
public final class h extends BiliApiCallback<GeneralResponse<BiliCommentAddResult>> {
    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        String message = th != null ? th.getMessage() : null;
        defpackage.a.b("onSendComment error, ", message, "CommentGuideService");
        if (message == null || StringsKt.isBlank(message)) {
            return;
        }
        q.c(message);
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onSuccess(GeneralResponse<BiliCommentAddResult> generalResponse) {
        BiliCommentAddResult biliCommentAddResult;
        GeneralResponse<BiliCommentAddResult> generalResponse2 = generalResponse;
        String str = (generalResponse2 == null || (biliCommentAddResult = generalResponse2.data) == null) ? null : biliCommentAddResult.message;
        defpackage.a.b("onSendComment success, ", str, "CommentGuideService");
        if (str == null || StringsKt.isBlank(str)) {
            return;
        }
        q.c(str);
    }
}
