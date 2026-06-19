package com.bilibili.opd.app.bizcommon.mangapaysdk.data.model;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/data/model/BatchBuy.class */
@Keep
public final class BatchBuy {

    @JSONField(name = "coin")
    private float consumeValue;

    @JSONField(name = "is_default_selected")
    private boolean isDefaultSelect;

    @JSONField(name = "num")
    private int num = -1;

    @JSONField(name = "ep_num")
    private int epNum = -1;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(BatchBuy.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        BatchBuy batchBuy = (BatchBuy) obj;
        return this.num == batchBuy.num && this.consumeValue == batchBuy.consumeValue;
    }

    public final float getConsumeValue() {
        return this.consumeValue;
    }

    public final int getEpNum() {
        return this.epNum;
    }

    public final int getNum() {
        return this.num;
    }

    public int hashCode() {
        return Float.hashCode(this.consumeValue) + (this.num * 31);
    }

    public final boolean isDefaultSelect() {
        return this.isDefaultSelect;
    }

    public final void setConsumeValue(float f7) {
        this.consumeValue = f7;
    }

    public final void setDefaultSelect(boolean z6) {
        this.isDefaultSelect = z6;
    }

    public final void setEpNum(int i7) {
        this.epNum = i7;
    }

    public final void setNum(int i7) {
        this.num = i7;
    }
}
