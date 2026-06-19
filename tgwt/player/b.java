package com.bilibili.tgwt.player;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bangumi.ui.page.detail.playerV2.widget.quality.PGCPlayerQualitySwitchWidget;
import com.bilibili.ogv.infra.android.view.ViewTraversalKt;
import com.bilibili.playerbizcommonv2.widget.device.PlayerDateTextWidget;
import com.bilibili.tgwt.player.widget.ChatVoiceModeEmoticonWidget;
import javax.inject.Inject;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.ControlContainerConfig;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/b.class */
@StabilityInferred(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f111535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final rW0.b<PlayerDateTextWidget> f111536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final rW0.b<ChatVoiceModeEmoticonWidget> f111537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final rW0.b<PGCPlayerQualitySwitchWidget> f111538d;

    @Inject
    public b(@NotNull Context context, @NotNull rW0.b<PlayerDateTextWidget> bVar, @NotNull rW0.b<ChatVoiceModeEmoticonWidget> bVar2, @NotNull rW0.b<PGCPlayerQualitySwitchWidget> bVar3) {
        this.f111535a = context;
        this.f111536b = bVar;
        this.f111537c = bVar2;
        this.f111538d = bVar3;
    }

    public final void a(ControlContainerConfig controlContainerConfig, final int i7) {
        controlContainerConfig.setLayoutView(new Function0(this, i7) { // from class: com.bilibili.tgwt.player.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f111533a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f111534b;

            {
                this.f111533a = this;
                this.f111534b = i7;
            }

            public final Object invoke() {
                b bVar = this.f111533a;
                View viewInflate = LayoutInflater.from(bVar.f111535a).inflate(this.f111534b, (ViewGroup) null, false);
                for (View view : ViewTraversalKt.b(viewInflate)) {
                    if (view instanceof PlayerDateTextWidget) {
                        bVar.f111536b.injectMembers(view);
                    } else if (view instanceof ChatVoiceModeEmoticonWidget) {
                        bVar.f111537c.injectMembers(view);
                    } else if (view instanceof PGCPlayerQualitySwitchWidget) {
                        bVar.f111538d.injectMembers(view);
                    }
                }
                return (ViewGroup) viewInflate;
            }
        });
    }
}
