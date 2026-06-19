package com.bilibili.playerbizcommonv2.api;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/api/DanmakuColorfulPanelInfo.class */
@StabilityInferred(parameters = 0)
@Keep
public final class DanmakuColorfulPanelInfo {
    public static final int $stable = 8;

    @JSONField(name = "colorful_panel")
    @Nullable
    private List<ColorfulPanel> colorfulPanelList;

    @JSONField(name = "colorful_privilege_details")
    @Nullable
    private ColorfulPrivilegeDetails colorfulPrivilegeDetails;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/api/DanmakuColorfulPanelInfo$ColorfulPanel.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class ColorfulPanel {
        public static final int $stable = 8;

        @JSONField(name = "icon")
        @Nullable
        private String icon;

        @JSONField(name = "type")
        @Nullable
        private Long type;

        @Nullable
        public final String getIcon() {
            return this.icon;
        }

        @Nullable
        public final Long getType() {
            return this.type;
        }

        public final void setIcon(@Nullable String str) {
            this.icon = str;
        }

        public final void setType(@Nullable Long l7) {
            this.type = l7;
        }

        @NotNull
        public String toString() {
            return "ColorfulPanel(type=" + this.type + ", icon=" + this.icon + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/api/DanmakuColorfulPanelInfo$ColorfulPrivilegeDetails.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class ColorfulPrivilegeDetails {
        public static final int $stable = 8;

        @JSONField(name = "vip_order_promotion")
        @Nullable
        private Boolean vipOrderPromotion = Boolean.FALSE;

        @Nullable
        public final Boolean getVipOrderPromotion() {
            return this.vipOrderPromotion;
        }

        public final void setVipOrderPromotion(@Nullable Boolean bool) {
            this.vipOrderPromotion = bool;
        }

        @NotNull
        public String toString() {
            return "ColorfulPrivilegeDetails(vipOrderPromotion=" + this.vipOrderPromotion + ")";
        }
    }

    @Nullable
    public final List<ColorfulPanel> getColorfulPanelList() {
        return this.colorfulPanelList;
    }

    @Nullable
    public final ColorfulPrivilegeDetails getColorfulPrivilegeDetails() {
        return this.colorfulPrivilegeDetails;
    }

    public final void setColorfulPanelList(@Nullable List<ColorfulPanel> list) {
        this.colorfulPanelList = list;
    }

    public final void setColorfulPrivilegeDetails(@Nullable ColorfulPrivilegeDetails colorfulPrivilegeDetails) {
        this.colorfulPrivilegeDetails = colorfulPrivilegeDetails;
    }

    @NotNull
    public String toString() {
        return "DanmakuColorfulPanelInfo(colorfulPanelList=" + this.colorfulPanelList + ", colorfulPrivilegeDetails=" + this.colorfulPrivilegeDetails + ")";
    }
}
