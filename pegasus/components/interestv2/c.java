package com.bilibili.pegasus.components.interestv2;

import A50.o;
import A50.p;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ad.adview.pegasus.banner.adinline.i;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.accounts.subscribe.PassportObserver;
import com.bilibili.lib.accounts.subscribe.Topic;
import com.bilibili.module.account.LoginInterestExperiment;
import com.bilibili.pegasus.components.interestv2.host.AndroidInterestChooseSession;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.bili.interest.v2.entry.InterestChooseFailureCode;
import tv.danmaku.bili.interest.v2.entry.f;
import zh0.C9195b;
import zh0.InterfaceC9194a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interestv2/c.class */
@StabilityInferred(parameters = 0)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final o f77024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final p f77025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final b f77026c = new PassportObserver(this) { // from class: com.bilibili.pegasus.components.interestv2.b

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f77023a;

        {
            this.f77023a = this;
        }

        public final void onChange(Topic topic) {
            AndroidInterestChooseSession androidInterestChooseSession;
            Topic topic2 = Topic.SIGN_IN;
            if (topic == topic2) {
                c cVar = this.f77023a;
                BiliAccounts.get(((NewUserInterestChoosePluginV2) cVar.f77024a.b).getContext()).unsubscribe(cVar.f77026c, new Topic[]{topic2, Topic.SIGN_OUT});
                InterfaceC9194a interfaceC9194a = C9195b.f130326a;
                if (interfaceC9194a == null) {
                    return;
                }
                LoginInterestExperiment loginInterestExperimentF = interfaceC9194a.f();
                boolean zB = interfaceC9194a.b();
                i.b("dismissFlag = ", loginInterestExperimentF.name(), ", isNewUser = ", "[Interest]NewUserInterestChoosePluginV2", zB);
                if ((loginInterestExperimentF == LoginInterestExperiment.DismissInterest || (loginInterestExperimentF == LoginInterestExperiment.DismissInterestForOld && !zB)) && (androidInterestChooseSession = ((NewUserInterestChoosePluginV2) cVar.f77025b.b).f77015q) != null) {
                    tv.danmaku.bili.interest.v2.runtime.c cVar2 = androidInterestChooseSession.f77032f;
                    if (cVar2.a.b()) {
                        InterestChooseFailureCode interestChooseFailureCode = InterestChooseFailureCode.LOGIN_POPUP;
                        tv.danmaku.bili.interest.v2.entry.p pVar = cVar2.b.a;
                        if (pVar.p == null || pVar.q) {
                            return;
                        }
                        tv.danmaku.bili.interest.v2.entry.p.a(pVar, (f) null, interestChooseFailureCode, 1);
                    }
                }
            }
        }
    };

    /* JADX WARN: Type inference failed for: r1v2, types: [com.bilibili.pegasus.components.interestv2.b] */
    public c(@NotNull o oVar, @NotNull p pVar) {
        this.f77024a = oVar;
        this.f77025b = pVar;
    }
}
