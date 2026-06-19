package com.bilibili.pegasus.verticaltab.api.model;

import Fn0.c;
import Fn0.e;
import I00.d;
import Sp0.f;
import Vp0.p;
import android.graphics.Rect;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.app.comm.list.common.api.model.PlayerArgs;
import com.bilibili.app.comm.list.common.data.InlineThreePointPanel;
import com.bilibili.app.comm.list.common.data.SharePlane;
import com.bilibili.app.comm.list.common.data.StoryCardIcon;
import com.bilibili.app.comm.list.common.data.ThreePointItem;
import com.bilibili.pegasus.api.model.BasicIndexItem;
import com.bilibili.pegasus.api.modelv2.Avatar;
import com.bilibili.pegasus.api.modelv2.DescButton;
import com.bilibili.pegasus.api.modelv2.Tag;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/verticaltab/api/model/VerticalSmallCoverV2Item.class */
@Keep
public class VerticalSmallCoverV2Item extends BasicIndexItem implements e, c, d, f.a {

    @Nullable
    @JSONField(name = "avatar")
    public Avatar avatar;

    @Nullable
    @JSONField(name = "badge_style")
    public Tag badgeStyle;

    @JSONField(name = "cover_blur")
    public int coverBlur;

    @Nullable
    @JSONField(name = "cover_gif")
    public String coverGif;

    @JSONField(name = "cover_left_icon_1")
    public int coverLeftIcon1;

    @JSONField(name = "cover_left_icon_2")
    public int coverLeftIcon2;

    @Nullable
    @JSONField(name = "cover_left_text_1")
    public String coverLeftText1;

    @Nullable
    @JSONField(name = "cover_left_1_content_description")
    public String coverLeftText1ContentDesc;

    @Nullable
    @JSONField(name = "cover_left_text_2")
    public String coverLeftText2;

    @Nullable
    @JSONField(name = "cover_left_2_content_description")
    public String coverLeftText2ContentDesc;

    @Nullable
    @JSONField(name = "cover_right_background_color")
    public String coverRightBackgroundColor;

    @JSONField(name = "cover_right_icon")
    public int coverRightIcon;

    @Nullable
    @JSONField(name = "cover_right_text")
    public String coverRightText;

    @Nullable
    @JSONField(name = "cover_right_content_description")
    public String coverRightTextContentDesc;

    @Nullable
    @JSONField(name = "desc")
    public String desc;

    @Nullable
    @JSONField(name = "desc_button")
    public DescButton descButton;

    @Nullable
    @JSONField(name = "three_point_meta")
    public InlineThreePointPanel inlineThreePointPanel;

    @Nullable
    @JSONField(name = "rcmd_reason_style")
    public Tag rcmdReason;

    @Nullable
    @JSONField(name = "share_plane")
    public SharePlane sharePlane;

    @Nullable
    @JSONField(name = "goto_icon")
    public StoryCardIcon storyCardIcon;

    @Override // Sp0.f.a
    public boolean filter() {
        return !TextUtils.isEmpty(((BasicIndexItem) this).title);
    }

    public long getAid() {
        PlayerArgs playerArgs = ((BasicIndexItem) this).playerArgs;
        if (playerArgs != null) {
            return playerArgs.aid;
        }
        return 0L;
    }

    @Nullable
    public Avatar getAvatar() {
        return this.avatar;
    }

    public long getCid() {
        PlayerArgs playerArgs = ((BasicIndexItem) this).playerArgs;
        if (playerArgs != null) {
            return playerArgs.cid;
        }
        return 0L;
    }

    @Nullable
    public DescButton getDescButton() {
        return this.descButton;
    }

    public Rect getHolderOutRect(int i7, int i8) {
        if (i8 == 0 && i7 == 0) {
            int i9 = p.f25652b;
            return p.f25655e;
        }
        if (i8 != 1 || i7 != 1) {
            return null;
        }
        int i10 = p.f25652b;
        return p.f25656f;
    }

    @Nullable
    public InlineThreePointPanel getInlineThreePointPanel() {
        return this.inlineThreePointPanel;
    }

    public long getOid() {
        long j7;
        try {
            String str = ((BasicIndexItem) this).param;
            j7 = 0;
            if (str != null) {
                j7 = Long.parseLong(str);
            }
        } catch (Exception e7) {
            j7 = 0;
        }
        return j7;
    }

    public int getShareBusiness() {
        if ("av".equals(((BasicIndexItem) this).cardGoto)) {
            return 1;
        }
        return ("pgc".equals(((BasicIndexItem) this).cardGoto) || "bangumi".equals(((BasicIndexItem) this).cardGoto)) ? 2 : 0;
    }

    @Nullable
    public SharePlane getSharePanel() {
        return this.sharePlane;
    }

    @Nullable
    public List<ThreePointItem> getThreePoint() {
        return null;
    }

    @Nullable
    public /* bridge */ /* synthetic */ String getUriQueryParameter(@NonNull String str) {
        return super.getUriQueryParameter(str);
    }

    public /* bridge */ /* synthetic */ void initCache() {
        super.initCache();
    }

    public /* bridge */ /* synthetic */ boolean initCacheEnable() {
        return super.initCacheEnable();
    }

    public boolean isFavorite() {
        return false;
    }

    public boolean isHot() {
        return false;
    }

    public /* bridge */ /* synthetic */ void safeInitCache() {
        super.safeInitCache();
    }

    public /* bridge */ /* synthetic */ boolean sendDislikeIfOnlyOneTitle() {
        return true;
    }

    public void setFavorite(boolean z6) {
    }
}
