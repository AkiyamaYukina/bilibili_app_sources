package com.bilibili.search2.result.holder.chatgpt;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.search2.result.holder.chatgpt.SearchChatGptHolder;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/chatgpt/u.class */
public final class u extends RecyclerView.ItemDecoration {
    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        SearchChatGptHolder.a aVar = SearchChatGptHolder.f87922q;
        rect.bottom = SearchChatGptHolder.f87929x;
    }
}
