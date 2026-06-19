package com.bilibili.search2.result.bangumi;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.common.utils.ColorTagHandler;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.MutableBundleLike;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.search2.api.EpisodeNew;
import com.bilibili.search2.api.SearchBangumiItem;
import com.bilibili.search2.result.bangumi.C6066f;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/bangumi/t.class */
@StabilityInferred(parameters = 1)
public final class t {
    public static void a(@NotNull Context context, @NotNull final SearchBangumiItem searchBangumiItem, @Nullable EpisodeNew episodeNew, @Nullable final ArrayList arrayList, boolean z6, @NotNull String str, @NotNull Map map, @NotNull String str2, @NotNull String str3) {
        Uri uriA;
        if (episodeNew != null && episodeNew.getType() == 1) {
            String uri = episodeNew.getUri();
            if (uri != null) {
                BLRouter.routeTo(new RouteRequest.Builder(uri).extras(new Function1(searchBangumiItem, arrayList) { // from class: com.bilibili.search2.result.bangumi.s

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final SearchBangumiItem f87460a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final ArrayList f87461b;

                    {
                        this.f87460a = searchBangumiItem;
                        this.f87461b = arrayList;
                    }

                    public final Object invoke(Object obj) {
                        ArrayList<String> arrayList2 = this.f87461b;
                        MutableBundleLike mutableBundleLike = (MutableBundleLike) obj;
                        SearchBangumiItem searchBangumiItem2 = this.f87460a;
                        String strRetrieveOriginText = ColorTagHandler.retrieveOriginText(searchBangumiItem2.getTitle());
                        String str4 = strRetrieveOriginText;
                        if (strRetrieveOriginText == null) {
                            str4 = "";
                        }
                        mutableBundleLike.put("title", str4);
                        String keyword = searchBangumiItem2.getKeyword();
                        String str5 = keyword;
                        if (keyword == null) {
                            str5 = "";
                        }
                        mutableBundleLike.put("keyword", str5);
                        String linkType = searchBangumiItem2.getLinkType();
                        String str6 = linkType;
                        if (linkType == null) {
                            str6 = "";
                        }
                        mutableBundleLike.put("linktype", str6);
                        mutableBundleLike.put("season_id", String.valueOf(searchBangumiItem2.getSeasonId()));
                        String param = searchBangumiItem2.getParam();
                        String str7 = param;
                        if (param == null) {
                            str7 = "";
                        }
                        mutableBundleLike.put("param", str7);
                        String expStr = searchBangumiItem2.getExpStr();
                        if (expStr == null) {
                            expStr = "";
                        }
                        mutableBundleLike.put("abtest_id", expStr);
                        if (arrayList2 != null) {
                            Bundle bundle = new Bundle();
                            bundle.putStringArrayList("clicked", arrayList2);
                            mutableBundleLike.put("clicked_params", bundle);
                        }
                        return Unit.INSTANCE;
                    }
                }).build(), context);
            }
            Xs0.b.i(str, "more", str2, searchBangumiItem, null, null, Xs0.b.d(searchBangumiItem, "more", null, 2), null, null, map, false, null, 7088);
            return;
        }
        String uri2 = episodeNew != null ? episodeNew.getUri() : null;
        if (uri2 == null || StringsKt.isBlank(uri2)) {
            return;
        }
        if (z6) {
            int i7 = C6066f.f87397x;
            uriA = C6066f.b.a(2, uri2, str3);
        } else {
            int i8 = C6066f.f87397x;
            uriA = C6066f.b.a(6, uri2, null);
        }
        Os0.e.f(context, uriA);
        Xs0.b.i(str, "grid_ep", str2, searchBangumiItem, episodeNew.getParam(), String.valueOf(episodeNew.getPosForNeuron()), Xs0.b.d(searchBangumiItem, "grid_ep", null, 2), null, null, map, !z6, null, 4992);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(@org.jetbrains.annotations.NotNull android.content.Context r14, @org.jetbrains.annotations.NotNull com.bilibili.search2.api.SearchBangumiItem r15, @org.jetbrains.annotations.Nullable com.bilibili.search2.api.EpisodeNew r16, boolean r17, @org.jetbrains.annotations.NotNull java.lang.String r18, @org.jetbrains.annotations.NotNull java.util.Map r19, @org.jetbrains.annotations.NotNull java.lang.String r20, @org.jetbrains.annotations.NotNull java.lang.String r21, @org.jetbrains.annotations.NotNull java.util.Map r22) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.bangumi.t.b(android.content.Context, com.bilibili.search2.api.SearchBangumiItem, com.bilibili.search2.api.EpisodeNew, boolean, java.lang.String, java.util.Map, java.lang.String, java.lang.String, java.util.Map):void");
    }
}
