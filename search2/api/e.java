package com.bilibili.search2.api;

import G.p;
import Ps0.E;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.polymer.app.search.v1.SearchGiantCard;
import com.bilibili.base.util.NumberFormat;
import com.bilibili.search2.api.BaseSearchItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/e.class */
@StabilityInferred(parameters = 0)
public final class e extends BaseSearchItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f86321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f86322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f86323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f86324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f86325e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public List<E> f86326f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f86327g;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.util.List<Ps0.E>] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    public e(@NotNull SearchGiantCard searchGiantCard) {
        ?? arrayList;
        this.f86323c = searchGiantCard.getContent();
        this.f86321a = searchGiantCard.getFace();
        this.f86322b = searchGiantCard.getName();
        String str = searchGiantCard.getLike() <= 0 ? "" : NumberFormat.format(searchGiantCard.getLike(), "-");
        this.f86324d = str;
        this.f86325e = p.a(str.length() == 0 ? "" : " · ", searchGiantCard.getPubTime());
        if (searchGiantCard.hasFeedback()) {
            setFeedback(new BaseSearchItem.Feedback(searchGiantCard.getFeedback()));
        }
        this.f86327g = searchGiantCard.getImageUrlsList().size();
        int iHashCode = hashCode();
        if (searchGiantCard.getImageUrlsList().size() > 4) {
            List imageUrlsList = searchGiantCard.getImageUrlsList();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(imageUrlsList, 10));
            int i7 = 0;
            for (Object obj : imageUrlsList) {
                if (i7 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                arrayList2.add(new E(iHashCode, (String) obj, i7 == 3 ? String.valueOf(searchGiantCard.getImageUrlsList().size() - 4) : ""));
                i7++;
            }
            arrayList = arrayList2.subList(0, 4);
        } else {
            List imageUrlsList2 = searchGiantCard.getImageUrlsList();
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(imageUrlsList2, 10));
            Iterator it = imageUrlsList2.iterator();
            while (it.hasNext()) {
                arrayList.add(new E(iHashCode, (String) it.next(), ""));
            }
        }
        this.f86326f = arrayList;
    }
}
