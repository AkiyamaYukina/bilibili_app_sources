package com.bilibili.playset.detail.data;

import com.bilibili.playset.api.MultitypePlaylist;
import com.bilibili.playset.api.SocializeInfo;
import com.bilibili.playset.api.Upper;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/c.class */
public final class c {
    public static MultitypePlaylist.Info a(MultitypePlaylist.Info info, int i7, SocializeInfo socializeInfo, String str, int i8, String str2, int i9) {
        if ((i9 & 1) != 0) {
            i7 = info.attr;
        }
        if ((i9 & 2) != 0) {
            socializeInfo = info.socializeInfo;
        }
        String str3 = info.cover;
        int i10 = info.cover_type;
        long j7 = info.ctime;
        int i11 = info.favState;
        long j8 = info.id;
        if ((i9 & 128) != 0) {
            str = info.intro;
        }
        int i12 = info.likeState;
        if ((i9 & 512) != 0) {
            i8 = info.mediaCount;
        }
        boolean z6 = info.isTop;
        long j9 = info.mid;
        long j10 = info.mtime;
        if ((i9 & 8192) != 0) {
            str2 = info.title;
        }
        int i13 = info.type;
        Upper upper = info.upper;
        int i14 = info.pageType;
        MultitypePlaylist.Info info2 = new MultitypePlaylist.Info();
        info2.attr = i7;
        info2.socializeInfo = socializeInfo;
        info2.cover = str3;
        info2.cover_type = i10;
        info2.ctime = j7;
        info2.favState = i11;
        info2.id = j8;
        info2.intro = str;
        info2.likeState = i12;
        info2.mediaCount = i8;
        info2.isTop = z6;
        info2.mid = j9;
        info2.mtime = j10;
        info2.title = str2;
        info2.type = i13;
        info2.upper = upper;
        info2.pageType = i14;
        return info2;
    }

    public static SocializeInfo b(SocializeInfo socializeInfo, int i7, int i8, int i9, int i10) {
        if ((i10 & 1) != 0) {
            i7 = socializeInfo.collect;
        }
        long j7 = socializeInfo.danmaku;
        long j8 = socializeInfo.play;
        int i11 = socializeInfo.reply;
        if ((i10 & 16) != 0) {
            i8 = socializeInfo.share;
        }
        int i12 = socializeInfo.thumb_down;
        if ((i10 & 64) != 0) {
            i9 = socializeInfo.thumb_up;
        }
        int i13 = socializeInfo.coin;
        long j9 = socializeInfo.vt;
        int i14 = socializeInfo.play_switch;
        String str = socializeInfo.view_text_1;
        SocializeInfo socializeInfo2 = new SocializeInfo();
        socializeInfo2.collect = i7;
        socializeInfo2.danmaku = j7;
        socializeInfo2.play = j8;
        socializeInfo2.reply = i11;
        socializeInfo2.share = i8;
        socializeInfo2.thumb_down = i12;
        socializeInfo2.thumb_up = i9;
        socializeInfo2.coin = i13;
        socializeInfo2.vt = j9;
        socializeInfo2.play_switch = i14;
        socializeInfo2.view_text_1 = str;
        return socializeInfo2;
    }
}
