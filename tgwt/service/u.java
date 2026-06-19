package com.bilibili.tgwt.service;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.base.MainThread;
import com.bilibili.bililive.bilirtc.BiliRtcClientProxy;
import com.bilibili.bililive.mediastreaming.rtclink.v2.model.BiliRTCOuterAVType;
import com.bilibili.bililive.mediastreaming.rtclink.v2.model.BiliRTCOuterMuteReason;
import com.bilibili.bililive.mediastreaming.rtclink.v2.model.BiliRTCUserInfo;
import com.bilibili.bililive.mediastreaming.rtclink.v2.observer.outer.ConnectionState;
import com.bilibili.bililive.mediastreaming.rtclink.v2.observer.outer.ExternalParams;
import com.bilibili.bililive.mediastreaming.rtclink.v2.observer.outer.LeaveState;
import com.bilibili.bililive.mediastreaming.rtclink.v2.observer.outer.PubState;
import com.bilibili.chatroomsdk.ChatRoomMember;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/u.class */
@StabilityInferred(parameters = 0)
public final class u implements eu.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f112007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final o f112008b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public BiliRtcClientProxy f112010d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f112009c = com.bilibili.ogv.infra.account.a.f67852b.mid();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.bililive.bilirtc.openplatform.a f112011e = new com.bilibili.bililive.bilirtc.openplatform.a();

    public u(@NotNull Context context, @NotNull o oVar) {
        this.f112007a = context;
        this.f112008b = oVar;
        BLog.i("TogetherWatchRTCClient-initRTCV2", "[together-watch-TogetherWatchRTCClient-initRTCV2] initRTCV2");
        BiliRtcClientProxy biliRtcClientProxyBuild = new BiliRtcClientProxy.Builder(context, this).setAudioIsListenerBluetooth(true).setIsUseVideoDevice(false).setIsEnableAutoPub(true).setIsEnableAutoSub(true).setIsUseAudioDevice(true).setIsUseVideoDevice(false).build();
        this.f112010d = biliRtcClientProxyBuild;
        if (biliRtcClientProxyBuild != null) {
            biliRtcClientProxyBuild.initDefaultAVStream();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.tgwt.service.t] */
    public final void a(@NotNull String str, @NotNull Map map) {
        this.f112011e.e(str, map, (t) new Function3(this) { // from class: com.bilibili.tgwt.service.t

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final u f112006a;

            {
                this.f112006a = this;
            }

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                ((Boolean) obj).booleanValue();
                BiliRtcClientProxy biliRtcClientProxy = this.f112006a.f112010d;
                if (biliRtcClientProxy != null) {
                    BiliRtcClientProxy.leaveChannel$default(biliRtcClientProxy, (String) null, 1, (Object) null);
                }
                return Unit.INSTANCE;
            }
        });
    }

    public final void b(long j7, long j8, @Nullable ExternalParams externalParams) {
    }

    public final void c(long j7, final long j8, @NotNull AC.e eVar, @Nullable FC.a aVar, @Nullable ExternalParams externalParams) {
        MainThread.runOnMainThread(new Function0(this, j8) { // from class: com.bilibili.tgwt.service.r

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final u f112001a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f112002b;

            {
                this.f112001a = this;
                this.f112002b = j8;
            }

            public final Object invoke() {
                o oVar = this.f112001a.f112008b;
                long j9 = this.f112002b;
                oVar.getClass();
                defpackage.a.b("[together-watch-ChatVoiceRtcService$openRtcBizCallback$1-onRemoteUserJoinChannel] ", "voice room onRemoteUserJoinChannel " + String.valueOf(j9), "ChatVoiceRtcService$openRtcBizCallback$1-onRemoteUserJoinChannel");
                return Unit.INSTANCE;
            }
        });
    }

    public final void d(long j7, long j8, int i7, @NotNull byte[] bArr, boolean z6) {
    }

    public final void g(long j7, long j8, @Nullable FC.a aVar, @Nullable ExternalParams externalParams) {
    }

    public final void i(long j7, long j8, @Nullable FC.a aVar, @Nullable ExternalParams externalParams) {
    }

    public final void m(final long j7, long j8, @NotNull final PubState pubState, @Nullable FC.a aVar, @Nullable ExternalParams externalParams) {
        MainThread.runOnMainThread(new Function0(pubState, this, j7) { // from class: com.bilibili.tgwt.service.q

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PubState f111998a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final u f111999b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final long f112000c;

            {
                this.f111998a = pubState;
                this.f111999b = this;
                this.f112000c = j7;
            }

            public final Object invoke() {
                if (this.f111998a == PubState.PUB_SUCCESS) {
                    o oVar = this.f111999b.f112008b;
                    long j9 = this.f112000c;
                    oVar.f111992a.f111939i.setValue(Boolean.TRUE);
                    defpackage.a.b("[together-watch-ChatVoiceRtcService$openRtcBizCallback$1-onLocalUserJoinChannel] ", "voice room onLocalUserJoinChannel " + String.valueOf(j9), "ChatVoiceRtcService$openRtcBizCallback$1-onLocalUserJoinChannel");
                }
                return Unit.INSTANCE;
            }
        });
    }

    public final void n(long j7, long j8, @Nullable FC.a aVar) {
    }

    public final void o(long j7, long j8, @NotNull BiliRTCUserInfo biliRTCUserInfo) {
    }

    public final void onAVStatusChanged(long j7, long j8, @NotNull BiliRTCOuterAVType biliRTCOuterAVType, boolean z6, @NotNull BiliRTCOuterMuteReason biliRTCOuterMuteReason) {
    }

    public final void onInChannelUsersAudioLevel(long j7, @NotNull List<AC.a> list) {
        ArrayList arrayList = new ArrayList();
        for (AC.a aVar : list) {
            hu.a aVar2 = new hu.a(String.valueOf(aVar.b), (int) (aVar.a * 32767.0d));
            if (aVar.b == this.f112009c) {
                MainThread.runOnMainThread(new com.bilibili.lib.fasthybrid.container.s(1, this, aVar2));
            } else {
                arrayList.add(aVar2);
            }
        }
        MainThread.runOnMainThread(new com.bilibili.playerbizcommonv2.danmaku.feedback.q(2, this, arrayList));
    }

    public final void onRTCConnectState(long j7, @Nullable ConnectionState connectionState) {
    }

    public final void onRemoteLeaved(long j7, final long j8, @Nullable final LeaveState leaveState) {
        MainThread.runOnMainThread(new Function0(this, j8, leaveState) { // from class: com.bilibili.tgwt.service.s

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final u f112003a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f112004b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final LeaveState f112005c;

            {
                this.f112003a = this;
                this.f112004b = j8;
                this.f112005c = leaveState;
            }

            public final Object invoke() {
                o oVar = this.f112003a.f112008b;
                long j9 = this.f112004b;
                int size = 0;
                boolean z6 = this.f112005c == LeaveState.NORMAL;
                oVar.getClass();
                defpackage.a.b("[together-watch-ChatVoiceRtcService$openRtcBizCallback$1-onRemoteUserLeaveChannel] ", "voice room onRemoteUserLeaveChannel " + String.valueOf(j9) + " quit " + z6, "ChatVoiceRtcService$openRtcBizCallback$1-onRemoteUserLeaveChannel");
                ChatVoiceRtcService chatVoiceRtcService = oVar.f111992a;
                List<ChatRoomMember> listJ = chatVoiceRtcService.f111933b.j();
                if (listJ != null) {
                    size = listJ.size();
                }
                if (size <= 1) {
                    chatVoiceRtcService.b();
                }
                return Unit.INSTANCE;
            }
        });
    }

    public final void onRenderRemoteVideoFirstFrame(long j7, long j8, long j9, int i7, int i8) {
    }

    public final void onSelfLeaved(long j7, @Nullable LeaveState leaveState, @Nullable ExternalParams externalParams) {
        MainThread.runOnMainThread(new Be1.j(this, 3));
    }

    public final void onUnSubRemoteAVTrack(long j7, long j8, @Nullable BiliRTCUserInfo biliRTCUserInfo, boolean z6, @Nullable FC.a aVar, @Nullable ExternalParams externalParams) {
    }

    public final void p(long j7, long j8, @NotNull BiliRTCUserInfo biliRTCUserInfo) {
    }
}
