package com.bilibili.ship.theseus.ugc.play;

import Pj0.e;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.app.playerunite.ugcanymodel.ButtonStyle;
import com.bapis.bilibili.app.playerunite.ugcanymodel.PlayLimitCode;
import com.bapis.bilibili.app.playerunite.ugcanymodel.UGCAnyModel;
import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bapis.bilibili.playershared.ComprehensiveToast;
import com.bapis.bilibili.playershared.ToastType;
import com.bilibili.lib.media.resource.ExtraInfo;
import com.bilibili.lib.moss.util.any.AnyKt;
import com.bilibili.okretro.call.json.JsonUtilKt;
import com.bilibili.player.tangram.basic.WithVideoProgress;
import com.bilibili.ship.theseus.ugc.charge.ResidentBar;
import com.bilibili.ship.theseus.ugc.j;
import com.bilibili.ship.theseus.united.page.error.b;
import com.bilibili.ship.theseus.united.page.playviewextra.PlayerToastVo;
import com.bilibili.ship.theseus.united.player.mediaplay.p;
import com.google.gson.reflect.TypeToken;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import ev0.i;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Deferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/c.class */
@StabilityInferred(parameters = 0)
public final class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final j f98103a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/c$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f98104a;

        static {
            int[] iArr = new int[PlayLimitCode.values().length];
            try {
                iArr[PlayLimitCode.PLC_COMMON_CODE.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            f98104a = iArr;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/c$b.class */
    public static final class b extends TypeToken<PlayerToastVo> {
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.play.c$c, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/c$c.class */
    public static final class C0906c extends TypeToken<PlayerToastVo> {
    }

    @Inject
    public c(@NotNull j jVar) {
        this.f98103a = jVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // com.bilibili.ship.theseus.united.player.mediaplay.p
    @Nullable
    public final Object a(@Nullable i iVar, @NotNull Deferred<PlayViewUniteReply> deferred, @NotNull WithVideoProgress withVideoProgress, @NotNull Continuation<? super Unit> continuation) throws NoWhenBranchMatchedException {
        Object objC = this.f98103a.c(iVar, deferred, withVideoProgress, (SuspendLambda) continuation);
        return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : Unit.INSTANCE;
    }

    @Override // com.bilibili.ship.theseus.united.player.mediaplay.p
    @NotNull
    public final ExtraInfo b(@NotNull PlayViewUniteReply playViewUniteReply) {
        ResidentBar residentBar;
        UGCAnyModel defaultInstance;
        Object next;
        Object next2;
        ExtraInfo extraInfoB = super.b(playViewUniteReply);
        GeneratedMessageLite residentBar2 = playViewUniteReply.getViewInfo().getResidentBar();
        if (residentBar2.getDefaultInstanceForType() == residentBar2) {
            residentBar = null;
        } else {
            e.a aVar = e.f18940a;
            residentBar = (ResidentBar) JsonUtilKt.parseJson(new Pj0.d(residentBar2, true), new com.bilibili.ship.theseus.ugc.charge.d().getType());
        }
        extraInfoB.setTag-pIAwiHE(com.bilibili.ship.theseus.ugc.charge.c.f96438a.a, residentBar);
        try {
            defaultInstance = (UGCAnyModel) AnyKt.unpack(playViewUniteReply.getSupplement(), UGCAnyModel.class);
        } catch (InvalidProtocolBufferException e7) {
            defaultInstance = UGCAnyModel.getDefaultInstance();
        }
        extraInfoB.setTag-pIAwiHE(com.bilibili.ship.theseus.ugc.play.b.f98099a.a, defaultInstance);
        Iterator it = playViewUniteReply.getViewInfo().getToastsList().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ComprehensiveToast) next).getType() == ToastType.CHARGING_TOAST) {
                break;
            }
        }
        ComprehensiveToast comprehensiveToast = (ComprehensiveToast) next;
        extraInfoB.setTag-pIAwiHE(com.bilibili.ship.theseus.ugc.play.b.f98100b.a, comprehensiveToast != null ? (PlayerToastVo) JsonUtilKt.parseJson(e.a(comprehensiveToast), new b().getType()) : null);
        Iterator it2 = playViewUniteReply.getViewInfo().getToastsList().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (((ComprehensiveToast) next2).getType() == ToastType.NEW_USER_DEFINITION_REMIND) {
                break;
            }
        }
        ComprehensiveToast comprehensiveToast2 = (ComprehensiveToast) next2;
        extraInfoB.setTag-pIAwiHE(com.bilibili.ship.theseus.ugc.play.b.f98101c.a, comprehensiveToast2 != null ? (PlayerToastVo) JsonUtilKt.parseJson(e.a(comprehensiveToast2), new C0906c().getType()) : null);
        extraInfoB.setTag-pIAwiHE(com.bilibili.ship.theseus.ugc.play.b.f98102d.a, Boolean.valueOf(Intrinsics.areEqual(playViewUniteReply.getViewInfo().getExpSwitch().getExpAbMap().get("charging_auto"), "1")));
        if (defaultInstance.hasPlayLimit()) {
            PlayLimitCode code = defaultInstance.getPlayLimit().getCode();
            if ((code == null ? -1 : a.f98104a[code.ordinal()]) == 1) {
                ExtraInfo.PlayLimit.PlayLimitButton playLimitButton = null;
                if (defaultInstance.getPlayLimit().hasButton()) {
                    ButtonStyle button = defaultInstance.getPlayLimit().getButton();
                    playLimitButton = new ExtraInfo.PlayLimit.PlayLimitButton(button.getText(), button.getTextColor(), button.getBgColor(), button.getJumpLink());
                }
                extraInfoB.setTag-pIAwiHE(vv0.d.f128458f.a, new b.e(defaultInstance.getPlayLimit().getMessage(), playLimitButton, defaultInstance.getPlayLimit().getCodeValue()));
            }
        }
        return extraInfoB;
    }
}
