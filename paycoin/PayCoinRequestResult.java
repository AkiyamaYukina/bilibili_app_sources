package com.bilibili.paycoin;

import androidx.annotation.Keep;
import androidx.compose.runtime.I0;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.playerbizcommon.IVideoLikeRouteService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/paycoin/PayCoinRequestResult.class */
@Keep
public class PayCoinRequestResult {

    @JSONField(name = "guide")
    public Guide guide;

    @JSONField(name = IVideoLikeRouteService.ACTION_LIKE)
    public boolean like;

    @JSONField(name = "prompt")
    public boolean prompt;

    @JSONField(name = "v_voucher")
    public String voucher;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/paycoin/PayCoinRequestResult$Guide.class */
    @Keep
    public static class Guide {

        @JSONField(name = "title")
        public String title;

        @JSONField(name = "type")
        public String type;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PayCoinRequestResult{prompt=");
        sb.append(this.prompt);
        sb.append(", like=");
        sb.append(this.like);
        sb.append(", voucher=");
        return I0.b(sb, this.voucher, '}');
    }
}
