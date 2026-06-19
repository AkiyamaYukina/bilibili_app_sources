package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.lib.sharewrapper.basic.BiliExtraBuilder;
import java.util.ArrayList;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameRank.class */
@Keep
public class BiligameRank {
    public static int RANK_SHIFT_BITS = 4;
    public static final int RANK_TYPE_B_INDEX = 7;
    public static final int RANK_TYPE_HOT = 1;
    public static int RANK_TYPE_MASK = 15;
    public static final int RANK_TYPE_NEW = 6;
    public static final int RANK_TYPE_ORDER = 5;
    public static final int RANK_TYPE_TOP = 2;

    @JSONField(name = "description")
    public String description;

    @JSONField(name = "header_image")
    public String headerImage;

    @JSONField(name = "rank_name")
    public String rankName;

    @JSONField(name = "rank_type")
    public int rankType;

    @JSONField(name = "share_image")
    public String shareImage;

    @JSONField(name = BiliExtraBuilder.SHARE_TITLE)
    public String shareTitle;

    @JSONField(name = "show_share")
    public boolean showShare;

    @JSONField(name = "show")
    public boolean toShow;

    public static int arrayToInt(BiligameRank[] biligameRankArr) {
        int length = biligameRankArr.length;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int i10 = i9;
            if (i7 >= length) {
                return i8;
            }
            BiligameRank biligameRank = biligameRankArr[i7];
            int i11 = i8;
            int i12 = i10;
            if (biligameRank.toShow) {
                i11 = i8 + (biligameRank.rankType << (RANK_SHIFT_BITS * i10));
                i12 = i10 + 1;
            }
            i7++;
            i8 = i11;
            i9 = i12;
        }
    }

    public static int[] intToArray(int i7) {
        ArrayList arrayList = new ArrayList();
        while (i7 > 0) {
            arrayList.add(Integer.valueOf(RANK_TYPE_MASK & i7));
            i7 >>= 4;
        }
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i8 = 0; i8 < size; i8++) {
            iArr[i8] = ((Integer) arrayList.get(i8)).intValue();
        }
        return iArr;
    }
}
