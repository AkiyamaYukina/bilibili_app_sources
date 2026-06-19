package com.bilibili.tgwt.player.widget;

import DD0.p0;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import com.bilibili.app.gemini.ui.DataBindingComponent;
import com.bilibili.bangumi.logic.page.detail.service.BangumiPlayerContainerService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.NewShareService;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.tgwt.chatroom.ChatRoomManagerService;
import com.bilibili.tgwt.detail.chat.m;
import com.bilibili.tgwt.im.ui.v;
import com.bilibili.tgwt.service.ChatService;
import com.bilibili.tgwt.service.ChatVoiceRtcService;
import javax.inject.Inject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/widget/f.class */
@StabilityInferred(parameters = 0)
public final class f extends DataBindingComponent<p0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ChatRoomManagerService f111805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ChatVoiceRtcService f111806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ChatService f111807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final NewShareService f111808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final BangumiPlayerContainerService f111809e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final com.bilibili.tgwt.detail.chat.m f111810f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.bilibili.tgwt.detail.chat.m f111811g;

    @Nullable
    public ValueAnimator h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f111812i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f111813j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f111814k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final a f111815l = new a(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/widget/f$a.class */
    public static final class a implements m.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f111816a;

        public a(f fVar) {
            this.f111816a = fVar;
        }

        @Override // com.bilibili.tgwt.detail.chat.m.a
        public final void a(Context context) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            f fVar = this.f111816a;
            if (jCurrentTimeMillis - fVar.f111814k >= 1000) {
                fVar.f111814k = jCurrentTimeMillis;
                Neurons.reportClick(false, "pgc.watch-together-player-voice.side-bar.share.click", fVar.f111807c.f111870S);
                new v(context, "ogv_video_detail_together_watch_full_pic_share", fVar.f111808d).show();
            }
        }

        @Override // com.bilibili.tgwt.detail.chat.m.a
        public final void b(long j7) {
        }
    }

    @Inject
    public f(@NotNull Context context, @NotNull ChatRoomManagerService chatRoomManagerService, @NotNull ChatVoiceRtcService chatVoiceRtcService, @NotNull ChatService chatService, @NotNull NewShareService newShareService, @NotNull BangumiPlayerContainerService bangumiPlayerContainerService) {
        this.f111805a = chatRoomManagerService;
        this.f111806b = chatVoiceRtcService;
        this.f111807c = chatService;
        this.f111808d = newShareService;
        this.f111809e = bangumiPlayerContainerService;
        float f7 = 32;
        this.f111810f = new com.bilibili.tgwt.detail.chat.m(context, false, Uj0.c.b(f7, context));
        this.f111811g = new com.bilibili.tgwt.detail.chat.m(context, false, Uj0.c.b(f7, context));
    }

    public final ViewDataBinding d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return p0.inflate(layoutInflater, viewGroup, false);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull DD0.p0 r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws kotlin.KotlinNothingValueException {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tgwt.player.widget.f.b(DD0.p0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
