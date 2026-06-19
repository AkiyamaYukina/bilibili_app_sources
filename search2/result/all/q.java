package com.bilibili.search2.result.all;

import Bl.A0;
import Bl.B0;
import Bl.C0;
import Bl.D0;
import Bl.E0;
import Bl.F0;
import Bl.G0;
import Bl.H0;
import Bl.I0;
import Bl.J0;
import Bl.L0;
import Bl.M0;
import Bl.O0;
import Bl.P;
import Bl.P0;
import Bl.Q;
import Bl.S;
import Bl.T0;
import Bl.U;
import Bl.V;
import Bl.W;
import Bl.X;
import Bl.Z;
import Bl.a0;
import Bl.b0;
import Bl.d0;
import Bl.e0;
import Bl.h0;
import Bl.h1;
import Bl.j0;
import Bl.m1;
import Bl.n0;
import Bl.q0;
import Bl.q1;
import Bl.r0;
import Bl.r1;
import Bl.s1;
import Bl.t0;
import Bl.t1;
import Bl.u0;
import Bl.u1;
import Bl.v1;
import Bl.w0;
import Bl.x0;
import Bl.y0;
import Bl.z0;
import Ps0.C2801w;
import Ps0.C2802x;
import Ps0.O;
import Ps0.T;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import at0.C4907b;
import bt0.C5160j;
import bt0.C5161k;
import bt0.C5164n;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.search2.api.SearchAuthorNew;
import com.bilibili.search2.api.SearchBangumiItem;
import com.bilibili.search2.api.SearchCollectionItem;
import com.bilibili.search2.api.SearchComicItem;
import com.bilibili.search2.api.SearchDynamicItem;
import com.bilibili.search2.api.SearchEncyclopediasItem;
import com.bilibili.search2.api.SearchGameItem;
import com.bilibili.search2.api.SearchHotItem;
import com.bilibili.search2.api.SearchLiveInline;
import com.bilibili.search2.api.SearchLiveItem;
import com.bilibili.search2.api.SearchNewChannel;
import com.bilibili.search2.api.SearchNoResultSuggestWord;
import com.bilibili.search2.api.SearchNpsItem;
import com.bilibili.search2.api.SearchOgvChannelItem;
import com.bilibili.search2.api.SearchOgvInline;
import com.bilibili.search2.api.SearchOgvRelationItem;
import com.bilibili.search2.api.SearchOlympicGame;
import com.bilibili.search2.api.SearchPurchaseItem;
import com.bilibili.search2.api.SearchRecommendTipItem;
import com.bilibili.search2.api.SearchSpecialGuideItem;
import com.bilibili.search2.api.SearchSpecialItem;
import com.bilibili.search2.api.SearchSportInlineItem;
import com.bilibili.search2.api.SearchSportItem;
import com.bilibili.search2.api.SearchStarItem;
import com.bilibili.search2.api.SearchTipsItem;
import com.bilibili.search2.api.SearchTopGame;
import com.bilibili.search2.api.SearchTopicItem;
import com.bilibili.search2.api.SearchUgcInline;
import com.bilibili.search2.api.SearchVideoItem;
import com.bilibili.search2.result.ArticleHolderV3;
import com.bilibili.search2.result.bangumi.C6066f;
import com.bilibili.search2.result.bangumi.C6072l;
import com.bilibili.search2.result.holder.aichat.SearchAIChatHolder;
import com.bilibili.search2.result.holder.aichat.SearchAIChatItem;
import com.bilibili.search2.result.holder.chatgpt.SearchChatGptHolder;
import com.bilibili.search2.result.holder.chatgpt.api.SearchChatGptItem;
import com.bilibili.search2.result.holder.comic.ComicNewHolder;
import com.bilibili.search2.result.holder.comment.CommentHolder;
import com.bilibili.search2.result.holder.dynamic.DynamicFeedHolderV3;
import com.bilibili.search2.result.holder.recommend.SearchUPRecommendItem;
import com.bilibili.search2.result.holder.ugcinline.SearchUgcInlineNewHolder;
import ct0.C6756a;
import dt0.AbstractC6843f;
import et0.ViewOnClickListenerC6974a;
import gt0.C7378a;
import ht0.C7502d;
import it0.C7616b;
import it0.C7618d;
import java.util.HashMap;
import jt0.C7723a;
import lt0.ViewOnClickListenerC7891b;
import nt0.C8141a;
import ot0.C8265d;
import pt0.C8353a;
import pt0.C8354b;
import qt0.C8485d;
import tt0.C8691c;
import ut0.AbstractC8763d;
import ut0.AbstractC8764e;
import ut0.C8761b;
import ut0.C8762c;
import ut0.C8765f;
import ut0.C8766g;
import vt0.C8859a;
import xt0.C9006a;
import xt0.C9007b;
import xt0.C9008c;
import yt0.C9095h;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/q.class */
public final class q extends Z7.g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile q f87311e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseArray<Z7.e> f87312d = new SparseArray<>();

    public q() {
        HashMap map = new HashMap();
        try {
            c(ArticleHolderV3.class, "article_new");
            map.put("article_new", com.bilibili.search2.api.c.class);
            c(ViewOnClickListenerC6054h.class, "live");
            map.put("live", SearchLiveItem.class);
            c(J.class, "special_guide");
            map.put("special_guide", SearchSpecialGuideItem.class);
            c(M.class, "suggest_keyword");
            map.put("suggest_keyword", SearchNoResultSuggestWord.class);
            c(N.class, "special");
            map.put("special", SearchSpecialItem.class);
            c(C6066f.class, "bangumi");
            c(C6066f.class, "movie");
            map.put("bangumi", SearchBangumiItem.class);
            map.put("movie", SearchBangumiItem.class);
            c(C6072l.class, "bangumi_p");
            c(C6072l.class, "movie_p");
            map.put("bangumi_p", SearchBangumiItem.class);
            map.put("movie_p", SearchBangumiItem.class);
            c(com.bilibili.search2.result.bangumi.E.class, "ogv_channel");
            map.put("ogv_channel", SearchOgvChannelItem.class);
            c(com.bilibili.search2.result.bangumi.L.class, "ogv_channel_p");
            map.put("ogv_channel_p", SearchOgvChannelItem.class);
            c(SearchAIChatHolder.class, "ai_chat");
            map.put("ai_chat", SearchAIChatItem.class);
            c(Zs0.c.class, "article_new_p");
            map.put("article_new_p", com.bilibili.search2.api.c.class);
            c(C4907b.class, "alienation_card");
            map.put("alienation_card", C2801w.class);
            c(com.bilibili.search2.result.holder.author.g.class, "author_new");
            map.put("author_new", SearchAuthorNew.class);
            c(C5161k.class, "pedia_card_pic");
            map.put("pedia_card_pic", SearchEncyclopediasItem.class);
            c(C5160j.class, "pedia_card_pic_v3_view_type");
            map.put("pedia_card_pic_v3_view_type", SearchEncyclopediasItem.class);
            c(C5164n.class, "pedia_card_pic_v2_view_type");
            map.put("pedia_card_pic_v2_view_type", Ps0.B.class);
            c(C6756a.class, "banner_card");
            map.put("banner_card", C2802x.class);
            c(ViewOnClickListenerC6974a.class, "channel_new");
            map.put("channel_new", SearchNewChannel.class);
            c(SearchChatGptHolder.class, "chat_gpt");
            c(SearchChatGptHolder.class, "qa");
            map.put("chat_gpt", SearchChatGptItem.class);
            map.put("qa", SearchChatGptItem.class);
            c(com.bilibili.search2.result.holder.collection.j.class, "collection_card");
            c(com.bilibili.search2.result.holder.collection.j.class, "playlist_card");
            c(com.bilibili.search2.result.holder.collection.j.class, "series_card");
            map.put("collection_card", SearchCollectionItem.class);
            map.put("playlist_card", SearchCollectionItem.class);
            map.put("series_card", SearchCollectionItem.class);
            c(ComicNewHolder.class, "comic");
            map.put("comic", SearchComicItem.class);
            c(com.bilibili.search2.result.holder.comic.k.class, "comic_p");
            map.put("comic_p", SearchComicItem.class);
            c(CommentHolder.class, "comment");
            map.put("comment", ft0.k.class);
            c(ft0.i.class, "comment_cluster");
            map.put("comment_cluster", Ps0.z.class);
            c(C7378a.class, "digital_chat");
            map.put("digital_chat", Ps0.A.class);
            c(DynamicFeedHolderV3.class, "twitter_new");
            map.put("twitter_new", SearchDynamicItem.class);
            c(C7502d.class, "twitter_new_p");
            map.put("twitter_new_p", SearchDynamicItem.class);
            c(C7616b.class, "cheese");
            map.put("cheese", C7618d.class);
            c(C7723a.class, "esports_inline");
            map.put("esports_inline", SearchSportInlineItem.class);
            c(kt0.h.class, "esport");
            c(kt0.h.class, "sports_versus");
            map.put("esport", SearchSportItem.class);
            map.put("sports_versus", SearchSportItem.class);
            c(com.bilibili.search2.result.holder.fold.d.class, "fold");
            map.put("fold", Ps0.D.class);
            c(ViewOnClickListenerC7891b.class, "game");
            map.put("game", SearchGameItem.class);
            c(mt0.d.class, "article_giant_card");
            c(mt0.d.class, "twitter_giant_card");
            map.put("article_giant_card", com.bilibili.search2.api.e.class);
            map.put("twitter_giant_card", com.bilibili.search2.api.e.class);
            c(C8141a.class, "hot_banner");
            map.put("hot_banner", SearchHotItem.class);
            c(C8265d.class, "live_inline");
            map.put("live_inline", SearchLiveInline.class);
            c(C8353a.class, "music_card_p");
            map.put("music_card_p", com.bilibili.search2.api.f.class);
            c(C8354b.class, "music_card");
            map.put("music_card", com.bilibili.search2.api.f.class);
            c(C8485d.class, "nps");
            map.put("nps", SearchNpsItem.class);
            c(rt0.e.class, "ogv_inline");
            map.put("ogv_inline", SearchOgvInline.class);
            c(st0.c.class, "sports");
            map.put("sports", SearchOlympicGame.class);
            c(C8691c.class, "double_opus");
            map.put("double_opus", O.class);
            c(C8766g.class, "ticket_p");
            map.put("ticket_p", SearchPurchaseItem.class);
            c(C8762c.class, "product_p");
            map.put("product_p", SearchPurchaseItem.class);
            c(C8765f.class, "ticket");
            map.put("ticket", SearchPurchaseItem.class);
            c(C8761b.class, "product");
            map.put("product", SearchPurchaseItem.class);
            c(com.bilibili.search2.result.holder.recommend.o.class, "related_search");
            c(com.bilibili.search2.result.holder.recommend.o.class, "query_rec_afterclick");
            map.put("related_search", com.bilibili.search2.result.holder.recommend.p.class);
            map.put("query_rec_afterclick", com.bilibili.search2.result.holder.recommend.p.class);
            c(com.bilibili.search2.result.holder.recommend.q.class, "up_recommend");
            map.put("up_recommend", SearchUPRecommendItem.class);
            c(com.bilibili.search2.result.holder.special.b.class, "special_s");
            map.put("special_s", SearchSpecialItem.class);
            c(com.bilibili.search2.result.holder.special.g.class, "special_s_p");
            map.put("special_s_p", SearchSpecialItem.class);
            c(C8859a.class, "star_banner");
            map.put("star_banner", SearchStarItem.class);
            c(wt0.b.class, "time_line");
            map.put("time_line", T.class);
            c(C9006a.class, "hot_recommend");
            map.put("hot_recommend", SearchRecommendTipItem.class);
            c(C9007b.class, "recommend_tips");
            map.put("recommend_tips", SearchRecommendTipItem.class);
            c(C9008c.class, "tips");
            map.put("tips", SearchTipsItem.class);
            c(C9095h.class, "top_game");
            map.put("top_game", SearchTopGame.class);
            c(zt0.c.class, "subject");
            map.put("subject", SearchTopicItem.class);
            c(zt0.d.class, "subject_p");
            map.put("subject_p", SearchTopicItem.class);
            c(At0.f.class, "tribee_card");
            map.put("tribee_card", com.bilibili.search2.api.h.class);
            c(Bt0.g.class, "double_column");
            map.put("double_column", com.bilibili.search2.api.d.class);
            c(Bt0.p.class, "av");
            map.put("av", SearchVideoItem.class);
            c(SearchUgcInlineNewHolder.class, "ugc_inline");
            map.put("ugc_inline", SearchUgcInline.class);
            c(com.bilibili.search2.result.ogv.aggregate.w.class, "ogv_cluster_card");
            map.put("ogv_cluster_card", com.bilibili.search2.api.g.class);
            c(Gt0.b.class, "bangumi_relates");
            map.put("bangumi_relates", SearchOgvRelationItem.class);
        } catch (Exception e7) {
            throw new UnsupportedOperationException("create layout provider failed, ensure the LayoutProvider has a no arguments constructor", e7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v165 */
    /* JADX WARN: Type inference failed for: r0v168, types: [Z7.c] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37 */
    /* JADX WARN: Type inference failed for: r9v38 */
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v41 */
    /* JADX WARN: Type inference failed for: r9v42 */
    /* JADX WARN: Type inference failed for: r9v43 */
    /* JADX WARN: Type inference failed for: r9v44 */
    /* JADX WARN: Type inference failed for: r9v45 */
    /* JADX WARN: Type inference failed for: r9v46 */
    /* JADX WARN: Type inference failed for: r9v47 */
    /* JADX WARN: Type inference failed for: r9v48 */
    /* JADX WARN: Type inference failed for: r9v49 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v50 */
    /* JADX WARN: Type inference failed for: r9v51 */
    /* JADX WARN: Type inference failed for: r9v52 */
    /* JADX WARN: Type inference failed for: r9v53 */
    /* JADX WARN: Type inference failed for: r9v54 */
    /* JADX WARN: Type inference failed for: r9v55 */
    /* JADX WARN: Type inference failed for: r9v56 */
    /* JADX WARN: Type inference failed for: r9v57 */
    /* JADX WARN: Type inference failed for: r9v58 */
    /* JADX WARN: Type inference failed for: r9v59 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v60 */
    /* JADX WARN: Type inference failed for: r9v61 */
    /* JADX WARN: Type inference failed for: r9v62 */
    /* JADX WARN: Type inference failed for: r9v63 */
    /* JADX WARN: Type inference failed for: r9v64 */
    /* JADX WARN: Type inference failed for: r9v65 */
    /* JADX WARN: Type inference failed for: r9v66 */
    /* JADX WARN: Type inference failed for: r9v67 */
    /* JADX WARN: Type inference failed for: r9v68 */
    /* JADX WARN: Type inference failed for: r9v69 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v70, types: [com.bilibili.search2.result.all.J, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v71 */
    /* JADX WARN: Type inference failed for: r9v72 */
    /* JADX WARN: Type inference failed for: r9v73 */
    /* JADX WARN: Type inference failed for: r9v74 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final Z7.c a(int i7, ViewGroup viewGroup) {
        ?? oVar;
        this.f87312d.get(i7).getClass();
        this.f87312d.get(i7).getClass();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i7 == b("article_new")) {
            oVar = new ArticleHolderV3(Bl.N.inflate(layoutInflaterFrom, viewGroup, false));
        } else if (i7 == b("live")) {
            oVar = new ViewOnClickListenerC6054h(j0.inflate(layoutInflaterFrom, viewGroup, false));
        } else if (i7 == b("special_guide")) {
            C0 c0Inflate = C0.inflate(layoutInflaterFrom, viewGroup, false);
            ?? abstractC6843f = new AbstractC6843f(c0Inflate.a);
            abstractC6843f.f87133a = c0Inflate.c;
            abstractC6843f.f87134b = c0Inflate.f;
            abstractC6843f.f87135c = c0Inflate.d;
            TintTextView tintTextView = c0Inflate.b;
            abstractC6843f.f87136d = tintTextView;
            abstractC6843f.f87137e = c0Inflate.e;
            tintTextView.setOnClickListener(new Ax.i((Object) abstractC6843f, 3));
            oVar = abstractC6843f;
        } else {
            oVar = i7 == b("suggest_keyword") ? new M(P0.inflate(layoutInflaterFrom, viewGroup, false)) : i7 == b("special") ? new N(Bl.K.inflate(layoutInflaterFrom, viewGroup, false)) : (i7 == b("bangumi") || i7 == b("movie")) ? new C6066f(y0.inflate(layoutInflaterFrom, viewGroup, false)) : (i7 == b("bangumi_p") || i7 == b("movie_p")) ? new C6072l(x0.inflate(layoutInflaterFrom, viewGroup, false)) : i7 == b("ogv_channel") ? new com.bilibili.search2.result.bangumi.E(q0.inflate(layoutInflaterFrom, viewGroup, false)) : i7 == b("ogv_channel_p") ? new com.bilibili.search2.result.bangumi.L(r0.inflate(layoutInflaterFrom, viewGroup, false)) : i7 == b("ai_chat") ? new SearchAIChatHolder(Bl.l.inflate(layoutInflaterFrom, viewGroup, false)) : i7 == b("article_new_p") ? new Zs0.c(Bl.L.inflate(layoutInflaterFrom, viewGroup, false)) : i7 == b("alienation_card") ? new C4907b(Bl.O.inflate(layoutInflaterFrom, viewGroup, false)) : i7 == b("author_new") ? new com.bilibili.search2.result.holder.author.g(P.inflate(layoutInflaterFrom, viewGroup, false)) : i7 == b("pedia_card_pic") ? new C5161k(Bl.v.inflate(layoutInflaterFrom, viewGroup, false)) : i7 == b("pedia_card_pic_v3_view_type") ? new C5160j(Bl.v.inflate(layoutInflaterFrom, viewGroup, false)) : i7 == b("pedia_card_pic_v2_view_type") ? new C5164n(Bl.w.inflate(layoutInflaterFrom, viewGroup, false)) : i7 == b("banner_card") ? new C6756a(Bl.m.inflate(layoutInflaterFrom, viewGroup, false)) : i7 == b("channel_new") ? new ViewOnClickListenerC6974a(Q.inflate(layoutInflaterFrom, viewGroup, false)) : (i7 == b("chat_gpt") || i7 == b("qa")) ? new SearchChatGptHolder(Bl.o.inflate(layoutInflaterFrom, viewGroup, false)) : (i7 == b("collection_card") || i7 == b("playlist_card") || i7 == b("series_card")) ? new com.bilibili.search2.result.holder.collection.j(S.inflate(layoutInflaterFrom, viewGroup, false)) : i7 == b("comic") ? new ComicNewHolder(U.inflate(layoutInflaterFrom, viewGroup, false)) : i7 == b("comic_p") ? new com.bilibili.search2.result.holder.comic.k(V.inflate(layoutInflaterFrom, viewGroup, false)) : i7 == b("comment") ? new CommentHolder(W.inflate(layoutInflaterFrom, viewGroup, false), false) : i7 == b("comment_cluster") ? new ft0.i(X.inflate(layoutInflaterFrom, viewGroup, false)) : i7 == b("digital_chat") ? new C7378a(m1.inflate(layoutInflaterFrom, viewGroup, false)) : i7 == b("twitter_new") ? new DynamicFeedHolderV3(a0.inflate(layoutInflaterFrom, viewGroup, false)) : i7 == b("twitter_new_p") ? new C7502d(Z.inflate(layoutInflaterFrom, viewGroup, false)) : i7 == b("cheese") ? new C7616b(Bl.q.inflate(layoutInflaterFrom, viewGroup, false)) : i7 == b("esports_inline") ? new C7723a(s1.inflate(layoutInflaterFrom, viewGroup, false)) : (i7 == b("esport") || i7 == b("sports_versus")) ? new kt0.h(t1.inflate(layoutInflaterFrom, viewGroup, false)) : i7 == b("fold") ? new com.bilibili.search2.result.holder.fold.d(h1.inflate(layoutInflaterFrom, viewGroup, false)) : i7 == b("game") ? new ViewOnClickListenerC7891b(b0.inflate(layoutInflaterFrom, viewGroup, false)) : (i7 == b("article_giant_card") || i7 == b("twitter_giant_card")) ? new mt0.d(Bl.z.inflate(layoutInflaterFrom, viewGroup, false)) : i7 == b("hot_banner") ? new C8141a(d0.inflate(layoutInflaterFrom, viewGroup, false)) : i7 == b("live_inline") ? new C8265d(h0.inflate(layoutInflaterFrom, viewGroup, false)) : i7 == b("music_card_p") ? new C8353a(r1.inflate(layoutInflaterFrom, viewGroup, false)) : i7 == b("music_card") ? new C8354b(q1.inflate(layoutInflaterFrom, viewGroup, false)) : i7 == b("nps") ? new C8485d(Bl.E.inflate(layoutInflaterFrom, viewGroup, false)) : i7 == b("ogv_inline") ? new rt0.e(t0.inflate(layoutInflaterFrom, viewGroup, false)) : i7 == b("sports") ? new st0.c(w0.inflate(layoutInflaterFrom, viewGroup, false)) : i7 == b("double_opus") ? new C8691c(Bl.B.inflate(layoutInflaterFrom, viewGroup, false)) : (i7 == b("ticket_p") || i7 == b("product_p")) ? new AbstractC8764e(A0.inflate(layoutInflaterFrom, viewGroup, false).a) : (i7 == b("ticket") || i7 == b("product")) ? new AbstractC8763d(z0.inflate(layoutInflaterFrom, viewGroup, false).a) : (i7 == b("related_search") || i7 == b("query_rec_afterclick")) ? new com.bilibili.search2.result.holder.recommend.o(Bl.I.inflate(layoutInflaterFrom, viewGroup, false)) : i7 == b("up_recommend") ? new com.bilibili.search2.result.holder.recommend.q(T0.inflate(layoutInflaterFrom, viewGroup, false)) : i7 == b("special_s") ? new com.bilibili.search2.result.holder.special.b(D0.inflate(layoutInflaterFrom, viewGroup, false)) : i7 == b("special_s_p") ? new com.bilibili.search2.result.holder.special.g(E0.inflate(layoutInflaterFrom, viewGroup, false)) : i7 == b("star_banner") ? new C8859a(F0.inflate(layoutInflaterFrom, viewGroup, false)) : i7 == b("time_line") ? new wt0.b(G0.inflate(layoutInflaterFrom, viewGroup, false)) : i7 == b("hot_recommend") ? new C9006a(e0.inflate(layoutInflaterFrom, viewGroup, false)) : i7 == b("recommend_tips") ? new C9007b(B0.inflate(layoutInflaterFrom, viewGroup, false)) : i7 == b("tips") ? new C9008c(u1.inflate(layoutInflaterFrom, viewGroup, false)) : i7 == b("top_game") ? new C9095h(H0.inflate(layoutInflaterFrom, viewGroup, false)) : i7 == b("subject") ? new zt0.c(I0.inflate(layoutInflaterFrom, viewGroup, false)) : i7 == b("subject_p") ? new zt0.d(J0.inflate(layoutInflaterFrom, viewGroup, false)) : i7 == b("tribee_card") ? new At0.f(v1.inflate(layoutInflaterFrom, viewGroup, false)) : i7 == b("double_column") ? new Bt0.g(O0.inflate(layoutInflaterFrom, viewGroup, false)) : i7 == b("av") ? new Bt0.p(M0.inflate(layoutInflaterFrom, viewGroup, false)) : i7 == b("ugc_inline") ? new SearchUgcInlineNewHolder(L0.inflate(layoutInflaterFrom, viewGroup, false)) : i7 == b("ogv_cluster_card") ? new com.bilibili.search2.result.ogv.aggregate.w(n0.inflate(layoutInflaterFrom, viewGroup, false)) : i7 == b("bangumi_relates") ? new Gt0.b(u0.inflate(layoutInflaterFrom, viewGroup, false)) : 0;
        }
        return oVar != 0 ? oVar : super.a(i7, viewGroup);
    }

    public final void c(Class cls, String str) {
        ((Z7.g) this).b.add(str);
        this.f87312d.put(b(str), new Z7.e(str, cls));
    }
}
