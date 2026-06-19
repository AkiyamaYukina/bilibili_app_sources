package com.bilibili.studio.editor.moudle.intelligence.media.cache;

import androidx.annotation.Keep;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/cache/MediaLinkedHashMap.class */
@Keep
public class MediaLinkedHashMap<K extends String, V> extends LinkedHashMap<K, V> {
    private final int maxElementSize;

    public MediaLinkedHashMap(int i7) {
        super(i7, 0.75f, true);
        this.maxElementSize = i7;
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry<K, V> entry) {
        return size() > this.maxElementSize;
    }
}
