package com.bilibili.search2.api;

import Dt0.i;
import Ps0.C2791l;
import androidx.compose.animation.core.I;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.C4690e;
import androidx.room.B;
import com.bapis.bilibili.polymer.app.search.v1.SearchOgvClusterCard;
import com.bilibili.app.comm.list.common.api.model.PlayerArgs;
import com.bilibili.app.comm.list.common.data.InlineThreePointPanel;
import com.bilibili.app.comm.list.common.data.SharePlane;
import com.bilibili.inline.card.IInlineBehavior;
import com.bilibili.inline.card.IInlinePlayItem;
import com.bilibili.inline.card.IInlineProperty;
import com.bilibili.inline.utils.InlineReportParam;
import com.bilibili.search2.api.BaseSearchInlineData;
import com.bilibili.search2.api.SearchOgvRelationItem;
import com.bilibili.search2.inline.Avatar;
import com.bilibili.search2.inline.TrafficConfig;
import com.bilibili.search2.result.n;
import dt0.AbstractC6840c;
import dt0.InterfaceC6844g;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/g.class */
@StabilityInferred(parameters = 0)
public final class g extends AbstractC6840c implements I00.b, n, InterfaceC6844g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SearchOgvClusterCard f86335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public String f86336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public String f86337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f86338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public String f86339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public String f86340f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public String f86341g;

    @Nullable
    public String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f86342i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f86343j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f86344k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public String f86345l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final C2791l f86346m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public final SearchOgvClusterRelationItem f86347n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final i f86348o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final IInlinePlayItem f86349p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final IInlineBehavior f86350q;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ef  */
    /* JADX WARN: Type inference failed for: r1v20, types: [Dt0.i] */
    /* JADX WARN: Type inference failed for: r1v22, types: [com.bilibili.inline.card.IInlinePlayItem] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g(com.bapis.bilibili.polymer.app.search.v1.SearchOgvClusterCard r35, java.lang.String r36) {
        /*
            Method dump skipped, instruction units count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.api.g.<init>(com.bapis.bilibili.polymer.app.search.v1.SearchOgvClusterCard, java.lang.String):void");
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    public final void afterInit() {
        SearchOgvClusterRelationItem searchOgvClusterRelationItem = this.f86347n;
        if (searchOgvClusterRelationItem != null) {
            searchOgvClusterRelationItem.setSubGoto("related_card");
        }
        if (searchOgvClusterRelationItem != null) {
            searchOgvClusterRelationItem.cloneFatherParam(this);
        }
        C2791l c2791l = this.f86346m;
        BaseSearchItem baseSearchItem = c2791l.f19218e;
        if (baseSearchItem != null) {
            boolean z6 = baseSearchItem instanceof SearchOgvInline;
            SearchOgvClusterCard searchOgvClusterCard = this.f86335a;
            if (z6) {
                baseSearchItem.setSubGoto("single_inline_card");
                SearchOgvInline searchOgvInline = (SearchOgvInline) baseSearchItem;
                searchOgvInline.setOgvAggregateTitle(searchOgvClusterCard.getTitle());
                searchOgvInline.setInlineTitleStyle((OgvClusterInlineTitleStyle) OgvClusterInlineTitleStyle.getEntries().get(searchOgvClusterCard.getInlineTitleStyle()));
            } else {
                baseSearchItem.setSubGoto("single_card");
                SearchBangumiItem searchBangumiItem = baseSearchItem instanceof SearchBangumiItem ? (SearchBangumiItem) baseSearchItem : null;
                if (searchBangumiItem != null) {
                    searchBangumiItem.setOgvAggregateTitle(searchOgvClusterCard.getTitle());
                }
                SearchComicItem searchComicItem = null;
                if (baseSearchItem instanceof SearchComicItem) {
                    searchComicItem = (SearchComicItem) baseSearchItem;
                }
                if (searchComicItem != null) {
                    searchComicItem.setOgvAggregateTitle(searchOgvClusterCard.getTitle());
                }
            }
        }
        BaseSearchItem baseSearchItem2 = c2791l.f19218e;
        if (baseSearchItem2 != null) {
            baseSearchItem2.cloneFatherParam(this);
        }
    }

    @Override // dt0.InterfaceC6844g
    public final void deliverLocalPagePos(int i7) {
        List<SearchOgvRelationItem.DetailsRelationItem> videos;
        BaseSearchItem baseSearchItem = this.f86346m.f19218e;
        if (baseSearchItem != null) {
            baseSearchItem.setLocalPagePos(i7);
        }
        SearchOgvClusterRelationItem searchOgvClusterRelationItem = this.f86347n;
        if (searchOgvClusterRelationItem != null) {
            searchOgvClusterRelationItem.setLocalPagePos(i7);
        }
        if (searchOgvClusterRelationItem == null || (videos = searchOgvClusterRelationItem.getVideos()) == null) {
            return;
        }
        Iterator<T> it = videos.iterator();
        while (it.hasNext()) {
            ((SearchOgvRelationItem.DetailsRelationItem) it.next()).setLocalPagePos(i7);
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.areEqual(this.f86335a, gVar.f86335a) && Intrinsics.areEqual(this.f86336b, gVar.f86336b) && Intrinsics.areEqual(this.f86337c, gVar.f86337c) && this.f86338d == gVar.f86338d && Intrinsics.areEqual(this.f86339e, gVar.f86339e) && Intrinsics.areEqual(this.f86340f, gVar.f86340f) && Intrinsics.areEqual(this.f86341g, gVar.f86341g) && Intrinsics.areEqual(this.h, gVar.h) && this.f86342i == gVar.f86342i && this.f86343j == gVar.f86343j && this.f86344k == gVar.f86344k && Intrinsics.areEqual(this.f86345l, gVar.f86345l) && Intrinsics.areEqual(this.f86346m, gVar.f86346m) && Intrinsics.areEqual(this.f86347n, gVar.f86347n);
    }

    public final long getAid() {
        SearchLikeButtonItem likeButton;
        OgvInline ogvInline = getOgvInline();
        return (ogvInline == null || (likeButton = ogvInline.getLikeButton()) == null) ? getAvId() : likeButton.getAid();
    }

    @Override // dt0.InterfaceC6845h, com.bilibili.search2.result.n
    public final long getAvId() {
        PlayerArgs playerArgs = getPlayerArgs();
        return playerArgs != null ? playerArgs.aid : 0L;
    }

    @Override // dt0.InterfaceC6845h
    public final long getCId() {
        PlayerArgs playerArgs = getPlayerArgs();
        return playerArgs != null ? playerArgs.cid : 0L;
    }

    @NotNull
    public final IInlineProperty getCardPlayProperty() {
        return this.f86348o;
    }

    @Nullable
    public final Long getDuration() {
        return getPlayerArgs() != null ? Long.valueOf(r0.fakeDuration) : null;
    }

    @Override // dt0.AbstractC6841d
    @Nullable
    public final String getExtraUri() {
        OgvInline ogvInline = getOgvInline();
        return ogvInline != null ? ogvInline.getExtraUri() : null;
    }

    @NotNull
    public final String getFrom() {
        return "3";
    }

    @NotNull
    public final String getFromSpmid() {
        return "search.search-result.0.0";
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    @Nullable
    public final String getGoTo() {
        return this.f86337c;
    }

    @NotNull
    public final IInlineBehavior getInlineBehavior() {
        return this.f86350q;
    }

    @NotNull
    public final IInlinePlayItem getInlinePlayerItem() {
        return this.f86349p;
    }

    @NotNull
    public final InlineReportParam getInlineReportParams() {
        String str = this.f86337c;
        if (str == null) {
            str = "";
        }
        long avId = getAvId();
        long cId = getCId();
        PlayerArgs playerArgs = getPlayerArgs();
        long j7 = 0;
        long j8 = playerArgs != null ? playerArgs.epid : 0L;
        PlayerArgs playerArgs2 = getPlayerArgs();
        if (playerArgs2 != null) {
            j7 = playerArgs2.pgcSeasonId;
        }
        return new InlineReportParam(str, avId, cId, j8, j7, 0L, (String) null, 64, (DefaultConstructorMarker) null);
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    @Nullable
    public final String getKeyword() {
        return this.f86341g;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    @Nullable
    public final String getLinkType() {
        return this.f86345l;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    public final int getLocalPagePos() {
        return this.f86343j;
    }

    @Nullable
    public final OgvInline getOgvInline() {
        SearchOgvInline searchOgvInlineS = s();
        return searchOgvInlineS != null ? searchOgvInlineS.getOgvInline() : null;
    }

    @Override // dt0.InterfaceC6845h
    public final int getOgvSubType() {
        PlayerArgs playerArgs = getPlayerArgs();
        return playerArgs != null ? playerArgs.subtype : 0;
    }

    @Override // dt0.InterfaceC6845h
    public final long getOid() {
        return getAvId();
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    public final long getPageNum() {
        return this.f86344k;
    }

    @Override // dt0.AbstractC6841d
    @Nullable
    public final PlayerArgs getPlayerArgs() {
        OgvInline ogvInline = getOgvInline();
        return ogvInline != null ? ogvInline.getPlayerArgs() : null;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    @Nullable
    public final String getQvId() {
        return this.h;
    }

    @Nullable
    public final Boolean getRelationCoinState() {
        OgvInline ogvInline = getOgvInline();
        return ogvInline != null ? Boolean.valueOf(ogvInline.isCoin()) : null;
    }

    @Nullable
    public final Boolean getRelationFavoriteState() {
        OgvInline ogvInline = getOgvInline();
        return ogvInline != null ? Boolean.valueOf(ogvInline.isFavorite()) : null;
    }

    @Nullable
    public final Boolean getRelationFollowState() {
        OgvInline ogvInline = getOgvInline();
        return ogvInline != null ? Boolean.valueOf(ogvInline.isAtten()) : null;
    }

    @Nullable
    public final Long getRelationLikeNum() {
        SearchLikeButtonItem likeButton;
        OgvInline ogvInline = getOgvInline();
        return (ogvInline == null || (likeButton = ogvInline.getLikeButton()) == null) ? null : Long.valueOf(likeButton.getCount());
    }

    @Nullable
    public final Boolean getRelationLikeState() {
        SearchLikeButtonItem likeButton;
        OgvInline ogvInline = getOgvInline();
        return (ogvInline == null || (likeButton = ogvInline.getLikeButton()) == null) ? null : Boolean.valueOf(likeButton.isSelected());
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    public final int getServerPagePos() {
        return this.f86342i;
    }

    @Override // dt0.InterfaceC6845h
    public final int getShareBusiness() {
        return 2;
    }

    @Override // dt0.InterfaceC6845h
    @Nullable
    public final SharePlane getSharePanel() {
        OgvInline ogvInline = getOgvInline();
        return ogvInline != null ? ogvInline.getSharePlane() : null;
    }

    @Override // dt0.InterfaceC6845h
    @NotNull
    public final String getSid() {
        PlayerArgs playerArgs = getPlayerArgs();
        return String.valueOf(playerArgs != null ? playerArgs.pgcSeasonId : 0L);
    }

    @NotNull
    public final String getSpmid() {
        return "search.search-result.0.0";
    }

    @Override // dt0.AbstractC6841d
    @Nullable
    public final String getTargetUri() {
        OgvInline ogvInline = getOgvInline();
        return ogvInline != null ? ogvInline.getUri() : null;
    }

    @Override // dt0.InterfaceC6845h
    @Nullable
    public final InlineThreePointPanel getThreePointMeta() {
        OgvInline ogvInline = getOgvInline();
        return ogvInline != null ? ogvInline.getThreePointMeta() : null;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    @Nullable
    public final String getTitle() {
        return this.f86339e;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    @Nullable
    public final String getTrackId() {
        return this.f86336b;
    }

    @Override // dt0.AbstractC6841d
    @Nullable
    public final TrafficConfig getTrafficConfig() {
        OgvInline ogvInline = getOgvInline();
        return ogvInline != null ? ogvInline.getTrafficConfig() : null;
    }

    @Override // com.bilibili.search2.result.k
    public final long getUpMid() {
        Avatar avatar;
        OgvInline ogvInline = getOgvInline();
        return (ogvInline == null || (avatar = ogvInline.getAvatar()) == null) ? -1L : avatar.getUpId();
    }

    @Nullable
    public final String getUpperAvatar() {
        BaseSearchInlineData.UpArgs upArgs;
        OgvInline ogvInline = getOgvInline();
        return (ogvInline == null || (upArgs = ogvInline.getUpArgs()) == null) ? null : upArgs.getUpFace();
    }

    @Nullable
    public final String[] getUpperId() {
        BaseSearchInlineData.UpArgs upArgs;
        String strValueOf;
        OgvInline ogvInline = getOgvInline();
        return (ogvInline == null || (upArgs = ogvInline.getUpArgs()) == null || (strValueOf = String.valueOf(upArgs.getUpId())) == null) ? null : new String[]{strValueOf};
    }

    @Nullable
    public final String getUpperName() {
        BaseSearchInlineData.UpArgs upArgs;
        OgvInline ogvInline = getOgvInline();
        return (ogvInline == null || (upArgs = ogvInline.getUpArgs()) == null) ? null : upArgs.getUpName();
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    @Nullable
    public final String getUri() {
        return this.f86340f;
    }

    @NotNull
    public final String getVideoId() {
        return String.valueOf(getCId());
    }

    @NotNull
    public final String[] getVideoList() {
        return new String[]{String.valueOf(getCId())};
    }

    @Nullable
    public final String getVideoTitle() {
        return null;
    }

    @NotNull
    public final String getWorkId() {
        return String.valueOf(getAvId());
    }

    @Nullable
    public final String getWorkTitle() {
        OgvInline ogvInline = getOgvInline();
        return ogvInline != null ? ogvInline.getTitle() : null;
    }

    public final boolean hasTripleLike() {
        SearchLikeButtonItem likeButton;
        OgvInline ogvInline = getOgvInline();
        boolean z6 = false;
        if (ogvInline != null ? ogvInline.isCoin() : false) {
            OgvInline ogvInline2 = getOgvInline();
            z6 = false;
            if (ogvInline2 != null ? ogvInline2.isFavorite() : false) {
                OgvInline ogvInline3 = getOgvInline();
                z6 = false;
                if ((ogvInline3 == null || (likeButton = ogvInline3.getLikeButton()) == null || !likeButton.isSelected()) ? false : true) {
                    z6 = true;
                }
            }
        }
        return z6;
    }

    public final int hashCode() {
        int iHashCode = this.f86335a.hashCode();
        String str = this.f86336b;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.f86337c;
        int iA = I.a(this.f86338d, ((((iHashCode * 31) + iHashCode2) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.f86339e;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.f86340f;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.f86341g;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.h;
        int iA2 = C3554n0.a(I.a(this.f86343j, I.a(this.f86342i, (((((((iA + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str6 == null ? 0 : str6.hashCode())) * 31, 31), 31), 31, this.f86344k);
        String str7 = this.f86345l;
        int iHashCode6 = str7 == null ? 0 : str7.hashCode();
        int iHashCode7 = this.f86346m.hashCode();
        SearchOgvClusterRelationItem searchOgvClusterRelationItem = this.f86347n;
        return ((iHashCode7 + ((iA2 + iHashCode6) * 31)) * 31) + (searchOgvClusterRelationItem == null ? 0 : searchOgvClusterRelationItem.hashCode());
    }

    @Override // dt0.InterfaceC6845h
    public final boolean isFavorite() {
        OgvInline ogvInline = getOgvInline();
        return ogvInline != null ? ogvInline.isFavorite() : false;
    }

    public final SearchOgvInline s() {
        BaseSearchItem baseSearchItem = this.f86346m.f19218e;
        return baseSearchItem instanceof SearchOgvInline ? (SearchOgvInline) baseSearchItem : null;
    }

    @Override // dt0.InterfaceC6845h
    public final void setFavorite(boolean z6) {
        OgvInline ogvInline = getOgvInline();
        if (ogvInline != null) {
            ogvInline.setFavorite(z6);
        }
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    public final void setGoTo(@Nullable String str) {
        this.f86337c = str;
    }

    @Override // com.bilibili.search2.result.n
    public final void setIsFav(boolean z6) {
        OgvInline ogvInline = getOgvInline();
        if (ogvInline != null) {
            ogvInline.setFavorite(z6);
        }
    }

    @Override // com.bilibili.search2.result.k
    public final void setIsFollow(boolean z6) {
        OgvInline ogvInline = getOgvInline();
        if (ogvInline != null) {
            ogvInline.setAtten(z6);
        }
    }

    @Override // com.bilibili.search2.result.n
    public final void setIsLike(boolean z6) {
        SearchLikeButtonItem likeButton;
        OgvInline ogvInline = getOgvInline();
        if (ogvInline == null || (likeButton = ogvInline.getLikeButton()) == null) {
            return;
        }
        likeButton.setSelected(z6 ? 1 : 0);
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    public final void setKeyword(@Nullable String str) {
        this.f86341g = str;
    }

    @Override // com.bilibili.search2.result.n
    public final void setLikeCount(long j7) {
        SearchLikeButtonItem likeButton;
        OgvInline ogvInline = getOgvInline();
        if (ogvInline == null || (likeButton = ogvInline.getLikeButton()) == null) {
            return;
        }
        likeButton.setCount(j7);
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    public final void setLinkType(@Nullable String str) {
        this.f86345l = str;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    public final void setLocalPagePos(int i7) {
        this.f86343j = i7;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    public final void setPageNum(long j7) {
        this.f86344k = j7;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    public final void setQvId(@Nullable String str) {
        this.h = str;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    public final void setServerPagePos(int i7) {
        this.f86342i = i7;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    public final void setTitle(@Nullable String str) {
        this.f86339e = str;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    public final void setTrackId(@Nullable String str) {
        this.f86336b = str;
    }

    public final void setTripleLikeCoin(boolean z6) {
    }

    public final void setTripleLikeFav(boolean z6) {
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    public final void setUri(@Nullable String str) {
        this.f86340f = str;
    }

    @NotNull
    public final String toString() {
        String str = this.f86336b;
        String str2 = this.f86337c;
        int i7 = this.f86338d;
        String str3 = this.f86339e;
        String str4 = this.f86340f;
        String str5 = this.f86341g;
        String str6 = this.h;
        int i8 = this.f86342i;
        int i9 = this.f86343j;
        long j7 = this.f86344k;
        String str7 = this.f86345l;
        StringBuilder sb = new StringBuilder("SearchOgvClusterItem(card=");
        sb.append(this.f86335a);
        sb.append(", trackId=");
        sb.append(str);
        sb.append(", goTo=");
        H0.e.b(i7, str2, ", position=", ", title=", sb);
        B.a(str3, ", uri=", str4, ", keyword=", sb);
        B.a(str5, ", qvId=", str6, ", serverPagePos=", sb);
        C4690e.a(i8, i9, ", localPagePos=", ", pageNum=", sb);
        G0.d.a(j7, ", linkType=", str7, sb);
        sb.append(", singleCard=");
        sb.append(this.f86346m);
        sb.append(", relate=");
        sb.append(this.f86347n);
        sb.append(")");
        return sb.toString();
    }

    public final void updateLikeState(boolean z6, long j7) {
        SearchLikeButtonItem likeButton;
        SearchLikeButtonItem likeButton2;
        if (j7 >= 0) {
            OgvInline ogvInline = getOgvInline();
            if (ogvInline == null || (likeButton2 = ogvInline.getLikeButton()) == null) {
                return;
            }
            likeButton2.updateSelected(z6, j7);
            return;
        }
        OgvInline ogvInline2 = getOgvInline();
        if (ogvInline2 == null || (likeButton = ogvInline2.getLikeButton()) == null) {
            return;
        }
        likeButton.updateSelected(z6);
    }
}
