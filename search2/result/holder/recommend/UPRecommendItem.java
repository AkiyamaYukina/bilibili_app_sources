package com.bilibili.search2.result.holder.recommend;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.polymer.app.search.v1.Item;
import com.bapis.bilibili.polymer.app.search.v1.ThreePoint;
import com.bilibili.app.comm.list.common.data.InlineThreePointPanel;
import com.bilibili.app.comm.list.common.data.SharePlane;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.api.SearchResultAll;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import dt0.InterfaceC6845h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/recommend/UPRecommendItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class UPRecommendItem extends BaseSearchItem implements InterfaceC6845h {
    public static final int $stable = 8;

    @Nullable
    private o10.a avatarInfo;

    @JSONField(name = "is_live")
    private boolean isLive;

    @JSONField(name = "is_senior_member")
    private int isSeniorMember;

    @JSONField(name = "level")
    private int level;

    @JSONField(name = "live_link")
    @Nullable
    private String liveLink;

    @JSONField(name = "live_status")
    private int liveStatus;

    @JSONField(name = EditCustomizeSticker.TAG_MID)
    private long mid;

    @JSONField(name = "name")
    @Nullable
    private String name;

    @JSONField(name = "relation")
    @Nullable
    private BaseSearchItem.Relation relation;

    @Nullable
    private SharePlane sharePlane;

    @JSONField(name = "user_card_info")
    @Nullable
    private List<String> upCardInfo;

    public UPRecommendItem(@NotNull com.bapis.bilibili.polymer.app.search.v1.UPRecommendItem uPRecommendItem, @NotNull Item item, @NotNull SearchResultAll searchResultAll) {
        setLinkType(item.getLinktype());
        setGoTo(item.getGoto());
        setSpreadId(item.getSpreadId());
        setTrackId(item.getTrackid());
        setServerPagePos(item.getPosition());
        setParam(item.getParam());
        setKeyword(searchResultAll.query);
        setExpStr(searchResultAll.expStr);
        setQvId(searchResultAll.qvId);
        this.name = uPRecommendItem.getName();
        setCover(uPRecommendItem.getCover());
        this.upCardInfo = uPRecommendItem.getUserCardInfoList();
        this.level = uPRecommendItem.getLevel();
        this.mid = uPRecommendItem.getMid();
        this.sharePlane = new SharePlane(uPRecommendItem.getSharePlane());
        setUri(uPRecommendItem.getUri());
        this.liveStatus = uPRecommendItem.getIsLive();
        this.liveLink = uPRecommendItem.getLiveLink();
        this.isSeniorMember = uPRecommendItem.getIsSeniorMember();
        this.relation = new BaseSearchItem.Relation(uPRecommendItem.getRelation());
        this.avatarInfo = r10.a.a(uPRecommendItem.getAvatarInfo());
        ArrayList arrayList = new ArrayList();
        Iterator it = uPRecommendItem.getThreePointList().iterator();
        while (it.hasNext()) {
            arrayList.add(new BaseSearchItem.ThreePointItem((ThreePoint) it.next()));
        }
        setThreePoints(arrayList);
    }

    @Override // dt0.InterfaceC6845h, com.bilibili.search2.result.n
    public /* bridge */ /* synthetic */ long getAvId() {
        return 0L;
    }

    @Nullable
    public final o10.a getAvatarInfo() {
        return this.avatarInfo;
    }

    @Override // dt0.InterfaceC6845h
    public /* bridge */ /* synthetic */ long getCId() {
        return 0L;
    }

    public /* bridge */ /* synthetic */ long getEpId() {
        return 0L;
    }

    public final int getLevel() {
        return this.level;
    }

    @Nullable
    public final String getLiveLink() {
        return this.liveLink;
    }

    public final long getMid() {
        return this.mid;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Override // dt0.InterfaceC6845h
    public /* bridge */ /* synthetic */ int getOgvSubType() {
        return 0;
    }

    @Override // dt0.InterfaceC6845h
    public long getOid() {
        return this.mid;
    }

    @Nullable
    public final BaseSearchItem.Relation getRelation() {
        return this.relation;
    }

    public /* bridge */ /* synthetic */ long getRoomId() {
        return 0L;
    }

    public /* bridge */ /* synthetic */ long getSeasonId() {
        return 0L;
    }

    @Override // dt0.InterfaceC6845h
    public int getShareBusiness() {
        return 4;
    }

    @Override // dt0.InterfaceC6845h
    @Nullable
    public String getShareFrom() {
        SharePlane sharePlane = this.sharePlane;
        return sharePlane != null ? sharePlane.shareFrom : null;
    }

    @Override // dt0.InterfaceC6845h
    @NotNull
    public String getShareId() {
        return "search.search-result.0.0";
    }

    @Override // dt0.InterfaceC6845h
    @NotNull
    public String getShareOrigin() {
        return "space_share";
    }

    @Override // dt0.InterfaceC6845h
    @Nullable
    public SharePlane getSharePanel() {
        return this.sharePlane;
    }

    @Nullable
    public final SharePlane getSharePlane() {
        return this.sharePlane;
    }

    @NotNull
    public String getShareSpmid() {
        return "search.search-result.0.0";
    }

    @Override // dt0.InterfaceC6845h
    public int getShareType() {
        return 3;
    }

    @Override // dt0.InterfaceC6845h
    @Nullable
    public /* bridge */ /* synthetic */ String getSid() {
        return null;
    }

    @Override // dt0.InterfaceC6845h
    @Nullable
    public /* bridge */ /* synthetic */ InlineThreePointPanel getThreePointMeta() {
        return null;
    }

    @Nullable
    public final List<String> getUpCardInfo() {
        return this.upCardInfo;
    }

    @Override // dt0.InterfaceC6845h
    @Nullable
    public /* bridge */ /* synthetic */ String getUpName() {
        return null;
    }

    @Override // dt0.InterfaceC6845h
    public /* bridge */ /* synthetic */ boolean isFavorite() {
        return false;
    }

    @Override // dt0.InterfaceC6845h
    public /* bridge */ /* synthetic */ boolean isHot() {
        return false;
    }

    public final boolean isLive() {
        boolean z6 = true;
        if (this.liveStatus != 1) {
            z6 = false;
        }
        return z6;
    }

    public final int isSeniorMember() {
        return this.isSeniorMember;
    }

    public final boolean isUpFollowUser() {
        BaseSearchItem.Relation relation = this.relation;
        return relation != null ? relation.isUpFollowUser() : false;
    }

    public final boolean isUserFollowUp() {
        BaseSearchItem.Relation relation = this.relation;
        return relation != null ? relation.isUserFollowUp() : false;
    }

    public final void setAvatarInfo(@Nullable o10.a aVar) {
        this.avatarInfo = aVar;
    }

    @Override // dt0.InterfaceC6845h
    public /* bridge */ /* synthetic */ void setFavorite(boolean z6) {
    }

    public final void setLevel(int i7) {
        this.level = i7;
    }

    public final void setLive(boolean z6) {
        this.isLive = z6;
    }

    public final void setLiveLink(@Nullable String str) {
        this.liveLink = str;
    }

    public final void setMid(long j7) {
        this.mid = j7;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setRelation(@Nullable BaseSearchItem.Relation relation) {
        this.relation = relation;
    }

    public final void setSeniorMember(int i7) {
        this.isSeniorMember = i7;
    }

    public final void setSharePlane(@Nullable SharePlane sharePlane) {
        this.sharePlane = sharePlane;
    }

    public final void setUpCardInfo(@Nullable List<String> list) {
        this.upCardInfo = list;
    }

    public final void updateRelation(boolean z6, boolean z7) {
        BaseSearchItem.Relation relation = this.relation;
        if (relation != null) {
            relation.updateRelation(z6, z7);
        }
    }
}
