package com.bilibili.ship.theseus.united.page.playview;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bapis.bilibili.app.viewunite.v1.FragmentArc;
import com.bapis.bilibili.app.viewunite.v1.FragmentParam;
import com.bapis.bilibili.playershared.FragmentPosition;
import com.bapis.bilibili.playershared.FragmentVideoInfo;
import com.bilibili.ship.theseus.keel.player.j;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import dagger.Module;
import dagger.Provides;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.Video;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playview/a.class */
@StabilityInferred(parameters = 1)
@Module
public final class a {
    @Provides
    @Nullable
    public static Video.DanmakuResolveParams a(@NotNull j jVar, @NotNull PlayViewUniteReply playViewUniteReply) {
        List videosList = playViewUniteReply.getFragmentVideo().getVideosList();
        ArrayList<FragmentVideoInfo> arrayList = new ArrayList();
        for (Object obj : videosList) {
            if (((FragmentVideoInfo) obj).getPlayableStatus()) {
                arrayList.add(obj);
            }
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(EditCustomizeSticker.TAG_DURATION, Long.valueOf(playViewUniteReply.getPlayArc().getDurationMs()));
        if (!arrayList.isEmpty()) {
            JsonArray jsonArray = new JsonArray();
            for (FragmentVideoInfo fragmentVideoInfo : arrayList) {
                JsonObject jsonObject2 = new JsonObject();
                jsonObject2.addProperty("cid", Long.valueOf(fragmentVideoInfo.getFragmentInfo().getCid()));
                jsonObject2.addProperty("aid", Long.valueOf(fragmentVideoInfo.getFragmentInfo().getAid()));
                jsonObject2.addProperty(EditCustomizeSticker.TAG_DURATION, Long.valueOf(fragmentVideoInfo.getTimelength()));
                jsonObject2.addProperty("type", Integer.valueOf(fragmentVideoInfo.getFragmentInfo().getFragmentPositionValue()));
                jsonArray.add(jsonObject2);
            }
            jsonObject.add("fragments", jsonArray);
        }
        jsonObject.addProperty("video_type", Integer.valueOf(playViewUniteReply.getPlayArc().getVideoType().getNumber()));
        Video.DanmakuResolveParams danmakuResolveParams = jVar.f().getDanmakuResolveParams();
        return danmakuResolveParams != null ? Video.DanmakuResolveParams.copy$default(danmakuResolveParams, 0L, playViewUniteReply.getPlayArc().getCid(), (String) null, 0L, 0L, 0, (String) null, (String) null, false, (String) null, 0, jsonObject, (String) null, (String) null, 14333, (Object) null) : null;
    }

    @Provides
    @NotNull
    public static com.bilibili.ship.theseus.united.player.mediaplay.c b(@NotNull PlayViewUniteReply playViewUniteReply) {
        Duration.Companion companion = Duration.Companion;
        List videosList = playViewUniteReply.getFragmentVideo().getVideosList();
        ArrayList arrayList = new ArrayList();
        for (Object obj : videosList) {
            FragmentVideoInfo fragmentVideoInfo = (FragmentVideoInfo) obj;
            if (fragmentVideoInfo.getFragmentInfo().getFragmentPosition() == FragmentPosition.PRE && fragmentVideoInfo.getPlayableStatus()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        long timelength = 0;
        while (true) {
            long j7 = timelength;
            if (!it.hasNext()) {
                return new com.bilibili.ship.theseus.united.player.mediaplay.c(DurationKt.toDuration(j7, DurationUnit.MILLISECONDS));
            }
            timelength = j7 + ((FragmentVideoInfo) it.next()).getTimelength();
        }
    }

    @Provides
    @Nullable
    public static FragmentParam c(@NotNull PlayViewUniteReply playViewUniteReply) {
        List videosList = playViewUniteReply.getFragmentVideo().getVideosList();
        ArrayList<FragmentVideoInfo> arrayList = new ArrayList();
        for (Object obj : videosList) {
            if (((FragmentVideoInfo) obj).getPlayableStatus()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        FragmentParam.b bVarNewBuilder = FragmentParam.newBuilder();
        for (FragmentVideoInfo fragmentVideoInfo : arrayList) {
            bVarNewBuilder.addFragmentArcs(FragmentArc.newBuilder().setAid(fragmentVideoInfo.getFragmentInfo().getAid()).setCid(fragmentVideoInfo.getFragmentInfo().getCid()));
        }
        return bVarNewBuilder.build();
    }
}
