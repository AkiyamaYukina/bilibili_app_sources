package com.bilibili.relation.utils;

import android.view.View;
import androidx.annotation.Nullable;
import com.bilibili.relation.utils.FollowFlowHelper;
import java.util.HashMap;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/utils/FollowHelperConfig.class */
public class FollowHelperConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public View f86166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f86167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f86168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f86169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f86170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public FollowFlowHelper.FollowFlowCallback f86171f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f86172g;
    public String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f86173i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public HashMap<String, String> f86174j;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/utils/FollowHelperConfig$Builder.class */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f86175a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f86176b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f86177c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f86178d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f86179e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final FollowFlowHelper.FollowFlowCallback f86180f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f86181g;
        public String h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f86182i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public HashMap<String, String> f86183j;

        public Builder(View view, boolean z6, long j7, boolean z7, int i7, FollowFlowHelper.FollowFlowCallback followFlowCallback) {
            this.f86175a = view;
            this.f86176b = z6;
            this.f86177c = j7;
            this.f86178d = z7;
            this.f86179e = i7;
            this.f86180f = followFlowCallback;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.bilibili.relation.utils.FollowHelperConfig, java.lang.Object] */
        public FollowHelperConfig build() {
            View view = this.f86175a;
            ?? obj = new Object();
            obj.f86166a = view;
            obj.f86167b = this.f86176b;
            obj.f86168c = this.f86177c;
            obj.f86169d = this.f86178d;
            obj.f86170e = this.f86179e;
            obj.f86171f = this.f86180f;
            obj.f86172g = this.f86181g;
            obj.h = this.h;
            obj.f86173i = this.f86182i;
            obj.f86174j = this.f86183j;
            return obj;
        }

        public Builder setExtendContent(HashMap<String, String> map) {
            this.f86183j = map;
            return this;
        }

        public Builder setFromScmid(String str) {
            this.f86182i = str;
            return this;
        }

        public Builder setFromSpmid(String str) {
            this.h = str;
            return this;
        }

        public Builder setSpmid(String str) {
            this.f86181g = str;
            return this;
        }
    }
}
