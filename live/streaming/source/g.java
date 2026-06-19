package com.bilibili.live.streaming.source;

import android.graphics.Bitmap;
import com.bapis.bilibili.main.community.reply.v1.ReplyMoss;
import com.bapis.bilibili.main.community.reply.v1.UserCallbackAction;
import com.bapis.bilibili.main.community.reply.v1.UserCallbackReq;
import com.bapis.bilibili.main.community.reply.v1.UserCallbackScene;
import com.bilibili.app.comm.comment2.comments.view.S;
import com.bilibili.app.comm.comment2.comments.viewmodel.u;
import com.bilibili.app.comm.comment2.model.BiliComment;
import com.bilibili.app.comm.comment2.model.BiliCommentHotInsert;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.live.streaming.callback.LoadImageCallback;
import com.bilibili.live.streaming.gl.BGLException;
import java.lang.ref.WeakReference;
import vg.H;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/source/g.class */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f65396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f65397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f65398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f65399d;

    public /* synthetic */ g(Object obj, int i7, Object obj2, Object obj3) {
        this.f65396a = i7;
        this.f65397b = obj;
        this.f65398c = obj2;
        this.f65399d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() throws BGLException {
        switch (this.f65396a) {
            case 0:
                SlideSource.loadBitmap$lambda$9((SlideSource) this.f65397b, (Bitmap) this.f65398c, (LoadImageCallback) this.f65399d);
                break;
            default:
                u uVar = (u) this.f65397b;
                BiliCommentHotInsert biliCommentHotInsert = (BiliCommentHotInsert) this.f65398c;
                S s7 = (S) this.f65399d;
                long jMid = BiliAccounts.get(((com.bilibili.app.comm.comment2.comments.viewmodel.c) uVar).a).mid();
                BiliComment biliComment = uVar.O;
                long j7 = biliComment.mOid;
                long j8 = biliComment.mRpId;
                long j9 = biliComment.mType;
                H h = new H(uVar, uVar.h(biliCommentHotInsert, s7));
                ReplyMoss replyMoss = Ig.a.a;
                Ig.a.a.userCallback(UserCallbackReq.newBuilder().setMid(jMid).setOid(j7).setType(j9).addRpids(j8).setAction(UserCallbackAction.Dismiss).setScene(UserCallbackScene.Insert).build(), new Ig.d(new WeakReference(h)));
                break;
        }
    }
}
