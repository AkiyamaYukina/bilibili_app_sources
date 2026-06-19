package com.bilibili.tgwt.detail.chat;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;
import com.bilibili.bangumi.module.chatroom.ChatRoomConfig;
import com.bilibili.bangumi.module.chatroom.ChatRoomFateLabel;
import com.bilibili.chatroom.widget.userDialog.ChatUserFollowStatus;
import com.bilibili.chatroomsdk.AnimState;
import com.bilibili.chatroomsdk.ChatRoomMember;
import com.bilibili.chatroomsdk.ChatRoomMemberOfficial;
import com.bilibili.chatroomsdk.ChatRoomMemberVip;
import com.bilibili.chatroomsdk.SurpriseEvent;
import com.bilibili.lib.image2.bean.ImageLoadingListener;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.okretro.call.json.JsonUtilKt;
import com.bilibili.tgwt.chatroom.ChatRoomManagerService;
import com.bilibili.tgwt.detail.chat.p;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.PendantAvatarFrameLayout;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/detail/chat/p.class */
@StabilityInferred(parameters = 0)
public final class p extends androidx.databinding.a {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    @Nullable
    public ChatRoomConfig f111109U;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    @Nullable
    public SurpriseEvent f111111W;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    @Nullable
    public l f111114Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ChatRoomManagerService f111115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public v f111116b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f111121g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f111122i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap<Long, SurpriseEvent> f111117c = new LinkedHashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public List<n> f111118d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ObservableField<n> f111119e = new ObservableField<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final ObservableBoolean f111120f = new ObservableBoolean();

    @NotNull
    public final ObservableBoolean h = new ObservableBoolean();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final ObservableInt f111123j = new ObservableInt();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final ObservableField<Drawable> f111124k = new ObservableField<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final ObservableBoolean f111125l = new ObservableBoolean();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final ObservableField<String> f111126m = new ObservableField<>("");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final ObservableInt f111127n = new ObservableInt();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final ObservableField<String> f111128o = new ObservableField<>("");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final ObservableField<String> f111129p = new ObservableField<>("");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final ObservableInt f111130q = new ObservableInt();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final ObservableInt f111131r = new ObservableInt();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final ObservableInt f111132s = new ObservableInt();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final ObservableBoolean f111133t = new ObservableBoolean();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final ObservableField<String> f111134u = new ObservableField<>();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final ObservableField<ChatRoomMember> f111135v = new ObservableField<>();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final ObservableBoolean f111136w = new ObservableBoolean();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final ObservableField<PendantAvatarFrameLayout.ShowParams> f111137x = new ObservableField<>();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final ObservableField<PendantAvatarFrameLayout.ShowParams> f111138y = new ObservableField<>();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final ObservableField<PendantAvatarFrameLayout.ShowParams> f111139z = new ObservableField<>();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @NotNull
    public final ObservableField<PendantAvatarFrameLayout.ShowParams> f111089A = new ObservableField<>();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public final ObservableField<Typeface> f111090B = new ObservableField<>();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @NotNull
    public final ObservableField<List<ChatRoomFateLabel>> f111091C = new ObservableField<>();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @NotNull
    public final ObservableField<List<ChatRoomFateLabel>> f111092D = new ObservableField<>();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @NotNull
    public final ObservableField<String> f111093E = new ObservableField<>();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @NotNull
    public final ObservableField<String> f111094F = new ObservableField<>();

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @NotNull
    public final ObservableField<String> f111095G = new ObservableField<>();

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @NotNull
    public final ObservableField<String> f111096H = new ObservableField<>();

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @NotNull
    public final ObservableField<List<String>> f111097I = new ObservableField<>();

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    @NotNull
    public final ObservableField<ChatUserFollowStatus> f111098J = new ObservableField<>();

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    @NotNull
    public final ObservableBoolean f111099K = new ObservableBoolean();

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    @NotNull
    public final ObservableBoolean f111100L = new ObservableBoolean(true);

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    @NotNull
    public final ObservableBoolean f111101M = new ObservableBoolean(true);

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    @NotNull
    public final ObservableBoolean f111102N = new ObservableBoolean(true);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    @NotNull
    public final ObservableField<String> f111103O = new ObservableField<>();

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    @NotNull
    public final ObservableField<String> f111104P = new ObservableField<>();

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    @NotNull
    public final ObservableField<ImageLoadingListener> f111105Q = new ObservableField<>();

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    @NotNull
    public final ObservableBoolean f111106R = new ObservableBoolean(true);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    @NotNull
    public final ObservableBoolean f111107S = new ObservableBoolean(false);

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    @NotNull
    public final ObservableField<String> f111108T = new ObservableField<>();

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    @NotNull
    public AnimState f111110V = AnimState.STOP;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    @NotNull
    public final o f111112X = new Function2(this) { // from class: com.bilibili.tgwt.detail.chat.o

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p f111088a;

        {
            this.f111088a = this;
        }

        public final Object invoke(Object obj, Object obj2) {
            Unit unit;
            SurpriseEvent surpriseEvent = (SurpriseEvent) obj;
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            String report = surpriseEvent != null ? surpriseEvent.getReport() : null;
            HashMap map = null;
            if (report != null) {
                if (report.length() == 0) {
                    map = null;
                } else {
                    map = null;
                    if (surpriseEvent != null) {
                        String report2 = surpriseEvent.getReport();
                        map = null;
                        if (report2 != null) {
                            map = (HashMap) JsonUtilKt.parseJson(report2, new p.a().getType());
                        }
                    }
                }
            }
            if (map != null) {
                Neurons.reportExposure$default(false, zBooleanValue ? "pgc.watch-together-fullscreen-cinema.chat-zone.surprise.show" : "pgc.watch-together-cinema.cinema-im.surprise.show", map, (List) null, 8, (Object) null);
            }
            AnimState animState = AnimState.STOP;
            p pVar = this.f111088a;
            pVar.m0(animState);
            ChatRoomManagerService chatRoomManagerService = pVar.f111115a;
            Collection collectionValues = ((EnumMap) chatRoomManagerService.f110897K).values();
            Boolean bool = Boolean.TRUE;
            if (collectionValues.contains(bool) || ((EnumMap) chatRoomManagerService.f110898L).values().contains(bool) || ((Number) chatRoomManagerService.f110930w.getValue()).intValue() > 0 || ((Number) chatRoomManagerService.f110931x.getValue()).intValue() > 0) {
                unit = Unit.INSTANCE;
            } else {
                Iterator<Map.Entry<Long, SurpriseEvent>> it = pVar.f111117c.entrySet().iterator();
                if (it.hasNext()) {
                    Map.Entry<Long, SurpriseEvent> next = it.next();
                    pVar.l0(next.getValue());
                    pVar.m0(AnimState.START);
                    pVar.f111117c.remove(next.getKey());
                }
                unit = Unit.INSTANCE;
            }
            return unit;
        }
    };

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    @NotNull
    public final ObservableField<MD0.b> f111113Y = new ObservableField<>();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/detail/chat/p$a.class */
    public static final class a extends TypeToken<HashMap<String, String>> {
    }

