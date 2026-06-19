package com.bilibili.playset.detail.widget;

import androidx.compose.runtime.MutableFloatState;
import com.bilibili.ship.theseus.playlist.PlaylistRepository;
import com.bilibili.ship.theseus.playlist.api.MultiTypeMedia;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: com.bilibili.playset.detail.widget.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/widget/i.class */
public final /* synthetic */ class C5924i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f84638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f84639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f84640c;

    public /* synthetic */ C5924i(int i7, Object obj, Object obj2) {
        this.f84638a = i7;
        this.f84639b = obj;
        this.f84640c = obj2;
    }

    public final Object invoke(Object obj) {
        MultiTypeMedia multiTypeMediaA;
        switch (this.f84638a) {
            case 0:
                float fFloatValue = ((Float) obj).floatValue();
                MutableFloatState mutableFloatState = (MutableFloatState) this.f84639b;
                float fCoerceIn = RangesKt.coerceIn(mutableFloatState.getFloatValue() - fFloatValue, 0.0f, ((MutableFloatState) this.f84640c).getFloatValue());
                float floatValue = mutableFloatState.getFloatValue();
                mutableFloatState.setFloatValue(fCoerceIn);
                return Float.valueOf(floatValue - fCoerceIn);
            default:
                List<MultiTypeMedia> list = (List) obj;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (MultiTypeMedia multiTypeMedia : list) {
                    long jD = multiTypeMedia.d();
                    PlaylistRepository.e eVar = (PlaylistRepository.e) this.f84639b;
                    if (jD == eVar.f95137a.d()) {
                        int i7 = 0;
                        boolean z6 = multiTypeMedia.f95225M.size() > 1;
                        Iterator<Ou0.c> it = multiTypeMedia.f95225M.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Ou0.c next = it.next();
                                Ou0.c cVar = eVar.f95138b;
                                if (cVar == null || next.f18089b != cVar.f18089b) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        multiTypeMediaA = MultiTypeMedia.a(multiTypeMedia, null, 0, 0, z6, true, i7, false, -58720257, 255);
                    } else {
                        multiTypeMediaA = multiTypeMedia;
                        if (jD == ((PlaylistRepository.e) this.f84640c).f95137a.d()) {
                            multiTypeMediaA = MultiTypeMedia.a(multiTypeMedia, null, 0, 0, false, false, 0, false, -58720257, 255);
                        }
                    }
                    arrayList.add(multiTypeMediaA);
                }
                return arrayList;
        }
    }
}
