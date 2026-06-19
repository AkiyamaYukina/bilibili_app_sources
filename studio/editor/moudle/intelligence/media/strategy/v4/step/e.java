package com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.step;

import com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.MediaStrategyItem;
import com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.GenerateJob;
import com.bilibili.studio.videoeditor.loader.ImageItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import uz0.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/strategy/v4/step/e.class */
public final class e extends a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f107503g;

    public e(@NotNull uz0.b bVar) {
        super(bVar);
        this.f107503g = bVar.d;
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.d
    @NotNull
    public final String a() {
        return "[客户端策略][过滤素材]";
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.d
    @Nullable
    public final Object c(@NotNull GenerateJob generateJob, @NotNull Continuation<? super List<com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.a>> continuation) {
        Object objA;
        int i7;
        List list;
        int i8 = generateJob.f107450e;
        System.currentTimeMillis();
        if (i8 <= 0 || (i7 = this.f107503g) <= 0) {
            objA = null;
        } else {
            Set<String> set = generateJob.f107452g;
            Set<String> setEmptySet = set;
            if (set == null) {
                setEmptySet = SetsKt.emptySet();
            }
            Set<String> set2 = generateJob.f107451f;
            Set<String> setEmptySet2 = set2;
            if (set2 == null) {
                setEmptySet2 = SetsKt.emptySet();
            }
            uz0.a aVar = generateJob.h;
            if (aVar == null) {
                return generateJob.a(continuation);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ArrayList arrayList = new ArrayList();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Iterator it = new HashSet(aVar.a.keySet()).iterator();
            int size = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str = (String) it.next();
                a.b bVar = (a.b) aVar.a.get(str);
                if (bVar != null) {
                    int i9 = bVar.d ? 1 : i7;
                    if (((CopyOnWriteArrayList) bVar.e).size() < i9) {
                        aVar.a.remove(str);
                        d("过滤数量不足的素材组： size = " + ((CopyOnWriteArrayList) bVar.e).size());
                    } else {
                        size += ((CopyOnWriteArrayList) bVar.e).size() / i9;
                        String str2 = bVar.b;
                        if (setEmptySet.contains(str2) && !arrayList.contains(str2)) {
                            arrayList.add(str2);
                        }
                        for (MediaStrategyItem mediaStrategyItem : bVar.e) {
                            if (setEmptySet2.contains(mediaStrategyItem.getMaterialKey())) {
                                linkedHashMap.put(mediaStrategyItem, str);
                            }
                        }
                        List list2 = (List) linkedHashMap2.get(str2);
                        if (list2 == null) {
                            linkedHashMap2.put(str2, CollectionsKt.arrayListOf(new String[]{str}));
                        } else {
                            Boxing.boxBoolean(list2.add(str));
                        }
                    }
                }
            }
            Collections.shuffle(arrayList);
            Pair pair = TuplesKt.to("最多能输出的结果数量", Boxing.boxInt(size));
            Set setKeySet = linkedHashMap.keySet();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(setKeySet, 10));
            Iterator it2 = setKeySet.iterator();
            while (it2.hasNext()) {
                ImageItem source = ((MediaStrategyItem) it2.next()).getSource();
                String str3 = "";
                if (source != null) {
                    str3 = source.name;
                    if (str3 == null) {
                        str3 = "";
                    }
                }
                arrayList2.add(str3);
            }
            e(MapsKt.mutableMapOf(new Pair[]{pair, TuplesKt.to("重复素材", arrayList2), TuplesKt.to("重复标签", arrayList)}), "过滤数量不足的素材组");
            if (linkedHashMap2.size() > i8) {
                int iMin = Math.min(arrayList.size(), linkedHashMap2.size() - i8);
                for (int i10 = 0; i10 < iMin; i10++) {
                    List list3 = (List) linkedHashMap2.remove(arrayList.get(i10));
                    d("移除重复标签，" + arrayList.get(i10) + "，" + list3);
                    if (list3 != null) {
                        Iterator it3 = list3.iterator();
                        while (it3.hasNext()) {
                            aVar.a.remove((String) it3.next());
                        }
                    }
                }
            }
            for (MediaStrategyItem mediaStrategyItem2 : CollectionsKt.shuffled(linkedHashMap.keySet())) {
                String str4 = (String) linkedHashMap.get(mediaStrategyItem2);
                String str5 = str4;
                if (str4 == null) {
                    str5 = "";
                }
                a.b bVar2 = (a.b) aVar.a.get(str5);
                if (bVar2 != null) {
                    boolean z6 = bVar2.d;
                    int i11 = z6 ? 1 : i7;
                    boolean z7 = z6 || ((CopyOnWriteArrayList) bVar2.e).size() % i7 == 0;
                    boolean z8 = ((CopyOnWriteArrayList) bVar2.e).size() == i11;
                    String str6 = bVar2.b;
                    boolean z9 = z8 && (list = (List) linkedHashMap2.get(str6)) != null && list.size() == 1;
                    if (!z9 || linkedHashMap2.size() > i8) {
                        if (!z7 || size - 1 >= i8) {
                            ((CopyOnWriteArrayList) bVar2.e).remove(mediaStrategyItem2);
                            int i12 = size;
                            if (z7) {
                                i12 = size - 1;
                            }
                            if (z8) {
                                aVar.a.remove(str5);
                                List list4 = (List) linkedHashMap2.get(str6);
                                if (list4 != null) {
                                    Boxing.boxBoolean(list4.remove(str5));
                                }
                            }
                            if (z9) {
                                linkedHashMap2.remove(str6);
                            }
                            ImageItem source2 = mediaStrategyItem2.getSource();
                            String str7 = source2 != null ? source2.path : null;
                            int size2 = linkedHashMap2.size();
                            StringBuilder sbA = androidx.constraintlayout.widget.e.a(i12, "[过滤素材] 过滤上次展示过的素材：", str7, "，最多能输出的结果数量：", ", 不同标签数量：");
                            sbA.append(size2);
                            d(sbA.toString());
                            size = i12;
                        }
                    }
                }
            }
            aVar.c();
            e(aVar.d(), "过滤完成");
            objA = generateJob.a(continuation);
        }
        return objA;
    }
}
