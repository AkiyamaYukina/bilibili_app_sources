package com.bilibili.lib.rpc.ticket;

import com.bilibili.lib.rpc.track.model.NetworkEvent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/ticket/Ticket.class */
public interface Ticket {
    @NotNull
    String onTicketReq(@NotNull String str, @NotNull String str2);

    void onTicketResp(@NotNull NetworkEvent networkEvent);
}
