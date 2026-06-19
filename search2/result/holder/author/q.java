package com.bilibili.search2.result.holder.author;

import Yt0.C3163q;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.search2.inline.Option;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/author/q.class */
public final class q extends C3163q {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final InlineSettingBottomDialog f87890I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(InlineSettingBottomDialog inlineSettingBottomDialog, int i7, int i8, int i9) {
        super(i7, i8, i9, 0, false, null, false, false, 1008);
        this.f87890I = inlineSettingBottomDialog;
    }

    @Override // Yt0.C3163q
    public final boolean needDrawDivider(RecyclerView.ViewHolder viewHolder) {
        int layoutPosition = viewHolder.getLayoutPosition();
        List<Option> list = this.f87890I.f87815j;
        return layoutPosition != (list != null ? list.size() : -1);
    }
}
