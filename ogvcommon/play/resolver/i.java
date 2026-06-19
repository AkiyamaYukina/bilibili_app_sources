package com.bilibili.ogvcommon.play.resolver;

import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.GravityCompat;
import com.bapis.bilibili.pgc.gateway.player.v2.CodeType;
import com.bapis.bilibili.pgc.gateway.player.v2.DataControl;
import com.bapis.bilibili.pgc.gateway.player.v2.InlineScene;
import com.bapis.bilibili.pgc.gateway.player.v2.PlayURLMoss;
import com.bapis.bilibili.pgc.gateway.player.v2.PlayViewReq;
import com.bapis.bilibili.pgc.gateway.player.v2.PlayurlMossKtxKt;
import com.bapis.bilibili.pgc.gateway.player.v2.SceneControl;
import com.bapis.bilibili.pgc.gateway.player.v2.SecurityLevel;
import com.bilibili.lib.accountinfo.model.VipUserInfo;
import com.bilibili.lib.moss.api.CallOptions;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.ijk.media.player.IjkMediaAsset;
import tv.danmaku.ijk.media.player.utils.IjkDrmUtils;
import vl0.C8833a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/resolver/i.class */
@StabilityInferred(parameters = 1)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final i f73268a = new Object();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/resolver/i$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f73269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f73270b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f73271c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f73272d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f73273e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f73274f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f73275g;

        @Nullable
        public final String h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public final String f73276i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f73277j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        public final IjkMediaAsset.VideoCodecType f73278k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final long f73279l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f73280m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f73281n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final long f73282o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @Nullable
        public final Boolean f73283p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final boolean f73284q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final boolean f73285r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final boolean f73286s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final boolean f73287t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        @NotNull
        public final InlineScene f73288u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final long f73289v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final long f73290w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final boolean f73291x;

        public a(long j7, long j8, long j9, int i7, int i8, int i9, int i10, String str, String str2, int i11, IjkMediaAsset.VideoCodecType videoCodecType, long j10, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, InlineScene inlineScene, long j11, long j12, boolean z11, int i12) {
            z7 = (i12 & 8192) != 0 ? false : z7;
            long jMid = com.bilibili.ogv.infra.account.a.f67852b.mid();
            VipUserInfo vipInfo = com.bilibili.ogv.infra.account.a.f67851a.getVipInfo();
            Boolean boolValueOf = vipInfo != null ? Boolean.valueOf(vipInfo.isEffectiveVip()) : null;
            z8 = (65536 & i12) != 0 ? false : z8;
            z9 = (131072 & i12) != 0 ? false : z9;
            z10 = (524288 & i12) != 0 ? false : z10;
            inlineScene = (1048576 & i12) != 0 ? InlineScene.UNKNOWN : inlineScene;
            j11 = (2097152 & i12) != 0 ? 0L : j11;
            j12 = (4194304 & i12) != 0 ? 0L : j12;
            z11 = (i12 & GravityCompat.RELATIVE_LAYOUT_DIRECTION) != 0 ? true : z11;
            this.f73269a = j7;
            this.f73270b = j8;
            this.f73271c = j9;
            this.f73272d = i7;
            this.f73273e = i8;
            this.f73274f = i9;
            this.f73275g = i10;
            this.h = str;
            this.f73276i = str2;
            this.f73277j = i11;
            this.f73278k = videoCodecType;
            this.f73279l = j10;
            this.f73280m = z6;
            this.f73281n = z7;
            this.f73282o = jMid;
            this.f73283p = boolValueOf;
            this.f73284q = z8;
            this.f73285r = z9;
            this.f73286s = false;
            this.f73287t = z10;
            this.f73288u = inlineScene;
            this.f73289v = j11;
            this.f73290w = j12;
            this.f73291x = z11;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f73269a == aVar.f73269a && this.f73270b == aVar.f73270b && this.f73271c == aVar.f73271c && this.f73272d == aVar.f73272d && this.f73273e == aVar.f73273e && this.f73274f == aVar.f73274f && this.f73275g == aVar.f73275g && Intrinsics.areEqual(this.h, aVar.h) && Intrinsics.areEqual(this.f73276i, aVar.f73276i) && this.f73277j == aVar.f73277j && this.f73278k == aVar.f73278k && this.f73279l == aVar.f73279l && this.f73280m == aVar.f73280m && this.f73281n == aVar.f73281n && this.f73282o == aVar.f73282o && Intrinsics.areEqual(this.f73283p, aVar.f73283p) && this.f73284q == aVar.f73284q && this.f73285r == aVar.f73285r && this.f73286s == aVar.f73286s && this.f73287t == aVar.f73287t && this.f73288u == aVar.f73288u && this.f73289v == aVar.f73289v && this.f73290w == aVar.f73290w && this.f73291x == aVar.f73291x;
        }

        public final int hashCode() {
            int iA = I.a(this.f73275g, I.a(this.f73274f, I.a(this.f73273e, I.a(this.f73272d, C3554n0.a(C3554n0.a(Long.hashCode(this.f73269a) * 31, 31, this.f73270b), 31, this.f73271c), 31), 31), 31), 31);
            String str = this.h;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.f73276i;
            int iA2 = C3554n0.a(z.a(z.a(C3554n0.a((this.f73278k.hashCode() + I.a(this.f73277j, (((iA + iHashCode) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31, 31)) * 31, 31, this.f73279l), 31, this.f73280m), 31, this.f73281n), 31, this.f73282o);
            Boolean bool = this.f73283p;
            return Boolean.hashCode(this.f73291x) + C3554n0.a(C3554n0.a((this.f73288u.hashCode() + z.a(z.a(z.a(z.a((iA2 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.f73284q), 31, this.f73285r), 31, this.f73286s), 31, this.f73287t)) * 31, 31, this.f73289v), 31, this.f73290w);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("PlayViewRequestParams(epId=");
            sb.append(this.f73269a);
            sb.append(", cid=");
            sb.append(this.f73270b);
            sb.append(", qn=");
            sb.append(this.f73271c);
            sb.append(", fnver=");
            sb.append(this.f73272d);
            sb.append(", fnval=");
            sb.append(this.f73273e);
            sb.append(", download=");
            sb.append(this.f73274f);
            sb.append(", forceHost=");
            sb.append(this.f73275g);
            sb.append(", spmid=");
            sb.append(this.h);
            sb.append(", fromSpmid=");
            sb.append(this.f73276i);
            sb.append(", teenagersMode=");
            sb.append(this.f73277j);
            sb.append(", codecType=");
            sb.append(this.f73278k);
            sb.append(", roomId=");
            sb.append(this.f73279l);
            sb.append(", isNeedViewInfo=");
            sb.append(this.f73280m);
            sb.append(", isQualityTrial=");
            sb.append(this.f73281n);
            sb.append(", mid=");
            sb.append(this.f73282o);
            sb.append(", vipEffective=");
            sb.append(this.f73283p);
            sb.append(", isPlaylist=");
            sb.append(this.f73284q);
            sb.append(", smallWindow=");
            sb.append(this.f73285r);
            sb.append(", isPip=");
            sb.append(this.f73286s);
            sb.append(", isHeInline=");
            sb.append(this.f73287t);
            sb.append(", inlineScene=");
            sb.append(this.f73288u);
            sb.append(", materialId=");
            sb.append(this.f73289v);
            sb.append(", seasonId=");
            sb.append(this.f73290w);
            sb.append(", needWatchProgress=");
            return androidx.appcompat.app.i.a(sb, this.f73291x, ")");
        }
    }

    public static Object a(a aVar, Continuation continuation) {
        SecurityLevel securityLevelForNumber = C8833a.f128289a ? SecurityLevel.LEVEL_UNKNOWN : SecurityLevel.forNumber(IjkDrmUtils.getSecurityLevel());
        PlayViewReq.b forceHost = PlayViewReq.newBuilder().setEpId(aVar.f73269a).setCid(aVar.f73270b).setQn(aVar.f73271c).setFnver(aVar.f73272d).setFnval(aVar.f73273e).setDownload(aVar.f73274f).setForceHost(aVar.f73275g);
        String str = aVar.h;
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        PlayViewReq.b spmid = forceHost.setSpmid(str2);
        String str3 = aVar.f73276i;
        if (str3 == null) {
            str3 = "";
        }
        PlayViewReq.b dataControl = spmid.setFromSpmid(str3).setTeenagersMode(aVar.f73277j).setPreferCodecType(aVar.f73278k == IjkMediaAsset.VideoCodecType.H265 ? CodeType.CODE265 : CodeType.CODE264).setIsNeedViewInfo(aVar.f73280m).setInlineScene(aVar.f73288u).setSecurityLevel(securityLevelForNumber).setMaterialNo(aVar.f73289v).setSceneControl(SceneControl.newBuilder().setFavPlaylist(aVar.f73284q).setSmallWindow(aVar.f73285r).setPip(aVar.f73286s).setWasHeInline(aVar.f73287t).setIsNeedTrial(aVar.f73281n).build()).setSeasonId(aVar.f73290w).setDataControl(DataControl.newBuilder().setNeedWatchProgress(aVar.f73291x).build());
        long j7 = aVar.f73279l;
        if (j7 != 0) {
            dataControl.setRoomId(j7);
        }
        return PlayurlMossKtxKt.suspendPlayView(new PlayURLMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null), dataControl.build(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull com.bilibili.ogvcommon.play.resolver.i.a r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            r0 = r7
            boolean r0 = r0 instanceof com.bilibili.ogvcommon.play.resolver.PgcPlayUrlRpcWrapper$requestPlayView$1
            if (r0 == 0) goto L2b
            r0 = r7
            com.bilibili.ogvcommon.play.resolver.PgcPlayUrlRpcWrapper$requestPlayView$1 r0 = (com.bilibili.ogvcommon.play.resolver.PgcPlayUrlRpcWrapper$requestPlayView$1) r0
            r9 = r0
            r0 = r9
            int r0 = r0.label
            r8 = r0
            r0 = r8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2b
            r0 = r9
            r1 = r8
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r9
            r7 = r0
            goto L35
        L2b:
            com.bilibili.ogvcommon.play.resolver.PgcPlayUrlRpcWrapper$requestPlayView$1 r0 = new com.bilibili.ogvcommon.play.resolver.PgcPlayUrlRpcWrapper$requestPlayView$1
            r1 = r0
            r2 = r5
            r3 = r7
            r1.<init>(r2, r3)
            r7 = r0
        L35:
            r0 = r7
            java.lang.Object r0 = r0.result
            r9 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r10 = r0
            r0 = r7
            int r0 = r0.label
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L68
            r0 = r8
            r1 = 1
            if (r0 != r1) goto L5d
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L59
            r0 = r9
            r6 = r0
            goto L88
        L59:
            r6 = move-exception
            goto L93
        L5d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L68:
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L59
            r9 = r0
            r0 = r7
            r1 = 1
            r0.label = r1     // Catch: java.lang.Throwable -> L59
            r0 = r6
            r1 = r7
            java.lang.Object r0 = a(r0, r1)     // Catch: java.lang.Throwable -> L59
            r7 = r0
            r0 = r7
            r6 = r0
            r0 = r7
            r1 = r10
            if (r0 != r1) goto L88
            r0 = r10
            return r0
        L88:
            r0 = r6
            com.bapis.bilibili.pgc.gateway.player.v2.PlayViewReply r0 = (com.bapis.bilibili.pgc.gateway.player.v2.PlayViewReply) r0     // Catch: java.lang.Throwable -> L59
            java.lang.Object r0 = kotlin.Result.constructor-impl(r0)     // Catch: java.lang.Throwable -> L59
            r6 = r0
            goto L9f
        L93:
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            r7 = r0
            r0 = r6
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.constructor-impl(r0)
            r6 = r0
        L9f:
            r0 = r6
            java.lang.Throwable r0 = kotlin.Result.exceptionOrNull-impl(r0)
            r7 = r0
            r0 = r7
            if (r0 == 0) goto Lb4
            r0 = r7
            boolean r0 = r0 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto Lb2
            goto Lb4
        Lb2:
            r0 = r7
            throw r0
        Lb4:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogvcommon.play.resolver.i.b(com.bilibili.ogvcommon.play.resolver.i$a, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
