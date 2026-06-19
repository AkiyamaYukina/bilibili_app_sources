package com.bilibili.search2.result.holder.comic;

import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.search2.api.EpisodeNew;
import com.bilibili.search2.api.SearchComicItem;
import java.util.ArrayList;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/comic/q.class */
@StabilityInferred(parameters = 1)
public final class q {
    public static void a(@NotNull Context context, @NotNull SearchComicItem searchComicItem, @Nullable EpisodeNew episodeNew, @Nullable ArrayList arrayList) {
        String str = searchComicItem.isFromComicPage() ? "search.comic-search.search-card.all.click" : "search.search-result.search-card.all.click";
        String linkType = searchComicItem.getLinkType();
        String str2 = linkType;
        if (linkType == null) {
            str2 = "manga";
        }
        if (episodeNew != null && episodeNew.getType() == 1) {
            String uri = episodeNew.getUri();
            if (uri != null) {
                BLRouter.routeTo(new RouteRequest.Builder(uri).extras(new QH0.c(arrayList, 2)).build(), context);
            }
            Xs0.b.i(str, "more", str2, searchComicItem, null, null, Xs0.b.d(searchComicItem, "more", null, 2), null, null, null, false, null, 8112);
            return;
        }
        String uri2 = episodeNew != null ? episodeNew.getUri() : null;
        if (uri2 == null || StringsKt.isBlank(uri2)) {
            return;
        }
        Os0.e.f(context, Uri.parse(uri2).buildUpon().build());
        Xs0.b.i(str, "grid_ep", str2, searchComicItem, episodeNew.getParam(), String.valueOf(episodeNew.getPosForNeuron()), Xs0.b.d(searchComicItem, "grid_ep", null, 2), null, null, null, false, null, 8064);
    }

    public static void b(@NotNull Context context, @NotNull SearchComicItem searchComicItem, @Nullable EpisodeNew episodeNew) {
        String str = searchComicItem.isFromComicPage() ? "search.comic-search.search-card.all.click" : "search.search-result.search-card.all.click";
        String linkType = searchComicItem.getLinkType();
        String str2 = linkType;
        if (linkType == null) {
            str2 = "manga";
        }
        String str3 = (episodeNew == null || episodeNew.getType() != 1) ? "band_ep" : "more";
        if (episodeNew == null || episodeNew.getType() != 1) {
            String uri = episodeNew != null ? episodeNew.getUri() : null;
            if (uri == null || StringsKt.isBlank(uri)) {
                return;
            }
            Os0.e.f(context, Uri.parse(uri).buildUpon().build());
            Xs0.b.i(str, str3, str2, searchComicItem, episodeNew.getParam(), String.valueOf(episodeNew.getPosForNeuron()), Xs0.b.d(searchComicItem, str3, null, 2), null, null, null, false, null, 8064);
            return;
        }
        String uri2 = episodeNew.getUri();
        if (uri2 == null || StringsKt.isBlank(uri2)) {
            return;
        }
        BLRouter.routeTo(new RouteRequest.Builder(uri2).extras(new X9.m(searchComicItem, 3)).build(), context);
        Xs0.b.i(str, str3, str2, searchComicItem, null, null, Xs0.b.d(searchComicItem, str3, null, 2), null, null, null, false, null, 8112);
    }
}
