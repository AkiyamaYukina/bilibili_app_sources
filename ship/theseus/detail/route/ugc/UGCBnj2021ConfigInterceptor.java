package com.bilibili.ship.theseus.detail.route.ugc;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.droid.StringUtil;
import com.bilibili.lib.blrouter.RouteInterceptor;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/route/ugc/UGCBnj2021ConfigInterceptor.class */
@StabilityInferred(parameters = 1)
public final class UGCBnj2021ConfigInterceptor implements RouteInterceptor {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/route/ugc/UGCBnj2021ConfigInterceptor$BnjConfigInfo.class */
    @Keep
    public static final class BnjConfigInfo {

        @JSONField(name = "bnj2021_aids")
        @Nullable
        private List<String> bnj2021AvIds;

        @JSONField(name = "bnj2021_bvids")
        @Nullable
        private List<String> bnj2021BvIds;

        @JSONField(name = "bg_color")
        @NotNull
        private String bnj2021BgColor = "#AF193C";

        @JSONField(name = "selected_bg_color")
        @NotNull
        private String bnj2021SelectedBgColor = "#9D1635";

        @JSONField(name = "text_color")
        @NotNull
        private String bnj2021TextColor = "#FFE6B1";

        @Nullable
        public final List<String> getBnj2021AvIds() {
            return this.bnj2021AvIds;
        }

        @NotNull
        public final String getBnj2021BgColor() {
            return this.bnj2021BgColor;
        }

        @Nullable
        public final List<String> getBnj2021BvIds() {
            return this.bnj2021BvIds;
        }

        @NotNull
        public final String getBnj2021SelectedBgColor() {
            return this.bnj2021SelectedBgColor;
        }

        @NotNull
        public final String getBnj2021TextColor() {
            return this.bnj2021TextColor;
        }

        public final boolean isConfigValid() {
            boolean z6 = false;
            if (StringUtil.isNotBlank(this.bnj2021BgColor)) {
                z6 = false;
                if (StringUtil.isNotBlank(this.bnj2021SelectedBgColor)) {
                    z6 = false;
                    if (StringUtil.isNotBlank(this.bnj2021TextColor)) {
                        List<String> list = this.bnj2021AvIds;
                        z6 = false;
                        if (list != null ? list.isEmpty() : false) {
                            List<String> list2 = this.bnj2021BvIds;
                            z6 = false;
                            if (list2 != null ? list2.isEmpty() : false) {
                                z6 = true;
                            }
                        }
                    }
                }
            }
            return z6;
        }

        public final void setBnj2021AvIds(@Nullable List<String> list) {
            this.bnj2021AvIds = list;
        }

        public final void setBnj2021BgColor(@NotNull String str) {
            this.bnj2021BgColor = str;
        }

        public final void setBnj2021BvIds(@Nullable List<String> list) {
            this.bnj2021BvIds = list;
        }

        public final void setBnj2021SelectedBgColor(@NotNull String str) {
            this.bnj2021SelectedBgColor = str;
        }

        public final void setBnj2021TextColor(@NotNull String str) {
            this.bnj2021TextColor = str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00db  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bilibili.lib.blrouter.RouteResponse intercept(@org.jetbrains.annotations.NotNull com.bilibili.lib.blrouter.RouteInterceptor.Chain r6) {
        /*
            Method dump skipped, instruction units count: 543
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.detail.route.ugc.UGCBnj2021ConfigInterceptor.intercept(com.bilibili.lib.blrouter.RouteInterceptor$Chain):com.bilibili.lib.blrouter.RouteResponse");
    }
}
