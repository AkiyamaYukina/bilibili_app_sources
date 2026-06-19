package com.bilibili.pegasus.common;

import android.util.SparseArray;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.inline.biz.card.ICardFollowingStateArgsItem;
import com.bilibili.inline.biz.repository.InlineCardTaskRepository;
import com.bilibili.pegasus.data.base.BasePegasusPlayerData;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.ChronosBiz;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.ChronosScene;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.UpdateVideoDetailState;
import tv.danmaku.video.bilicardplayer.DataRelationShipChain;
import tv.danmaku.video.bilicardplayer.DataWorkInfo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/common/n.class */
@StabilityInferred(parameters = 0)
public final class n extends InlineCardTaskRepository {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final BasePegasusPlayerData f75656l;

    public n(@NotNull BasePegasusPlayerData basePegasusPlayerData) {
        this.f75656l = basePegasusPlayerData;
    }

    @NotNull
    public final DataRelationShipChain getChronosRelationShipChain() {
        return this.f75656l;
    }

    @NotNull
    public final Pair<ChronosScene, ChronosBiz> getChronosSceneAndBiz() {
        return new Pair<>(ChronosScene.SCENE_PEGASUS_INLINE_NEW, ChronosBiz.BIZ_UGC);
    }

    @NotNull
    public final DataWorkInfo getChronosWorkInfo() {
        return this.f75656l;
    }

    public final void onUpdateStaffFollowState(@NotNull List<UpdateVideoDetailState.FollowState> list) {
        SparseArray innerMids;
        ICardFollowingStateArgsItem iCardFollowingStateArgsItem = this.f75656l;
        if (!(iCardFollowingStateArgsItem instanceof ICardFollowingStateArgsItem) || (innerMids = iCardFollowingStateArgsItem.getInnerMids()) == null) {
            return;
        }
        int size = innerMids.size();
        for (int i7 = 0; i7 < size; i7++) {
            for (UpdateVideoDetailState.FollowState followState : list) {
                if (Intrinsics.areEqual(String.valueOf(innerMids.get(i7)), followState.getMid())) {
                    iCardFollowingStateArgsItem.setInnerFollowingState(i7, followState.getState());
                }
            }
        }
    }
}
