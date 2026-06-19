package com.bilibili.ship.theseus.ugc.chronos;

import bi0.AbstractC5109a;
import com.bilibili.bus.Violet;
import java.util.List;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.ChronosRequestHandler;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.ChronosResponseWrapper;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.UpdateVideoDetailState;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/chronos/a.class */
public final class a implements ChronosRequestHandler<UpdateVideoDetailState.Request, Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f96456a = Reflection.typeOf(UpdateVideoDetailState.Request.class).isMarkedNullable();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UGCChronosBusinessService f96457b;

    public a(UGCChronosBusinessService uGCChronosBusinessService) {
        this.f96457b = uGCChronosBusinessService;
    }

    public final Class<UpdateVideoDetailState.Request> getRequestClass() {
        return UpdateVideoDetailState.Request.class;
    }

    public final boolean getRequestNullable() {
        return this.f96456a;
    }

    public final ChronosResponseWrapper<Void> handle(UpdateVideoDetailState.Request request) {
        UpdateVideoDetailState.Request request2 = request;
        List<UpdateVideoDetailState.FollowState> followStates = request2.getFollowStates();
        UGCChronosBusinessService uGCChronosBusinessService = this.f96457b;
        if (followStates != null) {
            uGCChronosBusinessService.f96439a.onUpdateStaffFollowState(followStates);
        }
        UpdateVideoDetailState.ReserveState reserveState = request2.getReserveState();
        if (reserveState != null) {
            uGCChronosBusinessService.onUpdateReserveState(reserveState);
        }
        UpdateVideoDetailState.CheckInState clockInState = request2.getClockInState();
        if (clockInState != null) {
            uGCChronosBusinessService.getClass();
            String activity = clockInState.getActivity();
            if (activity != null && !StringsKt.isBlank(activity)) {
                uGCChronosBusinessService.f96448k.f101463m.tryEmit(clockInState);
            }
        }
        UpdateVideoDetailState.VoteState voteState = request2.getVoteState();
        if (voteState != null) {
            Violet.INSTANCE.sendMsg(new AbstractC5109a.i(voteState.getVoteId(), voteState.getOptionIndex()));
        }
        return new ChronosResponseWrapper.Success((Object) null);
    }
}
