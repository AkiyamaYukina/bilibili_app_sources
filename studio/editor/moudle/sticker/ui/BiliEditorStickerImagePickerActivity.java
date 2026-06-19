package com.bilibili.studio.editor.moudle.sticker.ui;

import AT0.c;
import De0.b0;
import Nz0.i;
import Nz0.k;
import Nz0.l;
import Nz0.p;
import Oz0.g;
import Pb.F;
import Pb.G;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.n;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bolts.Continuation;
import bolts.Task;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.ghost.api.Invocation;
import com.bilibili.lib.ghost.api.InvocationCategory;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseAppCompatActivity;
import com.bilibili.studio.editor.moudle.sticker.ui.BiliEditorStickerImagePickerActivity;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.bilibili.studio.editor.moudle.sticker.v1.MediaDirectory;
import com.bilibili.studio.editor.moudle.sticker.v1.MediaFile;
import com.bilibili.studio.videoeditor.picker.ui.DirChooseImgFragment;
import com.bilibili.studio.videoeditor.picker.ui.ImageCategoryFragment;
import com.bilibili.studio.videoeditor.util.V;
import com.bilibili.studio.videoeditor.util.Y;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/sticker/ui/BiliEditorStickerImagePickerActivity.class */
public class BiliEditorStickerImagePickerActivity extends BaseAppCompatActivity {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final int f108075L = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public LinearLayout f108076B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public p f108077C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public RelativeLayout f108078D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public Dialog f108079E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public TextView f108080F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public MediaDirectory f108081G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public List<MediaDirectory> f108082H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public GridLayoutManager f108083I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final a f108084J = new a(this);

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final b f108085K = new b(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/sticker/ui/BiliEditorStickerImagePickerActivity$a.class */
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiliEditorStickerImagePickerActivity f108086a;

        public a(BiliEditorStickerImagePickerActivity biliEditorStickerImagePickerActivity) {
            this.f108086a = biliEditorStickerImagePickerActivity;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/sticker/ui/BiliEditorStickerImagePickerActivity$b.class */
    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiliEditorStickerImagePickerActivity f108087a;

        public b(BiliEditorStickerImagePickerActivity biliEditorStickerImagePickerActivity) {
            this.f108087a = biliEditorStickerImagePickerActivity;
        }
    }

    @Invocation(category = InvocationCategory.INVOKE_NONE_STATIC, name = "dismiss", owner = {"android.app.Dialog"}, scope = {})
    public static void P6(@NotNull Object obj) {
        Contract contractAb = ConfigManager.Companion.ab();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual(contractAb.get("bgthread_ui_access_detect_enable", bool), bool)) {
            Thread threadCurrentThread = Thread.currentThread();
            if (!n.a(threadCurrentThread)) {
                IllegalStateException illegalStateException = new IllegalStateException(F.b("Dialog.dismiss() called from non-UI thread: ", threadCurrentThread, ", 请联系 Jackin"));
                Neurons.trackT(false, "app.bgthread.ui.access", MapsKt.mapOf(new Pair[]{TuplesKt.to("stacktrace", G.b("Dialog.dismiss() called from non-UI thread: ", threadCurrentThread, "BgThreadUIAccess", illegalStateException, illegalStateException)), TuplesKt.to("threadName", threadCurrentThread.getName())}), 1, new c(8));
            }
        }
        ((Dialog) obj).dismiss();
    }

    public static void T6(FragmentManager fragmentManager) {
        for (Fragment fragment : fragmentManager.getFragments()) {
            if (fragment.getChildFragmentManager().getFragments().size() > 0) {
                T6(fragment.getChildFragmentManager());
            }
            fragmentManager.beginTransaction().remove(fragment).commitNowAllowingStateLoss();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nC0.a] */
    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.fragment.app.Fragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, com.bilibili.studio.editor.moudle.sticker.ui.BiliEditorStickerCropFragment] */
    public final void Q6(MediaFile mediaFile) {
        this.f108078D.setVisibility(0);
        ?? obj = new Object();
        ((nC0.a) obj).c = new Matrix();
        ((nC0.a) obj).a = mediaFile;
        ((nC0.a) obj).b = Uri.parse(mediaFile.uri);
        ?? androidx_fragment_app_fragment = new androidx_fragment_app_Fragment();
        androidx_fragment_app_fragment.f108074g = false;
        androidx_fragment_app_fragment.f108072e = obj;
        getSupportFragmentManager().beginTransaction().add(2131308638, (Fragment) androidx_fragment_app_fragment, "tag_image_crop").commitNowAllowingStateLoss();
    }

