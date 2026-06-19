package com.bilibili.lib.rpc.track.model.broadcast;

import com.bilibili.lib.rpc.track.model.Tunnel;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/track/model/broadcast/BroadcastEvent.class */
public final class BroadcastEvent extends GeneratedMessageLite<BroadcastEvent, b> implements MessageLiteOrBuilder {
    public static final int BIZ_ENABLED_CONFIG_FIELD_NUMBER = 29;
    public static final int BIZ_ENABLED_FIELD_NUMBER = 28;
    public static final int BIZ_ENABLED_TUNNEL_FIELD_NUMBER = 30;
    public static final int CONNECTION_ID_FIELD_NUMBER = 21;
    private static final BroadcastEvent DEFAULT_INSTANCE;
    public static final int ENABLED_CONFIG_FIELD_NUMBER = 26;
    public static final int ENABLED_DEVICE_FIELD_NUMBER = 27;
    public static final int ENABLED_FIELD_NUMBER = 25;
    public static final int EVENT_FIELD_NUMBER = 4;
    public static final int EXCEPTION_MESSAGE_FIELD_NUMBER = 12;
    public static final int EXCEPTION_NAME_FIELD_NUMBER = 11;
    public static final int GUID_FIELD_NUMBER = 20;
    public static final int HEARTBEAT_LOST_FIELD_NUMBER = 14;
    public static final int HOST_FIELD_NUMBER = 103;
    public static final int HP_FIELD_NUMBER = 101;
    public static final int MESSAGE_ID_FIELD_NUMBER = 13;
    public static final int NEW_LOGIN_FIELD_NUMBER = 7;
    public static final int NEW_NETWORK_FIELD_NUMBER = 8;
    private static volatile Parser<BroadcastEvent> PARSER;
    public static final int PORT_FIELD_NUMBER = 104;
    public static final int PROCESS_FIELD_NUMBER = 16;
    public static final int RESTART_DELAY_FIELD_NUMBER = 19;
    public static final int RESTART_POLICY_JSON_FIELD_NUMBER = 24;
    public static final int RETRY_DELAY_FIELD_NUMBER = 6;
    public static final int RETRY_POLICY_JSON_FIELD_NUMBER = 23;
    public static final int SESSION_FIELD_NUMBER = 1;
    public static final int SHARED_FIELD_NUMBER = 100;
    public static final int SN_FIELD_NUMBER = 18;
    public static final int START_FIELD_NUMBER = 2;
    public static final int STATS_JSON_FIELD_NUMBER = 22;
    public static final int STATUS_CODE_FIELD_NUMBER = 9;
    public static final int STATUS_MESSAGE_FIELD_NUMBER = 10;
    public static final int TAG_FIELD_NUMBER = 102;
    public static final int TARGE_PATH_FIELD_NUMBER = 5;
    public static final int THREAD_FIELD_NUMBER = 17;
    public static final int TIME_FIELD_NUMBER = 3;
    public static final int TUNNEL_FIELD_NUMBER = 15;
    public static final int UPSTREAM_ACK_MESSAGE_ID_FIELD_NUMBER = 31;
    private int bizEnabledConfig_;
    private int bizEnabledTunnel_;
    private int bizEnabled_;
    private int enabledConfig_;
    private int enabledDevice_;
    private int enabled_;
    private int event_;
    private boolean hp_;
    private int port_;
    private boolean shared_;
    private int sn_;
    private long start_;
    private long time_;
    private int tunnel_;
    private long upstreamAckMessageId_;
    private String session_ = "";
    private String targePath_ = "";
    private String retryDelay_ = "";
    private String newLogin_ = "";
    private String newNetwork_ = "";
    private String statusCode_ = "";
    private String statusMessage_ = "";
    private String exceptionName_ = "";
    private String exceptionMessage_ = "";
    private String messageId_ = "";
    private String heartbeatLost_ = "";
    private String process_ = "";
    private String thread_ = "";
    private String restartDelay_ = "";
    private String guid_ = "";
    private String connectionId_ = "";
    private String statsJson_ = "";
    private String retryPolicyJson_ = "";
    private String restartPolicyJson_ = "";
    private String tag_ = "";
    private String host_ = "";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/track/model/broadcast/BroadcastEvent$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f64381a;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:27:0x006d
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke[] r0 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                com.bilibili.lib.rpc.track.model.broadcast.BroadcastEvent.a.f64381a = r0
                r0 = r4
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L59
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L59
            L14:
                int[] r0 = com.bilibili.lib.rpc.track.model.broadcast.BroadcastEvent.a.f64381a     // Catch: java.lang.NoSuchFieldError -> L59 java.lang.NoSuchFieldError -> L5d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch: java.lang.NoSuchFieldError -> L5d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5d
            L1f:
                int[] r0 = com.bilibili.lib.rpc.track.model.broadcast.BroadcastEvent.a.f64381a     // Catch: java.lang.NoSuchFieldError -> L5d java.lang.NoSuchFieldError -> L61
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch: java.lang.NoSuchFieldError -> L61
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L61
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L61
            L2a:
                int[] r0 = com.bilibili.lib.rpc.track.model.broadcast.BroadcastEvent.a.f64381a     // Catch: java.lang.NoSuchFieldError -> L61 java.lang.NoSuchFieldError -> L65
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L65
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L65
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L65
            L35:
                int[] r0 = com.bilibili.lib.rpc.track.model.broadcast.BroadcastEvent.a.f64381a     // Catch: java.lang.NoSuchFieldError -> L65 java.lang.NoSuchFieldError -> L69
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch: java.lang.NoSuchFieldError -> L69
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L69
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L69
            L40:
                int[] r0 = com.bilibili.lib.rpc.track.model.broadcast.BroadcastEvent.a.f64381a     // Catch: java.lang.NoSuchFieldError -> L69 java.lang.NoSuchFieldError -> L6d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L6d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            L4c:
                int[] r0 = com.bilibili.lib.rpc.track.model.broadcast.BroadcastEvent.a.f64381a     // Catch: java.lang.NoSuchFieldError -> L6d java.lang.NoSuchFieldError -> L71
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L71
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L71
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L71
            L58:
                return
            L59:
                r4 = move-exception
                goto L14
            L5d:
                r4 = move-exception
                goto L1f
            L61:
                r4 = move-exception
                goto L2a
            L65:
                r4 = move-exception
                goto L35
            L69:
                r4 = move-exception
                goto L40
            L6d:
                r4 = move-exception
                goto L4c
            L71:
                r4 = move-exception
                goto L58
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.rpc.track.model.broadcast.BroadcastEvent.a.m6740clinit():void");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/track/model/broadcast/BroadcastEvent$b.class */
    public static final class b extends GeneratedMessageLite.Builder<BroadcastEvent, b> implements MessageLiteOrBuilder {
        public b() {
            super(BroadcastEvent.DEFAULT_INSTANCE);
        }

