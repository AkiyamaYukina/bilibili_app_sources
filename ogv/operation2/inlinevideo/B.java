package com.bilibili.ogv.operation2.inlinevideo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.inline.biz.repository.InlineCardTaskRepository;
import java.util.List;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.ChronosBiz;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.ChronosScene;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.UpdateVideoDetailState;
import tv.danmaku.video.bilicardplayer.DataRelationShipChain;
import tv.danmaku.video.bilicardplayer.DataWorkInfo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/inlinevideo/B.class */
@StabilityInferred(parameters = 0)
public final class B extends InlineCardTaskRepository {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f70864l = 8;

    @NotNull
    public DataRelationShipChain getChronosRelationShipChain() {
        return new t();
    }

    @NotNull
    public Pair<ChronosScene, ChronosBiz> getChronosSceneAndBiz() {
        return new Pair<>(ChronosScene.SCENE_OGV_INLINE, ChronosBiz.BIZ_OGV);
    }

    @NotNull
    public DataWorkInfo getChronosWorkInfo() {
        return new u();
    }

    public void onUpdateStaffFollowState(@NotNull List<UpdateVideoDetailState.FollowState> list) {
    }
}
