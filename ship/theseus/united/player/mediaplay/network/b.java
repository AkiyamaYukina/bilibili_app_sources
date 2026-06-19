package com.bilibili.ship.theseus.united.player.mediaplay.network;

import com.bapis.bilibili.app.view.v1.TFInfoReply;
import com.bapis.bilibili.app.view.v1.TFPanelCustomized;
import com.bapis.bilibili.app.view.v1.TFToast;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/network/b.class */
public final class b {
    @NotNull
    public static final r a(@NotNull TFInfoReply tFInfoReply) {
        s sVar;
        long tipsId = tFInfoReply.getTipsId();
        q qVar = null;
        if (tFInfoReply.hasTfToast()) {
            TFToast tfToast = tFInfoReply.getTfToast();
            sVar = new s(tfToast.getBtnText(), tfToast.getBtnLink(), tfToast.getTitle(), tfToast.getDescription());
        } else {
            sVar = null;
        }
        if (tFInfoReply.hasTfPanelCustomized()) {
            TFPanelCustomized tfPanelCustomized = tFInfoReply.getTfPanelCustomized();
            qVar = new q(tfPanelCustomized.getRightBtnText(), tfPanelCustomized.getRightBtnLink(), tfPanelCustomized.getMainLabel());
        }
        return new r(tipsId, sVar, qVar, tFInfoReply.getUserFlagNew());
    }
}