        public final void A(long j7) {
            copyOnWrite();
            ((BroadcastEvent) ((GeneratedMessageLite.Builder) this).instance).setStart(j7);
        }

        public final void B(String str) {
            copyOnWrite();
            ((BroadcastEvent) ((GeneratedMessageLite.Builder) this).instance).setStatsJson(str);
        }

        public final void C(String str) {
            copyOnWrite();
            ((BroadcastEvent) ((GeneratedMessageLite.Builder) this).instance).setStatusCode(str);
        }

        public final void D(String str) {
            copyOnWrite();
            ((BroadcastEvent) ((GeneratedMessageLite.Builder) this).instance).setStatusMessage(str);
        }

        public final void E() {
            copyOnWrite();
            ((BroadcastEvent) ((GeneratedMessageLite.Builder) this).instance).setTag("shared");
        }

        public final void F(String str) {
            copyOnWrite();
            ((BroadcastEvent) ((GeneratedMessageLite.Builder) this).instance).setTargePath(str);
        }

        public final void G(String str) {
            copyOnWrite();
            ((BroadcastEvent) ((GeneratedMessageLite.Builder) this).instance).setThread(str);
        }

        public final void H(long j7) {
            copyOnWrite();
            ((BroadcastEvent) ((GeneratedMessageLite.Builder) this).instance).setTime(j7);
        }

