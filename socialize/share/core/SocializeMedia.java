package com.bilibili.socialize.share.core;

import com.tencent.connect.common.Constants;
import java.util.HashSet;
import java.util.Set;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.bilibili.socialize.share.core.SocializeMedia, still in use, count: 1, list:
  (r0v0 com.bilibili.socialize.share.core.SocializeMedia) from 0x00fe: INVOKE (r0v20 java.util.HashSet), (r0v0 com.bilibili.socialize.share.core.SocializeMedia) INTERFACE call: java.util.Set.add(java.lang.Object):boolean A[MD:(E):boolean (c)]
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
	at java.base/java.util.ArrayList.forEach(Unknown Source)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/SocializeMedia.class */
public final class SocializeMedia {
    LINE("line"),
    FACEBOOK("facebook"),
    MESSENGER("messenger"),
    WHATSAPP("whatsapp"),
    TWITTER(com.bilibili.lib.sharewrapper.SocializeMedia.TWITTER),
    GENERIC("generic"),
    SINA("sina"),
    QZONE(Constants.SOURCE_QZONE),
    QQ("qq"),
    WEIXIN("weixin"),
    WEIXIN_MONMENT("weixin_moment"),
    HUAWEI("huawei"),
    COPY("copy"),
    MARK_POINT("mark_point");

    private static final Set<SocializeMedia> INTL_MEDIA;
    private final String mName;

    static {
        HashSet hashSet = new HashSet();
        INTL_MEDIA = hashSet;
        hashSet.add(new SocializeMedia("line"));
        hashSet.add(new SocializeMedia("facebook"));
        hashSet.add(new SocializeMedia("messenger"));
        hashSet.add(new SocializeMedia("whatsapp"));
        hashSet.add(new SocializeMedia(com.bilibili.lib.sharewrapper.SocializeMedia.TWITTER));
    }

    private SocializeMedia(String str) {
        this.mName = str;
    }

    public static Boolean isIntlMedia(SocializeMedia socializeMedia) {
        return Boolean.valueOf(INTL_MEDIA.contains(socializeMedia));
    }

    public static SocializeMedia valueOf(String str) {
        return (SocializeMedia) Enum.valueOf(SocializeMedia.class, str);
    }

    public static SocializeMedia[] values() {
        return (SocializeMedia[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.mName;
    }
}
