package com.bilibili.playerbizcommonv2.danmaku.input.panel.commandsdetail.mark;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/panel/commandsdetail/mark/MarkGoodsList.class */
@StabilityInferred(parameters = 0)
@Keep
public final class MarkGoodsList {
    public static final int $stable = 8;

    @JSONField(name = "item_list")
    @NotNull
    private List<MarkGoods> itemList = new ArrayList();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/panel/commandsdetail/mark/MarkGoodsList$MarkGoods.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class MarkGoods {
        public static final int $stable = 8;

        @JSONField(name = "item_id")
        private long itemId;

        @JSONField(name = "source_type")
        private int sourceType;

        @JSONField(name = "name")
        @NotNull
        private String name = "";

        @JSONField(name = "img")
        @NotNull
        private String img = "";

        @JSONField(name = "icon_url")
        @NotNull
        private String iconUrl = "";

        @NotNull
        public final String getIconUrl() {
            return this.iconUrl;
        }

        @NotNull
        public final String getImg() {
            return this.img;
        }

        public final long getItemId() {
            return this.itemId;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public final int getSourceType() {
            return this.sourceType;
        }

        public final void setIconUrl(@NotNull String str) {
            this.iconUrl = str;
        }

        public final void setImg(@NotNull String str) {
            this.img = str;
        }

        public final void setItemId(long j7) {
            this.itemId = j7;
        }

        public final void setName(@NotNull String str) {
            this.name = str;
        }

        public final void setSourceType(int i7) {
            this.sourceType = i7;
        }
    }

    @NotNull
    public final List<MarkGoods> getItemList() {
        return this.itemList;
    }

    public final void setItemList(@NotNull List<MarkGoods> list) {
        this.itemList = list;
    }
}