        public final void I(Tunnel tunnel) {
            copyOnWrite();
            ((BroadcastEvent) ((GeneratedMessageLite.Builder) this).instance).setTunnel(tunnel);
        }

        public final void J(long j7) {
            copyOnWrite();
            ((BroadcastEvent) ((GeneratedMessageLite.Builder) this).instance).setUpstreamAckMessageId(j7);
        }

        public final void a(int i7) {
            copyOnWrite();
            ((BroadcastEvent) ((GeneratedMessageLite.Builder) this).instance).setBizEnabled(i7);
        }

        public final void b(int i7) {
            copyOnWrite();
            ((BroadcastEvent) ((GeneratedMessageLite.Builder) this).instance).setBizEnabledConfig(i7);
        }

        public final void c(int i7) {
            copyOnWrite();
            ((BroadcastEvent) ((GeneratedMessageLite.Builder) this).instance).setBizEnabledTunnel(i7);
        }

        public final void d(String str) {
            copyOnWrite();
            ((BroadcastEvent) ((GeneratedMessageLite.Builder) this).instance).setConnectionId(str);
        }

        public final void e(int i7) {
            copyOnWrite();
            ((BroadcastEvent) ((GeneratedMessageLite.Builder) this).instance).setEnabled(i7);
        }

        public final void f(int i7) {
            copyOnWrite();
            ((BroadcastEvent) ((GeneratedMessageLite.Builder) this).instance).setEnabledConfig(i7);
        }

        public final void g(int i7) {
            copyOnWrite();
            ((BroadcastEvent) ((GeneratedMessageLite.Builder) this).instance).setEnabledDevice(i7);
        }

        public final long getStart() {
            return ((BroadcastEvent) ((GeneratedMessageLite.Builder) this).instance).getStart();
        }

        public final void h(Event event) {
            copyOnWrite();
            ((BroadcastEvent) ((GeneratedMessageLite.Builder) this).instance).setEvent(event);
        }

        public final void i(String str) {
            copyOnWrite();
            ((BroadcastEvent) ((GeneratedMessageLite.Builder) this).instance).setExceptionMessage(str);
        }

        public final void j(String str) {
            copyOnWrite();
            ((BroadcastEvent) ((GeneratedMessageLite.Builder) this).instance).setExceptionName(str);
        }

        public final void k(String str) {
            copyOnWrite();
            ((BroadcastEvent) ((GeneratedMessageLite.Builder) this).instance).setGuid(str);
        }

        public final void l(String str) {
            copyOnWrite();
            ((BroadcastEvent) ((GeneratedMessageLite.Builder) this).instance).setHeartbeatLost(str);
        }

        public final void m() {
            copyOnWrite();
            ((BroadcastEvent) ((GeneratedMessageLite.Builder) this).instance).setHost("broadcast.chat.bilibili.com");
        }

        public final void n() {
            copyOnWrite();
            ((BroadcastEvent) ((GeneratedMessageLite.Builder) this).instance).setHp(false);
        }

        public final void o(String str) {
            copyOnWrite();
            ((BroadcastEvent) ((GeneratedMessageLite.Builder) this).instance).setMessageId(str);
        }

        public final void p(String str) {
            copyOnWrite();
            ((BroadcastEvent) ((GeneratedMessageLite.Builder) this).instance).setNewLogin(str);
        }

        public final void q(String str) {
            copyOnWrite();
            ((BroadcastEvent) ((GeneratedMessageLite.Builder) this).instance).setNewNetwork(str);
        }

        public final void r() {
            copyOnWrite();
            ((BroadcastEvent) ((GeneratedMessageLite.Builder) this).instance).setPort(7824);
        }

        public final void s(String str) {
            copyOnWrite();
            ((BroadcastEvent) ((GeneratedMessageLite.Builder) this).instance).setProcess(str);
        }

        public final void t(String str) {
            copyOnWrite();
            ((BroadcastEvent) ((GeneratedMessageLite.Builder) this).instance).setRestartDelay(str);
        }

