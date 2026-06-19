package com.bilibili.playerbizcommonv2.danmaku.widget;

import com.bilibili.api.BiliApiException;
import com.bilibili.okretro.BiliApiDataCallback;
import kotlin.Lazy;
import tv.danmaku.biliplayerv2.service.interact.biz.model.comment.CommentItem;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/widget/r.class */
public final class r extends BiliApiDataCallback<Void> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f81693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CommentItem f81694c;

    public r(q qVar, CommentItem commentItem) {
        this.f81693b = qVar;
        this.f81694c = commentItem;
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final boolean isCancel() {
        return this.f81693b.f81683q == null;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(Void r52) {
        CommentItem commentItem = this.f81694c;
        q qVar = this.f81693b;
        qVar.s(commentItem);
        boolean z6 = commentItem.mRecommended;
        commentItem.mRecommended = !z6;
        if (z6) {
            commentItem.likes--;
        } else {
            commentItem.likes++;
        }
        int iIndexOf = qVar.f81684r.indexOf(commentItem);
        if (iIndexOf >= 0) {
            qVar.f81683q.notifyItemChanged(iIndexOf);
        }
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        boolean z6 = th instanceof BiliApiException;
        q qVar = this.f81693b;
        if (z6) {
            qVar.z(th.getMessage());
        } else {
            Lazy<String> lazy = q.f81673x;
            qVar.z(qVar.getMContext().getString(2131841697));
        }
    }
}
