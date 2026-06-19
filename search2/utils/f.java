package com.bilibili.search2.utils;

import Ps0.C2792m;
import Ps0.C2801w;
import com.bapis.bilibili.polymer.app.search.v1.DisplayOption;
import com.bapis.bilibili.polymer.app.search.v1.Item;
import com.bapis.bilibili.polymer.app.search.v1.Nav;
import com.bapis.bilibili.polymer.app.search.v1.SearchAllResponse;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.api.SearchResultAll;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/utils/f.class */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final List<String> f88823a = CollectionsKt.listOf(new String[]{"bangumi", "movie", "recommend_tips", "hot_recommend"});

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/utils/f$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f88824a;

        static {
            int[] iArr = new int[Item.CardItemCase.values().length];
            try {
                iArr[Item.CardItemCase.SPECIAL.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[Item.CardItemCase.LIVE.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[Item.CardItemCase.GAME.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[Item.CardItemCase.PURCHASE.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[Item.CardItemCase.SUGGEST_KEYWORD.ordinal()] = 5;
            } catch (NoSuchFieldError e11) {
            }
            try {
                iArr[Item.CardItemCase.SPECIAL_GUIDE.ordinal()] = 6;
            } catch (NoSuchFieldError e12) {
            }
            try {
                iArr[Item.CardItemCase.COMIC.ordinal()] = 7;
            } catch (NoSuchFieldError e13) {
            }
            try {
                iArr[Item.CardItemCase.CHANNEL_NEW.ordinal()] = 8;
            } catch (NoSuchFieldError e14) {
            }
            try {
                iArr[Item.CardItemCase.BANGUMI_RELATES.ordinal()] = 9;
            } catch (NoSuchFieldError e15) {
            }
            try {
                iArr[Item.CardItemCase.FIND_MORE.ordinal()] = 10;
            } catch (NoSuchFieldError e16) {
            }
            try {
                iArr[Item.CardItemCase.ESPORT.ordinal()] = 11;
            } catch (NoSuchFieldError e17) {
            }
            try {
                iArr[Item.CardItemCase.ESPORTS_INLINE.ordinal()] = 12;
            } catch (NoSuchFieldError e18) {
            }
            try {
                iArr[Item.CardItemCase.AUTHOR_NEW.ordinal()] = 13;
            } catch (NoSuchFieldError e19) {
            }
            try {
                iArr[Item.CardItemCase.TIPS.ordinal()] = 14;
            } catch (NoSuchFieldError e20) {
            }
            try {
                iArr[Item.CardItemCase.CM.ordinal()] = 15;
            } catch (NoSuchFieldError e21) {
            }
            try {
                iArr[Item.CardItemCase.UGC_INLINE.ordinal()] = 16;
            } catch (NoSuchFieldError e22) {
            }
            try {
                iArr[Item.CardItemCase.LIVE_INLINE.ordinal()] = 17;
            } catch (NoSuchFieldError e23) {
            }
            try {
                iArr[Item.CardItemCase.TOP_GAME.ordinal()] = 18;
            } catch (NoSuchFieldError e24) {
            }
            try {
                iArr[Item.CardItemCase.SPORTS.ordinal()] = 19;
            } catch (NoSuchFieldError e25) {
            }
            try {
                iArr[Item.CardItemCase.RECOMMEND_TIPS.ordinal()] = 20;
            } catch (NoSuchFieldError e26) {
            }
            try {
                iArr[Item.CardItemCase.COLLECTION_CARD.ordinal()] = 21;
            } catch (NoSuchFieldError e27) {
            }
            try {
                iArr[Item.CardItemCase.PLAYLIST_CARD.ordinal()] = 22;
            } catch (NoSuchFieldError e28) {
            }
            try {
                iArr[Item.CardItemCase.SERIES_CARD.ordinal()] = 23;
            } catch (NoSuchFieldError e29) {
            }
            try {
                iArr[Item.CardItemCase.OGV_CHANNEL.ordinal()] = 24;
            } catch (NoSuchFieldError e30) {
            }
            try {
                iArr[Item.CardItemCase.OGV_INLINE.ordinal()] = 25;
            } catch (NoSuchFieldError e31) {
            }
            try {
                iArr[Item.CardItemCase.AV.ordinal()] = 26;
            } catch (NoSuchFieldError e32) {
            }
            try {
                iArr[Item.CardItemCase.DOUBLE_COLUMN.ordinal()] = 27;
            } catch (NoSuchFieldError e33) {
            }
            try {
                iArr[Item.CardItemCase.BANGUMI.ordinal()] = 28;
            } catch (NoSuchFieldError e34) {
            }
            try {
                iArr[Item.CardItemCase.HOT_BANNER.ordinal()] = 29;
            } catch (NoSuchFieldError e35) {
            }
            try {
                iArr[Item.CardItemCase.SUBJECT.ordinal()] = 30;
            } catch (NoSuchFieldError e36) {
            }
            try {
                iArr[Item.CardItemCase.DYNAMIC_NEW.ordinal()] = 31;
            } catch (NoSuchFieldError e37) {
            }
            try {
                iArr[Item.CardItemCase.ARTICLE_NEW.ordinal()] = 32;
            } catch (NoSuchFieldError e38) {
            }
            try {
                iArr[Item.CardItemCase.PEDIA_CARD_PIC.ordinal()] = 33;
            } catch (NoSuchFieldError e39) {
            }
            try {
                iArr[Item.CardItemCase.NPS_CARD.ordinal()] = 34;
            } catch (NoSuchFieldError e40) {
            }
            try {
                iArr[Item.CardItemCase.RELATED_SEARCH.ordinal()] = 35;
            } catch (NoSuchFieldError e41) {
            }
            try {
                iArr[Item.CardItemCase.CHAT_GPT.ordinal()] = 36;
            } catch (NoSuchFieldError e42) {
            }
            try {
                iArr[Item.CardItemCase.CHEESE.ordinal()] = 37;
            } catch (NoSuchFieldError e43) {
            }
            try {
                iArr[Item.CardItemCase.QA_CARD.ordinal()] = 38;
            } catch (NoSuchFieldError e44) {
            }
            try {
                iArr[Item.CardItemCase.AI_CHAT.ordinal()] = 39;
            } catch (NoSuchFieldError e45) {
            }
            try {
                iArr[Item.CardItemCase.UP_RECOMMEND.ordinal()] = 40;
            } catch (NoSuchFieldError e46) {
            }
            try {
                iArr[Item.CardItemCase.COMMENT_CARD.ordinal()] = 41;
            } catch (NoSuchFieldError e47) {
            }
            try {
                iArr[Item.CardItemCase.COMMENT_CLUSTER.ordinal()] = 42;
            } catch (NoSuchFieldError e48) {
            }
            try {
                iArr[Item.CardItemCase.MUSIC_CARD.ordinal()] = 43;
            } catch (NoSuchFieldError e49) {
            }
            try {
                iArr[Item.CardItemCase.TIME_LINE.ordinal()] = 44;
            } catch (NoSuchFieldError e50) {
            }
            try {
                iArr[Item.CardItemCase.DOUBLE_OPUS.ordinal()] = 45;
            } catch (NoSuchFieldError e51) {
            }
            try {
                iArr[Item.CardItemCase.OGV_CLUSTER_CARD.ordinal()] = 46;
            } catch (NoSuchFieldError e52) {
            }
            try {
                iArr[Item.CardItemCase.ARTICLE_GIANT_CARD.ordinal()] = 47;
            } catch (NoSuchFieldError e53) {
            }
            try {
                iArr[Item.CardItemCase.TWITTER_GIANT_CARD.ordinal()] = 48;
            } catch (NoSuchFieldError e54) {
            }
            try {
                iArr[Item.CardItemCase.TRIBEE_CARD.ordinal()] = 49;
            } catch (NoSuchFieldError e55) {
            }
            try {
                iArr[Item.CardItemCase.DIGITAL_CHAT.ordinal()] = 50;
            } catch (NoSuchFieldError e56) {
            }
            try {
                iArr[Item.CardItemCase.ALIENATION_CARD.ordinal()] = 51;
            } catch (NoSuchFieldError e57) {
            }
            try {
                iArr[Item.CardItemCase.STAR_BANNER.ordinal()] = 52;
            } catch (NoSuchFieldError e58) {
            }
            try {
                iArr[Item.CardItemCase.BANNER.ordinal()] = 53;
            } catch (NoSuchFieldError e59) {
            }
            try {
                iArr[Item.CardItemCase.HOT_RECOMMEND.ordinal()] = 54;
            } catch (NoSuchFieldError e60) {
            }
            try {
                iArr[Item.CardItemCase.AUTHOR.ordinal()] = 55;
            } catch (NoSuchFieldError e61) {
            }
            try {
                iArr[Item.CardItemCase.LIVE_MASTER.ordinal()] = 56;
            } catch (NoSuchFieldError e62) {
            }
            try {
                iArr[Item.CardItemCase.LIVE_ROOM.ordinal()] = 57;
            } catch (NoSuchFieldError e63) {
            }
            try {
                iArr[Item.CardItemCase.LIVE_ROOM_TITLE.ordinal()] = 58;
            } catch (NoSuchFieldError e64) {
            }
            f88824a = iArr;
        }
    }

    @NotNull
    public static final SearchResultAll a(@NotNull SearchAllResponse searchAllResponse, @Nullable String str, final int i7, @NotNull final Xs0.a aVar, final int i8) {
        BaseSearchItem baseSearchItem;
        BaseSearchItem baseSearchItem2;
        final SearchResultAll searchResultAll = new SearchResultAll();
        searchResultAll.setResponseTime(System.currentTimeMillis() / ((long) 1000));
        searchResultAll.page = searchAllResponse.getPage();
        searchResultAll.trackId = searchAllResponse.getTrackid();
        searchResultAll.expStr = searchAllResponse.getExpStr();
        searchResultAll.query = str;
        searchResultAll.filterType = searchAllResponse.getSelectBarType();
        searchResultAll.newSearchExpFlag = searchAllResponse.getNewSearchExpNum();
        DisplayOption appDisplayOption = searchAllResponse.getAppDisplayOption();
        searchResultAll.refreshOption = appDisplayOption != null ? Integer.valueOf(appDisplayOption.getRefreshOpti()) : null;
        DisplayOption appDisplayOption2 = searchAllResponse.getAppDisplayOption();
        searchResultAll.refreshExp = appDisplayOption2 != null ? Integer.valueOf(appDisplayOption2.getRefreshExp()) : null;
        DisplayOption appDisplayOption3 = searchAllResponse.getAppDisplayOption();
        searchResultAll.setFilterExp(appDisplayOption3 != null ? Integer.valueOf(appDisplayOption3.getFilterExp()) : null);
        DisplayOption appDisplayOption4 = searchAllResponse.getAppDisplayOption();
        searchResultAll.setTagHighlightOption(appDisplayOption4 != null ? appDisplayOption4.getTagHighlightOpti() : 0);
        DisplayOption appDisplayOption5 = searchAllResponse.getAppDisplayOption();
        searchResultAll.setCoverExp(appDisplayOption5 != null ? appDisplayOption5.getCoverExp() : 0);
        DisplayOption appDisplayOption6 = searchAllResponse.getAppDisplayOption();
        searchResultAll.setComment43Exp(appDisplayOption6 != null ? appDisplayOption6.getComment43Exp() : 0);
        DisplayOption appDisplayOption7 = searchAllResponse.getAppDisplayOption();
        searchResultAll.setCoverExpSmall(appDisplayOption7 != null ? appDisplayOption7.getCoverExpSmall() : 0.0d);
        DisplayOption appDisplayOption8 = searchAllResponse.getAppDisplayOption();
        searchResultAll.setCoverExpNormal(appDisplayOption8 != null ? appDisplayOption8.getCoverExpNormal() : 0.0d);
        DisplayOption appDisplayOption9 = searchAllResponse.getAppDisplayOption();
        searchResultAll.setCoverExpLarge(appDisplayOption9 != null ? appDisplayOption9.getCoverExpLarge() : 0.0d);
        searchResultAll.setPageReplyInfo(new C2792m(searchAllResponse.getPagination().getNext()));
        searchResultAll.setAllDoubleColumn(searchAllResponse.getAllDoubleColumn());
        DisplayOption appDisplayOption10 = searchAllResponse.getAppDisplayOption();
        searchResultAll.setAlienationCardCount(appDisplayOption10 != null ? appDisplayOption10.getAlienationCardCount() : 0);
        DisplayOption appDisplayOption11 = searchAllResponse.getAppDisplayOption();
        searchResultAll.setAlienationFoldCount(appDisplayOption11 != null ? appDisplayOption11.getAlienationFoldCount() : 0);
        DisplayOption appDisplayOption12 = searchAllResponse.getAppDisplayOption();
        searchResultAll.setPureBackgroundExp(appDisplayOption12 != null ? appDisplayOption12.getPureBackgroundExp() : 0);
        DisplayOption appDisplayOption13 = searchAllResponse.getAppDisplayOption();
        searchResultAll.setPureCommenterExp(appDisplayOption13 != null ? appDisplayOption13.getPureCommenterExp() : 0);
        DisplayOption appDisplayOption14 = searchAllResponse.getAppDisplayOption();
        searchResultAll.setPureLineExp(appDisplayOption14 != null ? appDisplayOption14.getPureLineExp() : 0);
        DisplayOption appDisplayOption15 = searchAllResponse.getAppDisplayOption();
        searchResultAll.setPureLikeExp(appDisplayOption15 != null ? appDisplayOption15.getPureLikeExp() : 0);
        searchResultAll.setHasWideAutoFill(searchAllResponse.getHasWideAutoFill());
        if (searchAllResponse.hasEasterEgg()) {
            searchResultAll.easterEgg = new SearchResultAll.EasterEgg(searchAllResponse.getEasterEgg());
        }
        searchResultAll.qvId = (String) searchAllResponse.getAnnotationMap().get("qv_id");
        searchResultAll.setRealExposureRatio(searchAllResponse.getRealExposureRatio());
        searchResultAll.setNewUser(searchAllResponse.getIsNewUser());
        if (searchAllResponse.hasSearchFilter()) {
            searchResultAll.setSearchFilter(new Ps0.C(searchAllResponse.getSearchFilter()));
        }
        Iterator it = searchAllResponse.getExtraWordListList().iterator();
        while (it.hasNext()) {
            searchResultAll.extraWords.add(((String) it.next()).toString());
        }
        List navList = searchAllResponse.getNavList();
        if (navList != null && !navList.isEmpty()) {
            ArrayList<SearchResultAll.NavInfo> arrayList = new ArrayList<>();
            Iterator it2 = searchAllResponse.getNavList().iterator();
            while (it2.hasNext()) {
                arrayList.add(new SearchResultAll.NavInfo((Nav) it2.next()));
            }
            searchResultAll.nav = arrayList;
        }
        List itemList = searchAllResponse.getItemList();
        if (itemList != null && !itemList.isEmpty()) {
            List<BaseSearchItem> mutableList = CollectionsKt.toMutableList(SequencesKt.toList(SequencesKt.filterNotNull(SequencesKt.mapIndexed(CollectionsKt.asSequence(searchAllResponse.getItemList()), new Function2(searchResultAll, i7, aVar, i8) { // from class: com.bilibili.search2.utils.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final SearchResultAll f88802a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f88803b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Xs0.a f88804c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final int f88805d;

                {
                    this.f88802a = searchResultAll;
                    this.f88803b = i7;
                    this.f88804c = aVar;
                    this.f88805d = i8;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:56:0x03f6  */
                /* JADX WARN: Removed duplicated region for block: B:61:0x0410  */
                /* JADX WARN: Removed duplicated region for block: B:84:0x04a3  */
                /* JADX WARN: Type inference failed for: r0v208, types: [Ps0.z, com.bilibili.search2.api.BaseSearchItem] */
                /* JADX WARN: Type inference failed for: r0v284, types: [com.bilibili.search2.api.BaseSearchItem, com.bilibili.search2.api.f] */
                /* JADX WARN: Type inference failed for: r0v380, types: [Ps0.T, com.bilibili.search2.api.BaseSearchItem] */
                /* JADX WARN: Type inference failed for: r0v454 */
                /* JADX WARN: Type inference failed for: r0v456, types: [com.bilibili.search2.api.BaseSearchItem] */
                /* JADX WARN: Type inference failed for: r0v457, types: [com.bilibili.search2.api.BaseSearchItem] */
                /* JADX WARN: Type inference failed for: r0v458, types: [com.bilibili.search2.api.BaseSearchItem] */
                /* JADX WARN: Type inference failed for: r0v459, types: [com.bilibili.search2.api.BaseSearchItem] */
                /* JADX WARN: Type inference failed for: r0v460, types: [com.bilibili.search2.api.BaseSearchItem] */
                /* JADX WARN: Type inference failed for: r0v461, types: [com.bilibili.search2.api.BaseSearchItem] */
                /* JADX WARN: Type inference failed for: r0v462, types: [com.bilibili.search2.api.BaseSearchItem] */
                /* JADX WARN: Type inference failed for: r0v463, types: [com.bilibili.search2.api.BaseSearchItem] */
                /* JADX WARN: Type inference failed for: r0v464, types: [com.bilibili.search2.api.BaseSearchItem] */
                /* JADX WARN: Type inference failed for: r0v465, types: [com.bilibili.search2.api.BaseSearchItem] */
                /* JADX WARN: Type inference failed for: r0v466 */
                /* JADX WARN: Type inference failed for: r0v468 */
                /* JADX WARN: Type inference failed for: r0v470 */
                /* JADX WARN: Type inference failed for: r0v478 */
                /* JADX WARN: Type inference failed for: r0v489, types: [K90.c] */
                /* JADX WARN: Type inference failed for: r0v490, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r0v493, types: [com.bilibili.search2.api.BaseSearchItem] */
                /* JADX WARN: Type inference failed for: r0v495, types: [K90.c] */
                /* JADX WARN: Type inference failed for: r0v505, types: [com.bilibili.search2.api.BaseSearchItem] */
                /* JADX WARN: Type inference failed for: r0v506, types: [com.bilibili.search2.api.BaseSearchItem] */
                /* JADX WARN: Type inference failed for: r0v507, types: [com.bilibili.search2.api.BaseSearchItem] */
                /* JADX WARN: Type inference failed for: r0v508, types: [com.bilibili.search2.api.BaseSearchItem] */
                /* JADX WARN: Type inference failed for: r0v509, types: [com.bilibili.search2.api.BaseSearchItem] */
                /* JADX WARN: Type inference failed for: r0v510, types: [com.bilibili.search2.api.BaseSearchItem] */
                /* JADX WARN: Type inference failed for: r0v511 */
                /* JADX WARN: Type inference failed for: r0v68, types: [com.bilibili.search2.api.BaseSearchItem, com.bilibili.search2.api.d] */
                /* JADX WARN: Type inference failed for: r1v251 */
                /* JADX WARN: Type inference failed for: r20v10 */
                /* JADX WARN: Type inference failed for: r20v11 */
                /* JADX WARN: Type inference failed for: r20v12 */
                /* JADX WARN: Type inference failed for: r20v13 */
                /* JADX WARN: Type inference failed for: r20v14 */
                /* JADX WARN: Type inference failed for: r20v15 */
                /* JADX WARN: Type inference failed for: r20v16 */
                /* JADX WARN: Type inference failed for: r20v17 */
                /* JADX WARN: Type inference failed for: r20v18 */
                /* JADX WARN: Type inference failed for: r20v19 */
                /* JADX WARN: Type inference failed for: r20v20 */
                /* JADX WARN: Type inference failed for: r20v21 */
                /* JADX WARN: Type inference failed for: r20v22 */
                /* JADX WARN: Type inference failed for: r20v23 */
                /* JADX WARN: Type inference failed for: r20v24 */
                /* JADX WARN: Type inference failed for: r20v25 */
                /* JADX WARN: Type inference failed for: r20v26 */
                /* JADX WARN: Type inference failed for: r20v27 */
                /* JADX WARN: Type inference failed for: r20v28 */
                /* JADX WARN: Type inference failed for: r20v29 */
                /* JADX WARN: Type inference failed for: r20v30 */
                /* JADX WARN: Type inference failed for: r20v31 */
                /* JADX WARN: Type inference failed for: r20v32 */
                /* JADX WARN: Type inference failed for: r20v33 */
                /* JADX WARN: Type inference failed for: r20v35 */
                /* JADX WARN: Type inference failed for: r20v36 */
                /* JADX WARN: Type inference failed for: r20v37 */
                /* JADX WARN: Type inference failed for: r20v38 */
                /* JADX WARN: Type inference failed for: r20v39 */
                /* JADX WARN: Type inference failed for: r20v40 */
                /* JADX WARN: Type inference failed for: r20v41 */
                /* JADX WARN: Type inference failed for: r20v42 */
                /* JADX WARN: Type inference failed for: r20v43 */
                /* JADX WARN: Type inference failed for: r20v44 */
                /* JADX WARN: Type inference failed for: r20v46 */
                /* JADX WARN: Type inference failed for: r20v47 */
                /* JADX WARN: Type inference failed for: r20v49 */
                /* JADX WARN: Type inference failed for: r20v51 */
                /* JADX WARN: Type inference failed for: r20v52 */
                /* JADX WARN: Type inference failed for: r20v53 */
                /* JADX WARN: Type inference failed for: r20v54 */
                /* JADX WARN: Type inference failed for: r20v56 */
                /* JADX WARN: Type inference failed for: r20v59 */
                /* JADX WARN: Type inference failed for: r20v6 */
                /* JADX WARN: Type inference failed for: r20v61 */
                /* JADX WARN: Type inference failed for: r20v62 */
                /* JADX WARN: Type inference failed for: r20v64 */
                /* JADX WARN: Type inference failed for: r20v66 */
                /* JADX WARN: Type inference failed for: r20v67 */
                /* JADX WARN: Type inference failed for: r20v68 */
                /* JADX WARN: Type inference failed for: r20v69 */
                /* JADX WARN: Type inference failed for: r20v70 */
                /* JADX WARN: Type inference failed for: r20v71 */
                /* JADX WARN: Type inference failed for: r20v72, types: [Ps0.w, com.bilibili.search2.api.BaseSearchItem] */
                /* JADX WARN: Type inference failed for: r20v73 */
                /* JADX WARN: Type inference failed for: r20v74 */
                /* JADX WARN: Type inference failed for: r20v75 */
                /* JADX WARN: Type inference failed for: r20v76 */
                /* JADX WARN: Type inference failed for: r20v77 */
                /* JADX WARN: Type inference failed for: r20v78 */
                /* JADX WARN: Type inference failed for: r20v79 */
                /* JADX WARN: Type inference failed for: r20v9 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invoke(java.lang.Object r20, java.lang.Object r21) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instruction units count: 3581
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.utils.C6078b.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }))));
            searchResultAll.items = mutableList;
            BaseSearchItem baseSearchItem3 = mutableList != null ? (BaseSearchItem) CollectionsKt.getOrNull(mutableList, 0) : null;
            if (baseSearchItem3 instanceof C2801w) {
                C2801w c2801w = (C2801w) baseSearchItem3;
                c2801w.setAlienationId(c2801w.getParam());
                if (searchResultAll.getAlienationCardCount() > 0) {
                    if (searchResultAll.getAlienationFoldCount() >= searchResultAll.getAlienationCardCount()) {
                        searchResultAll.setAlienationFoldCount(0);
                    }
                    aVar.f28319g = searchResultAll.getAlienationCardCount();
                    int alienationCardCount = searchResultAll.getAlienationCardCount();
                    for (int i9 = 1; i9 < alienationCardCount + 1; i9++) {
                        List<BaseSearchItem> list = searchResultAll.items;
                        if (list != null && (baseSearchItem2 = (BaseSearchItem) CollectionsKt.getOrNull(list, i9)) != null) {
                            baseSearchItem2.setEnableFeedbackRemoveItem(false);
                            baseSearchItem2.setInAlienationArea(true);
                            baseSearchItem2.setAlienationId(c2801w.getParam());
                        }
                    }
                    List<BaseSearchItem> list2 = searchResultAll.items;
                    if (list2 != null && (baseSearchItem = (BaseSearchItem) CollectionsKt.getOrNull(list2, searchResultAll.getAlienationCardCount())) != null) {
                        baseSearchItem.setLastAlienationAreaCard(true);
                    }
                    if (searchResultAll.getAlienationFoldCount() > 0) {
                        searchResultAll.getFoldedItems().clear();
                        int alienationCardCount2 = (searchResultAll.getAlienationCardCount() + 1) - searchResultAll.getAlienationFoldCount();
                        List<BaseSearchItem> list3 = searchResultAll.items;
                        if (list3 != null) {
                            int i10 = 0;
                            for (Object obj : list3) {
                                if (i10 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                BaseSearchItem baseSearchItem4 = (BaseSearchItem) obj;
                                if (i10 >= alienationCardCount2 && i10 < searchResultAll.getAlienationCardCount() + 1) {
                                    baseSearchItem4.setFolded(Boolean.TRUE);
                                    searchResultAll.getFoldedItems().add(baseSearchItem4);
                                }
                                i10++;
                            }
                        }
                        int alienationFoldCount = searchResultAll.getAlienationFoldCount();
                        for (int i11 = 0; i11 < alienationFoldCount; i11++) {
                            List<BaseSearchItem> list4 = searchResultAll.items;
                            if (list4 != null) {
                                list4.remove(alienationCardCount2);
                            }
                        }
                        List<BaseSearchItem> list5 = searchResultAll.items;
                        if (list5 != null) {
                            BaseSearchItem baseSearchItem5 = new BaseSearchItem();
                            baseSearchItem5.setTitle(c2801w.f19248f);
                            BaseSearchItem baseSearchItemCloneFatherParam = baseSearchItem5.cloneFatherParam(baseSearchItem3);
                            baseSearchItemCloneFatherParam.setGoTo("fold");
                            ((K90.c) baseSearchItemCloneFatherParam).viewType = 3148801;
                            baseSearchItemCloneFatherParam.setParam(c2801w.getParam());
                            baseSearchItemCloneFatherParam.setAlienationId(c2801w.getParam());
                            baseSearchItemCloneFatherParam.setEnableFeedbackRemoveItem(false);
                            baseSearchItemCloneFatherParam.setInAlienationArea(true);
                            baseSearchItemCloneFatherParam.setLastAlienationAreaCard(true);
                            Unit unit = Unit.INSTANCE;
                            list5.add(alienationCardCount2, baseSearchItemCloneFatherParam);
                        }
                        searchResultAll.setAlienationCardCount((searchResultAll.getAlienationCardCount() - searchResultAll.getAlienationFoldCount()) + 1);
                    }
                }
            } else {
                searchResultAll.setAlienationCardCount(0);
                searchResultAll.setAlienationFoldCount(0);
            }
            List<BaseSearchItem> list6 = searchResultAll.items;
            if (list6 != null) {
                Iterator<T> it3 = list6.iterator();
                while (it3.hasNext()) {
                    ((BaseSearchItem) it3.next()).afterInit();
                }
            }
            Iterator<T> it4 = searchResultAll.getFoldedItems().iterator();
            while (it4.hasNext()) {
                ((BaseSearchItem) it4.next()).afterInit();
            }
        }
        return searchResultAll;
    }
}
