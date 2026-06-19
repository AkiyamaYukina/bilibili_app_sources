package com.bilibili.ship.theseus.united.page.danmaku;

import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.interact.biz.PlayerCardStatusSyncListener;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.send.VideoDetailStateChange;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.remote.IRemoteHandler;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/h.class */
public final class h implements PlayerCardStatusSyncListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChronosBusinessService f99531a;

    public h(ChronosBusinessService chronosBusinessService) {
        this.f99531a = chronosBusinessService;
    }

    public final void syncPlayerCardStatus(int i7, long j7, long j8, boolean z6) {
        ChronosReserveType chronosReserveType;
        ChronosBusinessService chronosBusinessService = this.f99531a;
        VideoDetailStateChange.Request request = (VideoDetailStateChange.Request) chronosBusinessService.f99342n.f101766d.getValue();
        VideoDetailStateChange.Request request2 = request;
        if (request == null) {
            request2 = new VideoDetailStateChange.Request();
        }
        if (request2.getReserveState() == null) {
            request2.setReserveState(new VideoDetailStateChange.ReserveState());
        }
        VideoDetailStateChange.ReserveState reserveState = request2.getReserveState();
        if (reserveState == null) {
            return;
        }
        ChronosReserveType.Companion.getClass();
        switch (i7) {
            case 1:
                chronosReserveType = ChronosReserveType.UGC;
                break;
            case 2:
                chronosReserveType = ChronosReserveType.LIVE;
                break;
            case 3:
                chronosReserveType = ChronosReserveType.COOPERATION;
                break;
            case 4:
                chronosReserveType = ChronosReserveType.OGV;
                break;
            case 5:
                chronosReserveType = ChronosReserveType.GAME;
                break;
            case 6:
                chronosReserveType = ChronosReserveType.ACTIVITY;
                break;
            default:
                chronosReserveType = ChronosReserveType.NONE;
                break;
        }
        if (chronosReserveType == ChronosReserveType.NONE) {
            return;
        }
        reserveState.setType(Integer.valueOf(chronosReserveType.getType()));
        reserveState.setId(String.valueOf(j7));
        reserveState.setState(Boolean.valueOf(z6));
        IInteractLayerService iInteractLayerService = chronosBusinessService.f99336g;
        IRemoteHandler remoteHandler = iInteractLayerService.getRemoteHandler();
        if (remoteHandler != null) {
            remoteHandler.onVideoDetailStateChanged(request2);
        }
        if (j8 > 0) {
            reserveState.setType(2);
            reserveState.setId(String.valueOf(j8));
            reserveState.setState(Boolean.valueOf(z6));
            IRemoteHandler remoteHandler2 = iInteractLayerService.getRemoteHandler();
            if (remoteHandler2 != null) {
                remoteHandler2.onVideoDetailStateChanged(request2);
            }
        }
    }
}
