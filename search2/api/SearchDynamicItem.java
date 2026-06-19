package com.bilibili.search2.api;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.polymer.app.search.v1.SearchDynamicCard;
import com.bilibili.playerbizcommon.IVideoLikeRouteService;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchDynamicItem.class */
@StabilityInferred(parameters = 0)
public final class SearchDynamicItem extends BaseSearchItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @JSONField(name = "cover_count")
    private int f86281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @JSONField(name = "covers")
    @Nullable
    private List<String> f86282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @JSONField(name = "upper")
    @Nullable
    private Upper f86283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @JSONField(name = "stat")
    @Nullable
    private Stat f86284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @JSONField(name = "dy_topic")
    @Nullable
    private List<DyTopic> f86285e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @JSONField(name = "badge")
    @Nullable
    private String f86286f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchDynamicItem$DyTopic.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class DyTopic {
        public static final int $stable = 8;

        @JSONField(name = "title")
        @Nullable
        private String title;

        @JSONField(name = EditCustomizeSticker.TAG_URI)
        @Nullable
        private String uri;

        public DyTopic() {
        }

        public DyTopic(@Nullable com.bapis.bilibili.polymer.app.search.v1.DyTopic dyTopic) {
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        public final String getUri() {
            return this.uri;
        }

        public final void setTitle(@Nullable String str) {
            this.title = str;
        }

        public final void setUri(@Nullable String str) {
            this.uri = str;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchDynamicItem$Stat.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class Stat {
        public static final int $stable = 8;

        @JSONField(name = IVideoLikeRouteService.ACTION_LIKE)
        private int like;

        public Stat() {
        }

        public Stat(@NotNull com.bapis.bilibili.polymer.app.search.v1.Stat stat) {
            this.like = stat.getLike();
        }

        public final int getLike() {
            return this.like;
        }

        public final void setLike(int i7) {
            this.like = i7;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchDynamicItem$Upper.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class Upper {
        public static final int $stable = 8;

        @JSONField(name = "cover")
        @Nullable
        private String cover;

        @JSONField(name = EditCustomizeSticker.TAG_MID)
        private long mid;

        @JSONField(name = "ptime_text")
        @Nullable
        private String pTimeText;

        @JSONField(name = "title")
        @Nullable
        private String title;

        public Upper() {
        }

        public Upper(@NotNull com.bapis.bilibili.polymer.app.search.v1.Upper upper) {
            this.mid = upper.getMid();
            this.title = upper.getTitle();
            this.cover = upper.getCover();
            this.pTimeText = upper.getPtimeText();
        }

        @Nullable
        public final String getCover() {
            return this.cover;
        }

        public final long getMid() {
            return this.mid;
        }

        @Nullable
        public final String getPTimeText() {
            return this.pTimeText;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        public final void setCover(@Nullable String str) {
            this.cover = str;
        }

        public final void setMid(long j7) {
            this.mid = j7;
        }

        public final void setPTimeText(@Nullable String str) {
            this.pTimeText = str;
        }

        public final void setTitle(@Nullable String str) {
            this.title = str;
        }
    }

    public SearchDynamicItem() {
    }

    public SearchDynamicItem(@NotNull SearchDynamicCard searchDynamicCard) {
        this.f86281a = searchDynamicCard.getCoverCount();
        if (!searchDynamicCard.getCoversList().isEmpty()) {
            this.f86282b = searchDynamicCard.getCoversList();
        }
        if (searchDynamicCard.hasUpper()) {
            this.f86283c = new Upper(searchDynamicCard.getUpper());
        }
        if (searchDynamicCard.hasStat()) {
            this.f86284d = new Stat(searchDynamicCard.getStat());
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = searchDynamicCard.getDyTopicList().iterator();
        while (it.hasNext()) {
            arrayList.add(new DyTopic((com.bapis.bilibili.polymer.app.search.v1.DyTopic) it.next()));
        }
        if (!arrayList.isEmpty()) {
            this.f86285e = arrayList;
        }
        setTitle(searchDynamicCard.getTitle());
        setCover(searchDynamicCard.getCover());
        this.f86286f = searchDynamicCard.getBadge();
        if (searchDynamicCard.hasFeedback()) {
            setFeedback(new BaseSearchItem.Feedback(searchDynamicCard.getFeedback()));
        }
    }

    @Nullable
    public final String getBadge() {
        return this.f86286f;
    }

    @Nullable
    public final List<String> s() {
        return this.f86282b;
    }

    @Nullable
    public final Stat u() {
        return this.f86284d;
    }

    @Nullable
    public final Upper v() {
        return this.f86283c;
    }
}
