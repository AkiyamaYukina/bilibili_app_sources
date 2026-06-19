package com.bilibili.pegasus.channelv2.detail.tab.baike.inline;

import android.util.SparseArray;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.inline.biz.repository.InlineCardTaskRepository;
import com.bilibili.pegasus.channelv2.detail.tab.baike.adapter.model.ChannelLargeCoverSingleV9Item;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.ChronosBiz;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.ChronosScene;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.UpdateVideoDetailState;
import tv.danmaku.video.bilicardplayer.DataRelationShipChain;
import tv.danmaku.video.bilicardplayer.DataWorkInfo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/inline/g.class */
@StabilityInferred(parameters = 0)
public final class g extends InlineCardTaskRepository {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final ChannelLargeCoverSingleV9Item f75159l;

    public g(@NotNull ChannelLargeCoverSingleV9Item channelLargeCoverSingleV9Item) {
        this.f75159l = channelLargeCoverSingleV9Item;
    }

    @NotNull
    public final DataRelationShipChain getChronosRelationShipChain() {
        return this.f75159l;
    }

    @NotNull
    public final Pair<ChronosScene, ChronosBiz> getChronosSceneAndBiz() {
        return new Pair<>(ChronosScene.SCENE_BAIKE_INLINE, ChronosBiz.BIZ_UGC);
    }

    @NotNull
    public final DataWorkInfo getChronosWorkInfo() {
        return this.f75159l;
    }

    public final void onUpdateStaffFollowState(@NotNull List<UpdateVideoDetailState.FollowState> list) {
        SparseArray innerMids;
        ChannelLargeCoverSingleV9Item channelLargeCoverSingleV9Item = this.f75159l;
        if (channelLargeCoverSingleV9Item == null || (innerMids = channelLargeCoverSingleV9Item.getInnerMids()) == null) {
            return;
        }
        int size = innerMids.size();
        for (int i7 = 0; i7 < size; i7++) {
            for (UpdateVideoDetailState.FollowState followState : list) {
                if (Intrinsics.areEqual(String.valueOf(innerMids.get(i7)), followState.getMid())) {
                    channelLargeCoverSingleV9Item.setInnerFollowingState(i7, followState.getState());
                }
            }
        }
    }
}
