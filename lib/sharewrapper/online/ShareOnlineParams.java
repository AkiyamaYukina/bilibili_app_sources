package com.bilibili.lib.sharewrapper.online;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/online/ShareOnlineParams.class */
public class ShareOnlineParams {
    public String from;
    public String fromSpmId;
    public String objectExtraFields;
    public String oid;
    public String quickWordChannel;
    public String shareFloat;
    public String shareId;
    public ShareItemHandler shareItemHandler;
    public int shareMode;
    public String shareOrigin;
    public int sharePattern = 0;
    public String sid;
    public boolean singleShareLine;
    public String spmId;
    public String tag;
    public Long tid;
    public String triggerParameter;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/online/ShareOnlineParams$ShareItemHandler.class */
    public interface ShareItemHandler {
        void onPreShare(ShareOnlineParams shareOnlineParams, String str);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/online/ShareOnlineParams$ShareOnlineParamsBuilder.class */
    public static class ShareOnlineParamsBuilder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ShareOnlineParams f64429a = new ShareOnlineParams();

        public ShareOnlineParams build() {
            return this.f64429a;
        }

        public ShareOnlineParamsBuilder from(String str) {
            this.f64429a.from = str;
            return this;
        }

        public ShareOnlineParamsBuilder fromSpmId(String str) {
            this.f64429a.fromSpmId = str;
            return this;
        }

        public ShareOnlineParamsBuilder objectExtraFields(String str) {
            this.f64429a.objectExtraFields = str;
            return this;
        }

        public ShareOnlineParamsBuilder oid(String str) {
            this.f64429a.oid = str;
            return this;
        }

        public ShareOnlineParamsBuilder qickWordChannel(String str) {
            this.f64429a.quickWordChannel = str;
            return this;
        }

        public ShareOnlineParamsBuilder shareFloat(String str) {
            this.f64429a.shareFloat = str;
            return this;
        }

        public ShareOnlineParamsBuilder shareId(String str) {
            this.f64429a.shareId = str;
            return this;
        }

        public ShareOnlineParamsBuilder shareItemHandler(ShareItemHandler shareItemHandler) {
            this.f64429a.shareItemHandler = shareItemHandler;
            return this;
        }

        public ShareOnlineParamsBuilder shareMode(int i7) {
            this.f64429a.shareMode = i7;
            return this;
        }

        public ShareOnlineParamsBuilder shareOrigin(String str) {
            this.f64429a.shareOrigin = str;
            return this;
        }

        public ShareOnlineParamsBuilder sharePattern(int i7) {
            this.f64429a.sharePattern = i7;
            return this;
        }

        public ShareOnlineParamsBuilder sid(String str) {
            this.f64429a.sid = str;
            return this;
        }

        @Deprecated
        public ShareOnlineParamsBuilder singleShareLine(boolean z6) {
            this.f64429a.singleShareLine = z6;
            return this;
        }

        public ShareOnlineParamsBuilder spmId(String str) {
            this.f64429a.spmId = str;
            return this;
        }

        public ShareOnlineParamsBuilder tag(String str) {
            this.f64429a.tag = str;
            return this;
        }

        public ShareOnlineParamsBuilder triggerParameter(String str) {
            this.f64429a.triggerParameter = str;
            return this;
        }
    }

    public ShareOnlineParams() {
    }

    public ShareOnlineParams(int i7, String str, String str2, String str3) {
        this.shareMode = i7;
        this.shareId = str;
        this.shareOrigin = str2;
        this.oid = str3;
    }

    public static ShareOnlineParamsBuilder builder() {
        return new ShareOnlineParamsBuilder();
    }
}
