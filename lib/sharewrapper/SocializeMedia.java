package com.bilibili.lib.sharewrapper;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/SocializeMedia.class */
public final class SocializeMedia {
    public static final String BIHUO = "FIRE";
    public static final String BILI_DYNAMIC = "biliDynamic";
    public static final String BILI_IM = "biliIm";
    public static final String BILI_LIVE = "LIVE";
    public static final String COPY = "COPY";
    public static final String FACE = "FACE";
    public static final String FACEBOOK = "FACEBOOK";
    public static final String GENERIC = "GENERIC";
    public static final String HUAWEI = "HUAWEI";
    public static final String LINE = "LINE";
    public static final String MARK_POINT = "MARK_POINT";
    public static final String MENU_ID_SYS_DOWNLOAD = "SYS_DOWNLOAD";
    public static final String Messenger = "MESSENGER";
    public static final String PIC = "PIC";
    public static final String QQ = "QQ";
    public static final String QUICKWORD_CHANNEL = "QUICKWORD_CHANNERL";
    public static final String QUICKWORD_COPY = "QUICKWORD_COPY";
    public static final String QUICKWORD_QQ = "QUICKWORD_QQ";
    public static final String QUICKWORD_QZONE = "QUICKWORD_QZONE";
    public static final String QUICKWORD_SHARE = "QUICKWORD_SHARE";
    public static final String QUICKWORD_SINA = "QUICKWORD_SINA";
    public static final String QUICKWORD_WEIXIN = "QUICKWORD_WEIXIN";
    public static final String QUICKWORD_WEIXIN_MOMENT = "QUICKWORD_WEIXIN_MOMENT";
    public static final String QZONE = "QZONE";
    public static final String SINA = "SINA";
    public static final String TWITTER = "TWITTER";
    public static final String WEIXIN = "WEIXIN";
    public static final String WEIXIN_MONMENT = "WEIXIN_MONMENT";
    public static final String WHATSAPP = "WHATSAPP";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set<String> f64415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set<String> f64416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set<String> f64417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set<String> f64418d;

    static {
        HashSet hashSet = new HashSet();
        f64415a = hashSet;
        HashSet hashSet2 = new HashSet();
        f64416b = hashSet2;
        HashSet hashSet3 = new HashSet();
        f64417c = hashSet3;
        HashSet hashSet4 = new HashSet();
        f64418d = hashSet4;
        hashSet.add(SINA);
        hashSet.add(WEIXIN);
        hashSet.add(WEIXIN_MONMENT);
        hashSet.add("QQ");
        hashSet.add(QZONE);
        hashSet.add(HUAWEI);
        hashSet.add(GENERIC);
        hashSet.add(COPY);
        hashSet.add(MARK_POINT);
        hashSet.add(FACEBOOK);
        hashSet.add(LINE);
        hashSet.add(WHATSAPP);
        hashSet.add(TWITTER);
        hashSet.add(Messenger);
        hashSet2.add(BILI_DYNAMIC);
        hashSet2.add(BILI_IM);
        hashSet2.add(BILI_LIVE);
        hashSet3.add(BIHUO);
        hashSet4.add(QUICKWORD_COPY);
        hashSet4.add(QUICKWORD_SHARE);
        hashSet4.add(QUICKWORD_CHANNEL);
        hashSet4.add(QUICKWORD_WEIXIN);
        hashSet4.add(QUICKWORD_WEIXIN_MOMENT);
        hashSet4.add(QUICKWORD_QQ);
        hashSet4.add(QUICKWORD_QZONE);
        hashSet4.add(QUICKWORD_SINA);
    }

    public static boolean isBiliBusiness(String str) {
        return ((HashSet) f64417c).contains(str);
    }

    public static boolean isBiliMedia(String str) {
        return ((HashSet) f64416b).contains(str);
    }

    public static boolean isDynamic(String str) {
        return TextUtils.equals(BILI_DYNAMIC, str);
    }

    public static boolean isFace(String str) {
        return TextUtils.equals(FACE, str);
    }

    public static boolean isIm(String str) {
        return TextUtils.equals(BILI_IM, str);
    }

    public static boolean isLive(String str) {
        return TextUtils.equals(BILI_LIVE, str);
    }

    public static boolean isQuickWord(String str) {
        return ((HashSet) f64418d).contains(str);
    }

    public static boolean isThirdParty(String str) {
        return ((HashSet) f64415a).contains(str);
    }
}