    public final void R6() {
        this.f108078D.setVisibility(8);
        BiliEditorStickerCropFragment biliEditorStickerCropFragment = (BiliEditorStickerCropFragment) getSupportFragmentManager().findFragmentByTag("tag_image_crop");
        if (biliEditorStickerCropFragment != null) {
            getSupportFragmentManager().beginTransaction().remove(biliEditorStickerCropFragment).commitAllowingStateLoss();
        }
    }

    public final void S6(MediaDirectory mediaDirectory) {
        if (mediaDirectory == null || V.e(mediaDirectory.mediaFileList)) {
            this.f108076B.setVisibility(0);
            p pVar = this.f108077C;
            pVar.f17589a = null;
            pVar.notifyDataSetChanged();
            return;
        }
        this.f108080F.setText(mediaDirectory.displayName);
        this.f108076B.setVisibility(8);
        p pVar2 = this.f108077C;
        pVar2.f17589a = mediaDirectory.mediaFileList;
        pVar2.notifyDataSetChanged();
        this.f108083I.scrollToPosition(0);
    }

    public final void U6() {
        DirChooseImgFragment dirChooseImgFragment = (DirChooseImgFragment) getSupportFragmentManager().findFragmentByTag("DirChooseImgFragment");
        if (dirChooseImgFragment != null) {
            getSupportFragmentManager().beginTransaction().remove(dirChooseImgFragment).commitNowAllowingStateLoss();
        }
    }

