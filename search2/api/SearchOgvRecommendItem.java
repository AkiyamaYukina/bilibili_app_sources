package com.bilibili.search2.api;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.polymer.app.search.v1.SearchOgvRecommendCard;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchOgvRecommendItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchOgvRecommendItem extends BaseSearchItem {
    public static final int $stable = 8;

    @JSONField(name = "items")
    @Nullable
    private List<OgvRecommendWord> list;

    @JSONField(name = "special_bg_color")
    @Nullable
    private String ogvThemeColor;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchOgvRecommendItem$OgvRecommendWord.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class OgvRecommendWord {
        public static final int $stable = 8;

        @JSONField(name = "goto")
        @Nullable
        private String govGoto;

        @JSONField(name = "param")
        @Nullable
        private String param;

        @JSONField(name = "title")
        @Nullable
        private String title;

        @JSONField(name = EditCustomizeSticker.TAG_URI)
        @Nullable
        private String uri;

        public OgvRecommendWord() {
        }

        public OgvRecommendWord(@NotNull com.bapis.bilibili.polymer.app.search.v1.OgvRecommendWord ogvRecommendWord) {
            this.title = ogvRecommendWord.getTitle();
            this.govGoto = ogvRecommendWord.getGoto();
            this.param = ogvRecommendWord.getParam();
            this.uri = ogvRecommendWord.getUri();
        }

        @Nullable
        public final String getGovGoto() {
            return this.govGoto;
        }

        @Nullable
        public final String getParam() {
            return this.param;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        public final String getUri() {
            return this.uri;
        }

        public final void setGovGoto(@Nullable String str) {
            this.govGoto = str;
        }

        public final void setParam(@Nullable String str) {
            this.param = str;
        }

        public final void setTitle(@Nullable String str) {
            this.title = str;
        }

        public final void setUri(@Nullable String str) {
            this.uri = str;
        }
    }

    public SearchOgvRecommendItem() {
    }

    public SearchOgvRecommendItem(@NotNull SearchOgvRecommendCard searchOgvRecommendCard) {
        this.ogvThemeColor = searchOgvRecommendCard.getSpecialBgColor();
        ArrayList arrayList = new ArrayList();
        Iterator it = searchOgvRecommendCard.getItemsList().iterator();
        while (it.hasNext()) {
            arrayList.add(new OgvRecommendWord((com.bapis.bilibili.polymer.app.search.v1.OgvRecommendWord) it.next()));
        }
        if (!arrayList.isEmpty()) {
            this.list = arrayList;
        }
        setTitle(searchOgvRecommendCard.getTitle());
        setCover(searchOgvRecommendCard.getCover());
    }

    @Nullable
    public final List<OgvRecommendWord> getList() {
        return this.list;
    }

    @Nullable
    public final String getOgvThemeColor() {
        return this.ogvThemeColor;
    }

    public final void setList(@Nullable List<OgvRecommendWord> list) {
        this.list = list;
    }

    public final void setOgvThemeColor(@Nullable String str) {
        this.ogvThemeColor = str;
    }
}
