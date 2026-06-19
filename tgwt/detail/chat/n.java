package com.bilibili.tgwt.detail.chat;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;
import com.bilibili.chatroomsdk.ChatRoomMember;
import com.bilibili.chatroomsdk.ChatRoomMemberOfficial;
import com.bilibili.chatroomsdk.ChatRoomMemberVip;
import com.bilibili.lib.theme.R$color;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.bili.widget.PendantAvatarFrameLayout;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/detail/chat/n.class */
@StabilityInferred(parameters = 0)
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f111082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ObservableBoolean f111083b = new ObservableBoolean();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ObservableField<PendantAvatarFrameLayout.ShowParams> f111084c = new ObservableField<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ObservableField<Drawable> f111085d = new ObservableField<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ObservableField<String> f111086e = new ObservableField<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final ObservableInt f111087f = new ObservableInt();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/detail/chat/n$a.class */
    public static final class a {
        @NotNull
        public static n a(@NotNull Context context, @NotNull ChatRoomMember chatRoomMember, boolean z6) {
            n nVar = new n();
            PendantAvatarFrameLayout.ShowParams showParamsAvatarImgUrl = new PendantAvatarFrameLayout.ShowParams().defaultAvatar(2131233999).avatarImgUrl(chatRoomMember.getFace());
            ChatRoomMemberOfficial official = chatRoomMember.getOfficial();
            Integer numValueOf = null;
            Integer numValueOf2 = official != null ? Integer.valueOf(official.getType()) : null;
            ChatRoomMemberVip vip = chatRoomMember.getVip();
            if (vip != null) {
                numValueOf = Integer.valueOf(vip.getAvatarSubscript());
            }
            int i7 = (numValueOf2 != null && numValueOf2.intValue() == 0) ? 2131234432 : (numValueOf2 != null && numValueOf2.intValue() == 1) ? 2131234426 : (numValueOf != null && numValueOf.intValue() == 1) ? 2131233652 : (numValueOf != null && numValueOf.intValue() == 2) ? 2131233651 : -1;
            if (i7 != -1) {
                showParamsAvatarImgUrl.badgeImgRes(i7);
            } else {
                showParamsAvatarImgUrl.badgeShow(false);
            }
            if (z6 || chatRoomMember.isProjectionistMember() || chatRoomMember.isGuestMember()) {
                showParamsAvatarImgUrl.mode(2).pendantRes(2131240702);
            } else {
                showParamsAvatarImgUrl.mode(1);
            }
            boolean zIsProjectionistMember = chatRoomMember.isProjectionistMember();
            ObservableField<Drawable> observableField = nVar.f111085d;
            if (zIsProjectionistMember) {
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{-10461185, -42039});
                gradientDrawable.setCornerRadius(Uj0.c.a(7.0f, context));
                gradientDrawable.setStroke(Uj0.c.b(0.5f, context), ContextCompat.getColor(context, R$color.f64616Wh0));
                observableField.set(gradientDrawable);
            } else if (chatRoomMember.isGuestMember()) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setColor(ContextCompat.getColor(context, R$color.Pi5));
                gradientDrawable2.setCornerRadius(Uj0.c.a(7.0f, context));
                gradientDrawable2.setStroke(Uj0.c.b(0.5f, context), ContextCompat.getColor(context, R$color.f64616Wh0));
                observableField.set(gradientDrawable2);
            }
            nVar.f111086e.set(chatRoomMember.getRole());
            nVar.f111084c.set(showParamsAvatarImgUrl);
            nVar.f111082a = chatRoomMember.getMid();
            nVar.f111087f.set(chatRoomMember.getType());
            nVar.f111083b.set(z6);
            return nVar;
        }
    }

    @NotNull
    public final ObservableInt a() {
        return this.f111087f;
    }
}
