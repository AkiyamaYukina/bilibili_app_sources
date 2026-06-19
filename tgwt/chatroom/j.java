package com.bilibili.tgwt.chatroom;

import com.bilibili.chatroomsdk.ChatMsg;
import com.bilibili.chatroomsdk.FreyaEventBodyVo;
import com.bilibili.ogvvega.protobuf.OneofWrapper;
import com.bilibili.ogvvega.tunnel.Cause;
import com.bilibili.ogvvega.tunnel.Subscriber;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/chatroom/j.class */
public final class j extends Subscriber<FreyaEventBodyVo> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f110999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f111000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f111001c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, long j7, String str) {
        super(FreyaEventBodyVo.class);
        this.f110999a = kVar;
        this.f111000b = j7;
        this.f111001c = str;
    }

    @Override // com.bilibili.ogvvega.tunnel.Subscriber
    public final void onDisconnected(Cause cause, boolean z6) {
        com.bilibili.bangumi.logic.page.detail.service.e.a("[together-watch-RoomApi4TogetherWatchImpl$joinRoom$1$1-onDisconnected] ", "onDisconnected, errorType = " + cause + ", willReconnect = " + z6, "RoomApi4TogetherWatchImpl$joinRoom$1$1-onDisconnected", (Throwable) null);
        this.f110999a.f111008g.getClass();
        i.a("ogv.pgc-room.on-disconnected", MapsKt.mapOf(new Pair[]{TuplesKt.to("cause-type", cause.getType().toString()), TuplesKt.to("cause-msg", cause.getMsg()), TuplesKt.to("enter-id", this.f111001c), TuplesKt.to("will-reconnect", String.valueOf(z6))}));
    }

    @Override // com.bilibili.ogvvega.tunnel.Subscriber
    public final void onNext(FreyaEventBodyVo freyaEventBodyVo) {
        ChatMsg chatMsg;
        FreyaEventBodyVo freyaEventBodyVo2 = freyaEventBodyVo;
        BLog.i("RoomApi4TogetherWatchImpl$joinRoom$1$1-onNext", "[together-watch-RoomApi4TogetherWatchImpl$joinRoom$1$1-onNext] " + ("onNext, value = " + freyaEventBodyVo2));
        OneofWrapper event = freyaEventBodyVo2.getEvent();
        if (event == null || event.getEventCase() != 7) {
            m mVar = this.f110999a.f111009i;
            if (mVar != null) {
                freyaEventBodyVo2.getRoomId();
                mVar.b(freyaEventBodyVo2);
                return;
            }
            return;
        }
        n nVar = this.f110999a.f111008g;
        String str = this.f111001c;
        nVar.getClass();
        OneofWrapper event2 = freyaEventBodyVo2.getEvent();
        if (event2 != null) {
            Object value = event2.getValue();
            Object obj = value;
            if (!(value instanceof ChatMsg)) {
                obj = null;
            }
            chatMsg = (ChatMsg) obj;
        } else {
            chatMsg = null;
        }
        i.a("ogv.pgc-room.on-msg-received", MapsKt.mapOf(new Pair[]{TuplesKt.to("message-id", String.valueOf(chatMsg != null ? Long.valueOf(chatMsg.getMsgId()) : null)), TuplesKt.to("room-id", String.valueOf(chatMsg != null ? Long.valueOf(chatMsg.getRoomId()) : null)), TuplesKt.to(EditCustomizeSticker.TAG_MID, String.valueOf(com.bilibili.ogv.infra.account.a.f67852b.mid())), TuplesKt.to("enter-id", str), TuplesKt.to("type", String.valueOf(chatMsg != null ? Integer.valueOf(chatMsg.getType()) : null)), TuplesKt.to("seq-id", String.valueOf(freyaEventBodyVo2.getSeqId())), TuplesKt.to("is-push", "true")}));
        Set set = (Set) ((LinkedHashMap) this.f110999a.f111006e).get(Long.valueOf(this.f111000b));
        if (set == null) {
            return;
        }
        k kVar = this.f110999a;
        ReentrantLock reentrantLock = kVar.f111005d;
        reentrantLock.lock();
        try {
            OneofWrapper event3 = freyaEventBodyVo2.getEvent();
            ChatMsg chatMsg2 = null;
            if (event3 != null) {
                Object value2 = event3.getValue();
                if (!(value2 instanceof ChatMsg)) {
                    value2 = null;
                }
                chatMsg2 = (ChatMsg) value2;
            }
            if (chatMsg2 != null && !set.contains(Long.valueOf(chatMsg2.getMsgId()))) {
                set.add(Long.valueOf(chatMsg2.getMsgId()));
                m mVar2 = kVar.f111009i;
                if (mVar2 != null) {
                    freyaEventBodyVo2.getRoomId();
                    mVar2.b(freyaEventBodyVo2);
                }
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.bilibili.ogvvega.tunnel.Subscriber
    public final void onSubscribed(boolean z6) {
        n nVar = this.f110999a.f111008g;
        long j7 = this.f111000b;
        String str = this.f111001c;
        nVar.getClass();
        i.a("ogv.pgc-room.on-join-success", MapsKt.mapOf(new Pair[]{TuplesKt.to("room-id", String.valueOf(j7)), TuplesKt.to("enter-id", str), TuplesKt.to("cause-by-reconnect", String.valueOf(z6))}));
        defpackage.a.b("[together-watch-RoomApi4TogetherWatchImpl$joinRoom$1$1-onSubscribed] ", "onSubscribed, causeByReconnect = " + z6, "RoomApi4TogetherWatchImpl$joinRoom$1$1-onSubscribed");
        m mVar = this.f110999a.f111009i;
        if (mVar != null) {
            mVar.a(z6);
        }
    }
}
