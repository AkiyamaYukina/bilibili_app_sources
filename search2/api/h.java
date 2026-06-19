package com.bilibili.search2.api;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.polymer.app.search.v1.SearchTribeeCard;
import com.bapis.bilibili.polymer.app.search.v1.ThreePoint;
import com.bapis.bilibili.polymer.app.search.v1.TribeePostItem;
import com.bapis.bilibili.polymer.app.search.v1.WatchButton;
import com.bilibili.search2.api.BaseSearchItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/h.class */
@StabilityInferred(parameters = 0)
public final class h extends BaseSearchItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Tag f86351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final a f86352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f86353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f86354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f86355e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final List<b> f86356f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/h$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f86357a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f86358b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f86359c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f86360d;

        public a(@NotNull WatchButton watchButton) {
            this.f86357a = watchButton.getTitle();
            this.f86358b = watchButton.getLink();
            this.f86359c = watchButton.getTextColor();
            watchButton.getTextColorNight();
            this.f86360d = watchButton.getBgColor();
            watchButton.getBgColorNight();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/h$b.class */
    @StabilityInferred(parameters = 1)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f86361a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f86362b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f86363c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f86364d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final String f86365e;

        public b(@NotNull TribeePostItem tribeePostItem) {
            this.f86361a = tribeePostItem.getTitle();
            this.f86362b = tribeePostItem.getReply();
            this.f86363c = tribeePostItem.getUri();
            this.f86364d = tribeePostItem.getGoto();
            this.f86365e = tribeePostItem.getParam();
        }
    }

    public h(@NotNull SearchTribeeCard searchTribeeCard) {
        setCover(searchTribeeCard.getCover());
        setTitle(searchTribeeCard.getTitle());
        setUri(searchTribeeCard.getUri());
        this.f86353c = searchTribeeCard.getTribeeDesc();
        this.f86354d = searchTribeeCard.getShowCardDesc();
        this.f86355e = searchTribeeCard.getIsEnhanced();
        searchTribeeCard.getTribeeId();
        this.f86351a = searchTribeeCard.hasBadge() ? new Tag(searchTribeeCard.getBadge()) : null;
        this.f86352b = searchTribeeCard.hasButton() ? new a(searchTribeeCard.getButton()) : null;
        if (searchTribeeCard.hasFeedback()) {
            setFeedback(new BaseSearchItem.Feedback(searchTribeeCard.getFeedback()));
        }
        if (searchTribeeCard.getThreePointCount() > 0) {
            List threePointList = searchTribeeCard.getThreePointList();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(threePointList, 10));
            Iterator it = threePointList.iterator();
            while (it.hasNext()) {
                arrayList.add(new BaseSearchItem.ThreePointItem((ThreePoint) it.next()));
            }
            setThreePoints(arrayList);
        }
        List postItemsList = searchTribeeCard.getPostItemsList();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(postItemsList, 10));
        Iterator it2 = postItemsList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new b((TribeePostItem) it2.next()));
        }
        this.f86356f = arrayList2;
    }
}
