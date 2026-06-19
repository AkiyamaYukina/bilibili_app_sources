package com.bilibili.lib.rpc.track.model.dns;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/track/model/dns/DnsEvent.class */
public final class DnsEvent extends GeneratedMessageLite<DnsEvent, Builder> implements MessageLiteOrBuilder {
    private static final DnsEvent DEFAULT_INSTANCE;
    public static final int EVENT_FIELD_NUMBER = 1;
    public static final int FETCH_ERROR_CODE_FIELD_NUMBER = 13;
    public static final int FETCH_ERROR_MESSAGE_FIELD_NUMBER = 14;
    private static volatile Parser<DnsEvent> PARSER;
    public static final int PROCESS_FIELD_NUMBER = 15;
    public static final int PROVIDER_FIELD_NUMBER = 3;
    public static final int RESOLVE_EXPIRED_FIELD_NUMBER = 10;
    public static final int RESOLVE_FALLBACK_FIELD_NUMBER = 5;
    public static final int RESOLVE_HIT_FIELD_NUMBER = 6;
    public static final int RESOLVE_HOST_FIELD_NUMBER = 4;
    public static final int RESOLVE_IPS_FIELD_NUMBER = 8;
    public static final int RESOLVE_TAG_FIELD_NUMBER = 12;
    public static final int RESOLVE_TIME_REMAINING_FIELD_NUMBER = 11;
    public static final int RESOLVE_TTL_FIELD_NUMBER = 9;
    public static final int SOURCE_FIELD_NUMBER = 2;
    public static final int THREAD_FIELD_NUMBER = 16;
    private int event_;
    private int fetchErrorCode_;
    private boolean resolveExpired_;
    private boolean resolveFallback_;
    private boolean resolveHit_;
    private long resolveTimeRemaining_;
    private long resolveTtl_;
    private int source_;
    private String provider_ = "";
    private String resolveHost_ = "";
    private Internal.ProtobufList<String> resolveIps_ = GeneratedMessageLite.emptyProtobufList();
    private String resolveTag_ = "";
    private String fetchErrorMessage_ = "";
    private String process_ = "";
    private String thread_ = "";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/track/model/dns/DnsEvent$Builder.class */
    public static final class Builder extends GeneratedMessageLite.Builder<DnsEvent, Builder> implements MessageLiteOrBuilder {
        public Builder() {
            super(DnsEvent.DEFAULT_INSTANCE);
        }

        public Builder addAllResolveIps(Iterable<String> iterable) {
            copyOnWrite();
            ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).addAllResolveIps(iterable);
            return this;
        }

