package com.bilibili.studio.editor.moudle.material;

import android.util.Pair;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionBean;
import com.bilibili.studio.editor.moudle.caption.v1.net.SubtitleWithCategoryBean;
import com.bilibili.studio.editor.moudle.danmaku.v1.DanmakuTypeItem;
import com.bilibili.studio.editor.moudle.sticker.v1.VideoFxStickerBean;
import com.bilibili.studio.editor.moudle.sticker.v1.VideoFxStickerWithCategoryBean;
import com.bilibili.studio.videoeditor.bean.EditorMaterialEntity;
import com.bilibili.studio.videoeditor.editbase.filter.net.EditFxFilterBean;
import com.bilibili.studio.videoeditor.editbase.filter.net.EditFxFilterWithCategoryBean$CategoryDataBean;
import com.bilibili.studio.videoeditor.ms.transition.TransitionData;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/material/f.class */
public final class f extends BiliApiDataCallback<EditorMaterialEntity> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f107894b;

    public f(e eVar) {
        this.f107894b = eVar;
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final boolean isCancel() {
        return false;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(EditorMaterialEntity editorMaterialEntity) {
        List<VideoFxStickerBean.FxDataBean> list;
        EditorMaterialEntity editorMaterialEntity2 = editorMaterialEntity;
        this.f107894b.f107892b = false;
        if (editorMaterialEntity2 == null) {
            e.a(this.f107894b, new IllegalStateException("requestMaterialEntity result is null"));
            return;
        }
        this.f107894b.f107891a = new Pair<>("StudioMon", editorMaterialEntity2);
        this.f107894b.getClass();
        VideoFxStickerWithCategoryBean.VideoFxStickerCategoryBean videoFxStickerCategoryBean = editorMaterialEntity2.hotSticker;
        if (videoFxStickerCategoryBean != null && (list = videoFxStickerCategoryBean.stickerList) != null) {
            for (VideoFxStickerBean.FxDataBean fxDataBean : list) {
                fxDataBean.downloadUrl = fxDataBean.downloadUrlAurora;
            }
        }
        List<DanmakuTypeItem> list2 = editorMaterialEntity2.danmakuTypeList;
        if (list2 != null) {
            for (DanmakuTypeItem danmakuTypeItem : list2) {
                danmakuTypeItem.downloadUrl = danmakuTypeItem.downloadUrlAurora;
            }
        }
        List<CaptionBean.SubtitleBean> list3 = editorMaterialEntity2.subtitle;
        if (list3 != null) {
            for (CaptionBean.SubtitleBean subtitleBean : list3) {
                subtitleBean.download_url = subtitleBean.downloadUrlAurora;
            }
        }
        List<TransitionData.TransitionBean> list4 = editorMaterialEntity2.trans;
        if (list4 != null) {
            for (TransitionData.TransitionBean transitionBean : list4) {
                transitionBean.downloadUrl = transitionBean.downloadUrlAurora;
            }
        }
        List<TransitionData.TransitionTabBean> list5 = editorMaterialEntity2.transWithCategory;
        if (list5 != null) {
            Iterator<T> it = list5.iterator();
            while (it.hasNext()) {
                List<TransitionData.TransitionBean> list6 = ((TransitionData.TransitionTabBean) it.next()).children;
                if (list6 != null) {
                    for (TransitionData.TransitionBean transitionBean2 : list6) {
                        transitionBean2.downloadUrl = transitionBean2.downloadUrlAurora;
                    }
                }
            }
        }
        List<VideoFxStickerWithCategoryBean.VideoFxStickerCategoryBean> list7 = editorMaterialEntity2.fxStickerCategoryList;
        if (list7 != null) {
            Iterator<T> it2 = list7.iterator();
            while (it2.hasNext()) {
                List<VideoFxStickerBean.FxDataBean> list8 = ((VideoFxStickerWithCategoryBean.VideoFxStickerCategoryBean) it2.next()).stickerList;
                if (list8 != null) {
                    for (VideoFxStickerBean.FxDataBean fxDataBean2 : list8) {
                        fxDataBean2.downloadUrl = fxDataBean2.downloadUrlAurora;
                    }
                }
            }
        }
        List<EditFxFilterWithCategoryBean$CategoryDataBean> list9 = editorMaterialEntity2.filterWithCategory;
        if (list9 != null) {
            Iterator<T> it3 = list9.iterator();
            while (it3.hasNext()) {
                List<EditFxFilterBean.FxDataBean> list10 = ((EditFxFilterWithCategoryBean$CategoryDataBean) it3.next()).filterList;
                if (list10 != null) {
                    for (EditFxFilterBean.FxDataBean fxDataBean3 : list10) {
                        fxDataBean3.downloadUrl = fxDataBean3.downloadUrlAurora;
                    }
                }
            }
        }
        List<SubtitleWithCategoryBean> list11 = editorMaterialEntity2.subtitleWithCategoryBeanList;
        if (list11 != null) {
            Iterator<T> it4 = list11.iterator();
            while (it4.hasNext()) {
                List<CaptionBean.SubtitleBean> list12 = ((SubtitleWithCategoryBean) it4.next()).subTitleList;
                if (list12 != null) {
                    for (CaptionBean.SubtitleBean subtitleBean2 : list12) {
                        subtitleBean2.download_url = subtitleBean2.downloadUrlAurora;
                    }
                }
            }
        }
        e eVar = this.f107894b;
        eVar.getClass();
        bilibili.live.app.service.resolver.c.a(editorMaterialEntity2.hashCode(), "handleSuccess ", "EditorMaterialService");
        for (h hVar : eVar.f107893c) {
            Function0<Boolean> function0 = hVar.f107897c;
            if (function0 != null && ((Boolean) function0.invoke()).booleanValue()) {
                return;
            } else {
                hVar.f107896b.invoke(editorMaterialEntity2);
            }
        }
        eVar.f107893c.clear();
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        this.f107894b.f107892b = false;
        e.a(this.f107894b, th);
    }
}
