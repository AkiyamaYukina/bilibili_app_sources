package com.bilibili.playset.widget.favorite;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/PlaySet_JsonDescriptor.class */
public final class PlaySet_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f85734a;

    static {
        Class cls = Long.TYPE;
        PojoPropertyDescriptor pojoPropertyDescriptor = new PojoPropertyDescriptor("id", (String[]) null, cls, (Class) null, 7);
        PojoPropertyDescriptor pojoPropertyDescriptor2 = new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 7);
        PojoPropertyDescriptor pojoPropertyDescriptor3 = new PojoPropertyDescriptor("cover", (String[]) null, String.class, (Class) null, 7);
        PojoPropertyDescriptor pojoPropertyDescriptor4 = new PojoPropertyDescriptor("intro", (String[]) null, String.class, (Class) null, 7);
        Class cls2 = Integer.TYPE;
        f85734a = new PojoPropertyDescriptor[]{pojoPropertyDescriptor, pojoPropertyDescriptor2, pojoPropertyDescriptor3, pojoPropertyDescriptor4, new PojoPropertyDescriptor("cover_type", (String[]) null, cls2, (Class) null, 7), new PojoPropertyDescriptor("state", (String[]) null, cls2, (Class) null, 7), new PojoPropertyDescriptor("media_count", (String[]) null, cls2, (Class) null, 7), new PojoPropertyDescriptor("fav_state", (String[]) null, cls2, (Class) null, 7), new PojoPropertyDescriptor("upper", (String[]) null, Upper.class, (Class) null, 6), new PojoPropertyDescriptor("ogv", (String[]) null, OGV.class, (Class) null, 6), new PojoPropertyDescriptor("attr", (String[]) null, cls2, (Class) null, 7), new PojoPropertyDescriptor("view_count", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("vt", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("view_text_1", (String[]) null, String.class, (Class) null, 7), new PojoPropertyDescriptor("play_switch", (String[]) null, cls2, (Class) null, 7), new PojoPropertyDescriptor("type", (String[]) null, cls2, (Class) null, 7), new PojoPropertyDescriptor("link", (String[]) null, String.class, (Class) null, 7), new PojoPropertyDescriptor("is_kid_playlist", (String[]) null, Boolean.TYPE, (Class) null, 7), new PojoPropertyDescriptor("kid_playlist_desc", (String[]) null, String.class, (Class) null, 6)};
    }

    public PlaySet_JsonDescriptor() {
        super(PlaySet.class, f85734a);
    }

    public final Object constructWith(Object[] objArr) {
        PlaySet playSet = new PlaySet();
        Object obj = objArr[0];
        if (obj != null) {
            playSet.setId(((Long) obj).longValue());
        }
        Object obj2 = objArr[1];
        if (obj2 != null) {
            playSet.setTitle((String) obj2);
        }
        Object obj3 = objArr[2];
        if (obj3 != null) {
            playSet.setCover((String) obj3);
        }
        Object obj4 = objArr[3];
        if (obj4 != null) {
            playSet.setIntro((String) obj4);
        }
        Object obj5 = objArr[4];
        if (obj5 != null) {
            playSet.setCoverType(((Integer) obj5).intValue());
        }
        Object obj6 = objArr[5];
        if (obj6 != null) {
            playSet.setValid(((Integer) obj6).intValue());
        }
        Object obj7 = objArr[6];
        if (obj7 != null) {
            playSet.setContentCounts(((Integer) obj7).intValue());
        }
        Object obj8 = objArr[7];
        if (obj8 != null) {
            playSet.setFavorite(((Integer) obj8).intValue());
        }
        Object obj9 = objArr[8];
        if (obj9 != null) {
            playSet.setUpper((Upper) obj9);
        }
        Object obj10 = objArr[9];
        if (obj10 != null) {
            playSet.setOgv((OGV) obj10);
        }
        Object obj11 = objArr[10];
        if (obj11 != null) {
            playSet.setAttr(((Integer) obj11).intValue());
        }
        Object obj12 = objArr[11];
        if (obj12 != null) {
            playSet.setPlayCounts(((Long) obj12).longValue());
        }
        Object obj13 = objArr[12];
        if (obj13 != null) {
            playSet.setVt(((Long) obj13).longValue());
        }
        Object obj14 = objArr[13];
        if (obj14 != null) {
            playSet.setViewText1((String) obj14);
        }
        Object obj15 = objArr[14];
        if (obj15 != null) {
            playSet.setPlaySwitch(((Integer) obj15).intValue());
        }
        Object obj16 = objArr[15];
        if (obj16 != null) {
            playSet.setType(((Integer) obj16).intValue());
        }
        Object obj17 = objArr[16];
        if (obj17 != null) {
            playSet.setLink((String) obj17);
        }
        Object obj18 = objArr[17];
        if (obj18 != null) {
            playSet.setKidPlaylist(((Boolean) obj18).booleanValue());
        }
        Object obj19 = objArr[18];
        if (obj19 != null) {
            playSet.setKidPlaylistDesc((String) obj19);
        }
        return playSet;
    }

    public final Object get(Object obj, int i7) {
        PlaySet playSet = (PlaySet) obj;
        switch (i7) {
            case 0:
                return Long.valueOf(playSet.getId());
            case 1:
                return playSet.getTitle();
            case 2:
                return playSet.getCover();
            case 3:
                return playSet.getIntro();
            case 4:
                return Integer.valueOf(playSet.getCoverType());
            case 5:
                return Integer.valueOf(playSet.getValid());
            case 6:
                return Integer.valueOf(playSet.getContentCounts());
            case 7:
                return Integer.valueOf(playSet.getFavorite());
            case 8:
                return playSet.getUpper();
            case 9:
                return playSet.getOgv();
            case 10:
                return Integer.valueOf(playSet.getAttr());
            case 11:
                return Long.valueOf(playSet.getPlayCounts());
            case 12:
                return Long.valueOf(playSet.getVt());
            case 13:
                return playSet.getViewText1();
            case 14:
                return Integer.valueOf(playSet.getPlaySwitch());
            case 15:
                return Integer.valueOf(playSet.getType());
            case 16:
                return playSet.getLink();
            case 17:
                return Boolean.valueOf(playSet.isKidPlaylist());
            case 18:
                return playSet.getKidPlaylistDesc();
            default:
                return null;
        }
    }
}
