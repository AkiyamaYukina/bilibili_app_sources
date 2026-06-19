package com.bilibili.lib.push;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bilibili.lib.push.BPushFoundation;
import com.bilibili.lib.push.BPushKeys;
import com.bilibili.lib.push.BPushLog;
import com.bilibili.lib.push.BPushNeurons;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/BPushConfig.class */
public class BPushConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final BPushKeys.MiKeys f64163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final BPushKeys.HwKeys f64164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final BPushKeys.JPushKeys f64165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final BPushKeys.OppoPushKeys f64166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BPushKeys.VivoPushKeys f64167e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final BPushKeys.HonorPushKeys f64168f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final IPushParams f64169g;

    @Nullable
    public final IPushSwitchStrategy h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @DrawableRes
    public final int f64170i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f64171j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f64172k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final v f64173l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final HashMap<Integer, PushNotification> f64174m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public final String f64175n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public final String f64176o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f64177p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f64178q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NonNull
    public final ScheduledExecutorService f64179r;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/BPushConfig$Builder.class */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BPushKeys.MiKeys f64180a = new BPushKeys.MiKeys();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BPushKeys.HwKeys f64181b = new BPushKeys.HwKeys();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final BPushKeys.JPushKeys f64182c = new BPushKeys.JPushKeys();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final BPushKeys.OppoPushKeys f64183d = new BPushKeys.OppoPushKeys();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final BPushKeys.VivoPushKeys f64184e = new BPushKeys.VivoPushKeys();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final BPushKeys.HonorPushKeys f64185f = new BPushKeys.HonorPushKeys();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ScheduledExecutorService f64186g;
        public v h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final HashMap<Integer, PushNotification> f64187i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NonNull
        public final IPushParams f64188j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Nullable
        public IPushSwitchStrategy f64189k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f64190l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @DrawableRes
        public int f64191m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public BPushLog.Delegate f64192n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public BPushNeurons.Delegate f64193o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public BPushFoundation.Delegate f64194p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        @Nullable
        public String f64195q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        @Nullable
        public String f64196r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f64197s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public String f64198t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public String f64199u;

        /* JADX WARN: Type inference failed for: r0v7, types: [Ue0.d, java.lang.Object, java.util.concurrent.ThreadFactory] */
        /* JADX WARN: Type inference failed for: r1v11, types: [com.bilibili.lib.push.v, java.lang.Object] */
        public Builder(@NonNull IPushParams iPushParams) {
            ?? obj = new Object();
            obj.f24711a = Thread.currentThread().getThreadGroup();
            this.f64186g = Executors.newSingleThreadScheduledExecutor(obj);
            this.h = new Object();
            this.f64187i = new HashMap<>();
            this.f64189k = (IPushSwitchStrategy) Utils.constructNewInstance("com.bilibili.lib.push.DefaultStrategyImp");
            this.f64190l = false;
            this.f64188j = iPushParams;
        }

        public BPushConfig build() {
            BPushLog.setLogDelegate(this.f64192n);
            BPushNeurons.setNeuronsDelegate(this.f64193o);
            BPushFoundation.setFoundationDelegate(this.f64194p);
            return new BPushConfig(this);
        }

        public Builder enableDowngrade(boolean z6) {
            this.f64197s = z6;
            return this;
        }

        public Builder setApkChannel(String str) {
            this.f64199u = str;
            return this;
        }

        public Builder setDebuggable(boolean z6) {
            this.f64190l = z6;
            return this;
        }

        public void setExecutors(ScheduledExecutorService scheduledExecutorService) {
            this.f64186g = scheduledExecutorService;
        }

        public Builder setFoundationDelegate(@Nullable BPushFoundation.Delegate delegate) {
            this.f64194p = delegate;
            return this;
        }

        public Builder setLogDelegate(@Nullable BPushLog.Delegate delegate) {
            this.f64192n = delegate;
            return this;
        }

        public Builder setNeuronsDelegate(@Nullable BPushNeurons.Delegate delegate) {
            this.f64193o = delegate;
            return this;
        }

        public Builder setNotificationBuilder(v vVar) {
            this.h = vVar;
            return this;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [com.bilibili.lib.push.e, java.lang.Object] */
        public Builder setNotificationChannels(List<PushNotification> list) {
            if (list != null && list.size() != 0) {
                this.f64187i.putAll(CollectionsKt.g(list, (C5337e) new Object()));
            }
            return this;
        }

        public Builder setNotificationDefaultChannelInfo(@NonNull String str, @NonNull String str2) {
            this.f64195q = str;
            this.f64196r = str2;
            return this;
        }

        public Builder setNotificationIconResId(@DrawableRes int i7) {
            this.f64191m = i7;
            return this;
        }

        public Builder setPushSwitchStrategy(@NonNull IPushSwitchStrategy iPushSwitchStrategy) {
            this.f64189k = iPushSwitchStrategy;
            return this;
        }

        public Builder setStartActivityName(String str) {
            this.f64198t = str;
            return this;
        }
    }

    public BPushConfig(Builder builder) {
        this.f64163a = builder.f64180a;
        this.f64164b = builder.f64181b;
        this.f64165c = builder.f64182c;
        this.f64166d = builder.f64183d;
        this.f64167e = builder.f64184e;
        this.f64168f = builder.f64185f;
        this.h = builder.f64189k;
        this.f64169g = builder.f64188j;
        this.f64170i = builder.f64191m;
        this.f64171j = builder.f64190l;
        this.f64172k = builder.f64198t;
        this.f64175n = builder.f64195q;
        this.f64176o = builder.f64196r;
        this.f64177p = builder.f64197s;
        this.f64179r = builder.f64186g;
        this.f64173l = builder.h;
        this.f64174m = builder.f64187i;
        this.f64178q = builder.f64199u;
    }

    public boolean enableDowngrade() {
        return this.f64177p;
    }

    public String getApkChannel() {
        return this.f64178q;
    }

    public v getBuilder() {
        return this.f64173l;
    }

    public ScheduledExecutorService getExecutor() {
        return this.f64179r;
    }

    @Nullable
    public String getNotificationChannelDescription() {
        return this.f64176o;
    }

    @Nullable
    public String getNotificationChannelName() {
        return this.f64175n;
    }

    public int getNotificationIconResId() {
        return this.f64170i;
    }

    @NonNull
    public BPushKeys.HonorPushKeys getPushHonorKeys() {
        return this.f64168f;
    }

    @NonNull
    public BPushKeys.HwKeys getPushHwKeys() {
        return this.f64164b;
    }

    @NonNull
    public BPushKeys.JPushKeys getPushJKeys() {
        return this.f64165c;
    }

    @NonNull
    public BPushKeys.MiKeys getPushMiKeys() {
        return this.f64163a;
    }

    @Nullable
    public PushNotification getPushNotification(int i7) {
        return this.f64174m.get(Integer.valueOf(i7));
    }

    @NonNull
    public BPushKeys.OppoPushKeys getPushOppoKeys() {
        return this.f64166d;
    }

    @NonNull
    public IPushParams getPushParams() {
        return this.f64169g;
    }

    @Nullable
    public IPushSwitchStrategy getPushSwitchStrategy() {
        return this.h;
    }

    @NonNull
    public BPushKeys.VivoPushKeys getPushVivoKeys() {
        return this.f64167e;
    }

    public String getStartActivityName() {
        return this.f64172k;
    }

    public boolean isDebug() {
        return this.f64171j;
    }
}
