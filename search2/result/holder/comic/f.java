package com.bilibili.search2.result.holder.comic;

import android.content.Context;
import android.view.View;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.api.SearchComicItem;
import com.bilibili.search2.result.holder.comic.k;
import com.bilibili.studio.videoeditor.capturev3.dialog.ConfirmationDialog;
import com.bilibili.upper.module.manuscript.activity.ManuscriptProgressDetailsActivity;
import eJ0.H;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/comic/f.class */
public final /* synthetic */ class f implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f88094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f88095b;

    public /* synthetic */ f(Object obj, int i7) {
        this.f88094a = i7;
        this.f88095b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [Z7.c, androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bilibili.search2.result.holder.comic.k, dt0.b, dt0.f] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f88094a) {
            case 0:
                ?? r02 = (k) this.f88095b;
                String linkType = ((SearchComicItem) r02.getData()).getLinkType();
                String str = linkType;
                if (linkType == null) {
                    str = "";
                }
                Xs0.b.i("search.search-result.search-card.all.click", "", str, (BaseSearchItem) r02.getData(), null, null, Xs0.b.b(((SearchComicItem) r02.getData()).getLinkType(), "threepoint"), null, null, null, false, null, 6144);
                com.bilibili.search2.share.r.l(com.bilibili.search2.share.r.f88699a, r02, r02.itemView.getContext(), new k.a(r02, r02.getFragment() != null ? r02.getFragment().p3() : null), false, 20);
                break;
            case 1:
                ManuscriptProgressDetailsActivity manuscriptProgressDetailsActivity = (ManuscriptProgressDetailsActivity) this.f88095b;
                int i7 = ManuscriptProgressDetailsActivity.f113427E1;
                TE0.b bVar = TE0.b.f24088a;
                long j7 = manuscriptProgressDetailsActivity.f113486w1;
                long j8 = manuscriptProgressDetailsActivity.y1;
                int iR6 = manuscriptProgressDetailsActivity.R6();
                bVar.getClass();
                TE0.b.q0(j7, j8, iR6, "稿件审核", "直接开放");
                ConfirmationDialog confirmationDialog = new ConfirmationDialog();
                confirmationDialog.f109123c = manuscriptProgressDetailsActivity.getString(2131855720);
                confirmationDialog.f109124d = manuscriptProgressDetailsActivity.P6().f113695r;
                confirmationDialog.h = manuscriptProgressDetailsActivity.getString(2131851249);
                confirmationDialog.f109126f = manuscriptProgressDetailsActivity.getString(2131855719);
                confirmationDialog.m10421if(new com.bilibili.bililive.media.composition.chain.d(manuscriptProgressDetailsActivity, 1));
                confirmationDialog.jf(manuscriptProgressDetailsActivity.getSupportFragmentManager());
                break;
            default:
                H.a(2131851167, (Context) this.f88095b);
                break;
        }
    }
}
