package com.bilibili.lib.rpc.track.model;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/track/model/Tunnel.class */
public enum Tunnel implements Internal.EnumLite {
    OKHTTP(0),
    BBC_SOCKET(1),
    MOSS_CRONET(2),
    MOSS_OKHTTP(3),
    MOSS_DOWNGRADE_OKHTTP(4),
    MOSS_STREAM_CRONET(5),
    HTTPDNS_CHROMIUM_NET(6),
    OKHTTP_CRONET(7),
    MOSS_OKHTTP_CRONET(8),
    MOSS_DOWNGRADE_OKHTTP_CRONET(9),
    CRONET(10),
    CRONET_JAVA(11),
    IJK_HTTP(12),
    IJK_P2P(13),
    MOSS_REST_OKHTTP(14),
    MOSS_REST_OKHTTP_CRONET(15),
    OKHTTP_IGNET(16),
    MOSS_GRPC_IGNET(17),
    MOSS_STREAM_IGNET(18),
    UNRECOGNIZED(-1);

    public static final int BBC_SOCKET_VALUE = 1;
    public static final int CRONET_JAVA_VALUE = 11;
    public static final int CRONET_VALUE = 10;
    public static final int HTTPDNS_CHROMIUM_NET_VALUE = 6;
    public static final int IJK_HTTP_VALUE = 12;
    public static final int IJK_P2P_VALUE = 13;
    public static final int MOSS_CRONET_VALUE = 2;
    public static final int MOSS_DOWNGRADE_OKHTTP_CRONET_VALUE = 9;
    public static final int MOSS_DOWNGRADE_OKHTTP_VALUE = 4;
    public static final int MOSS_GRPC_IGNET_VALUE = 17;
    public static final int MOSS_OKHTTP_CRONET_VALUE = 8;
    public static final int MOSS_OKHTTP_VALUE = 3;
    public static final int MOSS_REST_OKHTTP_CRONET_VALUE = 15;
    public static final int MOSS_REST_OKHTTP_VALUE = 14;
    public static final int MOSS_STREAM_CRONET_VALUE = 5;
    public static final int MOSS_STREAM_IGNET_VALUE = 18;
    public static final int OKHTTP_CRONET_VALUE = 7;
    public static final int OKHTTP_IGNET_VALUE = 16;
    public static final int OKHTTP_VALUE = 0;
    private static final Internal.EnumLiteMap<Tunnel> internalValueMap = new Object();
    private final int value;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/track/model/Tunnel$a.class */
    public final class a implements Internal.EnumLiteMap<Tunnel> {
        public final Internal.EnumLite findValueByNumber(int i7) {
            return Tunnel.forNumber(i7);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/track/model/Tunnel$b.class */
    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f64380a = new Object();

        public final boolean isInRange(int i7) {
            return Tunnel.forNumber(i7) != null;
        }
    }

    Tunnel(int i7) {
        this.value = i7;
    }

    public static Tunnel forNumber(int i7) {
        switch (i7) {
            case 0:
                return OKHTTP;
            case 1:
                return BBC_SOCKET;
            case 2:
                return MOSS_CRONET;
            case 3:
                return MOSS_OKHTTP;
            case 4:
                return MOSS_DOWNGRADE_OKHTTP;
            case 5:
                return MOSS_STREAM_CRONET;
            case 6:
                return HTTPDNS_CHROMIUM_NET;
            case 7:
                return OKHTTP_CRONET;
            case 8:
                return MOSS_OKHTTP_CRONET;
            case 9:
                return MOSS_DOWNGRADE_OKHTTP_CRONET;
            case 10:
                return CRONET;
            case 11:
                return CRONET_JAVA;
            case 12:
                return IJK_HTTP;
            case 13:
                return IJK_P2P;
            case 14:
                return MOSS_REST_OKHTTP;
            case 15:
                return MOSS_REST_OKHTTP_CRONET;
            case 16:
                return OKHTTP_IGNET;
            case 17:
                return MOSS_GRPC_IGNET;
            case 18:
                return MOSS_STREAM_IGNET;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<Tunnel> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f64380a;
    }

    @Deprecated
    public static Tunnel valueOf(int i7) {
        return forNumber(i7);
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
