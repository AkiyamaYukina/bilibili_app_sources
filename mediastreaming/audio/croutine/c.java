package com.bilibili.mediastreaming.audio.croutine;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.State;
import com.bilibili.app.gemini.player.widget.like.z;
import com.bilibili.bililive.biz.pkv2.LivePkViewModelManager;
import com.bilibili.bililive.room.ui.roomv3.base.viewmodel.f;
import com.bilibili.bililive.room.ui.roomv3.gift.LiveRoomGiftViewModel;
import com.bilibili.pegasus.components.InlineComponent;
import com.bilibili.ship.theseus.united.player.oldway.UnitedGeminiPlayerCommonActionDelegate;
import kntr.common.ouro.common.ui.toolPanel.expandablePanel.ExpandablePanelState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import nh0.InterfaceC8094b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/audio/croutine/c.class */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f65705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f65706b;

    public /* synthetic */ c(Object obj, int i7) {
        this.f65705a = i7;
        this.f65706b = obj;
    }

    public final Object invoke() {
        switch (this.f65705a) {
            case 0:
                long id = Thread.currentThread().getId();
                d dVar = (d) this.f65706b;
                dVar.f65710d = id;
                InterfaceC8094b.b(dVar, androidx.core.content.c.b(dVar.f65710d, "mCurrentAudioWorkThread name:", Thread.currentThread().getName(), ", ID:"), null, 14);
                return Unit.INSTANCE;
            case 1:
                InlineComponent inlineComponent = (InlineComponent) this.f65706b;
                return new com.bilibili.pegasus.common.inlineplay.b(inlineComponent, (com.bilibili.inline.fetcher.a) inlineComponent.f75793m.getValue(), (com.bilibili.pegasus.common.inlineplay.c) inlineComponent.f75792l.getValue());
            case 2:
                return new z(((UnitedGeminiPlayerCommonActionDelegate) this.f65706b).f104706b);
            case 3:
                return ((View) this.f65706b).findViewById(2131306365);
            case 4:
                return new LivePkViewModelManager((Context) this.f65706b);
            case 5:
                LiveRoomGiftViewModel liveRoomGiftViewModel = (f) ((jJ.c) this.f65706b).a.c.get(LiveRoomGiftViewModel.class);
                if (liveRoomGiftViewModel instanceof LiveRoomGiftViewModel) {
                    return liveRoomGiftViewModel;
                }
                throw new IllegalStateException(LiveRoomGiftViewModel.class.getName().concat(" was not injected !"));
            case 6:
                ((Function0) ((State) this.f65706b).getValue()).invoke();
                return Unit.INSTANCE;
            default:
                return (ExpandablePanelState.Style) ((ExpandablePanelState) this.f65706b).d.getCurrentValue();
        }
    }
}
