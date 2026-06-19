package com.bilibili.lib.ticket.api;

import Af0.C1399a;
import Cf0.C1515b;
import androidx.annotation.AnyThread;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.bilibili.lib.blkv.RawKV;
import com.bilibili.lib.rpc.ticket.Ticket;
import com.bilibili.lib.rpc.track.model.NetworkEvent;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;
import zf0.C9192b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ticket/api/BiliTickets.class */
public final class BiliTickets implements Ticket {

    @NotNull
    public static final BiliTickets INSTANCE = new BiliTickets();

    @VisibleForTesting
    @WorkerThread
    public final void getTicketSyncWRetry() {
        C9192b.a();
    }

    @WorkerThread
    public final void init() {
        if (C9192b.f130295a) {
            ReentrantReadWriteLock.WriteLock writeLock = C9192b.f130301g;
            writeLock.lock();
            boolean z6 = true;
            try {
                C9192b.f130297c = true;
                RawKV rawKV = C1399a.f299a;
                rawKV.getString("ticket", "");
                long j7 = rawKV.getLong("ticket_expire_at_in_ms", 0L);
                int i7 = C1515b.f1601c;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (j7 != 0 && j7 - jCurrentTimeMillis >= C1515b.f1599a * 1000) {
                    z6 = false;
                }
                Unit unit = Unit.INSTANCE;
                writeLock.unlock();
                if (!z6) {
                    BLog.ifmt("ticket.internal.api", "Ticket still valid, maybe update later", new Object[0]);
                } else {
                    BLog.ifmt("ticket.internal.api", "Update ticket when init", new Object[0]);
                    C9192b.b();
                }
            } catch (Throwable th) {
                writeLock.unlock();
                throw th;
            }
        }
    }

    @AnyThread
    public final void maybeGetTicket() {
        C9192b.b();
    }

    @Override // com.bilibili.lib.rpc.ticket.Ticket
    @AnyThread
    @NotNull
    public String onTicketReq(@NotNull String str, @NotNull String str2) {
        String str3 = "";
        if (C9192b.f130295a) {
            ReentrantReadWriteLock.ReadLock readLock = C9192b.f130300f;
            readLock.lock();
            try {
                RawKV rawKV = C1399a.f299a;
                String string = rawKV.getString("ticket", "");
                long j7 = rawKV.getLong("ticket_expire_at_in_ms", 0L);
                int i7 = C1515b.f1601c;
                long jCurrentTimeMillis = System.currentTimeMillis();
                boolean z6 = true;
                if (j7 != 0 && j7 - jCurrentTimeMillis >= C1515b.f1599a * 1000) {
                    z6 = false;
                }
                Unit unit = Unit.INSTANCE;
                readLock.unlock();
                str3 = string;
                if (z6) {
                    C9192b.b();
                    str3 = string;
                }
            } catch (Throwable th) {
                readLock.unlock();
                throw th;
            }
        }
        return str3;
    }

    @Override // com.bilibili.lib.rpc.ticket.Ticket
    @AnyThread
    public void onTicketResp(@NotNull NetworkEvent networkEvent) {
        if (C9192b.f130295a && Intrinsics.areEqual(networkEvent.getHeader().getTicketStatus(), "1")) {
            BLog.wfmt("ticket.internal.api", "Ticket is expired by service, update now", new Object[0]);
            C9192b.b();
        }
    }
}