    public final void V6(boolean z6) {
        final ImageCategoryFragment imageCategoryFragment = (ImageCategoryFragment) getSupportFragmentManager().findFragmentByTag("ImageCategoryFragment");
        if (imageCategoryFragment != null) {
            if (!z6) {
                getSupportFragmentManager().beginTransaction().remove(imageCategoryFragment).commitNowAllowingStateLoss();
                return;
            }
            final l lVar = new l(0, this, imageCategoryFragment);
            if (imageCategoryFragment.f109889g) {
                return;
            }
            imageCategoryFragment.f109889g = true;
            ViewPropertyAnimator viewPropertyAnimatorAnimate = imageCategoryFragment.hf().animate();
            viewPropertyAnimatorAnimate.y(-imageCategoryFragment.f109886d);
            viewPropertyAnimatorAnimate.setDuration(imageCategoryFragment.f109888f);
            viewPropertyAnimatorAnimate.start();
            ImageView imageView = imageCategoryFragment.f109885c;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mIv");
                imageView = null;
            }
            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = imageView.animate();
            viewPropertyAnimatorAnimate2.rotationBy(-180.0f);
            viewPropertyAnimatorAnimate2.setDuration(imageCategoryFragment.f109888f);
            viewPropertyAnimatorAnimate2.withEndAction(new Runnable(imageCategoryFragment, lVar) { // from class: ZC0.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ImageCategoryFragment f29515a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final l f29516b;

                {
                    this.f29515a = imageCategoryFragment;
                    this.f29516b = lVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ImageCategoryFragment imageCategoryFragment2 = this.f29515a;
                    l lVar2 = this.f29516b;
                    imageCategoryFragment2.f109889g = false;
                    lVar2.run();
                }
            });
            viewPropertyAnimatorAnimate2.start();
        }
    }

    public final void X6(final MediaFile mediaFile) {
        if (!mediaFile.mimeType.endsWith("gif")) {
            Q6(mediaFile);
            return;
        }
        if (mediaFile.size > 5242880) {
            ToastHelper.showToastLong(this, 2131841772);
            return;
        }
        Task.callInBackground(new Callable(this, mediaFile) { // from class: Nz0.m

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliEditorStickerImagePickerActivity f17583a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final MediaFile f17584b;

            {
                this.f17583a = this;
                this.f17584b = mediaFile;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i7 = BiliEditorStickerImagePickerActivity.f108075L;
                this.f17583a.getClass();
                return Mz0.b.b(this.f17584b);
            }
        }).continueWith(new Continuation(this, mediaFile) { // from class: Nz0.n

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliEditorStickerImagePickerActivity f17585a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final MediaFile f17586b;

            {
                this.f17585a = this;
                this.f17586b = mediaFile;
            }

            @Override // bolts.Continuation
            public final Object then(Task task) {
                BiliEditorStickerImagePickerActivity biliEditorStickerImagePickerActivity = this.f17585a;
                Dialog dialog = biliEditorStickerImagePickerActivity.f108079E;
                if (dialog != null && dialog.isShowing()) {
                    BiliEditorStickerImagePickerActivity.P6(biliEditorStickerImagePickerActivity.f108079E);
                }
                if (task.getResult() == null) {
                    biliEditorStickerImagePickerActivity.Q6(this.f17586b);
                    return null;
                }
                int iA = Mz0.f.b().a((EditCustomizeSticker) task.getResult());
                T7.a.a(iA, "onClickNext add customize sticker result: ", "BiliEditorStickerImagePickerActivity");
                if (iA == 0) {
                    biliEditorStickerImagePickerActivity.setResult(17);
                    biliEditorStickerImagePickerActivity.finish();
                    return null;
                }
                if (iA != 1) {
                    ToastHelper.showToastLong(biliEditorStickerImagePickerActivity, 2131841888);
                    return null;
                }
                ToastHelper.showToastLong(biliEditorStickerImagePickerActivity, 2131842194);
                return null;
            }
        }, Task.UI_THREAD_EXECUTOR);
        if (this.f108079E == null) {
            Dialog dialog = new Dialog(this, 2131888077);
            this.f108079E = dialog;
            dialog.setCancelable(false);
            this.f108079E.setContentView(LayoutInflater.from(this).inflate(2131493990, (ViewGroup) null), new LinearLayout.LayoutParams(-1, -1));
        }
        if (this.f108079E.isShowing()) {
            return;
        }
        this.f108079E.show();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (((DirChooseImgFragment) getSupportFragmentManager().findFragmentByTag("DirChooseImgFragment")) != null) {
            U6();
        } else if (this.f108078D.getVisibility() == 0) {
            R6();
        } else {
            super.onBackPressed();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [Nz0.p, androidx.recyclerview.widget.RecyclerView$Adapter] */
    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.getDecorView().setSystemUiVisibility(4098);
            window.setBackgroundDrawable(new ColorDrawable(ViewCompat.MEASURED_STATE_MASK));
        }
        if (bundle != null) {
            T6(getSupportFragmentManager());
        }
        setContentView(2131498308);
        ((TextView) findViewById(2131314196)).setOnClickListener(new View.OnClickListener(this) { // from class: Nz0.j

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliEditorStickerImagePickerActivity f17578a;

            {
                this.f17578a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BiliEditorStickerImagePickerActivity biliEditorStickerImagePickerActivity = this.f17578a;
                int i7 = BiliEditorStickerImagePickerActivity.f108075L;
                biliEditorStickerImagePickerActivity.finish();
            }
        });
        this.f108080F = (TextView) findViewById(2131308958);
        ((LinearLayout) findViewById(2131303546)).setOnClickListener(new b0(this, 1));
        RecyclerView recyclerView = (RecyclerView) findViewById(2131310688);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(), 3);
        this.f108083I = gridLayoutManager;
        recyclerView.setLayoutManager(gridLayoutManager);
        k kVar = new k(this);
        ?? adapter = new RecyclerView.Adapter();
        adapter.f17590b = kVar;
        this.f108077C = adapter;
        recyclerView.setAdapter(adapter);
        Y.a(recyclerView);
        this.f108076B = (LinearLayout) findViewById(2131305555);
        this.f108078D = (RelativeLayout) findViewById(2131308638);
        new g(getApplicationContext(), getLoaderManager(), new i(this));
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        Dialog dialog = this.f108079E;
        if (dialog != null) {
            P6(dialog);
            this.f108079E = null;
        }
    }
}
