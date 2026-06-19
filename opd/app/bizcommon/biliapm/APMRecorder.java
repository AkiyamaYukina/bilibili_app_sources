package com.bilibili.opd.app.bizcommon.biliapm;

import BG0.a;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.ad.adview.story.c;
import com.bilibili.base.SharedPreferencesHelper;
import com.bilibili.lib.biliid.api.BuvidHelper;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.crashreport.CrashReporter;
import com.bilibili.lib.neuron.model.material.PublicHeader;
import com.bilibili.lib.neuron.util.NeuronRuntimeHelper;
import com.bilibili.opd.app.bizcommon.biliapm.APMRecorder;
import com.bilibili.ship.theseus.united.page.intro.module.kingposition.t;
import com.bilibili.studio.material.util.UtilsKt;
import com.bilibili.xpref.Xpref;
import gm0.InterfaceC7361c;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/biliapm/APMRecorder.class */
public final class APMRecorder {

    @NotNull
    public static final String APM_SWITCH_KEY = "mall_apm_switch";

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final Lazy<APMRecorder> f73464m = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new a(9));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Ad0.a f73465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public PublicHeader f73466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Context f73467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f73468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public String f73469e;
    public volatile boolean h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public ScheduledExecutorService f73473j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f73474k;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Integer f73470f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public Integer f73471g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final ArrayList<Builder> f73472i = new ArrayList<>(20);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Object f73475l = new Object();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/biliapm/APMRecorder$Builder.class */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f73476a = System.currentTimeMillis();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f73477b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public Integer f73478c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public String f73479d = "";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public String f73480e = "";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f73481f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public String f73482g = "";

        @Nullable
        public String h = "";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public String f73483i = "";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        public String f73484j = "";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Nullable
        public String f73485k = "";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @Nullable
        public String f73486l = "";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @Nullable
        public String f73487m = "";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @Nullable
        public String f73488n = "";

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @Nullable
        public Integer f73489o = -1;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @Nullable
        public String f73490p = "";

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        @Nullable
        public String f73491q = "";

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        @Nullable
        public String f73492r = "";

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @Nullable
        public String f73493s = "";

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @Nullable
        public String f73494t = "";

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        @Nullable
        public String f73495u = "";

        public static /* synthetic */ Builder networkStatus$default(Builder builder, int i7, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                i7 = -1;
            }
            return builder.networkStatus(i7);
        }

        public final void a(JSONObject jSONObject) {
            jSONObject.put("local_buvid", BuvidHelper.getLocalBuvid());
            InterfaceC7361c interfaceC7361c = (InterfaceC7361c) c.a(BLRouter.INSTANCE, InterfaceC7361c.class, (String) null, 1, (Object) null);
            jSONObject.put("mallSessionId", interfaceC7361c != null ? interfaceC7361c.a() : "");
            try {
                this.f73493s = URLEncoder.encode(JSON.toJSONString(jSONObject), "UTF-8");
            } catch (Exception e7) {
            }
        }

        @NotNull
        public final Builder bizCode(int i7) {
            this.f73481f = i7;
            return this;
        }

        @NotNull
        public final Builder build() {
            String str = this.f73493s;
            if (str == null || str.length() == 0) {
                a(new JSONObject());
            }
            return this;
        }

        @NotNull
        public final Builder buvId(@Nullable String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f73487m = str;
            }
            return this;
        }

        @NotNull
        public final Builder city(@Nullable String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f73494t = str;
            }
            return this;
        }

        @NotNull
        public final Builder deviceName(@NotNull String str) {
            this.f73485k = str;
            return this;
        }

        @NotNull
        public final Builder duration(@NotNull String str) {
            this.f73483i = str;
            return this;
        }

        @NotNull
        public final Builder extJson(@NotNull String str) {
            JSONObject jSONObject;
            try {
                jSONObject = JSON.parseObject(str);
            } catch (Exception e7) {
                jSONObject = new JSONObject(MapsKt.hashMapOf(new Pair[]{TuplesKt.to("data", str)}));
            }
            JSONObject jSONObject2 = jSONObject;
            if (jSONObject == null) {
                jSONObject2 = new JSONObject();
            }
            a(jSONObject2);
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x01cf  */
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String formatStr() {
            /*
                Method dump skipped, instruction units count: 557
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.biliapm.APMRecorder.Builder.formatStr():java.lang.String");
        }

        public final int getBizCode() {
            return this.f73481f;
        }

        @Nullable
        public final String getBuvId() {
            return this.f73487m;
        }

        @Nullable
        public final String getCity() {
            return this.f73494t;
        }

        @Nullable
        public final String getDeviceName() {
            return this.f73485k;
        }

        @Nullable
        public final String getDuration() {
            return this.f73483i;
        }

        @Nullable
        public final String getExtJson() {
            return this.f73493s;
        }

        public final long getLogTime() {
            return this.f73476a;
        }

        @Nullable
        public final String getMId() {
            return this.f73486l;
        }

        @Nullable
        public final String getNetworkCode() {
            return this.f73480e;
        }

        public final int getNetworkStatus() {
            return this.f73477b;
        }

        @Nullable
        public final String getOid() {
            return this.f73491q;
        }

        @Nullable
        public final String getPid() {
            return this.f73488n;
        }

        @Nullable
        public final Integer getPlatform() {
            return this.f73489o;
        }

        @Nullable
        public final String getProduct() {
            return this.f73495u;
        }

        @Nullable
        public final String getRequestSize() {
            return this.f73482g;
        }

        @Nullable
        public final String getResponseSize() {
            return this.h;
        }

        @NotNull
        public final String getSubEvent() {
            return this.f73479d;
        }

        @Nullable
        public final String getSystemVersion() {
            return this.f73484j;
        }

        @Nullable
        public final String getTraceId() {
            return this.f73492r;
        }

        @Nullable
        public final String getTunnel() {
            return this.f73490p;
        }

        @Nullable
        public final Integer getVersion() {
            return this.f73478c;
        }

        @NotNull
        public final Builder mId(@Nullable String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f73486l = str;
            }
            return this;
        }

        @NotNull
        public final Builder networkCode(@NotNull String str) {
            this.f73480e = str;
            return this;
        }

        @NotNull
        public final Builder networkStatus(int i7) {
            this.f73477b = i7;
            return this;
        }

        @NotNull
        public final Builder oid(@Nullable String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f73491q = str;
            }
            return this;
        }

        @NotNull
        public final Builder pid(@NotNull String str) {
            this.f73488n = str;
            return this;
        }

        @NotNull
        public final Builder platform(@Nullable Integer num) {
            this.f73489o = num;
            return this;
        }

        @NotNull
        public final Builder product(@Nullable String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f73495u = str;
            }
            return this;
        }

        @NotNull
        public final Builder requestSize(@NotNull String str) {
            this.f73482g = str;
            return this;
        }

        @NotNull
        public final Builder responseSize(@NotNull String str) {
            this.h = str;
            return this;
        }

        public final void setBizCode(int i7) {
            this.f73481f = i7;
        }

        public final void setBuvId(@Nullable String str) {
            this.f73487m = str;
        }

        public final void setCity(@Nullable String str) {
            this.f73494t = str;
        }

        public final void setDeviceName(@Nullable String str) {
            this.f73485k = str;
        }

        public final void setDuration(@Nullable String str) {
            this.f73483i = str;
        }

        public final void setLogTime(long j7) {
            this.f73476a = j7;
        }

        public final void setMId(@Nullable String str) {
            this.f73486l = str;
        }

        public final void setNetworkCode(@Nullable String str) {
            this.f73480e = str;
        }

        public final void setNetworkStatus(int i7) {
            this.f73477b = i7;
        }

        public final void setOid(@Nullable String str) {
            this.f73491q = str;
        }

        public final void setPid(@Nullable String str) {
            this.f73488n = str;
        }

        public final void setPlatform(@Nullable Integer num) {
            this.f73489o = num;
        }

        public final void setProduct(@Nullable String str) {
            this.f73495u = str;
        }

        public final void setRequestSize(@Nullable String str) {
            this.f73482g = str;
        }

        public final void setResponseSize(@Nullable String str) {
            this.h = str;
        }

        public final void setSubEvent(@NotNull String str) {
            this.f73479d = str;
        }

        public final void setSystemVersion(@Nullable String str) {
            this.f73484j = str;
        }

        public final void setTraceId(@Nullable String str) {
            this.f73492r = str;
        }

        public final void setTunnel(@Nullable String str) {
            this.f73490p = str;
        }

        public final void setVersion(@Nullable Integer num) {
            this.f73478c = num;
        }

        @NotNull
        public final Builder subEvent(@NotNull String str) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    this.f73479d = URLEncoder.encode(str, "UTF-8");
                } catch (Exception e7) {
                }
            }
            return this;
        }

        @NotNull
        public final Builder systemVersion(@Nullable String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f73484j = str;
            }
            return this;
        }

        @NotNull
        public final Builder traceId(@Nullable String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f73492r = str;
            }
            return this;
        }

        @NotNull
        public final Builder tunnel(@NotNull String str) {
            this.f73490p = str;
            return this;
        }

        @NotNull
        public final Builder version(@Nullable Integer num) {
            this.f73478c = num;
            return this;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/biliapm/APMRecorder$Companion.class */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final APMRecorder getInstance() {
            return (APMRecorder) APMRecorder.f73464m.getValue();
        }
    }

    public final void a(Builder builder) {
        PublicHeader publicHeader = this.f73466b;
        Integer numValueOf = publicHeader != null ? Integer.valueOf(publicHeader.c) : null;
        PublicHeader publicHeader2 = this.f73466b;
        String str = publicHeader2 != null ? publicHeader2.b : null;
        String strL = str != null ? StringsKt.L(str, UtilsKt.DOT, "") : null;
        if (strL != null) {
            try {
                numValueOf = Integer.valueOf(Integer.parseInt(strL));
            } catch (NumberFormatException e7) {
            }
        } else {
            numValueOf = null;
        }
        Builder builderVersion = builder.version(numValueOf);
        Ad0.a aVar = this.f73465a;
        Builder builderBuvId = builderVersion.buvId(aVar != null ? aVar.i : null);
        PublicHeader publicHeader3 = this.f73466b;
        Builder builderMId = builderBuvId.mId(publicHeader3 != null ? publicHeader3.a : null);
        Ad0.a aVar2 = this.f73465a;
        Builder builderPid = builderMId.pid(String.valueOf(aVar2 != null ? Integer.valueOf(aVar2.b) : null));
        Ad0.a aVar3 = this.f73465a;
        Builder builderSystemVersion = builderPid.systemVersion(aVar3 != null ? aVar3.g : null);
        Ad0.a aVar4 = this.f73465a;
        Builder builderPlatform = builderSystemVersion.platform(aVar4 != null ? Integer.valueOf(aVar4.c) : null);
        Ad0.a aVar5 = this.f73465a;
        Builder builderCity = builderPlatform.deviceName((aVar5 != null ? aVar5.e : null) + " " + (aVar5 != null ? aVar5.f : null)).city(null);
        PublicHeader publicHeader4 = this.f73466b;
        String str2 = null;
        if (publicHeader4 != null) {
            str2 = publicHeader4.e;
        }
        builderCity.oid(str2).networkStatus(Bn0.a.a(this.f73467c));
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0155 A[Catch: Exception -> 0x0170, PHI: r6
  0x0155: PHI (r6v9 java.io.InputStream) = (r6v8 java.io.InputStream), (r6v10 java.io.InputStream) binds: [B:44:0x0152, B:50:0x0165] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0170, blocks: (B:31:0x0120, B:33:0x012a, B:42:0x014d, B:45:0x0155, B:48:0x0160), top: B:57:0x0099 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.String r6) throws java.net.ProtocolException {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.biliapm.APMRecorder.b(java.lang.String):void");
    }

    @WorkerThread
    public final void c() {
        synchronized (this.f73475l) {
            try {
            } catch (Exception e7) {
                CrashReporter.INSTANCE.postCaughtException(e7);
            }
            if (this.f73472i.size() > 0) {
                StringBuilder sb = new StringBuilder();
                if (!this.f73468d) {
                    d();
                }
                for (Builder builder : this.f73472i) {
                    a(builder);
                    String str = builder.formatStr();
                    if (!TextUtils.isEmpty(str)) {
                        StringsKt.j(sb, new String[]{str, "\n"});
                    }
                }
                b(sb.toString());
                this.f73472i.clear();
                this.h = false;
                Unit unit = Unit.INSTANCE;
            } else {
                Unit unit2 = Unit.INSTANCE;
            }
        }
    }

    public final void d() {
        Context context = this.f73467c;
        if (context != null) {
            this.f73469e = Xpref.getSharedPreferences(context, "bili_apm_preferences").getString("apm_config", null);
        }
        e();
        this.f73465a = NeuronRuntimeHelper.getInstance().getPublicStaticHeader();
        this.f73466b = NeuronRuntimeHelper.getInstance().getPublicHeader();
        this.f73468d = true;
    }

    public final void e() {
        JSONObject jSONObject;
        String str = this.f73469e;
        if (str == null || (jSONObject = (JSONObject) JSON.parse(str)) == null) {
            return;
        }
        Integer num = (Integer) jSONObject.get("version");
        this.f73470f = num;
        if (num == null) {
            this.f73470f = 0;
        }
    }

    public final void f(String str) {
        String string = ((JSONObject) JSON.parse(str)).getString("data");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.f73469e = string;
        e();
        Context context = this.f73467c;
        if (context != null) {
            Xpref.getSharedPreferences(context, "bili_apm_preferences").edit().putString("apm_config", string).apply();
        }
    }

    public final void flush() {
        MallTaskRunner.getInstance().submit(new t(this, 1));
    }

    public final void g() {
        Context context = this.f73467c;
        if (context != null) {
            this.f73471g = Integer.valueOf(new SharedPreferencesHelper(context, "bilibili.mall.share.preference").optInteger(APM_SWITCH_KEY, 1));
        }
        Integer num = this.f73471g;
        if (num == null || num.intValue() != 1) {
            this.f73474k = true;
            return;
        }
        if (this.f73473j == null) {
            this.f73473j = Executors.newScheduledThreadPool(1);
        }
        this.f73474k = true;
    }

    public final void init(@NotNull Context context) {
        this.f73467c = context;
    }

    public final void record(@NotNull final Builder builder) {
        synchronized (this) {
            if (!this.f73474k) {
                g();
            }
            if (this.f73471g.intValue() != 1) {
                return;
            }
            MallTaskRunner.getInstance().submit(new Runnable(this, builder) { // from class: gm0.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final APMRecorder f120483a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final APMRecorder.Builder f120484b;

                {
                    this.f120483a = this;
                    this.f120484b = builder;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    final APMRecorder aPMRecorder = this.f120483a;
                    APMRecorder.Builder builder2 = this.f120484b;
                    synchronized (aPMRecorder.f73475l) {
                        aPMRecorder.f73472i.add(builder2);
                        if (!aPMRecorder.h) {
                            aPMRecorder.h = true;
                            ScheduledExecutorService scheduledExecutorService = aPMRecorder.f73473j;
                            if (scheduledExecutorService != null) {
                                scheduledExecutorService.schedule(new Runnable(aPMRecorder) { // from class: gm0.b

                                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                                    public final APMRecorder f120485a;

                                    {
                                        this.f120485a = aPMRecorder;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        APMRecorder aPMRecorder2 = this.f120485a;
                                        APMRecorder.Companion companion = APMRecorder.Companion;
                                        aPMRecorder2.c();
                                    }
                                }, 15L, TimeUnit.SECONDS);
                            }
                        }
                        if (aPMRecorder.f73472i.size() >= 15) {
                            aPMRecorder.h = true;
                            aPMRecorder.c();
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                }
            });
        }
    }

    public final void recycle() {
        ScheduledExecutorService scheduledExecutorService;
        ScheduledExecutorService scheduledExecutorService2 = this.f73473j;
        if (scheduledExecutorService2 == null || !scheduledExecutorService2.isShutdown() || (scheduledExecutorService = this.f73473j) == null) {
            return;
        }
        scheduledExecutorService.shutdown();
    }
}
