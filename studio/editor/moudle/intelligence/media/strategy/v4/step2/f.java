package com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.step2;

import com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.MediaStrategyItem;
import com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.GenerateJob;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import uz0.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/strategy/v4/step2/f.class */
public final class f extends com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.step2.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f107531g;
    public final int h;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/strategy/v4/step2/f$a.class */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t8) {
            return ComparisonsKt.compareValues(Integer.valueOf(((com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.a) t7).f107393e), Integer.valueOf(((com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.a) t8).f107393e));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/strategy/v4/step2/f$b.class */
    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t7, T t8) {
            return ComparisonsKt.compareValues(Integer.valueOf(((a.d) t7).a), Integer.valueOf(((a.d) t8).a));
        }
    }

    public f(@NotNull uz0.b bVar) {
        super(bVar);
        this.f107531g = bVar.c;
        this.h = bVar.d;
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.d
    @NotNull
    public final String a() {
        return "[客户端供给][选择素材]";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v3, types: [java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.step2.a, com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.step2.f] */
    @Override // com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.d
    @Nullable
    public final Object c(@NotNull GenerateJob generateJob, @NotNull Continuation<? super List<com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.a>> continuation) {
        Object objA;
        int i7;
        int i8;
        int i9;
        Object next;
        int i10 = generateJob.f107450e;
        if (i10 <= 0 || (i7 = this.h) <= 0 || (i8 = this.f107531g) <= 0) {
            objA = null;
        } else {
            uz0.a aVar = generateJob.h;
            if (aVar == null) {
                return generateJob.a(continuation);
            }
            ArrayList arrayList = new ArrayList();
            generateJob.f107453i = arrayList;
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            loop0: for (a.c cVar : aVar.b) {
                CollectionsKt.z(cVar.b, Random.Default);
                for (a.d dVar : cVar.b) {
                    CollectionsKt.z(dVar.c, Random.Default);
                    Iterator it = arrayList2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (Intrinsics.areEqual(((a.d) next).b, dVar.b)) {
                            break;
                        }
                    }
                    if (next == null) {
                        arrayList2.add(dVar);
                        if (arrayList2.size() == i10) {
                            break loop0;
                        }
                    } else {
                        Boxing.boxBoolean(arrayList4.add(dVar));
                    }
                    arrayList3.addAll(dVar.c);
                }
            }
            if (arrayList2.size() >= i10) {
                Iterator it2 = arrayList2.subList(0, i10).iterator();
                while (it2.hasNext()) {
                    arrayList.addAll(f((a.d) it2.next(), 1));
                }
                ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(((com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.a) it3.next()).e());
                }
                e(arrayList5, "不同标签组选择完成");
                return generateJob.a(continuation);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                linkedHashMap.put((a.d) it4.next(), Boxing.boxInt(1));
            }
            int size = i10 - arrayList2.size();
            Iterator it5 = CollectionsKt.sortedWith(CollectionsKt.plus(arrayList2, arrayList4), (Comparator) new Object()).iterator();
            while (true) {
                i9 = size;
                if (!it5.hasNext()) {
                    break;
                }
                a.d dVar2 = (a.d) it5.next();
                int size2 = dVar2.c.size();
                Integer num = (Integer) linkedHashMap.get(dVar2);
                int iIntValue = size2 - (num != null ? num.intValue() : 0);
                if (iIntValue >= size) {
                    Integer num2 = (Integer) linkedHashMap.get(dVar2);
                    linkedHashMap.put(dVar2, Boxing.boxInt(size + (num2 != null ? num2.intValue() : 0)));
                    i9 = 0;
                } else {
                    linkedHashMap.put(dVar2, Boxing.boxInt(dVar2.c.size()));
                    size -= iIntValue;
                }
            }
            if (i9 == 0) {
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    arrayList.addAll(f((a.d) entry.getKey(), ((Number) entry.getValue()).intValue()));
                }
                ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    arrayList6.add(((com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.a) it6.next()).e());
                }
                e(arrayList6, "不同日期组选择完成");
                return generateJob.a(continuation);
            }
            int size3 = arrayList3.size();
            Integer[] numArr = new Integer[size3];
            for (int i11 = 0; i11 < size3; i11++) {
                numArr[i11] = Boxing.boxInt(1);
            }
            int size4 = i10 - arrayList3.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size3) {
                    break;
                }
                a.a aVar2 = (a.a) arrayList3.get(i12);
                int size5 = aVar2.b.size();
                int size6 = aVar2.c.size();
                int i13 = size5 + (Math.min(size6 / i10, i8) > i7 ? i10 : size6 / i7);
                int i14 = i13 - 1;
                if (i14 >= size4) {
                    numArr[i12] = Boxing.boxInt(size4 + 1);
                    break;
                }
                numArr[i12] = Boxing.boxInt(i13);
                size4 -= i14;
                i12++;
            }
            int i15 = 0;
            for (Object obj : arrayList3) {
                if (i15 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                a.a aVar3 = (a.a) obj;
                int iIntValue2 = numArr[i15].intValue();
                ?? arrayList7 = new ArrayList();
                for (MediaStrategyItem mediaStrategyItem : aVar3.b) {
                    com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.a aVar4 = new com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.a();
                    aVar4.d(CollectionsKt.arrayListOf(new MediaStrategyItem[]{mediaStrategyItem}));
                    String label = mediaStrategyItem.getLabel();
                    aVar4.f107391c = Intrinsics.areEqual(label, MediaStrategyItem.SOURCE_FROM_OTHER) || Intrinsics.areEqual(label, "其他_其他_其他");
                    aVar4.f107393e = mediaStrategyItem.getPriority();
                    arrayList7.add(aVar4);
                }
                if (arrayList7.size() >= iIntValue2) {
                    arrayList7 = CollectionsKt.shuffled((Iterable) arrayList7).subList(0, iIntValue2);
                } else {
                    List mutableList = CollectionsKt.toMutableList(aVar3.c);
                    MediaStrategyItem mediaStrategyItem2 = (MediaStrategyItem) CollectionsKt.firstOrNull(mutableList);
                    if (mediaStrategyItem2 != null) {
                        int iMin = Math.min(mutableList.size() / (iIntValue2 - arrayList7.size()), i8);
                        int size7 = arrayList7.size();
                        int i16 = 0;
                        while (true) {
                            int i17 = i16;
                            if (i17 >= iIntValue2 - size7) {
                                break;
                            }
                            com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.a aVar5 = new com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.a();
                            int i18 = i17 + 1;
                            aVar5.d(mutableList.subList(i17 * iMin, i18 * iMin));
                            String label2 = mediaStrategyItem2.getLabel();
                            aVar5.f107391c = Intrinsics.areEqual(label2, MediaStrategyItem.SOURCE_FROM_OTHER) || Intrinsics.areEqual(label2, "其他_其他_其他");
                            aVar5.f107393e = mediaStrategyItem2.getPriority();
                            arrayList7.add(aVar5);
                            i16 = i18;
                        }
                        arrayList7 = CollectionsKt.shuffled((Iterable) arrayList7);
                    }
                }
                arrayList.addAll((Collection) arrayList7);
                i15++;
            }
            CollectionsKt.z(arrayList, Random.Default);
            if (arrayList.size() > 1) {
                CollectionsKt.sortWith(arrayList, (Comparator) new Object());
            }
            ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it7 = arrayList.iterator();
            while (it7.hasNext()) {
                arrayList8.add(((com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.a) it7.next()).e());
            }
            e(arrayList8, "相同日期组选择完成");
            objA = generateJob.a(continuation);
        }
        return objA;
    }

    public final List<com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.a> f(a.d dVar, int i7) {
        String str = dVar.b;
        boolean z6 = Intrinsics.areEqual(str, MediaStrategyItem.SOURCE_FROM_OTHER) || Intrinsics.areEqual(str, "其他_其他_其他");
        List<a.a> listTake = CollectionsKt.take(CollectionsKt.shuffled(dVar.c), i7);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listTake, 10));
        for (a.a aVar : listTake) {
            com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.a aVar2 = new com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.a();
            List list = aVar.b;
            List list2 = list;
            if (list.isEmpty()) {
                list2 = aVar.c;
            }
            List list3 = list2;
            aVar2.d(CollectionsKt.take(CollectionsKt.shuffled(list3), !aVar.b.isEmpty() ? 1 : this.f107531g));
            aVar2.f107393e = dVar.a;
            aVar2.f107391c = z6;
            arrayList.add(aVar2);
        }
        return arrayList;
    }
}
