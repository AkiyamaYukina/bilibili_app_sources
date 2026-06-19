package com.bilibili.ogvcommon.play.resolver;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.lib.media.resolver.exception.ResolveException;
import com.bilibili.lib.media.resource.ExtraInfo;
import com.bilibili.lib.media.resource.MediaResource;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.videoplayer.core.log.PlayerLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/resolver/OgvFlashMediaResourceResolveInterceptor.class */
@StabilityInferred(parameters = 1)
public final class OgvFlashMediaResourceResolveInterceptor implements qb0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f73216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f73217b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/resolver/OgvFlashMediaResourceResolveInterceptor$QualityInfo.class */
    @Keep
    public static final class QualityInfo {

        @JSONField(name = "attribute")
        private int attribute;

        @JSONField(name = "new_description")
        @Nullable
        private String description;

        @JSONField(name = "format")
        @Nullable
        private String format;

        @JSONField(name = "need_login")
        private boolean needLogin;

        @JSONField(name = "need_vip")
        private boolean needVip;

        @JSONField(name = "display_desc")
        @Nullable
        private String pithyDescription;

        @JSONField(name = "quality")
        private int quality;

        @JSONField(name = "superscript")
        @Nullable
        private String superscript;

        public final int getAttribute() {
            return this.attribute;
        }

        @Nullable
        public final String getDescription() {
            return this.description;
        }

        @Nullable
        public final String getFormat() {
            return this.format;
        }

        public final boolean getNeedLogin() {
            return this.needLogin;
        }

        public final boolean getNeedVip() {
            return this.needVip;
        }

        @Nullable
        public final String getPithyDescription() {
            return this.pithyDescription;
        }

        public final int getQuality() {
            return this.quality;
        }

        @Nullable
        public final String getSuperscript() {
            return this.superscript;
        }

        public final boolean isHdr() {
            return (this.attribute & 3) != 0;
        }

        public final void setAttribute(int i7) {
            this.attribute = i7;
        }

        public final void setDescription(@Nullable String str) {
            this.description = str;
        }

        public final void setFormat(@Nullable String str) {
            this.format = str;
        }

        public final void setNeedLogin(boolean z6) {
            this.needLogin = z6;
        }

        public final void setNeedVip(boolean z6) {
            this.needVip = z6;
        }

        public final void setPithyDescription(@Nullable String str) {
            this.pithyDescription = str;
        }

        public final void setQuality(int i7) {
            this.quality = i7;
        }

        public final void setSuperscript(@Nullable String str) {
            this.superscript = str;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/resolver/OgvFlashMediaResourceResolveInterceptor$a.class */
    public static final class a {
        /* JADX WARN: Removed duplicated region for block: B:101:0x0341  */
        /* JADX WARN: Removed duplicated region for block: B:102:0x0346  */
        /* JADX WARN: Removed duplicated region for block: B:107:0x035e  */
        /* JADX WARN: Removed duplicated region for block: B:129:0x0401  */
        /* JADX WARN: Removed duplicated region for block: B:155:0x058d  */
        /* JADX WARN: Removed duplicated region for block: B:156:0x059c  */
        /* JADX WARN: Removed duplicated region for block: B:159:0x05a8  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x025c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final com.bilibili.lib.media.resource.MediaResource a(int r7, java.lang.String r8) {
            /*
                Method dump skipped, instruction units count: 1654
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogvcommon.play.resolver.OgvFlashMediaResourceResolveInterceptor.a.a(int, java.lang.String):com.bilibili.lib.media.resource.MediaResource");
        }
    }

    public OgvFlashMediaResourceResolveInterceptor(int i7, @Nullable String str) {
        this.f73216a = i7;
        this.f73217b = str;
    }

    @Nullable
    public final MediaResource a(@Nullable rb0.a aVar) throws InterruptedException, ResolveException {
        int i7 = this.f73216a;
        String str = this.f73217b;
        MediaResource mediaResourceA = null;
        if (str != null) {
            if (str.length() == 0) {
                mediaResourceA = null;
            } else {
                try {
                    mediaResourceA = a.a(i7, str);
                } catch (Exception e7) {
                    PlayerLog.e("Resolve", "error when parse flash media resource", e7);
                    mediaResourceA = null;
                }
                if (mediaResourceA == null || !mediaResourceA.isPlayable()) {
                    PlayerLog.i("Resolve", "flash video not available");
                    mediaResourceA = null;
                } else {
                    PlayerLog.i("Resolve", "flash video hit");
                    mediaResourceA.sourceForm(1);
                    mediaResourceA.setExtraInfo(new ExtraInfo());
                }
            }
        }
        MediaResource mediaResourceA2 = mediaResourceA;
        if (mediaResourceA == null) {
            mediaResourceA2 = aVar.a();
        }
        return mediaResourceA2;
    }
}
