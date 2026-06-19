package com.bilibili.studio.centerplus.dialog;

import OC0.h;
import TB0.C2877i;
import Xz0.g;
import Xz0.j;
import Xz0.k;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSON;
import com.bilibili.app.authorspace.ui.J1;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.dd.DeviceDecision;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.BiliImageLoaderHelper;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.studio.centerplus.dialog.AlbumQuitDialog;
import com.bilibili.studio.centerplus.dialog.bean.QuitConfig;
import com.bilibili.studio.comm.ab.ABManager;
import com.bilibili.studio.comm.manager.hdr.a;
import com.bilibili.studio.config.UpperFawkesDeviceDecision;
import com.bilibili.studio.kaleidoscope.adapter.KaleidoscopeFactory;
import com.bilibili.studio.videoeditor.bean.SelectVideo;
import com.bilibili.studio.videoeditor.loader.ImageItem;
import com.bilibili.studio.videoeditor.util.V;
import com.bilibili.upper.feat.gamefactory.model.GameCloudImageItem;
import com.bilibili.upper.module.contribute.picker.v3.fragment.AlbumCurrentFragmentV2;
import com.bilibili.upper.module.contribute.picker.v3.fragment.AlbumPickerFragment;
import com.bilibili.upper.module.contribute.picker.v3.fragment.AlbumSubFragment;
import com.bilibili.upper.module.contribute.picker.v3.fragment.F;
import com.bilibili.upper.module.contribute.picker.v3.model.UpperAlbumViewModel;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import lF0.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.splash.ad.model.SplashGuideButton;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/dialog/AlbumQuitDialog.class */
public final class AlbumQuitDialog extends DialogFragment {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final b f105100e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public F f105101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public F f105102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public C2877i f105103d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/dialog/AlbumQuitDialog$a.class */
    public static final class a {
        @Nullable
        public static QuitConfig a() {
            QuitConfig quitConfig;
            try {
                Lazy lazy = UpperFawkesDeviceDecision.f105475a;
                String strDd = DeviceDecision.INSTANCE.dd("upper.album_quit_config", "");
                quitConfig = (QuitConfig) JSON.parseObject(strDd != null ? strDd : "", QuitConfig.class);
            } catch (Exception e7) {
                quitConfig = null;
            }
            return quitConfig;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/dialog/AlbumQuitDialog$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f105104a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public String f105105b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public String f105106c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public String f105107d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f105108e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f105109f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f105110g;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.studio.centerplus.dialog.AlbumQuitDialog$b, java.lang.Object] */
    static {
        ?? obj = new Object();
        obj.f105105b = "";
        obj.f105106c = "";
        obj.f105107d = "";
        f105100e = obj;
    }

