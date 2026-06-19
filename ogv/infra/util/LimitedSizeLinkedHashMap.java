package com.bilibili.ogv.infra.util;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/util/LimitedSizeLinkedHashMap.class */
public class LimitedSizeLinkedHashMap<K, V> extends LinkedHashMap<K, V> {
    private final int limit;

    public LimitedSizeLinkedHashMap(int i7) {
        this.limit = i7;
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry<K, V> entry) {
        return size() > this.limit;
    }
}
