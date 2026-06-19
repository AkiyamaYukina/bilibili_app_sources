package com.bilibili.ship.theseus.cheese.player.play;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.app.playerunite.pugvanymodel.ButtonStyle;
import com.bapis.bilibili.app.playerunite.pugvanymodel.PUGVAnyModel;
import com.bapis.bilibili.app.playerunite.pugvanymodel.PlayLimitCode;
import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bilibili.lib.media.resource.ExtraInfo;
import com.bilibili.lib.moss.util.any.AnyKt;
import com.bilibili.player.tangram.basic.WithVideoProgress;
import com.bilibili.ship.theseus.united.page.error.b;
import com.bilibili.ship.theseus.united.player.mediaplay.p;
import com.google.protobuf.InvalidProtocolBufferException;
import ev0.i;
import hu0.C7503a;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.Deferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vv0.d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/play/a.class */
@StabilityInferred(parameters = 0)
public final class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.cheese.player.playposition.a f90715a;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.play.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/play/a$a.class */
    public static final /* synthetic */ class C0667a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f90716a;

        static {
            int[] iArr = new int[PlayLimitCode.values().length];
            try {
                iArr[PlayLimitCode.PLC_DRM_NOT_LOGIN.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            f90716a = iArr;
        }
    }

    @Inject
    public a(@NotNull com.bilibili.ship.theseus.cheese.player.playposition.a aVar) {
        this.f90715a = aVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // com.bilibili.ship.theseus.united.player.mediaplay.p
    @Nullable
    public final Object a(@Nullable i iVar, @NotNull Deferred<PlayViewUniteReply> deferred, @NotNull WithVideoProgress withVideoProgress, @NotNull Continuation<? super Unit> continuation) throws NoWhenBranchMatchedException {
        Object objB = this.f90715a.b(iVar, deferred, withVideoProgress, (SuspendLambda) continuation);
        return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : Unit.INSTANCE;
    }

    @Override // com.bilibili.ship.theseus.united.player.mediaplay.p
    @NotNull
    public final ExtraInfo b(@NotNull PlayViewUniteReply playViewUniteReply) {
        PUGVAnyModel defaultInstance;
        ExtraInfo extraInfoB = super.b(playViewUniteReply);
        try {
            defaultInstance = (PUGVAnyModel) AnyKt.unpack(playViewUniteReply.getSupplement(), PUGVAnyModel.class);
        } catch (InvalidProtocolBufferException e7) {
            defaultInstance = PUGVAnyModel.getDefaultInstance();
        }
        extraInfoB.setTag-pIAwiHE(C7503a.f121482a.a, C7503a.a(defaultInstance));
        extraInfoB.setTag-pIAwiHE(d.f128454b.a, playViewUniteReply.hasFragmentVideo() ? playViewUniteReply.getFragmentVideo() : null);
        if (defaultInstance.hasPlayLimit()) {
            PlayLimitCode code = defaultInstance.getPlayLimit().getCode();
            if ((code == null ? -1 : C0667a.f90716a[code.ordinal()]) == 1) {
                ExtraInfo.PlayLimit.PlayLimitButton playLimitButton = null;
                if (defaultInstance.getPlayLimit().hasButton()) {
                    ButtonStyle button = defaultInstance.getPlayLimit().getButton();
                    playLimitButton = new ExtraInfo.PlayLimit.PlayLimitButton(button.getText(), button.getTextColor(), button.getBgColor(), button.getJumpLink());
                }
                extraInfoB.setTag-pIAwiHE(d.f128458f.a, new b.e(defaultInstance.getPlayLimit().getMessage(), playLimitButton, defaultInstance.getPlayLimit().getCodeValue()));
            }
        }
        return extraInfoB;
    }
}
