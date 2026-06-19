package com.bilibili.studio.editor.moudle.caption.setting.presenter;

import com.bilibili.studio.editor.moudle.caption.v1.CaptionListItem;
import com.mall.data.common.BaseModel;
import com.mall.data.page.home.bean.HomeFeedsBean;
import com.mall.data.page.home.bean.HomeFeedsVoBean;
import dx0.InterfaceC6890a;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/setting/presenter/b.class */
public final class b implements InterfaceC6890a, fP0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f105789a;

    @Override // dx0.InterfaceC6890a
    public void c(CaptionListItem captionListItem) {
        CancellableContinuationImpl cancellableContinuationImpl = (CancellableContinuationImpl) this.f105789a;
        if (cancellableContinuationImpl.isActive()) {
            Result.Companion companion = Result.Companion;
            cancellableContinuationImpl.resumeWith(Result.constructor-impl(Boolean.TRUE));
        }
    }

    @Override // dx0.InterfaceC6890a
    public void onCancel() {
        CancellableContinuationImpl cancellableContinuationImpl = (CancellableContinuationImpl) this.f105789a;
        if (cancellableContinuationImpl.isActive()) {
            Result.Companion companion = Result.Companion;
            cancellableContinuationImpl.resumeWith(Result.constructor-impl(Boolean.FALSE));
        }
    }

    public void onFailed(Throwable th) {
        fP0.b bVar = (fP0.b) this.f105789a;
        if (bVar != null) {
            bVar.onFailed(th);
        }
    }

    public void onSuccess(Object obj) {
        HomeFeedsVoBean homeFeedsVoBean = (HomeFeedsVoBean) obj;
        fP0.b bVar = (fP0.b) this.f105789a;
        if (((BaseModel) homeFeedsVoBean).codeType != 1) {
            bVar.onFailed(new Throwable("server response error!"));
            return;
        }
        HomeFeedsBean homeFeedsBean = homeFeedsVoBean.vo;
        if (homeFeedsBean == null || homeFeedsBean.getFeedType() != 0) {
            bVar.onFailed(new Throwable("MSG_RESULT_NO_MATCH"));
        } else {
            bVar.onSuccess(homeFeedsVoBean);
        }
    }
}
