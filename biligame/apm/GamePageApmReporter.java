package com.bilibili.biligame.apm;

import androidx.annotation.CallSuper;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.api.base.Config;
import com.bilibili.biligame.report3.ReporterV3;
import com.bilibili.biligame.utils.ABTestUtil;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/apm/GamePageApmReporter.class */
@StabilityInferred(parameters = 0)
public class GamePageApmReporter {
    public static final int $stable = 8;

    @NotNull
    public static final a Companion = new Object();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f62189A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f62190B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f62191C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f62192D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f62193E = new LinkedHashMap();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public long f62194F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f62195G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @NotNull
    public String f62196H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f62197I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f62198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f62199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f62200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f62201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f62202e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f62203f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f62204g;
    public long h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f62205i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f62206j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f62207k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f62208l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f62209m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f62210n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f62211o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f62212p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f62213q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f62214r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f62215s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f62216t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f62217u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f62218v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f62219w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f62220x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f62221y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f62222z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/apm/GamePageApmReporter$Event.class */
    public static final class Event {
        private static final EnumEntries $ENTRIES;
        private static final Event[] $VALUES;
        public static final Event ON_PRE_CREATE = new Event("ON_PRE_CREATE", 0);
        public static final Event ON_POST_CREATE = new Event("ON_POST_CREATE", 1);
        public static final Event ON_PRE_CREATE_VIEW = new Event("ON_PRE_CREATE_VIEW", 2);
        public static final Event ON_POST_CREATE_VIEW = new Event("ON_POST_CREATE_VIEW", 3);
        public static final Event ON_PRE_VIEW_CREATE = new Event("ON_PRE_VIEW_CREATE", 4);
        public static final Event ON_POST_VIEW_CREATE = new Event("ON_POST_VIEW_CREATE", 5);
        public static final Event ON_PRE_ACTIVITY_CREATE = new Event("ON_PRE_ACTIVITY_CREATE", 6);
        public static final Event ON_POST_ACTIVITY_CREATE = new Event("ON_POST_ACTIVITY_CREATE", 7);
        public static final Event ON_PRE_START = new Event("ON_PRE_START", 8);
        public static final Event ON_POST_START = new Event("ON_POST_START", 9);
        public static final Event ON_PRE_RESUME = new Event("ON_PRE_RESUME", 10);
        public static final Event ON_POST_RESUME = new Event("ON_POST_RESUME", 11);
        public static final Event ON_PRE_INFLATE = new Event("ON_PRE_INFLATE", 12);
        public static final Event ON_POST_INFLATE = new Event("ON_POST_INFLATE", 13);
        public static final Event ON_PRE_BIND_VIEW = new Event("ON_PRE_BIND_VIEW", 14);
        public static final Event ON_POST_BIND_VIEW = new Event("ON_POST_BIND_VIEW", 15);
        public static final Event ON_PRE_LOAD = new Event("ON_PRE_LOAD", 16);
        public static final Event ON_POST_LOAD = new Event("ON_POST_LOAD", 17);
        public static final Event ON_PRE_RENDER = new Event("ON_PRE_RENDER", 18);
        public static final Event ON_POST_RENDER = new Event("ON_POST_RENDER", 19);

        private static final /* synthetic */ Event[] $values() {
            return new Event[]{ON_PRE_CREATE, ON_POST_CREATE, ON_PRE_CREATE_VIEW, ON_POST_CREATE_VIEW, ON_PRE_VIEW_CREATE, ON_POST_VIEW_CREATE, ON_PRE_ACTIVITY_CREATE, ON_POST_ACTIVITY_CREATE, ON_PRE_START, ON_POST_START, ON_PRE_RESUME, ON_POST_RESUME, ON_PRE_INFLATE, ON_POST_INFLATE, ON_PRE_BIND_VIEW, ON_POST_BIND_VIEW, ON_PRE_LOAD, ON_POST_LOAD, ON_PRE_RENDER, ON_POST_RENDER};
        }

        static {
            Event[] eventArr$values = $values();
            $VALUES = eventArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(eventArr$values);
        }

