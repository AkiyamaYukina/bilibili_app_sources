package com.bilibili.ogv.operation2.inlinevideo;

import com.bilibili.bililive.listplayer.videonew.player.InlineUgcPlayableParams;
import com.bilibili.ogv.kmm.operation.inlinevideo.InlineScene;
import com.bilibili.ogv.kmm.operation.inlinevideo.InlineType;
import com.bilibili.ogv.pub.play.OGVPlayableParams;
import com.bilibili.playerbizcommon.utils.PlayUrlFlagsManager;
import kotlin.time.Duration;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.Video;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/inlinevideo/y.class */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f70992a = 4;

    private static final void a(Video.PlayableParams playableParams, com.bilibili.ogv.kmm.operation.inlinevideo.g gVar, String str) {
        JsonObject jsonObject = gVar.f68496a.f68488f;
        playableParams.setFlashJsonStr(jsonObject != null ? jsonObject.toString() : null);
        playableParams.setSpmid(str);
        playableParams.setFromSpmid(gVar.f68499d);
        playableParams.setFromAutoPlay(4);
        playableParams.setFnVal(PlayUrlFlagsManager.getFnVal());
        playableParams.setFnVer(PlayUrlFlagsManager.getFnVer());
        playableParams.setTrackId(gVar.f68505k.get("trackid"));
    }

    private static final void b(OGVPlayableParams oGVPlayableParams, com.bilibili.ogv.kmm.operation.inlinevideo.g gVar, String str) {
        Duration duration;
        com.bilibili.ogv.kmm.operation.inlinevideo.a aVar;
        InlineType inlineType;
        Integer intOrNull;
        com.bilibili.ogv.kmm.operation.inlinevideo.d dVar = gVar.f68496a;
        long j7 = dVar.f68484b;
        JsonObject jsonObject = dVar.f68488f;
        JsonElement jsonElement = jsonObject != null ? (JsonElement) jsonObject.get("quality") : null;
        JsonPrimitive jsonPrimitive = jsonElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElement : null;
        int iIntValue = (jsonPrimitive == null || (intOrNull = JsonElementKt.getIntOrNull(jsonPrimitive)) == null) ? 0 : intOrNull.intValue();
        oGVPlayableParams.setShowsDanmaku(true);
        oGVPlayableParams.setAvid(dVar.f68483a);
        oGVPlayableParams.setCid(j7);
        oGVPlayableParams.setSpmid(gVar.f68498c);
        oGVPlayableParams.setFromSpmid(gVar.f68499d);
        oGVPlayableParams.setEpId(dVar.f68485c);
        oGVPlayableParams.setSeasonId(dVar.f68486d);
        oGVPlayableParams.setSubType(dVar.f68487e);
        oGVPlayableParams.setFnVal(PlayUrlFlagsManager.getFnVal());
        oGVPlayableParams.setFnVer(PlayUrlFlagsManager.getFnVer());
        oGVPlayableParams.setExpectedQuality(iIntValue);
        oGVPlayableParams.setFromAutoPlay(4);
        JsonObject jsonObject2 = gVar.f68496a.f68488f;
        String string = null;
        if (jsonObject2 != null) {
            string = jsonObject2.toString();
        }
        oGVPlayableParams.setFlashJsonStr(string);
        oGVPlayableParams.setFromInline(true);
        com.bilibili.ogv.kmm.operation.inlinevideo.q qVar = dVar.h;
        oGVPlayableParams.setInlineTypeInt((qVar == null || (inlineType = qVar.f68523d) == null) ? 0 : inlineType.ordinal());
        int iOrdinal = 0;
        if (qVar != null) {
            InlineScene inlineScene = qVar.f68522c;
            iOrdinal = 0;
            if (inlineScene != null) {
                iOrdinal = inlineScene.ordinal();
            }
        }
        oGVPlayableParams.setInlineSceneInt(iOrdinal);
        oGVPlayableParams.setMaterialId((qVar == null || (aVar = qVar.f68524e) == null) ? 0L : aVar.f68469a);
        oGVPlayableParams.m7594setTotalDurationLRDsOJo((qVar == null || (duration = qVar.f68520a) == null) ? Duration.Companion.getZERO-UwyO8pc() : duration.unbox-impl());
        oGVPlayableParams.setDanmakuSpmid(str);
        oGVPlayableParams.setTrackId(gVar.f68505k.get("trackid"));
        oGVPlayableParams.setResolverType("vod_common");
    }

    private static final void c(InlineUgcPlayableParams inlineUgcPlayableParams, com.bilibili.ogv.kmm.operation.inlinevideo.g gVar) {
        inlineUgcPlayableParams.setShowDanmaku(true);
        inlineUgcPlayableParams.setTitle(gVar.h);
        inlineUgcPlayableParams.setCover(gVar.f68503i);
        com.bilibili.ogv.kmm.operation.inlinevideo.d dVar = gVar.f68496a;
        inlineUgcPlayableParams.setAvid(dVar.f68483a);
        inlineUgcPlayableParams.setCid(dVar.f68484b);
    }

    @NotNull
    public static final OGVPlayableParams d(@NotNull com.bilibili.ogv.kmm.operation.inlinevideo.g gVar, @Nullable String str) {
        OGVPlayableParams oGVPlayableParams = new OGVPlayableParams();
        oGVPlayableParams.setInline(true);
        b(oGVPlayableParams, gVar, str);
        return oGVPlayableParams;
    }

    @NotNull
    public static final InlineUgcPlayableParams e(@NotNull com.bilibili.ogv.kmm.operation.inlinevideo.g gVar, @Nullable String str) {
        InlineUgcPlayableParams inlineUgcPlayableParams = new InlineUgcPlayableParams();
        a(inlineUgcPlayableParams, gVar, str);
        c(inlineUgcPlayableParams, gVar);
        return inlineUgcPlayableParams;
    }
}