        public final void u(String str) {
            copyOnWrite();
            ((BroadcastEvent) ((GeneratedMessageLite.Builder) this).instance).setRestartPolicyJson(str);
        }

        public final void v(String str) {
            copyOnWrite();
            ((BroadcastEvent) ((GeneratedMessageLite.Builder) this).instance).setRetryDelay(str);
        }

        public final void w(String str) {
            copyOnWrite();
            ((BroadcastEvent) ((GeneratedMessageLite.Builder) this).instance).setRetryPolicyJson(str);
        }

        public final void x(String str) {
            copyOnWrite();
            ((BroadcastEvent) ((GeneratedMessageLite.Builder) this).instance).setSession(str);
        }

        public final void y() {
            copyOnWrite();
            ((BroadcastEvent) ((GeneratedMessageLite.Builder) this).instance).setShared(true);
        }

        public final void z(int i7) {
            copyOnWrite();
            ((BroadcastEvent) ((GeneratedMessageLite.Builder) this).instance).setSn(i7);
        }
    }

    static {
        BroadcastEvent broadcastEvent = new BroadcastEvent();
        DEFAULT_INSTANCE = broadcastEvent;
        GeneratedMessageLite.registerDefaultInstance(BroadcastEvent.class, broadcastEvent);
    }

    private BroadcastEvent() {
    }

    private void clearBizEnabled() {
        this.bizEnabled_ = 0;
    }

    private void clearBizEnabledConfig() {
        this.bizEnabledConfig_ = 0;
    }

    private void clearBizEnabledTunnel() {
        this.bizEnabledTunnel_ = 0;
    }

    private void clearConnectionId() {
        this.connectionId_ = getDefaultInstance().getConnectionId();
    }

    private void clearEnabled() {
        this.enabled_ = 0;
    }

    private void clearEnabledConfig() {
        this.enabledConfig_ = 0;
    }

    private void clearEnabledDevice() {
        this.enabledDevice_ = 0;
    }

    private void clearEvent() {
        this.event_ = 0;
    }

    private void clearExceptionMessage() {
        this.exceptionMessage_ = getDefaultInstance().getExceptionMessage();
    }

    private void clearExceptionName() {
        this.exceptionName_ = getDefaultInstance().getExceptionName();
    }

    private void clearGuid() {
        this.guid_ = getDefaultInstance().getGuid();
    }

    private void clearHeartbeatLost() {
        this.heartbeatLost_ = getDefaultInstance().getHeartbeatLost();
    }

    private void clearHost() {
        this.host_ = getDefaultInstance().getHost();
    }

    private void clearHp() {
        this.hp_ = false;
    }

    private void clearMessageId() {
        this.messageId_ = getDefaultInstance().getMessageId();
    }

    private void clearNewLogin() {
        this.newLogin_ = getDefaultInstance().getNewLogin();
    }

    private void clearNewNetwork() {
        this.newNetwork_ = getDefaultInstance().getNewNetwork();
    }

    private void clearPort() {
        this.port_ = 0;
    }

    private void clearProcess() {
        this.process_ = getDefaultInstance().getProcess();
    }

    private void clearRestartDelay() {
        this.restartDelay_ = getDefaultInstance().getRestartDelay();
    }

    private void clearRestartPolicyJson() {
        this.restartPolicyJson_ = getDefaultInstance().getRestartPolicyJson();
    }

    private void clearRetryDelay() {
        this.retryDelay_ = getDefaultInstance().getRetryDelay();
    }

    private void clearRetryPolicyJson() {
        this.retryPolicyJson_ = getDefaultInstance().getRetryPolicyJson();
    }

    private void clearSession() {
        this.session_ = getDefaultInstance().getSession();
    }

    private void clearShared() {
        this.shared_ = false;
    }

    private void clearSn() {
        this.sn_ = 0;
    }

    private void clearStart() {
        this.start_ = 0L;
    }

    private void clearStatsJson() {
        this.statsJson_ = getDefaultInstance().getStatsJson();
    }

    private void clearStatusCode() {
        this.statusCode_ = getDefaultInstance().getStatusCode();
    }

    private void clearStatusMessage() {
        this.statusMessage_ = getDefaultInstance().getStatusMessage();
    }