    /* JADX WARN: Type inference failed for: r1v45, types: [com.bilibili.tgwt.detail.chat.o] */
    public p(ChatRoomManagerService chatRoomManagerService, v vVar) {
        this.f111115a = chatRoomManagerService;
        this.f111116b = vVar;
    }

    @NotNull
    public static PendantAvatarFrameLayout.ShowParams k0(@Nullable ChatRoomMember chatRoomMember, boolean z6) {
        ChatRoomMemberOfficial official;
        PendantAvatarFrameLayout.ShowParams showParamsAvatarImgUrl = new PendantAvatarFrameLayout.ShowParams().defaultAvatar(2131233999).avatarImgUrl(chatRoomMember != null ? chatRoomMember.getFace() : null);
        if (z6) {
            Integer numValueOf = (chatRoomMember == null || (official = chatRoomMember.getOfficial()) == null) ? null : Integer.valueOf(official.getType());
            Integer numValueOf2 = null;
            if (chatRoomMember != null) {
                ChatRoomMemberVip vip = chatRoomMember.getVip();
                numValueOf2 = null;
                if (vip != null) {
                    numValueOf2 = Integer.valueOf(vip.getAvatarSubscript());
                }
            }
            int i7 = (numValueOf != null && numValueOf.intValue() == 0) ? 2131234432 : (numValueOf != null && numValueOf.intValue() == 1) ? 2131234426 : (numValueOf2 != null && numValueOf2.intValue() == 1) ? 2131233652 : (numValueOf2 != null && numValueOf2.intValue() == 2) ? 2131233651 : -1;
            if (i7 != -1) {
                showParamsAvatarImgUrl.badgeImgRes(i7);
            } else {
                showParamsAvatarImgUrl.badgeShow(false);
            }
        } else {
            showParamsAvatarImgUrl.badgeShow(false);
        }
        showParamsAvatarImgUrl.mode(2).pendantRes(2131240661);
        return showParamsAvatarImgUrl;
    }

    @NotNull
    public final ObservableField<String> A() {
        return this.f111128o;
    }

    @NotNull
    public final ObservableField<PendantAvatarFrameLayout.ShowParams> B() {
        return this.f111139z;
    }

    @NotNull
    public final ObservableField<PendantAvatarFrameLayout.ShowParams> D() {
        return this.f111137x;
    }

