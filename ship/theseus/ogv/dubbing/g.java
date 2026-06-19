package com.bilibili.ship.theseus.ogv.dubbing;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.pgc.gateway.player.v2.PlayDubbingInfo;
import com.bilibili.bililive.room.ui.roomv3.guard.GuardOpenGuideDialogFragment;
import com.bilibili.ship.theseus.ogv.dubbing.m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zu0.S0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/dubbing/g.class */
@StabilityInferred(parameters = 0)
public final class g extends Wj0.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final q f91851k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f91852l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final PlayDubbingInfo f91853m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public S0 f91854n;

    public g(@NotNull Context context, @NotNull q qVar, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull PlayDubbingInfo playDubbingInfo) {
        super(context);
        this.f91851k = qVar;
        this.f91852l = cVar;
        this.f91853m = playDubbingInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final View onCreateView() {
        S0 s0Inflate = S0.inflate(LayoutInflater.from(getContext()), null, false);
        this.f91854n = s0Inflate;
        S0 s02 = s0Inflate;
        if (s0Inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            s02 = null;
        }
        s02.f130564x.f130554w.setOnClickListener(new Ug.a(this, 2));
        S0 s03 = this.f91854n;
        S0 s04 = s03;
        if (s03 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            s04 = null;
        }
        final int i7 = 0;
        s04.f130566z.setOnClickListener(new View.OnClickListener(this, i7) { // from class: com.bilibili.ship.theseus.ogv.dubbing.f

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f91849a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f91850b;

            {
                this.f91849a = i7;
                this.f91850b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (this.f91849a) {
                    case 0:
                        ((g) this.f91850b).dismiss();
                        break;
                    default:
                        GuardOpenGuideDialogFragment.if((GuardOpenGuideDialogFragment) this.f91850b);
                        break;
                }
            }
        });
        S0 s05 = this.f91854n;
        S0 s06 = s05;
        if (s05 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            s06 = null;
        }
        s06.q(m.a.a(getContext(), this.f91851k, !this.f91852l.h().f102987a, this.f91853m));
        S0 s07 = this.f91854n;
        if (s07 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            s07 = null;
        }
        return s07.getRoot();
    }

    public final void setUiBeforeShow() {
    }
}
