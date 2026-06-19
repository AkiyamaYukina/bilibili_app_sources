package com.bilibili.studio.editor.moudle.editormain.usecase.middlemodule;

import Dy0.D;
import Ex0.c;
import Ex0.n;
import Gy0.f;
import Gy0.i;
import Gy0.k;
import Gy0.l;
import Gy0.m;
import Jy0.a;
import Ky0.k0;
import Ty0.e;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import com.bilibili.biligame.widget.user.dialog.UserCardDialog;
import com.bilibili.bplus.imageeditor.filter.a;
import com.bilibili.gripper.api.ad.core.player.report.PlayerProgress;
import com.bilibili.studio.editor.moudle.editormain.uistate.bottomfragment.FragmentContainerModal;
import com.bilibili.studio.editor.moudle.editormain.usecase.middlemodule.MiddleControlUseCase;
import com.bilibili.studio.editor.timeline.backup.UpperEditorBackUpManager;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.util.EditorUsedFunctionUtil;
import com.mall.ui.page.shop.call.BuyerFragment;
import com.mall.ui.page.shop.call.VideoCallFragment;
import ez0.b;
import ez0.d;
import javax.inject.Inject;
import kntr.app.game.gamebind.bean.UnbindRoleItem;
import kntr.app.mall.product.details.page.vm.PageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.video.bilicardplayer.player.BiliCardPlayerScene;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/usecase/middlemodule/MiddleControlUseCase.class */
public final class MiddleControlUseCase extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final n f107183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final c f107184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final k0 f107185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final d f107186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ez0.a f107187e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Sy0.a f107188f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final ez0.c f107189g;

    @NotNull
    public final Wy0.d h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final b f107190i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final e f107191j = new e(this);

    @Inject
    public MiddleControlUseCase(@NotNull n nVar, @NotNull c cVar, @NotNull k0 k0Var, @NotNull d dVar, @NotNull ez0.a aVar, @NotNull Sy0.a aVar2, @NotNull ez0.c cVar2, @NotNull Wy0.d dVar2, @NotNull b bVar) {
        this.f107183a = nVar;
        this.f107184b = cVar;
        this.f107185c = k0Var;
        this.f107186d = dVar;
        this.f107187e = aVar;
        this.f107188f = aVar2;
        this.f107189g = cVar2;
        this.h = dVar2;
        this.f107190i = bVar;
    }

    public static void k(MiddleControlUseCase middleControlUseCase) {
        d dVar = middleControlUseCase.f107186d;
        dVar.e.setValue(m.a(dVar.c(), 0, true, 2131243525, null, 25));
    }

    public static /* synthetic */ void m(MiddleControlUseCase middleControlUseCase, Boolean bool, Boolean bool2, int i7) {
        if ((i7 & 1) != 0) {
            bool = null;
        }
        if ((i7 & 2) != 0) {
            bool2 = null;
        }
        middleControlUseCase.l(bool, bool2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [Ty0.b] */
    public final void i() {
        Ty0.a aVar = new Ty0.a(this, 0);
        d dVar = this.f107186d;
        dVar.h.setValue(Gy0.b.a(dVar.a(), 0, false, aVar, 3));
        final int i7 = 0;
        dVar.g.setValue(Gy0.c.a(dVar.b(), false, new Function0(this, i7) { // from class: Ty0.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f24393a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f24394b;

            {
                this.f24393a = i7;
                this.f24394b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final Object invoke() {
                View viewFindViewById = null;
                Object obj = this.f24394b;
                switch (this.f24393a) {
                    case 0:
                        MiddleControlUseCase middleControlUseCase = (MiddleControlUseCase) obj;
                        ez0.d dVar2 = middleControlUseCase.f107186d;
                        boolean z6 = !dVar2.b().f7455b;
                        dVar2.g.setValue(Gy0.c.a(dVar2.b(), z6, null, 5));
                        MutableLiveData mutableLiveData = middleControlUseCase.f107187e.d;
                        D d7 = (D) mutableLiveData.getValue();
                        D d8 = d7;
                        if (d7 == null) {
                            d8 = new D(false, FragmentContainerModal.MODAL_ALL);
                        }
                        mutableLiveData.setValue(new D(z6, d8.f3260b));
                        return Unit.INSTANCE;
                    case 1:
                        UserCardDialog.Companion companion = UserCardDialog.Companion;
                        w01.c.b("game-ball.author-id-card.game-character-card.bind-entry-card.show", v01.b.b((UnbindRoleItem) obj));
                        return Unit.INSTANCE;
                    case 2:
                        ((Function1) obj).invoke(a.a.b.a);
                        return Unit.INSTANCE;
                    case 3:
                        View view = ((VideoCallFragment) ((BuyerFragment) obj)).c;
                        if (view != null) {
                            viewFindViewById = view.findViewById(2131307156);
                        }
                        return viewFindViewById;
                    case 4:
                        ((PageViewModel) obj).f2.setValue(Boolean.FALSE);
                        return Unit.INSTANCE;
                    case 5:
                        return (ViewGroup) ((View) obj).findViewById(2131302585);
                    default:
                        mg1.e eVar = (mg1.e) obj;
                        BiliCardPlayerScene.CardPlayTask.Token token = eVar.d;
                        long duration = 0;
                        long currentPosition = token != null ? token.getCurrentPosition() : 0L;
                        BiliCardPlayerScene.CardPlayTask.Token token2 = eVar.d;
                        if (token2 != null) {
                            duration = token2.getDuration();
                        }
                        return new PlayerProgress(currentPosition, duration);
                }
            }
        }, 3));
        Ty0.c cVar = new Ty0.c(this, 0);
        MutableLiveData mutableLiveData = dVar.b;
        i iVar = (i) mutableLiveData.getValue();
        i iVar2 = iVar;
        if (iVar == null) {
            iVar2 = new i(true, null);
        }
        mutableLiveData.setValue(new i(iVar2.f7465a, cVar));
        dVar.e.setValue(m.a(dVar.c(), 8, false, 0, null, 22));
        MiddleControlUseCase$initMainControlViewEvent$4 middleControlUseCase$initMainControlViewEvent$4 = new MiddleControlUseCase$initMainControlViewEvent$4(this);
        MiddleControlUseCase$initMainControlViewEvent$5 middleControlUseCase$initMainControlViewEvent$5 = new MiddleControlUseCase$initMainControlViewEvent$5(this);
        MutableLiveData mutableLiveData2 = dVar.i;
        dVar.e();
        mutableLiveData2.setValue(new l(true, false, middleControlUseCase$initMainControlViewEvent$4));
        MutableLiveData mutableLiveData3 = dVar.j;
        dVar.d();
        mutableLiveData3.setValue(new k(true, false, middleControlUseCase$initMainControlViewEvent$5));
        this.f107183a.f4832b = this.f107191j;
        Ty0.d dVar2 = new Ty0.d(this, 0);
        MutableLiveData mutableLiveData4 = dVar.k;
        mutableLiveData4.setValue(new f(true, dVar2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(boolean z6) {
        MutableLiveData mutableLiveData = this.f107186d.k;
        f fVar = (f) mutableLiveData.getValue();
        f fVar2 = fVar;
        if (fVar == null) {
            fVar2 = new f(false, null);
        }
        mutableLiveData.setValue(new f(z6, fVar2.f7462b));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(@Nullable Boolean bool, @Nullable Boolean bool2) {
        d dVar = this.f107186d;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            i iVar = (i) dVar.b.getValue();
            i iVar2 = iVar;
            if (iVar == null) {
                iVar2 = new i(true, null);
            }
            dVar.b.setValue(new i(zBooleanValue, iVar2.f7466b));
        }
        if (bool2 != null) {
            dVar.e.setValue(m.a(dVar.c(), 8, false, 0, null, 30));
        }
    }

    public final void n() {
        com.bilibili.studio.editor.timeline.i iVar = this.f107183a.f4833c;
        if (iVar == null) {
            return;
        }
        UpperEditorBackUpManager upperEditorBackUpManager = iVar.f108310m;
        boolean zB = upperEditorBackUpManager != null ? upperEditorBackUpManager.b() : false;
        d dVar = this.f107186d;
        d.h(dVar, zB, false, 2);
        UpperEditorBackUpManager upperEditorBackUpManager2 = iVar.f108310m;
        d.g(dVar, upperEditorBackUpManager2 != null ? upperEditorBackUpManager2.a() : false, false, 2);
    }

    public final void o(boolean z6) {
        d dVar = this.f107186d;
        d.h(dVar, false, z6, 1);
        d.g(dVar, false, z6, 1);
    }

    public final void p(float f7) {
        EditVideoInfo editVideoInfo = this.f107184b.f4806b;
        if (editVideoInfo != null) {
            editVideoInfo.setUserTrackNativeVolume(f7);
            EditorUsedFunctionUtil.b(editVideoInfo, "音乐");
        }
    }
}
