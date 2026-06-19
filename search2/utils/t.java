package com.bilibili.search2.utils;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.sharewrapper.SocializeMedia;
import com.bilibili.lib.sharewrapper.basic.BiliExtraBuilder;
import com.bilibili.lib.sharewrapper.basic.ThirdPartyExtraBuilder;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.api.SearchBangumiItem;
import com.bilibili.search2.api.SearchComicItem;
import com.google.gson.JsonObject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/utils/t.class */
@StabilityInferred(parameters = 1)
public final class t {
    @NotNull
    public static Bundle a(@NotNull String str, @NotNull SearchComicItem searchComicItem) {
        Bundle bundleBuild;
        BaseSearchItem.H5Share h52;
        if (SocializeMedia.isIm(str)) {
            bundleBuild = new BiliExtraBuilder().title(searchComicItem.getShareTitle()).cover(searchComicItem.getCover()).contentType(23).contentUrl(searchComicItem.getUri()).from(Xs0.b.d(searchComicItem, null, null, 3)).build();
        } else if (SocializeMedia.isDynamic(str)) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("title", searchComicItem.getShareTitle());
            jsonObject.addProperty("cover_url", searchComicItem.getCover());
            jsonObject.addProperty("target_url", searchComicItem.getUri());
            jsonObject.addProperty("biz_type", 201);
            bundleBuild = new BiliExtraBuilder().contentType(18).title(searchComicItem.getShareTitle()).cover(searchComicItem.getCover()).contentUrl(searchComicItem.getUri()).contentId(searchComicItem.getContentId()).sketchParam(jsonObject.toString()).from(Xs0.b.d(searchComicItem, null, null, 3)).build();
        } else if (Intrinsics.areEqual(str, SocializeMedia.COPY)) {
            ThirdPartyExtraBuilder thirdPartyExtraBuilderTitle = new ThirdPartyExtraBuilder().title(searchComicItem.getShareTitle());
            BaseSearchItem.Share share = searchComicItem.getShare();
            ThirdPartyExtraBuilder thirdPartyExtraBuilderContent = thirdPartyExtraBuilderTitle.content((share == null || (h52 = share.getH5()) == null) ? null : h52.getOid());
            BaseSearchItem.Share share2 = searchComicItem.getShare();
            String oid = null;
            if (share2 != null) {
                BaseSearchItem.H5Share h53 = share2.getH5();
                oid = null;
                if (h53 != null) {
                    oid = h53.getOid();
                }
            }
            bundleBuild = thirdPartyExtraBuilderContent.targetUrl(oid).build();
        } else {
            ThirdPartyExtraBuilder thirdPartyExtraBuilderImageUrl = new ThirdPartyExtraBuilder().title(searchComicItem.getShareTitle()).imageUrl(searchComicItem.getCover());
            BaseSearchItem.Share share3 = searchComicItem.getShare();
            String oid2 = null;
            if (share3 != null) {
                BaseSearchItem.H5Share h54 = share3.getH5();
                oid2 = null;
                if (h54 != null) {
                    oid2 = h54.getOid();
                }
            }
            bundleBuild = thirdPartyExtraBuilderImageUrl.targetUrl(oid2).shareType(ThirdPartyExtraBuilder.PARAMS_TYPE_WEB).build();
        }
        return bundleBuild;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00c8  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.os.Bundle b(@org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.Nullable java.lang.String r7, @org.jetbrains.annotations.NotNull com.bilibili.search2.api.SearchOgvChannelItem r8) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.utils.t.b(java.lang.String, java.lang.String, com.bilibili.search2.api.SearchOgvChannelItem):android.os.Bundle");
    }

    @NotNull
    public static Bundle c(@NotNull Context context, @NotNull String str, @NotNull SearchBangumiItem searchBangumiItem) {
        Bundle bundle;
        BaseSearchItem.OgvShare ogvShare;
        BaseSearchItem.OgvShare ogvShare2;
        if (SocializeMedia.isIm(str)) {
            BiliExtraBuilder biliExtraBuilderContentType = new BiliExtraBuilder().title(searchBangumiItem.getShareTitle()).cover(searchBangumiItem.getCover()).contentType(22);
            BaseSearchItem.Share share = searchBangumiItem.getShare();
            int seasonType = (int) ((share == null || (ogvShare2 = share.getOgvShare()) == null) ? 0L : ogvShare2.getSeasonType());
            BiliExtraBuilder biliExtraBuilderBizName = biliExtraBuilderContentType.bizName(com.bilibili.ogv.pub.season.b.b(seasonType <= 0 ? com.bilibili.ogv.pub.season.a.f71781i : new com.bilibili.ogv.pub.season.a(seasonType), context));
            BaseSearchItem.Share share2 = searchBangumiItem.getShare();
            long epId = 0;
            if (share2 != null) {
                BaseSearchItem.OgvShare ogvShare3 = share2.getOgvShare();
                epId = 0;
                if (ogvShare3 != null) {
                    epId = ogvShare3.getEpId();
                }
            }
            bundle = biliExtraBuilderBizName.contentId(epId).build();
        } else if (SocializeMedia.isDynamic(str)) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("title", searchBangumiItem.getShareTitle());
            jsonObject.addProperty("cover_url", searchBangumiItem.getCover());
            jsonObject.addProperty("target_url", searchBangumiItem.getUri());
            BaseSearchItem.Share share3 = searchBangumiItem.getShare();
            int seasonType2 = (int) ((share3 == null || (ogvShare = share3.getOgvShare()) == null) ? 0L : ogvShare.getSeasonType());
            int i7 = 261;
            if (seasonType2 != 1) {
                if (seasonType2 == 4) {
                    i7 = 264;
                } else if (seasonType2 == 5) {
                    i7 = 263;
                } else if (seasonType2 == 2) {
                    i7 = 262;
                } else if (seasonType2 == 3) {
                    i7 = 265;
                } else if (seasonType2 == 7) {
                    i7 = 266;
                }
            }
            jsonObject.addProperty("biz_type", Integer.valueOf(i7));
            BiliExtraBuilder biliExtraBuilderTitle = new BiliExtraBuilder().title(searchBangumiItem.getShareTitle());
            BaseSearchItem.Share share4 = searchBangumiItem.getShare();
            long epId2 = 0;
            if (share4 != null) {
                BaseSearchItem.OgvShare ogvShare4 = share4.getOgvShare();
                epId2 = 0;
                if (ogvShare4 != null) {
                    epId2 = ogvShare4.getEpId();
                }
            }
            bundle = biliExtraBuilderTitle.contentId(epId2).contentType(18).contentUrl(searchBangumiItem.getUri()).cover(searchBangumiItem.getCover()).sketchParam(jsonObject.toString()).publish(false).from(Xs0.b.d(searchBangumiItem, null, null, 3)).build();
        } else {
            bundle = new Bundle();
        }
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.bilibili.lib.sharewrapper.online.ShareOnlineParams d(@org.jetbrains.annotations.NotNull com.bilibili.search2.api.SearchBangumiItem r6) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.utils.t.d(com.bilibili.search2.api.SearchBangumiItem):com.bilibili.lib.sharewrapper.online.ShareOnlineParams");
    }
}
