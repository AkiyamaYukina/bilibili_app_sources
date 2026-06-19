package com.bilibili.lib.rpc.track.model.flowcontrol;

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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/track/model/flowcontrol/FlowControlEvent.class */
public final class FlowControlEvent extends GeneratedMessageLite<FlowControlEvent, b> implements MessageLiteOrBuilder {
    public static final int BLOCK_DURATION_FIELD_NUMBER = 5;
    public static final int BLOCK_UPDATE_FIELD_NUMBER = 6;
    private static final FlowControlEvent DEFAULT_INSTANCE;
    public static final int EVENT_FIELD_NUMBER = 1;
    public static final int GUID_FIELD_NUMBER = 4;
    public static final int HOST_FIELD_NUMBER = 2;
    private static volatile Parser<FlowControlEvent> PARSER;
    public static final int PATH_FIELD_NUMBER = 3;
    private long blockDuration_;
    private int blockUpdate_;
    private int event_;
    private String host_ = "";
    private String path_ = "";
    private String guid_ = "";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/track/model/flowcontrol/FlowControlEvent$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f64387a;

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
                com.bilibili.lib.rpc.track.model.flowcontrol.FlowControlEvent.a.f64387a = r0
                r0 = r4
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L59
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L59
            L14:
                int[] r0 = com.bilibili.lib.rpc.track.model.flowcontrol.FlowControlEvent.a.f64387a     // Catch: java.lang.NoSuchFieldError -> L59 java.lang.NoSuchFieldError -> L5d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch: java.lang.NoSuchFieldError -> L5d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5d
            L1f:
                int[] r0 = com.bilibili.lib.rpc.track.model.flowcontrol.FlowControlEvent.a.f64387a     // Catch: java.lang.NoSuchFieldError -> L5d java.lang.NoSuchFieldError -> L61
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch: java.lang.NoSuchFieldError -> L61
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L61
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L61
            L2a:
                int[] r0 = com.bilibili.lib.rpc.track.model.flowcontrol.FlowControlEvent.a.f64387a     // Catch: java.lang.NoSuchFieldError -> L61 java.lang.NoSuchFieldError -> L65
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L65
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L65
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L65
            L35:
                int[] r0 = com.bilibili.lib.rpc.track.model.flowcontrol.FlowControlEvent.a.f64387a     // Catch: java.lang.NoSuchFieldError -> L65 java.lang.NoSuchFieldError -> L69
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch: java.lang.NoSuchFieldError -> L69
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L69
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L69
            L40:
                int[] r0 = com.bilibili.lib.rpc.track.model.flowcontrol.FlowControlEvent.a.f64387a     // Catch: java.lang.NoSuchFieldError -> L69 java.lang.NoSuchFieldError -> L6d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L6d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            L4c:
                int[] r0 = com.bilibili.lib.rpc.track.model.flowcontrol.FlowControlEvent.a.f64387a     // Catch: java.lang.NoSuchFieldError -> L6d java.lang.NoSuchFieldError -> L71
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
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.rpc.track.model.flowcontrol.FlowControlEvent.a.m6752clinit():void");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/track/model/flowcontrol/FlowControlEvent$b.class */
    public static final class b extends GeneratedMessageLite.Builder<FlowControlEvent, b> implements MessageLiteOrBuilder {
        public b() {
            super(FlowControlEvent.DEFAULT_INSTANCE);
        }

        public final void a(long j7) {
            copyOnWrite();
            ((FlowControlEvent) ((GeneratedMessageLite.Builder) this).instance).setBlockDuration(j7);
        }

        public final void b(int i7) {
            copyOnWrite();
            ((FlowControlEvent) ((GeneratedMessageLite.Builder) this).instance).setBlockUpdate(i7);
        }

        public final void c(Event event) {
            copyOnWrite();
            ((FlowControlEvent) ((GeneratedMessageLite.Builder) this).instance).setEvent(event);
        }

        public final void d(String str) {
            copyOnWrite();
            ((FlowControlEvent) ((GeneratedMessageLite.Builder) this).instance).setGuid(str);
        }

        public final void e(String str) {
            copyOnWrite();
            ((FlowControlEvent) ((GeneratedMessageLite.Builder) this).instance).setHost(str);
        }

        public final void f(String str) {
            copyOnWrite();
            ((FlowControlEvent) ((GeneratedMessageLite.Builder) this).instance).setPath(str);
        }
    }

    static {
        FlowControlEvent flowControlEvent = new FlowControlEvent();
        DEFAULT_INSTANCE = flowControlEvent;
        GeneratedMessageLite.registerDefaultInstance(FlowControlEvent.class, flowControlEvent);
    }

    private FlowControlEvent() {
    }

    private void clearBlockDuration() {
        this.blockDuration_ = 0L;
    }

    private void clearBlockUpdate() {
        this.blockUpdate_ = 0;
    }

    private void clearEvent() {
        this.event_ = 0;
    }

    private void clearGuid() {
        this.guid_ = getDefaultInstance().getGuid();
    }

    private void clearHost() {
        this.host_ = getDefaultInstance().getHost();
    }

    private void clearPath() {
        this.path_ = getDefaultInstance().getPath();
    }

    public static FlowControlEvent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static b newBuilder(FlowControlEvent flowControlEvent) {
        return (b) DEFAULT_INSTANCE.createBuilder(flowControlEvent);
    }

    public static FlowControlEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FlowControlEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FlowControlEvent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FlowControlEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FlowControlEvent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FlowControlEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FlowControlEvent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FlowControlEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FlowControlEvent parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FlowControlEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FlowControlEvent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FlowControlEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static FlowControlEvent parseFrom(InputStream inputStream) throws IOException {
        return (FlowControlEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FlowControlEvent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FlowControlEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FlowControlEvent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FlowControlEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static FlowControlEvent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FlowControlEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FlowControlEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FlowControlEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FlowControlEvent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FlowControlEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<FlowControlEvent> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBlockDuration(long j7) {
        this.blockDuration_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBlockUpdate(int i7) {
        this.blockUpdate_ = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvent(Event event) {
        this.event_ = event.getNumber();
    }

    private void setEventValue(int i7) {
        this.event_ = i7;
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
    public void setHost(String str) {
        str.getClass();
        this.host_ = str;
    }

    private void setHostBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.host_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPath(String str) {
        str.getClass();
        this.path_ = str;
    }

    private void setPathBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.path_ = byteString.toStringUtf8();
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f64387a[methodToInvoke.ordinal()]) {
            case 1:
                return new FlowControlEvent();
            case 2:
                return new b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u0002\u0006\u0004", new Object[]{"event_", "host_", "path_", "guid_", "blockDuration_", "blockUpdate_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser2 = defaultInstanceBasedParser;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FlowControlEvent.class) {
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

    public long getBlockDuration() {
        return this.blockDuration_;
    }

    public int getBlockUpdate() {
        return this.blockUpdate_;
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

    public String getGuid() {
        return this.guid_;
    }

    public ByteString getGuidBytes() {
        return ByteString.copyFromUtf8(this.guid_);
    }

    public String getHost() {
        return this.host_;
    }

    public ByteString getHostBytes() {
        return ByteString.copyFromUtf8(this.host_);
    }

    public String getPath() {
        return this.path_;
    }

    public ByteString getPathBytes() {
        return ByteString.copyFromUtf8(this.path_);
    }
}
