package com.bilibili.ship.theseus.ugc.intro.ugcheadline;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.Button;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alipay.alipaysecuritysdk.common.config.Constant;
import com.bilibili.api.BiliApiException;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcHeadlineService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.ui.main2.W;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/i.class */
@StabilityInferred(parameters = 0)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f97333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final UgcHeadlineService.c f97334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public k f97335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final h f97336d = new DialogInterface.OnDismissListener(this) { // from class: com.bilibili.ship.theseus.ugc.intro.ugcheadline.h

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f97332a;

        {
            this.f97332a = this;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            r rVar;
            UgcHeadlineService.c cVar = this.f97332a.f97334b;
            if (cVar == null || (rVar = (r) cVar.f97263a.element) == null) {
                return;
            }
            rVar.b();
        }
    };

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/i$a.class */
    public final class a implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f97337a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final g f97338b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final int[] f97339c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f97340d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public Button f97341e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final i f97342f;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcheadline.i$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/i$a$a.class */
        public static final class C0861a extends BiliApiDataCallback<Void> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final i f97343b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final a f97344c;

            public C0861a(i iVar, a aVar) {
                this.f97343b = iVar;
                this.f97344c = aVar;
            }

            @Override // com.bilibili.okretro.BiliApiDataCallback
            public final void onDataSuccess(Void r42) {
                i iVar = this.f97343b;
                iVar.getClass();
                this.f97344c.f97338b.f97331f = true;
                ToastHelper.showToastShort(iVar.f97333a, 2131846155);
            }

            @Override // com.bilibili.okretro.BiliApiCallback
            public final void onError(Throwable th) {
                i iVar = this.f97343b;
                iVar.getClass();
                String string = iVar.f97333a.getString(2131851571);
                if (th instanceof BiliApiException) {
                    String message = th.getMessage();
                    String str = message;
                    if (message == null) {
                        str = "";
                    }
                    string = str;
                }
                ToastHelper.showToastShort(iVar.f97333a, string);
            }
        }

        public a(i iVar, @NotNull long j7, @NotNull g gVar, int[] iArr) {
            this.f97342f = iVar;
            this.f97337a = j7;
            this.f97338b = gVar;
            this.f97339c = iArr;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(@NotNull DialogInterface dialogInterface, int i7) {
            if (i7 == -1) {
                if (this.f97340d == 0) {
                    ToastHelper.showToastShort(this.f97342f.f97333a, 2131847156);
                    return;
                }
                this.f97342f.getClass();
                ((qh1.a) ServiceGenerator.createService(qh1.a.class)).reportTag(BiliAccounts.get(this.f97342f.f97333a).getAccessKey(), this.f97337a, this.f97338b.f97326a, this.f97342f.f97333a.getString(this.f97340d)).enqueue(new C0861a(this.f97342f, this));
                k kVar = this.f97342f.f97335c;
                if (kVar != null) {
                    kVar.dismiss();
                    return;
                }
                return;
            }
            if (i7 >= 0) {
                int[] iArr = this.f97339c;
                if (i7 < 4) {
                    this.f97340d = iArr[i7];
                    Button button = this.f97341e;
                    if (button != null) {
                        button.setEnabled(true);
                    }
                    int i8 = sh1.l.a;
                    Neurons.reportClick(true, "player.ugc-video-detail.tag.tag.click", W.a("tag_id", String.valueOf(this.f97338b.f97326a), Constant.IN_KEY_REASON, String.valueOf(i7 + 1)));
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.bilibili.ship.theseus.ugc.intro.ugcheadline.h] */
    public i(@NotNull Context context, @Nullable UgcHeadlineService.c cVar) {
        this.f97333a = context;
        this.f97334b = cVar;
    }
}
