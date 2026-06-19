package com.bilibili.opd.app.sentinel;

import android.util.SparseIntArray;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/sentinel/CollectConfig.class */
public class CollectConfig {
    public static CollectConfig DEFAULT;
    public int mErrorBacktraceCount;
    public SparseIntArray mSampling;
    public List<String> mWhiteBuvids;
    public List<String> mWhiteMids;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/sentinel/CollectConfig$Builder.class */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<String> f74677a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<String> f74678b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f74679c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public SparseIntArray f74680d;

        public CollectConfig build() {
            return new CollectConfig(this.f74678b, this.f74677a, this.f74679c, this.f74680d);
        }

        public Builder errorBacktraceCount(int i7) {
            this.f74679c = i7;
            return this;
        }

        public Builder sampling(SparseIntArray sparseIntArray) {
            this.f74680d = sparseIntArray;
            return this;
        }

        public Builder whiteList(List<String> list, List<String> list2) {
            this.f74677a = list;
            this.f74678b = list2;
            return this;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(16, 20);
        sparseIntArray.put(8, 100);
        sparseIntArray.put(2, 20);
        sparseIntArray.put(4, 20);
        sparseIntArray.put(1, 20);
        DEFAULT = new CollectConfig(null, null, 5, sparseIntArray);
    }

    public CollectConfig(List<String> list, List<String> list2, int i7, SparseIntArray sparseIntArray) {
        this.mWhiteMids = list2;
        this.mWhiteBuvids = list;
        this.mErrorBacktraceCount = i7;
        this.mSampling = sparseIntArray;
    }

    public static Builder builder() {
        return new Builder();
    }
}
