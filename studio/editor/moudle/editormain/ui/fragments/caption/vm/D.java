package com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.vm;

import L50.a;
import android.app.Application;
import android.content.Context;
import com.bilibili.lib.ui.PermissionsChecker;
import com.bilibili.lib.ui.permission.PermissionBiz;
import com.bilibili.studio.editor.moudle.caption.setting.ui.BiliEditorCaptionBaseFragment;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionAssetBean;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionListItem;
import com.bilibili.studio.editor.moudle.editormain.usecase.captionmodule.fastsetting.b;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/vm/D.class */
public final class D extends Yv0.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.studio.editor.moudle.editormain.usecase.captionmodule.fastsetting.b f106658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Ny0.d f106659d;

    @Inject
    public D(@NotNull Application application, @NotNull com.bilibili.studio.editor.moudle.editormain.usecase.captionmodule.fastsetting.b bVar, @NotNull Ny0.d dVar) {
        super(application);
        this.f106658c = bVar;
        this.f106659d = dVar;
    }

    public static final Object J0(D d7, long j7, int i7, SuspendLambda suspendLambda) {
        d7.getClass();
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(suspendLambda), 1);
        cancellableContinuationImpl.initCancellability();
        A a7 = new A(cancellableContinuationImpl);
        Ny0.d dVar = d7.f106659d;
        CaptionListItem captionListItemI = dVar.i(i7, j7);
        if (captionListItemI != null) {
            dVar.f17486a.a(captionListItemI, i7, a7);
        } else {
            a7.onCancel();
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(suspendLambda);
        }
        return result;
    }

    public final void K0(@NotNull CaptionListItem captionListItem, @NotNull NW.b bVar) {
        BuildersKt.launch$default(((Yv0.c) this).b, (CoroutineContext) null, (CoroutineStart) null, new BiliEditorCaptionTemplateListViewModel$downloadBindFontAndAnim$1(captionListItem, bVar, this, null), 3, (Object) null);
    }

    public final void L0(@NotNull BiliEditorCaptionBaseFragment biliEditorCaptionBaseFragment, @NotNull CaptionListItem captionListItem) {
        CaptionAssetBean captionAssetBean;
        CaptionAssetBean captionAssetBean2;
        CaptionAssetBean captionAssetBean3;
        CaptionAssetBean captionAssetBean4;
        CaptionAssetBean captionAssetBean5;
        CaptionListItem captionListItem2;
        CaptionListItem captionListItem3;
        if ((a.a.a.a != null ? R50.r.u() : null) != null) {
            Integer fontId = captionListItem.getFontId();
            Ny0.d dVar = this.f106659d;
            if (fontId != null) {
                CaptionListItem captionListItemJ = Ny0.d.j(captionListItem.getFontId(), dVar.f17487b);
                captionListItem.setFontPath(captionListItemJ != null ? captionListItemJ.getAssetPath() : null);
            }
            if (captionListItem.getFontColor() != null) {
                Integer fontColor = captionListItem.getFontColor();
                Iterator it = ((List) dVar.f17489d.getValue()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        captionListItem3 = null;
                        break;
                    } else {
                        captionListItem3 = (CaptionListItem) it.next();
                        if (Intrinsics.areEqual(captionListItem3.getFontColor(), fontColor)) {
                            break;
                        }
                    }
                }
                captionListItem.setFontColorId(captionListItem3 != null ? Integer.valueOf(captionListItem3.getId()) : null);
            }
            if (captionListItem.getOutlineColor() != null) {
                int iIntValue = captionListItem.getOutlineColor().intValue();
                Iterator it2 = ((List) dVar.f17490e.getValue()).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        captionListItem2 = null;
                        break;
                    }
                    captionListItem2 = (CaptionListItem) it2.next();
                    Integer fontColor2 = captionListItem2.getFontColor();
                    if (fontColor2 != null && fontColor2.intValue() == iIntValue) {
                        break;
                    }
                }
                captionListItem.setOutlineColorId(captionListItem2 != null ? Integer.valueOf(captionListItem2.getId()) : null);
            }
            if (captionListItem.getInAnimId() > 0 && (captionAssetBean4 = captionListItem.captionAssetBean) != null) {
                CaptionListItem captionListItemI = dVar.i(0, captionListItem.getInAnimId());
                captionAssetBean4.captionInAnimationPackagePath = (captionListItemI == null || (captionAssetBean5 = captionListItemI.captionAssetBean) == null) ? null : captionAssetBean5.captionInAnimationPackagePath;
            }
            if (captionListItem.getOutAnimId() > 0 && (captionAssetBean2 = captionListItem.captionAssetBean) != null) {
                CaptionListItem captionListItemI2 = dVar.i(1, captionListItem.getOutAnimId());
                captionAssetBean2.captionOutAnimationPackagePath = (captionListItemI2 == null || (captionAssetBean3 = captionListItemI2.captionAssetBean) == null) ? null : captionAssetBean3.captionOutAnimationPackagePath;
            }
            if (captionListItem.getCircleAnimId() > 0 && (captionAssetBean = captionListItem.captionAssetBean) != null) {
                CaptionListItem captionListItemI3 = dVar.i(2, captionListItem.getCircleAnimId());
                String str = null;
                if (captionListItemI3 != null) {
                    CaptionAssetBean captionAssetBean6 = captionListItemI3.captionAssetBean;
                    str = null;
                    if (captionAssetBean6 != null) {
                        str = captionAssetBean6.captionAnimationPackagePath;
                    }
                }
                captionAssetBean.captionAnimationPackagePath = str;
            }
            Context applicationContext = biliEditorCaptionBaseFragment.getApplicationContext();
            if (((captionListItem.getTempType() & 2) >> 1) == 1 && !PermissionsChecker.checkSelfPermissions(applicationContext, PermissionBiz.UPPER, px0.e.a)) {
                px0.e.c(biliEditorCaptionBaseFragment);
                return;
            }
            Context applicationContext2 = biliEditorCaptionBaseFragment.getApplicationContext();
            C c7 = new C(biliEditorCaptionBaseFragment, captionListItem);
            com.bilibili.studio.editor.moudle.editormain.usecase.captionmodule.fastsetting.b bVar = this.f106658c;
            Ny0.c cVar = bVar.f107164l;
            if (cVar.b("onReqCaptionText")) {
                if (captionListItem.getTempType() != 0) {
                    px0.e.a(applicationContext2, captionListItem.getTempType(), captionListItem.getTempFormat(), new b.C1193b(bVar, captionListItem, c7));
                    return;
                }
                CaptionInfo captionInfo = cVar.f17480f;
                String strA = captionInfo.tempType == 0 ? captionInfo.textOrigin : Zw0.a.a();
                cVar.f17480f.isTemp = Intrinsics.areEqual(strA, Zw0.a.a());
                bVar.p(captionListItem);
                bVar.q(captionListItem.getMax(), strA);
                c7.b(strA);
            }
        }
    }
}