    public static void hf(String str) {
        j.c("sdk_type", KaleidoscopeFactory.SDK_MON);
        j.c("router_topic_id", g.f28463b);
        Map mapB = j.b(k.f28474a);
        HashMap map = (HashMap) mapB;
        map.put("type", f105100e.f105108e == 0 ? "2" : "1");
        map.put("button_name", str);
        Neurons.reportClick(false, "creation.choose-matter.persuade.button.click", mapB);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        C2877i c2877iInflate = C2877i.inflate(getLayoutInflater(), viewGroup, false);
        this.f105103d = c2877iInflate;
        return c2877iInflate != null ? c2877iInflate.f23807a : null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Window window;
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            WindowManager.LayoutParams layoutParamsA = J1.a(window, 0);
            layoutParamsA.dimAmount = 0.2f;
            window.getDecorView().setSystemUiVisibility(2);
            window.setAttributes(layoutParamsA);
        }
        b bVar = f105100e;
        if (bVar.f105108e == 0) {
            final C2877i c2877i = this.f105103d;
            if (c2877i != null) {
                c2877i.f23815j.setVisibility(0);
                c2877i.f23808b.setVisibility(0);
                c2877i.f23810d.setVisibility(8);
                TextView textView = c2877i.f23813g;
                QuitConfig quitConfigA = a.a();
                String str = "";
                if (quitConfigA != null) {
                    String str2 = quitConfigA.intelligenceText;
                    str = "";
                    if (str2 != null) {
                        str = str2;
                    }
                }
                textView.setText(str);
                c2877i.f23812f.setText(getString(2131841819));
                final int i7 = 0;
                c2877i.f23812f.setOnClickListener(new View.OnClickListener(this, c2877i, i7) { // from class: Zv0.a

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f29778a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final androidx_fragment_app_Fragment f29779b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final Object f29780c;

                    {
                        this.f29778a = i7;
                        this.f29779b = this;
                        this.f29780c = c2877i;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        AlbumSubFragment albumSubFragment;
                        rG0.c cVar;
                        switch (this.f29778a) {
                            case 0:
                                AlbumQuitDialog albumQuitDialog = (AlbumQuitDialog) this.f29779b;
                                C2877i c2877i2 = (C2877i) this.f29780c;
                                AlbumQuitDialog.b bVar2 = AlbumQuitDialog.f105100e;
                                String string = c2877i2.f23812f.getText().toString();
                                albumQuitDialog.getClass();
                                AlbumQuitDialog.hf(string);
                                F f7 = albumQuitDialog.f105102c;
                                if (f7 != null && (albumSubFragment = (AlbumSubFragment) CollectionsKt.getOrNull(f7.a.h, 0)) != null && (cVar = albumSubFragment.l) != null) {
                                    cVar.U();
                                }
                                albumQuitDialog.dismiss();
                                break;
                            default:
                                AlbumPickerFragment albumPickerFragment = this.f29779b;
                                UpperAlbumViewModel upperAlbumViewModel = (UpperAlbumViewModel) this.f29780c;
                                int i8 = AlbumPickerFragment.o;
                                albumPickerFragment.of(upperAlbumViewModel);
                                break;
                        }
                    }
                });
                BiliImageLoader biliImageLoader = BiliImageLoader.INSTANCE;
                BiliImageView biliImageView = c2877i.f23809c;
                biliImageLoader.with(biliImageView.getContext()).url(BiliImageLoaderHelper.fileToUri(new File(bVar.f105107d))).into(biliImageView);
                c2877i.f23814i.setText(bVar.f105105b);
                c2877i.h.setText(bVar.f105106c);
            }
        } else {
            final C2877i c2877i2 = this.f105103d;
            if (c2877i2 != null) {
                c2877i2.f23815j.setVisibility(8);
                c2877i2.f23808b.setVisibility(8);
                c2877i2.f23810d.setVisibility(0);
                TextView textView2 = c2877i2.f23813g;
                QuitConfig quitConfigA2 = a.a();
                String str3 = "";
                if (quitConfigA2 != null) {
                    String str4 = quitConfigA2.normalText;
                    str3 = "";
                    if (str4 != null) {
                        str3 = str4;
                    }
                }
                textView2.setText(str3);
                c2877i2.f23812f.setText(getString(2131841822));
                final int i8 = 0;
                c2877i2.f23812f.setOnClickListener(new View.OnClickListener(this, c2877i2, i8) { // from class: Zv0.b

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f29781a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final androidx_fragment_app_Fragment f29782b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final Object f29783c;

                    {
                        this.f29781a = i8;
                        this.f29782b = this;
                        this.f29783c = c2877i2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (this.f29781a) {
                            case 0:
                                AlbumQuitDialog albumQuitDialog = (AlbumQuitDialog) this.f29782b;
                                C2877i c2877i3 = (C2877i) this.f29783c;
                                AlbumQuitDialog.b bVar2 = AlbumQuitDialog.f105100e;
                                String string = c2877i3.f23812f.getText().toString();
                                albumQuitDialog.getClass();
                                AlbumQuitDialog.hf(string);
                                albumQuitDialog.dismiss();
                                break;
                            default:
                                AlbumPickerFragment albumPickerFragment = this.f29782b;
                                UpperAlbumViewModel upperAlbumViewModel = (UpperAlbumViewModel) this.f29783c;
                                int i9 = AlbumPickerFragment.o;
                                albumPickerFragment.of(upperAlbumViewModel);
                                break;
                        }
                    }
                });
            }
        }
        final C2877i c2877i3 = this.f105103d;
        if (c2877i3 != null) {
            final int i9 = 0;
            c2877i3.f23811e.setOnClickListener(new View.OnClickListener(i9, this, c2877i3) { // from class: Zv0.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f29784a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f29785b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Object f29786c;

                {
                    this.f29784a = i9;
                    this.f29785b = this;
                    this.f29786c = c2877i3;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    String str5;
                    switch (this.f29784a) {
                        case 0:
                            AlbumQuitDialog albumQuitDialog = (AlbumQuitDialog) this.f29785b;
                            C2877i c2877i4 = (C2877i) this.f29786c;
                            AlbumQuitDialog.b bVar2 = AlbumQuitDialog.f105100e;
                            String string = c2877i4.f23811e.getText().toString();
                            albumQuitDialog.getClass();
                            AlbumQuitDialog.hf(string);
                            albumQuitDialog.dismiss();
                            F f7 = albumQuitDialog.f105101b;
                            if (f7 != null) {
                                ArrayList arrayList = AlbumCurrentFragmentV2.z;
                                FragmentActivity fragmentActivityP3 = f7.a.p3();
                                if (fragmentActivityP3 != null) {
                                    fragmentActivityP3.finish();
                                }
                            }
                            break;
                        case 1:
                            UpperAlbumViewModel upperAlbumViewModel = (UpperAlbumViewModel) this.f29785b;
                            AlbumPickerFragment albumPickerFragment = (AlbumPickerFragment) this.f29786c;
                            int i10 = AlbumPickerFragment.o;
                            if (!V.c()) {
                                Lazy<com.bilibili.studio.comm.manager.hdr.a> lazy = com.bilibili.studio.comm.manager.hdr.a.f105396e;
                                if (!a.C1185a.a().g() && upperAlbumViewModel.h1(albumPickerFragment.d)) {
                                    ToastHelper.showToastShort(albumPickerFragment.getContext(), 2131851108);
                                    break;
                                } else {
                                    Context context = view2.getContext();
                                    for (GameCloudImageItem gameCloudImageItem : albumPickerFragment.d) {
                                        if (gameCloudImageItem instanceof GameCloudImageItem) {
                                            String str6 = gameCloudImageItem.path;
                                            if (str6 != null && str6.length() != 0) {
                                                GameCloudImageItem gameCloudImageItem2 = gameCloudImageItem;
                                                if (!gameCloudImageItem2.isDownloadProgress()) {
                                                    if (gameCloudImageItem2.isDownloadFail()) {
                                                        ToastHelper.showToastShort(context, 2131850941);
                                                        break;
                                                    }
                                                }
                                            }
                                            ToastHelper.showToastShort(context, 2131851389);
                                            break;
                                        }
                                    }
                                    upperAlbumViewModel.f1();
                                    if (!AlbumPickerFragment.lf(albumPickerFragment.p3(), albumPickerFragment.d)) {
                                        Iterator it = albumPickerFragment.d.iterator();
                                        boolean z6 = true;
                                        while (it.hasNext()) {
                                            if (((ImageItem) it.next()).isVideo()) {
                                                z6 = false;
                                            }
                                        }
                                        if (upperAlbumViewModel.s) {
                                            ArrayList arrayList2 = new ArrayList();
                                            for (ImageItem imageItem : albumPickerFragment.d) {
                                                SelectVideo selectVideo = new SelectVideo();
                                                String str7 = imageItem.path;
                                                selectVideo.videoPath = str7;
                                                File file = d.a;
                                                selectVideo.bizFrom = (str7.length() != 0 && (str5 = h.f17831w) != null && str5.length() != 0) ? StringsKt.Z(str7, str5) : false ? 6 : 1;
                                                selectVideo.duration = imageItem.getDuration();
                                                selectVideo.mimeType = imageItem.mimeType;
                                                UpperAlbumViewModel.K0(selectVideo, imageItem);
                                                arrayList2.add(selectVideo);
                                            }
                                            Intent intent = new Intent();
                                            intent.putExtra("selectVideoList", arrayList2);
                                            FragmentActivity fragmentActivityP32 = albumPickerFragment.p3();
                                            if (fragmentActivityP32 != null) {
                                                fragmentActivityP32.setResult(-1, intent);
                                                fragmentActivityP32.finish();
                                            }
                                        } else {
                                            boolean z7 = albumPickerFragment.d.size() == 1 && ((ImageItem) albumPickerFragment.d.get(0)).isVideo() && ((ImageItem) albumPickerFragment.d.get(0)).getDuration() > AlbumPickerFragment.n && upperAlbumViewModel.B;
                                            Context context2 = albumPickerFragment.getContext();
                                            if (context2 != null) {
                                                ArrayList arrayList3 = albumPickerFragment.d;
                                                Map<String, String> map = ABManager.f105341a;
                                                upperAlbumViewModel.Z0(context2, arrayList3, z6, 5, (com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.a) null, ABManager.g(com.bilibili.studio.comm.ab.d.f105350a) && z7);
                                            }
                                            AlbumPickerFragment.mf(upperAlbumViewModel, albumPickerFragment.d, false);
                                        }
                                        break;
                                    }
                                }
                            }
                            break;
                        default:
                            ((we1.d) this.f29785b).d((SplashGuideButton) this.f29786c);
                            break;
                    }
                }
            });
        }
        j.c("sdk_type", KaleidoscopeFactory.SDK_MON);
        j.c("router_topic_id", g.f28463b);
        Map mapB = j.b(k.f28474a);
        ((HashMap) mapB).put("type", bVar.f105108e == 0 ? "2" : "1");
        Neurons.reportExposure$default(false, "creation.choose-matter.persuade.0.show", mapB, (List) null, 8, (Object) null);
    }
}
