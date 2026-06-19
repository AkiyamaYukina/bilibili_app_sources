package com.bilibili.lib.rpc.track.util;

import com.bilibili.lib.rpc.track.model.Tunnel;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/track/util/TunnelUtilsKt.class */
public final class TunnelUtilsKt {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/track/util/TunnelUtilsKt$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f64388a;

        static {
            int[] iArr = new int[Tunnel.values().length];
            try {
                iArr[Tunnel.OKHTTP.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[Tunnel.BBC_SOCKET.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[Tunnel.OKHTTP_CRONET.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[Tunnel.MOSS_CRONET.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[Tunnel.MOSS_OKHTTP.ordinal()] = 5;
            } catch (NoSuchFieldError e11) {
            }
            try {
                iArr[Tunnel.MOSS_DOWNGRADE_OKHTTP.ordinal()] = 6;
            } catch (NoSuchFieldError e12) {
            }
            try {
                iArr[Tunnel.MOSS_STREAM_CRONET.ordinal()] = 7;
            } catch (NoSuchFieldError e13) {
            }
            try {
                iArr[Tunnel.MOSS_OKHTTP_CRONET.ordinal()] = 8;
            } catch (NoSuchFieldError e14) {
            }
            try {
                iArr[Tunnel.MOSS_DOWNGRADE_OKHTTP_CRONET.ordinal()] = 9;
            } catch (NoSuchFieldError e15) {
            }
            try {
                iArr[Tunnel.HTTPDNS_CHROMIUM_NET.ordinal()] = 10;
            } catch (NoSuchFieldError e16) {
            }
            try {
                iArr[Tunnel.CRONET.ordinal()] = 11;
            } catch (NoSuchFieldError e17) {
            }
            try {
                iArr[Tunnel.CRONET_JAVA.ordinal()] = 12;
            } catch (NoSuchFieldError e18) {
            }
            try {
                iArr[Tunnel.IJK_HTTP.ordinal()] = 13;
            } catch (NoSuchFieldError e19) {
            }
            try {
                iArr[Tunnel.IJK_P2P.ordinal()] = 14;
            } catch (NoSuchFieldError e20) {
            }
            try {
                iArr[Tunnel.MOSS_REST_OKHTTP.ordinal()] = 15;
            } catch (NoSuchFieldError e21) {
            }
            try {
                iArr[Tunnel.MOSS_REST_OKHTTP_CRONET.ordinal()] = 16;
            } catch (NoSuchFieldError e22) {
            }
            try {
                iArr[Tunnel.OKHTTP_IGNET.ordinal()] = 17;
            } catch (NoSuchFieldError e23) {
            }
            try {
                iArr[Tunnel.MOSS_GRPC_IGNET.ordinal()] = 18;
            } catch (NoSuchFieldError e24) {
            }
            try {
                iArr[Tunnel.MOSS_STREAM_IGNET.ordinal()] = 19;
            } catch (NoSuchFieldError e25) {
            }
            f64388a = iArr;
        }
    }

    public static final boolean isOkHttpBridged(@NotNull Tunnel tunnel) {
        int i7 = a.f64388a[tunnel.ordinal()];
        return i7 == 3 || i7 == 8 || i7 == 9 || i7 == 16 || i7 == 17;
    }

    @NotNull
    public static final String tunnelName(@NotNull Tunnel tunnel) {
        int i7 = a.f64388a[tunnel.ordinal()];
        String str = "okhttp";
        switch (i7) {
            case 1:
                break;
            case 2:
                str = "bbc_socket";
                break;
            case 3:
                str = "okhttp_cronet";
                break;
            case 4:
                str = "moss_grpc_cronet";
                break;
            case 5:
                str = "moss_grpc_okhttp";
                break;
            case 6:
                str = "moss_grpc_downgrade_okhttp";
                break;
            case 7:
                str = "moss_grpc_stream_cronet";
                break;
            case 8:
                str = "moss_grpc_okhttp_cronet";
                break;
            case 9:
                str = "moss_grpc_downgrade_okhttp_cronet";
                break;
            case 10:
                str = "httpdns_chromium_net_http1";
                break;
            case 11:
                str = "cronet";
                break;
            case 12:
                str = "cronet_java";
                break;
            case 13:
                str = "ijk_http";
                break;
            case 14:
                str = "ijk_p2p";
                break;
            case 15:
                str = "moss_rest_okhttp";
                break;
            case 16:
                str = "moss_rest_okhttp_cronet";
                break;
            case 17:
                str = "okhttp_ignet";
                break;
            case 18:
                str = "moss_grpc_ignet";
                break;
            case 19:
                str = "moss_stream_ignet";
                break;
            default:
                str = "okhttp";
                break;
        }
        return str;
    }
}
