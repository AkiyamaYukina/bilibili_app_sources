package com.bilibili.lib.sharewrapper.online.api;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.live.streaming.source.TextSource;
import com.tencent.connect.common.Constants;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/online/api/ShareClickResult_JsonDescriptor.class */
public final class ShareClickResult_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f64435a = {new PojoPropertyDescriptor(TextSource.CFG_CONTENT, (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("link", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor(Constants.PARAM_AVATAR_URI, (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("audio_play_link", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("share_mode", (String[]) null, Integer.class, (Class) null, 6), new PojoPropertyDescriptor("program_id", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("program_path", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("header", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("schema", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("is_first_share", (String[]) null, Boolean.class, (Class) null, 6), new PojoPropertyDescriptor("card_type", (String[]) null, Integer.class, (Class) null, 6)};

    public ShareClickResult_JsonDescriptor() {
        super(ShareClickResult.class, f64435a);
    }

    public final Object constructWith(Object[] objArr) {
        ShareClickResult shareClickResult = new ShareClickResult();
        Object obj = objArr[0];
        if (obj != null) {
            shareClickResult.setContent((String) obj);
        }
        Object obj2 = objArr[1];
        if (obj2 != null) {
            shareClickResult.setLink((String) obj2);
        }
        Object obj3 = objArr[2];
        if (obj3 != null) {
            shareClickResult.setPicture((String) obj3);
        }
        Object obj4 = objArr[3];
        if (obj4 != null) {
            shareClickResult.setTitle((String) obj4);
        }
        Object obj5 = objArr[4];
        if (obj5 != null) {
            shareClickResult.setAudioLink((String) obj5);
        }
        Object obj6 = objArr[5];
        if (obj6 != null) {
            shareClickResult.setShareMode((Integer) obj6);
        }
        Object obj7 = objArr[6];
        if (obj7 != null) {
            shareClickResult.setProgramId((String) obj7);
        }
        Object obj8 = objArr[7];
        if (obj8 != null) {
            shareClickResult.setProgramPath((String) obj8);
        }
        Object obj9 = objArr[8];
        if (obj9 != null) {
            shareClickResult.setHeader((String) obj9);
        }
        Object obj10 = objArr[9];
        if (obj10 != null) {
            shareClickResult.setSchema((String) obj10);
        }
        Object obj11 = objArr[10];
        if (obj11 != null) {
            shareClickResult.setFirstShare((Boolean) obj11);
        }
        Object obj12 = objArr[11];
        if (obj12 != null) {
            shareClickResult.setCardType((Integer) obj12);
        }
        return shareClickResult;
    }

    public final Object get(Object obj, int i7) {
        ShareClickResult shareClickResult = (ShareClickResult) obj;
        switch (i7) {
            case 0:
                return shareClickResult.getContent();
            case 1:
                return shareClickResult.getLink();
            case 2:
                return shareClickResult.getPicture();
            case 3:
                return shareClickResult.getTitle();
            case 4:
                return shareClickResult.getAudioLink();
            case 5:
                return shareClickResult.getShareMode();
            case 6:
                return shareClickResult.getProgramId();
            case 7:
                return shareClickResult.getProgramPath();
            case 8:
                return shareClickResult.getHeader();
            case 9:
                return shareClickResult.getSchema();
            case 10:
                return shareClickResult.isFirstShare();
            case 11:
                return shareClickResult.getCardType();
            default:
                return null;
        }
    }
}
