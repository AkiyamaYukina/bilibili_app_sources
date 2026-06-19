package com.bilibili.search2.result.holder.chatgpt;

import android.app.Application;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.bapis.bilibili.app.search.v2.Action;
import com.bilibili.app.comm.list.common.widget.PromoToast;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.playerbizcommon.IVideoLikeRouteService;
import lr0.C7886c;
import tv.danmaku.biliplayerv2.service.interact.biz.model.comment.CommentItem;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/chatgpt/f.class */
public final /* synthetic */ class f implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f88005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RecyclerView.ViewHolder f88006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f88007c;

    public /* synthetic */ f(int i7, RecyclerView.ViewHolder viewHolder, Object obj) {
        this.f88005a = i7;
        this.f88006b = viewHolder;
        this.f88007c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f88005a) {
            case 0:
                ChatBubbleViewHolder chatBubbleViewHolder = (ChatBubbleViewHolder) this.f88006b;
                Bl.n nVar = (Bl.n) this.f88007c;
                boolean z6 = chatBubbleViewHolder.f87911g;
                chatBubbleViewHolder.f87911g = !z6;
                if (z6) {
                    nVar.c.setImageResource(2131236134);
                } else {
                    nVar.c.setImageResource(2131236127);
                    nVar.c.setImageTintList(R$color.Brand_pink);
                }
                boolean z7 = chatBubbleViewHolder.f87911g;
                SearchChatGptHolder searchChatGptHolder = chatBubbleViewHolder.f87907c;
                if (z7 && chatBubbleViewHolder.f87910f) {
                    chatBubbleViewHolder.f87910f = false;
                    nVar.b.setImageResource(2131236133);
                    searchChatGptHolder.x0("cancel-dislike");
                }
                int i7 = chatBubbleViewHolder.f87911g ? 2131841402 : 2131847887;
                Application application = BiliContext.application();
                Application application2 = BiliContext.application();
                PromoToast.showBottomToast(application, application2 != null ? application2.getString(i7) : null);
                chatBubbleViewHolder.q0(nVar);
                if (!chatBubbleViewHolder.f87911g) {
                    searchChatGptHolder.x0("cancel-like");
                    chatBubbleViewHolder.r0(Action.ACTION_CANCEL_LIKE);
                } else {
                    LottieAnimationView lottieAnimationView = nVar.e;
                    ListExtentionsKt.visible(lottieAnimationView);
                    if (MultipleThemeUtils.isNightTheme(chatBubbleViewHolder.itemView.getContext())) {
                        lottieAnimationView.setAnimation("chat_gpt_like_lottie_night.json");
                    } else {
                        lottieAnimationView.setAnimation("chat_gpt_like_lottie.json");
                    }
                    lottieAnimationView.addAnimatorListener(chatBubbleViewHolder.f87912i);
                    lottieAnimationView.playAnimation();
                    searchChatGptHolder.x0(IVideoLikeRouteService.ACTION_LIKE);
                    chatBubbleViewHolder.r0(Action.ACTION_LIKE);
                }
                break;
            default:
                C7886c.a aVar = (C7886c.a) this.f88006b;
                CommentItem commentItem = (CommentItem) this.f88007c;
                com.bilibili.playerbizcommonv2.danmaku.widget.q qVar = aVar.f123333b;
                if (qVar != null) {
                    qVar.w(view, commentItem);
                }
                break;
        }
    }
}
