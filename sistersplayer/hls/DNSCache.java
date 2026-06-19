package com.bilibili.sistersplayer.hls;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/DNSCache.class */
public final class DNSCache {

    @NotNull
    public static final DNSCache INSTANCE = new DNSCache();

    @NotNull
    private static final ConcurrentMap<String, String> dnsMap = new ConcurrentHashMap();

    private DNSCache() {
    }

    @NotNull
    public final ConcurrentMap<String, String> getDnsMap() {
        return dnsMap;
    }
}
