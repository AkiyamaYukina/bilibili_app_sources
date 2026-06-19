package com.bilibili.studio.editor.moudle.intelligence.media.strategy.v2;

import com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.MediaSortedItem;
import com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.MediaStrategyItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.random.Random;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/strategy/v2/c.class */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f107419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f107420b = 5;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f107421c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ConcurrentHashMap<String, MediaStrategyItem> f107422d = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ConcurrentHashMap<String, MediaStrategyItem> f107423e = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final TreeSet<MediaSortedItem> f107424f = new TreeSet<>(new MediaSortedItem());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile long f107425g;

    public c(int i7) {
        this.f107419a = i7;
    }

    public static com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.a a(int i7, HashMap map) {
        com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.a aVar = new com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.a();
        ArrayList arrayList = new ArrayList(map.keySet());
        ArrayList arrayList2 = new ArrayList();
        for (int i8 = 0; i8 < i7; i8++) {
            String str = (String) CollectionsKt.t(arrayList, Random.Default);
            String str2 = str;
            if (str == null) {
                str2 = "";
            }
            MediaStrategyItem mediaStrategyItem = (MediaStrategyItem) map.get(str2);
            if (mediaStrategyItem != null) {
                map.remove(str2);
                arrayList2.add(mediaStrategyItem);
            }
            arrayList.remove(str2);
        }
        aVar.d(arrayList2);
        aVar.f107391c = true;
        return aVar;
    }

    public final int b() {
        return this.f107423e.size() + this.f107422d.size();
    }
}