    private void clearTag() {
        this.tag_ = getDefaultInstance().getTag();
    }

    private void clearTargePath() {
        this.targePath_ = getDefaultInstance().getTargePath();
    }

    private void clearThread() {
        this.thread_ = getDefaultInstance().getThread();
    }

    private void clearTime() {
        this.time_ = 0L;
    }

    private void clearTunnel() {
        this.tunnel_ = 0;
    }

    private void clearUpstreamAckMessageId() {
        this.upstreamAckMessageId_ = 0L;
    }

    public static BroadcastEvent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static b newBuilder(BroadcastEvent broadcastEvent) {
        return (b) DEFAULT_INSTANCE.createBuilder(broadcastEvent);
    }

    public static BroadcastEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BroadcastEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BroadcastEvent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BroadcastEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BroadcastEvent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BroadcastEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static BroadcastEvent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BroadcastEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static BroadcastEvent parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BroadcastEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static BroadcastEvent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BroadcastEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static BroadcastEvent parseFrom(InputStream inputStream) throws IOException {
        return (BroadcastEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BroadcastEvent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BroadcastEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BroadcastEvent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BroadcastEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static BroadcastEvent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BroadcastEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static BroadcastEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BroadcastEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BroadcastEvent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BroadcastEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<BroadcastEvent> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBizEnabled(int i7) {
        this.bizEnabled_ = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBizEnabledConfig(int i7) {
        this.bizEnabledConfig_ = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBizEnabledTunnel(int i7) {
        this.bizEnabledTunnel_ = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectionId(String str) {
        str.getClass();
        this.connectionId_ = str;
    }

    private void setConnectionIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.connectionId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnabled(int i7) {
        this.enabled_ = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnabledConfig(int i7) {
        this.enabledConfig_ = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnabledDevice(int i7) {
        this.enabledDevice_ = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvent(Event event) {
        this.event_ = event.getNumber();
    }

    private void setEventValue(int i7) {
        this.event_ = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExceptionMessage(String str) {
        str.getClass();
        this.exceptionMessage_ = str;
    }

    private void setExceptionMessageBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.exceptionMessage_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExceptionName(String str) {
        str.getClass();
        this.exceptionName_ = str;
    }

    private void setExceptionNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.exceptionName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGuid(String str) {
        str.getClass();
        this.guid_ = str;
    }

    private void setGuidBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.guid_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeartbeatLost(String str) {
        str.getClass();
        this.heartbeatLost_ = str;
    }

    private void setHeartbeatLostBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.heartbeatLost_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHost(String str) {
        str.getClass();
        this.host_ = str;
    }

    private void setHostBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.host_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHp(boolean z6) {
        this.hp_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageId(String str) {
        str.getClass();
        this.messageId_ = str;
    }

    private void setMessageIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.messageId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewLogin(String str) {
        str.getClass();
        this.newLogin_ = str;
    }

    private void setNewLoginBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.newLogin_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewNetwork(String str) {
        str.getClass();
        this.newNetwork_ = str;
    }

    private void setNewNetworkBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.newNetwork_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPort(int i7) {
        this.port_ = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProcess(String str) {
        str.getClass();
        this.process_ = str;
    }

    private void setProcessBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.process_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRestartDelay(String str) {
        str.getClass();
        this.restartDelay_ = str;
    }

    private void setRestartDelayBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.restartDelay_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRestartPolicyJson(String str) {
        str.getClass();
        this.restartPolicyJson_ = str;
    }

    private void setRestartPolicyJsonBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.restartPolicyJson_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRetryDelay(String str) {
        str.getClass();
        this.retryDelay_ = str;
    }

    private void setRetryDelayBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.retryDelay_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRetryPolicyJson(String str) {
        str.getClass();
        this.retryPolicyJson_ = str;
    }

    private void setRetryPolicyJsonBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.retryPolicyJson_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSession(String str) {
        str.getClass();
        this.session_ = str;
    }

    private void setSessionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.session_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShared(boolean z6) {
        this.shared_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSn(int i7) {
        this.sn_ = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStart(long j7) {
        this.start_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatsJson(String str) {
        str.getClass();
        this.statsJson_ = str;
    }

    private void setStatsJsonBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.statsJson_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatusCode(String str) {
        str.getClass();
        this.statusCode_ = str;
    }

    private void setStatusCodeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.statusCode_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatusMessage(String str) {
        str.getClass();
        this.statusMessage_ = str;
    }

    private void setStatusMessageBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.statusMessage_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTag(String str) {
        str.getClass();
        this.tag_ = str;
    }

    private void setTagBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.tag_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTargePath(String str) {
        str.getClass();
        this.targePath_ = str;
    }

    private void setTargePathBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.targePath_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setThread(String str) {
        str.getClass();
        this.thread_ = str;
    }

    private void setThreadBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.thread_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTime(long j7) {
        this.time_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTunnel(Tunnel tunnel) {
        this.tunnel_ = tunnel.getNumber();
    }

    private void setTunnelValue(int i7) {
        this.tunnel_ = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpstreamAckMessageId(long j7) {
        this.upstreamAckMessageId_ = j7;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f64381a[methodToInvoke.ordinal()]) {
            case 1:
                return new BroadcastEvent();
            case 2:
                return new b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000$\u0000\u0000\u0001h$\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nȈ\u000bȈ\fȈ\rȈ\u000eȈ\u000f\f\u0010Ȉ\u0011Ȉ\u0012\u0004\u0013Ȉ\u0014Ȉ\u0015Ȉ\u0016Ȉ\u0017Ȉ\u0018Ȉ\u0019\u0004\u001a\u0004\u001b\u0004\u001c\u0004\u001d\u0004\u001e\u0004\u001f\u0002d\u0007e\u0007fȈgȈh\u0004", new Object[]{"session_", "start_", "time_", "event_", "targePath_", "retryDelay_", "newLogin_", "newNetwork_", "statusCode_", "statusMessage_", "exceptionName_", "exceptionMessage_", "messageId_", "heartbeatLost_", "tunnel_", "process_", "thread_", "sn_", "restartDelay_", "guid_", "connectionId_", "statsJson_", "retryPolicyJson_", "restartPolicyJson_", "enabled_", "enabledConfig_", "enabledDevice_", "bizEnabled_", "bizEnabledConfig_", "bizEnabledTunnel_", "upstreamAckMessageId_", "shared_", "hp_", "tag_", "host_", "port_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser2 = defaultInstanceBasedParser;
                if (defaultInstanceBasedParser == null) {
                    synchronized (BroadcastEvent.class) {
                        try {
                            GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser3 = PARSER;
                            defaultInstanceBasedParser2 = defaultInstanceBasedParser3;
                            if (defaultInstanceBasedParser3 == null) {
                                defaultInstanceBasedParser2 = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser2;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return defaultInstanceBasedParser2;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public int getBizEnabled() {
        return this.bizEnabled_;
    }

    public int getBizEnabledConfig() {
        return this.bizEnabledConfig_;
    }

    public int getBizEnabledTunnel() {
        return this.bizEnabledTunnel_;
    }

    public String getConnectionId() {
        return this.connectionId_;
    }

    public ByteString getConnectionIdBytes() {
        return ByteString.copyFromUtf8(this.connectionId_);
    }

    public int getEnabled() {
        return this.enabled_;
    }

    public int getEnabledConfig() {
        return this.enabledConfig_;
    }

    public int getEnabledDevice() {
        return this.enabledDevice_;
    }

    public Event getEvent() {
        Event eventForNumber = Event.forNumber(this.event_);
        Event event = eventForNumber;
        if (eventForNumber == null) {
            event = Event.UNRECOGNIZED;
        }
        return event;
    }

    public int getEventValue() {
        return this.event_;
    }

    public String getExceptionMessage() {
        return this.exceptionMessage_;
    }

    public ByteString getExceptionMessageBytes() {
        return ByteString.copyFromUtf8(this.exceptionMessage_);
    }

    public String getExceptionName() {
        return this.exceptionName_;
    }

    public ByteString getExceptionNameBytes() {
        return ByteString.copyFromUtf8(this.exceptionName_);
    }

    public String getGuid() {
        return this.guid_;
    }

    public ByteString getGuidBytes() {
        return ByteString.copyFromUtf8(this.guid_);
    }

    public String getHeartbeatLost() {
        return this.heartbeatLost_;
    }

    public ByteString getHeartbeatLostBytes() {
        return ByteString.copyFromUtf8(this.heartbeatLost_);
    }

    public String getHost() {
        return this.host_;
    }

    public ByteString getHostBytes() {
        return ByteString.copyFromUtf8(this.host_);
    }

    public boolean getHp() {
        return this.hp_;
    }

    public String getMessageId() {
        return this.messageId_;
    }

    public ByteString getMessageIdBytes() {
        return ByteString.copyFromUtf8(this.messageId_);
    }

    public String getNewLogin() {
        return this.newLogin_;
    }

    public ByteString getNewLoginBytes() {
        return ByteString.copyFromUtf8(this.newLogin_);
    }

    public String getNewNetwork() {
        return this.newNetwork_;
    }

    public ByteString getNewNetworkBytes() {
        return ByteString.copyFromUtf8(this.newNetwork_);
    }

    public int getPort() {
        return this.port_;
    }

    public String getProcess() {
        return this.process_;
    }

    public ByteString getProcessBytes() {
        return ByteString.copyFromUtf8(this.process_);
    }

    public String getRestartDelay() {
        return this.restartDelay_;
    }

    public ByteString getRestartDelayBytes() {
        return ByteString.copyFromUtf8(this.restartDelay_);
    }

    public String getRestartPolicyJson() {
        return this.restartPolicyJson_;
    }

    public ByteString getRestartPolicyJsonBytes() {
        return ByteString.copyFromUtf8(this.restartPolicyJson_);
    }

    public String getRetryDelay() {
        return this.retryDelay_;
    }

    public ByteString getRetryDelayBytes() {
        return ByteString.copyFromUtf8(this.retryDelay_);
    }

    public String getRetryPolicyJson() {
        return this.retryPolicyJson_;
    }

    public ByteString getRetryPolicyJsonBytes() {
        return ByteString.copyFromUtf8(this.retryPolicyJson_);
    }

    public String getSession() {
        return this.session_;
    }

    public ByteString getSessionBytes() {
        return ByteString.copyFromUtf8(this.session_);
    }

    public boolean getShared() {
        return this.shared_;
    }

    public int getSn() {
        return this.sn_;
    }

    public long getStart() {
        return this.start_;
    }

    public String getStatsJson() {
        return this.statsJson_;
    }

    public ByteString getStatsJsonBytes() {
        return ByteString.copyFromUtf8(this.statsJson_);
    }

    public String getStatusCode() {
        return this.statusCode_;
    }

    public ByteString getStatusCodeBytes() {
        return ByteString.copyFromUtf8(this.statusCode_);
    }

    public String getStatusMessage() {
        return this.statusMessage_;
    }

    public ByteString getStatusMessageBytes() {
        return ByteString.copyFromUtf8(this.statusMessage_);
    }

    public String getTag() {
        return this.tag_;
    }

    public ByteString getTagBytes() {
        return ByteString.copyFromUtf8(this.tag_);
    }

    public String getTargePath() {
        return this.targePath_;
    }

    public ByteString getTargePathBytes() {
        return ByteString.copyFromUtf8(this.targePath_);
    }

    public String getThread() {
        return this.thread_;
    }

    public ByteString getThreadBytes() {
        return ByteString.copyFromUtf8(this.thread_);
    }

    public long getTime() {
        return this.time_;
    }

    public Tunnel getTunnel() {
        Tunnel tunnelForNumber = Tunnel.forNumber(this.tunnel_);
        Tunnel tunnel = tunnelForNumber;
        if (tunnelForNumber == null) {
            tunnel = Tunnel.UNRECOGNIZED;
        }
        return tunnel;
    }

    public int getTunnelValue() {
        return this.tunnel_;
    }

    public long getUpstreamAckMessageId() {
        return this.upstreamAckMessageId_;
    }
}