    @NotNull
    public final ObservableField<ChatRoomMember> F() {
        return this.f111135v;
    }

    @NotNull
    public final Function2<SurpriseEvent, Boolean, Unit> G() {
        return this.f111112X;
    }

    @NotNull
    public final ObservableField<PendantAvatarFrameLayout.ShowParams> H() {
        return this.f111089A;
    }

    @NotNull
    public final ObservableField<PendantAvatarFrameLayout.ShowParams> I() {
        return this.f111138y;
    }

    @NotNull
    public final ObservableBoolean J() {
        return this.f111136w;
    }

    @NotNull
    public final ObservableField<String> K() {
        return this.f111104P;
    }

    @NotNull
    public final ObservableField<ImageLoadingListener> L() {
        return this.f111105Q;
    }

    @NotNull
    public final ObservableBoolean M() {
        return this.f111106R;
    }

    public final boolean O() {
        return this.f111121g;
    }

    @NotNull
    public final ObservableField<String> Q() {
        return this.f111108T;
    }

    @NotNull
    public final ObservableBoolean T() {
        return this.f111107S;
    }

    @NotNull
    public final ObservableBoolean U() {
        return this.f111120f;
    }

    @NotNull
    public final ObservableBoolean V() {
        return this.f111125l;
    }

    @NotNull
    public final ObservableInt X() {
        return this.f111123j;
    }

    @NotNull
    public final ObservableField<Drawable> Y() {
        return this.f111124k;
    }

    @Nullable
    public final MD0.a Z() {
        return this.f111114Z;
    }

    @NotNull
    public final ObservableField<List<ChatRoomFateLabel>> a0() {
        return this.f111091C;
    }

    @NotNull
    public final ObservableField<List<ChatRoomFateLabel>> b0() {
        return this.f111092D;
    }

    @NotNull
    public final ObservableField<String> c0() {
        return this.f111126m;
    }

    @NotNull
    public final ObservableField<List<String>> e0() {
        return this.f111097I;
    }

    @NotNull
    public final ObservableField<Typeface> g0() {
        return this.f111090B;
    }

    @NotNull
    public final ObservableField<MD0.b> i0() {
        return this.f111113Y;
    }

    public final void j0(@NotNull SurpriseEvent surpriseEvent) {
        AnimState animState = this.f111110V;
        AnimState animState2 = AnimState.START;
        if (animState == animState2) {
            this.f111117c.clear();
            this.f111117c.put(Long.valueOf(System.currentTimeMillis()), surpriseEvent);
            return;
        }
        ChatRoomManagerService chatRoomManagerService = this.f111115a;
        Collection collectionValues = ((EnumMap) chatRoomManagerService.f110897K).values();
        Boolean bool = Boolean.TRUE;
        if (collectionValues.contains(bool) || ((EnumMap) chatRoomManagerService.f110898L).values().contains(bool) || ((Number) chatRoomManagerService.f110930w.getValue()).intValue() > 0 || ((Number) chatRoomManagerService.f110931x.getValue()).intValue() > 0) {
            this.f111117c.clear();
            this.f111117c.put(Long.valueOf(System.currentTimeMillis()), surpriseEvent);
        } else if (this.f111117c.isEmpty()) {
            l0(surpriseEvent);
            m0(animState2);
        } else {
            this.f111117c.clear();
            this.f111117c.put(Long.valueOf(System.currentTimeMillis()), surpriseEvent);
        }
    }

    public final void l0(@Nullable SurpriseEvent surpriseEvent) {
        if (Intrinsics.areEqual(surpriseEvent, this.f111111W)) {
            return;
        }
        this.f111111W = surpriseEvent;
        notifyPropertyChanged(11);
    }

    @Nullable
    public final SurpriseEvent m() {
        return this.f111111W;
    }

    public final void m0(@NotNull AnimState animState) {
        if (Intrinsics.areEqual(animState, this.f111110V)) {
            return;
        }
        this.f111110V = animState;
        notifyPropertyChanged(12);
    }

    @NotNull
    public final AnimState n() {
        return this.f111110V;
    }

    @NotNull
    public final ObservableField<String> o() {
        return this.f111093E;
    }

    public final boolean q() {
        return this.f111122i;
    }

    @NotNull
    public final ObservableField<ChatUserFollowStatus> r() {
        return this.f111098J;
    }

    @NotNull
    public final ObservableBoolean s() {
        return this.f111099K;
    }

    @NotNull
    public final ObservableField<String> u() {
        return this.f111134u;
    }

    @NotNull
    public final ObservableField<String> v() {
        return this.f111096H;
    }

    @NotNull
    public final ObservableField<String> w() {
        return this.f111094F;
    }

    @NotNull
    public final ObservableField<String> z() {
        return this.f111095G;
    }
}
