package com.bilibili.biligame.abtest;

import com.alibaba.fastjson.JSONObject;
import com.bilibili.biligame.api.BiligameAbExpInfo;
import com.bilibili.biligame.api.BiligameHotGame;
import com.bilibili.biligame.api.bean.gamedetail.GameDetailInfo;
import com.bilibili.biligame.report.ReportExtra;
import com.bilibili.biligame.report3.ReportParams;
import com.bilibili.biligame.utils.ConfigUtil;
import com.bilibili.biligame.utils.MiniGameRouterTest;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/abtest/AbTestHelperKt.class */
public final class AbTestHelperKt {
    @NotNull
    public static final Map<String, String> getABInfoExtra(@NotNull String str, @NotNull BiligameHotGame biligameHotGame) {
        BiligameAbExpInfo biliGameExpInfo = null;
        GameDetailInfo gameDetailInfo = biligameHotGame instanceof GameDetailInfo ? (GameDetailInfo) biligameHotGame : null;
        if (gameDetailInfo != null) {
            biliGameExpInfo = AbTestHelper.INSTANCE.getBiliGameExpInfo(null, str, gameDetailInfo.abInfo);
        }
        return AbTestHelper.INSTANCE.getReportExtraGameAbInfo(biliGameExpInfo);
    }

    @NotNull
    public static final Map<String, String> getAbInfoExtraWithCloudGameDownload(@NotNull BiligameHotGame biligameHotGame) {
        String expId;
        BiligameABTestID aBTestWithDownload = ConfigUtil.getABTestWithDownload();
        return (aBTestWithDownload == null || (expId = aBTestWithDownload.getExpId()) == null) ? new LinkedHashMap() : getABInfoExtra(expId, biligameHotGame);
    }

    @Nullable
    public static final String getSmallAbTestRouter(@NotNull List<BiligameAbExpInfo> list) {
        Object next;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((BiligameAbExpInfo) next).getGroupName(), "mini_game_center_native")) {
                break;
            }
        }
        BiligameAbExpInfo biligameAbExpInfo = (BiligameAbExpInfo) next;
        String string = null;
        if (biligameAbExpInfo != null) {
            JSONObject extInfo = biligameAbExpInfo.getExtInfo();
            string = null;
            if (extInfo != null) {
                string = extInfo.getString("link");
            }
        }
        if (string != null) {
            MiniGameRouterTest.INSTANCE.saveMiniGameLastRouter(string);
        }
        return string;
    }

    @NotNull
    public static final ReportExtra getV2ReportParams(@NotNull Map<String, String> map) {
        return ReportExtra.create(map);
    }

    @NotNull
    public static final ReportParams getV3ReportParams(@NotNull Map<String, String> map, @Nullable String str) {
        return ReportParams.Companion.createWithGameBaseId(str).put(map);
    }
}
