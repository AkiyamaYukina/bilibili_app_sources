package com.bilibili.ogv.operation.api;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RequestMode;
import com.bilibili.lib.blrouter.RouteInfo;
import com.bilibili.lib.blrouter.RouteResponse;
import com.bilibili.ogv.opbase.BannerStyle;
import com.bilibili.ogv.operation.entrance.indexpage.BangumiCategoryIndexTabFragment;
import ec.c;
import java.util.Map;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/api/OperationPageTabVo.class */
@StabilityInferred(parameters = 0)
@Keep
public final class OperationPageTabVo {
    public static final int $stable = 8;

    @JSONField(name = "after_click_icon")
    @Nullable
    private String afterClickIcon;

    @JSONField(name = "color_style")
    @Nullable
    private BannerStyle bannerStyle;

    @JSONField(name = "before_click_icon")
    @Nullable
    private String beforeClickIcon;

    @JSONField(name = "is_icon_loop")
    @Nullable
    private Integer iconLoopType;

    @JSONField(name = "id")
    private long id;

    @JSONField(name = "index_type")
    private long indexType;

    @JSONField(name = "link")
    @Nullable
    private String link;

    @Nullable
    private Map<String, String> report;

    @JSONField(name = "title")
    @Nullable
    private String title;

    @Nullable
    public final String getAfterClickIcon() {
        return this.afterClickIcon;
    }

    @Nullable
    public final BannerStyle getBannerStyle() {
        return this.bannerStyle;
    }

    @Nullable
    public final String getBeforeClickIcon() {
        return this.beforeClickIcon;
    }

    @Nullable
    public final Integer getIconLoopType() {
        return this.iconLoopType;
    }

    public final long getId() {
        return this.id;
    }

    public final long getIndexType() {
        return this.indexType;
    }

    @Nullable
    public final String getLink() {
        return this.link;
    }

    @Nullable
    public final Map<String, String> getReport() {
        return this.report;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final boolean isH5Link() {
        String str = this.link;
        boolean z6 = false;
        if (str != null) {
            z6 = false;
            if (StringsKt.Z(str, "http")) {
                z6 = true;
            }
        }
        return z6;
    }

    public final boolean isValidLink() {
        Class clazz;
        String str = this.link;
        boolean z6 = false;
        if (str != null) {
            z6 = false;
            if (str.length() > 0) {
                if (isH5Link()) {
                    z6 = true;
                } else {
                    RouteResponse routeResponseExecute = BLRouter.newCall$default(c.a(str), (Context) null, (Fragment) null, RequestMode.ROUTE, false, 16, (Object) null).execute();
                    z6 = false;
                    if (routeResponseExecute.isSuccess()) {
                        Object obj = routeResponseExecute.getObj();
                        Fragment fragment = null;
                        RouteInfo routeInfo = obj instanceof RouteInfo ? (RouteInfo) obj : null;
                        Object objNewInstance = (routeInfo == null || (clazz = routeInfo.getClazz()) == null) ? null : clazz.newInstance();
                        if (objNewInstance instanceof Fragment) {
                            fragment = (Fragment) objNewInstance;
                        }
                        z6 = false;
                        if (fragment != null) {
                            z6 = false;
                            if (!(fragment instanceof BangumiCategoryIndexTabFragment)) {
                                z6 = true;
                            }
                        }
                    }
                }
            }
        }
        return z6;
    }

    public final void setAfterClickIcon(@Nullable String str) {
        this.afterClickIcon = str;
    }

    public final void setBannerStyle(@Nullable BannerStyle bannerStyle) {
        this.bannerStyle = bannerStyle;
    }

    public final void setBeforeClickIcon(@Nullable String str) {
        this.beforeClickIcon = str;
    }

    public final void setIconLoopType(@Nullable Integer num) {
        this.iconLoopType = num;
    }

    public final void setId(long j7) {
        this.id = j7;
    }

    public final void setIndexType(long j7) {
        this.indexType = j7;
    }

    public final void setLink(@Nullable String str) {
        this.link = str;
    }

    public final void setReport(@Nullable Map<String, String> map) {
        this.report = map;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }
}
