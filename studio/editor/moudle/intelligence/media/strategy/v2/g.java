package com.bilibili.studio.editor.moudle.intelligence.media.strategy.v2;

import com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.MediaStrategyItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import tv.danmaku.android.log.BLog;
import uz0.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/strategy/v2/g.class */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f107428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f107429b;

    public g(int i7, int i8) {
        this.f107428a = i7;
        this.f107429b = i8;
    }

    public static void a(String str, List list) {
        BLog.e("intelligence_rec_tag", "[选择素材] " + str + " 选择完成：" + list);
    }

    public final List<com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.a> b(a.d dVar, int i7) {
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
            aVar2.d(CollectionsKt.take(CollectionsKt.shuffled(list3), !aVar.b.isEmpty() ? 1 : this.f107428a));
            aVar2.f107393e = dVar.a;
            aVar2.f107391c = z6;
            arrayList.add(aVar2);
        }
        return arrayList;
    }
}
