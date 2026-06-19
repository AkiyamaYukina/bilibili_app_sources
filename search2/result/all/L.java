package com.bilibili.search2.result.all;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.api.SearchNoResultSuggestWord;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/L.class */
public final class L extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M f87142a;

    public L(M m7) {
        this.f87142a = m7;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Os0.e eVar = Os0.e.f18030a;
        Os0.e.a(Os0.e.f18030a, this.f87142a.itemView.getContext(), ((SearchNoResultSuggestWord) this.f87142a.getData()).getKeyword(), null, 0, "query_correct_keyword", null, false, null, null, null, null, null, 8128);
        String linkType = ((SearchNoResultSuggestWord) this.f87142a.getData()).getLinkType();
        String str = linkType;
        if (linkType == null) {
            str = "query-correct";
        }
        Xs0.b.i("search.search-result.search-card.all.click", null, str, (BaseSearchItem) this.f87142a.getData(), null, null, null, null, null, null, false, null, 8176);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
