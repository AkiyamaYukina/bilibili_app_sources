package com.bilibili.studio.editor.moudle.caption.setting.presenter;

import Tz0.f;
import android.content.Context;
import bx0.C5168a;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionListItem;
import com.bilibili.upper.module.cover_v2.presenter.MultiCoverCaptionSettingProxy;
import dx0.InterfaceC6890a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/setting/presenter/e.class */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MultiCoverCaptionSettingProxy f105793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Yv0.e f105794b = new Yv0.e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final f f105795c = new f();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public List<? extends CaptionListItem> f105796d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final List<C5168a> f105797e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final List<CaptionListItem> f105798f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final List<CaptionListItem> f105799g;

    public e(@NotNull MultiCoverCaptionSettingProxy multiCoverCaptionSettingProxy, @NotNull Context context) {
        this.f105793a = multiCoverCaptionSettingProxy;
        this.f105798f = com.bilibili.studio.editor.moudle.intelligence.logic.a.c(context);
        this.f105799g = com.bilibili.studio.editor.moudle.intelligence.logic.a.b(context);
    }

    public static final Object a(e eVar, long j7, int i7, SuspendLambda suspendLambda) {
        eVar.getClass();
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(suspendLambda), 1);
        cancellableContinuationImpl.initCancellability();
        b bVar = new b(cancellableContinuationImpl);
        CaptionListItem captionListItemD = eVar.d(i7, j7);
        if (captionListItemD != null) {
            eVar.f105795c.a(captionListItemD, i7, bVar);
        } else {
            bVar.onCancel();
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(suspendLambda);
        }
        return result;
    }

    public static CaptionListItem e(Integer num, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CaptionListItem captionListItem = (CaptionListItem) it.next();
            int id = captionListItem.getId();
            if (num != null && id == num.intValue()) {
                return captionListItem;
            }
        }
        return null;
    }

    public final void b(@NotNull CaptionListItem captionListItem, @NotNull Ra.e eVar) {
        BuildersKt.launch$default(this.f105794b, (CoroutineContext) null, (CoroutineStart) null, new CaptionSettingPresenter$downloadBindFontAndAnim$1(captionListItem, eVar, this, null), 3, (Object) null);
    }

    public final void c(int i7, @NotNull InterfaceC6890a interfaceC6890a) {
        CaptionListItem captionListItemE = e(Integer.valueOf(i7), this.f105796d);
        if (captionListItemE != null) {
            this.f105795c.e(captionListItemE, interfaceC6890a);
        } else {
            interfaceC6890a.onCancel();
        }
    }

    public final CaptionListItem d(int i7, long j7) {
        C5168a c5168a;
        if (j7 > 0 && (c5168a = (C5168a) CollectionsKt.getOrNull(this.f105797e, i7)) != null) {
            return e(Integer.valueOf((int) j7), c5168a.f57117c);
        }
        return null;
    }

    public final void f(@NotNull CaptionListItem captionListItem) {
        Integer fontColor = captionListItem.getFontColor();
        this.f105793a.g(captionListItem.getFontColor().intValue(), captionListItem.getId(), fontColor == null || fontColor.intValue() != 17, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x0253  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(@org.jetbrains.annotations.NotNull com.bilibili.studio.editor.moudle.caption.setting.ui.BiliEditorCaptionBaseFragment r10, @org.jetbrains.annotations.NotNull com.bilibili.studio.editor.moudle.caption.v1.CaptionListItem r11) {
        /*
            Method dump skipped, instruction units count: 694
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.caption.setting.presenter.e.g(com.bilibili.studio.editor.moudle.caption.setting.ui.BiliEditorCaptionBaseFragment, com.bilibili.studio.editor.moudle.caption.v1.CaptionListItem):void");
    }
}
