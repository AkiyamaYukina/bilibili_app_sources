package com.bilibili.studio.editor.moudle.sticker.ui;

import AR0.d;
import android.content.Context;
import android.graphics.Matrix;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.magicasakura.widgets.TintProgressBar;
import com.bilibili.studio.videoeditor.editor.imagemake.ui.EditCropView;
import com.bilibili.studio.videoeditor.editor.imagemake.views.GestureCropImageView;
import java.util.HashMap;
import java.util.List;
import nC0.a;
import qC0.b;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/sticker/ui/BiliEditorStickerCropFragment.class */
public class BiliEditorStickerCropFragment extends androidx_fragment_app_Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public EditCropView f108069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GestureCropImageView f108070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TintProgressBar f108071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f108072e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public BiliEditorStickerImagePickerActivity f108073f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f108074g = false;

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.f108073f = (BiliEditorStickerImagePickerActivity) p3();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131498370, viewGroup, false);
    }

    /* JADX WARN: Type inference failed for: r0v51, types: [android.widget.ImageView, com.bilibili.lib.image2.view.BiliImageView, com.bilibili.studio.videoeditor.editor.imagemake.views.GestureCropImageView, qC0.a, qC0.b] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        EditCropView editCropView = (EditCropView) view.findViewById(2131303477);
        this.f108069b = editCropView;
        editCropView.f109467a.setTouchEnabled(true);
        editCropView.f109467a.setRotateEnabled(false);
        editCropView.f109467a.setGestureEnabled(true);
        editCropView.f109467a.setScaleEnabled(true);
        editCropView.f109468b.setDimmedColor(ContextCompat.getColor(editCropView.getContext(), 2131101440));
        editCropView.f109468b.setFreestyleCropMode(1);
        editCropView.f109468b.setShowCropFrame(true);
        editCropView.f109468b.setShowCropGrid(true);
        editCropView.f109467a.setImageToWrapCropBounds(true);
        editCropView.f109467a.setImageToWrapCropBoundsAnimDuration(500L);
        editCropView.f109468b.setCircleDimmedLayer(false);
        editCropView.f109468b.setCropGridColor(ContextCompat.getColor(editCropView.getContext(), 2131101439));
        editCropView.f109468b.setCropGridColumnCount(2);
        editCropView.f109468b.setCropGridRowCount(2);
        editCropView.f109468b.setCropGridStrokeWidth(editCropView.getResources().getDimensionPixelSize(2131165929));
        editCropView.f109468b.setCropFrameStrokeWidth(editCropView.getResources().getDimensionPixelSize(2131165928));
        editCropView.f109468b.setCropFrameColor(ContextCompat.getColor(editCropView.getContext(), 2131101438));
        this.f108070c = this.f108069b.getCropImageView();
        final int i7 = 0;
        view.findViewById(2131300905).setOnClickListener(new View.OnClickListener(this, i7) { // from class: Nz0.h

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f17575a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f17576b;

            {
                this.f17575a = i7;
                this.f17576b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:61:0x01a3  */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onClick(android.view.View r7) {
                /*
                    Method dump skipped, instruction units count: 758
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: Nz0.h.onClick(android.view.View):void");
            }
        });
        view.findViewById(2131300910).setOnClickListener(new d(1, this));
        a aVar = this.f108072e;
        if (aVar != null) {
            ?? cropImageView = this.f108069b.getCropImageView();
            cropImageView.f125925z = 0.0f;
            cropImageView.getGenericProperties().setActualImageScaleType(new b.b((b) cropImageView));
            BiliImageLoader.INSTANCE.with(cropImageView.getContext()).uri(aVar.b).enableAutoPlayAnimation(false).into((BiliImageView) cropImageView);
            cropImageView.setExtraMatrix(new Matrix(aVar.c));
            Xz0.d dVar = Xz0.d.f28458a;
            String str = this.f108072e.a.mimeType;
            dVar.getClass();
            HashMap map = new HashMap();
            map.put("picture_format", str);
            Neurons.reportExposure$default(false, "creation.video-editor.sticker-panel.diy-edit.show", map, (List) null, 8, (Object) null);
        } else {
            BLog.e("BiliEditorStickerCropFragment", "Load crop image failed due view params null");
        }
        this.f108071d = (TintProgressBar) view.findViewById(2131306078);
    }
}
