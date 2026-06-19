package com.bilibili.player.tangram.playercore;

import com.bilibili.player.tangram.basic.PlayerAvailability;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/k.class */
public final class k<T> implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PCSFacadeImpl f79449a;

    public k(PCSFacadeImpl pCSFacadeImpl) {
        this.f79449a = pCSFacadeImpl;
    }

    public final Object emit(Object obj, Continuation continuation) {
        PlayerAvailability playerAvailability = (PlayerAvailability) obj;
        PCSFacadeImpl pCSFacadeImpl = this.f79449a;
        Object value = pCSFacadeImpl.f79394l.getValue();
        MutableStateFlow<PlayerAvailability> mutableStateFlow = pCSFacadeImpl.f79394l;
        if (playerAvailability != value) {
            defpackage.a.b("[tangram-player-core-PCSFacadeImpl$collectPlayerState$3-emit] ", "playerAvailability changed: " + playerAvailability + " :" + mutableStateFlow.getValue(), "PCSFacadeImpl$collectPlayerState$3-emit");
        }
        mutableStateFlow.setValue(playerAvailability);
        return Unit.INSTANCE;
    }
}
