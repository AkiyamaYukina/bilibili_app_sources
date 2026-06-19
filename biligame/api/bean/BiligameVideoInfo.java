package com.bilibili.biligame.api.bean;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.annotation.Keep;
import androidx.core.content.ContextCompat;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.utils.GameUtils;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/BiligameVideoInfo.class */
@Keep
public class BiligameVideoInfo {

    @JSONField(name = "aid")
    public String aid;

    @JSONField(name = "author")
    public String author;

    @JSONField(name = "bv_id")
    public String bid;

    @JSONField(name = EditCustomizeSticker.TAG_DURATION)
    public long duration;

    @JSONField(name = "is_official")
    public boolean isOfficial;

    @JSONField(name = "pic")
    public String pic;

    @JSONField(name = "play")
    public int play;

    @JSONField(name = "title")
    public String title;

    @JSONField(name = "video_review")
    public int videoReview;

    @JSONField(name = "vt")
    public String vt;

    @JSONField(name = "enable_vt")
    public boolean vtEnable;

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof com.bilibili.biligame.api.bean.BiligameVideoInfo
            r7 = r0
            r0 = 0
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r7
            if (r0 == 0) goto L29
            r0 = r4
            r1 = r3
            if (r0 == r1) goto L27
            r0 = r6
            r5 = r0
            r0 = r3
            java.lang.String r0 = r0.aid
            r1 = r4
            com.bilibili.biligame.api.bean.BiligameVideoInfo r1 = (com.bilibili.biligame.api.bean.BiligameVideoInfo) r1
            java.lang.String r1 = r1.aid
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L29
        L27:
            r0 = 1
            r5 = r0
        L29:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.biligame.api.bean.BiligameVideoInfo.equals(java.lang.Object):boolean");
    }

    public Drawable getPlayIconDrawable(Context context, int i7) {
        Drawable drawable = ContextCompat.getDrawable(context, this.vtEnable ? 2131235257 : 2131235038);
        if (drawable != null) {
            drawable.setBounds(0, 0, i7, i7);
        }
        return drawable;
    }

    public String getPlayText(boolean z6) {
        return this.vtEnable ? GameUtils.formatVideoVT(this.vt, z6) : GameUtils.formatVideoVV(this.play, z6);
    }

    public int hashCode() {
        String str = this.aid;
        return str != null ? str.hashCode() : super.hashCode();
    }
}
