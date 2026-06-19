package com.bilibili.lib.projection.internal.reporter;

import By0.C1480o;
import By0.N;
import De0.C1572e;
import MP.b;
import WI0.Q0;
import android.util.LruCache;
import androidx.core.app.NotificationCompat;
import com.alipay.alipaysecuritysdk.common.config.Constant;
import com.bilibili.api.BiliApiException;
import com.bilibili.bplus.followinglist.home.mediator.p;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.lib.projection.commonburid.CastCommonParameters;
import com.bilibili.lib.projection.commonburid.CastEventTrackingManager;
import com.bilibili.lib.projection.commonburid.CastScreenType;
import com.bilibili.lib.projection.internal.device.DeviceSnapshot;
import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem;
import com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem;
import com.bilibili.lib.projection.internal.reporter.ProjectionReporter;
import com.bilibili.lib.sharewrapper.basic.ThirdPartyExtraBuilder;
import com.bilibili.live.streaming.source.TextSource;
import ge0.InterfaceC7274d;
import he0.j;
import ie0.C7564c;
import java.util.Map;
import kotlin.ExceptionsKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import le0.C7838f;
import le0.InterfaceC7845m;
import ne0.C8085a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import se0.f;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/reporter/a.class */
public final class a implements ProjectionReporter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final C7838f f63524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f63525b;

    public a(@Nullable C7838f c7838f) {
        this.f63524a = c7838f;
    }

    public final void D(@Nullable StandardProjectionItem standardProjectionItem, @NotNull ProjectionDeviceInternal projectionDeviceInternal, final int i7) {
        j.f120871a.b("player.player.start-stop.0.click", projectionDeviceInternal, standardProjectionItem, this.f63524a, new Function1(i7) { // from class: ze0.P

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f130247a;

            {
                this.f130247a = i7;
            }

            public final Object invoke(Object obj) {
                ((Map) obj).put("player_type", String.valueOf(this.f130247a));
                return Unit.INSTANCE;
            }
        });
    }

    public final void F(final int i7) {
        j.c("main.public-community.screencast-floats.feedback.click", null, null, this.f63524a, new Function1(i7) { // from class: ze0.y

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f130293a;

            {
                this.f130293a = i7;
            }

            public final Object invoke(Object obj) {
                ((Map) obj).put("scene", String.valueOf(this.f130293a));
                return Unit.INSTANCE;
            }
        }, 4);
    }

    public final void G(final int i7) {
        j.c("main.public-community.screencast-floats.help.click", null, null, this.f63524a, new Function1(i7) { // from class: ze0.l

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f130266a;

            {
                this.f130266a = i7;
            }

            public final Object invoke(Object obj) {
                ((Map) obj).put("scene", String.valueOf(this.f130266a));
                return Unit.INSTANCE;
            }
        }, 4);
    }

    public final void J(final int i7) {
        j.e("main.public-community.screencast-floats.guide.show", null, null, this.f63524a, new Function1(i7) { // from class: ze0.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f130253a;

            {
                this.f130253a = i7;
            }

            public final Object invoke(Object obj) {
                ((Map) obj).put("scene", String.valueOf(this.f130253a));
                return Unit.INSTANCE;
            }
        }, 4);
    }

    public final void K(@Nullable StandardProjectionItem standardProjectionItem, @NotNull ProjectionDeviceInternal projectionDeviceInternal, final boolean z6, final int i7) {
        j.g("player.player.devices.definition-click.player", projectionDeviceInternal, standardProjectionItem, this.f63524a, null, new Function1(z6, i7) { // from class: ze0.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f130251a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f130252b;

            {
                this.f130251a = z6;
                this.f130252b = i7;
            }

            public final Object invoke(Object obj) {
                Map map = (Map) obj;
                map.put("is_global_status", this.f130251a ? "1" : "0");
                map.put("player_type", String.valueOf(this.f130252b));
                return Unit.INSTANCE;
            }
        }, 48);
    }

    public final void L(@Nullable StandardProjectionItem standardProjectionItem, @Nullable ProjectionDeviceInternal projectionDeviceInternal, final int i7, final boolean z6, final int i8) {
        j.f120871a.f("player.player.devices.definition-change.player", projectionDeviceInternal, standardProjectionItem, this.f63524a, "", String.valueOf(i7), new Function1(i7, i8, z6) { // from class: ze0.G

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f130223a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f130224b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f130225c;

            {
                this.f130223a = i7;
                this.f130224b = z6;
                this.f130225c = i8;
            }

            public final Object invoke(Object obj) {
                Map map = (Map) obj;
                map.put("qn", String.valueOf(this.f130223a));
                map.put("is_global_status", this.f130224b ? "1" : "0");
                map.put("player_type", String.valueOf(this.f130225c));
                return Unit.INSTANCE;
            }
        });
    }

    public final void M(@Nullable StandardProjectionItem standardProjectionItem, @Nullable ProjectionDeviceInternal projectionDeviceInternal, final boolean z6, final int i7) {
        j.g("player.player.screencast.quit.player", projectionDeviceInternal, standardProjectionItem, this.f63524a, null, new Function1(i7, z6) { // from class: ze0.g

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f130259a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f130260b;

            {
                this.f130259a = i7;
                this.f130260b = z6;
            }

            public final Object invoke(Object obj) {
                Map map = (Map) obj;
                map.put("player_type", String.valueOf(this.f130259a));
                map.put("quit_type", "2");
                map.put("is_global_status", this.f130260b ? "1" : "0");
                return Unit.INSTANCE;
            }
        }, 48);
    }

    public final void N(final int i7) {
        j.c("main.public-community.screencast-floats.recommendation.click", null, null, this.f63524a, new Function1(i7) { // from class: ze0.n

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f130269a;

            {
                this.f130269a = i7;
            }

            public final Object invoke(Object obj) {
                ((Map) obj).put("scene", String.valueOf(this.f130269a));
                return Unit.INSTANCE;
            }
        }, 4);
    }

    public final void O() {
        j.c("main.public.screencast-floats.scan-cast-entry.click", null, null, this.f63524a, null, 20);
    }

    public final void P() {
        j.e("main.public.screencast-floats.scan-cast-entry.show", null, null, this.f63524a, null, 20);
    }

    public final void Q() {
        j.c("main.public-community.screencast-floats.close.click", null, null, this.f63524a, null, 20);
    }

    public final void R(@Nullable StandardProjectionItem standardProjectionItem, @NotNull ProjectionDeviceInternal projectionDeviceInternal, final int i7) {
        j.f120871a.b("player.player.devices-seek.0.click", projectionDeviceInternal, standardProjectionItem, this.f63524a, new Function1(i7) { // from class: ze0.z

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f130294a;

            {
                this.f130294a = i7;
            }

            public final Object invoke(Object obj) {
                ((Map) obj).put("player_type", String.valueOf(this.f130294a));
                return Unit.INSTANCE;
            }
        });
    }

    public final void S(@NotNull ProjectionDeviceInternal projectionDeviceInternal, @Nullable String str) {
        j jVar = j.f120871a;
        C7838f c7838f = this.f63524a;
        IProjectionItem iProjectionItemN = c7838f != null ? c7838f.n(true) : null;
        jVar.b("player.player.devices.episode.click", projectionDeviceInternal, iProjectionItemN instanceof StandardProjectionItem ? (StandardProjectionItem) iProjectionItemN : null, c7838f, new C1480o(str, 2));
    }

    public final void T(final int i7, @Nullable final Float f7, @Nullable ProjectionDeviceInternal projectionDeviceInternal, @Nullable StandardProjectionItem standardProjectionItem) {
        j.g("player.player.screencast.speed-button-click.player", projectionDeviceInternal, standardProjectionItem, this.f63524a, null, new Function1(i7, f7) { // from class: ze0.Q

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f130248a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Float f130249b;

            {
                this.f130248a = i7;
                this.f130249b = f7;
            }

            public final Object invoke(Object obj) {
                Map map = (Map) obj;
                map.put("player_type", String.valueOf(this.f130248a));
                map.put("level_status", String.valueOf(this.f130249b));
                return Unit.INSTANCE;
            }
        }, 48);
    }

    public final void U(@Nullable final Float f7, @Nullable final ProjectionDeviceInternal projectionDeviceInternal, @Nullable final StandardProjectionItem standardProjectionItem) {
        String strValueOf = String.valueOf(f7.floatValue());
        String str = strValueOf;
        if (strValueOf == null) {
            str = "";
        }
        j.g("player.player.screencast.choose-speed-click.player", projectionDeviceInternal, standardProjectionItem, null, str, new Function1(f7, projectionDeviceInternal, standardProjectionItem, this) { // from class: ze0.w

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Float f130289a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final ProjectionDeviceInternal f130290b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final StandardProjectionItem f130291c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final com.bilibili.lib.projection.internal.reporter.a f130292d;

            {
                this.f130289a = f7;
                this.f130290b = projectionDeviceInternal;
                this.f130291c = standardProjectionItem;
                this.f130292d = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:28:0x00a3  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke(java.lang.Object r5) {
                /*
                    r4 = this;
                    r0 = r5
                    java.util.Map r0 = (java.util.Map) r0
                    r8 = r0
                    r0 = r8
                    java.lang.String r1 = "level"
                    r2 = r4
                    java.lang.Float r2 = r2.f130289a
                    java.lang.String r2 = java.lang.String.valueOf(r2)
                    java.lang.Object r0 = r0.put(r1, r2)
                    r0 = r4
                    com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal r0 = r0.f130290b
                    r5 = r0
                    r0 = 0
                    r7 = r0
                    r0 = r5
                    if (r0 == 0) goto L2c
                    r0 = r5
                    int r0 = r0.e()
                    r6 = r0
                    goto L2e
                L2c:
                    r0 = 0
                    r6 = r0
                L2e:
                    r0 = r8
                    java.lang.String r1 = "platform"
                    r2 = r6
                    java.lang.String r2 = java.lang.String.valueOf(r2)
                    java.lang.Object r0 = r0.put(r1, r2)
                    r0 = r4
                    com.bilibili.lib.projection.internal.reporter.a r0 = r0.f130292d
                    le0.f r0 = r0.f63524a
                    r9 = r0
                    r0 = r9
                    if (r0 == 0) goto L63
                    r0 = r9
                    com.bilibili.lib.projection.ProjectionClientConfig r0 = r0.f123136c
                    r9 = r0
                    r0 = r9
                    if (r0 == 0) goto L63
                    r0 = r9
                    int r0 = r0.getBusinessType$biliscreencast_release()
                    r1 = 102(0x66, float:1.43E-43)
                    if (r0 != r1) goto L63
                    goto La3
                L63:
                    r0 = r4
                    com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem r0 = r0.f130291c
                    r9 = r0
                    r0 = r9
                    if (r0 == 0) goto L7d
                    r0 = r9
                    int r0 = r0.getType()
                    r1 = 102(0x66, float:1.43E-43)
                    if (r0 != r1) goto L7d
                    goto La3
                L7d:
                    r0 = r5
                    if (r0 == 0) goto L84
                    goto L86
                L84:
                    r0 = 0
                    r5 = r0
                L86:
                    r0 = r7
                    r6 = r0
                    r0 = r5
                    if (r0 == 0) goto La5
                    r0 = r5
                    com.bilibili.lib.projection.internal.projectionitem.base.IProjectionPlayableItem r0 = r0.getMediaSource()
                    r5 = r0
                    r0 = r7
                    r6 = r0
                    r0 = r5
                    if (r0 == 0) goto La5
                    r0 = r7
                    r6 = r0
                    r0 = r5
                    boolean r0 = ye0.C9051a.b(r0)
                    r1 = 1
                    if (r0 != r1) goto La5
                La3:
                    r0 = 1
                    r6 = r0
                La5:
                    r0 = r6
                    if (r0 == 0) goto Lb8
                    r0 = r8
                    java.lang.String r1 = "player_mode"
                    java.lang.String r2 = "2"
                    java.lang.Object r0 = r0.put(r1, r2)
                    goto Lc4
                Lb8:
                    r0 = r8
                    java.lang.String r1 = "player_mode"
                    java.lang.String r2 = "1"
                    java.lang.Object r0 = r0.put(r1, r2)
                Lc4:
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: ze0.w.invoke(java.lang.Object):java.lang.Object");
            }
        }, 40);
    }

    public final void V(@Nullable ProjectionDeviceInternal projectionDeviceInternal) {
        j.c("player.player.volume.0.click", projectionDeviceInternal, null, this.f63524a, new Q0(2), 4);
    }

    public final void W(final int i7, @NotNull final String str, final boolean z6) {
        j.i("ott.pinkcast.activity.request", null, false, null, this.f63524a, new Function1(z6, str, i7) { // from class: ze0.s

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f130284a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f130285b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f130286c;

            {
                this.f130284a = z6;
                this.f130285b = str;
                this.f130286c = i7;
            }

            public final Object invoke(Object obj) {
                Map map = (Map) obj;
                map.put("type", String.valueOf(this.f130284a));
                map.put("message", this.f130285b);
                map.put("dot_or_bubble", String.valueOf(this.f130286c));
                return Unit.INSTANCE;
            }
        }, 12);
    }

    public final void X(@Nullable IProjectionItem iProjectionItem, @Nullable final ProjectionDeviceInternal projectionDeviceInternal, final int i7) {
        j.h("projection.direct.connect", projectionDeviceInternal, true, iProjectionItem instanceof StandardProjectionItem ? (StandardProjectionItem) iProjectionItem : null, this.f63524a, new Function1(i7, projectionDeviceInternal) { // from class: ze0.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f130255a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final ProjectionDeviceInternal f130256b;

            {
                this.f130255a = i7;
                this.f130256b = projectionDeviceInternal;
            }

            /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke(java.lang.Object r5) {
                /*
                    r4 = this;
                    r0 = r5
                    java.util.Map r0 = (java.util.Map) r0
                    r7 = r0
                    r0 = r7
                    java.lang.String r1 = "result"
                    r2 = r4
                    int r2 = r2.f130255a
                    java.lang.String r2 = java.lang.String.valueOf(r2)
                    java.lang.Object r0 = r0.put(r1, r2)
                    r0 = r4
                    com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal r0 = r0.f130256b
                    r5 = r0
                    r0 = r5
                    if (r0 == 0) goto L35
                    r0 = r5
                    com.bilibili.lib.projection.base.ConnectDeviceType r0 = ge0.e.c(r0)
                    r5 = r0
                    r0 = r5
                    if (r0 == 0) goto L35
                    r0 = r5
                    int r0 = r0.getType()
                    java.lang.String r0 = java.lang.String.valueOf(r0)
                    r6 = r0
                    r0 = r6
                    r5 = r0
                    r0 = r6
                    if (r0 != 0) goto L3f
                L35:
                    com.bilibili.lib.projection.base.ConnectDeviceType r0 = com.bilibili.lib.projection.base.ConnectDeviceType.Unknown
                    int r0 = r0.getType()
                    java.lang.String r0 = java.lang.String.valueOf(r0)
                    r5 = r0
                L3f:
                    r0 = r7
                    java.lang.String r1 = "connect_device_type"
                    r2 = r5
                    java.lang.Object r0 = r0.put(r1, r2)
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: ze0.C9178e.invoke(java.lang.Object):java.lang.Object");
            }
        });
    }

    public final void Y(@Nullable InterfaceC7845m interfaceC7845m, @Nullable ProjectionDeviceInternal projectionDeviceInternal, final boolean z6, final int i7) {
        StandardProjectionItem standardProjectionItem = null;
        IProjectionItem iProjectionItemN = interfaceC7845m != null ? interfaceC7845m.n(true) : null;
        if (iProjectionItemN instanceof StandardProjectionItem) {
            standardProjectionItem = (StandardProjectionItem) iProjectionItemN;
        }
        if (standardProjectionItem != null) {
            j.f120871a.b("player.player.devices.directconnect.click", projectionDeviceInternal, standardProjectionItem, interfaceC7845m, new Function1(z6, i7) { // from class: ze0.A

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final boolean f130213a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f130214b;

                {
                    this.f130213a = z6;
                    this.f130214b = i7;
                }

                public final Object invoke(Object obj) {
                    Map map = (Map) obj;
                    map.put("is_global_status", this.f130213a ? "1" : "0");
                    map.put("is_from_tv", this.f130214b == 4 ? "1" : "0");
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public final void Z(boolean z6, boolean z7, @Nullable ProjectionDeviceInternal projectionDeviceInternal, @NotNull Map<String, String> map) {
        Map mapEmptyMap = MapsKt.emptyMap();
        if (projectionDeviceInternal != null) {
            mapEmptyMap = MapsKt.mapOf(new Pair[]{TuplesKt.to("uuid", projectionDeviceInternal.getUuid()), TuplesKt.to("device_name", projectionDeviceInternal.getName()), TuplesKt.to("display_name", projectionDeviceInternal.getDisplayName()), TuplesKt.to("device_brand", projectionDeviceInternal.getBrand())});
        }
        String strValueOf = String.valueOf(projectionDeviceInternal != null ? projectionDeviceInternal.getVersion() : null);
        CastEventTrackingManager castEventTrackingManagerInstance = CastEventTrackingManager.Companion.instance();
        C1572e.f2836a.getClass();
        castEventTrackingManagerInstance.trackShow("main.public.screencast-result.all.show", MapsKt.plus(MapsKt.plus(MapsKt.mapOf(new Pair[]{TuplesKt.to("yst_offline_counts", String.valueOf(C1572e.f2837b)), TuplesKt.to("ott_version", strValueOf), TuplesKt.to(ThirdPartyExtraBuilder.KEY_RESULT, z6 ? "direct" : "panel"), TuplesKt.to(Constant.IN_KEY_REASON, (z6 && z7) ? "connect, auto start" : z6 ? "direct connect device" : "show device panel"), TuplesKt.to("is_connected", z7 ? "1" : "0")}), map), mapEmptyMap));
    }

    public final void a0(final long j7, @NotNull ProjectionDeviceInternal projectionDeviceInternal) {
        j.e("player.player.first-devices.0.show", projectionDeviceInternal, null, this.f63524a, new Function1(j7) { // from class: ze0.k

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final long f130265a;

            {
                this.f130265a = j7;
            }

            public final Object invoke(Object obj) {
                ((Map) obj).put("time", String.valueOf(this.f130265a));
                return Unit.INSTANCE;
            }
        }, 4);
    }

    public final void b0(@Nullable IProjectionItem iProjectionItem, @Nullable f fVar, final int i7, @NotNull final String str, @NotNull final String str2, @NotNull final String str3, @NotNull final String str4) {
        j.h("projection.link.callback.code", fVar, true, iProjectionItem instanceof StandardProjectionItem ? (StandardProjectionItem) iProjectionItem : null, this.f63524a, new Function1(i7, str, str2, str3, str4) { // from class: ze0.M

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f130240a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f130241b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f130242c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final String f130243d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final String f130244e;

            {
                this.f130240a = i7;
                this.f130241b = str;
                this.f130242c = str2;
                this.f130243d = str3;
                this.f130244e = str4;
            }

            public final Object invoke(Object obj) {
                Map map = (Map) obj;
                map.put(ThirdPartyExtraBuilder.KEY_RESULT, String.valueOf(this.f130240a));
                map.put("mobileCode", this.f130241b);
                map.put("callbackCode", this.f130242c);
                map.put("from", this.f130243d);
                map.put("callbackBuvid", this.f130244e);
                return Unit.INSTANCE;
            }
        });
    }

    public final void c0(@Nullable ProjectionDeviceInternal projectionDeviceInternal, @NotNull IProjectionItem iProjectionItem) {
        StandardProjectionItem standardProjectionItem = iProjectionItem instanceof StandardProjectionItem ? (StandardProjectionItem) iProjectionItem : null;
        if (standardProjectionItem != null) {
            j.h("player.cast.search.connected", projectionDeviceInternal, true, (StandardProjectionItem) iProjectionItem, this.f63524a, new com.bilibili.bplus.followinglist.inline.panel.f(standardProjectionItem, 3));
        }
    }

    public final void d0(@Nullable IProjectionItem iProjectionItem, @NotNull ProjectionDeviceInternal projectionDeviceInternal, final int i7, @Nullable final Exception exc) {
        j.h("projection.device.resolve", projectionDeviceInternal, true, iProjectionItem instanceof StandardProjectionItem ? (StandardProjectionItem) iProjectionItem : null, this.f63524a, new Function1(i7, exc) { // from class: ze0.K

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f130237a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Exception f130238b;

            {
                this.f130237a = i7;
                this.f130238b = exc;
            }

            public final Object invoke(Object obj) {
                BiliApiException biliApiException = this.f130238b;
                Map map = (Map) obj;
                map.put(ThirdPartyExtraBuilder.KEY_RESULT, String.valueOf(this.f130237a));
                if (biliApiException != null) {
                    map.put("message", biliApiException.getLocalizedMessage());
                    map.put("error_code", biliApiException instanceof BiliApiException ? String.valueOf(biliApiException.mCode) : "");
                    map.put("stack", ExceptionsKt.stackTraceToString(biliApiException));
                }
                return Unit.INSTANCE;
            }
        });
    }

    public final void e0(@Nullable ProjectionDeviceInternal projectionDeviceInternal, @Nullable IProjectionItem iProjectionItem) {
        j.i("projection.start", projectionDeviceInternal, false, iProjectionItem instanceof StandardProjectionItem ? (StandardProjectionItem) iProjectionItem : null, this.f63524a, null, 36);
    }

    public final void f0(@NotNull IProjectionItem iProjectionItem, @Nullable ProjectionDeviceInternal projectionDeviceInternal, boolean z6) {
        if (iProjectionItem instanceof StandardProjectionItem) {
            String str = "player.cast.start";
            if (z6) {
                this.f63525b = true;
            } else if (this.f63525b) {
                this.f63525b = false;
                str = "player.cast.play.fireinner";
            }
            String str2 = str;
            j.h(str2, projectionDeviceInternal, true, (StandardProjectionItem) iProjectionItem, this.f63524a, new b(iProjectionItem, 4));
        }
    }

    public final void g(@Nullable final String str, @Nullable final ProjectionDeviceInternal projectionDeviceInternal, @Nullable final StandardProjectionItem standardProjectionItem, @Nullable final Integer num) {
        HandlerThreads.post(1, new Runnable(projectionDeviceInternal, standardProjectionItem, this, str, num) { // from class: ze0.H

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ProjectionDeviceInternal f130226a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final StandardProjectionItem f130227b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final com.bilibili.lib.projection.internal.reporter.a f130228c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final String f130229d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final Integer f130230e;

            {
                this.f130226a = projectionDeviceInternal;
                this.f130227b = standardProjectionItem;
                this.f130228c = this;
                this.f130229d = str;
                this.f130230e = num;
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    he0.j.f120871a.d("player.player.devices.third-party-guide.show", this.f130226a, this.f130227b, this.f130228c.f63524a, new androidx.compose.foundation.text.input.internal.H(this.f130229d, this.f130230e));
                } catch (Throwable th) {
                    com.bilibili.adcommon.utils.e.a("report bubble exposure error, cause ", "DefaultProjectionReporter", th);
                }
            }
        });
    }

    public final void g0(@Nullable IProjectionItem iProjectionItem, @NotNull final ProjectionDeviceInternal projectionDeviceInternal, @NotNull final String str, @NotNull final String str2, final int i7, final long j7, @NotNull final String str3, @NotNull final String str4, @NotNull final String str5, @NotNull final String str6) {
        j.h("projection.user.action", projectionDeviceInternal, true, iProjectionItem instanceof StandardProjectionItem ? (StandardProjectionItem) iProjectionItem : null, this.f63524a, new Function1(str, i7, j7, str3, str4, str5, str6, str2, projectionDeviceInternal) { // from class: ze0.o

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f130270a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f130271b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final long f130272c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final String f130273d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final String f130274e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final String f130275f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final String f130276g;
            public final String h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final ProjectionDeviceInternal f130277i;

            {
                this.f130270a = str;
                this.f130271b = i7;
                this.f130272c = j7;
                this.f130273d = str3;
                this.f130274e = str4;
                this.f130275f = str5;
                this.f130276g = str6;
                this.h = str2;
                this.f130277i = projectionDeviceInternal;
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            public final Object invoke(Object obj) {
                InterfaceC7845m client;
                Map map = (Map) obj;
                String str7 = this.f130270a;
                map.put("action", str7);
                map.put(ThirdPartyExtraBuilder.KEY_RESULT, String.valueOf(this.f130271b));
                map.put("time", String.valueOf(this.f130272c));
                com.bilibili.lib.projection.internal.device.a aVar = (com.bilibili.lib.projection.internal.device.a) C7564c.f121640q.f63102c.e();
                map.put("panel", (aVar == null || (client = aVar.getClient()) == null || !client.a()) ? "1" : "2");
                map.put(TextSource.CFG_CONTENT, this.f130273d);
                map.put("errorCode", this.f130274e);
                map.put("errorMsg", this.f130275f);
                map.put("response", this.f130276g);
                int iHashCode = str7.hashCode();
                String str8 = this.h;
                switch (iHashCode) {
                    case -1859168877:
                        if (str7.equals("playspeed")) {
                            map.put("speed", str8);
                        }
                        break;
                    case -1517564637:
                        if (str7.equals("danmakutoggle")) {
                            map.put("danmaku", str8);
                        }
                        break;
                    case -905767478:
                        if (str7.equals("seturi")) {
                            map.put("url", str8);
                        }
                        break;
                    case -810883302:
                        if (str7.equals("volume")) {
                            map.put("systemvolume", str8);
                        }
                        break;
                    case 3145837:
                        if (str7.equals("flip")) {
                            map.put("flip", str8);
                        }
                        break;
                    case 3443508:
                        if (str7.equals("play") && (this.f130277i instanceof se0.f)) {
                            map.put("url", str8);
                        }
                        break;
                    case 742803275:
                        if (str7.equals("switchquality")) {
                            map.put("quality", str8);
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        });
    }

    public final void j(@Nullable StandardProjectionItem standardProjectionItem, @Nullable ProjectionDeviceInternal projectionDeviceInternal, final int i7, @Nullable final String str, @NotNull final String str2) {
        j.g("player.player.screencast.changedevice.player", projectionDeviceInternal, standardProjectionItem, this.f63524a, null, new Function1(i7, str, str2) { // from class: ze0.i

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f130262a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f130263b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f130264c;

            {
                this.f130262a = i7;
                this.f130263b = str;
                this.f130264c = str2;
            }

            public final Object invoke(Object obj) {
                Map map = (Map) obj;
                int i8 = this.f130262a;
                if (i8 > 0) {
                    map.put("player_type", String.valueOf(i8));
                }
                String str3 = this.f130263b;
                String str4 = str3;
                if (str3 == null) {
                    str4 = "";
                }
                map.put("activity_id", str4);
                map.put("is_guide_toast", this.f130264c);
                return Unit.INSTANCE;
            }
        }, 48);
    }

    public final void k(@Nullable StandardProjectionItem standardProjectionItem, @NotNull final ProjectionDeviceInternal projectionDeviceInternal, final boolean z6) {
        C8085a c8085a;
        LruCache<String, DeviceSnapshot> lruCache;
        DeviceSnapshot deviceSnapshot = (this.f63524a == null || (c8085a = C7564c.f121633j) == null || (lruCache = c8085a.f124072b) == null) ? null : lruCache.get(projectionDeviceInternal.getUuid());
        j jVar = j.f120871a;
        if (deviceSnapshot != null) {
            jVar.b("player.player.history-devices.0.click", projectionDeviceInternal, standardProjectionItem, this.f63524a, new Function1(projectionDeviceInternal, z6) { // from class: ze0.C

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ProjectionDeviceInternal f130217a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final boolean f130218b;

                {
                    this.f130217a = projectionDeviceInternal;
                    this.f130218b = z6;
                }

                public final Object invoke(Object obj) {
                    Map map = (Map) obj;
                    map.put("player_type", "1");
                    ProjectionDeviceInternal projectionDeviceInternal2 = this.f130217a;
                    map.put("tv_name", projectionDeviceInternal2.getRealName());
                    map.put("token", projectionDeviceInternal2.getUuid());
                    map.put("is_global_status", this.f130218b ? "1" : "0");
                    map.put("connect_device_type", String.valueOf(ge0.e.c(projectionDeviceInternal2).getType()));
                    return Unit.INSTANCE;
                }
            });
        } else {
            jVar.b("player.player.screencast-tv-select.0.click", projectionDeviceInternal, standardProjectionItem, this.f63524a, new Function1(projectionDeviceInternal, z6) { // from class: ze0.D

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ProjectionDeviceInternal f130219a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final boolean f130220b;

                {
                    this.f130219a = projectionDeviceInternal;
                    this.f130220b = z6;
                }

                public final Object invoke(Object obj) {
                    Map map = (Map) obj;
                    ProjectionDeviceInternal projectionDeviceInternal2 = this.f130219a;
                    map.put("tv_name", projectionDeviceInternal2.getRealName());
                    map.put("is_global_status", this.f130220b ? "1" : "0");
                    map.put("connect_device_type", String.valueOf(ge0.e.c(projectionDeviceInternal2).getType()));
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    public final void l(@NotNull ProjectionDeviceInternal projectionDeviceInternal) {
        j.e("player.player.connect-feedback.0.show", projectionDeviceInternal, null, this.f63524a, new Object(), 4);
    }

    @Override // com.bilibili.lib.projection.internal.reporter.ProjectionReporter
    public final void m(@NotNull final String str, @Nullable final String str2, @Nullable final String str3, final boolean z6) {
        CastCommonParameters castCommonParametersCommonParams;
        if (z6 && (castCommonParametersCommonParams = CastEventTrackingManager.Companion.instance().commonParams()) != null) {
            castCommonParametersCommonParams.updateScreenCastType(CastScreenType.CastScreenTypeQRCode);
        }
        j.e("main.public.screencast-process.scan-result.show", null, null, this.f63524a, new Function1(str, str2, str3, z6) { // from class: ze0.J

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f130233a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f130234b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f130235c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final String f130236d;

            {
                this.f130233a = z6;
                this.f130234b = str;
                this.f130235c = str2;
                this.f130236d = str3;
            }

            public final Object invoke(Object obj) {
                Map map = (Map) obj;
                map.put(ThirdPartyExtraBuilder.KEY_RESULT, this.f130233a ? "1" : "0");
                map.put("qrcode_content", this.f130234b);
                String str4 = this.f130235c;
                if (str4 != null && str4.length() > 0) {
                    map.put("ott_buvid", str4);
                }
                String str5 = this.f130236d;
                if (str5 != null && str5.length() > 0) {
                    map.put("fail_type", str5);
                }
                return Unit.INSTANCE;
            }
        }, 4);
    }

    public final void o(@NotNull ProjectionReporter.PanelMode panelMode, @NotNull ProjectionReporter.ControlPageButtonType controlPageButtonType, @Nullable ProjectionDeviceInternal projectionDeviceInternal, @Nullable IProjectionItem iProjectionItem) {
        j.c("player.player.screencast.control-panel.click", projectionDeviceInternal, iProjectionItem instanceof StandardProjectionItem ? (StandardProjectionItem) iProjectionItem : null, null, new p(1, panelMode, controlPageButtonType), 8);
    }

    public final void q(@NotNull ProjectionReporter.PanelMode panelMode, @Nullable InterfaceC7274d interfaceC7274d, @Nullable IProjectionItem iProjectionItem) {
        j.e("player.player.screencast.control-panel.show", interfaceC7274d, iProjectionItem instanceof StandardProjectionItem ? (StandardProjectionItem) iProjectionItem : null, null, new N(panelMode, 2), 8);
    }

    public final void r(@Nullable final String str, @Nullable final String str2, @Nullable final String str3, @Nullable ProjectionDeviceInternal projectionDeviceInternal) {
        j.e("player.player.activity-banner.0.show", projectionDeviceInternal, null, this.f63524a, new Function1(str, str2, str3) { // from class: ze0.r

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f130281a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f130282b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f130283c;

            {
                this.f130281a = str;
                this.f130282b = str2;
                this.f130283c = str3;
            }

            public final Object invoke(Object obj) {
                Map map = (Map) obj;
                map.put("activity_id", String.valueOf(this.f130281a));
                map.put("activity_title", String.valueOf(this.f130282b));
                map.put("url", String.valueOf(this.f130283c));
                return Unit.INSTANCE;
            }
        }, 4);
    }

    public final void u(@Nullable ProjectionDeviceInternal projectionDeviceInternal, final boolean z6) {
        j.c("player.player.devices.danmaku-switch.click", projectionDeviceInternal, null, this.f63524a, new Function1(z6) { // from class: ze0.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f130254a;

            {
                this.f130254a = z6;
            }

            public final Object invoke(Object obj) {
                ((Map) obj).put("switch", this.f130254a ? "1" : "2");
                return Unit.INSTANCE;
            }
        }, 4);
    }

    public final void v(@Nullable ProjectionDeviceInternal projectionDeviceInternal, final int i7, final int i8) {
        j.c("main.global-screencast.screencast-tv-select.0.click", projectionDeviceInternal, null, this.f63524a, new Function1(i7, i8) { // from class: ze0.m

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f130267a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f130268b;

            {
                this.f130267a = i7;
                this.f130268b = i8;
            }

            public final Object invoke(Object obj) {
                Map map = (Map) obj;
                map.put(NotificationCompat.CATEGORY_STATUS, String.valueOf(this.f130267a));
                map.put("position", String.valueOf(this.f130268b));
                return Unit.INSTANCE;
            }
        }, 4);
    }

    public final void z(@Nullable StandardProjectionItem standardProjectionItem, @Nullable ProjectionDeviceInternal projectionDeviceInternal, final int i7) {
        j.f120871a.d("main.global-screencast.screencast-tv-select.0.show", projectionDeviceInternal, standardProjectionItem, this.f63524a, new Function1(i7) { // from class: ze0.u

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f130288a;

            {
                this.f130288a = i7;
            }

            public final Object invoke(Object obj) {
                ((Map) obj).put(NotificationCompat.CATEGORY_STATUS, String.valueOf(this.f130288a));
                return Unit.INSTANCE;
            }
        });
    }
}
