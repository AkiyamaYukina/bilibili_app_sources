package com.bilibili.lib.projection.internal.api.model;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/api/model/ListUiBean.class */
@Keep
public final class ListUiBean {

    @JSONField(name = "search")
    @Nullable
    private SearchUiBean searchUiBean;

    @JSONField(name = "third")
    @Nullable
    private ThirdUiBeen thirdUi;

    @JSONField(name = "ui_ab")
    private int uiAb;

    @JSONField(name = "vehicle")
    @Nullable
    private VehicleUiBeen vehicle;

    @JSONField(name = "yst")
    @Nullable
    private YstUiBean ystUi;

    @Nullable
    public final SearchUiBean getSearchUiBean() {
        return this.searchUiBean;
    }

    @Nullable
    public final ThirdUiBeen getThirdUi() {
        return this.thirdUi;
    }

    public final int getUiAb() {
        return this.uiAb;
    }

    @Nullable
    public final VehicleUiBeen getVehicle() {
        return this.vehicle;
    }

    @Nullable
    public final YstUiBean getYstUi() {
        return this.ystUi;
    }

    public final void setSearchUiBean(@Nullable SearchUiBean searchUiBean) {
        this.searchUiBean = searchUiBean;
    }

    public final void setThirdUi(@Nullable ThirdUiBeen thirdUiBeen) {
        this.thirdUi = thirdUiBeen;
    }

    public final void setUiAb(int i7) {
        this.uiAb = i7;
    }

    public final void setVehicle(@Nullable VehicleUiBeen vehicleUiBeen) {
        this.vehicle = vehicleUiBeen;
    }

    public final void setYstUi(@Nullable YstUiBean ystUiBean) {
        this.ystUi = ystUiBean;
    }
}
