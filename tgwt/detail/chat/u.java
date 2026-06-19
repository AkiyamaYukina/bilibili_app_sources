package com.bilibili.tgwt.detail.chat;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.opus.lightpublish.page.comment.z;
import com.bilibili.bangumi.logic.page.detail.service.refactor.BangumiPopFragmentService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.NewSeasonService;
import com.bilibili.chatroom.vo.ChatMessageVo;
import com.bilibili.chatroomsdk.Announcement;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.okretro.call.json.JsonUtilKt;
import com.bilibili.tgwt.service.ChatService;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import lV.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/detail/chat/u.class */
@StabilityInferred(parameters = 0)
public final class u extends androidx.databinding.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final BangumiPopFragmentService f111143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final NewSeasonService f111144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ChatService f111145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final z f111146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f111147e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final m f111148f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final m f111149g;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public String f111150i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final s f111151j = new s(this);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final t f111152k = new t(this);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public String f111153l = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f111154m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f111155n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public Announcement f111156o;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/detail/chat/u$a.class */
    public static final class a extends TypeToken<ChatMessageVo> {
    }

    public u(@NotNull Context context, @NotNull BangumiPopFragmentService bangumiPopFragmentService, @NotNull NewSeasonService newSeasonService, @NotNull ChatService chatService, @NotNull z zVar) {
        this.f111143a = bangumiPopFragmentService;
        this.f111144b = newSeasonService;
        this.f111145c = chatService;
        this.f111146d = zVar;
        float f7 = 70;
        this.f111148f = new m(context, true, Uj0.c.b(f7, context));
        this.f111149g = new m(context, true, Uj0.c.b(f7, context));
    }

    public final void m(@NotNull Context context) {
        ChatService chatService = this.f111145c;
        Neurons.reportClick(false, "pgc.watch-together-cinema-voice.top-bar.notice.click", chatService.f111870S);
        Announcement announcement = this.f111156o;
        if (announcement == null) {
            return;
        }
        ChatMessageVo chatMessageVo = (ChatMessageVo) JsonUtilKt.parseJson(announcement.getContent(), new a().getType());
        b.a aVar = new b.a(context);
        aVar.g = false;
        aVar.f = false;
        aVar.c = this.f111156o.getTitle();
        String str = chatMessageVo.a;
        aVar.h = chatMessageVo.b();
        aVar.b = str;
        aVar.d = context.getString(2131836250);
        aVar.e = null;
        aVar.a().show();
        Neurons.reportExposure$default(false, "pgc.watch-together-cinema-voice.notice.0.show", chatService.f111870S, (List) null, 8, (Object) null);
    }
}
