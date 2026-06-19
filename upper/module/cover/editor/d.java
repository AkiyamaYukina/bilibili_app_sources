package com.bilibili.upper.module.cover.editor;

import android.app.Application;
import android.content.Context;
import android.graphics.PointF;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.JSON;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.base.BiliContext;
import com.bilibili.studio.editor.moudle.caption.manager.CaptionDataManager;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionListItem;
import com.bilibili.studio.videoeditor.bean.EditorMaterialEntity;
import com.bilibili.studio.videoeditor.editor.editdata.OperationCover;
import com.bilibili.upper.module.cover.entity.CoverEditorCaptionInfo;
import com.bilibili.xpref.Xpref;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover/editor/d.class */
@StabilityInferred(parameters = 0)
public final class d implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public EditorMaterialEntity f112674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public CoverEditorInfo f112675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public String f112676c;

    @Override // com.bilibili.upper.module.cover.editor.h
    @Nullable
    public final CoverEditorInfo a() {
        return this.f112675b;
    }

    @Override // com.bilibili.upper.module.cover.editor.h
    @Nullable
    public final String b() {
        return this.f112676c;
    }

    @Override // com.bilibili.upper.module.cover.editor.h
    public final void c(@Nullable final OperationCover operationCover) {
        this.f112676c = operationCover.getLocalPath();
        CaptionDataManager.d(operationCover.getCaptionTempId(), new CaptionDataManager.a(operationCover, this) { // from class: com.bilibili.upper.module.cover.editor.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final OperationCover f112672a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final d f112673b;

            {
                this.f112672a = operationCover;
                this.f112673b = this;
            }

            @Override // com.bilibili.studio.editor.moudle.caption.manager.CaptionDataManager.a
            public final void a(CaptionListItem captionListItem, String str) {
                ArrayList<CoverEditorCaptionInfo> captionEditorList;
                int iD = Jf1.h.d(BiliContext.application());
                int px = ListExtentionsKt.toPx(36);
                CoverEditorCaptionInfo coverEditorCaptionInfo = new CoverEditorCaptionInfo();
                OperationCover operationCover2 = this.f112672a;
                PointF pointFB = nG0.a.b(operationCover2.getOffsetXY());
                PointF pointFA = nG0.a.a(operationCover2.getLocation(), iD - px);
                coverEditorCaptionInfo.captionScale = operationCover2.getCaptionScale();
                coverEditorCaptionInfo.captionId = System.currentTimeMillis();
                coverEditorCaptionInfo.text = operationCover2.getCaptionText();
                coverEditorCaptionInfo.fontSize = 84.0f;
                coverEditorCaptionInfo.fontColor = -1;
                coverEditorCaptionInfo.textLimitLength = 60;
                coverEditorCaptionInfo.translationX = pointFA.x + pointFB.x;
                coverEditorCaptionInfo.translationY = pointFA.y + pointFB.y;
                coverEditorCaptionInfo.anchorPointX = 0.0f;
                coverEditorCaptionInfo.anchorPointY = 0.0f;
                coverEditorCaptionInfo.idFontTemplateIndex = operationCover2.getCaptionTempId();
                coverEditorCaptionInfo.captionAssetBean = captionListItem.captionAssetBean.m9883clone();
                coverEditorCaptionInfo.fontType = str;
                d dVar = this.f112673b;
                CoverEditorInfo coverEditorInfo = dVar.f112675b;
                if (coverEditorInfo != null && (captionEditorList = coverEditorInfo.getCaptionEditorList()) != null) {
                    captionEditorList.add(coverEditorCaptionInfo);
                }
                Application application = BiliContext.application();
                if (application != null) {
                    Xpref.getSharedPreferences(application, "editor_config").edit().putString("cover_apply_4_3_cover_editor_info_4_3", JSON.toJSONString(dVar.f112675b)).apply();
                    Xpref.getSharedPreferences(application, "editor_config").edit().putString("cover_apply_4_3_cover_material_4_3", JSON.toJSONString(dVar.f112674a)).apply();
                    Xpref.getSharedPreferences(application, "editor_config").edit().putString("cover_apply_4_3_cover_input_image_path_4_3", dVar.f112676c).apply();
                }
            }
        });
    }

    @Override // com.bilibili.upper.module.cover.editor.h
    public final void d(@Nullable Context context) {
        if (context != null) {
            Xpref.getSharedPreferences(context, "editor_config").edit().putString("cover_apply_4_3_cover_editor_info_4_3", "").apply();
            Xpref.getSharedPreferences(context, "editor_config").edit().putString("cover_apply_4_3_cover_material_4_3", "").apply();
            Xpref.getSharedPreferences(context, "editor_config").edit().putString("cover_apply_4_3_cover_input_image_path_4_3", "").apply();
        }
    }

    @Override // com.bilibili.upper.module.cover.editor.h
    public final void release() {
        this.f112674a = null;
        this.f112675b = null;
        this.f112676c = null;
    }
}
