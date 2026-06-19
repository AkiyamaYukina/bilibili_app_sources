package com.bilibili.ship.theseus.cheese.player.playposition;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.player.tangram.basic.WithVideoProgress;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.united.player.mediaplay.f;
import ev0.i;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.IToastService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/playposition/a.class */
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f90727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final IToastService f90728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final f f90729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final d f90730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final IPlayerCoreService f90731e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final h f90732f;

    @Inject
    public a(@NotNull CoroutineScope coroutineScope, @NotNull IToastService iToastService, @NotNull f fVar, @NotNull d dVar, @NotNull IPlayerCoreService iPlayerCoreService, @NotNull h hVar) {
        this.f90727a = coroutineScope;
        this.f90728b = iToastService;
        this.f90729c = fVar;
        this.f90730d = dVar;
        this.f90731e = iPlayerCoreService;
        this.f90732f = hVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:0|2|(2:4|(1:6)(1:8))(0)|9|(2:11|(2:13|(2:15|(3:17|55|(2:57|58)(4:59|(4:61|(1:63)(1:64)|65|(3:71|72|(9:80|81|(1:83)(1:84)|85|(4:128|(1:130)(1:131)|132|(2:134|(2:136|(3:144|145|(2:155|156)(3:151|(0)|156))(4:140|(0)|145|(3:147|155|156)(0)))(2:157|(6:159|(1:163)|164|(2:166|(4:168|(1:170)|125|127))|126|127)(0))))(2:89|(2:111|(6:113|(1:117)|118|(2:120|(4:122|(1:124)|125|127))|126|127)(0))(2:93|(4:95|(1:99)|100|(2:108|109)(3:104|(0)|109))(0)))|171|(1:173)(1:174)|175|(2:177|178)(3:179|(1:181)(1:183)|184))(6:78|(0)|81|(0)(0)|85|(9:87|128|(0)(0)|132|(0)|171|(0)(0)|175|(0)(0))(0)))(4:69|(0)|72|(6:74|80|81|(0)(0)|85|(0)(0))(0)))(1:185)|186|187))(2:18|19))(14:20|188|30|33|(1:36)|37|(1:39)(1:41)|40|42|(1:44)|45|(1:47)(1:49)|50|(2:52|53)(3:54|55|(0)(0))))(1:21))(2:22|(2:24|25))|26|(2:28|29)|188|30|33|(0)|37|(0)(0)|40|42|(0)|45|(0)(0)|50|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0186, code lost:
    
        r27 = com.bapis.bilibili.app.playerunite.pugvanymodel.PUGVAnyModel.getDefaultInstance();
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.bilibili.player.tangram.basic.WithVideoProgress r13, long r14, kotlinx.coroutines.Deferred r16, boolean r17, kotlin.coroutines.jvm.internal.ContinuationImpl r18) {
        /*
            Method dump skipped, instruction units count: 1601
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.player.playposition.a.a(com.bilibili.player.tangram.basic.WithVideoProgress, long, kotlinx.coroutines.Deferred, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Nullable
    public final Object b(@Nullable i iVar, @NotNull Deferred deferred, @NotNull WithVideoProgress withVideoProgress, @NotNull SuspendLambda suspendLambda) throws NoWhenBranchMatchedException {
        defpackage.a.b("[theseus-cheese-CheeseEpStartPositionService-handleStartPosition] ", "handleStartPosition pos = " + (iVar != null ? Duration.box-impl(iVar.f117655a) : null) + ", accurate = " + (iVar != null ? Boxing.boxBoolean(iVar.f117656b) : null), "CheeseEpStartPositionService-handleStartPosition");
        if (iVar != null) {
            Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new CheeseEpStartPositionService$seekToLandingPosition$2(iVar, withVideoProgress, this, deferred, null), suspendLambda);
            if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objCoroutineScope = Unit.INSTANCE;
            }
            return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
        }
        f fVar = this.f90729c;
        if (!(fVar instanceof f.e) && !(fVar instanceof f.b) && !(fVar instanceof f.a)) {
            if (fVar instanceof f.c) {
                BLog.i("CheeseEpStartPositionService-handleStartPosition", "[theseus-cheese-CheeseEpStartPositionService-handleStartPosition] MediaPlayInitial.PlayViewPlay");
                Object objCoroutineScope2 = CoroutineScopeKt.coroutineScope(new CheeseEpStartPositionService$handlePlayViewPlayStart$2(deferred, withVideoProgress, this, null), suspendLambda);
                return objCoroutineScope2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope2 : Unit.INSTANCE;
            }
            if (!(fVar instanceof f.d)) {
                throw new NoWhenBranchMatchedException();
            }
            BLog.i("CheeseEpStartPositionService-handleStartPosition", "[theseus-cheese-CheeseEpStartPositionService-handleStartPosition] MediaPlayInitial.PlayableParamsPlay");
            Object objCoroutineScope3 = CoroutineScopeKt.coroutineScope(new CheeseEpStartPositionService$handlePlayableParamsPlayStart$2(((f.d) fVar).f104521a, deferred, withVideoProgress, this, null), suspendLambda);
            return objCoroutineScope3 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope3 : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(com.bilibili.player.tangram.basic.WithVideoProgress r7, long r8, long r10, long r12, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            r6 = this;
            r0 = r14
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.cheese.player.playposition.CheeseEpStartPositionService$seekToZero$1
            if (r0 == 0) goto L2f
            r0 = r14
            com.bilibili.ship.theseus.cheese.player.playposition.CheeseEpStartPositionService$seekToZero$1 r0 = (com.bilibili.ship.theseus.cheese.player.playposition.CheeseEpStartPositionService$seekToZero$1) r0
            r16 = r0
            r0 = r16
            int r0 = r0.label
            r15 = r0
            r0 = r15
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2f
            r0 = r16
            r1 = r15
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r16
            r14 = r0
            goto L3b
        L2f:
            com.bilibili.ship.theseus.cheese.player.playposition.CheeseEpStartPositionService$seekToZero$1 r0 = new com.bilibili.ship.theseus.cheese.player.playposition.CheeseEpStartPositionService$seekToZero$1
            r1 = r0
            r2 = r6
            r3 = r14
            r1.<init>(r2, r3)
            r14 = r0
        L3b:
            r0 = r14
            java.lang.Object r0 = r0.result
            r16 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r17 = r0
            r0 = r14
            int r0 = r0.label
            r15 = r0
            r0 = r15
            if (r0 == 0) goto L6b
            r0 = r15
            r1 = 1
            if (r0 != r1) goto L61
            r0 = r16
            kotlin.ResultKt.throwOnFailure(r0)
            goto Lb2
        L61:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L6b:
            r0 = r16
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r10
            r1 = r8
            long r0 = kotlin.time.Duration.minus-LRDsOJo(r0, r1)
            r1 = 5000(0x1388, float:7.006E-42)
            kotlin.time.DurationUnit r2 = kotlin.time.DurationUnit.MILLISECONDS
            long r1 = kotlin.time.DurationKt.toDuration(r1, r2)
            int r0 = kotlin.time.Duration.compareTo-LRDsOJo(r0, r1)
            if (r0 >= 0) goto Lb7
            java.lang.String r0 = "[theseus-cheese-CheeseEpStartPositionService-seekToZero-D9DMEZw] "
            java.lang.String r1 = "seek to zero: "
            r2 = r12
            java.lang.String r2 = kotlin.time.Duration.toString-impl(r2)
            java.lang.String r1 = androidx.compose.ui.text.font.C4496a.a(r1, r2)
            java.lang.String r2 = "CheeseEpStartPositionService-seekToZero-D9DMEZw"
            defpackage.a.b(r0, r1, r2)
            r0 = r14
            r1 = 1
            r0.label = r1
            r0 = r7
            r1 = r12
            r2 = 0
            r3 = r14
            java.lang.Object r0 = r0.c(r1, r2, r3)
            r1 = r17
            if (r0 != r1) goto Lb2
            r0 = r17
            return r0
        Lb2:
            r0 = 1
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
            return r0
        Lb7:
            r0 = 0
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.player.playposition.a.c(com.bilibili.player.tangram.basic.WithVideoProgress, long, long, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
