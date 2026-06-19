package com.bilibili.upper.widget.input;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ad.adview.pegasus.holders.inline.player.egg.eggpicture.util.i;
import com.bilibili.upper.widget.input.MentionEditText;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/input/a.class */
@StabilityInferred(parameters = 1)
public final class a {
    public static Pair a(int i7, int i8, String str, String str2, List list) {
        int length = str != null ? str.length() : 0;
        int length2 = str2 != null ? str2.length() : 0;
        int i9 = length2 - length;
        int i10 = i8 + i7;
        if (list.isEmpty() || str == null || str.length() == 0) {
            BLog.e("HashTagProcessHelper", "全量重新匹配 first = 0 second = " + length2);
            return TuplesKt.to(0, Integer.valueOf(length2));
        }
        ArrayList<MentionEditText.g> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((MentionEditText.g) obj).b()) {
                arrayList.add(obj);
            }
        }
        int i11 = -1;
        for (MentionEditText.g gVar : arrayList) {
            int i12 = gVar.f114533a;
            int i13 = gVar.f114534b;
            if (i12 < i7 && i13 >= i10) {
                return TuplesKt.to(Integer.valueOf(i12), Integer.valueOf(Math.min(i13 + i9, length2)));
            }
            if (i13 < i7 && i13 > i11) {
                i11 = i13;
            } else if (i13 == i7 && gVar.f114535c) {
                i11 = i7;
            }
        }
        if (i11 == -1) {
            i11 = 0;
        }
        int i14 = Integer.MAX_VALUE;
        for (MentionEditText.g gVar2 : arrayList) {
            int i15 = gVar2.f114533a;
            if (i15 > i10 && i15 < i14 && gVar2.f114535c) {
                i14 = i15;
            }
        }
        int i16 = i14 != Integer.MAX_VALUE ? i14 + i9 : length2;
        int i17 = i11 < 0 ? 0 : i11;
        if (i16 <= length2) {
            length2 = i16;
        }
        int i18 = length2;
        if (length2 < i17) {
            i18 = i17;
        }
        i.a(i17, i18, "计算后的 first = ", " second = ", "HashTagProcessHelper");
        return TuplesKt.to(Integer.valueOf(i17), Integer.valueOf(i18));
    }
}