        public Builder addResolveIps(String str) {
            copyOnWrite();
            ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).addResolveIps(str);
            return this;
        }

        public Builder addResolveIpsBytes(ByteString byteString) {
            copyOnWrite();
            ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).addResolveIpsBytes(byteString);
            return this;
        }

        public Builder clearEvent() {
            copyOnWrite();
            ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).clearEvent();
            return this;
        }

        public Builder clearFetchErrorCode() {
            copyOnWrite();
            ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).clearFetchErrorCode();
            return this;
        }

        public Builder clearFetchErrorMessage() {
            copyOnWrite();
            ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).clearFetchErrorMessage();
            return this;
        }

        public Builder clearProcess() {
            copyOnWrite();
            ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).clearProcess();
            return this;
        }

        public Builder clearProvider() {
            copyOnWrite();
            ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).clearProvider();
            return this;
        }

        public Builder clearResolveExpired() {
            copyOnWrite();
            ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).clearResolveExpired();
            return this;
        }

        public Builder clearResolveFallback() {
            copyOnWrite();
            ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).clearResolveFallback();
            return this;
        }

        public Builder clearResolveHit() {
            copyOnWrite();
            ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).clearResolveHit();
            return this;
        }

        public Builder clearResolveHost() {
            copyOnWrite();
            ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).clearResolveHost();
            return this;
        }

        public Builder clearResolveIps() {
            copyOnWrite();
            ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).clearResolveIps();
            return this;
        }

        public Builder clearResolveTag() {
            copyOnWrite();
            ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).clearResolveTag();
            return this;
        }

        public Builder clearResolveTimeRemaining() {
            copyOnWrite();
            ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).clearResolveTimeRemaining();
            return this;
        }

        public Builder clearResolveTtl() {
            copyOnWrite();
            ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).clearResolveTtl();
            return this;
        }

        public Builder clearSource() {
            copyOnWrite();
            ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).clearSource();
            return this;
        }

        public Builder clearThread() {
            copyOnWrite();
            ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).clearThread();
            return this;
        }

        public Event getEvent() {
            return ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).getEvent();
        }

        public int getEventValue() {
            return ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).getEventValue();
        }

        public int getFetchErrorCode() {
            return ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).getFetchErrorCode();
        }

        public String getFetchErrorMessage() {
            return ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).getFetchErrorMessage();
        }

        public ByteString getFetchErrorMessageBytes() {
            return ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).getFetchErrorMessageBytes();
        }

        public String getProcess() {
            return ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).getProcess();
        }

        public ByteString getProcessBytes() {
            return ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).getProcessBytes();
        }

        public String getProvider() {
            return ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).getProvider();
        }

        public ByteString getProviderBytes() {
            return ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).getProviderBytes();
        }

        public boolean getResolveExpired() {
            return ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).getResolveExpired();
        }

        public boolean getResolveFallback() {
            return ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).getResolveFallback();
        }

        public boolean getResolveHit() {
            return ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).getResolveHit();
        }

        public String getResolveHost() {
            return ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).getResolveHost();
        }

        public ByteString getResolveHostBytes() {
            return ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).getResolveHostBytes();
        }

        public String getResolveIps(int i7) {
            return ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).getResolveIps(i7);
        }

        public ByteString getResolveIpsBytes(int i7) {
            return ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).getResolveIpsBytes(i7);
        }

        public int getResolveIpsCount() {
            return ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).getResolveIpsCount();
        }

        public List<String> getResolveIpsList() {
            return Collections.unmodifiableList(((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).getResolveIpsList());
        }

        public String getResolveTag() {
            return ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).getResolveTag();
        }

        public ByteString getResolveTagBytes() {
            return ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).getResolveTagBytes();
        }

        public long getResolveTimeRemaining() {
            return ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).getResolveTimeRemaining();
        }

        public long getResolveTtl() {
            return ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).getResolveTtl();
        }

        public Source getSource() {
            return ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).getSource();
        }

        public int getSourceValue() {
            return ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).getSourceValue();
        }

        public String getThread() {
            return ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).getThread();
        }

        public ByteString getThreadBytes() {
            return ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).getThreadBytes();
        }

        public Builder setEvent(Event event) {
            copyOnWrite();
            ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).setEvent(event);
            return this;
        }

        public Builder setEventValue(int i7) {
            copyOnWrite();
            ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).setEventValue(i7);
            return this;
        }

        public Builder setFetchErrorCode(int i7) {
            copyOnWrite();
            ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).setFetchErrorCode(i7);
            return this;
        }

        public Builder setFetchErrorMessage(String str) {
            copyOnWrite();
            ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).setFetchErrorMessage(str);
            return this;
        }

        public Builder setFetchErrorMessageBytes(ByteString byteString) {
            copyOnWrite();
            ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).setFetchErrorMessageBytes(byteString);
            return this;
        }

        public Builder setProcess(String str) {
            copyOnWrite();
            ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).setProcess(str);
            return this;
        }

        public Builder setProcessBytes(ByteString byteString) {
            copyOnWrite();
            ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).setProcessBytes(byteString);
            return this;
        }

        public Builder setProvider(String str) {
            copyOnWrite();
            ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).setProvider(str);
            return this;
        }

        public Builder setProviderBytes(ByteString byteString) {
            copyOnWrite();
            ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).setProviderBytes(byteString);
            return this;
        }

        public Builder setResolveExpired(boolean z6) {
            copyOnWrite();
            ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).setResolveExpired(z6);
            return this;
        }

        public Builder setResolveFallback(boolean z6) {
            copyOnWrite();
            ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).setResolveFallback(z6);
            return this;
        }

        public Builder setResolveHit(boolean z6) {
            copyOnWrite();
            ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).setResolveHit(z6);
            return this;
        }

        public Builder setResolveHost(String str) {
            copyOnWrite();
            ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).setResolveHost(str);
            return this;
        }

        public Builder setResolveHostBytes(ByteString byteString) {
            copyOnWrite();
            ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).setResolveHostBytes(byteString);
            return this;
        }

        public Builder setResolveIps(int i7, String str) {
            copyOnWrite();
            ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).setResolveIps(i7, str);
            return this;
        }

        public Builder setResolveTag(String str) {
            copyOnWrite();
            ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).setResolveTag(str);
            return this;
        }

        public Builder setResolveTagBytes(ByteString byteString) {
            copyOnWrite();
            ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).setResolveTagBytes(byteString);
            return this;
        }

        public Builder setResolveTimeRemaining(long j7) {
            copyOnWrite();
            ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).setResolveTimeRemaining(j7);
            return this;
        }

        public Builder setResolveTtl(long j7) {
            copyOnWrite();
            ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).setResolveTtl(j7);
            return this;
        }

        public Builder setSource(Source source) {
            copyOnWrite();
            ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).setSource(source);
            return this;
        }

        public Builder setSourceValue(int i7) {
            copyOnWrite();
            ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).setSourceValue(i7);
            return this;
        }

        public Builder setThread(String str) {
            copyOnWrite();
            ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).setThread(str);
            return this;
        }

        public Builder setThreadBytes(ByteString byteString) {
            copyOnWrite();
            ((DnsEvent) ((GeneratedMessageLite.Builder) this).instance).setThreadBytes(byteString);
            return this;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/track/model/dns/DnsEvent$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f64383a;

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
                com.bilibili.lib.rpc.track.model.dns.DnsEvent.a.f64383a = r0
                r0 = r4
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L59
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L59
            L14:
                int[] r0 = com.bilibili.lib.rpc.track.model.dns.DnsEvent.a.f64383a     // Catch: java.lang.NoSuchFieldError -> L59 java.lang.NoSuchFieldError -> L5d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch: java.lang.NoSuchFieldError -> L5d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5d
            L1f:
                int[] r0 = com.bilibili.lib.rpc.track.model.dns.DnsEvent.a.f64383a     // Catch: java.lang.NoSuchFieldError -> L5d java.lang.NoSuchFieldError -> L61
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch: java.lang.NoSuchFieldError -> L61
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L61
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L61
            L2a:
                int[] r0 = com.bilibili.lib.rpc.track.model.dns.DnsEvent.a.f64383a     // Catch: java.lang.NoSuchFieldError -> L61 java.lang.NoSuchFieldError -> L65
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L65
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L65
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L65
            L35:
                int[] r0 = com.bilibili.lib.rpc.track.model.dns.DnsEvent.a.f64383a     // Catch: java.lang.NoSuchFieldError -> L65 java.lang.NoSuchFieldError -> L69
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch: java.lang.NoSuchFieldError -> L69
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L69
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L69
            L40:
                int[] r0 = com.bilibili.lib.rpc.track.model.dns.DnsEvent.a.f64383a     // Catch: java.lang.NoSuchFieldError -> L69 java.lang.NoSuchFieldError -> L6d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L6d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            L4c:
                int[] r0 = com.bilibili.lib.rpc.track.model.dns.DnsEvent.a.f64383a     // Catch: java.lang.NoSuchFieldError -> L6d java.lang.NoSuchFieldError -> L71
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
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.rpc.track.model.dns.DnsEvent.a.m6744clinit():void");
        }
    }

    static {
        DnsEvent dnsEvent = new DnsEvent();
        DEFAULT_INSTANCE = dnsEvent;
        GeneratedMessageLite.registerDefaultInstance(DnsEvent.class, dnsEvent);
    }

    private DnsEvent() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllResolveIps(Iterable<String> iterable) {
        ensureResolveIpsIsMutable();
        AbstractMessageLite.addAll(iterable, this.resolveIps_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addResolveIps(String str) {
        str.getClass();
        ensureResolveIpsIsMutable();
        this.resolveIps_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addResolveIpsBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureResolveIpsIsMutable();
        this.resolveIps_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvent() {
        this.event_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFetchErrorCode() {
        this.fetchErrorCode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFetchErrorMessage() {
        this.fetchErrorMessage_ = getDefaultInstance().getFetchErrorMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProcess() {
        this.process_ = getDefaultInstance().getProcess();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProvider() {
        this.provider_ = getDefaultInstance().getProvider();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResolveExpired() {
        this.resolveExpired_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResolveFallback() {
        this.resolveFallback_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResolveHit() {
        this.resolveHit_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResolveHost() {
        this.resolveHost_ = getDefaultInstance().getResolveHost();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResolveIps() {
        this.resolveIps_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResolveTag() {
        this.resolveTag_ = getDefaultInstance().getResolveTag();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResolveTimeRemaining() {
        this.resolveTimeRemaining_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResolveTtl() {
        this.resolveTtl_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSource() {
        this.source_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearThread() {
        this.thread_ = getDefaultInstance().getThread();
    }

    private void ensureResolveIpsIsMutable() {
        Internal.ProtobufList<String> protobufList = this.resolveIps_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.resolveIps_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static DnsEvent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(DnsEvent dnsEvent) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(dnsEvent);
    }

    public static DnsEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DnsEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DnsEvent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DnsEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DnsEvent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DnsEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DnsEvent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DnsEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DnsEvent parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DnsEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DnsEvent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DnsEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static DnsEvent parseFrom(InputStream inputStream) throws IOException {
        return (DnsEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DnsEvent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DnsEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DnsEvent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DnsEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static DnsEvent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DnsEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DnsEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DnsEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DnsEvent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DnsEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<DnsEvent> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvent(Event event) {
        this.event_ = event.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventValue(int i7) {
        this.event_ = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFetchErrorCode(int i7) {
        this.fetchErrorCode_ = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFetchErrorMessage(String str) {
        str.getClass();
        this.fetchErrorMessage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFetchErrorMessageBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.fetchErrorMessage_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProcess(String str) {
        str.getClass();
        this.process_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProcessBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.process_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProvider(String str) {
        str.getClass();
        this.provider_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProviderBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.provider_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResolveExpired(boolean z6) {
        this.resolveExpired_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResolveFallback(boolean z6) {
        this.resolveFallback_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResolveHit(boolean z6) {
        this.resolveHit_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResolveHost(String str) {
        str.getClass();
        this.resolveHost_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResolveHostBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.resolveHost_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResolveIps(int i7, String str) {
        str.getClass();
        ensureResolveIpsIsMutable();
        this.resolveIps_.set(i7, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResolveTag(String str) {
        str.getClass();
        this.resolveTag_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResolveTagBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.resolveTag_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResolveTimeRemaining(long j7) {
        this.resolveTimeRemaining_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResolveTtl(long j7) {
        this.resolveTtl_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSource(Source source) {
        this.source_ = source.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceValue(int i7) {
        this.source_ = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setThread(String str) {
        str.getClass();
        this.thread_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setThreadBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.thread_ = byteString.toStringUtf8();
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f64383a[methodToInvoke.ordinal()]) {
            case 1:
                return new DnsEvent();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0000\u0001\u0010\u000f\u0000\u0001\u0000\u0001\f\u0002\f\u0003Ȉ\u0004Ȉ\u0005\u0007\u0006\u0007\bȚ\t\u0002\n\u0007\u000b\u0002\fȈ\r\u0004\u000eȈ\u000fȈ\u0010Ȉ", new Object[]{"event_", "source_", "provider_", "resolveHost_", "resolveFallback_", "resolveHit_", "resolveIps_", "resolveTtl_", "resolveExpired_", "resolveTimeRemaining_", "resolveTag_", "fetchErrorCode_", "fetchErrorMessage_", "process_", "thread_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser2 = defaultInstanceBasedParser;
                if (defaultInstanceBasedParser == null) {
                    synchronized (DnsEvent.class) {
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

    public int getFetchErrorCode() {
        return this.fetchErrorCode_;
    }

    public String getFetchErrorMessage() {
        return this.fetchErrorMessage_;
    }

    public ByteString getFetchErrorMessageBytes() {
        return ByteString.copyFromUtf8(this.fetchErrorMessage_);
    }

    public String getProcess() {
        return this.process_;
    }

    public ByteString getProcessBytes() {
        return ByteString.copyFromUtf8(this.process_);
    }

    public String getProvider() {
        return this.provider_;
    }

    public ByteString getProviderBytes() {
        return ByteString.copyFromUtf8(this.provider_);
    }

    public boolean getResolveExpired() {
        return this.resolveExpired_;
    }

    public boolean getResolveFallback() {
        return this.resolveFallback_;
    }

    public boolean getResolveHit() {
        return this.resolveHit_;
    }

    public String getResolveHost() {
        return this.resolveHost_;
    }

    public ByteString getResolveHostBytes() {
        return ByteString.copyFromUtf8(this.resolveHost_);
    }

    public String getResolveIps(int i7) {
        return (String) this.resolveIps_.get(i7);
    }

    public ByteString getResolveIpsBytes(int i7) {
        return ByteString.copyFromUtf8((String) this.resolveIps_.get(i7));
    }

    public int getResolveIpsCount() {
        return this.resolveIps_.size();
    }

    public List<String> getResolveIpsList() {
        return this.resolveIps_;
    }

    public String getResolveTag() {
        return this.resolveTag_;
    }

    public ByteString getResolveTagBytes() {
        return ByteString.copyFromUtf8(this.resolveTag_);
    }

    public long getResolveTimeRemaining() {
        return this.resolveTimeRemaining_;
    }

    public long getResolveTtl() {
        return this.resolveTtl_;
    }

    public Source getSource() {
        Source sourceForNumber = Source.forNumber(this.source_);
        Source source = sourceForNumber;
        if (sourceForNumber == null) {
            source = Source.UNRECOGNIZED;
        }
        return source;
    }

    public int getSourceValue() {
        return this.source_;
    }

    public String getThread() {
        return this.thread_;
    }

    public ByteString getThreadBytes() {
        return ByteString.copyFromUtf8(this.thread_);
    }
}
