package com.bilibili.search2.result.holder.chatgpt;

import android.app.Application;
import android.view.View;
import com.bapis.bilibili.app.search.v2.Action;
import com.bilibili.app.comm.list.common.widget.PromoToast;
import com.bilibili.base.BiliContext;
import lr0.C7886c;
import tv.danmaku.biliplayerv2.service.interact.biz.model.comment.CommentItem;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/chatgpt/g.class */
public final /* synthetic */ class g implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f88008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f88009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f88010c;

    public /* synthetic */ g(int i7, Object obj, Object obj2) {
        this.f88008a = i7;
        this.f88009b = obj;
        this.f88010c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.bilibili.playerbizcommonv2.danmaku.widget.q qVar;
        switch (this.f88008a) {
            case 0:
                ChatBubbleViewHolder chatBubbleViewHolder = (ChatBubbleViewHolder) this.f88009b;
                Bl.n nVar = (Bl.n) this.f88010c;
                boolean z6 = chatBubbleViewHolder.f87910f;
                chatBubbleViewHolder.f87910f = !z6;
                if (z6) {
                    nVar.b.setImageResource(2131236133);
                } else {
                    nVar.b.setImageResource(2131236109);
                }
                boolean z7 = chatBubbleViewHolder.f87911g;
                SearchChatGptHolder searchChatGptHolder = chatBubbleViewHolder.f87907c;
                if (z7 && chatBubbleViewHolder.f87910f) {
                    chatBubbleViewHolder.f87911g = false;
                    nVar.c.setImageResource(2131236134);
                    searchChatGptHolder.x0("cancel-like");
                }
                int i7 = chatBubbleViewHolder.f87910f ? 2131841402 : 2131847681;
                Application application = BiliContext.application();
                Application application2 = BiliContext.application();
                PromoToast.showBottomToast(application, application2 != null ? application2.getString(i7) : null);
                chatBubbleViewHolder.q0(nVar);
                if (!chatBubbleViewHolder.f87910f) {
                    searchChatGptHolder.x0("cancel-dislike");
                    chatBubbleViewHolder.r0(Action.ACTION_CANCEL_DISLIKE);
                } else {
                    searchChatGptHolder.x0("dislike");
                    chatBubbleViewHolder.r0(Action.ACTION_DISLIKE);
                }
                break;
            default:
                CommentItem commentItem = (CommentItem) this.f88009b;
                C7886c.a aVar = (C7886c.a) this.f88010c;
                if (OW.b.a(commentItem) && (qVar = aVar.f123333b) != null) {
                    qVar.r(commentItem);
                    break;
                }
                break;
        }
    }
}