        private Event(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<Event> getEntries() {
            return $ENTRIES;
        }

        public static Event valueOf(String str) {
            return (Event) Enum.valueOf(Event.class, str);
        }

        public static Event[] values() {
            return (Event[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/apm/GamePageApmReporter$a.class */
    public static final class a {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/apm/GamePageApmReporter$b.class */
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f62223a;

        static {
            int[] iArr = new int[Event.values().length];
            try {
                iArr[Event.ON_PRE_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[Event.ON_POST_CREATE.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[Event.ON_PRE_CREATE_VIEW.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[Event.ON_POST_CREATE_VIEW.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[Event.ON_PRE_VIEW_CREATE.ordinal()] = 5;
            } catch (NoSuchFieldError e11) {
            }
            try {
                iArr[Event.ON_POST_VIEW_CREATE.ordinal()] = 6;
            } catch (NoSuchFieldError e12) {
            }
            try {
                iArr[Event.ON_PRE_ACTIVITY_CREATE.ordinal()] = 7;
            } catch (NoSuchFieldError e13) {
            }
            try {
                iArr[Event.ON_POST_ACTIVITY_CREATE.ordinal()] = 8;
            } catch (NoSuchFieldError e14) {
            }
            try {
                iArr[Event.ON_PRE_START.ordinal()] = 9;
            } catch (NoSuchFieldError e15) {
            }
            try {
                iArr[Event.ON_POST_START.ordinal()] = 10;
            } catch (NoSuchFieldError e16) {
            }
            try {
                iArr[Event.ON_PRE_RESUME.ordinal()] = 11;
            } catch (NoSuchFieldError e17) {
            }
            try {
                iArr[Event.ON_POST_RESUME.ordinal()] = 12;
            } catch (NoSuchFieldError e18) {
            }
            try {
                iArr[Event.ON_PRE_INFLATE.ordinal()] = 13;
            } catch (NoSuchFieldError e19) {
            }
            try {
                iArr[Event.ON_POST_INFLATE.ordinal()] = 14;
            } catch (NoSuchFieldError e20) {
            }
            try {
                iArr[Event.ON_PRE_BIND_VIEW.ordinal()] = 15;
            } catch (NoSuchFieldError e21) {
            }
            try {
                iArr[Event.ON_POST_BIND_VIEW.ordinal()] = 16;
            } catch (NoSuchFieldError e22) {
            }
            try {
                iArr[Event.ON_PRE_LOAD.ordinal()] = 17;
            } catch (NoSuchFieldError e23) {
            }
            try {
                iArr[Event.ON_POST_LOAD.ordinal()] = 18;
            } catch (NoSuchFieldError e24) {
            }
            try {
                iArr[Event.ON_PRE_RENDER.ordinal()] = 19;
            } catch (NoSuchFieldError e25) {
            }
            try {
                iArr[Event.ON_POST_RENDER.ordinal()] = 20;
            } catch (NoSuchFieldError e26) {
            }
            f62223a = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public GamePageApmReporter(@org.jetbrains.annotations.NotNull java.lang.String r5) {
        /*
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            r1 = r5
            r0.f62198a = r1
            r0 = r4
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r2 = r1
            r2.<init>()
            r0.f62193E = r1
            r0 = r5
            com.bilibili.biligame.report3.PageInfoProtocol$StaticPageIno r0 = com.bilibili.biligame.report3.PageInfoProtocol.getPageInfo(r0)
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L28
            r0 = r6
            java.lang.String r0 = r0.getPageId()
            r7 = r0
            r0 = r7
            r6 = r0
            r0 = r7
            if (r0 != 0) goto L50
        L28:
            java.util.Map r0 = com.bilibili.biligame.report.ReportConfig.b
            java.util.HashMap r0 = (java.util.HashMap) r0
            r1 = r5
            java.lang.Object r0 = r0.get(r1)
            fq.c r0 = (fq.c) r0
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L42
            r0 = r5
            java.lang.String r0 = r0.d
            r5 = r0
        L3f:
            goto L47
        L42:
            r0 = 0
            r5 = r0
            goto L3f
        L47:
            r0 = r5
            r6 = r0
            r0 = r5
            if (r0 != 0) goto L50
            java.lang.String r0 = ""
            r6 = r0
        L50:
            r0 = r4
            r1 = r6
            r0.f62196H = r1
            r0 = r4
            r1 = 1
            r0.f62197I = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.biligame.apm.GamePageApmReporter.<init>(java.lang.String):void");
    }

    public static void a() {
        if (Config.isDebuggable()) {
            System.currentTimeMillis();
        }
    }

    public final void cancel() {
        reset();
        this.f62192D = true;
    }

    public void fillCustomReportExtend() {
    }

    public final boolean getLazyLoad() {
        return this.f62195G;
    }

    @NotNull
    public final String getPageName() {
        return this.f62198a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @CallSuper
    public void onEvent(@NotNull Event event) throws NoWhenBranchMatchedException {
        if (this.f62197I && ABTestUtil.INSTANCE.isPageAPMEnable()) {
            switch (b.f62223a[event.ordinal()]) {
                case 1:
                    reset();
                    this.f62199b = System.currentTimeMillis();
                    a();
                    return;
                case 2:
                    this.f62200c = System.currentTimeMillis() - this.f62199b;
                    a();
                    return;
                case 3:
                    this.f62201d = System.currentTimeMillis();
                    a();
                    return;
                case 4:
                    this.f62202e = System.currentTimeMillis() - this.f62201d;
                    a();
                    return;
                case 5:
                    this.f62203f = System.currentTimeMillis();
                    a();
                    return;
                case 6:
                    this.f62219w = true;
                    this.f62204g = System.currentTimeMillis() - this.f62203f;
                    a();
                    return;
                case 7:
                    this.h = System.currentTimeMillis();
                    a();
                    return;
                case 8:
                    this.f62205i = System.currentTimeMillis() - this.h;
                    a();
                    return;
                case 9:
                    if (this.f62220x) {
                        return;
                    }
                    this.f62206j = System.currentTimeMillis();
                    a();
                    return;
                case 10:
                    if (this.f62220x) {
                        return;
                    }
                    this.f62220x = true;
                    this.f62207k = System.currentTimeMillis() - this.f62206j;
                    a();
                    return;
                case 11:
                    if (this.f62221y) {
                        return;
                    }
                    this.f62208l = System.currentTimeMillis();
                    a();
                    return;
                case 12:
                    if (this.f62221y) {
                        return;
                    }
                    this.f62221y = true;
                    this.f62209m = System.currentTimeMillis() - this.f62208l;
                    a();
                    return;
                case 13:
                    this.f62210n = System.currentTimeMillis();
                    a();
                    return;
                case 14:
                    this.f62211o = System.currentTimeMillis() - this.f62210n;
                    a();
                    return;
                case 15:
                    if (this.f62190B) {
                        return;
                    }
                    this.f62190B = true;
                    this.f62212p = System.currentTimeMillis();
                    a();
                    return;
                case 16:
                    if (this.f62191C) {
                        return;
                    }
                    this.f62191C = true;
                    this.f62213q = System.currentTimeMillis() - this.f62212p;
                    a();
                    return;
                case 17:
                    if (this.f62189A) {
                        return;
                    }
                    this.f62216t = System.currentTimeMillis();
                    if (this.f62219w) {
                        this.f62194F = (System.currentTimeMillis() - this.f62203f) - this.f62204g;
                    }
                    a();
                    return;
                case 18:
                    if (this.f62189A || this.f62222z) {
                        return;
                    }
                    this.f62222z = true;
                    this.f62217u = System.currentTimeMillis() - this.f62216t;
                    a();
                    return;
                case 19:
                    if (this.f62189A) {
                        return;
                    }
                    this.f62189A = true;
                    this.f62214r = System.currentTimeMillis();
                    a();
                    return;
                case 20:
                    if (this.f62192D) {
                        return;
                    }
                    this.f62192D = true;
                    this.f62215s = System.currentTimeMillis() - this.f62214r;
                    this.f62218v = (System.currentTimeMillis() - this.f62199b) - this.f62194F;
                    a();
                    if (StringsKt.isBlank(this.f62196H)) {
                        return;
                    }
                    this.f62193E.put("page_name", this.f62196H);
                    this.f62193E.put("page_total_cost", String.valueOf(this.f62218v));
                    this.f62193E.put("load_total_cost", String.valueOf(this.f62217u));
                    this.f62193E.put("page_render_cost", String.valueOf(this.f62215s));
                    this.f62193E.put("page_create_cost", String.valueOf(this.f62200c));
                    this.f62193E.put("page_create_view_cost", String.valueOf(this.f62202e));
                    this.f62193E.put("page_view_created_cost", String.valueOf(this.f62204g));
                    this.f62193E.put("page_activity_created_cost", String.valueOf(this.f62205i));
                    this.f62193E.put("page_start_cost", String.valueOf(this.f62207k));
                    this.f62193E.put("page_resume_cost", String.valueOf(this.f62209m));
                    this.f62193E.put("page_inflate_cost", String.valueOf(this.f62211o));
                    this.f62193E.put("page_bind_view_cost", String.valueOf(this.f62213q));
                    fillCustomReportExtend();
                    if (Config.isDebuggable()) {
                        Objects.toString(this.f62193E);
                        return;
                    } else {
                        ReporterV3.reportSystem("game-ball.page.apm.sys", this.f62193E);
                        return;
                    }
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final void reset() {
        this.f62199b = 0L;
        this.f62200c = 0L;
        this.f62201d = 0L;
        this.f62202e = 0L;
        this.f62203f = 0L;
        this.f62204g = 0L;
        this.h = 0L;
        this.f62205i = 0L;
        this.f62206j = 0L;
        this.f62207k = 0L;
        this.f62208l = 0L;
        this.f62209m = 0L;
        this.f62210n = 0L;
        this.f62211o = 0L;
        this.f62216t = 0L;
        this.f62217u = 0L;
        this.f62212p = 0L;
        this.f62213q = 0L;
        this.f62214r = 0L;
        this.f62215s = 0L;
        this.f62218v = 0L;
        this.f62219w = false;
        this.f62220x = false;
        this.f62221y = false;
        this.f62222z = false;
        this.f62190B = false;
        this.f62191C = false;
        this.f62189A = false;
        this.f62192D = false;
        this.f62194F = 0L;
        ((LinkedHashMap) this.f62193E).clear();
    }

    public final void setLazyLoad(boolean z6) {
        this.f62195G = z6;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setPageName(@org.jetbrains.annotations.NotNull java.lang.String r5) {
        /*
            r4 = this;
            r0 = r5
            com.bilibili.biligame.report3.PageInfoProtocol$StaticPageIno r0 = com.bilibili.biligame.report3.PageInfoProtocol.getPageInfo(r0)
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L14
            r0 = r6
            java.lang.String r0 = r0.getPageId()
            r7 = r0
            r0 = r7
            r6 = r0
            r0 = r7
            if (r0 != 0) goto L3c
        L14:
            java.util.Map r0 = com.bilibili.biligame.report.ReportConfig.b
            java.util.HashMap r0 = (java.util.HashMap) r0
            r1 = r5
            java.lang.Object r0 = r0.get(r1)
            fq.c r0 = (fq.c) r0
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L2e
            r0 = r5
            java.lang.String r0 = r0.d
            r5 = r0
        L2b:
            goto L33
        L2e:
            r0 = 0
            r5 = r0
            goto L2b
        L33:
            r0 = r5
            r6 = r0
            r0 = r5
            if (r0 != 0) goto L3c
            java.lang.String r0 = ""
            r6 = r0
        L3c:
            r0 = r4
            r1 = r6
            r0.f62196H = r1
            r0 = r4
            r1 = r6
            boolean r1 = kotlin.text.StringsKt.isBlank(r1)
            r2 = 1
            r1 = r1 ^ r2
            r0.f62197I = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.biligame.apm.GamePageApmReporter.setPageName(java.lang.String):void");
    }

    public final void setReportExtend(@Nullable Map<String, String> map) {
        if (map != null) {
            this.f62193E.putAll(map);
        }
    }

    public final void setReportable(boolean z6) {
        this.f62197I = z6;
    }
}
