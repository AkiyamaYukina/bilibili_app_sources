package com.bilibili.search2.result.holder.recommend;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.biligame.api.BiligameMainGame;
import com.bilibili.biligame.report3.ReporterV3;
import com.bilibili.biligame.router.BiligameRouterHelper;
import com.bilibili.search2.result.holder.recommend.SearchRelatedAuthorAdapter;
import kotlin.TuplesKt;
import ro.f;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/recommend/g.class */
public final /* synthetic */ class g implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f88178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f88179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecyclerView.ViewHolder f88180c;

    public /* synthetic */ g(int i7, RecyclerView.ViewHolder viewHolder, Object obj) {
        this.f88178a = i7;
        this.f88179b = obj;
        this.f88180c = viewHolder;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f88178a) {
            case 0:
                SearchRelatedAuthorAdapter.SearchRelatedAuthorItem1Holder._init_$lambda$0((SearchRelatedAuthorAdapter) this.f88179b, (SearchRelatedAuthorAdapter.SearchRelatedAuthorItem1Holder) this.f88180c, view);
                break;
            default:
                ro.c cVar = (ro.c) this.f88179b;
                f.a aVar = (f.a) this.f88180c;
                Object tag = view.getTag();
                BiligameMainGame biligameMainGame = tag instanceof BiligameMainGame ? (BiligameMainGame) tag : null;
                if (biligameMainGame != null) {
                    ReporterV3.reportClick("reserved", "reserved-succeed-windows", "game-recommend-view", cVar.w(TuplesKt.to("rec_game_base_id", String.valueOf(biligameMainGame.gameBaseId)), TuplesKt.to("button_name", aVar.f126783i.getGameActionButtonText(biligameMainGame)), TuplesKt.to("game_status", String.valueOf(biligameMainGame.androidGameStatus))));
                    BiligameRouterHelper.openGameDetail(view.getContext(), biligameMainGame.gameBaseId);
                    cVar.dismiss();
                    break;
                }
                break;
        }
    }
}
