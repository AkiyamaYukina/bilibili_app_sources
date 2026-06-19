package com.bilibili.search2.result.holder.chatgpt;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.search2.result.holder.chatgpt.api.SearchChatGptItem;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/chatgpt/t.class */
public final /* synthetic */ class t implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SearchChatGptHolder f88045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bl.o f88046b;

    public /* synthetic */ t(SearchChatGptHolder searchChatGptHolder, Bl.o oVar) {
        this.f88045a = searchChatGptHolder;
        this.f88046b = oVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SearchChatGptHolder searchChatGptHolder = this.f88045a;
        final Bl.o oVar = this.f88046b;
        searchChatGptHolder.x0("refresh");
        searchChatGptHolder.z0(searchChatGptHolder.f87944n, true);
        ((SearchChatGptItem) searchChatGptHolder.getData()).setSessionId(null);
        searchChatGptHolder.f87941k = true;
        ((SearchChatGptItem) searchChatGptHolder.getData()).setCurrentState(0);
        ((SearchChatGptItem) searchChatGptHolder.getData()).setAutoExpand(false);
        ListExtentionsKt.gone(oVar.c);
        searchChatGptHolder.v0();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(oVar.d.getHeight(), 0);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(oVar) { // from class: com.bilibili.search2.result.holder.chatgpt.p

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Bl.o f88035a;

            {
                this.f88035a = oVar;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Bl.o oVar2 = this.f88035a;
                ViewGroup.LayoutParams layoutParams = oVar2.d.getLayoutParams();
                Object animatedValue = valueAnimator.getAnimatedValue();
                Integer num = animatedValue instanceof Integer ? (Integer) animatedValue : null;
                layoutParams.height = num != null ? num.intValue() : 0;
                oVar2.d.requestLayout();
            }
        });
        valueAnimatorOfInt.addListener(new v(searchChatGptHolder, oVar));
        valueAnimatorOfInt.setDuration(100L);
        valueAnimatorOfInt.start();
    }
}
