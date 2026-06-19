package com.bilibili.pegasus.data.base;

import com.bilibili.adcommon.data.AdInfo;
import com.bilibili.app.comm.list.common.api.model.PlayerArgs;
import com.bilibili.app.comm.list.common.data.ThreePointItem;
import com.bilibili.pegasus.BizType;
import com.bilibili.pegasus.PegasusHolderData;
import com.bilibili.pegasus.data.component.ArgsData;
import com.bilibili.pegasus.data.component.UpArgsData;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/base/BasePegasusData.class */
public interface BasePegasusData extends PegasusHolderData {
    @Nullable
    AdInfo getAdInfo();

    @Nullable
    ArgsData getArgs();

    @Nullable
    String getAvFeature();

    @NotNull
    default BizType getBizType() {
        return BizType.PEGASUS;
    }

    @Nullable
    String getCardGoto();

    @Nullable
    String getCardType();

    @Nullable
    String getCover();

    @Nullable
    String getDalaoFeature();

    @Nullable
    String getDislikeInfo();

    @Nullable
    String getDislikeReportData();

    @Nullable
    Map<String, String> getExtraRptFields();

    @Nullable
    String getFromType();

    @Nullable
    String getGoTo();

    default long getHolderItemId() {
        String trackId = getTrackId();
        return (((long) (trackId != null ? trackId.hashCode() : 0)) ^ (getIdx() * 31)) ^ getExtra().getUuid();
    }

    @NotNull
    default String getHolderType() {
        String cardType = getCardType();
        if (cardType != null) {
            return cardType;
        }
        throw new NullPointerException("cardType is null, data = " + this);
    }

    long getId();

    long getMaterialId();

    @Nullable
    String getParam();

    @Nullable
    PlayerArgs getPlayerArgs();

    @Nullable
    String getPosRecUniqueId();

    @Nullable
    String getSubtitle();

    @Nullable
    List<ThreePointItem> getThreePoint();

    @Nullable
    String getThreePointV();

    @Nullable
    String getTitle();

    @Nullable
    String getTrackId();

    @Nullable
    UpArgsData getUpArgs();

    @Nullable
    String getUri();

    int getZeroSignal();
}
