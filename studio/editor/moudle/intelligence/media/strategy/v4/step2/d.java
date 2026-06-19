package com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.step2;

import UD.j1;
import com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.MediaStrategyItem;
import com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.GenerateJob;
import com.bilibili.studio.videoeditor.loader.ImageItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.random.Random;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/strategy/v4/step2/d.class */
public final class d extends a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f107529g;
    public final int h;

    public d(@NotNull uz0.b bVar) {
        super(bVar);
        this.f107529g = bVar.c;
        this.h = bVar.d;
    }

    public static com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.a f(int i7, HashMap map) {
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

    @Override // com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.d
    @NotNull
    public final String a() {
        return "[兜底逻辑]";
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.d
    @Nullable
    public final Object c(@NotNull GenerateJob generateJob, @NotNull Continuation<? super List<com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.a>> continuation) {
        int i7;
        int i8;
        ImageItem source;
        ImageItem source2;
        int i9 = generateJob.f107450e;
        if (i9 <= 0 || (i7 = this.h) <= 0 || (i8 = this.f107529g) <= 0) {
            return null;
        }
        List<com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.a> list = generateJob.f107453i;
        int size = i9 - (list != null ? list.size() : 0);
        if (size <= 0) {
            d("数量足够，不需要使用兜底");
            return generateJob.a(continuation);
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.a> list2 = generateJob.f107449d;
        List<com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.a> listEmptyList = list2;
        if (list2 == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        Sequence sequenceAsSequence = CollectionsKt.asSequence(listEmptyList);
        List<com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.a> listEmptyList2 = generateJob.f107453i;
        if (listEmptyList2 == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        SequencesKt.toCollection(SequencesKt.filter(SequencesKt.map(SequencesKt.flatMapIterable(SequencesKt.plus(sequenceAsSequence, listEmptyList2), new j1(1)), new c(0)), new VU0.a(1)), linkedHashSet);
        for (MediaStrategyItem mediaStrategyItem : generateJob.f107446a) {
            if (mediaStrategyItem.isVideo()) {
                map.put(mediaStrategyItem.getMaterialKey(), mediaStrategyItem);
            } else {
                map2.put(mediaStrategyItem.getMaterialKey(), mediaStrategyItem);
            }
            if (linkedHashSet.contains(mediaStrategyItem.getMaterialKey())) {
                linkedHashMap.put(mediaStrategyItem.getMaterialKey(), Boxing.boxBoolean(mediaStrategyItem.isVideo()));
            }
        }
        e(Boxing.boxInt(size), "兜底结果数量");
        int size2 = (map2.size() / i7) + map.size();
        Iterator it = linkedHashMap.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (!((Boolean) entry.getValue()).booleanValue()) {
                boolean z6 = map2.size() % i7 == 0;
                if (!z6 || size2 > size) {
                    MediaStrategyItem mediaStrategyItem2 = (MediaStrategyItem) map2.remove(entry.getKey());
                    int i10 = size2;
                    if (z6) {
                        i10 = size2 - 1;
                    }
                    d("移除已选中的图片：" + ((mediaStrategyItem2 == null || (source2 = mediaStrategyItem2.getSource()) == null) ? null : source2.path) + "，最多兜底结果数量：" + i10);
                    size2 = i10;
                }
            } else if (size2 > size) {
                MediaStrategyItem mediaStrategyItem3 = (MediaStrategyItem) map.remove(entry.getKey());
                size2--;
                d("移除已选中的视频：" + ((mediaStrategyItem3 == null || (source = mediaStrategyItem3.getSource()) == null) ? null : source.path) + "，最多兜底结果数量：" + size2);
            }
        }
        int size3 = size - map.size();
        int size4 = size3 <= 0 ? map2.size() : map2.size() / size3;
        if (size4 < i7) {
            size4 = i7;
        }
        if (size4 > i8) {
            size4 = i8;
        }
        e(MapsKt.mutableMapOf(new Pair[]{TuplesKt.to("已选封面数量", Boxing.boxInt(linkedHashMap.size())), TuplesKt.to("剩余图片数量", Boxing.boxInt(map2.size())), TuplesKt.to("剩余视频数量", Boxing.boxInt(map.size())), TuplesKt.to("每个坑位图片数量", Boxing.boxInt(size4))}), "封面去重结果");
        List<com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.a> list3 = generateJob.f107453i;
        List<com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.a> arrayList = list3;
        int i11 = 0;
        if (list3 == null) {
            arrayList = new ArrayList();
            i11 = 0;
        }
        while (i11 < size) {
            if (map.size() > 0) {
                arrayList.add(f(1, map));
            } else if (map2.size() >= size4) {
                arrayList.add(f(size4, map2));
            }
            i11++;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.a) obj).f107391c) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.a) it2.next()).e());
        }
        e(arrayList3, "兜底选择完成");
        generateJob.f107453i = arrayList;
        return generateJob.a(continuation);
    }
}
