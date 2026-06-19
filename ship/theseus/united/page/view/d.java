package com.bilibili.ship.theseus.united.page.view;

import I.E;
import androidx.compose.animation.z;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import com.bapis.bilibili.account.service.v1.NameRender;
import com.bapis.bilibili.app.viewunite.common.AttentionRelationStatus;
import com.bapis.bilibili.app.viewunite.common.Live;
import com.bapis.bilibili.app.viewunite.common.Owner;
import com.bapis.bilibili.app.viewunite.common.Vip;
import com.bapis.bilibili.app.viewunite.common.VipLabel;
import com.bilibili.lib.accountinfo.model.VipUserInfo;
import java.util.List;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/view/d.class */
@StabilityInferred(parameters = 0)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f104054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final C8043a f104055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<a> f104056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final StateFlow<a> f104057d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/view/d$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f104058a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final o10.a f104059b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f104060c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f104061d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final String f104062e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final String f104063f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f104064g;

        @NotNull
        public final String h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public final String f104065i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public final String f104066j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final boolean f104067k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f104068l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @Nullable
        public final VipUserInfo f104069m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @Nullable
        public final String f104070n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @Nullable
        public final m f104071o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @NotNull
        public final List<Long> f104072p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        @Nullable
        public final NameRender f104073q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        @Nullable
        public final String f104074r;

        public a(long j7, @NotNull o10.a aVar, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j8, @NotNull String str5, @NotNull String str6, @NotNull String str7, boolean z6, boolean z7, @Nullable VipUserInfo vipUserInfo, @Nullable String str8, @Nullable m mVar, @NotNull List<Long> list, @Nullable NameRender nameRender, @Nullable String str9) {
            this.f104058a = j7;
            this.f104059b = aVar;
            this.f104060c = str;
            this.f104061d = str2;
            this.f104062e = str3;
            this.f104063f = str4;
            this.f104064g = j8;
            this.h = str5;
            this.f104065i = str6;
            this.f104066j = str7;
            this.f104067k = z6;
            this.f104068l = z7;
            this.f104069m = vipUserInfo;
            this.f104070n = str8;
            this.f104071o = mVar;
            this.f104072p = list;
            this.f104073q = nameRender;
            this.f104074r = str9;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f104058a == aVar.f104058a && Intrinsics.areEqual(this.f104059b, aVar.f104059b) && Intrinsics.areEqual(this.f104060c, aVar.f104060c) && Intrinsics.areEqual(this.f104061d, aVar.f104061d) && Intrinsics.areEqual(this.f104062e, aVar.f104062e) && Intrinsics.areEqual(this.f104063f, aVar.f104063f) && this.f104064g == aVar.f104064g && Intrinsics.areEqual(this.h, aVar.h) && Intrinsics.areEqual(this.f104065i, aVar.f104065i) && Intrinsics.areEqual(this.f104066j, aVar.f104066j) && this.f104067k == aVar.f104067k && this.f104068l == aVar.f104068l && Intrinsics.areEqual(this.f104069m, aVar.f104069m) && Intrinsics.areEqual(this.f104070n, aVar.f104070n) && Intrinsics.areEqual(this.f104071o, aVar.f104071o) && Intrinsics.areEqual(this.f104072p, aVar.f104072p) && Intrinsics.areEqual(this.f104073q, aVar.f104073q) && Intrinsics.areEqual(this.f104074r, aVar.f104074r);
        }

        public final int hashCode() {
            int iA = z.a(z.a(E.a(E.a(E.a(C3554n0.a(E.a(E.a(E.a(E.a((this.f104059b.hashCode() + (Long.hashCode(this.f104058a) * 31)) * 31, 31, this.f104060c), 31, this.f104061d), 31, this.f104062e), 31, this.f104063f), 31, this.f104064g), 31, this.h), 31, this.f104065i), 31, this.f104066j), 31, this.f104067k), 31, this.f104068l);
            VipUserInfo vipUserInfo = this.f104069m;
            int iHashCode = vipUserInfo == null ? 0 : vipUserInfo.hashCode();
            String str = this.f104070n;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            m mVar = this.f104071o;
            int iA2 = e0.a((((((iA + iHashCode) * 31) + iHashCode2) * 31) + (mVar == null ? 0 : mVar.hashCode())) * 31, 31, this.f104072p);
            NameRender nameRender = this.f104073q;
            int iHashCode3 = nameRender == null ? 0 : nameRender.hashCode();
            String str2 = this.f104074r;
            return ((iA2 + iHashCode3) * 31) + (str2 == null ? 0 : str2.hashCode());
        }

        @NotNull
        public final String toString() {
            List<Long> list = this.f104072p;
            StringBuilder sb = new StringBuilder("Author(mid=");
            sb.append(this.f104058a);
            sb.append(", avatar=");
            sb.append(this.f104059b);
            sb.append(", avatarUrl=");
            sb.append(this.f104060c);
            sb.append(", name=");
            sb.append(this.f104061d);
            sb.append(", nameUrl=");
            sb.append(this.f104062e);
            sb.append(", fans=");
            sb.append(this.f104063f);
            sb.append(", fansNum=");
            sb.append(this.f104064g);
            sb.append(", arcCount=");
            sb.append(this.h);
            sb.append(", seasonCount=");
            sb.append(this.f104065i);
            sb.append(", pubLocation=");
            sb.append(this.f104066j);
            sb.append(", followed=");
            sb.append(this.f104067k);
            sb.append(", guestFollowed=");
            sb.append(this.f104068l);
            sb.append(", vipInfo=");
            sb.append(this.f104069m);
            sb.append(", face=");
            sb.append(this.f104070n);
            sb.append(", live=");
            sb.append(this.f104071o);
            sb.append(", assists=");
            sb.append(list);
            sb.append(", nameRender=");
            sb.append(this.f104073q);
            sb.append(", handle=");
            return C8770a.a(sb, this.f104074r, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/view/d$b.class */
    public static final class b {
        @NotNull
        public static a a(@NotNull Owner owner) {
            VipUserInfo vipUserInfo;
            m mVar;
            long mid = owner.getMid();
            o10.a aVarA = r10.a.a(owner.getAvatar());
            String url = owner.getUrl();
            String title = owner.getTitle();
            String titleUrl = owner.getTitleUrl();
            String fans = owner.getFans();
            long fansNum = owner.getFansNum();
            String arcCount = owner.getArcCount();
            String seasonCount = owner.getSeasonCount();
            String pubLocation = owner.getPubLocation();
            boolean z6 = owner.getAttention() == 1;
            boolean z7 = true;
            if (owner.getAttentionRelation() != AttentionRelationStatus.ARS_FOLLOWME) {
                z7 = owner.getAttentionRelation() == AttentionRelationStatus.ARS_BUDDY;
            }
            if (owner.hasVip()) {
                Vip vip = owner.getVip();
                vipUserInfo = new VipUserInfo();
                vipUserInfo.setVipType(vip.getType());
                vipUserInfo.setVipStatus(vip.getVipStatus());
                vipUserInfo.setThemeType(vip.getThemeType());
                VipLabel label = vip.getLabel();
                VipUserInfo.VipLabel vipLabel = new VipUserInfo.VipLabel();
                vipLabel.setText(label.getText());
                vipLabel.setLabelTheme(label.getLabelTheme());
                vipUserInfo.setLabel(vipLabel);
            } else {
                vipUserInfo = null;
            }
            String face = owner.getFace();
            if (owner.hasLive()) {
                Live live = owner.getLive();
                mVar = new m(live.getMid(), live.getRoomId(), live.getUri(), live.getEndpageUri());
            } else {
                mVar = null;
            }
            return new a(mid, aVarA, url, title, titleUrl, fans, fansNum, arcCount, seasonCount, pubLocation, z6, z7, vipUserInfo, face, mVar, owner.getAssistsList(), owner.hasNameRender() ? owner.getNameRender() : null, owner.getHandle());
        }
    }

    @Inject
    public d(@NotNull CoroutineScope coroutineScope, @Nullable a aVar, @NotNull C8043a c8043a) {
        this.f104054a = coroutineScope;
        this.f104055b = c8043a;
        MutableStateFlow<a> MutableStateFlow = StateFlowKt.MutableStateFlow((Object) null);
        this.f104056c = MutableStateFlow;
        this.f104057d = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow.setValue(aVar);
        if (aVar != null) {
            com.bilibili.community.follow.f fVar = com.bilibili.community.follow.f.a;
            com.bilibili.community.follow.f.g(aVar.f104058a, aVar.f104067k);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(boolean r12, java.lang.String r13, java.lang.String r14, java.util.Map r15, kotlin.coroutines.jvm.internal.ContinuationImpl r16) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.view.d.a(boolean, java.lang.String, java.lang.String, java.util.Map, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001c  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String b() {
        /*
            r2 = this;
            r0 = r2
            kotlinx.coroutines.flow.MutableStateFlow<com.bilibili.ship.theseus.united.page.view.d$a> r0 = r0.f104056c
            java.lang.Object r0 = r0.getValue()
            com.bilibili.ship.theseus.united.page.view.d$a r0 = (com.bilibili.ship.theseus.united.page.view.d.a) r0
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L1c
            r0 = r3
            java.lang.String r0 = r0.f104070n
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L1f
        L1c:
            java.lang.String r0 = ""
            r3 = r0
        L1f:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.view.d.b():java.lang.String");
    }

    public final boolean c() {
        a aVar = (a) this.f104056c.getValue();
        if (aVar != null) {
            return aVar.f104068l;
        }
        return false;
    }

    public final boolean d() {
        a aVar = (a) this.f104056c.getValue();
        if (aVar != null) {
            return aVar.f104067k;
        }
        return false;
    }

    @Nullable
    public final m e() {
        a aVar = (a) this.f104056c.getValue();
        return aVar != null ? aVar.f104071o : null;
    }

    public final long f() {
        a aVar = (a) this.f104056c.getValue();
        return aVar != null ? aVar.f104058a : -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001c  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String g() {
        /*
            r2 = this;
            r0 = r2
            kotlinx.coroutines.flow.MutableStateFlow<com.bilibili.ship.theseus.united.page.view.d$a> r0 = r0.f104056c
            java.lang.Object r0 = r0.getValue()
            com.bilibili.ship.theseus.united.page.view.d$a r0 = (com.bilibili.ship.theseus.united.page.view.d.a) r0
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L1c
            r0 = r3
            java.lang.String r0 = r0.f104061d
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L1f
        L1c:
            java.lang.String r0 = ""
            r3 = r0
        L1f:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.view.d.g():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(@org.jetbrains.annotations.NotNull java.util.Map r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r9, boolean r10) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.view.d.h(java.util.Map, kotlin.coroutines.jvm.internal.ContinuationImpl, boolean):java.lang.Object");
    }

    public final void i(boolean z6) {
        a aVar;
        MutableStateFlow<a> mutableStateFlow = this.f104056c;
        a aVar2 = (a) mutableStateFlow.getValue();
        if (aVar2 != null) {
            aVar = new a(aVar2.f104058a, aVar2.f104059b, aVar2.f104060c, aVar2.f104061d, aVar2.f104062e, aVar2.f104063f, aVar2.f104064g, aVar2.h, aVar2.f104065i, aVar2.f104066j, z6, aVar2.f104068l, aVar2.f104069m, aVar2.f104070n, aVar2.f104071o, aVar2.f104072p, aVar2.f104073q, aVar2.f104074r);
        } else {
            aVar = null;
        }
        mutableStateFlow.setValue(aVar);
    }
}
